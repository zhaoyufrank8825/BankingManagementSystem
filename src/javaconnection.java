
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhaoy
 */
public class javaconnection {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem?zeroDateTimeBehavior=convertToNull","root","");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }      
        return null;
    }
}

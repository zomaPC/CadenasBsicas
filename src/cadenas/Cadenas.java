
package cadenas;
import java.util.Scanner;

public class Cadenas {

    
    public static void main(String[] args) {
       String name1 = "", name2="";
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digita el pirmer nombre ");
        name1 = entrada.nextLine();        
        System.out.println("Digita el seguendo nombre ");
        name2 = entrada.nextLine();        
        
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("El nombre es igual");
        }else{
            System.out.println("Los nombres son distintos");}
    }
    
}

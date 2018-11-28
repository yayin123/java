package clonico;


public class ClonicoApp {
    public static void main(String[] args) {
        Punto punto=new Punto(20, 30);
        Punto pCopia=(Punto)punto.clone();
        System.out.println("punto "+ punto);
        System.out.println("copia "+ pCopia);

        Rectangulo rect=new Rectangulo(new Punto(0, 0), 4, 5);
        Rectangulo rCopia=(Rectangulo)rect.clone();
        System.out.println("rect�ngulo "+ rect);
        System.out.println("copia "+ rCopia);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}


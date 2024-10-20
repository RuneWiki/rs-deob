package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("cy")
public class class101 {

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.b(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method1884(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("cy.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method1885(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

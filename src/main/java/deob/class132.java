package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ee")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.k(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2665(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ee.o(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2664(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("eu")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.g(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2714(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("eu.b(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2711(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

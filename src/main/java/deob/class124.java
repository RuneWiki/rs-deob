package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dp")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.y(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2502(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("dp.k(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2506(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

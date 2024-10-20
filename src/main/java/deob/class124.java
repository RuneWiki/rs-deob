package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("du")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.n(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2572(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("du.o(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2576(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

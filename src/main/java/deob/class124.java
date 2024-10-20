package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dc")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.o(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2568(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("dc.l(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2569(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dc.g(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2570(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

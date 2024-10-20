package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dw")
public class class123 {

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.b(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method2460(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("dw.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2470(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dw.i(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2462(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

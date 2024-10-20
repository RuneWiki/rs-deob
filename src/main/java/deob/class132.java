package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ea")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.h(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2723(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ea.q(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2728(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

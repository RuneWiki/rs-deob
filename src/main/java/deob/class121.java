package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dg")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.e(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2458(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

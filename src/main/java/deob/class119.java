package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("db")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.t(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2423(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("db.o(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2418(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("do")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.f(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2490(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

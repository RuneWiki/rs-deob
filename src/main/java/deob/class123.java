package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("du")
public class class123 {

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.p(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2453(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

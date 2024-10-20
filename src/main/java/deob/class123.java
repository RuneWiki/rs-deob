package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("bl")
public class class123 {

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.v(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2167(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

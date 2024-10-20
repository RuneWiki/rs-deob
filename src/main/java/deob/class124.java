package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("di")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.n(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2540(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

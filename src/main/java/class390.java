import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class390 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;", line = 3)
    public static final Object method2298(String arg0, Applet arg1, byte arg2) throws Throwable {
        return arg2 < 18 ? null : JSObject.getWindow(arg1).call(arg0, null);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 15)
    public static final void method2299(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == 32095) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;", line = 25)
    public static final Object method2300(Object[] arg0, String arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 == 6 ? JSObject.getWindow(arg2).call(arg1, arg0) : null;
    }
}

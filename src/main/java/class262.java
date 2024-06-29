import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class262 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method1715(String arg0, Applet arg1, byte arg2) throws Throwable {
        return arg2 == -112 ? JSObject.getWindow(arg1).call(arg0, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method1716(Object[] arg0, String arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 > -59 ? null : JSObject.getWindow(arg2).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method1717(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == -233) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

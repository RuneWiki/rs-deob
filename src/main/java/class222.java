import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class222 {

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 5)
    public static final Object method1460(boolean arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 ? null : JSObject.getWindow(arg2).call(arg1, null);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)V", line = 15)
    public static final void method1461(Applet arg0, String arg1, boolean arg2) throws Throwable {
        if (!arg2) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z[Ljava/lang/Object;)Ljava/lang/Object;", line = 25)
    public static final Object method1462(Applet arg0, String arg1, boolean arg2, Object[] arg3) throws Throwable {
        return arg2 ? JSObject.getWindow(arg0).call(arg1, arg3) : null;
    }
}

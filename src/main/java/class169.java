import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class169 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;", line = 5)
    public static final Object method1179(Applet arg0, String arg1, Object[] arg2, byte arg3) throws Throwable {
        return arg3 > -80 ? null : JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)Ljava/lang/Object;", line = 15)
    public static final Object method1180(Applet arg0, String arg1, boolean arg2) throws Throwable {
        return arg2 ? null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 25)
    public static final void method1181(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 == -73) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

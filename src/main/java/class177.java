import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class177 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method1170(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 < 58 ? null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 13)
    public static final Object method1171(Applet arg0, int arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 == -6069 ? JSObject.getWindow(arg0).call(arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V", line = 23)
    public static final void method1172(String arg0, Applet arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 == -128) {
            ;
        }
    }
}

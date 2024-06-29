import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class157 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 3)
    public static final void method1179(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 14818) {
            ;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 13)
    public static final Object method1180(byte arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 < 56 ? null : JSObject.getWindow(arg1).call(arg2, null);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 23)
    public static final Object method1181(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 5949 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }
}

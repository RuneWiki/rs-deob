import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class209 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method1530(Object[] arg0, int arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 == 25430 ? JSObject.getWindow(arg2).call(arg3, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method1531(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 <= 2 ? (Object) null : JSObject.getWindow(arg2).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 24)
    public static final void method1532(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 18221) {
            ;
        }
    }
}

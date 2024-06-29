import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class101 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 3)
    public static final Object method889(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -27420 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 13)
    public static final Object method890(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 >= -70 ? null : JSObject.getWindow(arg3).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 23)
    public static final void method891(int arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 == 28521) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }
}

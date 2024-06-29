import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class69 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 5)
    public static final void method539(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == -23636) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 15)
    public static final Object method540(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 >= -122 ? null : JSObject.getWindow(arg1).call(arg0, null);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;", line = 25)
    public static final Object method541(Applet arg0, String arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 > -41 ? null : JSObject.getWindow(arg0).call(arg1, arg3);
    }
}

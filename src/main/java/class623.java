import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class623 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method3412(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 == -25118) {
            ;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method3413(String arg0, Object[] arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == 31580 ? JSObject.getWindow(arg3).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method3414(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 < 111 ? null : JSObject.getWindow(arg0).call(arg1, null);
    }
}

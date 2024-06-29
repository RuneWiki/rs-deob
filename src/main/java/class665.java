import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class665 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;", line = 3)
    public static final Object method3803(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 < 53 ? null : JSObject.getWindow(arg0).call(arg1, null);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 15)
    public static final void method3804(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 <= -34) {
            ;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;", line = 25)
    public static final Object method3805(Applet arg0, Object[] arg1, String arg2, byte arg3) throws Throwable {
        return arg3 == -2 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }
}

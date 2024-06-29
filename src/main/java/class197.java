import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class197 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method1339(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == 2367) {
            ;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1340(int arg0, String arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg0 <= 103 ? null : JSObject.getWindow(arg3).call(arg1, arg2);
    }
}

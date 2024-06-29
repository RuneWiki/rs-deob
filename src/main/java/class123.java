import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class123 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method696(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == -3386) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method697(byte arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 <= 85 ? null : JSObject.getWindow(arg2).call(arg1, null);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method698(Applet arg0, byte arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 == 50 ? JSObject.getWindow(arg0).call(arg2, arg3) : null;
    }
}

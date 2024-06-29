import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class144 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method997(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 > 12) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method998(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -11594 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method123(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -18677 ? JSObject.getWindow(arg0).call(arg1, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method124(int arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 == 13758) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }
}

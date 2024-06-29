import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class172 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method1096(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == -32189) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1097(String arg0, boolean arg1, Applet arg2) throws Throwable {
        return arg1 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : null;
    }
}

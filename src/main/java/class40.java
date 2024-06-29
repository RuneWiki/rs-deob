import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class40 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method279(byte arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 <= 23 ? null : JSObject.getWindow(arg1).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
    public static final void method280(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 >= 31) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

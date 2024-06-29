import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class106 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Ljava/lang/Object;BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method706(Object[] arg0, byte arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 < 24 ? null : JSObject.getWindow(arg2).call(arg3, arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method707(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 <= -8) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

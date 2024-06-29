import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class215 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
    public static final void method1452(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 == -12) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1453(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 < 106 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

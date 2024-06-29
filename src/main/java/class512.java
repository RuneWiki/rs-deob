import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class512 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
    public static final void method3063(String arg0, Applet arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 == 77) {
            ;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method3064(Applet arg0, boolean arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 ? null : JSObject.getWindow(arg0).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method3065(String arg0, Applet arg1, byte arg2) throws Throwable {
        return arg2 == 10 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

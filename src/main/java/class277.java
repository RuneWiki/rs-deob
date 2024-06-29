import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class277 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1848(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 2795 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method1849(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 < -113) {
            ;
        }
    }
}

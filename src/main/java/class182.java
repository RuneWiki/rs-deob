import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class182 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1265(int arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 == 3418) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method1266(int arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg0 == -6863 ? JSObject.getWindow(arg2).call(arg1, arg3) : null;
    }
}

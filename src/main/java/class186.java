import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class186 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method1303(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 == -10384 ? JSObject.getWindow(arg3).call(arg0, arg2) : (Object) null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 14)
    public static final void method1304(int arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 == 6681) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;", line = 24)
    public static final Object method1305(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? (Object) null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class232 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method1402(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -15277) {
            ;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method1403(String arg0, Object[] arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 == 126 ? JSObject.getWindow(arg2).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1404(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 < 46 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

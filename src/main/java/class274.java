import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class274 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static final void method1685(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 == 87) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method1686(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 <= 67 ? null : JSObject.getWindow(arg1).call(arg2, arg0);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1687(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == -5778 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }
}

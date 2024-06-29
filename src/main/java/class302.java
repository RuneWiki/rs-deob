import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class302 {

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method1820(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 22340) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1821(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 10049 ? JSObject.getWindow(arg0).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method1822(Applet arg0, String arg1, byte arg2, Object[] arg3) throws Throwable {
        return arg2 < 95 ? null : JSObject.getWindow(arg0).call(arg1, arg3);
    }
}

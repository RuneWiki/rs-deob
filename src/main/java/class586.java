import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class586 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;")
    public static final Object method3135(Object[] arg0, String arg1, Applet arg2, boolean arg3) throws Throwable {
        return arg3 ? null : JSObject.getWindow(arg2).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method3136(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == 21424) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method3137(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == 8259 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class425 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 3)
    public static final Object method2515(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -27401 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 13)
    public static final Object method2516(Object[] arg0, Applet arg1, int arg2, String arg3) throws Throwable {
        return arg2 == 14907 ? JSObject.getWindow(arg1).call(arg3, arg0) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 23)
    public static final void method2517(Applet arg0, byte arg1, String arg2) throws Throwable {
        if (arg1 == -103) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class429 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method2519(byte arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == 11) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method2520(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 <= 75 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method2521(String arg0, byte arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg1 < 116 ? null : JSObject.getWindow(arg2).call(arg0, arg3);
    }
}

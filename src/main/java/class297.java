import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class297 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 3)
    public static final void method1824(Applet arg0, byte arg1, String arg2) throws Throwable {
        if (arg1 == -53) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 15)
    public static final Object method1825(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 > -32 ? null : JSObject.getWindow(arg3).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method1826(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -14648 ? JSObject.getWindow(arg2).call(arg0, null) : null;
    }
}

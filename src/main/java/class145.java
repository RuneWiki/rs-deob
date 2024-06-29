import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method993(Applet arg0, byte arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 > -98 ? null : JSObject.getWindow(arg0).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method994(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 > 71) {
            ;
        }
    }
}

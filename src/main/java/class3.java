import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 4)
    public static final Object method16(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 > -85 ? (Object) null : JSObject.getWindow(arg1).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 16)
    public static final void method17(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -33) {
            ;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I[Ljava/lang/Object;)Ljava/lang/Object;", line = 26)
    public static final Object method18(String arg0, Applet arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 < 38 ? (Object) null : JSObject.getWindow(arg1).call(arg0, arg3);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class32 {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method200(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 > -48 ? null : JSObject.getWindow(arg2).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 15)
    public static final void method201(byte arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 <= -9) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B[Ljava/lang/Object;)Ljava/lang/Object;", line = 25)
    public static final Object method202(Applet arg0, String arg1, byte arg2, Object[] arg3) throws Throwable {
        return arg2 > -50 ? null : JSObject.getWindow(arg0).call(arg1, arg3);
    }
}

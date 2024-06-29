import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class124 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method985(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 <= 20 ? null : JSObject.getWindow(arg3).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 15)
    public static final void method986(byte arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 <= -7) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method987(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -8364 ? JSObject.getWindow(arg2).call(arg0, null) : null;
    }
}

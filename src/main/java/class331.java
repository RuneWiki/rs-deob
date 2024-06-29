import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class331 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method2047(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 <= 46 ? null : JSObject.getWindow(arg0).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 13)
    public static final void method2048(Applet arg0, String arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 > 113) {
            ;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 25)
    public static final Object method2049(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -3460 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class426 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 3)
    public static final Object method2604(byte arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg0 <= 49 ? null : JSObject.getWindow(arg2).call(arg1, arg3);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 13)
    public static final void method2605(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == 22482) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 23)
    public static final Object method2606(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 21615 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class154 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 3)
    public static final Object method1204(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == 22458 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 13)
    public static final void method1205(int arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 < -10) {
            ;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;BLjava/lang/String;)Ljava/lang/Object;", line = 23)
    public static final Object method1206(Applet arg0, Object[] arg1, byte arg2, String arg3) throws Throwable {
        return arg2 < 10 ? null : JSObject.getWindow(arg0).call(arg3, arg1);
    }
}

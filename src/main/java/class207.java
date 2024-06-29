import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class207 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method1298(byte arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 == -72) {
            ;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 15)
    public static final Object method1299(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 19639 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 25)
    public static final Object method1300(Applet arg0, int arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 == -4227 ? JSObject.getWindow(arg0).call(arg2, arg3) : null;
    }
}

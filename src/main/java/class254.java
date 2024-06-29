import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class254 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/lang/Object;BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method1714(Object[] arg0, byte arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 < 107 ? (Object) null : JSObject.getWindow(arg2).call(arg3, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method1715(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 == -88 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 24)
    public static final void method1716(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == -20114) {
            ;
        }
    }
}

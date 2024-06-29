import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class200 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method1469(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == -18278 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 14)
    public static final Object method1470(Object[] arg0, int arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 == -1750 ? JSObject.getWindow(arg2).call(arg3, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 26)
    public static final void method1471(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == 1240) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }
}

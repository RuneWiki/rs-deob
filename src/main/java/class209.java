import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class209 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1278(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == 5633 ? JSObject.getWindow(arg1).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1279(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 < 111 ? null : JSObject.getWindow(arg3).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method1280(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 <= -80) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

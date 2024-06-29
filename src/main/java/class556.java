import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class556 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;", line = 3)
    public static final Object method3149(Applet arg0, String arg1, Object[] arg2, byte arg3) throws Throwable {
        return arg3 == -42 ? JSObject.getWindow(arg0).call(arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 13)
    public static final Object method3150(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -21295 ? JSObject.getWindow(arg1).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V", line = 23)
    public static final void method3151(String arg0, boolean arg1, Applet arg2) throws Throwable {
        if (arg1) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

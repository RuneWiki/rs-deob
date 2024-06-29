import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class368 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)V", line = 3)
    public static final void method2346(Applet arg0, boolean arg1, String arg2) throws Throwable {
        if (!arg1) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 15)
    public static final Object method2347(String arg0, Object[] arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 <= 81 ? null : JSObject.getWindow(arg2).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method2348(Applet arg0, int arg1, String arg2) throws Throwable {
        int var3 = -113 / ((-arg1 - 45) / 37);
        return JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

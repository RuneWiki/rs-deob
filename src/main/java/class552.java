import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class552 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method3253(Applet arg0, int arg1, String arg2) throws Throwable {
        int var3 = 85 % ((40 - arg1) / 56);
        return JSObject.getWindow(arg0).call(arg2, null);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V", line = 12)
    public static final void method3254(String arg0, boolean arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 22)
    public static final Object method3255(String arg0, int arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg1 == 9309 ? JSObject.getWindow(arg2).call(arg0, arg3) : null;
    }
}

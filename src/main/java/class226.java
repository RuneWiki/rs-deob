import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class226 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method1607(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)V", line = 14)
    public static final void method1608(boolean arg0, String arg1, Applet arg2) throws Throwable {
        if (!arg0) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method1609(int arg0, String arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg0 > -43 ? (Object) null : JSObject.getWindow(arg3).call(arg1, arg2);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class400 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method2473(int arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 < -18) {
            ;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;Z)Ljava/lang/Object;")
    public static final Object method2474(String arg0, Applet arg1, Object[] arg2, boolean arg3) throws Throwable {
        return arg3 ? JSObject.getWindow(arg1).call(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method2475(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 > -7 ? null : JSObject.getWindow(arg0).call(arg2, null);
    }
}

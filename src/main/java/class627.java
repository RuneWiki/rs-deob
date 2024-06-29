import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class627 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method3522(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 >= -32 ? null : JSObject.getWindow(arg1).call(arg2, arg0);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V")
    public static final void method3523(String arg0, boolean arg1, Applet arg2) throws Throwable {
        if (arg1) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method3524(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 23421 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

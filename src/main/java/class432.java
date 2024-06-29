import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class432 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)V")
    public static final void method2309(String arg0, Applet arg1, boolean arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2310(String arg0, Object[] arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == 17635 ? JSObject.getWindow(arg3).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2311(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == 4975 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }
}

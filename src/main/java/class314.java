import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class314 {

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method2066(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 21747 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2067(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -24319 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V")
    public static final void method2068(String arg0, boolean arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (!arg1) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class348 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method2281(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 < -51) {
            ;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2282(byte arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 > -23 ? null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method2283(Applet arg0, String arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 == -13558 ? JSObject.getWindow(arg0).call(arg1, arg3) : null;
    }
}

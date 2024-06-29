import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class358 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method2401(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -125 % ((-arg0 - 30) / 59);
        JSObject.getWindow(arg2).eval(arg1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method2402(Applet arg0, String arg1, byte arg2, Object[] arg3) throws Throwable {
        return arg2 <= 69 ? null : JSObject.getWindow(arg0).call(arg1, arg3);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method2403(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -29103 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

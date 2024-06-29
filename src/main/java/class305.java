import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class305 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 3)
    public static final void method1918(Applet arg0, byte arg1, String arg2) throws Throwable {
        int var3 = -30 / ((-arg1 - 73) / 53);
        JSObject.getWindow(arg0).eval(arg2);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ILjava/applet/Applet;)Ljava/lang/Object;", line = 12)
    public static final Object method1919(String arg0, Object[] arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 > -81 ? null : JSObject.getWindow(arg3).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 22)
    public static final Object method1920(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == 21694 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }
}

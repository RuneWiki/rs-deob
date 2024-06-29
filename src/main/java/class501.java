import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class501 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
    public static final void method2993(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 == 8) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method2994(int arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 == -14557 ? JSObject.getWindow(arg2).call(arg3, arg1) : null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2995(String arg0, byte arg1, Applet arg2) throws Throwable {
        int var3 = -99 % ((22 - arg1) / 44);
        return JSObject.getWindow(arg2).call(arg0, null);
    }
}

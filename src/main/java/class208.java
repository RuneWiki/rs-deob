import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class208 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1376(int arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        int var4 = -53 % ((20 - arg0) / 38);
        return JSObject.getWindow(arg1).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method1377(String arg0, byte arg1, Applet arg2) throws Throwable {
        if (arg1 < -12) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method1378(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -9875 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

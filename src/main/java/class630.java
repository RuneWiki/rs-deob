import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class630 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method3563(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -53 / ((16 - arg0) / 63);
        JSObject.getWindow(arg2).eval(arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;", line = 12)
    public static final Object method3564(Applet arg0, String arg1, byte arg2) throws Throwable {
        int var3 = -113 / ((-arg2 - 46) / 44);
        return JSObject.getWindow(arg0).call(arg1, null);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 21)
    public static final Object method3565(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 == -1961 ? JSObject.getWindow(arg0).call(arg3, arg2) : null;
    }
}

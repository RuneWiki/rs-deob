import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class194 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method1377(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -69 % ((arg0 + 52) / 53);
        JSObject.getWindow(arg2).eval(arg1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method1378(byte arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 == -124 ? JSObject.getWindow(arg1).call(arg2, arg3) : null;
    }
}

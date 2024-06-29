import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class484 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 5)
    public static final Object method2855(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -29222 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V", line = 15)
    public static final void method2856(String arg0, byte arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        int var3 = 105 % ((19 - arg1) / 54);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ZLjava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method2857(String arg0, Object[] arg1, boolean arg2, Applet arg3) throws Throwable {
        return arg2 ? null : JSObject.getWindow(arg3).call(arg0, arg1);
    }
}

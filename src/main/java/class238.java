import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class238 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method1633(byte arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 <= -93) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1634(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 > -43 ? null : JSObject.getWindow(arg2).call(arg0, (Object[]) null);
    }
}

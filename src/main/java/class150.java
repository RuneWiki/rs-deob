import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class150 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V")
    public static final void method1119(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        int var3 = -101 / ((-arg1 - 25) / 52);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1120(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

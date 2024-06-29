import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class289 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1926(boolean arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 ? JSObject.getWindow(arg2).call(arg1, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method1927(int arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 == -15656) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class208 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1328(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -24232 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1329(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 == 132) {
            ;
        }
    }
}

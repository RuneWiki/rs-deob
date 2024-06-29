import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class274 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1874(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 26573 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method1875(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == -29083) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

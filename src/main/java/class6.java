import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method74(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 26638 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method75(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == -26132) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

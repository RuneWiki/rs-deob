import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class12 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method83(int arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 == 1246 ? JSObject.getWindow(arg1).call(arg3, arg2) : null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static final void method84(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 < -82) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

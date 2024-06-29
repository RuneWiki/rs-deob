import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method132(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 <= 64 ? null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)V")
    public static final void method133(String arg0, Applet arg1, boolean arg2) throws Throwable {
        if (arg2) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

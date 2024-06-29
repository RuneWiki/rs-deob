import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method497(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == -5475) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method498(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 < 122 ? null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

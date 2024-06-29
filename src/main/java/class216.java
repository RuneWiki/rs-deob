import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class216 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1481(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -93 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method1482(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == -6938) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

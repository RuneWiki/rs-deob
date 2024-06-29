import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class120 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method877(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 25718 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static final void method878(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 < -88) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

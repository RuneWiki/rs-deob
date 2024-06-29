import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class167 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method1062(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == 29125) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

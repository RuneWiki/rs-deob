import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class127 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 5)
    public static final Object method1031(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 19048 ? JSObject.getWindow(arg2).eval(arg0) : null;
    }
}

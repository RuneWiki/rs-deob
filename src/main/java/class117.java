import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class117 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method901(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -23462 ? JSObject.getWindow(arg2).eval(arg0) : null;
    }
}

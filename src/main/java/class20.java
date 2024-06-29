import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method150(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 26572 ? JSObject.getWindow(arg0).eval(arg2) : null;
    }
}

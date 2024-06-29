import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class122 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method970(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 > -18 ? null : JSObject.getWindow(arg0).eval(arg2);
    }
}

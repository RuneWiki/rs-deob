import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 5)
    public static final Object method632(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -28497 ? JSObject.getWindow(arg0).eval(arg1) : null;
    }
}

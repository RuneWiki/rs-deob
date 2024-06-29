import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method287(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == 20517 ? JSObject.getWindow(arg1).eval(arg2) : null;
    }
}

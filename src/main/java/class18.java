import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;", line = 3)
    public static final Object method124(String arg0, Applet arg1, boolean arg2) throws Throwable {
        return arg2 ? null : JSObject.getWindow(arg1).eval(arg0);
    }
}

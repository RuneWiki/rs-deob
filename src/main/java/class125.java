import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class125 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 3)
    public static final Object method940(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -12396 ? JSObject.getWindow(arg1).eval(arg0) : null;
    }
}

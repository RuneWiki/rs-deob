import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method144(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -18766 ? JSObject.getWindow(arg2).eval(arg1) : null;
    }
}

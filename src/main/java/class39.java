import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class39 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method238(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == 7596 ? JSObject.getWindow(arg1).eval(arg2) : null;
    }
}

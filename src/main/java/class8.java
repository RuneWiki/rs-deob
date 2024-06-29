import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class8 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 5)
    public static final Object method54(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -28433 ? JSObject.getWindow(arg2).eval(arg1) : null;
    }
}

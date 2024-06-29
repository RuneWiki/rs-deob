import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method359(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 <= 74 ? null : JSObject.getWindow(arg0).eval(arg1);
    }
}

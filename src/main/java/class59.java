import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method477(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -23103 ? JSObject.getWindow(arg1).eval(arg0) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class76 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)Ljava/lang/Object;")
    public static final Object method611(Applet arg0, String arg1, boolean arg2) throws Throwable {
        return arg2 ? JSObject.getWindow(arg0).eval(arg1) : null;
    }
}

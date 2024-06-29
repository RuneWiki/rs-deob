import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class288 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method2005(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 == 100 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method2006(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 8) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class181 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method1284(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 == -25889) {
            ;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method1285(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -21944 ? JSObject.getWindow(arg0).call(arg1, (Object[]) null) : null;
    }
}

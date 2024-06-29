import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class264 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static final Object method1791(Applet arg0, String arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == 13257 ? JSObject.getWindow(arg0).call(arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method1792(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -26472) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class234 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static final Object method1656(Applet arg0, String arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == -4446 ? JSObject.getWindow(arg0).call(arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1657(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 == 11859) {
            ;
        }
    }
}

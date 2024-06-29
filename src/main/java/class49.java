import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class49 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
    public static final void method345(String arg0, Applet arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 < -18) {
            ;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method346(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 >= -35 ? null : JSObject.getWindow(arg3).call(arg1, arg0);
    }
}

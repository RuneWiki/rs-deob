import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class9 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;BLjava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method48(String arg0, Object[] arg1, byte arg2, Applet arg3) throws Throwable {
        return arg2 <= 111 ? null : JSObject.getWindow(arg3).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 15)
    public static final Object method49(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 >= -104 ? null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V", line = 25)
    public static final void method50(String arg0, byte arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 <= -109) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class162 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 6)
    public static final void method1170(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 > 97) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;I)Ljava/lang/Object;", line = 16)
    public static final Object method1171(String arg0, Applet arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == -2745 ? JSObject.getWindow(arg1).call(arg0, arg2) : (Object) null;
    }
}

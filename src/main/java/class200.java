import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class200 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;BLjava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method1329(String arg0, Object[] arg1, byte arg2, Applet arg3) throws Throwable {
        return arg2 == 13 ? JSObject.getWindow(arg3).call(arg0, arg1) : (Object) null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 16)
    public static final void method1330(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == 26973) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class49 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 6)
    public static final void method377(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 < -121) {
            ;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 16)
    public static final Object method378(Applet arg0, int arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 == -27286 ? JSObject.getWindow(arg0).call(arg2, arg3) : (Object) null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;", line = 26)
    public static final Object method379(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 == 51 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : (Object) null;
    }
}

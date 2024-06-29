import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class27 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method184(byte arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 <= 63 ? null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method185(byte arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 >= 30) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }
}

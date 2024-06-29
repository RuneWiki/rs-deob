import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class33 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 6)
    public static final Object method224(byte arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 < 24 ? (Object) null : JSObject.getWindow(arg1).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 16)
    public static final void method225(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 == 4083) {
            ;
        }
    }
}

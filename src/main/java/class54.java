import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class54 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method508(byte arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == 56 ? JSObject.getWindow(arg1).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method509(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 == -8237) {
            ;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method510(boolean arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg0 ? null : JSObject.getWindow(arg2).call(arg1, arg3);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class104 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 3)
    public static final void method742(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -102) {
            ;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;Z)Ljava/lang/Object;", line = 13)
    public static final Object method743(Object[] arg0, Applet arg1, String arg2, boolean arg3) throws Throwable {
        return arg3 ? JSObject.getWindow(arg1).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 23)
    public static final Object method744(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 < 108 ? null : JSObject.getWindow(arg0).call(arg1, null);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class505 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 3)
    public static final Object method3015(byte arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 < 5 ? null : JSObject.getWindow(arg1).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)V", line = 13)
    public static final void method3016(String arg0, Applet arg1, boolean arg2) throws Throwable {
        if (!arg2) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 23)
    public static final Object method3017(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 <= 38 ? null : JSObject.getWindow(arg0).call(arg1, null);
    }
}

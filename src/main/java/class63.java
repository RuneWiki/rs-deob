import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class63 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method462(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 < -73) {
            ;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method463(int arg0, String arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg0 == 24774 ? JSObject.getWindow(arg3).call(arg1, arg2) : null;
    }
}

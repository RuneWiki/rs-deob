import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class120 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method849(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -27957) {
            ;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method850(Object[] arg0, Applet arg1, byte arg2, String arg3) throws Throwable {
        return arg2 == 8 ? JSObject.getWindow(arg1).call(arg3, arg0) : null;
    }
}

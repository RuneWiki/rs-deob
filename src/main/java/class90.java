import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class90 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 4)
    public static final void method682(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 <= -90) {
            ;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 16)
    public static final Object method683(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == -3189 ? JSObject.getWindow(arg0).call(arg2, arg1) : (Object) null;
    }
}

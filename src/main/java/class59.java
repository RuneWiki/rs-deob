import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class59 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method377(int arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 == 11175 ? JSObject.getWindow(arg1).call(arg3, arg2) : null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method378(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == 3893) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

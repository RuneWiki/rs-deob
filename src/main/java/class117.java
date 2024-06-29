import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class117 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 3)
    public static final void method934(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == -8642) {
            ;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 13)
    public static final Object method935(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 26643 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method936(String arg0, boolean arg1, Applet arg2) throws Throwable {
        return arg1 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : null;
    }
}

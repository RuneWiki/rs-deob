import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class594 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method3267(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -17670 ? JSObject.getWindow(arg2).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 15)
    public static final Object method3268(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 3542 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)V", line = 25)
    public static final void method3269(Applet arg0, boolean arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class568 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method3262(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 == 27066 ? JSObject.getWindow(arg3).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;", line = 13)
    public static final Object method3263(String arg0, Applet arg1, boolean arg2) throws Throwable {
        return arg2 ? null : JSObject.getWindow(arg1).call(arg0, null);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V", line = 25)
    public static final void method3264(String arg0, byte arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 23) {
            ;
        }
    }
}

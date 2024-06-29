import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class499 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method2791(int arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 < 75 ? null : JSObject.getWindow(arg1).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method2792(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == -6891) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2793(String arg0, byte arg1, Applet arg2) throws Throwable {
        int var3 = 108 / ((arg1 - 8) / 37);
        return JSObject.getWindow(arg2).call(arg0, null);
    }
}

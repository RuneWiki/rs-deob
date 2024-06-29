import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class323 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 5)
    public static final void method2081(byte arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == 25) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 15)
    public static final Object method2082(byte arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
        int var4 = 118 % ((65 - arg0) / 47);
        return JSObject.getWindow(arg2).call(arg1, arg3);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method2083(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -10217 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }
}

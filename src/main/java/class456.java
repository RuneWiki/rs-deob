import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class456 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 3)
    public static final Object method2733(String arg0, Object[] arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 == -31915 ? JSObject.getWindow(arg2).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 13)
    public static final void method2734(byte arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 < -89) {
            ;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 23)
    public static final Object method2735(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -27001 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }
}

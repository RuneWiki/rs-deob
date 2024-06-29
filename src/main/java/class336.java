import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class336 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method2038(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 > -121 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 13)
    public static final void method2039(byte arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == 87) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 23)
    public static final Object method2040(int arg0, Object[] arg1, String arg2, Applet arg3) throws Throwable {
        return arg0 == -19485 ? JSObject.getWindow(arg3).call(arg2, arg1) : null;
    }
}

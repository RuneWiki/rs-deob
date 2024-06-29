import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 4)
    public static final void method1(byte arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 < -115) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", line = 14)
    public static final Object method2(Applet arg0, String arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 <= 86 ? (Object) null : JSObject.getWindow(arg0).call(arg1, arg2);
    }
}

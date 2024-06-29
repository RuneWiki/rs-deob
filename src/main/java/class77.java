import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class77 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method566(String arg0, Object[] arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 > -52 ? null : JSObject.getWindow(arg2).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method567(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == -4140) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

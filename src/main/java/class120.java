import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class120 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method792(byte arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 < 121 ? null : JSObject.getWindow(arg2).call(arg3, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method793(int arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 == -24992) {
            ;
        }
    }
}

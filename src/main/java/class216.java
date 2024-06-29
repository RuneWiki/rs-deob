import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class216 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 4)
    public static final void method1519(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 < -115) {
            ;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B[Ljava/lang/Object;)Ljava/lang/Object;", line = 16)
    public static final Object method1520(Applet arg0, String arg1, byte arg2, Object[] arg3) throws Throwable {
        return arg2 == -31 ? JSObject.getWindow(arg0).call(arg1, arg3) : (Object) null;
    }
}

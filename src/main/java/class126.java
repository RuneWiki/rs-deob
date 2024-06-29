import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class126 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method967(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 < -21) {
            ;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method968(int arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 == -9315 ? JSObject.getWindow(arg2).call(arg3, arg1) : null;
    }
}

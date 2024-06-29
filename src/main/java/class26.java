import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static final void method239(Applet arg0, String arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 < -52) {
            ;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method240(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 > -96 ? null : JSObject.getWindow(arg1).call(arg2, (Object[]) null);
    }
}

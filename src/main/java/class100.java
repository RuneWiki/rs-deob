import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class100 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 6)
    public static final Object method701(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 <= 114 ? (Object) null : JSObject.getWindow(arg0).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 16)
    public static final void method702(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 < -15) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }
}

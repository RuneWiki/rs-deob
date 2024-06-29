import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class101 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method725(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 == 2585 ? JSObject.getWindow(arg3).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method726(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == -24044) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method727(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 >= -109 ? null : JSObject.getWindow(arg2).call(arg0, null);
    }
}

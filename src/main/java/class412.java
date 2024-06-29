import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class412 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method2587(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 > -42 ? null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2588(Object[] arg0, String arg1, byte arg2, Applet arg3) throws Throwable {
        return arg2 < 48 ? null : JSObject.getWindow(arg3).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method2589(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -1947) {
            ;
        }
    }
}

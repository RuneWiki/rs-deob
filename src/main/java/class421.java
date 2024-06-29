import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class421 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 5)
    public static final Object method2690(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -27444 ? JSObject.getWindow(arg0).call(arg1, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 15)
    public static final Object method2691(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == -30810 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 25)
    public static final void method2692(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 6764) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class443 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 3)
    public static final void method2741(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -30916) {
            ;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 13)
    public static final Object method2742(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 == 19210 ? JSObject.getWindow(arg3).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method2743(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == -24425 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }
}

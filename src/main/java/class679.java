import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class679 {

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 3)
    public static final Object method3851(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == -26978 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 13)
    public static final Object method3852(int arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 == 26635 ? JSObject.getWindow(arg1).call(arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 23)
    public static final void method3853(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == 9202) {
            ;
        }
    }
}

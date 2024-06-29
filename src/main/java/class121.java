import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class121 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 3)
    public static final void method876(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 >= 17) {
            ;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 13)
    public static final Object method877(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == -22421 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method878(byte arg0, Object[] arg1, String arg2, Applet arg3) throws Throwable {
        return arg0 == -117 ? JSObject.getWindow(arg3).call(arg2, arg1) : null;
    }
}

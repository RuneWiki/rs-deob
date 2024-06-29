import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class376 {

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method2358(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 3860 ? JSObject.getWindow(arg0).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V", line = 13)
    public static final void method2359(String arg0, Applet arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        if (arg2 >= 74) {
            ;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;", line = 23)
    public static final Object method2360(Object[] arg0, String arg1, Applet arg2, boolean arg3) throws Throwable {
        return arg3 ? JSObject.getWindow(arg2).call(arg1, arg0) : null;
    }
}

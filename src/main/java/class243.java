import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class243 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V")
    public static final void method1598(Applet arg0, byte arg1, String arg2) throws Throwable {
        if (arg1 == 121) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method1599(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 1736 ? JSObject.getWindow(arg1).call(arg2, arg0) : null;
    }
}

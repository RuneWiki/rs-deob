import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class226 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)Ljava/lang/Object;", line = 4)
    public static final Object method1540(Applet arg0, String arg1, boolean arg2) throws Throwable {
        return arg2 ? (Object) null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 14)
    public static final void method1541(byte arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 > 79) {
            ;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;", line = 26)
    public static final Object method1542(Applet arg0, Object[] arg1, String arg2, byte arg3) throws Throwable {
        return arg3 == -79 ? JSObject.getWindow(arg0).call(arg2, arg1) : (Object) null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class251 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method1754(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 == -104 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;", line = 14)
    public static final Object method1755(Applet arg0, String arg1, Object[] arg2, byte arg3) throws Throwable {
        return arg3 > -104 ? (Object) null : JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)V", line = 24)
    public static final void method1756(boolean arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }
}

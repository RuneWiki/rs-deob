import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class197 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method1468(boolean arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 ? (Object) null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 14)
    public static final void method1469(Applet arg0, String arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == 43) {
            ;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 26)
    public static final Object method1470(String arg0, int arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg1 == -32634 ? JSObject.getWindow(arg2).call(arg0, arg3) : (Object) null;
    }
}

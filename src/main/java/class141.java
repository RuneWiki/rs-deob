import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class141 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method1176(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 16)
    public static final Object method1177(Object[] arg0, int arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 < 8 ? (Object) null : JSObject.getWindow(arg2).call(arg3, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 26)
    public static final void method1178(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -19351) {
            ;
        }
    }
}

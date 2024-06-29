import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class114 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;", line = 4)
    public static final Object method857(Object[] arg0, String arg1, Applet arg2, boolean arg3) throws Throwable {
        return arg3 ? (Object) null : JSObject.getWindow(arg2).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method858(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 == -67 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 26)
    public static final void method859(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 27510) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

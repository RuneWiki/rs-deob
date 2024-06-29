import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class111 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 6)
    public static final Object method751(int arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 == 7095 ? JSObject.getWindow(arg1).call(arg3, arg2) : (Object) null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V", line = 16)
    public static final void method752(String arg0, boolean arg1, Applet arg2) throws Throwable {
        if (!arg1) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 26)
    public static final Object method753(boolean arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : (Object) null;
    }
}

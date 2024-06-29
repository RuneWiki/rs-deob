import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class92 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V", line = 4)
    public static final void method634(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 == -69) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method635(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -7455 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;", line = 24)
    public static final Object method636(Applet arg0, String arg1, Object[] arg2, boolean arg3) throws Throwable {
        return arg3 ? JSObject.getWindow(arg0).call(arg1, arg2) : (Object) null;
    }
}

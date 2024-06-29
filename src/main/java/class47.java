import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class47 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)V", line = 3)
    public static final void method248(Applet arg0, String arg1, boolean arg2) throws Throwable {
        if (!arg2) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;", line = 13)
    public static final Object method249(String arg0, Applet arg1, byte arg2) throws Throwable {
        return arg2 <= 81 ? null : JSObject.getWindow(arg1).call(arg0, null);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method250(boolean arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 ? null : JSObject.getWindow(arg2).call(arg3, arg1);
    }
}

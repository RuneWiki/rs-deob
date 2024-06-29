import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class470 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method3617(byte arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = -105 / ((arg0 + 63) / 41);
        return JSObject.getWindow(arg1).call(arg2, null);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method3618(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 14868) {
            ;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ZLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method3619(Object[] arg0, String arg1, boolean arg2, Applet arg3) throws Throwable {
        return arg2 ? JSObject.getWindow(arg3).call(arg1, arg0) : null;
    }
}

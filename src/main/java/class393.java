import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class393 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2415(String arg0, int arg1, Applet arg2) throws Throwable {
        int var3 = 1 % ((arg1 + 42) / 43);
        return JSObject.getWindow(arg2).call(arg0, null);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method2416(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -25442) {
            ;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static final Object method2417(String arg0, Applet arg1, Object[] arg2, byte arg3) throws Throwable {
        return arg3 < 32 ? null : JSObject.getWindow(arg1).call(arg0, arg2);
    }
}

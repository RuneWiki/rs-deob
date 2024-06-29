import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class600 {

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method4459(String arg0, Applet arg1, int arg2) throws Throwable {
        int var3 = 127 % ((17 - arg2) / 33);
        JSObject.getWindow(arg1).eval(arg0);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method4460(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 < 46 ? null : JSObject.getWindow(arg3).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method4461(Applet arg0, String arg1, byte arg2) throws Throwable {
        int var3 = 19 % ((arg2 - 29) / 48);
        return JSObject.getWindow(arg0).call(arg1, null);
    }
}

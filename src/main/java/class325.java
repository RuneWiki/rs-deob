import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class325 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method2066(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 > -64 ? null : JSObject.getWindow(arg0).call(arg2, null);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method2067(int arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = 49 / ((arg0 + 67) / 32);
        JSObject.getWindow(arg1).eval(arg2);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static final Object method2068(String arg0, Applet arg1, Object[] arg2, byte arg3) throws Throwable {
        return arg3 <= 35 ? null : JSObject.getWindow(arg1).call(arg0, arg2);
    }
}

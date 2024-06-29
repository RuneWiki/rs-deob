import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class513 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 3)
    public static final Object method3040(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 1360 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 13)
    public static final Object method3041(String arg0, Object[] arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 > -87 ? null : JSObject.getWindow(arg2).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 23)
    public static final void method3042(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        int var3 = 123 / ((arg1 + 31) / 40);
    }
}

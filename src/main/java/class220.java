import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class220 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method1510(int arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = 63 / ((arg0 - 44) / 52);
        return JSObject.getWindow(arg2).call(arg1, null);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 12)
    public static final void method1511(Applet arg0, String arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        int var3 = 34 % ((-arg2 - 27) / 42);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/applet/Applet;B[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 23)
    public static final Object method1512(Applet arg0, byte arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 == 58 ? JSObject.getWindow(arg0).call(arg3, arg2) : null;
    }
}

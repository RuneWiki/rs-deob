import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class250 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method1567(String arg0, byte arg1, Object[] arg2, Applet arg3) throws Throwable {
        int var4 = 101 / ((-arg1 - 29) / 37);
        return JSObject.getWindow(arg3).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 14)
    public static final void method1568(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == 14) {
            ;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 24)
    public static final Object method1569(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 18050 ? JSObject.getWindow(arg1).call(arg0, (Object[]) null) : null;
    }
}

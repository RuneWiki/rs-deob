import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class233 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method1579(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        int var3 = 98 / ((41 - arg2) / 50);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method1580(Object[] arg0, String arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 > -61 ? null : JSObject.getWindow(arg2).call(arg1, arg0);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class177 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 5)
    public static final void method1195(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = 123 % ((-arg0 - 15) / 45);
        JSObject.getWindow(arg2).eval(arg1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 13)
    public static final Object method1196(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 11677 ? JSObject.getWindow(arg0).call(arg2, arg1) : (Object) null;
    }
}

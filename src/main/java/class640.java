import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class640 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;", line = 3)
    public static final Object method3701(String arg0, Object[] arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 == 2 ? JSObject.getWindow(arg2).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;", line = 15)
    public static final Object method3702(Applet arg0, byte arg1, String arg2) throws Throwable {
        int var3 = -47 % ((-arg1 - 9) / 41);
        return JSObject.getWindow(arg0).call(arg2, null);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 24)
    public static final void method3703(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 20948) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

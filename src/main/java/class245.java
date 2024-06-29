import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class245 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1311(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == 3953 ? JSObject.getWindow(arg3).call(arg1, arg0) : null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1312(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        int var3 = 27 / ((19 - arg0) / 37);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1313(Applet arg0, byte arg1, String arg2) throws Throwable {
        int var3 = 81 / ((-arg1 - 83) / 35);
        return JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }
}

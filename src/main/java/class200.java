import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class200 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method1369(Applet arg0, Object[] arg1, String arg2, byte arg3) throws Throwable {
        int var4 = -93 / ((-arg3 - 63) / 38);
        return JSObject.getWindow(arg0).call(arg2, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1370(int arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = 119 / ((47 - arg0) / 55);
        return JSObject.getWindow(arg1).call(arg2, null);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method1371(String arg0, byte arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 >= 77) {
            ;
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class199 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 4)
    public static final void method1309(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == 12345) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 16)
    public static final Object method1310(String arg0, byte arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 == -23 ? JSObject.getWindow(arg3).call(arg0, arg2) : (Object) null;
    }
}

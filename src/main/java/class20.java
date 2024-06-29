import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method230(Object[] arg0, String arg1, Applet arg2, int arg3) throws Throwable {
        int var4 = 101 / ((-arg3 - 68) / 41);
        return JSObject.getWindow(arg2).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method231(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        int var3 = 68 / ((41 - arg2) / 57);
    }
}

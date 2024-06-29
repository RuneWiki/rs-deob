import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class143 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method939(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        int var4 = -44 % ((-arg1 - 31) / 57);
        return JSObject.getWindow(arg0).call(arg3, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method940(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 > 10) {
            ;
        }
    }
}

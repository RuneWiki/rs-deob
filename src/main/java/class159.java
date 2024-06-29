import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class159 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method981(String arg0, int arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg1 == -30463 ? JSObject.getWindow(arg2).call(arg0, arg3) : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method982(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -9870) {
            ;
        }
    }
}

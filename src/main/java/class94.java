import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class94 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method738(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 == -14489 ? JSObject.getWindow(arg3).call(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method739(byte arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 <= -9) {
            ;
        }
    }
}

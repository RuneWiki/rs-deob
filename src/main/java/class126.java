import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class126 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static final Object method875(String arg0, Applet arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == -707 ? JSObject.getWindow(arg1).call(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method876(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 4149) {
            ;
        }
    }
}

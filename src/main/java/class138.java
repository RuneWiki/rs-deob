import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class138 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method959(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 >= -34 ? null : JSObject.getWindow(arg2).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method960(byte arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 >= 27) {
            ;
        }
    }
}

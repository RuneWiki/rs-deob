import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class39 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method317(String arg0, Object[] arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 == -5878 ? JSObject.getWindow(arg2).call(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method318(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == 32342) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

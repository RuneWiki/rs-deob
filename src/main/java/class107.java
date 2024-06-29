import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class107 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Ljava/lang/Object;BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 6)
    public static final Object method693(Object[] arg0, byte arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 > -51 ? (Object) null : JSObject.getWindow(arg2).call(arg3, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V", line = 16)
    public static final void method694(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -5201) {
            ;
        }
    }
}

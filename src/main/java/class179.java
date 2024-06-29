import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class179 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 6)
    public static final void method1266(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 26362) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 16)
    public static final Object method1267(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 == 32448 ? JSObject.getWindow(arg0).call(arg3, arg2) : (Object) null;
    }
}

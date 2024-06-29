import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class113 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 5)
    public static final Object method795(Applet arg0, int arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 == 23131 ? JSObject.getWindow(arg0).call(arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 15)
    public static final void method796(String arg0, Applet arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg0);
        int var3 = 65 / ((45 - arg2) / 37);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method797(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 <= 83 ? null : JSObject.getWindow(arg2).call(arg0, null);
    }
}

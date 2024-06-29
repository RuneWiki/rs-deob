import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class729 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method4042(byte arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        int var3 = -126 / ((arg0 - 36) / 48);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 12)
    public static final Object method4043(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 < 55 ? null : JSObject.getWindow(arg3).call(arg2, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 24)
    public static final Object method4044(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 26693 ? JSObject.getWindow(arg0).call(arg2, null) : null;
    }
}

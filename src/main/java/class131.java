import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class131 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 3)
    public static final Object method839(String arg0, byte arg1, Applet arg2, Object[] arg3) throws Throwable {
        return arg1 == -55 ? JSObject.getWindow(arg2).call(arg0, arg3) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V", line = 13)
    public static final void method840(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 < -15) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method841(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == -14144 ? JSObject.getWindow(arg0).call(arg2, null) : null;
    }
}

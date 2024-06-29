import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class43 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method540(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -15092) {
            ;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method541(String arg0, Object[] arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 <= 0 ? null : JSObject.getWindow(arg2).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method542(byte arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == 125 ? JSObject.getWindow(arg1).call(arg2, null) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class88 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 6)
    public static final Object method700(Applet arg0, boolean arg1, String arg2, Object[] arg3) throws Throwable {
        return arg1 ? JSObject.getWindow(arg0).call(arg2, arg3) : (Object) null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 16)
    public static final void method701(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == 31343) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;", line = 26)
    public static final Object method702(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 <= 44 ? (Object) null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}

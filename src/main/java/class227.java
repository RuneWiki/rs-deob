import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class227 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method1517(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 > -87 ? (Object) null : JSObject.getWindow(arg2).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;", line = 15)
    public static final Object method1518(Applet arg0, String arg1, Object[] arg2, byte arg3) throws Throwable {
        int var4 = -90 / ((arg3 - 40) / 55);
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)V", line = 25)
    public static final void method1519(Applet arg0, boolean arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (!arg1) {
            ;
        }
    }
}

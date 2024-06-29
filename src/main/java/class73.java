import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class73 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method499(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 < 22 ? (Object) null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method500(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 == -25425 ? JSObject.getWindow(arg3).call(arg2, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V", line = 26)
    public static final void method501(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 >= 41) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

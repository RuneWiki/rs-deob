import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class745 {

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 3)
    public static final Object method4170(boolean arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 ? JSObject.getWindow(arg1).call(arg3, arg2) : null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;", line = 15)
    public static final Object method4171(String arg0, Applet arg1, byte arg2) throws Throwable {
        return arg2 <= 16 ? null : JSObject.getWindow(arg1).call(arg0, null);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 25)
    public static final void method4172(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 == -35) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

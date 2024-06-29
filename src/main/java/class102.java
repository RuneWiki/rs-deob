import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class102 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method666(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? (Object) null : JSObject.getWindow(arg0).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)V", line = 16)
    public static final void method667(String arg0, Applet arg1, boolean arg2) throws Throwable {
        if (!arg2) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 26)
    public static final Object method668(byte arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 >= -108 ? (Object) null : JSObject.getWindow(arg2).call(arg3, arg1);
    }
}

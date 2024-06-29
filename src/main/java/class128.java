import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class128 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 6)
    public static final Object method953(int arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 < 70 ? (Object) null : JSObject.getWindow(arg1).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 16)
    public static final void method954(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == 5510) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }
}

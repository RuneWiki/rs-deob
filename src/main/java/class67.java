import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I[Ljava/lang/Object;)Ljava/lang/Object;", line = 4)
    public static final Object method423(String arg0, Applet arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 > -100 ? (Object) null : JSObject.getWindow(arg1).call(arg0, arg3);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V", line = 16)
    public static final void method424(String arg0, Applet arg1, byte arg2) throws Throwable {
        if (arg2 == 107) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 26)
    public static final Object method425(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 5927 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }
}

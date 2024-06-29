import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class308 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method2181(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 32627 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)V", line = 14)
    public static final void method2182(Applet arg0, String arg1, boolean arg2) throws Throwable {
        if (!arg2) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I[Ljava/lang/Object;)Ljava/lang/Object;", line = 25)
    public static final Object method2183(String arg0, Applet arg1, int arg2, Object[] arg3) throws Throwable {
        int var4 = -76 % ((arg2 + 16) / 53);
        return JSObject.getWindow(arg1).call(arg0, arg3);
    }
}

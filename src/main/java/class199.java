import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class199 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 4)
    public static final Object method1443(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 21329 ? JSObject.getWindow(arg1).call(arg2, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 15)
    public static final void method1444(Applet arg0, String arg1, byte arg2) throws Throwable {
        int var3 = -89 % ((arg2 - 63) / 62);
        JSObject.getWindow(arg0).eval(arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method1445(int arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -28 / ((arg0 + 87) / 39);
        return JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }
}

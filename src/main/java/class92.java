import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class92 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method688(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -13381 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)V", line = 13)
    public static final void method689(boolean arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 23)
    public static final Object method690(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == -2278 ? JSObject.getWindow(arg3).call(arg1, arg0) : null;
    }
}

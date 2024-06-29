import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class150 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method1034(String arg0, Object[] arg1, Applet arg2, byte arg3) throws Throwable {
        return arg3 < 19 ? null : JSObject.getWindow(arg2).call(arg0, arg1);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1035(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -19253 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method1036(String arg0, byte arg1, Applet arg2) throws Throwable {
        if (arg1 <= -63) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

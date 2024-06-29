import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class204 {

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method1329(byte arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -57 ? JSObject.getWindow(arg1).call(arg2, null) : null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 15)
    public static final Object method1330(int arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 == 31845 ? JSObject.getWindow(arg2).call(arg3, arg1) : null;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 25)
    public static final void method1331(byte arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 == 45) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }
}

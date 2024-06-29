import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class193 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 5)
    public static final void method1212(Applet arg0, String arg1, byte arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        if (arg2 == 38) {
            ;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 15)
    public static final Object method1213(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -13481 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;", line = 25)
    public static final Object method1214(Applet arg0, Object[] arg1, String arg2, byte arg3) throws Throwable {
        return arg3 == -105 ? JSObject.getWindow(arg0).call(arg2, arg1) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class192 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method1600(boolean arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 15)
    public static final Object method1601(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 4368 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method1602(Applet arg0, int arg1, Object[] arg2, String arg3) throws Throwable {
        return arg1 == 16163 ? JSObject.getWindow(arg0).call(arg3, arg2) : null;
    }
}

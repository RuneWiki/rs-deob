import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class73 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method520(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 > 107) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 13)
    public static final Object method521(boolean arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;I)Ljava/lang/Object;", line = 25)
    public static final Object method522(String arg0, Applet arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == 20406 ? JSObject.getWindow(arg1).call(arg0, arg2) : null;
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class371 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method2026(String arg0, byte arg1, Applet arg2) throws Throwable {
        int var3 = 39 / ((arg1 + 29) / 35);
        JSObject.getWindow(arg2).eval(arg0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static final Object method2027(Applet arg0, String arg1, Object[] arg2, int arg3) throws Throwable {
        return arg3 == 1164 ? JSObject.getWindow(arg0).call(arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2028(boolean arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }
}

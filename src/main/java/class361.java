import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class361 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method2207(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 > -53 ? null : JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method2208(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = 6 % ((arg0 - 23) / 32);
        JSObject.getWindow(arg2).eval(arg1);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method2209(String arg0, Applet arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 == 7182 ? JSObject.getWindow(arg1).call(arg0, arg3) : null;
    }
}

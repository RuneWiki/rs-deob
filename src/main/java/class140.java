import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class140 {

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method923(Applet arg0, byte arg1, String arg2) throws Throwable {
        int var3 = 65 % ((8 - arg1) / 63);
        return JSObject.getWindow(arg0).call(arg2, null);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method924(Applet arg0, String arg1, int arg2, Object[] arg3) throws Throwable {
        return arg2 == 24093 ? JSObject.getWindow(arg0).call(arg1, arg3) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static final void method925(Applet arg0, String arg1, byte arg2) throws Throwable {
        if (arg2 <= -43) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

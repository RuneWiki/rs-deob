import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class54 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method405(byte arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = 101 / ((arg0 + 71) / 37);
        return JSObject.getWindow(arg1).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method406(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 <= -80) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

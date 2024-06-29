import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method544(Applet arg0, int arg1, String arg2) throws Throwable {
        int var3 = 1 / ((arg1 - 67) / 34);
        return JSObject.getWindow(arg0).eval(arg2);
    }
}

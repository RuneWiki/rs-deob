import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class291 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method2037(byte arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        int var3 = -117 / ((67 - arg0) / 32);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method2038(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 20042 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : null;
    }
}

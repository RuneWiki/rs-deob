import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
    public static final Object method730(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 188 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method731(byte arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 >= 11) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class181 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1186(boolean arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }
}

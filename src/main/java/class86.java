import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class86 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V")
    public static final void method557(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 >= 58) {
            ;
        }
    }
}

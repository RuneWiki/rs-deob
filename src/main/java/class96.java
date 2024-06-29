import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class96 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
    public static final void method606(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == -29981) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }
}

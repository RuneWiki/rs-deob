import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class144 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method913(String arg0, int arg1, Applet arg2) throws Throwable {
        if (arg1 == -5253) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }
}

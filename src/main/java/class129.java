import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class129 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 3)
    public static final Object method1018(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == -23874 ? JSObject.getWindow(arg2).eval(arg1) : null;
    }
}

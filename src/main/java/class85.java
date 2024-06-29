import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 5)
    public static final Object method648(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == -14945 ? JSObject.getWindow(arg2).eval(arg0) : null;
    }
}

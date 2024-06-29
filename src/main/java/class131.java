import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class131 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 4)
    public static final void method879(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 > 26) {
            ;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 15)
    public static final Object method880(String arg0, byte arg1, Applet arg2, Object[] arg3) throws Throwable {
        int var4 = 107 % ((29 - arg1) / 49);
        return JSObject.getWindow(arg2).call(arg0, arg3);
    }
}

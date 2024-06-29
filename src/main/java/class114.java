import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class114 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V", line = 3)
    public static final void method824(byte arg0, String arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg1);
        if (arg0 < -79) {
            ;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 13)
    public static final Object method825(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 13324 ? JSObject.getWindow(arg2).call(arg0, null) : null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method826(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == -8456 ? JSObject.getWindow(arg3).call(arg1, arg0) : null;
    }
}

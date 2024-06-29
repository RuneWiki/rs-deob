import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 3)
    public static final void method9(int arg0, Applet arg1, String arg2) throws Throwable {
        if (arg0 < -57) {
            JSObject.getWindow(arg1).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 13)
    public static final Object method10(Object[] arg0, int arg1, String arg2, Applet arg3) throws Throwable {
        return arg1 == 21570 ? JSObject.getWindow(arg3).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 25)
    public static final Object method11(String arg0, Applet arg1, int arg2) throws Throwable {
        return arg2 == 21190 ? JSObject.getWindow(arg1).call(arg0, null) : null;
    }
}

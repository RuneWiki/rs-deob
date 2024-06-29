import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class67 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method434(Applet arg0, byte arg1, String arg2) throws Throwable {
        return arg1 == -100 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 15)
    public static final void method435(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == 8358) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;ZLjava/lang/String;)Ljava/lang/Object;", line = 25)
    public static final Object method436(Applet arg0, Object[] arg1, boolean arg2, String arg3) throws Throwable {
        return arg2 ? JSObject.getWindow(arg0).call(arg3, arg1) : null;
    }
}

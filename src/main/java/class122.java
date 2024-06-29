import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class122 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 4)
    public static final Object method824(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == 25315 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 14)
    public static final void method825(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 > 124) {
            ;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;BLjava/lang/String;)Ljava/lang/Object;", line = 24)
    public static final Object method826(Applet arg0, Object[] arg1, byte arg2, String arg3) throws Throwable {
        return arg2 == 61 ? JSObject.getWindow(arg0).call(arg3, arg1) : (Object) null;
    }
}

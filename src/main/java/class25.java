import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", line = 6)
    public static final Object method166(Applet arg0, Object[] arg1, String arg2, int arg3) throws Throwable {
        return arg3 == -20052 ? JSObject.getWindow(arg0).call(arg2, arg1) : (Object) null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 16)
    public static final void method167(Applet arg0, int arg1, String arg2) throws Throwable {
        if (arg1 == -11088) {
            JSObject.getWindow(arg0).eval(arg2);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;", line = 27)
    public static final Object method168(String arg0, Applet arg1, int arg2) throws Throwable {
        int var3 = -76 % ((-arg2 - 10) / 55);
        return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class51 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 5)
    public static final Object method419(byte arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = -95 % ((15 - arg0) / 37);
        return JSObject.getWindow(arg1).call(arg2, (Object[]) null);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 15)
    public static final Object method420(Object[] arg0, int arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 == -10770 ? JSObject.getWindow(arg2).call(arg3, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 25)
    public static final void method421(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 == -10156) {
            ;
        }
    }
}

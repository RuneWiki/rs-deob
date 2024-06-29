import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class87 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method637(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 >= -48 ? null : JSObject.getWindow(arg1).call(arg2, null);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/lang/Object;BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method638(Object[] arg0, byte arg1, Applet arg2, String arg3) throws Throwable {
        return arg1 >= -95 ? null : JSObject.getWindow(arg2).call(arg3, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method639(byte arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = 15 % ((30 - arg0) / 55);
        JSObject.getWindow(arg1).eval(arg2);
    }
}

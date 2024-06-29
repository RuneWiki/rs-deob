import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class227 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
    public static final Object method1507(int arg0, Object[] arg1, Applet arg2, String arg3) throws Throwable {
        return arg0 == 10393 ? JSObject.getWindow(arg2).call(arg3, arg1) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method1508(String arg0, byte arg1, Applet arg2) throws Throwable {
        if (arg1 > 112) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method1509(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == 29436 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }
}

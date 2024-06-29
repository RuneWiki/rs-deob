import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class284 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
    public static final void method1861(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        int var3 = -62 / ((-arg0 - 16) / 49);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method1862(Applet arg0, String arg1, byte arg2) throws Throwable {
        return arg2 == 47 ? JSObject.getWindow(arg0).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method1863(Object[] arg0, String arg1, Applet arg2, int arg3) throws Throwable {
        return arg3 == -21119 ? JSObject.getWindow(arg2).call(arg1, arg0) : null;
    }
}

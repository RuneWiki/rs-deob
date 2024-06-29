import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class198 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 4)
    public static final Object method1378(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 == 17806 ? JSObject.getWindow(arg1).call(arg2, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V", line = 16)
    public static final void method1379(Applet arg0, byte arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == -112) {
            ;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 26)
    public static final Object method1380(byte arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 < 85 ? (Object) null : JSObject.getWindow(arg2).call(arg1, (Object[]) null);
    }
}

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class279 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method1910(int arg0, String arg1, Applet arg2) throws Throwable {
        if (arg0 == -26463) {
            JSObject.getWindow(arg2).eval(arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;")
    public static final Object method1911(Applet arg0, boolean arg1, String arg2) throws Throwable {
        return arg1 ? JSObject.getWindow(arg0).call(arg2, (Object[]) null) : null;
    }
}

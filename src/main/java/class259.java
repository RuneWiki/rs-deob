import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class259 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method1722(String arg0, int arg1, Applet arg2) throws Throwable {
        return arg1 == 3787 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static final void method1723(Applet arg0, String arg1, int arg2) throws Throwable {
        if (arg2 == 22730) {
            JSObject.getWindow(arg0).eval(arg1);
        }
    }
}

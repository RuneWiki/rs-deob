import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class160 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
    public static final Object method1116(String arg0, Applet arg1, byte arg2) throws Throwable {
        int var3 = -30 / ((arg2 - 15) / 34);
        return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method1117(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == -11998) {
            ;
        }
    }
}

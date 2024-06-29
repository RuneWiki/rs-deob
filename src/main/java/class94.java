import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class94 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static final Object method604(Applet arg0, String arg1, int arg2) throws Throwable {
        return arg2 == 27972 ? JSObject.getWindow(arg0).call(arg1, (Object[]) null) : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
    public static final void method605(String arg0, int arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1 == 28436) {
            ;
        }
    }
}

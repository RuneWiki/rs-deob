import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
    public static final Object method506(Object[] arg0, String arg1, Applet arg2, int arg3) throws Throwable {
        int var4 = -110 / ((9 - arg3) / 40);
        return JSObject.getWindow(arg2).call(arg1, arg0);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
    public static final Object method507(int arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 == 13009 ? JSObject.getWindow(arg2).call(arg1, null) : null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
    public static final void method508(String arg0, Applet arg1, int arg2) throws Throwable {
        if (arg2 == 13859) {
            JSObject.getWindow(arg1).eval(arg0);
        }
    }
}

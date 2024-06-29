import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class89 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;", line = 4)
    public static final Object method661(Object[] arg0, String arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == -1827 ? JSObject.getWindow(arg3).call(arg1, arg0) : (Object) null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V", line = 14)
    public static final void method662(String arg0, boolean arg1, Applet arg2) throws Throwable {
        JSObject.getWindow(arg2).eval(arg0);
        if (arg1) {
            ;
        }
    }
}

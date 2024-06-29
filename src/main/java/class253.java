import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class253 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V", line = 6)
    public static final void method1717(int arg0, Applet arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg1).eval(arg2);
        if (arg0 == 16504) {
            ;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ILjava/applet/Applet;)Ljava/lang/Object;", line = 17)
    public static final Object method1718(String arg0, Object[] arg1, int arg2, Applet arg3) throws Throwable {
        int var4 = 35 % ((-arg2 - 1) / 38);
        return JSObject.getWindow(arg3).call(arg0, arg1);
    }
}

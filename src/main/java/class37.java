import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class37 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 4)
    public static final Object method283(boolean arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        return arg0 ? JSObject.getWindow(arg1).call(arg2, arg3) : (Object) null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 14)
    public static final void method284(Applet arg0, int arg1, String arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg2);
        if (arg1 == 18246) {
            ;
        }
    }
}

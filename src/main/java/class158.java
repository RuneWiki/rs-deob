import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class158 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
    public static final Object method1166(int arg0, Applet arg1, String arg2, Object[] arg3) throws Throwable {
        int var4 = 79 % ((arg0 - 29) / 57);
        return JSObject.getWindow(arg1).call(arg2, arg3);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
    public static final void method1167(String arg0, byte arg1, Applet arg2) throws Throwable {
        int var3 = -25 / ((-arg1 - 24) / 49);
        JSObject.getWindow(arg2).eval(arg0);
    }
}

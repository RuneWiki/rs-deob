import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class507 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V", line = 5)
    public static final void method2881(Applet arg0, int arg1, String arg2) throws Throwable {
        int var3 = -73 % ((arg1 + 17) / 43);
        JSObject.getWindow(arg0).eval(arg2);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;", line = 14)
    public static final Object method2882(String arg0, int arg1, Object[] arg2, Applet arg3) throws Throwable {
        return arg1 == 7013 ? JSObject.getWindow(arg3).call(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;", line = 24)
    public static final Object method2883(Applet arg0, int arg1, String arg2) throws Throwable {
        return arg1 == -4200 ? JSObject.getWindow(arg0).call(arg2, null) : null;
    }
}

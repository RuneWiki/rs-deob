import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class325 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 4)
    public static final void method2276(Applet arg0, String arg1, int arg2) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
        int var3 = 80 % ((arg2 + 18) / 43);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 13)
    public static final Object method2277(int arg0, Applet arg1, String arg2) throws Throwable {
        return arg0 == -21230 ? JSObject.getWindow(arg1).call(arg2, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;ILjava/applet/Applet;)Ljava/lang/Object;", line = 25)
    public static final Object method2278(String arg0, Object[] arg1, int arg2, Applet arg3) throws Throwable {
        return arg2 == 26014 ? JSObject.getWindow(arg3).call(arg0, arg1) : (Object) null;
    }
}

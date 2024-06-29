import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class72 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;B)Ljava/lang/Object;", line = 7)
    public static final Object method469(String arg0, Applet arg1, Object[] arg2, byte arg3) throws Throwable {
        int var4 = 102 % ((72 - arg3) / 44);
        return JSObject.getWindow(arg1).call(arg0, arg2);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;", line = 15)
    public static final Object method470(String arg0, byte arg1, Applet arg2) throws Throwable {
        return arg1 == -122 ? JSObject.getWindow(arg2).call(arg0, (Object[]) null) : (Object) null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V", line = 26)
    public static final void method471(int arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -71 / ((arg0 - 16) / 51);
        JSObject.getWindow(arg2).eval(arg1);
    }
}

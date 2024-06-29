import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class97 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V", line = 6)
    public static final void method737(String arg0, byte arg1, Applet arg2) throws Throwable {
        if (arg1 == 0) {
            JSObject.getWindow(arg2).eval(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", line = 16)
    public static final Object method738(int arg0, Applet arg1, Object[] arg2, String arg3) throws Throwable {
        return arg0 == 15038 ? JSObject.getWindow(arg1).call(arg3, arg2) : (Object) null;
    }
}

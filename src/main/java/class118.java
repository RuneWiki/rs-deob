import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class118 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static final Object method904(Object[] arg0, Applet arg1, String arg2, byte arg3) throws Throwable {
        int var4 = -113 % ((-arg3 - 62) / 48);
        return JSObject.getWindow(arg1).call(arg2, arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
    public static final void method905(byte arg0, String arg1, Applet arg2) throws Throwable {
        int var3 = -52 % ((6 - arg0) / 59);
        JSObject.getWindow(arg2).eval(arg1);
    }
}

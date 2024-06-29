import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class91 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 7)
    public static final void method674(Applet arg0, String arg1, byte arg2) throws Throwable {
        int var3 = 113 / ((arg2 + 29) / 51);
        JSObject.getWindow(arg0).eval(arg1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;", line = 16)
    public static final Object method675(int arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
        int var4 = 44 / ((arg0 - 35) / 35);
        return JSObject.getWindow(arg2).call(arg1, arg3);
    }
}

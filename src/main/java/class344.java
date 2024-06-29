import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class344 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 3)
    public static final Object method2075(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
        return arg3 == -23912 ? JSObject.getWindow(arg1).call(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V", line = 15)
    public static final void method2076(byte arg0, Applet arg1, String arg2) throws Throwable {
        int var3 = 103 / ((arg0 + 57) / 32);
        JSObject.getWindow(arg1).eval(arg2);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;", line = 24)
    public static final Object method2077(boolean arg0, String arg1, Applet arg2) throws Throwable {
        return arg0 ? null : JSObject.getWindow(arg2).call(arg1, null);
    }
}

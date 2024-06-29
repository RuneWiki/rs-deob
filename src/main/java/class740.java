import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class740 extends class189 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lvaa;")
    public class468 field10289;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field10285 = 0;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lla;")
    public static class452 field10286 = null;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method4132(String arg0, int arg1) {
        field10288++;
        if (class332.field4625 == null) {
            return;
        }
        class427.field5990++;
        class519 var2 = class357.method2293(class427.field5994, class47.field551, (byte) -63);
        var2.field7384.method3694(class505.method2988(arg0, 0), -1528071456);
        var2.field7384.method3747((byte) 27, arg0);
        int var3 = 29 / ((65 - arg1) / 32);
        class151.method1027(var2, -116);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILee;)Ljava/lang/String;", line = 27)
    public static final String method4133(int arg0, class675 arg1) {
        field10287++;
        if (arg0 != 32767) {
            field10285 = 22;
        }
        return class20.method127(112, arg1, 32767);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 39)
    public static void method4134(int arg0) {
        if (arg0 != 0) {
            method4134(124);
        }
        field10286 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lvaa;)V", line = 54)
    public class740(class468 arg0) {
        this.field10289 = arg0;
    }
}

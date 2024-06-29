import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class257 extends class341 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4059 = "flash2:";

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Ltn;")
    public static class38 field4058;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 7)
    public static final void method1859(int arg0, String arg1, int arg2) {
        field4060++;
        class34 var3 = class91.method656(arg2, -2, arg0);
        var3.method307(-19063);
        var3.field504 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 35)
    public static void method1860(byte arg0) {
        if (arg0 != 28) {
            method1859(-22, (String) null, -87);
        }
        field4059 = null;
        field4058 = null;
    }
}

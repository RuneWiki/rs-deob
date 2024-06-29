import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class115 {

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "Z")
    public static boolean field1556 = false;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1558 = "";

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
    public static int field1557 = 64;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ldt;B)Lpca;", line = 5)
    public static final class744 method840(class254 arg0, byte arg1) {
        field1560++;
        if (arg1 == 79) {
            class333 var2 = class206.method1349(arg0, 7402);
            int var3 = arg0.method1672(arg1 - 16595);
            int var4 = arg0.method1672(-16516);
            return new class744(var2.field4711, var2.field4715, var2.field4713, var2.field4709, var2.field4708, var2.field4710, var2.field4712, var2.field4706, var2.field4707, var3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lnga;Z)V", line = 28)
    public static final void method841(class539 arg0, boolean arg1) {
        for (int var2 = arg0.field7466; var2 <= arg0.field7455; var2++) {
            for (int var3 = arg0.field7467; var3 <= arg0.field7453; var3++) {
                class194 var4 = class443.field6387[arg0.field2813][var2][var3];
                if (var4 != null) {
                    class511 var5 = var4.field2525;
                    class511 var6 = null;
                    while (var5 != null) {
                        if (var5.field7126 == arg0) {
                            if (var6 == null) {
                                var4.field2525 = var5.field7127;
                            } else {
                                var6.field7127 = var5.field7127;
                            }
                            var5.method2986((byte) 67);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field7127;
                    }
                }
            }
        }
        if (!arg1) {
            class755.method4140(arg0);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)V", line = 83)
    public static void method842(int arg0) {
        field1558 = null;
        int var1 = -36 % ((arg0 + 51) / 53);
    }
}

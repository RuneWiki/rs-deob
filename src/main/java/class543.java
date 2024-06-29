import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class543 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7581 = 0;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Z")
    public static boolean field7584 = true;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public static int[] field7582;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[Z")
    public static boolean[] field7583;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljb;I)V")
    public static final void method3149(class493 arg0, int arg1) {
        if (arg1 == 1) {
            field7585++;
            if (class74.field974 == arg0.field7093) {
                class583.field8210[arg0.field7010] = true;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3150(int arg0, String arg1) {
        field7580++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class705.method3964(arg0, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class261.field3764; var3++) {
            String var4 = class260.field3742[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class705.method3964(0, var4);
            if (var5 != null && var5.equals(var2)) {
                class261.field3764--;
                for (int var6 = var3; var6 < class261.field3764; var6++) {
                    class260.field3742[var6] = class260.field3742[var6 + 1];
                    class608.field8561[var6] = class608.field8561[var6 + 1];
                    class539.field7559[var6] = class539.field7559[var6 + 1];
                    class598.field8404[var6] = class598.field8404[var6 + 1];
                    class69.field853[var6] = class69.field853[var6 + 1];
                }
                class395.field5584++;
                class459.field6465 = class2.field13;
                class519 var7 = class357.method2293(class427.field5994, class366.field5178, (byte) -32);
                var7.field7384.method3694(class505.method2988(arg1, 0), arg0 ^ 0xA4EB7AE0);
                var7.field7384.method3747((byte) 27, arg1);
                class151.method1027(var7, -21);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method3151(int arg0) {
        if (arg0 != -1) {
            field7581 = 18;
        }
        field7582 = null;
        field7583 = null;
    }
}

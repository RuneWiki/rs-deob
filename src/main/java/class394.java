import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class394 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lqfa;")
    public static class98 field5579 = new class98(113, 3);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    public static int[] field5582 = new int[2];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2477(String arg0, byte arg1) {
        field5580++;
        if (arg1 != -96) {
            method2478(68);
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class705.method3964(arg1 + 96, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class215.field2828; var3++) {
            String var4 = class703.field9786[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class705.method3964(0, var4);
            if (var5 != null && var5.equals(var2)) {
                class215.field2828--;
                for (int var6 = var3; var6 < class215.field2828; var6++) {
                    class703.field9786[var6] = class703.field9786[var6 + 1];
                    class479.field6784[var6] = class479.field6784[var6 + 1];
                    class533.field7498[var6] = class533.field7498[var6 + 1];
                    class222.field2895[var6] = class222.field2895[var6 + 1];
                    class692.field9536[var6] = class692.field9536[var6 + 1];
                    class596.field8384[var6] = class596.field8384[var6 + 1];
                }
                class615.field8608++;
                class459.field6465 = class2.field13;
                class519 var7 = class357.method2293(class427.field5994, class98.field1176, (byte) -106);
                var7.field7384.method3694(class505.method2988(arg0, 0), arg1 ^ 0x5B148540);
                var7.field7384.method3747((byte) 27, arg0);
                class151.method1027(var7, -87);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method2478(int arg0) {
        field5579 = null;
        if (arg0 != -15443) {
            method2478(106);
        }
        field5582 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
    public static final int method2479(int arg0, int arg1, int arg2) {
        field5581++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != 3) {
            return 58;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}

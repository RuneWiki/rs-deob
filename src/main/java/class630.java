import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class630 {

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
    public static int[] field8793 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Loa;")
    public static class638 field8790;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public static final void method3497(int arg0, String arg1) {
        field8794++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class200.method1347((byte) -108, arg1);
        if (var2 == null || arg0 != 36067) {
            return;
        }
        for (int var3 = 0; var3 < class372.field5293; var3++) {
            String var4 = class129.field1779[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class200.method1347((byte) -107, var4);
            if (var5 != null && var5.equals(var2)) {
                class372.field5293--;
                for (int var6 = var3; var6 < class372.field5293; var6++) {
                    class129.field1779[var6] = class129.field1779[var6 + 1];
                    class460.field6515[var6] = class460.field6515[var6 + 1];
                    class575.field7734[var6] = class575.field7734[var6 + 1];
                    class653.field9224[var6] = class653.field9224[var6 + 1];
                    class633.field8868[var6] = class633.field8868[var6 + 1];
                    class264.field3748[var6] = class264.field3748[var6 + 1];
                }
                class85.field1168++;
                class200.field2957 = class93.field1231;
                class1.method5(1, class52.field748);
                class288.field4014.method746((byte) -106, class499.method2790(arg1, arg0 ^ 0x8C98));
                class288.field4014.method708(20, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 73)
    public static void method3498(int arg0) {
        if (arg0 == 1) {
            field8793 = null;
            field8790 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 88)
    public static final void method3499(int arg0, int arg1) {
        field8796++;
        class679 var2 = class669.method3708(arg1, arg0, arg1 ^ 0x53A0D3E5);
        var2.method3749(arg1 ^ 0xFFFFFF99);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class467 extends class348 {

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "Lmf;")
    public static class291 field6936 = new class291();

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    public static int field6940 = 0;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field6938 = -1;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(Z)V", line = 4)
    public static void method2795(boolean arg0) {
        field6936 = null;
        if (!arg0) {
            method2797(111, 30);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Llt;I)[Lvg;", line = 16)
    public static final class39[] method2796(class480 arg0, int arg1) {
        ++field6937;
        if (!arg0.method2874(10000)) {
            return new class39[0];
        } else {
            class121 var2 = arg0.method2885(-128);
            while (var2.field2119 == 0) {
                class50.method470(10L, arg1 + -555814247);
            }
            if (~var2.field2119 == -3) {
                return new class39[0];
            } else {
                int[] var3 = (int[]) var2.field2115;
                class39[] var4 = new class39[var3.length >> 2];
                if (arg1 != 555814242) {
                    method2797(-36, -92);
                }
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    class39 var6 = new class39();
                    var4[var5] = var6;
                    var6.field563 = var3[var5 << 2];
                    var6.field562 = var3[(var5 << 2) + 1];
                    var6.field560 = var3[(var5 << 2) - -2];
                    var6.field565 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)V", line = 57)
    public static final void method2797(int arg0, int arg1) {
        ++field6933;
        if (arg1 == 383851490) {
            class18 var2 = class140.method1047(12, arg0, false);
            var2.method123(20983);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(Z)V", line = 72)
    public static final void method2798(boolean arg0) {
        ++field6934;
        class27.field446 = new class328(class491.field7193.method1977(class146.field2452, 125), "", class271.field4116, 1007, -1, 0L, 0, 0, true, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[[I", line = 81)
    public final int[][] method29(int arg0, int arg1) {
        ++field6935;
        int[][] var3 = super.field1589.method859(arg1, -27);
        if (super.field1589.field1884 && this.method2173(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field5174 * super.field5174;
            for (int var8 = 0; class137.field2308 > var8; ++var8) {
                int var9 = super.field5172[var8 % super.field5175 + var7];
                var6[var8] = class490.method2960(4080, var9 << 4);
                var5[var8] = class490.method2960(var9, 65280) >> 4;
                var4[var8] = class490.method2960(var9, 16711680) >> 12;
            }
        }
        return arg0 != 255 ? null : var3;
    }
}

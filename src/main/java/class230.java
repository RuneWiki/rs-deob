import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class230 extends class83 {

    @OriginalMember(owner = "client!gk", name = "nb", descriptor = "Lqj;")
    private static class196 field4088 = class80.method502("level)2", -48);

    @OriginalMember(owner = "client!gk", name = "pb", descriptor = "[I")
    public static int[] field4090 = new int[128];

    @OriginalMember(owner = "client!gk", name = "tb", descriptor = "[I")
    public static int[] field4094 = new int[2];

    @OriginalMember(owner = "client!gk", name = "ub", descriptor = "Lqj;")
    private static class196 field4095 = class80.method502("Loaded fonts", -48);

    @OriginalMember(owner = "client!gk", name = "rb", descriptor = "Lqj;")
    public static class196 field4092 = field4088;

    @OriginalMember(owner = "client!gk", name = "sb", descriptor = "Lqj;")
    public static class196 field4093 = class80.method502("scrollen:", -48);

    @OriginalMember(owner = "client!gk", name = "vb", descriptor = "Lqj;")
    public static class196 field4096 = field4095;

    @OriginalMember(owner = "client!gk", name = "xb", descriptor = "Lqj;")
    public static class196 field4098 = class80.method502(" zuerst von Ihrer Freunde)2Liste(Q", -48);

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!gk", name = "ob", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!gk", name = "wb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!gk", name = "qb", descriptor = "Lnb;")
    public static class95 field4091;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLbk;)Lfg;")
    public static final class225 method1542(int arg0, boolean arg1, class136 arg2) {
        ++field4097;
        if (!arg1) {
            field4088 = null;
        }
        byte[] var3 = arg2.method843(arg0, (byte) -128);
        return var3 == null ? null : new class225(var3);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field4089;
        if (arg0 != 260028743) {
            field4092 = null;
        }
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180 && this.method516(123)) {
            int[] var4 = var3[0];
            int var5 = arg1 % super.field1208 * super.field1208;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class131.field1862 < ~var8; ++var8) {
                int var9 = super.field1210[var8 % super.field1207 + var5];
                var7[var8] = class65.method409(4080, var9 << 4);
                var6[var8] = class65.method409(var9, 65280) >> 4;
                var4[var8] = class65.method409(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)V")
    public static void method1543(boolean arg0) {
        if (arg0) {
            field4096 = null;
        }
        field4098 = null;
        field4095 = null;
        field4092 = null;
        field4093 = null;
        field4088 = null;
        field4091 = null;
        field4090 = null;
        field4094 = null;
        field4096 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lub;Lec;IIIII)V")
    public static final void method1544(class43 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4087;
        if (arg0 != null) {
            if (arg3 == 1932722700) {
                int var7 = class18.field216 - -class249.field4408 & 2047;
                int var8 = Math.max(arg1.field3085 / 2, arg1.field2997 / 2) + 10;
                int var9 = arg4 * arg4 + arg5 * arg5;
                if (~var9 >= ~(var8 * var8)) {
                    int var10 = class15.field170[var7];
                    int var11 = var10 * 256 / (class90.field1325 - -256);
                    int var12 = class15.field172[var7];
                    int var13 = var12 * 256 / (class90.field1325 - -256);
                    int var14 = arg4 * var11 + arg5 * var13 >> 16;
                    int var15 = arg4 * var13 + -(arg5 * var11) >> 16;
                    ((class233) arg0).method1569(arg1.field3085 / 2 + arg2 + var14 + -(arg0.field499 / 2), arg1.field2997 / 2 + -(arg0.field489 / 2) + -var15 + arg6, arg1.field3007, arg1.field3060);
                }
            }
        }
    }
}

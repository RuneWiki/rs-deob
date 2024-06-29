import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class140 extends class105 {

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    private int field2750 = 32768;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Leh;")
    private static class47 field2732 = class195.method1282((byte) -4, "Please try again)3");

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "Leh;")
    public static class47 field2744 = field2732;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    public static int field2740 = -1;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "Leh;")
    private static class47 field2752 = class195.method1282((byte) -4, "Please try using a different world)3");

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "Leh;")
    public static class47 field2735 = field2752;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "Leh;")
    public static class47 field2747 = field2752;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "Leh;")
    public static class47 field2738 = field2752;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Leh;")
    public static class47 field2736 = field2752;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "Leh;")
    public static class47 field2742 = field2752;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "Leh;")
    public static class47 field2746 = field2752;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lig;")
    public static class79 field2743;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lah;")
    public static class9 field2751;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "Z")
    public static boolean field2733;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Leh;B)V")
    public static final void method1012(class47 arg0, byte arg1) {
        ++field2749;
        if (class40.field807 != null) {
            int var2 = 0;
            long var3 = arg0.method399(102);
            if (var3 != 0L) {
                while (var2 < class40.field807.length && class40.field807[var2].field2283 != var3) {
                    ++var2;
                }
                if (arg1 != 98) {
                    method1014(107, (class61) null, 53, -8, (class50) null, 114, -9);
                }
                if (class40.field807.length > var2 && class40.field807[var2] != null) {
                    class60.field1174.method657(28182, 172);
                    class60.field1174.method600(32601, class40.field807[var2].field2283);
                    ++class119.field2403;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2734;
        int[] var3 = super.field2192.method336(-90, arg0);
        if (arg1 <= 78) {
            method1012((class47) null, (byte) 93);
        }
        if (super.field2192.field770) {
            int[] var4 = this.method851(1, true, arg0);
            int[] var5 = this.method851(2, true, arg0);
            for (int var6 = 0; class149.field2928 > var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2750 >> 12;
                int var9 = class72.field1551[var7] * var8 >> 12;
                int var10 = var6 - -(var9 >> 12) & class121.field2453;
                int var11 = class192.field3717[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg0 & class122.field2468;
                int[] var13 = this.method851(0, true, var12);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class140() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
    public static void method1013(boolean arg0) {
        field2732 = null;
        if (!arg0) {
            field2744 = null;
            field2743 = null;
            field2735 = null;
            field2736 = null;
            field2751 = null;
            field2742 = null;
            field2747 = null;
            field2746 = null;
            field2752 = null;
            field2738 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            method1013(true);
        }
        ++field2741;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[] var4 = this.method851(1, true, arg0);
            int[] var5 = this.method851(2, true, arg0);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; class149.field2928 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2750 >> 12;
                int var12 = class72.field1551[var10] * var11 >> 12;
                int var13 = class192.field3717[var10] * var11 >> 12;
                int var14 = arg0 - -(var13 >> 12) & class122.field2468;
                int var15 = class121.field2453 & (var12 >> 12) + var9;
                int[][] var16 = this.method854(0, (byte) 112, var14);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 == -256) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field2179 = ~arg1.method604((byte) 33) == -2;
                }
            } else {
                this.field2750 = arg1.method569(26496) << 4;
            }
            ++field2739;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILgf;IILfb;II)V")
    public static final void method1014(int arg0, class61 arg1, int arg2, int arg3, class50 arg4, int arg5, int arg6) {
        ++field2731;
        if (arg4 != null) {
            int var7 = 97 % ((arg0 - -22) / 57);
            int var8 = 2047 & class195.field3793 + class160.field3116;
            int var9 = 10 + Math.max(arg1.field1187 / 2, arg1.field1303 / 2);
            int var10 = arg2 * arg2 + arg6 * arg6;
            if (~(var9 * var9) <= ~var10) {
                int var11 = class17.field350[var8];
                int var12 = class17.field341[var8];
                int var13 = var11 * 256 / (class60.field1167 + 256);
                int var14 = var12 * 256 / (class60.field1167 + 256);
                int var15 = arg2 * var14 + arg6 * var13 >> 16;
                int var16 = arg2 * var13 + -(arg6 * var14) >> 16;
                arg4.method442(arg1.field1187 / 2 + arg5 + var15 + -(arg4.field980 / 2), arg1.field1303 / 2 + -var16 + arg3 - arg4.field979 / 2, arg1.field1285, arg1.field1296);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        class185.method1227((byte) -75);
        ++field2753;
        if (arg0 != -1) {
            field2744 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class587 extends class642 {

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    private int field8514 = 32768;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lvg;")
    public static class622 field8513 = new class622(67, -2);

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Lvg;")
    public static class622 field8517 = new class622(107, 8);

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lefa;")
    public static class322 field8519 = new class322(16);

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Lmv;")
    public static class295 field8518;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field8516;
        if (arg1 != -9) {
            this.field8514 = 89;
        }
        int[] var3 = super.field9216.method1185(arg0, -114);
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 108, arg0, 1);
            int[] var5 = this.method3658((byte) 125, arg0, 2);
            for (int var6 = 0; ~var6 > ~class338.field4909; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field8514 >> 12;
                int var9 = class641.field9196[var7] * var8 >> 12;
                int var10 = class229.field3042[var7] * var8 >> 12;
                int var11 = class412.field6121 & (var9 >> 12) + var6;
                int var12 = arg0 - -(var10 >> 12) & class553.field8133;
                int[] var13 = this.method3658((byte) 62, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILgk;)Lvt;")
    public static final class683 method3352(int arg0, class540 arg1) {
        if (arg0 != 255) {
            method3353(false);
        }
        ++field8511;
        class251 var2 = class295.method1842(arg1, 120);
        int var3 = arg1.method3129(arg0 + -180);
        return new class683(var2.field2330, var2.field2336, var2.field2334, var2.field2335, var2.field2337, var2.field2332, var2.field2338, var2.field2333, var2.field2329, var2.field3298, var2.field3289, var2.field3288, var2.field3287, var2.field3291, var2.field3290, var3);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class587() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        class531.method3078(false);
        ++field8510;
        if (arg0 != 6276) {
            field8513 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field9207 = arg1.method3115(29871) == 1;
            }
        } else {
            this.field8514 = arg1.method3169(26488) << 4;
        }
        ++field8512;
        if (arg2 <= 29) {
            field8521 = 56;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field8515;
        if (arg0 != 21402) {
            this.method1(8, (class540) null, (byte) -82);
        }
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (super.field9211.field2131) {
            int[] var4 = this.method3658((byte) 62, arg1, 1);
            int[] var5 = this.method3658((byte) 123, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class338.field4909 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field8514 >> 12;
                int var12 = class641.field9196[var10] * var11 >> 12;
                int var13 = class229.field3042[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class412.field6121;
                int var15 = (var13 >> 12) + arg1 & class553.field8133;
                int[][] var16 = this.method3657(var15, true, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method3353(boolean arg0) {
        field8518 = null;
        field8513 = null;
        field8517 = null;
        field8519 = null;
        if (!arg0) {
            field8517 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class91 extends class634 {

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "Ldh;")
    public static class320 field942 = new class320(91, 2);

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field941;
        if (arg0 > -55) {
            return null;
        } else {
            int[] var3 = super.field9114.method1858(100, arg1);
            if (super.field9114.field3897) {
                int[] var4 = this.method3641(arg1, 20604, 0);
                int[] var5 = this.method3641(arg1, 20604, 1);
                int[] var6 = this.method3641(arg1, 20604, 2);
                for (int var7 = 0; var7 < class635.field9139; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)V")
    public static void method618(byte arg0) {
        int var1 = -82 % ((arg0 - 44) / 37);
        field942 = null;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class91() {
        super(3, false);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
    public static final void method619(int arg0, int arg1) {
        int var2 = -38 / ((-1 - arg1) / 57);
        ++field945;
        class47 var3 = class258.method1546(6, arg0, (byte) 121);
        var3.method274(false);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 == 0) {
            super.field9121 = ~arg1.method1423(-125) == -2;
        }
        ++field943;
        if (arg2) {
            this.method7((byte) -53, -71);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field944;
        int var3 = 36 / ((arg0 - -56) / 53);
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var5 = this.method3641(arg1, 20604, 2);
            int[][] var6 = this.method3642(0, arg1, true);
            int[][] var7 = this.method3642(1, arg1, true);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class635.field9139 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (var18 != 4096) {
                    if (var18 != 0) {
                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                        var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                    } else {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }
}

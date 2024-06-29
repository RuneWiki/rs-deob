import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class129 extends class5 {

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "[I")
    public static int[] field1611 = new int[5];

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method686(boolean arg0) {
        field1611 = null;
        if (arg0) {
            field1611 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field120 = arg1.method3501(-9268) == 1;
        }
        if (arg0 != 1) {
            method686(true);
        }
        ++field1609;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field1612;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -7 % ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 0);
            int[] var6 = this.method49(arg1, false, 1);
            int[] var7 = this.method49(arg1, false, 2);
            for (int var8 = 0; class657.field9287 > var8; ++var8) {
                int var9 = var7[var8];
                if (~var9 == -4097) {
                    var3[var8] = var5[var8];
                } else if (var9 != 0) {
                    var3[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                } else {
                    var3[var8] = var6[var8];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class129() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field1610;
        int[][] var3 = super.field135.method2706(arg0, -84);
        if (super.field135.field6667) {
            int[] var4 = this.method49(arg0, !arg1, 2);
            int[][] var5 = this.method45(0, arg0, 0);
            int[][] var6 = this.method45(1, arg0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class657.field9287; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (!arg1) {
            field1611 = null;
        }
        return var3;
    }
}

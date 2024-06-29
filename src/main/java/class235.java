import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class235 extends class354 {

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lot;")
    public static class424 field3332;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lia;III[Z)V")
    public static final void method1562(class423 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class71.field988 != class306.field4447) {
            int var5 = class414.field6317[arg1].method218(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class23 var7 = class414.field6317[var6];
                    if (var7 != null) {
                        var7.method209(arg0, arg2, var5 - var7.method218(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        if (arg0 != -87) {
            field3329 = 116;
        }
        field3332 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3326;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 111, 0, arg1);
            int[] var5 = this.method2275((byte) 111, 1, arg1);
            int[] var6 = this.method2275((byte) 85, 2, arg1);
            for (int var7 = 0; ~class531.field7814 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return arg0 >= -74 ? null : var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field3327;
        int[][] var3 = super.field5474.method2414((byte) -83, arg0);
        if (super.field5474.field5870) {
            int[] var4 = this.method2275((byte) 96, 2, arg0);
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[][] var6 = this.method2274((byte) 84, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class531.field7814 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        int var19 = 102 / ((arg1 - 48) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class235() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            if (arg1 == 0) {
                super.field5466 = ~arg0.method1087(false) == -2;
            }
            ++field3328;
        }
    }
}

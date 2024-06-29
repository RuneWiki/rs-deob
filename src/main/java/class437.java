import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class437 extends class243 {

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "Z")
    public static boolean field6131 = true;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field6127;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[] var4 = this.method1462(arg1, 2, 0);
            int[][] var5 = this.method1457(arg1, 24431, 0);
            int[][] var6 = this.method1457(arg1, 24431, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class687.field9628 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg0 > -76) {
            field6131 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method1(92, (class611) null, (byte) -19);
        }
        ++field6128;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, 0);
            int[] var5 = this.method1462(arg1, 1, 0);
            int[] var6 = this.method1462(arg1, 2, 0);
            for (int var7 = 0; class687.field9628 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 != 0) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            field6131 = false;
        }
        ++field6129;
        if (~arg0 == -1) {
            super.field3159 = ~arg1.method3428((byte) -115) == -2;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
    public class437() {
        super(3, false);
    }
}

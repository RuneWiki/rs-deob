import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class275 extends class62 {

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    private int field3861 = 1;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    private int field3860 = 1;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "[I")
    public static int[] field3862 = new int[25];

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        if (arg1 != 656024161) {
            return null;
        } else {
            ++field3859;
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                int var4 = this.field3860 + this.field3860 - -1;
                int var5 = 65536 / var4;
                int var6 = this.field3861 + this.field3861 - -1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = arg0 - this.field3860; ~(this.field3860 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method408(class285.field3989 & var9, 0, (byte) -69);
                    int[] var14 = new int[class438.field5847];
                    int var15 = 0;
                    for (int var16 = -this.field3861; var16 <= this.field3861; ++var16) {
                        var15 += var13[class410.field5604 & var16];
                    }
                    int var17 = 0;
                    while (var17 < class438.field5847) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class410.field5604 & var17 - this.field3861];
                        ++var17;
                        var15 = var13[this.field3861 + var17 & class410.field5604] + var18;
                    }
                    var8[this.field3860 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; var10 < class438.field5847; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field3863;
        if (arg1 == -1) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field788 = arg0.method1032((byte) -33) == 1;
                    }
                } else {
                    this.field3860 = arg0.method1032((byte) -33);
                }
            } else {
                this.field3861 = arg0.method1032((byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)V")
    public static void method1722(int arg0) {
        if (arg0 != 632114384) {
            method1722(-86);
        }
        field3862 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field3858;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int var4 = this.field3860 + 1 + this.field3860;
            int var5 = 65536 / var4;
            int var6 = this.field3861 + this.field3861 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field3860; ~(this.field3860 + arg0) <= ~var9; ++var9) {
                int[][] var19 = this.method407(0, (byte) 41, var9 & class285.field3989);
                int[][] var20 = new int[3][class438.field5847];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field3861; this.field3861 >= var27; ++var27) {
                    int var37 = var27 & class410.field5604;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class438.field5847) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class410.field5604 & var31 - this.field3861;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = this.field3861 + var31 & class410.field5604;
                    var23 = var26[var36] + var35;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[-arg0 + this.field3860 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class438.field5847 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg1 > -20) {
            method1722(-14);
        }
        return var3;
    }
}

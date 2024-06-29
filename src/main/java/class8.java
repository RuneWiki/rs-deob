import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class185 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field115 = 1;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    private int field121 = 1;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIBII)V")
    public static final void method38(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field116;
        if (arg3 <= 109) {
            method40(67, 100, 33, 39, -80);
        }
        for (int var6 = arg2; arg0 >= var6; ++var6) {
            class64.method429(class23.field284[var6], arg4, (byte) 104, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            this.field115 = 3;
        }
        ++field119;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int var4 = this.field121 + this.field121 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field115 + this.field115 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field121 + arg1; this.field121 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method1152(false, 0, class10.field133 & var9);
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = new int[3][class174.field2648];
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field115; this.field115 >= var27; ++var27) {
                    int var37 = var27 & class53.field873;
                    var20 += var23[var37];
                    var21 += var25[var37];
                    var24 += var26[var37];
                }
                int[] var28 = var22[0];
                int[] var29 = var22[2];
                int[] var30 = var22[1];
                int var31 = 0;
                while (~class174.field2648 < ~var31) {
                    var28[var31] = var7 * var20 >> 16;
                    var30[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var24 >> 16;
                    int var32 = class53.field873 & -this.field115 + var31;
                    ++var31;
                    int var33 = var21 - var25[var32];
                    int var34 = var20 - var23[var32];
                    int var35 = var24 - var26[var32];
                    int var36 = class53.field873 & this.field115 + var31;
                    var20 = var23[var36] + var34;
                    var24 = var26[var36] + var35;
                    var21 = var25[var36] + var33;
                }
                var8[var9 - arg1 + this.field121] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class174.field2648 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class8() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
    public static final void method40(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field118;
        for (int var5 = arg0; var5 < class256.field3900; ++var5) {
            if (class160.field2460[var5] + class101.field1593[var5] > arg1 && class101.field1593[var5] < arg1 + arg2 && ~(class32.field471[var5] + class283.field4236[var5]) < ~arg4 && ~(arg4 - -arg3) < ~class283.field4236[var5]) {
                class7.field105[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field123;
        if (arg1 <= 70) {
            this.field121 = -71;
        }
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = this.field121 + this.field121 + 1;
            int var5 = this.field115 + 1 + this.field115;
            int var6 = 65536 / var5;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var4;
            for (int var9 = arg0 - this.field121; var9 <= arg0 - -this.field121; ++var9) {
                int[] var13 = this.method1146((byte) 127, class10.field133 & var9, 0);
                int var14 = 0;
                for (int var15 = -this.field115; this.field115 >= var15; ++var15) {
                    var14 += var13[class53.field873 & var15];
                }
                int[] var16 = new int[class174.field2648];
                int var17 = 0;
                while (~class174.field2648 < ~var17) {
                    var16[var17] = var6 * var14 >> 16;
                    int var18 = var14 - var13[-this.field115 + var17 & class53.field873];
                    ++var17;
                    var14 = var13[this.field115 + var17 & class53.field873] + var18;
                }
                var7[-arg0 + this.field121 + var9] = var16;
            }
            for (int var10 = 0; ~class174.field2648 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var8 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field122;
        if (arg2 == -6357) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field2814 = ~arg1.method1593((byte) 27) == -2;
                    }
                } else {
                    this.field121 = arg1.method1593((byte) 27);
                }
            } else {
                this.field115 = arg1.method1593((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)I")
    public static final int method41(byte arg0) {
        ++field120;
        if (arg0 >= -121) {
            method38(46, 10, 84, (byte) 65, -43, 116);
        }
        if (class71.field1125) {
            return 0;
        } else if (!class266.method1772(102)) {
            return 1;
        } else {
            return class63.field996 ? 2 : 1;
        }
    }
}

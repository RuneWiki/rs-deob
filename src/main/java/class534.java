import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class534 extends class646 {

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    private int field7853 = 1;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    private int field7854 = 1;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "Lvo;")
    public static class345 field7849;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "[I")
    public static int[] field7850;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V", line = 7)
    public static void method3133(int arg0) {
        field7849 = null;
        field7850 = null;
        if (arg0 >= -20) {
            method3135(84, -102, 65, -3, -14, false, 26, 101, 120);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lek;IB)V", line = 19)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field7855;
        if (arg2 > 7) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field9160 = ~arg0.method2705(-84) == -2;
                    }
                } else {
                    this.field7854 = arg0.method2705(-37);
                }
            } else {
                this.field7853 = arg0.method2705(-54);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[[I", line = 64)
    public final int[][] method298(int arg0, int arg1) {
        if (arg0 != -12424) {
            return null;
        } else {
            ++field7848;
            int[][] var3 = super.field9164.method1002(94, arg1);
            if (super.field9164.field2082) {
                int var4 = this.field7854 + this.field7854 - -1;
                int var5 = 65536 / var4;
                int var6 = this.field7853 - -this.field7853 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field7854 + arg1; this.field7854 + arg1 >= var9; ++var9) {
                    int[][] var19 = this.method3626(arg0 ^ -12486, class453.field6525 & var9, 0);
                    int[][] var20 = new int[3][class89.field1330];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field7853; var27 <= this.field7853; ++var27) {
                        int var37 = var27 & class156.field2572;
                        var22 += var25[var37];
                        var21 += var24[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class89.field1330 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class156.field2572 & var31 - this.field7853;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = this.field7853 + var31 & class156.field2572;
                        var21 = var24[var36] + var33;
                        var22 = var25[var36] + var34;
                        var23 = var26[var36] + var35;
                    }
                    var8[var9 - -this.field7854 + -arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class89.field1330 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 202)
    public class534() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IB)[I", line = 208)
    public final int[] method424(int arg0, byte arg1) {
        ++field7851;
        int[] var3 = super.field9156.method2193(arg1 + 1389, arg0);
        if (arg1 != -120) {
            field7849 = null;
        }
        if (super.field9156.field5075) {
            int var4 = this.field7854 + this.field7854 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7853 + this.field7853 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field7854; ~var9 >= ~(this.field7854 + arg0); ++var9) {
                int[] var13 = this.method3628(false, 0, class453.field6525 & var9);
                int[] var14 = new int[class89.field1330];
                int var15 = 0;
                for (int var16 = -this.field7853; var16 <= this.field7853; ++var16) {
                    var15 += var13[var16 & class156.field2572];
                }
                int var17 = 0;
                while (~class89.field1330 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field7853 & class156.field2572];
                    ++var17;
                    var15 = var13[this.field7853 + var17 & class156.field2572] + var18;
                }
                var8[this.field7854 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; var10 < class89.field1330; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V", line = 296)
    public static final void method3134(int arg0) {
        if (arg0 != -10363) {
            field7850 = null;
        }
        ++field7852;
        class250.method1601(arg0 ^ 10362);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIZIII)Z", line = 309)
    public static final boolean method3135(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field7856;
        int var9 = class103.field1708.field2454[0];
        int var10 = class103.field1708.field2459[0];
        if (var9 >= 0 && class430.field6136 > var9 && ~var10 <= -1 && ~var10 > ~class580.field8504) {
            if (~arg8 <= -1 && ~class430.field6136 < ~arg8 && arg0 >= 0 && class580.field8504 > arg0) {
                int var11 = 93 % (-arg3 / 62);
                int var12 = class582.method3367(class45.field609[class103.field1708.field3158], arg7, arg5, arg6, var10, arg4, class237.field3505, arg0, 127, arg8, arg1, class103.field1708.method1108(98), arg2, var9, class405.field5811);
                if (~var12 > -2) {
                    return false;
                } else {
                    class400.field5777 = class237.field3505[var12 - 1];
                    class202.field3126 = class405.field5811[var12 + -1];
                    class153.field2547 = false;
                    class74.method600(18);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

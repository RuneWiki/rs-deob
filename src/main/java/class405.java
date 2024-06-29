import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class405 extends class573 {

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
    private int field5853 = 1;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
    private int field5857 = 1;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field5850 = -1;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "Lom;")
    public static class344 field5852;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field5856;
        if (arg0 > -116) {
            return null;
        } else {
            int[][] var3 = super.field8320.method1504(arg1, -2);
            if (super.field8320.field3295) {
                int var4 = this.field5853 + this.field5853 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field5857 + this.field5857 - -1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field5853 + arg1; ~(this.field5853 + arg1) <= ~var9; ++var9) {
                    int[][] var19 = this.method3293(0, 127, var9 & class189.field3019);
                    int[][] var20 = new int[3][class540.field7555];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field5857; ~var27 >= ~this.field5857; ++var27) {
                        int var37 = class591.field8492 & var27;
                        var21 += var24[var37];
                        var22 += var25[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class540.field7555 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field5857 + var31 & class591.field8492;
                        int var33 = var23 - var26[var32];
                        ++var31;
                        int var34 = var21 - var24[var32];
                        int var35 = var22 - var25[var32];
                        int var36 = this.field5857 + var31 & class591.field8492;
                        var21 = var24[var36] + var34;
                        var23 = var26[var36] + var33;
                        var22 = var25[var36] + var35;
                    }
                    var8[-arg1 + this.field5853 + var9] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; class540.field7555 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)I")
    public static final int method2469(byte arg0, int arg1) {
        ++field5851;
        if (arg0 != 39) {
            return 55;
        } else if (~arg1 > -97) {
            return 0;
        } else {
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
    public class405() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)V")
    public static void method2470(byte arg0) {
        field5852 = null;
        if (arg0 != -36) {
            method2470((byte) -21);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field5849;
        int[] var3 = super.field8321.method3164(arg0, -110);
        if (super.field8321.field7825) {
            int var4 = this.field5853 + this.field5853 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5857 + 1 + this.field5857;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5853 + arg0; ~var9 >= ~(this.field5853 + arg0); ++var9) {
                int[] var13 = this.method3292(0, 0, class189.field3019 & var9);
                int[] var14 = new int[class540.field7555];
                int var15 = 0;
                for (int var16 = -this.field5857; ~var16 >= ~this.field5857; ++var16) {
                    var15 += var13[class591.field8492 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class540.field7555) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class591.field8492 & -this.field5857 + var17];
                    ++var17;
                    var15 = var13[class591.field8492 & this.field5857 + var17] + var18;
                }
                var8[this.field5853 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~class540.field7555 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != 1) {
            field5848 = 73;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field5854;
        if (arg2 == 3) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field8334 = arg0.method732(-559537960) == 1;
                    }
                } else {
                    this.field5853 = arg0.method732(-559537960);
                }
            } else {
                this.field5857 = arg0.method732(-559537960);
            }
        }
    }
}

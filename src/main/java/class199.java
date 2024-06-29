import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class199 extends class214 {

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    private int field2848 = 1;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    private int field2852 = 1;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Lfn;")
    public static class52 field2846 = new class52(20, 2);

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "[Lwj;")
    public static class334[] field2849 = new class334[0];

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Ltm;")
    public static class112 field2853 = new class112("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
    public static int[] field2855 = new int[32];

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Llk;II)V", line = 4)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field2845;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3032 = ~arg0.method2503(true) == -2;
                }
            } else {
                this.field2848 = arg0.method2503(true);
            }
        } else {
            this.field2852 = arg0.method2503(true);
        }
        if (arg1 > -114) {
            method1266(3, 43, 73);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 49)
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 55)
    public static void method1264(int arg0) {
        field2855 = null;
        if (arg0 >= 24) {
            field2846 = null;
            field2853 = null;
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[[I", line = 75)
    public final int[][] method11(int arg0, byte arg1) {
        ++field2854;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            return null;
        } else {
            if (super.field3030.field6644) {
                int var4 = this.field2848 + this.field2848 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field2852 + this.field2852 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = arg0 - this.field2848; ~(this.field2848 + arg0) <= ~var9; ++var9) {
                    int[][] var19 = this.method1354(0, class183.field2659 & var9, (byte) 23);
                    int[][] var20 = new int[3][class399.field5585];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field2852; this.field2852 >= var27; ++var27) {
                        int var37 = class467.field6551 & var27;
                        var23 += var26[var37];
                        var22 += var25[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~class399.field5585 < ~var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field2852 + var31 & class467.field6551;
                        int var33 = var23 - var26[var32];
                        int var34 = var21 - var24[var32];
                        int var35 = var22 - var25[var32];
                        ++var31;
                        int var36 = this.field2852 + var31 & class467.field6551;
                        var22 = var25[var36] + var35;
                        var23 = var26[var36] + var33;
                        var21 = var24[var36] + var34;
                    }
                    var8[-arg0 + var9 - -this.field2848] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class399.field5585; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
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

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lmr;III[Z)Z", line = 209)
    public static final boolean method1265(class173 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class8.field166 != class317.field4306) {
            int var6 = class366.field5215[arg1].method701(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class269 var8 = class366.field5215[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method701(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method700(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method717(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I", line = 246)
    public final int[] method14(byte arg0, int arg1) {
        ++field2844;
        if (arg0 != 123) {
            this.field2848 = -82;
        }
        int[] var3 = super.field3024.method2585(arg1, arg0 + -123);
        if (super.field3024.field6135) {
            int var4 = this.field2848 + this.field2848 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2852 + 1 + this.field2852;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field2848; var9 <= arg1 - -this.field2848; ++var9) {
                int[] var13 = this.method1352(class183.field2659 & var9, 0, -124);
                int[] var14 = new int[class399.field5585];
                int var15 = 0;
                for (int var16 = -this.field2852; ~var16 >= ~this.field2852; ++var16) {
                    var15 += var13[class467.field6551 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class399.field5585) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2852 + var17 & class467.field6551];
                    ++var17;
                    var15 = var13[class467.field6551 & this.field2852 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field2848] = var14;
            }
            for (int var10 = 0; ~var10 > ~class399.field5585; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V", line = 339)
    public static final void method1266(int arg0, int arg1, int arg2) {
        ++field2851;
        class38 var3 = class231.field3256[arg0][arg1];
        if (arg2 != 0) {
            field2855 = null;
        }
        if (var3 != null) {
            class42.field720 = var3.field652;
            class372.field5272 = var3.field650;
            class479.field6784 = var3.field653;
        }
        class349.method2093((byte) -102);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class314 extends class134 {

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "Lada;")
    private class163 field3912;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "Lnv;")
    private class417 field3898;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Leo;")
    private class296 field3907;

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
    private int field3915;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "[[F")
    private float[][] field3923;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "[[F")
    private float[][] field3900;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "[[F")
    private float[][] field3908;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    private int field3916;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "Lpw;")
    private class704 field3905;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Lid;")
    private class583 field3901;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "Lpw;")
    private class704 field3909;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Ltv;")
    private class558 field3902;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "Lig;")
    private class244 field3903;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "Lbs;")
    private class685 field3911;

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "Lpfa;")
    private class295 field3925;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "Ldh;")
    public static class320 field3904 = new class320(18, 0);

    @OriginalMember(owner = "client!iw", name = "D", descriptor = "Lpia;")
    public static class94 field3918 = new class94(64, -1);

    @OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "F")
    public static float field3919;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!iw", name = "G", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!iw", name = "H", descriptor = "Lml;")
    public static class387 field3922;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIBI[[Z)V")
    public final void method1867(int arg0, int arg1, byte arg2, int arg3, boolean[][] arg4) {
        field3899++;
        if (this.field3902 == null || this.field3917 > (arg1 + arg3) || this.field3913 < arg3 - arg1 || arg0 + arg1 < this.field3915 || this.field3914 < (arg0 - arg1)) {
            return;
        }
        for (int var6 = this.field3915; var6 <= this.field3914; var6++) {
            for (int var8 = this.field3917; var8 <= this.field3913; var8++) {
                int var9 = var8 - arg3;
                int var10 = var6 - arg0;
                if (-arg1 < var9 && arg1 > var9 && var10 > -arg1 && arg1 > var10 && arg4[arg1 + var9][var10 + arg1]) {
                    this.field3898.method2581((byte) -59, (int) (this.field3912.method1011(24617) * 255.0F) << 24);
                    this.field3898.method2589(this.field3909, null, null, false, this.field3905);
                    this.field3898.method2593(4, this.field3916, this.field3902, (byte) -9, 0);
                    return;
                }
            }
        }
        int var7 = 4 / ((arg2 + 55) / 57);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIZII)V")
    private final void method1868(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3910++;
        long var8 = -1L;
        int var10 = (arg1 << this.field3907.field3409) + arg6;
        int var11 = (arg3 << this.field3907.field3409) + arg2;
        int var12 = this.field3907.method1675(var11, var10, 65286);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class134 var13 = this.field3925.method1754(false, var8);
            if (var13 != null) {
                this.method1869(((class595) var13).field8395, 0);
                return;
            }
        }
        short var14 = (short) (this.field3906++);
        if (var8 != -1L) {
            this.field3925.method1751(new class595(var14), 3970, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field3923[arg5][arg0];
            var16 = this.field3900[arg5][arg0];
            var17 = this.field3908[arg5][arg0];
        } else if (this.field3907.field3413 == arg6 && arg2 == 0) {
            var16 = this.field3900[arg5 + 1][arg0];
            var15 = this.field3923[arg5 + 1][arg0];
            var17 = this.field3908[arg5 + 1][arg0];
        } else if (this.field3907.field3413 == arg6 && this.field3907.field3413 == arg2) {
            var17 = this.field3908[arg5 + 1][arg0 + 1];
            var16 = this.field3900[arg5 + 1][arg0 + 1];
            var15 = this.field3923[arg5 + 1][arg0 + 1];
        } else if (arg6 == 0 && this.field3907.field3413 == arg2) {
            var17 = this.field3908[arg5][arg0 + 1];
            var15 = this.field3923[arg5][arg0 + 1];
            var16 = this.field3900[arg5][arg0 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field3907.field3413;
            float var19 = (float) arg2 / (float) this.field3907.field3413;
            float var20 = this.field3900[arg5][arg0];
            float var21 = this.field3908[arg5][arg0];
            float var22 = this.field3923[arg5][arg0];
            float var23 = this.field3900[arg5 + 1][arg0];
            float var24 = this.field3908[arg5 + 1][arg0];
            float var25 = (this.field3908[arg5][arg0 + 1] - var21) * var18 + var21;
            float var26 = (this.field3923[arg5][arg0 + 1] - var22) * var18 + var22;
            float var27 = this.field3923[arg5 + 1][arg0];
            float var28 = (this.field3908[arg5 + 1][arg0 + 1] - var24) * var18 + var24;
            float var29 = (this.field3900[arg5 + 1][arg0 + 1] - var23) * var18 + var23;
            float var30 = (this.field3900[arg5][arg0 + 1] - var20) * var18 + var20;
            float var31 = (this.field3923[arg5 + 1][arg0 + 1] - var27) * var18 + var27;
            var16 = (var29 - var30) * var19 + var30;
            var17 = (var28 - var25) * var19 + var25;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field3912.method1012((byte) 127) - var10);
        float var33 = (float) (this.field3912.method1006(31079) - var12);
        float var34 = (float) (this.field3912.method1013(9179409) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3912.method1007(-128);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3912.method1010(-5636);
        int var45 = (int) ((float) ((var44 & 0xFF2C6A) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF1C) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        if (!arg4) {
            return;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3898.field5992) {
            this.field3911.method3878((byte) 69, (float) var10);
            this.field3911.method3878((byte) 69, (float) var12);
            this.field3911.method3878((byte) 69, (float) var11);
        } else {
            this.field3911.method3880((float) var10, 24);
            this.field3911.method3880((float) var12, 49);
            this.field3911.method3880((float) var11, -124);
        }
        this.field3911.method1460(var45, 24710);
        this.field3911.method1460(var46, 24710);
        this.field3911.method1460(var47, 24710);
        this.field3911.method1460(255, 24710);
        this.method1869(var14, 0);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(SI)V")
    private final void method1869(short arg0, int arg1) {
        if (arg1 != 0) {
            this.method1867(34, -64, (byte) -63, 73, null);
        }
        if (this.field3898.field5992) {
            this.field3903.method1446(arg0, true);
        } else {
            this.field3903.method1432(arg0, (byte) -124);
        }
        field3921++;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field3904 = null;
        if (arg0 < 96) {
            method1870((byte) 96);
        }
        field3918 = null;
        field3922 = null;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lnv;Leo;Lada;[I)V")
    public class314(class417 arg0, class296 arg1, class163 arg2, int[] arg3) {
        this.field3912 = arg2;
        this.field3898 = arg0;
        this.field3907 = arg1;
        int var5 = this.field3912.method1007(109) - (arg1.field3413 >> 1);
        this.field3917 = this.field3912.method1012((byte) 127) - var5 >> arg1.field3409;
        this.field3913 = var5 + this.field3912.method1012((byte) 127) >> arg1.field3409;
        this.field3915 = this.field3912.method1013(9179409) - var5 >> arg1.field3409;
        this.field3914 = this.field3912.method1013(9179409) + var5 >> arg1.field3409;
        int var6 = this.field3913 + 1 - this.field3917;
        int var7 = this.field3914 + 1 - this.field3915;
        this.field3923 = new float[var6 + 1][var7 + 1];
        this.field3900 = new float[var6 + 1][var7 + 1];
        this.field3908 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field3915 + var8;
            if (var25 > 0 && this.field3907.field3408 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field3917 + var26;
                    if (var27 > 0 && this.field3907.field3410 - 1 > var27) {
                        int var28 = arg1.method1671(var25, var27 + 1, (byte) -98) - arg1.method1671(var25, var27 - 1, (byte) -93);
                        int var29 = arg1.method1671(var25 + 1, var27, (byte) 67) - arg1.method1671(var25 - 1, var27, (byte) -86);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field3900[var26][var8] = (float) var28 * var30;
                        this.field3908[var26][var8] = var30 * -256.0F;
                        this.field3923[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field3915; var10 <= this.field3914; var10++) {
            if (var10 >= 0 && arg1.field3408 > var10) {
                for (int var21 = this.field3917; var21 <= this.field3913; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3410) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field3676[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field3916 += 3;
                                    }
                                }
                            } else {
                                this.field3916 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field3913 - this.field3917;
            }
        }
        if (this.field3916 <= 0) {
            this.field3905 = null;
            this.field3901 = null;
            this.field3909 = null;
            this.field3902 = null;
        } else {
            this.field3903 = new class244(this.field3916 * 2);
            this.field3911 = new class685(this.field3916 * 16);
            this.field3925 = new class295(class756.method4202(true, this.field3916));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field3915; var13 <= this.field3914; var13++) {
                if (var13 >= 0 && var13 < arg1.field3408) {
                    int var14 = 0;
                    for (int var15 = this.field3917; var15 <= this.field3913; var15++) {
                        if (var15 >= 0 && var15 < arg1.field3410) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field3676[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field3643[var15][var13];
                                    int[] var19 = arg1.field3650[var15][var13];
                                    int var20 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label112;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1868(var11, var15, var19[var20], var13, true, var14, var18[var20]);
                                                var20++;
                                                this.method1868(var11, var15, var19[var20], var13, true, var14, var18[var20]);
                                                var20++;
                                                this.method1868(var11, var15, var19[var20], var13, true, var14, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1868(var11, var15, 0, var13, true, var14, 0);
                                    this.method1868(var11, var15, 0, var13, true, var14, arg1.field3413);
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, 0);
                                } else if (var16 == 2) {
                                    this.method1868(var11, var15, 0, var13, true, var14, arg1.field3413);
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, arg1.field3413);
                                    this.method1868(var11, var15, 0, var13, true, var14, 0);
                                } else if (var16 == 5) {
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, arg1.field3413);
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, 0);
                                    this.method1868(var11, var15, 0, var13, true, var14, arg1.field3413);
                                } else if (var16 == 4) {
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, 0);
                                    this.method1868(var11, var15, 0, var13, true, var14, 0);
                                    this.method1868(var11, var15, arg1.field3413, var13, true, var14, arg1.field3413);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field3913 - this.field3917;
                }
                var11++;
            }
            this.field3902 = this.field3898.method2608(5123, this.field3903.field2903, 2, false, this.field3903.field2912);
            this.field3901 = this.field3898.method2598(this.field3911.field2912, 34168, false, this.field3911.field2903, 16);
            this.field3905 = new class704(this.field3901, 5126, 3, 0);
            this.field3909 = new class704(this.field3901, 5121, 4, 12);
        }
        this.field3925 = null;
        this.field3903 = null;
        this.field3911 = null;
        this.field3900 = this.field3908 = this.field3923 = null;
    }
}

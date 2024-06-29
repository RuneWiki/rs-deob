import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class203 {

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    private int[] field3315 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    private int[] field3317 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    private int field3313 = 100;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field3316 = 500;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field3322 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    private int field3309 = 0;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
    private int[] field3327 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
    private static int[] field3320 = new int[32768];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
    private static int[] field3323;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "[I")
    private static int[] field3318;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[I")
    private static int[] field3333;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "[I")
    private static int[] field3331;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[I")
    private static int[] field3330;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    private static int[] field3332;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "[I")
    private static int[] field3329;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Laf;")
    private class242 field3326;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lhd;")
    private class56 field3310;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lhd;")
    private class56 field3311;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lhd;")
    private class56 field3312;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lhd;")
    private class56 field3314;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lhd;")
    private class56 field3319;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lhd;")
    private class56 field3321;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lhd;")
    private class56 field3324;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lhd;")
    private class56 field3325;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lhd;")
    private class56 field3328;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 9)
    public static void method1481() {
        field3318 = null;
        field3320 = null;
        field3323 = null;
        field3331 = null;
        field3332 = null;
        field3330 = null;
        field3329 = null;
        field3333 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I", line = 26)
    public final int[] method1482(int arg0, int arg1) {
        class9.method52(field3318, 0, arg0);
        if (arg1 < 10) {
            return field3318;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3325.method359();
        this.field3314.method359();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3310 != null) {
            this.field3310.method359();
            this.field3321.method359();
            var5 = (int) ((double) (this.field3310.field783 - this.field3310.field785) * 32.768D / var3);
            var6 = (int) ((double) this.field3310.field785 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3312 != null) {
            this.field3312.method359();
            this.field3328.method359();
            var8 = (int) ((double) (this.field3312.field783 - this.field3312.field785) * 32.768D / var3);
            var9 = (int) ((double) this.field3312.field785 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3327[var11] != 0) {
                field3331[var11] = 0;
                field3332[var11] = (int) ((double) this.field3317[var11] * var3);
                field3330[var11] = (this.field3327[var11] << 14) / 100;
                field3329[var11] = (int) ((double) (this.field3325.field783 - this.field3325.field785) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3315[var11]) / var3);
                field3333[var11] = (int) ((double) this.field3325.field785 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field3325.method358(arg0);
            int var14 = this.field3314.method358(arg0);
            if (this.field3310 != null) {
                int var15 = this.field3310.method358(arg0);
                int var16 = this.field3321.method358(arg0);
                var13 += this.method1484(var7, var16, this.field3310.field784) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field3312 != null) {
                int var17 = this.field3312.method358(arg0);
                int var18 = this.field3328.method358(arg0);
                var14 = var14 * ((this.method1484(var10, var18, this.field3312.field784) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field3327[var19] != 0) {
                    int var20 = field3332[var19] + var12;
                    if (var20 < arg0) {
                        field3318[var20] += this.method1484(field3331[var19], field3330[var19] * var14 >> 15, this.field3325.field784);
                        field3331[var19] += (field3329[var19] * var13 >> 16) + field3333[var19];
                    }
                }
            }
        }
        if (this.field3324 != null) {
            this.field3324.method359();
            this.field3311.method359();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field3324.method358(arg0);
                int var26 = this.field3311.method358(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field3324.field783 - this.field3324.field785) * var25 >> 8) + this.field3324.field785;
                } else {
                    var27 = ((this.field3324.field783 - this.field3324.field785) * var26 >> 8) + this.field3324.field785;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field3318[var24] = 0;
                }
            }
        }
        if (this.field3309 > 0 && this.field3313 > 0) {
            int var28 = (int) ((double) this.field3309 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field3318[var29] += field3318[var29 - var28] * this.field3313 / 100;
            }
        }
        if (this.field3326.field3827[0] > 0 || this.field3326.field3827[1] > 0) {
            this.field3319.method359();
            int var30 = this.field3319.method358(arg0 + 1);
            int var31 = this.field3326.method1744(0, (float) var30 / 65536.0F);
            int var32 = this.field3326.method1744(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field3318[var31 + var33] * (long) class242.field3824 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field3318[var31 + var33 - var36 - 1] * (long) class242.field3831[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field3318[var33 - var37 - 1] * (long) class242.field3831[1][var37] >> 16);
                    }
                    field3318[var33] = var35;
                    var30 = this.field3319.method358(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field3318[var31 + var33] * (long) class242.field3824 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field3318[var31 + var33 - var40 - 1] * (long) class242.field3831[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field3318[var33 - var41 - 1] * (long) class242.field3831[1][var41] >> 16);
                        }
                        field3318[var33] = var39;
                        var30 = this.field3319.method358(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field3318[var31 + var33 - var43 - 1] * (long) class242.field3831[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field3318[var33 - var44 - 1] * (long) class242.field3831[1][var44] >> 16);
                            }
                            field3318[var33] = var42;
                            this.field3319.method358(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field3326.method1744(0, (float) var30 / 65536.0F);
                    var32 = this.field3326.method1744(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field3318[var46] < -32768) {
                field3318[var46] = -32768;
            }
            if (field3318[var46] > 32767) {
                field3318[var46] = 32767;
            }
        }
        return field3318;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljj;)V", line = 307)
    public final void method1483(class44 arg0) {
        this.field3325 = new class56();
        this.field3325.method360(arg0);
        this.field3314 = new class56();
        this.field3314.method360(arg0);
        int var2 = arg0.method286((byte) -118);
        if (var2 != 0) {
            arg0.field586--;
            this.field3310 = new class56();
            this.field3310.method360(arg0);
            this.field3321 = new class56();
            this.field3321.method360(arg0);
        }
        int var3 = arg0.method286((byte) -114);
        if (var3 != 0) {
            arg0.field586--;
            this.field3312 = new class56();
            this.field3312.method360(arg0);
            this.field3328 = new class56();
            this.field3328.method360(arg0);
        }
        int var4 = arg0.method286((byte) -64);
        if (var4 != 0) {
            arg0.field586--;
            this.field3324 = new class56();
            this.field3324.method360(arg0);
            this.field3311 = new class56();
            this.field3311.method360(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method281(-111);
            if (var6 == 0) {
                break;
            }
            this.field3327[var5] = var6;
            this.field3315[var5] = arg0.method245(29828);
            this.field3317[var5] = arg0.method281(-79);
        }
        this.field3309 = arg0.method281(-107);
        this.field3313 = arg0.method281(-100);
        this.field3316 = arg0.method271(21081);
        this.field3322 = arg0.method271(21081);
        this.field3326 = new class242();
        this.field3319 = new class56();
        this.field3326.method1745(arg0, this.field3319);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I", line = 367)
    private final int method1484(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3323[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3320[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3320[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3323 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3323[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3318 = new int[220500];
        field3333 = new int[5];
        field3331 = new int[5];
        field3330 = new int[5];
        field3332 = new int[5];
        field3329 = new int[5];
    }
}

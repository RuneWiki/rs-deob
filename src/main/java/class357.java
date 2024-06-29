import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class357 extends class539 {

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lot;")
    private class540 field5109;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "Len;")
    private class289 field5110;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "Lld;")
    private class154 field5112;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    private int field5116;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "[[F")
    private float[][] field5118;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "[[F")
    private float[][] field5119;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "[[F")
    private float[][] field5123;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "Lkca;")
    private class74 field5120;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "Lpn;")
    private class682 field5126;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "Lqa;")
    private class224 field5106;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "Lkca;")
    private class74 field5114;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "Ljr;")
    private class96 field5111;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "Ldl;")
    private class57 field5105;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Loj;")
    private class346 field5102;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    private int field5124;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field5108 = 0;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "Lhs;")
    public static class295 field5107 = new class295(4, 1);

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "[Z")
    public static boolean[] field5121 = new boolean[100];

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    private int field5125;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(SI)V")
    private final void method2111(short arg0, int arg1) {
        if (this.field5110.field4362) {
            this.field5111.method731(-2045573048, arg0);
        } else {
            this.field5111.method720(4, arg0);
        }
        field5113++;
        if (arg1 >= -112) {
            this.field5122 = -2;
        }
        this.field5124++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIZ)V")
    private final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5103++;
        long var8 = -1L;
        int var10 = arg1 + (arg0 << this.field5109.field1921);
        int var11 = (arg2 << this.field5109.field1921) + arg3;
        int var12 = this.field5109.method267(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class539 var13 = this.field5102.method2061(-17305, var8);
            if (var13 != null) {
                this.method2111(((class379) var13).field5339, -127);
                return;
            }
        }
        short var14 = (short) (this.field5125++);
        if (var8 != -1L) {
            this.field5102.method2063(var8, 1, new class379(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg3 == 0) {
            var15 = this.field5119[arg4][arg5];
            var16 = this.field5118[arg4][arg5];
            var17 = this.field5123[arg4][arg5];
        } else if (this.field5109.field1919 == arg1 && arg3 == 0) {
            var15 = this.field5119[arg4 + 1][arg5];
            var16 = this.field5118[arg4 + 1][arg5];
            var17 = this.field5123[arg4 + 1][arg5];
        } else if (this.field5109.field1919 == arg1 && this.field5109.field1919 == arg3) {
            var16 = this.field5118[arg4 + 1][arg5 + 1];
            var17 = this.field5123[arg4 + 1][arg5 + 1];
            var15 = this.field5119[arg4 + 1][arg5 + 1];
        } else if (arg1 == 0 && this.field5109.field1919 == arg3) {
            var15 = this.field5119[arg4][arg5 + 1];
            var17 = this.field5123[arg4][arg5 + 1];
            var16 = this.field5118[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field5109.field1919;
            float var19 = (float) arg3 / (float) this.field5109.field1919;
            float var20 = this.field5123[arg4][arg5];
            float var21 = this.field5119[arg4][arg5];
            float var22 = this.field5118[arg4][arg5];
            float var23 = this.field5123[arg4 + 1][arg5];
            float var24 = this.field5119[arg4 + 1][arg5];
            float var25 = (this.field5119[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var26 = (this.field5123[arg4][arg5 + 1] - var20) * var18 + var20;
            float var27 = this.field5118[arg4 + 1][arg5];
            float var28 = (this.field5119[arg4][arg5 + 1] - var21) * var18 + var21;
            float var29 = (this.field5123[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var30 = (this.field5118[arg4][arg5 + 1] - var22) * var18 + var22;
            float var31 = (this.field5118[arg4 + 1][arg5 + 1] - var27) * var18 + var27;
            var15 = (var25 - var28) * var19 + var28;
            var17 = (var29 - var26) * var19 + var26;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field5112.method1079(-868177151) - var10);
        float var33 = (float) (this.field5112.method1076(false) - var12);
        float var34 = (float) (this.field5112.method1074(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field5112.method1072(2);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5112.method1083(arg6);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF27) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field5110.field4362) {
            this.field5105.method503((byte) 30, (float) var10);
            this.field5105.method503((byte) 30, (float) var12);
            this.field5105.method503((byte) 30, (float) var11);
        } else {
            this.field5105.method501((float) var10, 118);
            this.field5105.method501((float) var12, 120);
            this.field5105.method501((float) var11, 116);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field5105.method746((byte) -112, var45);
        this.field5105.method746((byte) -111, var46);
        this.field5105.method746((byte) -103, var47);
        this.field5105.method746((byte) -115, 255);
        this.method2111(var14, -121);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method2113(int arg0) {
        int var1 = -104 / ((-arg0 - 61) / 61);
        field5121 = null;
        field5107 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "([[ZIIII)V")
    public final void method2114(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field5115++;
        if (this.field5106 == null || arg1 + arg2 < this.field5122 || arg1 - arg2 > this.field5116 || (arg3 + arg2) < this.field5101 || this.field5100 < arg3 - arg2) {
            return;
        }
        if (arg4 != 10531) {
            this.field5124 = 40;
        }
        for (int var6 = this.field5101; var6 <= this.field5100; var6++) {
            for (int var7 = this.field5122; var7 <= this.field5116; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg3;
                if ((-arg2) < var8 && arg2 > var8 && -arg2 < var9 && arg2 > var9 && arg0[arg2 + var8][arg2 + var9]) {
                    this.field5110.method1761((int) (this.field5112.method1081(arg4 ^ 0xFFFFD6C8) * 255.0F) << 24, 73);
                    this.field5110.method1744(this.field5114, (byte) -103, null, this.field5120, null);
                    this.field5110.method1822(this.field5124, this.field5106, 0, (byte) 63, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
    public static final void method2115(boolean arg0, int arg1) {
        field5099++;
        class307.field4531 = arg1;
        class328 var2 = class205.field3010;
        synchronized (class205.field3010) {
            if (!arg0) {
                class205.field3010.method1997(1);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Len;Lot;Lld;[I)V")
    public class357(class289 arg0, class540 arg1, class154 arg2, int[] arg3) {
        this.field5109 = arg1;
        this.field5110 = arg0;
        this.field5112 = arg2;
        int var5 = this.field5112.method1072(2) - (arg1.field1919 >> 1);
        this.field5122 = this.field5112.method1079(-868177151) - var5 >> arg1.field1921;
        this.field5116 = var5 + this.field5112.method1079(-868177151) >> arg1.field1921;
        this.field5101 = this.field5112.method1074(0) - var5 >> arg1.field1921;
        this.field5100 = this.field5112.method1074(0) + var5 >> arg1.field1921;
        int var6 = this.field5116 + 1 - this.field5122;
        int var7 = this.field5100 + 1 - this.field5101;
        this.field5118 = new float[var6 + 1][var7 + 1];
        this.field5119 = new float[var6 + 1][var7 + 1];
        this.field5123 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field5101 + var8;
            if (var26 > 0 && this.field5109.field1916 - 1 > var26) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = this.field5122 + var27;
                    if (var28 > 0 && var28 < (this.field5109.field1918 - 1)) {
                        int var29 = arg1.method273(var28 + 1, var26) - arg1.method273(var28 - 1, var26);
                        int var30 = arg1.method273(var28, var26 + 1) - arg1.method273(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var29 * var29 + 65536))));
                        this.field5123[var27][var8] = (float) var29 * var31;
                        this.field5119[var27][var8] = var31 * -256.0F;
                        this.field5118[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field5101; var11 <= this.field5100; var11++) {
            if (var11 >= 0 && var11 < arg1.field1916) {
                for (int var22 = this.field5122; var22 <= this.field5116; var22++) {
                    if (var22 >= 0 && arg1.field1918 > var22) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field7342[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field5124 += 3;
                                    }
                                }
                            } else {
                                this.field5124 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field5116 - this.field5122;
            }
        }
        if (var9 <= 0) {
            this.field5120 = null;
            this.field5126 = null;
            this.field5106 = null;
            this.field5114 = null;
        } else {
            this.field5111 = new class96(var9 * 2);
            this.field5105 = new class57(var9 * 16);
            this.field5102 = new class346(class350.method2082(126, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field5101; var14 <= this.field5100; var14++) {
                if (var14 >= 0 && var14 < arg1.field1916) {
                    int var15 = 0;
                    for (int var16 = this.field5122; var16 <= this.field5116; var16++) {
                        if (var16 >= 0 && arg1.field1918 > var16) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field7342[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field7345[var16][var14];
                                    int[] var20 = arg1.field7335[var16][var14];
                                    int var21 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var18.length <= var21) {
                                                break label111;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method2112(var16, var19[var21], var14, var20[var21], var15, var13, true);
                                                var21++;
                                                this.method2112(var16, var19[var21], var14, var20[var21], var15, var13, true);
                                                var21++;
                                                this.method2112(var16, var19[var21], var14, var20[var21], var15, var13, true);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method2112(var16, 0, var14, 0, var15, var13, true);
                                    this.method2112(var16, arg1.field1919, var14, 0, var15, var13, true);
                                    this.method2112(var16, 0, var14, arg1.field1919, var15, var13, true);
                                } else if (var17 == 2) {
                                    this.method2112(var16, arg1.field1919, var14, 0, var15, var13, true);
                                    this.method2112(var16, arg1.field1919, var14, arg1.field1919, var15, var13, true);
                                    this.method2112(var16, 0, var14, 0, var15, var13, true);
                                } else if (var17 == 5) {
                                    this.method2112(var16, arg1.field1919, var14, arg1.field1919, var15, var13, true);
                                    this.method2112(var16, 0, var14, arg1.field1919, var15, var13, true);
                                    this.method2112(var16, arg1.field1919, var14, 0, var15, var13, true);
                                } else if (var17 == 4) {
                                    this.method2112(var16, 0, var14, arg1.field1919, var15, var13, true);
                                    this.method2112(var16, 0, var14, 0, var15, var13, true);
                                    this.method2112(var16, arg1.field1919, var14, arg1.field1919, var15, var13, true);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field5116 - this.field5122;
                }
                var13++;
            }
            this.field5106 = this.field5110.method1743(this.field5111.field1316, -75, this.field5111.field1301, false, 5123);
            this.field5126 = this.field5110.method1786(this.field5105.field1316, false, 16, (byte) -112, this.field5105.field1301);
            this.field5114 = new class74(this.field5126, 5126, 3, 0);
            this.field5120 = new class74(this.field5126, 5121, 4, 12);
        }
        this.field5123 = this.field5119 = this.field5118 = null;
        this.field5105 = null;
        this.field5111 = null;
        this.field5102 = null;
    }
}

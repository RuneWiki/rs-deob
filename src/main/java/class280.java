import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class280 extends class383 {

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lug;")
    private class395 field3576;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "Lku;")
    private class256 field3573;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lul;")
    private class405 field3556;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[[F")
    private float[][] field3558;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[[F")
    private float[][] field3548;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[[F")
    private float[][] field3549;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Log;")
    private class460 field3557;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lit;")
    private class458 field3552;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "Llc;")
    private class459 field3570;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Log;")
    private class460 field3560;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Lfh;")
    private class463 field3569;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "Ldd;")
    private class498 field3571;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "Lek;")
    private class352 field3575;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
    public static int[] field3567 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "F")
    public static float field3559;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lqn;")
    public static class47 field3547;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "[I")
    public static int[] field3574;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(SI)V", line = 4)
    private final void method1660(short arg0, int arg1) {
        if (this.field3576.field5593) {
            this.field3569.method2759((byte) -121, arg0);
        } else {
            this.field3569.method2790(arg1 - 951330600, arg0);
        }
        field3551++;
        if (arg1 != 16) {
            this.field3565 = -24;
        }
        this.field3562++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)V", line = 21)
    private final void method1661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3564++;
        long var8 = -1L;
        int var10 = (arg6 << this.field3556.field1840) + arg5;
        int var11 = (arg3 << this.field3556.field1840) + arg1;
        int var12 = this.field3556.method396(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class383 var13 = this.field3575.method2022(-1, var8);
            if (var13 != null) {
                this.method1660(((class349) var13).field4496, 16);
                return;
            }
        }
        short var14 = (short) (this.field3554++);
        if (var8 != -1L) {
            this.field3575.method2019((byte) -58, new class349(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg1 == 0) {
            var15 = this.field3558[arg2][arg4];
            var16 = this.field3548[arg2][arg4];
            var17 = this.field3549[arg2][arg4];
        } else if (this.field3556.field1836 == arg5 && arg1 == 0) {
            var15 = this.field3558[arg2 + 1][arg4];
            var17 = this.field3549[arg2 + 1][arg4];
            var16 = this.field3548[arg2 + 1][arg4];
        } else if (this.field3556.field1836 == arg5 && this.field3556.field1836 == arg1) {
            var17 = this.field3549[arg2 + 1][arg4 + 1];
            var15 = this.field3558[arg2 + 1][arg4 + 1];
            var16 = this.field3548[arg2 + 1][arg4 + 1];
        } else if (arg5 == 0 && this.field3556.field1836 == arg1) {
            var15 = this.field3558[arg2][arg4 + 1];
            var16 = this.field3548[arg2][arg4 + 1];
            var17 = this.field3549[arg2][arg4 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field3556.field1836;
            float var19 = (float) arg1 / (float) this.field3556.field1836;
            float var20 = this.field3548[arg2][arg4];
            float var21 = this.field3558[arg2][arg4];
            float var22 = this.field3549[arg2][arg4];
            float var23 = this.field3548[arg2 + 1][arg4];
            float var24 = this.field3558[arg2 + 1][arg4];
            float var25 = (this.field3558[arg2 + 1][arg4 + 1] - var24) * var18 + var24;
            float var26 = (this.field3558[arg2][arg4 + 1] - var21) * var18 + var21;
            float var27 = (this.field3548[arg2][arg4 + 1] - var20) * var18 + var20;
            float var28 = this.field3549[arg2 + 1][arg4];
            float var29 = (this.field3548[arg2 + 1][arg4 + 1] - var23) * var18 + var23;
            float var30 = (this.field3549[arg2][arg4 + 1] - var22) * var18 + var22;
            var16 = (var29 - var27) * var19 + var27;
            var15 = (var25 - var26) * var19 + var26;
            float var31 = (this.field3549[arg2 + 1][arg4 + 1] - var28) * var18 + var28;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field3573.method1539((byte) 54) - var10);
        float var33 = (float) (this.field3573.method1536((byte) 109) - var12);
        float var34 = (float) (this.field3573.method1537(-409134460) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3573.method1534((byte) -125);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        if (arg0 != 10227) {
            this.field3550 = 16;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3573.method1533(-409134460);
        int var45 = (int) ((float) ((var44 & 0xFF7FC1) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFA8) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3576.field5593) {
            this.field3571.method3004(arg0 ^ 0x270C, (float) var10);
            this.field3571.method3004(255, (float) var12);
            this.field3571.method3004(255, (float) var11);
        } else {
            this.field3571.method3003((float) var10, -51);
            this.field3571.method3003((float) var12, -51);
            this.field3571.method3003((float) var11, -51);
        }
        this.field3571.method2729(var45, false);
        this.field3571.method2729(var46, false);
        this.field3571.method2729(var47, false);
        this.field3571.method2729(255, false);
        this.method1660(var14, 16);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[[ZII)V", line = 191)
    public final void method1662(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        if (arg3 != 255) {
            this.field3563 = 6;
        }
        field3566++;
        if (this.field3552 == null || this.field3565 > arg1 + arg4 || arg1 - arg4 > this.field3568 || (arg0 + arg4) < this.field3563 || (arg0 - arg4) > this.field3550) {
            return;
        }
        for (int var6 = this.field3563; var6 <= this.field3550; var6++) {
            for (int var7 = this.field3565; var7 <= this.field3568; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (var8 > -arg4 && var8 < arg4 && var9 > (-arg4) && var9 < arg4 && arg2[arg4 + var8][arg4 + var9]) {
                    this.field3576.method2299((byte) -57, (int) (this.field3573.method1542(arg3 - 268) * 255.0F) << 24);
                    this.field3576.method2295(null, this.field3560, this.field3557, false, null);
                    this.field3576.method2343(-97, this.field3552, 0, this.field3562, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V", line = 272)
    public static final void method1663(boolean arg0, int arg1) {
        field3553++;
        if (arg0 && class241.field3089 != null) {
            class316.field4042 = class241.field3089.field2005;
        } else {
            class316.field4042 = -1;
        }
        class241.field3089 = null;
        if (arg1 != 1475) {
            return;
        }
        class490.field7145 = null;
        class78.field1021 = null;
        class285.field3646 = 0;
        class241.method1457();
        class241.field3099.method154(7491);
        class463.field6680 = null;
        class36.field442 = null;
        class9.field144 = -1;
        class241.field3102 = null;
        class456.field6563 = null;
        class498.field7224 = null;
        class124.field1661 = null;
        class440.field6308 = null;
        class63.field828 = null;
        class49.field624 = null;
        class179.field2366 = -1;
        class379.field4999 = null;
        class241.field3097.method1625(arg1 + 27777);
        class241.field3094.method949(64, 64, arg1 - 1395);
        class241.field3097.method1619(128, -1, 64);
        class241.field3090.method1960(-8870, 64);
        class242.field3132.method1692((byte) -31, 64);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 313)
    public static void method1664(int arg0) {
        if (arg0 != -304895391) {
            method1664(116);
        }
        field3574 = null;
        field3567 = null;
        field3547 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lug;Lul;Lku;[I)V", line = 331)
    public class280(class395 arg0, class405 arg1, class256 arg2, int[] arg3) {
        this.field3576 = arg0;
        this.field3573 = arg2;
        this.field3556 = arg1;
        int var5 = this.field3573.method1534((byte) 61) - (arg1.field1836 >> 1);
        this.field3565 = this.field3573.method1539((byte) 60) - var5 >> arg1.field1840;
        this.field3568 = this.field3573.method1539((byte) 107) + var5 >> arg1.field1840;
        this.field3563 = this.field3573.method1537(-409134460) - var5 >> arg1.field1840;
        this.field3550 = var5 + this.field3573.method1537(-409134460) >> arg1.field1840;
        int var6 = this.field3568 + 1 - this.field3565;
        int var7 = this.field3550 + 1 - this.field3563;
        this.field3558 = new float[var6 + 1][var7 + 1];
        this.field3548 = new float[var6 + 1][var7 + 1];
        this.field3549 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field3563 + var8;
            if (var24 > 0 && var24 < (this.field3556.field1844 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field3565 + var25;
                    if (var26 > 0 && var26 < (this.field3556.field1842 - 1)) {
                        int var27 = arg1.method399(var26 + 1, var24) - arg1.method399(var26 - 1, var24);
                        int var28 = arg1.method399(var26, var24 + 1) - arg1.method399(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field3548[var25][var8] = (float) var27 * var29;
                        this.field3558[var25][var8] = var29 * -256.0F;
                        this.field3549[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3563; var11 <= this.field3550; var11++) {
            if (var11 >= 0 && var11 < arg1.field1844) {
                for (int var21 = this.field3565; var21 <= this.field3568; var21++) {
                    if (var21 >= 0 && var21 < arg1.field1842) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5771[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field3568 - this.field3565;
            }
        }
        if (var9 <= 0) {
            this.field3557 = null;
            this.field3552 = null;
            this.field3570 = null;
            this.field3560 = null;
        } else {
            this.field3569 = new class463(var9 * 2);
            this.field3571 = new class498(var9 * 16);
            this.field3575 = new class352(class60.method550(107, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3563; var14 <= this.field3550; var14++) {
                if (var14 >= 0 && var14 < arg1.field1844) {
                    int var15 = 0;
                    for (int var16 = this.field3565; var16 <= this.field3568; var16++) {
                        if (var16 >= 0 && arg1.field1842 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field5771[var16][var14];
                            int[] var19 = arg1.field5777[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1661(10227, var19[var20], var15, var14, var12, var18[var20], var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method1661(10227, 0, var15, var14, var12, 0, var16);
                                    this.method1661(10227, 0, var15, var14, var12, arg1.field1836, var16);
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, 0, var16);
                                } else if (var17 == 2) {
                                    this.method1661(10227, 0, var15, var14, var12, arg1.field1836, var16);
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, arg1.field1836, var16);
                                    this.method1661(10227, 0, var15, var14, var12, 0, var16);
                                } else if (var17 == 5) {
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, arg1.field1836, var16);
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, 0, var16);
                                    this.method1661(10227, 0, var15, var14, var12, arg1.field1836, var16);
                                } else if (var17 == 4) {
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, 0, var16);
                                    this.method1661(10227, 0, var15, var14, var12, 0, var16);
                                    this.method1661(10227, arg1.field1836, var15, var14, var12, arg1.field1836, var16);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field3568 - this.field3565;
                }
                var12++;
            }
            this.field3552 = this.field3576.method2287(5123, false, 5667, this.field3569.field6618, this.field3569.field6631);
            this.field3570 = this.field3576.method2269(false, (byte) 21, this.field3571.field6631, 16, this.field3571.field6618);
            this.field3560 = new class460(this.field3570, 5126, 3, 0);
            this.field3557 = new class460(this.field3570, 5121, 4, 12);
        }
        this.field3548 = this.field3558 = this.field3549 = null;
        this.field3575 = null;
        this.field3571 = null;
        this.field3569 = null;
    }
}

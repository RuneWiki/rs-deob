import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class160 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field2525 = 500;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private int field2530 = 100;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
    private int[] field2533 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    private int[] field2527 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
    private int[] field2540 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    private int field2542 = 0;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field2545 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
    private static int[] field2529 = new int[32768];

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
    private static int[] field2537;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    private static int[] field2526;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
    private static int[] field2543;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
    private static int[] field2541;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[I")
    private static int[] field2544;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[I")
    private static int[] field2546;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "[I")
    private static int[] field2547;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lma;")
    private class146 field2539;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lr;")
    private class243 field2523;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lr;")
    private class243 field2524;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lr;")
    private class243 field2528;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lr;")
    private class243 field2531;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lr;")
    private class243 field2532;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lr;")
    private class243 field2534;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lr;")
    private class243 field2535;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lr;")
    private class243 field2536;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lr;")
    private class243 field2538;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method1122(int arg0, int arg1) {
        class185.method1313(field2526, 0, arg0);
        if (arg1 < 10) {
            return field2526;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2538.method1675();
        this.field2534.method1675();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2536 != null) {
            this.field2536.method1675();
            this.field2531.method1675();
            var5 = (int) ((double) (this.field2536.field4134 - this.field2536.field4136) * 32.768D / var3);
            var6 = (int) ((double) this.field2536.field4136 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2528 != null) {
            this.field2528.method1675();
            this.field2535.method1675();
            var8 = (int) ((double) (this.field2528.field4134 - this.field2528.field4136) * 32.768D / var3);
            var9 = (int) ((double) this.field2528.field4136 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2527[var11] != 0) {
                field2543[var11] = 0;
                field2547[var11] = (int) ((double) this.field2540[var11] * var3);
                field2546[var11] = (this.field2527[var11] << 14) / 100;
                field2541[var11] = (int) ((double) (this.field2538.field4134 - this.field2538.field4136) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2533[var11]) / var3);
                field2544[var11] = (int) ((double) this.field2538.field4136 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2538.method1674(arg0);
            int var14 = this.field2534.method1674(arg0);
            if (this.field2536 != null) {
                int var15 = this.field2536.method1674(arg0);
                int var16 = this.field2531.method1674(arg0);
                var13 += this.method1125(var7, var16, this.field2536.field4131) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2528 != null) {
                int var17 = this.field2528.method1674(arg0);
                int var18 = this.field2535.method1674(arg0);
                var14 = var14 * ((this.method1125(var10, var18, this.field2528.field4131) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2527[var19] != 0) {
                    int var20 = field2547[var19] + var12;
                    if (var20 < arg0) {
                        field2526[var20] += this.method1125(field2543[var19], field2546[var19] * var14 >> 15, this.field2538.field4131);
                        field2543[var19] += (field2541[var19] * var13 >> 16) + field2544[var19];
                    }
                }
            }
        }
        if (this.field2524 != null) {
            this.field2524.method1675();
            this.field2523.method1675();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2524.method1674(arg0);
                int var26 = this.field2523.method1674(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2524.field4134 - this.field2524.field4136) * var25 >> 8) + this.field2524.field4136;
                } else {
                    var27 = ((this.field2524.field4134 - this.field2524.field4136) * var26 >> 8) + this.field2524.field4136;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2526[var24] = 0;
                }
            }
        }
        if (this.field2542 > 0 && this.field2530 > 0) {
            int var28 = (int) ((double) this.field2542 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2526[var29] += field2526[var29 - var28] * this.field2530 / 100;
            }
        }
        if (this.field2539.field2271[0] > 0 || this.field2539.field2271[1] > 0) {
            this.field2532.method1675();
            int var30 = this.field2532.method1674(arg0 + 1);
            int var31 = this.field2539.method1009(0, (float) var30 / 65536.0F);
            int var32 = this.field2539.method1009(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2526[var31 + var33] * (long) class146.field2275 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2526[var31 + var33 - var36 - 1] * (long) class146.field2274[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2526[var33 - var37 - 1] * (long) class146.field2274[1][var37] >> 16);
                    }
                    field2526[var33] = var35;
                    var30 = this.field2532.method1674(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2526[var31 + var33] * (long) class146.field2275 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2526[var31 + var33 - var40 - 1] * (long) class146.field2274[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2526[var33 - var41 - 1] * (long) class146.field2274[1][var41] >> 16);
                        }
                        field2526[var33] = var39;
                        var30 = this.field2532.method1674(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2526[var31 + var33 - var43 - 1] * (long) class146.field2274[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2526[var33 - var44 - 1] * (long) class146.field2274[1][var44] >> 16);
                            }
                            field2526[var33] = var42;
                            this.field2532.method1674(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2539.method1009(0, (float) var30 / 65536.0F);
                    var32 = this.field2539.method1009(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2526[var46] < -32768) {
                field2526[var46] = -32768;
            }
            if (field2526[var46] > 32767) {
                field2526[var46] = 32767;
            }
        }
        return field2526;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 290)
    public static void method1123() {
        field2526 = null;
        field2529 = null;
        field2537 = null;
        field2543 = null;
        field2547 = null;
        field2546 = null;
        field2541 = null;
        field2544 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lj;)V", line = 302)
    public final void method1124(class153 arg0) {
        this.field2538 = new class243();
        this.field2538.method1677(arg0);
        this.field2534 = new class243();
        this.field2534.method1677(arg0);
        int var2 = arg0.method1042((byte) -68);
        if (var2 != 0) {
            arg0.field2367--;
            this.field2536 = new class243();
            this.field2536.method1677(arg0);
            this.field2531 = new class243();
            this.field2531.method1677(arg0);
        }
        int var3 = arg0.method1042((byte) -55);
        if (var3 != 0) {
            arg0.field2367--;
            this.field2528 = new class243();
            this.field2528.method1677(arg0);
            this.field2535 = new class243();
            this.field2535.method1677(arg0);
        }
        int var4 = arg0.method1042((byte) 101);
        if (var4 != 0) {
            arg0.field2367--;
            this.field2524 = new class243();
            this.field2524.method1677(arg0);
            this.field2523 = new class243();
            this.field2523.method1677(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1074((byte) -92);
            if (var6 == 0) {
                break;
            }
            this.field2527[var5] = var6;
            this.field2533[var5] = arg0.method1065(0);
            this.field2540[var5] = arg0.method1074((byte) -114);
        }
        this.field2542 = arg0.method1074((byte) -124);
        this.field2530 = arg0.method1074((byte) -107);
        this.field2525 = arg0.method1069(114);
        this.field2545 = arg0.method1069(36);
        this.field2539 = new class146();
        this.field2532 = new class243();
        this.field2539.method1007(arg0, this.field2532);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I", line = 367)
    private final int method1125(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2537[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2529[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2529[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2537 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2537[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2526 = new int[220500];
        field2543 = new int[5];
        field2541 = new int[5];
        field2544 = new int[5];
        field2546 = new int[5];
        field2547 = new int[5];
    }
}

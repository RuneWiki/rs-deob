import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class243 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field3518 = 500;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field3524 = 0;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[I")
    private int[] field3531 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
    private int[] field3529 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    private int field3522 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    private int[] field3528 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    private int field3523 = 100;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
    private static int[] field3533 = new int[32768];

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    private static int[] field3520;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[I")
    private static int[] field3526;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[I")
    private static int[] field3535;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    private static int[] field3534;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "[I")
    private static int[] field3537;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[I")
    private static int[] field3536;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
    private static int[] field3539;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lqo;")
    private class150 field3530;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lh;")
    private class189 field3515;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lh;")
    private class189 field3516;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lh;")
    private class189 field3517;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lh;")
    private class189 field3519;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lh;")
    private class189 field3521;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lh;")
    private class189 field3525;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lh;")
    private class189 field3527;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lh;")
    private class189 field3532;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Lh;")
    private class189 field3538;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lfd;)V", line = 13)
    public final void method1719(class299 arg0) {
        this.field3527 = new class189();
        this.field3527.method1374(arg0);
        this.field3519 = new class189();
        this.field3519.method1374(arg0);
        int var2 = arg0.method2096((byte) -122);
        if (var2 != 0) {
            arg0.field4351--;
            this.field3525 = new class189();
            this.field3525.method1374(arg0);
            this.field3532 = new class189();
            this.field3532.method1374(arg0);
        }
        int var3 = arg0.method2096((byte) -122);
        if (var3 != 0) {
            arg0.field4351--;
            this.field3521 = new class189();
            this.field3521.method1374(arg0);
            this.field3516 = new class189();
            this.field3516.method1374(arg0);
        }
        int var4 = arg0.method2096((byte) -122);
        if (var4 != 0) {
            arg0.field4351--;
            this.field3517 = new class189();
            this.field3517.method1374(arg0);
            this.field3515 = new class189();
            this.field3515.method1374(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2046((byte) 98);
            if (var6 == 0) {
                break;
            }
            this.field3529[var5] = var6;
            this.field3528[var5] = arg0.method2064((byte) 42);
            this.field3531[var5] = arg0.method2046((byte) 98);
        }
        this.field3522 = arg0.method2046((byte) 98);
        this.field3523 = arg0.method2046((byte) 98);
        this.field3518 = arg0.method2083((byte) -40);
        this.field3524 = arg0.method2083((byte) -120);
        this.field3530 = new class150();
        this.field3538 = new class189();
        this.field3530.method1153(arg0, this.field3538);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 73)
    public static void method1720() {
        field3526 = null;
        field3533 = null;
        field3520 = null;
        field3537 = null;
        field3535 = null;
        field3536 = null;
        field3539 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I", line = 110)
    public final int[] method1721(int arg0, int arg1) {
        class87.method631(field3526, 0, arg0);
        if (arg1 < 10) {
            return field3526;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3527.method1373();
        this.field3519.method1373();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3525 != null) {
            this.field3525.method1373();
            this.field3532.method1373();
            var5 = (int) ((double) (this.field3525.field2611 - this.field3525.field2612) * 32.768D / var3);
            var6 = (int) ((double) this.field3525.field2612 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3521 != null) {
            this.field3521.method1373();
            this.field3516.method1373();
            var8 = (int) ((double) (this.field3521.field2611 - this.field3521.field2612) * 32.768D / var3);
            var9 = (int) ((double) this.field3521.field2612 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3529[var11] != 0) {
                field3537[var11] = 0;
                field3535[var11] = (int) ((double) this.field3531[var11] * var3);
                field3536[var11] = (this.field3529[var11] << 14) / 100;
                field3539[var11] = (int) ((double) (this.field3527.field2611 - this.field3527.field2612) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3528[var11]) / var3);
                field3534[var11] = (int) ((double) this.field3527.field2612 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field3527.method1375(arg0);
            int var14 = this.field3519.method1375(arg0);
            if (this.field3525 != null) {
                int var15 = this.field3525.method1375(arg0);
                int var16 = this.field3532.method1375(arg0);
                var13 += this.method1722(var7, var16, this.field3525.field2614) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field3521 != null) {
                int var17 = this.field3521.method1375(arg0);
                int var18 = this.field3516.method1375(arg0);
                var14 = var14 * ((this.method1722(var10, var18, this.field3521.field2614) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field3529[var19] != 0) {
                    int var20 = field3535[var19] + var12;
                    if (var20 < arg0) {
                        field3526[var20] += this.method1722(field3537[var19], field3536[var19] * var14 >> 15, this.field3527.field2614);
                        field3537[var19] += (field3539[var19] * var13 >> 16) + field3534[var19];
                    }
                }
            }
        }
        if (this.field3517 != null) {
            this.field3517.method1373();
            this.field3515.method1373();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field3517.method1375(arg0);
                int var26 = this.field3515.method1375(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field3517.field2611 - this.field3517.field2612) * var25 >> 8) + this.field3517.field2612;
                } else {
                    var27 = ((this.field3517.field2611 - this.field3517.field2612) * var26 >> 8) + this.field3517.field2612;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field3526[var24] = 0;
                }
            }
        }
        if (this.field3522 > 0 && this.field3523 > 0) {
            int var28 = (int) ((double) this.field3522 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field3526[var29] += field3526[var29 - var28] * this.field3523 / 100;
            }
        }
        if (this.field3530.field2127[0] > 0 || this.field3530.field2127[1] > 0) {
            this.field3538.method1373();
            int var30 = this.field3538.method1375(arg0 + 1);
            int var31 = this.field3530.method1151(0, (float) var30 / 65536.0F);
            int var32 = this.field3530.method1151(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field3526[var31 + var33] * (long) class150.field2124 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field3526[var31 + var33 - var36 - 1] * (long) class150.field2123[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field3526[var33 - var37 - 1] * (long) class150.field2123[1][var37] >> 16);
                    }
                    field3526[var33] = var35;
                    var30 = this.field3538.method1375(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field3526[var31 + var33] * (long) class150.field2124 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field3526[var31 + var33 - var40 - 1] * (long) class150.field2123[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field3526[var33 - var41 - 1] * (long) class150.field2123[1][var41] >> 16);
                        }
                        field3526[var33] = var39;
                        var30 = this.field3538.method1375(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field3526[var31 + var33 - var43 - 1] * (long) class150.field2123[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field3526[var33 - var44 - 1] * (long) class150.field2123[1][var44] >> 16);
                            }
                            field3526[var33] = var42;
                            this.field3538.method1375(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field3530.method1151(0, (float) var30 / 65536.0F);
                    var32 = this.field3530.method1151(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field3526[var46] < -32768) {
                field3526[var46] = -32768;
            }
            if (field3526[var46] > 32767) {
                field3526[var46] = 32767;
            }
        }
        return field3526;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I", line = 399)
    private final int method1722(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3520[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3533[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3533[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3520 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3520[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3526 = new int[220500];
        field3535 = new int[5];
        field3534 = new int[5];
        field3537 = new int[5];
        field3536 = new int[5];
        field3539 = new int[5];
    }
}

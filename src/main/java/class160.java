import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class160 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    private int field2569 = 100;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    private int field2582 = 0;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    private int[] field2586 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field2574 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
    private int[] field2579 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field2584 = 500;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
    private int[] field2571 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[I")
    private static int[] field2578 = new int[32768];

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[I")
    private static int[] field2576;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
    private static int[] field2575;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    private static int[] field2585;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    private static int[] field2589;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    private static int[] field2590;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    private static int[] field2591;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
    private static int[] field2592;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lcm;")
    private class253 field2570;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lse;")
    private class93 field2568;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lse;")
    private class93 field2572;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lse;")
    private class93 field2573;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lse;")
    private class93 field2577;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lse;")
    private class93 field2580;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lse;")
    private class93 field2581;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lse;")
    private class93 field2583;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lse;")
    private class93 field2587;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lse;")
    private class93 field2588;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lmi;)V", line = 10)
    public final void method1166(class92 arg0) {
        this.field2581 = new class93();
        this.field2581.method753(arg0);
        this.field2568 = new class93();
        this.field2568.method753(arg0);
        int var2 = arg0.method702(-1);
        if (var2 != 0) {
            arg0.field1476--;
            this.field2573 = new class93();
            this.field2573.method753(arg0);
            this.field2572 = new class93();
            this.field2572.method753(arg0);
        }
        int var3 = arg0.method702(-1);
        if (var3 != 0) {
            arg0.field1476--;
            this.field2580 = new class93();
            this.field2580.method753(arg0);
            this.field2587 = new class93();
            this.field2587.method753(arg0);
        }
        int var4 = arg0.method702(-1);
        if (var4 != 0) {
            arg0.field1476--;
            this.field2583 = new class93();
            this.field2583.method753(arg0);
            this.field2577 = new class93();
            this.field2577.method753(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method731(-31);
            if (var6 == 0) {
                break;
            }
            this.field2571[var5] = var6;
            this.field2586[var5] = arg0.method725(64);
            this.field2579[var5] = arg0.method731(107);
        }
        this.field2582 = arg0.method731(-77);
        this.field2569 = arg0.method731(102);
        this.field2584 = arg0.method721(24);
        this.field2574 = arg0.method721(60);
        this.field2570 = new class253();
        this.field2588 = new class93();
        this.field2570.method1766(arg0, this.field2588);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I", line = 77)
    public final int[] method1167(int arg0, int arg1) {
        class231.method1634(field2575, 0, arg0);
        if (arg1 < 10) {
            return field2575;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2581.method754();
        this.field2568.method754();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2573 != null) {
            this.field2573.method754();
            this.field2572.method754();
            var5 = (int) ((double) (this.field2573.field1532 - this.field2573.field1533) * 32.768D / var3);
            var6 = (int) ((double) this.field2573.field1533 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2580 != null) {
            this.field2580.method754();
            this.field2587.method754();
            var8 = (int) ((double) (this.field2580.field1532 - this.field2580.field1533) * 32.768D / var3);
            var9 = (int) ((double) this.field2580.field1533 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2571[var11] != 0) {
                field2591[var11] = 0;
                field2592[var11] = (int) ((double) this.field2579[var11] * var3);
                field2590[var11] = (this.field2571[var11] << 14) / 100;
                field2589[var11] = (int) ((double) (this.field2581.field1532 - this.field2581.field1533) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2586[var11]) / var3);
                field2585[var11] = (int) ((double) this.field2581.field1533 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2581.method751(arg0);
            int var14 = this.field2568.method751(arg0);
            if (this.field2573 != null) {
                int var15 = this.field2573.method751(arg0);
                int var16 = this.field2572.method751(arg0);
                var13 += this.method1169(var7, var16, this.field2573.field1534) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2580 != null) {
                int var17 = this.field2580.method751(arg0);
                int var18 = this.field2587.method751(arg0);
                var14 = var14 * ((this.method1169(var10, var18, this.field2580.field1534) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2571[var19] != 0) {
                    int var20 = field2592[var19] + var12;
                    if (var20 < arg0) {
                        field2575[var20] += this.method1169(field2591[var19], field2590[var19] * var14 >> 15, this.field2581.field1534);
                        field2591[var19] += (field2589[var19] * var13 >> 16) + field2585[var19];
                    }
                }
            }
        }
        if (this.field2583 != null) {
            this.field2583.method754();
            this.field2577.method754();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2583.method751(arg0);
                int var26 = this.field2577.method751(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2583.field1532 - this.field2583.field1533) * var25 >> 8) + this.field2583.field1533;
                } else {
                    var27 = ((this.field2583.field1532 - this.field2583.field1533) * var26 >> 8) + this.field2583.field1533;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2575[var24] = 0;
                }
            }
        }
        if (this.field2582 > 0 && this.field2569 > 0) {
            int var28 = (int) ((double) this.field2582 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2575[var29] += field2575[var29 - var28] * this.field2569 / 100;
            }
        }
        if (this.field2570.field4306[0] > 0 || this.field2570.field4306[1] > 0) {
            this.field2588.method754();
            int var30 = this.field2588.method751(arg0 + 1);
            int var31 = this.field2570.method1765(0, (float) var30 / 65536.0F);
            int var32 = this.field2570.method1765(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2575[var31 + var33] * (long) class253.field4302 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2575[var31 + var33 - var36 - 1] * (long) class253.field4307[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2575[var33 - var37 - 1] * (long) class253.field4307[1][var37] >> 16);
                    }
                    field2575[var33] = var35;
                    var30 = this.field2588.method751(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2575[var31 + var33] * (long) class253.field4302 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2575[var31 + var33 - var40 - 1] * (long) class253.field4307[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2575[var33 - var41 - 1] * (long) class253.field4307[1][var41] >> 16);
                        }
                        field2575[var33] = var39;
                        var30 = this.field2588.method751(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2575[var31 + var33 - var43 - 1] * (long) class253.field4307[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2575[var33 - var44 - 1] * (long) class253.field4307[1][var44] >> 16);
                            }
                            field2575[var33] = var42;
                            this.field2588.method751(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2570.method1765(0, (float) var30 / 65536.0F);
                    var32 = this.field2570.method1765(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2575[var46] < -32768) {
                field2575[var46] = -32768;
            }
            if (field2575[var46] > 32767) {
                field2575[var46] = 32767;
            }
        }
        return field2575;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 367)
    public static void method1168() {
        field2575 = null;
        field2578 = null;
        field2576 = null;
        field2591 = null;
        field2592 = null;
        field2590 = null;
        field2589 = null;
        field2585 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2578[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2576 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2576[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2575 = new int[220500];
        field2585 = new int[5];
        field2589 = new int[5];
        field2590 = new int[5];
        field2591 = new int[5];
        field2592 = new int[5];
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I", line = 424)
    private final int method1169(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2576[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2578[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}

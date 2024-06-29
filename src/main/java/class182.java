import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class182 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field2492 = 0;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
    private int[] field2499 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field2495 = 500;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
    private int[] field2498 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
    private int[] field2497 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field2505 = 0;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    private int field2514 = 100;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
    private static int[] field2508 = new int[32768];

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
    private static int[] field2503;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    private static int[] field2501;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[I")
    private static int[] field2511;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    private static int[] field2509;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[I")
    private static int[] field2513;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[I")
    private static int[] field2510;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[I")
    private static int[] field2512;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lqa;")
    private class321 field2490;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lqa;")
    private class321 field2491;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lqa;")
    private class321 field2493;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lqa;")
    private class321 field2494;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lqa;")
    private class321 field2500;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lqa;")
    private class321 field2502;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lqa;")
    private class321 field2504;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lqa;")
    private class321 field2506;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lqa;")
    private class321 field2507;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lwc;")
    private class57 field2496;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 3)
    public static void method1267() {
        field2501 = null;
        field2508 = null;
        field2503 = null;
        field2509 = null;
        field2511 = null;
        field2510 = null;
        field2512 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I", line = 14)
    private final int method1268(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2503[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2508[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 46)
    public final int[] method1269(int arg0, int arg1) {
        class281.method1939(field2501, 0, arg0);
        if (arg1 < 10) {
            return field2501;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2493.method2246();
        this.field2506.method2246();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2502 != null) {
            this.field2502.method2246();
            this.field2490.method2246();
            var5 = (int) ((double) (this.field2502.field4878 - this.field2502.field4881) * 32.768D / var3);
            var6 = (int) ((double) this.field2502.field4881 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2507 != null) {
            this.field2507.method2246();
            this.field2504.method2246();
            var8 = (int) ((double) (this.field2507.field4878 - this.field2507.field4881) * 32.768D / var3);
            var9 = (int) ((double) this.field2507.field4881 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2497[var11] != 0) {
                field2509[var11] = 0;
                field2511[var11] = (int) ((double) this.field2498[var11] * var3);
                field2510[var11] = (this.field2497[var11] << 14) / 100;
                field2512[var11] = (int) ((double) (this.field2493.field4878 - this.field2493.field4881) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2499[var11]) / var3);
                field2513[var11] = (int) ((double) this.field2493.field4881 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2493.method2244(arg0);
            int var14 = this.field2506.method2244(arg0);
            if (this.field2502 != null) {
                int var15 = this.field2502.method2244(arg0);
                int var16 = this.field2490.method2244(arg0);
                var13 += this.method1268(var7, var16, this.field2502.field4879) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2507 != null) {
                int var17 = this.field2507.method2244(arg0);
                int var18 = this.field2504.method2244(arg0);
                var14 = var14 * ((this.method1268(var10, var18, this.field2507.field4879) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2497[var19] != 0) {
                    int var20 = field2511[var19] + var12;
                    if (var20 < arg0) {
                        field2501[var20] += this.method1268(field2509[var19], field2510[var19] * var14 >> 15, this.field2493.field4879);
                        field2509[var19] += (field2512[var19] * var13 >> 16) + field2513[var19];
                    }
                }
            }
        }
        if (this.field2500 != null) {
            this.field2500.method2246();
            this.field2494.method2246();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2500.method2244(arg0);
                int var26 = this.field2494.method2244(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2500.field4878 - this.field2500.field4881) * var25 >> 8) + this.field2500.field4881;
                } else {
                    var27 = ((this.field2500.field4878 - this.field2500.field4881) * var26 >> 8) + this.field2500.field4881;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2501[var24] = 0;
                }
            }
        }
        if (this.field2492 > 0 && this.field2514 > 0) {
            int var28 = (int) ((double) this.field2492 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2501[var29] += field2501[var29 - var28] * this.field2514 / 100;
            }
        }
        if (this.field2496.field782[0] > 0 || this.field2496.field782[1] > 0) {
            this.field2491.method2246();
            int var30 = this.field2491.method2244(arg0 + 1);
            int var31 = this.field2496.method401(0, (float) var30 / 65536.0F);
            int var32 = this.field2496.method401(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2501[var31 + var33] * (long) class57.field786 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2501[var31 + var33 - var36 - 1] * (long) class57.field788[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2501[var33 - var37 - 1] * (long) class57.field788[1][var37] >> 16);
                    }
                    field2501[var33] = var35;
                    var30 = this.field2491.method2244(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2501[var31 + var33] * (long) class57.field786 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2501[var31 + var33 - var40 - 1] * (long) class57.field788[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2501[var33 - var41 - 1] * (long) class57.field788[1][var41] >> 16);
                        }
                        field2501[var33] = var39;
                        var30 = this.field2491.method2244(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2501[var31 + var33 - var43 - 1] * (long) class57.field788[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2501[var33 - var44 - 1] * (long) class57.field788[1][var44] >> 16);
                            }
                            field2501[var33] = var42;
                            this.field2491.method2244(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2496.method401(0, (float) var30 / 65536.0F);
                    var32 = this.field2496.method401(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2501[var46] < -32768) {
                field2501[var46] = -32768;
            }
            if (field2501[var46] > 32767) {
                field2501[var46] = 32767;
            }
        }
        return field2501;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lcg;)V", line = 342)
    public final void method1270(class316 arg0) {
        this.field2493 = new class321();
        this.field2493.method2245(arg0);
        this.field2506 = new class321();
        this.field2506.method2245(arg0);
        int var2 = arg0.method2219(16448);
        if (var2 != 0) {
            arg0.field4777--;
            this.field2502 = new class321();
            this.field2502.method2245(arg0);
            this.field2490 = new class321();
            this.field2490.method2245(arg0);
        }
        int var3 = arg0.method2219(16448);
        if (var3 != 0) {
            arg0.field4777--;
            this.field2507 = new class321();
            this.field2507.method2245(arg0);
            this.field2504 = new class321();
            this.field2504.method2245(arg0);
        }
        int var4 = arg0.method2219(16448);
        if (var4 != 0) {
            arg0.field4777--;
            this.field2500 = new class321();
            this.field2500.method2245(arg0);
            this.field2494 = new class321();
            this.field2494.method2245(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2193(49152);
            if (var6 == 0) {
                break;
            }
            this.field2497[var5] = var6;
            this.field2499[var5] = arg0.method2173(true);
            this.field2498[var5] = arg0.method2193(49152);
        }
        this.field2492 = arg0.method2193(49152);
        this.field2514 = arg0.method2193(49152);
        this.field2495 = arg0.method2220((byte) 82);
        this.field2505 = arg0.method2220((byte) 85);
        this.field2496 = new class57();
        this.field2491 = new class321();
        this.field2496.method399(arg0, this.field2491);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2508[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2503 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2503[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2501 = new int[220500];
        field2511 = new int[5];
        field2509 = new int[5];
        field2513 = new int[5];
        field2510 = new int[5];
        field2512 = new int[5];
    }
}

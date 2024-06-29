import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
    private int[] field2343 = new int[5];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
    private int[] field2345 = new int[5];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field2353 = 500;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    private int field2348 = 100;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[I")
    private int[] field2354 = new int[5];

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field2356 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field2361 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    private static int[] field2346 = new int[32768];

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[I")
    private static int[] field2350;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
    private static int[] field2357;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[I")
    private static int[] field2360;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[I")
    private static int[] field2362;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
    private static int[] field2364;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "[I")
    private static int[] field2366;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    private static int[] field2363;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lp;")
    private class107 field2342;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lha;")
    private class49 field2344;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lha;")
    private class49 field2347;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lha;")
    private class49 field2349;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lha;")
    private class49 field2351;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lha;")
    private class49 field2352;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lha;")
    private class49 field2355;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lha;")
    private class49 field2358;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lha;")
    private class49 field2359;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lha;")
    private class49 field2365;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public static void method812() {
        field2357 = null;
        field2346 = null;
        field2350 = null;
        field2363 = null;
        field2362 = null;
        field2364 = null;
        field2366 = null;
        field2360 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ls;)V")
    public final void method813(class128 arg0) {
        this.field2344 = new class49();
        this.field2344.method345(arg0);
        this.field2355 = new class49();
        this.field2355.method345(arg0);
        int var2 = arg0.method1025(255);
        if (var2 != 0) {
            arg0.field2873--;
            this.field2365 = new class49();
            this.field2365.method345(arg0);
            this.field2358 = new class49();
            this.field2358.method345(arg0);
        }
        int var3 = arg0.method1025(255);
        if (var3 != 0) {
            arg0.field2873--;
            this.field2352 = new class49();
            this.field2352.method345(arg0);
            this.field2349 = new class49();
            this.field2349.method345(arg0);
        }
        int var4 = arg0.method1025(255);
        if (var4 != 0) {
            arg0.field2873--;
            this.field2347 = new class49();
            this.field2347.method345(arg0);
            this.field2359 = new class49();
            this.field2359.method345(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1001((byte) -46);
            if (var6 == 0) {
                break;
            }
            this.field2354[var5] = var6;
            this.field2343[var5] = arg0.method1029(11932);
            this.field2345[var5] = arg0.method1001((byte) -48);
        }
        this.field2361 = arg0.method1001((byte) -54);
        this.field2348 = arg0.method1001((byte) -50);
        this.field2353 = arg0.method1041(212464720);
        this.field2356 = arg0.method1041(212464720);
        this.field2342 = new class107();
        this.field2351 = new class49();
        this.field2342.method858(arg0, this.field2351);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
    private final int method814(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2350[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2346[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
    public final int[] method815(int arg0, int arg1) {
        class78.method625(field2357, 0, arg0);
        if (arg1 < 10) {
            return field2357;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2344.method347();
        this.field2355.method347();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2365 != null) {
            this.field2365.method347();
            this.field2358.method347();
            var5 = (int) ((double) (this.field2365.field1136 - this.field2365.field1137) * 32.768D / var3);
            var6 = (int) ((double) this.field2365.field1137 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2352 != null) {
            this.field2352.method347();
            this.field2349.method347();
            var8 = (int) ((double) (this.field2352.field1136 - this.field2352.field1137) * 32.768D / var3);
            var9 = (int) ((double) this.field2352.field1137 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2354[var11] != 0) {
                field2363[var11] = 0;
                field2362[var11] = (int) ((double) this.field2345[var11] * var3);
                field2364[var11] = (this.field2354[var11] << 14) / 100;
                field2366[var11] = (int) ((double) (this.field2344.field1136 - this.field2344.field1137) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2343[var11]) / var3);
                field2360[var11] = (int) ((double) this.field2344.field1137 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2344.method346(arg0);
            int var40 = this.field2355.method346(arg0);
            if (this.field2365 != null) {
                int var41 = this.field2365.method346(arg0);
                int var42 = this.field2358.method346(arg0);
                var39 += this.method814(var7, var42, this.field2365.field1138) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2352 != null) {
                int var43 = this.field2352.method346(arg0);
                int var44 = this.field2349.method346(arg0);
                var40 = var40 * ((this.method814(var10, var44, this.field2352.field1138) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2354[var45] != 0) {
                    int var46 = field2362[var45] + var12;
                    if (var46 < arg0) {
                        field2357[var46] += this.method814(field2363[var45], field2364[var45] * var40 >> 15, this.field2344.field1138);
                        field2363[var45] += (field2366[var45] * var39 >> 16) + field2360[var45];
                    }
                }
            }
        }
        if (this.field2347 != null) {
            this.field2347.method347();
            this.field2359.method347();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2347.method346(arg0);
                int var18 = this.field2359.method346(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2347.field1136 - this.field2347.field1137) * var17 >> 8) + this.field2347.field1137;
                } else {
                    var19 = ((this.field2347.field1136 - this.field2347.field1137) * var18 >> 8) + this.field2347.field1137;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2357[var16] = 0;
                }
            }
        }
        if (this.field2361 > 0 && this.field2348 > 0) {
            int var20 = (int) ((double) this.field2361 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2357[var21] += field2357[var21 - var20] * this.field2348 / 100;
            }
        }
        if (this.field2342.field2451[0] > 0 || this.field2342.field2451[1] > 0) {
            this.field2351.method347();
            int var22 = this.field2351.method346(arg0 + 1);
            int var23 = this.field2342.method856(0, (float) var22 / 65536.0F);
            int var24 = this.field2342.method856(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2357[var23 + var25] * (long) class107.field2454 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2357[var23 + var25 - var36 - 1] * (long) class107.field2450[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2357[var25 - var37 - 1] * (long) class107.field2450[1][var37] >> 16);
                    }
                    field2357[var25] = var35;
                    var22 = this.field2351.method346(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2357[var23 + var25] * (long) class107.field2454 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2357[var23 + var25 - var33 - 1] * (long) class107.field2450[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2357[var25 - var34 - 1] * (long) class107.field2450[1][var34] >> 16);
                        }
                        field2357[var25] = var32;
                        var22 = this.field2351.method346(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2357[var23 + var25 - var29 - 1] * (long) class107.field2450[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2357[var25 - var30 - 1] * (long) class107.field2450[1][var30] >> 16);
                            }
                            field2357[var25] = var28;
                            this.field2351.method346(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2342.method856(0, (float) var22 / 65536.0F);
                    var24 = this.field2342.method856(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2357[var38] < -32768) {
                field2357[var38] = -32768;
            }
            if (field2357[var38] > 32767) {
                field2357[var38] = 32767;
            }
        }
        return field2357;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2346[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2350 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2350[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2357 = new int[220500];
        field2360 = new int[5];
        field2362 = new int[5];
        field2364 = new int[5];
        field2366 = new int[5];
        field2363 = new int[5];
    }
}

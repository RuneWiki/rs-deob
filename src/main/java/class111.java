import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
    private int[] field2355 = new int[5];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field2358 = 0;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    private int field2365 = 100;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field2363 = 500;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    private int[] field2353 = new int[5];

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
    private int[] field2370 = new int[5];

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    private int field2372 = 0;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
    private static int[] field2361 = new int[32768];

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
    private static int[] field2357;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[I")
    private static int[] field2359;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[I")
    private static int[] field2374;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[I")
    private static int[] field2373;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "[I")
    private static int[] field2376;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[I")
    private static int[] field2377;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[I")
    private static int[] field2375;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lpb;")
    private class106 field2354;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lpb;")
    private class106 field2356;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lpb;")
    private class106 field2360;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lpb;")
    private class106 field2362;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lpb;")
    private class106 field2364;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lpb;")
    private class106 field2366;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Lpb;")
    private class106 field2368;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lpb;")
    private class106 field2369;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lpb;")
    private class106 field2371;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Leb;")
    private class31 field2367;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lbe;)V")
    public final void method914(class13 arg0) {
        this.field2360 = new class106();
        this.field2360.method858(arg0);
        this.field2362 = new class106();
        this.field2362.method858(arg0);
        int var2 = arg0.method142(27467);
        if (var2 != 0) {
            arg0.field309--;
            this.field2366 = new class106();
            this.field2366.method858(arg0);
            this.field2368 = new class106();
            this.field2368.method858(arg0);
        }
        int var3 = arg0.method142(27467);
        if (var3 != 0) {
            arg0.field309--;
            this.field2354 = new class106();
            this.field2354.method858(arg0);
            this.field2371 = new class106();
            this.field2371.method858(arg0);
        }
        int var4 = arg0.method142(27467);
        if (var4 != 0) {
            arg0.field309--;
            this.field2364 = new class106();
            this.field2364.method858(arg0);
            this.field2369 = new class106();
            this.field2369.method858(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method147(false);
            if (var6 == 0) {
                break;
            }
            this.field2353[var5] = var6;
            this.field2355[var5] = arg0.method155(49152);
            this.field2370[var5] = arg0.method147(false);
        }
        this.field2372 = arg0.method147(false);
        this.field2365 = arg0.method147(false);
        this.field2363 = arg0.method105(1375221240);
        this.field2358 = arg0.method105(1375221240);
        this.field2367 = new class31();
        this.field2356 = new class106();
        this.field2367.method321(arg0, this.field2356);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
    public final int[] method915(int arg0, int arg1) {
        class26.method236(field2359, 0, arg0);
        if (arg1 < 10) {
            return field2359;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2360.method860();
        this.field2362.method860();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2366 != null) {
            this.field2366.method860();
            this.field2368.method860();
            var5 = (int) ((double) (this.field2366.field2233 - this.field2366.field2229) * 32.768D / var3);
            var6 = (int) ((double) this.field2366.field2229 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2354 != null) {
            this.field2354.method860();
            this.field2371.method860();
            var8 = (int) ((double) (this.field2354.field2233 - this.field2354.field2229) * 32.768D / var3);
            var9 = (int) ((double) this.field2354.field2229 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2353[var11] != 0) {
                field2374[var11] = 0;
                field2376[var11] = (int) ((double) this.field2370[var11] * var3);
                field2373[var11] = (this.field2353[var11] << 14) / 100;
                field2375[var11] = (int) ((double) (this.field2360.field2233 - this.field2360.field2229) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2355[var11]) / var3);
                field2377[var11] = (int) ((double) this.field2360.field2229 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2360.method859(arg0);
            int var40 = this.field2362.method859(arg0);
            if (this.field2366 != null) {
                int var41 = this.field2366.method859(arg0);
                int var42 = this.field2368.method859(arg0);
                var39 += this.method917(var7, var42, this.field2366.field2230) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2354 != null) {
                int var43 = this.field2354.method859(arg0);
                int var44 = this.field2371.method859(arg0);
                var40 = var40 * ((this.method917(var10, var44, this.field2354.field2230) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2353[var45] != 0) {
                    int var46 = field2376[var45] + var12;
                    if (var46 < arg0) {
                        field2359[var46] += this.method917(field2374[var45], field2373[var45] * var40 >> 15, this.field2360.field2230);
                        field2374[var45] += (field2375[var45] * var39 >> 16) + field2377[var45];
                    }
                }
            }
        }
        if (this.field2364 != null) {
            this.field2364.method860();
            this.field2369.method860();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2364.method859(arg0);
                int var18 = this.field2369.method859(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2364.field2233 - this.field2364.field2229) * var17 >> 8) + this.field2364.field2229;
                } else {
                    var19 = ((this.field2364.field2233 - this.field2364.field2229) * var18 >> 8) + this.field2364.field2229;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2359[var16] = 0;
                }
            }
        }
        if (this.field2372 > 0 && this.field2365 > 0) {
            int var20 = (int) ((double) this.field2372 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2359[var21] += field2359[var21 - var20] * this.field2365 / 100;
            }
        }
        if (this.field2367.field688[0] > 0 || this.field2367.field688[1] > 0) {
            this.field2356.method860();
            int var22 = this.field2356.method859(arg0 + 1);
            int var23 = this.field2367.method323(0, (float) var22 / 65536.0F);
            int var24 = this.field2367.method323(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2359[var23 + var25] * (long) class31.field681 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2359[var23 + var25 - var36 - 1] * (long) class31.field687[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2359[var25 - var37 - 1] * (long) class31.field687[1][var37] >> 16);
                    }
                    field2359[var25] = var35;
                    var22 = this.field2356.method859(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2359[var23 + var25] * (long) class31.field681 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2359[var23 + var25 - var33 - 1] * (long) class31.field687[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2359[var25 - var34 - 1] * (long) class31.field687[1][var34] >> 16);
                        }
                        field2359[var25] = var32;
                        var22 = this.field2356.method859(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2359[var23 + var25 - var29 - 1] * (long) class31.field687[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2359[var25 - var30 - 1] * (long) class31.field687[1][var30] >> 16);
                            }
                            field2359[var25] = var28;
                            this.field2356.method859(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2367.method323(0, (float) var22 / 65536.0F);
                    var24 = this.field2367.method323(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2359[var38] < -32768) {
                field2359[var38] = -32768;
            }
            if (field2359[var38] > 32767) {
                field2359[var38] = 32767;
            }
        }
        return field2359;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static void method916() {
        field2359 = null;
        field2361 = null;
        field2357 = null;
        field2374 = null;
        field2376 = null;
        field2373 = null;
        field2375 = null;
        field2377 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)I")
    private final int method917(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2357[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2361[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2361[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2357 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2357[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2359 = new int[220500];
        field2374 = new int[5];
        field2373 = new int[5];
        field2376 = new int[5];
        field2377 = new int[5];
        field2375 = new int[5];
    }
}

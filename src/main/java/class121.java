import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class121 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field2274 = 500;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    private int[] field2270 = new int[5];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
    private int[] field2280 = new int[5];

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    private int field2282 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    private int field2286 = 100;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public int field2284 = 0;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
    private int[] field2292 = new int[5];

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[I")
    private static int[] field2283 = new int[32768];

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
    private static int[] field2287;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
    private static int[] field2275;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    private static int[] field2289;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    private static int[] field2290;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
    private static int[] field2294;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    private static int[] field2291;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    private static int[] field2293;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lic;")
    private class138 field2271;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lji;")
    private class200 field2272;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lji;")
    private class200 field2273;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lji;")
    private class200 field2276;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lji;")
    private class200 field2277;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lji;")
    private class200 field2278;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lji;")
    private class200 field2279;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lji;")
    private class200 field2281;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lji;")
    private class200 field2285;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lji;")
    private class200 field2288;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lpg;)V")
    public final void method947(class81 arg0) {
        this.field2276 = new class200();
        this.field2276.method1433(arg0);
        this.field2285 = new class200();
        this.field2285.method1433(arg0);
        int var2 = arg0.method622(true);
        if (var2 != 0) {
            arg0.field1541--;
            this.field2272 = new class200();
            this.field2272.method1433(arg0);
            this.field2281 = new class200();
            this.field2281.method1433(arg0);
        }
        int var3 = arg0.method622(true);
        if (var3 != 0) {
            arg0.field1541--;
            this.field2278 = new class200();
            this.field2278.method1433(arg0);
            this.field2277 = new class200();
            this.field2277.method1433(arg0);
        }
        int var4 = arg0.method622(true);
        if (var4 != 0) {
            arg0.field1541--;
            this.field2273 = new class200();
            this.field2273.method1433(arg0);
            this.field2279 = new class200();
            this.field2279.method1433(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method636(41);
            if (var6 == 0) {
                break;
            }
            this.field2270[var5] = var6;
            this.field2280[var5] = arg0.method657((byte) 14);
            this.field2292[var5] = arg0.method636(63);
        }
        this.field2282 = arg0.method636(38);
        this.field2286 = arg0.method636(44);
        this.field2274 = arg0.method658(102);
        this.field2284 = arg0.method658(104);
        this.field2271 = new class138();
        this.field2288 = new class200();
        this.field2271.method1068(arg0, this.field2288);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public static void method948() {
        field2275 = null;
        field2283 = null;
        field2287 = null;
        field2290 = null;
        field2293 = null;
        field2291 = null;
        field2289 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    public final int[] method949(int arg0, int arg1) {
        class241.method1668(field2275, 0, arg0);
        if (arg1 < 10) {
            return field2275;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2276.method1435();
        this.field2285.method1435();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2272 != null) {
            this.field2272.method1435();
            this.field2281.method1435();
            var5 = (int) ((double) (this.field2272.field3579 - this.field2272.field3577) * 32.768D / var3);
            var6 = (int) ((double) this.field2272.field3577 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2278 != null) {
            this.field2278.method1435();
            this.field2277.method1435();
            var8 = (int) ((double) (this.field2278.field3579 - this.field2278.field3577) * 32.768D / var3);
            var9 = (int) ((double) this.field2278.field3577 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2270[var11] != 0) {
                field2290[var11] = 0;
                field2293[var11] = (int) ((double) this.field2292[var11] * var3);
                field2291[var11] = (this.field2270[var11] << 14) / 100;
                field2289[var11] = (int) ((double) (this.field2276.field3579 - this.field2276.field3577) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2280[var11]) / var3);
                field2294[var11] = (int) ((double) this.field2276.field3577 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2276.method1432(arg0);
            int var40 = this.field2285.method1432(arg0);
            if (this.field2272 != null) {
                int var41 = this.field2272.method1432(arg0);
                int var42 = this.field2281.method1432(arg0);
                var39 += this.method950(var7, var42, this.field2272.field3581) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2278 != null) {
                int var43 = this.field2278.method1432(arg0);
                int var44 = this.field2277.method1432(arg0);
                var40 = var40 * ((this.method950(var10, var44, this.field2278.field3581) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2270[var45] != 0) {
                    int var46 = field2293[var45] + var12;
                    if (var46 < arg0) {
                        field2275[var46] += this.method950(field2290[var45], field2291[var45] * var40 >> 15, this.field2276.field3581);
                        field2290[var45] += (field2289[var45] * var39 >> 16) + field2294[var45];
                    }
                }
            }
        }
        if (this.field2273 != null) {
            this.field2273.method1435();
            this.field2279.method1435();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2273.method1432(arg0);
                int var18 = this.field2279.method1432(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2273.field3579 - this.field2273.field3577) * var17 >> 8) + this.field2273.field3577;
                } else {
                    var19 = ((this.field2273.field3579 - this.field2273.field3577) * var18 >> 8) + this.field2273.field3577;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2275[var16] = 0;
                }
            }
        }
        if (this.field2282 > 0 && this.field2286 > 0) {
            int var20 = (int) ((double) this.field2282 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2275[var21] += field2275[var21 - var20] * this.field2286 / 100;
            }
        }
        if (this.field2271.field2658[0] > 0 || this.field2271.field2658[1] > 0) {
            this.field2288.method1435();
            int var22 = this.field2288.method1432(arg0 + 1);
            int var23 = this.field2271.method1069(0, (float) var22 / 65536.0F);
            int var24 = this.field2271.method1069(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2275[var23 + var25] * (long) class138.field2659 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2275[var23 + var25 - var36 - 1] * (long) class138.field2657[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2275[var25 - var37 - 1] * (long) class138.field2657[1][var37] >> 16);
                    }
                    field2275[var25] = var35;
                    var22 = this.field2288.method1432(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2275[var23 + var25] * (long) class138.field2659 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2275[var23 + var25 - var33 - 1] * (long) class138.field2657[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2275[var25 - var34 - 1] * (long) class138.field2657[1][var34] >> 16);
                        }
                        field2275[var25] = var32;
                        var22 = this.field2288.method1432(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2275[var23 + var25 - var29 - 1] * (long) class138.field2657[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2275[var25 - var30 - 1] * (long) class138.field2657[1][var30] >> 16);
                            }
                            field2275[var25] = var28;
                            this.field2288.method1432(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2271.method1069(0, (float) var22 / 65536.0F);
                    var24 = this.field2271.method1069(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2275[var38] < -32768) {
                field2275[var38] = -32768;
            }
            if (field2275[var38] > 32767) {
                field2275[var38] = 32767;
            }
        }
        return field2275;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    private final int method950(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2287[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2283[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2283[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2287 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2287[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2275 = new int[220500];
        field2289 = new int[5];
        field2290 = new int[5];
        field2294 = new int[5];
        field2291 = new int[5];
        field2293 = new int[5];
    }
}

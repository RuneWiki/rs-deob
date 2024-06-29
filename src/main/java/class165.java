import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class165 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    private int[] field2388 = new int[5];

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field2389 = 0;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field2384 = 500;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[I")
    private int[] field2398 = new int[5];

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "[I")
    private int[] field2400 = new int[5];

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    private int field2395 = 100;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    private int field2405 = 0;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    private static int[] field2385 = new int[32768];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[I")
    private static int[] field2393;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    private static int[] field2391;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "[I")
    private static int[] field2401;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "[I")
    private static int[] field2399;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
    private static int[] field2402;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "[I")
    private static int[] field2404;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "[I")
    private static int[] field2403;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljf;")
    private class199 field2396;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lbj;")
    private class46 field2381;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lbj;")
    private class46 field2382;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lbj;")
    private class46 field2383;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lbj;")
    private class46 field2386;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lbj;")
    private class46 field2387;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lbj;")
    private class46 field2390;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lbj;")
    private class46 field2392;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lbj;")
    private class46 field2394;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lbj;")
    private class46 field2397;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    private final int method1101(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2393[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2385[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
    public final int[] method1102(int arg0, int arg1) {
        class164.method1095(field2391, 0, arg0);
        if (arg1 < 10) {
            return field2391;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2381.method305();
        this.field2387.method305();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2394 != null) {
            this.field2394.method305();
            this.field2397.method305();
            var5 = (int) ((double) (this.field2394.field647 - this.field2394.field649) * 32.768D / var3);
            var6 = (int) ((double) this.field2394.field649 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2383 != null) {
            this.field2383.method305();
            this.field2392.method305();
            var8 = (int) ((double) (this.field2383.field647 - this.field2383.field649) * 32.768D / var3);
            var9 = (int) ((double) this.field2383.field649 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2388[var11] != 0) {
                field2404[var11] = 0;
                field2403[var11] = (int) ((double) this.field2398[var11] * var3);
                field2401[var11] = (this.field2388[var11] << 14) / 100;
                field2402[var11] = (int) ((double) (this.field2381.field647 - this.field2381.field649) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2400[var11]) / var3);
                field2399[var11] = (int) ((double) this.field2381.field649 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2381.method306(arg0);
            int var40 = this.field2387.method306(arg0);
            if (this.field2394 != null) {
                int var41 = this.field2394.method306(arg0);
                int var42 = this.field2397.method306(arg0);
                var39 += this.method1101(var7, var42, this.field2394.field645) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2383 != null) {
                int var43 = this.field2383.method306(arg0);
                int var44 = this.field2392.method306(arg0);
                var40 = var40 * ((this.method1101(var10, var44, this.field2383.field645) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2388[var45] != 0) {
                    int var46 = field2403[var45] + var12;
                    if (var46 < arg0) {
                        field2391[var46] += this.method1101(field2404[var45], field2401[var45] * var40 >> 15, this.field2381.field645);
                        field2404[var45] += (field2402[var45] * var39 >> 16) + field2399[var45];
                    }
                }
            }
        }
        if (this.field2390 != null) {
            this.field2390.method305();
            this.field2382.method305();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2390.method306(arg0);
                int var18 = this.field2382.method306(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2390.field647 - this.field2390.field649) * var17 >> 8) + this.field2390.field649;
                } else {
                    var19 = ((this.field2390.field647 - this.field2390.field649) * var18 >> 8) + this.field2390.field649;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2391[var16] = 0;
                }
            }
        }
        if (this.field2405 > 0 && this.field2395 > 0) {
            int var20 = (int) ((double) this.field2405 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2391[var21] += field2391[var21 - var20] * this.field2395 / 100;
            }
        }
        if (this.field2396.field2876[0] > 0 || this.field2396.field2876[1] > 0) {
            this.field2386.method305();
            int var22 = this.field2386.method306(arg0 + 1);
            int var23 = this.field2396.method1291(0, (float) var22 / 65536.0F);
            int var24 = this.field2396.method1291(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2391[var23 + var25] * (long) class199.field2878 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2391[var23 + var25 - var36 - 1] * (long) class199.field2879[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2391[var25 - var37 - 1] * (long) class199.field2879[1][var37] >> 16);
                    }
                    field2391[var25] = var35;
                    var22 = this.field2386.method306(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2391[var23 + var25] * (long) class199.field2878 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2391[var23 + var25 - var33 - 1] * (long) class199.field2879[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2391[var25 - var34 - 1] * (long) class199.field2879[1][var34] >> 16);
                        }
                        field2391[var25] = var32;
                        var22 = this.field2386.method306(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2391[var23 + var25 - var29 - 1] * (long) class199.field2879[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2391[var25 - var30 - 1] * (long) class199.field2879[1][var30] >> 16);
                            }
                            field2391[var25] = var28;
                            this.field2386.method306(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2396.method1291(0, (float) var22 / 65536.0F);
                    var24 = this.field2396.method1291(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2391[var38] < -32768) {
                field2391[var38] = -32768;
            }
            if (field2391[var38] > 32767) {
                field2391[var38] = 32767;
            }
        }
        return field2391;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkl;)V")
    public final void method1103(class114 arg0) {
        this.field2381 = new class46();
        this.field2381.method307(arg0);
        this.field2387 = new class46();
        this.field2387.method307(arg0);
        int var2 = arg0.method760(false);
        if (var2 != 0) {
            arg0.field1673--;
            this.field2394 = new class46();
            this.field2394.method307(arg0);
            this.field2397 = new class46();
            this.field2397.method307(arg0);
        }
        int var3 = arg0.method760(false);
        if (var3 != 0) {
            arg0.field1673--;
            this.field2383 = new class46();
            this.field2383.method307(arg0);
            this.field2392 = new class46();
            this.field2392.method307(arg0);
        }
        int var4 = arg0.method760(false);
        if (var4 != 0) {
            arg0.field1673--;
            this.field2390 = new class46();
            this.field2390.method307(arg0);
            this.field2382 = new class46();
            this.field2382.method307(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method787((byte) -74);
            if (var6 == 0) {
                break;
            }
            this.field2388[var5] = var6;
            this.field2400[var5] = arg0.method736(-128);
            this.field2398[var5] = arg0.method787((byte) -116);
        }
        this.field2405 = arg0.method787((byte) 119);
        this.field2395 = arg0.method787((byte) 97);
        this.field2384 = arg0.method756(-29901);
        this.field2389 = arg0.method756(-29901);
        this.field2396 = new class199();
        this.field2386 = new class46();
        this.field2396.method1295(arg0, this.field2386);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
    public static void method1104() {
        field2391 = null;
        field2385 = null;
        field2393 = null;
        field2404 = null;
        field2403 = null;
        field2401 = null;
        field2402 = null;
        field2399 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2385[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2393 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2393[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2391 = new int[220500];
        field2401 = new int[5];
        field2399 = new int[5];
        field2402 = new int[5];
        field2404 = new int[5];
        field2403 = new int[5];
    }
}

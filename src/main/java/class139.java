import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class139 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field2390 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    private int[] field2399 = new int[5];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    private int[] field2403 = new int[5];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    private int[] field2391 = new int[5];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private int field2392 = 0;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field2400 = 500;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    private int field2405 = 100;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
    private static int[] field2401 = new int[32768];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[I")
    private static int[] field2393;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "[I")
    private static int[] field2409;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "[I")
    private static int[] field2412;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
    private static int[] field2413;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    private static int[] field2411;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[I")
    private static int[] field2414;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "[I")
    private static int[] field2410;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lki;")
    private class60 field2396;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lai;")
    private class84 field2394;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lai;")
    private class84 field2395;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lai;")
    private class84 field2397;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lai;")
    private class84 field2398;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lai;")
    private class84 field2402;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lai;")
    private class84 field2404;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lai;")
    private class84 field2406;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lai;")
    private class84 field2407;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lai;")
    private class84 field2408;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lik;)V")
    public final void method914(class247 arg0) {
        this.field2404 = new class84();
        this.field2404.method578(arg0);
        this.field2398 = new class84();
        this.field2398.method578(arg0);
        int var2 = arg0.method1711((byte) -67);
        if (var2 != 0) {
            arg0.field4224--;
            this.field2395 = new class84();
            this.field2395.method578(arg0);
            this.field2394 = new class84();
            this.field2394.method578(arg0);
        }
        int var3 = arg0.method1711((byte) -67);
        if (var3 != 0) {
            arg0.field4224--;
            this.field2407 = new class84();
            this.field2407.method578(arg0);
            this.field2397 = new class84();
            this.field2397.method578(arg0);
        }
        int var4 = arg0.method1711((byte) -67);
        if (var4 != 0) {
            arg0.field4224--;
            this.field2402 = new class84();
            this.field2402.method578(arg0);
            this.field2406 = new class84();
            this.field2406.method578(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1710(2006);
            if (var6 == 0) {
                break;
            }
            this.field2391[var5] = var6;
            this.field2399[var5] = arg0.method1663(false);
            this.field2403[var5] = arg0.method1710(2006);
        }
        this.field2392 = arg0.method1710(2006);
        this.field2405 = arg0.method1710(2006);
        this.field2400 = arg0.method1694((byte) -100);
        this.field2390 = arg0.method1694((byte) -100);
        this.field2396 = new class60();
        this.field2408 = new class84();
        this.field2396.method400(arg0, this.field2408);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method915(int arg0, int arg1) {
        class248.method1722(field2409, 0, arg0);
        if (arg1 < 10) {
            return field2409;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2404.method575();
        this.field2398.method575();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2395 != null) {
            this.field2395.method575();
            this.field2394.method575();
            var5 = (int) ((double) (this.field2395.field1527 - this.field2395.field1530) * 32.768D / var3);
            var6 = (int) ((double) this.field2395.field1530 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2407 != null) {
            this.field2407.method575();
            this.field2397.method575();
            var8 = (int) ((double) (this.field2407.field1527 - this.field2407.field1530) * 32.768D / var3);
            var9 = (int) ((double) this.field2407.field1530 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2391[var11] != 0) {
                field2413[var11] = 0;
                field2410[var11] = (int) ((double) this.field2403[var11] * var3);
                field2414[var11] = (this.field2391[var11] << 14) / 100;
                field2411[var11] = (int) ((double) (this.field2404.field1527 - this.field2404.field1530) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2399[var11]) / var3);
                field2412[var11] = (int) ((double) this.field2404.field1530 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2404.method576(arg0);
            int var40 = this.field2398.method576(arg0);
            if (this.field2395 != null) {
                int var41 = this.field2395.method576(arg0);
                int var42 = this.field2394.method576(arg0);
                var39 += this.method916(var7, var42, this.field2395.field1531) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2407 != null) {
                int var43 = this.field2407.method576(arg0);
                int var44 = this.field2397.method576(arg0);
                var40 = var40 * ((this.method916(var10, var44, this.field2407.field1531) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2391[var45] != 0) {
                    int var46 = field2410[var45] + var12;
                    if (var46 < arg0) {
                        field2409[var46] += this.method916(field2413[var45], field2414[var45] * var40 >> 15, this.field2404.field1531);
                        field2413[var45] += (field2411[var45] * var39 >> 16) + field2412[var45];
                    }
                }
            }
        }
        if (this.field2402 != null) {
            this.field2402.method575();
            this.field2406.method575();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2402.method576(arg0);
                int var18 = this.field2406.method576(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2402.field1527 - this.field2402.field1530) * var17 >> 8) + this.field2402.field1530;
                } else {
                    var19 = ((this.field2402.field1527 - this.field2402.field1530) * var18 >> 8) + this.field2402.field1530;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2409[var16] = 0;
                }
            }
        }
        if (this.field2392 > 0 && this.field2405 > 0) {
            int var20 = (int) ((double) this.field2392 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2409[var21] += field2409[var21 - var20] * this.field2405 / 100;
            }
        }
        if (this.field2396.field1076[0] > 0 || this.field2396.field1076[1] > 0) {
            this.field2408.method575();
            int var22 = this.field2408.method576(arg0 + 1);
            int var23 = this.field2396.method396(0, (float) var22 / 65536.0F);
            int var24 = this.field2396.method396(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2409[var23 + var25] * (long) class60.field1080 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2409[var23 + var25 - var36 - 1] * (long) class60.field1081[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2409[var25 - var37 - 1] * (long) class60.field1081[1][var37] >> 16);
                    }
                    field2409[var25] = var35;
                    var22 = this.field2408.method576(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2409[var23 + var25] * (long) class60.field1080 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2409[var23 + var25 - var33 - 1] * (long) class60.field1081[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2409[var25 - var34 - 1] * (long) class60.field1081[1][var34] >> 16);
                        }
                        field2409[var25] = var32;
                        var22 = this.field2408.method576(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2409[var23 + var25 - var29 - 1] * (long) class60.field1081[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2409[var25 - var30 - 1] * (long) class60.field1081[1][var30] >> 16);
                            }
                            field2409[var25] = var28;
                            this.field2408.method576(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2396.method396(0, (float) var22 / 65536.0F);
                    var24 = this.field2396.method396(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2409[var38] < -32768) {
                field2409[var38] = -32768;
            }
            if (field2409[var38] > 32767) {
                field2409[var38] = 32767;
            }
        }
        return field2409;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    private final int method916(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2393[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2401[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public static void method917() {
        field2409 = null;
        field2401 = null;
        field2393 = null;
        field2413 = null;
        field2410 = null;
        field2414 = null;
        field2411 = null;
        field2412 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2401[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2393 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2393[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2409 = new int[220500];
        field2412 = new int[5];
        field2413 = new int[5];
        field2411 = new int[5];
        field2414 = new int[5];
        field2410 = new int[5];
    }
}

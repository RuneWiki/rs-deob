import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class142 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[I")
    private int[] field2451 = new int[5];

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private int field2453 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    private int[] field2457 = new int[5];

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
    private int[] field2460 = new int[5];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2450 = 0;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field2466 = 500;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    private int field2464 = 100;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    private static int[] field2456 = new int[32768];

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[I")
    private static int[] field2458;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    private static int[] field2455;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
    private static int[] field2463;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "[I")
    private static int[] field2468;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "[I")
    private static int[] field2470;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    private static int[] field2469;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
    private static int[] field2471;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljf;")
    private class63 field2448;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljf;")
    private class63 field2449;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljf;")
    private class63 field2452;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Ljf;")
    private class63 field2454;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Ljf;")
    private class63 field2459;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljf;")
    private class63 field2461;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Ljf;")
    private class63 field2465;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Ljf;")
    private class63 field2467;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Ljf;")
    private class63 field2472;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lbh;")
    private class7 field2462;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lv;)V")
    public final void method982(class149 arg0) {
        this.field2448 = new class63();
        this.field2448.method459(arg0);
        this.field2449 = new class63();
        this.field2449.method459(arg0);
        int var2 = arg0.method1045((byte) 122);
        if (var2 != 0) {
            arg0.field2593--;
            this.field2452 = new class63();
            this.field2452.method459(arg0);
            this.field2459 = new class63();
            this.field2459.method459(arg0);
        }
        int var3 = arg0.method1045((byte) -58);
        if (var3 != 0) {
            arg0.field2593--;
            this.field2465 = new class63();
            this.field2465.method459(arg0);
            this.field2472 = new class63();
            this.field2472.method459(arg0);
        }
        int var4 = arg0.method1045((byte) 99);
        if (var4 != 0) {
            arg0.field2593--;
            this.field2454 = new class63();
            this.field2454.method459(arg0);
            this.field2467 = new class63();
            this.field2467.method459(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1067(-32768);
            if (var6 == 0) {
                break;
            }
            this.field2457[var5] = var6;
            this.field2451[var5] = arg0.method1057((byte) 56);
            this.field2460[var5] = arg0.method1067(-32768);
        }
        this.field2453 = arg0.method1067(-32768);
        this.field2464 = arg0.method1067(-32768);
        this.field2466 = arg0.method1050(1272006568);
        this.field2450 = arg0.method1050(1272006568);
        this.field2462 = new class7();
        this.field2461 = new class63();
        this.field2462.method42(arg0, this.field2461);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    private final int method983(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2458[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2456[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method984(int arg0, int arg1) {
        class274.method1860(field2455, 0, arg0);
        if (arg1 < 10) {
            return field2455;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2448.method460();
        this.field2449.method460();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2452 != null) {
            this.field2452.method460();
            this.field2459.method460();
            var5 = (int) ((double) (this.field2452.field1142 - this.field2452.field1141) * 32.768D / var3);
            var6 = (int) ((double) this.field2452.field1141 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2465 != null) {
            this.field2465.method460();
            this.field2472.method460();
            var8 = (int) ((double) (this.field2465.field1142 - this.field2465.field1141) * 32.768D / var3);
            var9 = (int) ((double) this.field2465.field1141 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2457[var11] != 0) {
                field2463[var11] = 0;
                field2468[var11] = (int) ((double) this.field2460[var11] * var3);
                field2470[var11] = (this.field2457[var11] << 14) / 100;
                field2471[var11] = (int) ((double) (this.field2448.field1142 - this.field2448.field1141) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2451[var11]) / var3);
                field2469[var11] = (int) ((double) this.field2448.field1141 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2448.method458(arg0);
            int var40 = this.field2449.method458(arg0);
            if (this.field2452 != null) {
                int var41 = this.field2452.method458(arg0);
                int var42 = this.field2459.method458(arg0);
                var39 += this.method983(var7, var42, this.field2452.field1139) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2465 != null) {
                int var43 = this.field2465.method458(arg0);
                int var44 = this.field2472.method458(arg0);
                var40 = var40 * ((this.method983(var10, var44, this.field2465.field1139) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2457[var45] != 0) {
                    int var46 = field2468[var45] + var12;
                    if (var46 < arg0) {
                        field2455[var46] += this.method983(field2463[var45], field2470[var45] * var40 >> 15, this.field2448.field1139);
                        field2463[var45] += (field2471[var45] * var39 >> 16) + field2469[var45];
                    }
                }
            }
        }
        if (this.field2454 != null) {
            this.field2454.method460();
            this.field2467.method460();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2454.method458(arg0);
                int var18 = this.field2467.method458(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2454.field1142 - this.field2454.field1141) * var17 >> 8) + this.field2454.field1141;
                } else {
                    var19 = ((this.field2454.field1142 - this.field2454.field1141) * var18 >> 8) + this.field2454.field1141;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2455[var16] = 0;
                }
            }
        }
        if (this.field2453 > 0 && this.field2464 > 0) {
            int var20 = (int) ((double) this.field2453 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2455[var21] += field2455[var21 - var20] * this.field2464 / 100;
            }
        }
        if (this.field2462.field104[0] > 0 || this.field2462.field104[1] > 0) {
            this.field2461.method460();
            int var22 = this.field2461.method458(arg0 + 1);
            int var23 = this.field2462.method40(0, (float) var22 / 65536.0F);
            int var24 = this.field2462.method40(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2455[var23 + var25] * (long) class7.field100 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2455[var23 + var25 - var36 - 1] * (long) class7.field102[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2455[var25 - var37 - 1] * (long) class7.field102[1][var37] >> 16);
                    }
                    field2455[var25] = var35;
                    var22 = this.field2461.method458(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2455[var23 + var25] * (long) class7.field100 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2455[var23 + var25 - var33 - 1] * (long) class7.field102[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2455[var25 - var34 - 1] * (long) class7.field102[1][var34] >> 16);
                        }
                        field2455[var25] = var32;
                        var22 = this.field2461.method458(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2455[var23 + var25 - var29 - 1] * (long) class7.field102[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2455[var25 - var30 - 1] * (long) class7.field102[1][var30] >> 16);
                            }
                            field2455[var25] = var28;
                            this.field2461.method458(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2462.method40(0, (float) var22 / 65536.0F);
                    var24 = this.field2462.method40(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2455[var38] < -32768) {
                field2455[var38] = -32768;
            }
            if (field2455[var38] > 32767) {
                field2455[var38] = 32767;
            }
        }
        return field2455;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public static void method985() {
        field2455 = null;
        field2456 = null;
        field2458 = null;
        field2463 = null;
        field2468 = null;
        field2470 = null;
        field2471 = null;
        field2469 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2456[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2458 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2458[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2455 = new int[220500];
        field2463 = new int[5];
        field2468 = new int[5];
        field2470 = new int[5];
        field2469 = new int[5];
        field2471 = new int[5];
    }
}

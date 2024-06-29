import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class115 {

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    private int field2571 = 100;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    private int[] field2570 = new int[5];

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field2569 = 0;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    private int[] field2573 = new int[5];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
    private int[] field2562 = new int[5];

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    private int field2579 = 0;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field2576 = 500;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[I")
    private static int[] field2572 = new int[32768];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    private static int[] field2567;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[I")
    private static int[] field2575;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[I")
    private static int[] field2582;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[I")
    private static int[] field2581;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "[I")
    private static int[] field2585;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
    private static int[] field2580;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
    private static int[] field2584;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lta;")
    private class172 field2561;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lta;")
    private class172 field2563;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lta;")
    private class172 field2564;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lta;")
    private class172 field2565;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lta;")
    private class172 field2566;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lta;")
    private class172 field2568;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lta;")
    private class172 field2574;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lta;")
    private class172 field2577;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lta;")
    private class172 field2583;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lbi;")
    private class20 field2578;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I")
    private final int method905(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2567[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2572[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public static void method906() {
        field2575 = null;
        field2572 = null;
        field2567 = null;
        field2580 = null;
        field2585 = null;
        field2581 = null;
        field2582 = null;
        field2584 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method907(int arg0, int arg1) {
        class102.method848(field2575, 0, arg0);
        if (arg1 < 10) {
            return field2575;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2565.method1155();
        this.field2568.method1155();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2577 != null) {
            this.field2577.method1155();
            this.field2563.method1155();
            var5 = (int) ((double) (this.field2577.field3556 - this.field2577.field3555) * 32.768D / var3);
            var6 = (int) ((double) this.field2577.field3555 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2566 != null) {
            this.field2566.method1155();
            this.field2583.method1155();
            var8 = (int) ((double) (this.field2566.field3556 - this.field2566.field3555) * 32.768D / var3);
            var9 = (int) ((double) this.field2566.field3555 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2573[var11] != 0) {
                field2580[var11] = 0;
                field2585[var11] = (int) ((double) this.field2562[var11] * var3);
                field2581[var11] = (this.field2573[var11] << 14) / 100;
                field2582[var11] = (int) ((double) (this.field2565.field3556 - this.field2565.field3555) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2570[var11]) / var3);
                field2584[var11] = (int) ((double) this.field2565.field3555 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2565.method1152(arg0);
            int var40 = this.field2568.method1152(arg0);
            if (this.field2577 != null) {
                int var41 = this.field2577.method1152(arg0);
                int var42 = this.field2563.method1152(arg0);
                var39 += this.method905(var7, var42, this.field2577.field3558) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2566 != null) {
                int var43 = this.field2566.method1152(arg0);
                int var44 = this.field2583.method1152(arg0);
                var40 = var40 * ((this.method905(var10, var44, this.field2566.field3558) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2573[var45] != 0) {
                    int var46 = field2585[var45] + var12;
                    if (var46 < arg0) {
                        field2575[var46] += this.method905(field2580[var45], field2581[var45] * var40 >> 15, this.field2565.field3558);
                        field2580[var45] += (field2582[var45] * var39 >> 16) + field2584[var45];
                    }
                }
            }
        }
        if (this.field2564 != null) {
            this.field2564.method1155();
            this.field2561.method1155();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2564.method1152(arg0);
                int var18 = this.field2561.method1152(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2564.field3556 - this.field2564.field3555) * var17 >> 8) + this.field2564.field3555;
                } else {
                    var19 = ((this.field2564.field3556 - this.field2564.field3555) * var18 >> 8) + this.field2564.field3555;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2575[var16] = 0;
                }
            }
        }
        if (this.field2579 > 0 && this.field2571 > 0) {
            int var20 = (int) ((double) this.field2579 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2575[var21] += field2575[var21 - var20] * this.field2571 / 100;
            }
        }
        if (this.field2578.field481[0] > 0 || this.field2578.field481[1] > 0) {
            this.field2574.method1155();
            int var22 = this.field2574.method1152(arg0 + 1);
            int var23 = this.field2578.method218(0, (float) var22 / 65536.0F);
            int var24 = this.field2578.method218(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2575[var23 + var25] * (long) class20.field485 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2575[var23 + var25 - var36 - 1] * (long) class20.field486[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2575[var25 - var37 - 1] * (long) class20.field486[1][var37] >> 16);
                    }
                    field2575[var25] = var35;
                    var22 = this.field2574.method1152(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2575[var23 + var25] * (long) class20.field485 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2575[var23 + var25 - var33 - 1] * (long) class20.field486[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2575[var25 - var34 - 1] * (long) class20.field486[1][var34] >> 16);
                        }
                        field2575[var25] = var32;
                        var22 = this.field2574.method1152(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2575[var23 + var25 - var29 - 1] * (long) class20.field486[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2575[var25 - var30 - 1] * (long) class20.field486[1][var30] >> 16);
                            }
                            field2575[var25] = var28;
                            this.field2574.method1152(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2578.method218(0, (float) var22 / 65536.0F);
                    var24 = this.field2578.method218(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2575[var38] < -32768) {
                field2575[var38] = -32768;
            }
            if (field2575[var38] > 32767) {
                field2575[var38] = 32767;
            }
        }
        return field2575;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lab;)V")
    public final void method908(class3 arg0) {
        this.field2565 = new class172();
        this.field2565.method1154(arg0);
        this.field2568 = new class172();
        this.field2568.method1154(arg0);
        int var2 = arg0.method64(31790);
        if (var2 != 0) {
            arg0.field54--;
            this.field2577 = new class172();
            this.field2577.method1154(arg0);
            this.field2563 = new class172();
            this.field2563.method1154(arg0);
        }
        int var3 = arg0.method64(31790);
        if (var3 != 0) {
            arg0.field54--;
            this.field2566 = new class172();
            this.field2566.method1154(arg0);
            this.field2583 = new class172();
            this.field2583.method1154(arg0);
        }
        int var4 = arg0.method64(31790);
        if (var4 != 0) {
            arg0.field54--;
            this.field2564 = new class172();
            this.field2564.method1154(arg0);
            this.field2561 = new class172();
            this.field2561.method1154(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method45(-6498);
            if (var6 == 0) {
                break;
            }
            this.field2573[var5] = var6;
            this.field2570[var5] = arg0.method35(true);
            this.field2562[var5] = arg0.method45(-6498);
        }
        this.field2579 = arg0.method45(-6498);
        this.field2571 = arg0.method45(-6498);
        this.field2576 = arg0.method46((byte) 65);
        this.field2569 = arg0.method46((byte) 65);
        this.field2578 = new class20();
        this.field2574 = new class172();
        this.field2578.method217(arg0, this.field2574);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2572[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2567 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2567[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2575 = new int[220500];
        field2582 = new int[5];
        field2581 = new int[5];
        field2585 = new int[5];
        field2580 = new int[5];
        field2584 = new int[5];
    }
}

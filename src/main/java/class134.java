import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class134 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    private int field2537 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    private int[] field2535 = new int[5];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    private int field2543 = 100;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field2552 = 500;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
    private int[] field2539 = new int[5];

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[I")
    private int[] field2549 = new int[5];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2541 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
    private static int[] field2545 = new int[32768];

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
    private static int[] field2542;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    private static int[] field2551;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    private static int[] field2555;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[I")
    private static int[] field2556;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
    private static int[] field2557;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[I")
    private static int[] field2558;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[I")
    private static int[] field2559;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lwe;")
    private class222 field2538;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lj;")
    private class89 field2536;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lj;")
    private class89 field2540;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lj;")
    private class89 field2544;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lj;")
    private class89 field2546;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lj;")
    private class89 field2547;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lj;")
    private class89 field2548;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lj;")
    private class89 field2550;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lj;")
    private class89 field2553;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Lj;")
    private class89 field2554;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Log;)V")
    public final void method846(class146 arg0) {
        this.field2548 = new class89();
        this.field2548.method604(arg0);
        this.field2554 = new class89();
        this.field2554.method604(arg0);
        int var2 = arg0.method991(255);
        if (var2 != 0) {
            arg0.field2865--;
            this.field2544 = new class89();
            this.field2544.method604(arg0);
            this.field2546 = new class89();
            this.field2546.method604(arg0);
        }
        int var3 = arg0.method991(255);
        if (var3 != 0) {
            arg0.field2865--;
            this.field2547 = new class89();
            this.field2547.method604(arg0);
            this.field2540 = new class89();
            this.field2540.method604(arg0);
        }
        int var4 = arg0.method991(255);
        if (var4 != 0) {
            arg0.field2865--;
            this.field2536 = new class89();
            this.field2536.method604(arg0);
            this.field2553 = new class89();
            this.field2553.method604(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1010(-2);
            if (var6 == 0) {
                break;
            }
            this.field2535[var5] = var6;
            this.field2539[var5] = arg0.method990((byte) 114);
            this.field2549[var5] = arg0.method1010(-2);
        }
        this.field2537 = arg0.method1010(-2);
        this.field2543 = arg0.method1010(-2);
        this.field2552 = arg0.method1007(122);
        this.field2541 = arg0.method1007(97);
        this.field2538 = new class222();
        this.field2550 = new class89();
        this.field2538.method1432(arg0, this.field2550);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public static void method847() {
        field2551 = null;
        field2545 = null;
        field2542 = null;
        field2556 = null;
        field2557 = null;
        field2558 = null;
        field2559 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
    public final int[] method848(int arg0, int arg1) {
        class149.method1041(field2551, 0, arg0);
        if (arg1 < 10) {
            return field2551;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2548.method603();
        this.field2554.method603();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2544 != null) {
            this.field2544.method603();
            this.field2546.method603();
            var5 = (int) ((double) (this.field2544.field1773 - this.field2544.field1769) * 32.768D / var3);
            var6 = (int) ((double) this.field2544.field1769 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2547 != null) {
            this.field2547.method603();
            this.field2540.method603();
            var8 = (int) ((double) (this.field2547.field1773 - this.field2547.field1769) * 32.768D / var3);
            var9 = (int) ((double) this.field2547.field1769 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2535[var11] != 0) {
                field2556[var11] = 0;
                field2557[var11] = (int) ((double) this.field2549[var11] * var3);
                field2558[var11] = (this.field2535[var11] << 14) / 100;
                field2559[var11] = (int) ((double) (this.field2548.field1773 - this.field2548.field1769) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2539[var11]) / var3);
                field2555[var11] = (int) ((double) this.field2548.field1769 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2548.method605(arg0);
            int var40 = this.field2554.method605(arg0);
            if (this.field2544 != null) {
                int var41 = this.field2544.method605(arg0);
                int var42 = this.field2546.method605(arg0);
                var39 += this.method849(var7, var42, this.field2544.field1772) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2547 != null) {
                int var43 = this.field2547.method605(arg0);
                int var44 = this.field2540.method605(arg0);
                var40 = var40 * ((this.method849(var10, var44, this.field2547.field1772) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2535[var45] != 0) {
                    int var46 = field2557[var45] + var12;
                    if (var46 < arg0) {
                        field2551[var46] += this.method849(field2556[var45], field2558[var45] * var40 >> 15, this.field2548.field1772);
                        field2556[var45] += (field2559[var45] * var39 >> 16) + field2555[var45];
                    }
                }
            }
        }
        if (this.field2536 != null) {
            this.field2536.method603();
            this.field2553.method603();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2536.method605(arg0);
                int var18 = this.field2553.method605(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2536.field1773 - this.field2536.field1769) * var17 >> 8) + this.field2536.field1769;
                } else {
                    var19 = ((this.field2536.field1773 - this.field2536.field1769) * var18 >> 8) + this.field2536.field1769;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2551[var16] = 0;
                }
            }
        }
        if (this.field2537 > 0 && this.field2543 > 0) {
            int var20 = (int) ((double) this.field2537 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2551[var21] += field2551[var21 - var20] * this.field2543 / 100;
            }
        }
        if (this.field2538.field4198[0] > 0 || this.field2538.field4198[1] > 0) {
            this.field2550.method603();
            int var22 = this.field2550.method605(arg0 + 1);
            int var23 = this.field2538.method1430(0, (float) var22 / 65536.0F);
            int var24 = this.field2538.method1430(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2551[var23 + var25] * (long) class222.field4205 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2551[var23 + var25 - var36 - 1] * (long) class222.field4203[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2551[var25 - var37 - 1] * (long) class222.field4203[1][var37] >> 16);
                    }
                    field2551[var25] = var35;
                    var22 = this.field2550.method605(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2551[var23 + var25] * (long) class222.field4205 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2551[var23 + var25 - var33 - 1] * (long) class222.field4203[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2551[var25 - var34 - 1] * (long) class222.field4203[1][var34] >> 16);
                        }
                        field2551[var25] = var32;
                        var22 = this.field2550.method605(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2551[var23 + var25 - var29 - 1] * (long) class222.field4203[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2551[var25 - var30 - 1] * (long) class222.field4203[1][var30] >> 16);
                            }
                            field2551[var25] = var28;
                            this.field2550.method605(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2538.method1430(0, (float) var22 / 65536.0F);
                    var24 = this.field2538.method1430(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2551[var38] < -32768) {
                field2551[var38] = -32768;
            }
            if (field2551[var38] > 32767) {
                field2551[var38] = 32767;
            }
        }
        return field2551;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
    private final int method849(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2542[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2545[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2545[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2542 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2542[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2551 = new int[220500];
        field2555 = new int[5];
        field2556 = new int[5];
        field2557 = new int[5];
        field2558 = new int[5];
        field2559 = new int[5];
    }
}

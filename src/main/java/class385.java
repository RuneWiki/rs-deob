import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class385 {

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    private int field5765 = 100;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public int field5766 = 0;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[I")
    private int[] field5763 = new int[5];

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    private int field5764 = 0;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "[I")
    private int[] field5771 = new int[5];

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "[I")
    private int[] field5776 = new int[5];

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public int field5778 = 500;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "[I")
    private static int[] field5768 = new int[32768];

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
    private static int[] field5769;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
    private static int[] field5755;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "[I")
    private static int[] field5772;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "[I")
    private static int[] field5777;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "[I")
    private static int[] field5775;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "[I")
    private static int[] field5774;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "[I")
    private static int[] field5773;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lbd;")
    private class304 field5754;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Lbd;")
    private class304 field5756;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lbd;")
    private class304 field5757;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Lbd;")
    private class304 field5758;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lbd;")
    private class304 field5760;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Lbd;")
    private class304 field5761;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lbd;")
    private class304 field5762;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "Lbd;")
    private class304 field5767;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "Lbd;")
    private class304 field5770;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lsp;")
    private class422 field5759;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5768[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5769 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5769[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5755 = new int[220500];
        field5772 = new int[5];
        field5777 = new int[5];
        field5775 = new int[5];
        field5774 = new int[5];
        field5773 = new int[5];
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()V", line = 7)
    public static void method2522() {
        field5755 = null;
        field5768 = null;
        field5769 = null;
        field5773 = null;
        field5777 = null;
        field5774 = null;
        field5775 = null;
        field5772 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lil;)V", line = 29)
    public final void method2523(class265 arg0) {
        this.field5756 = new class304();
        this.field5756.method1919(arg0);
        this.field5762 = new class304();
        this.field5762.method1919(arg0);
        int var2 = arg0.method1697(-101);
        if (var2 != 0) {
            arg0.field3915--;
            this.field5758 = new class304();
            this.field5758.method1919(arg0);
            this.field5767 = new class304();
            this.field5767.method1919(arg0);
        }
        int var3 = arg0.method1697(-84);
        if (var3 != 0) {
            arg0.field3915--;
            this.field5754 = new class304();
            this.field5754.method1919(arg0);
            this.field5757 = new class304();
            this.field5757.method1919(arg0);
        }
        int var4 = arg0.method1697(120);
        if (var4 != 0) {
            arg0.field3915--;
            this.field5770 = new class304();
            this.field5770.method1919(arg0);
            this.field5760 = new class304();
            this.field5760.method1919(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1680(-1647926640);
            if (var6 == 0) {
                break;
            }
            this.field5776[var5] = var6;
            this.field5763[var5] = arg0.method1717((byte) 35);
            this.field5771[var5] = arg0.method1680(-1647926640);
        }
        this.field5764 = arg0.method1680(-1647926640);
        this.field5765 = arg0.method1680(-1647926640);
        this.field5778 = arg0.method1685(8104);
        this.field5766 = arg0.method1685(8104);
        this.field5759 = new class422();
        this.field5761 = new class304();
        this.field5759.method2721(arg0, this.field5761);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I", line = 95)
    public final int[] method2524(int arg0, int arg1) {
        class111.method774(field5755, 0, arg0);
        if (arg1 < 10) {
            return field5755;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5756.method1918();
        this.field5762.method1918();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5758 != null) {
            this.field5758.method1918();
            this.field5767.method1918();
            var5 = (int) ((double) (this.field5758.field4352 - this.field5758.field4351) * 32.768D / var3);
            var6 = (int) ((double) this.field5758.field4351 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5754 != null) {
            this.field5754.method1918();
            this.field5757.method1918();
            var8 = (int) ((double) (this.field5754.field4352 - this.field5754.field4351) * 32.768D / var3);
            var9 = (int) ((double) this.field5754.field4351 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5776[var11] != 0) {
                field5773[var11] = 0;
                field5777[var11] = (int) ((double) this.field5771[var11] * var3);
                field5774[var11] = (this.field5776[var11] << 14) / 100;
                field5775[var11] = (int) ((double) (this.field5756.field4352 - this.field5756.field4351) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5763[var11]) / var3);
                field5772[var11] = (int) ((double) this.field5756.field4351 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5756.method1920(arg0);
            int var40 = this.field5762.method1920(arg0);
            if (this.field5758 != null) {
                int var41 = this.field5758.method1920(arg0);
                int var42 = this.field5767.method1920(arg0);
                var39 += this.method2525(var7, var42, this.field5758.field4350) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5754 != null) {
                int var43 = this.field5754.method1920(arg0);
                int var44 = this.field5757.method1920(arg0);
                var40 = var40 * ((this.method2525(var10, var44, this.field5754.field4350) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5776[var45] != 0) {
                    int var46 = field5777[var45] + var12;
                    if (var46 < arg0) {
                        field5755[var46] += this.method2525(field5773[var45], field5774[var45] * var40 >> 15, this.field5756.field4350);
                        field5773[var45] += (field5775[var45] * var39 >> 16) + field5772[var45];
                    }
                }
            }
        }
        if (this.field5770 != null) {
            this.field5770.method1918();
            this.field5760.method1918();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5770.method1920(arg0);
                int var18 = this.field5760.method1920(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5770.field4352 - this.field5770.field4351) * var17 >> 8) + this.field5770.field4351;
                } else {
                    var19 = ((this.field5770.field4352 - this.field5770.field4351) * var18 >> 8) + this.field5770.field4351;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5755[var16] = 0;
                }
            }
        }
        if (this.field5764 > 0 && this.field5765 > 0) {
            int var20 = (int) ((double) this.field5764 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5755[var21] += field5755[var21 - var20] * this.field5765 / 100;
            }
        }
        if (this.field5759.field6290[0] > 0 || this.field5759.field6290[1] > 0) {
            this.field5761.method1918();
            int var22 = this.field5761.method1920(arg0 + 1);
            int var23 = this.field5759.method2717(0, (float) var22 / 65536.0F);
            int var24 = this.field5759.method2717(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5755[var23 + var25] * (long) class422.field6289 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5755[var23 + var25 - var36 - 1] * (long) class422.field6291[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5755[var25 - var37 - 1] * (long) class422.field6291[1][var37] >> 16);
                    }
                    field5755[var25] = var35;
                    var22 = this.field5761.method1920(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5755[var23 + var25] * (long) class422.field6289 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5755[var23 + var25 - var33 - 1] * (long) class422.field6291[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5755[var25 - var34 - 1] * (long) class422.field6291[1][var34] >> 16);
                        }
                        field5755[var25] = var32;
                        var22 = this.field5761.method1920(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5755[var23 + var25 - var29 - 1] * (long) class422.field6291[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5755[var25 - var30 - 1] * (long) class422.field6291[1][var30] >> 16);
                            }
                            field5755[var25] = var28;
                            this.field5761.method1920(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5759.method2717(0, (float) var22 / 65536.0F);
                    var24 = this.field5759.method2717(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5755[var38] < -32768) {
                field5755[var38] = -32768;
            }
            if (field5755[var38] > 32767) {
                field5755[var38] = 32767;
            }
        }
        return field5755;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)I", line = 383)
    private final int method2525(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5769[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5768[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}

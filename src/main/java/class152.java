import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class152 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    private int field2818 = 0;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    private int[] field2823 = new int[5];

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field2822 = 0;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public int field2826 = 500;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field2831 = 100;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "[I")
    private int[] field2824 = new int[5];

    @OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
    private int[] field2834 = new int[5];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
    private static int[] field2819 = new int[32768];

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    private static int[] field2829;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
    private static int[] field2833;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    private static int[] field2835;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
    private static int[] field2837;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[I")
    private static int[] field2838;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "[I")
    private static int[] field2839;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "[I")
    private static int[] field2836;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lme;")
    private class159 field2815;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lme;")
    private class159 field2816;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lme;")
    private class159 field2817;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lme;")
    private class159 field2820;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lme;")
    private class159 field2821;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lme;")
    private class159 field2827;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lme;")
    private class159 field2828;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lme;")
    private class159 field2830;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lme;")
    private class159 field2832;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lpd;")
    private class3 field2825;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    private final int method1040(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2829[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2819[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lng;)V")
    public final void method1041(class135 arg0) {
        this.field2821 = new class159();
        this.field2821.method1064(arg0);
        this.field2827 = new class159();
        this.field2827.method1064(arg0);
        int var2 = arg0.method920((byte) 115);
        if (var2 != 0) {
            arg0.field2449--;
            this.field2832 = new class159();
            this.field2832.method1064(arg0);
            this.field2816 = new class159();
            this.field2816.method1064(arg0);
        }
        int var3 = arg0.method920((byte) 27);
        if (var3 != 0) {
            arg0.field2449--;
            this.field2830 = new class159();
            this.field2830.method1064(arg0);
            this.field2817 = new class159();
            this.field2817.method1064(arg0);
        }
        int var4 = arg0.method920((byte) 89);
        if (var4 != 0) {
            arg0.field2449--;
            this.field2815 = new class159();
            this.field2815.method1064(arg0);
            this.field2828 = new class159();
            this.field2828.method1064(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method947(27126);
            if (var6 == 0) {
                break;
            }
            this.field2824[var5] = var6;
            this.field2834[var5] = arg0.method940(false);
            this.field2823[var5] = arg0.method947(27126);
        }
        this.field2818 = arg0.method947(27126);
        this.field2831 = arg0.method947(27126);
        this.field2826 = arg0.method927(125);
        this.field2822 = arg0.method927(125);
        this.field2825 = new class3();
        this.field2820 = new class159();
        this.field2825.method20(arg0, this.field2820);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public static void method1042() {
        field2833 = null;
        field2819 = null;
        field2829 = null;
        field2837 = null;
        field2836 = null;
        field2838 = null;
        field2835 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method1043(int arg0, int arg1) {
        class194.method1341(field2833, 0, arg0);
        if (arg1 < 10) {
            return field2833;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2821.method1062();
        this.field2827.method1062();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2832 != null) {
            this.field2832.method1062();
            this.field2816.method1062();
            var5 = (int) ((double) (this.field2832.field2915 - this.field2832.field2914) * 32.768D / var3);
            var6 = (int) ((double) this.field2832.field2914 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2830 != null) {
            this.field2830.method1062();
            this.field2817.method1062();
            var8 = (int) ((double) (this.field2830.field2915 - this.field2830.field2914) * 32.768D / var3);
            var9 = (int) ((double) this.field2830.field2914 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2824[var11] != 0) {
                field2837[var11] = 0;
                field2836[var11] = (int) ((double) this.field2823[var11] * var3);
                field2838[var11] = (this.field2824[var11] << 14) / 100;
                field2835[var11] = (int) ((double) (this.field2821.field2915 - this.field2821.field2914) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2834[var11]) / var3);
                field2839[var11] = (int) ((double) this.field2821.field2914 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2821.method1063(arg0);
            int var40 = this.field2827.method1063(arg0);
            if (this.field2832 != null) {
                int var41 = this.field2832.method1063(arg0);
                int var42 = this.field2816.method1063(arg0);
                var39 += this.method1040(var7, var42, this.field2832.field2916) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2830 != null) {
                int var43 = this.field2830.method1063(arg0);
                int var44 = this.field2817.method1063(arg0);
                var40 = var40 * ((this.method1040(var10, var44, this.field2830.field2916) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2824[var45] != 0) {
                    int var46 = field2836[var45] + var12;
                    if (var46 < arg0) {
                        field2833[var46] += this.method1040(field2837[var45], field2838[var45] * var40 >> 15, this.field2821.field2916);
                        field2837[var45] += (field2835[var45] * var39 >> 16) + field2839[var45];
                    }
                }
            }
        }
        if (this.field2815 != null) {
            this.field2815.method1062();
            this.field2828.method1062();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2815.method1063(arg0);
                int var18 = this.field2828.method1063(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2815.field2915 - this.field2815.field2914) * var17 >> 8) + this.field2815.field2914;
                } else {
                    var19 = ((this.field2815.field2915 - this.field2815.field2914) * var18 >> 8) + this.field2815.field2914;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2833[var16] = 0;
                }
            }
        }
        if (this.field2818 > 0 && this.field2831 > 0) {
            int var20 = (int) ((double) this.field2818 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2833[var21] += field2833[var21 - var20] * this.field2831 / 100;
            }
        }
        if (this.field2825.field43[0] > 0 || this.field2825.field43[1] > 0) {
            this.field2820.method1062();
            int var22 = this.field2820.method1063(arg0 + 1);
            int var23 = this.field2825.method21(0, (float) var22 / 65536.0F);
            int var24 = this.field2825.method21(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2833[var23 + var25] * (long) class3.field45 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2833[var23 + var25 - var36 - 1] * (long) class3.field42[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2833[var25 - var37 - 1] * (long) class3.field42[1][var37] >> 16);
                    }
                    field2833[var25] = var35;
                    var22 = this.field2820.method1063(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2833[var23 + var25] * (long) class3.field45 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2833[var23 + var25 - var33 - 1] * (long) class3.field42[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2833[var25 - var34 - 1] * (long) class3.field42[1][var34] >> 16);
                        }
                        field2833[var25] = var32;
                        var22 = this.field2820.method1063(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2833[var23 + var25 - var29 - 1] * (long) class3.field42[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2833[var25 - var30 - 1] * (long) class3.field42[1][var30] >> 16);
                            }
                            field2833[var25] = var28;
                            this.field2820.method1063(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2825.method21(0, (float) var22 / 65536.0F);
                    var24 = this.field2825.method21(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2833[var38] < -32768) {
                field2833[var38] = -32768;
            }
            if (field2833[var38] > 32767) {
                field2833[var38] = 32767;
            }
        }
        return field2833;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2819[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2829 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2829[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2833 = new int[220500];
        field2835 = new int[5];
        field2837 = new int[5];
        field2838 = new int[5];
        field2839 = new int[5];
        field2836 = new int[5];
    }
}

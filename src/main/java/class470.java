import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class470 {

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public int field6659 = 0;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    private int field6663 = 0;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "[I")
    private int[] field6664 = new int[5];

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    private int field6665 = 100;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public int field6670 = 500;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "[I")
    private int[] field6675 = new int[5];

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "[I")
    private int[] field6666 = new int[5];

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "[I")
    private static int[] field6661 = new int[32768];

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "[I")
    private static int[] field6674;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "[I")
    private static int[] field6658;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "[I")
    private static int[] field6677;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "[I")
    private static int[] field6679;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "[I")
    private static int[] field6680;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "[I")
    private static int[] field6678;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "[I")
    private static int[] field6676;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lkh;")
    private class481 field6656;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "Loaa;")
    private class511 field6657;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "Loaa;")
    private class511 field6660;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "Loaa;")
    private class511 field6662;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Loaa;")
    private class511 field6667;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "Loaa;")
    private class511 field6668;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Loaa;")
    private class511 field6669;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "Loaa;")
    private class511 field6671;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "Loaa;")
    private class511 field6672;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "Loaa;")
    private class511 field6673;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lge;)V")
    public final void method2689(class551 arg0) {
        this.field6657 = new class511();
        this.field6657.method2852(arg0);
        this.field6671 = new class511();
        this.field6671.method2852(arg0);
        int var2 = arg0.method3045(-127);
        if (var2 != 0) {
            arg0.field7707--;
            this.field6673 = new class511();
            this.field6673.method2852(arg0);
            this.field6669 = new class511();
            this.field6669.method2852(arg0);
        }
        int var3 = arg0.method3045(-126);
        if (var3 != 0) {
            arg0.field7707--;
            this.field6660 = new class511();
            this.field6660.method2852(arg0);
            this.field6672 = new class511();
            this.field6672.method2852(arg0);
        }
        int var4 = arg0.method3045(-127);
        if (var4 != 0) {
            arg0.field7707--;
            this.field6668 = new class511();
            this.field6668.method2852(arg0);
            this.field6662 = new class511();
            this.field6662.method2852(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3059(34);
            if (var6 == 0) {
                break;
            }
            this.field6666[var5] = var6;
            this.field6675[var5] = arg0.method3069(false);
            this.field6664[var5] = arg0.method3059(23);
        }
        this.field6663 = arg0.method3059(79);
        this.field6665 = arg0.method3059(23);
        this.field6670 = arg0.method3090(-85);
        this.field6659 = arg0.method3090(-108);
        this.field6656 = new class481();
        this.field6667 = new class511();
        this.field6656.method2721(arg0, this.field6667);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)[I")
    public final int[] method2690(int arg0, int arg1) {
        class205.method1312(field6658, 0, arg0);
        if (arg1 < 10) {
            return field6658;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6657.method2854();
        this.field6671.method2854();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6673 != null) {
            this.field6673.method2854();
            this.field6669.method2854();
            var5 = (int) ((double) (this.field6673.field7119 - this.field6673.field7118) * 32.768D / var3);
            var6 = (int) ((double) this.field6673.field7118 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6660 != null) {
            this.field6660.method2854();
            this.field6672.method2854();
            var8 = (int) ((double) (this.field6660.field7119 - this.field6660.field7118) * 32.768D / var3);
            var9 = (int) ((double) this.field6660.field7118 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6666[var11] != 0) {
                field6676[var11] = 0;
                field6677[var11] = (int) ((double) this.field6664[var11] * var3);
                field6679[var11] = (this.field6666[var11] << 14) / 100;
                field6680[var11] = (int) ((double) (this.field6657.field7119 - this.field6657.field7118) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6675[var11]) / var3);
                field6678[var11] = (int) ((double) this.field6657.field7118 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6657.method2853(arg0);
            int var40 = this.field6671.method2853(arg0);
            if (this.field6673 != null) {
                int var41 = this.field6673.method2853(arg0);
                int var42 = this.field6669.method2853(arg0);
                var39 += this.method2692(var7, var42, this.field6673.field7122) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6660 != null) {
                int var43 = this.field6660.method2853(arg0);
                int var44 = this.field6672.method2853(arg0);
                var40 = var40 * ((this.method2692(var10, var44, this.field6660.field7122) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6666[var45] != 0) {
                    int var46 = field6677[var45] + var12;
                    if (var46 < arg0) {
                        field6658[var46] += this.method2692(field6676[var45], field6679[var45] * var40 >> 15, this.field6657.field7122);
                        field6676[var45] += (field6680[var45] * var39 >> 16) + field6678[var45];
                    }
                }
            }
        }
        if (this.field6668 != null) {
            this.field6668.method2854();
            this.field6662.method2854();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6668.method2853(arg0);
                int var18 = this.field6662.method2853(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6668.field7119 - this.field6668.field7118) * var17 >> 8) + this.field6668.field7118;
                } else {
                    var19 = ((this.field6668.field7119 - this.field6668.field7118) * var18 >> 8) + this.field6668.field7118;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6658[var16] = 0;
                }
            }
        }
        if (this.field6663 > 0 && this.field6665 > 0) {
            int var20 = (int) ((double) this.field6663 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6658[var21] += field6658[var21 - var20] * this.field6665 / 100;
            }
        }
        if (this.field6656.field6732[0] > 0 || this.field6656.field6732[1] > 0) {
            this.field6667.method2854();
            int var22 = this.field6667.method2853(arg0 + 1);
            int var23 = this.field6656.method2719(0, (float) var22 / 65536.0F);
            int var24 = this.field6656.method2719(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6658[var23 + var25] * (long) class481.field6736 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6658[var23 + var25 - var36 - 1] * (long) class481.field6731[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6658[var25 - var37 - 1] * (long) class481.field6731[1][var37] >> 16);
                    }
                    field6658[var25] = var35;
                    var22 = this.field6667.method2853(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6658[var23 + var25] * (long) class481.field6736 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6658[var23 + var25 - var33 - 1] * (long) class481.field6731[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6658[var25 - var34 - 1] * (long) class481.field6731[1][var34] >> 16);
                        }
                        field6658[var25] = var32;
                        var22 = this.field6667.method2853(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6658[var23 + var25 - var29 - 1] * (long) class481.field6731[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6658[var25 - var30 - 1] * (long) class481.field6731[1][var30] >> 16);
                            }
                            field6658[var25] = var28;
                            this.field6667.method2853(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6656.method2719(0, (float) var22 / 65536.0F);
                    var24 = this.field6656.method2719(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6658[var38] < -32768) {
                field6658[var38] = -32768;
            }
            if (field6658[var38] > 32767) {
                field6658[var38] = 32767;
            }
        }
        return field6658;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "()V")
    public static void method2691() {
        field6658 = null;
        field6661 = null;
        field6674 = null;
        field6676 = null;
        field6677 = null;
        field6679 = null;
        field6680 = null;
        field6678 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)I")
    private final int method2692(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6674[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6661[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6661[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6674 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6674[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6658 = new int[220500];
        field6677 = new int[5];
        field6679 = new int[5];
        field6680 = new int[5];
        field6678 = new int[5];
        field6676 = new int[5];
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class278 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    private int[] field4552 = new int[5];

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field4560 = 500;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
    private int[] field4562 = new int[5];

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field4557 = 0;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[I")
    private int[] field4566 = new int[5];

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field4558 = 0;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field4568 = 100;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    private static int[] field4554 = new int[32768];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    private static int[] field4556;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "[I")
    private static int[] field4571;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
    private static int[] field4573;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[I")
    private static int[] field4574;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "[I")
    private static int[] field4572;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "[I")
    private static int[] field4575;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "[I")
    private static int[] field4576;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lre;")
    private class225 field4553;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lre;")
    private class225 field4559;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lre;")
    private class225 field4561;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lre;")
    private class225 field4563;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Lre;")
    private class225 field4564;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lre;")
    private class225 field4565;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lre;")
    private class225 field4567;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Lre;")
    private class225 field4569;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lre;")
    private class225 field4570;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lhf;")
    private class486 field4555;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
    public static void method1830() {
        field4571 = null;
        field4554 = null;
        field4556 = null;
        field4576 = null;
        field4573 = null;
        field4575 = null;
        field4572 = null;
        field4574 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)I")
    private final int method1831(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4556[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4554[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
    public final int[] method1832(int arg0, int arg1) {
        class85.method608(field4571, 0, arg0);
        if (arg1 < 10) {
            return field4571;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4565.method1548();
        this.field4564.method1548();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4553 != null) {
            this.field4553.method1548();
            this.field4563.method1548();
            var5 = (int) ((double) (this.field4553.field3879 - this.field4553.field3876) * 32.768D / var3);
            var6 = (int) ((double) this.field4553.field3876 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4569 != null) {
            this.field4569.method1548();
            this.field4570.method1548();
            var8 = (int) ((double) (this.field4569.field3879 - this.field4569.field3876) * 32.768D / var3);
            var9 = (int) ((double) this.field4569.field3876 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4562[var11] != 0) {
                field4576[var11] = 0;
                field4573[var11] = (int) ((double) this.field4566[var11] * var3);
                field4575[var11] = (this.field4562[var11] << 14) / 100;
                field4572[var11] = (int) ((double) (this.field4565.field3879 - this.field4565.field3876) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4552[var11]) / var3);
                field4574[var11] = (int) ((double) this.field4565.field3876 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4565.method1549(arg0);
            int var40 = this.field4564.method1549(arg0);
            if (this.field4553 != null) {
                int var41 = this.field4553.method1549(arg0);
                int var42 = this.field4563.method1549(arg0);
                var39 += this.method1831(var7, var42, this.field4553.field3878) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4569 != null) {
                int var43 = this.field4569.method1549(arg0);
                int var44 = this.field4570.method1549(arg0);
                var40 = var40 * ((this.method1831(var10, var44, this.field4569.field3878) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4562[var45] != 0) {
                    int var46 = field4573[var45] + var12;
                    if (var46 < arg0) {
                        field4571[var46] += this.method1831(field4576[var45], field4575[var45] * var40 >> 15, this.field4565.field3878);
                        field4576[var45] += (field4572[var45] * var39 >> 16) + field4574[var45];
                    }
                }
            }
        }
        if (this.field4567 != null) {
            this.field4567.method1548();
            this.field4559.method1548();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4567.method1549(arg0);
                int var18 = this.field4559.method1549(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4567.field3879 - this.field4567.field3876) * var17 >> 8) + this.field4567.field3876;
                } else {
                    var19 = ((this.field4567.field3879 - this.field4567.field3876) * var18 >> 8) + this.field4567.field3876;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4571[var16] = 0;
                }
            }
        }
        if (this.field4557 > 0 && this.field4568 > 0) {
            int var20 = (int) ((double) this.field4557 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4571[var21] += field4571[var21 - var20] * this.field4568 / 100;
            }
        }
        if (this.field4555.field7125[0] > 0 || this.field4555.field7125[1] > 0) {
            this.field4561.method1548();
            int var22 = this.field4561.method1549(arg0 + 1);
            int var23 = this.field4555.method2843(0, (float) var22 / 65536.0F);
            int var24 = this.field4555.method2843(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4571[var23 + var25] * (long) class486.field7124 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4571[var23 + var25 - var36 - 1] * (long) class486.field7127[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4571[var25 - var37 - 1] * (long) class486.field7127[1][var37] >> 16);
                    }
                    field4571[var25] = var35;
                    var22 = this.field4561.method1549(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4571[var23 + var25] * (long) class486.field7124 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4571[var23 + var25 - var33 - 1] * (long) class486.field7127[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4571[var25 - var34 - 1] * (long) class486.field7127[1][var34] >> 16);
                        }
                        field4571[var25] = var32;
                        var22 = this.field4561.method1549(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4571[var23 + var25 - var29 - 1] * (long) class486.field7127[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4571[var25 - var30 - 1] * (long) class486.field7127[1][var30] >> 16);
                            }
                            field4571[var25] = var28;
                            this.field4561.method1549(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4555.method2843(0, (float) var22 / 65536.0F);
                    var24 = this.field4555.method2843(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4571[var38] < -32768) {
                field4571[var38] = -32768;
            }
            if (field4571[var38] > 32767) {
                field4571[var38] = 32767;
            }
        }
        return field4571;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lia;)V")
    public final void method1833(class23 arg0) {
        this.field4565 = new class225();
        this.field4565.method1551(arg0);
        this.field4564 = new class225();
        this.field4564.method1551(arg0);
        int var2 = arg0.method126((byte) -120);
        if (var2 != 0) {
            arg0.field301--;
            this.field4553 = new class225();
            this.field4553.method1551(arg0);
            this.field4563 = new class225();
            this.field4563.method1551(arg0);
        }
        int var3 = arg0.method126((byte) -74);
        if (var3 != 0) {
            arg0.field301--;
            this.field4569 = new class225();
            this.field4569.method1551(arg0);
            this.field4570 = new class225();
            this.field4570.method1551(arg0);
        }
        int var4 = arg0.method126((byte) -77);
        if (var4 != 0) {
            arg0.field301--;
            this.field4567 = new class225();
            this.field4567.method1551(arg0);
            this.field4559 = new class225();
            this.field4559.method1551(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method123(false);
            if (var6 == 0) {
                break;
            }
            this.field4562[var5] = var6;
            this.field4552[var5] = arg0.method137(-49152);
            this.field4566[var5] = arg0.method123(false);
        }
        this.field4557 = arg0.method123(false);
        this.field4568 = arg0.method123(false);
        this.field4560 = arg0.method132(77);
        this.field4558 = arg0.method132(117);
        this.field4555 = new class486();
        this.field4561 = new class225();
        this.field4555.method2844(arg0, this.field4561);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4554[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4556 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4556[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4571 = new int[220500];
        field4573 = new int[5];
        field4574 = new int[5];
        field4572 = new int[5];
        field4575 = new int[5];
        field4576 = new int[5];
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    private int[] field2672 = new int[5];

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private int field2677 = 100;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    private int[] field2684 = new int[5];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field2675 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field2688 = 500;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    private int[] field2678 = new int[5];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    private static int[] field2676 = new int[32768];

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[I")
    private static int[] field2681;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
    private static int[] field2680;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
    private static int[] field2691;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    private static int[] field2692;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
    private static int[] field2695;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    private static int[] field2694;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    private static int[] field2696;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lcf;")
    private class21 field2673;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lcf;")
    private class21 field2674;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lcf;")
    private class21 field2679;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lcf;")
    private class21 field2682;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lcf;")
    private class21 field2683;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lcf;")
    private class21 field2685;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lcf;")
    private class21 field2689;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lcf;")
    private class21 field2690;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lcf;")
    private class21 field2693;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ldf;")
    private class28 field2687;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lna;)V")
    public final void method945(class91 arg0) {
        this.field2683 = new class21();
        this.field2683.method139(arg0);
        this.field2693 = new class21();
        this.field2693.method139(arg0);
        int var2 = arg0.method649(false);
        if (var2 != 0) {
            arg0.field2043--;
            this.field2682 = new class21();
            this.field2682.method139(arg0);
            this.field2673 = new class21();
            this.field2673.method139(arg0);
        }
        int var3 = arg0.method649(false);
        if (var3 != 0) {
            arg0.field2043--;
            this.field2685 = new class21();
            this.field2685.method139(arg0);
            this.field2674 = new class21();
            this.field2674.method139(arg0);
        }
        int var4 = arg0.method649(false);
        if (var4 != 0) {
            arg0.field2043--;
            this.field2689 = new class21();
            this.field2689.method139(arg0);
            this.field2690 = new class21();
            this.field2690.method139(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method662((byte) 28);
            if (var6 == 0) {
                break;
            }
            this.field2672[var5] = var6;
            this.field2684[var5] = arg0.method650(-64);
            this.field2678[var5] = arg0.method662((byte) 94);
        }
        this.field2686 = arg0.method662((byte) 2);
        this.field2677 = arg0.method662((byte) 28);
        this.field2688 = arg0.method641(255);
        this.field2675 = arg0.method641(255);
        this.field2687 = new class28();
        this.field2679 = new class21();
        this.field2687.method183(arg0, this.field2679);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method946() {
        field2680 = null;
        field2676 = null;
        field2681 = null;
        field2694 = null;
        field2696 = null;
        field2691 = null;
        field2692 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
    public final int[] method947(int arg0, int arg1) {
        class139.method1052(field2680, 0, arg0);
        if (arg1 < 10) {
            return field2680;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2683.method138();
        this.field2693.method138();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2682 != null) {
            this.field2682.method138();
            this.field2673.method138();
            var5 = (int) ((double) (this.field2682.field374 - this.field2682.field373) * 32.768D / var3);
            var6 = (int) ((double) this.field2682.field373 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2685 != null) {
            this.field2685.method138();
            this.field2674.method138();
            var8 = (int) ((double) (this.field2685.field374 - this.field2685.field373) * 32.768D / var3);
            var9 = (int) ((double) this.field2685.field373 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2672[var11] != 0) {
                field2694[var11] = 0;
                field2696[var11] = (int) ((double) this.field2678[var11] * var3);
                field2691[var11] = (this.field2672[var11] << 14) / 100;
                field2692[var11] = (int) ((double) (this.field2683.field374 - this.field2683.field373) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2684[var11]) / var3);
                field2695[var11] = (int) ((double) this.field2683.field373 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2683.method140(arg0);
            int var40 = this.field2693.method140(arg0);
            if (this.field2682 != null) {
                int var41 = this.field2682.method140(arg0);
                int var42 = this.field2673.method140(arg0);
                var39 += this.method948(var7, var42, this.field2682.field372) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2685 != null) {
                int var43 = this.field2685.method140(arg0);
                int var44 = this.field2674.method140(arg0);
                var40 = var40 * ((this.method948(var10, var44, this.field2685.field372) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2672[var45] != 0) {
                    int var46 = field2696[var45] + var12;
                    if (var46 < arg0) {
                        field2680[var46] += this.method948(field2694[var45], field2691[var45] * var40 >> 15, this.field2683.field372);
                        field2694[var45] += (field2692[var45] * var39 >> 16) + field2695[var45];
                    }
                }
            }
        }
        if (this.field2689 != null) {
            this.field2689.method138();
            this.field2690.method138();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2689.method140(arg0);
                int var18 = this.field2690.method140(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2689.field374 - this.field2689.field373) * var17 >> 8) + this.field2689.field373;
                } else {
                    var19 = ((this.field2689.field374 - this.field2689.field373) * var18 >> 8) + this.field2689.field373;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2680[var16] = 0;
                }
            }
        }
        if (this.field2686 > 0 && this.field2677 > 0) {
            int var20 = (int) ((double) this.field2686 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2680[var21] += field2680[var21 - var20] * this.field2677 / 100;
            }
        }
        if (this.field2687.field505[0] > 0 || this.field2687.field505[1] > 0) {
            this.field2679.method138();
            int var22 = this.field2679.method140(arg0 + 1);
            int var23 = this.field2687.method184(0, (float) var22 / 65536.0F);
            int var24 = this.field2687.method184(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2680[var23 + var25] * (long) class28.field504 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2680[var23 + var25 - var36 - 1] * (long) class28.field506[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2680[var25 - var37 - 1] * (long) class28.field506[1][var37] >> 16);
                    }
                    field2680[var25] = var35;
                    var22 = this.field2679.method140(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2680[var23 + var25] * (long) class28.field504 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2680[var23 + var25 - var33 - 1] * (long) class28.field506[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2680[var25 - var34 - 1] * (long) class28.field506[1][var34] >> 16);
                        }
                        field2680[var25] = var32;
                        var22 = this.field2679.method140(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2680[var23 + var25 - var29 - 1] * (long) class28.field506[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2680[var25 - var30 - 1] * (long) class28.field506[1][var30] >> 16);
                            }
                            field2680[var25] = var28;
                            this.field2679.method140(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2687.method184(0, (float) var22 / 65536.0F);
                    var24 = this.field2687.method184(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2680[var38] < -32768) {
                field2680[var38] = -32768;
            }
            if (field2680[var38] > 32767) {
                field2680[var38] = 32767;
            }
        }
        return field2680;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
    private final int method948(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2681[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2676[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2676[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2681 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2681[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2680 = new int[220500];
        field2691 = new int[5];
        field2692 = new int[5];
        field2695 = new int[5];
        field2694 = new int[5];
        field2696 = new int[5];
    }
}

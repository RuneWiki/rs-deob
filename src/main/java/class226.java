import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class226 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    private int[] field3792 = new int[5];

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private int[] field3793 = new int[5];

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private int field3801 = 100;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field3802 = 0;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field3791 = 500;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    private int field3803 = 0;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "[I")
    private int[] field3809 = new int[5];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    private static int[] field3800 = new int[32768];

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
    private static int[] field3799;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    private static int[] field3789;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    private static int[] field3807;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    private static int[] field3806;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[I")
    private static int[] field3810;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    private static int[] field3812;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    private static int[] field3808;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lnb;")
    private class128 field3788;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lnb;")
    private class128 field3790;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lnb;")
    private class128 field3794;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lnb;")
    private class128 field3795;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lnb;")
    private class128 field3796;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lnb;")
    private class128 field3798;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lnb;")
    private class128 field3804;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lnb;")
    private class128 field3805;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lnb;")
    private class128 field3811;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lqe;")
    private class278 field3797;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    private final int method1519(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3799[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3800[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method1520(int arg0, int arg1) {
        class235.method1554(field3789, 0, arg0);
        if (arg1 < 10) {
            return field3789;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3811.method882();
        this.field3790.method882();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3805 != null) {
            this.field3805.method882();
            this.field3794.method882();
            var5 = (int) ((double) (this.field3805.field2248 - this.field3805.field2249) * 32.768D / var3);
            var6 = (int) ((double) this.field3805.field2249 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3788 != null) {
            this.field3788.method882();
            this.field3798.method882();
            var8 = (int) ((double) (this.field3788.field2248 - this.field3788.field2249) * 32.768D / var3);
            var9 = (int) ((double) this.field3788.field2249 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3793[var11] != 0) {
                field3808[var11] = 0;
                field3806[var11] = (int) ((double) this.field3809[var11] * var3);
                field3807[var11] = (this.field3793[var11] << 14) / 100;
                field3812[var11] = (int) ((double) (this.field3811.field2248 - this.field3811.field2249) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3792[var11]) / var3);
                field3810[var11] = (int) ((double) this.field3811.field2249 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3811.method885(arg0);
            int var40 = this.field3790.method885(arg0);
            if (this.field3805 != null) {
                int var41 = this.field3805.method885(arg0);
                int var42 = this.field3794.method885(arg0);
                var39 += this.method1519(var7, var42, this.field3805.field2252) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3788 != null) {
                int var43 = this.field3788.method885(arg0);
                int var44 = this.field3798.method885(arg0);
                var40 = var40 * ((this.method1519(var10, var44, this.field3788.field2252) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3793[var45] != 0) {
                    int var46 = field3806[var45] + var12;
                    if (var46 < arg0) {
                        field3789[var46] += this.method1519(field3808[var45], field3807[var45] * var40 >> 15, this.field3811.field2252);
                        field3808[var45] += (field3812[var45] * var39 >> 16) + field3810[var45];
                    }
                }
            }
        }
        if (this.field3804 != null) {
            this.field3804.method882();
            this.field3796.method882();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3804.method885(arg0);
                int var18 = this.field3796.method885(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3804.field2248 - this.field3804.field2249) * var17 >> 8) + this.field3804.field2249;
                } else {
                    var19 = ((this.field3804.field2248 - this.field3804.field2249) * var18 >> 8) + this.field3804.field2249;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3789[var16] = 0;
                }
            }
        }
        if (this.field3803 > 0 && this.field3801 > 0) {
            int var20 = (int) ((double) this.field3803 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3789[var21] += field3789[var21 - var20] * this.field3801 / 100;
            }
        }
        if (this.field3797.field4443[0] > 0 || this.field3797.field4443[1] > 0) {
            this.field3795.method882();
            int var22 = this.field3795.method885(arg0 + 1);
            int var23 = this.field3797.method1820(0, (float) var22 / 65536.0F);
            int var24 = this.field3797.method1820(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3789[var23 + var25] * (long) class278.field4447 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3789[var23 + var25 - var36 - 1] * (long) class278.field4442[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3789[var25 - var37 - 1] * (long) class278.field4442[1][var37] >> 16);
                    }
                    field3789[var25] = var35;
                    var22 = this.field3795.method885(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3789[var23 + var25] * (long) class278.field4447 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3789[var23 + var25 - var33 - 1] * (long) class278.field4442[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3789[var25 - var34 - 1] * (long) class278.field4442[1][var34] >> 16);
                        }
                        field3789[var25] = var32;
                        var22 = this.field3795.method885(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3789[var23 + var25 - var29 - 1] * (long) class278.field4442[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3789[var25 - var30 - 1] * (long) class278.field4442[1][var30] >> 16);
                            }
                            field3789[var25] = var28;
                            this.field3795.method885(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3797.method1820(0, (float) var22 / 65536.0F);
                    var24 = this.field3797.method1820(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3789[var38] < -32768) {
                field3789[var38] = -32768;
            }
            if (field3789[var38] > 32767) {
                field3789[var38] = 32767;
            }
        }
        return field3789;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Leh;)V")
    public final void method1521(class101 arg0) {
        this.field3811 = new class128();
        this.field3811.method883(arg0);
        this.field3790 = new class128();
        this.field3790.method883(arg0);
        int var2 = arg0.method669((byte) 36);
        if (var2 != 0) {
            arg0.field1762--;
            this.field3805 = new class128();
            this.field3805.method883(arg0);
            this.field3794 = new class128();
            this.field3794.method883(arg0);
        }
        int var3 = arg0.method669((byte) 36);
        if (var3 != 0) {
            arg0.field1762--;
            this.field3788 = new class128();
            this.field3788.method883(arg0);
            this.field3798 = new class128();
            this.field3798.method883(arg0);
        }
        int var4 = arg0.method669((byte) 36);
        if (var4 != 0) {
            arg0.field1762--;
            this.field3804 = new class128();
            this.field3804.method883(arg0);
            this.field3796 = new class128();
            this.field3796.method883(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method692(27029);
            if (var6 == 0) {
                break;
            }
            this.field3793[var5] = var6;
            this.field3792[var5] = arg0.method648(-64);
            this.field3809[var5] = arg0.method692(27029);
        }
        this.field3803 = arg0.method692(27029);
        this.field3801 = arg0.method692(27029);
        this.field3791 = arg0.method677(false);
        this.field3802 = arg0.method677(false);
        this.field3797 = new class278();
        this.field3795 = new class128();
        this.field3797.method1817(arg0, this.field3795);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static void method1522() {
        field3789 = null;
        field3800 = null;
        field3799 = null;
        field3808 = null;
        field3806 = null;
        field3807 = null;
        field3812 = null;
        field3810 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3800[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3799 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3799[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3789 = new int[220500];
        field3807 = new int[5];
        field3806 = new int[5];
        field3810 = new int[5];
        field3812 = new int[5];
        field3808 = new int[5];
    }
}

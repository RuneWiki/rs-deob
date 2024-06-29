import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class293 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
    private int[] field3780 = new int[5];

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public int field3784 = 500;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    private int field3791 = 100;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
    private int[] field3783 = new int[5];

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    private int[] field3786 = new int[5];

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    private int field3788 = 0;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public int field3802 = 0;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
    private static int[] field3789 = new int[32768];

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "[I")
    private static int[] field3787;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
    private static int[] field3782;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[I")
    private static int[] field3798;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[I")
    private static int[] field3801;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "[I")
    private static int[] field3799;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "[I")
    private static int[] field3803;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "[I")
    private static int[] field3804;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lea;")
    private class18 field3793;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lck;")
    private class208 field3781;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lck;")
    private class208 field3785;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "Lck;")
    private class208 field3790;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Lck;")
    private class208 field3792;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lck;")
    private class208 field3794;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Lck;")
    private class208 field3795;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Lck;")
    private class208 field3796;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "Lck;")
    private class208 field3797;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "Lck;")
    private class208 field3800;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3789[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3787 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3787[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3782 = new int[220500];
        field3798 = new int[5];
        field3801 = new int[5];
        field3799 = new int[5];
        field3803 = new int[5];
        field3804 = new int[5];
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lfd;)V", line = 6)
    public final void method1733(class418 arg0) {
        this.field3797 = new class208();
        this.field3797.method1336(arg0);
        this.field3800 = new class208();
        this.field3800.method1336(arg0);
        int var2 = arg0.method2396(-108);
        if (var2 != 0) {
            arg0.field5367--;
            this.field3796 = new class208();
            this.field3796.method1336(arg0);
            this.field3792 = new class208();
            this.field3792.method1336(arg0);
        }
        int var3 = arg0.method2396(81);
        if (var3 != 0) {
            arg0.field5367--;
            this.field3794 = new class208();
            this.field3794.method1336(arg0);
            this.field3790 = new class208();
            this.field3790.method1336(arg0);
        }
        int var4 = arg0.method2396(33);
        if (var4 != 0) {
            arg0.field5367--;
            this.field3795 = new class208();
            this.field3795.method1336(arg0);
            this.field3785 = new class208();
            this.field3785.method1336(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2400((byte) 36);
            if (var6 == 0) {
                break;
            }
            this.field3783[var5] = var6;
            this.field3786[var5] = arg0.method2369(255);
            this.field3780[var5] = arg0.method2400((byte) 36);
        }
        this.field3788 = arg0.method2400((byte) 36);
        this.field3791 = arg0.method2400((byte) 36);
        this.field3784 = arg0.method2393(-30727);
        this.field3802 = arg0.method2393(-30727);
        this.field3793 = new class18();
        this.field3781 = new class208();
        this.field3793.method104(arg0, this.field3781);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I", line = 70)
    private final int method1734(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3787[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3789[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V", line = 92)
    public static void method1735() {
        field3782 = null;
        field3789 = null;
        field3787 = null;
        field3804 = null;
        field3798 = null;
        field3803 = null;
        field3801 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I", line = 110)
    public final int[] method1736(int arg0, int arg1) {
        class443.method2515(field3782, 0, arg0);
        if (arg1 < 10) {
            return field3782;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3797.method1333();
        this.field3800.method1333();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3796 != null) {
            this.field3796.method1333();
            this.field3792.method1333();
            var5 = (int) ((double) (this.field3796.field2678 - this.field3796.field2676) * 32.768D / var3);
            var6 = (int) ((double) this.field3796.field2676 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3794 != null) {
            this.field3794.method1333();
            this.field3790.method1333();
            var8 = (int) ((double) (this.field3794.field2678 - this.field3794.field2676) * 32.768D / var3);
            var9 = (int) ((double) this.field3794.field2676 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3783[var11] != 0) {
                field3804[var11] = 0;
                field3798[var11] = (int) ((double) this.field3780[var11] * var3);
                field3803[var11] = (this.field3783[var11] << 14) / 100;
                field3801[var11] = (int) ((double) (this.field3797.field2678 - this.field3797.field2676) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3786[var11]) / var3);
                field3799[var11] = (int) ((double) this.field3797.field2676 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3797.method1334(arg0);
            int var40 = this.field3800.method1334(arg0);
            if (this.field3796 != null) {
                int var41 = this.field3796.method1334(arg0);
                int var42 = this.field3792.method1334(arg0);
                var39 += this.method1734(var7, var42, this.field3796.field2677) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3794 != null) {
                int var43 = this.field3794.method1334(arg0);
                int var44 = this.field3790.method1334(arg0);
                var40 = var40 * ((this.method1734(var10, var44, this.field3794.field2677) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3783[var45] != 0) {
                    int var46 = field3798[var45] + var12;
                    if (var46 < arg0) {
                        field3782[var46] += this.method1734(field3804[var45], field3803[var45] * var40 >> 15, this.field3797.field2677);
                        field3804[var45] += (field3801[var45] * var39 >> 16) + field3799[var45];
                    }
                }
            }
        }
        if (this.field3795 != null) {
            this.field3795.method1333();
            this.field3785.method1333();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3795.method1334(arg0);
                int var18 = this.field3785.method1334(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3795.field2678 - this.field3795.field2676) * var17 >> 8) + this.field3795.field2676;
                } else {
                    var19 = ((this.field3795.field2678 - this.field3795.field2676) * var18 >> 8) + this.field3795.field2676;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3782[var16] = 0;
                }
            }
        }
        if (this.field3788 > 0 && this.field3791 > 0) {
            int var20 = (int) ((double) this.field3788 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3782[var21] += field3782[var21 - var20] * this.field3791 / 100;
            }
        }
        if (this.field3793.field202[0] > 0 || this.field3793.field202[1] > 0) {
            this.field3781.method1333();
            int var22 = this.field3781.method1334(arg0 + 1);
            int var23 = this.field3793.method105(0, (float) var22 / 65536.0F);
            int var24 = this.field3793.method105(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3782[var23 + var25] * (long) class18.field206 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3782[var23 + var25 - var36 - 1] * (long) class18.field204[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3782[var25 - var37 - 1] * (long) class18.field204[1][var37] >> 16);
                    }
                    field3782[var25] = var35;
                    var22 = this.field3781.method1334(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3782[var23 + var25] * (long) class18.field206 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3782[var23 + var25 - var33 - 1] * (long) class18.field204[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3782[var25 - var34 - 1] * (long) class18.field204[1][var34] >> 16);
                        }
                        field3782[var25] = var32;
                        var22 = this.field3781.method1334(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3782[var23 + var25 - var29 - 1] * (long) class18.field204[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3782[var25 - var30 - 1] * (long) class18.field204[1][var30] >> 16);
                            }
                            field3782[var25] = var28;
                            this.field3781.method1334(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3793.method105(0, (float) var22 / 65536.0F);
                    var24 = this.field3793.method105(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3782[var38] < -32768) {
                field3782[var38] = -32768;
            }
            if (field3782[var38] > 32767) {
                field3782[var38] = 32767;
            }
        }
        return field3782;
    }
}

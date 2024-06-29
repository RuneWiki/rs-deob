import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class48 {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field681 = 500;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    private int[] field676 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field673 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    private int[] field674 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    private int[] field679 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    private int field685 = 100;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    private int field677 = 0;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    private static int[] field688 = new int[32768];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    private static int[] field675;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
    private static int[] field687;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
    private static int[] field690;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
    private static int[] field693;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    private static int[] field689;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
    private static int[] field691;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
    private static int[] field696;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lhe;")
    private class251 field683;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lgg;")
    private class53 field678;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lgg;")
    private class53 field680;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lgg;")
    private class53 field682;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lgg;")
    private class53 field684;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lgg;")
    private class53 field686;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lgg;")
    private class53 field692;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lgg;")
    private class53 field694;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lgg;")
    private class53 field695;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lgg;")
    private class53 field697;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 6)
    public static void method332() {
        field687 = null;
        field688 = null;
        field675 = null;
        field693 = null;
        field690 = null;
        field689 = null;
        field696 = null;
        field691 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lgn;)V", line = 22)
    public final void method333(class303 arg0) {
        this.field697 = new class53();
        this.field697.method360(arg0);
        this.field694 = new class53();
        this.field694.method360(arg0);
        int var2 = arg0.method2043((byte) -107);
        if (var2 != 0) {
            arg0.field4679--;
            this.field686 = new class53();
            this.field686.method360(arg0);
            this.field680 = new class53();
            this.field680.method360(arg0);
        }
        int var3 = arg0.method2043((byte) -122);
        if (var3 != 0) {
            arg0.field4679--;
            this.field692 = new class53();
            this.field692.method360(arg0);
            this.field678 = new class53();
            this.field678.method360(arg0);
        }
        int var4 = arg0.method2043((byte) -119);
        if (var4 != 0) {
            arg0.field4679--;
            this.field684 = new class53();
            this.field684.method360(arg0);
            this.field695 = new class53();
            this.field695.method360(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2003(-53);
            if (var6 == 0) {
                break;
            }
            this.field674[var5] = var6;
            this.field676[var5] = arg0.method2035(-49152);
            this.field679[var5] = arg0.method2003(7);
        }
        this.field677 = arg0.method2003(122);
        this.field685 = arg0.method2003(121);
        this.field681 = arg0.method1994(false);
        this.field673 = arg0.method1994(false);
        this.field683 = new class251();
        this.field682 = new class53();
        this.field683.method1698(arg0, this.field682);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I", line = 97)
    public final int[] method334(int arg0, int arg1) {
        class223.method1498(field687, 0, arg0);
        if (arg1 < 10) {
            return field687;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field697.method357();
        this.field694.method357();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field686 != null) {
            this.field686.method357();
            this.field680.method357();
            var5 = (int) ((double) (this.field686.field753 - this.field686.field754) * 32.768D / var3);
            var6 = (int) ((double) this.field686.field754 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field692 != null) {
            this.field692.method357();
            this.field678.method357();
            var8 = (int) ((double) (this.field692.field753 - this.field692.field754) * 32.768D / var3);
            var9 = (int) ((double) this.field692.field754 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field674[var11] != 0) {
                field693[var11] = 0;
                field690[var11] = (int) ((double) this.field679[var11] * var3);
                field689[var11] = (this.field674[var11] << 14) / 100;
                field696[var11] = (int) ((double) (this.field697.field753 - this.field697.field754) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field676[var11]) / var3);
                field691[var11] = (int) ((double) this.field697.field754 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field697.method358(arg0);
            int var14 = this.field694.method358(arg0);
            if (this.field686 != null) {
                int var15 = this.field686.method358(arg0);
                int var16 = this.field680.method358(arg0);
                var13 += this.method335(var7, var16, this.field686.field749) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field692 != null) {
                int var17 = this.field692.method358(arg0);
                int var18 = this.field678.method358(arg0);
                var14 = var14 * ((this.method335(var10, var18, this.field692.field749) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field674[var19] != 0) {
                    int var20 = field690[var19] + var12;
                    if (var20 < arg0) {
                        field687[var20] += this.method335(field693[var19], field689[var19] * var14 >> 15, this.field697.field749);
                        field693[var19] += (field696[var19] * var13 >> 16) + field691[var19];
                    }
                }
            }
        }
        if (this.field684 != null) {
            this.field684.method357();
            this.field695.method357();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field684.method358(arg0);
                int var26 = this.field695.method358(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field684.field753 - this.field684.field754) * var25 >> 8) + this.field684.field754;
                } else {
                    var27 = ((this.field684.field753 - this.field684.field754) * var26 >> 8) + this.field684.field754;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field687[var24] = 0;
                }
            }
        }
        if (this.field677 > 0 && this.field685 > 0) {
            int var28 = (int) ((double) this.field677 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field687[var29] += field687[var29 - var28] * this.field685 / 100;
            }
        }
        if (this.field683.field3926[0] > 0 || this.field683.field3926[1] > 0) {
            this.field682.method357();
            int var30 = this.field682.method358(arg0 + 1);
            int var31 = this.field683.method1696(0, (float) var30 / 65536.0F);
            int var32 = this.field683.method1696(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field687[var31 + var33] * (long) class251.field3925 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field687[var31 + var33 - var36 - 1] * (long) class251.field3920[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field687[var33 - var37 - 1] * (long) class251.field3920[1][var37] >> 16);
                    }
                    field687[var33] = var35;
                    var30 = this.field682.method358(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field687[var31 + var33] * (long) class251.field3925 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field687[var31 + var33 - var40 - 1] * (long) class251.field3920[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field687[var33 - var41 - 1] * (long) class251.field3920[1][var41] >> 16);
                        }
                        field687[var33] = var39;
                        var30 = this.field682.method358(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field687[var31 + var33 - var43 - 1] * (long) class251.field3920[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field687[var33 - var44 - 1] * (long) class251.field3920[1][var44] >> 16);
                            }
                            field687[var33] = var42;
                            this.field682.method358(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field683.method1696(0, (float) var30 / 65536.0F);
                    var32 = this.field683.method1696(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field687[var46] < -32768) {
                field687[var46] = -32768;
            }
            if (field687[var46] > 32767) {
                field687[var46] = 32767;
            }
        }
        return field687;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)I", line = 390)
    private final int method335(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field675[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field688[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field688[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field675 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field675[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field687 = new int[220500];
        field690 = new int[5];
        field693 = new int[5];
        field689 = new int[5];
        field691 = new int[5];
        field696 = new int[5];
    }
}

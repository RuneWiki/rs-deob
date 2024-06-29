import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class234 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
    private int[] field3896 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public int field3900 = 500;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field3905 = 0;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    private int[] field3906 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    private int field3904 = 100;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field3913 = 0;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[I")
    private int[] field3907 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[I")
    private static int[] field3909 = new int[32768];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
    private static int[] field3895;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
    private static int[] field3901;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
    private static int[] field3915;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[I")
    private static int[] field3914;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    private static int[] field3918;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[I")
    private static int[] field3917;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
    private static int[] field3919;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lhf;")
    private class14 field3898;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lhf;")
    private class14 field3899;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lhf;")
    private class14 field3902;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lhf;")
    private class14 field3903;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lhf;")
    private class14 field3908;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Lhf;")
    private class14 field3910;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Lhf;")
    private class14 field3911;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Lhf;")
    private class14 field3912;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Lhf;")
    private class14 field3916;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ldf;")
    private class155 field3897;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method1661(int arg0, int arg1) {
        class161.method1236(field3901, 0, arg0);
        if (arg1 < 10) {
            return field3901;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3912.method119();
        this.field3898.method119();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3899 != null) {
            this.field3899.method119();
            this.field3916.method119();
            var5 = (int) ((double) (this.field3899.field227 - this.field3899.field222) * 32.768D / var3);
            var6 = (int) ((double) this.field3899.field222 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3903 != null) {
            this.field3903.method119();
            this.field3910.method119();
            var8 = (int) ((double) (this.field3903.field227 - this.field3903.field222) * 32.768D / var3);
            var9 = (int) ((double) this.field3903.field222 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3906[var11] != 0) {
                field3917[var11] = 0;
                field3914[var11] = (int) ((double) this.field3907[var11] * var3);
                field3918[var11] = (this.field3906[var11] << 14) / 100;
                field3919[var11] = (int) ((double) (this.field3912.field227 - this.field3912.field222) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3896[var11]) / var3);
                field3915[var11] = (int) ((double) this.field3912.field222 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field3912.method117(arg0);
            int var14 = this.field3898.method117(arg0);
            if (this.field3899 != null) {
                int var15 = this.field3899.method117(arg0);
                int var16 = this.field3916.method117(arg0);
                var13 += this.method1663(var7, var16, this.field3899.field224) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field3903 != null) {
                int var17 = this.field3903.method117(arg0);
                int var18 = this.field3910.method117(arg0);
                var14 = var14 * ((this.method1663(var10, var18, this.field3903.field224) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field3906[var19] != 0) {
                    int var20 = field3914[var19] + var12;
                    if (var20 < arg0) {
                        field3901[var20] += this.method1663(field3917[var19], field3918[var19] * var14 >> 15, this.field3912.field224);
                        field3917[var19] += (field3919[var19] * var13 >> 16) + field3915[var19];
                    }
                }
            }
        }
        if (this.field3902 != null) {
            this.field3902.method119();
            this.field3908.method119();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field3902.method117(arg0);
                int var26 = this.field3908.method117(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field3902.field227 - this.field3902.field222) * var25 >> 8) + this.field3902.field222;
                } else {
                    var27 = ((this.field3902.field227 - this.field3902.field222) * var26 >> 8) + this.field3902.field222;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field3901[var24] = 0;
                }
            }
        }
        if (this.field3913 > 0 && this.field3904 > 0) {
            int var28 = (int) ((double) this.field3913 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field3901[var29] += field3901[var29 - var28] * this.field3904 / 100;
            }
        }
        if (this.field3897.field2743[0] > 0 || this.field3897.field2743[1] > 0) {
            this.field3911.method119();
            int var30 = this.field3911.method117(arg0 + 1);
            int var31 = this.field3897.method1205(0, (float) var30 / 65536.0F);
            int var32 = this.field3897.method1205(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field3901[var31 + var33] * (long) class155.field2740 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field3901[var31 + var33 - var36 - 1] * (long) class155.field2737[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field3901[var33 - var37 - 1] * (long) class155.field2737[1][var37] >> 16);
                    }
                    field3901[var33] = var35;
                    var30 = this.field3911.method117(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field3901[var31 + var33] * (long) class155.field2740 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field3901[var31 + var33 - var40 - 1] * (long) class155.field2737[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field3901[var33 - var41 - 1] * (long) class155.field2737[1][var41] >> 16);
                        }
                        field3901[var33] = var39;
                        var30 = this.field3911.method117(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field3901[var31 + var33 - var43 - 1] * (long) class155.field2737[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field3901[var33 - var44 - 1] * (long) class155.field2737[1][var44] >> 16);
                            }
                            field3901[var33] = var42;
                            this.field3911.method117(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field3897.method1205(0, (float) var30 / 65536.0F);
                    var32 = this.field3897.method1205(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field3901[var46] < -32768) {
                field3901[var46] = -32768;
            }
            if (field3901[var46] > 32767) {
                field3901[var46] = 32767;
            }
        }
        return field3901;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lb;)V", line = 304)
    public final void method1662(class94 arg0) {
        this.field3912 = new class14();
        this.field3912.method118(arg0);
        this.field3898 = new class14();
        this.field3898.method118(arg0);
        int var2 = arg0.method756(915905888);
        if (var2 != 0) {
            arg0.field1653--;
            this.field3899 = new class14();
            this.field3899.method118(arg0);
            this.field3916 = new class14();
            this.field3916.method118(arg0);
        }
        int var3 = arg0.method756(915905888);
        if (var3 != 0) {
            arg0.field1653--;
            this.field3903 = new class14();
            this.field3903.method118(arg0);
            this.field3910 = new class14();
            this.field3910.method118(arg0);
        }
        int var4 = arg0.method756(915905888);
        if (var4 != 0) {
            arg0.field1653--;
            this.field3902 = new class14();
            this.field3902.method118(arg0);
            this.field3908 = new class14();
            this.field3908.method118(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method755((byte) -101);
            if (var6 == 0) {
                break;
            }
            this.field3906[var5] = var6;
            this.field3896[var5] = arg0.method702(-70);
            this.field3907[var5] = arg0.method755((byte) -101);
        }
        this.field3913 = arg0.method755((byte) -101);
        this.field3904 = arg0.method755((byte) -101);
        this.field3900 = arg0.method761((byte) 108);
        this.field3905 = arg0.method761((byte) 108);
        this.field3897 = new class155();
        this.field3911 = new class14();
        this.field3897.method1207(arg0, this.field3911);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I", line = 376)
    private final int method1663(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3895[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3909[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 398)
    public static void method1664() {
        field3901 = null;
        field3909 = null;
        field3895 = null;
        field3917 = null;
        field3914 = null;
        field3918 = null;
        field3919 = null;
        field3915 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3909[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3895 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3895[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3901 = new int[220500];
        field3915 = new int[5];
        field3914 = new int[5];
        field3918 = new int[5];
        field3917 = new int[5];
        field3919 = new int[5];
    }
}

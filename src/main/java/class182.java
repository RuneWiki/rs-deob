import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class182 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public int field2849 = 500;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    private int field2853 = 0;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field2856 = 0;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
    private int[] field2859 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[I")
    private int[] field2860 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    private int field2867 = 100;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[I")
    private int[] field2868 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    private static int[] field2857 = new int[32768];

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    private static int[] field2854;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[I")
    private static int[] field2861;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
    private static int[] field2862;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
    private static int[] field2863;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    private static int[] field2864;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
    private static int[] field2866;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
    private static int[] field2865;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Lnl;")
    private class30 field2869;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lff;")
    private class52 field2847;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lff;")
    private class52 field2848;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lff;")
    private class52 field2850;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lff;")
    private class52 field2851;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lff;")
    private class52 field2852;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lff;")
    private class52 field2855;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lff;")
    private class52 field2858;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lff;")
    private class52 field2870;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Lff;")
    private class52 field2871;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V", line = 13)
    public static void method1255() {
        field2861 = null;
        field2857 = null;
        field2854 = null;
        field2864 = null;
        field2865 = null;
        field2866 = null;
        field2862 = null;
        field2863 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I", line = 35)
    private final int method1256(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2854[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2857[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2857[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2854 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2854[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2861 = new int[220500];
        field2862 = new int[5];
        field2863 = new int[5];
        field2864 = new int[5];
        field2866 = new int[5];
        field2865 = new int[5];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I", line = 93)
    public final int[] method1257(int arg0, int arg1) {
        class75.method542(field2861, 0, arg0);
        if (arg1 < 10) {
            return field2861;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2852.method380();
        this.field2850.method380();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2871 != null) {
            this.field2871.method380();
            this.field2870.method380();
            var5 = (int) ((double) (this.field2871.field820 - this.field2871.field818) * 32.768D / var3);
            var6 = (int) ((double) this.field2871.field818 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2858 != null) {
            this.field2858.method380();
            this.field2847.method380();
            var8 = (int) ((double) (this.field2858.field820 - this.field2858.field818) * 32.768D / var3);
            var9 = (int) ((double) this.field2858.field818 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2859[var11] != 0) {
                field2864[var11] = 0;
                field2865[var11] = (int) ((double) this.field2860[var11] * var3);
                field2866[var11] = (this.field2859[var11] << 14) / 100;
                field2862[var11] = (int) ((double) (this.field2852.field820 - this.field2852.field818) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2868[var11]) / var3);
                field2863[var11] = (int) ((double) this.field2852.field818 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2852.method379(arg0);
            int var14 = this.field2850.method379(arg0);
            if (this.field2871 != null) {
                int var15 = this.field2871.method379(arg0);
                int var16 = this.field2870.method379(arg0);
                var13 += this.method1256(var7, var16, this.field2871.field816) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2858 != null) {
                int var17 = this.field2858.method379(arg0);
                int var18 = this.field2847.method379(arg0);
                var14 = var14 * ((this.method1256(var10, var18, this.field2858.field816) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2859[var19] != 0) {
                    int var20 = field2865[var19] + var12;
                    if (var20 < arg0) {
                        field2861[var20] += this.method1256(field2864[var19], field2866[var19] * var14 >> 15, this.field2852.field816);
                        field2864[var19] += (field2862[var19] * var13 >> 16) + field2863[var19];
                    }
                }
            }
        }
        if (this.field2848 != null) {
            this.field2848.method380();
            this.field2851.method380();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2848.method379(arg0);
                int var26 = this.field2851.method379(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2848.field820 - this.field2848.field818) * var25 >> 8) + this.field2848.field818;
                } else {
                    var27 = ((this.field2848.field820 - this.field2848.field818) * var26 >> 8) + this.field2848.field818;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2861[var24] = 0;
                }
            }
        }
        if (this.field2853 > 0 && this.field2867 > 0) {
            int var28 = (int) ((double) this.field2853 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2861[var29] += field2861[var29 - var28] * this.field2867 / 100;
            }
        }
        if (this.field2869.field514[0] > 0 || this.field2869.field514[1] > 0) {
            this.field2855.method380();
            int var30 = this.field2855.method379(arg0 + 1);
            int var31 = this.field2869.method241(0, (float) var30 / 65536.0F);
            int var32 = this.field2869.method241(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2861[var31 + var33] * (long) class30.field516 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2861[var31 + var33 - var36 - 1] * (long) class30.field515[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2861[var33 - var37 - 1] * (long) class30.field515[1][var37] >> 16);
                    }
                    field2861[var33] = var35;
                    var30 = this.field2855.method379(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2861[var31 + var33] * (long) class30.field516 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2861[var31 + var33 - var40 - 1] * (long) class30.field515[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2861[var33 - var41 - 1] * (long) class30.field515[1][var41] >> 16);
                        }
                        field2861[var33] = var39;
                        var30 = this.field2855.method379(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2861[var31 + var33 - var43 - 1] * (long) class30.field515[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2861[var33 - var44 - 1] * (long) class30.field515[1][var44] >> 16);
                            }
                            field2861[var33] = var42;
                            this.field2855.method379(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2869.method241(0, (float) var30 / 65536.0F);
                    var32 = this.field2869.method241(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2861[var46] < -32768) {
                field2861[var46] = -32768;
            }
            if (field2861[var46] > 32767) {
                field2861[var46] = 32767;
            }
        }
        return field2861;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lwa;)V", line = 381)
    public final void method1258(class82 arg0) {
        this.field2852 = new class52();
        this.field2852.method382(arg0);
        this.field2850 = new class52();
        this.field2850.method382(arg0);
        int var2 = arg0.method642((byte) -113);
        if (var2 != 0) {
            arg0.field1301--;
            this.field2871 = new class52();
            this.field2871.method382(arg0);
            this.field2870 = new class52();
            this.field2870.method382(arg0);
        }
        int var3 = arg0.method642((byte) -57);
        if (var3 != 0) {
            arg0.field1301--;
            this.field2858 = new class52();
            this.field2858.method382(arg0);
            this.field2847 = new class52();
            this.field2847.method382(arg0);
        }
        int var4 = arg0.method642((byte) -117);
        if (var4 != 0) {
            arg0.field1301--;
            this.field2848 = new class52();
            this.field2848.method382(arg0);
            this.field2851 = new class52();
            this.field2851.method382(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method617(true);
            if (var6 == 0) {
                break;
            }
            this.field2859[var5] = var6;
            this.field2868[var5] = arg0.method636(-21208);
            this.field2860[var5] = arg0.method617(true);
        }
        this.field2853 = arg0.method617(true);
        this.field2867 = arg0.method617(true);
        this.field2849 = arg0.method576(1);
        this.field2856 = arg0.method576(1);
        this.field2869 = new class30();
        this.field2855 = new class52();
        this.field2869.method239(arg0, this.field2855);
    }
}

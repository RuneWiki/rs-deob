import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class185 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    private int field2914 = 100;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    private int field2919 = 0;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "[I")
    private int[] field2926 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "[I")
    private int[] field2922 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public int field2930 = 0;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[I")
    private int[] field2933 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public int field2931 = 500;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
    private static int[] field2929 = new int[32768];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    private static int[] field2915;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[I")
    private static int[] field2928;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "[I")
    private static int[] field2934;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "[I")
    private static int[] field2936;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "[I")
    private static int[] field2935;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "[I")
    private static int[] field2937;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "[I")
    private static int[] field2938;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lkd;")
    private class123 field2916;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lkd;")
    private class123 field2918;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lkd;")
    private class123 field2920;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lkd;")
    private class123 field2921;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lkd;")
    private class123 field2923;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lkd;")
    private class123 field2924;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lkd;")
    private class123 field2925;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lkd;")
    private class123 field2927;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lkd;")
    private class123 field2932;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ln;")
    private class9 field2917;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lwm;)V", line = 6)
    public final void method1369(class254 arg0) {
        this.field2920 = new class123();
        this.field2920.method917(arg0);
        this.field2916 = new class123();
        this.field2916.method917(arg0);
        int var2 = arg0.method1774((byte) -116);
        if (var2 != 0) {
            arg0.field3866--;
            this.field2927 = new class123();
            this.field2927.method917(arg0);
            this.field2924 = new class123();
            this.field2924.method917(arg0);
        }
        int var3 = arg0.method1774((byte) -111);
        if (var3 != 0) {
            arg0.field3866--;
            this.field2918 = new class123();
            this.field2918.method917(arg0);
            this.field2932 = new class123();
            this.field2932.method917(arg0);
        }
        int var4 = arg0.method1774((byte) -123);
        if (var4 != 0) {
            arg0.field3866--;
            this.field2925 = new class123();
            this.field2925.method917(arg0);
            this.field2921 = new class123();
            this.field2921.method917(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1730(false);
            if (var6 == 0) {
                break;
            }
            this.field2922[var5] = var6;
            this.field2926[var5] = arg0.method1763((byte) 75);
            this.field2933[var5] = arg0.method1730(false);
        }
        this.field2919 = arg0.method1730(false);
        this.field2914 = arg0.method1730(false);
        this.field2931 = arg0.method1755(false);
        this.field2930 = arg0.method1755(false);
        this.field2917 = new class9();
        this.field2923 = new class123();
        this.field2917.method87(arg0, this.field2923);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V", line = 66)
    public static void method1370() {
        field2928 = null;
        field2929 = null;
        field2915 = null;
        field2938 = null;
        field2937 = null;
        field2934 = null;
        field2935 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I", line = 90)
    public final int[] method1371(int arg0, int arg1) {
        class126.method943(field2928, 0, arg0);
        if (arg1 < 10) {
            return field2928;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2920.method920();
        this.field2916.method920();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2927 != null) {
            this.field2927.method920();
            this.field2924.method920();
            var5 = (int) ((double) (this.field2927.field1877 - this.field2927.field1878) * 32.768D / var3);
            var6 = (int) ((double) this.field2927.field1878 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2918 != null) {
            this.field2918.method920();
            this.field2932.method920();
            var8 = (int) ((double) (this.field2918.field1877 - this.field2918.field1878) * 32.768D / var3);
            var9 = (int) ((double) this.field2918.field1878 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2922[var11] != 0) {
                field2938[var11] = 0;
                field2937[var11] = (int) ((double) this.field2933[var11] * var3);
                field2934[var11] = (this.field2922[var11] << 14) / 100;
                field2935[var11] = (int) ((double) (this.field2920.field1877 - this.field2920.field1878) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2926[var11]) / var3);
                field2936[var11] = (int) ((double) this.field2920.field1878 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2920.method919(arg0);
            int var14 = this.field2916.method919(arg0);
            if (this.field2927 != null) {
                int var15 = this.field2927.method919(arg0);
                int var16 = this.field2924.method919(arg0);
                var13 += this.method1372(var7, var16, this.field2927.field1876) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2918 != null) {
                int var17 = this.field2918.method919(arg0);
                int var18 = this.field2932.method919(arg0);
                var14 = var14 * ((this.method1372(var10, var18, this.field2918.field1876) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2922[var19] != 0) {
                    int var20 = field2937[var19] + var12;
                    if (var20 < arg0) {
                        field2928[var20] += this.method1372(field2938[var19], field2934[var19] * var14 >> 15, this.field2920.field1876);
                        field2938[var19] += (field2935[var19] * var13 >> 16) + field2936[var19];
                    }
                }
            }
        }
        if (this.field2925 != null) {
            this.field2925.method920();
            this.field2921.method920();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2925.method919(arg0);
                int var26 = this.field2921.method919(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2925.field1877 - this.field2925.field1878) * var25 >> 8) + this.field2925.field1878;
                } else {
                    var27 = ((this.field2925.field1877 - this.field2925.field1878) * var26 >> 8) + this.field2925.field1878;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2928[var24] = 0;
                }
            }
        }
        if (this.field2919 > 0 && this.field2914 > 0) {
            int var28 = (int) ((double) this.field2919 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2928[var29] += field2928[var29 - var28] * this.field2914 / 100;
            }
        }
        if (this.field2917.field132[0] > 0 || this.field2917.field132[1] > 0) {
            this.field2923.method920();
            int var30 = this.field2923.method919(arg0 + 1);
            int var31 = this.field2917.method88(0, (float) var30 / 65536.0F);
            int var32 = this.field2917.method88(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2928[var31 + var33] * (long) class9.field130 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2928[var31 + var33 - var36 - 1] * (long) class9.field137[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2928[var33 - var37 - 1] * (long) class9.field137[1][var37] >> 16);
                    }
                    field2928[var33] = var35;
                    var30 = this.field2923.method919(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2928[var31 + var33] * (long) class9.field130 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2928[var31 + var33 - var40 - 1] * (long) class9.field137[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2928[var33 - var41 - 1] * (long) class9.field137[1][var41] >> 16);
                        }
                        field2928[var33] = var39;
                        var30 = this.field2923.method919(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2928[var31 + var33 - var43 - 1] * (long) class9.field137[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2928[var33 - var44 - 1] * (long) class9.field137[1][var44] >> 16);
                            }
                            field2928[var33] = var42;
                            this.field2923.method919(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2917.method88(0, (float) var30 / 65536.0F);
                    var32 = this.field2917.method88(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2928[var46] < -32768) {
                field2928[var46] = -32768;
            }
            if (field2928[var46] > 32767) {
                field2928[var46] = 32767;
            }
        }
        return field2928;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I", line = 385)
    private final int method1372(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2915[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2929[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2929[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2915 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2915[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2928 = new int[220500];
        field2934 = new int[5];
        field2936 = new int[5];
        field2935 = new int[5];
        field2937 = new int[5];
        field2938 = new int[5];
    }
}

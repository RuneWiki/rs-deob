import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class234 {

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[I")
    private int[] field2918 = new int[5];

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "[I")
    private int[] field2920 = new int[5];

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    private int field2924 = 100;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public int field2917 = 0;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    private int field2916 = 0;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public int field2929 = 500;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "[I")
    private int[] field2930 = new int[5];

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "[I")
    private static int[] field2919 = new int[32768];

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
    private static int[] field2914;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[I")
    private static int[] field2915;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[I")
    private static int[] field2932;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "[I")
    private static int[] field2933;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "[I")
    private static int[] field2934;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "[I")
    private static int[] field2936;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "[I")
    private static int[] field2935;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Laba;")
    private class240 field2912;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Laba;")
    private class240 field2913;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "Laba;")
    private class240 field2921;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "Laba;")
    private class240 field2922;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Laba;")
    private class240 field2925;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Laba;")
    private class240 field2926;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Laba;")
    private class240 field2927;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Laba;")
    private class240 field2928;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "Laba;")
    private class240 field2931;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Lom;")
    private class363 field2923;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2919[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2914 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2914[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2915 = new int[220500];
        field2932 = new int[5];
        field2933 = new int[5];
        field2934 = new int[5];
        field2936 = new int[5];
        field2935 = new int[5];
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Les;)V", line = 8)
    public final void method1408(class630 arg0) {
        this.field2927 = new class240();
        this.field2927.method1439(arg0);
        this.field2913 = new class240();
        this.field2913.method1439(arg0);
        int var2 = arg0.method3501(-9268);
        if (var2 != 0) {
            arg0.field8812--;
            this.field2931 = new class240();
            this.field2931.method1439(arg0);
            this.field2928 = new class240();
            this.field2928.method1439(arg0);
        }
        int var3 = arg0.method3501(-9268);
        if (var3 != 0) {
            arg0.field8812--;
            this.field2921 = new class240();
            this.field2921.method1439(arg0);
            this.field2922 = new class240();
            this.field2922.method1439(arg0);
        }
        int var4 = arg0.method3501(-9268);
        if (var4 != 0) {
            arg0.field8812--;
            this.field2925 = new class240();
            this.field2925.method1439(arg0);
            this.field2912 = new class240();
            this.field2912.method1439(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3504(-13829);
            if (var6 == 0) {
                break;
            }
            this.field2918[var5] = var6;
            this.field2920[var5] = arg0.method3465(-9561);
            this.field2930[var5] = arg0.method3504(-13829);
        }
        this.field2916 = arg0.method3504(-13829);
        this.field2924 = arg0.method3504(-13829);
        this.field2929 = arg0.method3470(13111);
        this.field2917 = arg0.method3470(13111);
        this.field2923 = new class363();
        this.field2926 = new class240();
        this.field2923.method1993(arg0, this.field2926);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()V", line = 88)
    public static void method1409() {
        field2915 = null;
        field2919 = null;
        field2914 = null;
        field2932 = null;
        field2935 = null;
        field2934 = null;
        field2933 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)I", line = 101)
    private final int method1410(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2914[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2919[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I", line = 122)
    public final int[] method1411(int arg0, int arg1) {
        class293.method1643(field2915, 0, arg0);
        if (arg1 < 10) {
            return field2915;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2927.method1437();
        this.field2913.method1437();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2931 != null) {
            this.field2931.method1437();
            this.field2928.method1437();
            var5 = (int) ((double) (this.field2931.field2996 - this.field2931.field2997) * 32.768D / var3);
            var6 = (int) ((double) this.field2931.field2997 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2921 != null) {
            this.field2921.method1437();
            this.field2922.method1437();
            var8 = (int) ((double) (this.field2921.field2996 - this.field2921.field2997) * 32.768D / var3);
            var9 = (int) ((double) this.field2921.field2997 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2918[var11] != 0) {
                field2932[var11] = 0;
                field2935[var11] = (int) ((double) this.field2930[var11] * var3);
                field2934[var11] = (this.field2918[var11] << 14) / 100;
                field2933[var11] = (int) ((double) (this.field2927.field2996 - this.field2927.field2997) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2920[var11]) / var3);
                field2936[var11] = (int) ((double) this.field2927.field2997 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2927.method1436(arg0);
            int var40 = this.field2913.method1436(arg0);
            if (this.field2931 != null) {
                int var41 = this.field2931.method1436(arg0);
                int var42 = this.field2928.method1436(arg0);
                var39 += this.method1410(var7, var42, this.field2931.field2999) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2921 != null) {
                int var43 = this.field2921.method1436(arg0);
                int var44 = this.field2922.method1436(arg0);
                var40 = var40 * ((this.method1410(var10, var44, this.field2921.field2999) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2918[var45] != 0) {
                    int var46 = field2935[var45] + var12;
                    if (var46 < arg0) {
                        field2915[var46] += this.method1410(field2932[var45], field2934[var45] * var40 >> 15, this.field2927.field2999);
                        field2932[var45] += (field2933[var45] * var39 >> 16) + field2936[var45];
                    }
                }
            }
        }
        if (this.field2925 != null) {
            this.field2925.method1437();
            this.field2912.method1437();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2925.method1436(arg0);
                int var18 = this.field2912.method1436(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2925.field2996 - this.field2925.field2997) * var17 >> 8) + this.field2925.field2997;
                } else {
                    var19 = ((this.field2925.field2996 - this.field2925.field2997) * var18 >> 8) + this.field2925.field2997;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2915[var16] = 0;
                }
            }
        }
        if (this.field2916 > 0 && this.field2924 > 0) {
            int var20 = (int) ((double) this.field2916 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2915[var21] += field2915[var21 - var20] * this.field2924 / 100;
            }
        }
        if (this.field2923.field4615[0] > 0 || this.field2923.field4615[1] > 0) {
            this.field2926.method1437();
            int var22 = this.field2926.method1436(arg0 + 1);
            int var23 = this.field2923.method1995(0, (float) var22 / 65536.0F);
            int var24 = this.field2923.method1995(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2915[var23 + var25] * (long) class363.field4618 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2915[var23 + var25 - var36 - 1] * (long) class363.field4616[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2915[var25 - var37 - 1] * (long) class363.field4616[1][var37] >> 16);
                    }
                    field2915[var25] = var35;
                    var22 = this.field2926.method1436(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2915[var23 + var25] * (long) class363.field4618 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2915[var23 + var25 - var33 - 1] * (long) class363.field4616[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2915[var25 - var34 - 1] * (long) class363.field4616[1][var34] >> 16);
                        }
                        field2915[var25] = var32;
                        var22 = this.field2926.method1436(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2915[var23 + var25 - var29 - 1] * (long) class363.field4616[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2915[var25 - var30 - 1] * (long) class363.field4616[1][var30] >> 16);
                            }
                            field2915[var25] = var28;
                            this.field2926.method1436(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2923.method1995(0, (float) var22 / 65536.0F);
                    var24 = this.field2923.method1995(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2915[var38] < -32768) {
                field2915[var38] = -32768;
            }
            if (field2915[var38] > 32767) {
                field2915[var38] = 32767;
            }
        }
        return field2915;
    }
}

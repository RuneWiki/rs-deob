import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class222 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public int field2917 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    private int field2920 = 100;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    private int[] field2921 = new int[5];

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field2919 = 500;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    private int field2916 = 0;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[I")
    private int[] field2929 = new int[5];

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
    private int[] field2930 = new int[5];

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[I")
    private static int[] field2934 = new int[32768];

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "[I")
    private static int[] field2932;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
    private static int[] field2924;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "[I")
    private static int[] field2936;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "[I")
    private static int[] field2937;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "[I")
    private static int[] field2935;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "[I")
    private static int[] field2938;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "[I")
    private static int[] field2939;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lrs;")
    private class238 field2915;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lrs;")
    private class238 field2918;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lrs;")
    private class238 field2922;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lrs;")
    private class238 field2923;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lrs;")
    private class238 field2925;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lrs;")
    private class238 field2926;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lrs;")
    private class238 field2928;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lrs;")
    private class238 field2931;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lrs;")
    private class238 field2933;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lec;")
    private class37 field2927;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2934[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2932 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2932[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2924 = new int[220500];
        field2936 = new int[5];
        field2937 = new int[5];
        field2935 = new int[5];
        field2938 = new int[5];
        field2939 = new int[5];
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I", line = 7)
    private final int method1290(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2932[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2934[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V", line = 35)
    public static void method1291() {
        field2924 = null;
        field2934 = null;
        field2932 = null;
        field2935 = null;
        field2936 = null;
        field2938 = null;
        field2937 = null;
        field2939 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lnj;)V", line = 69)
    public final void method1292(class228 arg0) {
        this.field2933 = new class238();
        this.field2933.method1440(arg0);
        this.field2915 = new class238();
        this.field2915.method1440(arg0);
        int var2 = arg0.method1348(-95);
        if (var2 != 0) {
            arg0.field3029--;
            this.field2923 = new class238();
            this.field2923.method1440(arg0);
            this.field2928 = new class238();
            this.field2928.method1440(arg0);
        }
        int var3 = arg0.method1348(-88);
        if (var3 != 0) {
            arg0.field3029--;
            this.field2918 = new class238();
            this.field2918.method1440(arg0);
            this.field2922 = new class238();
            this.field2922.method1440(arg0);
        }
        int var4 = arg0.method1348(-123);
        if (var4 != 0) {
            arg0.field3029--;
            this.field2926 = new class238();
            this.field2926.method1440(arg0);
            this.field2931 = new class238();
            this.field2931.method1440(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1327((byte) -64);
            if (var6 == 0) {
                break;
            }
            this.field2929[var5] = var6;
            this.field2921[var5] = arg0.method1351((byte) -123);
            this.field2930[var5] = arg0.method1327((byte) -64);
        }
        this.field2916 = arg0.method1327((byte) -64);
        this.field2920 = arg0.method1327((byte) -64);
        this.field2919 = arg0.method1343(255);
        this.field2917 = arg0.method1343(255);
        this.field2927 = new class37();
        this.field2925 = new class238();
        this.field2927.method270(arg0, this.field2925);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method1293(int arg0, int arg1) {
        class60.method423(field2924, 0, arg0);
        if (arg1 < 10) {
            return field2924;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2933.method1439();
        this.field2915.method1439();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2923 != null) {
            this.field2923.method1439();
            this.field2928.method1439();
            var5 = (int) ((double) (this.field2923.field3194 - this.field2923.field3196) * 32.768D / var3);
            var6 = (int) ((double) this.field2923.field3196 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2918 != null) {
            this.field2918.method1439();
            this.field2922.method1439();
            var8 = (int) ((double) (this.field2918.field3194 - this.field2918.field3196) * 32.768D / var3);
            var9 = (int) ((double) this.field2918.field3196 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2929[var11] != 0) {
                field2935[var11] = 0;
                field2936[var11] = (int) ((double) this.field2930[var11] * var3);
                field2938[var11] = (this.field2929[var11] << 14) / 100;
                field2937[var11] = (int) ((double) (this.field2933.field3194 - this.field2933.field3196) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2921[var11]) / var3);
                field2939[var11] = (int) ((double) this.field2933.field3196 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2933.method1441(arg0);
            int var40 = this.field2915.method1441(arg0);
            if (this.field2923 != null) {
                int var41 = this.field2923.method1441(arg0);
                int var42 = this.field2928.method1441(arg0);
                var39 += this.method1290(var7, var42, this.field2923.field3199) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2918 != null) {
                int var43 = this.field2918.method1441(arg0);
                int var44 = this.field2922.method1441(arg0);
                var40 = var40 * ((this.method1290(var10, var44, this.field2918.field3199) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2929[var45] != 0) {
                    int var46 = field2936[var45] + var12;
                    if (var46 < arg0) {
                        field2924[var46] += this.method1290(field2935[var45], field2938[var45] * var40 >> 15, this.field2933.field3199);
                        field2935[var45] += (field2937[var45] * var39 >> 16) + field2939[var45];
                    }
                }
            }
        }
        if (this.field2926 != null) {
            this.field2926.method1439();
            this.field2931.method1439();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2926.method1441(arg0);
                int var18 = this.field2931.method1441(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2926.field3194 - this.field2926.field3196) * var17 >> 8) + this.field2926.field3196;
                } else {
                    var19 = ((this.field2926.field3194 - this.field2926.field3196) * var18 >> 8) + this.field2926.field3196;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2924[var16] = 0;
                }
            }
        }
        if (this.field2916 > 0 && this.field2920 > 0) {
            int var20 = (int) ((double) this.field2916 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2924[var21] += field2924[var21 - var20] * this.field2920 / 100;
            }
        }
        if (this.field2927.field529[0] > 0 || this.field2927.field529[1] > 0) {
            this.field2925.method1439();
            int var22 = this.field2925.method1441(arg0 + 1);
            int var23 = this.field2927.method268(0, (float) var22 / 65536.0F);
            int var24 = this.field2927.method268(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2924[var23 + var25] * (long) class37.field524 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2924[var23 + var25 - var36 - 1] * (long) class37.field527[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2924[var25 - var37 - 1] * (long) class37.field527[1][var37] >> 16);
                    }
                    field2924[var25] = var35;
                    var22 = this.field2925.method1441(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2924[var23 + var25] * (long) class37.field524 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2924[var23 + var25 - var33 - 1] * (long) class37.field527[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2924[var25 - var34 - 1] * (long) class37.field527[1][var34] >> 16);
                        }
                        field2924[var25] = var32;
                        var22 = this.field2925.method1441(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2924[var23 + var25 - var29 - 1] * (long) class37.field527[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2924[var25 - var30 - 1] * (long) class37.field527[1][var30] >> 16);
                            }
                            field2924[var25] = var28;
                            this.field2925.method1441(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2927.method268(0, (float) var22 / 65536.0F);
                    var24 = this.field2927.method268(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2924[var38] < -32768) {
                field2924[var38] = -32768;
            }
            if (field2924[var38] > 32767) {
                field2924[var38] = 32767;
            }
        }
        return field2924;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class51 {

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    private int[] field905 = new int[5];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field909 = 0;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    private int[] field906 = new int[5];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field900 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    private int field907 = 100;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field903 = 500;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
    private int[] field922 = new int[5];

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
    private static int[] field917 = new int[32768];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    private static int[] field899;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
    private static int[] field908;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
    private static int[] field920;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[I")
    private static int[] field919;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[I")
    private static int[] field921;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
    private static int[] field918;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
    private static int[] field923;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Loe;")
    private class132 field901;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lrg;")
    private class161 field902;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lrg;")
    private class161 field904;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lrg;")
    private class161 field910;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lrg;")
    private class161 field911;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lrg;")
    private class161 field912;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lrg;")
    private class161 field913;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lrg;")
    private class161 field914;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lrg;")
    private class161 field915;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lrg;")
    private class161 field916;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void method358() {
        field908 = null;
        field917 = null;
        field899 = null;
        field918 = null;
        field921 = null;
        field920 = null;
        field919 = null;
        field923 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
    private final int method359(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field899[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field917[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public final int[] method360(int arg0, int arg1) {
        class12.method82(field908, 0, arg0);
        if (arg1 < 10) {
            return field908;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field912.method1069();
        this.field915.method1069();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field913 != null) {
            this.field913.method1069();
            this.field916.method1069();
            var5 = (int) ((double) (this.field913.field3091 - this.field913.field3090) * 32.768D / var3);
            var6 = (int) ((double) this.field913.field3090 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field904 != null) {
            this.field904.method1069();
            this.field902.method1069();
            var8 = (int) ((double) (this.field904.field3091 - this.field904.field3090) * 32.768D / var3);
            var9 = (int) ((double) this.field904.field3090 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field905[var11] != 0) {
                field918[var11] = 0;
                field921[var11] = (int) ((double) this.field922[var11] * var3);
                field920[var11] = (this.field905[var11] << 14) / 100;
                field919[var11] = (int) ((double) (this.field912.field3091 - this.field912.field3090) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field906[var11]) / var3);
                field923[var11] = (int) ((double) this.field912.field3090 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field912.method1067(arg0);
            int var40 = this.field915.method1067(arg0);
            if (this.field913 != null) {
                int var41 = this.field913.method1067(arg0);
                int var42 = this.field916.method1067(arg0);
                var39 += this.method359(var7, var42, this.field913.field3093) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field904 != null) {
                int var43 = this.field904.method1067(arg0);
                int var44 = this.field902.method1067(arg0);
                var40 = var40 * ((this.method359(var10, var44, this.field904.field3093) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field905[var45] != 0) {
                    int var46 = field921[var45] + var12;
                    if (var46 < arg0) {
                        field908[var46] += this.method359(field918[var45], field920[var45] * var40 >> 15, this.field912.field3093);
                        field918[var45] += (field919[var45] * var39 >> 16) + field923[var45];
                    }
                }
            }
        }
        if (this.field911 != null) {
            this.field911.method1069();
            this.field914.method1069();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field911.method1067(arg0);
                int var18 = this.field914.method1067(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field911.field3091 - this.field911.field3090) * var17 >> 8) + this.field911.field3090;
                } else {
                    var19 = ((this.field911.field3091 - this.field911.field3090) * var18 >> 8) + this.field911.field3090;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field908[var16] = 0;
                }
            }
        }
        if (this.field900 > 0 && this.field907 > 0) {
            int var20 = (int) ((double) this.field900 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field908[var21] += field908[var21 - var20] * this.field907 / 100;
            }
        }
        if (this.field901.field2490[0] > 0 || this.field901.field2490[1] > 0) {
            this.field910.method1069();
            int var22 = this.field910.method1067(arg0 + 1);
            int var23 = this.field901.method911(0, (float) var22 / 65536.0F);
            int var24 = this.field901.method911(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field908[var23 + var25] * (long) class132.field2487 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field908[var23 + var25 - var36 - 1] * (long) class132.field2488[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field908[var25 - var37 - 1] * (long) class132.field2488[1][var37] >> 16);
                    }
                    field908[var25] = var35;
                    var22 = this.field910.method1067(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field908[var23 + var25] * (long) class132.field2487 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field908[var23 + var25 - var33 - 1] * (long) class132.field2488[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field908[var25 - var34 - 1] * (long) class132.field2488[1][var34] >> 16);
                        }
                        field908[var25] = var32;
                        var22 = this.field910.method1067(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field908[var23 + var25 - var29 - 1] * (long) class132.field2488[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field908[var25 - var30 - 1] * (long) class132.field2488[1][var30] >> 16);
                            }
                            field908[var25] = var28;
                            this.field910.method1067(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field901.method911(0, (float) var22 / 65536.0F);
                    var24 = this.field901.method911(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field908[var38] < -32768) {
                field908[var38] = -32768;
            }
            if (field908[var38] > 32767) {
                field908[var38] = 32767;
            }
        }
        return field908;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lme;)V")
    public final void method361(class114 arg0) {
        this.field912 = new class161();
        this.field912.method1068(arg0);
        this.field915 = new class161();
        this.field915.method1068(arg0);
        int var2 = arg0.method767(true);
        if (var2 != 0) {
            arg0.field2170--;
            this.field913 = new class161();
            this.field913.method1068(arg0);
            this.field916 = new class161();
            this.field916.method1068(arg0);
        }
        int var3 = arg0.method767(true);
        if (var3 != 0) {
            arg0.field2170--;
            this.field904 = new class161();
            this.field904.method1068(arg0);
            this.field902 = new class161();
            this.field902.method1068(arg0);
        }
        int var4 = arg0.method767(true);
        if (var4 != 0) {
            arg0.field2170--;
            this.field911 = new class161();
            this.field911.method1068(arg0);
            this.field914 = new class161();
            this.field914.method1068(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method804((byte) -67);
            if (var6 == 0) {
                break;
            }
            this.field905[var5] = var6;
            this.field906[var5] = arg0.method794((byte) 21);
            this.field922[var5] = arg0.method804((byte) -53);
        }
        this.field900 = arg0.method804((byte) -64);
        this.field907 = arg0.method804((byte) -46);
        this.field903 = arg0.method762((byte) 114);
        this.field909 = arg0.method762((byte) 120);
        this.field901 = new class132();
        this.field910 = new class161();
        this.field901.method915(arg0, this.field910);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field917[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field899 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field899[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field908 = new int[220500];
        field920 = new int[5];
        field919 = new int[5];
        field921 = new int[5];
        field918 = new int[5];
        field923 = new int[5];
    }
}

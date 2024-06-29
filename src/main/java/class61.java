import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    private int[] field908 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[I")
    private int[] field909 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    private int field911 = 0;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    private int[] field919 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field917 = 100;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public int field920 = 0;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public int field932 = 500;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[I")
    private static int[] field922 = new int[32768];

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    private static int[] field923;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[I")
    private static int[] field912;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[I")
    private static int[] field926;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[I")
    private static int[] field928;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[I")
    private static int[] field930;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[I")
    private static int[] field927;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
    private static int[] field931;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lpf;")
    private class84 field921;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Laa;")
    private class9 field910;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Laa;")
    private class9 field913;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Laa;")
    private class9 field914;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Laa;")
    private class9 field915;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Laa;")
    private class9 field916;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Laa;")
    private class9 field918;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Laa;")
    private class9 field924;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Laa;")
    private class9 field925;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Laa;")
    private class9 field929;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lhb;)V", line = 12)
    public final void method542(class35 arg0) {
        this.field915 = new class9();
        this.field915.method77(arg0);
        this.field910 = new class9();
        this.field910.method77(arg0);
        int var2 = arg0.method273(65280);
        if (var2 != 0) {
            arg0.field455--;
            this.field918 = new class9();
            this.field918.method77(arg0);
            this.field929 = new class9();
            this.field929.method77(arg0);
        }
        int var3 = arg0.method273(65280);
        if (var3 != 0) {
            arg0.field455--;
            this.field924 = new class9();
            this.field924.method77(arg0);
            this.field925 = new class9();
            this.field925.method77(arg0);
        }
        int var4 = arg0.method273(65280);
        if (var4 != 0) {
            arg0.field455--;
            this.field913 = new class9();
            this.field913.method77(arg0);
            this.field914 = new class9();
            this.field914.method77(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method241(0);
            if (var6 == 0) {
                break;
            }
            this.field909[var5] = var6;
            this.field908[var5] = arg0.method292(255);
            this.field919[var5] = arg0.method241(0);
        }
        this.field911 = arg0.method241(0);
        this.field917 = arg0.method241(0);
        this.field932 = arg0.method300(-1394191632);
        this.field920 = arg0.method300(-1394191632);
        this.field921 = new class84();
        this.field916 = new class9();
        this.field921.method691(arg0, this.field916);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)I", line = 75)
    private final int method543(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field923[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field922[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 111)
    public final int[] method544(int arg0, int arg1) {
        class151.method1113(field912, 0, arg0);
        if (arg1 < 10) {
            return field912;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field915.method75();
        this.field910.method75();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field918 != null) {
            this.field918.method75();
            this.field929.method75();
            var5 = (int) ((double) (this.field918.field81 - this.field918.field79) * 32.768D / var3);
            var6 = (int) ((double) this.field918.field79 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field924 != null) {
            this.field924.method75();
            this.field925.method75();
            var8 = (int) ((double) (this.field924.field81 - this.field924.field79) * 32.768D / var3);
            var9 = (int) ((double) this.field924.field79 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field909[var11] != 0) {
                field928[var11] = 0;
                field926[var11] = (int) ((double) this.field919[var11] * var3);
                field927[var11] = (this.field909[var11] << 14) / 100;
                field931[var11] = (int) ((double) (this.field915.field81 - this.field915.field79) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field908[var11]) / var3);
                field930[var11] = (int) ((double) this.field915.field79 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field915.method76(arg0);
            int var14 = this.field910.method76(arg0);
            if (this.field918 != null) {
                int var15 = this.field918.method76(arg0);
                int var16 = this.field929.method76(arg0);
                var13 += this.method543(var7, var16, this.field918.field84) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field924 != null) {
                int var17 = this.field924.method76(arg0);
                int var18 = this.field925.method76(arg0);
                var14 = var14 * ((this.method543(var10, var18, this.field924.field84) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field909[var19] != 0) {
                    int var20 = field926[var19] + var12;
                    if (var20 < arg0) {
                        field912[var20] += this.method543(field928[var19], field927[var19] * var14 >> 15, this.field915.field84);
                        field928[var19] += (field931[var19] * var13 >> 16) + field930[var19];
                    }
                }
            }
        }
        if (this.field913 != null) {
            this.field913.method75();
            this.field914.method75();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field913.method76(arg0);
                int var26 = this.field914.method76(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field913.field81 - this.field913.field79) * var25 >> 8) + this.field913.field79;
                } else {
                    var27 = ((this.field913.field81 - this.field913.field79) * var26 >> 8) + this.field913.field79;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field912[var24] = 0;
                }
            }
        }
        if (this.field911 > 0 && this.field917 > 0) {
            int var28 = (int) ((double) this.field911 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field912[var29] += field912[var29 - var28] * this.field917 / 100;
            }
        }
        if (this.field921.field1168[0] > 0 || this.field921.field1168[1] > 0) {
            this.field916.method75();
            int var30 = this.field916.method76(arg0 + 1);
            int var31 = this.field921.method692(0, (float) var30 / 65536.0F);
            int var32 = this.field921.method692(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field912[var31 + var33] * (long) class84.field1170 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field912[var31 + var33 - var36 - 1] * (long) class84.field1169[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field912[var33 - var37 - 1] * (long) class84.field1169[1][var37] >> 16);
                    }
                    field912[var33] = var35;
                    var30 = this.field916.method76(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field912[var31 + var33] * (long) class84.field1170 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field912[var31 + var33 - var40 - 1] * (long) class84.field1169[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field912[var33 - var41 - 1] * (long) class84.field1169[1][var41] >> 16);
                        }
                        field912[var33] = var39;
                        var30 = this.field916.method76(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field912[var31 + var33 - var43 - 1] * (long) class84.field1169[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field912[var33 - var44 - 1] * (long) class84.field1169[1][var44] >> 16);
                            }
                            field912[var33] = var42;
                            this.field916.method76(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field921.method692(0, (float) var30 / 65536.0F);
                    var32 = this.field921.method692(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field912[var46] < -32768) {
                field912[var46] = -32768;
            }
            if (field912[var46] > 32767) {
                field912[var46] = 32767;
            }
        }
        return field912;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field922[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field923 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field923[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field912 = new int[220500];
        field926 = new int[5];
        field928 = new int[5];
        field930 = new int[5];
        field927 = new int[5];
        field931 = new int[5];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()V", line = 432)
    public static void method545() {
        field912 = null;
        field922 = null;
        field923 = null;
        field928 = null;
        field926 = null;
        field927 = null;
        field931 = null;
        field930 = null;
    }
}

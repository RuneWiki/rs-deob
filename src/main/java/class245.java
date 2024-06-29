import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class245 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field4239 = 100;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field4240 = 500;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field4244 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    private int[] field4246 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    private int field4251 = 0;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[I")
    private int[] field4249 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    private int[] field4248 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "[I")
    private static int[] field4253 = new int[32768];

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
    private static int[] field4238;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    private static int[] field4234;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "[I")
    private static int[] field4255;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "[I")
    private static int[] field4256;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[I")
    private static int[] field4257;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
    private static int[] field4254;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "[I")
    private static int[] field4258;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lem;")
    private class11 field4235;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lem;")
    private class11 field4236;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lem;")
    private class11 field4237;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lem;")
    private class11 field4241;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lem;")
    private class11 field4242;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lem;")
    private class11 field4243;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lem;")
    private class11 field4245;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lem;")
    private class11 field4250;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Lem;")
    private class11 field4252;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lpf;")
    private class85 field4247;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method1685(int arg0, int arg1) {
        class23.method157(field4234, 0, arg0);
        if (arg1 < 10) {
            return field4234;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4252.method60();
        this.field4235.method60();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4241 != null) {
            this.field4241.method60();
            this.field4245.method60();
            var5 = (int) ((double) (this.field4241.field132 - this.field4241.field130) * 32.768D / var3);
            var6 = (int) ((double) this.field4241.field130 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4242 != null) {
            this.field4242.method60();
            this.field4250.method60();
            var8 = (int) ((double) (this.field4242.field132 - this.field4242.field130) * 32.768D / var3);
            var9 = (int) ((double) this.field4242.field130 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4248[var11] != 0) {
                field4258[var11] = 0;
                field4254[var11] = (int) ((double) this.field4249[var11] * var3);
                field4257[var11] = (this.field4248[var11] << 14) / 100;
                field4255[var11] = (int) ((double) (this.field4252.field132 - this.field4252.field130) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4246[var11]) / var3);
                field4256[var11] = (int) ((double) this.field4252.field130 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4252.method57(arg0);
            int var14 = this.field4235.method57(arg0);
            if (this.field4241 != null) {
                int var15 = this.field4241.method57(arg0);
                int var16 = this.field4245.method57(arg0);
                var13 += this.method1688(var7, var16, this.field4241.field134) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4242 != null) {
                int var17 = this.field4242.method57(arg0);
                int var18 = this.field4250.method57(arg0);
                var14 = var14 * ((this.method1688(var10, var18, this.field4242.field134) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4248[var19] != 0) {
                    int var20 = field4254[var19] + var12;
                    if (var20 < arg0) {
                        field4234[var20] += this.method1688(field4258[var19], field4257[var19] * var14 >> 15, this.field4252.field134);
                        field4258[var19] += (field4255[var19] * var13 >> 16) + field4256[var19];
                    }
                }
            }
        }
        if (this.field4237 != null) {
            this.field4237.method60();
            this.field4243.method60();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4237.method57(arg0);
                int var26 = this.field4243.method57(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4237.field132 - this.field4237.field130) * var25 >> 8) + this.field4237.field130;
                } else {
                    var27 = ((this.field4237.field132 - this.field4237.field130) * var26 >> 8) + this.field4237.field130;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4234[var24] = 0;
                }
            }
        }
        if (this.field4251 > 0 && this.field4239 > 0) {
            int var28 = (int) ((double) this.field4251 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4234[var29] += field4234[var29 - var28] * this.field4239 / 100;
            }
        }
        if (this.field4247.field1359[0] > 0 || this.field4247.field1359[1] > 0) {
            this.field4236.method60();
            int var30 = this.field4236.method57(arg0 + 1);
            int var31 = this.field4247.method591(0, (float) var30 / 65536.0F);
            int var32 = this.field4247.method591(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4234[var31 + var33] * (long) class85.field1358 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4234[var31 + var33 - var36 - 1] * (long) class85.field1355[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4234[var33 - var37 - 1] * (long) class85.field1355[1][var37] >> 16);
                    }
                    field4234[var33] = var35;
                    var30 = this.field4236.method57(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4234[var31 + var33] * (long) class85.field1358 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4234[var31 + var33 - var40 - 1] * (long) class85.field1355[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4234[var33 - var41 - 1] * (long) class85.field1355[1][var41] >> 16);
                        }
                        field4234[var33] = var39;
                        var30 = this.field4236.method57(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4234[var31 + var33 - var43 - 1] * (long) class85.field1355[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4234[var33 - var44 - 1] * (long) class85.field1355[1][var44] >> 16);
                            }
                            field4234[var33] = var42;
                            this.field4236.method57(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4247.method591(0, (float) var30 / 65536.0F);
                    var32 = this.field4247.method591(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4234[var46] < -32768) {
                field4234[var46] = -32768;
            }
            if (field4234[var46] > 32767) {
                field4234[var46] = 32767;
            }
        }
        return field4234;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V", line = 298)
    public static void method1686() {
        field4234 = null;
        field4253 = null;
        field4238 = null;
        field4258 = null;
        field4254 = null;
        field4257 = null;
        field4255 = null;
        field4256 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lrm;)V", line = 309)
    public final void method1687(class249 arg0) {
        this.field4252 = new class11();
        this.field4252.method58(arg0);
        this.field4235 = new class11();
        this.field4235.method58(arg0);
        int var2 = arg0.method1731(true);
        if (var2 != 0) {
            arg0.field4314--;
            this.field4241 = new class11();
            this.field4241.method58(arg0);
            this.field4245 = new class11();
            this.field4245.method58(arg0);
        }
        int var3 = arg0.method1731(true);
        if (var3 != 0) {
            arg0.field4314--;
            this.field4242 = new class11();
            this.field4242.method58(arg0);
            this.field4250 = new class11();
            this.field4250.method58(arg0);
        }
        int var4 = arg0.method1731(true);
        if (var4 != 0) {
            arg0.field4314--;
            this.field4237 = new class11();
            this.field4237.method58(arg0);
            this.field4243 = new class11();
            this.field4243.method58(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1739((byte) -41);
            if (var6 == 0) {
                break;
            }
            this.field4248[var5] = var6;
            this.field4246[var5] = arg0.method1713((byte) 16);
            this.field4249[var5] = arg0.method1739((byte) -67);
        }
        this.field4251 = arg0.method1739((byte) -95);
        this.field4239 = arg0.method1739((byte) -99);
        this.field4240 = arg0.method1712(-1);
        this.field4244 = arg0.method1712(-1);
        this.field4247 = new class85();
        this.field4236 = new class11();
        this.field4247.method586(arg0, this.field4236);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)I", line = 385)
    private final int method1688(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4238[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4253[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4253[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4238 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4238[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4234 = new int[220500];
        field4255 = new int[5];
        field4256 = new int[5];
        field4257 = new int[5];
        field4254 = new int[5];
        field4258 = new int[5];
    }
}

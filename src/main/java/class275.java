import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class275 {

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field4305 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
    private int[] field4302 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
    private int[] field4298 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field4297 = 100;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field4303 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
    private int[] field4309 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field4313 = 500;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    private static int[] field4296 = new int[32768];

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private static int[] field4306;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    private static int[] field4295;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
    private static int[] field4314;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    private static int[] field4308;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[I")
    private static int[] field4316;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    private static int[] field4317;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[I")
    private static int[] field4319;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lsb;")
    private class119 field4301;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lqe;")
    private class199 field4299;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lqe;")
    private class199 field4300;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lqe;")
    private class199 field4304;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lqe;")
    private class199 field4307;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lqe;")
    private class199 field4310;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lqe;")
    private class199 field4311;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lqe;")
    private class199 field4312;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lqe;")
    private class199 field4315;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lqe;")
    private class199 field4318;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 20)
    public static void method1954() {
        field4295 = null;
        field4296 = null;
        field4306 = null;
        field4317 = null;
        field4319 = null;
        field4308 = null;
        field4316 = null;
        field4314 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4296[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4306 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4306[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4295 = new int[220500];
        field4314 = new int[5];
        field4308 = new int[5];
        field4316 = new int[5];
        field4317 = new int[5];
        field4319 = new int[5];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I", line = 65)
    private final int method1955(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4306[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4296[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Laj;)V", line = 88)
    public final void method1956(class1 arg0) {
        this.field4312 = new class199();
        this.field4312.method1406(arg0);
        this.field4310 = new class199();
        this.field4310.method1406(arg0);
        int var2 = arg0.method15((byte) 93);
        if (var2 != 0) {
            arg0.field48--;
            this.field4318 = new class199();
            this.field4318.method1406(arg0);
            this.field4315 = new class199();
            this.field4315.method1406(arg0);
        }
        int var3 = arg0.method15((byte) -30);
        if (var3 != 0) {
            arg0.field48--;
            this.field4299 = new class199();
            this.field4299.method1406(arg0);
            this.field4311 = new class199();
            this.field4311.method1406(arg0);
        }
        int var4 = arg0.method15((byte) 113);
        if (var4 != 0) {
            arg0.field48--;
            this.field4300 = new class199();
            this.field4300.method1406(arg0);
            this.field4307 = new class199();
            this.field4307.method1406(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method63(127);
            if (var6 == 0) {
                break;
            }
            this.field4298[var5] = var6;
            this.field4302[var5] = arg0.method6(-118);
            this.field4309[var5] = arg0.method63(127);
        }
        this.field4303 = arg0.method63(127);
        this.field4297 = arg0.method63(127);
        this.field4313 = arg0.method56(19612);
        this.field4305 = arg0.method56(19612);
        this.field4301 = new class119();
        this.field4304 = new class199();
        this.field4301.method932(arg0, this.field4304);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I", line = 156)
    public final int[] method1957(int arg0, int arg1) {
        class330.method2309(field4295, 0, arg0);
        if (arg1 < 10) {
            return field4295;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4312.method1403();
        this.field4310.method1403();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4318 != null) {
            this.field4318.method1403();
            this.field4315.method1403();
            var5 = (int) ((double) (this.field4318.field3048 - this.field4318.field3051) * 32.768D / var3);
            var6 = (int) ((double) this.field4318.field3051 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4299 != null) {
            this.field4299.method1403();
            this.field4311.method1403();
            var8 = (int) ((double) (this.field4299.field3048 - this.field4299.field3051) * 32.768D / var3);
            var9 = (int) ((double) this.field4299.field3051 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4298[var11] != 0) {
                field4317[var11] = 0;
                field4319[var11] = (int) ((double) this.field4309[var11] * var3);
                field4308[var11] = (this.field4298[var11] << 14) / 100;
                field4316[var11] = (int) ((double) (this.field4312.field3048 - this.field4312.field3051) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4302[var11]) / var3);
                field4314[var11] = (int) ((double) this.field4312.field3051 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4312.method1405(arg0);
            int var14 = this.field4310.method1405(arg0);
            if (this.field4318 != null) {
                int var15 = this.field4318.method1405(arg0);
                int var16 = this.field4315.method1405(arg0);
                var13 += this.method1955(var7, var16, this.field4318.field3050) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4299 != null) {
                int var17 = this.field4299.method1405(arg0);
                int var18 = this.field4311.method1405(arg0);
                var14 = var14 * ((this.method1955(var10, var18, this.field4299.field3050) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4298[var19] != 0) {
                    int var20 = field4319[var19] + var12;
                    if (var20 < arg0) {
                        field4295[var20] += this.method1955(field4317[var19], field4308[var19] * var14 >> 15, this.field4312.field3050);
                        field4317[var19] += (field4316[var19] * var13 >> 16) + field4314[var19];
                    }
                }
            }
        }
        if (this.field4300 != null) {
            this.field4300.method1403();
            this.field4307.method1403();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4300.method1405(arg0);
                int var26 = this.field4307.method1405(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4300.field3048 - this.field4300.field3051) * var25 >> 8) + this.field4300.field3051;
                } else {
                    var27 = ((this.field4300.field3048 - this.field4300.field3051) * var26 >> 8) + this.field4300.field3051;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4295[var24] = 0;
                }
            }
        }
        if (this.field4303 > 0 && this.field4297 > 0) {
            int var28 = (int) ((double) this.field4303 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4295[var29] += field4295[var29 - var28] * this.field4297 / 100;
            }
        }
        if (this.field4301.field1921[0] > 0 || this.field4301.field1921[1] > 0) {
            this.field4304.method1403();
            int var30 = this.field4304.method1405(arg0 + 1);
            int var31 = this.field4301.method933(0, (float) var30 / 65536.0F);
            int var32 = this.field4301.method933(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4295[var31 + var33] * (long) class119.field1924 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4295[var31 + var33 - var36 - 1] * (long) class119.field1923[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4295[var33 - var37 - 1] * (long) class119.field1923[1][var37] >> 16);
                    }
                    field4295[var33] = var35;
                    var30 = this.field4304.method1405(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4295[var31 + var33] * (long) class119.field1924 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4295[var31 + var33 - var40 - 1] * (long) class119.field1923[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4295[var33 - var41 - 1] * (long) class119.field1923[1][var41] >> 16);
                        }
                        field4295[var33] = var39;
                        var30 = this.field4304.method1405(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4295[var31 + var33 - var43 - 1] * (long) class119.field1923[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4295[var33 - var44 - 1] * (long) class119.field1923[1][var44] >> 16);
                            }
                            field4295[var33] = var42;
                            this.field4304.method1405(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4301.method933(0, (float) var30 / 65536.0F);
                    var32 = this.field4301.method933(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4295[var46] < -32768) {
                field4295[var46] = -32768;
            }
            if (field4295[var46] > 32767) {
                field4295[var46] = 32767;
            }
        }
        return field4295;
    }
}

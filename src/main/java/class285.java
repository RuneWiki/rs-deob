import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class285 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public int field4493 = 500;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    private int[] field4496 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    private int[] field4500 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[I")
    private int[] field4513 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field4507 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    private int field4517 = 100;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field4516 = 0;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    private static int[] field4495 = new int[32768];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    private static int[] field4497;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    private static int[] field4499;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[I")
    private static int[] field4505;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
    private static int[] field4508;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[I")
    private static int[] field4502;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    private static int[] field4504;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[I")
    private static int[] field4514;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lwb;")
    private class165 field4494;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lwb;")
    private class165 field4498;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lwb;")
    private class165 field4501;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lwb;")
    private class165 field4503;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lwb;")
    private class165 field4506;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lwb;")
    private class165 field4509;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lwb;")
    private class165 field4510;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lwb;")
    private class165 field4511;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lwb;")
    private class165 field4512;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lik;")
    private class273 field4515;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lim;)V", line = 4)
    public final void method2010(class192 arg0) {
        this.field4509 = new class165();
        this.field4509.method1140(arg0);
        this.field4501 = new class165();
        this.field4501.method1140(arg0);
        int var2 = arg0.method1399(-1172389784);
        if (var2 != 0) {
            arg0.field3129--;
            this.field4503 = new class165();
            this.field4503.method1140(arg0);
            this.field4512 = new class165();
            this.field4512.method1140(arg0);
        }
        int var3 = arg0.method1399(-1172389784);
        if (var3 != 0) {
            arg0.field3129--;
            this.field4510 = new class165();
            this.field4510.method1140(arg0);
            this.field4511 = new class165();
            this.field4511.method1140(arg0);
        }
        int var4 = arg0.method1399(-1172389784);
        if (var4 != 0) {
            arg0.field3129--;
            this.field4506 = new class165();
            this.field4506.method1140(arg0);
            this.field4498 = new class165();
            this.field4498.method1140(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1362(7);
            if (var6 == 0) {
                break;
            }
            this.field4513[var5] = var6;
            this.field4500[var5] = arg0.method1402(-21420);
            this.field4496[var5] = arg0.method1362(124);
        }
        this.field4516 = arg0.method1362(-128);
        this.field4517 = arg0.method1362(7);
        this.field4493 = arg0.method1396(-47);
        this.field4507 = arg0.method1396(-56);
        this.field4515 = new class273();
        this.field4494 = new class165();
        this.field4515.method1949(arg0, this.field4494);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I", line = 71)
    public final int[] method2011(int arg0, int arg1) {
        class213.method1555(field4499, 0, arg0);
        if (arg1 < 10) {
            return field4499;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4509.method1138();
        this.field4501.method1138();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4503 != null) {
            this.field4503.method1138();
            this.field4512.method1138();
            var5 = (int) ((double) (this.field4503.field2673 - this.field4503.field2678) * 32.768D / var3);
            var6 = (int) ((double) this.field4503.field2678 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4510 != null) {
            this.field4510.method1138();
            this.field4511.method1138();
            var8 = (int) ((double) (this.field4510.field2673 - this.field4510.field2678) * 32.768D / var3);
            var9 = (int) ((double) this.field4510.field2678 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4513[var11] != 0) {
                field4508[var11] = 0;
                field4505[var11] = (int) ((double) this.field4496[var11] * var3);
                field4514[var11] = (this.field4513[var11] << 14) / 100;
                field4504[var11] = (int) ((double) (this.field4509.field2673 - this.field4509.field2678) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4500[var11]) / var3);
                field4502[var11] = (int) ((double) this.field4509.field2678 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4509.method1141(arg0);
            int var14 = this.field4501.method1141(arg0);
            if (this.field4503 != null) {
                int var15 = this.field4503.method1141(arg0);
                int var16 = this.field4512.method1141(arg0);
                var13 += this.method2012(var7, var16, this.field4503.field2677) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4510 != null) {
                int var17 = this.field4510.method1141(arg0);
                int var18 = this.field4511.method1141(arg0);
                var14 = var14 * ((this.method2012(var10, var18, this.field4510.field2677) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4513[var19] != 0) {
                    int var20 = field4505[var19] + var12;
                    if (var20 < arg0) {
                        field4499[var20] += this.method2012(field4508[var19], field4514[var19] * var14 >> 15, this.field4509.field2677);
                        field4508[var19] += (field4504[var19] * var13 >> 16) + field4502[var19];
                    }
                }
            }
        }
        if (this.field4506 != null) {
            this.field4506.method1138();
            this.field4498.method1138();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4506.method1141(arg0);
                int var26 = this.field4498.method1141(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4506.field2673 - this.field4506.field2678) * var25 >> 8) + this.field4506.field2678;
                } else {
                    var27 = ((this.field4506.field2673 - this.field4506.field2678) * var26 >> 8) + this.field4506.field2678;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4499[var24] = 0;
                }
            }
        }
        if (this.field4516 > 0 && this.field4517 > 0) {
            int var28 = (int) ((double) this.field4516 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4499[var29] += field4499[var29 - var28] * this.field4517 / 100;
            }
        }
        if (this.field4515.field4338[0] > 0 || this.field4515.field4338[1] > 0) {
            this.field4494.method1138();
            int var30 = this.field4494.method1141(arg0 + 1);
            int var31 = this.field4515.method1945(0, (float) var30 / 65536.0F);
            int var32 = this.field4515.method1945(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4499[var31 + var33] * (long) class273.field4339 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4499[var31 + var33 - var36 - 1] * (long) class273.field4344[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4499[var33 - var37 - 1] * (long) class273.field4344[1][var37] >> 16);
                    }
                    field4499[var33] = var35;
                    var30 = this.field4494.method1141(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4499[var31 + var33] * (long) class273.field4339 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4499[var31 + var33 - var40 - 1] * (long) class273.field4344[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4499[var33 - var41 - 1] * (long) class273.field4344[1][var41] >> 16);
                        }
                        field4499[var33] = var39;
                        var30 = this.field4494.method1141(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4499[var31 + var33 - var43 - 1] * (long) class273.field4344[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4499[var33 - var44 - 1] * (long) class273.field4344[1][var44] >> 16);
                            }
                            field4499[var33] = var42;
                            this.field4494.method1141(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4515.method1945(0, (float) var30 / 65536.0F);
                    var32 = this.field4515.method1945(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4499[var46] < -32768) {
                field4499[var46] = -32768;
            }
            if (field4499[var46] > 32767) {
                field4499[var46] = 32767;
            }
        }
        return field4499;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4495[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4497 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4497[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4499 = new int[220500];
        field4505 = new int[5];
        field4508 = new int[5];
        field4502 = new int[5];
        field4504 = new int[5];
        field4514 = new int[5];
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I", line = 395)
    private final int method2012(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4497[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4495[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 436)
    public static void method2013() {
        field4499 = null;
        field4495 = null;
        field4497 = null;
        field4508 = null;
        field4505 = null;
        field4514 = null;
        field4504 = null;
        field4502 = null;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class277 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field4556 = 500;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public int field4562 = 0;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    private int field4560 = 100;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
    private int[] field4563 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[I")
    private int[] field4568 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field4558 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    private int[] field4557 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
    private static int[] field4567 = new int[32768];

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    private static int[] field4572;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
    private static int[] field4555;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
    private static int[] field4573;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
    private static int[] field4578;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[I")
    private static int[] field4577;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    private static int[] field4575;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
    private static int[] field4574;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Lkd;")
    private class127 field4576;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lve;")
    private class231 field4559;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lve;")
    private class231 field4561;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lve;")
    private class231 field4564;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lve;")
    private class231 field4565;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lve;")
    private class231 field4566;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lve;")
    private class231 field4569;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lve;")
    private class231 field4570;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lve;")
    private class231 field4571;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Lve;")
    private class231 field4579;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 3)
    public static void method1971() {
        field4555 = null;
        field4567 = null;
        field4572 = null;
        field4573 = null;
        field4577 = null;
        field4578 = null;
        field4575 = null;
        field4574 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lfh;)V", line = 34)
    public final void method1972(class313 arg0) {
        this.field4565 = new class231();
        this.field4565.method1598(arg0);
        this.field4569 = new class231();
        this.field4569.method1598(arg0);
        int var2 = arg0.method2224(-120);
        if (var2 != 0) {
            arg0.field5137--;
            this.field4561 = new class231();
            this.field4561.method1598(arg0);
            this.field4564 = new class231();
            this.field4564.method1598(arg0);
        }
        int var3 = arg0.method2224(-119);
        if (var3 != 0) {
            arg0.field5137--;
            this.field4579 = new class231();
            this.field4579.method1598(arg0);
            this.field4570 = new class231();
            this.field4570.method1598(arg0);
        }
        int var4 = arg0.method2224(-122);
        if (var4 != 0) {
            arg0.field5137--;
            this.field4571 = new class231();
            this.field4571.method1598(arg0);
            this.field4559 = new class231();
            this.field4559.method1598(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2201(128);
            if (var6 == 0) {
                break;
            }
            this.field4568[var5] = var6;
            this.field4563[var5] = arg0.method2188(87);
            this.field4557[var5] = arg0.method2201(128);
        }
        this.field4558 = arg0.method2201(128);
        this.field4560 = arg0.method2201(128);
        this.field4556 = arg0.method2250(-1613178296);
        this.field4562 = arg0.method2250(-1613178296);
        this.field4576 = new class127();
        this.field4566 = new class231();
        this.field4576.method828(arg0, this.field4566);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 95)
    private final int method1973(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4572[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4567[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4567[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4572 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4572[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4555 = new int[220500];
        field4573 = new int[5];
        field4578 = new int[5];
        field4577 = new int[5];
        field4575 = new int[5];
        field4574 = new int[5];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I", line = 178)
    public final int[] method1974(int arg0, int arg1) {
        class298.method2101(field4555, 0, arg0);
        if (arg1 < 10) {
            return field4555;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4565.method1595();
        this.field4569.method1595();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4561 != null) {
            this.field4561.method1595();
            this.field4564.method1595();
            var5 = (int) ((double) (this.field4561.field3687 - this.field4561.field3686) * 32.768D / var3);
            var6 = (int) ((double) this.field4561.field3686 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4579 != null) {
            this.field4579.method1595();
            this.field4570.method1595();
            var8 = (int) ((double) (this.field4579.field3687 - this.field4579.field3686) * 32.768D / var3);
            var9 = (int) ((double) this.field4579.field3686 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4568[var11] != 0) {
                field4573[var11] = 0;
                field4577[var11] = (int) ((double) this.field4557[var11] * var3);
                field4578[var11] = (this.field4568[var11] << 14) / 100;
                field4575[var11] = (int) ((double) (this.field4565.field3687 - this.field4565.field3686) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4563[var11]) / var3);
                field4574[var11] = (int) ((double) this.field4565.field3686 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4565.method1597(arg0);
            int var14 = this.field4569.method1597(arg0);
            if (this.field4561 != null) {
                int var15 = this.field4561.method1597(arg0);
                int var16 = this.field4564.method1597(arg0);
                var13 += this.method1973(var7, var16, this.field4561.field3683) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4579 != null) {
                int var17 = this.field4579.method1597(arg0);
                int var18 = this.field4570.method1597(arg0);
                var14 = var14 * ((this.method1973(var10, var18, this.field4579.field3683) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4568[var19] != 0) {
                    int var20 = field4577[var19] + var12;
                    if (var20 < arg0) {
                        field4555[var20] += this.method1973(field4573[var19], field4578[var19] * var14 >> 15, this.field4565.field3683);
                        field4573[var19] += (field4575[var19] * var13 >> 16) + field4574[var19];
                    }
                }
            }
        }
        if (this.field4571 != null) {
            this.field4571.method1595();
            this.field4559.method1595();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4571.method1597(arg0);
                int var26 = this.field4559.method1597(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4571.field3687 - this.field4571.field3686) * var25 >> 8) + this.field4571.field3686;
                } else {
                    var27 = ((this.field4571.field3687 - this.field4571.field3686) * var26 >> 8) + this.field4571.field3686;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4555[var24] = 0;
                }
            }
        }
        if (this.field4558 > 0 && this.field4560 > 0) {
            int var28 = (int) ((double) this.field4558 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4555[var29] += field4555[var29 - var28] * this.field4560 / 100;
            }
        }
        if (this.field4576.field1959[0] > 0 || this.field4576.field1959[1] > 0) {
            this.field4566.method1595();
            int var30 = this.field4566.method1597(arg0 + 1);
            int var31 = this.field4576.method829(0, (float) var30 / 65536.0F);
            int var32 = this.field4576.method829(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4555[var31 + var33] * (long) class127.field1961 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4555[var31 + var33 - var36 - 1] * (long) class127.field1963[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4555[var33 - var37 - 1] * (long) class127.field1963[1][var37] >> 16);
                    }
                    field4555[var33] = var35;
                    var30 = this.field4566.method1597(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4555[var31 + var33] * (long) class127.field1961 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4555[var31 + var33 - var40 - 1] * (long) class127.field1963[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4555[var33 - var41 - 1] * (long) class127.field1963[1][var41] >> 16);
                        }
                        field4555[var33] = var39;
                        var30 = this.field4566.method1597(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4555[var31 + var33 - var43 - 1] * (long) class127.field1963[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4555[var33 - var44 - 1] * (long) class127.field1963[1][var44] >> 16);
                            }
                            field4555[var33] = var42;
                            this.field4566.method1597(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4576.method829(0, (float) var30 / 65536.0F);
                    var32 = this.field4576.method829(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4555[var46] < -32768) {
                field4555[var46] = -32768;
            }
            if (field4555[var46] > 32767) {
                field4555[var46] = 32767;
            }
        }
        return field4555;
    }
}

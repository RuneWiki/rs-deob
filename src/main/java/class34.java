import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class34 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
    private int[] field548 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    private int field551 = 100;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    private int[] field553 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field561 = 0;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
    private int[] field566 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field558 = 500;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
    private static int[] field564 = new int[32768];

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    private static int[] field552;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[I")
    private static int[] field557;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "[I")
    private static int[] field568;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "[I")
    private static int[] field567;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
    private static int[] field569;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
    private static int[] field570;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
    private static int[] field571;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lgd;")
    private class125 field549;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lgd;")
    private class125 field550;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Lgd;")
    private class125 field554;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lgd;")
    private class125 field556;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lgd;")
    private class125 field559;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Lgd;")
    private class125 field560;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lgd;")
    private class125 field562;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lgd;")
    private class125 field563;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Lgd;")
    private class125 field572;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lji;")
    private class163 field555;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 6)
    public static void method280() {
        field557 = null;
        field564 = null;
        field552 = null;
        field570 = null;
        field569 = null;
        field568 = null;
        field567 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lhb;)V", line = 25)
    public final void method281(class164 arg0) {
        this.field550 = new class125();
        this.field550.method923(arg0);
        this.field563 = new class125();
        this.field563.method923(arg0);
        int var2 = arg0.method1178(8);
        if (var2 != 0) {
            arg0.field2670--;
            this.field549 = new class125();
            this.field549.method923(arg0);
            this.field572 = new class125();
            this.field572.method923(arg0);
        }
        int var3 = arg0.method1178(8);
        if (var3 != 0) {
            arg0.field2670--;
            this.field556 = new class125();
            this.field556.method923(arg0);
            this.field562 = new class125();
            this.field562.method923(arg0);
        }
        int var4 = arg0.method1178(8);
        if (var4 != 0) {
            arg0.field2670--;
            this.field560 = new class125();
            this.field560.method923(arg0);
            this.field554 = new class125();
            this.field554.method923(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1209(-128);
            if (var6 == 0) {
                break;
            }
            this.field566[var5] = var6;
            this.field548[var5] = arg0.method1167(123);
            this.field553[var5] = arg0.method1209(-128);
        }
        this.field565 = arg0.method1209(-128);
        this.field551 = arg0.method1209(-128);
        this.field558 = arg0.method1161(true);
        this.field561 = arg0.method1161(true);
        this.field555 = new class163();
        this.field559 = new class125();
        this.field555.method1147(arg0, this.field559);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I", line = 85)
    private final int method282(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field552[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field564[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I", line = 111)
    public final int[] method283(int arg0, int arg1) {
        class42.method314(field557, 0, arg0);
        if (arg1 < 10) {
            return field557;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field550.method921();
        this.field563.method921();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field549 != null) {
            this.field549.method921();
            this.field572.method921();
            var5 = (int) ((double) (this.field549.field2089 - this.field549.field2088) * 32.768D / var3);
            var6 = (int) ((double) this.field549.field2088 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field556 != null) {
            this.field556.method921();
            this.field562.method921();
            var8 = (int) ((double) (this.field556.field2089 - this.field556.field2088) * 32.768D / var3);
            var9 = (int) ((double) this.field556.field2088 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field566[var11] != 0) {
                field570[var11] = 0;
                field569[var11] = (int) ((double) this.field553[var11] * var3);
                field568[var11] = (this.field566[var11] << 14) / 100;
                field567[var11] = (int) ((double) (this.field550.field2089 - this.field550.field2088) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field548[var11]) / var3);
                field571[var11] = (int) ((double) this.field550.field2088 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field550.method922(arg0);
            int var14 = this.field563.method922(arg0);
            if (this.field549 != null) {
                int var15 = this.field549.method922(arg0);
                int var16 = this.field572.method922(arg0);
                var13 += this.method282(var7, var16, this.field549.field2091) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field556 != null) {
                int var17 = this.field556.method922(arg0);
                int var18 = this.field562.method922(arg0);
                var14 = var14 * ((this.method282(var10, var18, this.field556.field2091) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field566[var19] != 0) {
                    int var20 = field569[var19] + var12;
                    if (var20 < arg0) {
                        field557[var20] += this.method282(field570[var19], field568[var19] * var14 >> 15, this.field550.field2091);
                        field570[var19] += (field567[var19] * var13 >> 16) + field571[var19];
                    }
                }
            }
        }
        if (this.field560 != null) {
            this.field560.method921();
            this.field554.method921();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field560.method922(arg0);
                int var26 = this.field554.method922(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field560.field2089 - this.field560.field2088) * var25 >> 8) + this.field560.field2088;
                } else {
                    var27 = ((this.field560.field2089 - this.field560.field2088) * var26 >> 8) + this.field560.field2088;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field557[var24] = 0;
                }
            }
        }
        if (this.field565 > 0 && this.field551 > 0) {
            int var28 = (int) ((double) this.field565 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field557[var29] += field557[var29 - var28] * this.field551 / 100;
            }
        }
        if (this.field555.field2621[0] > 0 || this.field555.field2621[1] > 0) {
            this.field559.method921();
            int var30 = this.field559.method922(arg0 + 1);
            int var31 = this.field555.method1151(0, (float) var30 / 65536.0F);
            int var32 = this.field555.method1151(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field557[var31 + var33] * (long) class163.field2625 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field557[var31 + var33 - var36 - 1] * (long) class163.field2626[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field557[var33 - var37 - 1] * (long) class163.field2626[1][var37] >> 16);
                    }
                    field557[var33] = var35;
                    var30 = this.field559.method922(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field557[var31 + var33] * (long) class163.field2625 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field557[var31 + var33 - var40 - 1] * (long) class163.field2626[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field557[var33 - var41 - 1] * (long) class163.field2626[1][var41] >> 16);
                        }
                        field557[var33] = var39;
                        var30 = this.field559.method922(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field557[var31 + var33 - var43 - 1] * (long) class163.field2626[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field557[var33 - var44 - 1] * (long) class163.field2626[1][var44] >> 16);
                            }
                            field557[var33] = var42;
                            this.field559.method922(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field555.method1151(0, (float) var30 / 65536.0F);
                    var32 = this.field555.method1151(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field557[var46] < -32768) {
                field557[var46] = -32768;
            }
            if (field557[var46] > 32767) {
                field557[var46] = 32767;
            }
        }
        return field557;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field564[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field552 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field552[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field557 = new int[220500];
        field568 = new int[5];
        field567 = new int[5];
        field569 = new int[5];
        field570 = new int[5];
        field571 = new int[5];
    }
}

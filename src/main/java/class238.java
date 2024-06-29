import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class238 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field3987 = 0;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private int field3989 = 100;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[I")
    private int[] field3996 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    private int[] field3990 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
    private int[] field3997 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public int field3994 = 500;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    private int field3998 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[I")
    private static int[] field3991 = new int[32768];

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[I")
    private static int[] field4003;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[I")
    private static int[] field3999;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "[I")
    private static int[] field4005;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "[I")
    private static int[] field4006;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[I")
    private static int[] field4008;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "[I")
    private static int[] field4007;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
    private static int[] field4009;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lci;")
    private class188 field3985;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lci;")
    private class188 field3986;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lci;")
    private class188 field3988;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lci;")
    private class188 field3993;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lci;")
    private class188 field3995;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lci;")
    private class188 field4000;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Lci;")
    private class188 field4001;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Lci;")
    private class188 field4002;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Lci;")
    private class188 field4004;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lkm;")
    private class308 field3992;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 9)
    public static void method1586() {
        field3999 = null;
        field3991 = null;
        field4003 = null;
        field4007 = null;
        field4008 = null;
        field4005 = null;
        field4006 = null;
        field4009 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lfe;)V", line = 21)
    public final void method1587(class229 arg0) {
        this.field4002 = new class188();
        this.field4002.method1228(arg0);
        this.field4001 = new class188();
        this.field4001.method1228(arg0);
        int var2 = arg0.method1535((byte) 104);
        if (var2 != 0) {
            arg0.field3905--;
            this.field4000 = new class188();
            this.field4000.method1228(arg0);
            this.field4004 = new class188();
            this.field4004.method1228(arg0);
        }
        int var3 = arg0.method1535((byte) 125);
        if (var3 != 0) {
            arg0.field3905--;
            this.field3988 = new class188();
            this.field3988.method1228(arg0);
            this.field3986 = new class188();
            this.field3986.method1228(arg0);
        }
        int var4 = arg0.method1535((byte) 82);
        if (var4 != 0) {
            arg0.field3905--;
            this.field3985 = new class188();
            this.field3985.method1228(arg0);
            this.field3993 = new class188();
            this.field3993.method1228(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1557(255);
            if (var6 == 0) {
                break;
            }
            this.field3990[var5] = var6;
            this.field3997[var5] = arg0.method1558((byte) 124);
            this.field3996[var5] = arg0.method1557(255);
        }
        this.field3998 = arg0.method1557(255);
        this.field3989 = arg0.method1557(255);
        this.field3994 = arg0.method1496(true);
        this.field3987 = arg0.method1496(true);
        this.field3992 = new class308();
        this.field3995 = new class188();
        this.field3992.method2095(arg0, this.field3995);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I", line = 82)
    private final int method1588(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4003[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3991[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 115)
    public final int[] method1589(int arg0, int arg1) {
        class136.method846(field3999, 0, arg0);
        if (arg1 < 10) {
            return field3999;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4002.method1230();
        this.field4001.method1230();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4000 != null) {
            this.field4000.method1230();
            this.field4004.method1230();
            var5 = (int) ((double) (this.field4000.field3218 - this.field4000.field3217) * 32.768D / var3);
            var6 = (int) ((double) this.field4000.field3217 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3988 != null) {
            this.field3988.method1230();
            this.field3986.method1230();
            var8 = (int) ((double) (this.field3988.field3218 - this.field3988.field3217) * 32.768D / var3);
            var9 = (int) ((double) this.field3988.field3217 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3990[var11] != 0) {
                field4007[var11] = 0;
                field4008[var11] = (int) ((double) this.field3996[var11] * var3);
                field4005[var11] = (this.field3990[var11] << 14) / 100;
                field4006[var11] = (int) ((double) (this.field4002.field3218 - this.field4002.field3217) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3997[var11]) / var3);
                field4009[var11] = (int) ((double) this.field4002.field3217 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4002.method1229(arg0);
            int var14 = this.field4001.method1229(arg0);
            if (this.field4000 != null) {
                int var15 = this.field4000.method1229(arg0);
                int var16 = this.field4004.method1229(arg0);
                var13 += this.method1588(var7, var16, this.field4000.field3216) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field3988 != null) {
                int var17 = this.field3988.method1229(arg0);
                int var18 = this.field3986.method1229(arg0);
                var14 = var14 * ((this.method1588(var10, var18, this.field3988.field3216) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field3990[var19] != 0) {
                    int var20 = field4008[var19] + var12;
                    if (var20 < arg0) {
                        field3999[var20] += this.method1588(field4007[var19], field4005[var19] * var14 >> 15, this.field4002.field3216);
                        field4007[var19] += (field4006[var19] * var13 >> 16) + field4009[var19];
                    }
                }
            }
        }
        if (this.field3985 != null) {
            this.field3985.method1230();
            this.field3993.method1230();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field3985.method1229(arg0);
                int var26 = this.field3993.method1229(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field3985.field3218 - this.field3985.field3217) * var25 >> 8) + this.field3985.field3217;
                } else {
                    var27 = ((this.field3985.field3218 - this.field3985.field3217) * var26 >> 8) + this.field3985.field3217;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field3999[var24] = 0;
                }
            }
        }
        if (this.field3998 > 0 && this.field3989 > 0) {
            int var28 = (int) ((double) this.field3998 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field3999[var29] += field3999[var29 - var28] * this.field3989 / 100;
            }
        }
        if (this.field3992.field5275[0] > 0 || this.field3992.field5275[1] > 0) {
            this.field3995.method1230();
            int var30 = this.field3995.method1229(arg0 + 1);
            int var31 = this.field3992.method2098(0, (float) var30 / 65536.0F);
            int var32 = this.field3992.method2098(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field3999[var31 + var33] * (long) class308.field5276 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field3999[var31 + var33 - var36 - 1] * (long) class308.field5278[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field3999[var33 - var37 - 1] * (long) class308.field5278[1][var37] >> 16);
                    }
                    field3999[var33] = var35;
                    var30 = this.field3995.method1229(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field3999[var31 + var33] * (long) class308.field5276 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field3999[var31 + var33 - var40 - 1] * (long) class308.field5278[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field3999[var33 - var41 - 1] * (long) class308.field5278[1][var41] >> 16);
                        }
                        field3999[var33] = var39;
                        var30 = this.field3995.method1229(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field3999[var31 + var33 - var43 - 1] * (long) class308.field5278[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field3999[var33 - var44 - 1] * (long) class308.field5278[1][var44] >> 16);
                            }
                            field3999[var33] = var42;
                            this.field3995.method1229(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field3992.method2098(0, (float) var30 / 65536.0F);
                    var32 = this.field3992.method2098(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field3999[var46] < -32768) {
                field3999[var46] = -32768;
            }
            if (field3999[var46] > 32767) {
                field3999[var46] = 32767;
            }
        }
        return field3999;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3991[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4003 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4003[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3999 = new int[220500];
        field4005 = new int[5];
        field4006 = new int[5];
        field4008 = new int[5];
        field4007 = new int[5];
        field4009 = new int[5];
    }
}

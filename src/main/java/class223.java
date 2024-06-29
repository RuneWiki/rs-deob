import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class223 {

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    private int[] field3997 = new int[5];

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field4000 = 0;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field3996 = 0;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    private int[] field4009 = new int[5];

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field4005 = 100;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public int field4006 = 500;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
    private int[] field4012 = new int[5];

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    private static int[] field4010 = new int[32768];

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[I")
    private static int[] field4001;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
    private static int[] field4002;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
    private static int[] field4013;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[I")
    private static int[] field4011;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[I")
    private static int[] field4014;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "[I")
    private static int[] field4016;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[I")
    private static int[] field4015;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Lra;")
    private class222 field3999;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lcb;")
    private class231 field3992;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lcb;")
    private class231 field3993;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lcb;")
    private class231 field3994;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lcb;")
    private class231 field3995;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lcb;")
    private class231 field3998;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lcb;")
    private class231 field4003;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lcb;")
    private class231 field4004;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lcb;")
    private class231 field4007;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lcb;")
    private class231 field4008;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lqk;)V")
    public final void method1564(class200 arg0) {
        this.field4008 = new class231();
        this.field4008.method1606(arg0);
        this.field4007 = new class231();
        this.field4007.method1606(arg0);
        int var2 = arg0.method1408((byte) -104);
        if (var2 != 0) {
            arg0.field3565--;
            this.field4003 = new class231();
            this.field4003.method1606(arg0);
            this.field3995 = new class231();
            this.field3995.method1606(arg0);
        }
        int var3 = arg0.method1408((byte) -60);
        if (var3 != 0) {
            arg0.field3565--;
            this.field3992 = new class231();
            this.field3992.method1606(arg0);
            this.field4004 = new class231();
            this.field4004.method1606(arg0);
        }
        int var4 = arg0.method1408((byte) -37);
        if (var4 != 0) {
            arg0.field3565--;
            this.field3994 = new class231();
            this.field3994.method1606(arg0);
            this.field3993 = new class231();
            this.field3993.method1606(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1402(20740);
            if (var6 == 0) {
                break;
            }
            this.field3997[var5] = var6;
            this.field4009[var5] = arg0.method1404(0);
            this.field4012[var5] = arg0.method1402(20740);
        }
        this.field4000 = arg0.method1402(20740);
        this.field4005 = arg0.method1402(20740);
        this.field4006 = arg0.method1410(-72);
        this.field3996 = arg0.method1410(-105);
        this.field3999 = new class222();
        this.field3998 = new class231();
        this.field3999.method1563(arg0, this.field3998);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)I")
    private final int method1565(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4001[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4010[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
    public static void method1566() {
        field4002 = null;
        field4010 = null;
        field4001 = null;
        field4013 = null;
        field4011 = null;
        field4016 = null;
        field4015 = null;
        field4014 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
    public final int[] method1567(int arg0, int arg1) {
        class250.method1691(field4002, 0, arg0);
        if (arg1 < 10) {
            return field4002;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4008.method1607();
        this.field4007.method1607();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4003 != null) {
            this.field4003.method1607();
            this.field3995.method1607();
            var5 = (int) ((double) (this.field4003.field4186 - this.field4003.field4189) * 32.768D / var3);
            var6 = (int) ((double) this.field4003.field4189 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3992 != null) {
            this.field3992.method1607();
            this.field4004.method1607();
            var8 = (int) ((double) (this.field3992.field4186 - this.field3992.field4189) * 32.768D / var3);
            var9 = (int) ((double) this.field3992.field4189 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3997[var11] != 0) {
                field4013[var11] = 0;
                field4011[var11] = (int) ((double) this.field4012[var11] * var3);
                field4016[var11] = (this.field3997[var11] << 14) / 100;
                field4015[var11] = (int) ((double) (this.field4008.field4186 - this.field4008.field4189) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4009[var11]) / var3);
                field4014[var11] = (int) ((double) this.field4008.field4189 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4008.method1605(arg0);
            int var40 = this.field4007.method1605(arg0);
            if (this.field4003 != null) {
                int var41 = this.field4003.method1605(arg0);
                int var42 = this.field3995.method1605(arg0);
                var39 += this.method1565(var7, var42, this.field4003.field4187) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3992 != null) {
                int var43 = this.field3992.method1605(arg0);
                int var44 = this.field4004.method1605(arg0);
                var40 = var40 * ((this.method1565(var10, var44, this.field3992.field4187) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3997[var45] != 0) {
                    int var46 = field4011[var45] + var12;
                    if (var46 < arg0) {
                        field4002[var46] += this.method1565(field4013[var45], field4016[var45] * var40 >> 15, this.field4008.field4187);
                        field4013[var45] += (field4015[var45] * var39 >> 16) + field4014[var45];
                    }
                }
            }
        }
        if (this.field3994 != null) {
            this.field3994.method1607();
            this.field3993.method1607();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3994.method1605(arg0);
                int var18 = this.field3993.method1605(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3994.field4186 - this.field3994.field4189) * var17 >> 8) + this.field3994.field4189;
                } else {
                    var19 = ((this.field3994.field4186 - this.field3994.field4189) * var18 >> 8) + this.field3994.field4189;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4002[var16] = 0;
                }
            }
        }
        if (this.field4000 > 0 && this.field4005 > 0) {
            int var20 = (int) ((double) this.field4000 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4002[var21] += field4002[var21 - var20] * this.field4005 / 100;
            }
        }
        if (this.field3999.field3984[0] > 0 || this.field3999.field3984[1] > 0) {
            this.field3998.method1607();
            int var22 = this.field3998.method1605(arg0 + 1);
            int var23 = this.field3999.method1560(0, (float) var22 / 65536.0F);
            int var24 = this.field3999.method1560(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4002[var23 + var25] * (long) class222.field3991 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4002[var23 + var25 - var36 - 1] * (long) class222.field3989[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4002[var25 - var37 - 1] * (long) class222.field3989[1][var37] >> 16);
                    }
                    field4002[var25] = var35;
                    var22 = this.field3998.method1605(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4002[var23 + var25] * (long) class222.field3991 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4002[var23 + var25 - var33 - 1] * (long) class222.field3989[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4002[var25 - var34 - 1] * (long) class222.field3989[1][var34] >> 16);
                        }
                        field4002[var25] = var32;
                        var22 = this.field3998.method1605(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4002[var23 + var25 - var29 - 1] * (long) class222.field3989[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4002[var25 - var30 - 1] * (long) class222.field3989[1][var30] >> 16);
                            }
                            field4002[var25] = var28;
                            this.field3998.method1605(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3999.method1560(0, (float) var22 / 65536.0F);
                    var24 = this.field3999.method1560(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4002[var38] < -32768) {
                field4002[var38] = -32768;
            }
            if (field4002[var38] > 32767) {
                field4002[var38] = 32767;
            }
        }
        return field4002;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4010[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4001 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4001[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4002 = new int[220500];
        field4013 = new int[5];
        field4011 = new int[5];
        field4014 = new int[5];
        field4016 = new int[5];
        field4015 = new int[5];
    }
}

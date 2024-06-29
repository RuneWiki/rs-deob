import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 {

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field3005 = new int[5];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    private int field3008 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    private int[] field3003 = new int[5];

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field3012 = 500;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field3004 = 0;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field3016 = 100;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    private int[] field3015 = new int[5];

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    private static int[] field3017 = new int[32768];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    private static int[] field3009;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    private static int[] field3002;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    private static int[] field3019;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "[I")
    private static int[] field3022;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[I")
    private static int[] field3023;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[I")
    private static int[] field3020;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[I")
    private static int[] field3021;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lt;")
    private class131 field3007;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Laa;")
    private class2 field2999;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Laa;")
    private class2 field3000;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Laa;")
    private class2 field3001;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Laa;")
    private class2 field3006;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Laa;")
    private class2 field3010;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Laa;")
    private class2 field3011;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Laa;")
    private class2 field3013;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Laa;")
    private class2 field3014;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Laa;")
    private class2 field3018;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
    private final int method996(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3009[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3017[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
    public final int[] method997(int arg0, int arg1) {
        class109.method823(field3002, 0, arg0);
        if (arg1 < 10) {
            return field3002;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3010.method4();
        this.field3013.method4();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3006 != null) {
            this.field3006.method4();
            this.field3011.method4();
            var5 = (int) ((double) (this.field3006.field28 - this.field3006.field23) * 32.768D / var3);
            var6 = (int) ((double) this.field3006.field23 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3001 != null) {
            this.field3001.method4();
            this.field3000.method4();
            var8 = (int) ((double) (this.field3001.field28 - this.field3001.field23) * 32.768D / var3);
            var9 = (int) ((double) this.field3001.field23 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3003[var11] != 0) {
                field3023[var11] = 0;
                field3021[var11] = (int) ((double) this.field3005[var11] * var3);
                field3019[var11] = (this.field3003[var11] << 14) / 100;
                field3022[var11] = (int) ((double) (this.field3010.field28 - this.field3010.field23) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3015[var11]) / var3);
                field3020[var11] = (int) ((double) this.field3010.field23 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3010.method2(arg0);
            int var40 = this.field3013.method2(arg0);
            if (this.field3006 != null) {
                int var41 = this.field3006.method2(arg0);
                int var42 = this.field3011.method2(arg0);
                var39 += this.method996(var7, var42, this.field3006.field26) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3001 != null) {
                int var43 = this.field3001.method2(arg0);
                int var44 = this.field3000.method2(arg0);
                var40 = var40 * ((this.method996(var10, var44, this.field3001.field26) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3003[var45] != 0) {
                    int var46 = field3021[var45] + var12;
                    if (var46 < arg0) {
                        field3002[var46] += this.method996(field3023[var45], field3019[var45] * var40 >> 15, this.field3010.field26);
                        field3023[var45] += (field3022[var45] * var39 >> 16) + field3020[var45];
                    }
                }
            }
        }
        if (this.field3018 != null) {
            this.field3018.method4();
            this.field3014.method4();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3018.method2(arg0);
                int var18 = this.field3014.method2(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3018.field28 - this.field3018.field23) * var17 >> 8) + this.field3018.field23;
                } else {
                    var19 = ((this.field3018.field28 - this.field3018.field23) * var18 >> 8) + this.field3018.field23;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3002[var16] = 0;
                }
            }
        }
        if (this.field3008 > 0 && this.field3016 > 0) {
            int var20 = (int) ((double) this.field3008 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3002[var21] += field3002[var21 - var20] * this.field3016 / 100;
            }
        }
        if (this.field3007.field3111[0] > 0 || this.field3007.field3111[1] > 0) {
            this.field2999.method4();
            int var22 = this.field2999.method2(arg0 + 1);
            int var23 = this.field3007.method1018(0, (float) var22 / 65536.0F);
            int var24 = this.field3007.method1018(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3002[var23 + var25] * (long) class131.field3110 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3002[var23 + var25 - var36 - 1] * (long) class131.field3112[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3002[var25 - var37 - 1] * (long) class131.field3112[1][var37] >> 16);
                    }
                    field3002[var25] = var35;
                    var22 = this.field2999.method2(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3002[var23 + var25] * (long) class131.field3110 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3002[var23 + var25 - var33 - 1] * (long) class131.field3112[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3002[var25 - var34 - 1] * (long) class131.field3112[1][var34] >> 16);
                        }
                        field3002[var25] = var32;
                        var22 = this.field2999.method2(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3002[var23 + var25 - var29 - 1] * (long) class131.field3112[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3002[var25 - var30 - 1] * (long) class131.field3112[1][var30] >> 16);
                            }
                            field3002[var25] = var28;
                            this.field2999.method2(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3007.method1018(0, (float) var22 / 65536.0F);
                    var24 = this.field3007.method1018(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3002[var38] < -32768) {
                field3002[var38] = -32768;
            }
            if (field3002[var38] > 32767) {
                field3002[var38] = 32767;
            }
        }
        return field3002;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lla;)V")
    public final void method998(class77 arg0) {
        this.field3010 = new class2();
        this.field3010.method3(arg0);
        this.field3013 = new class2();
        this.field3013.method3(arg0);
        int var2 = arg0.method570((byte) 123);
        if (var2 != 0) {
            arg0.field1691--;
            this.field3006 = new class2();
            this.field3006.method3(arg0);
            this.field3011 = new class2();
            this.field3011.method3(arg0);
        }
        int var3 = arg0.method570((byte) 123);
        if (var3 != 0) {
            arg0.field1691--;
            this.field3001 = new class2();
            this.field3001.method3(arg0);
            this.field3000 = new class2();
            this.field3000.method3(arg0);
        }
        int var4 = arg0.method570((byte) 123);
        if (var4 != 0) {
            arg0.field1691--;
            this.field3018 = new class2();
            this.field3018.method3(arg0);
            this.field3014 = new class2();
            this.field3014.method3(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method582(-7);
            if (var6 == 0) {
                break;
            }
            this.field3003[var5] = var6;
            this.field3015[var5] = arg0.method578(95);
            this.field3005[var5] = arg0.method582(-100);
        }
        this.field3008 = arg0.method582(-77);
        this.field3016 = arg0.method582(-4);
        this.field3012 = arg0.method597(61);
        this.field3004 = arg0.method597(41);
        this.field3007 = new class131();
        this.field2999 = new class2();
        this.field3007.method1017(arg0, this.field2999);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static void method999() {
        field3002 = null;
        field3017 = null;
        field3009 = null;
        field3023 = null;
        field3021 = null;
        field3019 = null;
        field3022 = null;
        field3020 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3017[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3009 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3009[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3002 = new int[220500];
        field3019 = new int[5];
        field3022 = new int[5];
        field3023 = new int[5];
        field3020 = new int[5];
        field3021 = new int[5];
    }
}

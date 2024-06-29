import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class68 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[I")
    private int[] field999 = new int[5];

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[I")
    private int[] field1003 = new int[5];

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    private int field1005 = 100;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field1007 = 0;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    private int field1004 = 0;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "[I")
    private int[] field1016 = new int[5];

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field1013 = 500;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
    private static int[] field1002 = new int[32768];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
    private static int[] field997;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[I")
    private static int[] field1014;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
    private static int[] field1018;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "[I")
    private static int[] field1015;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "[I")
    private static int[] field1021;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[I")
    private static int[] field1019;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
    private static int[] field1017;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lfk;")
    private class14 field1000;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lfk;")
    private class14 field1001;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lfk;")
    private class14 field1006;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lfk;")
    private class14 field1008;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lfk;")
    private class14 field1009;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lfk;")
    private class14 field1010;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lfk;")
    private class14 field1011;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lfk;")
    private class14 field1012;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Lfk;")
    private class14 field1020;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lge;")
    private class72 field998;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
    private final int method484(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field997[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1002[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V")
    public static void method485() {
        field1014 = null;
        field1002 = null;
        field997 = null;
        field1021 = null;
        field1019 = null;
        field1018 = null;
        field1015 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
    public final int[] method486(int arg0, int arg1) {
        class158.method1179(field1014, 0, arg0);
        if (arg1 < 10) {
            return field1014;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1008.method105();
        this.field1011.method105();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1010 != null) {
            this.field1010.method105();
            this.field1006.method105();
            var5 = (int) ((double) (this.field1010.field158 - this.field1010.field160) * 32.768D / var3);
            var6 = (int) ((double) this.field1010.field160 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1012 != null) {
            this.field1012.method105();
            this.field1001.method105();
            var8 = (int) ((double) (this.field1012.field158 - this.field1012.field160) * 32.768D / var3);
            var9 = (int) ((double) this.field1012.field160 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1003[var11] != 0) {
                field1021[var11] = 0;
                field1019[var11] = (int) ((double) this.field999[var11] * var3);
                field1018[var11] = (this.field1003[var11] << 14) / 100;
                field1015[var11] = (int) ((double) (this.field1008.field158 - this.field1008.field160) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1016[var11]) / var3);
                field1017[var11] = (int) ((double) this.field1008.field160 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1008.method106(arg0);
            int var40 = this.field1011.method106(arg0);
            if (this.field1010 != null) {
                int var41 = this.field1010.method106(arg0);
                int var42 = this.field1006.method106(arg0);
                var39 += this.method484(var7, var42, this.field1010.field163) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1012 != null) {
                int var43 = this.field1012.method106(arg0);
                int var44 = this.field1001.method106(arg0);
                var40 = var40 * ((this.method484(var10, var44, this.field1012.field163) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1003[var45] != 0) {
                    int var46 = field1019[var45] + var12;
                    if (var46 < arg0) {
                        field1014[var46] += this.method484(field1021[var45], field1018[var45] * var40 >> 15, this.field1008.field163);
                        field1021[var45] += (field1015[var45] * var39 >> 16) + field1017[var45];
                    }
                }
            }
        }
        if (this.field1000 != null) {
            this.field1000.method105();
            this.field1009.method105();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1000.method106(arg0);
                int var18 = this.field1009.method106(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1000.field158 - this.field1000.field160) * var17 >> 8) + this.field1000.field160;
                } else {
                    var19 = ((this.field1000.field158 - this.field1000.field160) * var18 >> 8) + this.field1000.field160;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1014[var16] = 0;
                }
            }
        }
        if (this.field1004 > 0 && this.field1005 > 0) {
            int var20 = (int) ((double) this.field1004 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1014[var21] += field1014[var21 - var20] * this.field1005 / 100;
            }
        }
        if (this.field998.field1050[0] > 0 || this.field998.field1050[1] > 0) {
            this.field1020.method105();
            int var22 = this.field1020.method106(arg0 + 1);
            int var23 = this.field998.method523(0, (float) var22 / 65536.0F);
            int var24 = this.field998.method523(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1014[var23 + var25] * (long) class72.field1049 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1014[var23 + var25 - var36 - 1] * (long) class72.field1044[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1014[var25 - var37 - 1] * (long) class72.field1044[1][var37] >> 16);
                    }
                    field1014[var25] = var35;
                    var22 = this.field1020.method106(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1014[var23 + var25] * (long) class72.field1049 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1014[var23 + var25 - var33 - 1] * (long) class72.field1044[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1014[var25 - var34 - 1] * (long) class72.field1044[1][var34] >> 16);
                        }
                        field1014[var25] = var32;
                        var22 = this.field1020.method106(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1014[var23 + var25 - var29 - 1] * (long) class72.field1044[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1014[var25 - var30 - 1] * (long) class72.field1044[1][var30] >> 16);
                            }
                            field1014[var25] = var28;
                            this.field1020.method106(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field998.method523(0, (float) var22 / 65536.0F);
                    var24 = this.field998.method523(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1014[var38] < -32768) {
                field1014[var38] = -32768;
            }
            if (field1014[var38] > 32767) {
                field1014[var38] = 32767;
            }
        }
        return field1014;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lv;)V")
    public final void method487(class152 arg0) {
        this.field1008 = new class14();
        this.field1008.method107(arg0);
        this.field1011 = new class14();
        this.field1011.method107(arg0);
        int var2 = arg0.method1111(255);
        if (var2 != 0) {
            arg0.field2511--;
            this.field1010 = new class14();
            this.field1010.method107(arg0);
            this.field1006 = new class14();
            this.field1006.method107(arg0);
        }
        int var3 = arg0.method1111(255);
        if (var3 != 0) {
            arg0.field2511--;
            this.field1012 = new class14();
            this.field1012.method107(arg0);
            this.field1001 = new class14();
            this.field1001.method107(arg0);
        }
        int var4 = arg0.method1111(255);
        if (var4 != 0) {
            arg0.field2511--;
            this.field1000 = new class14();
            this.field1000.method107(arg0);
            this.field1009 = new class14();
            this.field1009.method107(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1103(3);
            if (var6 == 0) {
                break;
            }
            this.field1003[var5] = var6;
            this.field1016[var5] = arg0.method1083(-64);
            this.field999[var5] = arg0.method1103(3);
        }
        this.field1004 = arg0.method1103(3);
        this.field1005 = arg0.method1103(3);
        this.field1013 = arg0.method1126(false);
        this.field1007 = arg0.method1126(false);
        this.field998 = new class72();
        this.field1020 = new class14();
        this.field998.method521(arg0, this.field1020);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1002[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field997 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field997[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1014 = new int[220500];
        field1018 = new int[5];
        field1015 = new int[5];
        field1021 = new int[5];
        field1019 = new int[5];
        field1017 = new int[5];
    }
}

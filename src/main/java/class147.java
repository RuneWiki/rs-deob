import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class147 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    private int[] field2102 = new int[5];

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field2109 = 0;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field2114 = 500;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    private int field2113 = 100;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    private int field2112 = 0;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
    private int[] field2116 = new int[5];

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    private int[] field2124 = new int[5];

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
    private static int[] field2107 = new int[32768];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
    private static int[] field2115;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
    private static int[] field2100;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
    private static int[] field2121;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[I")
    private static int[] field2120;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
    private static int[] field2118;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[I")
    private static int[] field2119;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
    private static int[] field2122;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lov;")
    private class22 field2101;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lov;")
    private class22 field2103;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lov;")
    private class22 field2104;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lov;")
    private class22 field2105;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lov;")
    private class22 field2106;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lov;")
    private class22 field2108;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lov;")
    private class22 field2111;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lov;")
    private class22 field2117;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lov;")
    private class22 field2123;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lqp;")
    private class330 field2110;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2107[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2115 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2115[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2100 = new int[220500];
        field2121 = new int[5];
        field2120 = new int[5];
        field2118 = new int[5];
        field2119 = new int[5];
        field2122 = new int[5];
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 7)
    public static void method973() {
        field2100 = null;
        field2107 = null;
        field2115 = null;
        field2120 = null;
        field2121 = null;
        field2122 = null;
        field2119 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method974(int arg0, int arg1) {
        class361.method2279(field2100, 0, arg0);
        if (arg1 < 10) {
            return field2100;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2101.method171();
        this.field2104.method171();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2123 != null) {
            this.field2123.method171();
            this.field2117.method171();
            var5 = (int) ((double) (this.field2123.field340 - this.field2123.field339) * 32.768D / var3);
            var6 = (int) ((double) this.field2123.field339 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2108 != null) {
            this.field2108.method171();
            this.field2106.method171();
            var8 = (int) ((double) (this.field2108.field340 - this.field2108.field339) * 32.768D / var3);
            var9 = (int) ((double) this.field2108.field339 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2124[var11] != 0) {
                field2120[var11] = 0;
                field2121[var11] = (int) ((double) this.field2102[var11] * var3);
                field2122[var11] = (this.field2124[var11] << 14) / 100;
                field2119[var11] = (int) ((double) (this.field2101.field340 - this.field2101.field339) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2116[var11]) / var3);
                field2118[var11] = (int) ((double) this.field2101.field339 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2101.method172(arg0);
            int var40 = this.field2104.method172(arg0);
            if (this.field2123 != null) {
                int var41 = this.field2123.method172(arg0);
                int var42 = this.field2117.method172(arg0);
                var39 += this.method976(var7, var42, this.field2123.field337) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2108 != null) {
                int var43 = this.field2108.method172(arg0);
                int var44 = this.field2106.method172(arg0);
                var40 = var40 * ((this.method976(var10, var44, this.field2108.field337) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2124[var45] != 0) {
                    int var46 = field2121[var45] + var12;
                    if (var46 < arg0) {
                        field2100[var46] += this.method976(field2120[var45], field2122[var45] * var40 >> 15, this.field2101.field337);
                        field2120[var45] += (field2119[var45] * var39 >> 16) + field2118[var45];
                    }
                }
            }
        }
        if (this.field2105 != null) {
            this.field2105.method171();
            this.field2103.method171();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2105.method172(arg0);
                int var18 = this.field2103.method172(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2105.field340 - this.field2105.field339) * var17 >> 8) + this.field2105.field339;
                } else {
                    var19 = ((this.field2105.field340 - this.field2105.field339) * var18 >> 8) + this.field2105.field339;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2100[var16] = 0;
                }
            }
        }
        if (this.field2112 > 0 && this.field2113 > 0) {
            int var20 = (int) ((double) this.field2112 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2100[var21] += field2100[var21 - var20] * this.field2113 / 100;
            }
        }
        if (this.field2110.field5111[0] > 0 || this.field2110.field5111[1] > 0) {
            this.field2111.method171();
            int var22 = this.field2111.method172(arg0 + 1);
            int var23 = this.field2110.method2131(0, (float) var22 / 65536.0F);
            int var24 = this.field2110.method2131(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2100[var23 + var25] * (long) class330.field5114 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2100[var23 + var25 - var36 - 1] * (long) class330.field5116[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2100[var25 - var37 - 1] * (long) class330.field5116[1][var37] >> 16);
                    }
                    field2100[var25] = var35;
                    var22 = this.field2111.method172(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2100[var23 + var25] * (long) class330.field5114 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2100[var23 + var25 - var33 - 1] * (long) class330.field5116[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2100[var25 - var34 - 1] * (long) class330.field5116[1][var34] >> 16);
                        }
                        field2100[var25] = var32;
                        var22 = this.field2111.method172(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2100[var23 + var25 - var29 - 1] * (long) class330.field5116[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2100[var25 - var30 - 1] * (long) class330.field5116[1][var30] >> 16);
                            }
                            field2100[var25] = var28;
                            this.field2111.method172(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2110.method2131(0, (float) var22 / 65536.0F);
                    var24 = this.field2110.method2131(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2100[var38] < -32768) {
                field2100[var38] = -32768;
            }
            if (field2100[var38] > 32767) {
                field2100[var38] = 32767;
            }
        }
        return field2100;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltl;)V", line = 309)
    public final void method975(class91 arg0) {
        this.field2101 = new class22();
        this.field2101.method169(arg0);
        this.field2104 = new class22();
        this.field2104.method169(arg0);
        int var2 = arg0.method618((byte) 100);
        if (var2 != 0) {
            arg0.field1292--;
            this.field2123 = new class22();
            this.field2123.method169(arg0);
            this.field2117 = new class22();
            this.field2117.method169(arg0);
        }
        int var3 = arg0.method618((byte) 100);
        if (var3 != 0) {
            arg0.field1292--;
            this.field2108 = new class22();
            this.field2108.method169(arg0);
            this.field2106 = new class22();
            this.field2106.method169(arg0);
        }
        int var4 = arg0.method618((byte) 100);
        if (var4 != 0) {
            arg0.field1292--;
            this.field2105 = new class22();
            this.field2105.method169(arg0);
            this.field2103 = new class22();
            this.field2103.method169(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method598(false);
            if (var6 == 0) {
                break;
            }
            this.field2124[var5] = var6;
            this.field2116[var5] = arg0.method616((byte) -67);
            this.field2102[var5] = arg0.method598(false);
        }
        this.field2112 = arg0.method598(false);
        this.field2113 = arg0.method598(false);
        this.field2114 = arg0.method631(10494);
        this.field2109 = arg0.method631(10494);
        this.field2110 = new class330();
        this.field2111 = new class22();
        this.field2110.method2133(arg0, this.field2111);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I", line = 386)
    private final int method976(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2115[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2107[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class152 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    private int[] field2096 = new int[5];

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    private int field2100 = 100;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field2106 = 0;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field2104 = 500;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    private int field2097 = 0;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
    private int[] field2109 = new int[5];

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[I")
    private int[] field2117 = new int[5];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
    private static int[] field2098 = new int[32768];

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    private static int[] field2099;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "[I")
    private static int[] field2110;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "[I")
    private static int[] field2114;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[I")
    private static int[] field2112;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[I")
    private static int[] field2115;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
    private static int[] field2116;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[I")
    private static int[] field2113;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lui;")
    private class346 field2094;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljh;")
    private class348 field2093;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ljh;")
    private class348 field2095;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljh;")
    private class348 field2101;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Ljh;")
    private class348 field2102;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljh;")
    private class348 field2103;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Ljh;")
    private class348 field2105;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Ljh;")
    private class348 field2107;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ljh;")
    private class348 field2108;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Ljh;")
    private class348 field2111;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lkk;)V")
    public final void method1083(class161 arg0) {
        this.field2107 = new class348();
        this.field2107.method2159(arg0);
        this.field2108 = new class348();
        this.field2108.method2159(arg0);
        int var2 = arg0.method1172((byte) -114);
        if (var2 != 0) {
            arg0.field2298--;
            this.field2111 = new class348();
            this.field2111.method2159(arg0);
            this.field2095 = new class348();
            this.field2095.method2159(arg0);
        }
        int var3 = arg0.method1172((byte) -111);
        if (var3 != 0) {
            arg0.field2298--;
            this.field2093 = new class348();
            this.field2093.method2159(arg0);
            this.field2103 = new class348();
            this.field2103.method2159(arg0);
        }
        int var4 = arg0.method1172((byte) 109);
        if (var4 != 0) {
            arg0.field2298--;
            this.field2102 = new class348();
            this.field2102.method2159(arg0);
            this.field2101 = new class348();
            this.field2101.method2159(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1133(0);
            if (var6 == 0) {
                break;
            }
            this.field2096[var5] = var6;
            this.field2109[var5] = arg0.method1164(75);
            this.field2117[var5] = arg0.method1133(0);
        }
        this.field2097 = arg0.method1133(0);
        this.field2100 = arg0.method1133(0);
        this.field2104 = arg0.method1134(-16848);
        this.field2106 = arg0.method1134(-16848);
        this.field2094 = new class346();
        this.field2105 = new class348();
        this.field2094.method2150(arg0, this.field2105);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    private final int method1084(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2099[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2098[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
    public final int[] method1085(int arg0, int arg1) {
        class214.method1450(field2110, 0, arg0);
        if (arg1 < 10) {
            return field2110;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2107.method2158();
        this.field2108.method2158();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2111 != null) {
            this.field2111.method2158();
            this.field2095.method2158();
            var5 = (int) ((double) (this.field2111.field4795 - this.field2111.field4790) * 32.768D / var3);
            var6 = (int) ((double) this.field2111.field4790 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2093 != null) {
            this.field2093.method2158();
            this.field2103.method2158();
            var8 = (int) ((double) (this.field2093.field4795 - this.field2093.field4790) * 32.768D / var3);
            var9 = (int) ((double) this.field2093.field4790 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2096[var11] != 0) {
                field2112[var11] = 0;
                field2116[var11] = (int) ((double) this.field2117[var11] * var3);
                field2113[var11] = (this.field2096[var11] << 14) / 100;
                field2115[var11] = (int) ((double) (this.field2107.field4795 - this.field2107.field4790) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2109[var11]) / var3);
                field2114[var11] = (int) ((double) this.field2107.field4790 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2107.method2157(arg0);
            int var40 = this.field2108.method2157(arg0);
            if (this.field2111 != null) {
                int var41 = this.field2111.method2157(arg0);
                int var42 = this.field2095.method2157(arg0);
                var39 += this.method1084(var7, var42, this.field2111.field4792) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2093 != null) {
                int var43 = this.field2093.method2157(arg0);
                int var44 = this.field2103.method2157(arg0);
                var40 = var40 * ((this.method1084(var10, var44, this.field2093.field4792) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2096[var45] != 0) {
                    int var46 = field2116[var45] + var12;
                    if (var46 < arg0) {
                        field2110[var46] += this.method1084(field2112[var45], field2113[var45] * var40 >> 15, this.field2107.field4792);
                        field2112[var45] += (field2115[var45] * var39 >> 16) + field2114[var45];
                    }
                }
            }
        }
        if (this.field2102 != null) {
            this.field2102.method2158();
            this.field2101.method2158();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2102.method2157(arg0);
                int var18 = this.field2101.method2157(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2102.field4795 - this.field2102.field4790) * var17 >> 8) + this.field2102.field4790;
                } else {
                    var19 = ((this.field2102.field4795 - this.field2102.field4790) * var18 >> 8) + this.field2102.field4790;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2110[var16] = 0;
                }
            }
        }
        if (this.field2097 > 0 && this.field2100 > 0) {
            int var20 = (int) ((double) this.field2097 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2110[var21] += field2110[var21 - var20] * this.field2100 / 100;
            }
        }
        if (this.field2094.field4776[0] > 0 || this.field2094.field4776[1] > 0) {
            this.field2105.method2158();
            int var22 = this.field2105.method2157(arg0 + 1);
            int var23 = this.field2094.method2153(0, (float) var22 / 65536.0F);
            int var24 = this.field2094.method2153(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2110[var23 + var25] * (long) class346.field4779 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2110[var23 + var25 - var36 - 1] * (long) class346.field4783[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2110[var25 - var37 - 1] * (long) class346.field4783[1][var37] >> 16);
                    }
                    field2110[var25] = var35;
                    var22 = this.field2105.method2157(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2110[var23 + var25] * (long) class346.field4779 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2110[var23 + var25 - var33 - 1] * (long) class346.field4783[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2110[var25 - var34 - 1] * (long) class346.field4783[1][var34] >> 16);
                        }
                        field2110[var25] = var32;
                        var22 = this.field2105.method2157(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2110[var23 + var25 - var29 - 1] * (long) class346.field4783[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2110[var25 - var30 - 1] * (long) class346.field4783[1][var30] >> 16);
                            }
                            field2110[var25] = var28;
                            this.field2105.method2157(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2094.method2153(0, (float) var22 / 65536.0F);
                    var24 = this.field2094.method2153(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2110[var38] < -32768) {
                field2110[var38] = -32768;
            }
            if (field2110[var38] > 32767) {
                field2110[var38] = 32767;
            }
        }
        return field2110;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
    public static void method1086() {
        field2110 = null;
        field2098 = null;
        field2099 = null;
        field2112 = null;
        field2116 = null;
        field2113 = null;
        field2115 = null;
        field2114 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2098[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2099 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2099[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2110 = new int[220500];
        field2114 = new int[5];
        field2112 = new int[5];
        field2115 = new int[5];
        field2116 = new int[5];
        field2113 = new int[5];
    }
}

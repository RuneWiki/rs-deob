import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class6 {

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field126 = 500;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    private int[] field127 = new int[5];

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field130 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    private int[] field124 = new int[5];

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    private int field133 = 0;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    private int field138 = 100;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    private int[] field136 = new int[5];

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
    private static int[] field137 = new int[32768];

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
    private static int[] field128;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    private static int[] field131;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "[I")
    private static int[] field141;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "[I")
    private static int[] field143;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
    private static int[] field144;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
    private static int[] field139;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[I")
    private static int[] field145;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lci;")
    private class155 field142;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Loa;")
    private class234 field121;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Loa;")
    private class234 field122;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Loa;")
    private class234 field123;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Loa;")
    private class234 field125;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Loa;")
    private class234 field129;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Loa;")
    private class234 field132;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Loa;")
    private class234 field134;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Loa;")
    private class234 field135;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Loa;")
    private class234 field140;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        class68.method423(field131, 0, arg0);
        if (arg1 < 10) {
            return field131;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field125.method1566();
        this.field123.method1566();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field122 != null) {
            this.field122.method1566();
            this.field132.method1566();
            var5 = (int) ((double) (this.field122.field4057 - this.field122.field4053) * 32.768D / var3);
            var6 = (int) ((double) this.field122.field4053 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field129 != null) {
            this.field129.method1566();
            this.field134.method1566();
            var8 = (int) ((double) (this.field129.field4057 - this.field129.field4053) * 32.768D / var3);
            var9 = (int) ((double) this.field129.field4053 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field124[var11] != 0) {
                field145[var11] = 0;
                field141[var11] = (int) ((double) this.field136[var11] * var3);
                field139[var11] = (this.field124[var11] << 14) / 100;
                field143[var11] = (int) ((double) (this.field125.field4057 - this.field125.field4053) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field127[var11]) / var3);
                field144[var11] = (int) ((double) this.field125.field4053 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field125.method1565(arg0);
            int var40 = this.field123.method1565(arg0);
            if (this.field122 != null) {
                int var41 = this.field122.method1565(arg0);
                int var42 = this.field132.method1565(arg0);
                var39 += this.method25(var7, var42, this.field122.field4054) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field129 != null) {
                int var43 = this.field129.method1565(arg0);
                int var44 = this.field134.method1565(arg0);
                var40 = var40 * ((this.method25(var10, var44, this.field129.field4054) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field124[var45] != 0) {
                    int var46 = field141[var45] + var12;
                    if (var46 < arg0) {
                        field131[var46] += this.method25(field145[var45], field139[var45] * var40 >> 15, this.field125.field4054);
                        field145[var45] += (field143[var45] * var39 >> 16) + field144[var45];
                    }
                }
            }
        }
        if (this.field140 != null) {
            this.field140.method1566();
            this.field121.method1566();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field140.method1565(arg0);
                int var18 = this.field121.method1565(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field140.field4057 - this.field140.field4053) * var17 >> 8) + this.field140.field4053;
                } else {
                    var19 = ((this.field140.field4057 - this.field140.field4053) * var18 >> 8) + this.field140.field4053;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field131[var16] = 0;
                }
            }
        }
        if (this.field133 > 0 && this.field138 > 0) {
            int var20 = (int) ((double) this.field133 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field131[var21] += field131[var21 - var20] * this.field138 / 100;
            }
        }
        if (this.field142.field2670[0] > 0 || this.field142.field2670[1] > 0) {
            this.field135.method1566();
            int var22 = this.field135.method1565(arg0 + 1);
            int var23 = this.field142.method974(0, (float) var22 / 65536.0F);
            int var24 = this.field142.method974(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field131[var23 + var25] * (long) class155.field2671 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field131[var23 + var25 - var36 - 1] * (long) class155.field2667[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field131[var25 - var37 - 1] * (long) class155.field2667[1][var37] >> 16);
                    }
                    field131[var25] = var35;
                    var22 = this.field135.method1565(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field131[var23 + var25] * (long) class155.field2671 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field131[var23 + var25 - var33 - 1] * (long) class155.field2667[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field131[var25 - var34 - 1] * (long) class155.field2667[1][var34] >> 16);
                        }
                        field131[var25] = var32;
                        var22 = this.field135.method1565(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field131[var23 + var25 - var29 - 1] * (long) class155.field2667[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field131[var25 - var30 - 1] * (long) class155.field2667[1][var30] >> 16);
                            }
                            field131[var25] = var28;
                            this.field135.method1565(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field142.method974(0, (float) var22 / 65536.0F);
                    var24 = this.field142.method974(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field131[var38] < -32768) {
                field131[var38] = -32768;
            }
            if (field131[var38] > 32767) {
                field131[var38] = 32767;
            }
        }
        return field131;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnj;)V")
    public final void method24(class226 arg0) {
        this.field125 = new class234();
        this.field125.method1567(arg0);
        this.field123 = new class234();
        this.field123.method1567(arg0);
        int var2 = arg0.method1471(255);
        if (var2 != 0) {
            arg0.field3879--;
            this.field122 = new class234();
            this.field122.method1567(arg0);
            this.field132 = new class234();
            this.field132.method1567(arg0);
        }
        int var3 = arg0.method1471(255);
        if (var3 != 0) {
            arg0.field3879--;
            this.field129 = new class234();
            this.field129.method1567(arg0);
            this.field134 = new class234();
            this.field134.method1567(arg0);
        }
        int var4 = arg0.method1471(255);
        if (var4 != 0) {
            arg0.field3879--;
            this.field140 = new class234();
            this.field140.method1567(arg0);
            this.field121 = new class234();
            this.field121.method1567(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1467(false);
            if (var6 == 0) {
                break;
            }
            this.field124[var5] = var6;
            this.field127[var5] = arg0.method1455(-129);
            this.field136[var5] = arg0.method1467(false);
        }
        this.field133 = arg0.method1467(false);
        this.field138 = arg0.method1467(false);
        this.field126 = arg0.method1447(0);
        this.field130 = arg0.method1447(0);
        this.field142 = new class155();
        this.field135 = new class234();
        this.field142.method975(arg0, this.field135);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
    private final int method25(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field128[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field137[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
    public static void method26() {
        field131 = null;
        field137 = null;
        field128 = null;
        field145 = null;
        field141 = null;
        field139 = null;
        field143 = null;
        field144 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field137[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field128 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field128[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field131 = new int[220500];
        field141 = new int[5];
        field143 = new int[5];
        field144 = new int[5];
        field139 = new int[5];
        field145 = new int[5];
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class122 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public int field2088 = 0;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "[I")
    private int[] field2091 = new int[5];

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "[I")
    private int[] field2092 = new int[5];

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    private int field2103 = 100;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public int field2102 = 500;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "[I")
    private int[] field2109 = new int[5];

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "I")
    private int field2108 = 0;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "[I")
    private static int[] field2097 = new int[32768];

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "[I")
    private static int[] field2093;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "[I")
    private static int[] field2090;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "[I")
    private static int[] field2105;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "[I")
    private static int[] field2107;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "[I")
    private static int[] field2110;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "[I")
    private static int[] field2112;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "[I")
    private static int[] field2111;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lra;")
    private class110 field2089;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "Lra;")
    private class110 field2094;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Lra;")
    private class110 field2095;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "Lra;")
    private class110 field2096;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "Lra;")
    private class110 field2098;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "Lra;")
    private class110 field2099;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "Lra;")
    private class110 field2101;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "Lra;")
    private class110 field2104;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "Lra;")
    private class110 field2106;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "Leha;")
    private class90 field2100;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I")
    private final int method1050(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2093[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2097[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lcea;)V")
    public final void method1051(class215 arg0) {
        this.field2099 = new class110();
        this.field2099.method975(arg0);
        this.field2089 = new class110();
        this.field2089.method975(arg0);
        int var2 = arg0.method1535(255);
        if (var2 != 0) {
            arg0.field3109--;
            this.field2096 = new class110();
            this.field2096.method975(arg0);
            this.field2106 = new class110();
            this.field2106.method975(arg0);
        }
        int var3 = arg0.method1535(255);
        if (var3 != 0) {
            arg0.field3109--;
            this.field2094 = new class110();
            this.field2094.method975(arg0);
            this.field2104 = new class110();
            this.field2104.method975(arg0);
        }
        int var4 = arg0.method1535(255);
        if (var4 != 0) {
            arg0.field3109--;
            this.field2095 = new class110();
            this.field2095.method975(arg0);
            this.field2101 = new class110();
            this.field2101.method975(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1530(-118);
            if (var6 == 0) {
                break;
            }
            this.field2091[var5] = var6;
            this.field2092[var5] = arg0.method1510((byte) 77);
            this.field2109[var5] = arg0.method1530(-121);
        }
        this.field2108 = arg0.method1530(-120);
        this.field2103 = arg0.method1530(-122);
        this.field2102 = arg0.method1478(842397944);
        this.field2088 = arg0.method1478(842397944);
        this.field2100 = new class90();
        this.field2098 = new class110();
        this.field2100.method836(arg0, this.field2098);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "()V")
    public static void method1052() {
        field2090 = null;
        field2097 = null;
        field2093 = null;
        field2112 = null;
        field2105 = null;
        field2111 = null;
        field2110 = null;
        field2107 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)[I")
    public final int[] method1053(int arg0, int arg1) {
        class363.method2315(field2090, 0, arg0);
        if (arg1 < 10) {
            return field2090;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2099.method976();
        this.field2089.method976();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2096 != null) {
            this.field2096.method976();
            this.field2106.method976();
            var5 = (int) ((double) (this.field2096.field1908 - this.field2096.field1909) * 32.768D / var3);
            var6 = (int) ((double) this.field2096.field1909 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2094 != null) {
            this.field2094.method976();
            this.field2104.method976();
            var8 = (int) ((double) (this.field2094.field1908 - this.field2094.field1909) * 32.768D / var3);
            var9 = (int) ((double) this.field2094.field1909 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2091[var11] != 0) {
                field2112[var11] = 0;
                field2105[var11] = (int) ((double) this.field2109[var11] * var3);
                field2111[var11] = (this.field2091[var11] << 14) / 100;
                field2110[var11] = (int) ((double) (this.field2099.field1908 - this.field2099.field1909) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2092[var11]) / var3);
                field2107[var11] = (int) ((double) this.field2099.field1909 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2099.method974(arg0);
            int var40 = this.field2089.method974(arg0);
            if (this.field2096 != null) {
                int var41 = this.field2096.method974(arg0);
                int var42 = this.field2106.method974(arg0);
                var39 += this.method1050(var7, var42, this.field2096.field1905) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2094 != null) {
                int var43 = this.field2094.method974(arg0);
                int var44 = this.field2104.method974(arg0);
                var40 = var40 * ((this.method1050(var10, var44, this.field2094.field1905) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2091[var45] != 0) {
                    int var46 = field2105[var45] + var12;
                    if (var46 < arg0) {
                        field2090[var46] += this.method1050(field2112[var45], field2111[var45] * var40 >> 15, this.field2099.field1905);
                        field2112[var45] += (field2110[var45] * var39 >> 16) + field2107[var45];
                    }
                }
            }
        }
        if (this.field2095 != null) {
            this.field2095.method976();
            this.field2101.method976();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2095.method974(arg0);
                int var18 = this.field2101.method974(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2095.field1908 - this.field2095.field1909) * var17 >> 8) + this.field2095.field1909;
                } else {
                    var19 = ((this.field2095.field1908 - this.field2095.field1909) * var18 >> 8) + this.field2095.field1909;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2090[var16] = 0;
                }
            }
        }
        if (this.field2108 > 0 && this.field2103 > 0) {
            int var20 = (int) ((double) this.field2108 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2090[var21] += field2090[var21 - var20] * this.field2103 / 100;
            }
        }
        if (this.field2100.field1576[0] > 0 || this.field2100.field1576[1] > 0) {
            this.field2098.method976();
            int var22 = this.field2098.method974(arg0 + 1);
            int var23 = this.field2100.method841(0, (float) var22 / 65536.0F);
            int var24 = this.field2100.method841(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2090[var23 + var25] * (long) class90.field1580 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2090[var23 + var25 - var36 - 1] * (long) class90.field1578[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2090[var25 - var37 - 1] * (long) class90.field1578[1][var37] >> 16);
                    }
                    field2090[var25] = var35;
                    var22 = this.field2098.method974(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2090[var23 + var25] * (long) class90.field1580 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2090[var23 + var25 - var33 - 1] * (long) class90.field1578[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2090[var25 - var34 - 1] * (long) class90.field1578[1][var34] >> 16);
                        }
                        field2090[var25] = var32;
                        var22 = this.field2098.method974(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2090[var23 + var25 - var29 - 1] * (long) class90.field1578[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2090[var25 - var30 - 1] * (long) class90.field1578[1][var30] >> 16);
                            }
                            field2090[var25] = var28;
                            this.field2098.method974(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2100.method841(0, (float) var22 / 65536.0F);
                    var24 = this.field2100.method841(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2090[var38] < -32768) {
                field2090[var38] = -32768;
            }
            if (field2090[var38] > 32767) {
                field2090[var38] = 32767;
            }
        }
        return field2090;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2097[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2093 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2093[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2090 = new int[220500];
        field2105 = new int[5];
        field2107 = new int[5];
        field2110 = new int[5];
        field2112 = new int[5];
        field2111 = new int[5];
    }
}

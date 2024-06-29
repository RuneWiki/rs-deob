import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    private int[] field1895 = new int[5];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    private int field1896 = 100;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    private int[] field1897 = new int[5];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    private int field1904 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field1902 = 500;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    private int[] field1907 = new int[5];

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public int field1912 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    private static int[] field1894 = new int[32768];

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    private static int[] field1905;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "[I")
    private static int[] field1910;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[I")
    private static int[] field1914;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
    private static int[] field1916;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
    private static int[] field1917;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    private static int[] field1915;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[I")
    private static int[] field1918;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lvd;")
    private class150 field1898;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lvd;")
    private class150 field1899;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lvd;")
    private class150 field1901;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lvd;")
    private class150 field1903;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lvd;")
    private class150 field1906;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lvd;")
    private class150 field1908;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lvd;")
    private class150 field1909;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lvd;")
    private class150 field1911;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lvd;")
    private class150 field1913;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lfc;")
    private class39 field1900;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwd;)V")
    public final void method638(class157 arg0) {
        this.field1903 = new class150();
        this.field1903.method1110(arg0);
        this.field1909 = new class150();
        this.field1909.method1110(arg0);
        int var2 = arg0.method1194(false);
        if (var2 != 0) {
            arg0.field3457--;
            this.field1906 = new class150();
            this.field1906.method1110(arg0);
            this.field1908 = new class150();
            this.field1908.method1110(arg0);
        }
        int var3 = arg0.method1194(false);
        if (var3 != 0) {
            arg0.field3457--;
            this.field1913 = new class150();
            this.field1913.method1110(arg0);
            this.field1901 = new class150();
            this.field1901.method1110(arg0);
        }
        int var4 = arg0.method1194(false);
        if (var4 != 0) {
            arg0.field3457--;
            this.field1898 = new class150();
            this.field1898.method1110(arg0);
            this.field1899 = new class150();
            this.field1899.method1110(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1171(-32768);
            if (var6 == 0) {
                break;
            }
            this.field1895[var5] = var6;
            this.field1897[var5] = arg0.method1210(-116);
            this.field1907[var5] = arg0.method1171(-32768);
        }
        this.field1904 = arg0.method1171(-32768);
        this.field1896 = arg0.method1171(-32768);
        this.field1902 = arg0.method1161((byte) 60);
        this.field1912 = arg0.method1161((byte) 60);
        this.field1900 = new class39();
        this.field1911 = new class150();
        this.field1900.method299(arg0, this.field1911);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
    private final int method639(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1905[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1894[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
    public static void method640() {
        field1910 = null;
        field1894 = null;
        field1905 = null;
        field1915 = null;
        field1914 = null;
        field1917 = null;
        field1918 = null;
        field1916 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
    public final int[] method641(int arg0, int arg1) {
        class105.method817(field1910, 0, arg0);
        if (arg1 < 10) {
            return field1910;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1903.method1109();
        this.field1909.method1109();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1906 != null) {
            this.field1906.method1109();
            this.field1908.method1109();
            var5 = (int) ((double) (this.field1906.field3274 - this.field1906.field3273) * 32.768D / var3);
            var6 = (int) ((double) this.field1906.field3273 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1913 != null) {
            this.field1913.method1109();
            this.field1901.method1109();
            var8 = (int) ((double) (this.field1913.field3274 - this.field1913.field3273) * 32.768D / var3);
            var9 = (int) ((double) this.field1913.field3273 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1895[var11] != 0) {
                field1915[var11] = 0;
                field1914[var11] = (int) ((double) this.field1907[var11] * var3);
                field1917[var11] = (this.field1895[var11] << 14) / 100;
                field1918[var11] = (int) ((double) (this.field1903.field3274 - this.field1903.field3273) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1897[var11]) / var3);
                field1916[var11] = (int) ((double) this.field1903.field3273 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1903.method1108(arg0);
            int var40 = this.field1909.method1108(arg0);
            if (this.field1906 != null) {
                int var41 = this.field1906.method1108(arg0);
                int var42 = this.field1908.method1108(arg0);
                var39 += this.method639(var7, var42, this.field1906.field3277) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1913 != null) {
                int var43 = this.field1913.method1108(arg0);
                int var44 = this.field1901.method1108(arg0);
                var40 = var40 * ((this.method639(var10, var44, this.field1913.field3277) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1895[var45] != 0) {
                    int var46 = field1914[var45] + var12;
                    if (var46 < arg0) {
                        field1910[var46] += this.method639(field1915[var45], field1917[var45] * var40 >> 15, this.field1903.field3277);
                        field1915[var45] += (field1918[var45] * var39 >> 16) + field1916[var45];
                    }
                }
            }
        }
        if (this.field1898 != null) {
            this.field1898.method1109();
            this.field1899.method1109();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1898.method1108(arg0);
                int var18 = this.field1899.method1108(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1898.field3274 - this.field1898.field3273) * var17 >> 8) + this.field1898.field3273;
                } else {
                    var19 = ((this.field1898.field3274 - this.field1898.field3273) * var18 >> 8) + this.field1898.field3273;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1910[var16] = 0;
                }
            }
        }
        if (this.field1904 > 0 && this.field1896 > 0) {
            int var20 = (int) ((double) this.field1904 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1910[var21] += field1910[var21 - var20] * this.field1896 / 100;
            }
        }
        if (this.field1900.field1007[0] > 0 || this.field1900.field1007[1] > 0) {
            this.field1911.method1109();
            int var22 = this.field1911.method1108(arg0 + 1);
            int var23 = this.field1900.method297(0, (float) var22 / 65536.0F);
            int var24 = this.field1900.method297(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1910[var23 + var25] * (long) class39.field1006 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1910[var23 + var25 - var36 - 1] * (long) class39.field1003[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1910[var25 - var37 - 1] * (long) class39.field1003[1][var37] >> 16);
                    }
                    field1910[var25] = var35;
                    var22 = this.field1911.method1108(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1910[var23 + var25] * (long) class39.field1006 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1910[var23 + var25 - var33 - 1] * (long) class39.field1003[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1910[var25 - var34 - 1] * (long) class39.field1003[1][var34] >> 16);
                        }
                        field1910[var25] = var32;
                        var22 = this.field1911.method1108(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1910[var23 + var25 - var29 - 1] * (long) class39.field1003[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1910[var25 - var30 - 1] * (long) class39.field1003[1][var30] >> 16);
                            }
                            field1910[var25] = var28;
                            this.field1911.method1108(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1900.method297(0, (float) var22 / 65536.0F);
                    var24 = this.field1900.method297(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1910[var38] < -32768) {
                field1910[var38] = -32768;
            }
            if (field1910[var38] > 32767) {
                field1910[var38] = 32767;
            }
        }
        return field1910;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1894[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1905 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1905[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1910 = new int[220500];
        field1914 = new int[5];
        field1916 = new int[5];
        field1917 = new int[5];
        field1915 = new int[5];
        field1918 = new int[5];
    }
}

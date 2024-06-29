import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class145 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
    private int[] field1914 = new int[5];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
    private int[] field1918 = new int[5];

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field1921 = 0;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "[I")
    private int[] field1922 = new int[5];

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field1927 = 500;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    private int field1928 = 100;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    private int field1930 = 0;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
    private static int[] field1925 = new int[32768];

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
    private static int[] field1916;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[I")
    private static int[] field1929;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[I")
    private static int[] field1933;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[I")
    private static int[] field1936;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "[I")
    private static int[] field1934;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "[I")
    private static int[] field1935;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
    private static int[] field1938;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Lwi;")
    private class409 field1924;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ldk;")
    private class416 field1915;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ldk;")
    private class416 field1917;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ldk;")
    private class416 field1919;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ldk;")
    private class416 field1920;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ldk;")
    private class416 field1923;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Ldk;")
    private class416 field1926;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Ldk;")
    private class416 field1931;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Ldk;")
    private class416 field1932;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Ldk;")
    private class416 field1937;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1925[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1916 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1916[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1929 = new int[220500];
        field1933 = new int[5];
        field1936 = new int[5];
        field1934 = new int[5];
        field1935 = new int[5];
        field1938 = new int[5];
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I", line = 21)
    private final int method1009(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1916[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1925[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I", line = 57)
    public final int[] method1010(int arg0, int arg1) {
        class526.method3112(field1929, 0, arg0);
        if (arg1 < 10) {
            return field1929;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1919.method2450();
        this.field1926.method2450();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1932 != null) {
            this.field1932.method2450();
            this.field1923.method2450();
            var5 = (int) ((double) (this.field1932.field5539 - this.field1932.field5538) * 32.768D / var3);
            var6 = (int) ((double) this.field1932.field5538 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1937 != null) {
            this.field1937.method2450();
            this.field1920.method2450();
            var8 = (int) ((double) (this.field1937.field5539 - this.field1937.field5538) * 32.768D / var3);
            var9 = (int) ((double) this.field1937.field5538 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1914[var11] != 0) {
                field1938[var11] = 0;
                field1933[var11] = (int) ((double) this.field1922[var11] * var3);
                field1936[var11] = (this.field1914[var11] << 14) / 100;
                field1934[var11] = (int) ((double) (this.field1919.field5539 - this.field1919.field5538) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1918[var11]) / var3);
                field1935[var11] = (int) ((double) this.field1919.field5538 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1919.method2448(arg0);
            int var40 = this.field1926.method2448(arg0);
            if (this.field1932 != null) {
                int var41 = this.field1932.method2448(arg0);
                int var42 = this.field1923.method2448(arg0);
                var39 += this.method1009(var7, var42, this.field1932.field5536) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1937 != null) {
                int var43 = this.field1937.method2448(arg0);
                int var44 = this.field1920.method2448(arg0);
                var40 = var40 * ((this.method1009(var10, var44, this.field1937.field5536) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1914[var45] != 0) {
                    int var46 = field1933[var45] + var12;
                    if (var46 < arg0) {
                        field1929[var46] += this.method1009(field1938[var45], field1936[var45] * var40 >> 15, this.field1919.field5536);
                        field1938[var45] += (field1934[var45] * var39 >> 16) + field1935[var45];
                    }
                }
            }
        }
        if (this.field1915 != null) {
            this.field1915.method2450();
            this.field1917.method2450();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1915.method2448(arg0);
                int var18 = this.field1917.method2448(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1915.field5539 - this.field1915.field5538) * var17 >> 8) + this.field1915.field5538;
                } else {
                    var19 = ((this.field1915.field5539 - this.field1915.field5538) * var18 >> 8) + this.field1915.field5538;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1929[var16] = 0;
                }
            }
        }
        if (this.field1930 > 0 && this.field1928 > 0) {
            int var20 = (int) ((double) this.field1930 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1929[var21] += field1929[var21 - var20] * this.field1928 / 100;
            }
        }
        if (this.field1924.field5479[0] > 0 || this.field1924.field5479[1] > 0) {
            this.field1931.method2450();
            int var22 = this.field1931.method2448(arg0 + 1);
            int var23 = this.field1924.method2425(0, (float) var22 / 65536.0F);
            int var24 = this.field1924.method2425(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1929[var23 + var25] * (long) class409.field5475 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1929[var23 + var25 - var36 - 1] * (long) class409.field5477[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1929[var25 - var37 - 1] * (long) class409.field5477[1][var37] >> 16);
                    }
                    field1929[var25] = var35;
                    var22 = this.field1931.method2448(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1929[var23 + var25] * (long) class409.field5475 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1929[var23 + var25 - var33 - 1] * (long) class409.field5477[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1929[var25 - var34 - 1] * (long) class409.field5477[1][var34] >> 16);
                        }
                        field1929[var25] = var32;
                        var22 = this.field1931.method2448(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1929[var23 + var25 - var29 - 1] * (long) class409.field5477[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1929[var25 - var30 - 1] * (long) class409.field5477[1][var30] >> 16);
                            }
                            field1929[var25] = var28;
                            this.field1931.method2448(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1924.method2425(0, (float) var22 / 65536.0F);
                    var24 = this.field1924.method2425(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1929[var38] < -32768) {
                field1929[var38] = -32768;
            }
            if (field1929[var38] > 32767) {
                field1929[var38] = 32767;
            }
        }
        return field1929;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lbt;)V", line = 340)
    public final void method1011(class88 arg0) {
        this.field1919 = new class416();
        this.field1919.method2451(arg0);
        this.field1926 = new class416();
        this.field1926.method2451(arg0);
        int var2 = arg0.method617(2);
        if (var2 != 0) {
            arg0.field1176--;
            this.field1932 = new class416();
            this.field1932.method2451(arg0);
            this.field1923 = new class416();
            this.field1923.method2451(arg0);
        }
        int var3 = arg0.method617(2);
        if (var3 != 0) {
            arg0.field1176--;
            this.field1937 = new class416();
            this.field1937.method2451(arg0);
            this.field1920 = new class416();
            this.field1920.method2451(arg0);
        }
        int var4 = arg0.method617(2);
        if (var4 != 0) {
            arg0.field1176--;
            this.field1915 = new class416();
            this.field1915.method2451(arg0);
            this.field1917 = new class416();
            this.field1917.method2451(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method604(-9338);
            if (var6 == 0) {
                break;
            }
            this.field1914[var5] = var6;
            this.field1918[var5] = arg0.method602(false);
            this.field1922[var5] = arg0.method604(-9338);
        }
        this.field1930 = arg0.method604(-9338);
        this.field1928 = arg0.method604(-9338);
        this.field1927 = arg0.method568((byte) 110);
        this.field1921 = arg0.method568((byte) 110);
        this.field1924 = new class409();
        this.field1931 = new class416();
        this.field1924.method2426(arg0, this.field1931);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 411)
    public static void method1012() {
        field1929 = null;
        field1925 = null;
        field1916 = null;
        field1938 = null;
        field1933 = null;
        field1936 = null;
        field1934 = null;
        field1935 = null;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class126 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
    private int[] field1879 = new int[5];

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    private int field1881 = 100;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    private int field1886 = 0;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public int field1892 = 0;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field1891 = 500;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "[I")
    private int[] field1887 = new int[5];

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "[I")
    private int[] field1902 = new int[5];

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
    private static int[] field1882 = new int[32768];

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "[I")
    private static int[] field1895;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "[I")
    private static int[] field1897;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "[I")
    private static int[] field1899;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "[I")
    private static int[] field1898;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "[I")
    private static int[] field1900;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "[I")
    private static int[] field1901;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "[I")
    private static int[] field1903;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lkv;")
    private class160 field1880;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lkv;")
    private class160 field1883;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lkv;")
    private class160 field1884;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lkv;")
    private class160 field1885;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Lkv;")
    private class160 field1888;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lkv;")
    private class160 field1889;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Lkv;")
    private class160 field1890;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Lkv;")
    private class160 field1893;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Lkv;")
    private class160 field1896;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "Lfr;")
    private class502 field1894;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1882[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1895 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1895[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1897 = new int[220500];
        field1899 = new int[5];
        field1898 = new int[5];
        field1900 = new int[5];
        field1901 = new int[5];
        field1903 = new int[5];
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lfh;)V", line = 16)
    public final void method932(class194 arg0) {
        this.field1883 = new class160();
        this.field1883.method1153(arg0);
        this.field1885 = new class160();
        this.field1885.method1153(arg0);
        int var2 = arg0.method1337((byte) 24);
        if (var2 != 0) {
            arg0.field2982--;
            this.field1890 = new class160();
            this.field1890.method1153(arg0);
            this.field1884 = new class160();
            this.field1884.method1153(arg0);
        }
        int var3 = arg0.method1337((byte) 30);
        if (var3 != 0) {
            arg0.field2982--;
            this.field1896 = new class160();
            this.field1896.method1153(arg0);
            this.field1893 = new class160();
            this.field1893.method1153(arg0);
        }
        int var4 = arg0.method1337((byte) 112);
        if (var4 != 0) {
            arg0.field2982--;
            this.field1888 = new class160();
            this.field1888.method1153(arg0);
            this.field1889 = new class160();
            this.field1889.method1153(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1340(-89);
            if (var6 == 0) {
                break;
            }
            this.field1879[var5] = var6;
            this.field1902[var5] = arg0.method1374(false);
            this.field1887[var5] = arg0.method1340(-83);
        }
        this.field1886 = arg0.method1340(-85);
        this.field1881 = arg0.method1340(-38);
        this.field1891 = arg0.method1396(-7);
        this.field1892 = arg0.method1396(118);
        this.field1894 = new class502();
        this.field1880 = new class160();
        this.field1894.method2995(arg0, this.field1880);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()V", line = 77)
    public static void method933() {
        field1897 = null;
        field1882 = null;
        field1895 = null;
        field1901 = null;
        field1903 = null;
        field1900 = null;
        field1899 = null;
        field1898 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I", line = 90)
    public final int[] method934(int arg0, int arg1) {
        class325.method2135(field1897, 0, arg0);
        if (arg1 < 10) {
            return field1897;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1883.method1154();
        this.field1885.method1154();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1890 != null) {
            this.field1890.method1154();
            this.field1884.method1154();
            var5 = (int) ((double) (this.field1890.field2423 - this.field1890.field2424) * 32.768D / var3);
            var6 = (int) ((double) this.field1890.field2424 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1896 != null) {
            this.field1896.method1154();
            this.field1893.method1154();
            var8 = (int) ((double) (this.field1896.field2423 - this.field1896.field2424) * 32.768D / var3);
            var9 = (int) ((double) this.field1896.field2424 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1879[var11] != 0) {
                field1901[var11] = 0;
                field1903[var11] = (int) ((double) this.field1887[var11] * var3);
                field1900[var11] = (this.field1879[var11] << 14) / 100;
                field1899[var11] = (int) ((double) (this.field1883.field2423 - this.field1883.field2424) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1902[var11]) / var3);
                field1898[var11] = (int) ((double) this.field1883.field2424 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1883.method1152(arg0);
            int var40 = this.field1885.method1152(arg0);
            if (this.field1890 != null) {
                int var41 = this.field1890.method1152(arg0);
                int var42 = this.field1884.method1152(arg0);
                var39 += this.method935(var7, var42, this.field1890.field2425) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1896 != null) {
                int var43 = this.field1896.method1152(arg0);
                int var44 = this.field1893.method1152(arg0);
                var40 = var40 * ((this.method935(var10, var44, this.field1896.field2425) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1879[var45] != 0) {
                    int var46 = field1903[var45] + var12;
                    if (var46 < arg0) {
                        field1897[var46] += this.method935(field1901[var45], field1900[var45] * var40 >> 15, this.field1883.field2425);
                        field1901[var45] += (field1899[var45] * var39 >> 16) + field1898[var45];
                    }
                }
            }
        }
        if (this.field1888 != null) {
            this.field1888.method1154();
            this.field1889.method1154();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1888.method1152(arg0);
                int var18 = this.field1889.method1152(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1888.field2423 - this.field1888.field2424) * var17 >> 8) + this.field1888.field2424;
                } else {
                    var19 = ((this.field1888.field2423 - this.field1888.field2424) * var18 >> 8) + this.field1888.field2424;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1897[var16] = 0;
                }
            }
        }
        if (this.field1886 > 0 && this.field1881 > 0) {
            int var20 = (int) ((double) this.field1886 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1897[var21] += field1897[var21 - var20] * this.field1881 / 100;
            }
        }
        if (this.field1894.field7290[0] > 0 || this.field1894.field7290[1] > 0) {
            this.field1880.method1154();
            int var22 = this.field1880.method1152(arg0 + 1);
            int var23 = this.field1894.method2990(0, (float) var22 / 65536.0F);
            int var24 = this.field1894.method2990(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1897[var23 + var25] * (long) class502.field7287 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1897[var23 + var25 - var36 - 1] * (long) class502.field7288[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1897[var25 - var37 - 1] * (long) class502.field7288[1][var37] >> 16);
                    }
                    field1897[var25] = var35;
                    var22 = this.field1880.method1152(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1897[var23 + var25] * (long) class502.field7287 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1897[var23 + var25 - var33 - 1] * (long) class502.field7288[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1897[var25 - var34 - 1] * (long) class502.field7288[1][var34] >> 16);
                        }
                        field1897[var25] = var32;
                        var22 = this.field1880.method1152(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1897[var23 + var25 - var29 - 1] * (long) class502.field7288[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1897[var25 - var30 - 1] * (long) class502.field7288[1][var30] >> 16);
                            }
                            field1897[var25] = var28;
                            this.field1880.method1152(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1894.method2990(0, (float) var22 / 65536.0F);
                    var24 = this.field1894.method2990(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1897[var38] < -32768) {
                field1897[var38] = -32768;
            }
            if (field1897[var38] > 32767) {
                field1897[var38] = 32767;
            }
        }
        return field1897;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I", line = 384)
    private final int method935(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1895[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1882[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}

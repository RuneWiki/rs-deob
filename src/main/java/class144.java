import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class144 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
    private int[] field1840 = new int[5];

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
    private int[] field1853 = new int[5];

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field1845 = 500;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field1841 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    private int field1851 = 100;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
    private int[] field1857 = new int[5];

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public int field1862 = 0;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    private static int[] field1847 = new int[32768];

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    private static int[] field1844;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    private static int[] field1850;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    private static int[] field1852;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "[I")
    private static int[] field1854;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[I")
    private static int[] field1856;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
    private static int[] field1858;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[I")
    private static int[] field1855;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lfq;")
    private class178 field1839;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ldf;")
    private class81 field1842;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ldf;")
    private class81 field1843;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ldf;")
    private class81 field1846;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ldf;")
    private class81 field1848;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ldf;")
    private class81 field1849;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Ldf;")
    private class81 field1859;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Ldf;")
    private class81 field1860;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Ldf;")
    private class81 field1861;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Ldf;")
    private class81 field1863;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1847[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1844 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1844[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1850 = new int[220500];
        field1852 = new int[5];
        field1854 = new int[5];
        field1856 = new int[5];
        field1858 = new int[5];
        field1855 = new int[5];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ltq;)V", line = 9)
    public final void method782(class250 arg0) {
        this.field1859 = new class81();
        this.field1859.method445(arg0);
        this.field1863 = new class81();
        this.field1863.method445(arg0);
        int var2 = arg0.method1350(31351);
        if (var2 != 0) {
            arg0.field3389--;
            this.field1843 = new class81();
            this.field1843.method445(arg0);
            this.field1849 = new class81();
            this.field1849.method445(arg0);
        }
        int var3 = arg0.method1350(31351);
        if (var3 != 0) {
            arg0.field3389--;
            this.field1846 = new class81();
            this.field1846.method445(arg0);
            this.field1842 = new class81();
            this.field1842.method445(arg0);
        }
        int var4 = arg0.method1350(31351);
        if (var4 != 0) {
            arg0.field3389--;
            this.field1860 = new class81();
            this.field1860.method445(arg0);
            this.field1848 = new class81();
            this.field1848.method445(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1383(255);
            if (var6 == 0) {
                break;
            }
            this.field1853[var5] = var6;
            this.field1840[var5] = arg0.method1340((byte) 122);
            this.field1857[var5] = arg0.method1383(255);
        }
        this.field1841 = arg0.method1383(255);
        this.field1851 = arg0.method1383(255);
        this.field1845 = arg0.method1374(-2);
        this.field1862 = arg0.method1374(-2);
        this.field1839 = new class178();
        this.field1861 = new class81();
        this.field1839.method934(arg0, this.field1861);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I", line = 72)
    private final int method783(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1844[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1847[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 99)
    public static void method784() {
        field1850 = null;
        field1847 = null;
        field1844 = null;
        field1855 = null;
        field1856 = null;
        field1854 = null;
        field1858 = null;
        field1852 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method785(int arg0, int arg1) {
        class358.method2179(field1850, 0, arg0);
        if (arg1 < 10) {
            return field1850;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1859.method444();
        this.field1863.method444();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1843 != null) {
            this.field1843.method444();
            this.field1849.method444();
            var5 = (int) ((double) (this.field1843.field899 - this.field1843.field896) * 32.768D / var3);
            var6 = (int) ((double) this.field1843.field896 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1846 != null) {
            this.field1846.method444();
            this.field1842.method444();
            var8 = (int) ((double) (this.field1846.field899 - this.field1846.field896) * 32.768D / var3);
            var9 = (int) ((double) this.field1846.field896 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1853[var11] != 0) {
                field1855[var11] = 0;
                field1856[var11] = (int) ((double) this.field1857[var11] * var3);
                field1854[var11] = (this.field1853[var11] << 14) / 100;
                field1858[var11] = (int) ((double) (this.field1859.field899 - this.field1859.field896) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1840[var11]) / var3);
                field1852[var11] = (int) ((double) this.field1859.field896 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1859.method447(arg0);
            int var40 = this.field1863.method447(arg0);
            if (this.field1843 != null) {
                int var41 = this.field1843.method447(arg0);
                int var42 = this.field1849.method447(arg0);
                var39 += this.method783(var7, var42, this.field1843.field895) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1846 != null) {
                int var43 = this.field1846.method447(arg0);
                int var44 = this.field1842.method447(arg0);
                var40 = var40 * ((this.method783(var10, var44, this.field1846.field895) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1853[var45] != 0) {
                    int var46 = field1856[var45] + var12;
                    if (var46 < arg0) {
                        field1850[var46] += this.method783(field1855[var45], field1854[var45] * var40 >> 15, this.field1859.field895);
                        field1855[var45] += (field1858[var45] * var39 >> 16) + field1852[var45];
                    }
                }
            }
        }
        if (this.field1860 != null) {
            this.field1860.method444();
            this.field1848.method444();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1860.method447(arg0);
                int var18 = this.field1848.method447(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1860.field899 - this.field1860.field896) * var17 >> 8) + this.field1860.field896;
                } else {
                    var19 = ((this.field1860.field899 - this.field1860.field896) * var18 >> 8) + this.field1860.field896;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1850[var16] = 0;
                }
            }
        }
        if (this.field1841 > 0 && this.field1851 > 0) {
            int var20 = (int) ((double) this.field1841 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1850[var21] += field1850[var21 - var20] * this.field1851 / 100;
            }
        }
        if (this.field1839.field2226[0] > 0 || this.field1839.field2226[1] > 0) {
            this.field1861.method444();
            int var22 = this.field1861.method447(arg0 + 1);
            int var23 = this.field1839.method936(0, (float) var22 / 65536.0F);
            int var24 = this.field1839.method936(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1850[var23 + var25] * (long) class178.field2229 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1850[var23 + var25 - var36 - 1] * (long) class178.field2228[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1850[var25 - var37 - 1] * (long) class178.field2228[1][var37] >> 16);
                    }
                    field1850[var25] = var35;
                    var22 = this.field1861.method447(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1850[var23 + var25] * (long) class178.field2229 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1850[var23 + var25 - var33 - 1] * (long) class178.field2228[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1850[var25 - var34 - 1] * (long) class178.field2228[1][var34] >> 16);
                        }
                        field1850[var25] = var32;
                        var22 = this.field1861.method447(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1850[var23 + var25 - var29 - 1] * (long) class178.field2228[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1850[var25 - var30 - 1] * (long) class178.field2228[1][var30] >> 16);
                            }
                            field1850[var25] = var28;
                            this.field1861.method447(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1839.method936(0, (float) var22 / 65536.0F);
                    var24 = this.field1839.method936(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1850[var38] < -32768) {
                field1850[var38] = -32768;
            }
            if (field1850[var38] > 32767) {
                field1850[var38] = 32767;
            }
        }
        return field1850;
    }
}

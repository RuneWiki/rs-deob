import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field1839 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
    private int[] field1836 = new int[5];

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field1840 = 500;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[I")
    private int[] field1851 = new int[5];

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field1848 = 0;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    private int field1849 = 100;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    private int[] field1846 = new int[5];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    private static int[] field1838 = new int[32768];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    private static int[] field1835;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    private static int[] field1837;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[I")
    private static int[] field1852;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
    private static int[] field1850;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[I")
    private static int[] field1853;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[I")
    private static int[] field1856;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[I")
    private static int[] field1858;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lub;")
    private class119 field1857;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Loc;")
    private class87 field1841;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Loc;")
    private class87 field1842;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Loc;")
    private class87 field1843;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Loc;")
    private class87 field1844;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Loc;")
    private class87 field1845;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Loc;")
    private class87 field1847;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Loc;")
    private class87 field1854;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Loc;")
    private class87 field1855;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Loc;")
    private class87 field1859;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1838[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1835 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1835[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1837 = new int[220500];
        field1852 = new int[5];
        field1850 = new int[5];
        field1853 = new int[5];
        field1856 = new int[5];
        field1858 = new int[5];
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 16)
    public static void method615() {
        field1837 = null;
        field1838 = null;
        field1835 = null;
        field1858 = null;
        field1852 = null;
        field1856 = null;
        field1850 = null;
        field1853 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lwd;)V", line = 30)
    public final void method616(class131 arg0) {
        this.field1847 = new class87();
        this.field1847.method708(arg0);
        this.field1855 = new class87();
        this.field1855.method708(arg0);
        int var2 = arg0.method971(true);
        if (var2 != 0) {
            arg0.field3182--;
            this.field1842 = new class87();
            this.field1842.method708(arg0);
            this.field1844 = new class87();
            this.field1844.method708(arg0);
        }
        int var3 = arg0.method971(true);
        if (var3 != 0) {
            arg0.field3182--;
            this.field1845 = new class87();
            this.field1845.method708(arg0);
            this.field1843 = new class87();
            this.field1843.method708(arg0);
        }
        int var4 = arg0.method971(true);
        if (var4 != 0) {
            arg0.field3182--;
            this.field1859 = new class87();
            this.field1859.method708(arg0);
            this.field1841 = new class87();
            this.field1841.method708(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1019(174545128);
            if (var6 == 0) {
                break;
            }
            this.field1846[var5] = var6;
            this.field1836[var5] = arg0.method996(255);
            this.field1851[var5] = arg0.method1019(174545128);
        }
        this.field1839 = arg0.method1019(174545128);
        this.field1849 = arg0.method1019(174545128);
        this.field1840 = arg0.method1001(65280);
        this.field1848 = arg0.method1001(65280);
        this.field1857 = new class119();
        this.field1854 = new class87();
        this.field1857.method921(arg0, this.field1854);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method617(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1837[var3] = 0;
        }
        if (arg1 < 10) {
            return field1837;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1847.method707();
        this.field1855.method707();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1842 != null) {
            this.field1842.method707();
            this.field1844.method707();
            var6 = (int) ((double) (this.field1842.field2214 - this.field1842.field2213) * 32.768D / var4);
            var7 = (int) ((double) this.field1842.field2213 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1845 != null) {
            this.field1845.method707();
            this.field1843.method707();
            var9 = (int) ((double) (this.field1845.field2214 - this.field1845.field2213) * 32.768D / var4);
            var10 = (int) ((double) this.field1845.field2213 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1846[var12] != 0) {
                field1858[var12] = 0;
                field1852[var12] = (int) ((double) this.field1851[var12] * var4);
                field1856[var12] = (this.field1846[var12] << 14) / 100;
                field1850[var12] = (int) ((double) (this.field1847.field2214 - this.field1847.field2213) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1836[var12]) / var4);
                field1853[var12] = (int) ((double) this.field1847.field2213 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field1847.method709(arg0);
            int var41 = this.field1855.method709(arg0);
            if (this.field1842 != null) {
                int var42 = this.field1842.method709(arg0);
                int var43 = this.field1844.method709(arg0);
                var40 += this.method618(var8, var43, this.field1842.field2216) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field1845 != null) {
                int var44 = this.field1845.method709(arg0);
                int var45 = this.field1843.method709(arg0);
                var41 = var41 * ((this.method618(var11, var45, this.field1845.field2216) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1846[var46] != 0) {
                    int var47 = field1852[var46] + var13;
                    if (var47 < arg0) {
                        field1837[var47] += this.method618(field1858[var46], field1856[var46] * var41 >> 15, this.field1847.field2216);
                        field1858[var46] += (field1850[var46] * var40 >> 16) + field1853[var46];
                    }
                }
            }
        }
        if (this.field1859 != null) {
            this.field1859.method707();
            this.field1841.method707();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1859.method709(arg0);
                int var19 = this.field1841.method709(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1859.field2214 - this.field1859.field2213) * var18 >> 8) + this.field1859.field2213;
                } else {
                    var20 = ((this.field1859.field2214 - this.field1859.field2213) * var19 >> 8) + this.field1859.field2213;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1837[var17] = 0;
                }
            }
        }
        if (this.field1839 > 0 && this.field1849 > 0) {
            int var21 = (int) ((double) this.field1839 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1837[var22] += field1837[var22 - var21] * this.field1849 / 100;
            }
        }
        if (this.field1857.field2918[0] > 0 || this.field1857.field2918[1] > 0) {
            this.field1854.method707();
            int var23 = this.field1854.method709(arg0 + 1);
            int var24 = this.field1857.method922(0, (float) var23 / 65536.0F);
            int var25 = this.field1857.method922(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field1837[var24 + var26] * (long) class119.field2922 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field1837[var24 + var26 - var37 - 1] * (long) class119.field2921[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field1837[var26 - var38 - 1] * (long) class119.field2921[1][var38] >> 16);
                    }
                    field1837[var26] = var36;
                    var23 = this.field1854.method709(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field1837[var24 + var26] * (long) class119.field2922 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field1837[var24 + var26 - var34 - 1] * (long) class119.field2921[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field1837[var26 - var35 - 1] * (long) class119.field2921[1][var35] >> 16);
                        }
                        field1837[var26] = var33;
                        var23 = this.field1854.method709(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field1837[var24 + var26 - var30 - 1] * (long) class119.field2921[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field1837[var26 - var31 - 1] * (long) class119.field2921[1][var31] >> 16);
                            }
                            field1837[var26] = var29;
                            this.field1854.method709(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1857.method922(0, (float) var23 / 65536.0F);
                    var25 = this.field1857.method922(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field1837[var39] < -32768) {
                field1837[var39] = -32768;
            }
            if (field1837[var39] > 32767) {
                field1837[var39] = 32767;
            }
        }
        return field1837;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I", line = 418)
    private final int method618(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1835[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1838[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}

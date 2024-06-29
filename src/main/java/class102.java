import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class102 extends class213 {

    @OriginalMember(owner = "client!kc", name = "Ib", descriptor = "I")
    private int field1868 = 0;

    @OriginalMember(owner = "client!kc", name = "Db", descriptor = "B")
    private byte field1863 = 0;

    @OriginalMember(owner = "client!kc", name = "Eb", descriptor = "[I")
    private int[] field1864;

    @OriginalMember(owner = "client!kc", name = "wb", descriptor = "[I")
    private int[] field1856;

    @OriginalMember(owner = "client!kc", name = "Kb", descriptor = "[I")
    private int[] field1870;

    @OriginalMember(owner = "client!kc", name = "Cb", descriptor = "[B")
    private byte[] field1862;

    @OriginalMember(owner = "client!kc", name = "yb", descriptor = "[B")
    private byte[] field1858;

    @OriginalMember(owner = "client!kc", name = "Fb", descriptor = "[I")
    private int[] field1865;

    @OriginalMember(owner = "client!kc", name = "Lb", descriptor = "[I")
    private int[] field1871;

    @OriginalMember(owner = "client!kc", name = "Jb", descriptor = "[I")
    private int[] field1869;

    @OriginalMember(owner = "client!kc", name = "Gb", descriptor = "[S")
    private short[] field1866;

    @OriginalMember(owner = "client!kc", name = "xb", descriptor = "[I")
    private int[] field1857;

    @OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[I")
    private int[] field1861;

    @OriginalMember(owner = "client!kc", name = "Hb", descriptor = "[I")
    private int[] field1867;

    @OriginalMember(owner = "client!kc", name = "zb", descriptor = "[B")
    private byte[] field1859;

    @OriginalMember(owner = "client!kc", name = "Ab", descriptor = "Lkc;")
    private static class102 field1860 = new class102();

    @OriginalMember(owner = "client!kc", name = "Nb", descriptor = "[B")
    private static byte[] field1873 = new byte[1];

    @OriginalMember(owner = "client!kc", name = "Mb", descriptor = "Lkc;")
    private static class102 field1872 = new class102();

    @OriginalMember(owner = "client!kc", name = "Rb", descriptor = "[I")
    private static int[] field1877 = new int[12];

    @OriginalMember(owner = "client!kc", name = "Tb", descriptor = "[I")
    private static int[] field1879 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "Sb", descriptor = "[I")
    private static int[] field1878 = class72.field1393;

    @OriginalMember(owner = "client!kc", name = "Wb", descriptor = "[I")
    private static int[] field1882 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "cc", descriptor = "[Z")
    private static boolean[] field1888 = new boolean[4096];

    @OriginalMember(owner = "client!kc", name = "Pb", descriptor = "[B")
    private static byte[] field1875 = new byte[1];

    @OriginalMember(owner = "client!kc", name = "Vb", descriptor = "[I")
    private static int[] field1881 = new int[10];

    @OriginalMember(owner = "client!kc", name = "Xb", descriptor = "[I")
    private static int[] field1883 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "bc", descriptor = "[I")
    private static int[] field1887 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "Zb", descriptor = "[I")
    private static int[] field1885 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "hc", descriptor = "[I")
    private static int[] field1893 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "fc", descriptor = "[I")
    private static int[] field1891 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "ic", descriptor = "[I")
    private static int[] field1894 = new int[4096];

    @OriginalMember(owner = "client!kc", name = "kc", descriptor = "[I")
    private static int[] field1896 = class72.field1394;

    @OriginalMember(owner = "client!kc", name = "Ub", descriptor = "[[I")
    private static int[][] field1880 = new int[1600][512];

    @OriginalMember(owner = "client!kc", name = "Yb", descriptor = "[I")
    private static int[] field1884 = new int[10];

    @OriginalMember(owner = "client!kc", name = "lc", descriptor = "[I")
    private static int[] field1897 = new int[10];

    @OriginalMember(owner = "client!kc", name = "ec", descriptor = "[I")
    private static int[] field1890 = new int[1600];

    @OriginalMember(owner = "client!kc", name = "gc", descriptor = "[[I")
    private static int[][] field1892 = new int[12][4096];

    @OriginalMember(owner = "client!kc", name = "mc", descriptor = "[I")
    private static int[] field1898 = class72.field1396;

    @OriginalMember(owner = "client!kc", name = "ac", descriptor = "[I")
    private static int[] field1886 = new int[12];

    @OriginalMember(owner = "client!kc", name = "Qb", descriptor = "[I")
    private static int[] field1876 = class72.field1404;

    @OriginalMember(owner = "client!kc", name = "nc", descriptor = "[Z")
    private static boolean[] field1899 = new boolean[4096];

    @OriginalMember(owner = "client!kc", name = "Ob", descriptor = "I")
    private static int field1874;

    @OriginalMember(owner = "client!kc", name = "dc", descriptor = "I")
    private static int field1889;

    @OriginalMember(owner = "client!kc", name = "jc", descriptor = "I")
    private static int field1895;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)I")
    private static final int method621(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()V")
    public static void method622() {
        field1860 = null;
        field1873 = null;
        field1872 = null;
        field1875 = null;
        field1888 = null;
        field1899 = null;
        field1887 = null;
        field1882 = null;
        field1883 = null;
        field1879 = null;
        field1885 = null;
        field1891 = null;
        field1890 = null;
        field1880 = null;
        field1877 = null;
        field1892 = null;
        field1893 = null;
        field1894 = null;
        field1886 = null;
        field1897 = null;
        field1884 = null;
        field1881 = null;
        field1898 = null;
        field1876 = null;
        field1896 = null;
        field1878 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[IIII)V")
    private final void method623(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1889 = 0;
            field1895 = 0;
            field1874 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field4130.length) {
                    int[] var10 = super.field4130[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1889 += super.field4144[var12];
                        field1895 += super.field4146[var12];
                        field1874 += super.field4132[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1889 = field1889 / var7 + arg2;
                field1895 = field1895 / var7 + arg3;
                field1874 = field1874 / var7 + arg4;
            } else {
                field1889 = arg2;
                field1895 = arg3;
                field1874 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field4130.length) {
                    int[] var15 = super.field4130[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field4144[var17] += arg2;
                        super.field4146[var17] += arg3;
                        super.field4132[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field4130.length) {
                    int[] var20 = super.field4130[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field4144[var22] -= field1889;
                        super.field4146[var22] -= field1895;
                        super.field4132[var22] -= field1874;
                        if (arg4 != 0) {
                            int var23 = field1898[arg4];
                            int var24 = field1876[arg4];
                            int var25 = super.field4146[var22] * var23 + super.field4144[var22] * var24 + 32767 >> 16;
                            super.field4146[var22] = super.field4146[var22] * var24 - super.field4144[var22] * var23 + 32767 >> 16;
                            super.field4144[var22] = var25;
                        }
                        if (arg2 != 0) {
                            int var26 = field1898[arg2];
                            int var27 = field1876[arg2];
                            int var28 = super.field4146[var22] * var27 - super.field4132[var22] * var26 + 32767 >> 16;
                            super.field4132[var22] = super.field4146[var22] * var26 + super.field4132[var22] * var27 + 32767 >> 16;
                            super.field4146[var22] = var28;
                        }
                        if (arg3 != 0) {
                            int var29 = field1898[arg3];
                            int var30 = field1876[arg3];
                            int var31 = super.field4144[var22] * var30 + super.field4132[var22] * var29 + 32767 >> 16;
                            super.field4132[var22] = super.field4132[var22] * var30 - super.field4144[var22] * var29 + 32767 >> 16;
                            super.field4144[var22] = var31;
                        }
                        super.field4144[var22] += field1889;
                        super.field4146[var22] += field1895;
                        super.field4132[var22] += field1874;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var32 = 0; var32 < var6; ++var32) {
                int var33 = arg1[var32];
                if (var33 < super.field4130.length) {
                    int[] var34 = super.field4130[var33];
                    for (int var35 = 0; var35 < var34.length; ++var35) {
                        int var36 = var34[var35];
                        super.field4144[var36] -= field1889;
                        super.field4146[var36] -= field1895;
                        super.field4132[var36] -= field1874;
                        super.field4144[var36] = super.field4144[var36] * arg2 / 128;
                        super.field4146[var36] = super.field4146[var36] * arg3 / 128;
                        super.field4132[var36] = super.field4132[var36] * arg4 / 128;
                        super.field4144[var36] += field1889;
                        super.field4146[var36] += field1895;
                        super.field4132[var36] += field1874;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field4133 != null && this.field1858 != null) {
                for (int var37 = 0; var37 < var6; ++var37) {
                    int var38 = arg1[var37];
                    if (var38 < super.field4133.length) {
                        int[] var39 = super.field4133[var38];
                        for (int var40 = 0; var40 < var39.length; ++var40) {
                            int var41 = var39[var40];
                            int var42 = (this.field1858[var41] & 255) + arg2 * 8;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 255) {
                                var42 = 255;
                            }
                            this.field1858[var41] = (byte) var42;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lvf;")
    public final class213 method624(boolean arg0) {
        if (!arg0 && field1875.length < super.field4141) {
            field1875 = new byte[super.field4141 + 100];
        }
        return this.method625(arg0, field1872, field1875);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLkc;[B)Lkc;")
    private final class102 method625(boolean arg0, class102 arg1, byte[] arg2) {
        arg1.field4137 = super.field4137;
        arg1.field4141 = super.field4141;
        arg1.field1868 = this.field1868;
        if (arg1.field4144 == null || arg1.field4144.length < super.field4137) {
            arg1.field4144 = new int[super.field4137 + 100];
            arg1.field4146 = new int[super.field4137 + 100];
            arg1.field4132 = new int[super.field4137 + 100];
        }
        for (int var4 = 0; var4 < super.field4137; ++var4) {
            arg1.field4144[var4] = super.field4144[var4];
            arg1.field4146[var4] = super.field4146[var4];
            arg1.field4132[var4] = super.field4132[var4];
        }
        if (arg0) {
            arg1.field1858 = this.field1858;
        } else {
            arg1.field1858 = arg2;
            if (this.field1858 == null) {
                for (int var5 = 0; var5 < super.field4141; ++var5) {
                    arg1.field1858[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field4141; ++var6) {
                    arg1.field1858[var6] = this.field1858[var6];
                }
            }
        }
        arg1.field1864 = this.field1864;
        arg1.field1856 = this.field1856;
        arg1.field1870 = this.field1870;
        arg1.field1865 = this.field1865;
        arg1.field1871 = this.field1871;
        arg1.field1869 = this.field1869;
        arg1.field1862 = this.field1862;
        arg1.field1859 = this.field1859;
        arg1.field1866 = this.field1866;
        arg1.field1863 = this.field1863;
        arg1.field1857 = this.field1857;
        arg1.field1861 = this.field1861;
        arg1.field1867 = this.field1867;
        arg1.field4130 = super.field4130;
        arg1.field4133 = super.field4133;
        arg1.field4138 = super.field4138;
        arg1.field4143 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method1404();
            int var9 = class72.field1411;
            int var10 = class72.field1398;
            int var11 = field1898[arg0];
            int var12 = field1876[arg0];
            int var13 = field1898[arg1];
            int var14 = field1876[arg1];
            int var15 = field1898[arg2];
            int var16 = field1876[arg2];
            int var17 = field1898[arg3];
            int var18 = field1876[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field4137; ++var20) {
                int var21 = super.field4144[var20];
                int var22 = super.field4146[var20];
                int var23 = super.field4132[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field1883[var20] = var31 - var19;
                field1887[var20] = (var27 << 9) / arg7 + var9;
                field1882[var20] = (var30 << 9) / arg7 + var10;
                if (this.field1868 > 0) {
                    field1879[var20] = var27;
                    field1885[var20] = var30;
                    field1891[var20] = var31;
                }
            }
            this.method634(false, false, 0L, super.field4145, super.field4145 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvf;)Lvf;")
    public final class213 method627(class213 arg0) {
        return new class102(new class102[] { this, (class102) arg0 }, 2);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Le;I)V")
    public final void method628(class41 arg0, int arg1) {
        if (super.field4130 != null) {
            if (arg1 != -1) {
                class136 var3 = arg0.field846[arg1];
                class104 var4 = var3.field2578;
                field1889 = 0;
                field1895 = 0;
                field1874 = 0;
                for (int var5 = 0; var5 < var3.field2572; ++var5) {
                    short var6 = var3.field2576[var5];
                    if (var3.field2569[var5] != -1) {
                        this.method623(0, var4.field1925[var3.field2569[var5]], 0, 0, 0);
                    }
                    this.method623(var4.field1934[var6], var4.field1925[var6], var3.field2568[var5], var3.field2573[var5], var3.field2580[var5]);
                }
                super.field4143 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Lvf;")
    public final class213 method629(boolean arg0) {
        if (!arg0 && field1873.length < super.field4141) {
            field1873 = new byte[super.field4141 + 100];
        }
        return this.method625(arg0, field1860, field1873);
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    private final void method630(int arg0) {
        int var2 = class72.field1411;
        int var3 = class72.field1398;
        int var4 = 0;
        int var5 = this.field1864[arg0];
        int var6 = this.field1856[arg0];
        int var7 = this.field1870[arg0];
        int var8 = field1891[var5];
        int var9 = field1891[var6];
        int var10 = field1891[var7];
        if (this.field1858 == null) {
            class72.field1409 = 0;
        } else {
            class72.field1409 = this.field1858[arg0] & 255;
        }
        if (var8 >= 50) {
            field1897[var4] = field1887[var5];
            field1884[var4] = field1882[var5];
            field1881[var4++] = this.field1865[arg0];
        } else {
            int var11 = field1879[var5];
            int var12 = field1885[var5];
            int var13 = this.field1865[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1878[var10 - var8];
                field1897[var4] = (((field1879[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1869[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1878[var9 - var8];
                field1897[var4] = (((field1879[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1871[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1897[var4] = field1887[var6];
            field1884[var4] = field1882[var6];
            field1881[var4++] = this.field1871[arg0];
        } else {
            int var16 = field1879[var6];
            int var17 = field1885[var6];
            int var18 = this.field1871[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1878[var8 - var9];
                field1897[var4] = (((field1879[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1865[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1878[var10 - var9];
                field1897[var4] = (((field1879[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1869[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1897[var4] = field1887[var7];
            field1884[var4] = field1882[var7];
            field1881[var4++] = this.field1869[arg0];
        } else {
            int var21 = field1879[var7];
            int var22 = field1885[var7];
            int var23 = this.field1869[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1878[var9 - var10];
                field1897[var4] = (((field1879[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1871[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1878[var8 - var10];
                field1897[var4] = (((field1879[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1884[var4] = (((field1885[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1881[var4++] = ((this.field1865[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1897[0];
        int var27 = field1897[1];
        int var28 = field1897[2];
        int var29 = field1884[0];
        int var30 = field1884[1];
        int var31 = field1884[2];
        class72.field1407 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class72.field1402 || var27 > class72.field1402 || var28 > class72.field1402) {
                class72.field1407 = true;
            }
            if (this.field1866 != null && this.field1866[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1859 != null && this.field1859[arg0] != -1) {
                    int var32 = this.field1859[arg0] & 255;
                    var33 = this.field1857[var32];
                    var34 = this.field1861[var32];
                    var35 = this.field1867[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field1869[arg0] == -1) {
                    class72.method439(var29, var30, var31, var26, var27, var28, this.field1865[arg0], this.field1865[arg0], this.field1865[arg0], field1879[var33], field1879[var34], field1879[var35], field1885[var33], field1885[var34], field1885[var35], field1891[var33], field1891[var34], field1891[var35], this.field1866[arg0]);
                } else {
                    class72.method439(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2], field1879[var33], field1879[var34], field1879[var35], field1885[var33], field1885[var34], field1885[var35], field1891[var33], field1891[var34], field1891[var35], this.field1866[arg0]);
                }
            } else if (this.field1869[arg0] == -1) {
                class72.method449(var29, var30, var31, var26, var27, var28, field1896[this.field1865[arg0]]);
            } else {
                class72.method433(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class72.field1402 || var27 > class72.field1402 || var28 > class72.field1402 || field1897[3] < 0 || field1897[3] > class72.field1402) {
                class72.field1407 = true;
            }
            if (this.field1866 == null || this.field1866[arg0] == -1) {
                if (this.field1869[arg0] == -1) {
                    int var41 = field1896[this.field1865[arg0]];
                    class72.method449(var29, var30, var31, var26, var27, var28, var41);
                    class72.method449(var29, var31, field1884[3], var26, var28, field1897[3], var41);
                    return;
                }
                class72.method433(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2]);
                class72.method433(var29, var31, field1884[3], var26, var28, field1897[3], field1881[0], field1881[2], field1881[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field1859 != null && this.field1859[arg0] != -1) {
                int var36 = this.field1859[arg0] & 255;
                var37 = this.field1857[var36];
                var38 = this.field1861[var36];
                var39 = this.field1867[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field1866[arg0];
            if (this.field1869[arg0] == -1) {
                class72.method439(var29, var30, var31, var26, var27, var28, this.field1865[arg0], this.field1865[arg0], this.field1865[arg0], field1879[var37], field1879[var38], field1879[var39], field1885[var37], field1885[var38], field1885[var39], field1891[var37], field1891[var38], field1891[var39], var40);
                class72.method439(var29, var31, field1884[3], var26, var28, field1897[3], this.field1865[arg0], this.field1865[arg0], this.field1865[arg0], field1879[var37], field1879[var38], field1879[var39], field1885[var37], field1885[var38], field1885[var39], field1891[var37], field1891[var38], field1891[var39], var40);
                return;
            }
            class72.method439(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2], field1879[var37], field1879[var38], field1879[var39], field1885[var37], field1885[var38], field1885[var39], field1891[var37], field1891[var38], field1891[var39], var40);
            class72.method439(var29, var31, field1884[3], var26, var28, field1897[3], field1881[0], field1881[2], field1881[3], field1879[var37], field1879[var38], field1879[var39], field1885[var37], field1885[var38], field1885[var39], field1891[var37], field1891[var38], field1891[var39], var40);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
    public final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method1404();
            int var8 = class72.field1411;
            int var9 = class72.field1398;
            int var10 = field1898[arg0];
            int var11 = field1876[arg0];
            int var12 = field1898[arg1];
            int var13 = field1876[arg1];
            int var14 = field1898[arg2];
            int var15 = field1876[arg2];
            int var16 = field1898[arg3];
            int var17 = field1876[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field4137; ++var19) {
                int var20 = super.field4144[var19];
                int var21 = super.field4146[var19];
                int var22 = super.field4132[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field1883[var19] = var30 - var18;
                field1887[var19] = (var26 << 9) / var30 + var8;
                field1882[var19] = (var29 << 9) / var30 + var9;
                if (this.field1868 > 0) {
                    field1879[var19] = var26;
                    field1885[var19] = var29;
                    field1891[var19] = var30;
                }
            }
            this.method634(false, false, 0L, super.field4145, super.field4145 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[IIIIZI)Lvf;")
    public final class213 method633(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1404();
        int var7 = super.field4142 + arg1;
        int var8 = super.field4135 + arg1;
        int var9 = super.field4131 + arg3;
        int var10 = super.field4147 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class102 var15;
                if (arg4) {
                    var15 = new class102();
                    var15.field4137 = super.field4137;
                    var15.field4141 = super.field4141;
                    var15.field1868 = this.field1868;
                    var15.field4144 = super.field4144;
                    var15.field4132 = super.field4132;
                    var15.field1864 = this.field1864;
                    var15.field1856 = this.field1856;
                    var15.field1870 = this.field1870;
                    var15.field1865 = this.field1865;
                    var15.field1871 = this.field1871;
                    var15.field1869 = this.field1869;
                    var15.field1862 = this.field1862;
                    var15.field1858 = this.field1858;
                    var15.field1859 = this.field1859;
                    var15.field1866 = this.field1866;
                    var15.field1863 = this.field1863;
                    var15.field1857 = this.field1857;
                    var15.field1861 = this.field1861;
                    var15.field1867 = this.field1867;
                    var15.field4130 = super.field4130;
                    var15.field4133 = super.field4133;
                    var15.field4138 = super.field4138;
                    var15.field4146 = new int[var15.field4137];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field4137; ++var16) {
                        int var17 = super.field4144[var16] + arg1;
                        int var18 = super.field4132[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field4146[var16] = super.field4146[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field4137; ++var26) {
                        int var27 = (super.field4146[var26] << 16) / super.field758;
                        if (var27 < arg5) {
                            int var28 = super.field4144[var26] + arg1;
                            int var29 = super.field4132[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field4146[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field4146[var26];
                        } else {
                            var15.field4146[var26] = super.field4146[var26];
                        }
                    }
                }
                super.field4143 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZJII)V")
    private final void method634(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field1890[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field4141; ++var8) {
                if (this.field1869[var8] != -2) {
                    int var33 = this.field1864[var8];
                    int var34 = this.field1856[var8];
                    int var35 = this.field1870[var8];
                    int var36 = field1887[var33];
                    int var37 = field1887[var34];
                    int var38 = field1887[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method631(class213.field4148, class213.field4136, field1882[var33], field1882[var34], field1882[var35], var36, var37, var38)) {
                            class213.field4127[class213.field4140++] = arg2;
                            arg1 = false;
                        }
                        if ((field1882[var35] - field1882[var34]) * (var36 - var37) - (field1882[var33] - field1882[var34]) * (var38 - var37) > 0) {
                            field1899[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class72.field1402 && var37 <= class72.field1402 && var38 <= class72.field1402) {
                                field1888[var8] = false;
                            } else {
                                field1888[var8] = true;
                            }
                            int var58 = (field1883[var33] + field1883[var34] + field1883[var35]) / 3 + arg3;
                            field1880[var58][field1890[var58]++] = var8;
                        }
                    } else {
                        int var39 = field1879[var33];
                        int var40 = field1879[var34];
                        int var41 = field1879[var35];
                        int var42 = field1885[var33];
                        int var43 = field1885[var34];
                        int var44 = field1885[var35];
                        int var45 = field1891[var33];
                        int var46 = field1891[var34];
                        int var47 = field1891[var35];
                        int var48 = var39 - var40;
                        int var49 = var41 - var40;
                        int var50 = var42 - var43;
                        int var51 = var44 - var43;
                        int var52 = var45 - var46;
                        int var53 = var47 - var46;
                        int var54 = var50 * var53 - var51 * var52;
                        int var55 = var49 * var52 - var48 * var53;
                        int var56 = var48 * var51 - var49 * var50;
                        if (var46 * var56 + var40 * var54 + var43 * var55 > 0) {
                            field1899[var8] = true;
                            int var57 = (field1883[var33] + field1883[var34] + field1883[var35]) / 3 + arg3;
                            field1880[var57][field1890[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field1862 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field1890[var9];
                    if (var10 > 0) {
                        int[] var11 = field1880[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method635(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field1877[var13] = 0;
                    field1886[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field1890[var14];
                    if (var27 > 0) {
                        int[] var28 = field1880[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field1862[var30];
                            int var32 = field1877[var31]++;
                            field1892[var31][var32] = var30;
                            if (var31 < 10) {
                                field1886[var31] += var14;
                            } else if (var31 == 10) {
                                field1893[var32] = var14;
                            } else {
                                field1894[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field1877[1] > 0 || field1877[2] > 0) {
                    var15 = (field1886[1] + field1886[2]) / (field1877[1] + field1877[2]);
                }
                int var16 = 0;
                if (field1877[3] > 0 || field1877[4] > 0) {
                    var16 = (field1886[3] + field1886[4]) / (field1877[3] + field1877[4]);
                }
                int var17 = 0;
                if (field1877[6] > 0 || field1877[8] > 0) {
                    var17 = (field1886[6] + field1886[8]) / (field1877[6] + field1877[8]);
                }
                int var18 = 0;
                int var19 = field1877[10];
                int[] var20 = field1892[10];
                int[] var21 = field1893;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field1877[11];
                    var20 = field1892[11];
                    var21 = field1894;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method635(var20[var18++]);
                        if (var18 == var19 && field1892[11] != var20) {
                            var18 = 0;
                            var19 = field1877[11];
                            var20 = field1892[11];
                            var21 = field1894;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method635(var20[var18++]);
                        if (var18 == var19 && field1892[11] != var20) {
                            var18 = 0;
                            var19 = field1877[11];
                            var20 = field1892[11];
                            var21 = field1894;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method635(var20[var18++]);
                        if (var18 == var19 && field1892[11] != var20) {
                            var18 = 0;
                            var19 = field1877[11];
                            var20 = field1892[11];
                            var21 = field1894;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field1877[var23];
                    int[] var25 = field1892[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method635(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method635(var20[var18++]);
                    if (var18 == var19 && field1892[11] != var20) {
                        var18 = 0;
                        var20 = field1892[11];
                        var19 = field1877[11];
                        var21 = field1894;
                    }
                    if (var18 < var19) {
                        var22 = var21[var18];
                    } else {
                        var22 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
    private final void method635(int arg0) {
        if (field1899[arg0]) {
            this.method630(arg0);
        } else {
            int var2 = this.field1864[arg0];
            int var3 = this.field1856[arg0];
            int var4 = this.field1870[arg0];
            class72.field1407 = field1888[arg0];
            if (this.field1858 == null) {
                class72.field1409 = 0;
            } else {
                class72.field1409 = this.field1858[arg0] & 255;
            }
            if (this.field1866 != null && this.field1866[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field1859 != null && this.field1859[arg0] != -1) {
                    int var5 = this.field1859[arg0] & 255;
                    var6 = this.field1857[var5];
                    var7 = this.field1861[var5];
                    var8 = this.field1867[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field1869[arg0] == -1) {
                    class72.method439(field1882[var2], field1882[var3], field1882[var4], field1887[var2], field1887[var3], field1887[var4], this.field1865[arg0], this.field1865[arg0], this.field1865[arg0], field1879[var6], field1879[var7], field1879[var8], field1885[var6], field1885[var7], field1885[var8], field1891[var6], field1891[var7], field1891[var8], this.field1866[arg0]);
                } else {
                    class72.method439(field1882[var2], field1882[var3], field1882[var4], field1887[var2], field1887[var3], field1887[var4], this.field1865[arg0], this.field1871[arg0], this.field1869[arg0], field1879[var6], field1879[var7], field1879[var8], field1885[var6], field1885[var7], field1885[var8], field1891[var6], field1891[var7], field1891[var8], this.field1866[arg0]);
                }
            } else if (this.field1869[arg0] == -1) {
                class72.method449(field1882[var2], field1882[var3], field1882[var4], field1887[var2], field1887[var3], field1887[var4], field1896[this.field1865[arg0]]);
            } else {
                class72.method433(field1882[var2], field1882[var3], field1882[var4], field1887[var2], field1887[var3], field1887[var4], this.field1865[arg0], this.field1871[arg0], this.field1869[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)I")
    private static final int method636(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field4143) {
            this.method1404();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field4139 * arg1 + super.field4128 * arg2 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field4128 * arg2 + super.field758 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field4128 + var15 << 9;
                if (var16 / var13 > class72.field1408) {
                    int var17 = var15 - super.field4128 << 9;
                    if (var17 / var13 < class72.field1392) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field4139 * arg2 + super.field4128 * arg1 >> 16) + var18 << 9;
                        if (var19 / var13 > class72.field1410) {
                            int var20 = (-super.field4128 * arg1 + super.field758 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class72.field1403) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field1868 > 0;
                                int var24 = class72.field1411;
                                int var25 = class72.field1398;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field1898[arg0];
                                    var27 = field1876[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class213.field4149 && var14 > 0) {
                                    int var29;
                                    int var30;
                                    if (var15 > 0) {
                                        var29 = var17 / var13;
                                        var30 = var16 / var14;
                                    } else {
                                        var29 = var17 / var14;
                                        var30 = var16 / var13;
                                    }
                                    int var31;
                                    int var32;
                                    if (var18 > 0) {
                                        var31 = var20 / var13;
                                        var32 = var19 / var14;
                                    } else {
                                        var31 = var20 / var14;
                                        var32 = var19 / var13;
                                    }
                                    int var33 = class213.field4148 - class72.field1411;
                                    int var34 = class213.field4136 - class72.field1398;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field4142, super.field4135, super.field4142, super.field4135, super.field4142, super.field4135, super.field4142, super.field4135 };
                                        int[] var40 = new int[] { super.field4131, super.field4131, super.field4147, super.field4147, super.field4131, super.field4131, super.field4147, super.field4147 };
                                        int[] var41 = new int[] { super.field758, super.field758, super.field758, super.field758, super.field4139, super.field4139, super.field4139, super.field4139 };
                                        for (int var42 = 0; var42 < 8; ++var42) {
                                            int var43 = var39[var42];
                                            int var44 = var41[var42];
                                            int var45 = var40[var42];
                                            if (arg0 != 0) {
                                                int var46 = var26 * var45 + var27 * var43 >> 16;
                                                var45 = var27 * var45 - var26 * var43 >> 16;
                                                var43 = var46;
                                            }
                                            int var47 = arg5 + var43;
                                            int var48 = arg6 + var44;
                                            int var49 = arg7 + var45;
                                            int var50 = arg3 * var49 + arg4 * var47 >> 16;
                                            int var51 = arg4 * var49 - arg3 * var47 >> 16;
                                            int var53 = arg2 * var48 - arg1 * var51 >> 16;
                                            int var54 = arg1 * var48 + arg2 * var51 >> 16;
                                            if (var54 > 0) {
                                                int var56 = (var50 << 9) / var54;
                                                int var57 = (var53 << 9) / var54;
                                                if (var56 < var35) {
                                                    var35 = var56;
                                                }
                                                if (var56 > var36) {
                                                    var36 = var56;
                                                }
                                                if (var57 < var37) {
                                                    var37 = var57;
                                                }
                                                if (var57 > var38) {
                                                    var38 = var57;
                                                }
                                            }
                                        }
                                        if (var33 >= var35 && var33 <= var36 && var34 >= var37 && var34 <= var38) {
                                            if (super.field4138) {
                                                class213.field4127[class213.field4140++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field4137; ++var58) {
                                    int var59 = super.field4144[var58];
                                    int var60 = super.field4146[var58];
                                    int var61 = super.field4132[var58];
                                    if (arg0 != 0) {
                                        int var62 = var26 * var61 + var27 * var59 >> 16;
                                        var61 = var27 * var61 - var26 * var59 >> 16;
                                        var59 = var62;
                                    }
                                    int var63 = arg5 + var59;
                                    int var64 = arg6 + var60;
                                    int var65 = arg7 + var61;
                                    int var66 = arg3 * var65 + arg4 * var63 >> 16;
                                    int var67 = arg4 * var65 - arg3 * var63 >> 16;
                                    int var69 = arg2 * var64 - arg1 * var67 >> 16;
                                    int var70 = arg1 * var64 + arg2 * var67 >> 16;
                                    field1883[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field1887[var58] = (var66 << 9) / var70 + var24;
                                        field1882[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field1887[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field1879[var58] = var66;
                                        field1885[var58] = var69;
                                        field1891[var58] = var70;
                                    }
                                }
                                try {
                                    this.method634(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Le;ILe;I[I)V")
    public final void method637(class41 arg0, int arg1, class41 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class136 var6 = arg0.field846[arg1];
                class136 var7 = arg2.field846[arg3];
                class104 var8 = var6.field2578;
                field1889 = 0;
                field1895 = 0;
                field1874 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2572; ++var11) {
                    short var16 = var6.field2576[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field1934[var16] == 0) {
                        if (var6.field2569[var11] != -1) {
                            this.method623(0, var8.field1925[var6.field2569[var11]], 0, 0, 0);
                        }
                        this.method623(var8.field1934[var16], var8.field1925[var16], var6.field2568[var11], var6.field2573[var11], var6.field2580[var11]);
                    }
                }
                field1889 = 0;
                field1895 = 0;
                field1874 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2572; ++var14) {
                    short var15 = var7.field2576[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field1934[var15] == 0) {
                        if (var7.field2569[var14] != -1) {
                            this.method623(0, var8.field1925[var7.field2569[var14]], 0, 0, 0);
                        }
                        this.method623(var8.field1934[var15], var8.field1925[var15], var7.field2568[var14], var7.field2573[var14], var7.field2580[var14]);
                    }
                }
                super.field4143 = false;
            } else {
                this.method628(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class102() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lob;IIIII)V")
    public class102(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method885();
        arg0.method880();
        super.field4137 = arg0.field2623;
        super.field4144 = arg0.field2663;
        super.field4146 = arg0.field2661;
        super.field4132 = arg0.field2668;
        super.field4141 = arg0.field2636;
        this.field1864 = arg0.field2656;
        this.field1856 = arg0.field2660;
        this.field1870 = arg0.field2666;
        this.field1862 = arg0.field2653;
        this.field1858 = arg0.field2630;
        this.field1863 = arg0.field2646;
        super.field4130 = arg0.field2622;
        super.field4133 = arg0.field2639;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field1865 = new int[super.field4141];
        this.field1871 = new int[super.field4141];
        this.field1869 = new int[super.field4141];
        if (arg0.field2625 != null) {
            this.field1866 = new short[super.field4141];
            for (int var9 = 0; var9 < super.field4141; ++var9) {
                short var10 = arg0.field2625[var9];
                if (var10 != -1 && class72.field1400.method16(-22454, var10)) {
                    this.field1866[var9] = var10;
                } else {
                    this.field1866[var9] = -1;
                }
            }
        } else {
            this.field1866 = null;
        }
        if (arg0.field2627 > 0 && arg0.field2665 != null) {
            int[] var11 = new int[arg0.field2627];
            for (int var12 = 0; var12 < super.field4141; ++var12) {
                if (arg0.field2665[var12] != -1) {
                    ++var11[arg0.field2665[var12] & 255];
                }
            }
            this.field1868 = 0;
            for (int var13 = 0; var13 < arg0.field2627; ++var13) {
                if (var11[var13] > 0 && arg0.field2647[var13] == 0) {
                    ++this.field1868;
                }
            }
            this.field1857 = new int[this.field1868];
            this.field1861 = new int[this.field1868];
            this.field1867 = new int[this.field1868];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2627; ++var15) {
                if (var11[var15] > 0 && arg0.field2647[var15] == 0) {
                    this.field1857[var14] = arg0.field2655[var15] & 65535;
                    this.field1861[var14] = arg0.field2631[var15] & 65535;
                    this.field1867[var14] = arg0.field2664[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field1859 = new byte[super.field4141];
            for (int var16 = 0; var16 < super.field4141; ++var16) {
                if (arg0.field2665[var16] != -1) {
                    this.field1859[var16] = (byte) var11[arg0.field2665[var16] & 255];
                    if (this.field1859[var16] == -1 && this.field1866 != null) {
                        this.field1866[var16] = -1;
                    }
                } else {
                    this.field1859[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field4141; ++var17) {
            byte var18;
            if (arg0.field2643 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2643[var17];
            }
            byte var19;
            if (arg0.field2630 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2630[var17];
            }
            short var20;
            if (this.field1866 == null) {
                var20 = -1;
            } else {
                var20 = this.field1866[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class198 var28 = arg0.field2645[var17];
                        int var29 = (var28.field3858 * arg5 + var28.field3856 * arg3 + var28.field3855 * arg4) / (var8 / 2 + var8) + arg1;
                        this.field1865[var17] = method621(arg0.field2657[var17] & 65535, var29);
                        this.field1869[var17] = -1;
                    } else if (var18 == 3) {
                        this.field1865[var17] = 128;
                        this.field1869[var17] = -1;
                    } else {
                        this.field1869[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2657[var17] & 65535;
                    class24 var22;
                    if (arg0.field2629 != null && arg0.field2629[this.field1864[var17]] != null) {
                        var22 = arg0.field2629[this.field1864[var17]];
                    } else {
                        var22 = arg0.field2634[this.field1864[var17]];
                    }
                    int var23 = (var22.field513 * arg5 + var22.field522 * arg4 + var22.field516 * arg3) / (var22.field519 * var8) + arg1;
                    this.field1865[var17] = method621(var21, var23);
                    class24 var24;
                    if (arg0.field2629 != null && arg0.field2629[this.field1856[var17]] != null) {
                        var24 = arg0.field2629[this.field1856[var17]];
                    } else {
                        var24 = arg0.field2634[this.field1856[var17]];
                    }
                    int var25 = (var24.field513 * arg5 + var24.field522 * arg4 + var24.field516 * arg3) / (var24.field519 * var8) + arg1;
                    this.field1871[var17] = method621(var21, var25);
                    class24 var26;
                    if (arg0.field2629 != null && arg0.field2629[this.field1870[var17]] != null) {
                        var26 = arg0.field2629[this.field1870[var17]];
                    } else {
                        var26 = arg0.field2634[this.field1870[var17]];
                    }
                    int var27 = (var26.field513 * arg5 + var26.field522 * arg4 + var26.field516 * arg3) / (var26.field519 * var8) + arg1;
                    this.field1869[var17] = method621(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class198 var36 = arg0.field2645[var17];
                    int var37 = (var36.field3858 * arg5 + var36.field3856 * arg3 + var36.field3855 * arg4) / (var8 / 2 + var8) + arg1;
                    this.field1865[var17] = method636(var37);
                    this.field1869[var17] = -1;
                } else {
                    this.field1869[var17] = -2;
                }
            } else {
                class24 var30;
                if (arg0.field2629 != null && arg0.field2629[this.field1864[var17]] != null) {
                    var30 = arg0.field2629[this.field1864[var17]];
                } else {
                    var30 = arg0.field2634[this.field1864[var17]];
                }
                int var31 = (var30.field513 * arg5 + var30.field522 * arg4 + var30.field516 * arg3) / (var30.field519 * var8) + arg1;
                this.field1865[var17] = method636(var31);
                class24 var32;
                if (arg0.field2629 != null && arg0.field2629[this.field1856[var17]] != null) {
                    var32 = arg0.field2629[this.field1856[var17]];
                } else {
                    var32 = arg0.field2634[this.field1856[var17]];
                }
                int var33 = (var32.field513 * arg5 + var32.field522 * arg4 + var32.field516 * arg3) / (var32.field519 * var8) + arg1;
                this.field1871[var17] = method636(var33);
                class24 var34;
                if (arg0.field2629 != null && arg0.field2629[this.field1870[var17]] != null) {
                    var34 = arg0.field2629[this.field1870[var17]];
                } else {
                    var34 = arg0.field2634[this.field1870[var17]];
                }
                int var35 = (var34.field513 * arg5 + var34.field522 * arg4 + var34.field516 * arg3) / (var34.field519 * var8) + arg1;
                this.field1869[var17] = method636(var35);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([Lkc;I)V")
    private class102(class102[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field4137 = 0;
        super.field4141 = 0;
        this.field1868 = 0;
        this.field1863 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class102 var13 = arg0[var7];
            if (var13 != null) {
                super.field4137 += var13.field4137;
                super.field4141 += var13.field4141;
                this.field1868 += var13.field1868;
                if (var13.field1862 != null) {
                    var3 = true;
                } else {
                    if (this.field1863 == -1) {
                        this.field1863 = var13.field1863;
                    }
                    if (this.field1863 != var13.field1863) {
                        var3 = true;
                    }
                }
                var4 |= var13.field1858 != null;
                var5 |= var13.field1866 != null;
                var6 |= var13.field1859 != null;
            }
        }
        super.field4144 = new int[super.field4137];
        super.field4146 = new int[super.field4137];
        super.field4132 = new int[super.field4137];
        this.field1864 = new int[super.field4141];
        this.field1856 = new int[super.field4141];
        this.field1870 = new int[super.field4141];
        this.field1865 = new int[super.field4141];
        this.field1871 = new int[super.field4141];
        this.field1869 = new int[super.field4141];
        if (var3) {
            this.field1862 = new byte[super.field4141];
        }
        if (var4) {
            this.field1858 = new byte[super.field4141];
        }
        if (var5) {
            this.field1866 = new short[super.field4141];
        }
        if (var6) {
            this.field1859 = new byte[super.field4141];
        }
        if (this.field1868 > 0) {
            this.field1857 = new int[this.field1868];
            this.field1861 = new int[this.field1868];
            this.field1867 = new int[this.field1868];
        }
        super.field4137 = 0;
        super.field4141 = 0;
        this.field1868 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class102 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field4141; ++var10) {
                    this.field1864[super.field4141] = var9.field1864[var10] + super.field4137;
                    this.field1856[super.field4141] = var9.field1856[var10] + super.field4137;
                    this.field1870[super.field4141] = var9.field1870[var10] + super.field4137;
                    this.field1865[super.field4141] = var9.field1865[var10];
                    this.field1871[super.field4141] = var9.field1871[var10];
                    this.field1869[super.field4141] = var9.field1869[var10];
                    if (var3) {
                        if (var9.field1862 != null) {
                            this.field1862[super.field4141] = var9.field1862[var10];
                        } else {
                            this.field1862[super.field4141] = var9.field1863;
                        }
                    }
                    if (var4 && var9.field1858 != null) {
                        this.field1858[super.field4141] = var9.field1858[var10];
                    }
                    if (var5) {
                        if (var9.field1866 != null) {
                            this.field1866[super.field4141] = var9.field1866[var10];
                        } else {
                            this.field1866[super.field4141] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field1859 != null && var9.field1859[var10] != -1) {
                            this.field1859[super.field4141] = (byte) (var9.field1859[var10] + this.field1868);
                        } else {
                            this.field1859[super.field4141] = -1;
                        }
                    }
                    ++super.field4141;
                }
                for (int var11 = 0; var11 < var9.field1868; ++var11) {
                    this.field1857[this.field1868] = var9.field1857[var11] + super.field4137;
                    this.field1861[this.field1868] = var9.field1861[var11] + super.field4137;
                    this.field1867[this.field1868] = var9.field1867[var11] + super.field4137;
                    ++this.field1868;
                }
                for (int var12 = 0; var12 < var9.field4137; ++var12) {
                    super.field4144[super.field4137] = var9.field4144[var12];
                    super.field4146[super.field4137] = var9.field4146[var12];
                    super.field4132[super.field4137] = var9.field4132[var12];
                    ++super.field4137;
                }
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class143 extends class144 {

    @OriginalMember(owner = "client!su", name = "x", descriptor = "I")
    private int field1852 = 0;

    @OriginalMember(owner = "client!su", name = "P", descriptor = "I")
    private int field1870 = -32768;

    @OriginalMember(owner = "client!su", name = "ib", descriptor = "I")
    private int field1889 = -1;

    @OriginalMember(owner = "client!su", name = "R", descriptor = "I")
    private int field1872 = 0;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "Z")
    private boolean field1855 = false;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "Z")
    private boolean field1854;

    @OriginalMember(owner = "client!su", name = "ab", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!su", name = "O", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!su", name = "ob", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!su", name = "mb", descriptor = "I")
    private int field1893;

    @OriginalMember(owner = "client!su", name = "kb", descriptor = "I")
    private int field1891;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!su", name = "S", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!su", name = "X", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "Leb;")
    private class449 field1851;

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!su", name = "bb", descriptor = "[I")
    public static int[] field1882 = new int[4];

    @OriginalMember(owner = "client!su", name = "W", descriptor = "[Lmk;")
    public static class40[] field1877 = new class40[4];

    @OriginalMember(owner = "client!su", name = "y", descriptor = "D")
    private double field1853;

    @OriginalMember(owner = "client!su", name = "D", descriptor = "D")
    private double field1858;

    @OriginalMember(owner = "client!su", name = "G", descriptor = "D")
    private double field1861;

    @OriginalMember(owner = "client!su", name = "H", descriptor = "D")
    private double field1862;

    @OriginalMember(owner = "client!su", name = "Y", descriptor = "D")
    private double field1879;

    @OriginalMember(owner = "client!su", name = "Z", descriptor = "D")
    private double field1880;

    @OriginalMember(owner = "client!su", name = "eb", descriptor = "D")
    private double field1885;

    @OriginalMember(owner = "client!su", name = "fb", descriptor = "D")
    private double field1886;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!su", name = "C", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!su", name = "E", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!su", name = "F", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!su", name = "J", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!su", name = "N", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!su", name = "Q", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!su", name = "T", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!su", name = "U", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!su", name = "V", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!su", name = "cb", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!su", name = "db", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!su", name = "gb", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!su", name = "jb", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!su", name = "lb", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!su", name = "nb", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!su", name = "I", descriptor = "Llm;")
    private class351 field1863;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static final void method887(byte arg0) {
        if (arg0 >= 87) {
            ++field1857;
            class61.field763 = 0;
            class479.field6682 = 0;
            class414.field5849 = 0;
            class167.field2435 = 0;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        ++field1876;
        if (arg0 != 102) {
            this.method893(-42);
        }
        return false;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
    public final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= 30) {
            if (!this.field1855) {
                double var6 = (double) (-super.field1896 + arg3);
                double var8 = (double) (-super.field1899 + arg4);
                double var10 = Math.sqrt(var6 * var6 + var8 * var8);
                this.field1879 = (double) this.field1891 * var8 / var10 + (double) super.field1899;
                this.field1886 = (double) this.field1891 * var6 / var10 + (double) super.field1896;
                if (this.field1854) {
                    this.field1880 = (double) (class488.method2817((int) this.field1886, true, (int) this.field1879, super.field1904) - this.field1895);
                } else {
                    this.field1880 = (double) super.field1912;
                }
            }
            ++field1894;
            double var12 = (double) (this.field1878 + 1 + -arg1);
            this.field1858 = ((double) arg3 + -this.field1886) / var12;
            this.field1853 = ((double) arg4 + -this.field1879) / var12;
            this.field1862 = Math.sqrt(this.field1858 * this.field1858 + this.field1853 * this.field1853);
            if (~this.field1881 == 0) {
                this.field1861 = ((double) arg2 + -this.field1880) / var12;
            } else {
                if (!this.field1855) {
                    this.field1861 = -this.field1862 * Math.tan((double) this.field1881 * 0.02454369D);
                }
                this.field1885 = ((double) arg2 - this.field1880 + -(this.field1861 * var12)) * 2.0D / (var12 * var12);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
    public final void method889(byte arg0) {
        if (arg0 <= -85) {
            ++field1884;
            if (this.field1863 != null) {
                this.field1863.method2085();
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BZIIII)V")
    public static final void method890(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1875;
        if (class268.field3910 == null) {
            class385.field5414.method1794(arg4, arg2, -16777216, arg5, 98, arg3);
        } else if (class246.field3587.field1896 >= 0 && class43.field494 * 128 > class246.field3587.field1896 && ~class246.field3587.field1899 <= -1 && ~class246.field3587.field1899 > ~(class500.field7068 * 128)) {
            ++class402.field5649;
            if (class246.field3587 != null && class246.field3587.field1896 + 64 + -(class246.field3587.method125((byte) -70) * 64) >> 7 == class243.field3527 && class246.field3587.field1899 - 64 * (-1 + class246.field3587.method125((byte) -100)) >> 7 == class282.field4153) {
                class282.field4153 = -1;
                class243.field3527 = -1;
                class264.method1679(false);
            }
            class260.method1665(0);
            if (!arg1) {
                class266.method1685((byte) 52);
            }
            class368.method2173(28199);
            class307.method1862(arg5, arg4, true, false, arg3, arg2);
            int var6 = class325.field4748;
            int var7 = class426.field5985;
            int var8 = class528.field7757;
            int var9 = class211.field3056;
            if (class504.field7461 != 1) {
                if (class504.field7461 != 4) {
                    if (~class504.field7461 == -6) {
                        class368.method2171((byte) -66, var6);
                    }
                } else {
                    int var10 = (int) class327.field4768;
                    if (~var10 > ~(class364.field5209 >> 8)) {
                        var10 = class364.field5209 >> 8;
                    }
                    if (class345.field5006[4] && class262.field3862[4] + 128 > var10) {
                        var10 = class262.field3862[4] + 128;
                    }
                    int var11 = (int) class153.field2204 & 16383;
                    class218.method1352(class220.field3175, class488.method2817(class360.field5147, true, class168.field2451, class320.field4627) - 50, (var10 >> 3) * 3 + 600 << 0, class267.field3903, 65535, var10, var6, var11);
                }
            } else {
                int var12 = (int) class327.field4768;
                if (class364.field5209 >> 8 > var12) {
                    var12 = class364.field5209 >> 8;
                }
                if (class345.field5006[4] && var12 < class262.field3862[4] - -128) {
                    var12 = class262.field3862[4] + 128;
                }
                int var13 = 16383 & (int) class153.field2204 + class205.field2966;
                class218.method1352(class220.field3175, -50 + class488.method2817(class246.field3587.field1896, true, class246.field3587.field1899, class320.field4627), (var12 >> 3) * 3 + 600 << 0, class267.field3903, 65535, var12, var6, var13);
            }
            int var14 = class478.field6654;
            int var15 = class51.field619;
            int var16 = class515.field7596;
            int var17 = class41.field450;
            int var18 = class8.field122;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class345.field5006[var19]) {
                    int var22 = (int) (Math.random() * (double) (class471.field6568[var19] * 2 - -1) - (double) class471.field6568[var19] + Math.sin((double) class176.field2530[var19] / 100.0D * (double) class129.field1722[var19]) * (double) class262.field3862[var19]);
                    if (var19 == 2) {
                        class515.field7596 += var22;
                    }
                    if (~var19 == -5) {
                        class41.field450 += var22;
                        if (~class41.field450 > -1025) {
                            class41.field450 = 1024;
                        } else if (class41.field450 > 3072) {
                            class41.field450 = 3072;
                        }
                    }
                    if (var19 == 1) {
                        class51.field619 += var22;
                    }
                    if (var19 == 3) {
                        class8.field122 = 16383 & class8.field122 + var22;
                    }
                    if (~var19 == -1) {
                        class478.field6654 += var22;
                    }
                }
            }
            if (class478.field6654 < 0) {
                class478.field6654 = 0;
            }
            if (~class478.field6654 < ~((class6.field109 << 7) - 1)) {
                class478.field6654 = (class6.field109 << 7) + -1;
            }
            if (class515.field7596 < 0) {
                class515.field7596 = 0;
            }
            if (~((class272.field4032 << 7) + -1) > ~class515.field7596) {
                class515.field7596 = (class272.field4032 << 7) + -1;
            }
            class284.method1762((byte) 122);
            class32.method194(true);
            class385.field5414.method301(var7, var8, var7 + var9, var6 + var8);
            class385.field5414.method341();
            int var20 = class498.field7058;
            if (class74.field903 == null) {
                class385.field5414.method347(var20);
            } else {
                class74.field903.method2479(var20, class385.field5414, var6, class52.field630 << 3, arg0 ^ 112, var8, class8.field122, var7, var9, class41.field450);
            }
            class322.method1949(arg0 + 23);
            class375.field5329.method822(class478.field6654, class51.field619, class515.field7596, -class41.field450 & 16383, 16383 & -class8.field122, -class194.field2743 & 16383);
            class385.field5414.method367(class375.field5329);
            class385.field5414.method390(var7 - -(var9 / 2), var6 / 2 + var8, class409.field5789 << 1, class409.field5789 << 1);
            class276.method1737(class409.field5789 << 1, var6 / 2 + var8, class409.field5789 << 1, true, var9 / 2 + var7);
            class232.method1430(class51.field619, class478.field6654, -class194.field2743 & 16383, 16383 & -class41.field450, class515.field7596, -class8.field122 & 16383, (byte) 107);
            byte var21 = ~class4.field81.method1786(-95, class405.field5737) == -3 ? (byte) class402.field5649 : 1;
            class107.method724(class385.field5414, class390.field5481, class330.field4817, class375.field5329, class478.field6654, class51.field619, class515.field7596, class453.field6348, class405.field5736, class14.field188, class427.field6022, class542.field7924, class63.field792, class246.field3587.field1904 + 1, var21, class246.field3587.field1896 >> 7, class246.field3587.field1899 >> 7, !class4.field81.field1447);
            class322.method1949(arg0 + 23);
            if (class488.field6832 == 9) {
                class215.method1344(256, var6, 256, var8, var9, var7, -105);
                class8.method50(var8, var7, 256, var9, arg0 + 16776969, var6, 256);
                class256.method1647(256, var9, var7, var8, 0, 256, var6);
                class169.method1064(-61, var7, var9, var6, var8);
            }
            class275.method1730();
            class478.field6654 = var14;
            if (arg0 != -9) {
                field1867 = -40;
            }
            class51.field619 = var15;
            class515.field7596 = var16;
            class41.field450 = var17;
            class8.field122 = var18;
            if (class172.field2492 && class15.field192.method1159(20) == 0) {
                class172.field2492 = false;
            }
            if (class172.field2492) {
                class385.field5414.method1794(var9, var8, -16777216, var6, 100, var7);
                class149.method930(false, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 95), (byte) 55);
            }
        } else {
            class385.field5414.method1794(arg4, arg2, -16777216, arg5, 116, arg3);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lza;BI)Le;")
    private final class377 method891(class290 arg0, byte arg1, int arg2) {
        ++field1883;
        class508 var4 = class125.field1688.method2457(this.field1893, (byte) 87);
        int var5 = 75 / ((arg1 - -88) / 38);
        return var4.method3033(this.field1852, (byte) -10, arg0, this.field1872, arg2, this.field1889, class62.field784);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Le;Lza;Z)V")
    private final void method892(class377 arg0, class290 arg1, boolean arg2) {
        ++field1874;
        if (!arg2) {
            this.field1878 = -89;
        }
        class462[] var4 = arg0.method1593();
        class63[] var5 = arg0.method1579();
        if ((this.field1863 == null || this.field1863.field5038) && (var4 != null || var5 != null)) {
            this.field1863 = new class351(class390.field5481);
        }
        if (this.field1863 != null) {
            this.field1863.method2076(arg1, (long) class390.field5481, var4, var5, false);
            this.field1863.method2081(super.field1904, super.field1911, super.field1898, super.field1902, super.field1907);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field1864;
        class377 var3 = this.method891(arg0, (byte) -127, arg1);
        if (var3 != null) {
            class125 var4 = arg0.method368();
            var4.method831(this.field1888);
            var4.method823(this.field1892);
            var4.method824((int) this.field1886, (int) this.field1880, (int) this.field1879);
            this.field1870 = var3.method1568();
            this.method892(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
    public final void method893(int arg0) {
        super.field1911 = super.field1898 = (short) ((int) (this.field1886 / 128.0D));
        ++field1871;
        if (arg0 == 32107) {
            super.field1902 = super.field1907 = (short) ((int) (this.field1879 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(B)I")
    public final int method127(byte arg0) {
        ++field1868;
        if (arg0 != 86) {
            this.method896(-122, (byte) 91);
        }
        return this.field1870;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        ++field1850;
        if (arg0 <= -71) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field1859;
        return arg0 != 3 ? false : false;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class488.method2817(arg2, true, arg3, arg1) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1854 = arg11;
        this.field1881 = arg7;
        this.field1869 = arg5;
        this.field1895 = arg4;
        this.field1893 = arg0;
        this.field1855 = false;
        this.field1891 = arg8;
        this.field1866 = arg10;
        this.field1873 = arg9;
        this.field1878 = arg6;
        int var13 = class125.field1688.method2457(this.field1893, (byte) 87).field7504;
        if (~var13 == 0) {
            this.field1851 = null;
        } else {
            this.field1851 = class62.field784.method2566(var13, -19);
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        ++field1887;
        if (arg0 != 0) {
            this.method118((byte) -46);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
    public static final void method894(int arg0, int arg1, int arg2) {
        ++field1856;
        class45 var3 = class354.method2094(arg1, (byte) -112, 15);
        var3.method260(9188);
        var3.field504 = arg0;
        var3.field516 = arg2;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(Z)V")
    public static void method895(boolean arg0) {
        field1877 = null;
        field1882 = null;
        if (!arg0) {
            field1877 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field1890;
        class377 var3 = this.method891(arg0, (byte) -127, 2048);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method368();
            if (arg1 > -86) {
                this.field1851 = null;
            }
            var4.method831(this.field1888);
            var4.method823(this.field1892);
            var4.method824((int) this.field1886, (int) this.field1880, (int) this.field1879);
            if (this.field1863 != null) {
                class324 var5 = this.field1863.method2084();
                arg0.method345(var3, var5, var4, (class122) null, 0);
            } else {
                var3.method1566(var4, (class122) null, 0);
            }
            this.field1870 = var3.method1568();
            this.method892(var3, arg0, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1865;
        if (this.field1863 != null) {
            this.field1863.method2085();
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
    public final void method896(int arg0, byte arg1) {
        this.field1855 = true;
        this.field1879 += (double) arg0 * this.field1853;
        ++field1860;
        this.field1886 += (double) arg0 * this.field1858;
        if (!this.field1854) {
            if (~this.field1881 != 0) {
                this.field1880 += this.field1885 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1861;
                this.field1861 += (double) arg0 * this.field1885;
            } else {
                this.field1880 += (double) arg0 * this.field1861;
            }
        } else {
            this.field1880 = (double) (class488.method2817((int) this.field1886, true, (int) this.field1879, super.field1904) - this.field1895);
        }
        this.field1892 = 8192 + (int) (2607.5945876176133D * Math.atan2(this.field1858, this.field1853)) & 16383;
        if (arg1 == 84) {
            this.field1888 = (int) (Math.atan2(this.field1861, this.field1862) * 2607.5945876176133D) & 16383;
            if (this.field1851 != null) {
                this.field1852 += arg0;
                while (true) {
                    do {
                        do {
                            if (this.field1852 <= this.field1851.field6258[this.field1872]) {
                                return;
                            }
                            this.field1852 -= this.field1851.field6258[this.field1872];
                            ++this.field1872;
                            if (~this.field1851.field6276.length >= ~this.field1872) {
                                this.field1872 -= this.field1851.field6264;
                                if (~this.field1872 > -1 || ~this.field1872 <= ~this.field1851.field6276.length) {
                                    this.field1872 = 0;
                                }
                            }
                            this.field1889 = this.field1872 - -1;
                        } while (this.field1851.field6276.length > this.field1889);
                        this.field1889 -= this.field1851.field6264;
                    } while (this.field1889 >= 0 && ~this.field1889 > ~this.field1851.field6276.length);
                    this.field1889 = -1;
                }
            }
        }
    }
}

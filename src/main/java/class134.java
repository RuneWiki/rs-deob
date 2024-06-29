import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class134 extends class137 {

    @OriginalMember(owner = "client!ic", name = "Qb", descriptor = "I")
    public int field1910 = 0;

    @OriginalMember(owner = "client!ic", name = "Pb", descriptor = "I")
    public int field1909 = 0;

    @OriginalMember(owner = "client!ic", name = "fc", descriptor = "I")
    public int field1925 = -1;

    @OriginalMember(owner = "client!ic", name = "Xb", descriptor = "I")
    public int field1917 = 0;

    @OriginalMember(owner = "client!ic", name = "jc", descriptor = "Z")
    public boolean field1929 = false;

    @OriginalMember(owner = "client!ic", name = "Nb", descriptor = "I")
    public int field1907 = -1;

    @OriginalMember(owner = "client!ic", name = "Vb", descriptor = "S")
    private short field1915 = 0;

    @OriginalMember(owner = "client!ic", name = "hc", descriptor = "I")
    public int field1927 = -1;

    @OriginalMember(owner = "client!ic", name = "Kb", descriptor = "I")
    public int field1904 = -1;

    @OriginalMember(owner = "client!ic", name = "pc", descriptor = "I")
    public int field1935 = -1;

    @OriginalMember(owner = "client!ic", name = "qc", descriptor = "S")
    private short field1936 = 0;

    @OriginalMember(owner = "client!ic", name = "uc", descriptor = "I")
    public int field1940 = 0;

    @OriginalMember(owner = "client!ic", name = "Ub", descriptor = "I")
    public int field1914 = 0;

    @OriginalMember(owner = "client!ic", name = "tc", descriptor = "I")
    public int field1939 = 0;

    @OriginalMember(owner = "client!ic", name = "dc", descriptor = "Lqj;")
    public static class196 field1923 = class80.method502("RuneScape wird geladen )2 bitte warten)3)3)3", -48);

    @OriginalMember(owner = "client!ic", name = "ic", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field1928 = null;

    @OriginalMember(owner = "client!ic", name = "rc", descriptor = "Lqj;")
    public static class196 field1937 = class80.method502("Bitte entfernen Sie ", -48);

    @OriginalMember(owner = "client!ic", name = "vc", descriptor = "Lqj;")
    private static class196 field1941 = class80.method502("flash3:", -48);

    @OriginalMember(owner = "client!ic", name = "sc", descriptor = "Lqj;")
    public static class196 field1938 = field1941;

    @OriginalMember(owner = "client!ic", name = "oc", descriptor = "Lqj;")
    public static class196 field1934 = field1941;

    @OriginalMember(owner = "client!ic", name = "Lb", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ic", name = "Ob", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ic", name = "Rb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ic", name = "Sb", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!ic", name = "Tb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ic", name = "Yb", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!ic", name = "Zb", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ic", name = "ac", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!ic", name = "bc", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!ic", name = "cc", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!ic", name = "gc", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!ic", name = "kc", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ic", name = "mc", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ic", name = "nc", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!ic", name = "lc", descriptor = "Loc;")
    public class119 field1931;

    @OriginalMember(owner = "client!ic", name = "ec", descriptor = "Lqj;")
    public class196 field1924;

    @OriginalMember(owner = "client!ic", name = "Wb", descriptor = "Lvb;")
    public class66 field1916;

    @OriginalMember(owner = "client!ic", name = "Mb", descriptor = "[I")
    public static int[] field1906;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZILoc;IIIIIII)V")
    private final void method806(int arg0, int arg1, int arg2, boolean arg3, int arg4, class119 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1919;
        int var14 = arg7 * arg7 - -(arg4 * arg4);
        if (var14 >= 16 && var14 <= 360000) {
            int var15 = 2047 & (int) (325.949D * Math.atan2((double) arg7, (double) arg4));
            if (arg3) {
                this.method269(111, -88, -66, -66, -89, 18, 4, 87, 127L);
            }
            class119 var16 = class156.method989(arg5, super.field2085, -1, super.field2054, arg10, var15, super.field2081);
            if (var16 != null) {
                var16.method269(0, arg1, arg6, arg2, arg11, arg8, arg9, arg0, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method807(byte arg0) {
        field1906 = null;
        field1938 = null;
        field1923 = null;
        field1941 = null;
        if (arg0 > 33) {
            field1937 = null;
            field1928 = null;
            field1934 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V")
    public static final void method808(int arg0, int arg1, int arg2) {
        if (~class73.field1057 < -1) {
            class99.method605(class73.field1057, -25839);
            class73.field1057 = 0;
        }
        int var3 = 0;
        short var4 = 256;
        if (arg0 == 255) {
            int var5 = class55.field688 * arg2;
            ++field1908;
            int var6 = 0;
            for (int var7 = 1; var7 < var4 - 1; ++var7) {
                int var8 = (var4 - var7) * class216.field3893[var7] / var4;
                if (var8 < 0) {
                    var8 = 0;
                }
                var3 += var8;
                for (int var9 = var8; var9 < 128; ++var9) {
                    int var11 = class46.field553[var3++];
                    int var12 = class55.field683[var5++ + arg1];
                    if (~var11 != -1) {
                        int var13 = var11 - -18;
                        if (var13 > 255) {
                            var13 = 255;
                        }
                        int var14 = 256 - (var11 + 18);
                        int var15 = class44.field517[var11];
                        if (var14 > 255) {
                            var14 = 255;
                        }
                        class87.field1285.field4151[var6++] = class65.method409(var14 * class65.method409(var12, 65280) + var13 * class65.method409(65280, var15), 16711680) + class65.method409(class65.method409(var12, 16711935) * var14 + class65.method409(var15, 16711935) * var13, -16711936) >> 8;
                    } else {
                        class87.field1285.field4151[var6++] = var12;
                    }
                }
                for (int var10 = 0; var8 > var10; ++var10) {
                    class87.field1285.field4151[var6++] = class55.field683[var5++ + arg1];
                }
                var5 += class55.field688 - 128;
            }
            class87.field1285.method226(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIII)I")
    public static final int method809(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field1911;
        int var5 = 48 % ((arg0 - -8) / 60);
        if (~var4 == -1) {
            return arg2;
        } else if (~var4 == -2) {
            return -arg1 + 7;
        } else {
            return ~var4 == -3 ? -arg2 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()I")
    public final int method266() {
        ++field1913;
        return super.field2100;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1932;
        if (this.field1916 != null) {
            class149 var11 = ~super.field2086 != 0 && ~super.field2084 == -1 ? class116.method704(super.field2086, -10304) : null;
            class149 var12 = ~super.field2063 == 0 || this.field1929 || super.field2091 == super.field2063 && var11 != null ? null : class116.method704(super.field2063, -10304);
            class119 var13 = this.field1916.method427(var12, 1073741823, super.field2098, var11, super.field2105);
            if (var13 != null) {
                super.field2100 = var13.method266();
                if (class151.field2444) {
                    class119 var14 = class251.method1696(0, super.field2081, super.field2085, var12 != null ? var12 : var11, super.field2054, arg0, 240, super.field2069, 256, 0, var13, var12 == null ? super.field2105 : super.field2098, 1, 160);
                    var14.method269(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class102.field1477 == this) {
                    for (int var15 = class214.field3834.length + -1; ~var15 <= -1; --var15) {
                        class70 var16 = class214.field3834[var15];
                        if (var16 != null && ~var16.field986 != 0) {
                            if (var16.field983 == 1 && ~var16.field994 <= -1 && class153.field2482.length > var16.field994) {
                                class164 var17 = class153.field2482[var16.field994];
                                if (var17 != null) {
                                    int var18 = var17.field2081 / 32 + -(class102.field1477.field2081 / 32);
                                    int var19 = var17.field2085 / 32 - class102.field1477.field2085 / 32;
                                    this.method806(arg7, arg1, arg3, false, var19, var13, arg2, var18, arg5, arg6, var16.field986, arg4, arg0);
                                }
                            }
                            if (~var16.field983 == -3) {
                                int var20 = (-class106.field1523 + var16.field987) * 4 + 2 + -(class102.field1477.field2081 / 32);
                                int var21 = (var16.field982 - class178.field3011) * 4 - -2 + -(class102.field1477.field2085 / 32);
                                this.method806(arg7, arg1, arg3, false, var21, var13, arg2, var20, arg5, arg6, var16.field986, arg4, arg0);
                            }
                            if (~var16.field983 == -11 && ~var16.field994 <= -1 && ~class247.field4397.length < ~var16.field994) {
                                class134 var22 = class247.field4397[var16.field994];
                                if (var22 != null) {
                                    int var23 = var22.field2081 / 32 + -(class102.field1477.field2081 / 32);
                                    int var24 = var22.field2085 / 32 + -(class102.field1477.field2085 / 32);
                                    this.method806(arg7, arg1, arg3, false, var24, var13, arg2, var23, arg5, arg6, var16.field986, arg4, arg0);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field1915 != 0 && ~this.field1936 != -1) {
                    int var28 = class15.field170[arg0];
                    int var29 = class15.field172[arg0];
                    short var30 = this.field1915;
                    short var31 = this.field1936;
                    int var32 = -var31 / 2;
                    int var33 = -var30 / 2;
                    int var34 = var28 * var32 - -(var29 * var33) >> 16;
                    int var35 = var30 / 2;
                    int var36 = var29 * var32 + -(var28 * var33) >> 16;
                    int var37 = -var31 / 2;
                    int var38 = class74.method470(super.field2085 - -var36, class27.field335, 103, super.field2081 - -var34);
                    int var39 = var28 * var37 + var29 * var35 >> 16;
                    int var40 = var29 * var37 - var28 * var35 >> 16;
                    int var41 = class74.method470(super.field2085 + var40, class27.field335, 103, super.field2081 + var39);
                    int var42 = -var30 / 2;
                    int var43 = var31 / 2;
                    int var44 = var30 / 2;
                    int var45 = var29 * var43 + -(var28 * var42) >> 16;
                    int var46 = var28 * var43 + var29 * var42 >> 16;
                    int var47 = var31 / 2;
                    int var48 = var28 * var47 + var29 * var44 >> 16;
                    int var49 = var29 * var47 + -(var28 * var44) >> 16;
                    int var50 = class74.method470(super.field2085 + var45, class27.field335, 103, super.field2081 + var46);
                    int var51 = ~var41 >= ~var38 ? var41 : var38;
                    int var52 = class74.method470(super.field2085 + var49, class27.field335, 103, super.field2081 + var48);
                    int var53 = var52 <= var41 ? var52 : var41;
                    int var54 = var38 + var52;
                    if (var41 + var50 < var54) {
                        var54 = var41 + var50;
                    }
                    int var55 = ~var50 <= ~var52 ? var52 : var50;
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (-var55 + var51), (double) var31));
                    if (~var25 != -1) {
                        var13.method737(var25);
                    }
                    int var56 = ~var38 > ~var50 ? var38 : var50;
                    var26 = 2047 & (int) (325.95D * Math.atan2((double) (-var53 + var56), (double) var30));
                    if (var26 != 0) {
                        var13.method739(var26);
                    }
                    var27 = (var54 >> 1) + -super.field2054;
                    if (~var27 != -1) {
                        var13.method729(0, var27, 0);
                    }
                }
                class119 var57 = null;
                if (!this.field1929 && super.field2113 != -1 && ~super.field2059 != 0) {
                    class209 var58 = class148.method929(1, super.field2113);
                    var57 = var58.method1446(super.field2059, (byte) -51);
                    if (var57 != null) {
                        var57.method729(0, -super.field2053, 0);
                        if (var58.field3778) {
                            if (~var25 != -1) {
                                var57.method737(var25);
                            }
                            if (var26 != 0) {
                                var57.method739(var26);
                            }
                            if (~var27 != -1) {
                                var57.method729(0, var27, 0);
                            }
                        }
                    }
                }
                class119 var59 = null;
                if (!this.field1929 && this.field1931 != null) {
                    if (class171.field2879 >= this.field1940) {
                        this.field1931 = null;
                    }
                    if (this.field1909 <= class171.field2879 && ~this.field1940 < ~class171.field2879) {
                        var59 = this.field1931;
                        var59.method729(-super.field2081 + this.field1912, -super.field2054 + this.field1926, -super.field2085 + this.field1933);
                        if (super.field2077 == 512) {
                            var59.method742();
                        } else if (~super.field2077 == -1025) {
                            var59.method726();
                        } else if (~super.field2077 == -1537) {
                            var59.method733();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class167) var13).method1082(var57);
                }
                if (var59 != null) {
                    var13 = ((class167) var13).method1082(var59);
                }
                var13.field1730 = true;
                var13.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field2077 != -513) {
                        if (super.field2077 == 1024) {
                            var59.method726();
                        } else if (~super.field2077 == -1537) {
                            var59.method742();
                        }
                    } else {
                        var59.method733();
                    }
                    var59.method729(-this.field1912 + super.field2081, -this.field1926 + super.field2054, -this.field1933 + super.field2085);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILp;)V")
    public final void method810(int arg0, class56 arg1) {
        arg1.field699 = 0;
        int var3 = arg1.method367(1);
        if ((var3 & 2) != 2) {
            this.field1915 = 0;
            this.field1936 = 0;
        } else {
            this.field1915 = (short) (arg1.method367(arg0 ^ -4887) << 2);
            this.field1936 = (short) (arg1.method367(1) << 2);
        }
        int var4 = var3 & 1;
        boolean var5 = ~(4 & var3) != -1;
        super.field2049 = (var3 >> 3) + 1;
        int[] var6 = new int[12];
        ++field1905;
        int var7 = -1;
        this.field1904 = arg1.method350(16);
        this.field1935 = arg1.method350(16);
        this.field1917 = 0;
        for (int var8 = 0; ~var8 > -13; ++var8) {
            int var9 = arg1.method367(1);
            if (var9 == 0) {
                var6[var8] = 0;
            } else {
                int var10 = arg1.method367(1);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && ~var11 == -65536) {
                    var7 = arg1.method318(true);
                    break;
                }
                if (var11 >= 32768) {
                    int var19 = class164.field2651[var11 + -32768];
                    var6[var8] = class1.method6(var19, 1073741824);
                    int var20 = class178.method1154(false, var19).field3608;
                    if (~var20 != -1) {
                        this.field1917 = var20;
                    }
                } else {
                    var6[var8] = class1.method6(Integer.MIN_VALUE, var11 + -256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; var13 < 5; ++var13) {
            int var18 = arg1.method367(arg0 ^ -4887);
            if (~var18 > -1 || class242.field4308[var13].length <= var18) {
                var18 = 0;
            }
            var12[var13] = var18;
        }
        if (arg0 != -4888) {
            this.field1921 = 21;
        }
        super.field2091 = arg1.method318(true);
        if (super.field2091 == 65535) {
            super.field2091 = -1;
        }
        super.field2108 = arg1.method318(true);
        if (~super.field2108 == -65536) {
            super.field2108 = -1;
        }
        super.field2107 = super.field2108;
        super.field2082 = arg1.method318(true);
        if (~super.field2082 == -65536) {
            super.field2082 = -1;
        }
        super.field2097 = arg1.method318(true);
        if (super.field2097 == 65535) {
            super.field2097 = -1;
        }
        super.field2074 = arg1.method318(true);
        if (super.field2074 == 65535) {
            super.field2074 = -1;
        }
        super.field2052 = arg1.method318(true);
        if (~super.field2052 == -65536) {
            super.field2052 = -1;
        }
        super.field2065 = arg1.method318(true);
        if (super.field2065 == 65535) {
            super.field2065 = -1;
        }
        this.field1924 = client.method627(arg1.method319(18533), (byte) -125).method1307(-98);
        this.field1939 = arg1.method367(1);
        if (var5) {
            this.field1914 = arg1.method318(true);
        } else {
            this.field1914 = 0;
        }
        int var14 = this.field1910;
        this.field1910 = arg1.method367(arg0 + 4889);
        if (~this.field1910 != -1) {
            int var15 = this.field1925;
            int var16 = this.field1907;
            int var17 = this.field1927;
            this.field1925 = arg1.method318(true);
            this.field1907 = arg1.method318(true);
            this.field1927 = arg1.method318(true);
            if (this.field1910 != var14 || ~this.field1925 != ~var15 || this.field1907 != var16 || this.field1927 != var17) {
                class164.method1032(-71, this);
            }
        } else {
            class73.method468(4096, this);
        }
        if (this.field1916 == null) {
            this.field1916 = new class66();
        }
        this.field1916.method419(var12, var6, 80, ~var4 == -2, var7);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Z")
    public final boolean method811(int arg0) {
        int var2 = -114 % ((66 - arg0) / 54);
        ++field1930;
        return this.field1916 != null;
    }
}

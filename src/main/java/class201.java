import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class201 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    private int[] field3008;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[I")
    private int[] field3026;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3016 = 127;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3013 = "Unable to find ";

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3020 = "Loading title screen - ";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field3009;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "Z")
    public static boolean field3025;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "[I")
    public static int[] field3021;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[[[I")
    public static int[][][] field3010;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1429(byte arg0) {
        field3021 = null;
        field3010 = (int[][][]) null;
        field3013 = null;
        if (arg0 != 116) {
            field3013 = (String) null;
        }
        field3020 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Lvj;", line = 27)
    public static final class103 method1430(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class103 var4 = var3.field2213;
            var3.field2213 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lan;", line = 38)
    public static final class85 method1431(int arg0, int arg1) {
        field3014++;
        if (arg0 > -81) {
            field3011 = 92;
        }
        class85 var2 = (class85) class241.field3846.method2179(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field1899.method980(class321.method2190(arg1, (byte) -67), class99.method733(arg1, 255), 5);
        class85 var4 = new class85();
        var4.field1321 = arg1;
        if (var3 != null) {
            var4.method599(31074, new class166(var3));
        }
        var4.method606(false);
        if (!field3025 && var4.field1392) {
            var4.field1361 = null;
        }
        if (var4.field1348) {
            var4.field1368 = false;
            var4.field1337 = 0;
        }
        class241.field3846.method2173(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I", line = 74)
    public static final int method1432(byte arg0) {
        if (arg0 != -124) {
            field3011 = -26;
        }
        field3023++;
        return class137.field2166;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)I", line = 88)
    public final int method1433(boolean arg0) {
        if (this.field3007-- == 0) {
            this.method1435((byte) -20);
            this.field3007 = 255;
        }
        if (arg0) {
            this.field3007 = 89;
        }
        field3024++;
        return this.field3026[this.field3007];
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 105)
    private final void method1434(int arg0) {
        field3019++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var15 >>> 16;
            int var20 = var15 + var19;
            int var21 = var3 + var6;
            var5 = var20 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field3026[var27 + 6] + var3;
            int var29 = this.field3026[var27 + 4] + var5;
            int var30 = this.field3026[var27 + 7] + var2;
            int var31 = this.field3026[var27 + 5] + var4;
            int var32 = this.field3026[var27 + 1] + var8;
            int var33 = this.field3026[var27] + var9;
            int var34 = var33 ^ var32 << 11;
            int var35 = this.field3026[var27 + 3] + var6;
            int var36 = var34 + var35;
            int var37 = this.field3026[var27 + 2] + var7;
            int var38 = var32 + var37;
            int var39 = var38 ^ var37 >>> 2;
            int var40 = var29 + var39;
            int var41 = var36 + var37;
            int var42 = var41 ^ var36 << 8;
            int var43 = var36 + var40;
            var6 = var43 ^ var40 >>> 16;
            int var44 = var31 + var42;
            int var45 = var40 + var44;
            int var46 = var6 + var28;
            var5 = var45 ^ var44 << 10;
            int var47 = var44 + var46;
            var4 = var47 ^ var46 >>> 4;
            int var48 = var4 + var34;
            int var49 = var5 + var30;
            int var50 = var46 + var49;
            var3 = var50 ^ var49 << 8;
            var8 = var3 + var39;
            int var51 = var48 + var49;
            var2 = var51 ^ var48 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var48;
            this.field3008[var27] = var9;
            this.field3008[var27 + 1] = var8;
            this.field3008[var27 + 2] = var7;
            this.field3008[var27 + 3] = var6;
            this.field3008[var27 + 4] = var5;
            this.field3008[var27 + 5] = var4;
            this.field3008[var27 + 6] = var3;
            this.field3008[var27 + 7] = var2;
        }
        int var52 = -73 % ((arg0 - 11) / 43);
        for (int var53 = 0; var53 < 256; var53 += 8) {
            int var54 = this.field3008[var53] + var9;
            int var55 = this.field3008[var53 + 4] + var5;
            int var56 = this.field3008[var53 + 7] + var2;
            int var57 = this.field3008[var53 + 3] + var6;
            int var58 = this.field3008[var53 + 2] + var7;
            int var59 = this.field3008[var53 + 5] + var4;
            int var60 = this.field3008[var53 + 6] + var3;
            int var61 = this.field3008[var53 + 1] + var8;
            int var62 = var54 ^ var61 << 11;
            int var63 = var58 + var61;
            int var64 = var63 ^ var58 >>> 2;
            int var65 = var55 + var64;
            int var66 = var57 + var62;
            int var67 = var58 + var66;
            int var68 = var67 ^ var66 << 8;
            int var69 = var65 + var66;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var59 + var68;
            int var71 = var6 + var60;
            int var72 = var65 + var70;
            var5 = var72 ^ var70 << 10;
            int var73 = var70 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var5 + var56;
            int var75 = var71 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var4 + var62;
            int var77 = var74 + var76;
            var8 = var3 + var64;
            var2 = var77 ^ var76 >>> 9;
            var9 = var8 + var76;
            this.field3008[var53] = var9;
            var7 = var2 + var68;
            this.field3008[var53 + 1] = var8;
            this.field3008[var53 + 2] = var7;
            this.field3008[var53 + 3] = var6;
            this.field3008[var53 + 4] = var5;
            this.field3008[var53 + 5] = var4;
            this.field3008[var53 + 6] = var3;
            this.field3008[var53 + 7] = var2;
        }
        this.method1435((byte) -20);
        this.field3007 = 256;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V", line = 272)
    private final void method1435(byte arg0) {
        field3015++;
        if (arg0 != -20) {
            method1431(82, -32);
        }
        this.field3012 += ++this.field3009;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3008[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3018 ^= this.field3018 << 13;
                } else {
                    this.field3018 ^= this.field3018 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3018 ^= this.field3018 << 2;
            } else {
                this.field3018 ^= this.field3018 >>> 16;
            }
            this.field3018 += this.field3008[var2 + 128 & 0xFF];
            int var4;
            this.field3008[var2] = var4 = this.field3008[class270.method1860(var3 >> 2, 255)] - (-this.field3018 - this.field3012);
            this.field3026[var2] = this.field3012 = var3 + this.field3008[class270.method1860(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 320)
    private class201() {
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([I)V", line = 322)
    public class201(int[] arg0) {
        this.field3008 = new int[256];
        this.field3026 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3026[var2] = arg0[var2];
        }
        this.method1434(72);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lmd;I)V", line = 342)
    public static final void method1436(class123 arg0, int arg1) {
        field3027++;
        arg0.field1919 = false;
        if (arg0.field1872 != -1) {
            class281 var2 = class133.method948(arg0.field1872, (byte) 33);
            if (var2 == null || var2.field4326 == null) {
                arg0.field1872 = -1;
            } else {
                arg0.field1911++;
                if (var2.field4326.length > arg0.field1873 && var2.field4322[arg0.field1873] < arg0.field1911) {
                    arg0.field1911 = 1;
                    arg0.field1954++;
                    arg0.field1873++;
                    class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1873, var2, -24255);
                }
                if (var2.field4326.length <= arg0.field1873) {
                    arg0.field1911 = 0;
                    arg0.field1873 = 0;
                    class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1873, var2, -24255);
                }
                arg0.field1954 = arg0.field1873 + 1;
                if (var2.field4326.length <= arg0.field1954) {
                    arg0.field1954 = 0;
                }
            }
        }
        int var3 = 80 / ((-arg1) / 35);
        if (arg0.field1951 != -1 && class227.field3618 >= arg0.field1895) {
            class265 var4 = class112.method831(arg0.field1951, true);
            int var5 = var4.field4117;
            if (var5 == -1) {
                arg0.field1951 = -1;
            } else {
                label308: {
                    class281 var6 = class133.method948(var5, (byte) 33);
                    if (var4.field4133) {
                        if (var6.field4321 == 3) {
                            if (arg0.field1913 > 0 && arg0.field1870 <= class227.field3618 && arg0.field1856 < class227.field3618) {
                                arg0.field1951 = -1;
                                break label308;
                            }
                        } else if (var6.field4321 == 1 && arg0.field1913 > 0 && arg0.field1870 <= class227.field3618 && arg0.field1856 < class227.field3618) {
                            arg0.field1895 = class227.field3618 + 1;
                            break label308;
                        }
                    }
                    if (var6 == null || var6.field4326 == null) {
                        arg0.field1951 = -1;
                    } else {
                        if (arg0.field1885 < 0) {
                            arg0.field1885 = 0;
                            class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, 0, var6, -24255);
                        }
                        arg0.field1904++;
                        if (arg0.field1885 < var6.field4326.length && arg0.field1904 > var6.field4322[arg0.field1885]) {
                            arg0.field1904 = 1;
                            arg0.field1885++;
                            class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1885, var6, -24255);
                        }
                        if (var6.field4326.length <= arg0.field1885) {
                            if (var4.field4133) {
                                arg0.field1944++;
                                arg0.field1885 -= var6.field4337;
                                if (var6.field4338 <= arg0.field1944) {
                                    arg0.field1951 = -1;
                                } else if (arg0.field1885 >= 0 && arg0.field1885 < var6.field4326.length) {
                                    class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1885, var6, -24255);
                                } else {
                                    arg0.field1951 = -1;
                                }
                            } else {
                                arg0.field1951 = -1;
                            }
                        }
                        arg0.field1866 = arg0.field1885 + 1;
                        if (var6.field4326.length <= arg0.field1866) {
                            if (var4.field4133) {
                                arg0.field1866 -= var6.field4337;
                                if (var6.field4338 <= (arg0.field1944 + 1)) {
                                    arg0.field1866 = -1;
                                } else if (arg0.field1866 < 0 || var6.field4326.length <= arg0.field1866) {
                                    arg0.field1866 = -1;
                                }
                            } else {
                                arg0.field1866 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1912 != -1 && arg0.field1881 <= 1) {
            class281 var7 = class133.method948(arg0.field1912, (byte) 33);
            if (var7.field4321 == 3) {
                if (arg0.field1913 > 0 && arg0.field1870 <= class227.field3618 && arg0.field1856 < class227.field3618) {
                    arg0.field1912 = -1;
                }
            } else if (var7.field4321 == 1 && arg0.field1913 > 0 && arg0.field1870 <= class227.field3618 && arg0.field1856 < class227.field3618) {
                arg0.field1881 = 1;
            }
        }
        if (arg0.field1912 != -1 && arg0.field1881 == 0) {
            class281 var8 = class133.method948(arg0.field1912, (byte) 33);
            if (var8 == null || var8.field4326 == null) {
                arg0.field1912 = -1;
            } else {
                arg0.field1880++;
                if (var8.field4326.length > arg0.field1952 && var8.field4322[arg0.field1952] < arg0.field1880) {
                    arg0.field1952++;
                    arg0.field1880 = 1;
                    class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1952, var8, -24255);
                }
                if (var8.field4326.length <= arg0.field1952) {
                    arg0.field1952 -= var8.field4337;
                    arg0.field1946++;
                    if (var8.field4338 <= arg0.field1946) {
                        arg0.field1912 = -1;
                    } else if (arg0.field1952 >= 0 && var8.field4326.length > arg0.field1952) {
                        class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, arg0.field1952, var8, -24255);
                    } else {
                        arg0.field1912 = -1;
                    }
                }
                arg0.field1926 = arg0.field1952 + 1;
                if (var8.field4326.length <= arg0.field1926) {
                    arg0.field1926 -= var8.field4337;
                    if ((arg0.field1946 + 1) >= var8.field4338) {
                        arg0.field1926 = -1;
                    } else if (arg0.field1926 < 0 || arg0.field1926 >= var8.field4326.length) {
                        arg0.field1926 = -1;
                    }
                }
                arg0.field1919 = var8.field4331;
            }
        }
        if (arg0.field1881 > 0) {
            arg0.field1881--;
        }
        for (int var9 = 0; var9 < arg0.field1908.length; var9++) {
            class111 var10 = arg0.field1908[var9];
            if (var10 != null) {
                if (var10.field1722 > 0) {
                    var10.field1722--;
                } else {
                    class281 var11 = class133.method948(var10.field1733, (byte) 33);
                    if (var11 == null || var11.field4326 == null) {
                        arg0.field1908[var9] = null;
                    } else {
                        var10.field1729++;
                        if (var11.field4326.length > var10.field1725 && var11.field4322[var10.field1725] < var10.field1729) {
                            var10.field1725++;
                            var10.field1729 = 1;
                            class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, var10.field1725, var11, -24255);
                        }
                        if (var10.field1725 >= var11.field4326.length) {
                            var10.field1725 -= var11.field4337;
                            var10.field1724++;
                            if (var10.field1724 >= var11.field4338) {
                                arg0.field1908[var9] = null;
                            } else if (var10.field1725 >= 0 && var10.field1725 < var11.field4326.length) {
                                class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, var10.field1725, var11, -24255);
                            } else {
                                arg0.field1908[var9] = null;
                            }
                        }
                        var10.field1731 = var10.field1725 + 1;
                        if (var11.field4326.length <= var10.field1731) {
                            var10.field1731 -= var11.field4337;
                            if ((var10.field1724 + 1) >= var11.field4338) {
                                var10.field1731 = -1;
                            } else if (var10.field1731 < 0 || var11.field4326.length <= var10.field1731) {
                                var10.field1731 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}

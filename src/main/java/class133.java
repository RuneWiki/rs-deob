import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class133 {

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public int field1911 = -1;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[I")
    public static int[] field1908 = new int[16384];

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
    public static boolean field1904 = true;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[I")
    public static int[] field1913 = new int[16384];

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
    public static int[] field1917;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Lbj;")
    public static class131 field1915;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "J")
    private long field1897;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "J")
    private long field1903;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lclient;")
    public static client field1914;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
    public boolean field1899;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Z")
    public static boolean field1916;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    private int[] field1891;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
    public int[] field1893;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[[I")
    private int[][] field1905;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1913[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field1908[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field1917 = new int[32];
        field1918 = 0;
        field1915 = new class131(128);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 3)
    public final void method917(int arg0, int arg1, int arg2) {
        field1898++;
        int var4 = class273.field3786[arg1];
        if (this.field1891[var4] == 0 || class410.method2567(arg2, -70) == null) {
            return;
        }
        this.field1891[var4] = class393.method2487(arg2, Integer.MIN_VALUE);
        if (arg0 != 65535) {
            field1913 = null;
        }
        this.method921(false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 26)
    public static void method918(byte arg0) {
        field1915 = null;
        if (arg0 == -17) {
            field1908 = null;
            field1914 = null;
            field1913 = null;
            field1917 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lms;BI)Ljava/lang/String;", line = 43)
    public static final String method919(class453 arg0, byte arg1, int arg2) {
        if (arg1 != -46) {
            return null;
        }
        field1907++;
        if (!client.method1091(arg0).method960(true, arg2) && arg0.field6366 == null) {
            return null;
        } else if (arg0.field6360 == null || arg2 >= arg0.field6360.length || arg0.field6360[arg2] == null || arg0.field6360[arg2].trim().length() == 0) {
            return class293.field4106 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field6360[arg2];
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjm;I[Lfg;IILuo;IIIZLjm;)Lmj;", line = 67)
    public final class394 method920(int arg0, int arg1, class411 arg2, int arg3, class66[] arg4, int arg5, int arg6, class345 arg7, int arg8, int arg9, int arg10, boolean arg11, class411 arg12) {
        field1906++;
        if (this.field1911 != -1) {
            return class412.method2584(this.field1911, true).method2111(arg3, -72, arg4, arg1, arg12, arg7, arg6, arg9, arg0, arg10, arg8, arg2);
        }
        int var14 = arg1;
        long var15 = this.field1903;
        int[] var17 = this.field1891;
        if (arg2 != null && (arg2.field5836 >= 0 || arg2.field5812 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field1891[var18];
            }
            if (arg2.field5836 >= 0) {
                if (arg2.field5836 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class393.method2487(arg2.field5836, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg2.field5812 >= 0) {
                if (arg2.field5812 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class393.method2487(1073741824, arg2.field5812);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg2 != null || arg12 != null;
        int var22 = arg4 == null ? 0 : arg4.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class90.field1257[var23] = null;
            if (arg4[var23] != null) {
                class411 var24 = class108.method761((byte) -82, arg4[var23].field980);
                if (var24.field5824 != null) {
                    var21 = true;
                    class404.field5736[var23] = var24;
                    int var25 = arg4[var23].field982;
                    int var26 = arg4[var23].field975;
                    int var27 = var24.field5824[var25];
                    class90.field1257[var23] = class171.method1127(var27 >>> 16, false);
                    int var28 = var27 & 0xFFFF;
                    class121.field1696[var23] = var28;
                    if (class90.field1257[var23] != null) {
                        var20 |= class90.field1257[var23].method2444(var28, 77);
                        var19 |= class90.field1257[var23].method2443(var28, (byte) -109);
                    }
                    if ((var24.field5838 || class40.field589) && var26 != -1 && var24.field5824.length > var26) {
                        class267.field3697[var23] = var24.field5819[var25];
                        class1.field13[var23] = arg4[var23].field973;
                        int var29 = var24.field5824[var26];
                        class247.field3491[var23] = class171.method1127(var29 >>> 16, false);
                        int var30 = var29 & 0xFFFF;
                        class395.field5664[var23] = var30;
                        if (class247.field3491[var23] != null) {
                            var20 |= class247.field3491[var23].method2444(var30, -46);
                            var19 |= class247.field3491[var23].method2443(var30, (byte) -109);
                        }
                    } else {
                        class267.field3697[var23] = 0;
                        class1.field13[var23] = 0;
                        class247.field3491[var23] = null;
                        class395.field5664[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class386 var34 = null;
        class386 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class386 var39 = null;
        class386 var40 = null;
        if (var21) {
            var14 = arg1 | 0x20;
            if (arg2 != null) {
                int var41 = arg2.field5824[arg6];
                int var42 = var41 >>> 16;
                var31 = var41 & 0xFFFF;
                var34 = class171.method1127(var42, false);
                if (var34 != null) {
                    var20 |= var34.method2444(var31, arg5 - 30828);
                    var19 |= var34.method2443(var31, (byte) -109);
                }
                if ((arg2.field5838 || class40.field589) && arg0 != -1 && arg0 < arg2.field5824.length) {
                    int var43 = arg2.field5824[arg0];
                    var33 = arg2.field5819[arg6];
                    int var44 = var43 >>> 16;
                    var35 = var42 == var44 ? var34 : class171.method1127(var44, false);
                    var32 = var43 & 0xFFFF;
                    if (var35 != null) {
                        var20 |= var35.method2444(var32, -83);
                        var19 |= var35.method2443(var32, (byte) -109);
                    }
                }
            }
            if (arg12 != null) {
                int var45 = arg12.field5824[arg8];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = class171.method1127(var46, false);
                if (var39 != null) {
                    var20 |= var39.method2444(var36, 85);
                    var19 |= var39.method2443(var36, (byte) -109);
                }
                if ((arg12.field5838 || class40.field589) && arg3 != -1 && arg3 < arg12.field5824.length) {
                    var38 = arg12.field5819[arg8];
                    int var47 = arg12.field5824[arg3];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    var40 = var46 == var48 ? var39 : class171.method1127(var48, false);
                    if (var40 != null) {
                        var20 |= var40.method2444(var37, 107);
                        var19 |= var40.method2443(var37, (byte) -109);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class131 var49 = class206.field2830;
        class394 var50;
        synchronized (class206.field2830) {
            var50 = (class394) class206.field2830.method904(false, var15);
        }
        class428 var51 = null;
        if (this.field1909 != -1) {
            var51 = class155.method1041((byte) -113, this.field1909);
        }
        if (var50 == null || arg7.method139(var50.method1424(), var14) != 0 || var51 != null && var51.field6038 != null && this.field1905 == null) {
            if (var50 != null) {
                var14 = arg7.method108(var14, var50.method1424());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field1897 != -1L) {
                            class131 var81 = class206.field2830;
                            synchronized (class206.field2830) {
                                var50 = (class394) class206.field2830.method904(false, this.field1897);
                            }
                        }
                        if (var50 == null || arg7.method139(var50.method1424(), var14) != 0 || var51 != null && var51.field6038 != null && this.field1905 == null) {
                            return null;
                        }
                    } else {
                        class223[] var56 = new class223[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class223 var59 = class51.method433((byte) 87, var58 & 0x3FFFFFFF).method2316(this.field1899, (byte) 93);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((var58 & Integer.MIN_VALUE) != 0) {
                                class223 var60 = class410.method2567(var58 & 0x3FFFFFFF, arg5 - 30862).method1679((byte) 106);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field6038 != null) {
                            for (int var61 = 0; var61 < var51.field6038.length; var61++) {
                                if (var51.field6038[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field6038[var61][0];
                                    int var63 = var51.field6038[var61][1];
                                    int var64 = var51.field6038[var61][2];
                                    int var65 = var51.field6038[var61][3] << 3;
                                    int var66 = var51.field6038[var61][4] << 3;
                                    int var67 = var51.field6038[var61][5] << 3;
                                    if (this.field1905 == null) {
                                        this.field1905 = new int[var51.field6038.length][];
                                    }
                                    if (this.field1905[var61] == null) {
                                        int[] var68 = this.field1905[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[13] = -var63;
                                            var68[14] = -var64;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = field1908[var65];
                                            int var70 = field1913[var65];
                                            int var71 = field1908[var66];
                                            int var72 = field1913[var66];
                                            int var73 = field1908[var67];
                                            int var74 = field1913[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[0] = var71 * var73 + var72 * var76 + 16384 >> 15;
                                            var68[6] = var71 * var76 + -var72 * var73 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + (var71 * var75) + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[1] = var72 * var75 + -var74 * var71 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[14] = var68[2] * -var62 + var68[5] * -var63 + var68[8] * -var64 + 16384 >> 15;
                                            var68[13] = var68[1] * -var62 + (var68[4] * -var63) - (-(var68[7] * -var64) - 16384) >> 15;
                                            var68[12] = var68[6] * -var64 + var68[3] * -var63 + var68[0] * -var62 + 16384 >> 15;
                                        }
                                        var68[11] = var64;
                                        var68[9] = var62;
                                        var68[10] = var63;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method1485(var66, (byte) 103, var65, var67);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method1484(var63, var64, 0, var62);
                                    }
                                }
                            }
                        }
                        class223 var77 = new class223(var56, var56.length);
                        int var78 = var14 | 0x2000;
                        var50 = arg7.method62(var77, var78, class395.field5658, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (class157.field2219[var79].length > this.field1893[var79]) {
                                var50.method1460(class192.field2639[var79], class157.field2219[var79][this.field1893[var79]]);
                            }
                            if (class447.field6275[var79].length > this.field1893[var79]) {
                                var50.method1460(class432.field6112[var79], class447.field6275[var79][this.field1893[var79]]);
                            }
                        }
                        if (arg11) {
                            var50.method1453(var14);
                            class131 var80 = class206.field2830;
                            synchronized (class206.field2830) {
                                class206.field2830.method902(var15, (byte) 112, var50);
                            }
                            this.field1897 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((var55 & Integer.MIN_VALUE) != 0 && !class410.method2567(var55 & 0x3FFFFFFF, 124).method1675(-102)) {
                        var53 = true;
                    }
                } else if (!class51.method433((byte) 87, var55 & 0x3FFFFFFF).method2301(0, this.field1899)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class394 var82 = var50.method1430((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class90.field1257[var83] != null) {
                var82.method2493(class121.field1696[var83], class247.field3491[var83], class90.field1257[var83], class1.field13[var83] - 1, 0, class267.field3697[var83], class395.field5664[var83], this.field1905 == null ? null : this.field1905[var83], false, var84, 0);
            }
            var83++;
            var84 <<= 0x1;
        }
        if (var34 != null && var39 != null) {
            var82.method2491(arg2.field5821, var31, var36, var39, arg10 - 1, var37, var34, true, var40, var32, var35, arg9 - 1, var33, var38, false);
        } else if (var34 != null) {
            var82.method2495(var32, var34, false, var31, (byte) -117, var35, 0, var33, arg10 - 1);
        } else if (var39 != null) {
            var82.method2495(var37, var39, false, var36, (byte) 109, var40, 0, var38, arg9 - 1);
        }
        if (arg5 != 30740) {
            this.method920(-110, -42, (class411) null, -28, (class66[]) null, -115, 118, (class345) null, -24, -53, 33, false, (class411) null);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class90.field1257[var85] = null;
            class247.field3491[var85] = null;
            class404.field5736[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 568)
    private final void method921(boolean arg0) {
        field1896++;
        this.field1903 = -1L;
        long[] var2 = class343.field4679;
        if (arg0) {
            field1904 = true;
        }
        this.field1903 = this.field1903 >>> 8 ^ var2[(int) ((this.field1903 ^ (long) (this.field1909 >> 8)) & 0xFFL)];
        this.field1903 = this.field1903 >>> 8 ^ var2[(int) ((this.field1903 ^ (long) this.field1909) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1903 = this.field1903 >>> 8 ^ var2[(int) ((this.field1903 ^ (long) (this.field1891[var3] >> 24)) & 0xFFL)];
            this.field1903 = this.field1903 >>> 8 ^ var2[(int) (((long) (this.field1891[var3] >> 16) ^ this.field1903) & 0xFFL)];
            this.field1903 = this.field1903 >>> 8 ^ var2[(int) ((this.field1903 ^ (long) (this.field1891[var3] >> 8)) & 0xFFL)];
            this.field1903 = this.field1903 >>> 8 ^ var2[(int) ((this.field1903 ^ (long) this.field1891[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1903 = var2[(int) (((long) this.field1893[var4] ^ this.field1903) & 0xFFL)] ^ this.field1903 >>> 8;
        }
        this.field1903 = this.field1903 >>> 8 ^ var2[(int) (((long) (this.field1899 ? 1 : 0) ^ this.field1903) & 0xFFL)];
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILjm;IILuo;I)Lmj;", line = 605)
    public final class394 method922(int arg0, int arg1, int arg2, int arg3, int arg4, class411 arg5, int arg6, int arg7, class345 arg8, int arg9) {
        field1894++;
        int var11 = arg9;
        if (arg5 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg9 | 0x20;
            Object var18 = null;
            int var19 = arg5.field5824[arg2];
            int var20 = var19 >>> 16;
            int var21 = var19 & 0xFFFF;
            class386 var22 = class171.method1127(var20, false);
            if (var22 != null) {
                var13 |= var22.method2444(var21, 75);
                var12 |= var22.method2443(var21, (byte) -109);
                var14 |= arg5.field5829;
            }
            if ((arg5.field5838 || class40.field589) && arg7 != -1 && arg5.field5824.length > arg7) {
                int var23 = arg5.field5824[arg7];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class386 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class171.method1127(var25 >>> 16, false);
                }
                if (var26 != null) {
                    var13 |= var26.method2444(var25, -100);
                    var12 |= var26.method2443(var25, (byte) -109);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) (arg1 << 16) | (long) arg3 << 32 | (long) arg0;
        class131 var29 = class113.field1633;
        class394 var30;
        synchronized (class113.field1633) {
            if (arg6 != 24236) {
                this.method920(28, 52, (class411) null, -5, (class66[]) null, -54, -6, (class345) null, -2, -60, 125, false, (class411) null);
            }
            var30 = (class394) class113.field1633.method904(false, var27);
        }
        if (var30 == null || arg8.method139(var30.method1424(), var11) != 0) {
            if (var30 != null) {
                var11 = arg8.method108(var11, var30.method1424());
            }
            class223[] var32 = new class223[3];
            int var33 = 0;
            if (!class410.method2567(arg0, -74).method1678((byte) -80) || !class410.method2567(arg1, 71).method1678((byte) -80) || !class410.method2567(arg3, arg6 ^ 0xFFFFA16F).method1678((byte) -80)) {
                return null;
            }
            class223 var34 = class410.method2567(arg0, arg6 - 24115).method1681(true);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class223 var35 = class410.method2567(arg1, arg6 ^ 0xFFFFA12B).method1681(true);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class223 var36 = class410.method2567(arg3, -104).method1681(true);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class223 var38 = new class223(var32, var33);
            var30 = arg8.method62(var38, var37, class395.field5658, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field1893[var39] < class157.field2219[var39].length) {
                    var30.method1460(class192.field2639[var39], class157.field2219[var39][this.field1893[var39]]);
                }
                if (class447.field6275[var39].length > this.field1893[var39]) {
                    var30.method1460(class432.field6112[var39], class447.field6275[var39][this.field1893[var39]]);
                }
            }
            var30.method1453(var11);
            class131 var40 = class113.field1633;
            synchronized (class113.field1633) {
                class113.field1633.method902(var27, (byte) 112, var30);
            }
        }
        if (arg5 == null) {
            return var30;
        } else {
            class394 var41 = var30.method1430((byte) 1, var11, true);
            return arg5.method2577(arg9, arg4, arg2, (byte) -115, arg7, var41);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 753)
    public static final void method923(int arg0) {
        class131 var1 = class206.field2830;
        synchronized (class206.field2830) {
            class206.field2830.method900(0);
        }
        field1910++;
        class131 var2 = class113.field1633;
        synchronized (class113.field1633) {
            int var3 = -88 / ((22 - arg0) / 51);
            class113.field1633.method900(0);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjm;ILuo;IB)Lmj;", line = 770)
    public final class394 method924(int arg0, int arg1, class411 arg2, int arg3, class345 arg4, int arg5, byte arg6) {
        field1902++;
        if (this.field1911 != -1) {
            return class412.method2584(this.field1911, true).method2104(arg3, arg0, arg2, arg4, arg5, 674764944, arg1);
        }
        if (arg6 != -20) {
            field1916 = true;
        }
        int var8 = arg0;
        if (arg2 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg2.field5824[arg3];
            var8 = arg0 | 0x20;
            Object var16 = null;
            int var17 = var15 >>> 16;
            class386 var18 = class171.method1127(var17, false);
            int var19 = var15 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method2444(var19, -76);
                var9 |= var18.method2443(var19, (byte) -109);
                var11 |= arg2.field5829;
            }
            if ((arg2.field5838 || class40.field589) && arg5 != -1 && arg2.field5824.length > arg5) {
                int var20 = arg2.field5824[arg5];
                int var21 = var20 >>> 16;
                class386 var22 = var17 == var21 ? var18 : class171.method1127(var21, false);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method2444(var23, -70);
                    var9 |= var22.method2443(var23, (byte) -109);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class131 var24 = class113.field1633;
        class394 var25;
        synchronized (class113.field1633) {
            var25 = (class394) class113.field1633.method904(false, this.field1903);
        }
        if (var25 == null || arg4.method139(var25.method1424(), var8) != 0) {
            if (var25 != null) {
                var8 = arg4.method108(var8, var25.method1424());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field1891[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class410.method2567(var29 & 0x3FFFFFFF, -65).method1678((byte) -80)) {
                        var27 = true;
                    }
                } else if (!class51.method433((byte) 87, var29 & 0x3FFFFFFF).method2306((byte) 47, this.field1899)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class223[] var30 = new class223[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field1891[var32];
                if ((var33 & 0x40000000) != 0) {
                    class223 var35 = class51.method433((byte) 87, var33 & 0x3FFFFFFF).method2317(arg6 ^ 0x93, this.field1899);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class223 var34 = class410.method2567(var33 & 0x3FFFFFFF, -60).method1681(true);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                }
            }
            class223 var36 = new class223(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg4.method62(var36, var37, class395.field5658, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class157.field2219[var38].length > this.field1893[var38]) {
                    var25.method1460(class192.field2639[var38], class157.field2219[var38][this.field1893[var38]]);
                }
                if (class447.field6275[var38].length > this.field1893[var38]) {
                    var25.method1460(class432.field6112[var38], class447.field6275[var38][this.field1893[var38]]);
                }
            }
            var25.method1453(var8);
            class131 var39 = class113.field1633;
            synchronized (class113.field1633) {
                class113.field1633.method902(this.field1903, (byte) 112, var25);
            }
        }
        if (arg2 == null) {
            return var25;
        } else {
            var25.method1430((byte) 1, var8, true);
            return arg2.method2577(arg0, arg1, arg3, (byte) -115, arg5, var25);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V", line = 957)
    public final void method925(byte arg0, boolean arg1) {
        this.field1899 = arg1;
        field1900++;
        this.method921(false);
        if (arg0 > -73) {
            this.method926((byte) -104, 123, 59);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V", line = 970)
    public final void method926(byte arg0, int arg1, int arg2) {
        field1892++;
        if (arg0 != 116) {
            field1895 = 61;
        }
        this.field1893[arg2] = arg1;
        this.method921(false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILkh;)V", line = 986)
    public static final void method927(int arg0, class11 arg1) {
        for (int var2 = 0; var2 < class258.field3629; var2++) {
            int var4 = arg1.method175(255);
            int var5 = arg1.method174(255);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class452.field6308[var4] != null) {
                class452.field6308[var4].field2647 = var5;
            }
        }
        int var3 = -38 / ((74 - arg0) / 36);
        field1912++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([II[IZII)V", line = 1023)
    public final void method928(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        if (this.field1909 != arg4) {
            this.field1909 = arg4;
            this.field1905 = null;
        }
        field1901++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class352.field4826; var8++) {
                    class250 var9 = class410.method2567(var8, 88);
                    if (var9 != null && !var9.field3529 && var9.field3530 == (arg3 ? class149.field2113[var7] : class80.field1147[var7])) {
                        arg2[class273.field3786[var7]] = class393.method2487(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (arg5 != 0) {
            this.field1897 = -49L;
        }
        this.field1899 = arg3;
        this.field1911 = arg1;
        this.field1893 = arg0;
        this.field1891 = arg2;
        this.method921(false);
    }
}

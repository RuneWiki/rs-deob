import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class115 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "J")
    private long field1924;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "J")
    private long field1936;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Lio;")
    public static class353 field1933;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
    public boolean field1935;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "[I")
    private int[] field1929;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "[I")
    public int[] field1932;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[[I")
    private int[][] field1928;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Lth;ZZ)Luf;", line = 5)
    public static final class241 method896(String arg0, class57 arg1, boolean arg2, boolean arg3) {
        field1927++;
        int var4 = arg1.method483(-1, arg0);
        if (var4 == -1) {
            return new class241(0);
        }
        int[] var5 = arg1.method458(var4, -93);
        int var6 = 0;
        int var7 = 0;
        class241 var8 = new class241(var5.length);
        if (arg2) {
            field1933 = (class353) null;
        }
        while (true) {
            while (var8.field3980 > var6) {
                class227 var9 = new class227(arg1.method472(var5[var7++], 27, var4));
                int var10 = var9.method1715((byte) 26);
                int var11 = var9.method1765(true);
                int var12 = var9.method1720((byte) -119);
                if (!arg3 && var12 == 1) {
                    var8.field3980--;
                } else {
                    var8.field3977[var6] = var10;
                    var8.field3981[var6] = new class59();
                    var8.field3981[var6].field1011 = var11;
                    var6++;
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ld;ILd;BIIZIIZI[Lde;)Lo;", line = 53)
    public final class96 method897(class43 arg0, int arg1, class43 arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, int arg10, class194[] arg11) {
        field1931++;
        if (this.field1930 != -1) {
            return class222.method1683(78, this.field1930).method953(arg11, arg10, arg0, arg5, arg1, arg4, arg2, arg8, arg7, (byte) 61);
        }
        long var13 = this.field1924;
        int[] var15 = this.field1929;
        if (arg2 != null && (arg2.field659 >= 0 || arg2.field657 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field1929[var16];
            }
            if (arg2.field659 >= 0) {
                if (arg2.field659 == 65535) {
                    var15[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var15[5] = class75.method624(1073741824, arg2.field659);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg2.field657 >= 0) {
                if (arg2.field657 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var15[3] = 0;
                } else {
                    var15[3] = class75.method624(arg2.field657, 1073741824);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class96 var17 = (class96) class326.field5176.method2329((byte) 107, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var15[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var20) != 0 && !class309.method2193((byte) 93, var20 & 0x3FFFFFFF).method1432(0)) {
                        var18 = true;
                    }
                } else if (!class6.method22(var20 & 0x3FFFFFFF, 16430).method412(2584, this.field1935)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field1936 != -1L) {
                    var17 = (class96) class326.field5176.method2329((byte) 107, this.field1936);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class114[] var21 = new class114[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var15[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class114 var25 = class6.method22(var23 & 0x3FFFFFFF, 16430).method409(this.field1935, 26051);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((var23 & Integer.MIN_VALUE) != 0) {
                        class114 var24 = class309.method2193((byte) 93, var23 & 0x3FFFFFFF).method1434((byte) -20);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class106 var26 = null;
                if (this.field1917 != -1) {
                    var26 = class20.method116((byte) 29, this.field1917);
                }
                if (var26 != null && var26.field1727 != null) {
                    for (int var27 = 0; var27 < var26.field1727.length; var27++) {
                        if (var26.field1727[var27] != null && var21[var27] != null) {
                            int var28 = var26.field1727[var27][0];
                            int var29 = var26.field1727[var27][1];
                            int var30 = var26.field1727[var27][2];
                            int var31 = var26.field1727[var27][3];
                            int var32 = var26.field1727[var27][4];
                            int var33 = var26.field1727[var27][5];
                            if (this.field1928 == null) {
                                this.field1928 = new int[var26.field1727.length][];
                            }
                            if (this.field1928[var27] == null) {
                                int[] var34 = this.field1928[var27] = new int[15];
                                if (var31 == 0 && var32 == 0 && var33 == 0) {
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[12] = -var28;
                                    var34[14] = -var30;
                                    var34[13] = -var29;
                                } else {
                                    int var35 = class153.field2438[var31] >> 1;
                                    int var36 = class153.field2445[var31] >> 1;
                                    int var37 = class153.field2445[var32] >> 1;
                                    int var38 = class153.field2438[var32] >> 1;
                                    int var39 = class153.field2445[var33] >> 1;
                                    int var40 = class153.field2438[var33] >> 1;
                                    var34[4] = var36 * var39 + 16384 >> 15;
                                    int var41 = var35 * var40 + 16384 >> 15;
                                    var34[0] = var37 * var39 + var38 * var41 + 16384 >> 15;
                                    var34[3] = var36 * var40 + 16384 >> 15;
                                    var34[8] = var36 * var37 + 16384 >> 15;
                                    int var42 = var35 * var39 + 16384 >> 15;
                                    var34[7] = -var38 * -var40 + var37 * var42 + 16384 >> 15;
                                    var34[2] = var36 * var38 + 16384 >> 15;
                                    var34[1] = -var40 * var37 + (var38 * var42) + 16384 >> 15;
                                    var34[5] = -var35;
                                    var34[13] = var34[1] * -var28 + (var34[4] * -var29) + var34[7] * -var30 + 16384 >> 15;
                                    var34[6] = -var38 * var39 + var37 * var41 + 16384 >> 15;
                                    var34[14] = var34[8] * -var30 + var34[2] * -var28 + var34[5] * -var29 + 16384 >> 15;
                                    var34[12] = var34[6] * -var30 + var34[0] * -var28 - (-(var34[3] * -var29) + -16384) >> 15;
                                }
                                var34[9] = var28;
                                var34[10] = var29;
                                var34[11] = var30;
                            }
                            if (var31 != 0 || var32 != 0 || var33 != 0) {
                                var21[var27].method875(var31, var32, var33);
                            }
                            if (var28 != 0 || var29 != 0 || var30 != 0) {
                                var21[var27].method869(var28, var29, var30);
                            }
                        }
                    }
                }
                class114 var43 = new class114(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (this.field1932[var44] < class336.field5316[var44].length) {
                        var43.method885(class255.field4302[var44], class336.field5316[var44][this.field1932[var44]]);
                    }
                    if (this.field1932[var44] < class41.field598[var44].length) {
                        var43.method885(class195.field3104[var44], class41.field598[var44][this.field1932[var44]]);
                    }
                }
                var17 = var43.method880(64, 850, -30, -50, -30);
                if (class42.field607) {
                    ((class337) var17).method2351(false, false, true, true, false, false, true);
                }
                if (arg6) {
                    class326.field5176.method2333(var13, 0, var17);
                    this.field1936 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg11 == null ? 0 : arg11.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg11[var50] != null) {
                class43 var51 = class198.method1524(arg11[var50].field3092, -47);
                if (var51.field677 != null) {
                    class272.field4515[var50] = var51;
                    var45 = true;
                    int var52 = arg11[var50].field3087;
                    int var53 = arg11[var50].field3089;
                    int var54 = var51.field677[var53];
                    class253.field4273[var50] = class230.method1782(var54 >>> 16, -68);
                    int var55 = var54 & 0xFFFF;
                    class149.field2380[var50] = var55;
                    if (class253.field4273[var50] != null) {
                        var48 |= class253.field4273[var50].method1972(var55, -480);
                        var46 |= class253.field4273[var50].method1968(var55, (byte) 78);
                        var47 |= var51.field669;
                    }
                    if ((var51.field663 || class94.field1575) && var52 != -1 && var52 < var51.field677.length) {
                        class342.field5455[var50] = var51.field651[var53];
                        class31.field452[var50] = arg11[var50].field3091;
                        int var56 = var51.field677[var52];
                        class133.field2244[var50] = class230.method1782(var56 >>> 16, -73);
                        int var57 = var56 & 0xFFFF;
                        class204.field3218[var50] = var57;
                        if (class133.field2244[var50] != null) {
                            var48 |= class133.field2244[var50].method1972(var57, -480);
                            var46 |= class133.field2244[var50].method1968(var57, (byte) -95);
                        }
                    } else {
                        class342.field5455[var50] = 0;
                        class31.field452[var50] = 0;
                        class133.field2244[var50] = null;
                        class204.field3218[var50] = -1;
                    }
                }
            }
        }
        if (!var45 && arg2 == null && arg0 == null) {
            if (arg9) {
                return var17.method515(false, false, false);
            } else {
                return var17;
            }
        } else if (arg3 > -56) {
            return (class96) null;
        } else {
            int var58 = -1;
            int var59 = 0;
            int var60 = -1;
            class257 var61 = null;
            class257 var62 = null;
            if (arg2 != null) {
                int var63 = arg2.field677[arg5];
                int var64 = var63 >>> 16;
                var61 = class230.method1782(var64, -103);
                var60 = var63 & 0xFFFF;
                if (var61 != null) {
                    var48 |= var61.method1972(var60, -480);
                    var46 |= var61.method1968(var60, (byte) 109);
                    var47 |= arg2.field669;
                }
                if ((arg2.field663 || class94.field1575) && arg7 != -1 && arg7 < arg2.field677.length) {
                    int var65 = arg2.field677[arg7];
                    var59 = arg2.field651[arg5];
                    int var66 = var65 >>> 16;
                    var58 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var62 = var61;
                    } else {
                        var62 = class230.method1782(var58 >>> 16, -111);
                    }
                    if (var62 != null) {
                        var48 |= var62.method1972(var58, -480);
                        var46 |= var62.method1968(var58, (byte) 88);
                    }
                }
            }
            int var67 = -1;
            int var68 = -1;
            int var69 = 0;
            class257 var70 = null;
            class257 var71 = null;
            if (arg0 != null) {
                int var72 = arg0.field677[arg8];
                int var73 = var72 >>> 16;
                var67 = var72 & 0xFFFF;
                var70 = class230.method1782(var73, -59);
                if (var70 != null) {
                    var48 |= var70.method1972(var67, -480);
                    var46 |= var70.method1968(var67, (byte) 57);
                    var47 |= arg0.field669;
                }
                if ((arg0.field663 || class94.field1575) && arg4 != -1 && arg0.field677.length > arg4) {
                    int var74 = arg0.field677[arg4];
                    var69 = arg0.field651[arg8];
                    int var75 = var74 >>> 16;
                    var68 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var71 = var70;
                    } else {
                        var71 = class230.method1782(var68 >>> 16, -93);
                    }
                    if (var71 != null) {
                        var48 |= var71.method1972(var68, -480);
                        var46 |= var71.method1968(var68, (byte) 71);
                    }
                }
            }
            class96 var76 = var17.method515(!var46, !var48, !var47);
            int var77 = 0;
            int var78 = 1;
            while (var49 > var77) {
                if (class253.field4273[var77] != null) {
                    var76.method750(class253.field4273[var77], class149.field2380[var77], class133.field2244[var77], class204.field3218[var77], class31.field452[var77] - 1, class342.field5455[var77], var78, class272.field4515[var77].field669, this.field1928[var77]);
                }
                var77++;
                var78 <<= 0x1;
            }
            if (var61 != null && var70 != null) {
                var76.method744(var61, var60, var62, var58, arg10 - 1, var59, var70, var67, var71, var68, arg1 - 1, var69, arg2.field680, arg0.field669 | arg2.field669);
            } else if (var61 != null) {
                var76.method746(var61, var60, var62, var58, arg10 - 1, var59, arg2.field669);
            } else if (var70 != null) {
                var76.method746(var70, var67, var71, var68, arg1 - 1, var69, arg0.field669);
            }
            for (int var79 = 0; var79 < var49; var79++) {
                class253.field4273[var79] = null;
                class133.field2244[var79] = null;
                class272.field4515[var79] = null;
            }
            return var76;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIII[IZ)V", line = 533)
    public final void method898(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field1917 != arg2) {
            this.field1928 = (int[][]) null;
            this.field1917 = arg2;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class21.field239; var8++) {
                    class182 var9 = class309.method2193((byte) 93, var8);
                    if (var9 != null && !var9.field2931 && (arg5 ? class166.field2654[var7] : class134.field2252[var7]) == var9.field2933) {
                        arg4[class165.field2622[var7]] = class75.method624(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1929 = arg4;
        this.field1930 = arg1;
        if (arg3 == Integer.MIN_VALUE) {
            this.field1935 = arg5;
            field1920++;
            this.field1932 = arg0;
            this.method901(-88);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILd;III)Lo;", line = 588)
    public final class96 method899(int arg0, class43 arg1, int arg2, int arg3, int arg4) {
        field1934++;
        if (this.field1930 != -1) {
            return class222.method1683(-120, this.field1930).method954((byte) 88, arg2, arg3, arg0, arg1);
        } else if (arg4 > -43) {
            return (class96) null;
        } else {
            class96 var6 = (class96) class232.field3843.method2329((byte) 107, this.field1924);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field1929[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var9) != 0 && !class309.method2193((byte) 93, var9 & 0x3FFFFFFF).method1427(0)) {
                            var7 = true;
                        }
                    } else if (!class6.method22(var9 & 0x3FFFFFFF, 16430).method418(this.field1935, -114)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class114[] var10 = new class114[12];
                int var11 = 0;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field1929[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class114 var15 = class6.method22(var13 & 0x3FFFFFFF, 16430).method406(2, this.field1935);
                        if (var15 != null) {
                            var10[var11++] = var15;
                        }
                    } else if ((Integer.MIN_VALUE & var13) != 0) {
                        class114 var14 = class309.method2193((byte) 93, var13 & 0x3FFFFFFF).method1424(124);
                        if (var14 != null) {
                            var10[var11++] = var14;
                        }
                    }
                }
                class114 var16 = new class114(var10, var11);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class336.field5316[var17].length > this.field1932[var17]) {
                        var16.method885(class255.field4302[var17], class336.field5316[var17][this.field1932[var17]]);
                    }
                    if (class41.field598[var17].length > this.field1932[var17]) {
                        var16.method885(class195.field3104[var17], class41.field598[var17][this.field1932[var17]]);
                    }
                }
                var6 = var16.method880(64, 768, -50, -10, -50);
                class232.field3843.method2333(this.field1924, 0, var6);
            }
            if (arg1 != null) {
                var6 = arg1.method318(-12, var6, arg0, arg3, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILd;II)Lo;", line = 704)
    public final class96 method900(int arg0, int arg1, int arg2, int arg3, int arg4, class43 arg5, int arg6, int arg7) {
        field1918++;
        long var9 = (long) arg1 | (long) (arg0 << 16) | (long) arg7 << 32;
        if (arg2 > -123) {
            return (class96) null;
        }
        class96 var11 = (class96) class232.field3843.method2329((byte) 107, var9);
        if (var11 == null) {
            class114[] var12 = new class114[3];
            int var13 = 0;
            if (!class309.method2193((byte) 93, arg1).method1427(0) || !class309.method2193((byte) 93, arg0).method1427(0) || !class309.method2193((byte) 93, arg7).method1427(0)) {
                return null;
            }
            class114 var14 = class309.method2193((byte) 93, arg1).method1424(127);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class114 var15 = class309.method2193((byte) 93, arg0).method1424(120);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class114 var16 = class309.method2193((byte) 93, arg7).method1424(115);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class114 var17 = new class114(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field1932[var18] < class336.field5316[var18].length) {
                    var17.method885(class255.field4302[var18], class336.field5316[var18][this.field1932[var18]]);
                }
                if (this.field1932[var18] < class41.field598[var18].length) {
                    var17.method885(class195.field3104[var18], class41.field598[var18][this.field1932[var18]]);
                }
            }
            var11 = var17.method880(64, 768, -50, -10, -50);
            class232.field3843.method2333(var9, 0, var11);
        }
        if (arg5 != null) {
            var11 = arg5.method318(-31, var11, arg6, arg3, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 775)
    private final void method901(int arg0) {
        field1919++;
        long var2 = this.field1924;
        this.field1924 = -1L;
        long[] var4 = class233.field3876;
        this.field1924 = var4[(int) ((this.field1924 ^ (long) (this.field1917 >> 8)) & 0xFFL)] ^ this.field1924 >>> 8;
        this.field1924 = this.field1924 >>> 8 ^ var4[(int) (((long) this.field1917 ^ this.field1924) & 0xFFL)];
        if (arg0 > -70) {
            this.field1928 = (int[][]) ((int[][]) null);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1924 = this.field1924 >>> 8 ^ var4[(int) ((this.field1924 ^ (long) (this.field1929[var5] >> 24)) & 0xFFL)];
            this.field1924 = this.field1924 >>> 8 ^ var4[(int) (((long) (this.field1929[var5] >> 16) ^ this.field1924) & 0xFFL)];
            this.field1924 = var4[(int) (((long) (this.field1929[var5] >> 8) ^ this.field1924) & 0xFFL)] ^ this.field1924 >>> 8;
            this.field1924 = var4[(int) (((long) this.field1929[var5] ^ this.field1924) & 0xFFL)] ^ this.field1924 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1924 = var4[(int) (((long) this.field1932[var6] ^ this.field1924) & 0xFFL)] ^ this.field1924 >>> 8;
        }
        this.field1924 = this.field1924 >>> 8 ^ var4[(int) (((long) (this.field1935 ? 1 : 0) ^ this.field1924) & 0xFFL)];
        if (var2 != 0L && this.field1924 != var2) {
            class326.field5176.method2325(var2, 83);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)V", line = 829)
    public final void method902(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method903((byte) -4, 70, -2);
        }
        this.field1932[arg2] = arg0;
        this.method901(-109);
        field1926++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)V", line = 841)
    public final void method903(byte arg0, int arg1, int arg2) {
        field1921++;
        int var4 = -112 % ((6 - arg0) / 40);
        int var5 = class165.field2622[arg2];
        if (this.field1929[var5] != 0 && class309.method2193((byte) 93, arg1) != null) {
            this.field1929[var5] = class75.method624(Integer.MIN_VALUE, arg1);
            this.method901(-96);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 860)
    public static final void method904(int arg0) {
        if (class235.field3904 != null) {
            class179 var1 = new class179();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class235.field3904[var2][var3] = var1;
                }
            }
        }
        field1922++;
        if (arg0 != 1692185840) {
            method905(-16);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 898)
    public static void method905(int arg0) {
        field1933 = null;
        if (arg0 != -28584) {
            field1933 = (class353) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V", line = 909)
    public final void method906(boolean arg0, byte arg1) {
        if (arg1 >= -9) {
            this.field1930 = 29;
        }
        this.field1935 = arg0;
        field1937++;
        this.method901(-73);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I", line = 926)
    public final int method907(int arg0) {
        if (arg0 == 1073741824) {
            field1925++;
            return this.field1930 == -1 ? (this.field1929[8] << 10) + (this.field1932[4] << 20) + ((this.field1932[0] << 25) - -(this.field1929[0] << 15)) - (-(this.field1929[11] << 5) + -this.field1929[1]) : class222.method1683(42, this.field1930).field2083 + 305419896;
        } else {
            return -32;
        }
    }
}

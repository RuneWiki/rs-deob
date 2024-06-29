import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class44 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field929 = 100;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lud;")
    public static class279 field931 = class130.method1024("Veuillez patienter )2 tentative de r-Btablissement)3", 255);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "J")
    private long field928;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "J")
    private long field935;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lok;")
    public static class149 field923;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lig;")
    public static class175 field936;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
    public boolean field932;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[I")
    public static int[] field915;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    private int[] field921;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[[I")
    private int[][] field927;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[I[IZI)V", line = 6)
    public final void method369(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4, int arg5) {
        field918++;
        if (this.field933 != arg5) {
            this.field933 = arg5;
            this.field927 = (int[][]) null;
        }
        if (arg0 != -7277) {
            this.field928 = 5L;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class249.field4445; var8++) {
                    class323 var9 = class5.method31(var8, 123);
                    if (var9 != null && !var9.field5635 && var9.field5655 == (arg4 ? class323.field5643[var7] : class218.field3853[var7])) {
                        arg2[class252.field4494[var7]] = class301.method2139(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field920 = arg1;
        this.field921 = arg3;
        this.field919 = arg2;
        this.field932 = arg4;
        this.method372(1189213416);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBIILdb;)Lga;", line = 63)
    public final class19 method370(int arg0, byte arg1, int arg2, int arg3, class182 arg4) {
        field917++;
        if (this.field920 != -1) {
            return class150.method1198(this.field920, 28).method1002(arg0, arg3, (byte) -96, arg2, arg4);
        }
        class19 var6 = (class19) class312.field5519.method1336(this.field928, 0);
        int var7 = -45 / ((arg1 + 63) / 60);
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var10 = this.field919[var9];
                if ((var10 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var10) != 0 && !class5.method31(var10 & 0x3FFFFFFF, 108).method2276((byte) -57)) {
                        var8 = true;
                    }
                } else if (!class220.method1612(-2254, var10 & 0x3FFFFFFF).method1224((byte) -80, this.field932)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            int var11 = 0;
            class148[] var12 = new class148[12];
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = this.field919[var13];
                if ((var14 & 0x40000000) != 0) {
                    class148 var16 = class220.method1612(-2254, var14 & 0x3FFFFFFF).method1234(0, this.field932);
                    if (var16 != null) {
                        var12[var11++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class148 var15 = class5.method31(var14 & 0x3FFFFFFF, 121).method2273(-114);
                    if (var15 != null) {
                        var12[var11++] = var15;
                    }
                }
            }
            class148 var17 = new class148(var12, var11);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field921[var18] < class223.field3939[var18].length) {
                    var17.method1140(class212.field3718[var18], class223.field3939[var18][this.field921[var18]]);
                }
                if (class78.field1500[var18].length > this.field921[var18]) {
                    var17.method1140(class140.field2550[var18], class78.field1500[var18][this.field921[var18]]);
                }
            }
            var6 = var17.method1144(64, 768, -50, -10, -50);
            class312.field5519.method1331(var6, 30237, this.field928);
        }
        if (arg4 != null) {
            var6 = arg4.method1412(var6, arg3, arg2, arg0, (byte) -20);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I", line = 175)
    public final int method371(int arg0) {
        field924++;
        if (arg0 > -63) {
            method384((byte) 26);
        }
        return this.field920 == -1 ? (this.field921[0] << 25) + (this.field919[0] << 15) + (this.field919[11] << 5) + (this.field921[4] << 20) + (this.field919[8] << 10) + this.field919[1] : class150.method1198(this.field920, 20).field2327 + 305419896;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 199)
    private final void method372(int arg0) {
        field926++;
        long var2 = this.field928;
        this.field928 = -1L;
        long[] var4 = class161.field2908;
        this.field928 = this.field928 >>> 8 ^ var4[(int) (((long) (this.field933 >> 8) ^ this.field928) & 0xFFL)];
        this.field928 = this.field928 >>> 8 ^ var4[(int) (((long) this.field933 ^ this.field928) & 0xFFL)];
        int var5 = 0;
        if (arg0 != 1189213416) {
            return;
        }
        while (var5 < 12) {
            this.field928 = this.field928 >>> 8 ^ var4[(int) ((this.field928 ^ (long) (this.field919[var5] >> 24)) & 0xFFL)];
            this.field928 = var4[(int) (((long) (this.field919[var5] >> 16) ^ this.field928) & 0xFFL)] ^ this.field928 >>> 8;
            this.field928 = var4[(int) ((this.field928 ^ (long) (this.field919[var5] >> 8)) & 0xFFL)] ^ this.field928 >>> 8;
            this.field928 = var4[(int) (((long) this.field919[var5] ^ this.field928) & 0xFFL)] ^ this.field928 >>> 8;
            var5++;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field928 = this.field928 >>> 8 ^ var4[(int) ((this.field928 ^ (long) this.field921[var6]) & 0xFFL)];
        }
        this.field928 = this.field928 >>> 8 ^ var4[(int) ((this.field928 ^ (long) (this.field932 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field928 != var2) {
            class84.field1591.method1335((byte) 106, var2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIZILdb;Ldb;I[Ljh;)Lga;", line = 241)
    public final class19 method373(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class182 arg7, class182 arg8, int arg9, class266[] arg10) {
        field914++;
        if (this.field920 != -1) {
            return class150.method1198(this.field920, 32).method994(arg1, arg4, arg8, arg0, arg10, (byte) 73, arg6, arg3, arg2, arg7);
        }
        long var12 = this.field928;
        int[] var14 = this.field919;
        if (arg8 != null && (arg8.field3324 >= 0 || arg8.field3338 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field919[var15];
            }
            if (arg8.field3324 >= 0) {
                if (arg8.field3324 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class301.method2139(arg8.field3324, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg8.field3338 >= 0) {
                if (arg8.field3338 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class301.method2139(arg8.field3338, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class19 var16 = (class19) class84.field1591.method1336(var12, arg9 ^ arg9);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class5.method31(var19 & 0x3FFFFFFF, 116).method2271(116)) {
                        var17 = true;
                    }
                } else if (!class220.method1612(-2254, var19 & 0x3FFFFFFF).method1223(this.field932, -31838)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field935 != -1L) {
                    var16 = (class19) class84.field1591.method1336(this.field935, 0);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class148[] var20 = new class148[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class148 var24 = class220.method1612(-2254, var22 & 0x3FFFFFFF).method1228(5384, this.field932);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class148 var23 = class5.method31(var22 & 0x3FFFFFFF, arg9 ^ 0xFFFFFFD6).method2275((byte) 81);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class34 var25 = null;
                if (this.field933 != -1) {
                    var25 = class100.method853(1282, this.field933);
                }
                if (var25 != null && var25.field766 != null) {
                    for (int var26 = 0; var26 < var25.field766.length; var26++) {
                        if (var25.field766[var26] != null && var20[var26] != null) {
                            int var27 = var25.field766[var26][0];
                            int var28 = var25.field766[var26][1];
                            int var29 = var25.field766[var26][4];
                            int var30 = var25.field766[var26][2];
                            int var31 = var25.field766[var26][5];
                            int var32 = var25.field766[var26][3];
                            if (this.field927 == null) {
                                this.field927 = new int[var25.field766.length][];
                            }
                            if (this.field927[var26] == null) {
                                int[] var33 = this.field927[var26] = new int[15];
                                if (var32 == 0 && var29 == 0 && var31 == 0) {
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[12] = -var27;
                                    var33[13] = -var28;
                                    var33[14] = -var30;
                                } else {
                                    int var34 = class27.field642[var32] >> 1;
                                    int var35 = class27.field654[var32] >> 1;
                                    int var36 = class27.field642[var29] >> 1;
                                    int var37 = class27.field654[var29] >> 1;
                                    int var38 = class27.field642[var31] >> 1;
                                    int var39 = class27.field654[var31] >> 1;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    var33[5] = -var35;
                                    int var40 = var35 * var38 + 16384 >> 15;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    var33[7] = -var37 * -var39 + var36 * var40 + 16384 >> 15;
                                    var33[1] = -var39 * var36 + (var37 * var40) + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + (var33[4] * -var28) + (var33[7] * -var30) + 16384 >> 15;
                                    int var41 = var35 * var39 + 16384 >> 15;
                                    var33[0] = var36 * var38 + var37 * var41 + 16384 >> 15;
                                    var33[6] = -var37 * var38 + var36 * var41 + 16384 >> 15;
                                    var33[12] = var33[3] * -var28 + var33[0] * -var27 + var33[6] * -var30 + 16384 >> 15;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    var33[14] = var33[5] * -var28 + var33[2] * -var27 - (-(var33[8] * -var30) - 16384) >> 15;
                                }
                                var33[9] = var27;
                                var33[10] = var28;
                                var33[11] = var30;
                            }
                            if (var32 != 0 || var29 != 0 || var31 != 0) {
                                var20[var26].method1145(var32, var29, var31);
                            }
                            if (var27 != 0 || var28 != 0 || var30 != 0) {
                                var20[var26].method1153(var27, var28, var30);
                            }
                        }
                    }
                }
                class148 var42 = new class148(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class223.field3939[var43].length > this.field921[var43]) {
                        var42.method1140(class212.field3718[var43], class223.field3939[var43][this.field921[var43]]);
                    }
                    if (this.field921[var43] < class78.field1500[var43].length) {
                        var42.method1140(class140.field2550[var43], class78.field1500[var43][this.field921[var43]]);
                    }
                }
                var16 = var42.method1144(64, 850, -30, -50, -30);
                if (class97.field1824) {
                    ((class299) var16).method2126(false, false, true, true, false, false, true);
                }
                if (arg5) {
                    class84.field1591.method1331(var16, 30237, var12);
                    this.field935 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg10 == null ? 0 : arg10.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg10[var49] != null) {
                class182 var50 = class131.method1033((byte) -82, arg10[var49].field4783);
                if (var50.field3341 != null) {
                    class320.field5594[var49] = var50;
                    var44 = true;
                    int var51 = arg10[var49].field4787;
                    int var52 = arg10[var49].field4796;
                    int var53 = var50.field3341[var52];
                    class312.field5525[var49] = class17.method153(var53 >>> 16, true);
                    int var54 = var53 & 0xFFFF;
                    class244.field4328[var49] = var54;
                    if (class312.field5525[var49] != null) {
                        var45 |= class312.field5525[var49].method1545(var54, false);
                        var48 |= class312.field5525[var49].method1549(4096, var54);
                        var46 |= var50.field3336;
                    }
                    if ((var50.field3331 || class293.field5234) && var51 != -1 && var51 < var50.field3341.length) {
                        class45.field953[var49] = var50.field3318[var52];
                        class21.field582[var49] = arg10[var49].field4789;
                        int var55 = var50.field3341[var51];
                        class34.field775[var49] = class17.method153(var55 >>> 16, true);
                        int var56 = var55 & 0xFFFF;
                        class282.field5037[var49] = var56;
                        if (class34.field775[var49] != null) {
                            var45 |= class34.field775[var49].method1545(var56, false);
                            var48 |= class34.field775[var49].method1549(4096, var56);
                        }
                    } else {
                        class45.field953[var49] = 0;
                        class21.field582[var49] = 0;
                        class34.field775[var49] = null;
                        class282.field5037[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg8 == null && arg7 == null) {
            return var16;
        }
        int var57 = -1;
        class211 var58 = null;
        int var59 = 0;
        int var60 = -1;
        class211 var61 = null;
        if (arg8 != null) {
            int var62 = arg8.field3341[arg2];
            int var63 = var62 >>> 16;
            var58 = class17.method153(var63, true);
            var60 = var62 & 0xFFFF;
            if (var58 != null) {
                var45 |= var58.method1545(var60, false);
                var48 |= var58.method1549(4096, var60);
                var46 |= arg8.field3336;
            }
            if ((arg8.field3331 || class293.field5234) && arg3 != -1 && arg3 < arg8.field3341.length) {
                var59 = arg8.field3318[arg2];
                int var64 = arg8.field3341[arg3];
                int var65 = var64 >>> 16;
                var57 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var58;
                } else {
                    var61 = class17.method153(var57 >>> 16, true);
                }
                if (var61 != null) {
                    var45 |= var61.method1545(var57, false);
                    var48 |= var61.method1549(4096, var57);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class211 var69 = null;
        class211 var70 = null;
        if (arg7 != null) {
            int var71 = arg7.field3341[arg4];
            int var72 = var71 >>> 16;
            var66 = var71 & 0xFFFF;
            var69 = class17.method153(var72, true);
            if (var69 != null) {
                var45 |= var69.method1545(var66, false);
                var48 |= var69.method1549(4096, var66);
                var46 |= arg7.field3336;
            }
            if ((arg7.field3331 || class293.field5234) && arg0 != -1 && arg7.field3341.length > arg0) {
                var68 = arg7.field3318[arg4];
                int var73 = arg7.field3341[arg0];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class17.method153(var67 >>> 16, true);
                }
                if (var70 != null) {
                    var45 |= var70.method1545(var67, false);
                    var48 |= var70.method1549(4096, var67);
                }
            }
        }
        class19 var75 = var16.method159(!var48, !var45, !var46);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var47) {
            if (class312.field5525[var76] != null) {
                var75.method167(class312.field5525[var76], class244.field4328[var76], class34.field775[var76], class282.field5037[var76], class21.field582[var76] - 1, class45.field953[var76], var77, class320.field5594[var76].field3336, this.field927[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var58 != null && var69 != null) {
            var75.method178(var58, var60, var61, var57, arg1 - 1, var59, var69, var66, var70, var67, arg6 - 1, var68, arg8.field3326, arg7.field3336 | arg8.field3336);
        } else if (var58 != null) {
            var75.method174(var58, var60, var61, var57, arg1 - 1, var59, arg8.field3336);
        } else if (var69 != null) {
            var75.method174(var69, var66, var70, var67, arg6 - 1, var68, arg7.field3336);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class312.field5525[var78] = null;
            class34.field775[var78] = null;
            class320.field5594[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BBII)I", line = 716)
    public static final int method374(byte[] arg0, byte arg1, int arg2, int arg3) {
        field937++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class265.field4777[(arg0[var5] ^ var4) & 0xFF];
        }
        if (arg1 != -55) {
            field923 = (class149) null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)V", line = 740)
    public final void method375(int arg0, byte arg1, int arg2) {
        field912++;
        int var4 = class252.field4494[arg2];
        if (this.field919[var4] != 0 && arg1 >= 80 && class5.method31(arg0, 26) != null) {
            this.field919[var4] = class301.method2139(arg0, Integer.MIN_VALUE);
            this.method372(1189213416);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBI)I", line = 763)
    public static final int method376(int arg0, int arg1, byte arg2, int arg3) {
        field922++;
        int var4 = class27.field645[class242.method1737(arg1, arg0)];
        if (arg2 != 41) {
            return -100;
        }
        if (arg3 > 0) {
            int var5 = class27.field656.method325(arg3 & 0xFFFF, arg2 + 214);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg0 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class27.field656.method326(-108, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF00) >> 8) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var10 & 0x2B00FF00) << 8) - (-(var12 & 0xFF00) - (var11 >> 8));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 834)
    public static void method377(int arg0) {
        field923 = null;
        field915 = null;
        field936 = null;
        field931 = null;
        if (arg0 != 190292624) {
            field931 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 854)
    public final void method378(int arg0, int arg1, int arg2) {
        field913++;
        if (arg0 <= 6) {
            field931 = (class279) null;
        }
        this.field921[arg1] = arg2;
        this.method372(1189213416);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V", line = 869)
    public final void method379(boolean arg0, int arg1) {
        field930++;
        if (arg1 != 16771) {
            this.method380(-5, 114, 10, (class182) null, 8, -123, -41, -84);
        }
        this.field932 = arg0;
        this.method372(1189213416);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILdb;IIII)Lga;", line = 883)
    public final class19 method380(int arg0, int arg1, int arg2, class182 arg3, int arg4, int arg5, int arg6, int arg7) {
        field939++;
        long var9 = (long) arg0 << 32 | (long) (arg4 << 16) | (long) arg6;
        if (arg7 >= -4) {
            field936 = (class175) null;
        }
        class19 var11 = (class19) class312.field5519.method1336(var9, 0);
        if (var11 == null) {
            class148[] var12 = new class148[3];
            int var13 = 0;
            if (!class5.method31(arg6, 62).method2276((byte) -57) || !class5.method31(arg4, 121).method2276((byte) -57) || !class5.method31(arg0, 34).method2276((byte) -57)) {
                return null;
            }
            class148 var14 = class5.method31(arg6, 64).method2273(-112);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class148 var15 = class5.method31(arg4, 54).method2273(-123);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class148 var16 = class5.method31(arg0, 125).method2273(-104);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class148 var17 = new class148(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class223.field3939[var18].length > this.field921[var18]) {
                    var17.method1140(class212.field3718[var18], class223.field3939[var18][this.field921[var18]]);
                }
                if (this.field921[var18] < class78.field1500[var18].length) {
                    var17.method1140(class140.field2550[var18], class78.field1500[var18][this.field921[var18]]);
                }
            }
            var11 = var17.method1144(64, 768, -50, -10, -50);
            class312.field5519.method1331(var11, 30237, var9);
        }
        if (arg3 != null) {
            var11 = arg3.method1412(var11, arg5, arg1, arg2, (byte) -74);
        }
        return var11;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLud;)V", line = 953)
    public static final void method381(int arg0, boolean arg1, class279 arg2) {
        short[] var3 = new short[16];
        class279 var4 = arg2.method2002((byte) -94);
        field938++;
        if (arg0 != 2) {
            field923 = (class149) null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < class321.field5614; var6++) {
            class157 var7 = class220.method1612(arg0 - 2256, var6);
            if ((!arg1 || var7.field2838) && var7.field2884 == -1 && var7.field2867 == -1 && var7.field2883 == 0 && var7.field2861.method2002((byte) -94).method1989(var4, (byte) -72) != -1) {
                if (var5 >= 250) {
                    class84.field1602 = null;
                    class309.field5484 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class309.field5484 = var5;
        class280.field5004 = 0;
        class84.field1602 = var3;
        class279[] var10 = new class279[class309.field5484];
        for (int var11 = 0; var11 < class309.field5484; var11++) {
            var10[var11] = class220.method1612(-2254, var3[var11]).field2861;
        }
        class278.method1965(class84.field1602, (byte) 57, var10);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lgf;II)I", line = 1040)
    public static final int method382(class8 arg0, int arg1, int arg2) {
        field934++;
        if (arg0.field161 == null || arg0.field161.length <= arg1) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg0.field161[arg1];
            if (arg2 != -2148) {
                return -45;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var4[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 1) {
                    var7 = class200.field3576[var4[var5++]];
                }
                if (var8 == 2) {
                    var7 = class104.field1955[var4[var5++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 3) {
                    var7 = class48.field972[var4[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class8 var12 = class273.method1940(var11, -104);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class220.method1612(arg2 - 106, var13).field2843 || class221.field3894)) {
                        for (int var14 = 0; var14 < var12.field319.length; var14++) {
                            if (var13 + 1 == var12.field319[var14]) {
                                var7 += var12.field332[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class326.field5679[var4[var5++]];
                }
                if (var8 == 6) {
                    var7 = class250.field4452[class104.field1955[var4[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class326.field5679[var4[var5++]] * 100 / 46875;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 8) {
                    var7 = class72.field1420.field4196;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class159.field2893[var15]) {
                            var7 += class104.field1955[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class8 var18 = class273.method1940(var17, 109);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class220.method1612(-2254, var19).field2843 || class221.field3894)) {
                        for (int var20 = 0; var20 < var18.field319.length; var20++) {
                            if (var19 + 1 == var18.field319[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class90.field1707;
                }
                if (var8 == 12) {
                    var7 = class322.field5628;
                }
                if (var8 == 13) {
                    int var21 = class326.field5679[var4[var5++]];
                    int var22 = var4[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var5++];
                    var7 = class196.method1463(var23, (byte) 105);
                }
                if (var8 == 18) {
                    var7 = (class72.field1420.field86 >> 7) + class112.field2058;
                }
                if (var8 == 19) {
                    var7 = (class72.field1420.field79 >> 7) + class12.field396;
                }
                if (var8 == 20) {
                    var7 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var7;
                    }
                    if (var6 == 1) {
                        var3 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var6 == 3) {
                        var3 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)Lck;", line = 1256)
    public static final class235 method383(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3454;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 1265)
    public static final void method384(byte arg0) {
        field916++;
        class84.field1591.method1334((byte) -25);
        if (arg0 != -11) {
            field923 = (class149) null;
        }
        class312.field5519.method1334((byte) -25);
    }
}

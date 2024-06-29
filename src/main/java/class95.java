import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class95 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "[I")
    public static int[] field1439 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1440 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1429 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "J")
    private long field1426;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "J")
    private long field1441;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Z")
    public boolean field1432;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[I")
    public static int[] field1418;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
    public int[] field1424;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "[I")
    private int[] field1435;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[[I")
    private int[][] field1434;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method672(int arg0, String arg1) {
        field1420++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = arg0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        this.field1424[arg2] = arg0;
        field1422++;
        this.method677(arg1);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method674(byte arg0, int arg1) {
        field1431++;
        if (arg1 < 999999999) {
            return Integer.toString(arg1);
        } else {
            if (arg0 != 115) {
                method672(89, (String) null);
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lni;IILni;IBZII[Lvc;I)Lue;")
    public final class13 method675(class21 arg0, int arg1, int arg2, class21 arg3, int arg4, byte arg5, boolean arg6, int arg7, int arg8, class171[] arg9, int arg10) {
        field1428++;
        if (this.field1438 != -1) {
            return class104.method741((byte) -55, this.field1438).method1800(arg4, 1, arg10, arg8, arg0, arg7, arg2, arg1, arg9, arg3);
        }
        long var12 = this.field1441;
        int[] var14 = this.field1435;
        if (arg3 != null && (arg3.field262 >= 0 || arg3.field246 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field1435[var15];
            }
            if (arg3.field262 >= 0) {
                if (arg3.field262 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class45.method348(1073741824, arg3.field262);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field246 >= 0) {
                if (arg3.field246 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class45.method348(arg3.field246, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class13 var16 = (class13) class79.field1092.method1839((byte) 35, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class297.method1987(-77, var43 & 0x3FFFFFFF).method689(0)) {
                        var17 = true;
                    }
                } else if (!class64.method514(var43 & 0x3FFFFFFF, 0).method1403(0, this.field1432)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field1426 != -1L) {
                    var16 = (class13) class79.field1092.method1839((byte) 95, this.field1426);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class158[] var19 = new class158[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class158 var42 = class64.method514(var40 & 0x3FFFFFFF, 0).method1412(this.field1432, -1);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class158 var41 = class297.method1987(-119, var40 & 0x3FFFFFFF).method693(0);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class177 var21 = null;
                if (this.field1430 != -1) {
                    var21 = class120.method843(false, this.field1430);
                }
                if (var21 != null && var21.field2859 != null) {
                    for (int var22 = 0; var22 < var21.field2859.length; var22++) {
                        if (var21.field2859[var22] != null && var19[var22] != null) {
                            int var23 = var21.field2859[var22][0];
                            int var24 = var21.field2859[var22][1];
                            int var25 = var21.field2859[var22][3];
                            int var26 = var21.field2859[var22][4];
                            int var27 = var21.field2859[var22][5];
                            int var28 = var21.field2859[var22][2];
                            if (this.field1434 == null) {
                                this.field1434 = new int[var21.field2859.length][];
                            }
                            if (this.field1434[var22] == null) {
                                int[] var29 = this.field1434[var22] = new int[15];
                                if (var25 == 0 && var26 == 0 && var27 == 0) {
                                    var29[12] = -var23;
                                    var29[13] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var28;
                                } else {
                                    int var30 = class145.field2348[var25] >> 1;
                                    int var31 = class145.field2338[var25] >> 1;
                                    int var32 = class145.field2338[var26] >> 1;
                                    int var33 = class145.field2348[var27] >> 1;
                                    int var34 = class145.field2348[var26] >> 1;
                                    int var35 = class145.field2338[var27] >> 1;
                                    var29[8] = var30 * var34 + 16384 >> 15;
                                    var29[4] = var30 * var33 + 16384 >> 15;
                                    var29[3] = var30 * var35 + 16384 >> 15;
                                    int var36 = var31 * var35 + 16384 >> 15;
                                    var29[2] = var30 * var32 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[0] = var33 * var34 + (var32 * var36) + 16384 >> 15;
                                    var29[14] = var29[2] * -var23 + var29[5] * -var24 + var29[8] * -var28 + 16384 >> 15;
                                    int var37 = var31 * var33 + 16384 >> 15;
                                    var29[7] = -var32 * -var35 + var34 * var37 + 16384 >> 15;
                                    var29[6] = -var32 * var33 + var34 * var36 + 16384 >> 15;
                                    var29[1] = -var35 * var34 + var32 * var37 + 16384 >> 15;
                                    var29[13] = var29[4] * -var24 + var29[1] * -var23 + var29[7] * -var28 + 16384 >> 15;
                                    var29[12] = var29[3] * -var24 + var29[0] * -var23 + var29[6] * -var28 + 16384 >> 15;
                                }
                                var29[11] = var28;
                                var29[9] = var23;
                                var29[10] = var24;
                            }
                            if (var25 != 0 || var26 != 0 || var27 != 0) {
                                var19[var22].method1075(var25, var26, var27);
                            }
                            if (var23 != 0 || var24 != 0 || var28 != 0) {
                                var19[var22].method1081(var23, var24, var28);
                            }
                        }
                    }
                }
                class158 var38 = new class158(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field1424[var39] < class119.field2015[var39].length) {
                        var38.method1089(class226.field3576[var39], class119.field2015[var39][this.field1424[var39]]);
                    }
                    if (this.field1424[var39] < class287.field4567[var39].length) {
                        var38.method1089(class34.field411[var39], class287.field4567[var39][this.field1424[var39]]);
                    }
                }
                var16 = var38.method1090(64, 850, -30, -50, -30);
                if (arg6) {
                    class79.field1092.method1830(var12, -75, var16);
                    this.field1426 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg9 == null ? 0 : arg9.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg9[var49] != null) {
                class21 var73 = class267.method1812((byte) 89, arg9[var49].field2762);
                if (var73.field237 != null) {
                    class82.field1139[var49] = var73;
                    var44 = true;
                    int var74 = arg9[var49].field2765;
                    int var75 = var73.field237[var74];
                    int var76 = arg9[var49].field2759;
                    class150.field2401[var49] = class9.method56(var75 >>> 16, 1545049680);
                    int var77 = var75 & 0xFFFF;
                    class26.field312[var49] = var77;
                    if (class150.field2401[var49] != null) {
                        var46 |= class150.field2401[var49].method60(var77, 71);
                        var45 |= class150.field2401[var49].method63(1, var77);
                        var47 |= var73.field250;
                    }
                    if ((var73.field243 || class51.field712) && var76 != -1 && var76 < var73.field237.length) {
                        class120.field2020[var49] = var73.field240[var74];
                        class1.field18[var49] = arg9[var49].field2754;
                        int var78 = var73.field237[var76];
                        class224.field3555[var49] = class9.method56(var78 >>> 16, 1545049680);
                        int var79 = var78 & 0xFFFF;
                        class102.field1542[var49] = var79;
                        if (class224.field3555[var49] != null) {
                            var46 |= class224.field3555[var49].method60(var79, 81);
                            var45 |= class224.field3555[var49].method63(1, var79);
                        }
                    } else {
                        class120.field2020[var49] = 0;
                        class1.field18[var49] = 0;
                        class224.field3555[var49] = null;
                        class102.field1542[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg0 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 46 / ((88 - arg5) / 33);
        class10 var53 = null;
        int var54 = 0;
        class10 var55 = null;
        if (arg3 != null) {
            int var56 = arg3.field237[arg1];
            int var57 = var56 >>> 16;
            var55 = class9.method56(var57, 1545049680);
            var51 = var56 & 0xFFFF;
            if (var55 != null) {
                var46 |= var55.method60(var51, 121);
                var45 |= var55.method63(1, var51);
                var47 |= arg3.field250;
            }
            if ((arg3.field243 || class51.field712) && arg4 != -1 && arg4 < arg3.field237.length) {
                var54 = arg3.field240[arg1];
                int var58 = arg3.field237[arg4];
                int var59 = var58 >>> 16;
                var50 = var58 & 0xFFFF;
                if (var57 == var59) {
                    var53 = var55;
                } else {
                    var53 = class9.method56(var50 >>> 16, 1545049680);
                }
                if (var53 != null) {
                    var46 |= var53.method60(var50, -93);
                    var45 |= var53.method63(1, var50);
                }
            }
        }
        int var60 = -1;
        int var61 = -1;
        class10 var62 = null;
        class10 var63 = null;
        int var64 = 0;
        if (arg0 != null) {
            int var65 = arg0.field237[arg2];
            int var66 = var65 >>> 16;
            var60 = var65 & 0xFFFF;
            var62 = class9.method56(var66, 1545049680);
            if (var62 != null) {
                var46 |= var62.method60(var60, -97);
                var45 |= var62.method63(1, var60);
                var47 |= arg0.field250;
            }
            if ((arg0.field243 || class51.field712) && arg8 != -1 && arg8 < arg0.field237.length) {
                int var67 = arg0.field237[arg8];
                var64 = arg0.field240[arg2];
                int var68 = var67 >>> 16;
                var61 = var67 & 0xFFFF;
                if (var66 == var68) {
                    var63 = var62;
                } else {
                    var63 = class9.method56(var61 >>> 16, 1545049680);
                }
                if (var63 != null) {
                    var46 |= var63.method60(var61, 124);
                    var45 |= var63.method63(1, var61);
                }
            }
        }
        class13 var69 = var16.method75(!var45, !var46, !var47);
        int var70 = 1;
        for (int var71 = 0; var71 < var48; var71++) {
            if (class150.field2401[var71] != null) {
                var69.method87(class150.field2401[var71], class26.field312[var71], class224.field3555[var71], class102.field1542[var71], class1.field18[var71] - 1, class120.field2020[var71], var70, class82.field1139[var71].field250, this.field1434[var71]);
            }
            var70 <<= 0x1;
        }
        if (var55 != null && var62 != null) {
            var69.method103(var55, var51, var53, var50, arg10 - 1, var54, var62, var60, var63, var61, arg7 - 1, var64, arg3.field252, arg3.field250 | arg0.field250);
        } else if (var55 != null) {
            var69.method105(var55, var51, var53, var50, arg10 - 1, var54, arg3.field250);
        } else if (var62 != null) {
            var69.method105(var62, var60, var63, var61, arg7 - 1, var64, arg0.field250);
        }
        for (int var72 = 0; var72 < var48; var72++) {
            class150.field2401[var72] = null;
            class224.field3555[var72] = null;
            class82.field1139[var72] = null;
        }
        return var69;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[IZI[II)V")
    public final void method676(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, int arg5) {
        if (this.field1430 != arg3) {
            this.field1430 = arg3;
            this.field1434 = null;
        }
        if (arg0 != Integer.MIN_VALUE) {
            method674((byte) 116, 78);
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class22.field276; var8++) {
                    class96 var9 = class297.method1987(98, var8);
                    if (var9 != null && !var9.field1445 && var9.field1449 == (arg2 ? field1439[var7] : class5.field61[var7])) {
                        arg4[class291.field4645[var7]] = class45.method348(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1432 = arg2;
        this.field1424 = arg1;
        this.field1435 = arg4;
        field1419++;
        this.field1438 = arg5;
        this.method677(0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    private final void method677(int arg0) {
        long var2 = this.field1441;
        field1437++;
        this.field1441 = -1L;
        long[] var4 = class150.field2408;
        this.field1441 = this.field1441 >>> 8 ^ var4[(int) (((long) (this.field1430 >> 8) ^ this.field1441) & 0xFFL)];
        this.field1441 = this.field1441 >>> 8 ^ var4[(int) ((this.field1441 ^ (long) this.field1430) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1441 = this.field1441 >>> 8 ^ var4[(int) (((long) (this.field1435[var5] >> 24) ^ this.field1441) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var4[(int) (((long) (this.field1435[var5] >> 16) ^ this.field1441) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var4[(int) ((this.field1441 ^ (long) (this.field1435[var5] >> 8)) & 0xFFL)];
            this.field1441 = this.field1441 >>> 8 ^ var4[(int) (((long) this.field1435[var5] ^ this.field1441) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1441 = var4[(int) (((long) this.field1424[var6] ^ this.field1441) & 0xFFL)] ^ this.field1441 >>> 8;
        }
        this.field1441 = this.field1441 >>> 8 ^ var4[(int) (((long) (this.field1432 ? 1 : 0) ^ this.field1441) & 0xFFL)];
        if ((long) arg0 != var2 && this.field1441 != var2) {
            class79.field1092.method1836(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1418 = null;
        field1439 = null;
        int var1 = 80 % ((-arg0 - 53) / 53);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class38 var20 = new class38(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class273.field4415[var21][arg1][arg2] == null) {
                    class273.field4415[var21][arg1][arg2] = new class99(var21, arg1, arg2);
                }
            }
            class273.field4415[arg0][arg1][arg2].field1510 = var20;
        } else if (arg3 == 1) {
            class38 var22 = new class38(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class273.field4415[var23][arg1][arg2] == null) {
                    class273.field4415[var23][arg1][arg2] = new class99(var23, arg1, arg2);
                }
            }
            class273.field4415[arg0][arg1][arg2].field1510 = var22;
        } else {
            class47 var24 = new class47(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class273.field4415[var25][arg1][arg2] == null) {
                    class273.field4415[var25][arg1][arg2] = new class99(var25, arg1, arg2);
                }
            }
            class273.field4415[arg0][arg1][arg2].field1498 = var24;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
    public final void method680(int arg0, int arg1, int arg2) {
        if (arg1 != 1073741823) {
            this.field1432 = true;
        }
        field1427++;
        int var4 = class291.field4645[arg2];
        if (this.field1435[var4] != 0 && class297.method1987(-127, arg0) != null) {
            this.field1435[var4] = class45.method348(Integer.MIN_VALUE, arg0);
            this.method677(0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    public final void method681(boolean arg0, int arg1) {
        this.field1432 = arg0;
        field1433++;
        this.method677(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lni;BIII)Lue;")
    public final class13 method682(class21 arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 97) {
            field1417 = -23;
        }
        field1423++;
        if (this.field1438 != -1) {
            return class104.method741((byte) -49, this.field1438).method1802(arg3, arg4, -90, arg2, arg0);
        }
        class13 var6 = (class13) class196.field3166.method1839((byte) 117, this.field1441);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field1435[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class297.method1987(-106, var17 & 0x3FFFFFFF).method687(false)) {
                        var7 = true;
                    }
                } else if (!class64.method514(var17 & 0x3FFFFFFF, 0).method1407(0, this.field1432)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class158[] var9 = new class158[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field1435[var11];
                if ((var14 & 0x40000000) != 0) {
                    class158 var15 = class64.method514(var14 & 0x3FFFFFFF, 0).method1414(-1, this.field1432);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class158 var16 = class297.method1987(-99, var14 & 0x3FFFFFFF).method690(arg1 ^ 0xFFFFEAFD);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class158 var12 = new class158(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class119.field2015[var13].length > this.field1424[var13]) {
                    var12.method1089(class226.field3576[var13], class119.field2015[var13][this.field1424[var13]]);
                }
                if (class287.field4567[var13].length > this.field1424[var13]) {
                    var12.method1089(class34.field411[var13], class287.field4567[var13][this.field1424[var13]]);
                }
            }
            var6 = var12.method1090(64, 768, -50, -10, -50);
            class196.field3166.method1830(this.field1441, -63, var6);
        }
        if (arg0 != null) {
            var6 = arg0.method143(var6, arg2, (byte) 50, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
    public final int method683(int arg0) {
        field1425++;
        int var2 = 84 % ((arg0 - 40) / 46);
        return this.field1438 == -1 ? (this.field1435[0] << 15) + (this.field1435[8] << 10) + this.field1435[1] + (this.field1424[4] << 20) + ((this.field1424[0] << 25) - -(this.field1435[11] << 5)) : class104.method741((byte) -86, this.field1438).field4277 + 305419896;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lni;IIIIIZI)Lue;")
    public final class13 method684(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        long var9 = (long) arg4 << 32 | (long) (arg3 << 16) | (long) arg1;
        field1421++;
        class13 var11 = (class13) class196.field3166.method1839((byte) 110, var9);
        if (!arg6) {
            this.method683(-36);
        }
        if (var11 == null) {
            class158[] var12 = new class158[3];
            int var13 = 0;
            if (!class297.method1987(-82, arg1).method687(!arg6) || !class297.method1987(-101, arg3).method687(false) || !class297.method1987(-47, arg4).method687(false)) {
                return null;
            }
            class158 var14 = class297.method1987(105, arg1).method690(-5476);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class158 var15 = class297.method1987(-52, arg3).method690(-5476);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class158 var16 = class297.method1987(-77, arg4).method690(-5476);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class158 var17 = new class158(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class119.field2015[var18].length > this.field1424[var18]) {
                    var17.method1089(class226.field3576[var18], class119.field2015[var18][this.field1424[var18]]);
                }
                if (this.field1424[var18] < class287.field4567[var18].length) {
                    var17.method1089(class34.field411[var18], class287.field4567[var18][this.field1424[var18]]);
                }
            }
            var11 = var17.method1090(64, 768, -50, -10, -50);
            class196.field3166.method1830(var9, -86, var11);
        }
        if (arg0 != null) {
            var11 = arg0.method143(var11, arg2, (byte) 70, arg5, arg7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method685(int arg0, boolean arg1) {
        field1436++;
        String var2 = Integer.toString(arg0);
        if (!arg1) {
            method679(-63, -34, 37, 106, -127, -38, -24, -15, -39, 97, 39, 72, 75, 4, 121, -116, 37, -11, -22, -43);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class23.field295 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class18.field215 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}

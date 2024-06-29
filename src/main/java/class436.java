import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class436 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field6329 = -1;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lm;")
    public static class242 field6330 = new class242();

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    private int field6334;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "J")
    private long field6324;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "J")
    private long field6333;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6342;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Z")
    public boolean field6341;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[B")
    public static byte[] field6336;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
    private int[] field6327;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[I")
    public static int[] field6331;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[I")
    public static int[] field6337;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[I")
    public int[] field6340;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[[I")
    private int[][] field6328;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[I[IIZI)V")
    public final void method2726(boolean arg0, int[] arg1, int[] arg2, int arg3, boolean arg4, int arg5) {
        if (this.field6334 != arg3) {
            this.field6334 = arg3;
            this.field6328 = null;
        }
        field6325++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class24.field439; var8++) {
                    class45 var9 = class330.method2164(true, var8);
                    if (var9 != null && !var9.field690 && (arg4 ? class243.field3410[var7] : class398.field5836[var7]) == var9.field685) {
                        arg1[class361.field5351[var7]] = class258.method1708(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field6340 = arg2;
        this.field6329 = arg5;
        this.field6341 = arg4;
        this.field6327 = arg1;
        this.method2735(3810);
        if (!arg0) {
            method2736(88, 75, -44, 53, -12, 64, 28);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIZLtj;III[Ldi;IILmd;Lmd;)Lqb;")
    public final class257 method2727(byte arg0, int arg1, int arg2, boolean arg3, class298 arg4, int arg5, int arg6, int arg7, class239[] arg8, int arg9, int arg10, class233 arg11, class233 arg12) {
        field6321++;
        if (this.field6329 != -1) {
            return class43.method309((byte) 2, this.field6329).method1254(arg8, arg2, arg11, arg1, arg9, arg0 - 28508, arg10, arg5, arg7, arg6, arg12, arg4);
        }
        int var14 = arg10;
        long var15 = this.field6324;
        int[] var17 = this.field6327;
        if (arg11 != null && (arg11.field3231 >= 0 || arg11.field3240 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field6327[var18];
            }
            if (arg11.field3231 >= 0) {
                if (arg11.field3231 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class258.method1708(1073741824, arg11.field3231);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg11.field3240 >= 0) {
                if (arg11.field3240 == 65535) {
                    var15 ^= 0xFFFFFFFFL;
                    var17[3] = 0;
                } else {
                    var17[3] = class258.method1708(1073741824, arg11.field3240);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg11 != null || arg12 != null;
        int var22 = arg8 == null ? 0 : arg8.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class116.field1513[var23] = null;
            if (arg8[var23] != null) {
                class233 var24 = class73.method597(arg8[var23].field3350, -1);
                if (var24.field3242 != null) {
                    var21 = true;
                    class47.field715[var23] = var24;
                    int var25 = arg8[var23].field3354;
                    int var26 = arg8[var23].field3351;
                    int var27 = var24.field3242[var25];
                    class116.field1513[var23] = class21.method190((byte) -105, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class246.field3461[var23] = var28;
                    if (class116.field1513[var23] != null) {
                        var20 |= class116.field1513[var23].method1651(var28, -26945);
                        var19 |= class116.field1513[var23].method1649(var28, 0);
                    }
                    if ((var24.field3237 || class361.field5345) && var26 != -1 && var26 < var24.field3242.length) {
                        class263.field3863[var23] = var24.field3248[var25];
                        class420.field6107[var23] = arg8[var23].field3349;
                        int var29 = var24.field3242[var26];
                        class53.field819[var23] = class21.method190((byte) -90, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class92.field1257[var23] = var30;
                        if (class53.field819[var23] != null) {
                            var20 |= class53.field819[var23].method1651(var30, -26945);
                            var19 |= class53.field819[var23].method1649(var30, arg0 + 84);
                        }
                    } else {
                        class263.field3863[var23] = 0;
                        class420.field6107[var23] = 0;
                        class53.field819[var23] = null;
                        class92.field1257[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class255 var34 = null;
        class255 var35 = null;
        int var36 = -1;
        if (arg0 != -84) {
            method2737(54);
        }
        int var37 = -1;
        int var38 = 0;
        class255 var39 = null;
        class255 var40 = null;
        if (var21) {
            if (arg11 != null) {
                int var41 = arg11.field3242[arg6];
                int var42 = var41 >>> 16;
                var34 = class21.method190((byte) -108, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method1651(var31, -26945);
                    var19 |= var34.method1649(var31, 0);
                }
                if ((arg11.field3237 || class361.field5345) && arg7 != -1 && arg7 < arg11.field3242.length) {
                    int var43 = arg11.field3242[arg7];
                    var33 = arg11.field3248[arg6];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class21.method190((byte) -91, var32 >>> 16);
                    }
                    if (var35 != null) {
                        var20 |= var35.method1651(var32, -26945);
                        var19 |= var35.method1649(var32, arg0 ^ 0xFFFFFFAC);
                    }
                }
            }
            var14 = arg10 | 0x20;
            if (arg12 != null) {
                int var45 = arg12.field3242[arg2];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = class21.method190((byte) -44, var46);
                if (var39 != null) {
                    var20 |= var39.method1651(var36, arg0 ^ 0x6913);
                    var19 |= var39.method1649(var36, 0);
                }
                if ((arg12.field3237 || class361.field5345) && arg9 != -1 && arg12.field3242.length > arg9) {
                    int var47 = arg12.field3242[arg9];
                    var38 = arg12.field3248[arg2];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class21.method190((byte) -41, var37 >>> 16);
                    }
                    if (var40 != null) {
                        var20 |= var40.method1651(var37, -26945);
                        var19 |= var40.method1649(var37, 0);
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
        class51 var49 = class431.field6263;
        class257 var50;
        synchronized (class431.field6263) {
            var50 = (class257) class431.field6263.method378((byte) 28, var15);
        }
        class290 var51 = null;
        if (this.field6334 != -1) {
            var51 = class163.method1105(true, this.field6334);
        }
        if (var50 == null || arg4.method465(var50.method1690(), var14) != 0 || var51 != null && var51.field4369 != null && this.field6328 == null) {
            if (var50 != null) {
                var14 = arg4.method436(var14, var50.method1690());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field6333 != -1L) {
                            class51 var56 = class431.field6263;
                            synchronized (class431.field6263) {
                                var50 = (class257) class431.field6263.method378((byte) 28, this.field6333);
                            }
                        }
                        if (var50 == null || arg4.method465(var50.method1690(), var14) != 0 || var51 != null && var51.field4369 != null && this.field6328 == null) {
                            return null;
                        }
                    } else {
                        class9[] var57 = new class9[12];
                        for (int var58 = 0; var58 < 12; var58++) {
                            int var59 = var17[var58];
                            if ((var59 & 0x40000000) != 0) {
                                class9 var60 = class129.method915(arg0 + 211, var59 & 0x3FFFFFFF).method1067(-11431, this.field6341);
                                if (var60 != null) {
                                    var57[var58] = var60;
                                }
                            } else if ((var59 & Integer.MIN_VALUE) != 0) {
                                class9 var61 = class330.method2164(true, var59 & 0x3FFFFFFF).method327(-128);
                                if (var61 != null) {
                                    var57[var58] = var61;
                                }
                            }
                        }
                        if (var51 != null && var51.field4369 != null) {
                            for (int var62 = 0; var62 < var51.field4369.length; var62++) {
                                if (var51.field4369[var62] != null && var57[var62] != null) {
                                    int var63 = var51.field4369[var62][0];
                                    int var64 = var51.field4369[var62][1];
                                    int var65 = var51.field4369[var62][2];
                                    int var66 = var51.field4369[var62][3] << 3;
                                    int var67 = var51.field4369[var62][4] << 3;
                                    int var68 = var51.field4369[var62][5] << 3;
                                    if (this.field6328 == null) {
                                        this.field6328 = new int[var51.field4369.length][];
                                    }
                                    if (this.field6328[var62] == null) {
                                        int[] var69 = this.field6328[var62] = new int[15];
                                        if (var66 == 0 && var67 == 0 && var68 == 0) {
                                            var69[12] = -var63;
                                            var69[0] = var69[4] = var69[8] = 32768;
                                            var69[13] = -var64;
                                            var69[14] = -var65;
                                        } else {
                                            int var70 = class240.field3365[var66];
                                            int var71 = class240.field3364[var66];
                                            int var72 = class240.field3365[var67];
                                            int var73 = class240.field3364[var67];
                                            int var74 = class240.field3365[var68];
                                            int var75 = class240.field3364[var68];
                                            int var76 = var71 * var74 + 16384 >> 15;
                                            int var77 = var71 * var75 + 16384 >> 15;
                                            var69[6] = -var73 * var74 + var72 * var77 + 16384 >> 15;
                                            var69[7] = -var73 * -var75 + var72 * var76 + 16384 >> 15;
                                            var69[3] = var70 * var75 + 16384 >> 15;
                                            var69[8] = var70 * var72 + 16384 >> 15;
                                            var69[1] = -var75 * var72 + (var73 * var76) + 16384 >> 15;
                                            var69[2] = var70 * var73 + 16384 >> 15;
                                            var69[4] = var70 * var74 + 16384 >> 15;
                                            var69[5] = -var71;
                                            var69[0] = var72 * var74 + var73 * var77 + 16384 >> 15;
                                            var69[14] = var69[8] * -var65 + var69[2] * -var63 - (-(var69[5] * -var64) + -16384) >> 15;
                                            var69[12] = var69[0] * -var63 + var69[6] * -var65 + var69[3] * -var64 + 16384 >> 15;
                                            var69[13] = var69[7] * -var65 + var69[4] * -var64 + var69[1] * -var63 + 16384 >> 15;
                                        }
                                        var69[11] = var65;
                                        var69[10] = var64;
                                        var69[9] = var63;
                                    }
                                    if (var66 != 0 || var67 != 0 || var68 != 0) {
                                        var57[var62].method68(var68, (byte) 125, var67, var66);
                                    }
                                    if (var63 != 0 || var64 != 0 || var65 != 0) {
                                        var57[var62].method58((byte) 125, var65, var63, var64);
                                    }
                                }
                            }
                        }
                        class9 var78 = new class9(var57, var57.length);
                        int var79 = var14 | 0x2000;
                        var50 = arg4.method468(var78, var79, class430.field6243, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            if (class444.field6408[var80].length > this.field6340[var80]) {
                                var50.method1665(class452.field6566[var80], class444.field6408[var80][this.field6340[var80]]);
                            }
                            if (class71.field1015[var80].length > this.field6340[var80]) {
                                var50.method1665(class230.field3155[var80], class71.field1015[var80][this.field6340[var80]]);
                            }
                        }
                        if (arg3) {
                            var50.method1662(var14);
                            class51 var81 = class431.field6263;
                            synchronized (class431.field6263) {
                                class431.field6263.method367(var15, var50, true);
                            }
                            this.field6333 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class330.method2164(true, var55 & 0x3FFFFFFF).method323(arg0 ^ 0xFFFFFFAE)) {
                        var53 = true;
                    }
                } else if (!class129.method915(126, var55 & 0x3FFFFFFF).method1073(-129, this.field6341)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class257 var82 = var50.method1676((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class116.field1513[var83] != null) {
                var82.method1696(var84, 0, false, class92.field1257[var83], class246.field3461[var83], true, class116.field1513[var83], this.field6328 == null ? null : this.field6328[var83], class263.field3863[var83], class420.field6107[var83] - 1, class53.field819[var83]);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method1697(var38, arg11.field3251, var34, (byte) -40, arg1 - 1, var40, var31, arg5 - 1, var35, var36, var33, var37, false, var39, var32);
        } else if (var34 != null) {
            var82.method1678(65535, var31, arg5 - 1, 0, var35, false, var32, var34, var33);
        } else if (var39 != null) {
            var82.method1678(65535, var36, arg1 - 1, 0, var40, false, var37, var39, var38);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class116.field1513[var85] = null;
            class53.field819[var85] = null;
            class47.field715[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILua;Lua;)V")
    public static final void method2728(int arg0, int arg1, int arg2, class400 arg3, class400 arg4) {
        if (class106.field1405[arg0][arg1][arg2] == null) {
            class267.method1787(arg0, arg1, arg2);
        }
        class106.field1405[arg0][arg1][arg2].field1067 = arg3;
        class106.field1405[arg0][arg1][arg2].field1087 = arg4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltj;IIIILao;IB)V")
    public static final void method2729(class298 arg0, int arg1, int arg2, int arg3, int arg4, class280 arg5, int arg6, byte arg7) {
        field6339++;
        class56 var8 = null;
        if (arg1 == 0) {
            var8 = (class56) class57.method421(arg3, arg6, arg2);
        }
        if (arg1 == 1) {
            var8 = (class56) class235.method1526(arg3, arg6, arg2);
        }
        if (arg1 == 2) {
            var8 = (class56) class31.method243(arg3, arg6, arg2, field6342 == null ? (field6342 = method2739("lk")) : field6342);
        }
        int var9 = 47 % ((78 - arg7) / 35);
        if (arg1 == 3) {
            var8 = (class56) class104.method792(arg3, arg6, arg2);
        }
        if (var8 == null) {
            return;
        }
        int var10 = var8.method122((byte) -119);
        int var11 = var8.method121(28024);
        class212 var12 = class372.method2447(var8.method116(24186), (byte) 110);
        if (var12.method1389(-117)) {
            class11.method92(arg2, arg3, var12, arg6, (byte) 90);
        }
        if (var8.method125(-122)) {
            var8.method111(-97, arg0);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                class223.method1459(arg3, arg6, arg2);
            } else if (arg1 == 2) {
                class294.method1995(arg3, arg6, arg2, field6342 == null ? (field6342 = method2739("lk")) : field6342);
                if (var12.field2905 != 0 && (var12.field2946 + arg6) < class351.field5217 && class143.field1815 > (arg2 + var12.field2946) && class351.field5217 > (arg6 + var12.field2970) && class143.field1815 > (var12.field2970 + arg2)) {
                    arg5.method1847(var12.field2970, arg6, (byte) 28, var12.field2946, !var12.field2936, var11, arg2, var12.field2885);
                    return;
                }
            } else {
                if (arg1 == 3) {
                    class215.method1410(arg3, arg6, arg2);
                    if (var12.field2905 == 1) {
                        arg5.method1855(arg6, arg2, -262145);
                        return;
                    }
                }
                return;
            }
            return;
        }
        class71.method587(arg3, arg6, arg2);
        if (var12.field2905 != 0) {
            arg5.method1844(arg6, !var12.field2936, var11, var12.field2885, var10, (byte) -125, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltj;IIIIIIIILmd;)Lqb;")
    public final class257 method2730(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class233 arg9) {
        field6320++;
        int var11 = arg4;
        if (arg8 > -41) {
            field6331 = null;
        }
        if (arg9 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg9.field3242[arg5];
            Object var19 = null;
            var11 = arg4 | 0x20;
            int var20 = var18 >>> 16;
            class255 var21 = class21.method190((byte) -38, var20);
            int var22 = var18 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method1651(var22, -26945);
                var12 |= var21.method1649(var22, 0);
                var14 |= arg9.field3236;
            }
            if ((arg9.field3237 || class361.field5345) && arg7 != -1 && arg7 < arg9.field3242.length) {
                int var23 = arg9.field3242[arg7];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class255 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class21.method190((byte) -32, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method1651(var25, -26945);
                    var12 |= var26.method1649(var25, 0);
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
        long var27 = (long) (arg2 << 16) | (long) arg3 << 32 | (long) arg1;
        class51 var29 = class370.field5462;
        class257 var30;
        synchronized (class370.field5462) {
            var30 = (class257) class370.field5462.method378((byte) 28, var27);
        }
        if (var30 == null || arg0.method465(var30.method1690(), var11) != 0) {
            if (var30 != null) {
                var11 = arg0.method436(var11, var30.method1690());
            }
            class9[] var32 = new class9[3];
            int var33 = 0;
            if (!class330.method2164(true, arg1).method325(86) || !class330.method2164(true, arg2).method325(110) || !class330.method2164(true, arg3).method325(115)) {
                return null;
            }
            class9 var34 = class330.method2164(true, arg1).method322(21915);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class9 var35 = class330.method2164(true, arg2).method322(21915);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class9 var36 = class330.method2164(true, arg3).method322(21915);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class9 var37 = new class9(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg0.method468(var37, var38, class430.field6243, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class444.field6408[var39].length > this.field6340[var39]) {
                    var30.method1665(class452.field6566[var39], class444.field6408[var39][this.field6340[var39]]);
                }
                if (class71.field1015[var39].length > this.field6340[var39]) {
                    var30.method1665(class230.field3155[var39], class71.field1015[var39][this.field6340[var39]]);
                }
            }
            var30.method1662(var11);
            class51 var40 = class370.field5462;
            synchronized (class370.field5462) {
                class370.field5462.method367(var27, var30, true);
            }
        }
        if (arg9 == null) {
            return var30;
        } else {
            class257 var41 = var30.method1676((byte) 1, var11, true);
            return arg9.method1512(arg7, arg4, arg5, var41, arg6, 0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
    public final void method2731(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field6341 = true;
        }
        this.field6340[arg0] = arg2;
        field6338++;
        this.method2735(3810);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltj;IIIILmd;I)Lqb;")
    public final class257 method2732(class298 arg0, int arg1, int arg2, int arg3, int arg4, class233 arg5, int arg6) {
        field6332++;
        if (this.field6329 != arg3) {
            return class43.method309((byte) 2, this.field6329).method1255(arg2, arg0, arg6, 0, arg4, arg1, arg5);
        }
        int var8 = arg6;
        if (arg5 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            Object var15 = null;
            var8 = arg6 | 0x20;
            int var16 = arg5.field3242[arg1];
            int var17 = var16 >>> 16;
            class255 var18 = class21.method190((byte) -124, var17);
            int var19 = var16 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method1651(var19, -26945);
                var9 |= var18.method1649(var19, 0);
                var11 |= arg5.field3236;
            }
            if ((arg5.field3237 || class361.field5345) && arg2 != -1 && arg2 < arg5.field3242.length) {
                int var20 = arg5.field3242[arg2];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class255 var23;
                if (var17 == var21) {
                    var23 = var18;
                } else {
                    var23 = class21.method190((byte) -121, var22 >>> 16);
                }
                if (var23 != null) {
                    var10 |= var23.method1651(var22, arg3 ^ 0x6940);
                    var9 |= var23.method1649(var22, 0);
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
        class51 var24 = class370.field5462;
        class257 var25;
        synchronized (class370.field5462) {
            var25 = (class257) class370.field5462.method378((byte) 28, this.field6324);
        }
        if (var25 == null || arg0.method465(var25.method1690(), var8) != 0) {
            if (var25 != null) {
                var8 = arg0.method436(var8, var25.method1690());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field6327[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var29) != 0 && !class330.method2164(true, var29 & 0x3FFFFFFF).method325(69)) {
                        var27 = true;
                    }
                } else if (!class129.method915(127, var29 & 0x3FFFFFFF).method1056(this.field6341, -1)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class9[] var30 = new class9[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field6327[var32];
                if ((var33 & 0x40000000) != 0) {
                    class9 var35 = class129.method915(127, var33 & 0x3FFFFFFF).method1059((byte) -113, this.field6341);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                } else if ((Integer.MIN_VALUE & var33) != 0) {
                    class9 var34 = class330.method2164(true, var33 & 0x3FFFFFFF).method322(21915);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class9 var37 = new class9(var30, var31);
            var25 = arg0.method468(var37, var36, class430.field6243, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class444.field6408[var38].length > this.field6340[var38]) {
                    var25.method1665(class452.field6566[var38], class444.field6408[var38][this.field6340[var38]]);
                }
                if (this.field6340[var38] < class71.field1015[var38].length) {
                    var25.method1665(class230.field3155[var38], class71.field1015[var38][this.field6340[var38]]);
                }
            }
            var25.method1662(var8);
            class51 var39 = class370.field5462;
            synchronized (class370.field5462) {
                class370.field5462.method367(this.field6324, var25, true);
            }
        }
        if (arg5 == null) {
            return var25;
        } else {
            var25.method1676((byte) 1, var8, true);
            return arg5.method1512(arg2, arg6, arg1, var25, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public final void method2733(boolean arg0, int arg1) {
        field6322++;
        this.field6341 = arg0;
        this.method2735(3810);
        if (arg1 != 192620016) {
            field6330 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    public static final void method2734() {
        class347.method2300(1, class134.field1752);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    private final void method2735(int arg0) {
        field6326++;
        long[] var2 = class420.field6106;
        this.field6324 = -1L;
        this.field6324 = var2[(int) (((long) (this.field6334 >> 8) ^ this.field6324) & 0xFFL)] ^ this.field6324 >>> 8;
        this.field6324 = var2[(int) ((this.field6324 ^ (long) this.field6334) & 0xFFL)] ^ this.field6324 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6324 = var2[(int) ((this.field6324 ^ (long) (this.field6327[var3] >> 24)) & 0xFFL)] ^ this.field6324 >>> 8;
            this.field6324 = var2[(int) ((this.field6324 ^ (long) (this.field6327[var3] >> 16)) & 0xFFL)] ^ this.field6324 >>> 8;
            this.field6324 = var2[(int) ((this.field6324 ^ (long) (this.field6327[var3] >> 8)) & 0xFFL)] ^ this.field6324 >>> 8;
            this.field6324 = var2[(int) (((long) this.field6327[var3] ^ this.field6324) & 0xFFL)] ^ this.field6324 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6324 = var2[(int) ((this.field6324 ^ (long) this.field6340[var4]) & 0xFFL)] ^ this.field6324 >>> 8;
        }
        if (arg0 != 3810) {
            this.method2727((byte) -23, -59, -90, false, (class298) null, -92, -78, 50, (class239[]) null, 66, -40, (class233) null, (class233) null);
        }
        this.field6324 = this.field6324 >>> 8 ^ var2[(int) ((this.field6324 ^ (long) (this.field6341 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class198[] var7 = class349.field5195;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class198 var10 = var7[var8];
            if (var10 != null && var10.field2741 == 2) {
                class158.method1054(arg2, 36, (var10.field2739 - class236.field3292 << 7) + var10.field2738, arg0 >> 1, var10.field2735 * 2, arg1 >> 1, arg4, (var10.field2734 - class90.field1223 << 7) + var10.field2740);
                if (class53.field814[0] > -1 && class231.field3179 % 20 < 10) {
                    class160.field2083[var10.field2732].method2070(class53.field814[0] + arg6 - 12, class53.field814[1] + arg5 - 28);
                }
            }
        }
        int var9 = -128 % ((28 - arg3) / 49);
        field6323++;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method2737(int arg0) {
        field6337 = null;
        if (arg0 <= 57) {
            field6331 = null;
        }
        field6330 = null;
        field6331 = null;
        field6336 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public final void method2738(int arg0, int arg1, int arg2) {
        if (arg0 != -15802) {
            this.method2738(-128, -26, 105);
        }
        field6335++;
        int var4 = class361.field5351[arg1];
        if (this.field6327[var4] != 0 && class330.method2164(true, arg2) != null) {
            this.field6327[var4] = class258.method1708(arg2, Integer.MIN_VALUE);
            this.method2735(3810);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2739(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

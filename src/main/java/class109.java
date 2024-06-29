import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class109 {

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public int field1495 = -1;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Z")
    public static boolean field1487 = false;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[I")
    public static int[] field1486 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[Lqi;")
    public static class398[] field1494 = new class398[5];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "J")
    private long field1488;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "J")
    private long field1496;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Z")
    public boolean field1481;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
    public int[] field1490;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[[I")
    private int[][] field1498;

    static {
        for (int var0 = 0; var0 < field1494.length; var0++) {
            field1494[var0] = new class398();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI[I[IZI)V", line = 4)
    public final void method698(byte arg0, int arg1, int[] arg2, int[] arg3, boolean arg4, int arg5) {
        this.field1481 = arg4;
        this.field1490 = arg2;
        this.field1485 = arg3;
        this.field1495 = arg5;
        field1502++;
        if (this.field1501 != arg1) {
            this.field1501 = arg1;
            this.field1498 = null;
        }
        this.method709((byte) -115);
        int var7 = -106 % ((arg0 + 5) / 46);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lbk;Lqp;IBILqf;Lvd;Lkk;ILtu;ILqa;)Lc;", line = 26)
    public final class121 method699(class253 arg0, class467 arg1, int arg2, byte arg3, int arg4, class479 arg5, class30 arg6, class125 arg7, int arg8, class230 arg9, int arg10, class162 arg11) {
        field1497++;
        if (this.field1495 != -1) {
            return arg5.method2819(this.field1495, 106).method1858(arg10, arg11, (byte) -119, arg0, arg1, arg4, arg2, arg8, arg6);
        }
        int var13 = arg8;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg8 | 0x20;
            int var22 = arg1.field6806[arg4];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class102 var25 = arg0.method1488(-24, var23);
            if (var25 != null) {
                var15 |= var25.method672((byte) 41, var24);
                var14 |= var25.method673(var24, 2);
                var17 |= var25.method677((byte) -84, var24);
                var16 |= arg1.field6820;
            }
            if ((arg1.field6816 || class239.field3287) && arg10 != -1 && arg1.field6806.length > arg10) {
                int var26 = arg1.field6806[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class102 var29 = var23 == var27 ? var25 : arg0.method1488(-24, var27);
                if (var29 != null) {
                    var15 |= var29.method672((byte) 118, var28);
                    var14 |= var29.method673(var28, 2);
                    var17 |= var29.method677((byte) -122, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class9 var30 = class223.field3137;
        class121 var31;
        synchronized (class223.field3137) {
            var31 = (class121) class223.field3137.method56(this.field1496, 49);
        }
        int var32 = -23 / ((arg3 - 65) / 51);
        if (var31 == null || arg11.method472(var31.method775(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method463(var13, var31.method775());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field1485[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((var36 & Integer.MIN_VALUE) != 0 && !arg9.method1348(121, var36 & 0x3FFFFFFF).method842(-27787)) {
                        var34 = true;
                    }
                } else if (!arg7.method823(false, var36 & 0x3FFFFFFF).method1789(this.field1481, -126)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class94[] var37 = new class94[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field1485[var39];
                if ((var40 & 0x40000000) != 0) {
                    class94 var42 = arg7.method823(false, var40 & 0x3FFFFFFF).method1784(this.field1481, (byte) -81);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class94 var41 = arg9.method1348(69, var40 & 0x3FFFFFFF).method840(true);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            int var43 = var13 | 0x4000;
            class94 var44 = new class94(var37, var38);
            var31 = arg11.method540(var44, var43, class419.field6125, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (class425.field6216[var45].length > this.field1490[var45]) {
                    var31.method791(class159.field2288[var45], class425.field6216[var45][this.field1490[var45]]);
                }
                if (class311.field4288[var45].length > this.field1490[var45]) {
                    var31.method791(class458.field6685[var45], class311.field4288[var45][this.field1490[var45]]);
                }
            }
            var31.method787(var13);
            class9 var46 = class223.field3137;
            synchronized (class223.field3137) {
                class223.field3137.method73(this.field1496, var31, 26425);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method761((byte) 4, var13, true);
            return arg1.method2747(arg10, arg8, arg2, arg4, true, var31);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILtu;Lqs;IILqa;IIZLqf;Lkk;Lvd;[Lkh;Lqp;Lbk;Lqp;)Lc;", line = 218)
    public final class121 method700(int arg0, int arg1, int arg2, int arg3, class230 arg4, class427 arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10, boolean arg11, class479 arg12, class125 arg13, class30 arg14, class13[] arg15, class467 arg16, class253 arg17, class467 arg18) {
        field1500++;
        if (this.field1495 != -1) {
            return arg12.method2819(this.field1495, -117).method1868(arg8, arg14, arg9, arg6, arg1, arg18, false, arg10, arg17, arg16, arg2, arg5, arg15, arg7, arg0);
        }
        int var20 = arg10;
        long var21 = this.field1496;
        int[] var23 = this.field1485;
        if (arg16 != null && (arg16.field6818 >= 0 || arg16.field6811 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1485[var24];
            }
            if (arg16.field6818 >= 0) {
                if (arg16.field6818 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class25.method183(1073741824, arg16.field6818);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg16.field6811 >= 0) {
                if (arg16.field6811 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class25.method183(1073741824, arg16.field6811);
                    var21 ^= var23[3];
                }
            }
        }
        int var25 = 108 / ((arg3 + 17) / 63);
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = arg16 != null || arg18 != null;
        int var30 = arg15 == null ? 0 : arg15.length;
        for (int var31 = 0; var31 < var30; var31++) {
            class478.field6985[var31] = null;
            if (arg15[var31] != null) {
                class467 var32 = arg17.method1484(0, arg15[var31].field149);
                if (var32.field6806 != null) {
                    class215.field3061[var31] = var32;
                    var29 = true;
                    int var33 = arg15[var31].field155;
                    int var34 = arg15[var31].field157;
                    int var35 = var32.field6806[var33];
                    class478.field6985[var31] = arg17.method1488(-24, var35 >>> 16);
                    int var36 = var35 & 0xFFFF;
                    class243.field3384[var31] = var36;
                    if (class478.field6985[var31] != null) {
                        var27 |= class478.field6985[var31].method672((byte) 100, var36);
                        var26 |= class478.field6985[var31].method673(var36, 2);
                        var28 |= class478.field6985[var31].method677((byte) -87, var36);
                    }
                    if ((var32.field6816 || class239.field3287) && var34 != -1 && var32.field6806.length > var34) {
                        class119.field1613[var31] = var32.field6829[var33];
                        class210.field2975[var31] = arg15[var31].field160;
                        int var37 = var32.field6806[var34];
                        class134.field1941[var31] = arg17.method1488(-24, var37 >>> 16);
                        int var38 = var37 & 0xFFFF;
                        class71.field1066[var31] = var38;
                        if (class134.field1941[var31] != null) {
                            var27 |= class134.field1941[var31].method672((byte) 61, var38);
                            var26 |= class134.field1941[var31].method673(var38, 2);
                            var28 |= class134.field1941[var31].method677((byte) -110, var38);
                        }
                    } else {
                        class119.field1613[var31] = 0;
                        class210.field2975[var31] = 0;
                        class134.field1941[var31] = null;
                        class71.field1066[var31] = -1;
                    }
                }
            }
        }
        int var39 = -1;
        int var40 = -1;
        int var41 = 0;
        class102 var42 = null;
        class102 var43 = null;
        int var44 = -1;
        int var45 = -1;
        int var46 = 0;
        class102 var47 = null;
        class102 var48 = null;
        if (var29) {
            var20 = arg10 | 0x20;
            if (arg16 != null) {
                int var49 = arg16.field6806[arg1];
                int var50 = var49 >>> 16;
                var39 = var49 & 0xFFFF;
                var42 = arg17.method1488(-24, var50);
                if (var42 != null) {
                    var27 |= var42.method672((byte) 71, var39);
                    var26 |= var42.method673(var39, 2);
                    var28 |= var42.method677((byte) -118, var39);
                }
                if ((arg16.field6816 || class239.field3287) && arg2 != -1 && arg2 < arg16.field6806.length) {
                    var41 = arg16.field6829[arg1];
                    int var51 = arg16.field6806[arg2];
                    int var52 = var51 >>> 16;
                    var40 = var51 & 0xFFFF;
                    var43 = var50 == var52 ? var42 : arg17.method1488(-24, var52);
                    if (var43 != null) {
                        var27 |= var43.method672((byte) 105, var40);
                        var26 |= var43.method673(var40, 2);
                        var28 |= var43.method677((byte) -87, var40);
                    }
                }
            }
            if (arg18 != null) {
                int var53 = arg18.field6806[arg7];
                int var54 = var53 >>> 16;
                var47 = arg17.method1488(-24, var54);
                var44 = var53 & 0xFFFF;
                if (var47 != null) {
                    var27 |= var47.method672((byte) 48, var44);
                    var26 |= var47.method673(var44, 2);
                    var28 |= var47.method677((byte) -124, var44);
                }
                if ((arg18.field6816 || class239.field3287) && arg6 != -1 && arg18.field6806.length > arg6) {
                    int var55 = arg18.field6806[arg6];
                    var46 = arg18.field6829[arg7];
                    int var56 = var55 >>> 16;
                    var45 = var55 & 0xFFFF;
                    var48 = var54 == var56 ? var47 : arg17.method1488(-24, var56);
                    if (var48 != null) {
                        var27 |= var48.method672((byte) 82, var45);
                        var26 |= var48.method673(var45, 2);
                        var28 |= var48.method677((byte) -85, var45);
                    }
                }
            }
            if (var27) {
                var20 |= 0x80;
            }
            if (var26) {
                var20 |= 0x100;
            }
            if (var28) {
                var20 |= 0x400;
            }
        }
        class9 var57 = class383.field5390;
        class121 var58;
        synchronized (class383.field5390) {
            var58 = (class121) class383.field5390.method56(var21, 125);
        }
        class21 var59 = null;
        if (this.field1501 != -1) {
            var59 = arg5.method2561(16300, this.field1501);
        }
        if (var58 == null || arg8.method472(var58.method775(), var20) != 0 || var59 != null && var59.field246 != null && this.field1498 == null) {
            if (var58 != null) {
                var20 = arg8.method463(var20, var58.method775());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field1488 != -1L) {
                            class9 var64 = class383.field5390;
                            synchronized (class383.field5390) {
                                var58 = (class121) class383.field5390.method56(this.field1488, 101);
                            }
                        }
                        if (var58 == null || arg8.method472(var58.method775(), var20) != 0 || var59 != null && var59.field246 != null && this.field1498 == null) {
                            return null;
                        }
                    } else {
                        class94[] var65 = new class94[12];
                        for (int var66 = 0; var66 < 12; var66++) {
                            int var67 = var23[var66];
                            if ((var67 & 0x40000000) != 0) {
                                class94 var69 = arg13.method823(false, var67 & 0x3FFFFFFF).method1785((byte) -11, this.field1481);
                                if (var69 != null) {
                                    var65[var66] = var69;
                                }
                            } else if ((var67 & Integer.MIN_VALUE) != 0) {
                                class94 var68 = arg4.method1348(95, var67 & 0x3FFFFFFF).method838(0);
                                if (var68 != null) {
                                    var65[var66] = var68;
                                }
                            }
                        }
                        if (var59 != null && var59.field246 != null) {
                            for (int var70 = 0; var70 < var59.field246.length; var70++) {
                                if (var59.field246[var70] != null && var65[var70] != null) {
                                    int var71 = var59.field246[var70][0];
                                    int var72 = var59.field246[var70][1];
                                    int var73 = var59.field246[var70][2];
                                    int var74 = var59.field246[var70][3] << 3;
                                    int var75 = var59.field246[var70][4] << 3;
                                    int var76 = var59.field246[var70][5] << 3;
                                    if (this.field1498 == null) {
                                        this.field1498 = new int[var59.field246.length][];
                                    }
                                    if (this.field1498[var70] == null) {
                                        int[] var77 = this.field1498[var70] = new int[15];
                                        if (var74 == 0 && var75 == 0 && var76 == 0) {
                                            var77[14] = -var73;
                                            var77[12] = -var71;
                                            var77[13] = -var72;
                                            var77[0] = var77[4] = var77[8] = 32768;
                                        } else {
                                            int var78 = class377.field5315[var74];
                                            int var79 = class377.field5316[var74];
                                            int var80 = class377.field5315[var75];
                                            int var81 = class377.field5316[var75];
                                            int var82 = class377.field5315[var76];
                                            int var83 = class377.field5316[var76];
                                            int var84 = var79 * var82 + 16384 >> 15;
                                            int var85 = var79 * var83 + 16384 >> 15;
                                            var77[6] = -var81 * var82 + (var80 * var85) + 16384 >> 15;
                                            var77[4] = var78 * var82 + 16384 >> 15;
                                            var77[7] = -var81 * -var83 + var80 * var84 + 16384 >> 15;
                                            var77[5] = -var79;
                                            var77[8] = var78 * var80 + 16384 >> 15;
                                            var77[3] = var78 * var83 + 16384 >> 15;
                                            var77[0] = var81 * var85 + (var80 * var82 + 16384) >> 15;
                                            var77[2] = var78 * var81 + 16384 >> 15;
                                            var77[1] = -var83 * var80 - (-(var81 * var84) - 16384) >> 15;
                                            var77[12] = var77[0] * -var71 + var77[3] * -var72 + var77[6] * -var73 + 16384 >> 15;
                                            var77[13] = var77[1] * -var71 + (var77[4] * -var72) + (var77[7] * -var73) + 16384 >> 15;
                                            var77[14] = var77[5] * -var72 + var77[2] * -var71 + var77[8] * -var73 + 16384 >> 15;
                                        }
                                        var77[11] = var73;
                                        var77[9] = var71;
                                        var77[10] = var72;
                                    }
                                    if (var74 != 0 || var75 != 0 || var76 != 0) {
                                        var65[var70].method637(var74, (byte) -104, var76, var75);
                                    }
                                    if (var71 != 0 || var72 != 0 || var73 != 0) {
                                        var65[var70].method626(var72, var71, var73, 685939247);
                                    }
                                }
                            }
                        }
                        int var86 = var20 | 0x4000;
                        class94 var87 = new class94(var65, var65.length);
                        var58 = arg8.method540(var87, var86, class419.field6125, 64, 850);
                        for (int var88 = 0; var88 < 5; var88++) {
                            if (class425.field6216[var88].length > this.field1490[var88]) {
                                var58.method791(class159.field2288[var88], class425.field6216[var88][this.field1490[var88]]);
                            }
                            if (class311.field4288[var88].length > this.field1490[var88]) {
                                var58.method791(class458.field6685[var88], class311.field4288[var88][this.field1490[var88]]);
                            }
                        }
                        if (arg11) {
                            var58.method787(var20);
                            class9 var89 = class383.field5390;
                            synchronized (class383.field5390) {
                                class383.field5390.method73(var21, var58, 26425);
                            }
                            this.field1488 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var63) != 0 && !arg4.method1348(61, var63 & 0x3FFFFFFF).method839(0)) {
                        var61 = true;
                    }
                } else if (!arg13.method823(false, var63 & 0x3FFFFFFF).method1791(false, this.field1481)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class121 var90 = var58.method761((byte) 4, var20, true);
        if (!var29) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var30 > var91) {
            if (class478.field6985[var91] != null) {
                var90.method776(this.field1498 == null ? null : this.field1498[var91], class71.field1066[var91], class243.field3384[var91], class478.field6985[var91], (byte) 30, class210.field2975[var91] - 1, 0, class134.field1941[var91], false, class119.field1613[var91], var92);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var42 != null && var47 != null) {
            var90.method802(var45, false, var46, false, var47, var44, var41, arg9 - 1, var43, var48, var39, arg16.field6803, var42, arg0 - 1, var40);
        } else if (var42 != null) {
            var90.method768(arg9 - 1, var39, 0, var43, false, var42, var40, -88, var41);
        } else if (var47 != null) {
            var90.method768(arg0 - 1, var44, 0, var48, false, var47, var45, -121, var46);
        }
        for (int var93 = 0; var93 < var30; var93++) {
            class478.field6985[var93] = null;
            class134.field1941[var93] = null;
            class215.field3061[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 720)
    public static final void method701(int arg0, boolean arg1, String arg2) {
        field1499++;
        if (class528.field7773 != class175.field2498 || class370.field5196 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class433.field6302 = true;
                    class58.method376((byte) -126, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class433.field6302 = false;
                    class58.method376((byte) -101, "fps debug disabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class233.field3231 = 0;
                    class307.field4213 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class384.field5402.method2301(false);
                    class58.method376((byte) 123, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    method705(0);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class58.method376((byte) -108, "mem=" + var5 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    method705(0);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class58.method376((byte) -128, "Memory before cleanup=" + var8 + "k");
                    class530.method3115(arg0 + 52);
                    method705(arg0 + 3);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class58.method376((byte) 5, "Memory after cleanup=" + var10 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class58.method376((byte) 65, "Number of player models in cache:" + class113.method725(-17117));
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class58.method376((byte) -101, "Dropped client connection");
                    if (class137.field1958 == 30) {
                        class159.method982(-1);
                    } else if (class137.field1958 == 25) {
                        class261.field3592 = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class119.field1625.method2546(24726);
                    class58.method376((byte) -114, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class119.field1625.method2545((byte) -52);
                    class58.method376((byte) -115, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class282.field3804.method2276(arg0 - 11381);
                    class117.field1578.method642(5000);
                    class119.field1625.method2550((byte) -64);
                    class58.method376((byte) 45, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class430.method2571((byte) -117);
                    class499.method2942(arg0 ^ 0x2);
                    class58.method376((byte) 73, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class161.method997(-1, false, -1, 1, false);
                    if (class448.method2641((byte) 116) == 1) {
                        class58.method376((byte) -104, "wm1 succeeded");
                        return;
                    }
                    class58.method376((byte) 95, "wm1 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class161.method997(-1, false, -1, 2, false);
                    if (class448.method2641((byte) 74) == 2) {
                        class58.method376((byte) 36, "wm2 succeeded");
                        return;
                    }
                    class58.method376((byte) -105, "wm2 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class161.method997(768, false, 1024, 3, false);
                    if (class448.method2641((byte) 111) == 3) {
                        class58.method376((byte) 77, "wm3 succeeded");
                        return;
                    }
                    class58.method376((byte) 90, "wm3 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class196.method1211(false, 0);
                    if (class278.field3761 != 0) {
                        class58.method376((byte) 10, "Failed to enter tk0");
                        return;
                    }
                    class58.method376((byte) -118, "Entered tk0");
                    class437.field6374.field4272 = 0;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class196.method1211(false, 1);
                    if (class278.field3761 != 1) {
                        class58.method376((byte) -121, "Failed to enter tk1");
                        return;
                    }
                    class58.method376((byte) 7, "Entered tk1");
                    class437.field6374.field4272 = 1;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class196.method1211(false, 2);
                    if (class278.field3761 == 2) {
                        class58.method376((byte) -121, "Entered tk2");
                        class437.field6374.field4272 = 2;
                        class437.field6374.method557(class282.field3804, (byte) -80);
                        class164.field2341 = false;
                        return;
                    }
                    class58.method376((byte) -126, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class196.method1211(false, 3);
                    if (class278.field3761 == 3) {
                        class58.method376((byte) 65, "Entered tk3");
                        return;
                    }
                    class58.method376((byte) -106, "Failed to enter tk3");
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class437.field6374.field4283 = !class437.field6374.field4283;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    class430.method2571((byte) -73);
                    class58.method376((byte) 82, "ot=" + class437.field6374.field4283);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class437.field6374.field4251 = !class437.field6374.field4251;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    class430.method2571((byte) -41);
                    class58.method376((byte) -124, "gb=" + class437.field6374.field4251);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class58.method376((byte) -103, "Invalid shadows value");
                        return;
                    }
                    String var11 = arg2.substring(8);
                    int var12 = class258.method1501(arg0 + 109, var11) ? class47.method298(false, var11) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class437.field6374.method1762(var12, (byte) 35, class278.field3761);
                        class437.field6374.method557(class282.field3804, (byte) -80);
                        class164.field2341 = false;
                        class430.method2571((byte) -121);
                        class58.method376((byte) 111, "shadows=" + var12);
                        return;
                    }
                    class58.method376((byte) 114, "Invalid shadows value");
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class437.field6374.field4286 = !class437.field6374.field4286;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    class350.method1937(2);
                    class430.method2571((byte) -40);
                    class58.method376((byte) -10, "textures=" + class437.field6374.field4286);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class58.method376((byte) -113, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class47.method298(false, arg2.substring(6));
                    if (var13 >= 0 && var13 <= class129.method846(class463.field6730, (byte) -113)) {
                        class437.field6374.field4275 = var13;
                        class437.field6374.method557(class282.field3804, (byte) -80);
                        class164.field2341 = false;
                        class58.method376((byte) 70, "maxbuildarea=" + class437.field6374.field4275);
                        return;
                    }
                    class58.method376((byte) -100, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (arg2.length() < 13) {
                        class58.method376((byte) -13, "Invalid particles value");
                        return;
                    }
                    class295.method1699(class47.method298(false, arg2.substring(13)), -10135);
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    class164.field2341 = false;
                    class58.method376((byte) -108, "particles=" + class20.method146(true));
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class58.method376((byte) -105, "Invalid rect_debug value");
                        return;
                    }
                    class477.field6977 = class47.method298(false, arg2.substring(10).trim());
                    class58.method376((byte) -126, "rect_debug=" + class477.field6977);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class476.field6973 = true;
                    class58.method376((byte) -108, "qa_op_test=" + class476.field6973);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class184.field2577 = !class184.field2577;
                    class58.method376((byte) 54, "clipcomponents=" + class184.field2577);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class418.field6109.method474();
                    if (class96.method651((byte) 116, !var14)) {
                        if (var14) {
                            class58.method376((byte) -13, "Bloom disabled");
                            return;
                        }
                        class58.method376((byte) -123, "Bloom enabled");
                        return;
                    }
                    class58.method376((byte) -99, "Failed to enable bloom");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class239.field3287) {
                        class239.field3287 = true;
                        class58.method376((byte) -110, "Forced tweening ENABLED!");
                        return;
                    }
                    class239.field3287 = false;
                    class58.method376((byte) -112, "Forced tweening disabled.");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class483.field7095) {
                        class58.method376((byte) 19, "Shift-click disabled.");
                        class483.field7095 = false;
                        return;
                    }
                    class58.method376((byte) -127, "Shift-click ENABLED!");
                    class483.field7095 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class58.method376((byte) 124, "x:" + (class75.field1089.field466 >> 7) + " z:" + (class75.field1089.field461 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class58.method376((byte) 55, "Height: " + class383.field5391[class75.field1089.field464].method221(class75.field1089.field466 >> 7, class75.field1089.field461 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class192.field2735.method1414(true);
                    class192.field2735.method1420(2);
                    class414.field6075.method1562(64);
                    class436.field6349.method855((byte) -61);
                    class499.method2942(-1);
                    class58.method376((byte) 43, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class418.field6109.method441()) {
                        int var15 = Integer.parseInt(arg2.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class196.field2807 = var15;
                        class418.field6109.method442(class196.field2807);
                        class418.field6109.method534(0);
                        class58.method376((byte) -118, "Render cores now: " + class196.field2807);
                        return;
                    }
                    class58.method376((byte) 122, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class58.method376((byte) 49, "I(s): " + class275.field3736.method70(0) + "/" + class275.field3736.method71(arg0 ^ 0xFFFFFFFD));
                    class58.method376((byte) -102, "I(m): " + class61.field810.method70(arg0 + 3) + "/" + class61.field810.method71(0));
                    class58.method376((byte) 41, "O(s): " + class75.field1097.field1727.method892(10292) + "/" + class75.field1097.field1727.method894((byte) -48));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class58.method376((byte) -95, "Pos: " + class75.field1089.field464 + "," + ((class132.field1901 >> 7) + class215.field3059 >> 6) + "," + ((class310.field4240 >> 7) + class79.field1134 >> 6) + "," + ((class132.field1901 >> 7) + class215.field3059 & 0x3F) + "," + ((class310.field4240 >> 7) + class79.field1134 & 0x3F) + " Height: " + (class186.method1118(class132.field1901, class310.field4240, 12840, class75.field1089.field464) - class526.field7729));
                    class58.method376((byte) 20, "Look: " + class75.field1089.field464 + "," + (class412.field6044 + class215.field3059 >> 6) + "," + (class133.field1934 + class79.field1134 >> 6) + "," + (class412.field6044 + class215.field3059 & 0x3F) + "," + (class133.field1934 + class79.field1134 & 0x3F) + " Height: " + (class186.method1118(class412.field6044, class133.field1934, 12840, class75.field1089.field464) - class477.field6983));
                    return;
                }
                if (arg2.equals("showocc")) {
                    class393.field5480 = !class393.field5480;
                    class430.method2571((byte) -38);
                    class58.method376((byte) 67, "showocc=" + class393.field5480);
                    return;
                }
                if (arg2.equals("wallocc")) {
                    class2.field21 = !class2.field21;
                    class430.method2571((byte) -44);
                    class58.method376((byte) -104, "forcewallocc=" + class2.field21);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class176.field2503 = !class176.field2503;
                    class418.field6109.method451(class176.field2503);
                    class173.method1070(arg0 + 126);
                    class58.method376((byte) -6, "showprofiling=" + class176.field2503);
                    return;
                }
                if (arg2.equals("performancetest")) {
                    class58.method376((byte) -128, "Java toolkit: " + class504.method2965(-90, 0, class282.field3804));
                    class58.method376((byte) -122, "GL toolkit:   " + class504.method2965(-73, 1, class282.field3804));
                    class58.method376((byte) 6, "SSE toolkit:  " + class504.method2965(-79, 2, class282.field3804));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class133.field1906 = !class133.field1906;
                    class58.method376((byte) -112, "nonpcs=" + class133.field1906);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class154.method968(-116);
                    class58.method376((byte) -108, "auto world selected");
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class356.method1978((byte) 46, class35.field491);
                    class244.field3395.method2084(0, false);
                    int var16 = class244.field3395.field5069;
                    int var17 = arg2.indexOf(" ", 4);
                    class244.field3395.method2073(115, arg2.substring(3, var17));
                    class47.method291(arg2.substring(var17), arg0 + 3, class244.field3395);
                    class244.field3395.method2107(class244.field3395.field5069 - var16, -104);
                    return;
                }
                if (arg2.equals("heap")) {
                    class58.method376((byte) 24, "Heap: " + class463.field6730 + "MB");
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class477.method2805((byte) -109);
                    class58.method376((byte) -11, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var18 = 0; var18 < class505.field7432.length; var18++) {
                        if (class326.field4473[var18]) {
                            class505.field7432[var18] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class505.field7432[var18] *= -1;
                            }
                        }
                    }
                    class477.method2805((byte) -115);
                    class58.method376((byte) 64, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class43.field601 = true;
                    class499.method2942(-1);
                    class58.method376((byte) 27, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class43.field601 = false;
                    class499.method2942(-1);
                    class58.method376((byte) -118, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class193.method1169(-11544);
                    class58.method376((byte) -102, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class58.method376((byte) -117, class264.method1527(true) + "ms");
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg2.substring(9));
                    if (var19 >= 0 && var19 <= 4) {
                        class437.field6374.field4256 = var19;
                    }
                    class58.method376((byte) 127, "cpuusage=" + class437.field6374.field4256);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg2.substring(17));
                    class58.method376((byte) 13, "varpbit=" + class453.field6623.method205(var20, 15503));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg2.substring(14));
                    class58.method376((byte) -115, "varp=" + class453.field6623.method204(var21, arg0 ^ 0xFFFFFFBD));
                    return;
                }
                if (arg2.startsWith("csprofileclear")) {
                    class475.method2786();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class475.method2795(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class475.method2795(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg2.substring(8));
                    class418.field6109.method527(var22);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class58.method376((byte) 49, "Active streams: " + class189.field2623.method941());
                    return;
                }
                if (class137.field1958 == 30) {
                    class356.method1978((byte) 117, class146.field2079);
                    class515.field7558++;
                    class244.field3395.method2084(arg2.length() + 2, false);
                    class244.field3395.method2084(arg1 ? 1 : 0, false);
                    class244.field3395.method2073(arg0 - 115, arg2);
                }
                if (arg2.startsWith("fps ") && class528.field7773 != class175.field2498) {
                    class241.method1427(arg0 ^ 0x102, class47.method298(false, arg2.substring(4)));
                    return;
                }
                if (class137.field1958 != 30) {
                    class58.method376((byte) -106, "Unrecogonised commmand when not logged in: " + arg2);
                }
            } catch (Exception var23) {
                class58.method376((byte) 122, "Whoops, something went wrong.");
            }
        }
        if (arg0 != -3) {
            method705(-86);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ltu;Lbk;IIIIILqp;IILqa;I)Lc;", line = 1450)
    public final class121 method702(class230 arg0, class253 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class467 arg7, int arg8, int arg9, class162 arg10, int arg11) {
        field1493++;
        int var13 = arg8;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg7.field6806[arg4];
            Object var22 = null;
            var13 = arg8 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class102 var25 = arg1.method1488(-24, var23);
            if (var25 != null) {
                var15 |= var25.method672((byte) 45, var24);
                var14 |= var25.method673(var24, arg2 + 2);
                var17 |= var25.method677((byte) -85, var24);
                var16 |= arg7.field6820;
            }
            if ((arg7.field6816 || class239.field3287) && arg6 != -1 && arg6 < arg7.field6806.length) {
                int var26 = arg7.field6806[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class102 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg1.method1488(-24, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method672((byte) 114, var28);
                    var14 |= var29.method673(var28, 2);
                    var17 |= var29.method677((byte) -89, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg9 | (long) arg5 << 32 | (long) (arg3 << 16);
        class9 var32 = class223.field3137;
        class121 var33;
        synchronized (class223.field3137) {
            var33 = (class121) class223.field3137.method56(var30, 75);
        }
        if (arg2 != 0) {
            return null;
        }
        if (var33 == null || arg10.method472(var33.method775(), var13) != 0) {
            if (var33 != null) {
                var13 = arg10.method463(var13, var33.method775());
            }
            class94[] var35 = new class94[3];
            int var36 = 0;
            if (!arg0.method1348(95, arg9).method842(-27787) || !arg0.method1348(44, arg3).method842(arg2 ^ 0xFFFF9375) || !arg0.method1348(108, arg5).method842(arg2 ^ 0xFFFF9375)) {
                return null;
            }
            class94 var37 = arg0.method1348(77, arg9).method840(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class94 var38 = arg0.method1348(122, arg3).method840(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class94 var39 = arg0.method1348(67, arg5).method840(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class94 var41 = new class94(var35, var36);
            var33 = arg10.method540(var41, var40, class419.field6125, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class425.field6216[var42].length > this.field1490[var42]) {
                    var33.method791(class159.field2288[var42], class425.field6216[var42][this.field1490[var42]]);
                }
                if (this.field1490[var42] < class311.field4288[var42].length) {
                    var33.method791(class458.field6685[var42], class311.field4288[var42][this.field1490[var42]]);
                }
            }
            var33.method787(var13);
            class9 var43 = class223.field3137;
            synchronized (class223.field3137) {
                class223.field3137.method73(var30, var33, 26425);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class121 var44 = var33.method761((byte) 4, var13, true);
            return arg7.method2747(arg6, arg8, arg11, arg4, true, var44);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLtu;II)V", line = 1598)
    public final void method703(byte arg0, class230 arg1, int arg2, int arg3) {
        field1483++;
        if (arg0 < 89) {
            return;
        }
        int var5 = class476.field6956[arg2];
        if (this.field1485[var5] != 0 && arg1.method1348(41, arg3) != null) {
            this.field1485[var5] = class25.method183(Integer.MIN_VALUE, arg3);
            this.method709((byte) -115);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 1622)
    public static final void method704(int arg0) {
        field1480++;
        class52.field700.method714(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class366.field5138[var1] = 0L;
        }
        if (arg0 != -7033) {
            field1487 = false;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class516.field7577[var2] = 0L;
        }
        class190.field2626 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 1655)
    private static final void method705(int arg0) {
        class306.field4201.method1271(arg0);
        field1492++;
        class528.field7770.method2973((byte) 34);
        class201.field2873.method1349(16696);
        class82.field1154.method2124(30);
        class398.field5549.method2813((byte) 125);
        class75.field1097.method822(110);
        class275.field3740.method1491((byte) -65);
        class492.field7279.method2228(-128);
        class389.field5456.method1877(1);
        class468.field6847.method1302(-1748977240);
        class20.field211.method2560(21931);
        class414.field6075.method1559(arg0 ^ 0x51);
        class436.field6349.method853(-13103);
        class169.field2401.method2164(126);
        class284.field3819.method1092(false);
        class56.field771.method1632(1);
        class504.field7416.method1374((byte) 109);
        class269.field3686.method1508(5108);
        class504.field7419.method937(-100);
        class94.field1258.method569(114);
        class261.method1511((byte) -21);
        class322.method1816((byte) -22);
        class454.method2678((byte) -19);
        class530.method3117(false);
        class131.field1810.method65(false);
        class119.field1622.method65(false);
        class183.field2559.method65(false);
        class140.field1992.method65(false);
        class475.field6951.method65(false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 1701)
    public final void method706(boolean arg0, int arg1) {
        field1484++;
        if (arg1 != 128) {
            this.field1485 = null;
        }
        this.field1481 = arg0;
        this.method709((byte) -115);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 1716)
    public final void method707(int arg0, int arg1, int arg2) {
        this.field1490[arg1] = arg0;
        if (arg2 <= -118) {
            field1482++;
            this.method709((byte) -115);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I", line = 1728)
    public static final int method708(int arg0, int arg1) {
        int var2 = -41 / ((arg1 - 9) / 45);
        field1491++;
        return (arg0 & 0x3FF2F) >> 11;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 1742)
    private final void method709(byte arg0) {
        field1489++;
        if (arg0 != -115) {
            return;
        }
        this.field1496 = -1L;
        long[] var2 = class444.field6450;
        this.field1496 = var2[(int) ((this.field1496 ^ (long) (this.field1501 >> 8)) & 0xFFL)] ^ this.field1496 >>> 8;
        this.field1496 = this.field1496 >>> 8 ^ var2[(int) ((this.field1496 ^ (long) this.field1501) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1496 = this.field1496 >>> 8 ^ var2[(int) (((long) (this.field1485[var3] >> 24) ^ this.field1496) & 0xFFL)];
            this.field1496 = var2[(int) (((long) (this.field1485[var3] >> 16) ^ this.field1496) & 0xFFL)] ^ this.field1496 >>> 8;
            this.field1496 = this.field1496 >>> 8 ^ var2[(int) (((long) (this.field1485[var3] >> 8) ^ this.field1496) & 0xFFL)];
            this.field1496 = this.field1496 >>> 8 ^ var2[(int) (((long) this.field1485[var3] ^ this.field1496) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1496 = this.field1496 >>> 8 ^ var2[(int) ((this.field1496 ^ (long) this.field1490[var4]) & 0xFFL)];
        }
        this.field1496 = this.field1496 >>> 8 ^ var2[(int) (((long) (this.field1481 ? 1 : 0) ^ this.field1496) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 1781)
    public static void method710(int arg0) {
        if (arg0 != -1) {
            field1487 = true;
        }
        field1486 = null;
        field1494 = null;
    }
}

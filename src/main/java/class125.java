import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class125 {

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1664 = "Allocated memory";

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "J")
    private long field1655;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "J")
    private long field1674;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lkk;")
    public static class295 field1672;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
    public boolean field1670;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    public int[] field1669;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
    private int[] field1678;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "[[I")
    private int[][] field1681;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method920(int arg0) {
        if (arg0 >= -55) {
            field1665 = -59;
        }
        field1667++;
        class270.field3870.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 22)
    public static void method921(int arg0) {
        field1664 = null;
        field1672 = null;
        if (arg0 != -22374) {
            method921(-62);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I", line = 36)
    public static final int method922(int arg0, byte arg1, int arg2) {
        field1661++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 < 14) {
            method922(84, (byte) -90, -27);
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V", line = 71)
    public final void method923(byte arg0, int arg1, int arg2) {
        field1658++;
        int var4 = class335.field5230[arg1];
        if (this.field1678[var4] != 0 && class89.method647(-27169, arg2) != null) {
            this.field1678[var4] = class80.method568(Integer.MIN_VALUE, arg2);
            if (arg0 < -37) {
                this.method925(0);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V", line = 97)
    public final void method924(boolean arg0, int arg1) {
        field1666++;
        if (arg1 != 12) {
            method926(105, (byte) -81, -42, -79, 7, -125);
        }
        this.field1670 = arg0;
        this.method925(0);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 111)
    private final void method925(int arg0) {
        field1663++;
        long var2 = this.field1655;
        long[] var4 = class13.field152;
        this.field1655 = -1L;
        this.field1655 = this.field1655 >>> 8 ^ var4[(int) (((long) (this.field1656 >> 8) ^ this.field1655) & 0xFFL)];
        this.field1655 = var4[(int) ((this.field1655 ^ (long) this.field1656) & 0xFFL)] ^ this.field1655 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1655 = this.field1655 >>> 8 ^ var4[(int) (((long) (this.field1678[var5] >> 24) ^ this.field1655) & 0xFFL)];
            this.field1655 = this.field1655 >>> 8 ^ var4[(int) (((long) (this.field1678[var5] >> 16) ^ this.field1655) & 0xFFL)];
            this.field1655 = var4[(int) ((this.field1655 ^ (long) (this.field1678[var5] >> 8)) & 0xFFL)] ^ this.field1655 >>> 8;
            this.field1655 = var4[(int) ((this.field1655 ^ (long) this.field1678[var5]) & 0xFFL)] ^ this.field1655 >>> 8;
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            this.field1655 = this.field1655 >>> 8 ^ var4[(int) (((long) this.field1669[var6] ^ this.field1655) & 0xFFL)];
        }
        this.field1655 = var4[(int) ((this.field1655 ^ (long) (this.field1670 ? 1 : 0)) & 0xFFL)] ^ this.field1655 >>> 8;
        if (var2 != 0L && this.field1655 != var2) {
            class341.field5323.method2259(var2, 882);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIII)V", line = 150)
    public static final void method926(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1673++;
        int var6 = (arg0 - 32) * arg0 / arg3;
        int var7 = 114 % ((-arg1 - 29) / 45);
        class311.field4578[0].method937(arg2, arg4);
        if (var6 < 8) {
            var6 = 8;
        }
        class311.field4578[1].method937(arg2, arg0 + arg4 - 16);
        int var8 = (arg0 - var6 - 32) * arg5 / (arg3 - arg0);
        if (!class47.field623) {
            class37.method231(arg2, arg4 + 16, 16, arg0 - 32, class201.field2823);
            class37.method231(arg2, arg4 + var8 + 16, 16, var6, class71.field925);
            class37.method238(arg2, arg4 + var8 + 16, var6, class279.field3977);
            class37.method238(arg2 + 1, arg4 + 16 + var8, var6, class279.field3977);
            class37.method240(arg2, arg4 + var8 + 16, 16, class279.field3977);
            class37.method240(arg2, arg4 + var8 + 17, 16, class279.field3977);
            class37.method238(arg2 + 15, arg4 + var8 - -16, var6, class97.field1278);
            class37.method238(arg2 + 14, var8 + 17 + arg4, var6 - 1, class97.field1278);
            class37.method240(arg2, var6 + var8 + arg4 + 15, 16, class97.field1278);
            class37.method240(arg2 + 1, 14 - -var6 + arg4 + var8, 15, class97.field1278);
            return;
        }
        class129.method997(arg2, arg4 + 16, 16, arg0 - 32, class201.field2823);
        class129.method997(arg2, arg4 - (-var8 - 16), 16, var6, class71.field925);
        class129.method984(arg2, var8 + arg4 + 16, var6, class279.field3977);
        class129.method984(arg2 + 1, arg4 + 16 + var8, var6, class279.field3977);
        class129.method995(arg2, arg4 + var8 + 16, 16, class279.field3977);
        class129.method995(arg2, arg4 + var8 + 17, 16, class279.field3977);
        class129.method984(arg2 + 15, arg4 - (-var8 + -16), var6, class97.field1278);
        class129.method984(arg2 + 14, arg4 + 17 + var8, var6 - 1, class97.field1278);
        class129.method995(arg2, arg4 + var6 + var8 + 15, 16, class97.field1278);
        class129.method995(arg2 + 1, arg4 - -var8 + var6 + 14, 15, class97.field1278);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lre;IIILeg;IIZILeg;ZI)Lvg;", line = 201)
    public final class81 method927(class274[] arg0, int arg1, int arg2, int arg3, class314 arg4, int arg5, int arg6, boolean arg7, int arg8, class314 arg9, boolean arg10, int arg11) {
        if (arg6 != -7453) {
            this.method927((class274[]) null, 33, -35, -5, (class314) null, -13, -2, true, 67, (class314) null, true, -61);
        }
        field1662++;
        if (this.field1676 != -1) {
            return class148.method1138(-3, this.field1676).method1213(arg5, arg8, -125, arg4, arg9, arg2, arg0, arg3, arg1, arg11);
        }
        int[] var13 = this.field1678;
        long var14 = this.field1655;
        if (arg9 != null && (arg9.field4608 >= 0 || arg9.field4619 >= 0)) {
            var13 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var13[var16] = this.field1678[var16];
            }
            if (arg9.field4608 >= 0) {
                if (arg9.field4608 == 65535) {
                    var13[5] = 0;
                    var14 ^= 0xFFFFFFFF00000000L;
                } else {
                    var13[5] = class80.method568(arg9.field4608, 1073741824);
                    var14 ^= (long) var13[5] << 32;
                }
            }
            if (arg9.field4619 >= 0) {
                if (arg9.field4619 == 65535) {
                    var14 ^= 0xFFFFFFFFL;
                    var13[3] = 0;
                } else {
                    var13[3] = class80.method568(arg9.field4619, 1073741824);
                    var14 ^= (long) var13[3];
                }
            }
        }
        class81 var17 = (class81) class341.field5323.method2265(var14, (byte) -101);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var13[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var20) != 0 && !class89.method647(-27169, var20 & 0x3FFFFFFF).method170((byte) -106)) {
                        var18 = true;
                    }
                } else if (!class172.method1265(var20 & 0x3FFFFFFF, (byte) 72).method2521((byte) 98, this.field1670)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field1674 != -1L) {
                    var17 = (class81) class341.field5323.method2265(this.field1674, (byte) 37);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class197[] var21 = new class197[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var13[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class197 var24 = class172.method1265(var23 & 0x3FFFFFFF, (byte) -126).method2514(this.field1670, false);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var23) != 0) {
                        class197 var25 = class89.method647(-27169, var23 & 0x3FFFFFFF).method166((byte) 86);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    }
                }
                class91 var26 = null;
                if (this.field1656 != -1) {
                    var26 = class317.method2192(-16596, this.field1656);
                }
                if (var26 != null && var26.field1177 != null) {
                    for (int var27 = 0; var27 < var26.field1177.length; var27++) {
                        if (var26.field1177[var27] != null && var21[var27] != null) {
                            int var28 = var26.field1177[var27][0];
                            int var29 = var26.field1177[var27][1];
                            int var30 = var26.field1177[var27][2];
                            int var31 = var26.field1177[var27][3];
                            int var32 = var26.field1177[var27][5];
                            int var33 = var26.field1177[var27][4];
                            if (this.field1681 == null) {
                                this.field1681 = new int[var26.field1177.length][];
                            }
                            if (this.field1681[var27] == null) {
                                int[] var34 = this.field1681[var27] = new int[15];
                                if (var31 == 0 && var33 == 0 && var32 == 0) {
                                    var34[13] = -var29;
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[14] = -var30;
                                    var34[12] = -var28;
                                } else {
                                    int var35 = class350.field5474[var31] >> 1;
                                    int var36 = class350.field5476[var31] >> 1;
                                    int var37 = class350.field5474[var33] >> 1;
                                    int var38 = class350.field5476[var32] >> 1;
                                    int var39 = class350.field5476[var33] >> 1;
                                    int var40 = var36 * var38 + 16384 >> 15;
                                    int var41 = class350.field5474[var32] >> 1;
                                    int var42 = var36 * var41 + 16384 >> 15;
                                    var34[3] = var35 * var38 + 16384 >> 15;
                                    var34[1] = -var38 * var37 + (var39 * var42) + 16384 >> 15;
                                    var34[8] = var35 * var37 + 16384 >> 15;
                                    var34[7] = -var38 * -var39 + (var37 * var42) + 16384 >> 15;
                                    var34[6] = var37 * var40 + -var39 * var41 + 16384 >> 15;
                                    var34[4] = var35 * var41 + 16384 >> 15;
                                    var34[13] = var34[1] * -var28 + var34[7] * -var30 + (var34[4] * -var29) + 16384 >> 15;
                                    var34[5] = -var36;
                                    var34[2] = var35 * var39 + 16384 >> 15;
                                    var34[0] = var37 * var41 + var39 * var40 + 16384 >> 15;
                                    var34[12] = var34[3] * -var29 + var34[0] * -var28 + var34[6] * -var30 + 16384 >> 15;
                                    var34[14] = var34[5] * -var29 + var34[8] * -var30 + var34[2] * -var28 + 16384 >> 15;
                                }
                                var34[10] = var29;
                                var34[9] = var28;
                                var34[11] = var30;
                            }
                            if (var31 != 0 || var33 != 0 || var32 != 0) {
                                var21[var27].method1432(var31, var33, var32);
                            }
                            if (var28 != 0 || var29 != 0 || var30 != 0) {
                                var21[var27].method1421(var28, var29, var30);
                            }
                        }
                    }
                }
                class197 var43 = new class197(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class17.field211[var44].length > this.field1669[var44]) {
                        var43.method1446(class225.field3240[var44], class17.field211[var44][this.field1669[var44]]);
                    }
                    if (class40.field492[var44].length > this.field1669[var44]) {
                        var43.method1446(class15.field173[var44], class40.field492[var44][this.field1669[var44]]);
                    }
                }
                var17 = var43.method1439(64, 850, -30, -50, -30);
                if (class47.field623) {
                    ((class128) var17).method973(false, false, true, true, false, false, true);
                }
                if (arg10) {
                    class341.field5323.method2257(-128, var17, var14);
                    this.field1674 = var14;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg0 == null ? 0 : arg0.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg0[var50] != null) {
                class314 var51 = class207.method1516(arg0[var50].field3920, 124);
                if (var51.field4631 != null) {
                    var45 = true;
                    class119.field1576[var50] = var51;
                    int var52 = arg0[var50].field3927;
                    int var53 = arg0[var50].field3929;
                    int var54 = var51.field4631[var52];
                    class115.field1485[var50] = class270.method1843(var54 >>> 16, arg6 + 7452);
                    int var55 = var54 & 0xFFFF;
                    class287.field4155[var50] = var55;
                    if (class115.field1485[var50] != null) {
                        var47 |= class115.field1485[var50].method1797(3, var55);
                        var46 |= class115.field1485[var50].method1796((byte) -39, var55);
                        var48 |= var51.field4630;
                    }
                    if ((var51.field4617 || class354.field5523) && var53 != -1 && var51.field4631.length > var53) {
                        class116.field1497[var50] = var51.field4627[var52];
                        class170.field2363[var50] = arg0[var50].field3924;
                        int var56 = var51.field4631[var53];
                        class206.field2869[var50] = class270.method1843(var56 >>> 16, -1);
                        int var57 = var56 & 0xFFFF;
                        class117.field1528[var50] = var57;
                        if (class206.field2869[var50] != null) {
                            var47 |= class206.field2869[var50].method1797(arg6 + 7456, var57);
                            var46 |= class206.field2869[var50].method1796((byte) -39, var57);
                        }
                    } else {
                        class116.field1497[var50] = 0;
                        class170.field2363[var50] = 0;
                        class206.field2869[var50] = null;
                        class117.field1528[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg9 != null || arg4 != null) {
            int var58 = -1;
            int var59 = -1;
            class261 var60 = null;
            int var61 = 0;
            class261 var62 = null;
            if (arg9 != null) {
                int var63 = arg9.field4631[arg5];
                int var64 = var63 >>> 16;
                var58 = var63 & 0xFFFF;
                var60 = class270.method1843(var64, -1);
                if (var60 != null) {
                    var47 |= var60.method1797(arg6 + 7456, var58);
                    var46 |= var60.method1796((byte) -39, var58);
                    var48 |= arg9.field4630;
                }
                if ((arg9.field4617 || class354.field5523) && arg2 != -1 && arg2 < arg9.field4631.length) {
                    int var65 = arg9.field4631[arg2];
                    int var66 = var65 >>> 16;
                    var59 = var65 & 0xFFFF;
                    var61 = arg9.field4627[arg5];
                    if (var64 == var66) {
                        var62 = var60;
                    } else {
                        var62 = class270.method1843(var59 >>> 16, -1);
                    }
                    if (var62 != null) {
                        var47 |= var62.method1797(arg6 ^ 0xFFFFE2E0, var59);
                        var46 |= var62.method1796((byte) -39, var59);
                    }
                }
            }
            int var67 = -1;
            int var68 = 0;
            int var69 = -1;
            class261 var70 = null;
            class261 var71 = null;
            if (arg4 != null) {
                int var72 = arg4.field4631[arg1];
                int var73 = var72 >>> 16;
                var71 = class270.method1843(var73, -1);
                var69 = var72 & 0xFFFF;
                if (var71 != null) {
                    var47 |= var71.method1797(3, var69);
                    var46 |= var71.method1796((byte) -39, var69);
                    var48 |= arg4.field4630;
                }
                if ((arg4.field4617 || class354.field5523) && arg3 != -1 && arg3 < arg4.field4631.length) {
                    var68 = arg4.field4627[arg1];
                    int var74 = arg4.field4631[arg3];
                    int var75 = var74 >>> 16;
                    var67 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var70 = var71;
                    } else {
                        var70 = class270.method1843(var67 >>> 16, -1);
                    }
                    if (var70 != null) {
                        var47 |= var70.method1797(3, var67);
                        var46 |= var70.method1796((byte) -39, var67);
                    }
                }
            }
            class81 var76 = var17.method590(!var46, !var47, !var48);
            int var77 = 0;
            int var78 = 1;
            while (var49 > var77) {
                if (class115.field1485[var77] != null) {
                    var76.method598(class115.field1485[var77], class287.field4155[var77], class206.field2869[var77], class117.field1528[var77], class170.field2363[var77] - 1, class116.field1497[var77], var78, class119.field1576[var77].field4630, this.field1681[var77]);
                }
                var77++;
                var78 <<= 0x1;
            }
            if (var60 != null && var71 != null) {
                var76.method572(var60, var58, var62, var59, arg11 - 1, var61, var71, var69, var70, var67, arg8 - 1, var68, arg9.field4607, arg4.field4630 | arg9.field4630);
            } else if (var60 != null) {
                var76.method594(var60, var58, var62, var59, arg11 - 1, var61, arg9.field4630);
            } else if (var71 != null) {
                var76.method594(var71, var69, var70, var67, arg8 - 1, var68, arg4.field4630);
            }
            for (int var79 = 0; var79 < var49; var79++) {
                class115.field1485[var79] = null;
                class206.field2869[var79] = null;
                class119.field1576[var79] = null;
            }
            return var76;
        } else if (arg7) {
            return var17.method590(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILeg;IIIIII)Lvg;", line = 684)
    public final class81 method928(int arg0, class314 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg3 << 32 | (long) (arg2 << 16) | (long) arg6;
        field1677++;
        class81 var11 = (class81) class82.field1044.method2265(var9, (byte) 36);
        if (var11 == null) {
            int var12 = 0;
            class197[] var13 = new class197[3];
            if (!class89.method647(arg0 - 27163, arg6).method173(-32390) || !class89.method647(-27169, arg2).method173(arg0 - 32384) || !class89.method647(-27169, arg3).method173(arg0 ^ 0x7E80)) {
                return null;
            }
            class197 var14 = class89.method647(-27169, arg6).method165(-116);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class197 var15 = class89.method647(-27169, arg2).method165(-104);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class197 var16 = class89.method647(-27169, arg3).method165(-115);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class197 var17 = new class197(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class17.field211[var18].length > this.field1669[var18]) {
                    var17.method1446(class225.field3240[var18], class17.field211[var18][this.field1669[var18]]);
                }
                if (class40.field492[var18].length > this.field1669[var18]) {
                    var17.method1446(class15.field173[var18], class40.field492[var18][this.field1669[var18]]);
                }
            }
            var11 = var17.method1439(64, 768, -50, -10, -50);
            class82.field1044.method2257(-128, var11, var9);
        }
        if (arg1 != null) {
            var11 = arg1.method2173(false, arg5, arg7, var11, arg4);
        }
        return arg0 == -6 ? var11 : (class81) null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[II[IZ)V", line = 752)
    public final void method929(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, boolean arg5) {
        field1675++;
        if (this.field1656 != arg3) {
            this.field1656 = arg3;
            this.field1681 = (int[][]) null;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class1.field5; var8++) {
                    class25 var9 = class89.method647(-27169, var8);
                    if (var9 != null && !var9.field286 && (arg5 ? class30.field353[var7] : class362.field5659[var7]) == var9.field294) {
                        arg2[class335.field5230[var7]] = class80.method568(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1678 = arg2;
        this.field1669 = arg4;
        this.field1670 = arg5;
        this.field1676 = arg1;
        this.method925(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I", line = 800)
    public final int method930(byte arg0) {
        field1680++;
        if (arg0 != 99) {
            this.method928(120, (class314) null, 12, 70, -18, -60, -53, -37);
        }
        return this.field1676 == -1 ? (this.field1678[0] << 15) + (this.field1678[11] << 5) + (this.field1669[4] << 20) + (this.field1678[8] << 10) + (this.field1669[0] << 25) + this.field1678[1] : class148.method1138(-3, this.field1676).field2214 + 305419896;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILeg;IBI)Lvg;", line = 821)
    public final class81 method931(int arg0, class314 arg1, int arg2, byte arg3, int arg4) {
        field1668++;
        if (this.field1676 != -1) {
            return class148.method1138(-3, this.field1676).method1211(arg2, arg1, (byte) -12, arg0, arg4);
        }
        class81 var6 = (class81) class82.field1044.method2265(this.field1655, (byte) 35);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field1678[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class89.method647(-27169, var9 & 0x3FFFFFFF).method173(-32390)) {
                        var7 = true;
                    }
                } else if (!class172.method1265(var9 & 0x3FFFFFFF, (byte) 90).method2527(this.field1670, 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class197[] var10 = new class197[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field1678[var12];
                if ((var13 & 0x40000000) != 0) {
                    class197 var14 = class172.method1265(var13 & 0x3FFFFFFF, (byte) 84).method2518(-20152, this.field1670);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class197 var15 = class89.method647(-27169, var13 & 0x3FFFFFFF).method165(-103);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                }
            }
            class197 var16 = new class197(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class17.field211[var17].length > this.field1669[var17]) {
                    var16.method1446(class225.field3240[var17], class17.field211[var17][this.field1669[var17]]);
                }
                if (this.field1669[var17] < class40.field492[var17].length) {
                    var16.method1446(class15.field173[var17], class40.field492[var17][this.field1669[var17]]);
                }
            }
            var6 = var16.method1439(64, 768, -50, -10, -50);
            class82.field1044.method2257(-128, var6, this.field1655);
        }
        if (arg1 != null) {
            var6 = arg1.method2173(false, arg0, arg2, var6, arg4);
        }
        if (arg3 <= 52) {
            this.method929(100, 96, (int[]) null, -54, (int[]) null, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBI)V", line = 935)
    public final void method932(int arg0, byte arg1, int arg2) {
        this.field1669[arg0] = arg2;
        field1679++;
        if (arg1 == -103) {
            this.method925(0);
        }
    }
}

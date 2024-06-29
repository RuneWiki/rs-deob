import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class21 extends class68 {

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    private int field307 = -1;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "[Lca;")
    public static class271[] field305 = new class271[4];

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "Ljava/lang/String;")
    public static String field301 = "cyan:";

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bk", name = "jb", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bk", name = "kb", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "Lhc;")
    public static class235 field299;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Lpd;")
    public static class58 field298;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "[I")
    private int[] field311;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(B)V")
    public static void method152(byte arg0) {
        if (arg0 != 89) {
            method152((byte) 113);
        }
        field298 = null;
        field301 = null;
        field299 = null;
        field305 = null;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)I")
    public final int method153(byte arg0) {
        if (arg0 != -63) {
            return -52;
        } else {
            ++field302;
            return this.field307;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lhc;B)V")
    public static final void method154(class235 arg0, byte arg1) {
        if (arg1 >= -51) {
            method156(false, 78L);
        }
        class142.field1971 = arg0;
        ++field308;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lhc;I)I")
    public static final int method155(class235 arg0, int arg1) {
        int var2 = arg1;
        ++field306;
        if (arg0.method1570((byte) -39, class13.field133)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1570((byte) -39, class8.field66)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class264.field3963)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class208.field2949)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class86.field1164)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class137.field1918)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class125.field1750)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class31.field419)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class289.field4562)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class124.field1747)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class246.field3769)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class284.field4456)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class273.field4223)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class172.field2387)) {
            ++var2;
        }
        if (arg0.method1570((byte) -39, class295.field4649)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZJ)V")
    public static final void method156(boolean arg0, long arg1) {
        ++field300;
        if (arg1 != 0L) {
            if (arg0) {
                field298 = null;
            }
            for (int var3 = 0; var3 < class93.field1300; ++var3) {
                if (class296.field4677[var3] == arg1) {
                    ++class93.field1297;
                    --class93.field1300;
                    for (int var4 = var3; class93.field1300 > var4; ++var4) {
                        class296.field4677[var4] = class296.field4677[var4 + 1];
                        class186.field2573[var4] = class186.field2573[var4 + 1];
                        class294.field4621[var4] = class294.field4621[var4 + 1];
                    }
                    class66.field892 = class35.field548;
                    class281.field4359.method1864(57, (byte) -69);
                    class281.field4359.method1451(arg1, (byte) -24);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field312;
            if (~arg1 == -1) {
                this.field307 = arg0.method1445(false);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZIILgj;Lgh;IIIIIIIII)Lgh;")
    public static final class25 method157(boolean arg0, int arg1, int arg2, class240 arg3, class25 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field304;
        long var14 = ((long) arg6 << 48) + ((long) arg11 << 32) + (long) ((arg1 << 16) + (arg9 << 24) + arg8);
        class25 var16 = (class25) class231.field3497.method540((byte) -115, var14);
        if (var16 == null) {
            byte var17;
            if (arg8 == 1) {
                var17 = 9;
            } else if (arg8 != 2) {
                if (~arg8 != -4) {
                    if (arg8 == 4) {
                        var17 = 18;
                    } else {
                        var17 = 21;
                    }
                } else {
                    var17 = 15;
                }
            } else {
                var17 = 12;
            }
            byte var18 = 3;
            class271 var19 = new class271(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[][] var20 = new int[var18][var17];
            int var21 = var19.method1801(0, 0, 0);
            int[] var22 = new int[] { 64, 96, 128 };
            for (int var23 = 0; var18 > var23; ++var23) {
                int var30 = var22[var23];
                int var31 = var22[var23];
                for (int var32 = 0; var17 > var32; ++var32) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg2 - -(class90.field1259[var33] * var30) >> 16;
                    int var35 = class90.field1255[var33] * var31 + arg13 >> 16;
                    var20[var23][var32] = var19.method1801(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var24 > ~var18; ++var24) {
                int var25 = (var24 * 256 - -128) / var18;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg1 * var26 + arg9 * var25 >> 8);
                short var28 = (short) (((64512 & arg6) * var25 + (64512 & arg11) * var26 & 16515072) + ((arg6 & 127) * var25 + (127 & arg11) * var26 & 32512) + (229376 & (arg6 & 896) * var25 + (arg11 & 896) * var26) >> 8);
                for (int var29 = 0; var29 < var17; ++var29) {
                    if (var24 == 0) {
                        var19.method1810(var21, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method1810(var20[var24 - 1][var29], var20[var24 + -1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var19.method1810(var20[var24 + -1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method1794(64, 768, -50, -10, -50);
            class231.field3497.method543(var16, var14, 858993459);
        }
        if (arg7 < 78) {
            return null;
        } else {
            int var36 = arg8 * 64 + -1;
            int var37 = -var36;
            int var38 = var36;
            int var39 = arg4.method127();
            int var40 = var36;
            int var41 = -var36;
            if (arg0) {
                if (arg10 > 640 && arg10 < 1408) {
                    var40 = var36 + 128;
                }
                if (arg10 > 1664 || ~arg10 > -385) {
                    var37 -= 128;
                }
                if (~arg10 < -1153 && arg10 < 1920) {
                    var38 = var36 + 128;
                }
                if (~arg10 < -129 && arg10 < 896) {
                    var41 -= 128;
                }
            }
            if (var39 < var41) {
                var39 = var41;
            }
            int var42 = arg4.method117();
            if (~var42 < ~var38) {
                var42 = var38;
            }
            int var43 = arg4.method105();
            int var44 = arg4.method108();
            if (var40 < var44) {
                var44 = var40;
            }
            class159 var45 = null;
            if (arg3 != null) {
                int var46 = arg3.field3665[arg5];
                var45 = class245.method1648(67, var46 >> 16);
                arg5 = var46 & 65535;
            }
            if (var43 < var37) {
                var43 = var37;
            }
            class25 var47;
            if (var45 != null) {
                var47 = var16.method136(!var45.method1058(126, arg5), !var45.method1061(arg5, -1), true);
                var47.method135((var42 - var39) / 2, 128, (-var43 + var44) / 2);
                var47.method119((var39 + var42) / 2, 0, (var43 + var44) / 2);
                var47.method171(var45, arg5);
            } else {
                var47 = var16.method136(true, true, true);
                var47.method135((-var39 + var42) / 2, 128, (var44 - var43) / 2);
                var47.method119((var39 + var42) / 2, 0, (var43 + var44) / 2);
            }
            if (~arg10 != -1) {
                var47.method131(arg10);
            }
            class18 var48 = (class18) var47;
            if (class275.method1836(class295.field4642, arg13 - -var43, arg2 + var39, 96) != arg12 || ~arg12 != ~class275.method1836(class295.field4642, arg13 + var44, arg2 - -var42, 47)) {
                for (int var49 = 0; var48.field191 > var49; ++var49) {
                    var48.field213[var49] += class275.method1836(class295.field4642, var48.field201[var49] + arg13, var48.field208[var49] + arg2, 103) + -arg12;
                }
                var48.field186 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Z")
    private final boolean method158(int arg0) {
        ++field315;
        if (this.field311 != null) {
            return true;
        } else if (this.field307 >= 0) {
            int var2 = class89.field1248;
            int var3 = class62.field861;
            int var4 = class199.field2775.method699(this.field307, false).field3840 ? 64 : 128;
            this.field311 = class199.field2775.method697(1.0F, false, 4, this.field307, var4, var4);
            this.field293 = var4;
            this.field294 = var4;
            class123.method811(-1, var3, var2);
            return this.field311 != null;
        } else {
            int var5 = -37 % ((arg0 - 43) / 38);
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field314;
        int var3 = -35 % ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374 && this.method158(83)) {
            int var5 = this.field293 * (~class62.field861 == ~this.field294 ? arg0 : this.field294 * arg0 / class62.field861);
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            if (class89.field1248 != this.field293) {
                for (int var9 = 0; var9 < class89.field1248; ++var9) {
                    int var10 = this.field293 * var9 / class89.field1248;
                    int var11 = this.field311[var5 - -var10];
                    var6[var9] = class235.method1572(255, var11) << 4;
                    var8[var9] = class235.method1572(var11, 65280) >> 4;
                    var7[var9] = class235.method1572(var11, 16711680) >> 12;
                }
            } else {
                for (int var12 = 0; ~class89.field1248 < ~var12; ++var12) {
                    int var13 = this.field311[var5++];
                    var6[var12] = class235.method1572(var13, 255) << 4;
                    var8[var12] = class235.method1572(var13 >> 4, 4080);
                    var7[var12] = class235.method1572(16711680, var13) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public final void method159(byte arg0) {
        super.method159(arg0);
        this.field311 = null;
        ++field303;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZLjb;BIIIIIII)V")
    public static final void method160(boolean arg0, boolean arg1, class276 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field310;
        if (arg0 && !class34.method231(116) && (2 & class230.field3489[0][arg7][arg4]) == 0) {
            if (~(16 & class230.field3489[arg5][arg7][arg4]) != -1) {
                return;
            }
            if (class82.method513((byte) 127, arg7, arg4, arg5) != class281.field4361) {
                return;
            }
        }
        if (~arg5 > ~class138.field1927) {
            class138.field1927 = arg5;
        }
        class111 var11 = class76.method489(arg10, 123);
        int var12;
        int var13;
        if (arg9 != 1 && ~arg9 != -4) {
            var12 = var11.field1598;
            var13 = var11.field1582;
        } else {
            var13 = var11.field1598;
            var12 = var11.field1582;
        }
        int var14;
        int var15;
        if (~(arg7 + var13) >= -105) {
            var14 = arg7 - -(var13 + 1 >> 1);
            var15 = (var13 >> 1) + arg7;
        } else {
            var15 = arg7;
            var14 = arg7 + 1;
        }
        int var16;
        int var17;
        if (~(arg4 + var12) < -105) {
            var16 = arg4 + 1;
            var17 = arg4;
        } else {
            var17 = (var12 >> 1) + arg4;
            var16 = (var12 + 1 >> 1) + arg4;
        }
        int var18 = (arg7 << 7) + (var13 << 6);
        int[][] var19 = class200.field2788[arg8];
        int var20 = var19[var15][var17] - (-var19[var15][var16] - var19[var14][var16]) + var19[var14][var17] >> 2;
        int[][] var21 = null;
        int var22 = (arg4 << 7) - -(var12 << 6);
        long var23 = (long) (arg4 << 7 | arg7 | arg6 << 14 | arg9 << 20 | 1073741824);
        if (arg1) {
            var21 = class137.field1924[0];
        } else if (arg8 < 3) {
            var21 = class200.field2788[arg8 + 1];
        }
        if (~var11.field1605 == -1 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (~var11.field1580 == -2) {
            var23 |= 4194304L;
        }
        if (var11.field1581) {
            var23 |= 2147483648L;
        }
        long var25 = var23 | (long) arg10 << 32;
        if (var11.method719(86)) {
            class253.method1692((class140) null, arg9, 128, arg7, arg5, arg4, (class88) null, var11);
        }
        int var27 = var11.field1559;
        boolean var28 = var11.field1610 & !arg1;
        if (~arg6 == -23) {
            if (class75.field1053 || ~var11.field1605 != -1 || var11.field1584 == 1 || var11.field1574) {
                class268 var30;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var29 = var11.method723(22, arg0, var19, (class72) null, var20, arg9, var22, -3, var18, var21, var28);
                    var30 = var29.field1686;
                } else {
                    var30 = new class123(arg10, 22, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class251.method1679(arg5, arg7, arg4, var20, var30, var25, var11.field1594);
                if (var11.field1584 == 1 && arg2 != null) {
                    arg2.method1846(arg4, arg3 ^ -50, arg7);
                }
            }
        } else if (~arg6 != -11 && arg6 != 11) {
            if (~arg6 <= -13) {
                class268 var32;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var31 = var11.method723(arg6, arg0, var19, (class72) null, var20, arg9, var22, 122, var18, var21, var28);
                    var32 = var31.field1686;
                } else {
                    var32 = new class123(arg10, arg6, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class281.method1889(arg5, arg7, arg4, var20, 1, 1, var32, 0, var25);
                if (arg0 && ~arg6 <= -13 && ~arg6 >= -18 && arg6 != 13 && ~arg5 < -1 && ~var11.field1599 != -1) {
                    class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 4);
                }
                if (var11.field1584 != 0 && arg2 != null) {
                    arg2.method1840(var13, true, arg4, arg7, var12, var11.field1589, !var11.field1576);
                }
            } else if (~arg6 == -1) {
                class268 var34;
                if (var27 == -1 && var11.field1597 == null && !var11.field1601) {
                    class120 var33 = var11.method723(0, arg0, var19, (class72) null, var20, arg9, var22, -99, var18, var21, var28);
                    var34 = var33.field1686;
                } else {
                    var34 = new class123(arg10, 0, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class164.method1087(arg5, arg7, arg4, var20, var34, (class268) null, class191.field2647[arg9], 0, var25);
                if (arg0) {
                    if (~arg9 == -1) {
                        if (var11.field1568) {
                            client.field2180[arg5][arg7][arg4] = 50;
                            client.field2180[arg5][arg7][arg4 + 1] = 50;
                        }
                        if (var11.field1599 == 1) {
                            class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 1);
                        }
                    } else if (arg9 != 1) {
                        if (arg9 == 2) {
                            if (var11.field1568) {
                                client.field2180[arg5][arg7 + 1][arg4] = 50;
                                client.field2180[arg5][arg7 - -1][arg4 + 1] = 50;
                            }
                            if (var11.field1599 == 1) {
                                class198.field2758[arg5][arg7 - -1][arg4] = class54.method339(class198.field2758[arg5][arg7 - -1][arg4], 1);
                            }
                        } else if (arg9 == 3) {
                            if (var11.field1568) {
                                client.field2180[arg5][arg7][arg4] = 50;
                                client.field2180[arg5][arg7 - -1][arg4] = 50;
                            }
                            if (var11.field1599 == 1) {
                                class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 2);
                            }
                        }
                    } else {
                        if (var11.field1568) {
                            client.field2180[arg5][arg7][arg4 - -1] = 50;
                            client.field2180[arg5][arg7 + 1][arg4 + 1] = 50;
                        }
                        if (var11.field1599 == 1) {
                            class198.field2758[arg5][arg7][arg4 + 1] = class54.method339(class198.field2758[arg5][arg7][arg4 + 1], 2);
                        }
                    }
                }
                if (~var11.field1584 != -1 && arg2 != null) {
                    arg2.method1848(var11.field1589, !var11.field1576, arg7, -26, arg9, arg6, arg4);
                }
                if (~var11.field1551 != -17) {
                    class101.method667(arg5, arg7, arg4, var11.field1551);
                }
            } else if (arg6 == 1) {
                class268 var36;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var35 = var11.method723(1, arg0, var19, (class72) null, var20, arg9, var22, 107, var18, var21, var28);
                    var36 = var35.field1686;
                } else {
                    var36 = new class123(arg10, 1, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class164.method1087(arg5, arg7, arg4, var20, var36, (class268) null, class279.field4321[arg9], 0, var25);
                if (var11.field1568 && arg0) {
                    if (~arg9 == -1) {
                        client.field2180[arg5][arg7][arg4 - -1] = 50;
                    } else if (arg9 != 1) {
                        if (~arg9 == -3) {
                            client.field2180[arg5][arg7 - -1][arg4] = 50;
                        } else if (arg9 == 3) {
                            client.field2180[arg5][arg7][arg4] = 50;
                        }
                    } else {
                        client.field2180[arg5][arg7 + 1][arg4 + 1] = 50;
                    }
                }
                if (var11.field1584 != 0 && arg2 != null) {
                    arg2.method1848(var11.field1589, !var11.field1576, arg7, 123, arg9, arg6, arg4);
                }
            } else if (arg6 == 2) {
                int var37 = 3 & arg9 + 1;
                class268 var39;
                class268 var41;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var38 = var11.method723(2, arg0, var19, (class72) null, var20, arg9 + 4, var22, -6, var18, var21, var28);
                    var39 = var38.field1686;
                    class120 var40 = var11.method723(2, arg0, var19, (class72) null, var20, var37, var22, -106, var18, var21, var28);
                    var41 = var40.field1686;
                } else {
                    var39 = new class123(arg10, 2, arg9 + 4, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                    var41 = new class123(arg10, 2, var37, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class164.method1087(arg5, arg7, arg4, var20, var39, var41, class191.field2647[arg9], class191.field2647[var37], var25);
                if (~var11.field1599 == -2 && arg0) {
                    if (~arg9 == -1) {
                        class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 1);
                        class198.field2758[arg5][arg7][arg4 + 1] = class54.method339(class198.field2758[arg5][arg7][arg4 + 1], 2);
                    } else if (~arg9 == -2) {
                        class198.field2758[arg5][arg7][arg4 + 1] = class54.method339(class198.field2758[arg5][arg7][arg4 + 1], 2);
                        class198.field2758[arg5][arg7 + 1][arg4] = class54.method339(class198.field2758[arg5][arg7 + 1][arg4], 1);
                    } else if (~arg9 == -3) {
                        class198.field2758[arg5][arg7 + 1][arg4] = class54.method339(class198.field2758[arg5][arg7 + 1][arg4], 1);
                        class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 2);
                    } else if (arg9 == 3) {
                        class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 2);
                        class198.field2758[arg5][arg7][arg4] = class54.method339(class198.field2758[arg5][arg7][arg4], 1);
                    }
                }
                if (~var11.field1584 != -1 && arg2 != null) {
                    arg2.method1848(var11.field1589, !var11.field1576, arg7, 55, arg9, arg6, arg4);
                }
                if (~var11.field1551 != -17) {
                    class101.method667(arg5, arg7, arg4, var11.field1551);
                }
            } else if (~arg6 == -4) {
                class268 var43;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var42 = var11.method723(3, arg0, var19, (class72) null, var20, arg9, var22, 112, var18, var21, var28);
                    var43 = var42.field1686;
                } else {
                    var43 = new class123(arg10, 3, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class164.method1087(arg5, arg7, arg4, var20, var43, (class268) null, class279.field4321[arg9], 0, var25);
                if (var11.field1568 && arg0) {
                    if (arg9 == 0) {
                        client.field2180[arg5][arg7][arg4 + 1] = 50;
                    } else if (~arg9 != -2) {
                        if (arg9 == 2) {
                            client.field2180[arg5][arg7 + 1][arg4] = 50;
                        } else if (~arg9 == -4) {
                            client.field2180[arg5][arg7][arg4] = 50;
                        }
                    } else {
                        client.field2180[arg5][arg7 + 1][arg4 - -1] = 50;
                    }
                }
                if (var11.field1584 != 0 && arg2 != null) {
                    arg2.method1848(var11.field1589, !var11.field1576, arg7, 121, arg9, arg6, arg4);
                }
            } else if (~arg6 == -10) {
                class268 var45;
                if (var27 == -1 && var11.field1597 == null && !var11.field1601) {
                    class120 var44 = var11.method723(arg6, arg0, var19, (class72) null, var20, arg9, var22, -4, var18, var21, var28);
                    var45 = var44.field1686;
                } else {
                    var45 = new class123(arg10, arg6, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class281.method1889(arg5, arg7, arg4, var20, 1, 1, var45, 0, var25);
                if (~var11.field1584 != -1 && arg2 != null) {
                    arg2.method1840(var13, true, arg4, arg7, var12, var11.field1589, !var11.field1576);
                }
                if (var11.field1551 != 16) {
                    class101.method667(arg5, arg7, arg4, var11.field1551);
                }
            } else if (~arg6 == -5) {
                class268 var47;
                if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                    class120 var46 = var11.method723(4, arg0, var19, (class72) null, var20, arg9, var22, 116, var18, var21, var28);
                    var47 = var46.field1686;
                } else {
                    var47 = new class123(arg10, 4, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class234.method1541(arg5, arg7, arg4, var20, var47, (class268) null, class191.field2647[arg9], 0, 0, 0, var25);
            } else if (~arg6 == -6) {
                int var48 = 16;
                long var49 = class140.method945(arg5, arg7, arg4);
                if (~var49 != -1L) {
                    var48 = class76.method489((int) (var49 >>> 32) & Integer.MAX_VALUE, 50).field1551;
                }
                class268 var52;
                if (var27 == -1 && var11.field1597 == null && !var11.field1601) {
                    class120 var51 = var11.method723(4, arg0, var19, (class72) null, var20, arg9, var22, arg3 + -123, var18, var21, var28);
                    var52 = var51.field1686;
                } else {
                    var52 = new class123(arg10, 4, arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class234.method1541(arg5, arg7, arg4, var20, var52, (class268) null, class191.field2647[arg9], 0, class192.field2652[arg9] * var48, class68.field929[arg9] * var48, var25);
            } else if (arg6 == 6) {
                int var53 = 8;
                long var54 = class140.method945(arg5, arg7, arg4);
                if (~var54 != -1L) {
                    var53 = class76.method489((int) (var54 >>> 32) & Integer.MAX_VALUE, 75).field1551 / 2;
                }
                class268 var57;
                if (var27 == -1 && var11.field1597 == null && !var11.field1601) {
                    class120 var56 = var11.method723(4, arg0, var19, (class72) null, var20, arg9 + 4, var22, 114, var18, var21, var28);
                    var57 = var56.field1686;
                } else {
                    var57 = new class123(arg10, 4, arg9 - -4, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                }
                class234.method1541(arg5, arg7, arg4, var20, var57, (class268) null, 256, arg9, class105.field1464[arg9] * var53, class49.field715[arg9] * var53, var25);
            } else {
                if (arg3 != 124) {
                    field305 = null;
                }
                if (~arg6 == -8) {
                    int var58 = 3 & arg9 + 2;
                    class268 var60;
                    if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                        class120 var59 = var11.method723(4, arg0, var19, (class72) null, var20, var58 + 4, var22, arg3 ^ -71, var18, var21, var28);
                        var60 = var59.field1686;
                    } else {
                        var60 = new class123(arg10, 4, var58 + 4, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                    }
                    class234.method1541(arg5, arg7, arg4, var20, var60, (class268) null, 256, var58, 0, 0, var25);
                } else if (arg6 == 8) {
                    long var61 = class140.method945(arg5, arg7, arg4);
                    int var63 = 8;
                    if (~var61 != -1L) {
                        var63 = class76.method489(Integer.MAX_VALUE & (int) (var61 >>> 32), 78).field1551 / 2;
                    }
                    int var64 = 3 & arg9 + 2;
                    class268 var66;
                    class268 var68;
                    if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                        class120 var65 = var11.method723(4, arg0, var19, (class72) null, var20, arg9 - -4, var22, 109, var18, var21, var28);
                        var66 = var65.field1686;
                        class120 var67 = var11.method723(4, arg0, var19, (class72) null, var20, var64 + 4, var22, -17, var18, var21, var28);
                        var68 = var67.field1686;
                    } else {
                        var66 = new class123(arg10, 4, arg9 + 4, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                        var68 = new class123(arg10, 4, var64 + 4, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
                    }
                    class234.method1541(arg5, arg7, arg4, var20, var66, var68, 256, arg9, class105.field1464[arg9] * var63, class49.field715[arg9] * var63, var25);
                }
            }
        } else {
            class268 var70;
            if (~var27 == 0 && var11.field1597 == null && !var11.field1601) {
                class120 var69 = var11.method723(10, arg0, var19, (class72) null, var20, ~arg6 == -12 ? 4 - -arg9 : arg9, var22, 120, var18, var21, var28);
                var70 = var69.field1686;
            } else {
                var70 = new class123(arg10, 10, arg6 == 11 ? arg9 + 4 : arg9, arg8, arg7, arg4, var27, var11.field1585, (class268) null);
            }
            if (var70 != null) {
                boolean var71 = class281.method1889(arg5, arg7, arg4, var20, var13, var12, var70, 0, var25);
                if (var11.field1568 && var71 && arg0) {
                    int var72 = 15;
                    if (var70 instanceof class25) {
                        var72 = ((class25) var70).method137() / 4;
                        if (~var72 < -31) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var13 >= var73; ++var73) {
                        for (int var74 = 0; ~var74 >= ~var12; ++var74) {
                            if (client.field2180[arg5][arg7 - -var73][arg4 + var74] < var72) {
                                client.field2180[arg5][arg7 - -var73][arg4 - -var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (~var11.field1584 != -1 && arg2 != null) {
                arg2.method1840(var13, true, arg4, arg7, var12, var11.field1589, !var11.field1576);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method161(boolean arg0) {
        ++field297;
        class53.method334(126);
        class103.method675(arg0);
        class142.method952((byte) 117);
        class4.method17(-1);
        class100.method657(0);
        class155.method1031((byte) -99);
        class188.method1201(-108);
        class181.method1178((byte) -126);
        class293.method1966((byte) 77);
        class268.method1771((byte) -110);
        class50.method325(0);
        class231.method1527((byte) 99);
        class256.method1713(0);
        class33.method222(-4747);
        class19.method144(0);
        class127.method855(-6220);
        class232.method1531((byte) -114);
        class278.method1855(-28404);
        if (~class160.field2247 != -1) {
            for (int var1 = 0; ~var1 > ~class35.field535.length; ++var1) {
                class35.field535[var1] = null;
            }
            class297.field4696 = 0;
        }
        class127.method853(-124);
        class287.method1936(-76);
        class78.field1090.method546(-90762264);
        ((class206) class90.field1260).method1311(0);
        class293.field4609.method958((byte) 70);
        class36.field560.method1548(-2);
        class225.field3413.method1548(-2);
        class96.field1353.method1548(-2);
        class10.field94.method1548(-2);
        class197.field2726.method1548(-2);
        class23.field324.method1548(-2);
        class224.field3400.method1548(-2);
        field299.method1548(-2);
        class232.field3510.method1548(-2);
        class50.field726.method1548(-2);
        class184.field2551.method1548(-2);
        class239.field3636.method546(-90762264);
    }
}

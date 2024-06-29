import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class305 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4771 = 0;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2112(byte arg0) {
        if (class275.field4247 != null) {
            class275.field4247.method218(true);
            class275.field4247 = null;
        }
        field4767++;
        class283.method2005(26549);
        class139.method1035();
        for (int var1 = 0; var1 < 4; var1++) {
            class134.field1970[var1].method1481(true);
        }
        class326.method2291(false, 112);
        System.gc();
        class175.method1293(75, 2);
        class4.field43 = false;
        class149.field2331 = -1;
        class193.method1432(true, 45);
        class198.field3168 = 0;
        class78.field1052 = 0;
        class326.field5108 = 0;
        class248.field3909 = false;
        class257.field4057 = 0;
        for (int var2 = 0; var2 < class287.field4436.length; var2++) {
            class287.field4436[var2] = null;
        }
        class232.field3631 = 0;
        class79.field1083 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class284.field4403[var3] = null;
            class286.field4418[var3] = null;
        }
        int var4 = 60 / ((arg0 - 28) / 49);
        for (int var5 = 0; var5 < 32768; var5++) {
            class59.field870[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class304.field4750[var6][var7][var8] = null;
                }
            }
        }
        class214.method1565(1);
        class246.field3841 = 0;
        class123.method903(0);
        class169.method1271(-21431, true);
        try {
            class209.method1531("loggedout", 34, class42.field581.field2181);
        } catch (Throwable var10) {
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIIIILug;)V", line = 103)
    public static final void method2113(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class253 arg6) {
        field4765++;
        if (arg4 != 0) {
            method2112((byte) 91);
        }
        class270.field4193 = arg2;
        class202.field3228 = 1;
        class113.field1575 = arg3;
        class3.field31 = arg6;
        class237.field3711 = arg5;
        class251.field3951 = arg0;
        class147.field2319 = arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[B", line = 126)
    public static final byte[] method2114(int arg0, int arg1) {
        field4768++;
        if (arg0 != -256) {
            return (byte[]) null;
        }
        class317 var2 = (class317) class241.field3759.method1628(true, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class207.method1523(var7, arg0 + 146, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class317(var3);
            class241.field3759.method1627((byte) 97, var2, (long) arg1);
        }
        return var2.field5016;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([Lqd;ZI[BIZII)[I", line = 192)
    public static final int[] method2115(class200[] arg0, boolean arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4766++;
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg6 + var10 > 0 && arg6 + var10 < 103 && (arg2 + var11) > 0 && arg2 + var11 < 103) {
                            arg0[var9].field3197[arg6 + var10][arg2 + var11] = class333.method2319(arg0[var9].field3197[arg6 + var10][arg2 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class6 var12 = new class6(arg3);
        int var13 = arg6 + arg7;
        int var14 = arg2 + arg4;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class61.method506(var12, -117, 0, var16 + arg6, arg2 + var17, arg5, false, var14 + var17, var15, var13 + var16);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field111 < var12.field115.length) {
            int var20 = var12.method58(-288140008);
            if (var20 == 128) {
                var18 = true;
                class10.field194[0] = var12.method39((byte) 59);
                class10.field194[1] = var12.method78((byte) -82);
                class10.field194[2] = var12.method78((byte) -16);
                class10.field194[3] = var12.method78((byte) -18);
                class10.field194[4] = var12.method39((byte) 33);
            } else {
                if (var20 != 129) {
                    var12.field111--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method83((byte) -79);
                    if (var22 == 0) {
                        int var23 = arg6;
                        int var24 = arg6 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        if (arg6 < 0) {
                            var23 = 0;
                        } else if (arg6 >= 104) {
                            var23 = 104;
                        }
                        int var25 = arg2;
                        if (arg2 < 0) {
                            var25 = 0;
                        } else if (arg2 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg2 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var24 > var23) {
                            while (var25 < var26) {
                                class248.field3903[var21][var23][var25] = 0;
                                var25++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method83((byte) -102);
                                for (int var30 = arg6 + var27; var30 < (arg6 + var27 + 4); var30++) {
                                    for (int var31 = arg2 + var28; var31 < (var28 + arg2 + 4); var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class248.field3903[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var32 = arg6 + 64;
                        int var33 = arg6;
                        int var34 = arg2;
                        if (arg2 < 0) {
                            var34 = 0;
                        } else if (arg2 >= 104) {
                            var34 = 104;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        int var35 = arg2 + 64;
                        if (arg6 < 0) {
                            var33 = 0;
                        } else if (arg6 >= 104) {
                            var33 = 104;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var33 < var32) {
                            while (var35 > var34) {
                                class248.field3903[var21][var33][var34] = class248.field3903[var21 - 1][var33][var34];
                                var34++;
                            }
                            var33++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (!arg1) {
            method2113(false, -105, -81, 95, -105, 98, (class253) null);
        }
        if (class109.field1458 && !arg5) {
            class254 var36 = null;
            while (true) {
                while (var12.field111 < var12.field115.length) {
                    int var37 = var12.method58(-288140008);
                    if (var37 == 0) {
                        var36 = new class254(var12);
                    } else if (var37 == 1) {
                        int var38 = var12.method58(-288140008);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class79 var40 = new class79(var12);
                                if (var40.field1071 == 31) {
                                    class243 var41 = class18.method200(var12.method39((byte) 127), 31);
                                    var40.method583(var41.field3798, 4096, var41.field3794, var41.field3790, var41.field3792);
                                }
                                var40.field1068 += arg6 << 7;
                                var40.field1072 += arg2 << 7;
                                int var42 = var40.field1072 >> 7;
                                int var43 = var40.field1068 >> 7;
                                if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                                    var40.field1064 = (class134.field1969[1][var43][var42] & 0x2) != 0;
                                    var40.field1060 = class172.field2843[var40.field1061][var43][var42] - var40.field1060;
                                    class176.method1295(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class254();
                        }
                        var36.method1843(8, var12);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class254();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg6 >> 3) + var44;
                        int var47 = (arg2 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class215.field3396[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg2 >> 2) + var50;
                        int var52 = (arg6 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class248.field3903[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class10.field194 : null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIZLqd;IIII)V", line = 611)
    public static final void method2116(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, class200 arg6, int arg7, int arg8, int arg9, int arg10) {
        field4770++;
        if (arg5 && !class154.method1119((byte) 16) && (class134.field1969[0][arg8][arg0] & 0x2) == 0) {
            if ((class134.field1969[arg10][arg8][arg0] & 0x10) != 0) {
                return;
            }
            if (class102.method708(arg0, arg8, arg10, (byte) -27) != class130.field1925) {
                return;
            }
        }
        if (arg10 < class85.field1154) {
            class85.field1154 = arg10;
        }
        class121 var11 = class249.method1790(35, arg9);
        if (class109.field1458 && var11.field1678) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field1734;
            var12 = var11.field1724;
        } else {
            var12 = var11.field1734;
            var13 = var11.field1724;
        }
        int var14;
        int var15;
        if ((arg8 + var13) > 104) {
            var14 = arg8 + 1;
            var15 = arg8;
        } else {
            var15 = (var13 >> 1) + arg8;
            var14 = (var13 + 1 >> 1) + arg8;
        }
        int[][] var16 = class172.field2843[arg2];
        int var17;
        int var18;
        if (arg0 + var12 > 104) {
            var17 = arg0 + 1;
            var18 = arg0;
        } else {
            var18 = (var12 >> 1) + arg0;
            var17 = (var12 + 1 >> 1) + arg0;
        }
        int var19 = (arg8 << 7) + (var13 << 6);
        int var20 = (arg0 << 7) + (var12 << 6);
        int var21 = var16[var15][var17] + var16[var15][var18] + var16[var14][var18] + var16[var14][var17] >> 2;
        int var22 = 0;
        if (class109.field1458 && arg2 != 0) {
            int[][] var23 = class172.field2843[0];
            var22 = var21 - (var23[var15][var18] + var23[var15][var17] + var23[var14][var17] + var23[var14][var18] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg3) {
            var24 = class18.field294[0];
        } else if (arg2 < 3) {
            var24 = class172.field2843[arg2 + 1];
        }
        long var25 = (long) (arg7 | 0x10000 << 14 | arg8 | arg0 << 7 | arg1 << 20);
        if (var11.field1747 == 0 || arg3) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1677 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1703) {
            var25 |= 0x80000000L;
        }
        if (var11.method877(7)) {
            class58.method475((class212) null, (class337) null, arg1, arg10, arg8, 128, arg0, var11);
        }
        long var27 = var25 | (long) arg9 << 32;
        boolean var29 = var11.field1713 & !arg3;
        int var30 = var11.field1711;
        if (arg7 == 22) {
            if (class99.field1334 || var11.field1747 != 0 || var11.field1750 == 1 || var11.field1693) {
                class248 var78;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var77 = var11.method870(var16, -114, var21, 22, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var77.field1669, var19, var22, var20);
                    }
                    var78 = var77.field1665;
                } else {
                    var78 = new class128(arg9, 22, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class78.method580(arg10, arg8, arg0, var21, var78, var27, var11.field1741);
                if (var11.field1750 == 1 && arg6 != null) {
                    arg6.method1484(arg8, 48, arg0);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class248 var72;
            if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                class120 var71 = var11.method870(var16, -107, var21, 10, arg5, var24, var29, var19, arg7 == 11 ? arg1 + 4 : arg1, var20, (class201) null);
                if (class109.field1458 && var29) {
                    class8.method113(var71.field1669, var19, var22, var20);
                }
                var72 = var71.field1665;
            } else {
                var72 = new class128(arg9, 10, arg7 == 11 ? arg1 + 4 : arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
            }
            if (var72 != null) {
                boolean var73 = class15.method144(arg10, arg8, arg0, var21, var13, var12, var72, 0, var27);
                if (var11.field1694 && var73 && arg5) {
                    int var74 = 15;
                    if (var72 instanceof class89) {
                        var74 = ((class89) var72).method415() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var13; var75++) {
                        for (int var76 = 0; var76 <= var12; var76++) {
                            if (var74 > class24.field360[arg10][arg8 + var75][arg0 + var76]) {
                                class24.field360[arg10][arg8 + var75][arg0 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var11.field1750 != 0 && arg6 != null) {
                arg6.method1473(var12, false, arg8, arg0, !var11.field1742, var13, var11.field1702);
            }
        } else if (arg7 >= 12) {
            class248 var32;
            if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                class120 var31 = var11.method870(var16, arg4 ^ 0xFFFFD59D, var21, arg7, arg5, var24, var29, var19, arg1, var20, (class201) null);
                if (class109.field1458 && var29) {
                    class8.method113(var31.field1669, var19, var22, var20);
                }
                var32 = var31.field1665;
            } else {
                var32 = new class128(arg9, arg7, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
            }
            class15.method144(arg10, arg8, arg0, var21, 1, 1, var32, 0, var27);
            if (arg5 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg10 > 0 && var11.field1736 != 0) {
                class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 4);
            }
            if (var11.field1750 != 0 && arg6 != null) {
                arg6.method1473(var12, false, arg8, arg0, !var11.field1742, var13, var11.field1702);
            }
        } else if (arg7 == 0) {
            class248 var70;
            if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                class120 var69 = var11.method870(var16, -102, var21, 0, arg5, var24, var29, var19, arg1, var20, (class201) null);
                if (class109.field1458 && var29) {
                    class8.method113(var69.field1669, var19, var22, var20);
                }
                var70 = var69.field1665;
            } else {
                var70 = new class128(arg9, 0, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
            }
            class132.method976(arg10, arg8, arg0, var21, var70, (class248) null, class282.field4364[arg1], 0, var27);
            if (arg5) {
                if (arg1 == 0) {
                    if (var11.field1694) {
                        class24.field360[arg10][arg8][arg0] = 50;
                        class24.field360[arg10][arg8][arg0 + 1] = 50;
                    }
                    if (var11.field1736 == 1) {
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field1694) {
                        class24.field360[arg10][arg8][arg0 + 1] = 50;
                        class24.field360[arg10][arg8 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field1736 == 1) {
                        class175.field2868[arg10][arg8][arg0 + 1] = class214.method1562(class175.field2868[arg10][arg8][arg0 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field1694) {
                        class24.field360[arg10][arg8 + 1][arg0] = 50;
                        class24.field360[arg10][arg8 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field1736 == 1) {
                        class175.field2868[arg10][arg8 + 1][arg0] = class214.method1562(class175.field2868[arg10][arg8 + 1][arg0], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field1694) {
                        class24.field360[arg10][arg8][arg0] = 50;
                        class24.field360[arg10][arg8 + 1][arg0] = 50;
                    }
                    if (var11.field1736 == 1) {
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 2);
                    }
                }
            }
            if (var11.field1750 != 0 && arg6 != null) {
                arg6.method1476(var11.field1702, arg8, arg1, arg7, 1, !var11.field1742, arg0);
            }
            if (var11.field1714 != 16) {
                class85.method615(arg10, arg8, arg0, var11.field1714);
            }
        } else {
            if (arg4 != 10768) {
                method2113(false, -62, -3, -77, -90, 99, (class253) null);
            }
            if (arg7 == 1) {
                class248 var34;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var33 = var11.method870(var16, -125, var21, 1, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var33.field1669, var19, var22, var20);
                    }
                    var34 = var33.field1665;
                } else {
                    var34 = new class128(arg9, 1, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class132.method976(arg10, arg8, arg0, var21, var34, (class248) null, class307.field4793[arg1], 0, var27);
                if (var11.field1694 && arg5) {
                    if (arg1 == 0) {
                        class24.field360[arg10][arg8][arg0 + 1] = 50;
                    } else if (arg1 == 1) {
                        class24.field360[arg10][arg8 + 1][arg0 + 1] = 50;
                    } else if (arg1 == 2) {
                        class24.field360[arg10][arg8 + 1][arg0] = 50;
                    } else if (arg1 == 3) {
                        class24.field360[arg10][arg8][arg0] = 50;
                    }
                }
                if (var11.field1750 != 0 && arg6 != null) {
                    arg6.method1476(var11.field1702, arg8, arg1, arg7, 1, !var11.field1742, arg0);
                }
            } else if (arg7 == 2) {
                int var64 = arg1 + 1 & 0x3;
                class248 var66;
                class248 var68;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var65 = var11.method870(var16, arg4 ^ 0xFFFFD589, var21, 2, arg5, var24, var29, var19, arg1 + 4, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var65.field1669, var19, var22, var20);
                    }
                    var66 = var65.field1665;
                    class120 var67 = var11.method870(var16, arg4 ^ 0xFFFFD592, var21, 2, arg5, var24, var29, var19, var64, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var67.field1669, var19, var22, var20);
                    }
                    var68 = var67.field1665;
                } else {
                    var66 = new class128(arg9, 2, arg1 + 4, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                    var68 = new class128(arg9, 2, var64, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class132.method976(arg10, arg8, arg0, var21, var66, var68, class282.field4364[arg1], class282.field4364[var64], var27);
                if (var11.field1736 == 1 && arg5) {
                    if (arg1 == 0) {
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 1);
                        class175.field2868[arg10][arg8][arg0 + 1] = class214.method1562(class175.field2868[arg10][arg8][arg0 + 1], 2);
                    } else if (arg1 == 1) {
                        class175.field2868[arg10][arg8][arg0 + 1] = class214.method1562(class175.field2868[arg10][arg8][arg0 + 1], 2);
                        class175.field2868[arg10][arg8 + 1][arg0] = class214.method1562(class175.field2868[arg10][arg8 + 1][arg0], 1);
                    } else if (arg1 == 2) {
                        class175.field2868[arg10][arg8 + 1][arg0] = class214.method1562(class175.field2868[arg10][arg8 + 1][arg0], 1);
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 2);
                    } else if (arg1 == 3) {
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 2);
                        class175.field2868[arg10][arg8][arg0] = class214.method1562(class175.field2868[arg10][arg8][arg0], 1);
                    }
                }
                if (var11.field1750 != 0 && arg6 != null) {
                    arg6.method1476(var11.field1702, arg8, arg1, arg7, 1, !var11.field1742, arg0);
                }
                if (var11.field1714 != 16) {
                    class85.method615(arg10, arg8, arg0, var11.field1714);
                }
            } else if (arg7 == 3) {
                class248 var63;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var62 = var11.method870(var16, -128, var21, 3, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var62.field1669, var19, var22, var20);
                    }
                    var63 = var62.field1665;
                } else {
                    var63 = new class128(arg9, 3, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class132.method976(arg10, arg8, arg0, var21, var63, (class248) null, class307.field4793[arg1], 0, var27);
                if (var11.field1694 && arg5) {
                    if (arg1 == 0) {
                        class24.field360[arg10][arg8][arg0 + 1] = 50;
                    } else if (arg1 == 1) {
                        class24.field360[arg10][arg8 + 1][arg0 + 1] = 50;
                    } else if (arg1 == 2) {
                        class24.field360[arg10][arg8 + 1][arg0] = 50;
                    } else if (arg1 == 3) {
                        class24.field360[arg10][arg8][arg0] = 50;
                    }
                }
                if (var11.field1750 != 0 && arg6 != null) {
                    arg6.method1476(var11.field1702, arg8, arg1, arg7, 1, !var11.field1742, arg0);
                }
            } else if (arg7 == 9) {
                class248 var36;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var35 = var11.method870(var16, arg4 ^ 0xFFFFD582, var21, arg7, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var35.field1669, var19, var22, var20);
                    }
                    var36 = var35.field1665;
                } else {
                    var36 = new class128(arg9, arg7, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class15.method144(arg10, arg8, arg0, var21, 1, 1, var36, 0, var27);
                if (var11.field1750 != 0 && arg6 != null) {
                    arg6.method1473(var12, false, arg8, arg0, !var11.field1742, var13, var11.field1702);
                }
                if (var11.field1714 != 16) {
                    class85.method615(arg10, arg8, arg0, var11.field1714);
                }
            } else if (arg7 == 4) {
                class248 var38;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var37 = var11.method870(var16, arg4 ^ 0xFFFFD58A, var21, 4, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var37.field1669, var19, var22, var20);
                    }
                    var38 = var37.field1665;
                } else {
                    var38 = new class128(arg9, 4, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class183.method1343(arg10, arg8, arg0, var21, var38, (class248) null, class282.field4364[arg1], 0, 0, 0, var27);
            } else if (arg7 == 5) {
                int var57 = 16;
                long var58 = class204.method1506(arg10, arg8, arg0);
                if (var58 != 0L) {
                    var57 = class249.method1790(arg4 ^ 0x2A27, Integer.MAX_VALUE & (int) (var58 >>> 32)).field1714;
                }
                class248 var61;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var60 = var11.method870(var16, -107, var21, 4, arg5, var24, var29, var19, arg1, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var60.field1669, var19 - (class277.field4275[arg1] * 8), var22, var20 - (class134.field1968[arg1] * 8));
                    }
                    var61 = var60.field1665;
                } else {
                    var61 = new class128(arg9, 4, arg1, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class183.method1343(arg10, arg8, arg0, var21, var61, (class248) null, class282.field4364[arg1], 0, class277.field4275[arg1] * var57, class134.field1968[arg1] * var57, var27);
            } else if (arg7 == 6) {
                long var39 = class204.method1506(arg10, arg8, arg0);
                int var41 = 8;
                if (var39 != 0L) {
                    var41 = class249.method1790(52, Integer.MAX_VALUE & (int) (var39 >>> 32)).field1714 / 2;
                }
                class248 var43;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var42 = var11.method870(var16, -127, var21, 4, arg5, var24, var29, var19, arg1 + 4, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var42.field1669, var19 - (class322.field5082[arg1] * 8), var22, var20 - (class202.field3223[arg1] * 8));
                    }
                    var43 = var42.field1665;
                } else {
                    var43 = new class128(arg9, 4, arg1 + 4, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class183.method1343(arg10, arg8, arg0, var21, var43, (class248) null, 256, arg1, class322.field5082[arg1] * var41, class202.field3223[arg1] * var41, var27);
            } else if (arg7 == 7) {
                int var44 = arg1 + 2 & 0x3;
                class248 var46;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    class120 var45 = var11.method870(var16, -106, var21, 4, arg5, var24, var29, var19, var44 + 4, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var45.field1669, var19, var22, var20);
                    }
                    var46 = var45.field1665;
                } else {
                    var46 = new class128(arg9, 4, var44 + 4, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class183.method1343(arg10, arg8, arg0, var21, var46, (class248) null, 256, var44, 0, 0, var27);
            } else if (arg7 == 8) {
                int var47 = 8;
                long var48 = class204.method1506(arg10, arg8, arg0);
                if (var48 != 0L) {
                    var47 = class249.method1790(arg4 ^ 0x2A2A, (int) (var48 >>> 32) & Integer.MAX_VALUE).field1714 / 2;
                }
                int var50 = arg1 + 2 & 0x3;
                class248 var54;
                class248 var56;
                if (var30 == -1 && var11.field1690 == null && !var11.field1689) {
                    int var51 = class322.field5082[arg1] * 8;
                    int var52 = class202.field3223[arg1] * 8;
                    class120 var53 = var11.method870(var16, -108, var21, 4, arg5, var24, var29, var19, arg1 + 4, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var53.field1669, var19 - var51, var22, var20 - var52);
                    }
                    var54 = var53.field1665;
                    class120 var55 = var11.method870(var16, -111, var21, 4, arg5, var24, var29, var19, var50 + 4, var20, (class201) null);
                    if (class109.field1458 && var29) {
                        class8.method113(var55.field1669, var19 - var51, var22, var20 - var52);
                    }
                    var56 = var55.field1665;
                } else {
                    var54 = new class128(arg9, 4, arg1 + 4, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                    var56 = new class128(arg9, 4, var50 + 4, arg2, arg8, arg0, var30, var11.field1727, (class248) null);
                }
                class183.method1343(arg10, arg8, arg0, var21, var54, var56, 256, arg1, class322.field5082[arg1] * var47, class202.field3223[arg1] * var47, var27);
            }
        }
    }
}

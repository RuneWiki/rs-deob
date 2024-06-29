import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class303 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lqd;")
    public static class40 field5072 = class147.method1106("Okay", (byte) -75);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lqd;")
    public static class40 field5080 = class147.method1106("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -51);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[I")
    public static int[] field5077 = new int[32];

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field5081 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lth;")
    public static class80 field5074;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[I")
    public static int[] field5075;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BB[Lm;IIZ)V", line = 15)
    public static final void method2065(int arg0, int arg1, byte[] arg2, byte arg3, class44[] arg4, int arg5, int arg6, boolean arg7) {
        field5076++;
        int var8 = -108 / ((arg3 + 29) / 49);
        if (!arg7) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg1 + var10) > 0 && (arg1 + var10) < 103 && (arg5 + var11) > 0 && (arg5 + var11) < 103) {
                            arg4[var9].field839[arg1 + var10][arg5 + var11] = class276.method1923(arg4[var9].field839[arg1 + var10][arg5 + var11], -16777217);
                        }
                    }
                }
            }
        }
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        class26 var13 = new class26(arg2);
        for (int var14 = 0; var14 < var12; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    class204.method1439(arg1 + var15, var16 - -arg5, var14, 0, arg6, arg0, var13, 122, arg7);
                }
            }
        }
        if (!class21.field350 || arg7) {
            return;
        }
        class217 var17 = null;
        label115: while (true) {
            int var19;
            label108: do {
                while (var13.field472.length > var13.field478) {
                    int var18 = var13.method226(255);
                    if (var18 != 0) {
                        if (var18 != 1) {
                            throw new IllegalStateException();
                        }
                        var19 = var13.method226(255);
                        continue label108;
                    }
                    var17 = new class217(var13);
                }
                if (var17 == null) {
                    var17 = new class217();
                }
                for (int var24 = 0; var24 < 8; var24++) {
                    for (int var25 = 0; var25 < 8; var25++) {
                        int var26 = (arg5 >> 3) + var25;
                        int var27 = (arg1 >> 3) + var24;
                        if (var27 >= 0 && var27 < 13 && var26 >= 0 && var26 < 13) {
                            class59.field1140[var27][var26] = var17;
                        }
                    }
                }
                break label115;
            } while (var19 <= 0);
            for (int var20 = 0; var20 < var19; var20++) {
                class90 var21 = new class90(var13);
                var21.field1614 += arg5 << 7;
                int var22 = var21.field1614 >> 7;
                var21.field1641 += arg1 << 7;
                int var23 = var21.field1641 >> 7;
                if (var23 >= 0 && var22 >= 0 && var23 < 104 && var22 < 104) {
                    var21.field1626 = class78.field1316[var21.field1634][var23][var22] - var21.field1626;
                    class84.method642(var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIILbg;IZJ)Z", line = 174)
    public static final boolean method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class196 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class78.field1316 == class160.field2687;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class90.field1632 || var16 >= class285.field4807) {
                    return false;
                }
                class14 var17 = class93.field1690[arg0][var15][var16];
                if (var17 != null && var17.field216 >= 5) {
                    return false;
                }
            }
        }
        class193 var18 = new class193();
        var18.field3101 = arg11;
        var18.field3104 = arg0;
        var18.field3111 = arg5;
        var18.field3118 = arg6;
        var18.field3102 = arg7;
        var18.field3106 = arg8;
        var18.field3109 = arg9;
        var18.field3107 = arg1;
        var18.field3108 = arg2;
        var18.field3112 = arg1 + arg3 - 1;
        var18.field3115 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class93.field1690[var22][var19][var20] == null) {
                        class93.field1690[var22][var19][var20] = new class14(var22, var19, var20);
                    }
                }
                class14 var23 = class93.field1690[arg0][var19][var20];
                var23.field230[var23.field216] = var18;
                var23.field219[var23.field216] = var21;
                var23.field221 |= var21;
                var23.field216++;
                if (var13 && class103.field1807[var19][var20] != 0) {
                    var14 = class103.field1807[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class103.field1807[var24][var25] == 0) {
                        class103.field1807[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class243.field4010[class207.field3300++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 302)
    public static final void method2067(int arg0) {
        class48.field939 = 0;
        if (arg0 != 29054) {
            return;
        }
        class27.field523 = -1;
        class166.field2753 = 0;
        class27.field518 = false;
        class202.field3201 = 0;
        class44.field827 = 0;
        class265.field4449 = -1;
        class19.field295.field478 = 0;
        class95.field1715.field478 = 0;
        class255.field4252 = 0;
        class181.field2953 = -1;
        class185.field2985 = 0;
        class156.field2621 = -1;
        field5082++;
        for (int var1 = 0; var1 < class298.field4979.length; var1++) {
            if (class298.field4979[var1] != null) {
                class298.field4979[var1].field1537 = -1;
            }
        }
        for (int var2 = 0; var2 < class91.field1656.length; var2++) {
            if (class91.field1656[var2] != null) {
                class91.field1656[var2].field1537 = -1;
            }
        }
        class5.method20(97);
        class103.field1814 = 1;
        class271.method1879(30, 17646);
        for (int var3 = 0; var3 < 100; var3++) {
            class229.field3778[var3] = true;
        }
        class271.method1873(true);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 385)
    public static void method2068(int arg0) {
        field5072 = null;
        if (arg0 == 255) {
            field5074 = null;
            field5080 = null;
            field5075 = null;
            field5077 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIBIII)V", line = 400)
    public static final void method2069(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class274.field4566 == 0) {
            class314.field5298++;
            int var7 = class162.field2695;
            int var8 = class218.field3630;
            int var9 = class186.field3011;
            int var10 = (arg2 - arg5) * (var7 - var9) / arg4 + var9;
            int var11 = class188.field3042;
            int var12 = (arg0 - arg1) * (var8 - var11) / arg6 + var11;
            if (class274.field4549 && (class306.field5130 & 0x40) == 64) {
                class213 var13 = class211.method1483(class235.field3856, class83.field1440, -17970);
                if (var13 == null) {
                    class43.method392(-376);
                } else {
                    class277.method1941(var12, class263.field4408, (short) 25, var10, 0L, 104, class277.field4638);
                }
            } else {
                class277.method1941(var12, class264.field4421, (short) 32, var10, 0L, 84, class213.field3582);
            }
        }
        field5078++;
        long var14 = -1L;
        int var16 = 121 / ((18 - arg3) / 35);
        for (int var17 = 0; var17 < class293.field4929; var17++) {
            long var18 = class28.field597[var17];
            int var20 = (int) var18 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var22 = ((int) var18 & 0x79974406) >> 29;
            int var23 = ((int) var18 & 0x3F86) >> 7;
            if (var14 != var18) {
                var14 = var18;
                if (var22 == 2 && class81.method632(class160.field2671, var20, var23, var18)) {
                    class27 var24 = class72.method540(0, var21);
                    if (var24.field546 != null) {
                        var24 = var24.method258((byte) -112);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class274.field4566 == 1) {
                        class277.method1941(var23, class153.method1192(new class40[] { class3.field27, class300.field5024, var24.field581 }, (byte) 6), (short) 20, var20, var18, 53, class12.field207);
                        class278.field4691++;
                    } else if (!class274.field4549) {
                        class40[] var25 = var24.field542;
                        if (class169.field2782) {
                            var25 = class210.method1479(var25, (byte) 108);
                        }
                        class2.field18++;
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class314.field5307++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 48;
                                    }
                                    if (var26 == 1) {
                                        var27 = 42;
                                    }
                                    if (var26 == 2) {
                                        var27 = 24;
                                    }
                                    if (var26 == 3) {
                                        var27 = 2;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1004;
                                    }
                                    class277.method1941(var23, class153.method1192(new class40[] { client.field4047, var24.field581 }, (byte) 24), var27, var20, var18, 42, var25[var26]);
                                }
                            }
                        }
                        class277.method1941(var23, class153.method1192(new class40[] { client.field4047, var24.field581 }, (byte) -71), (short) 1005, var20, (long) var24.field557, 95, class81.field1432);
                    } else if ((class306.field5130 & 0x4) == 4) {
                        class289.field4845++;
                        class277.method1941(var23, class153.method1192(new class40[] { class300.field5012, class300.field5024, var24.field581 }, (byte) 121), (short) 49, var20, var18, 93, class277.field4638);
                    }
                }
                if (var22 == 1) {
                    class42 var28 = class91.field1656[var21];
                    if (var28.field796.field2089 == 1 && (var28.field1531 & 0x7F) == 64 && (var28.field1497 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class177.field2923; var29++) {
                            class42 var30 = class91.field1656[class65.field1229[var29]];
                            if (var30 != null && var28 != var30 && var30.field796.field2089 == 1 && var28.field1531 == var30.field1531 && var28.field1497 == var30.field1497) {
                                class263.method1849((byte) -73, var20, var23, class65.field1229[var29], var30.field796);
                            }
                        }
                        for (int var31 = 0; var31 < class159.field2663; var31++) {
                            class258 var32 = class298.field4979[class212.field3390[var31]];
                            if (var32 != null && var28.field1531 == var32.field1531 && var28.field1497 == var32.field1497) {
                                class220.method1543(class212.field3390[var31], var23, var20, var32, true);
                            }
                        }
                    }
                    class263.method1849((byte) -52, var20, var23, var21, var28.field796);
                }
                if (var22 == 0) {
                    class258 var33 = class298.field4979[var21];
                    if ((var33.field1531 & 0x7F) == 64 && (var33.field1497 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class177.field2923; var34++) {
                            class42 var35 = class91.field1656[class65.field1229[var34]];
                            if (var35 != null && var35.field796.field2089 == 1 && var33.field1531 == var35.field1531 && var33.field1497 == var35.field1497) {
                                class263.method1849((byte) -93, var20, var23, class65.field1229[var34], var35.field796);
                            }
                        }
                        for (int var36 = 0; var36 < class159.field2663; var36++) {
                            class258 var37 = class298.field4979[class212.field3390[var36]];
                            if (var37 != null && var33 != var37 && var33.field1531 == var37.field1531 && var33.field1497 == var37.field1497) {
                                class220.method1543(class212.field3390[var36], var23, var20, var37, true);
                            }
                        }
                    }
                    class220.method1543(var21, var23, var20, var33, true);
                }
                if (var22 == 3) {
                    class282 var38 = class51.field983[class160.field2671][var20][var23];
                    if (var38 != null) {
                        for (class229 var39 = (class229) var38.method1970((byte) 76); var39 != null; var39 = (class229) var38.method1974(90)) {
                            int var40 = var39.field3786.field2423;
                            class277 var41 = class165.method1243(-119, var40);
                            if (class274.field4566 == 1) {
                                class277.method1941(var23, class153.method1192(new class40[] { class3.field27, class238.field3925, var41.field4628 }, (byte) 40), (short) 45, var20, (long) var40, 89, class12.field207);
                                class169.field2781++;
                            } else if (!class274.field4549) {
                                class293.field4908++;
                                class40[] var42 = var41.field4662;
                                if (class169.field2782) {
                                    var42 = class210.method1479(var42, (byte) 110);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        byte var44 = 0;
                                        class158.field2640++;
                                        if (var43 == 0) {
                                            var44 = 43;
                                        }
                                        if (var43 == 1) {
                                            var44 = 22;
                                        }
                                        if (var43 == 2) {
                                            var44 = 50;
                                        }
                                        if (var43 == 3) {
                                            var44 = 3;
                                        }
                                        if (var43 == 4) {
                                            var44 = 10;
                                        }
                                        class277.method1941(var23, class153.method1192(new class40[] { class299.field5005, var41.field4628 }, (byte) 125), var44, var20, (long) var40, 127, var42[var43]);
                                    } else if (var43 == 2) {
                                        class43.field821++;
                                        class277.method1941(var23, class153.method1192(new class40[] { class299.field5005, var41.field4628 }, (byte) -116), (short) 50, var20, (long) var40, 36, class230.field3794);
                                    }
                                }
                                class277.method1941(var23, class153.method1192(new class40[] { class299.field5005, var41.field4628 }, (byte) -1), (short) 1007, var20, (long) var40, 60, class81.field1432);
                            } else if ((class306.field5130 & 0x1) == 1) {
                                class277.method1941(var23, class153.method1192(new class40[] { class300.field5012, class238.field3925, var41.field4628 }, (byte) -46), (short) 16, var20, (long) var40, 99, class277.field4638);
                                class233.field3825++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 738)
    public static final void method2070(int arg0, int arg1, int arg2) {
        short var3 = 256;
        if (class72.field1276 > 0) {
            class310.method2116(class72.field1276, (byte) 61);
            class72.field1276 = 0;
        }
        int var4 = class115.field1986 * arg2;
        int var5 = 0;
        field5073++;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class102.field1803[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class286.field4819[var5++];
                int var11 = class115.field1978[var4++ + arg0];
                if (var10 == 0) {
                    class243.field4011.field1761[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - (var10 + 18);
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class150.field2522[var10];
                    class243.field4011.field1761[var6++] = class276.method1923(class276.method1923(var11, 16711935) * var13 + var12 * class276.method1923(var14, 16711935), -16711936) + class276.method1923(class276.method1923(var11, 65280) * var13 + var12 * class276.method1923(65280, var14), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class243.field4011.field1761[var6++] = class115.field1978[var4++ + arg0];
            }
            var4 += class115.field1986 - 128;
        }
        int var16 = -64 % ((arg1 - 20) / 36);
        class243.field4011.method735(arg0, arg2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqd;IILqd;)V", line = 827)
    public static final void method2071(class40 arg0, int arg1, int arg2, class40 arg3) {
        field5079++;
        class171.method1265(-1, (byte) -81, arg0, arg3, arg2, (class40) null);
        if (arg1 <= 1) {
            field5081 = 90;
        }
    }
}

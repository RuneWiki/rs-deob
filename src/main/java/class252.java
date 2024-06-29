import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class252 extends class296 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "F")
    public static float field3828 = 0.0F;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[BII[Lha;ZIIII)[I")
    public static final int[] method1653(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class31[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = (arg8 & 0x7) * 8;
        field3830++;
        int var12 = (arg7 & arg3) * 8;
        if (!arg6) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class165.method1040((byte) 59, arg9, var14 & 0x7, var13 & 0x7);
                    int var16 = class294.method1953(var14 & 0x7, arg9, var13 & 0x7, arg3 ^ 0x59) + arg10;
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg5[arg1].field460[var15][var16] = class94.method598(arg5[arg1].field460[var15][var16], -2097153);
                    }
                }
            }
        }
        class248 var17 = new class248(arg2);
        byte var18;
        if (arg6) {
            var18 = 1;
        } else {
            var18 = 4;
        }
        int var19 = (arg8 & 0xFFFFFFF8) << 3;
        int var20 = arg7 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg9 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg0 != var23 || var44 < var11 || var11 + 8 < var44 || var12 > var45 || (var12 + 8) < var45) {
                        class54.method370(0, var17, arg6, 0, false, -1, 0, 0, (byte) -124, 0, 0, -1);
                    } else if ((var11 + 8) == var44 || var12 + 8 == var45) {
                        int var52;
                        int var53;
                        if (arg9 == 0) {
                            var52 = var44 + arg4 - var11;
                            var53 = arg10 - (var12 - var45);
                        } else if (arg9 == 1) {
                            var53 = arg10 + var11 + 8 - var44;
                            var52 = -var12 - (-var45 - arg4);
                        } else if (arg9 == 2) {
                            var53 = arg10 + var12 + 8 - var45;
                            var52 = var11 + (arg4 - -8) - var44;
                        } else {
                            var53 = arg10 - (var11 - var44);
                            var52 = arg4 + 8 - (-var12 + var45);
                        }
                        class54.method370(var20 + var45, var17, arg6, 0, true, var53, 0, arg1, (byte) -128, 0, var19 + var44, var52);
                    } else {
                        int var46 = class165.method1040((byte) 59, arg9, var45 & 0x7, var44 & 0x7) + arg4;
                        int var47 = class294.method1953(var45 & 0x7, arg9, var44 & 0x7, arg3 - 131) + arg10;
                        class54.method370(var20 + var45, var17, arg6, var22, false, var47, arg9, arg1, (byte) -128, var21, var19 + var44, var46);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg9 == 0) {
                                var51 = var48 + arg4 - var11;
                                var50 = var49 + arg10 - var12;
                            } else if (arg9 == 1) {
                                var50 = arg10 - (var48 - var11 - 8);
                                var51 = var49 + arg4 - var12;
                            } else if (arg9 == 2) {
                                var51 = arg4 + var11 + 8 - var48;
                                var50 = var12 + arg10 + 8 - var49;
                            } else {
                                var50 = arg10 + var48 - var11;
                                var51 = arg4 - (-(var12 - var49) - 8);
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class67.field1072[arg1][var51][var50] = class67.field1072[arg1][var22 + var46][var21 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (var17.field3748 < var17.field3723.length) {
            int var26 = var17.method1593((byte) 27);
            if (var26 == 128) {
                var25 = true;
                class293.field4620[0] = var17.method1575(false);
                class293.field4620[1] = var17.method1606((byte) 77);
                class293.field4620[2] = var17.method1606((byte) 77);
                class293.field4620[3] = var17.method1606((byte) 77);
                class293.field4620[4] = var17.method1575(false);
            } else {
                if (var26 != 129) {
                    var17.field3748--;
                    break;
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    byte var32 = var17.method1604(4);
                    if (var32 == 0) {
                        if (var31 <= arg0) {
                            int var40 = arg4;
                            int var41 = arg10;
                            int var42 = arg4 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            if (arg4 < 0) {
                                var40 = 0;
                            } else if (arg4 >= 104) {
                                var40 = 104;
                            }
                            int var43 = arg10 + 7;
                            if (arg10 < 0) {
                                var41 = 0;
                            } else if (arg10 >= 104) {
                                var41 = 104;
                            }
                            if (var43 < 0) {
                                var43 = 0;
                            } else if (var43 >= 104) {
                                var43 = 104;
                            }
                            while (var42 > var40) {
                                while (var43 > var41) {
                                    class163.field2508[arg1][var40][var41] = 0;
                                    var41++;
                                }
                                var40++;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                byte var35 = var17.method1604(4);
                                if (var31 <= arg0) {
                                    for (int var36 = var33; var36 < var33 + 4; var36++) {
                                        for (int var37 = var34; var37 < var34 + 4; var37++) {
                                            if (var36 >= var11 && var36 < var11 + 8 && var37 >= var12 && (var12 + 8) > var12) {
                                                int var38 = class165.method1040((byte) 59, arg9, var37 & 0x7, var36 & 0x7) + arg4;
                                                int var39 = class294.method1953(var37 & 0x7, arg9, var36 & 0x7, -127) + arg10;
                                                if (var38 >= 0 && var38 < 104 && var39 >= 0 && var39 < 104) {
                                                    class163.field2508[arg1][var38][var39] = var35;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!var24) {
            int var27 = arg10 + 7;
            int var28 = arg4 + 7;
            for (int var29 = arg4; var29 < var28; var29++) {
                for (int var30 = arg10; var30 < var27; var30++) {
                    class163.field2508[arg1][var29][var30] = 0;
                }
            }
        }
        if (var25) {
            return class293.field4620;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method1654(int arg0, int arg1) {
        field3831++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class71.field1135[arg1];
        int var3 = class58.field916[arg1];
        int var4 = class84.field1339[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class229.field3459[arg1];
        long var6 = class229.field3459[arg1];
        if (var4 == 37 && class224.field3355 == null) {
            class106.method667(105, var2, var3);
            class224.field3355 = class66.method450(var3, 0, var2);
            class295.method1980(class224.field3355, 0);
        }
        if (var4 == 12) {
            class61 var8 = class18.field220[var5];
            if (var8 != null) {
                class58.field910++;
                class68.field1073 = 2;
                class116.field1771 = class188.field2872;
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class196.field2979.method1106(2, false);
                class196.field2979.method1588(var5, (byte) 43);
                class196.field2979.method1586(class140.field2048[82] ? 1 : 0, (byte) -115);
            }
        }
        if (arg0 <= 33) {
            field3828 = 0.48610142F;
        }
        if (var4 == 22) {
            class18.field213++;
            class196.field2979.method1106(143, false);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1599(9611, var5);
            class196.field2979.method1588(var2, (byte) 43);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 35) {
            if (var5 == 0) {
                class258.field3940 = 1;
                class119.method755(class99.field1557, var2, var3);
            } else if (var5 == 1) {
                class251.field3818++;
                class196.field2979.method1106(229, false);
                class196.field2979.method1569(class81.field1303 + var2, -7355);
                class196.field2979.method1577((byte) 46, class116.field1763);
                class196.field2979.method1588(class147.field2141 + var3, (byte) 43);
                class196.field2979.method1599(9611, class162.field2482);
            }
        }
        if (var4 == 15) {
            class107 var9 = class96.field1521[var5];
            if (var9 != null) {
                class184.field2785 = class205.field3076;
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class81.field1301++;
                class50.field801 = 0;
                class196.field2979.method1106(173, false);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
                class196.field2979.method1569(var5, -7355);
            }
        }
        if (var4 == 5) {
            class175.method1081(5885);
        }
        if (var4 == 14) {
            class191.field2928++;
            class196.field2979.method1106(201, false);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1599(9611, var5);
            class196.field2979.method1599(9611, var2);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 33) {
            class281.field4207++;
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class196.field2979.method1106(39, false);
            class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
            class196.field2979.method1599(9611, class81.field1303 + var2);
            class196.field2979.method1599(9611, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class196.field2979.method1605(var3 + class147.field2141, (byte) -75);
        }
        if (var4 == 23) {
            class61 var10 = class18.field220[var5];
            if (var10 != null) {
                class44.field705++;
                class68.field1073 = 2;
                class50.field801 = 0;
                class116.field1771 = class188.field2872;
                class184.field2785 = class205.field3076;
                class196.field2979.method1106(213, false);
                class196.field2979.method1588(var5, (byte) 43);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            }
        }
        if (var4 == 19) {
            class147.field2142++;
            class184.field2785 = class205.field3076;
            class50.field801 = 0;
            class68.field1073 = 2;
            class116.field1771 = class188.field2872;
            class196.field2979.method1106(171, false);
            class196.field2979.method1569(var3 + class147.field2141, -7355);
            class196.field2979.method1599(9611, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class196.field2979.method1605(class81.field1303 + var2, (byte) 106);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
        }
        if (var4 == 29) {
            class196.field2979.method1106(232, false);
            class114.field1739++;
            class196.field2979.method1599(9611, var2);
            class196.field2979.method1605(var5, (byte) -75);
            class196.field2979.method1613(false, var3);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 16) {
            if (var5 == 0) {
                class119.method755(class99.field1557, var2, var3);
            } else if (var5 == 1) {
                if (class256.field3893 > 0 && class140.field2048[82] && class140.field2048[81]) {
                    class46.method311(class99.field1557, class147.field2141 + var3, class81.field1303 + var2, 26596);
                } else {
                    class21.method136(var2, var3, 1, (byte) 67);
                    class196.field2979.method1568(class42.field618, (byte) 49);
                    class196.field2979.method1568(class277.field4177, (byte) 49);
                    class196.field2979.method1605((int) class84.field1336, (byte) -101);
                    class196.field2979.method1568(57, (byte) 49);
                    class196.field2979.method1568(class154.field2311, (byte) 49);
                    class196.field2979.method1568(class82.field1324, (byte) 49);
                    class196.field2979.method1568(89, (byte) 49);
                    class196.field2979.method1605(class165.field2537.field2251, (byte) 62);
                    class196.field2979.method1605(class165.field2537.field2234, (byte) -108);
                    class196.field2979.method1568(class244.field3656, (byte) 49);
                    class196.field2979.method1568(63, (byte) 49);
                }
            }
        }
        if (var4 == 45) {
            class274.field4130++;
            class196.field2979.method1106(100, false);
            class196.field2979.method1605(var2, (byte) -109);
            class196.field2979.method1569(var5, -7355);
            class196.field2979.method1613(false, var3);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 57) {
            class286.field4278++;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class68.field1073 = 2;
            class196.field2979.method1106(9, false);
            class196.field2979.method1586(class140.field2048[82] ? 1 : 0, (byte) -115);
            class196.field2979.method1588(var5, (byte) 43);
            class196.field2979.method1588(class81.field1303 + var2, (byte) 43);
            class196.field2979.method1569(class147.field2141 + var3, -7355);
        }
        if (var4 == 41) {
            class289 var11 = class66.method450(var3, 0, var2);
            if (var11 != null) {
                class226.method1444(-128);
                class268 var12 = client.method972(var11);
                class221.method1417(var12.method1791((byte) 69), var3, var12.field4035, 3, var11.field4484, var2, var11.field4432);
                class114.field1738 = 0;
                class48.field770 = class237.method1503(var11, -74);
                if (class48.field770 == null) {
                    class48.field770 = "Null";
                }
                if (!var11.field4495) {
                    class210.field3163 = "<col=00ff00>" + var11.field4543 + "<col=ffffff>";
                    return;
                }
                class210.field3163 = var11.field4407 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 51) {
            class50.field801 = 0;
            class89.field1402++;
            class116.field1771 = class188.field2872;
            class184.field2785 = class205.field3076;
            class68.field1073 = 2;
            class196.field2979.method1106(106, false);
            class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            class196.field2979.method1605(class81.field1303 + var2, (byte) -76);
            class196.field2979.method1599(9611, class147.field2141 + var3);
            class196.field2979.method1588((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 43);
        }
        if (var4 == 3) {
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class50.field801 = 0;
            class116.field1771 = class188.field2872;
            class294.field4658++;
            class196.field2979.method1106(125, false);
            class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            class196.field2979.method1599(9611, class147.field2141 + var3);
            class196.field2979.method1599(9611, class81.field1303 + var2);
            class196.field2979.method1588(var5, (byte) 43);
        }
        if (var4 == 46) {
            class196.field2979.method1106(145, false);
            class196.field2979.method1577((byte) 61, var3);
            class57.field900++;
            class289 var13 = class89.method574((byte) -15, var3);
            if (var13.field4510 != null && var13.field4510[0][0] == 5) {
                int var14 = var13.field4510[0][1];
                if (class35.field494[var14] != var13.field4409[0]) {
                    class35.field494[var14] = var13.field4409[0];
                    class183.method1140(var14, -24559);
                }
            }
        }
        if (var4 == 34) {
            class61 var15 = class18.field220[var5];
            if (var15 != null) {
                class116.field1771 = class188.field2872;
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class84.field1352++;
                class68.field1073 = 2;
                class196.field2979.method1106(221, false);
                class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
                class196.field2979.method1599(9611, var5);
            }
        }
        if (var4 == 60) {
            class196.field2979.method1106(92, false);
            class196.field2979.method1577((byte) 55, var3);
            class196.field2979.method1605(class145.field2123, (byte) 93);
            class80.field1286++;
            class196.field2979.method1569(class53.field868, -7355);
            class196.field2979.method1580(254789464, class192.field2940);
            class196.field2979.method1569(var5, -7355);
            class196.field2979.method1588(var2, (byte) 43);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 18) {
            class107 var16 = class96.field1521[var5];
            if (var16 != null) {
                class68.field1073 = 2;
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class218.field3274++;
                class116.field1771 = class188.field2872;
                class196.field2979.method1106(103, false);
                class196.field2979.method1599(9611, var5);
                class196.field2979.method1586(class140.field2048[82] ? 1 : 0, (byte) -115);
            }
        }
        if (var4 == 1) {
            class226.method1444(-128);
            class289 var17 = class89.method574((byte) -15, var3);
            class53.field868 = var2;
            class114.field1738 = 1;
            class192.field2940 = var3;
            class145.field2123 = var5;
            class295.method1980(var17, 0);
            class241.field3624 = "<col=ff9040>" + class160.method999(var5, 0).field626 + "<col=ffffff>";
            if (class241.field3624 == null) {
                class241.field3624 = "null";
            }
            return;
        }
        if (var4 == 36) {
            class116.field1771 = class188.field2872;
            class68.field1073 = 2;
            class79.field1261++;
            class50.field801 = 0;
            class184.field2785 = class205.field3076;
            class196.field2979.method1106(71, false);
            class196.field2979.method1599(9611, var5);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
            class196.field2979.method1605(class81.field1303 + var2, (byte) -96);
            class196.field2979.method1588(class147.field2141 + var3, (byte) 43);
        }
        if (var4 == 42) {
            class107 var18 = class96.field1521[var5];
            if (var18 != null) {
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class287.field4292++;
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class196.field2979.method1106(37, false);
                class196.field2979.method1569(var5, -7355);
                class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
            }
        }
        if (var4 == 9) {
            class196.field2979.method1106(145, false);
            class57.field900++;
            class196.field2979.method1577((byte) 121, var3);
            class289 var19 = class89.method574((byte) -15, var3);
            if (var19.field4510 != null && var19.field4510[0][0] == 5) {
                int var20 = var19.field4510[0][1];
                class35.field494[var20] = 1 - class35.field494[var20];
                class183.method1140(var20, -24559);
            }
        }
        if (var4 == 40) {
            class68.field1073 = 2;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class160.field2454++;
            class184.field2785 = class205.field3076;
            class196.field2979.method1106(72, false);
            class196.field2979.method1613(false, class192.field2940);
            class196.field2979.method1605(var5, (byte) -71);
            class196.field2979.method1569(class53.field868, -7355);
            class196.field2979.method1569(class147.field2141 + var3, -7355);
            class196.field2979.method1588(class145.field2123, (byte) 43);
            class196.field2979.method1588(class81.field1303 + var2, (byte) 43);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
        }
        if (var4 == 43) {
            class69.field1095++;
            class196.field2979.method1106(27, false);
            class196.field2979.method1588(class162.field2482, (byte) 43);
            class196.field2979.method1561(class116.field1763, 255);
            class196.field2979.method1605(var2, (byte) 76);
            class196.field2979.method1577((byte) 75, var3);
        }
        if (var4 == 25) {
            class157.field2362++;
            class196.field2979.method1106(121, false);
            class196.field2979.method1599(9611, var2);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1569(var5, -7355);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 32) {
            class107 var21 = class96.field1521[var5];
            if (var21 != null) {
                class116.field1771 = class188.field2872;
                class184.field2785 = class205.field3076;
                class68.field1073 = 2;
                class17.field202++;
                class50.field801 = 0;
                class196.field2979.method1106(0, false);
                class196.field2979.method1605(var5, (byte) -115);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
                class196.field2979.method1580(254789464, class192.field2940);
                class196.field2979.method1588(class53.field868, (byte) 43);
                class196.field2979.method1599(9611, class145.field2123);
            }
        }
        if (var4 == 30) {
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class50.field801 = 0;
            class157.field2366++;
            class116.field1771 = class188.field2872;
            class196.field2979.method1106(155, false);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
            class196.field2979.method1569(var5, -7355);
            class196.field2979.method1588(class147.field2141 + var3, (byte) 43);
            class196.field2979.method1588(class81.field1303 + var2, (byte) 43);
        }
        if (var4 == 17) {
            class61 var22 = class18.field220[var5];
            if (var22 != null) {
                class116.field1771 = class188.field2872;
                class199.field3023++;
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class68.field1073 = 2;
                class196.field2979.method1106(137, false);
                class196.field2979.method1605(class53.field868, (byte) -77);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
                class196.field2979.method1613(false, class192.field2940);
                class196.field2979.method1569(class145.field2123, -7355);
                class196.field2979.method1605(var5, (byte) -127);
            }
        }
        if (var4 == 49) {
            class196.field2979.method1106(10, false);
            class273.field4103++;
            class196.field2979.method1588(var2, (byte) 43);
            class196.field2979.method1588(var5, (byte) 43);
            class196.field2979.method1577((byte) 98, var3);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 1001) {
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class61 var23 = class18.field220[var5];
            if (var23 != null) {
                class72 var24 = var23.field959;
                if (var24.field1196 != null) {
                    var24 = var24.method487(-1);
                }
                if (var24 != null) {
                    class289.field4406++;
                    class196.field2979.method1106(136, false);
                    class196.field2979.method1605(var24.field1142, (byte) 70);
                }
            }
        }
        if (var4 == 47) {
            class196.field2979.method1106(129, false);
            class196.field2979.method1569(var5, -7355);
            class196.field2979.method1577((byte) 110, var3);
            class196.field2979.method1588(var2, (byte) 43);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
            class20.field232++;
        }
        if (var4 == 8) {
            class107 var25 = class96.field1521[var5];
            if (var25 != null) {
                class50.field801 = 0;
                class68.field1073 = 2;
                class116.field1771 = class188.field2872;
                class187.field2834++;
                class184.field2785 = class205.field3076;
                class196.field2979.method1106(85, false);
                class196.field2979.method1586(class140.field2048[82] ? 1 : 0, (byte) -115);
                class196.field2979.method1569(var5, -7355);
            }
        }
        if (var4 == 2) {
            class61 var26 = class18.field220[var5];
            if (var26 != null) {
                class184.field2785 = class205.field3076;
                class11.field146++;
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class50.field801 = 0;
                class196.field2979.method1106(82, false);
                class196.field2979.method1605(var5, (byte) -119);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            }
        }
        if (var4 == 31) {
            class50.field801 = 0;
            class246.field3672++;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class68.field1073 = 2;
            class196.field2979.method1106(250, false);
            class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            class196.field2979.method1569(class162.field2482, -7355);
            class196.field2979.method1561(class116.field1763, 255);
            class196.field2979.method1569(var3 + class147.field2141, -7355);
            class196.field2979.method1569(var5, -7355);
            class196.field2979.method1599(9611, var2 + class81.field1303);
        }
        if (var4 == 26) {
            class185.field2801++;
            class196.field2979.method1106(196, false);
            class196.field2979.method1599(9611, var5);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1599(9611, var2);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 50) {
            class107 var27 = class96.field1521[var5];
            if (var27 != null) {
                class184.field2785 = class205.field3076;
                class50.field801 = 0;
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class196.field2979.method1106(210, false);
                class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
                class192.field2949++;
                class196.field2979.method1605(var5, (byte) 90);
            }
        }
        if (var4 == 28) {
            class107 var28 = class96.field1521[var5];
            if (var28 != null) {
                class50.field801 = 0;
                class68.field1073 = 2;
                class184.field2785 = class205.field3076;
                class63.field993++;
                class116.field1771 = class188.field2872;
                class196.field2979.method1106(140, false);
                class196.field2979.method1588(class162.field2482, (byte) 43);
                class196.field2979.method1599(9611, var5);
                class196.field2979.method1613(false, class116.field1763);
                class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
            }
        }
        if (var4 == 1002) {
            class184.field2785 = class205.field3076;
            class153.field2268++;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class68.field1073 = 2;
            class196.field2979.method1106(8, false);
            class196.field2979.method1569((int) (var6 >>> 32) & Integer.MAX_VALUE, -7355);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
            class196.field2979.method1569(class81.field1303 + var2, -7355);
            class196.field2979.method1569(var3 + class147.field2141, -7355);
        }
        if (var4 == 13 || var4 == 1006) {
            class52.method356(var2, 13310, var5, class46.field754[arg1], var3);
        }
        if (var4 == 39) {
            class107 var29 = class96.field1521[var5];
            if (var29 != null) {
                class116.field1771 = class188.field2872;
                class137.field2017++;
                class184.field2785 = class205.field3076;
                class68.field1073 = 2;
                class50.field801 = 0;
                class196.field2979.method1106(172, false);
                class196.field2979.method1569(var5, -7355);
                class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
            }
        }
        if (var4 == 1005) {
            class116.field1771 = class188.field2872;
            class40.field541++;
            class68.field1073 = 2;
            class50.field801 = 0;
            class184.field2785 = class205.field3076;
            class196.field2979.method1106(224, false);
            class196.field2979.method1605(var5, (byte) 54);
        }
        if (var4 == 11) {
            class289 var30 = class89.method574((byte) -15, var3);
            boolean var31 = true;
            if (var30.field4496 > 0) {
                var31 = class71.method479(-24, var30);
            }
            if (var31) {
                class196.field2979.method1106(145, false);
                class57.field900++;
                class196.field2979.method1577((byte) 84, var3);
            }
        }
        if (var4 == 4) {
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class68.field1073 = 2;
            class33.field477++;
            class184.field2785 = class205.field3076;
            class196.field2979.method1106(222, false);
            class196.field2979.method1586(class140.field2048[82] ? 1 : 0, (byte) -115);
            class196.field2979.method1588(class147.field2141 + var3, (byte) 43);
            class196.field2979.method1605(class81.field1303 + var2, (byte) 58);
            class196.field2979.method1599(9611, var5);
        }
        if (var4 == 59) {
            class196.field2979.method1106(184, false);
            class196.field2979.method1577((byte) 103, class116.field1763);
            class153.field2295++;
            class196.field2979.method1605(var5, (byte) -118);
            class196.field2979.method1599(9611, class162.field2482);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1588(var2, (byte) 43);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 10) {
            class107 var32 = class96.field1521[var5];
            if (var32 != null) {
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class184.field2785 = class205.field3076;
                class43.field642++;
                class50.field801 = 0;
                class196.field2979.method1106(220, false);
                class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
                class196.field2979.method1599(9611, var5);
            }
        }
        if (var4 == 1004) {
            class83.field1334++;
            class50.field801 = 0;
            class116.field1771 = class188.field2872;
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class196.field2979.method1106(242, false);
            class196.field2979.method1599(9611, var5);
        }
        if (var4 == 24) {
            class143.field2089++;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class68.field1073 = 2;
            class50.field801 = 0;
            class196.field2979.method1106(41, false);
            class196.field2979.method1569(class53.field868, -7355);
            class196.field2979.method1569(class145.field2123, -7355);
            class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
            class196.field2979.method1613(false, class192.field2940);
            class196.field2979.method1569(class147.field2141 + var3, -7355);
            class196.field2979.method1569(class81.field1303 + var2, -7355);
            class196.field2979.method1569((int) (var6 >>> 32) & Integer.MAX_VALUE, -7355);
        }
        if (var4 == 38) {
            class157.field2353++;
            class196.field2979.method1106(164, false);
            class196.field2979.method1605(var2, (byte) 88);
            class196.field2979.method1613(false, var3);
            class196.field2979.method1588(var5, (byte) 43);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 48) {
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class100.field1571++;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class196.field2979.method1106(216, false);
            class196.field2979.method1613(false, class116.field1763);
            class196.field2979.method1605(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -76);
            class196.field2979.method1599(9611, class147.field2141 + var3);
            class196.field2979.method1569(class81.field1303 + var2, -7355);
            class196.field2979.method1599(9611, class162.field2482);
            class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
        }
        if (var4 == 1003) {
            class289 var33 = class89.method574((byte) -15, var3);
            if (var33 == null || var33.field4448[var2] < 100000) {
                class196.field2979.method1106(224, false);
                class40.field541++;
                class196.field2979.method1605(var5, (byte) 72);
            } else {
                class48.method321(0, "", var33.field4448[var2] + " x " + class160.method999(var5, 0).field626, -114);
            }
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 20) {
            class61 var34 = class18.field220[var5];
            if (var34 != null) {
                class68.field1073 = 2;
                class81.field1292++;
                class116.field1771 = class188.field2872;
                class184.field2785 = class205.field3076;
                class50.field801 = 0;
                class196.field2979.method1106(6, false);
                class196.field2979.method1569(var5, -7355);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
                class196.field2979.method1561(class116.field1763, 255);
                class196.field2979.method1599(9611, class162.field2482);
            }
        }
        if (var4 == 6) {
            class107 var35 = class96.field1521[var5];
            if (var35 != null) {
                class116.field1771 = class188.field2872;
                class50.field801 = 0;
                class68.field1073 = 2;
                class184.field2785 = class205.field3076;
                class7.field110++;
                class196.field2979.method1106(79, false);
                class196.field2979.method1569(var5, -7355);
                class196.field2979.method1612(class140.field2048[82] ? 1 : 0, 128);
            }
        }
        if (var4 == 58) {
            class196.field2979.method1106(29, false);
            class24.field293++;
            class196.field2979.method1569(var2, -7355);
            class196.field2979.method1580(254789464, var3);
            class196.field2979.method1599(9611, var5);
            class43.field691 = 0;
            class241.field3622 = class89.method574((byte) -15, var3);
            class246.field3664 = var2;
        }
        if (var4 == 44) {
            class11.field141++;
            class68.field1073 = 2;
            class184.field2785 = class205.field3076;
            class116.field1771 = class188.field2872;
            class50.field801 = 0;
            class196.field2979.method1106(78, false);
            class196.field2979.method1605(var2 + class81.field1303, (byte) 112);
            class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
            class196.field2979.method1605(class147.field2141 + var3, (byte) 60);
            class196.field2979.method1569((int) (var6 >>> 32) & Integer.MAX_VALUE, -7355);
        }
        if (var4 == 21) {
            if (var5 == 0) {
                class275.field4150 = 1;
                class119.method755(class99.field1557, var2, var3);
            } else if (class256.field3893 > 0 && class140.field2048[82] && class140.field2048[81]) {
                class46.method311(class99.field1557, class147.field2141 + var3, class81.field1303 - -var2, 26596);
            } else {
                class196.field2979.method1106(226, false);
                class196.field2979.method1588(class147.field2141 + var3, (byte) 43);
                class196.field2979.method1569(class81.field1303 + var2, -7355);
                class53.field862++;
            }
        }
        if (var4 == 7) {
            class61 var36 = class18.field220[var5];
            if (var36 != null) {
                class50.field801 = 0;
                class184.field2785 = class205.field3076;
                class72.field1140++;
                class116.field1771 = class188.field2872;
                class68.field1073 = 2;
                class196.field2979.method1106(42, false);
                class196.field2979.method1568(class140.field2048[82] ? 1 : 0, (byte) 49);
                class196.field2979.method1605(var5, (byte) 98);
            }
        }
        if (class114.field1738 != 0) {
            class114.field1738 = 0;
            class295.method1980(class89.method574((byte) -15, class192.field2940), 0);
        }
        if (class153.field2305) {
            class226.method1444(-128);
        }
        if (class241.field3622 != null && class43.field691 == 0) {
            class295.method1980(class241.field3622, 0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lul;I)V")
    public static final void method1655(class192 arg0, int arg1) {
        field3829++;
        long var2 = 0L;
        int var4 = 0;
        if (arg1 != 82) {
            return;
        }
        if (arg0.field2950 == 0) {
            var2 = class154.method939(arg0.field2955, arg0.field2948, arg0.field2944);
        }
        if (arg0.field2950 == 1) {
            var2 = class140.method865(arg0.field2955, arg0.field2948, arg0.field2944);
        }
        if (arg0.field2950 == 2) {
            var2 = class268.method1794(arg0.field2955, arg0.field2948, arg0.field2944);
        }
        int var5 = -1;
        if (arg0.field2950 == 3) {
            var2 = class92.method590(arg0.field2955, arg0.field2948, arg0.field2944);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = ((int) var2 & 0x7C029) >> 14;
        }
        arg0.field2951 = var5;
        arg0.field2957 = var6;
        arg0.field2954 = var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;ILpf;)Lam;")
    public static final class180 method1656(String arg0, int arg1, class294 arg2) {
        field3832++;
        int var3 = arg2.method1965(arg0, arg1 ^ 0xFFFF9F33);
        if (var3 == -1) {
            return new class180(0);
        }
        int[] var4 = arg2.method1946(arg1 ^ arg1, var3);
        class180 var5 = new class180(var4.length);
        for (int var6 = 0; var6 < var5.field2734; var6++) {
            class248 var7 = new class248(arg2.method1973(arg1 - 24729, var3, var4[var6]));
            var5.field2750[var6] = var7.method1597((byte) 119);
            var5.field2736[var6] = var7.method1604(4);
            var5.field2739[var6] = var7.method1576(-17672);
            var5.field2747[var6] = var7.method1576(-17672);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method1657(int arg0) {
        field3827++;
        if (arg0 < -32) {
            class177.field2709.method1782(0);
            class80.field1289.method1782(0);
        }
    }
}

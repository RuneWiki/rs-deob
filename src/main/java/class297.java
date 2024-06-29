import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 extends class166 {

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4697 = " is already on your friend list.";

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lad;")
    public static final class259 method1980(int arg0, int arg1, int arg2) {
        if (arg2 <= 97) {
            return null;
        }
        field4692++;
        for (class259 var3 = (class259) class244.field3974.method287(-128); var3 != null; var3 = (class259) class244.field3974.method291((byte) -96)) {
            if (var3.field4154 && var3.method1754(arg0, arg1, (byte) 117)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    public static final void method1981(boolean arg0, int arg1) {
        field4695++;
        if (arg1 != 19992) {
            method1984(78);
        }
        class240.method1647(arg0, class29.field409, class75.field1236, class79.field1310, (byte) 92);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
    public static final void method1982(int arg0, int arg1) {
        class258.field4122.method1897(true, arg1);
        if (arg0 == -1) {
            field4693++;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Z")
    public static final boolean method1983(int arg0) throws IOException {
        field4699++;
        if (class249.field4022 == null) {
            return false;
        }
        int var1 = class249.field4022.method898(37);
        if (var1 == 0) {
            return false;
        }
        if (class66.field1105 == -1) {
            class249.field4022.method907((byte) 118, 1, class236.field3814.field1471, 0);
            var1--;
            class236.field3814.field1535 = 0;
            class66.field1105 = class236.field3814.method542((byte) -107);
            class53.field804 = client.field2436[class66.field1105];
        }
        if (class53.field804 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class249.field4022.method907((byte) 94, 1, class236.field3814.field1471, 0);
            class53.field804 = class236.field3814.field1471[0] & 0xFF;
        }
        if (class53.field804 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class249.field4022.method907((byte) 120, 2, class236.field3814.field1471, 0);
            class236.field3814.field1535 = 0;
            class53.field804 = class236.field3814.method645(11596);
        }
        if (class53.field804 > var1) {
            return false;
        }
        class236.field3814.field1535 = 0;
        class249.field4022.method907((byte) 113, class53.field804, class236.field3814.field1471, 0);
        class256.field4091 = class52.field761;
        class283.field4463 = 0;
        class52.field761 = class161.field2510;
        class161.field2510 = class66.field1105;
        if (class66.field1105 == 169) {
            int var2 = class236.field3814.method679((byte) 125);
            int var3 = class236.field3814.method647(true);
            int var4 = class236.field3814.method670(-2);
            int var5 = class236.field3814.method645(11596);
            if ((var3 >> 30) != 0) {
                int var30 = (var3 >> 14 & 0x3FFF) - class46.field656;
                int var31 = (var3 & 0x3FFF) - class260.field4162;
                int var32 = var3 >> 28 & 0x3;
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                    int var33 = var30 * 128 + 64;
                    int var34 = var31 * 128 + 64;
                    class214 var35 = new class214(var5, var32, var33, var34, class34.method269(var32, var34, var33, arg0 + 11349) - var2, var4, class192.field2978);
                    class104.field1734.method1219(false, new class183(var35));
                }
            } else if (var3 >> 29 != 0) {
                int var6 = var3 & 0xFFFF;
                class45 var7 = class255.field4082[var6];
                if (var7 != null) {
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    boolean var8 = true;
                    if (var5 != -1 && var7.field2299 != -1) {
                        if (var7.field2299 == var5) {
                            class238 var13 = class16.method158(var5, true);
                            if (var13.field3866 && var13.field3852 != -1) {
                                class30 var14 = class148.method996(-51, var13.field3852);
                                int var15 = var14.field450;
                                if (var15 == 1) {
                                    var7.field2261 = 1;
                                    var7.field2203 = 0;
                                    var8 = false;
                                    var7.field2236 = class192.field2978 + var4;
                                    var7.field2300 = 0;
                                    var7.field2289 = 0;
                                    class52.method390(false, var14, var7.field2289, 107, var7.field2278, var7.field2240);
                                } else if (var15 == 2) {
                                    var8 = false;
                                    var7.field2220 = 0;
                                }
                            }
                        } else {
                            class238 var9 = class16.method158(var5, true);
                            class238 var10 = class16.method158(var7.field2299, true);
                            if (var9.field3852 != -1 && var10.field3852 != -1) {
                                class30 var11 = class148.method996(-72, var9.field3852);
                                class30 var12 = class148.method996(-126, var10.field3852);
                                if (var11.field440 < var12.field440) {
                                    var8 = false;
                                }
                            }
                        }
                    }
                    if (var8) {
                        var7.field2289 = 0;
                        var7.field2201 = var2;
                        var7.field2236 = class192.field2978 + var4;
                        if (class192.field2978 < var7.field2236) {
                            var7.field2289 = -1;
                        }
                        var7.field2203 = 0;
                        var7.field2261 = 1;
                        var7.field2299 = var5;
                        if (var7.field2299 != -1 && class192.field2978 == var7.field2236) {
                            int var16 = class16.method158(var7.field2299, true).field3852;
                            if (var16 != -1) {
                                class30 var17 = class148.method996(-74, var16);
                                if (var17 != null && var17.field439 != null) {
                                    class52.method390(false, var17, 0, 113, var7.field2278, var7.field2240);
                                }
                            }
                        }
                    }
                }
            } else if ((var3 >> 28) != 0) {
                int var18 = var3 & 0xFFFF;
                class236 var19;
                if (class116.field1897 == var18) {
                    var19 = class283.field4473;
                } else {
                    var19 = class210.field3267[var18];
                }
                if (var19 != null) {
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    boolean var20 = true;
                    if (var5 != -1 && var19.field2299 != -1) {
                        if (var19.field2299 == var5) {
                            class238 var21 = class16.method158(var5, true);
                            if (var21.field3866 && var21.field3852 != -1) {
                                class30 var22 = class148.method996(-115, var21.field3852);
                                int var23 = var22.field450;
                                if (var23 == 1) {
                                    var19.field2203 = 0;
                                    var20 = false;
                                    var19.field2289 = 0;
                                    var19.field2261 = 1;
                                    var19.field2236 = class192.field2978 + var4;
                                    var19.field2300 = 0;
                                    class52.method390(false, var22, var19.field2289, 118, var19.field2278, var19.field2240);
                                } else if (var23 == 2) {
                                    var19.field2220 = 0;
                                    var20 = false;
                                }
                            }
                        } else {
                            class238 var24 = class16.method158(var5, true);
                            class238 var25 = class16.method158(var19.field2299, true);
                            if (var24.field3852 != -1 && var25.field3852 != -1) {
                                class30 var26 = class148.method996(-107, var24.field3852);
                                class30 var27 = class148.method996(arg0 + 11140, var25.field3852);
                                if (var27.field440 > var26.field440) {
                                    var20 = false;
                                }
                            }
                        }
                    }
                    if (var20) {
                        var19.field2299 = var5;
                        var19.field2261 = 1;
                        if (var19.field2299 == 65535) {
                            var19.field2299 = -1;
                        }
                        var19.field2203 = 0;
                        var19.field2201 = var2;
                        var19.field2236 = class192.field2978 + var4;
                        var19.field2289 = 0;
                        if (var19.field2236 > class192.field2978) {
                            var19.field2289 = -1;
                        }
                        if (var19.field2299 != -1 && class192.field2978 == var19.field2236) {
                            int var28 = class16.method158(var19.field2299, true).field3852;
                            if (var28 != -1) {
                                class30 var29 = class148.method996(-119, var28);
                                if (var29 != null && var29.field439 != null) {
                                    class52.method390(class283.field4473 == var19, var29, 0, arg0 + 11345, var19.field2278, var19.field2240);
                                }
                            }
                        }
                    }
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 109) {
            int var36 = class236.field3814.method653(false);
            int var37 = class236.field3814.method677((byte) -100);
            if (var37 == 65535) {
                var37 = -1;
            }
            class260.method1762(var37, (byte) 100, var36);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 105) {
            int var38 = class236.field3814.method682(-23595);
            int var39 = class236.field3814.method671(104);
            int var40 = class236.field3814.method677((byte) -100);
            if (var40 == 65535) {
                var40 = -1;
            }
            class218.method1463(1469421928, var38, var40, var39);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 45) {
            byte[] var41 = new byte[class53.field804];
            class236.field3814.method540(var41, true, 0, class53.field804);
            String var42 = class41.method307(27, var41, class53.field804, 0);
            if (class47.field685 == null && class32.field468 == 3 || !class32.field477.startsWith("win") || class193.field3021) {
                class34.method268(arg0 ^ 0xFFFFD412, var42, true);
            } else {
                class106.field1774 = true;
                class142.field2157 = var42;
                class221.field3399 = class179.field2788.method250(16, var42);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 160) {
            class39.method283(25, false);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 101) {
            class103.method745(30014, class236.field3814, class53.field804, class179.field2788);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 137) {
            int var43 = class236.field3814.method645(11596);
            int var44 = class236.field3814.method633(arg0 + 11318);
            int var45 = class236.field3814.method633(98);
            int var46 = class236.field3814.method645(11596);
            int var47 = class236.field3814.method633(arg0 ^ 0xFFFFD443);
            int var48 = class236.field3814.method633(81);
            if (class151.method1017(1, var43)) {
                class269.method1814(var48, (byte) 127, var46, var44, var45, var47);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 154) {
            class26.method212((byte) 87);
            class66.field1105 = -1;
            return false;
        } else if (class66.field1105 == 195) {
            long var49 = class236.field3814.method625((byte) -22);
            int var51 = class236.field3814.method645(11596);
            int var52 = class236.field3814.method633(79);
            String var53 = "";
            boolean var54 = true;
            if (var51 > 0) {
                var53 = class236.field3814.method675((byte) 16);
            }
            if (var49 < 0L) {
                var49 &= Long.MAX_VALUE;
                var54 = false;
            }
            String var55 = class28.method222(-256, var49);
            for (int var56 = 0; var56 < class166.field2604; var56++) {
                if (class173.field2718[var56] == var49) {
                    if (class295.field4659[var56] != var51) {
                        class295.field4659[var56] = var51;
                        if (var51 > 0) {
                            class81.method579(-1, "", 5, var55 + class221.field3403);
                        }
                        if (var51 == 0) {
                            class81.method579(arg0 + 11245, "", 5, var55 + class168.field2627);
                        }
                    }
                    var55 = null;
                    class272.field4363[var56] = var53;
                    class152.field2386[var56] = var52;
                    class52.field786[var56] = var54;
                    break;
                }
            }
            if (var55 != null && class166.field2604 < 200) {
                class173.field2718[class166.field2604] = var49;
                class129.field2024[class166.field2604] = var55;
                class295.field4659[class166.field2604] = var51;
                class272.field4363[class166.field2604] = var53;
                class152.field2386[class166.field2604] = var52;
                class52.field786[class166.field2604] = var54;
                class166.field2604++;
            }
            class15.field235 = class275.field4392;
            boolean var57 = false;
            int var58 = class166.field2604;
            while (var58 > 0) {
                boolean var59 = true;
                var58--;
                for (int var60 = 0; var60 < var58; var60++) {
                    if (class295.field4659[var60] != class152.field2385 && class295.field4659[var60 + 1] == class152.field2385 || class295.field4659[var60] == 0 && class295.field4659[var60 + 1] != 0) {
                        int var61 = class295.field4659[var60];
                        class295.field4659[var60] = class295.field4659[var60 + 1];
                        class295.field4659[var60 + 1] = var61;
                        String var62 = class272.field4363[var60];
                        class272.field4363[var60] = class272.field4363[var60 + 1];
                        var59 = false;
                        class272.field4363[var60 + 1] = var62;
                        String var63 = class129.field2024[var60];
                        class129.field2024[var60] = class129.field2024[var60 + 1];
                        class129.field2024[var60 + 1] = var63;
                        long var64 = class173.field2718[var60];
                        class173.field2718[var60] = class173.field2718[var60 + 1];
                        class173.field2718[var60 + 1] = var64;
                        int var66 = class152.field2386[var60];
                        class152.field2386[var60] = class152.field2386[var60 + 1];
                        class152.field2386[var60 + 1] = var66;
                        boolean var67 = class52.field786[var60];
                        class52.field786[var60] = class52.field786[var60 + 1];
                        class52.field786[var60 + 1] = var67;
                    }
                }
                if (var59) {
                    break;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 110) {
            class133.field2086 = class236.field3814.method670(arg0 + 11244) * 30;
            class162.field2539 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 201) {
            if (class53.field804 == 0) {
                class186.field2868 = class139.field2131;
            } else {
                class186.field2868 = class236.field3814.method675((byte) 16);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 66) {
            int var68 = class236.field3814.method647(true);
            int var69 = class236.field3814.method679((byte) 120);
            int var70 = class236.field3814.method664(-100);
            if (class151.method1017(arg0 + 11247, var69)) {
                class210.method1409(var68, var70, (byte) -69);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 219) {
            long var71 = class236.field3814.method625((byte) -22);
            int var73 = class236.field3814.method645(arg0 + 22842);
            byte var74 = class236.field3814.method656(-252);
            boolean var75 = false;
            if ((var71 & Long.MIN_VALUE) != 0L) {
                var75 = true;
            }
            if (var75) {
                if (class139.field2119 == 0) {
                    class66.field1105 = -1;
                    return true;
                }
                long var81 = var71 & Long.MAX_VALUE;
                boolean var83 = false;
                int var84;
                for (var84 = 0; class139.field2119 > var84 && (class83.field1401[var84].field2603 != var81 || class83.field1401[var84].field4100 != var73); var84++) {
                }
                if (class139.field2119 > var84) {
                    while (var84 < class139.field2119 - 1) {
                        class83.field1401[var84] = class83.field1401[var84 + 1];
                        var84++;
                    }
                    class139.field2119--;
                    class83.field1401[class139.field2119] = null;
                }
            } else {
                String var76 = class236.field3814.method675((byte) 16);
                class256 var77 = new class256();
                var77.field2603 = var71;
                var77.field4104 = class130.method903(-26704, var77.field2603);
                var77.field4102 = var76;
                var77.field4100 = var73;
                var77.field4097 = var74;
                int var78;
                for (var78 = class139.field2119 - 1; var78 >= 0; var78--) {
                    int var79 = class83.field1401[var78].field4104.compareTo(var77.field4104);
                    if (var79 == 0) {
                        class83.field1401[var78].field4100 = var73;
                        class83.field1401[var78].field4097 = var74;
                        class83.field1401[var78].field4102 = var76;
                        class66.field1105 = -1;
                        if (class265.field4212 == var71) {
                            class105.field1752 = var74;
                        }
                        class267.field4266 = class275.field4392;
                        return true;
                    }
                    if (var79 < 0) {
                        break;
                    }
                }
                if (class139.field2119 >= class83.field1401.length) {
                    class66.field1105 = -1;
                    return true;
                }
                for (int var80 = class139.field2119 - 1; var80 > var78; var80--) {
                    class83.field1401[var80 + 1] = class83.field1401[var80];
                }
                if (class139.field2119 == 0) {
                    class83.field1401 = new class256[100];
                }
                class83.field1401[var78 + 1] = var77;
                if (class265.field4212 == var71) {
                    class105.field1752 = var74;
                }
                class139.field2119++;
            }
            class66.field1105 = -1;
            class267.field4266 = class275.field4392;
            return true;
        } else if (class66.field1105 == 213) {
            int var85 = class236.field3814.method682(-23595);
            int var86 = class236.field3814.method627(arg0 + 11324);
            int var87 = class236.field3814.method653(false);
            class240.field3892 = var85 >> 1;
            class283.field4473.method1622(var86, 0, (var85 & 0x1) == 1, var87);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 117) {
            int var88 = class236.field3814.method645(arg0 + 22842);
            int var89 = class236.field3814.method641(arg0 ^ 0x2BED);
            if (class151.method1017(1, var88)) {
                class251 var90 = (class251) class127.field2007.method285((long) var89, arg0 + 25067);
                if (var90 != null) {
                    class177.method1198(var90, (byte) -124, true);
                }
                if (class184.field2847 != null) {
                    class82.method591(class184.field2847, false);
                    class184.field2847 = null;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 222) {
            long var91 = class236.field3814.method625((byte) -22);
            class236.field3814.method656(-252);
            long var93 = class236.field3814.method625((byte) -22);
            boolean var95 = false;
            long var96 = (long) class236.field3814.method645(11596);
            long var98 = (long) class236.field3814.method671(118);
            long var100 = (var96 << 32) + var98;
            int var102 = class236.field3814.method633(54);
            int var103 = 0;
            label1276: while (true) {
                if (var103 >= 100) {
                    if (var102 <= 1) {
                        if ((!class230.field3658 || class115.field1878) && !class179.field2794) {
                            for (int var104 = 0; var104 < class268.field4284; var104++) {
                                if (class106.field1766[var104] == var91) {
                                    var95 = true;
                                    break label1276;
                                }
                            }
                        } else {
                            var95 = true;
                        }
                    }
                    break;
                }
                if (class166.field2596[var103] == var100) {
                    var95 = true;
                    break;
                }
                var103++;
            }
            if (!var95 && class278.field4408 == 0) {
                class166.field2596[class296.field4679] = var100;
                class296.field4679 = (class296.field4679 + 1) % 100;
                String var105 = class242.method1675(class216.method1454(class165.method1113((byte) 87, class236.field3814), 0));
                if (var102 == 2 || var102 == 3) {
                    class170.method1143("<img=1>" + class28.method222(-256, var91), var105, class28.method222(-256, var93), -1, 9);
                } else if (var102 == 1) {
                    class170.method1143("<img=0>" + class28.method222(-256, var91), var105, class28.method222(-256, var93), -1, 9);
                } else {
                    class170.method1143(class28.method222(arg0 ^ 0x2B12, var91), var105, class28.method222(-256, var93), -1, 9);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 150) {
            class161.method1091(15);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 123) {
            int var106 = class236.field3814.method645(arg0 ^ 0xFFFFF95E);
            int var107 = class236.field3814.method679((byte) -120);
            int var108 = class236.field3814.method641(-1);
            int var109 = class236.field3814.method679((byte) 113);
            int var110 = class236.field3814.method677((byte) -100);
            if (class151.method1017(arg0 + 11247, var106)) {
                class38.method275(var110, var107, (byte) -52, var108, var109);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 124) {
            int var111 = class236.field3814.method633(51);
            int var112 = class236.field3814.method679((byte) 125);
            class130.method900(var112, var111, arg0 + 11246);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 74) {
            class53.field806 = class236.field3814.method633(arg0 + 11346);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 247) {
            long var113 = class236.field3814.method625((byte) -22);
            String var115 = class242.method1675(class216.method1454(class165.method1113((byte) 18, class236.field3814), 0));
            class81.method579(-1, class28.method222(arg0 ^ 0x2B12, var113), 6, var115);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 78) {
            class147.field2333 = class236.field3814.method627(56);
            class181.field2830 = class236.field3814.method633(arg0 ^ 0xFFFFD452);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 209) {
            class39.method283(25, true);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 93) {
            int var116 = class236.field3814.method679((byte) 111);
            int var117 = class236.field3814.method679((byte) -106);
            int var118 = class236.field3814.method627(37);
            if (class151.method1017(1, var117)) {
                if (var118 == 2) {
                    class250.method1717(arg0 - 10401);
                }
                class75.field1236 = var116;
                class183.method1243(arg0 + 7460, var116);
                method1981(false, 19992);
                class42.method308(class75.field1236, -1);
                for (int var119 = 0; var119 < 100; var119++) {
                    class25.field335[var119] = true;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 170) {
            int var120 = class236.field3814.method683(26932);
            int var121 = class236.field3814.method679((byte) 114);
            int var122 = class236.field3814.method683(arg0 + 38178);
            int var123 = class236.field3814.method645(arg0 + 22842);
            int var124 = class236.field3814.method670(-2);
            if (var124 == 65535) {
                var124 = -1;
            }
            if (var123 == 65535) {
                var123 = -1;
            }
            if (class151.method1017(1, var121)) {
                for (int var125 = var123; var125 <= var124; var125++) {
                    long var126 = ((long) var122 << 32) + (long) var125;
                    class271 var128 = (class271) class286.field4531.method285(var126, 13821);
                    class271 var129;
                    if (var128 != null) {
                        var129 = new class271(var120, var128.field4354);
                        var128.method1123(0);
                    } else if (var125 == -1) {
                        var129 = new class271(var120, class84.method596((byte) 35, var122).field3494.field4354);
                    } else {
                        var129 = new class271(var120, -1);
                    }
                    class286.field4531.method281(1, var126, var129);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 138) {
            int var130 = class236.field3814.method677((byte) -100);
            int var131 = class236.field3814.method645(11596);
            int var132 = class236.field3814.method679((byte) 118);
            if (class151.method1017(1, var131)) {
                class163.method1105(var132, true, var130);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 232) {
            int var133 = class236.field3814.method649(-2);
            int var134 = class236.field3814.method649(-2);
            int var135 = class236.field3814.method677((byte) -100);
            int var136 = class236.field3814.method647(true);
            if (class151.method1017(1, var135)) {
                class99.method727(var133, var136, -9366, var134);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 106) {
            int var137 = class236.field3814.method645(11596);
            if (var137 == 65535) {
                var137 = -1;
            }
            int var138 = class236.field3814.method677((byte) -100);
            int var139 = class236.field3814.method652(arg0 ^ 0xFFFFD465);
            if (class151.method1017(1, var138)) {
                class206.method1391(-1, arg0 ^ -11242, 2, var137, var139);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 252) {
            class39.method278(arg0 ^ 0xFFFFE9E5);
            class180.field2800 = class236.field3814.method633(80);
            class162.field2539 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 55) {
            class39.method278(15863);
            int var140 = class236.field3814.method653(false);
            int var141 = class236.field3814.method627(101);
            int var142 = class236.field3814.method683(arg0 + 38178);
            class166.field2595[var141] = var142;
            class11.field194[var141] = var140;
            class28.field382[var141] = 1;
            for (int var143 = 0; var143 < 98; var143++) {
                if (class280.field4430[var143] <= var142) {
                    class28.field382[var141] = var143 + 2;
                }
            }
            class245.field3984[class55.method420(31, class11.field209++)] = var141;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 1) {
            int var144 = class236.field3814.method627(arg0 ^ 0xFFFFD47C);
            int var145 = class236.field3814.method645(11596);
            if (class151.method1017(arg0 ^ 0xFFFFD413, var145)) {
                class162.field2546 = var144;
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 241) {
            int var146 = class236.field3814.method683(arg0 + 38178);
            class50.field738 = class179.field2788.method255(var146, true);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 26) {
            int var147 = class236.field3814.method677((byte) -100);
            byte var148 = class236.field3814.method630(arg0 ^ 0xFFFFD4ED);
            class257.method1742((byte) 68, var147, var148);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 99) {
            String var149 = class236.field3814.method675((byte) 16);
            if (var149.endsWith(":tradereq:")) {
                String var150 = var149.substring(0, var149.indexOf(":"));
                long var151 = class148.method1000(var150, 934);
                boolean var153 = false;
                for (int var154 = 0; var154 < class268.field4284; var154++) {
                    if (class106.field1766[var154] == var151) {
                        var153 = true;
                        break;
                    }
                }
                if (!var153 && class278.field4408 == 0) {
                    class81.method579(arg0 + 11245, var150, 4, class56.field924);
                }
            } else if (var149.endsWith(":chalreq:")) {
                String var184 = var149.substring(0, var149.indexOf(":"));
                boolean var185 = false;
                long var186 = class148.method1000(var184, 934);
                for (int var188 = 0; var188 < class268.field4284; var188++) {
                    if (class106.field1766[var188] == var186) {
                        var185 = true;
                        break;
                    }
                }
                if (!var185 && class278.field4408 == 0) {
                    String var189 = var149.substring(var149.indexOf(":") + 1, var149.length() + -9);
                    class81.method579(-1, var184, 8, var189);
                }
            } else if (var149.endsWith(":assistreq:")) {
                boolean var155 = false;
                String var156 = var149.substring(0, var149.indexOf(":"));
                long var157 = class148.method1000(var156, 934);
                for (int var159 = 0; var159 < class268.field4284; var159++) {
                    if (class106.field1766[var159] == var157) {
                        var155 = true;
                        break;
                    }
                }
                if (!var155 && class278.field4408 == 0) {
                    class81.method579(-1, var156, 10, "");
                }
            } else if (var149.endsWith(":clan:")) {
                String var160 = var149.substring(0, var149.indexOf(":clan:"));
                class81.method579(-1, "", 11, var160);
            } else if (var149.endsWith(":trade:")) {
                String var183 = var149.substring(0, var149.indexOf(":trade:"));
                if (class278.field4408 == 0) {
                    class81.method579(-1, "", 12, var183);
                }
            } else if (var149.endsWith(":assist:")) {
                String var161 = var149.substring(0, var149.indexOf(":assist:"));
                if (class278.field4408 == 0) {
                    class81.method579(-1, "", 13, var161);
                }
            } else if (var149.endsWith(":duelstake:")) {
                String var178 = var149.substring(0, var149.indexOf(":"));
                long var179 = class148.method1000(var178, 934);
                boolean var181 = false;
                for (int var182 = 0; var182 < class268.field4284; var182++) {
                    if (class106.field1766[var182] == var179) {
                        var181 = true;
                        break;
                    }
                }
                if (!var181 && class278.field4408 == 0) {
                    class81.method579(-1, var178, 14, "");
                }
            } else if (var149.endsWith(":duelfriend:")) {
                String var162 = var149.substring(0, var149.indexOf(":"));
                long var163 = class148.method1000(var162, 934);
                boolean var165 = false;
                for (int var166 = 0; var166 < class268.field4284; var166++) {
                    if (class106.field1766[var166] == var163) {
                        var165 = true;
                        break;
                    }
                }
                if (!var165 && class278.field4408 == 0) {
                    class81.method579(-1, var162, 15, "");
                }
            } else if (var149.endsWith(":clanreq:")) {
                String var167 = var149.substring(0, var149.indexOf(":"));
                long var168 = class148.method1000(var167, 934);
                boolean var170 = false;
                for (int var171 = 0; var171 < class268.field4284; var171++) {
                    if (class106.field1766[var171] == var168) {
                        var170 = true;
                        break;
                    }
                }
                if (!var170 && class278.field4408 == 0) {
                    class81.method579(arg0 ^ 0x2BED, var167, 16, "");
                }
            } else if (var149.endsWith(":allyreq:")) {
                boolean var172 = false;
                String var173 = var149.substring(0, var149.indexOf(":"));
                long var174 = class148.method1000(var173, 934);
                for (int var176 = 0; var176 < class268.field4284; var176++) {
                    if (class106.field1766[var176] == var174) {
                        var172 = true;
                        break;
                    }
                }
                if (!var172 && class278.field4408 == 0) {
                    String var177 = var149.substring(var149.indexOf(":") + 1, var149.length() + -9);
                    class81.method579(arg0 ^ 0x2BED, var173, 21, var177);
                }
            } else {
                class81.method579(-1, "", 0, var149);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 152) {
            int var190 = class236.field3814.method679((byte) 101);
            int var191 = class236.field3814.method670(-2);
            byte var192 = class236.field3814.method646(17366);
            if (class151.method1017(1, var190)) {
                class52.method389(var191, var192, true);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 21) {
            int var193 = class236.field3814.method645(11596);
            String var194 = class236.field3814.method675((byte) 16);
            Object[] var195 = new Object[var194.length() + 1];
            for (int var196 = var194.length() - 1; var196 >= 0; var196--) {
                if (var194.charAt(var196) == 's') {
                    var195[var196 + 1] = class236.field3814.method675((byte) 16);
                } else {
                    var195[var196 + 1] = Integer.valueOf(class236.field3814.method641(class87.method619(arg0, 11245)));
                }
            }
            var195[0] = Integer.valueOf(class236.field3814.method641(-1));
            if (class151.method1017(1, var193)) {
                class116 var197 = new class116();
                var197.field1895 = var195;
                class44.method322(var197, arg0 + 211246);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 44) {
            int var198 = class236.field3814.method652(111);
            class228 var199 = class84.method596((byte) 35, var198);
            for (int var200 = 0; var200 < var199.field3604.length; var200++) {
                var199.field3604[var200] = -1;
                var199.field3604[var200] = 0;
            }
            class82.method591(var199, false);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 242) {
            class90.method692(arg0 + 22710);
            class39.method278(arg0 + 27109);
            class180.field2819 += 32;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 67) {
            class163.method1106(arg0 ^ 0xFFFFD412);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 24) {
            int var201 = class236.field3814.method677((byte) -100);
            int var202 = class236.field3814.method679((byte) -58);
            int var203 = class236.field3814.method633(112);
            class45 var204 = class255.field4082[var202];
            if (var204 != null) {
                class31.method243(var204, true, var203, var201);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 5) {
            int var205 = class236.field3814.method633(94);
            int var206 = var205 >> 5;
            int var207 = var205 & 0x1F;
            if (var207 == 0) {
                class28.field393[var206] = null;
                class66.field1105 = -1;
                return true;
            }
            class83 var208 = new class83();
            var208.field1397 = var207;
            var208.field1397 = var205 & 0x3F;
            var208.field1404 = class236.field3814.method633(49);
            if (var208.field1404 >= 0 && class167.field2615.length > var208.field1404) {
                if (var208.field1397 == 1 || var208.field1397 == 10) {
                    var208.field1409 = class236.field3814.method645(11596);
                    class236.field3814.field1535 += 5;
                } else if (var208.field1397 >= 2 && var208.field1397 <= 6) {
                    if (var208.field1397 == 2) {
                        var208.field1395 = 64;
                        var208.field1406 = 64;
                    }
                    if (var208.field1397 == 3) {
                        var208.field1395 = 0;
                        var208.field1406 = 64;
                    }
                    if (var208.field1397 == 4) {
                        var208.field1406 = 64;
                        var208.field1395 = 128;
                    }
                    if (var208.field1397 == 5) {
                        var208.field1395 = 64;
                        var208.field1406 = 0;
                    }
                    if (var208.field1397 == 6) {
                        var208.field1395 = 64;
                        var208.field1406 = 128;
                    }
                    var208.field1397 = 2;
                    var208.field1402 = class236.field3814.method645(arg0 + 22842);
                    var208.field1400 = class236.field3814.method645(11596);
                    var208.field1407 = class236.field3814.method633(121);
                    var208.field1403 = class236.field3814.method645(arg0 + 22842);
                }
                var208.field1405 = class236.field3814.method645(11596);
                if (var208.field1405 == 65535) {
                    var208.field1405 = -1;
                }
                class28.field393[var206] = var208;
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 145) {
            class267.field4266 = class275.field4392;
            long var209 = class236.field3814.method625((byte) -22);
            if (var209 == 0L) {
                class139.field2126 = null;
                class139.field2119 = 0;
                class83.field1401 = null;
                class66.field1105 = -1;
                class264.field4192 = null;
                return true;
            }
            long var211 = class236.field3814.method625((byte) -22);
            class139.field2126 = class130.method903(-26704, var211);
            class264.field4192 = class130.method903(-26704, var209);
            class102.field1703 = class236.field3814.method656(-252);
            int var213 = class236.field3814.method633(75);
            if (var213 == 255) {
                class66.field1105 = -1;
                return true;
            }
            class139.field2119 = var213;
            class256[] var214 = new class256[100];
            for (int var215 = 0; var215 < class139.field2119; var215++) {
                var214[var215] = new class256();
                var214[var215].field2603 = class236.field3814.method625((byte) -22);
                var214[var215].field4104 = class130.method903(-26704, var214[var215].field2603);
                var214[var215].field4100 = class236.field3814.method645(11596);
                var214[var215].field4097 = class236.field3814.method656(-252);
                var214[var215].field4102 = class236.field3814.method675((byte) 16);
                if (class265.field4212 == var214[var215].field2603) {
                    class105.field1752 = var214[var215].field4097;
                }
            }
            boolean var216 = false;
            int var217 = class139.field2119;
            while (var217 > 0) {
                var217--;
                boolean var218 = true;
                for (int var219 = 0; var219 < var217; var219++) {
                    if (var214[var219].field4104.compareTo(var214[var219 + 1].field4104) > 0) {
                        var218 = false;
                        class256 var220 = var214[var219];
                        var214[var219] = var214[var219 + 1];
                        var214[var219 + 1] = var220;
                    }
                }
                if (var218) {
                    break;
                }
            }
            class83.field1401 = var214;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 179) {
            int var221 = class236.field3814.method679((byte) -88);
            int var222 = class236.field3814.method670(-2);
            int var223 = class236.field3814.method670(-2);
            int var224 = class236.field3814.method679((byte) 106);
            int var225 = class236.field3814.method652(87);
            if (class151.method1017(1, var223)) {
                class206.method1391(var221, 4, 7, var224 << 16 | var222, var225);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 158) {
            class206.field3209 = class236.field3814.method633(100);
            class15.field235 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 63) {
            String var226 = class236.field3814.method675((byte) 16);
            int var227 = class236.field3814.method679((byte) 119);
            int var228 = class236.field3814.method645(11596);
            if (class151.method1017(1, var227)) {
                class271.method1824(var226, (byte) -88, var228);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 49) {
            int var229 = class236.field3814.method645(11596);
            if (var229 == 65535) {
                var229 = -1;
            }
            int var230 = class236.field3814.method633(110);
            int var231 = class236.field3814.method645(11596);
            int var232 = class236.field3814.method633(74);
            class49.method365((byte) 119, var231, var232, var230, var229);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 65) {
            int var233 = class236.field3814.method645(11596);
            if (class151.method1017(1, var233)) {
                class171.method1149(arg0 + 11246);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 151) {
            int var234 = class236.field3814.method641(-1);
            int var235 = class236.field3814.method679((byte) 114);
            int var236 = class236.field3814.method670(-2);
            if (class151.method1017(1, var235)) {
                class52.method389(var236, var234, true);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 254) {
            int var237 = class236.field3814.method645(11596);
            int var238 = class236.field3814.method633(arg0 + 11357);
            int var239 = class236.field3814.method633(111);
            int var240 = class236.field3814.method633(91);
            int var241 = class236.field3814.method633(arg0 + 11323);
            int var242 = class236.field3814.method645(arg0 ^ 0xFFFFF95E);
            if (class151.method1017(1, var237)) {
                class239.field3885[var238] = true;
                class157.field2447[var238] = var239;
                class281.field4451[var238] = var240;
                class97.field1629[var238] = var241;
                class82.field1388[var238] = var242;
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 111) {
            int var243 = class236.field3814.method679((byte) 118);
            int var244 = class236.field3814.method645(11596);
            int var245 = class236.field3814.method647(true);
            if (class151.method1017(1, var244)) {
                class229.method1528((byte) 104, var245, var243);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 184) {
            int var246 = class236.field3814.method645(11596);
            int var247 = class236.field3814.method633(119);
            int var248 = class236.field3814.method633(82);
            int var249 = class236.field3814.method645(11596);
            int var250 = class236.field3814.method633(81);
            int var251 = class236.field3814.method633(82);
            if (class151.method1017(arg0 + 11247, var246)) {
                class209.method1405(var247, var248, var249, var250, (byte) 75, var251, true);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 58) {
            class147.field2333 = class236.field3814.method627(arg0 ^ 0xFFFFD436);
            class181.field2830 = class236.field3814.method633(93);
            while (class236.field3814.field1535 < class53.field804) {
                class66.field1105 = class236.field3814.method633(126);
                class160.method1081((byte) 31);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 14) {
            class236.field3814.field1535 += 28;
            if (class236.field3814.method622(4)) {
                class141.method953(class236.field3814.field1535 - 28, class236.field3814, (byte) -128);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 148) {
            long var252 = class236.field3814.method625((byte) -22);
            class236.field3814.method656(-252);
            long var254 = class236.field3814.method625((byte) -22);
            long var256 = (long) class236.field3814.method645(11596);
            long var258 = (long) class236.field3814.method671(107);
            int var260 = class236.field3814.method633(108);
            boolean var261 = false;
            long var262 = (var256 << 32) + var258;
            int var264 = class236.field3814.method645(11596);
            int var265 = 0;
            label1431: while (true) {
                if (var265 >= 100) {
                    if (var260 <= 1) {
                        for (int var266 = 0; var266 < class268.field4284; var266++) {
                            if (class106.field1766[var266] == var252) {
                                var261 = true;
                                break label1431;
                            }
                        }
                    }
                    break;
                }
                if (class166.field2596[var265] == var262) {
                    var261 = true;
                    break;
                }
                var265++;
            }
            if (!var261 && class278.field4408 == 0) {
                class166.field2596[class296.field4679] = var262;
                class296.field4679 = (class296.field4679 + 1) % 100;
                String var267 = class71.method512(-121, var264).method1154(-8211, class236.field3814);
                if (var260 == 2 || var260 == 3) {
                    class240.method1646(var267, class28.method222(-256, var254), 20, "<img=1>" + class28.method222(arg0 ^ 0x2B12, var252), var264, (byte) -85);
                } else if (var260 == 1) {
                    class240.method1646(var267, class28.method222(-256, var254), 20, "<img=0>" + class28.method222(arg0 ^ 0x2B12, var252), var264, (byte) -97);
                } else {
                    class240.method1646(var267, class28.method222(-256, var254), 20, class28.method222(-256, var252), var264, (byte) -125);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 237) {
            int var268 = class236.field3814.method683(26932);
            int var269 = class236.field3814.method677((byte) -100);
            class130.method900(var269, var268, 0);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 2) {
            int var270 = class236.field3814.method670(-2);
            if (var270 == 65535) {
                var270 = -1;
            }
            int var271 = class236.field3814.method682(-23595);
            int var272 = var271 >> 2;
            int var273 = class51.field745[var272];
            int var274 = var271 & 0x3;
            int var275 = class236.field3814.method683(26932);
            int var276 = var275 >> 14 & 0x3FFF;
            int var277 = var276 - class46.field656;
            int var278 = var275 & 0x3FFF;
            int var279 = (var275 & 0x32889A56) >> 28;
            int var280 = var278 - class260.field4162;
            class150.method1016(true, var274, var279, var273, var270, var277, var272, var280);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 125) {
            int var281 = class236.field3814.method683(26932);
            int var282 = class236.field3814.method679((byte) 123);
            int var283 = class236.field3814.method647(true);
            if (class151.method1017(arg0 + 11247, var282)) {
                class251 var284 = (class251) class127.field2007.method285((long) var283, 13821);
                class251 var285 = (class251) class127.field2007.method285((long) var281, arg0 ^ 0xFFFFE1EF);
                if (var285 != null) {
                    class177.method1198(var285, (byte) -122, var284 == null || var284.field4041 != var285.field4041);
                }
                if (var284 != null) {
                    var284.method1123(0);
                    class127.field2007.method281(1, (long) var281, var284);
                }
                class228 var286 = class84.method596((byte) 35, var283);
                if (var286 != null) {
                    class82.method591(var286, false);
                }
                class228 var287 = class84.method596((byte) 35, var281);
                if (var287 != null) {
                    class82.method591(var287, false);
                    class258.method1753(var287, -15085, true);
                }
                if (class75.field1236 != -1) {
                    class151.method1018(-69, 1, class75.field1236);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 206) {
            class39.method278(arg0 + 27109);
            class102.field1705 = class236.field3814.method649(-2);
            class162.field2539 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 32) {
            String var288 = class236.field3814.method675((byte) 16);
            int var289 = class236.field3814.method641(-1);
            int var290 = class236.field3814.method679((byte) 117);
            if (class151.method1017(arg0 + 11247, var290)) {
                class277.method1866(var289, false, var288);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 102) {
            class268.field4284 = class53.field804 / 8;
            for (int var291 = 0; var291 < class268.field4284; var291++) {
                class106.field1766[var291] = class236.field3814.method625((byte) -22);
                class212.field3288[var291] = class253.method1728(class106.field1766[var291], (byte) -72);
                class138.field2117[var291] = false;
            }
            class15.field235 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 155) {
            long var292 = class236.field3814.method625((byte) -22);
            int var294 = class236.field3814.method645(arg0 + 22842);
            String var295 = class71.method512(-119, var294).method1154(-8211, class236.field3814);
            class240.method1646(var295, (String) null, 19, class28.method222(-256, var292), var294, (byte) -120);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 223) {
            int var296 = class236.field3814.method645(11596);
            int var297 = class236.field3814.method641(arg0 + 11245);
            int var298 = class236.field3814.method645(11596);
            if (class151.method1017(1, var296)) {
                class139.method937(true, var298, var297);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 156) {
            int var299 = class236.field3814.method683(arg0 + 38178);
            int var300 = class236.field3814.method677((byte) -100);
            class257.method1742((byte) 68, var300, var299);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 140) {
            int var301 = class236.field3814.method652(97);
            int var302 = class236.field3814.method677((byte) -100);
            int var303 = class236.field3814.method677((byte) -100);
            if (var303 == 65535) {
                var303 = -1;
            }
            if (class151.method1017(1, var302)) {
                class206.method1391(-1, arg0 ^ -11242, 1, var303, var301);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 198) {
            int var304 = class236.field3814.method670(-2);
            class294.method1964((byte) -128, var304);
            class108.field1778[class55.method420(31, class34.field511++)] = class55.method420(var304, 32767);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 233) {
            int var305 = class236.field3814.method633(arg0 + 11343);
            if (class236.field3814.method633(116) == 0) {
                class33.field495[var305] = new class148();
            } else {
                class236.field3814.field1535--;
                class33.field495[var305] = new class148(class236.field3814);
            }
            class72.field1183 = class275.field4392;
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 255) {
            class181.field2830 = class236.field3814.method653(false);
            class147.field2333 = class236.field3814.method682(-23595);
            for (int var306 = class181.field2830; var306 < (class181.field2830 + 8); var306++) {
                for (int var308 = class147.field2333; var308 < class147.field2333 + 8; var308++) {
                    if (class222.field3411[class240.field3892][var306][var308] != null) {
                        class222.field3411[class240.field3892][var306][var308] = null;
                        class113.method803(var308, var306, 123);
                    }
                }
            }
            for (class111 var307 = (class111) class187.field2892.method1221(116); var307 != null; var307 = (class111) class187.field2892.method1227(arg0 + 620)) {
                if (class181.field2830 <= var307.field1824 && (class181.field2830 + 8) > var307.field1824 && class147.field2333 <= var307.field1816 && class147.field2333 + 8 > var307.field1816 && class240.field3892 == var307.field1814) {
                    var307.field1825 = 0;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 190) {
            int var309 = class236.field3814.method682(arg0 ^ 0x77C7);
            String var310 = class236.field3814.method675((byte) 16);
            int var311 = class236.field3814.method633(99);
            int var312 = class236.field3814.method677((byte) -100);
            if (var312 == 65535) {
                var312 = -1;
            }
            if (var309 >= 1 && var309 <= 8) {
                if (var310.equalsIgnoreCase("null")) {
                    var310 = null;
                }
                class118.field1913[var309 - 1] = var310;
                class251.field4046[var309 - 1] = var312;
                class6.field130[var309 - 1] = var311 == 0;
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 181) {
            class102.field1711 = class236.field3814.method633(120);
            class204.field3193 = class236.field3814.method633(97);
            class45.field647 = class236.field3814.method633(arg0 ^ 0xFFFFD472);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 50) {
            class66.field1105 = -1;
            class167.field2620 = 0;
            return true;
        } else if (class66.field1105 == 192) {
            int var313 = class236.field3814.method683(arg0 ^ 0xFFFFBD26);
            int var314 = class236.field3814.method627(80);
            int var315 = class236.field3814.method670(-2);
            if (class151.method1017(1, var315)) {
                class142.method956(var314, var313, (byte) 104);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 188) {
            int var316 = class236.field3814.method645(11596);
            if (class151.method1017(1, var316)) {
                class203.method1369(-20406);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 51) {
            class288.method1932(class236.field3814.method675((byte) 16), (byte) 101);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 43) {
            int var317 = class236.field3814.method641(-1);
            int var318 = class236.field3814.method645(11596);
            if (var317 < -70000) {
                var318 += 32768;
            }
            class228 var319;
            if (var317 >= 0) {
                var319 = class84.method596((byte) 35, var317);
            } else {
                var319 = null;
            }
            while (class236.field3814.field1535 < class53.field804) {
                int var320 = class236.field3814.method666(false);
                int var321 = 0;
                int var322 = class236.field3814.method645(11596);
                if (var322 != 0) {
                    var321 = class236.field3814.method633(102);
                    if (var321 == 255) {
                        var321 = class236.field3814.method641(-1);
                    }
                }
                if (var319 != null && var320 >= 0 && var320 < var319.field3604.length) {
                    var319.field3604[var320] = var322;
                    var319.field3488[var320] = var321;
                }
                class160.method1083(var320, var322 - 1, var318, var321, arg0 + 11245);
            }
            if (var319 != null) {
                class82.method591(var319, false);
            }
            class39.method278(15863);
            class108.field1778[class55.method420(class34.field511++, 31)] = class55.method420(32767, var318);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 18) {
            int var323 = class236.field3814.method670(-2);
            int var324 = class236.field3814.method645(arg0 ^ 0xFFFFF95E);
            int var325 = class236.field3814.method679((byte) 121);
            int var326 = class236.field3814.method683(arg0 ^ 0xFFFFBD26);
            if (class151.method1017(arg0 + 11247, var323)) {
                class232.method1556((var324 << 16) + var325, (byte) 119, var326);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 10) {
            int var327 = class236.field3814.method627(arg0 + 11369);
            int var328 = class236.field3814.method670(-2);
            int var329 = class236.field3814.method670(arg0 + 11244);
            int var330 = class236.field3814.method641(-1);
            if (class151.method1017(1, var329)) {
                class251 var331 = (class251) class127.field2007.method285((long) var330, arg0 ^ 0xFFFFE1EF);
                if (var331 != null) {
                    class177.method1198(var331, (byte) -95, var331.field4041 != var328);
                }
                class66.method485(var328, -1, var330, var327);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 226) {
            int var332 = class236.field3814.method683(26932);
            int var333 = class236.field3814.method670(arg0 + 11244);
            if (class151.method1017(arg0 + 11247, var333)) {
                int var334 = 0;
                if (class283.field4473.field3800 != null) {
                    var334 = class283.field4473.field3800.method357(65535);
                }
                class206.method1391(-1, 4, 3, var334, var332);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 112) {
            int var335 = class236.field3814.method670(-2);
            if (var335 == 65535) {
                var335 = -1;
            }
            int var336 = class236.field3814.method670(-2);
            int var337 = class236.field3814.method679((byte) -113);
            int var338 = class236.field3814.method670(arg0 + 11244);
            if (var338 == 65535) {
                var338 = -1;
            }
            int var339 = class236.field3814.method652(104);
            if (class151.method1017(1, var336)) {
                for (int var340 = var338; var340 <= var335; var340++) {
                    long var341 = ((long) var339 << 32) + (long) var340;
                    class271 var343 = (class271) class286.field4531.method285(var341, arg0 + 25067);
                    class271 var344;
                    if (var343 != null) {
                        var344 = new class271(var343.field4362, var337);
                        var343.method1123(0);
                    } else if (var340 == -1) {
                        var344 = new class271(class84.method596((byte) 35, var339).field3494.field4362, var337);
                    } else {
                        var344 = new class271(0, var337);
                    }
                    class286.field4531.method281(1, var341, var344);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 82) {
            for (int var345 = 0; var345 < class31.field462.length; var345++) {
                if (class31.field462[var345] != class240.field3910[var345]) {
                    class31.field462[var345] = class240.field3910[var345];
                    class295.method1972(30734, var345);
                    class52.field797[class55.method420(class180.field2819++, 31)] = var345;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 62) {
            int var346 = class236.field3814.method677((byte) -100);
            if (var346 == 65535) {
                var346 = -1;
            }
            int var347 = class236.field3814.method679((byte) 113);
            int var348 = class236.field3814.method652(106);
            int var349 = class236.field3814.method641(arg0 + 11245);
            if (class151.method1017(arg0 ^ 0xFFFFD413, var347)) {
                class228 var350 = class84.method596((byte) 35, var348);
                if (var350.field3520) {
                    class158.method1067(var346, var349, -5, var348);
                    class72 var352 = class85.method602(false, var346);
                    class38.method275(var352.field1165, var352.field1206, (byte) -89, var348, var352.field1153);
                    class19.method184(var352.field1204, var352.field1210, 11211, var348, var352.field1174);
                } else if (var346 == -1) {
                    class66.field1105 = -1;
                    var350.field3515 = 0;
                    return true;
                } else {
                    class72 var351 = class85.method602(false, var346);
                    var350.field3618 = var351.field1165;
                    var350.field3500 = var351.field1153 * 100 / var349;
                    var350.field3496 = var346;
                    var350.field3614 = var351.field1206;
                    var350.field3515 = 4;
                    class82.method591(var350, false);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 96 || class66.field1105 == 92 || class66.field1105 == 121 || class66.field1105 == 88 || class66.field1105 == 52 || class66.field1105 == 20 || class66.field1105 == 215 || class66.field1105 == 227 || class66.field1105 == 104 || class66.field1105 == 250 || class66.field1105 == 177 || class66.field1105 == 214 || class66.field1105 == 176 || class66.field1105 == 239) {
            class160.method1081((byte) 90);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 185) {
            long var353 = class236.field3814.method625((byte) -22);
            long var355 = (long) class236.field3814.method645(11596);
            long var357 = (long) class236.field3814.method671(120);
            int var359 = class236.field3814.method633(67);
            int var360 = class236.field3814.method645(11596);
            boolean var361 = false;
            long var362 = (var355 << 32) + var357;
            int var364 = 0;
            label1492: while (true) {
                if (var364 >= 100) {
                    if (var359 <= 1) {
                        for (int var365 = 0; var365 < class268.field4284; var365++) {
                            if (class106.field1766[var365] == var353) {
                                var361 = true;
                                break label1492;
                            }
                        }
                    }
                    break;
                }
                if (class166.field2596[var364] == var362) {
                    var361 = true;
                    break;
                }
                var364++;
            }
            if (!var361 && class278.field4408 == 0) {
                class166.field2596[class296.field4679] = var362;
                class296.field4679 = (class296.field4679 + 1) % 100;
                String var366 = class71.method512(-120, var360).method1154(arg0 + 3035, class236.field3814);
                if (var359 == 2) {
                    class240.method1646(var366, (String) null, 18, "<img=1>" + class28.method222(-256, var353), var360, (byte) -92);
                } else if (var359 == 1) {
                    class240.method1646(var366, (String) null, 18, "<img=0>" + class28.method222(-256, var353), var360, (byte) -115);
                } else {
                    class240.method1646(var366, (String) null, 18, class28.method222(-256, var353), var360, (byte) -113);
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 15) {
            int var367 = class236.field3814.method679((byte) -124);
            String var368 = class236.field3814.method675((byte) 16);
            int var369 = class236.field3814.method645(11596);
            if (class151.method1017(1, var367)) {
                class271.method1824(var368, (byte) -88, var369);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 23) {
            for (int var370 = 0; var370 < class210.field3267.length; var370++) {
                if (class210.field3267[var370] != null) {
                    class210.field3267[var370].field2214 = -1;
                }
            }
            for (int var371 = 0; var371 < class255.field4082.length; var371++) {
                if (class255.field4082[var371] != null) {
                    class255.field4082[var371].field2214 = -1;
                }
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 243) {
            int var372 = class236.field3814.method641(-1);
            int var373 = class236.field3814.method645(11596);
            class228 var374;
            if (var372 < 0) {
                var374 = null;
            } else {
                var374 = class84.method596((byte) 35, var372);
            }
            if (var372 < -70000) {
                var373 += 32768;
            }
            if (var374 != null) {
                for (int var375 = 0; var375 < var374.field3604.length; var375++) {
                    var374.field3604[var375] = 0;
                    var374.field3488[var375] = 0;
                }
            }
            class84.method593(var373, arg0 ^ 0xFFFFD412);
            int var376 = class236.field3814.method645(arg0 + 22842);
            for (int var377 = 0; var377 < var376; var377++) {
                int var378 = class236.field3814.method645(arg0 ^ 0xFFFFF95E);
                int var379 = class236.field3814.method682(-23595);
                if (var379 == 255) {
                    var379 = class236.field3814.method647(true);
                }
                if (var374 != null && var377 < var374.field3604.length) {
                    var374.field3604[var377] = var378;
                    var374.field3488[var377] = var379;
                }
                class160.method1083(var377, var378 - 1, var373, var379, -1);
            }
            if (var374 != null) {
                class82.method591(var374, false);
            }
            class39.method278(15863);
            class108.field1778[class55.method420(31, class34.field511++)] = class55.method420(32767, var373);
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 97) {
            if (class75.field1236 != -1) {
                class151.method1018(arg0 ^ 0x2B95, 0, class75.field1236);
            }
            class66.field1105 = -1;
            return true;
        } else if (class66.field1105 == 144) {
            long var380 = class236.field3814.method625((byte) -22);
            long var382 = (long) class236.field3814.method645(11596);
            long var384 = (long) class236.field3814.method671(107);
            int var386 = class236.field3814.method633(arg0 + 11362);
            boolean var387 = false;
            long var388 = (var382 << 32) + var384;
            int var390 = 0;
            label1537: while (true) {
                if (var390 >= 100) {
                    if (var386 <= 1) {
                        if ((!class230.field3658 || class115.field1878) && !class179.field2794) {
                            for (int var391 = 0; var391 < class268.field4284; var391++) {
                                if (class106.field1766[var391] == var380) {
                                    var387 = true;
                                    break label1537;
                                }
                            }
                        } else {
                            var387 = true;
                        }
                    }
                    break;
                }
                if (class166.field2596[var390] == var388) {
                    var387 = true;
                    break;
                }
                var390++;
            }
            if (!var387 && class278.field4408 == 0) {
                class166.field2596[class296.field4679] = var388;
                class296.field4679 = (class296.field4679 + 1) % 100;
                String var392 = class242.method1675(class216.method1454(class165.method1113((byte) -90, class236.field3814), arg0 + 11246));
                if (var386 == 2 || var386 == 3) {
                    class81.method579(-1, "<img=1>" + class28.method222(-256, var380), 7, var392);
                } else if (var386 == 1) {
                    class81.method579(-1, "<img=0>" + class28.method222(arg0 + 10990, var380), 7, var392);
                } else {
                    class81.method579(-1, class28.method222(-256, var380), 3, var392);
                }
            }
            class66.field1105 = -1;
            return true;
        } else {
            class168.method1130("T1 - " + class66.field1105 + "," + class52.field761 + "," + class256.field4091 + " - " + class53.field804, (Throwable) null, -120);
            if (arg0 == -11246) {
                class26.method212((byte) 76);
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)Ljava/lang/String;")
    public static final String method1984(int arg0) {
        field4691++;
        String var1 = "www";
        if (class212.field3292 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (arg0 <= 76) {
            return null;
        } else {
            if (class84.field1416 != null) {
                var2 = "/p=" + class84.field1416;
            }
            return "http://" + var1 + ".runescape.com/l=" + class177.field2770 + "/a=" + class232.field3696 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1985(int arg0) {
        if (arg0 != 0) {
            method1981(true, -30);
        }
        field4697 = null;
    }
}

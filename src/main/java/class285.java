import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class285 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field4359 = -1;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field4363 = -1;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Leg;")
    public static class188 field4365 = new class188(20);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4369 = "glow2:";

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field4372 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field4375 = -2;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4373 = "Loaded title screen";

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Leg;")
    public static class188 field4377 = new class188(50);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "F")
    public static float field4368;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "J")
    public static long field4370;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lwf;")
    public static class306 field4374;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public int[] field4364;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BB)V", line = 8)
    public static final void method1861(byte arg0, byte arg1) {
        if (class97.field1512 == null) {
            class97.field1512 = new byte[4][104][104];
        }
        field4366++;
        if (arg1 != 99) {
            field4371 = -71;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class97.field1512[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 49)
    public static final String method1862(int arg0, byte arg1) {
        field4362++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 >= 10000000) {
            if (arg1 != -43) {
                method1867((String) null, -23);
            }
            return "<col=00ff80>" + arg0 / 1000000 + class93.field1436 + "</col>";
        } else {
            return "<col=ffffff>" + arg0 / 1000 + class294.field4542 + "</col>";
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 70)
    public static void method1863(int arg0) {
        if (arg0 != 1000000) {
            field4368 = 0.3568346F;
        }
        field4377 = null;
        field4374 = null;
        field4365 = null;
        field4373 = null;
        field4369 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILgn;)V", line = 85)
    private final void method1864(int arg0, int arg1, int arg2, class303 arg3) {
        if (arg1 < 24) {
            method1863(-48);
        }
        field4367++;
        if (arg0 == 1) {
            this.field4363 = arg3.method1994(false);
        } else if (arg0 == 2) {
            this.field4364 = new int[arg3.method2043((byte) -111)];
            for (int var5 = 0; var5 < this.field4364.length; var5++) {
                this.field4364[var5] = arg3.method1994(false);
            }
        } else if (arg0 == 3) {
            this.field4359 = arg3.method2043((byte) -105);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 124)
    public static final void method1865(int arg0) {
        field4376++;
        if (arg0 != 4) {
            return;
        }
        if (class93.field1441 == 34) {
            int var1 = class230.field3713.method2043((byte) -116);
            int var2 = (var1 & 0x7) + class329.field5087;
            int var3 = (var1 >> 4 & 0x7) + class200.field3025;
            int var4 = class230.field3713.method1994(false);
            int var5 = class230.field3713.method1994(false);
            int var6 = class230.field3713.method1994(false);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                class2 var7 = class274.field4221[class77.field1154][var3][var2];
                if (var7 != null) {
                    for (class286 var8 = (class286) var7.method10((byte) 103); var8 != null; var8 = (class286) var7.method13((byte) -32)) {
                        class13 var9 = var8.field4378;
                        if ((var4 & 0x7FFF) == var9.field141 && var9.field138 == var5) {
                            var9.field138 = var6;
                            break;
                        }
                    }
                    class310.method2134(var2, var3, 4);
                }
            }
        } else if (class93.field1441 == 109) {
            int var123 = class230.field3713.method2043((byte) -107);
            int var124 = (var123 >> 4 & 0xF) + class200.field3025 * 2;
            int var125 = (var123 & 0xF) + class329.field5087 * 2;
            int var126 = class230.field3713.method2001(-3) + var124;
            int var127 = class230.field3713.method2001(-3) + var125;
            int var128 = class230.field3713.method2042(7);
            int var129 = class230.field3713.method2042(7);
            int var130 = class230.field3713.method1994(false);
            int var131 = class230.field3713.method2001(-3);
            int var132 = class230.field3713.method2043((byte) -116) * 4;
            int var133 = class230.field3713.method1994(false);
            int var134 = class230.field3713.method1994(false);
            int var135 = class230.field3713.method2043((byte) -127);
            int var136 = class230.field3713.method2043((byte) -128);
            if (var135 == 255) {
                var135 = -1;
            }
            if (var124 >= 0 && var125 >= 0 && var124 < 208 && var125 < 208 && var126 >= 0 && var127 >= 0 && var126 < 208 && var127 < 208 && var130 != 65535) {
                int var137 = var127 * 64;
                int var138 = var124 * 64;
                int var139 = var125 * 64;
                int var140 = var126 * 64;
                if (var128 != 0) {
                    int var142;
                    class38 var144;
                    if (var128 >= 0) {
                        int var141 = var128 - 1;
                        var142 = (var141 & 0x7FC1) >> 11;
                        int var143 = var141 & 0x7FF;
                        var144 = class208.field3313[var143];
                    } else {
                        int var145 = -var128 - 1;
                        var142 = var145 >> 11 & 0xF;
                        int var146 = var145 & 0x7FF;
                        if (class124.field1944 == var146) {
                            var144 = class79.field1173;
                        } else {
                            var144 = class64.field966[var146];
                        }
                    }
                    if (var144 != null) {
                        class309 var147 = var144.method280(-94);
                        if (var147.field4891 != null && var147.field4891[var142] != null) {
                            var131 -= var147.field4891[var142][1];
                            int var148 = var147.field4891[var142][0];
                            int var149 = var147.field4891[var142][2];
                            int var150 = class12.field121[var144.field564];
                            int var151 = class12.field127[var144.field564];
                            int var152 = var148 * var151 + var149 * var150 >> 16;
                            int var153 = var149 * var151 - (var148 * var150) >> 16;
                            var139 += var153;
                            var138 += var152;
                        }
                    }
                }
                class122 var155 = new class122(var130, class77.field1154, var138, var139, class39.method286(class77.field1154, (byte) 82, var138, var139) - var131, class343.field5341 + var133, class343.field5341 + var134, var135, var136, var129, var132);
                var155.method829(class343.field5341 + var133, class39.method286(class77.field1154, (byte) 82, var140, var137) - var132, var140, -17567, var137);
                class39.field568.method7((byte) -51, new class106(var155));
            }
        } else if (class93.field1441 == 53) {
            int var10 = class230.field3713.method2038((byte) -56);
            int var11 = var10 >> 2;
            int var12 = class315.field4958[var11];
            int var13 = class230.field3713.method2016(2);
            int var14 = class230.field3713.method2038((byte) -127);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var15 = var10 & 0x3;
            int var16 = (var14 & 0x7) + class329.field5087;
            int var17 = ((var14 & 0x71) >> 4) + class200.field3025;
            class303.method2052(var15, var16, class77.field1154, var12, var13, arg0 ^ 0xFFFFFF87, var11, var17);
        } else if (class93.field1441 == 82) {
            int var18 = class230.field3713.method2053(arg0 ^ 0xFFFFAD93);
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = class315.field4958[var19];
            int var22 = class230.field3713.method2002(106);
            int var23 = (var22 & 0x7) + class329.field5087;
            int var24 = ((var22 & 0x75) >> 4) + class200.field3025;
            if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                class136.method930(var24, class77.field1154, var19, (byte) 87, var20, -1, -1, 0, var23, var21);
            }
        } else if (class93.field1441 == 24) {
            int var116 = class230.field3713.method2043((byte) -116);
            int var117 = ((var116 & 0x7C) >> 4) + class200.field3025;
            int var118 = (var116 & 0x7) + class329.field5087;
            int var119 = class230.field3713.method1992(true);
            int var120 = class230.field3713.method2016(2);
            int var121 = class230.field3713.method2016(2);
            if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && class124.field1944 != var121) {
                class13 var122 = new class13();
                var122.field141 = var119;
                var122.field138 = var120;
                if (class274.field4221[class77.field1154][var117][var118] == null) {
                    class274.field4221[class77.field1154][var117][var118] = new class2();
                }
                class274.field4221[class77.field1154][var117][var118].method7((byte) -51, new class286(var122));
                class310.method2134(var118, var117, 4);
            }
        } else if (class93.field1441 == 171) {
            int var107 = class230.field3713.method2043((byte) -105);
            int var108 = ((var107 & 0x7E) >> 4) + class200.field3025;
            int var109 = (var107 & 0x7) + class329.field5087;
            int var110 = class230.field3713.method1994(false);
            int var111 = class230.field3713.method2043((byte) -108);
            int var112 = class230.field3713.method1994(false);
            if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                int var113 = var109 * 128 + 64;
                int var114 = var108 * 128 + 64;
                class339 var115 = new class339(var110, class77.field1154, var114, var113, class39.method286(class77.field1154, (byte) 82, var114, var113) - var111, var112, class343.field5341);
                class18.field252.method7((byte) -51, new class185(var115));
            }
        } else if (class93.field1441 == 7) {
            int var25 = class230.field3713.method2043((byte) -112);
            int var26 = class200.field3025 + ((var25 & 0x7D) >> 4);
            int var27 = (var25 & 0x7) + class329.field5087;
            int var28 = var26 + class230.field3713.method2001(-3);
            int var29 = class230.field3713.method2001(-3) + var27;
            int var30 = class230.field3713.method2042(arg0 + 3);
            int var31 = class230.field3713.method1994(false);
            int var32 = class230.field3713.method2043((byte) -114) * 4;
            int var33 = class230.field3713.method2043((byte) -120) * 4;
            int var34 = class230.field3713.method1994(false);
            int var35 = class230.field3713.method1994(false);
            int var36 = class230.field3713.method2043((byte) -106);
            if (var36 == 255) {
                var36 = -1;
            }
            int var37 = class230.field3713.method2043((byte) -109);
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var31 != 65535) {
                int var38 = var29 * 128 + 64;
                int var39 = var28 * 128 + 64;
                int var40 = var26 * 128 + 64;
                int var41 = var27 * 128 + 64;
                class122 var42 = new class122(var31, class77.field1154, var40, var41, class39.method286(class77.field1154, (byte) 82, var40, var41) - var32, class343.field5341 + var34, class343.field5341 + var35, var36, var37, var30, var33);
                var42.method829(class343.field5341 + var34, class39.method286(class77.field1154, (byte) 82, var39, var38) - var33, var39, -17567, var38);
                class39.field568.method7((byte) -51, new class106(var42));
            }
        } else if (class93.field1441 == 57) {
            int var89 = class230.field3713.method2043((byte) -114);
            int var90 = (var89 >> 4 & 0xF) + class200.field3025 * 2;
            int var91 = (var89 & 0xF) + class329.field5087 * 2;
            int var92 = class230.field3713.method2001(-3) + var90;
            int var93 = class230.field3713.method2001(arg0 ^ 0xFFFFFFF9) + var91;
            int var94 = class230.field3713.method2042(7);
            int var95 = class230.field3713.method1994(false);
            int var96 = class230.field3713.method2043((byte) -116) * 4;
            int var97 = class230.field3713.method2043((byte) -120) * 4;
            int var98 = class230.field3713.method1994(false);
            int var99 = class230.field3713.method1994(false);
            int var100 = class230.field3713.method2043((byte) -113);
            if (var100 == 255) {
                var100 = -1;
            }
            int var101 = class230.field3713.method2043((byte) -127);
            if (var90 >= 0 && var91 >= 0 && var90 < 208 && var91 < 208 && var92 >= 0 && var93 >= 0 && var92 < 208 && var93 < 208 && var95 != 65535) {
                int var102 = var93 * 64;
                int var103 = var91 * 64;
                int var104 = var90 * 64;
                class122 var105 = new class122(var95, class77.field1154, var104, var103, class39.method286(class77.field1154, (byte) 82, var104, var103) - var96, var98 - -class343.field5341, var99 + class343.field5341, var100, var101, var94, var97);
                int var106 = var92 * 64;
                var105.method829(class343.field5341 + var98, -var97 + class39.method286(class77.field1154, (byte) 82, var106, var102), var106, -17567, var102);
                class39.field568.method7((byte) -51, new class106(var105));
            }
        } else if (class93.field1441 == 193) {
            int var43 = class230.field3713.method2030((byte) -70);
            int var44 = class230.field3713.method2038((byte) -88);
            int var45 = (var44 & 0x7) + class329.field5087;
            int var46 = ((var44 & 0x79) >> 4) + class200.field3025;
            if (var46 >= 0 && var45 >= 0 && var46 < 104 && var45 < 104) {
                class2 var47 = class274.field4221[class77.field1154][var46][var45];
                if (var47 != null) {
                    for (class286 var48 = (class286) var47.method10((byte) 89); var48 != null; var48 = (class286) var47.method13((byte) -32)) {
                        if ((var43 & 0x7FFF) == var48.field4378.field141) {
                            var48.method1284(0);
                            break;
                        }
                    }
                    if (var47.method10((byte) 61) == null) {
                        class274.field4221[class77.field1154][var46][var45] = null;
                    }
                    class310.method2134(var45, var46, 4);
                }
            }
        } else {
            if (class93.field1441 == 29) {
                int var49 = class230.field3713.method1994(false);
                byte var50 = class230.field3713.method2005((byte) 92);
                int var51 = class230.field3713.method2043((byte) -114);
                int var52 = var51 & 0x3;
                int var53 = var51 >> 2;
                int var54 = class230.field3713.method1992(true);
                int var55 = class230.field3713.method2053(-21097);
                int var56 = (var55 >> 4 & 0x7) + class200.field3025;
                int var57 = (var55 & 0x7) + class329.field5087;
                byte var58 = class230.field3713.method1998(arg0 + 2188);
                byte var59 = class230.field3713.method2051((byte) -43);
                byte var60 = class230.field3713.method1998(2192);
                int var61 = class230.field3713.method1992(true);
                int var62 = class230.field3713.method2015(arg0 - 132);
                if (!class333.field5166) {
                    class24.method184(var59, var49, var56, -79, var53, var58, var50, var52, var54, var57, var62, var61, var60);
                }
            }
            if (class93.field1441 == 183) {
                int var79 = class230.field3713.method2043((byte) -117);
                int var80 = (var79 >> 4 & 0x7) + class200.field3025;
                int var81 = (var79 & 0x7) + class329.field5087;
                int var82 = class230.field3713.method1994(false);
                int var83 = class230.field3713.method2043((byte) -109);
                int var84 = var83 >> 4 & 0xF;
                int var85 = var83 & 0x7;
                int var86 = class230.field3713.method2043((byte) -118);
                if (var82 == 65535) {
                    var82 = -1;
                }
                int var87 = class230.field3713.method2043((byte) -105);
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    int var88 = var84 + 1;
                    if (class79.field1173.field476[0] >= var80 - var88 && class79.field1173.field476[0] <= (var80 + var88) && var81 - var88 <= class79.field1173.field505[0] && class79.field1173.field505[0] <= (var81 + var88) && class274.field4219 != 0 && var85 > 0 && class271.field4162 < 50 && var82 != -1) {
                        class207.field3223[class271.field4162] = var82;
                        class228.field3652[class271.field4162] = var85;
                        class44.field631[class271.field4162] = var86;
                        class222.field3536[class271.field4162] = null;
                        class29.field359[class271.field4162] = (var80 << 16) + (var81 << 8) + var84;
                        class315.field4966[class271.field4162] = var87;
                        class271.field4162++;
                    }
                }
            } else if (class93.field1441 == 151) {
                int var73 = class230.field3713.method2030((byte) -70);
                int var74 = class230.field3713.method2053(arg0 ^ 0xFFFFAD93);
                int var75 = ((var74 & 0x77) >> 4) + class200.field3025;
                int var76 = class329.field5087 + (var74 & 0x7);
                int var77 = class230.field3713.method1994(false);
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    class13 var78 = new class13();
                    var78.field141 = var73;
                    var78.field138 = var77;
                    if (class274.field4221[class77.field1154][var75][var76] == null) {
                        class274.field4221[class77.field1154][var75][var76] = new class2();
                    }
                    class274.field4221[class77.field1154][var75][var76].method7((byte) -51, new class286(var78));
                    class310.method2134(var76, var75, 4);
                }
            } else if (class93.field1441 == 176) {
                int var71 = class230.field3713.method1994(false);
                int var72 = class230.field3713.method2043((byte) -110);
                class277.method1819((byte) 126, var71).method132(arg0 ^ 0xFFFF8BBA, var72);
            } else if (class93.field1441 == 99) {
                int var63 = class230.field3713.method2043((byte) -110);
                int var64 = class329.field5087 + (var63 & 0x7);
                int var65 = ((var63 & 0x7C) >> 4) + class200.field3025;
                int var66 = class230.field3713.method2053(arg0 - 21101);
                int var67 = var66 >> 2;
                int var68 = var66 & 0x3;
                int var69 = class315.field4958[var67];
                int var70 = class230.field3713.method2030((byte) -70);
                if (var65 >= 0 && var64 >= 0 && var65 < 104 && var64 < 104) {
                    class136.method930(var65, class77.field1154, var67, (byte) -102, var68, var70, -1, 0, var64, var69);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lgn;IB)V", line = 725)
    public final void method1866(class303 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method2043((byte) -114);
            if (var4 == 0) {
                int var5 = 90 / ((arg2 + 1) / 42);
                field4360++;
                return;
            }
            this.method1864(var4, 99, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 776)
    public static final String method1867(String arg0, int arg1) {
        field4361++;
        String var2 = class97.method665(50, class108.method723(arg0, -25));
        if (arg1 == 0) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return (String) null;
        }
    }
}

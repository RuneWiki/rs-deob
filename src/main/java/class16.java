import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class16 extends class154 {

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Loh;")
    public class258 field211;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
    public static int[] field210 = new int[2];

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Loh;")
    private static class258 field208 = class153.method1046("Choose Option", 122);

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Loh;")
    private static class258 field209 = class153.method1046("Loading wordpack )2 ", 119);

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Loh;")
    public static class258 field206 = class153.method1046("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 104);

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Loh;")
    public static class258 field212 = class153.method1046("www", 115);

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Loh;")
    public static class258 field202 = field209;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Loh;")
    public static class258 field204 = field208;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "[Lok;")
    public static class107[] field214 = new class107[32768];

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Z")
    public static boolean field213 = false;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V", line = 7)
    public static final void method106(boolean arg0, byte arg1) {
        class108.field1918 = arg0;
        field207++;
        int var2 = -115 / ((arg1 - 68) / 42);
        class37.field483 = !class110.method807(720049666);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 26)
    public static void method107(int arg0) {
        field206 = null;
        field209 = null;
        field208 = null;
        field210 = null;
        field204 = null;
        field212 = null;
        field202 = null;
        if (arg0 == 1958) {
            field214 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V", line = 56)
    public static final void method108(byte arg0) {
        int var1 = 111 / ((5 - arg0) / 53);
        field203++;
        if (class48.field725 == 86) {
            int var2 = class293.field5036.method1589(119);
            int var3 = (var2 >> 4 & 0x7) + class88.field1497;
            int var4 = class75.field1301 + (var2 & 0x7);
            int var5 = class293.field5036.method1615(-119);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class293.field5036.method1589(119);
            int var7 = (var6 & 0xF2) >> 4;
            int var8 = var6 & 0x7;
            int var9 = class293.field5036.method1589(82);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                int var10 = var7 + 1;
                if (class152.field2606.field975[0] >= (var3 - var10) && (var3 + var10) >= class152.field2606.field975[0] && class152.field2606.field959[0] >= (var4 - var10) && (var4 + var10) >= class152.field2606.field959[0] && class317.field5345 != 0 && var8 > 0 && class299.field5118 < 50 && var5 != -1) {
                    class147.field2492[class299.field5118] = var5;
                    class182.field3263[class299.field5118] = var8;
                    class307.field5212[class299.field5118] = var9;
                    class191.field3372[class299.field5118] = null;
                    class114.field1964[class299.field5118] = (var3 << 16) + (var4 << 8) + var7;
                    class299.field5118++;
                }
            }
        } else if (class48.field725 == 166) {
            int var11 = class293.field5036.method1621((byte) -106);
            int var12 = ((var11 & 0x71) >> 4) + class88.field1497;
            int var13 = (var11 & 0x7) + class75.field1301;
            int var14 = class293.field5036.method1589(60);
            int var15 = var14 & 0x3;
            int var16 = var14 >> 2;
            int var17 = class124.field2210[var16];
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class217.method1470(var13, var12, class272.field4704, -1, 0, var17, var15, -1, var16, (byte) -72);
            }
        } else if (class48.field725 == 107) {
            int var132 = class293.field5036.method1575(255);
            int var133 = (var132 >> 4 & 0x7) + class88.field1497;
            int var134 = class75.field1301 + (var132 & 0x7);
            int var135 = class293.field5036.method1599(255);
            if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                class12 var136 = class82.field1386[class272.field4704][var133][var134];
                if (var136 != null) {
                    for (class232 var137 = (class232) var136.method83(-56); var137 != null; var137 = (class232) var136.method87((byte) -80)) {
                        if ((var135 & 0x7FFF) == var137.field4024.field663) {
                            var137.method1054((byte) 97);
                            break;
                        }
                    }
                    if (var136.method83(-51) == null) {
                        class82.field1386[class272.field4704][var133][var134] = null;
                    }
                    class259.method1827(var133, (byte) 47, var134);
                }
            }
        } else if (class48.field725 == 57) {
            int var125 = class293.field5036.method1615(-123);
            int var126 = class293.field5036.method1615(-37);
            int var127 = class293.field5036.method1575(255);
            int var128 = ((var127 & 0x76) >> 4) + class88.field1497;
            int var129 = class75.field1301 + (var127 & 0x7);
            int var130 = class293.field5036.method1614(255);
            if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104 && class47.field698 != var125) {
                class44 var131 = new class44();
                var131.field663 = var126;
                var131.field660 = var130;
                if (class82.field1386[class272.field4704][var128][var129] == null) {
                    class82.field1386[class272.field4704][var128][var129] = new class12();
                }
                class82.field1386[class272.field4704][var128][var129].method82(new class232(var131), (byte) -39);
                class259.method1827(var128, (byte) 117, var129);
            }
        } else {
            if (class48.field725 == 97) {
                int var18 = class293.field5036.method1615(-120);
                int var19 = class293.field5036.method1599(255);
                int var20 = class293.field5036.method1621((byte) -106);
                int var21 = (var20 >> 4 & 0x7) + class88.field1497;
                int var22 = class75.field1301 + (var20 & 0x7);
                int var23 = class293.field5036.method1614(255);
                byte var24 = class293.field5036.method1594(false);
                byte var25 = class293.field5036.method1610((byte) -89);
                byte var26 = class293.field5036.method1594(false);
                int var27 = class293.field5036.method1614(255);
                byte var28 = class293.field5036.method1610((byte) -106);
                int var29 = class293.field5036.method1575(255);
                int var30 = var29 >> 2;
                int var31 = class124.field2210[var30];
                int var32 = var29 & 0x3;
                class231 var33;
                if (class47.field698 == var27) {
                    var33 = class152.field2606;
                } else {
                    var33 = class38.field527[var27];
                }
                if (!class257.field4390 && var33 != null) {
                    class101 var34 = class123.method898(-935, var18);
                    int var35;
                    int var36;
                    if (var32 == 1 || var32 == 3) {
                        var35 = var34.field1839;
                        var36 = var34.field1790;
                    } else {
                        var35 = var34.field1790;
                        var36 = var34.field1839;
                    }
                    int var37 = var21 + (var35 >> 1);
                    int var38 = var22 + (var36 >> 1);
                    int var39 = (var35 + 1 >> 1) + var21;
                    int var40 = (var36 + 1 >> 1) + var22;
                    int[][] var41 = class201.field3482[class272.field4704];
                    int var42 = (var22 << 7) + (var36 << 6);
                    int var43 = (var21 << 7) + (var35 << 6);
                    int var44 = var41[var37][var38] + var41[var37][var40] + var41[var39][var40] + var41[var39][var38] >> 2;
                    int[][] var45 = (int[][]) null;
                    if (class272.field4704 < 3) {
                        var45 = class201.field3482[class272.field4704 + 1];
                    }
                    class294 var46 = var34.method756(var34.field1840, var41, var32, var45, true, false, var42, (class129) null, var44, var30, var43);
                    if (var46 != null) {
                        if (var28 < var26) {
                            byte var47 = var26;
                            var26 = var28;
                            var28 = var47;
                        }
                        class217.method1470(var22, var21, class272.field4704, var19 + 1, var23 + 1, var31, 0, -1, 0, (byte) -72);
                        var33.field4004 = class202.field3498 + var23;
                        var33.field3977 = var44;
                        var33.field4008 = var22 * 128 + var36 * 64;
                        var33.field3992 = class202.field3498 + var19;
                        var33.field4005 = var21 + var26;
                        if (var24 < var25) {
                            byte var48 = var25;
                            var25 = var24;
                            var24 = var48;
                        }
                        var33.field3972 = var21 + var28;
                        var33.field3984 = (class305) var46.field5054;
                        var33.field3974 = var22 + var24;
                        var33.field4014 = var22 + var25;
                        var33.field4012 = var21 * 128 + (var35 * 64);
                    }
                }
            }
            if (class48.field725 == 7) {
                int var49 = class293.field5036.method1589(112);
                int var50 = class88.field1497 + (var49 >> 4 & 0x7);
                int var51 = (var49 & 0x7) + class75.field1301;
                int var52 = class293.field5036.method1615(-120);
                int var53 = class293.field5036.method1589(108);
                int var54 = class293.field5036.method1615(-46);
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    int var55 = var50 * 128 + 64;
                    int var56 = var51 * 128 + 64;
                    class209 var57 = new class209(var52, class272.field4704, var55, var56, class228.method1525(true, class272.field4704, var56, var55) - var53, var54, class202.field3498);
                    class277.field4769.method82(new class182(var57), (byte) -39);
                }
            } else if (class48.field725 == 122) {
                int var117 = class293.field5036.method1589(87);
                int var118 = class88.field1497 + ((var117 & 0x78) >> 4);
                int var119 = (var117 & 0x7) + class75.field1301;
                int var120 = class293.field5036.method1589(88);
                int var121 = var120 >> 2;
                int var122 = class124.field2210[var121];
                int var123 = var120 & 0x3;
                int var124 = class293.field5036.method1615(-27);
                if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                    class217.method1470(var119, var118, class272.field4704, -1, 0, var122, var123, var124, var121, (byte) -72);
                }
            } else if (class48.field725 == 13) {
                int var99 = class293.field5036.method1589(102);
                int var100 = (var99 & 0xF) + class75.field1301 * 2;
                int var101 = (var99 >> 4 & 0xF) + class88.field1497 * 2;
                int var102 = class293.field5036.method1617((byte) -117) + var101;
                int var103 = var100 + class293.field5036.method1617((byte) -117);
                int var104 = class293.field5036.method1574(-127);
                int var105 = class293.field5036.method1615(95);
                int var106 = class293.field5036.method1589(63) * 4;
                int var107 = class293.field5036.method1589(106) * 4;
                int var108 = class293.field5036.method1615(-128);
                int var109 = class293.field5036.method1615(103);
                int var110 = class293.field5036.method1589(127);
                int var111 = class293.field5036.method1589(99);
                if (var101 >= 0 && var100 >= 0 && var101 < 208 && var100 < 208 && var102 >= 0 && var103 >= 0 && var102 < 208 && var103 < 208 && var105 != 65535) {
                    int var112 = var101 * 64;
                    int var113 = var100 * 64;
                    int var114 = var103 * 64;
                    class162 var115 = new class162(var105, class272.field4704, var112, var113, class228.method1525(true, class272.field4704, var113, var112) - var106, var108 - -class202.field3498, class202.field3498 + var109, var110, var111, var104, var107);
                    int var116 = var102 * 64;
                    var115.method1090(var108 + class202.field3498, (byte) -85, var114, var116, class228.method1525(true, class272.field4704, var114, var116) - var107);
                    class294.field5050.method82(new class246(var115), (byte) -39);
                }
            } else if (class48.field725 == 0) {
                int var58 = class293.field5036.method1589(76);
                int var59 = (var58 >> 4 & 0x7) + class88.field1497;
                int var60 = (var58 & 0x7) + class75.field1301;
                int var61 = class293.field5036.method1615(-128);
                int var62 = class293.field5036.method1615(52);
                int var63 = class293.field5036.method1615(44);
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class12 var64 = class82.field1386[class272.field4704][var59][var60];
                    if (var64 != null) {
                        for (class232 var65 = (class232) var64.method83(-45); var65 != null; var65 = (class232) var64.method87((byte) -80)) {
                            class44 var66 = var65.field4024;
                            if ((var61 & 0x7FFF) == var66.field663 && var66.field660 == var62) {
                                var66.field660 = var63;
                                break;
                            }
                        }
                        class259.method1827(var59, (byte) 81, var60);
                    }
                }
            } else if (class48.field725 == 204) {
                int var93 = class293.field5036.method1585(65280);
                int var94 = class293.field5036.method1615(83);
                int var95 = class293.field5036.method1621((byte) -106);
                int var96 = (var95 & 0x7) + class75.field1301;
                int var97 = ((var95 & 0x7B) >> 4) + class88.field1497;
                if (var97 >= 0 && var96 >= 0 && var97 < 104 && var96 < 104) {
                    class44 var98 = new class44();
                    var98.field663 = var94;
                    var98.field660 = var93;
                    if (class82.field1386[class272.field4704][var97][var96] == null) {
                        class82.field1386[class272.field4704][var97][var96] = new class12();
                    }
                    class82.field1386[class272.field4704][var97][var96].method82(new class232(var98), (byte) -39);
                    class259.method1827(var97, (byte) 89, var96);
                }
            } else if (class48.field725 == 183) {
                int var85 = class293.field5036.method1568((byte) -96);
                int var86 = var85 & 0x3;
                int var87 = var85 >> 2;
                int var88 = class124.field2210[var87];
                int var89 = class293.field5036.method1621((byte) -106);
                int var90 = (var89 & 0x7) + class75.field1301;
                int var91 = (var89 >> 4 & 0x7) + class88.field1497;
                int var92 = class293.field5036.method1599(255);
                if (var92 == 65535) {
                    var92 = -1;
                }
                class186.method1262(class272.field4704, var90, var91, var88, var92, var87, var86, (byte) -61);
            } else if (class48.field725 == 245) {
                int var67 = class293.field5036.method1589(80);
                int var68 = class88.field1497 + ((var67 & 0x71) >> 4);
                int var69 = (var67 & 0x7) + class75.field1301;
                int var70 = class293.field5036.method1617((byte) -117) + var68;
                int var71 = var69 + class293.field5036.method1617((byte) -117);
                int var72 = class293.field5036.method1574(-92);
                int var73 = class293.field5036.method1615(-123);
                int var74 = class293.field5036.method1589(63) * 4;
                int var75 = class293.field5036.method1589(99) * 4;
                int var76 = class293.field5036.method1615(-124);
                int var77 = class293.field5036.method1615(-119);
                int var78 = class293.field5036.method1589(58);
                int var79 = class293.field5036.method1589(84);
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 65535) {
                    int var80 = var71 * 128 + 64;
                    int var81 = var68 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var69 * 128 + 64;
                    class162 var84 = new class162(var73, class272.field4704, var81, var83, class228.method1525(true, class272.field4704, var83, var81) - var74, var76 - -class202.field3498, var77 + class202.field3498, var78, var79, var72, var75);
                    var84.method1090(class202.field3498 + var76, (byte) -62, var80, var82, class228.method1525(true, class272.field4704, var80, var82) - var75);
                    class294.field5050.method82(new class246(var84), (byte) -39);
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 628)
    public class16() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Loh;I)V", line = 630)
    public class16(class258 arg0, int arg1) {
        this.field211 = arg0;
    }
}

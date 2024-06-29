import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class125 extends class29 {

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Lbt;")
    public static class363 field1658 = new class363(200);

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "Lvq;")
    public static class24 field1661 = new class24(101, 8);

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Lvq;")
    public static class24 field1662 = new class24(62, 7);

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Ljava/lang/String;")
    public String field1655;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I", line = 4)
    public final int method842(byte arg0) {
        int var2 = 126 / ((22 - arg0) / 53);
        ++field1665;
        return (int) super.field3907;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V", line = 24)
    public static void method843(boolean arg0) {
        field1662 = null;
        field1658 = null;
        field1661 = null;
        if (!arg0) {
            field1662 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)I", line = 37)
    public final int method844(int arg0) {
        ++field1656;
        if (arg0 != 64) {
            this.method846(-39);
        }
        return (int) (super.field3907 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lil;B)V", line = 48)
    public static final void method845(class274 arg0, byte arg1) {
        ++field1659;
        if (class37.field527 == arg0) {
            int var2 = class22.field306.method1738((byte) 108);
            int var3 = ((var2 & 246) >> 4) + class427.field6216 * 2;
            int var4 = (15 & var2) + class189.field2647 * 2;
            int var5 = var3 + class22.field306.method1728((byte) 95);
            int var6 = var4 + class22.field306.method1728((byte) 118);
            int var7 = class22.field306.method1747((byte) 12);
            int var8 = class22.field306.method1767(1930493576);
            int var9 = class22.field306.method1738((byte) 91) * 4;
            int var10 = class22.field306.method1738((byte) -50) * 4;
            int var11 = class22.field306.method1767(1930493576);
            int var12 = class22.field306.method1767(1930493576);
            int var13 = class22.field306.method1738((byte) -25);
            int var14 = class22.field306.method1738((byte) -33);
            if (~var13 == -256) {
                var13 = -1;
            }
            if (~var3 <= -1 && ~var4 <= -1 && var3 < class195.field2745 * 2 && ~var4 > ~(class195.field2745 * 2) && ~var5 <= -1 && ~var6 <= -1 && ~var5 > ~(class78.field984 * 2) && ~(class78.field984 * 2) < ~var6 && ~var8 != -65536) {
                int var15 = var5 * 64;
                int var16 = var6 * 64;
                int var17 = var4 * 64;
                int var18 = var3 * 64;
                class305 var19 = new class305(var8, class317.field4651, var18, var17, -var9 + class133.method889(class317.field4651, var18, var17, false), class388.field5665 + var11, class388.field5665 + var12, var13, var14, var7, var10);
                var19.method2033(var11 - -class388.field5665, var16, -24296, class133.method889(class317.field4651, var15, var16, false) + -var10, var15);
                class26.field383.method2484(0, new class392(var19));
            }
        } else if (class188.field2628 == arg0) {
            int var20 = class22.field306.method1719(0);
            int var21 = (7 & var20 >> 4) + class427.field6216;
            int var22 = class189.field2647 - -(var20 & 7);
            int var23 = class22.field306.method1741((byte) 24);
            int var24 = var23 >> 2;
            int var25 = var23 & 3;
            int var26 = class4.field69[var24];
            int var27 = class22.field306.method1736(65280);
            if (~var21 <= -1 && var22 >= 0 && var21 < class195.field2745 && class78.field984 > var22) {
                class456.method2824(var21, var27, -1, 0, (byte) -122, var22, var25, var26, class317.field4651, var24);
            }
        } else if (class34.field491 == arg0) {
            int var28 = class22.field306.method1738((byte) -97);
            int var29 = class427.field6216 - -(7 & var28 >> 4);
            int var30 = (7 & var28) + class189.field2647;
            int var31 = class22.field306.method1767(1930493576);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = class22.field306.method1738((byte) -47);
            int var33 = (var32 & 241) >> 4;
            int var34 = 7 & var32;
            int var35 = class22.field306.method1738((byte) -123);
            int var36 = class22.field306.method1738((byte) 124);
            if (~var29 <= -1 && var30 >= 0 && var29 < class195.field2745 && ~class78.field984 < ~var30) {
                int var37 = var33 + 1;
                if (-var37 + var29 <= class187.field2619.field793[0] && var29 + var37 >= class187.field2619.field793[0] && ~(-var37 + var30) >= ~class187.field2619.field784[0] && ~(var30 + var37) <= ~class187.field2619.field784[0] && class178.field2539 != 0 && ~var34 < -1 && ~class32.field447 > -51 && ~var31 != 0) {
                    class78.field985[class32.field447] = var31;
                    class265.field3933[class32.field447] = var34;
                    class146.field1979[class32.field447] = var35;
                    class411.field5901[class32.field447] = null;
                    class226.field3389[class32.field447] = (class317.field4651 << 24) - (-(var29 << 16) - (var30 << 8)) + var33;
                    class301.field4391[class32.field447] = var36;
                    ++class32.field447;
                }
            }
        } else if (class304.field4456 == arg0) {
            int var38 = class22.field306.method1738((byte) 79);
            int var39 = ((var38 & 251) >> 4) + class427.field6216 * 2;
            int var40 = class189.field2647 * 2 - -(var38 & 15);
            int var41 = var39 + class22.field306.method1728((byte) 86);
            int var42 = var40 - -class22.field306.method1728((byte) 84);
            int var43 = class22.field306.method1747((byte) 12);
            int var44 = class22.field306.method1747((byte) 12);
            int var45 = class22.field306.method1767(1930493576);
            int var46 = class22.field306.method1728((byte) 92);
            int var47 = class22.field306.method1738((byte) 99) * 4;
            int var48 = class22.field306.method1767(1930493576);
            int var49 = class22.field306.method1767(1930493576);
            int var50 = class22.field306.method1738((byte) -22);
            int var51 = class22.field306.method1738((byte) -18);
            if (var50 == 255) {
                var50 = -1;
            }
            if (var39 >= 0 && var40 >= 0 && class195.field2745 * 2 > var39 && class195.field2745 * 2 > var40 && var41 >= 0 && var42 >= 0 && ~(class78.field984 * 2) < ~var41 && var42 < class78.field984 * 2 && ~var45 != -65536) {
                int var52 = var41 * 64;
                int var53 = var40 * 64;
                int var54 = var39 * 64;
                int var55 = var42 * 64;
                if (var43 != 0) {
                    int var57;
                    class58 var59;
                    if (var43 < 0) {
                        int var56 = -var43 + -1;
                        var57 = (var56 & 32328) >> 11;
                        int var58 = 2047 & var56;
                        if (~class420.field6085 != ~var58) {
                            var59 = class455.field6731[var58];
                        } else {
                            var59 = class187.field2619;
                        }
                    } else {
                        int var60 = var43 + -1;
                        int var61 = 2047 & var60;
                        var57 = (32521 & var60) >> 11;
                        var59 = class364.field5260[var61];
                    }
                    if (var59 != null) {
                        class446 var62 = var59.method450(0);
                        if (var62.field6534 != null && var62.field6534[var57] != null) {
                            int var63 = var62.field6534[var57][0];
                            int var64 = var62.field6534[var57][2];
                            int var65 = var59.field705.method1672(10319);
                            int var66 = class327.field4863[var65];
                            int var67 = class327.field4862[var65];
                            int var68 = var64 * var66 - -(var63 * var67) >> 15;
                            int var69 = var64 * var67 + -(var63 * var66) >> 15;
                            var54 += var68;
                            var53 += var69;
                            var46 -= var62.field6534[var57][1];
                        }
                    }
                }
                class305 var71 = new class305(var45, class317.field4651, var54, var53, -var46 + class133.method889(class317.field4651, var54, var53, false), class388.field5665 + var48, class388.field5665 + var49, var50, var51, var44, var47);
                var71.method2033(class388.field5665 + var48, var55, -24296, class133.method889(class317.field4651, var52, var55, false) - var47, var52);
                class26.field383.method2484(0, new class392(var71));
            }
        } else if (class345.field5069 == arg0) {
            class22.field306.method1738((byte) 55);
            int var72 = class22.field306.method1738((byte) -21);
            int var73 = class427.field6216 - -((var72 & 126) >> 4);
            int var74 = class189.field2647 - -(7 & var72);
            int var75 = class22.field306.method1767(1930493576);
            int var76 = class22.field306.method1738((byte) -94);
            int var77 = class22.field306.method1725((byte) 0);
            String var78 = class22.field306.method1715(true);
            class239.method1605(var76, var75, 0, class317.field4651, var77, var73, var78, var74);
        } else if (class275.field4063 == arg0) {
            int var79 = class22.field306.method1738((byte) -101);
            int var80 = class427.field6216 - -((127 & var79) >> 4);
            int var81 = (7 & var79) + class189.field2647;
            int var82 = class22.field306.method1767(1930493576);
            int var83 = class22.field306.method1767(1930493576);
            int var84 = class22.field306.method1767(1930493576);
            if (class200.field2828 != null && var80 >= 0 && var81 >= 0 && ~class195.field2745 < ~var80 && var81 < class78.field984) {
                class447 var85 = (class447) class200.field2828.method609((long) (class317.field4651 << 28 | var81 << 14 | var80), 49);
                if (var85 != null) {
                    for (class188 var86 = (class188) var85.field6542.method2478(1603); var86 != null; var86 = (class188) var85.field6542.method2486((byte) -82)) {
                        if (~(var82 & 32767) == ~var86.field2623 && var86.field2624 == var83) {
                            var86.method1820(-25246);
                            var86.field2624 = var84;
                            class325.method2126(var80, var86, var81, class317.field4651, -30807);
                            break;
                        }
                    }
                    class342.method2224(true, var80, var81, class317.field4651);
                }
            }
        } else if (class143.field1940 == arg0) {
            int var87 = class22.field306.method1729(false);
            int var88 = class22.field306.method1745(-1106334908);
            int var89 = class22.field306.method1745(-1106334908);
            int var90 = class22.field306.method1738((byte) 112);
            int var91 = (7 & var90 >> 4) + class427.field6216;
            int var92 = (7 & var90) + class189.field2647;
            if (var91 >= 0 && var92 >= 0 && ~var91 > ~class195.field2745 && var92 < class78.field984 && ~class420.field6085 != ~var87) {
                class325.method2126(var91, new class188(var88, var89), var92, class317.field4651, -30807);
                class342.method2224(true, var91, var92, class317.field4651);
            }
        } else if (class90.field1106 == arg0) {
            int var93 = class22.field306.method1767(1930493576);
            int var94 = class22.field306.method1738((byte) -122);
            class450.method2785(var93, (byte) 113).method1236(var94, 0);
        } else if (class310.field4560 == arg0) {
            int var95 = class22.field306.method1738((byte) -100);
            int var96 = var95 >> 2;
            int var97 = 3 & var95;
            int var98 = class22.field306.method1729(false);
            byte var99 = class22.field306.method1743(true);
            int var100 = class22.field306.method1741((byte) 24);
            int var101 = class427.field6216 - -((var100 & 113) >> 4);
            int var102 = (var100 & 7) + class189.field2647;
            byte var103 = class22.field306.method1760((byte) 107);
            int var104 = class22.field306.method1767(1930493576);
            byte var105 = class22.field306.method1728((byte) 120);
            byte var106 = class22.field306.method1760((byte) 114);
            int var107 = class22.field306.method1729(false);
            int var108 = class22.field306.method1747((byte) 12);
            if (!class74.field942.method109()) {
                class376.method2377(var97, var106, class317.field4651, var104, var98, var96, var103, var108, var101, var105, var102, var107, (byte) 108, var99);
            }
        } else if (class452.field6674 == arg0) {
            int var109 = class22.field306.method1745(-1106334908);
            int var110 = class22.field306.method1762((byte) -33);
            int var111 = (7 & var110 >> 4) + class427.field6216;
            int var112 = (7 & var110) + class189.field2647;
            int var113 = class22.field306.method1745(-1106334908);
            if (var111 >= 0 && ~var112 <= -1 && ~class195.field2745 < ~var111 && ~class78.field984 < ~var112) {
                class325.method2126(var111, new class188(var113, var109), var112, class317.field4651, -30807);
                class342.method2224(true, var111, var112, class317.field4651);
            }
        } else if (class299.field4351 == arg0) {
            int var114 = class22.field306.method1738((byte) -79);
            int var115 = ((122 & var114) >> 4) + class427.field6216;
            int var116 = (7 & var114) + class189.field2647;
            int var117 = class22.field306.method1719(0);
            int var118 = var117 >> 2;
            int var119 = var117 & 3;
            int var120 = class4.field69[var118];
            if (var115 >= 0 && ~var116 <= -1 && var115 < class195.field2745 && var116 < class78.field984) {
                class456.method2824(var115, -1, -1, 0, (byte) -115, var116, var119, var120, class317.field4651, var118);
            }
        } else {
            if (arg1 <= 95) {
                field1658 = null;
            }
            if (class400.field5777 != arg0) {
                if (class417.field6028 == arg0) {
                    int var127 = class22.field306.method1738((byte) -77);
                    int var128 = (var127 >> 4 & 7) + class427.field6216;
                    int var129 = (var127 & 7) + class189.field2647;
                    int var130 = class22.field306.method1767(1930493576);
                    int var131 = class22.field306.method1738((byte) -110);
                    int var132 = class22.field306.method1767(1930493576);
                    if (~var128 <= -1 && var129 >= 0 && ~class195.field2745 < ~var128 && ~var129 > ~class78.field984) {
                        int var133 = var128 * 128 - -64;
                        int var134 = var129 * 128 + 64;
                        class231 var135 = new class231(var130, var132, class388.field5665, class317.field4651, var133, -var131 + class133.method889(class317.field4651, var133, var134, false), var134, var128, var128, var129, var129);
                        class189.field2650.method2484(0, new class120(var135));
                    }
                } else if (class383.field5619 == arg0) {
                    int var136 = class22.field306.method1762((byte) -33);
                    int var137 = class427.field6216 - -(7 & var136 >> 4);
                    int var138 = (7 & var136) + class189.field2647;
                    int var139 = class22.field306.method1767(1930493576);
                    if (var139 == 65535) {
                        var139 = -1;
                    }
                    int var140 = class22.field306.method1762((byte) -33);
                    int var141 = var140 >> 2;
                    int var142 = 3 & var140;
                    int var143 = class4.field69[var141];
                    class294.method1956(class317.field4651, var143, var138, -1475, var141, var142, var139, var137);
                } else if (class142.field1932 == arg0) {
                    int var144 = class22.field306.method1738((byte) -74);
                    int var145 = (var144 >> 4 & 7) + class427.field6216;
                    int var146 = (7 & var144) + class189.field2647;
                    int var147 = var145 - -class22.field306.method1728((byte) 109);
                    int var148 = var146 + class22.field306.method1728((byte) 121);
                    int var149 = class22.field306.method1747((byte) 12);
                    int var150 = class22.field306.method1767(1930493576);
                    int var151 = 4 * class22.field306.method1738((byte) -112);
                    int var152 = 4 * class22.field306.method1738((byte) -24);
                    int var153 = class22.field306.method1767(1930493576);
                    int var154 = class22.field306.method1767(1930493576);
                    int var155 = class22.field306.method1738((byte) 54);
                    int var156 = class22.field306.method1738((byte) 106);
                    if (var155 == 255) {
                        var155 = -1;
                    }
                    if (var145 >= 0 && ~var146 <= -1 && var145 < class195.field2745 && ~var146 > ~class78.field984 && var147 >= 0 && ~var148 <= -1 && class195.field2745 > var147 && var148 < class78.field984 && var150 != 65535) {
                        int var157 = var148 * 128 - -64;
                        int var158 = var145 * 128 + 64;
                        int var159 = var147 * 128 - -64;
                        int var160 = var146 * 128 + 64;
                        class305 var161 = new class305(var150, class317.field4651, var158, var160, class133.method889(class317.field4651, var158, var160, false) + -var151, var153 - -class388.field5665, class388.field5665 + var154, var155, var156, var149, var152);
                        var161.method2033(var153 - -class388.field5665, var157, -24296, -var152 + class133.method889(class317.field4651, var159, var157, false), var159);
                        class26.field383.method2484(0, new class392(var161));
                    }
                } else {
                    class365.method2331("T3 - " + arg0, (Throwable) null, 28692);
                    class164.method1086((byte) 47);
                }
            } else {
                int var121 = class22.field306.method1719(0);
                int var122 = ((116 & var121) >> 4) + class427.field6216;
                int var123 = (7 & var121) + class189.field2647;
                int var124 = class22.field306.method1745(-1106334908);
                if (~var122 <= -1 && ~var123 <= -1 && class195.field2745 > var122 && class78.field984 > var123) {
                    class447 var125 = (class447) class200.field2828.method609((long) (var122 | var123 << 14 | class317.field4651 << 28), 95);
                    if (var125 != null) {
                        for (class188 var126 = (class188) var125.field6542.method2478(1603); var126 != null; var126 = (class188) var125.field6542.method2486((byte) -82)) {
                            if (~(32767 & var124) == ~var126.field2623) {
                                var126.method1820(-25246);
                                break;
                            }
                        }
                        if (var125.field6542.method2473((byte) -120)) {
                            var125.method1820(-25246);
                        }
                        class342.method2224(true, var122, var123, class317.field4651);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V", line = 655)
    public final void method846(int arg0) {
        ++field1663;
        super.field406 |= Long.MIN_VALUE;
        if (arg0 != 26848) {
            method843(false);
        }
        if (~this.method848(2) == -1L) {
            class154.field2078.method211(this, arg0 ^ -5408);
        }
    }

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V", line = 671)
    public final void method847(int arg0) {
        ++field1660;
        super.field406 = super.field406 & Long.MIN_VALUE | 500L + class43.method364(-16756);
        class403.field5828.method211(this, -32256);
        if (arg0 < 40) {
            this.method848(-25);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(II)V", line = 682)
    public class125(int arg0, int arg1) {
        super.field3907 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)J", line = 695)
    public final long method848(int arg0) {
        if (arg0 != 2) {
            field1662 = null;
        }
        ++field1666;
        return Long.MAX_VALUE & super.field406;
    }
}

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lec;")
    public static class32 field1838 = class73.method594("Fallen lassen", true);

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lec;")
    private static class32 field1850 = class73.method594("wishes to trade with you)3", true);

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lec;")
    public static class32 field1854 = field1850;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lwd;")
    public static class157 field1839 = new class157();

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lec;")
    public static class32 field1856 = class73.method594("zur-Uck auf die RuneScape)2Webseite gehen", true);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lhb;")
    public static class51 field1852;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lb;")
    public static class8 field1841;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        class9.field164.method491(24);
        field1844++;
        if (arg0 == -1) {
            class143.field3271.method491(76);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method632(int arg0) {
        field1849++;
        if (class86.field2005 == 164) {
            int var1 = class158.field3614.method525((byte) 116);
            byte var2 = class158.field3614.method535(arg0 ^ 0x7);
            int var3 = class158.field3614.method525((byte) 116);
            int var4 = class158.field3614.method536(13285);
            int var5 = var4 >> 2;
            int var6 = class135.field3133[var5];
            int var7 = var4 & 0x3;
            byte var8 = class158.field3614.method537(-124);
            int var9 = class158.field3614.method519(false);
            byte var10 = class158.field3614.method512(127);
            int var11 = class158.field3614.method532(arg0 - 7);
            byte var12 = class158.field3614.method537(-75);
            int var13 = class158.field3614.method536(13285);
            int var14 = (var13 >> 4 & 0x7) + class43.field998;
            int var15 = (var13 & 0x7) + class20.field368;
            class70 var16;
            if (class37.field892 == var9) {
                var16 = class20.field373;
            } else {
                var16 = class52.field1176[var9];
            }
            if (var16 != null) {
                class53 var17 = class5.method22(-126, var11);
                int var18;
                int var19;
                if (var7 == 1 || var7 == 3) {
                    var18 = var17.field1223;
                    var19 = var17.field1234;
                } else {
                    var18 = var17.field1234;
                    var19 = var17.field1223;
                }
                int var20 = var14 + (var19 >> 1);
                int var21 = var14 + (var19 + 1 >> 1);
                int var22 = (var18 >> 1) + var15;
                int var23 = (var18 + 1 >> 1) + var15;
                int[][] var24 = class70.field1631[class43.field990];
                int var25 = var24[var20][var22] + var24[var21][var22] + var24[var21][var23] + var24[var20][var23] >> 2;
                int var26 = (var14 << 7) + (var19 << 6);
                int var27 = (var15 << 7) + (var18 << 6);
                class101 var28 = var17.method413(var26, var5, var27, arg0 ^ 0xFFFFCDE9, var24, var7, var25);
                if (var28 != null) {
                    if (var10 > var8) {
                        byte var29 = var10;
                        var10 = var8;
                        var8 = var29;
                    }
                    class144.method1083(var15, var3 + 1, var14, -113, var6, 0, class43.field990, var1 + 1, 0, -1);
                    var16.field1654 = class140.field3219 + var1;
                    var16.field1640 = class140.field3219 + var3;
                    if (var2 > var12) {
                        byte var30 = var2;
                        var2 = var12;
                        var12 = var30;
                    }
                    var16.field1628 = var14 * 128 + var19 * 64;
                    var16.field1645 = var25;
                    var16.field1646 = var2 + var15;
                    var16.field1633 = var10 + var14;
                    var16.field1643 = var8 + var14;
                    var16.field1655 = var28;
                    var16.field1637 = var12 + var15;
                    var16.field1649 = var15 * 128 + var18 * 64;
                }
            }
        }
        if (class86.field2005 == 26) {
            int var31 = class158.field3614.method525((byte) 116);
            int var32 = class158.field3614.method533(255);
            int var33 = (var32 >> 4 & 0x7) + class43.field998;
            int var34 = (var32 & 0x7) + class20.field368;
            int var35 = class158.field3614.method520((byte) -49);
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                class17 var36 = new class17();
                var36.field336 = var31;
                var36.field333 = var35;
                if (class23.field397[class43.field990][var33][var34] == null) {
                    class23.field397[class43.field990][var33][var34] = new class157();
                }
                class23.field397[class43.field990][var33][var34].method1216(var36, (byte) 114);
                class157.method1207(-1, var34, var33);
            }
        } else if (class86.field2005 == 147) {
            int var37 = class158.field3614.method533(255);
            int var38 = var37 & 0x3;
            int var39 = var37 >> 2;
            int var40 = class135.field3133[var39];
            int var41 = class158.field3614.method530((byte) 95);
            int var42 = (var41 & 0x7) + class20.field368;
            int var43 = (var41 >> 4 & 0x7) + class43.field998;
            int var44 = class158.field3614.method519(false);
            if (var43 >= 0 && var42 >= 0 && var43 < 103 && var42 < 103) {
                if (var40 == 0) {
                    class3 var45 = class159.field3659.method1125(class43.field990, var43, var42);
                    if (var45 != null) {
                        int var46 = var45.field42 >> 14 & 0x7FFF;
                        if (var39 == 2) {
                            var45.field29 = new class106(var46, 2, var38 + 4, class43.field990, var43, var42, var44, false, var45.field29);
                            var45.field32 = new class106(var46, 2, var38 + 1 & 0x3, class43.field990, var43, var42, var44, false, var45.field32);
                        } else {
                            var45.field29 = new class106(var46, var39, var38, class43.field990, var43, var42, var44, false, var45.field29);
                        }
                    }
                }
                if (var40 == 1) {
                    class118 var47 = class159.field3659.method1152(class43.field990, var43, var42);
                    if (var47 != null) {
                        int var48 = var47.field2827 >> 14 & 0x7FFF;
                        if (var39 == 4 || var39 == 5) {
                            var47.field2833 = new class106(var48, 4, var38, class43.field990, var43, var42, var44, false, var47.field2833);
                        } else if (var39 == 6) {
                            var47.field2833 = new class106(var48, 4, var38 + 4, class43.field990, var43, var42, var44, false, var47.field2833);
                        } else if (var39 == 7) {
                            var47.field2833 = new class106(var48, 4, (var38 + 2 & 0x3) + 4, class43.field990, var43, var42, var44, false, var47.field2833);
                        } else if (var39 == 8) {
                            var47.field2833 = new class106(var48, 4, var38 + 4, class43.field990, var43, var42, var44, false, var47.field2833);
                            var47.field2819 = new class106(var48, 4, (var38 + 2 & 0x3) + 4, class43.field990, var43, var42, var44, false, var47.field2819);
                        }
                    }
                }
                if (var40 == 2) {
                    class45 var49 = class159.field3659.method1121(class43.field990, var43, var42);
                    if (var39 == 11) {
                        var39 = 10;
                    }
                    if (var49 != null) {
                        var49.field1059 = new class106(var49.field1068 >> 14 & 0x7FFF, var39, var38, class43.field990, var43, var42, var44, false, var49.field1059);
                    }
                }
                if (var40 == 3) {
                    class75 var50 = class159.field3659.method1162(class43.field990, var43, var42);
                    if (var50 != null) {
                        var50.field1771 = new class106(var50.field1767 >> 14 & 0x7FFF, 22, var38, class43.field990, var43, var42, var44, false, var50.field1771);
                    }
                }
            }
        } else if (class86.field2005 == 32) {
            int var51 = class158.field3614.method530((byte) 95);
            int var52 = (var51 >> 4 & 0x7) + class43.field998;
            int var53 = (var51 & 0x7) + class20.field368;
            int var54 = class158.field3614.method525((byte) 116);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                class157 var55 = class23.field397[class43.field990][var52][var53];
                if (var55 != null) {
                    for (class17 var56 = (class17) var55.method1213(88); var56 != null; var56 = (class17) var55.method1211(-3)) {
                        if ((var54 & 0x7FFF) == var56.field333) {
                            var56.method1093(0);
                            break;
                        }
                    }
                    if (var55.method1213(arg0 ^ 0x75) == null) {
                        class23.field397[class43.field990][var52][var53] = null;
                    }
                    class157.method1207(-1, var53, var52);
                }
            }
        } else if (class86.field2005 == 138) {
            int var57 = class158.field3614.method533(255);
            int var58 = (var57 >> 4 & 0x7) + class43.field998;
            int var59 = (var57 & 0x7) + class20.field368;
            int var60 = class158.field3614.method532(0);
            int var61 = class158.field3614.method532(arg0 - 7);
            int var62 = class158.field3614.method532(0);
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                class157 var63 = class23.field397[class43.field990][var58][var59];
                if (var63 != null) {
                    for (class17 var64 = (class17) var63.method1213(88); var64 != null; var64 = (class17) var63.method1211(arg0 ^ 0xFFFFFFFA)) {
                        if ((var60 & 0x7FFF) == var64.field333 && var64.field336 == var61) {
                            var64.field336 = var62;
                            break;
                        }
                    }
                    class157.method1207(-1, var59, var58);
                }
            }
        } else if (class86.field2005 == 150) {
            int var65 = class158.field3614.method521(88);
            int var66 = var65 >> 2;
            int var67 = var65 & 0x3;
            int var68 = class135.field3133[var66];
            int var69 = class158.field3614.method530((byte) 95);
            int var70 = class43.field998 + (var69 >> 4 & 0x7);
            int var71 = class20.field368 + (var69 & 0x7);
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                class144.method1083(var71, 0, var70, -88, var68, var67, class43.field990, -1, var66, -1);
            }
        } else if (class86.field2005 == 120) {
            int var72 = class158.field3614.method533(255);
            int var73 = class20.field368 + (var72 & 0x7);
            int var74 = (var72 >> 4 & 0x7) + class43.field998;
            int var75 = class158.field3614.method532(0);
            int var76 = class158.field3614.method533(255);
            int var77 = class158.field3614.method532(0);
            if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104) {
                int var78 = var73 * 128 + 64;
                int var79 = var74 * 128 + 64;
                class136 var80 = new class136(var75, class43.field990, var79, var78, class83.method654(-5736, class43.field990, var79, var78) - var76, var77, class140.field3219);
                class157.field3596.method1216(var80, (byte) 97);
            }
        } else if (class86.field2005 == 103) {
            int var81 = class158.field3614.method525((byte) 116);
            int var82 = class158.field3614.method519(false);
            int var83 = class158.field3614.method536(arg0 + 13278);
            int var84 = class43.field998 + (var83 >> 4 & 0x7);
            int var85 = class20.field368 + (var83 & 0x7);
            int var86 = class158.field3614.method520((byte) 112);
            if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && class37.field892 != var82) {
                class17 var87 = new class17();
                var87.field333 = var86;
                var87.field336 = var81;
                if (class23.field397[class43.field990][var84][var85] == null) {
                    class23.field397[class43.field990][var84][var85] = new class157();
                }
                class23.field397[class43.field990][var84][var85].method1216(var87, (byte) 122);
                class157.method1207(-1, var85, var84);
            }
        } else {
            if (arg0 != 7) {
                field1839 = null;
            }
            if (class86.field2005 == 105) {
                int var88 = class158.field3614.method530((byte) 95);
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                int var91 = class135.field3133[var89];
                int var92 = class158.field3614.method519(false);
                int var93 = class158.field3614.method521(122);
                int var94 = (var93 >> 4 & 0x7) + class43.field998;
                int var95 = (var93 & 0x7) + class20.field368;
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class144.method1083(var95, 0, var94, -99, var91, var90, class43.field990, -1, var89, var92);
                }
            } else {
                if (class86.field2005 == 195) {
                    int var96 = class158.field3614.method533(255);
                    int var97 = (var96 >> 4 & 0x7) + class43.field998;
                    int var98 = (var96 & 0x7) + class20.field368;
                    int var99 = class158.field3614.method532(0);
                    int var100 = class158.field3614.method533(255);
                    int var101 = class158.field3614.method533(255);
                    int var102 = var100 & 0x7;
                    int var103 = var100 >> 4 & 0xF;
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        int var104 = var103 + 1;
                        if (var97 - var104 <= class20.field373.field2761[0] && class20.field373.field2761[0] <= var97 + var104 && var98 - var104 <= class20.field373.field2738[0] && class20.field373.field2738[0] <= var98 + var104 && class114.field2648 != 0 && var102 > 0 && class143.field3279 < 50) {
                            class53.field1196[class143.field3279] = var99;
                            class126.field2925[class143.field3279] = var102;
                            class112.field2628[class143.field3279] = var101;
                            class65.field1510[class143.field3279] = null;
                            class114.field2674[class143.field3279] = (var97 << 16) + (var98 << 8) + var103;
                            class143.field3279++;
                        }
                    }
                }
                if (class86.field2005 == 82) {
                    int var105 = class158.field3614.method533(255);
                    int var106 = (var105 >> 4 & 0x7) + class43.field998;
                    int var107 = class20.field368 + (var105 & 0x7);
                    int var108 = var106 + class158.field3614.method545((byte) 123);
                    int var109 = class158.field3614.method545((byte) 123) + var107;
                    int var110 = class158.field3614.method552(false);
                    int var111 = class158.field3614.method532(arg0 - 7);
                    int var112 = class158.field3614.method533(255) * 4;
                    int var113 = class158.field3614.method533(arg0 + 248) * 4;
                    int var114 = class158.field3614.method532(arg0 ^ 0x7);
                    int var115 = class158.field3614.method532(arg0 - 7);
                    int var116 = class158.field3614.method533(255);
                    int var117 = class158.field3614.method533(255);
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != 65535) {
                        int var118 = var107 * 128 + 64;
                        int var119 = var106 * 128 + 64;
                        int var120 = var109 * 128 + 64;
                        class128 var121 = new class128(var111, class43.field990, var119, var118, class83.method654(-5736, class43.field990, var119, var118) - var112, class140.field3219 + var114, class140.field3219 + var115, var116, var117, var110, var113);
                        int var122 = var108 * 128 + 64;
                        var121.method996(var120, var122, (byte) 98, var114 + class140.field3219, -var113 + class83.method654(-5736, class43.field990, var122, var120));
                        class88.field2040.method1216(var121, (byte) 62);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIII)V")
    public static final void method633(byte arg0, int arg1, int arg2, int arg3) {
        field1848++;
        class36 var4 = class130.method1002(arg1, arg2, (byte) -29);
        if (var4 != null && var4.field838 != null) {
            class12 var5 = new class12();
            var5.field209 = var4;
            var5.field208 = var4.field838;
            class158.method1224(var5, (byte) -102);
        }
        int var6 = -10 / ((58 - arg0) / 61);
        class146.field3321 = arg1;
        class88.field2047 = arg3;
        class43.field1003 = arg2;
        class151.field3470 = true;
        class132.method1010(var4, (byte) -114);
    }

    @OriginalMember(owner = "client!ld", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1840++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Lue;")
    public static final class144 method634(int arg0, int arg1, int arg2, int arg3) {
        class144 var4 = new class144();
        var4.field3293 = arg0;
        var4.field3282 = arg1;
        class109.field2573.method1203(true, (long) arg2, var4);
        field1847++;
        client.method156(0, arg1);
        if (arg3 != 22878) {
            field1839 = null;
        }
        class64.method494(arg1, 50);
        class36 var5 = class128.method993(arg2, 125);
        if (var5 != null) {
            class132.method1010(var5, (byte) -113);
        }
        if (class50.field1159 != null) {
            class132.method1010(class50.field1159, (byte) -123);
            class50.field1159 = null;
        }
        class26.field476 = false;
        class119.field2851 = 0;
        class62.method477(100, class36.field864, class121.field2866, class45.field1072, class110.field2587);
        if (class13.field220 != -1) {
            class154.method1194(class13.field220, 1, (byte) 105);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1843++;
        if (class38.field920 != null) {
            class14.field231 = -1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILvd;[B[Lqf;II)V")
    public static final void method635(int arg0, class150 arg1, byte[] arg2, class117[] arg3, int arg4, int arg5) {
        field1846++;
        if (arg4 > -108) {
            method636(true);
        }
        int var6 = -1;
        class66 var7 = new class66(arg2);
        while (true) {
            int var8 = var7.method506(true);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method506(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method533(255);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var11;
                int var18 = arg5 + var12;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if ((class3.field50[1][var17][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    class117 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg3[var19];
                    }
                    class109.method870(arg1, var18, var15, var6, var16, var20, var13, var17, (byte) -76);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class38.field920 != null) {
            class157.field3588 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class92.field2122.length) {
                var3 = class92.field2122[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class14.field231 >= 0 && var3 >= 0) {
                class4.field55[class14.field231] = ~var3;
                class14.field231 = class14.field231 + 1 & 0x7F;
                if (class14.field231 == class114.field2662) {
                    class14.field231 = -1;
                }
            }
        }
        arg0.consume();
        field1851++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method636(boolean arg0) {
        field1854 = null;
        field1838 = null;
        field1841 = null;
        field1852 = null;
        if (!arg0) {
            field1839 = null;
            field1856 = null;
            field1850 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class77.method619((byte) -57, arg0);
        if (var2 >= 0) {
            int var3 = class62.field1397 + 1 & 0x7F;
            if (class1.field8 != var3) {
                class144.field3287[class62.field1397] = -1;
                class106.field2520[class62.field1397] = var2;
                class62.field1397 = var3;
            }
        }
        arg0.consume();
        field1845++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lac;")
    public static final class4 method637(int arg0, byte arg1) {
        field1842++;
        class4 var2 = (class4) class62.field1407.method486(-28825, (long) arg0);
        int var3 = 27 / ((-arg1 - 60) / 39);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class73.field1716.method206(14, arg0, -122);
        class4 var5 = new class4();
        if (var4 != null) {
            var5.method13(new class66(var4), 109);
        }
        class62.field1407.method485((long) arg0, (byte) -120, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ld", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class38.field920 != null) {
            class157.field3588 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class92.field2122.length > var2) {
                var3 = class92.field2122[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class14.field231 >= 0 && var3 >= 0) {
                class4.field55[class14.field231] = var3;
                class14.field231 = class14.field231 + 1 & 0x7F;
                if (class14.field231 == class114.field2662) {
                    class14.field231 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class62.field1397 + 1 & 0x7F;
                if (class1.field8 != var4) {
                    class144.field3287[class62.field1397] = var3;
                    class106.field2520[class62.field1397] = -1;
                    class62.field1397 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1853++;
    }
}

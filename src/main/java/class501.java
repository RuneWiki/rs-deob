import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class501 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
    public boolean field7188 = false;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "Lkh;")
    private class13 field7204 = new class13(64);

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Lkh;")
    public class13 field7210 = new class13(500);

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "Lkh;")
    public class13 field7211 = new class13(30);

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "Lkh;")
    public class13 field7212 = new class13(50);

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "Lul;")
    public class406 field7194;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Z")
    public boolean field7199;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Lul;")
    private class406 field7193;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "Lak;")
    public static class234 field7200 = new class234("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field7207 = new String[200];

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public int field7213;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
    public static final boolean method2965(int arg0) throws IOException {
        field7186++;
        if (class162.field2413 == null) {
            return false;
        }
        int var1 = class162.field2413.method1970(true);
        if (var1 == 0) {
            return false;
        }
        if (class289.field4354 == null) {
            if (class484.field6970) {
                var1--;
                class162.field2413.method1965(0, 1, (byte) -81, class238.field3819.field3572);
                class484.field6970 = false;
                class380.field5736++;
            }
            class238.field3819.field3556 = 0;
            if (class238.field3819.method1752(arg0 + 29951)) {
                if (var1 == 0) {
                    return false;
                }
                class162.field2413.method1965(1, 1, (byte) -81, class238.field3819.field3572);
                var1--;
                class380.field5736++;
            }
            class484.field6970 = true;
            class509[] var2 = class318.method2044(0);
            int var3 = class238.field3819.method1758(arg0 + 128);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class238.field3819.field3556);
            }
            class289.field4354 = var2[var3];
            class142.field2164 = class289.field4354.field7450;
        }
        if (class142.field2164 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class162.field2413.method1965(0, 1, (byte) -81, class238.field3819.field3572);
            var1--;
            class380.field5736++;
            class142.field2164 = class238.field3819.field3572[0] & 0xFF;
        }
        if (class142.field2164 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class162.field2413.method1965(0, 2, (byte) -81, class238.field3819.field3572);
            class238.field3819.field3556 = 0;
            var1 -= 2;
            class142.field2164 = class238.field3819.method1511(86);
            class380.field5736 += 2;
        }
        if (var1 < class142.field2164) {
            return false;
        }
        class238.field3819.field3556 = arg0;
        class162.field2413.method1965(0, class142.field2164, (byte) -81, class238.field3819.field3572);
        class380.field5736 += class142.field2164;
        class119.field1801 = 0;
        class274.field4194 = class150.field2247;
        class150.field2247 = class131.field2010;
        class131.field2010 = class289.field4354;
        if (class294.field4464 == class289.field4354) {
            int var4 = class238.field3819.method1511(108);
            int var5 = class238.field3819.method1549(-2);
            int var6 = class238.field3819.method1536(127);
            if (class320.method2049(-86, var5)) {
                class49.method485(var6, var4, (byte) -31);
            }
            class289.field4354 = null;
            return true;
        } else if (class310.field4668 == class289.field4354) {
            int var7 = class238.field3819.method1523(3643);
            int var8 = class238.field3819.method1512((byte) 115);
            int var9 = class238.field3819.method1547(true);
            int var10 = class238.field3819.method1512((byte) 126);
            int var11 = class238.field3819.method1556(124);
            boolean var12 = (var7 & 0x80) != 0;
            if ((var11 >> 30) != 0) {
                int var43 = (var11 & 0x3B91DD3E) >> 28;
                int var44 = (var11 >> 14 & 0x3FFF) - class390.field5842;
                int var45 = (var11 & 0x3FFF) - class176.field2613;
                if (var44 >= 0 && var45 >= 0 && var44 < class69.field976 && var45 < class285.field4328) {
                    int var46 = var44 * 128 + 64;
                    int var47 = var45 * 128 + 64;
                    int var48 = var43;
                    if (var43 < 3 && class385.method2406(-17064, var44, var45)) {
                        var48 = var43 + 1;
                    }
                    class5 var49 = new class5(var9, 0, class475.field6854, var43, var48, var46, class172.method1153(var43, -4, var46, var47) - var10, var47, var44, var44, var45, var45, var7);
                    class100.field1431.method994(new class453(var49), -3610);
                }
            } else if ((var11 >> 29) != 0) {
                int var13 = var11 & 0xFFFF;
                class116 var14 = class153.field2265[var13];
                if (var14 != null) {
                    if (var9 == 65535) {
                        var9 = -1;
                    }
                    boolean var15 = true;
                    int var16 = var12 ? var14.field1962 : var14.field1904;
                    if (var9 != -1 && var16 != -1) {
                        if (var9 == var16) {
                            class316 var17 = class123.field1839.method1490(var9, true);
                            if (var17.field4771 && var17.field4775 != -1) {
                                class189 var18 = class242.field3846.method2238(var17.field4775, (byte) 78);
                                int var19 = var18.field3192;
                                if (var19 == 0 || var19 == 2) {
                                    var15 = false;
                                } else if (var19 == 1) {
                                    var15 = true;
                                }
                            }
                        } else {
                            class316 var20 = class123.field1839.method1490(var9, true);
                            class316 var21 = class123.field1839.method1490(var16, true);
                            if (var20.field4775 != -1 && var21.field4775 != -1) {
                                class189 var22 = class242.field3846.method2238(var20.field4775, (byte) 78);
                                class189 var23 = class242.field3846.method2238(var21.field4775, (byte) 78);
                                if (var23.field3175 > var22.field3175) {
                                    var15 = false;
                                }
                            }
                        }
                    }
                    if (var15) {
                        if (var12) {
                            var14.field1962 = var9;
                            var14.field1900 = var7 & 0x7;
                            var14.field1946 = 1;
                            var14.field1931 = class475.field6854 + var8;
                            var14.field1896 = 0;
                            var14.field1892 = var10;
                            var14.field1967 = 0;
                            if (class475.field6854 < var14.field1931) {
                                var14.field1967 = -1;
                            }
                            if (var14.field1962 != -1 && class475.field6854 == var14.field1931) {
                                int var26 = class123.field1839.method1490(var14.field1962, true).field4775;
                                if (var26 != -1) {
                                    class189 var27 = class242.field3846.method2238(var26, (byte) 78);
                                    if (var27 != null && var27.field3181 != null) {
                                        method2969(var27, var14.field5837, false, 0, -106, var14.field5826, var14.field5833);
                                    }
                                }
                            }
                        } else {
                            var14.field1971 = var10;
                            var14.field1950 = 0;
                            var14.field1895 = 0;
                            var14.field1897 = class475.field6854 + var8;
                            var14.field1887 = var7 & 0x7;
                            var14.field1904 = var9;
                            var14.field1961 = 1;
                            if (class475.field6854 < var14.field1897) {
                                var14.field1950 = -1;
                            }
                            if (var14.field1904 != -1 && class475.field6854 == var14.field1897) {
                                int var24 = class123.field1839.method1490(var14.field1904, true).field4775;
                                if (var24 != -1) {
                                    class189 var25 = class242.field3846.method2238(var24, (byte) 78);
                                    if (var25 != null && var25.field3181 != null) {
                                        method2969(var25, var14.field5837, false, 0, -107, var14.field5826, var14.field5833);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var11 >> 28) != 0) {
                int var28 = var11 & 0xFFFF;
                class177 var29;
                if (class261.field4008 == var28) {
                    var29 = class398.field5947;
                } else {
                    var29 = class26.field319[var28];
                }
                if (var29 != null) {
                    if (var9 == 65535) {
                        var9 = -1;
                    }
                    boolean var30 = true;
                    int var31 = var12 ? var29.field1962 : var29.field1904;
                    if (var9 != -1 && var31 != -1) {
                        if (var9 == var31) {
                            class316 var36 = class123.field1839.method1490(var9, true);
                            if (var36.field4771 && var36.field4775 != -1) {
                                class189 var37 = class242.field3846.method2238(var36.field4775, (byte) 78);
                                int var38 = var37.field3192;
                                if (var38 == 0 || var38 == 2) {
                                    var30 = false;
                                } else if (var38 == 1) {
                                    var30 = true;
                                }
                            }
                        } else {
                            class316 var32 = class123.field1839.method1490(var9, true);
                            class316 var33 = class123.field1839.method1490(var31, true);
                            if (var32.field4775 != -1 && var33.field4775 != -1) {
                                class189 var34 = class242.field3846.method2238(var32.field4775, (byte) 78);
                                class189 var35 = class242.field3846.method2238(var33.field4775, (byte) 78);
                                if (var35.field3175 > var34.field3175) {
                                    var30 = false;
                                }
                            }
                        }
                    }
                    if (var30) {
                        if (var12) {
                            var29.field1900 = var7 & 0x7;
                            var29.field1896 = 0;
                            var29.field1946 = 1;
                            var29.field1931 = class475.field6854 + var8;
                            var29.field1962 = var9;
                            var29.field1892 = var10;
                            var29.field1967 = 0;
                            if (class475.field6854 < var29.field1931) {
                                var29.field1967 = -1;
                            }
                            if (var29.field1962 == 65535) {
                                var29.field1962 = -1;
                            }
                            if (var29.field1962 != -1 && class475.field6854 == var29.field1931) {
                                int var39 = class123.field1839.method1490(var29.field1962, true).field4775;
                                if (var39 != -1) {
                                    class189 var40 = class242.field3846.method2238(var39, (byte) 78);
                                    if (var40 != null && var40.field3181 != null) {
                                        method2969(var40, var29.field5837, class398.field5947 == var29, 0, arg0 ^ 0xFFFFFF8A, var29.field5826, var29.field5833);
                                    }
                                }
                            }
                        } else {
                            var29.field1897 = class475.field6854 + var8;
                            var29.field1904 = var9;
                            var29.field1895 = 0;
                            var29.field1950 = 0;
                            var29.field1961 = 1;
                            var29.field1971 = var10;
                            var29.field1887 = var7 & 0x7;
                            if (var29.field1904 == 65535) {
                                var29.field1904 = -1;
                            }
                            if (var29.field1897 > class475.field6854) {
                                var29.field1950 = -1;
                            }
                            if (var29.field1904 != -1 && class475.field6854 == var29.field1897) {
                                int var41 = class123.field1839.method1490(var29.field1904, true).field4775;
                                if (var41 != -1) {
                                    class189 var42 = class242.field3846.method2238(var41, (byte) 78);
                                    if (var42 != null && var42.field3181 != null) {
                                        method2969(var42, var29.field5837, class398.field5947 == var29, 0, -114, var29.field5826, var29.field5833);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class162.field2409) {
            int var50 = class238.field3819.method1536(127);
            int var51 = class238.field3819.method1512((byte) 119);
            if (class320.method2049(-32, var51)) {
                class393.method2474(var50, 5, class261.field4008, 0, (byte) 111);
            }
            class289.field4354 = null;
            return true;
        } else if (class429.field6374 == class289.field4354) {
            class531.field7751 = class238.field3819.method1560(-128);
            class375.field5628 = class238.field3819.method1565(true) << 3;
            class73.field1033 = class238.field3819.method1565(true) << 3;
            for (class433 var52 = (class433) class334.field4985.method2592(116); var52 != null; var52 = (class433) class334.field4985.method2589(-1)) {
                int var54 = (int) (var52.field6388 & 0x3FFFL);
                int var55 = (int) (var52.field6388 >> 14 & 0x3FFFL);
                int var56 = (int) (var52.field6388 >> 28 & 0x3L);
                if (class531.field7751 == var56 && var54 >= class73.field1033 && var54 < (class73.field1033 + 8) && var55 >= class375.field5628 && var55 < class375.field5628 + 8) {
                    var52.method2677(-22491);
                    class68.method580((byte) -94, var55, class531.field7751, var54);
                }
            }
            for (class155 var53 = (class155) class483.field6941.method1004((byte) -84); var53 != null; var53 = (class155) class483.field6941.method996(1)) {
                if (class73.field1033 <= var53.field2306 && (class73.field1033 + 8) > var53.field2306 && class375.field5628 <= var53.field2302 && class375.field5628 + 8 > var53.field2302 && class531.field7751 == var53.field2298) {
                    var53.field2295 = 0;
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class55.field670 == class289.field4354) {
            int var57 = class238.field3819.method1547(true);
            int var58 = class238.field3819.method1512((byte) 103);
            int var59 = class238.field3819.method1556(arg0 ^ 0x72);
            int var60 = class238.field3819.method1536(arg0 + 127);
            if (class320.method2049(-45, var57)) {
                class393.method2474(var59, 5, var58, var60, (byte) 87);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class194.field3265) {
            String var61 = class238.field3819.method1550((byte) 28);
            String var62 = class169.method1133(class517.method3067(class238.field3819, (byte) -94), 111);
            class475.method2854(var62, 0, var61, arg0 ^ 0xFFFFFF80, var61, 6);
            class289.field4354 = null;
            return true;
        } else if (class387.field5816 == class289.field4354) {
            int var63 = class238.field3819.method1560(-128);
            int var64 = class238.field3819.method1523(3643);
            int var65 = class238.field3819.method1512((byte) 123);
            if (var65 == 65535) {
                var65 = -1;
            }
            class388.method2422(var63, -127, var64, var65);
            class289.field4354 = null;
            return true;
        } else if (class338.field5038 == class289.field4354) {
            int var66 = class238.field3819.method1511(-123);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = class238.field3819.method1553((byte) 15);
            int var68 = class238.field3819.method1515((byte) 126);
            class457.method2773(var68, var67, var66, 0);
            class289.field4354 = null;
            return true;
        } else if (class367.field5398 == class289.field4354) {
            int var69 = class238.field3819.method1547(true);
            int var70 = class238.field3819.method1547(true);
            int var71 = class238.field3819.method1556(113);
            int var72 = class238.field3819.method1523(3643);
            if (class320.method2049(-17, var70)) {
                class293 var73 = (class293) class70.field993.method2585((byte) 114, (long) var71);
                if (var73 != null) {
                    class218.method1568(false, -122, var73.field4454 != var69, var73);
                }
                class508.method3030(var69, var72, false, arg0 + 12, var71);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class179.field2702) {
            class59.field707 = class183.method1213(class238.field3819.method1515((byte) 126), -127);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class232.field3748) {
            class450.method2747(class475.field6848, 2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class182.field2724) {
            int var74 = class238.field3819.method1512((byte) 112);
            int var75 = class238.field3819.method1536(arg0 + 127);
            int var76 = class238.field3819.method1511(93);
            int var77 = class238.field3819.method1549(arg0 ^ 0xFFFFFFFE);
            if (class320.method2049(arg0 - 26, var76)) {
                class20.method161(var75, arg0 ^ 0xD, (var77 << 16) + var74);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class107.field1499) {
            class73.field1033 = class238.field3819.method1503(94) << 3;
            class375.field5628 = class238.field3819.method1503(113) << 3;
            class531.field7751 = class238.field3819.method1523(arg0 ^ 0xE3B);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class137.field2089) {
            int var78 = class238.field3819.method1549(-2);
            int var79 = class238.field3819.method1536(127);
            String var80 = class238.field3819.method1550((byte) 28);
            if (class320.method2049(-38, var78)) {
                class396.method2500(-5, var79, var80);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class287.field4351) {
            int var81 = class238.field3819.method1511(112);
            int var82 = class238.field3819.method1556(arg0 + 114);
            if (class320.method2049(arg0 - 79, var81)) {
                class293 var83 = (class293) class70.field993.method2585((byte) 114, (long) var82);
                if (var83 != null) {
                    class218.method1568(false, arg0 - 127, true, var83);
                }
                if (class226.field3684 != null) {
                    class262.method1747(20556, class226.field3684);
                    class226.field3684 = null;
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class357.field5287 == class289.field4354) {
            int var84 = class238.field3819.method1511(126);
            int var85 = class238.field3819.method1515((byte) 126);
            boolean var86 = (var85 & 0x1) == 1;
            while (class142.field2164 > class238.field3819.field3556) {
                int var87 = class238.field3819.method1510(-129);
                int var88 = class238.field3819.method1511(-108);
                int var89 = 0;
                if (var88 != 0) {
                    var89 = class238.field3819.method1515((byte) 121);
                    if (var89 == 255) {
                        var89 = class238.field3819.method1556(125);
                    }
                }
                class300.method1942(var88 - 1, var89, var87, 0, var86, var84);
            }
            class372.field5540[class74.method644(class134.field2054++, 31)] = var84;
            class289.field4354 = null;
            return true;
        } else if (class346.field5115 == class289.field4354) {
            int var90 = class238.field3819.method1511(arg0 + 87);
            int var91 = class238.field3819.method1511(123);
            int var92 = class238.field3819.method1511(77);
            int var93 = class238.field3819.method1511(-112);
            if (class320.method2049(-18, var90) && class200.field3326[var91] != null) {
                for (int var94 = var92; var94 < var93; var94++) {
                    int var95 = class238.field3819.method1548(31529);
                    if (var94 < class200.field3326[var91].length && class200.field3326[var91][var94] != null) {
                        class200.field3326[var91][var94].field1633 = var95;
                    }
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class94.field1328 == class289.field4354) {
            class220.field3611 = class238.field3819.method1529((byte) -122);
            class289.field4354 = null;
            class127.field1857 = class152.field2263;
            return true;
        } else if (class289.field4354 == class177.field2637) {
            int var96 = class238.field3819.method1511(-66);
            int var97 = class238.field3819.method1544(false);
            if (class320.method2049(-37, var96)) {
                class393.method2474(var97, 3, -1, -1, (byte) 112);
            }
            class289.field4354 = null;
            return true;
        } else if (class372.field5539 == class289.field4354) {
            class531.field7751 = class238.field3819.method1560(-128);
            class73.field1033 = class238.field3819.method1565(true) << 3;
            class375.field5628 = class238.field3819.method1563((byte) -52) << 3;
            while (class142.field2164 > class238.field3819.field3556) {
                class195 var98 = class71.method626(arg0)[class238.field3819.method1515((byte) 122)];
                class450.method2747(var98, 2);
            }
            class289.field4354 = null;
            return true;
        } else if (class428.field6364 == class289.field4354) {
            int var99 = class238.field3819.method1511(arg0 ^ 0xFFFFFFD0);
            int var100 = class238.field3819.method1515((byte) 127);
            int var101 = class238.field3819.method1515((byte) 124);
            int var102 = class238.field3819.method1511(arg0 - 74) << 0;
            int var103 = class238.field3819.method1515((byte) 124);
            int var104 = class238.field3819.method1515((byte) 124);
            if (class320.method2049(-117, var99)) {
                class19.method158(var102, var101, var103, 66, var104, var100, true);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class287.field4350) {
            int var105 = class238.field3819.method1532((byte) -98);
            int var106 = class238.field3819.method1560(arg0 ^ 0xFFFFFF80);
            if (var105 == 255) {
                var105 = -1;
                var106 = -1;
            }
            class433.method2687(15, var105, var106);
            class289.field4354 = null;
            return true;
        } else if (class471.field6808 == class289.field4354) {
            class450.method2747(class32.field366, arg0 ^ 0x2);
            class289.field4354 = null;
            return true;
        } else if (class416.field6202 == class289.field4354) {
            int var107 = class238.field3819.method1511(-63);
            if (class320.method2049(arg0 ^ 0xFFFFFF9C, var107)) {
                class509.method3032(true);
            }
            class289.field4354 = null;
            return true;
        } else if (class443.field6517 == class289.field4354) {
            int var108 = class238.field3819.method1560(arg0 ^ 0xFFFFFF80);
            int var109 = class238.field3819.method1547(true);
            boolean var110 = (var108 & 0x1) == 1;
            class479.method2883((byte) 1, var109, var110);
            class372.field5540[class74.method644(class134.field2054++, 31)] = var109;
            class289.field4354 = null;
            return true;
        } else if (class366.field5391 == class289.field4354) {
            class450.method2747(class74.field1064, 2);
            class289.field4354 = null;
            return true;
        } else if (class91.field1300 == class289.field4354) {
            int var111 = class238.field3819.method1510(-129);
            int var112 = class238.field3819.method1556(125);
            int var113 = class238.field3819.method1515((byte) 122);
            String var114 = "";
            String var115 = var114;
            if ((var113 & 0x1) != 0) {
                var114 = class238.field3819.method1550((byte) 28);
                if ((var113 & 0x2) == 0) {
                    var115 = var114;
                } else {
                    var115 = class238.field3819.method1550((byte) 28);
                }
            }
            String var116 = class238.field3819.method1550((byte) 28);
            if (var111 == 99) {
                class6.method33((byte) 15, var116);
            } else if (var115.equals("") || !class59.method525(var115, arg0 ^ 0xFFFF82B9)) {
                class475.method2854(var116, var112, var115, arg0 - 127, var114, var111);
            } else {
                class289.field4354 = null;
                return true;
            }
            class289.field4354 = null;
            return true;
        } else if (class88.field1256 == class289.field4354) {
            class350.field5176 = class238.field3819.method1511(arg0 ^ 0xFFFFFFD8) * 30;
            class127.field1857 = class152.field2263;
            class289.field4354 = null;
            return true;
        } else if (class529.field7732 == class289.field4354) {
            int var117 = class238.field3819.method1547(true);
            if (var117 == 65535) {
                var117 = -1;
            }
            int var118 = class238.field3819.method1549(arg0 ^ 0xFFFFFFFE);
            int var119 = class238.field3819.method1518((byte) -107);
            if (class320.method2049(arg0 - 113, var118)) {
                class393.method2474(var119, 2, var117, -1, (byte) 118);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class257.field3935) {
            class450.method2747(class135.field2058, arg0 + 2);
            class289.field4354 = null;
            return true;
        } else if (class336.field5000 == class289.field4354) {
            boolean var120 = class238.field3819.method1515((byte) 127) == 1;
            String var121 = class238.field3819.method1550((byte) 28);
            String var122 = var121;
            if (var120) {
                var122 = class238.field3819.method1550((byte) 28);
            }
            long var123 = class238.field3819.method1520((byte) 105);
            long var125 = (long) class238.field3819.method1511(-105);
            long var127 = (long) class238.field3819.method1548(31529);
            int var129 = class238.field3819.method1515((byte) 125);
            int var130 = class238.field3819.method1511(-87);
            long var131 = (var125 << 32) + var127;
            boolean var133 = false;
            int var134 = 0;
            while (true) {
                if (var134 >= 100) {
                    if (var129 <= 1 && class59.method525(var122, arg0 ^ 0xFFFF82B9)) {
                        var133 = true;
                    }
                    break;
                }
                if (class251.field3894[var134] == var131) {
                    var133 = true;
                    break;
                }
                var134++;
            }
            if (!var133 && class398.field5950 == 0) {
                class251.field3894[class444.field6526] = var131;
                class444.field6526 = (class444.field6526 + 1) % 100;
                String var135 = class507.field7412.method963(var130, (byte) 87).method1820(51, class238.field3819);
                if (var129 == 2) {
                    class398.method2507("<img=1>" + var122, "<img=1>" + var121, var135, 20, false, class504.method3004(var123, -110), var130, 0);
                } else if (var129 == 1) {
                    class398.method2507("<img=0>" + var122, "<img=0>" + var121, var135, 20, false, class504.method3004(var123, arg0 ^ 0xFFFFFFB2), var130, 0);
                } else {
                    class398.method2507(var122, var121, var135, 20, false, class504.method3004(var123, 53), var130, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class150.field2244) {
            int var136 = class238.field3819.method1515((byte) 125);
            if (class238.field3819.method1515((byte) 125) == 0) {
                class329.field4948[var136] = new class476();
            } else {
                class238.field3819.field3556--;
                class329.field4948[var136] = new class476(class238.field3819);
            }
            class510.field7460 = class152.field2263;
            class289.field4354 = null;
            return true;
        } else if (class498.field7154 == class289.field4354) {
            class450.method2747(class456.field6642, arg0 + 2);
            class289.field4354 = null;
            return true;
        } else if (class508.field7445 == class289.field4354) {
            class403.field5984 = class238.field3819.method1515((byte) 123);
            class127.field1857 = class152.field2263;
            class289.field4354 = null;
            return true;
        } else if (class468.field6762 == class289.field4354) {
            class450.method2747(class1.field5, arg0 ^ 0x2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class266.field4082) {
            if (class168.field2489 != null) {
                class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) -125);
            }
            byte[] var137 = new byte[class142.field2164];
            class238.field3819.method1754(0, var137, class142.field2164, -80);
            String var138 = class153.method1052(0, class142.field2164, var137, (byte) -39);
            class136.method990(class96.field1384 == 1, class360.field5349, true, var138, false);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class225.field3677) {
            int var139 = class238.field3819.method1518((byte) -79);
            int var140 = class238.field3819.method1549(-2);
            int var141 = class238.field3819.method1512((byte) 125);
            if (class320.method2049(-69, var140)) {
                class223.method1594(var139, arg0 ^ 0xE, var141);
            }
            class289.field4354 = null;
            return true;
        } else if (class337.field5008 == class289.field4354) {
            int var142 = class238.field3819.method1556(arg0 + 109);
            int var143 = class238.field3819.method1560(arg0 ^ 0xFFFFFF80);
            int var144 = class238.field3819.method1511(arg0 ^ 0xFFFFFFB5);
            if (class320.method2049(-84, var144)) {
                class178.method1195(var142, -27263, var143);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class234.field3777) {
            int var145 = class238.field3819.method1544(false);
            int var146 = class238.field3819.method1532((byte) 85);
            int var147 = class238.field3819.method1532((byte) 0);
            class523.field7653[var147] = var145;
            class134.field2047[var147] = var146;
            class422.field6293[var147] = 1;
            int var148 = class424.field6314[var147] - 1;
            for (int var149 = 0; var149 < var148; var149++) {
                if (var145 >= class402.field5975[var149]) {
                    class422.field6293[var147] = var149 + 2;
                }
            }
            class221.field3627[class74.method644(class266.field4083++, 31)] = var147;
            class289.field4354 = null;
            return true;
        } else if (class94.field1327 == class289.field4354) {
            int var150 = class238.field3819.method1511(arg0 + 114);
            int var151 = class238.field3819.method1560(-128);
            int var152 = class238.field3819.method1511(114);
            if (class320.method2049(arg0 - 99, var150)) {
                if (var151 == 2) {
                    class386.method2414(10);
                }
                class155.field2310 = var152;
                class127.method929(var152, (byte) 119);
                class128.method939(465824240, false);
                class192.method1352(class155.field2310);
                for (int var153 = 0; var153 < 100; var153++) {
                    class277.field4219[var153] = true;
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class109.field1520) {
            class491.method2915(true, (byte) -116);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class264.field4057) {
            if (class155.field2310 != -1) {
                class129.method944(class155.field2310, 1031, 0);
            }
            class289.field4354 = null;
            return true;
        } else if (class484.field6968 == class289.field4354) {
            class195.field3271.method2132(121);
            class289.field4354 = null;
            class112.field1568 += 32;
            return true;
        } else if (class289.field4354 == class17.field221) {
            boolean var154 = class238.field3819.method1515((byte) 124) == 1;
            String var155 = class238.field3819.method1550((byte) 28);
            String var156 = var155;
            if (var154) {
                var156 = class238.field3819.method1550((byte) 28);
            }
            long var157 = class238.field3819.method1520((byte) 79);
            long var159 = (long) class238.field3819.method1511(arg0 + 94);
            long var161 = (long) class238.field3819.method1548(31529);
            int var163 = class238.field3819.method1515((byte) 124);
            long var164 = (var159 << 32) + var161;
            boolean var166 = false;
            int var167 = 0;
            while (true) {
                if (var167 >= 100) {
                    if (var163 <= 1) {
                        if (!(!class363.field5366 || class382.field5751) || class412.field6177) {
                            var166 = true;
                        } else if (class59.method525(var156, arg0 ^ 0xFFFF82B9)) {
                            var166 = true;
                        }
                    }
                    break;
                }
                if (class251.field3894[var167] == var164) {
                    var166 = true;
                    break;
                }
                var167++;
            }
            if (!var166 && class398.field5950 == 0) {
                class251.field3894[class444.field6526] = var164;
                class444.field6526 = (class444.field6526 + 1) % 100;
                String var168 = class169.method1133(class517.method3067(class238.field3819, (byte) -94), arg0 + 115);
                if (var163 == 2 || var163 == 3) {
                    class398.method2507("<img=1>" + var156, "<img=1>" + var155, var168, 9, false, class504.method3004(var157, -115), -1, 0);
                } else if (var163 == 1) {
                    class398.method2507("<img=0>" + var156, "<img=0>" + var155, var168, 9, false, class504.method3004(var157, -118), -1, 0);
                } else {
                    class398.method2507(var156, var155, var168, 9, false, class504.method3004(var157, arg0 + 58), -1, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class131.field2008) {
            String var169 = class238.field3819.method1550((byte) 28);
            boolean var170 = class238.field3819.method1515((byte) 122) == 1;
            String var171;
            if (var170) {
                var171 = class238.field3819.method1550((byte) 28);
            } else {
                var171 = var169;
            }
            int var172 = class238.field3819.method1511(-75);
            byte var173 = class238.field3819.method1565(true);
            boolean var174 = false;
            if (var173 == -128) {
                var174 = true;
            }
            if (var174) {
                if (class505.field7375 == 0) {
                    class289.field4354 = null;
                    return true;
                }
                boolean var175 = false;
                int var176;
                for (var176 = 0; var176 < class505.field7375 && (!class285.field4333[var176].field7755.equals(var171) || class285.field4333[var176].field7756 != var172); var176++) {
                }
                if (var176 < class505.field7375) {
                    while (var176 < class505.field7375 - 1) {
                        class285.field4333[var176] = class285.field4333[var176 + 1];
                        var176++;
                    }
                    class505.field7375--;
                    class285.field4333[class505.field7375] = null;
                }
            } else {
                String var177 = class238.field3819.method1550((byte) 28);
                class531 var178 = new class531();
                var178.field7754 = var169;
                var178.field7755 = var171;
                var178.field7757 = class38.method286(var178.field7755, true);
                var178.field7750 = var173;
                var178.field7758 = var177;
                var178.field7756 = var172;
                int var179;
                for (var179 = class505.field7375 - 1; var179 >= 0; var179--) {
                    int var180 = class285.field4333[var179].field7757.compareTo(var178.field7757);
                    if (var180 == 0) {
                        class285.field4333[var179].field7756 = var172;
                        class285.field4333[var179].field7750 = var173;
                        class285.field4333[var179].field7758 = var177;
                        if (var171.equals(class398.field5947.field2660)) {
                            class179.field2700 = var173;
                        }
                        class289.field4354 = null;
                        class150.field2242 = class152.field2263;
                        return true;
                    }
                    if (var180 < 0) {
                        break;
                    }
                }
                if (class505.field7375 >= class285.field4333.length) {
                    class289.field4354 = null;
                    return true;
                }
                for (int var181 = class505.field7375 - 1; var181 > var179; var181--) {
                    class285.field4333[var181 + 1] = class285.field4333[var181];
                }
                if (class505.field7375 == 0) {
                    class285.field4333 = new class531[100];
                }
                class285.field4333[var179 + 1] = var178;
                class505.field7375++;
                if (var171.equals(class398.field5947.field2660)) {
                    class179.field2700 = var173;
                }
            }
            class289.field4354 = null;
            class150.field2242 = class152.field2263;
            return true;
        } else if (class65.field849 == class289.field4354) {
            class450.method2747(class383.field5770, 2);
            class289.field4354 = null;
            return true;
        } else if (class97.field1391 == class289.field4354) {
            class450.method2747(class263.field4049, 2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class171.field2548) {
            class450.method2747(class285.field4327, 2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class103.field1482) {
            int var182 = class238.field3819.method1549(arg0 ^ 0xFFFFFFFE);
            int var183 = class238.field3819.method1547(true);
            int var184 = class238.field3819.method1536(127);
            if (class320.method2049(-64, var183)) {
                class27.method188(var184, var182, (byte) -124);
            }
            class289.field4354 = null;
            return true;
        } else if (class78.field1128 == class289.field4354) {
            int var185 = class238.field3819.method1512((byte) 116);
            if (var185 == 65535) {
                var185 = -1;
            }
            int var186 = class238.field3819.method1547(true);
            int var187 = class238.field3819.method1556(arg0 + 104);
            if (class320.method2049(-46, var186)) {
                class375.method2357(var187, var185, (byte) -27);
            }
            class289.field4354 = null;
            return true;
        } else if (class402.field5969 == class289.field4354) {
            int var188 = class238.field3819.method1512((byte) 103);
            int var189 = class238.field3819.method1536(arg0 + 127);
            int var190 = class238.field3819.method1544(false);
            if (class320.method2049(-91, var188)) {
                class293 var191 = (class293) class70.field993.method2585((byte) 114, (long) var189);
                class293 var192 = (class293) class70.field993.method2585((byte) 114, (long) var190);
                if (var192 != null) {
                    class218.method1568(false, -122, var191 == null || var191.field4454 != var192.field4454, var192);
                }
                if (var191 != null) {
                    var191.method2677(-22491);
                    class70.field993.method2591((long) var190, var191, (byte) -113);
                }
                class114 var193 = class475.method2864(true, var189);
                if (var193 != null) {
                    class262.method1747(arg0 ^ 0x504C, var193);
                }
                class114 var194 = class475.method2864(true, var190);
                if (var194 != null) {
                    class262.method1747(20556, var194);
                    class216.method1499((byte) 87, true, var194);
                }
                if (class155.field2310 != -1) {
                    class129.method944(class155.field2310, 1031, 1);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class424.field6316 == class289.field4354) {
            int var195 = class238.field3819.method1515((byte) 122);
            int var196 = class238.field3819.method1549(arg0 - 2);
            class195.field3271.method2127(var195, false, var196);
            class289.field4354 = null;
            return true;
        } else if (class429.field6376 == class289.field4354) {
            int var197 = class238.field3819.method1512((byte) 109);
            int var198 = class238.field3819.method1536(arg0 + 127);
            int var199 = class238.field3819.method1521((byte) -117);
            int var200 = class238.field3819.method1521((byte) -103);
            if (class320.method2049(-20, var197)) {
                class401.method2511((byte) -63, var199, var200, var198);
            }
            class289.field4354 = null;
            return true;
        } else if (class346.field5119 == class289.field4354) {
            int var201 = class238.field3819.method1556(106);
            class514.field7471 = class360.field5349.method2185(-1732301360, var201);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class233.field3769) {
            int var202 = class238.field3819.method1512((byte) 108);
            int var203 = class238.field3819.method1560(-128);
            if (class320.method2049(-117, var202)) {
                class296.field4509 = var203;
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class147.field2234) {
            int var204 = class238.field3819.method1547(true);
            int var205 = class238.field3819.method1512((byte) 104);
            byte var206 = class238.field3819.method1528((byte) 49);
            if (class320.method2049(-22, var204)) {
                class510.method3035((byte) 1, var206, var205);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class178.field2684) {
            int var207 = class238.field3819.method1549(-2);
            int var208 = class238.field3819.method1518((byte) -88);
            int var209 = class238.field3819.method1511(-103);
            if (class320.method2049(-27, var207)) {
                class510.method3035((byte) 1, var208, var209);
            }
            class289.field4354 = null;
            return true;
        } else if (class523.field7648 == class289.field4354) {
            class491.method2915(false, (byte) -128);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class226.field3690) {
            int var210 = class238.field3819.method1512((byte) 110);
            int var211 = class238.field3819.method1511(109);
            int var212 = class238.field3819.method1547(true);
            if (class320.method2049(-59, var210)) {
                class237.method1643(var212, 0, 2, var211);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class146.field2226) {
            class289.field4355 = class238.field3819.method1560(-128);
            class320.field4817 = class238.field3819.method1532((byte) 127);
            class289.field4354 = null;
            return true;
        } else if (class89.field1270 == class289.field4354) {
            String var213 = class238.field3819.method1550((byte) 28);
            int var214 = class238.field3819.method1511(arg0 ^ 0x4D);
            String var215 = class507.field7412.method963(var214, (byte) 87).method1820(arg0 ^ 0x18, class238.field3819);
            class398.method2507(var213, var213, var215, 19, false, null, var214, 0);
            class289.field4354 = null;
            return true;
        } else if (class48.field624 == class289.field4354) {
            boolean var216 = class238.field3819.method1515((byte) 124) == 1;
            String var217 = class238.field3819.method1550((byte) 28);
            String var218 = var217;
            if (var216) {
                var218 = class238.field3819.method1550((byte) 28);
            }
            long var219 = (long) class238.field3819.method1511(-85);
            long var221 = (long) class238.field3819.method1548(31529);
            int var223 = class238.field3819.method1515((byte) 123);
            int var224 = class238.field3819.method1511(102);
            long var225 = (var219 << 32) + var221;
            boolean var227 = false;
            int var228 = 0;
            while (true) {
                if (var228 >= 100) {
                    if (var223 <= 1 && class59.method525(var218, -32071)) {
                        var227 = true;
                    }
                    break;
                }
                if (class251.field3894[var228] == var225) {
                    var227 = true;
                    break;
                }
                var228++;
            }
            if (!var227 && class398.field5950 == 0) {
                class251.field3894[class444.field6526] = var225;
                class444.field6526 = (class444.field6526 + 1) % 100;
                String var229 = class507.field7412.method963(var224, (byte) 87).method1820(75, class238.field3819);
                if (var223 == 2) {
                    class398.method2507("<img=1>" + var218, "<img=1>" + var217, var229, 18, false, null, var224, 0);
                } else if (var223 == 1) {
                    class398.method2507("<img=0>" + var218, "<img=0>" + var217, var229, 18, false, null, var224, 0);
                } else {
                    class398.method2507(var218, var217, var229, 18, false, null, var224, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class128.field1871) {
            int var230 = class238.field3819.method1515((byte) 121);
            boolean var231 = (var230 & 0x1) == 1;
            String var232 = class238.field3819.method1550((byte) 28);
            String var233 = class238.field3819.method1550((byte) 28);
            if (var233.equals("")) {
                var233 = var232;
            }
            String var234 = class238.field3819.method1550((byte) 28);
            String var235 = class238.field3819.method1550((byte) 28);
            if (var235.equals("")) {
                var235 = var234;
            }
            if (var231) {
                for (int var236 = 0; var236 < class327.field4923; var236++) {
                    if (class93.field1318[var236].equals(var235)) {
                        class257.field3933[var236] = var232;
                        class93.field1318[var236] = var233;
                        class210.field3435[var236] = var234;
                        class436.field6442[var236] = var235;
                        break;
                    }
                }
            } else {
                class257.field3933[class327.field4923] = var232;
                class93.field1318[class327.field4923] = var233;
                class210.field3435[class327.field4923] = var234;
                class436.field6442[class327.field4923] = var235;
                class426.field6348[class327.field4923] = class74.method644(2, var230) == 2;
                class327.field4923++;
            }
            class534.field7856 = class152.field2263;
            class289.field4354 = null;
            return true;
        } else if (class447.field6550 == class289.field4354) {
            boolean var237 = class238.field3819.method1515((byte) 126) == 1;
            byte[] var238 = new byte[class142.field2164 - 1];
            class238.field3819.method1540(0, var238, class142.field2164 - 1, 91);
            class442.method2714((byte) -78, var238, var237);
            class289.field4354 = null;
            return true;
        } else if (class419.field6259 == class289.field4354) {
            class327.field4923 = class238.field3819.method1515((byte) 124);
            for (int var239 = 0; var239 < class327.field4923; var239++) {
                class257.field3933[var239] = class238.field3819.method1550((byte) 28);
                class93.field1318[var239] = class238.field3819.method1550((byte) 28);
                if (class93.field1318[var239].equals("")) {
                    class93.field1318[var239] = class257.field3933[var239];
                }
                class210.field3435[var239] = class238.field3819.method1550((byte) 28);
                class436.field6442[var239] = class238.field3819.method1550((byte) 28);
                if (class436.field6442[var239].equals("")) {
                    class436.field6442[var239] = class210.field3435[var239];
                }
                class426.field6348[var239] = false;
            }
            class289.field4354 = null;
            class534.field7856 = class152.field2263;
            return true;
        } else if (class289.field4354 == class139.field2124) {
            class421.method2627((byte) 90);
            class289.field4354 = null;
            return false;
        } else if (class289.field4354 == class237.field3798) {
            class450.method2747(class421.field6273, 2);
            class289.field4354 = null;
            return true;
        } else if (class403.field5983 == class289.field4354) {
            int var240 = class238.field3819.method1518((byte) -99);
            int var241 = class238.field3819.method1511(arg0 + 106);
            class195.field3271.method2128((byte) -105, var240, var241);
            class289.field4354 = null;
            return true;
        } else if (class348.field5148 == class289.field4354) {
            int var242 = class238.field3819.method1536(arg0 + 127);
            int var243 = class238.field3819.method1549(-2);
            class195.field3271.method2127(var242, false, var243);
            class289.field4354 = null;
            return true;
        } else if (class45.field569 == class289.field4354) {
            int var244 = class238.field3819.method1549(-2);
            if (var244 == 65535) {
                var244 = -1;
            }
            int var245 = class238.field3819.method1547(true);
            if (var245 == 65535) {
                var245 = -1;
            }
            int var246 = class238.field3819.method1544(false);
            int var247 = class238.field3819.method1549(-2);
            int var248 = class238.field3819.method1512((byte) 116);
            if (class320.method2049(arg0 ^ 0xFFFFFF9D, var248)) {
                for (int var249 = var244; var249 <= var245; var249++) {
                    long var250 = ((long) var246 << 32) + (long) var249;
                    class386 var252 = (class386) class459.field6685.method2585((byte) 114, var250);
                    class386 var253;
                    if (var252 != null) {
                        var253 = new class386(var252.field5805, var247);
                        var252.method2677(-22491);
                    } else if (var249 == -1) {
                        var253 = new class386(class475.method2864(true, var246).field1651.field5805, var247);
                    } else {
                        var253 = new class386(0, var247);
                    }
                    class459.field6685.method2591(var250, var253, (byte) -120);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class530.field7737 == class289.field4354) {
            class9.method69(0);
            class289.field4354 = null;
            return false;
        } else if (class76.field1098 == class289.field4354) {
            class417.method2613(class393.field5869, -34);
            class289.field4354 = null;
            return false;
        } else if (class289.field4354 == class2.field6) {
            boolean var254 = class238.field3819.method1515((byte) 123) == 1;
            String var255 = class238.field3819.method1550((byte) 28);
            String var256 = var255;
            if (var254) {
                var256 = class238.field3819.method1550((byte) 28);
            }
            int var257 = class238.field3819.method1515((byte) 123);
            int var258 = class238.field3819.method1511(101);
            boolean var259 = false;
            if (var257 <= 1 && class59.method525(var256, arg0 ^ 0xFFFF82B9)) {
                var259 = true;
            }
            if (!var259 && class398.field5950 == 0) {
                String var260 = class507.field7412.method963(var258, (byte) 87).method1820(arg0 + 97, class238.field3819);
                if (var257 == 2) {
                    class398.method2507("<img=1>" + var256, "<img=1>" + var255, var260, 25, false, null, var258, 0);
                } else if (var257 == 1) {
                    class398.method2507("<img=0>" + var256, "<img=0>" + var255, var260, 25, false, null, var258, 0);
                } else {
                    class398.method2507(var256, var255, var260, 25, false, null, var258, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class424.field6320 == class289.field4354) {
            class150.field2242 = class152.field2263;
            if (class142.field2164 == 0) {
                class289.field4354 = null;
                class200.field3327 = null;
                class505.field7375 = 0;
                class285.field4333 = null;
                class25.field315 = null;
                return true;
            }
            class200.field3327 = class238.field3819.method1550((byte) 28);
            boolean var261 = class238.field3819.method1515((byte) 121) == 1;
            if (var261) {
                class238.field3819.method1550((byte) 28);
            }
            long var262 = class238.field3819.method1520((byte) 104);
            class25.field315 = class149.method1040(var262, 37);
            class338.field5041 = class238.field3819.method1565(true);
            int var264 = class238.field3819.method1515((byte) 127);
            if (var264 == 255) {
                class289.field4354 = null;
                return true;
            }
            class505.field7375 = var264;
            class531[] var265 = new class531[100];
            for (int var266 = 0; var266 < class505.field7375; var266++) {
                var265[var266] = new class531();
                var265[var266].field7754 = class238.field3819.method1550((byte) 28);
                boolean var272 = class238.field3819.method1515((byte) 126) == 1;
                if (var272) {
                    var265[var266].field7755 = class238.field3819.method1550((byte) 28);
                } else {
                    var265[var266].field7755 = var265[var266].field7754;
                }
                var265[var266].field7757 = class38.method286(var265[var266].field7755, true);
                var265[var266].field7756 = class238.field3819.method1511(108);
                var265[var266].field7750 = class238.field3819.method1565(true);
                var265[var266].field7758 = class238.field3819.method1550((byte) 28);
                if (var265[var266].field7755.equals(class398.field5947.field2660)) {
                    class179.field2700 = var265[var266].field7750;
                }
            }
            boolean var267 = false;
            int var268 = class505.field7375;
            while (var268 > 0) {
                boolean var269 = true;
                var268--;
                for (int var270 = 0; var270 < var268; var270++) {
                    if (var265[var270].field7757.compareTo(var265[var270 + 1].field7757) > 0) {
                        class531 var271 = var265[var270];
                        var265[var270] = var265[var270 + 1];
                        var269 = false;
                        var265[var270 + 1] = var271;
                    }
                }
                if (var269) {
                    break;
                }
            }
            class285.field4333 = var265;
            class289.field4354 = null;
            return true;
        } else if (class301.field4571 == class289.field4354) {
            int var273 = class238.field3819.method1511(82);
            int var274 = class238.field3819.method1515((byte) 127);
            boolean var275 = (var274 & 0x1) == 1;
            class297.method1927(var275, -123, var273);
            int var276 = class238.field3819.method1511(-22);
            for (int var277 = 0; var277 < var276; var277++) {
                int var278 = class238.field3819.method1547(true);
                int var279 = class238.field3819.method1523(3643);
                if (var279 == 255) {
                    var279 = class238.field3819.method1536(arg0 + 127);
                }
                class300.method1942(var278 - 1, var279, var277, 0, var275, var273);
            }
            class372.field5540[class74.method644(31, class134.field2054++)] = var273;
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class1.field4) {
            int var280 = class238.field3819.method1547(true);
            int var281 = class238.field3819.method1536(arg0 + 127);
            int var282 = class238.field3819.method1547(true);
            if (var282 == 65535) {
                var282 = -1;
            }
            int var283 = class238.field3819.method1518((byte) -101);
            if (class320.method2049(arg0 ^ 0xFFFFFF94, var280)) {
                class39.method373(var283, var281, -73, var282);
                class532 var284 = class390.field5847.method467((byte) -101, var282);
                class135.method987(var284.field7827, var284.field7787, var283, -115, var284.field7796);
                class502.method2985(-115, var284.field7794, var283, var284.field7788, var284.field7780);
            }
            class289.field4354 = null;
            return true;
        } else if (class389.field5838 == class289.field4354) {
            while (class238.field3819.field3556 < class142.field2164) {
                boolean var295 = class238.field3819.method1515((byte) 125) == 1;
                String var296 = class238.field3819.method1550((byte) 28);
                String var297 = class238.field3819.method1550((byte) 28);
                int var298 = class238.field3819.method1511(-67);
                int var299 = class238.field3819.method1515((byte) 121);
                String var300 = "";
                boolean var301 = false;
                if (var298 > 0) {
                    var300 = class238.field3819.method1550((byte) 28);
                    var301 = class238.field3819.method1515((byte) 125) == 1;
                }
                for (int var302 = 0; var302 < class64.field785; var302++) {
                    if (var295) {
                        if (var297.equals(class221.field3622[var302])) {
                            class221.field3622[var302] = var296;
                            var296 = null;
                            field7207[var302] = var297;
                            break;
                        }
                    } else if (var296.equals(class221.field3622[var302])) {
                        if (class240.field3837[var302] != var298) {
                            boolean var303 = true;
                            for (class160 var304 = (class160) class353.field5232.method1958(arg0 ^ 0x47); var304 != null; var304 = (class160) class353.field5232.method1961(101)) {
                                if (var304.field2391.equals(var296)) {
                                    if (var298 != 0 && var304.field2394 == 0) {
                                        var304.method526((byte) 117);
                                        var303 = false;
                                    } else if (var298 == 0 && var304.field2394 != 0) {
                                        var304.method526((byte) 106);
                                        var303 = false;
                                    }
                                }
                            }
                            if (var303) {
                                class353.field5232.method1957(-10, new class160(var296, var298));
                            }
                            class240.field3837[var302] = var298;
                        }
                        field7207[var302] = var297;
                        class465.field6734[var302] = var300;
                        class46.field598[var302] = var299;
                        var296 = null;
                        class135.field2055[var302] = var301;
                        break;
                    }
                }
                if (var296 != null && class64.field785 < 200) {
                    class221.field3622[class64.field785] = var296;
                    field7207[class64.field785] = var297;
                    class240.field3837[class64.field785] = var298;
                    class465.field6734[class64.field785] = var300;
                    class46.field598[class64.field785] = var299;
                    class135.field2055[class64.field785] = var301;
                    class64.field785++;
                }
            }
            class32.field374 = 2;
            class534.field7856 = class152.field2263;
            boolean var285 = false;
            int var286 = class64.field785;
            while (var286 > 0) {
                boolean var287 = true;
                var286--;
                for (int var288 = 0; var288 < var286; var288++) {
                    if (class240.field3837[var288] != class283.field4310.field6307 && class240.field3837[var288 + 1] == class283.field4310.field6307 || class240.field3837[var288] == 0 && class240.field3837[var288 + 1] != 0) {
                        int var289 = class240.field3837[var288];
                        class240.field3837[var288] = class240.field3837[var288 + 1];
                        class240.field3837[var288 + 1] = var289;
                        String var290 = class465.field6734[var288];
                        class465.field6734[var288] = class465.field6734[var288 + 1];
                        class465.field6734[var288 + 1] = var290;
                        String var291 = class221.field3622[var288];
                        class221.field3622[var288] = class221.field3622[var288 + 1];
                        class221.field3622[var288 + 1] = var291;
                        String var292 = field7207[var288];
                        field7207[var288] = field7207[var288 + 1];
                        field7207[var288 + 1] = var292;
                        int var293 = class46.field598[var288];
                        class46.field598[var288] = class46.field598[var288 + 1];
                        class46.field598[var288 + 1] = var293;
                        boolean var294 = class135.field2055[var288];
                        class135.field2055[var288] = class135.field2055[var288 + 1];
                        var287 = false;
                        class135.field2055[var288 + 1] = var294;
                    }
                }
                if (var287) {
                    break;
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class459.field6686 == class289.field4354) {
            class238.field3819.field3556 += 28;
            if (class238.field3819.method1551(-128)) {
                class108.method830(class238.field3819.field3556 - 28, 1392, class238.field3819);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class157.field2372) {
            class450.method2747(class378.field5704, 2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class146.field2222) {
            class450.method2747(class156.field2336, arg0 ^ 0x2);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class207.field3395) {
            int var305 = class238.field3819.method1518((byte) -77);
            int var306 = class238.field3819.method1549(arg0 - 2);
            if (var306 == 65535) {
                var306 = -1;
            }
            int var307 = class238.field3819.method1511(119);
            if (class320.method2049(arg0 - 40, var307)) {
                class393.method2474(var305, 1, var306, -1, (byte) 95);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class25.field311) {
            int var308 = class238.field3819.method1549(-2);
            String var309 = class238.field3819.method1550((byte) 28);
            int var310 = class238.field3819.method1511(127);
            if (class320.method2049(arg0 ^ 0xFFFFFFEA, var308)) {
                class495.method2942(var309, arg0 ^ 0x32, var310);
            }
            class289.field4354 = null;
            return true;
        } else if (class484.field6961 == class289.field4354) {
            byte var311 = class238.field3819.method1528((byte) -87);
            int var312 = class238.field3819.method1547(true);
            class195.field3271.method2128((byte) -105, var311, var312);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class147.field2232) {
            boolean var313 = class238.field3819.method1515((byte) 125) == 1;
            String var314 = class238.field3819.method1550((byte) 28);
            String var315 = var314;
            if (var313) {
                var315 = class238.field3819.method1550((byte) 28);
            }
            long var316 = (long) class238.field3819.method1511(86);
            long var318 = (long) class238.field3819.method1548(arg0 + 31529);
            int var320 = class238.field3819.method1515((byte) 127);
            long var321 = (var316 << 32) + var318;
            boolean var323 = false;
            int var324 = 0;
            while (true) {
                if (var324 >= 100) {
                    if (var320 <= 1) {
                        if (!(!class363.field5366 || class382.field5751) || class412.field6177) {
                            var323 = true;
                        } else if (class59.method525(var315, arg0 ^ 0xFFFF82B9)) {
                            var323 = true;
                        }
                    }
                    break;
                }
                if (class251.field3894[var324] == var321) {
                    var323 = true;
                    break;
                }
                var324++;
            }
            if (!var323 && class398.field5950 == 0) {
                class251.field3894[class444.field6526] = var321;
                class444.field6526 = (class444.field6526 + 1) % 100;
                String var325 = class169.method1133(class517.method3067(class238.field3819, (byte) -94), 108);
                if (var320 == 2) {
                    class398.method2507("<img=1>" + var315, "<img=1>" + var314, var325, 7, false, null, -1, 0);
                } else if (var320 == 1) {
                    class398.method2507("<img=0>" + var315, "<img=0>" + var314, var325, 7, false, null, -1, 0);
                } else {
                    class398.method2507(var315, var314, var325, 3, false, null, -1, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class201.field3343) {
            int var326 = class238.field3819.method1511(78);
            if (class320.method2049(-36, var326)) {
                class474.method2853((byte) 30);
            }
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class199.field3320) {
            int var327 = class238.field3819.method1512((byte) 104);
            int var328 = class238.field3819.method1512((byte) 104);
            String var329 = class238.field3819.method1550((byte) 28);
            if (class320.method2049(arg0 ^ 0xFFFFFFE8, var328)) {
                class495.method2942(var329, 50, var327);
            }
            class289.field4354 = null;
            return true;
        } else if (class377.field5693 == class289.field4354) {
            class450.method2747(class231.field3745, 2);
            class289.field4354 = null;
            return true;
        } else if (class99.field1416 == class289.field4354) {
            class450.method2747(class320.field4813, 2);
            class289.field4354 = null;
            return true;
        } else if (class355.field5259 == class289.field4354) {
            class347.method2162(class142.field2164, class238.field3819, false);
            class289.field4354 = null;
            return true;
        } else if (class486.field7005 == class289.field4354) {
            class364.field5384 = class238.field3819.method1515((byte) 125);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class146.field2228) {
            int var330 = class238.field3819.method1511(119);
            int var331 = class238.field3819.method1515((byte) 124);
            int var332 = class238.field3819.method1515((byte) 126);
            int var333 = class238.field3819.method1515((byte) 124);
            int var334 = class238.field3819.method1515((byte) 127);
            int var335 = class238.field3819.method1511(arg0 ^ 0x66);
            if (class320.method2049(-84, var330)) {
                class407.field6059[var331] = true;
                class109.field1528[var331] = var332;
                class26.field323[var331] = var333;
                class315.field4747[var331] = var334;
                class432.field6405[var331] = var335;
            }
            class289.field4354 = null;
            return true;
        } else if (class452.field6601 == class289.field4354) {
            class475.method2865(127);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class267.field4084) {
            int var336 = class238.field3819.method1523(arg0 ^ 0xE3B);
            int var337 = class238.field3819.method1512((byte) 111);
            if (var337 == 65535) {
                var337 = -1;
            }
            int var338 = class238.field3819.method1560(arg0 - 128);
            String var339 = class238.field3819.method1550((byte) 28);
            if (var338 >= 1 && var338 <= 8) {
                if (var339.equalsIgnoreCase("null")) {
                    var339 = null;
                }
                class18.field232[var338 - 1] = var339;
                class118.field1790[var338 - 1] = var337;
                class53.field657[var338 - 1] = var336 == 0;
            }
            class289.field4354 = null;
            return true;
        } else if (class398.field5953 == class289.field4354) {
            int var340 = class238.field3819.method1512((byte) 117);
            if (var340 == 65535) {
                var340 = -1;
            }
            int var341 = class238.field3819.method1512((byte) 114);
            int var342 = class238.field3819.method1512((byte) 106);
            if (var342 == 65535) {
                var342 = -1;
            }
            int var343 = class238.field3819.method1556(arg0 ^ 0x75);
            int var344 = class238.field3819.method1556(120);
            if (class320.method2049(-69, var341)) {
                for (int var345 = var340; var345 <= var342; var345++) {
                    long var346 = ((long) var344 << 32) + (long) var345;
                    class386 var348 = (class386) class459.field6685.method2585((byte) 114, var346);
                    class386 var349;
                    if (var348 != null) {
                        var349 = new class386(var343, var348.field5802);
                        var348.method2677(arg0 ^ 0xFFFFA825);
                    } else if (var345 == -1) {
                        var349 = new class386(var343, class475.method2864(true, var344).field1651.field5802);
                    } else {
                        var349 = new class386(var343, -1);
                    }
                    class459.field6685.method2591(var346, var349, (byte) -1);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class55.field679 == class289.field4354) {
            int var350 = class238.field3819.method1523(arg0 ^ 0xE3B);
            int var351 = class238.field3819.method1511(-112);
            int var352 = class238.field3819.method1549(arg0 - 2);
            class116 var353 = class153.field2265[var352];
            if (var353 != null) {
                class476.method2868(-128, var351, var353, var350);
            }
            class289.field4354 = null;
            return true;
        } else if (class473.field6824 == class289.field4354) {
            class450.method2747(class379.field5715, 2);
            class289.field4354 = null;
            return true;
        } else if (class363.field5376 == class289.field4354) {
            int var354 = class238.field3819.method1511(arg0 + 120);
            if (var354 == 65535) {
                var354 = -1;
            }
            int var355 = class238.field3819.method1515((byte) 123);
            int var356 = class238.field3819.method1511(86);
            int var357 = class238.field3819.method1515((byte) 126);
            class351.method2182(125, var355, var354, var356, var357);
            class289.field4354 = null;
            return true;
        } else if (class398.field5954 == class289.field4354) {
            class411.field6113 = class142.field2164 > 2 ? class238.field3819.method1550((byte) 28) : class433.field6411.method1635(class224.field3673, (byte) 31);
            class259.field3976 = class142.field2164 <= 0 ? -1 : class238.field3819.method1511(arg0 - 33);
            class289.field4354 = null;
            if (class259.field3976 == 65535) {
                class259.field3976 = -1;
            }
            return true;
        } else if (class519.field7580 == class289.field4354) {
            class289.field4354 = null;
            class32.field374 = 1;
            class534.field7856 = class152.field2263;
            return true;
        } else if (class289.field4354 == class268.field4101) {
            int var358 = class238.field3819.method1511(-53);
            int var359 = class238.field3819.method1547(true);
            int var360 = class238.field3819.method1547(true);
            int var361 = class238.field3819.method1547(true);
            int var362 = class238.field3819.method1544(false);
            if (class320.method2049(-12, var359)) {
                class135.method987(var361, var358, var362, 9, var360);
            }
            class289.field4354 = null;
            return true;
        } else if (class389.field5840 == class289.field4354) {
            int var363 = class238.field3819.method1511(-82);
            int var364 = class238.field3819.method1515((byte) 121);
            int var365 = class238.field3819.method1515((byte) 125);
            int var366 = class238.field3819.method1511(arg0 - 122) << 0;
            int var367 = class238.field3819.method1515((byte) 124);
            int var368 = class238.field3819.method1515((byte) 122);
            if (class320.method2049(-32, var363)) {
                class39.method375(var364, var366, true, var365, var367, var368);
            }
            class289.field4354 = null;
            return true;
        } else if (class409.field6099 == class289.field4354) {
            int var369 = class238.field3819.method1512((byte) 102);
            int var370 = class238.field3819.method1512((byte) 113);
            int var371 = class238.field3819.method1518((byte) -86);
            int var372 = class238.field3819.method1511(-104);
            int var373 = class238.field3819.method1511(-99);
            if (class320.method2049(-82, var372)) {
                class393.method2474(var371, 7, var369 | var370 << 16, var373, (byte) 106);
            }
            class289.field4354 = null;
            return true;
        } else if (class494.field7127 == class289.field4354) {
            class94.method752(class238.field3819.method1550((byte) 28), (byte) -106);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class258.field3943) {
            int var374 = class238.field3819.method1556(arg0 + 124);
            int var375 = class238.field3819.method1538((byte) -108);
            int var376 = class238.field3819.method1512((byte) 115);
            if (class320.method2049(-15, var376)) {
                class102.method814(var375, var374, (byte) 112);
            }
            class289.field4354 = null;
            return true;
        } else if (class378.field5706 == class289.field4354) {
            int var377 = class238.field3819.method1511(-90);
            String var378 = class238.field3819.method1550((byte) 28);
            Object[] var379 = new Object[var378.length() + 1];
            for (int var380 = var378.length() - 1; var380 >= 0; var380--) {
                if (var378.charAt(var380) == 's') {
                    var379[var380 + 1] = class238.field3819.method1550((byte) 28);
                } else {
                    var379[var380 + 1] = Integer.valueOf(class238.field3819.method1556(111));
                }
            }
            var379[0] = Integer.valueOf(class238.field3819.method1556(105));
            if (class320.method2049(-124, var377)) {
                class405 var381 = new class405();
                var381.field6008 = var379;
                class192.method1356(var381);
            }
            class289.field4354 = null;
            return true;
        } else if (class396.field5926 == class289.field4354) {
            boolean var382 = class238.field3819.method1515((byte) 125) == 1;
            String var383 = class238.field3819.method1550((byte) 28);
            String var384 = var383;
            if (var382) {
                var384 = class238.field3819.method1550((byte) 28);
            }
            int var385 = class238.field3819.method1515((byte) 124);
            boolean var386 = false;
            if (var385 <= 1) {
                if (!(!class363.field5366 || class382.field5751) || class412.field6177) {
                    var386 = true;
                } else if (var385 <= 1 && class59.method525(var384, arg0 ^ 0xFFFF82B9)) {
                    var386 = true;
                }
            }
            if (!var386 && class398.field5950 == 0) {
                String var387 = class169.method1133(class517.method3067(class238.field3819, (byte) -94), arg0 ^ 0x29);
                if (var385 == 2) {
                    class398.method2507("<img=1>" + var384, "<img=1>" + var383, var387, 24, false, null, -1, 0);
                } else if (var385 == 1) {
                    class398.method2507("<img=0>" + var384, "<img=0>" + var383, var387, 24, false, null, -1, 0);
                } else {
                    class398.method2507(var384, var383, var387, 24, false, null, -1, 0);
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class75.field1078 == class289.field4354) {
            class135.method985(class360.field5349, class238.field3819, class142.field2164, (byte) 84);
            class289.field4354 = null;
            return true;
        } else if (class289.field4354 == class179.field2699) {
            int var388 = class238.field3819.method1511(79);
            if (var388 == 65535) {
                var388 = -1;
            }
            int var389 = class238.field3819.method1515((byte) 126);
            int var390 = class238.field3819.method1511(96);
            int var391 = class238.field3819.method1515((byte) 122);
            class103.method816(var390, var389, var388, var391, (byte) -46);
            class289.field4354 = null;
            return true;
        } else if (class85.field1216 == class289.field4354) {
            int var392 = class238.field3819.method1515((byte) 121);
            int var393 = var392 >> 5;
            int var394 = var392 & 0x1F;
            if (var394 == 0) {
                class303.field4580[var393] = null;
                class289.field4354 = null;
                return true;
            }
            class109 var395 = new class109();
            var395.field1523 = var394;
            var395.field1518 = class238.field3819.method1515((byte) 125);
            if (var395.field1518 >= 0 && class118.field1789.length > var395.field1518) {
                if (var395.field1523 == 1 || var395.field1523 == 10) {
                    var395.field1519 = class238.field3819.method1511(-53);
                    class238.field3819.field3556 += 6;
                } else if (var395.field1523 >= 2 && var395.field1523 <= 6) {
                    if (var395.field1523 == 2) {
                        var395.field1524 = 64;
                        var395.field1517 = 64;
                    }
                    if (var395.field1523 == 3) {
                        var395.field1517 = 0;
                        var395.field1524 = 64;
                    }
                    if (var395.field1523 == 4) {
                        var395.field1517 = 128;
                        var395.field1524 = 64;
                    }
                    if (var395.field1523 == 5) {
                        var395.field1524 = 0;
                        var395.field1517 = 64;
                    }
                    if (var395.field1523 == 6) {
                        var395.field1524 = 128;
                        var395.field1517 = 64;
                    }
                    var395.field1523 = 2;
                    var395.field1516 = class238.field3819.method1515((byte) 127);
                    var395.field1517 += class238.field3819.method1511(-30) - class390.field5842 << 7;
                    var395.field1524 += class238.field3819.method1511(arg0 ^ 0xFFFFFFB8) - class176.field2613 << 7;
                    var395.field1522 = class238.field3819.method1515((byte) 124) << 0;
                    var395.field1527 = class238.field3819.method1511(arg0 ^ 0xFFFFFFD6);
                }
                var395.field1526 = class238.field3819.method1511(-99);
                if (var395.field1526 == 65535) {
                    var395.field1526 = -1;
                }
                class303.field4580[var393] = var395;
            }
            class289.field4354 = null;
            return true;
        } else if (class518.field7558 == class289.field4354) {
            for (int var396 = 0; var396 < class26.field319.length; var396++) {
                if (class26.field319[var396] != null) {
                    class26.field319[var396].field1959 = -1;
                }
            }
            for (int var397 = 0; var397 < class153.field2265.length; var397++) {
                if (class153.field2265[var397] != null) {
                    class153.field2265[var397].field1959 = -1;
                }
            }
            class289.field4354 = null;
            return true;
        } else if (class445.field6533 == class289.field4354) {
            int var398 = class238.field3819.method1560(-128);
            int var399 = var398 >> 2;
            int var400 = var398 & 0x3;
            int var401 = class514.field7472[var399];
            int var402 = class238.field3819.method1549(arg0 - 2);
            if (var402 == 65535) {
                var402 = -1;
            }
            int var403 = class238.field3819.method1536(127);
            int var404 = (var403 & 0x32CF7363) >> 28;
            int var405 = (var403 & 0xFFFF6CC) >> 14;
            int var406 = var403 & 0x3FFF;
            int var407 = var405 - class390.field5842;
            int var408 = var406 - class176.field2613;
            class133.method972(var404, var402, var400, var399, 11742, var401, var407, var408);
            class289.field4354 = null;
            return true;
        } else {
            class88.method727(null, arg0 ^ 0x6A, "T1 - " + (class289.field4354 == null ? -1 : class289.field4354.method3031(false)) + "," + (class150.field2247 == null ? -1 : class150.field2247.method3031(false)) + "," + (class274.field4194 == null ? -1 : class274.field4194.method3031(false)) + " - " + class142.field2164);
            class417.method2613(false, arg0 - 31);
            return true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public final void method2966(int arg0) {
        if (arg0 != -1) {
            method2967(123, -15, 28, 21, (byte) 91, 125, 30, -71, 33, -31);
        }
        class13 var2 = this.field7204;
        synchronized (this.field7204) {
            this.field7204.method93((byte) 116);
        }
        field7209++;
        class13 var3 = this.field7210;
        synchronized (this.field7210) {
            this.field7210.method93((byte) 101);
        }
        class13 var4 = this.field7211;
        synchronized (this.field7211) {
            this.field7211.method93((byte) 110);
        }
        class13 var5 = this.field7212;
        synchronized (this.field7212) {
            this.field7212.method93((byte) 99);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method2967(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 <= 46) {
            method2981(null, true);
        }
        if (arg0 == arg2 && arg1 == arg9 && arg5 == arg8 && arg3 == arg7) {
            class397.method2503(true, arg8, arg6, arg3, arg0, arg1);
        } else {
            int var10 = arg0;
            int var11 = arg1;
            int var12 = arg0 * 3;
            int var13 = arg1 * 3;
            int var14 = arg2 * 3;
            int var15 = arg9 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 * 3;
            int var18 = arg8 + var14 - var16 - arg0;
            int var19 = arg3 - var17 - (-var15 + arg1);
            int var20 = var12 + var16 - (var14 - -var14);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg0;
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class397.method2503(true, var33, arg6, var34, var10, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field7191++;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V")
    public final void method2968(int arg0, boolean arg1) {
        field7198++;
        if (this.field7199 == arg1) {
            return;
        }
        this.field7199 = arg1;
        if (arg0 != -1853518624) {
            method2979(3, null, (byte) 78);
        }
        this.method2966(-1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lsm;IZIIII)V")
    public static final void method2969(class189 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field7201++;
        if (class384.field5774 >= 50 || arg4 >= -56 || arg0 == null || arg0.field3179 == null || arg0.field3179.length <= arg3 || arg0.field3179[arg3] == null) {
            return;
        }
        int var7 = arg0.field3179[arg3][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF9) >> 5;
        if (arg0.field3179[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field3179[arg3].length);
            if (var10 > 0) {
                var8 = arg0.field3179[arg3][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg2) {
                class103.method816(0, var9, var8, 255, (byte) -46);
            }
        } else if (class193.field3258.field7218 != 0) {
            int var12 = arg1 - 64 >> 7;
            int var13 = arg6 - 64 >> 7;
            class522.field7636[class384.field5774++] = new class85((byte) 1, var8, var9, 0, 255, (arg5 << 24) + (var13 << 8) - (-(var12 << 16) - var11));
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public static void method2970(int arg0) {
        field7200 = null;
        if (arg0 == 16353) {
            field7207 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
    public static final boolean method2971(byte arg0, int arg1, int arg2) {
        if (arg0 == 112) {
            field7203++;
            return ((arg2 & 0x2000) != 0 | class379.method2380(arg2, arg1, 16384) | class220.method1585(arg2, arg1, -128)) & class215.method1489(arg1, -1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    public static final void method2972(int arg0, int arg1) {
        if (~class6.field66 == arg1) {
            class446.field6542 = arg0;
        } else if (class6.field66 == 2 || class6.field66 == 3) {
            class281.field4282 = arg0;
        }
        field7196++;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)Ljt;")
    public final class69 method2973(int arg0, int arg1) {
        field7208++;
        class13 var3 = this.field7204;
        class69 var4;
        synchronized (this.field7204) {
            var4 = (class69) this.field7204.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field7193;
        byte[] var6;
        synchronized (this.field7193) {
            var6 = this.field7193.method2536(class503.method2991((byte) 78, arg1), 0, class181.method1206(arg1, (byte) -104));
        }
        class69 var7 = new class69();
        var7.field964 = arg1;
        var7.field972 = this;
        if (var6 != null) {
            var7.method593((byte) -41, new class217(var6));
        }
        var7.method594(124);
        if (arg0 >= -118) {
            return null;
        }
        if (var7.field967) {
            var7.field926 = 0;
            var7.field908 = false;
        }
        if (!this.field7199 && var7.field962) {
            var7.field895 = null;
            var7.field902 = null;
        }
        class13 var8 = this.field7204;
        synchronized (this.field7204) {
            this.field7204.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7206++;
        int var7 = class385.method2403(class433.field6414, class404.field5987, arg3, true);
        int var8 = class385.method2403(class433.field6414, class404.field5987, arg4, true);
        int var9 = class385.method2403(class184.field2777, class327.field4931, arg1, true);
        int var10 = class385.method2403(class184.field2777, class327.field4931, arg5, true);
        int var11 = class385.method2403(class433.field6414, class404.field5987, arg2 + arg3, true);
        int var12 = class385.method2403(class433.field6414, class404.field5987, arg4 - arg2, true);
        int var13 = var7;
        if (arg0 != -18428) {
            method2979(21, null, (byte) -25);
        }
        while (var13 < var11) {
            class359.method2255((byte) -71, class416.field6200[var13], var10, var9, arg6);
            var13++;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class359.method2255((byte) -103, class416.field6200[var14], var10, var9, arg6);
        }
        int var15 = class385.method2403(class184.field2777, class327.field4931, arg1 + arg2, true);
        int var16 = class385.method2403(class184.field2777, class327.field4931, arg5 - arg2, true);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class416.field6200[var17];
            class359.method2255((byte) -102, var18, var15, var9, arg6);
            class359.method2255((byte) -111, var18, var10, var16, arg6);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)V")
    public final void method2975(byte arg0, int arg1) {
        this.field7213 = arg1;
        field7192++;
        if (arg0 != -56) {
            method2979(-86, null, (byte) -95);
        }
        class13 var3 = this.field7210;
        synchronized (this.field7210) {
            this.field7210.method93((byte) 105);
        }
        class13 var4 = this.field7211;
        synchronized (this.field7211) {
            this.field7211.method93((byte) 75);
        }
        class13 var5 = this.field7212;
        synchronized (this.field7212) {
            this.field7212.method93((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(BI)V")
    public final void method2976(byte arg0, int arg1) {
        field7189++;
        class13 var3 = this.field7204;
        synchronized (this.field7204) {
            this.field7204.method91(115, arg1);
        }
        class13 var4 = this.field7210;
        synchronized (this.field7210) {
            this.field7210.method91(74, arg1);
        }
        class13 var5 = this.field7211;
        synchronized (this.field7211) {
            this.field7211.method91(24, arg1);
        }
        class13 var6 = this.field7212;
        synchronized (this.field7212) {
            this.field7212.method91(115, arg1);
            int var7 = -119 / ((arg0 + 73) / 51);
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(BI)V")
    public final void method2977(byte arg0, int arg1) {
        field7190++;
        this.field7204 = new class13(arg1);
        if (arg0 >= -38) {
            this.method2973(43, -35);
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
    public final void method2978(int arg0) {
        class13 var2 = this.field7204;
        synchronized (this.field7204) {
            this.field7204.method88(86);
        }
        field7205++;
        if (arg0 >= -109) {
            this.field7188 = false;
        }
        class13 var3 = this.field7210;
        synchronized (this.field7210) {
            this.field7210.method88(109);
        }
        class13 var4 = this.field7211;
        synchronized (this.field7211) {
            this.field7211.method88(115);
        }
        class13 var5 = this.field7212;
        synchronized (this.field7212) {
            this.field7212.method88(123);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[SB)[S")
    public static final short[] method2979(int arg0, short[] arg1, byte arg2) {
        field7195++;
        int var3 = 127 % ((18 - arg2) / 42);
        short[] var4 = new short[arg0];
        class414.method2601(arg1, 0, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V")
    public final void method2980(int arg0, boolean arg1) {
        field7202++;
        if (arg1 != this.field7188) {
            this.field7188 = arg1;
            this.method2966(arg0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method2981(String arg0, boolean arg1) {
        field7197++;
        String var2 = class504.method3004(class257.method1712(arg0, (byte) -8), 119);
        if (var2 == null) {
            var2 = "";
        }
        if (!arg1) {
            method2970(39);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lee;IZLul;Lul;)V")
    public class501(class480 arg0, int arg1, boolean arg2, class406 arg3, class406 arg4) {
        this.field7194 = arg4;
        this.field7199 = arg2;
        this.field7193 = arg3;
        if (this.field7193 != null) {
            int var6 = this.field7193.method2561(-115) - 1;
            this.field7193.method2551(var6, -26070);
        }
    }
}

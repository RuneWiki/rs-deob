import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class233 {

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "J")
    public long field4028 = 0L;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Ljd;")
    public static class85[] field4024 = new class85[100];

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljd;")
    public static class85 field4037 = class221.method1499("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -63);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ljd;")
    public static class85 field4027 = class221.method1499("p11_full", (byte) -111);

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[[I")
    public static int[][] field4035 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Ljd;")
    private static class85 field4038 = class221.method1499("Loaded input handler", (byte) 94);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljd;")
    public static class85 field4021 = field4038;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lqb;")
    public class56 field4025;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lqb;")
    public class56 field4040;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
    public static final boolean method1561(boolean arg0) throws IOException {
        field4023++;
        if (class198.field3390 == null) {
            return false;
        }
        int var1 = class198.field3390.method212((byte) 43);
        if (var1 == 0) {
            return false;
        }
        if (class181.field3100 == -1) {
            var1--;
            class198.field3390.method216(class189.field3249.field4238, 1, 0, 0);
            class189.field3249.field4224 = 0;
            class181.field3100 = class189.field3249.method489(127);
            class85.field1593 = class70.field1300[class181.field3100];
        }
        if (class85.field1593 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class198.field3390.method216(class189.field3249.field4238, 1, 0, 0);
            var1--;
            class85.field1593 = class189.field3249.field4238[0] & 0xFF;
        }
        if (class85.field1593 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class198.field3390.method216(class189.field3249.field4238, 2, 0, 0);
            class189.field3249.field4224 = 0;
            class85.field1593 = class189.field3249.method1694((byte) -100);
        }
        if (class85.field1593 > var1) {
            return false;
        }
        class189.field3249.field4224 = 0;
        class198.field3390.method216(class189.field3249.field4238, class85.field1593, 0, 0);
        client.field2580 = 0;
        class56.field977 = class186.field3197;
        class186.field3197 = class30.field451;
        class30.field451 = class181.field3100;
        if (class181.field3100 == 18) {
            int var2 = class189.field3249.method1716(2);
            int var3 = class189.field3249.method1716(2);
            int var4 = class189.field3249.method1711((byte) -67);
            class116.field2066 = var2 >> 1;
            class22.field308.method313(var3, 2, var4, (var2 & 0x1) == 1);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 218) {
            int var5 = class189.field3249.method1694((byte) -100);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class189.field3249.method1707((byte) -104);
            int var7 = class189.field3249.method1697(65280);
            int var8 = class189.field3249.method1665((byte) -65);
            if (class150.method975((byte) -82, var7)) {
                class255 var9 = class72.method506(var6, 0);
                if (var9.field4459) {
                    class161.method1052(var5, var6, -1, var8);
                    class61 var11 = class32.method221(11649, var5);
                    class230.method1541(var11.field1141, var6, var11.field1105, var11.field1156, !arg0);
                    class108.method748(var6, 10, var11.field1112, var11.field1100, var11.field1139);
                } else if (var5 == -1) {
                    class181.field3100 = -1;
                    var9.field4492 = 0;
                    return true;
                } else {
                    class61 var10 = class32.method221(11649, var5);
                    var9.field4500 = var10.field1141 * 100 / var8;
                    var9.field4425 = var5;
                    var9.field4394 = var10.field1156;
                    var9.field4492 = 4;
                    var9.field4416 = var10.field1105;
                    class16.method120((byte) -46, var9);
                }
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 14) {
            long var12 = class189.field3249.method1720((byte) -3);
            class189.field3249.method1690(true);
            long var14 = class189.field3249.method1720((byte) -3);
            long var16 = (long) class189.field3249.method1694((byte) -100);
            long var18 = (long) class189.field3249.method1691(19388);
            int var20 = class189.field3249.method1711((byte) -67);
            long var21 = (var16 << 32) + var18;
            boolean var23 = false;
            int var24 = 0;
            label1089: while (true) {
                if (var24 >= 100) {
                    if (var20 <= 1) {
                        if (class98.field1766 == 1 || class169.field2916 == 1) {
                            var23 = true;
                        } else {
                            for (int var25 = 0; var25 < class56.field978; var25++) {
                                if (class137.field2379[var25] == var12) {
                                    var23 = true;
                                    break label1089;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class204.field3572[var24] == var21) {
                    var23 = true;
                    break;
                }
                var24++;
            }
            if (!var23 && class61.field1113 == 0) {
                class204.field3572[class160.field2747] = var21;
                class160.field2747 = (class160.field2747 + 1) % 100;
                class85 var26 = class10.method60(class229.method1539(-122, class189.field3249).method617((byte) 33));
                if (var20 == 2 || var20 == 3) {
                    class205.method1404(0, class116.method814(var14, 84).method587((byte) -125), class172.method1150(new class85[] { class227.field3942, class116.method814(var12, -111).method587((byte) -104) }, 0), 9, var26);
                } else if (var20 == 1) {
                    class205.method1404(0, class116.method814(var14, -116).method587((byte) -91), class172.method1150(new class85[] { class94.field1713, class116.method814(var12, 62).method587((byte) -121) }, 0), 9, var26);
                } else {
                    class205.method1404(0, class116.method814(var14, 97).method587((byte) -51), class116.method814(var12, 64).method587((byte) -54), 9, var26);
                }
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 240) {
            int var27 = class189.field3249.method1694((byte) -100);
            int var28 = class189.field3249.method1664(123);
            int var29 = class189.field3249.method1664(117);
            if (class150.method975((byte) -76, var27)) {
                class129 var30 = (class129) class121.field2126.method1398(1, (long) var29);
                class129 var31 = (class129) class121.field2126.method1398(1, (long) var28);
                if (var31 != null) {
                    class244.method1654((byte) 51, var30 == null || var30.field2264 != var31.field2264, var31);
                }
                if (var30 != null) {
                    var30.method1753(137);
                    class121.field2126.method1393(var30, (long) var28, 817);
                }
                class255 var32 = class72.method506(var29, 0);
                if (var32 != null) {
                    class16.method120((byte) -122, var32);
                }
                class255 var33 = class72.method506(var28, 0);
                if (var33 != null) {
                    class16.method120((byte) -46, var33);
                    class66.method446(var33, true, (byte) 57);
                }
                if (class129.field2267 != -1) {
                    class205.method1401(1, class129.field2267, (byte) -117);
                }
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 125) {
            class56.field978 = class85.field1593 / 8;
            for (int var34 = 0; var34 < class56.field978; var34++) {
                class137.field2379[var34] = class189.field3249.method1720((byte) -3);
                class256.field4572[var34] = class116.method814(class137.field2379[var34], 69);
            }
            class181.field3100 = -1;
            class207.field3613 = class43.field755;
            return true;
        } else if (class181.field3100 == 24) {
            int var35 = class189.field3249.method1711((byte) -67);
            class251 var36 = new class251();
            int var37 = var35 >> 6;
            var36.field4321 = var35 & 0x3F;
            var36.field4325 = class189.field3249.method1711((byte) -67);
            if (var36.field4325 >= 0 && class182.field3112.length > var36.field4325) {
                if (var36.field4321 == 1 || var36.field4321 == 10) {
                    var36.field4304 = class189.field3249.method1694((byte) -100);
                    class189.field3249.field4224 += 3;
                } else if (var36.field4321 >= 2 && var36.field4321 <= 6) {
                    if (var36.field4321 == 2) {
                        var36.field4332 = 64;
                        var36.field4328 = 64;
                    }
                    if (var36.field4321 == 3) {
                        var36.field4332 = 64;
                        var36.field4328 = 0;
                    }
                    if (var36.field4321 == 4) {
                        var36.field4332 = 64;
                        var36.field4328 = 128;
                    }
                    if (var36.field4321 == 5) {
                        var36.field4332 = 0;
                        var36.field4328 = 64;
                    }
                    if (var36.field4321 == 6) {
                        var36.field4332 = 128;
                        var36.field4328 = 64;
                    }
                    var36.field4321 = 2;
                    var36.field4306 = class189.field3249.method1694((byte) -100);
                    var36.field4301 = class189.field3249.method1694((byte) -100);
                    var36.field4315 = class189.field3249.method1711((byte) -67);
                }
                var36.field4309 = class189.field3249.method1694((byte) -100);
                if (var36.field4309 == 65535) {
                    var36.field4309 = -1;
                }
                class7.field87[var37] = var36;
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 45) {
            class116.field2075 = class43.field755;
            long var38 = class189.field3249.method1720((byte) -3);
            if (var38 == 0L) {
                class40.field641 = 0;
                class118.field2111 = null;
                class146.field2495 = null;
                class181.field3100 = -1;
                class39.field603 = null;
                return true;
            }
            long var40 = class189.field3249.method1720((byte) -3);
            class146.field2495 = class116.method814(var40, 89);
            class39.field603 = class116.method814(var38, 112);
            class147.field2499 = class189.field3249.method1690(true);
            int var42 = class189.field3249.method1711((byte) -67);
            if (var42 == 255) {
                class181.field3100 = -1;
                return true;
            }
            class40.field641 = var42;
            class221[] var43 = new class221[100];
            for (int var44 = 0; var44 < class40.field641; var44++) {
                var43[var44] = new class221();
                var43[var44].field4377 = class189.field3249.method1720((byte) -3);
                var43[var44].field3869 = class116.method814(var43[var44].field4377, 63);
                var43[var44].field3876 = class189.field3249.method1694((byte) -100);
                var43[var44].field3872 = class189.field3249.method1690(!arg0);
                var43[var44].field3873 = class189.field3249.method1692(121);
                if (class268.field4766 == var43[var44].field4377) {
                    class2.field14 = var43[var44].field3872;
                }
            }
            boolean var45 = false;
            int var46 = class40.field641;
            while (var46 > 0) {
                boolean var47 = true;
                var46--;
                for (int var48 = 0; var48 < var46; var48++) {
                    if (var43[var48].field3869.method616(true, var43[var48 + 1].field3869) > 0) {
                        var47 = false;
                        class221 var49 = var43[var48];
                        var43[var48] = var43[var48 + 1];
                        var43[var48 + 1] = var49;
                    }
                }
                if (var47) {
                    break;
                }
            }
            class181.field3100 = -1;
            class118.field2111 = var43;
            return true;
        } else if (class181.field3100 == 40) {
            int var50 = class189.field3249.method1716(2);
            int var51 = class189.field3249.method1687(78);
            class85 var52 = class189.field3249.method1692(121);
            if (var51 >= 1 && var51 <= 8) {
                if (var52.method582(class237.field4090, -72)) {
                    var52 = null;
                }
                class247.field4256[var51 - 1] = var52;
                class196.field3377[var51 - 1] = var50 == 0;
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 67) {
            class107.method743(true, 6238);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 115) {
            class228.method1532(class189.field3249, -128);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 151) {
            class201.field3504 = class189.field3249.method1678(false);
            class50.field878 = class189.field3249.method1678(false);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 228) {
            class219.field3861 = class189.field3249.method1711((byte) -67);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 54) {
            int var53 = class189.field3249.method1670(2000376200);
            int var54 = class189.field3249.method1670(2000376200);
            int var55 = class189.field3249.method1670(2000376200);
            int var56 = class189.field3249.method1664(127);
            if (class150.method975((byte) -76, var55)) {
                class261.method1791(0, (var54 << 16) + var53, var56);
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 171) {
            int var57 = class189.field3249.method1716(2);
            int var58 = class189.field3249.method1712(6357);
            int var59 = class189.field3249.method1670(2000376200);
            int var60 = class189.field3249.method1683(-2);
            if (class150.method975((byte) -75, var59)) {
                class129 var61 = (class129) class121.field2126.method1398(1, (long) var58);
                if (var61 != null) {
                    class244.method1654((byte) 106, var61.field2264 != var60, var61);
                }
                class194.method1321(var57, var60, false, var58);
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 101) {
            int var62 = class189.field3249.method1670(2000376200);
            if (var62 == 65535) {
                var62 = -1;
            }
            class181.method1247(0, var62);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 97) {
            int var63 = class189.field3249.method1667(-3);
            int var64 = class189.field3249.method1697(65280);
            if (var64 == 65535) {
                var64 = -1;
            }
            class263.method1798(var63, (byte) 30, var64);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 217) {
            class247.method1679(0);
            class93.field1706 = class189.field3249.method1711((byte) -67);
            class181.field3100 = -1;
            class189.field3242 = class43.field755;
            return true;
        } else if (class181.field3100 == 104) {
            int var65 = class189.field3249.method1712(6357);
            class85 var66 = class189.field3249.method1692(114);
            int var67 = class189.field3249.method1683(-2);
            if (class150.method975((byte) -78, var67)) {
                class30.method208(1000, var65, var66);
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 3) {
            for (int var68 = 0; var68 < class256.field4563.length; var68++) {
                if (class260.field4599[var68] != class256.field4563[var68]) {
                    class256.field4563[var68] = class260.field4599[var68];
                    class202.method1386(var68, 1);
                    class63.field1169[class135.method899(class94.field1717++, 31)] = var68;
                }
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 237) {
            int var69 = class189.field3249.method1694((byte) -100);
            int var70 = class189.field3249.method1712(6357);
            if (class150.method975((byte) -67, var69)) {
                class129 var71 = (class129) class121.field2126.method1398(1, (long) var70);
                if (var71 != null) {
                    class244.method1654((byte) 79, true, var71);
                }
                if (class47.field836 != null) {
                    class16.method120((byte) -87, class47.field836);
                    class47.field836 = null;
                }
            }
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 197) {
            int var72 = class189.field3249.method1711((byte) -67);
            int var73 = class189.field3249.method1711((byte) -67);
            int var74 = class189.field3249.method1694((byte) -100);
            int var75 = class189.field3249.method1711((byte) -67);
            int var76 = class189.field3249.method1711((byte) -67);
            class6.method28(var73, var74, var72, var75, 105, true, var76);
            class181.field3100 = -1;
            return true;
        } else if (class181.field3100 == 155) {
            int var77 = class189.field3249.method1683(-2);
            int var78 = class189.field3249.method1694((byte) -100);
            int var79 = class189.field3249.method1712(6357);
            if (var77 == 65535) {
                var77 = -1;
            }
            if (class150.method975((byte) -114, var78)) {
                class79.method547(var79, 4, 2, var77);
            }
            class181.field3100 = -1;
            return true;
        } else {
            if (arg0) {
                field4027 = null;
            }
            if (class181.field3100 == 162) {
                int var80 = class189.field3249.method1697(65280);
                int var81 = class189.field3249.method1697(65280);
                class30.field450 = var81;
                class199.field3413 = var80;
                class137.method909(true);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 21) {
                long var82 = class189.field3249.method1720((byte) -3);
                class85 var84 = class10.method60(class229.method1539(88, class189.field3249).method617((byte) 33));
                class148.method972(var84, (byte) -33, class116.method814(var82, -58).method587((byte) -64), 6);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 211) {
                class251.method1736(-9816);
                class247.method1679(0);
                class94.field1717 += 32;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 153) {
                int var85 = class189.field3249.method1711((byte) -67);
                int var86 = class189.field3249.method1694((byte) -100);
                int var87 = class189.field3249.method1683(-2);
                if (class150.method975((byte) -75, var86)) {
                    if (var85 == 2) {
                        class30.method206(-24263);
                    }
                    class129.field2267 = var87;
                    class219.method1494(-94, var87);
                    class231.method1548(false, (byte) 127);
                    class39.method262((byte) -127, class129.field2267);
                    for (int var88 = 0; var88 < 100; var88++) {
                        class20.field286[var88] = true;
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 159) {
                int var89 = class189.field3249.method1683(-2);
                int var90 = class189.field3249.method1707((byte) -102);
                class208.method1426(var90, 1266607942, var89);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 146) {
                int var91 = class189.field3249.method1694((byte) -100);
                if (var91 == 65535) {
                    var91 = -1;
                }
                int var92 = class189.field3249.method1712(6357);
                int var93 = class189.field3249.method1670(2000376200);
                if (class150.method975((byte) -117, var93)) {
                    class79.method547(var92, 4, 1, var91);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 119) {
                if (class129.field2267 != -1) {
                    class205.method1401(0, class129.field2267, (byte) -121);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 167) {
                class197.field3380 = class189.field3249.method1670(2000376200) * 30;
                class181.field3100 = -1;
                class189.field3242 = class43.field755;
                return true;
            } else if (class181.field3100 == 8) {
                int var94 = class189.field3249.method1670(2000376200);
                int var95 = class189.field3249.method1683(-2);
                int var96 = class189.field3249.method1694((byte) -100);
                int var97 = class189.field3249.method1664(124);
                if (class150.method975((byte) -94, var96)) {
                    class79.method547(var97, 4, 7, var94 << 16 | var95);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 116) {
                class247.method1679(0);
                class15.field226 = class189.field3249.method1677(!arg0);
                class189.field3242 = class43.field755;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 245) {
                class85 var98 = class189.field3249.method1692(115);
                int var99 = class189.field3249.method1694((byte) -100);
                int var100 = class189.field3249.method1694((byte) -100);
                if (class150.method975((byte) -97, var100)) {
                    class239.method1629(var98, 25358, var99);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 15) {
                int var101 = class189.field3249.method1687(114);
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = class202.field3529[var102];
                int var105 = class189.field3249.method1665((byte) -65);
                int var106 = var105 >> 14 & 0x3FFF;
                int var107 = (var105 & 0x3FC2FB2C) >> 28;
                int var108 = var105 & 0x3FFF;
                int var109 = class189.field3249.method1683(-2);
                int var110 = var108 - class213.field3742;
                int var111 = var106 - class244.field4172;
                if (var109 == 65535) {
                    var109 = -1;
                }
                class17.method127(var110, var103, var109, var104, var102, var111, var107, 3);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 133) {
                class50.field878 = class189.field3249.method1678(false);
                class201.field3504 = class189.field3249.method1687(102);
                for (int var112 = class201.field3504; var112 < class201.field3504 + 8; var112++) {
                    for (int var114 = class50.field878; var114 < (class50.field878 + 8); var114++) {
                        if (class191.field3278[class116.field2066][var112][var114] != null) {
                            class191.field3278[class116.field2066][var112][var114] = null;
                            class212.method1457((byte) -106, var114, var112);
                        }
                    }
                }
                for (class218 var113 = (class218) class256.field4571.method110(64); var113 != null; var113 = (class218) class256.field4571.method117((byte) 114)) {
                    if (var113.field3830 >= class201.field3504 && var113.field3830 < (class201.field3504 + 8) && var113.field3826 >= class50.field878 && var113.field3826 < class50.field878 + 8 && class116.field2066 == var113.field3819) {
                        var113.field3824 = 0;
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 44) {
                byte[] var115 = new byte[class85.field1593];
                class189.field3249.method493((byte) 39, var115, class85.field1593, 0);
                class85 var116 = class116.method817(class85.field1593, var115, (byte) -39, 0);
                if (class167.field2882 == null && class246.field4205 == 2 || !class81.field1472.startsWith("win") || class223.field3912) {
                    class175.method1179(true, var116, -1);
                } else {
                    class83.field1514 = true;
                    class115.field2063 = var116;
                    class49.field869 = class107.field1882.method557(new String(var116.method588(17473), "ISO-8859-1"), 121);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 131) {
                long var117 = class189.field3249.method1720((byte) -3);
                long var119 = (long) class189.field3249.method1694((byte) -100);
                long var121 = (long) class189.field3249.method1691(19388);
                int var123 = class189.field3249.method1711((byte) -67);
                boolean var124 = false;
                long var125 = (var119 << 32) + var121;
                int var127 = 0;
                label1200: while (true) {
                    if (var127 >= 100) {
                        if (var123 <= 1) {
                            if (class98.field1766 == 1 || class169.field2916 == 1) {
                                var124 = true;
                            } else {
                                for (int var128 = 0; var128 < class56.field978; var128++) {
                                    if (class137.field2379[var128] == var117) {
                                        var124 = true;
                                        break label1200;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class204.field3572[var127] == var125) {
                        var124 = true;
                        break;
                    }
                    var127++;
                }
                if (!var124 && class61.field1113 == 0) {
                    class204.field3572[class160.field2747] = var125;
                    class160.field2747 = (class160.field2747 + 1) % 100;
                    class85 var129 = class10.method60(class229.method1539(-90, class189.field3249).method617((byte) 33));
                    if (var123 == 2 || var123 == 3) {
                        class148.method972(var129, (byte) -24, class172.method1150(new class85[] { class227.field3942, class116.method814(var117, -90).method587((byte) -63) }, 0), 7);
                    } else if (var123 == 1) {
                        class148.method972(var129, (byte) -67, class172.method1150(new class85[] { class94.field1713, class116.method814(var117, -107).method587((byte) -60) }, 0), 7);
                    } else {
                        class148.method972(var129, (byte) -16, class116.method814(var117, -70).method587((byte) -125), 3);
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 236) {
                class85 var130 = class189.field3249.method1692(108);
                if (var130.method599(class137.field2387, (byte) 118)) {
                    class85 var166 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    boolean var167 = false;
                    long var168 = var166.method624(arg0);
                    for (int var170 = 0; var170 < class56.field978; var170++) {
                        if (class137.field2379[var170] == var168) {
                            var167 = true;
                            break;
                        }
                    }
                    if (!var167 && class61.field1113 == 0) {
                        class148.method972(class102.field1808, (byte) -61, var166, 4);
                    }
                } else if (var130.method599(class156.field2678, (byte) 31)) {
                    class85 var160 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    long var161 = var160.method624(false);
                    boolean var163 = false;
                    for (int var164 = 0; var164 < class56.field978; var164++) {
                        if (class137.field2379[var164] == var161) {
                            var163 = true;
                            break;
                        }
                    }
                    if (!var163 && class61.field1113 == 0) {
                        class85 var165 = var130.method636(var130.method586(true) - 9, var130.method607(class246.field4210, false) + 1, true);
                        class148.method972(var165, (byte) -69, var160, 8);
                    }
                } else if (var130.method599(class237.field4094, (byte) 16)) {
                    class85 var155 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    long var156 = var155.method624(false);
                    boolean var158 = false;
                    for (int var159 = 0; var159 < class56.field978; var159++) {
                        if (class137.field2379[var159] == var156) {
                            var158 = true;
                            break;
                        }
                    }
                    if (!var158 && class61.field1113 == 0) {
                        class148.method972(class100.field1795, (byte) -127, var155, 10);
                    }
                } else if (var130.method599(class129.field2260, (byte) 61)) {
                    class85 var131 = var130.method636(var130.method607(class129.field2260, false), 0, true);
                    class148.method972(var131, (byte) -17, class100.field1795, 11);
                } else if (var130.method599(class109.field1925, (byte) 115)) {
                    class85 var132 = var130.method636(var130.method607(class109.field1925, false), 0, true);
                    if (class61.field1113 == 0) {
                        class148.method972(var132, (byte) -104, class100.field1795, 12);
                    }
                } else if (var130.method599(class76.field1405, (byte) 25)) {
                    class85 var154 = var130.method636(var130.method607(class76.field1405, arg0), 0, true);
                    if (class61.field1113 == 0) {
                        class148.method972(var154, (byte) -87, class100.field1795, 13);
                    }
                } else if (var130.method599(class25.field378, (byte) 33)) {
                    class85 var149 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    long var150 = var149.method624(arg0);
                    boolean var152 = false;
                    for (int var153 = 0; var153 < class56.field978; var153++) {
                        if (class137.field2379[var153] == var150) {
                            var152 = true;
                            break;
                        }
                    }
                    if (!var152 && class61.field1113 == 0) {
                        class148.method972(class100.field1795, (byte) -72, var149, 14);
                    }
                } else if (var130.method599(class221.field3885, (byte) 123)) {
                    class85 var133 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    long var134 = var133.method624(false);
                    boolean var136 = false;
                    for (int var137 = 0; var137 < class56.field978; var137++) {
                        if (class137.field2379[var137] == var134) {
                            var136 = true;
                            break;
                        }
                    }
                    if (!var136 && class61.field1113 == 0) {
                        class148.method972(class100.field1795, (byte) -62, var133, 15);
                    }
                } else if (var130.method599(class177.field3030, (byte) 28)) {
                    class85 var138 = var130.method636(var130.method607(class246.field4210, false), 0, true);
                    boolean var139 = false;
                    long var140 = var138.method624(arg0);
                    for (int var142 = 0; var142 < class56.field978; var142++) {
                        if (class137.field2379[var142] == var140) {
                            var139 = true;
                            break;
                        }
                    }
                    if (!var139 && class61.field1113 == 0) {
                        class148.method972(class100.field1795, (byte) -26, var138, 16);
                    }
                } else if (var130.method599(class217.field3805, (byte) 119)) {
                    class85 var143 = var130.method636(var130.method607(class246.field4210, arg0), 0, true);
                    long var144 = var143.method624(false);
                    boolean var146 = false;
                    for (int var147 = 0; var147 < class56.field978; var147++) {
                        if (class137.field2379[var147] == var144) {
                            var146 = true;
                            break;
                        }
                    }
                    if (!var146 && class61.field1113 == 0) {
                        class85 var148 = var130.method636(var130.method586(true) - 9, var130.method607(class246.field4210, false) - -1, true);
                        class148.method972(var148, (byte) -73, var143, 21);
                    }
                } else {
                    class148.method972(var130, (byte) -18, class100.field1795, 0);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 103) {
                int var171 = class189.field3249.method1681(83);
                int var172 = class189.field3249.method1695(3);
                int var173 = class189.field3249.method1697(65280);
                int var174 = class189.field3249.method1664(120);
                if (class150.method975((byte) -70, var173)) {
                    class17.method124(var171, var172, -114, var174);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 105) {
                class197.method1347(arg0);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 20) {
                class85 var175 = class189.field3249.method1692(114);
                int var176 = class189.field3249.method1694((byte) -100);
                int var177 = class189.field3249.method1670(2000376200);
                if (class150.method975((byte) -84, var177)) {
                    class239.method1629(var175, 25358, var176);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 59) {
                int var178 = class189.field3249.method1670(2000376200);
                int var179 = class189.field3249.method1670(2000376200);
                int var180 = class189.field3249.method1697(65280);
                int var181 = class189.field3249.method1670(2000376200);
                int var182 = class189.field3249.method1707((byte) -55);
                if (class150.method975((byte) -89, var179)) {
                    class230.method1541(var180, var182, var178, var181, !arg0);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 144) {
                int var183 = class189.field3249.method1694((byte) -100);
                byte var184 = class189.field3249.method1671(-57);
                class208.method1426(var184, 1266607942, var183);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 142) {
                int var185 = class189.field3249.method1694((byte) -100);
                if (var185 == 65535) {
                    var185 = -1;
                }
                int var186 = class189.field3249.method1711((byte) -67);
                int var187 = class189.field3249.method1694((byte) -100);
                class102.method705(0, var185, var187, var186);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 72) {
                int var188 = class189.field3249.method1712(6357);
                int var189 = class189.field3249.method1681(106);
                int var190 = class189.field3249.method1683(-2);
                if (class150.method975((byte) -127, var190)) {
                    class161.method1055(var188, var189, (byte) 55);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 220) {
                long var191 = class189.field3249.method1720((byte) -3);
                int var193 = class189.field3249.method1694((byte) -100);
                class85 var194 = class242.method1640(var193, 125).method1073(-67, class189.field3249);
                class32.method222(var193, (class85) null, -100, class116.method814(var191, 70).method587((byte) -117), var194, 19);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 168) {
                int var195 = class189.field3249.method1670(2000376200);
                if (var195 == 65535) {
                    var195 = -1;
                }
                int var196 = class189.field3249.method1683(-2);
                int var197 = class189.field3249.method1707((byte) -86);
                int var198 = class189.field3249.method1670(2000376200);
                if (var198 == 65535) {
                    var198 = -1;
                }
                int var199 = class189.field3249.method1712(6357);
                if (class150.method975((byte) -105, var196)) {
                    for (int var200 = var195; var200 <= var198; var200++) {
                        long var201 = ((long) var199 << 32) + (long) var200;
                        class253 var203 = class273.field4821.method1398(1, var201);
                        if (var203 != null) {
                            var203.method1753(137);
                        }
                        class273.field4821.method1393(new class105(var197), var201, 817);
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 35) {
                int var204 = class189.field3249.method1697(65280);
                int var205 = class189.field3249.method1694((byte) -100);
                int var206 = class189.field3249.method1665((byte) -65);
                if (class150.method975((byte) -127, var205)) {
                    class108.method746(var206, (byte) -112, var204);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 123) {
                long var207 = class189.field3249.method1720((byte) -3);
                int var209 = class189.field3249.method1694((byte) -100);
                boolean var210 = false;
                if ((Long.MIN_VALUE & var207) != 0L) {
                    var210 = true;
                }
                byte var211 = class189.field3249.method1690(true);
                if (var210) {
                    if (class40.field641 == 0) {
                        class181.field3100 = -1;
                        return true;
                    }
                    boolean var217 = false;
                    long var218 = var207 & Long.MAX_VALUE;
                    int var220;
                    for (var220 = 0; class40.field641 > var220 && (class118.field2111[var220].field4377 != var218 || class118.field2111[var220].field3876 != var209); var220++) {
                    }
                    if (class40.field641 > var220) {
                        while (class40.field641 - 1 > var220) {
                            class118.field2111[var220] = class118.field2111[var220 + 1];
                            var220++;
                        }
                        class40.field641--;
                        class118.field2111[class40.field641] = null;
                    }
                } else {
                    class85 var212 = class189.field3249.method1692(104);
                    class221 var213 = new class221();
                    var213.field4377 = var207;
                    var213.field3869 = class116.method814(var213.field4377, -54);
                    var213.field3876 = var209;
                    var213.field3873 = var212;
                    var213.field3872 = var211;
                    int var214;
                    for (var214 = class40.field641 - 1; var214 >= 0; var214--) {
                        int var215 = class118.field2111[var214].field3869.method616(true, var213.field3869);
                        if (var215 == 0) {
                            class118.field2111[var214].field3876 = var209;
                            class118.field2111[var214].field3872 = var211;
                            class118.field2111[var214].field3873 = var212;
                            class181.field3100 = -1;
                            class116.field2075 = class43.field755;
                            if (class268.field4766 == var207) {
                                class2.field14 = var211;
                            }
                            return true;
                        }
                        if (var215 < 0) {
                            break;
                        }
                    }
                    if (class118.field2111.length <= class40.field641) {
                        class181.field3100 = -1;
                        return true;
                    }
                    for (int var216 = class40.field641 - 1; var216 > var214; var216--) {
                        class118.field2111[var216 + 1] = class118.field2111[var216];
                    }
                    if (class40.field641 == 0) {
                        class118.field2111 = new class221[100];
                    }
                    class118.field2111[var214 + 1] = var213;
                    if (class268.field4766 == var207) {
                        class2.field14 = var211;
                    }
                    class40.field641++;
                }
                class116.field2075 = class43.field755;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 187) {
                int var221 = class189.field3249.method1694((byte) -100);
                int var222 = class189.field3249.method1670(2000376200);
                int var223 = class189.field3249.method1712(6357);
                if (class150.method975((byte) -96, var221)) {
                    class75.method527((byte) -113, var222, var223);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 210) {
                int var224 = class189.field3249.method1694((byte) -100);
                class85 var225 = class189.field3249.method1692(108);
                Object[] var226 = new Object[var225.method586(!arg0) + 1];
                for (int var227 = var225.method586(true) - 1; var227 >= 0; var227--) {
                    if (var225.method615(true, var227) == 115) {
                        var226[var227 + 1] = class189.field3249.method1692(105);
                    } else {
                        var226[var227 + 1] = Integer.valueOf(class189.field3249.method1712(6357));
                    }
                }
                var226[0] = Integer.valueOf(class189.field3249.method1712(6357));
                if (class150.method975((byte) -74, var224)) {
                    class5 var228 = new class5();
                    var228.field67 = var226;
                    class127.method863(43, var228);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 7) {
                int var229 = class189.field3249.method1697(65280);
                int var230 = class189.field3249.method1687(124);
                class92.method669(var229, (byte) 119, var230);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 0) {
                for (int var231 = 0; var231 < class249.field4291.length; var231++) {
                    if (class249.field4291[var231] != null) {
                        class249.field4291[var231].field1056 = -1;
                    }
                }
                for (int var232 = 0; var232 < class194.field3320.length; var232++) {
                    if (class194.field3320[var232] != null) {
                        class194.field3320[var232].field1056 = -1;
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 107) {
                int var233 = class189.field3249.method1697(65280);
                class269.method1851(var233, (byte) 98);
                class27.field409[class135.method899(31, class105.field1844++)] = class135.method899(32767, var233);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 195) {
                int var234 = class189.field3249.method1670(2000376200);
                int var235 = class189.field3249.method1697(65280);
                int var236 = class189.field3249.method1711((byte) -67);
                if (class150.method975((byte) -88, var235)) {
                    class229.method1536(var234, var236, 127);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 231) {
                class171.method1143((byte) -115);
                class181.field3100 = -1;
                return false;
            } else if (class181.field3100 == 242) {
                class247.method1679(0);
                int var237 = class189.field3249.method1665((byte) -65);
                int var238 = class189.field3249.method1678(false);
                int var239 = class189.field3249.method1711((byte) -67);
                class227.field3941[var238] = var237;
                class20.field279[var238] = var239;
                class71.field1323[var238] = 1;
                for (int var240 = 0; var240 < 98; var240++) {
                    if (class237.field4095[var240] <= var237) {
                        class71.field1323[var238] = var240 + 2;
                    }
                }
                class208.field3633[class135.method899(class226.field3933++, 31)] = var238;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 165) {
                class199.method1364(class107.field1882, class189.field3249, 94, class85.field1593);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 135) {
                int var241 = class189.field3249.method1707((byte) -84);
                int var242 = class189.field3249.method1683(-2);
                if (class150.method975((byte) -67, var242)) {
                    int var243 = 0;
                    if (class22.field308.field796 != null) {
                        var243 = class22.field308.field796.method1244(0);
                    }
                    class79.method547(var241, 4, 3, var243);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 149) {
                int var244 = class189.field3249.method1694((byte) -100);
                int var245 = class189.field3249.method1687(100);
                int var246 = class189.field3249.method1694((byte) -100);
                class17 var247 = class194.field3320[var244];
                if (var247 != null) {
                    class180.method1232(var247, var246, var245, 111);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 50) {
                class251.field4308 = class189.field3249.method1711((byte) -67);
                class181.field3100 = -1;
                class207.field3613 = class43.field755;
                return true;
            } else if (class181.field3100 == 139) {
                int var248 = class189.field3249.method1697(65280);
                int var249 = class189.field3249.method1670(2000376200);
                int var250 = class189.field3249.method1707((byte) -67);
                int var251 = class189.field3249.method1694((byte) -100);
                if (var250 >> 30 != 0) {
                    int var260 = (var250 >> 14 & 0x3FFF) - class244.field4172;
                    int var261 = (var250 & 0x3E23755F) >> 28;
                    int var262 = (var250 & 0x3FFF) - class213.field3742;
                    if (var260 >= 0 && var262 >= 0 && var260 < 104 && var262 < 104) {
                        int var263 = var262 * 128 + 64;
                        int var264 = var260 * 128 + 64;
                        class48 var265 = new class48(var248, var261, var264, var263, class246.method1660(604124551, var264, var261, var263) - var249, var251, class151.field2555);
                        class213.field3738.method116((byte) -121, new class4(var265));
                    }
                } else if (var250 >> 29 != 0) {
                    int var256 = var250 & 0xFFFF;
                    class17 var257 = class194.field3320[var256];
                    if (var257 != null) {
                        var257.field1026 = 0;
                        var257.field1064 = var248;
                        var257.field1051 = var249;
                        var257.field1022 = 0;
                        if (var257.field1064 == 65535) {
                            var257.field1064 = -1;
                        }
                        var257.field1019 = class151.field2555 + var251;
                        if (var257.field1019 > class151.field2555) {
                            var257.field1022 = -1;
                        }
                        if (var257.field1064 != -1 && class151.field2555 == var257.field1019) {
                            int var258 = class87.method647((byte) 124, var257.field1064).field1329;
                            if (var258 != -1) {
                                class106 var259 = class101.method704(1, var258);
                                if (var259 != null && var259.field1857 != null) {
                                    class163.method1080(var259, var257.field1042, var257.field1027, 0, 21983, false);
                                }
                            }
                        }
                    }
                } else if (var250 >> 28 != 0) {
                    int var252 = var250 & 0xFFFF;
                    class44 var253;
                    if (class213.field3748 == var252) {
                        var253 = class22.field308;
                    } else {
                        var253 = class249.field4291[var252];
                    }
                    if (var253 != null) {
                        var253.field1022 = 0;
                        var253.field1051 = var249;
                        var253.field1026 = 0;
                        var253.field1019 = class151.field2555 + var251;
                        var253.field1064 = var248;
                        if (class151.field2555 < var253.field1019) {
                            var253.field1022 = -1;
                        }
                        if (var253.field1064 == 65535) {
                            var253.field1064 = -1;
                        }
                        if (var253.field1064 != -1 && class151.field2555 == var253.field1019) {
                            int var254 = class87.method647((byte) 34, var253.field1064).field1329;
                            if (var254 != -1) {
                                class106 var255 = class101.method704(1, var254);
                                if (var255 != null && var255.field1857 != null) {
                                    class163.method1080(var255, var253.field1042, var253.field1027, 0, 21983, class22.field308 == var253);
                                }
                            }
                        }
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 76) {
                class242.field4158 = class189.field3249.method1711((byte) -67);
                class175.field3003 = class189.field3249.method1711((byte) -67);
                class260.field4596 = class189.field3249.method1711((byte) -67);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 98) {
                int var266 = class189.field3249.method1665((byte) -65);
                int var267 = class189.field3249.method1697(65280);
                int var268 = class189.field3249.method1670(2000376200);
                if (class150.method975((byte) -71, var268)) {
                    class229.method1536(var267, var266, 99);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 109) {
                class223.method1512(-11815, class189.field3249.method1692(108));
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 93) {
                int var269 = class189.field3249.method1712(6357);
                int var270 = class189.field3249.method1694((byte) -100);
                if (var269 < -70000) {
                    var270 += 32768;
                }
                class255 var271;
                if (var269 >= 0) {
                    var271 = class72.method506(var269, 0);
                } else {
                    var271 = null;
                }
                while (class189.field3249.field4224 < class85.field1593) {
                    int var272 = class189.field3249.method1710(2006);
                    int var273 = 0;
                    int var274 = class189.field3249.method1694((byte) -100);
                    if (var274 != 0) {
                        var273 = class189.field3249.method1711((byte) -67);
                        if (var273 == 255) {
                            var273 = class189.field3249.method1712(6357);
                        }
                    }
                    if (var271 != null && var272 >= 0 && var271.field4417.length > var272) {
                        var271.field4417[var272] = var274;
                        var271.field4395[var272] = var273;
                    }
                    class222.method1504(var273, var274 - 1, var272, var270, 0);
                }
                if (var271 != null) {
                    class16.method120((byte) -79, var271);
                }
                class247.method1679(0);
                class27.field409[class135.method899(31, class105.field1844++)] = class135.method899(var270, 32767);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 96) {
                class50.field878 = class189.field3249.method1711((byte) -67);
                class201.field3504 = class189.field3249.method1716(2);
                while (class189.field3249.field4224 < class85.field1593) {
                    class181.field3100 = class189.field3249.method1711((byte) -67);
                    class57.method382(-103);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 247) {
                int var275 = class189.field3249.method1711((byte) -67);
                int var276 = class189.field3249.method1711((byte) -67);
                int var277 = class189.field3249.method1694((byte) -100);
                int var278 = class189.field3249.method1711((byte) -67);
                int var279 = class189.field3249.method1711((byte) -67);
                class190.method1305(var279, (byte) -65, var275, var276, var278, var277);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 57) {
                if (class85.field1593 == 0) {
                    class190.field3263 = class24.field359;
                } else {
                    class190.field3263 = class189.field3249.method1692(117);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 9) {
                long var280 = class189.field3249.method1720((byte) -3);
                long var282 = (long) class189.field3249.method1694((byte) -100);
                long var284 = (long) class189.field3249.method1691(19388);
                int var286 = class189.field3249.method1711((byte) -67);
                int var287 = class189.field3249.method1694((byte) -100);
                long var288 = (var282 << 32) + var284;
                boolean var290 = false;
                int var291 = 0;
                label1340: while (true) {
                    if (var291 >= 100) {
                        if (var286 <= 1) {
                            for (int var292 = 0; var292 < class56.field978; var292++) {
                                if (class137.field2379[var292] == var280) {
                                    var290 = true;
                                    break label1340;
                                }
                            }
                        }
                        break;
                    }
                    if (class204.field3572[var291] == var288) {
                        var290 = true;
                        break;
                    }
                    var291++;
                }
                if (!var290 && class61.field1113 == 0) {
                    class204.field3572[class160.field2747] = var288;
                    class160.field2747 = (class160.field2747 + 1) % 100;
                    class85 var293 = class242.method1640(var287, 124).method1073(-76, class189.field3249);
                    if (var286 == 2) {
                        class32.method222(var287, (class85) null, -100, class172.method1150(new class85[] { class227.field3942, class116.method814(var280, -48).method587((byte) -101) }, 0), var293, 18);
                    } else if (var286 == 1) {
                        class32.method222(var287, (class85) null, -100, class172.method1150(new class85[] { class94.field1713, class116.method814(var280, 110).method587((byte) -109) }, 0), var293, 18);
                    } else {
                        class32.method222(var287, (class85) null, -100, class116.method814(var280, -50).method587((byte) -62), var293, 18);
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 208) {
                long var294 = class189.field3249.method1720((byte) -3);
                class189.field3249.method1690(true);
                long var296 = class189.field3249.method1720((byte) -3);
                long var298 = (long) class189.field3249.method1694((byte) -100);
                boolean var300 = false;
                long var301 = (long) class189.field3249.method1691(19388);
                long var303 = (var298 << 32) + var301;
                int var305 = class189.field3249.method1711((byte) -67);
                int var306 = class189.field3249.method1694((byte) -100);
                int var307 = 0;
                label1365: while (true) {
                    if (var307 >= 100) {
                        if (var305 <= 1) {
                            for (int var308 = 0; var308 < class56.field978; var308++) {
                                if (class137.field2379[var308] == var294) {
                                    var300 = true;
                                    break label1365;
                                }
                            }
                        }
                        break;
                    }
                    if (class204.field3572[var307] == var303) {
                        var300 = true;
                        break;
                    }
                    var307++;
                }
                if (!var300 && class61.field1113 == 0) {
                    class204.field3572[class160.field2747] = var303;
                    class160.field2747 = (class160.field2747 + 1) % 100;
                    class85 var309 = class242.method1640(var306, 127).method1073(-122, class189.field3249);
                    if (var305 == 2 || var305 == 3) {
                        class32.method222(var306, class116.method814(var296, 112).method587((byte) -72), -100, class172.method1150(new class85[] { class227.field3942, class116.method814(var294, -111).method587((byte) -128) }, 0), var309, 20);
                    } else if (var305 == 1) {
                        class32.method222(var306, class116.method814(var296, -99).method587((byte) -96), -100, class172.method1150(new class85[] { class94.field1713, class116.method814(var294, -77).method587((byte) -120) }, 0), var309, 20);
                    } else {
                        class32.method222(var306, class116.method814(var296, -107).method587((byte) -81), -100, class116.method814(var294, -120).method587((byte) -111), var309, 20);
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 227) {
                class181.field3100 = -1;
                class7.field79 = 0;
                return true;
            } else if (class181.field3100 == 180) {
                int var310 = class189.field3249.method1707((byte) -120);
                class255 var311 = class72.method506(var310, 0);
                for (int var312 = 0; var312 < var311.field4417.length; var312++) {
                    var311.field4417[var312] = -1;
                    var311.field4417[var312] = 0;
                }
                class16.method120((byte) -118, var311);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 16) {
                class183.method1259((byte) 108);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 75) {
                int var313 = class189.field3249.method1711((byte) -67);
                int var314 = class189.field3249.method1711((byte) -67);
                int var315 = class189.field3249.method1711((byte) -67);
                int var316 = class189.field3249.method1711((byte) -67);
                int var317 = class189.field3249.method1694((byte) -100);
                class97.field1756[var313] = true;
                class232.field4010[var313] = var314;
                class161.field2760[var313] = var315;
                class119.field2125[var313] = var316;
                class35.field541[var313] = var317;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 136) {
                int var318 = class189.field3249.method1678(false);
                int var319 = class189.field3249.method1694((byte) -100);
                int var320 = class189.field3249.method1664(126);
                if (class150.method975((byte) -116, var319)) {
                    class79.method550(var320, (byte) 62, var318);
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 160 || class181.field3100 == 175 || class181.field3100 == 252 || class181.field3100 == 118 || class181.field3100 == 30 || class181.field3100 == 60 || class181.field3100 == 106 || class181.field3100 == 99 || class181.field3100 == 85 || class181.field3100 == 89 || class181.field3100 == 248 || class181.field3100 == 196) {
                class57.method382(-123);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 233) {
                int var321 = class189.field3249.method1664(125);
                class181.field3099 = class107.field1882.method565(3, var321);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 223) {
                class133.method890(0);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 23) {
                class107.method743(false, 6238);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 74) {
                int var322 = class189.field3249.method1711((byte) -67);
                if (class189.field3249.method1711((byte) -67) == 0) {
                    class86.field1614[var322] = new class83();
                } else {
                    class189.field3249.field4224--;
                    class86.field1614[var322] = new class83(class189.field3249);
                }
                class67.field1234 = class43.field755;
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 90) {
                boolean var323 = true;
                long var324 = class189.field3249.method1720((byte) -3);
                if (var324 < 0L) {
                    var323 = false;
                    var324 &= Long.MAX_VALUE;
                }
                int var326 = class189.field3249.method1694((byte) -100);
                int var327 = class189.field3249.method1711((byte) -67);
                class85 var328 = class100.field1795;
                if (var326 > 0) {
                    var328 = class189.field3249.method1692(100);
                }
                class85 var329 = class116.method814(var324, -87).method587((byte) -92);
                for (int var330 = 0; var330 < class45.field810; var330++) {
                    if (class28.field428[var330] == var324) {
                        if (class222.field3890[var330] != var326) {
                            class222.field3890[var330] = var326;
                            if (var326 > 0) {
                                class148.method972(class172.method1150(new class85[] { var329, class72.field1359 }, 0), (byte) -101, class100.field1795, 5);
                            }
                            if (var326 == 0) {
                                class148.method972(class172.method1150(new class85[] { var329, class86.field1621 }, 0), (byte) -127, class100.field1795, 5);
                            }
                        }
                        class190.field3267[var330] = var328;
                        var329 = null;
                        class183.field3117[var330] = var327;
                        client.field2560[var330] = var323;
                        break;
                    }
                }
                if (var329 != null && class45.field810 < 200) {
                    class28.field428[class45.field810] = var324;
                    class1.field5[class45.field810] = var329;
                    class222.field3890[class45.field810] = var326;
                    class190.field3267[class45.field810] = var328;
                    class183.field3117[class45.field810] = var327;
                    client.field2560[class45.field810] = var323;
                    class45.field810++;
                }
                class207.field3613 = class43.field755;
                int var331 = class45.field810;
                boolean var332 = false;
                while (var331 > 0) {
                    boolean var333 = true;
                    var331--;
                    for (int var334 = 0; var334 < var331; var334++) {
                        if (class222.field3890[var334] != class7.field78 && class222.field3890[var334 + 1] == class7.field78 || class222.field3890[var334] == 0 && class222.field3890[var334 + 1] != 0) {
                            int var335 = class222.field3890[var334];
                            class222.field3890[var334] = class222.field3890[var334 + 1];
                            class222.field3890[var334 + 1] = var335;
                            class85 var336 = class190.field3267[var334];
                            class190.field3267[var334] = class190.field3267[var334 + 1];
                            class190.field3267[var334 + 1] = var336;
                            class85 var337 = class1.field5[var334];
                            class1.field5[var334] = class1.field5[var334 + 1];
                            class1.field5[var334 + 1] = var337;
                            var333 = false;
                            long var338 = class28.field428[var334];
                            class28.field428[var334] = class28.field428[var334 + 1];
                            class28.field428[var334 + 1] = var338;
                            int var340 = class183.field3117[var334];
                            class183.field3117[var334] = class183.field3117[var334 + 1];
                            class183.field3117[var334 + 1] = var340;
                            boolean var341 = client.field2560[var334];
                            client.field2560[var334] = client.field2560[var334 + 1];
                            client.field2560[var334 + 1] = var341;
                        }
                    }
                    if (var333) {
                        break;
                    }
                }
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 225) {
                int var342 = class189.field3249.method1707((byte) -87);
                int var343 = class189.field3249.method1683(-2);
                class92.method669(var343, (byte) 123, var342);
                class181.field3100 = -1;
                return true;
            } else if (class181.field3100 == 121) {
                int var344 = class189.field3249.method1712(6357);
                int var345 = class189.field3249.method1694((byte) -100);
                class255 var346;
                if (var344 >= 0) {
                    var346 = class72.method506(var344, 0);
                } else {
                    var346 = null;
                }
                if (var344 < -70000) {
                    var345 += 32768;
                }
                if (var346 != null) {
                    for (int var347 = 0; var347 < var346.field4417.length; var347++) {
                        var346.field4417[var347] = 0;
                        var346.field4395[var347] = 0;
                    }
                }
                class237.method1584(-100, var345);
                int var348 = class189.field3249.method1694((byte) -100);
                for (int var349 = 0; var349 < var348; var349++) {
                    int var350 = class189.field3249.method1697(65280);
                    int var351 = class189.field3249.method1716(2);
                    if (var351 == 255) {
                        var351 = class189.field3249.method1665((byte) -65);
                    }
                    if (var346 != null && var349 < var346.field4417.length) {
                        var346.field4417[var349] = var350;
                        var346.field4395[var349] = var351;
                    }
                    class222.method1504(var351, var350 - 1, var349, var345, 0);
                }
                if (var346 != null) {
                    class16.method120((byte) -117, var346);
                }
                class247.method1679(0);
                class27.field409[class135.method899(class105.field1844++, 31)] = class135.method899(var345, 32767);
                class181.field3100 = -1;
                return true;
            } else {
                class201.method1379((Throwable) null, "T1 - " + class181.field3100 + "," + class186.field3197 + "," + class56.field977 + " - " + class85.field1593, 2552);
                class171.method1143((byte) -115);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method1562(byte arg0) {
        field4035 = null;
        field4027 = null;
        field4037 = null;
        field4024 = null;
        field4021 = null;
        field4038 = null;
        int var1 = 126 / ((arg0 + 51) / 48);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
    public static final boolean method1563(int arg0, int arg1) {
        field4033++;
        if (arg1 == 11110) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)Ldi;")
    public static final class171 method1564(boolean arg0) {
        field4032++;
        class171 var1 = (class171) class21.field299.method1028(59);
        if (var1 != null) {
            var1.method1753(137);
            var1.method1380(true);
            return var1;
        }
        if (arg0) {
            field4037 = null;
        }
        class171 var2;
        do {
            var2 = (class171) class214.field3755.method1028(30);
            if (var2 == null) {
                return null;
            }
            if (var2.method1146((byte) 18) > class28.method200(97)) {
                return null;
            }
            var2.method1753(137);
            var2.method1380(!arg0);
        } while ((var2.field3509 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}

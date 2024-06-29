import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public static int[] field32 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lo;")
    public static class84 field31 = class15.method124("Please wait )2 attempting to reestablish", 255);

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[Ld;")
    public static class19[] field40 = new class19[12];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lo;")
    private static class84 field35 = class15.method124("wishes to trade with you)3", 255);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[Lua;")
    public static class115[] field30 = new class115[16384];

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lqc;")
    public static class97 field43 = new class97(30);

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lo;")
    public static class84 field45 = class15.method124("Your account has been disabled)3", 255);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lp;")
    public static class89 field38;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lp;")
    public static class89 field42;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lqb;")
    public static class96 field39;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
    public static int[] field46;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method8(boolean arg0) {
        field37++;
        if (!class93.field2038) {
            return;
        }
        class123.field2752 = null;
        class4.field67 = null;
        class122.field2726 = null;
        class93.field2038 = false;
        class116.field2539 = null;
        class122.field2728 = null;
        class111.field2419 = null;
        class62.field1280 = null;
        class48.field1007 = null;
        class1.field27 = null;
        class39.field797 = null;
        field46 = null;
        class36.field703 = null;
        class17.field297 = null;
        class85.field1936 = null;
        class17.field311 = null;
        class97.field2080 = null;
        class31.field621 = null;
        class51.field1094 = null;
        field39 = null;
        class14.field259 = null;
        class60.field1247 = null;
        class99.field2105 = null;
        class17.field298 = null;
        if (!arg0) {
            method11(85, (byte) 100);
        }
        class19.field371 = null;
        class80.field1720 = null;
        class38.field739 = null;
        class73.field1536 = null;
        class5.field74 = null;
        class62.field1287 = null;
        class125.field2766 = null;
        class60.field1250 = null;
        class103.field2167 = null;
        class101.field2153 = null;
        class8.field147 = null;
        class4.field66 = null;
        class24.field400 = null;
        class25.field436 = null;
        class54.field1125 = null;
        field38 = null;
        class35.field691 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 62)
    public static final void method9(int arg0) {
        if (arg0 != -31470) {
            field39 = null;
        }
        for (int var1 = -1; var1 < class107.field2257; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class85.field1949[var1];
            }
            class63 var6 = class119.field2643[var5];
            if (var6 != null && var6.field1408 > 0) {
                var6.field1408--;
                if (var6.field1408 == 0) {
                    var6.field1416 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class85.field1933; var2++) {
            int var3 = class75.field1571[var2];
            class115 var4 = field30[var3];
            if (var4 != null && var4.field1408 > 0) {
                var4.field1408--;
                if (var4.field1408 == 0) {
                    var4.field1416 = null;
                }
            }
        }
        field29++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 128)
    public static void method10(boolean arg0) {
        if (arg0) {
            return;
        }
        field40 = null;
        field39 = null;
        field42 = null;
        field43 = null;
        field35 = null;
        field38 = null;
        field31 = null;
        field30 = null;
        field32 = null;
        field45 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lo;", line = 150)
    public static final class84 method11(int arg0, byte arg1) {
        if (arg1 != -104) {
            method11(58, (byte) -17);
        }
        field36++;
        return class97.method746(arg1 ^ 0xFFFFFF98, new class84[] { class62.method489(arg0 >> 24 & 0xFF, (byte) -125), class97.field2088, class62.method489(arg0 >> 16 & 0xFF, (byte) -126), class97.field2088, class62.method489(arg0 >> 8 & 0xFF, (byte) -124), class97.field2088, class62.method489(arg0 & 0xFF, (byte) -126) });
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 163)
    public static final boolean method12(byte arg0) {
        field44++;
        if (class82.field1764 == null) {
            return false;
        }
        try {
            int var1 = class82.field1764.method393(0);
            if (var1 == 0) {
                return false;
            }
            if (class107.field2278 == -1) {
                var1--;
                class82.field1764.method390(0, 1, (byte) 58, class65.field1405.field502);
                class65.field1405.field482 = 0;
                class107.field2278 = class65.field1405.method976((byte) 105);
                class39.field794 = class19.field360[class107.field2278];
            }
            if (class39.field794 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class82.field1764.method390(0, 1, (byte) 102, class65.field1405.field502);
                class39.field794 = class65.field1405.field502[0] & 0xFF;
                var1--;
            }
            if (class39.field794 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class82.field1764.method390(0, 2, (byte) 113, class65.field1405.field502);
                var1 -= 2;
                class65.field1405.field482 = 0;
                class39.field794 = class65.field1405.method227(127);
            }
            if (var1 < class39.field794) {
                return false;
            }
            class65.field1405.field482 = 0;
            class82.field1764.method390(0, class39.field794, (byte) 98, class65.field1405.field502);
            class8.field145 = 0;
            class104.field2190 = class116.field2517;
            class116.field2517 = class39.field803;
            class39.field803 = class107.field2278;
            if (class107.field2278 == 224) {
                int var2 = class65.field1405.method204(-121);
                class123.method962(var2, -31);
                if (class78.field1657 != -1) {
                    class101.method762(256, class78.field1657);
                    class78.field1657 = -1;
                    class39.field798 = true;
                    class27.field522 = true;
                }
                if (class103.field2165 != -1) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = -1;
                    class8.method63(30, false);
                }
                if (class112.field2422 != -1) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = -1;
                }
                if (class27.field528 != -1) {
                    class101.method762(256, class27.field528);
                    class27.field528 = -1;
                }
                if (class104.field2202 != var2) {
                    class101.method762(256, class104.field2202);
                    class104.field2202 = var2;
                }
                class25.field438 = false;
                class85.field1927 = true;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 142) {
                class114.field2483 = class65.field1405.method231(255);
                class110.field2376 = class65.field1405.method229(false);
                while (class65.field1405.field482 < class39.field794) {
                    class107.field2278 = class65.field1405.method231(255);
                    class4.method16(true);
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 7) {
                int var3 = class65.field1405.method255(102);
                int var4 = class65.field1405.method228(100);
                int var5 = class65.field1405.method228(87);
                class75 var6 = class99.method752(var3, 694);
                if (var5 == 65535) {
                    class107.field2278 = -1;
                    var6.field1617 = 0;
                    return true;
                }
                class44 var7 = class126.method970(-44, var5);
                var6.field1617 = 4;
                var6.field1573 = var7.field918;
                class107.field2278 = -1;
                var6.field1587 = var7.field885 * 100 / var4;
                var6.field1610 = var5;
                var6.field1628 = var7.field873;
                return true;
            }
            if (class107.field2278 == 249) {
                class40.field820 = class65.field1405.method204(102);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 157) {
                class82.method598(class118.field2627, 6364, class39.field794, class65.field1405);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 215) {
                class8.field159 = true;
                class93.field2033 = class65.field1405.method231(255);
                class97.field2067 = class65.field1405.method231(255);
                class101.field2151 = class65.field1405.method227(127);
                class27.field529 = class65.field1405.method231(255);
                class88.field2001 = class65.field1405.method231(255);
                if (class88.field2001 >= 100) {
                    int var8 = class93.field2033 * 128 + 64;
                    int var9 = class97.field2067 * 128 + 64;
                    int var10 = class105.method778(class1.field11, var8, 3, var9) - class101.field2151;
                    int var11 = var8 - class57.field1176;
                    int var12 = var9 - class17.field313;
                    int var13 = var10 - class99.field2103;
                    int var14 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12));
                    class41.field836 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    class33.field655 = (int) (-325.949D * Math.atan2((double) var11, (double) var12)) & 0x7FF;
                    if (class41.field836 < 128) {
                        class41.field836 = 128;
                    }
                    if (class41.field836 > 383) {
                        class41.field836 = 383;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 116) {
                class39.field798 = true;
                int var15 = class65.field1405.method238(99);
                int var16 = class65.field1405.method252(4);
                int var17 = class65.field1405.method253(-17254);
                class57.field1180[var17] = var16;
                class113.field2450[var17] = var15;
                class69.field1481[var17] = 1;
                for (int var18 = 0; var18 < 98; var18++) {
                    if (class15.field262[var18] <= var16) {
                        class69.field1481[var17] = var18 + 2;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 90) {
                class110.field2378 = class65.field1405.method231(255);
                if (class110.field2378 == 1) {
                    class104.field2193 = class65.field1405.method227(127);
                }
                if (class110.field2378 >= 2 && class110.field2378 <= 6) {
                    if (class110.field2378 == 2) {
                        class24.field406 = 64;
                        class67.field1466 = 64;
                    }
                    if (class110.field2378 == 3) {
                        class67.field1466 = 64;
                        class24.field406 = 0;
                    }
                    if (class110.field2378 == 4) {
                        class24.field406 = 128;
                        class67.field1466 = 64;
                    }
                    if (class110.field2378 == 5) {
                        class67.field1466 = 0;
                        class24.field406 = 64;
                    }
                    if (class110.field2378 == 6) {
                        class67.field1466 = 128;
                        class24.field406 = 64;
                    }
                    class110.field2378 = 2;
                    client.field335 = class65.field1405.method227(127);
                    class101.field2136 = class65.field1405.method227(127);
                    class97.field2073 = class65.field1405.method231(255);
                }
                if (class110.field2378 == 10) {
                    class116.field2518 = class65.field1405.method227(127);
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 15) {
                int var19 = class65.field1405.method252(4);
                int var20 = class65.field1405.method216(-10377);
                int var21 = class65.field1405.method242(false);
                class75 var22 = class99.method752(var19, 694);
                var22.field1589 = var22.field1633 + var20;
                var22.field1579 = var22.field1564 + var21;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 232) {
                for (int var23 = 0; var23 < class79.field1692.length; var23++) {
                    if (class79.field1692[var23] != class63.field1324[var23]) {
                        class79.field1692[var23] = class63.field1324[var23];
                        class27.method223(var23, (byte) -100);
                        class39.field798 = true;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 103) {
                long var24 = class65.field1405.method240(123);
                long var26 = (long) class65.field1405.method227(127);
                long var28 = (long) class65.field1405.method241(2);
                int var30 = class65.field1405.method231(255);
                long var31 = (var26 << 32) + var28;
                boolean var33 = false;
                for (int var34 = 0; var34 < 100; var34++) {
                    if (class41.field833[var34] == var31) {
                        var33 = true;
                        break;
                    }
                }
                if (var30 <= 1) {
                    for (int var35 = 0; var35 < class118.field2629; var35++) {
                        if (class103.field2166[var35] == var24) {
                            var33 = true;
                            break;
                        }
                    }
                }
                if (!var33 && class24.field405 == 0) {
                    class41.field833[class116.field2538] = var31;
                    class116.field2538 = (class116.field2538 + 1) % 100;
                    class84 var36 = class8.method68(-19, class65.field1405).method636((byte) 29);
                    if (var30 == 2 || var30 == 3) {
                        class67.method514(7, class97.method746(0, new class84[] { class111.field2412, class57.method463(var24, (byte) -127).method637(true) }), var36, true);
                    } else if (var30 == 1) {
                        class67.method514(7, class97.method746(0, new class84[] { class49.field1067, class57.method463(var24, (byte) 117).method637(true) }), var36, true);
                    } else {
                        class67.method514(3, class57.method463(var24, (byte) -96).method637(true), var36, true);
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 216) {
                class74.field1546 = class65.field1405.method238(-111);
                class39.field798 = true;
                class27.field522 = true;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 84) {
                int var37 = class65.field1405.method252(4);
                class75 var38 = class99.method752(var37, 694);
                var38.field1617 = 3;
                var38.field1610 = class107.field2271.field1322.method531((byte) -124);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 74) {
                if (class74.field1546 == 12) {
                    class39.field798 = true;
                }
                class112.field2434 = class65.field1405.method231(255);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 162) {
                class8.field159 = true;
                class89.field2010 = class65.field1405.method231(255);
                class42.field868 = class65.field1405.method231(255);
                class58.field1200 = class65.field1405.method227(127);
                class24.field404 = class65.field1405.method231(255);
                class65.field1443 = class65.field1405.method231(255);
                if (class65.field1443 >= 100) {
                    class57.field1176 = class89.field2010 * 128 + 64;
                    class17.field313 = class42.field868 * 128 + 64;
                    class99.field2103 = class105.method778(class1.field11, class57.field1176, 3, class17.field313) - class58.field1200;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 108) {
                for (int var39 = 0; var39 < class119.field2643.length; var39++) {
                    if (class119.field2643[var39] != null) {
                        class119.field2643[var39].field1423 = -1;
                    }
                }
                for (int var40 = 0; var40 < field30.length; var40++) {
                    if (field30[var40] != null) {
                        field30[var40].field1423 = -1;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 126) {
                class118.method900(true, -50);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 32) {
                class120.field2654 = 1;
                class107.field2278 = -1;
                class85.field1927 = true;
                class73.field1523 = class73.field1524;
                class86.field1961 = false;
                return true;
            }
            if (class107.field2278 == 94) {
                int var41 = class65.field1405.method216(-10377);
                if (class45.field962 != var41) {
                    class101.method762(256, class45.field962);
                    class45.field962 = var41;
                }
                class107.field2278 = -1;
                class85.field1927 = true;
                return true;
            }
            if (class107.field2278 == 120) {
                if (class74.field1546 == 12) {
                    class39.field798 = true;
                }
                class86.field1971 = class65.field1405.method224((byte) -125);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 70) {
                int var42 = class65.field1405.method228(94);
                if (var42 == 65535) {
                    var42 = -1;
                }
                if (var42 == -1 && class25.field422 == 0) {
                    class113.method876(-1986);
                } else if (var42 != -1 && class103.field2174 != var42 && class8.field155 != 0 && class25.field422 == 0) {
                    class113.method870(var42, class8.field155, 10, false, -1, 0, 0, class104.field2197);
                }
                class103.field2174 = var42;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 62) {
                int var43 = class65.field1405.method241(2);
                int var44 = class65.field1405.method228(121);
                if (var44 == 65535) {
                    var44 = -1;
                }
                if (class8.field155 != 0 && var44 != -1) {
                    class113.method878(1, 0, var44, -13, class86.field1970, class8.field155, false);
                    class25.field422 = var43;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 17) {
                class8.field159 = false;
                for (int var45 = 0; var45 < 5; var45++) {
                    class117.field2546[var45] = false;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 241) {
                int var46 = class65.field1405.method233(123);
                int var47 = class65.field1405.method237(106);
                class75 var48 = class99.method752(var46, 694);
                class107.field2278 = -1;
                var48.field1610 = var47;
                var48.field1617 = 2;
                return true;
            }
            if (class107.field2278 == 97) {
                int var49 = class65.field1405.method227(127);
                int var50 = class65.field1405.method228(87);
                if (class104.field2202 != -1) {
                    class101.method762(256, class104.field2202);
                    class104.field2202 = -1;
                    class85.field1927 = true;
                }
                if (class103.field2165 != -1) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = -1;
                    class8.method63(30, false);
                }
                if (class112.field2422 != -1) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = -1;
                }
                if (class27.field528 != var50) {
                    class101.method762(256, class27.field528);
                    class27.field528 = var50;
                }
                if (class78.field1657 != var49) {
                    class101.method762(256, class78.field1657);
                    class78.field1657 = var49;
                }
                if (class120.field2654 != 0) {
                    class120.field2654 = 0;
                    class85.field1927 = true;
                }
                class107.field2278 = -1;
                class39.field798 = true;
                class27.field522 = true;
                class25.field438 = false;
                return true;
            }
            if (class107.field2278 == 153) {
                class101.field2148 = class65.field1405.method237(35);
                class65.field1405.method227(127);
                class65.field1377 = class65.field1405.method228(123);
                class78.field1670 = class65.field1405.method228(106);
                class60.field1260 = class65.field1405.method204(77);
                class67.field1467 = class65.field1405.method237(107);
                class44.field907 = class65.field1405.method231(255);
                class60.field1248 = class65.field1405.method204(61);
                class65.field1405.method237(63);
                class105.field2232 = class65.field1405.method228(107);
                class67.field1454 = class65.field1405.method233(126);
                class73.field1534 = class118.field2627.method75(true, class67.field1454);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 11) {
                int var51 = class65.field1405.method227(127);
                int var52 = class65.field1405.method231(255);
                int var53 = class65.field1405.method227(127);
                if (class117.field2569 != 0 && var52 != 0 && class5.field80 < 50) {
                    class115.field2497[class5.field80] = var51;
                    class15.field261[class5.field80] = var52;
                    class6.field116[class5.field80] = var53;
                    class88.field1994[class5.field80] = null;
                    class5.field80++;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 122) {
                class118.method900(false, -50);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 136) {
                int var54 = class65.field1405.method251((byte) 105);
                class75 var55 = class99.method752(var54, 694);
                for (int var56 = 0; var56 < var55.field1614.length; var56++) {
                    var55.field1614[var56] = -1;
                    var55.field1614[var56] = 0;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 28) {
                class123.field2759 = class65.field1405.method229(false);
                class107.field2278 = -1;
                if (class74.field1546 == class123.field2759) {
                    class39.field798 = true;
                    if (class123.field2759 == 3) {
                        class74.field1546 = 1;
                    } else {
                        class74.field1546 = 3;
                    }
                }
                return true;
            }
            if (class107.field2278 == 170) {
                class26.method193(0);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 250) {
                boolean var57 = class65.field1405.method231(255) == 1;
                int var58 = class65.field1405.method251((byte) 105);
                class75 var59 = class99.method752(var58, 694);
                var59.field1562 = var57;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 155) {
                long var60 = class65.field1405.method240(122);
                int var62 = class65.field1405.method227(127);
                class84 var63 = class57.method463(var60, (byte) 112).method637(true);
                for (int var64 = 0; var64 < class27.field537; var64++) {
                    if (class26.field442[var64] == var60) {
                        if (class74.field1547[var64] != var62) {
                            class74.field1547[var64] = var62;
                            class39.field798 = true;
                            if (var62 > 0) {
                                class67.method514(5, class73.field1524, class97.method746(0, new class84[] { var63, class84.field1866 }), true);
                            }
                            if (var62 == 0) {
                                class67.method514(5, class73.field1524, class97.method746(0, new class84[] { var63, class1.field12 }), true);
                            }
                        }
                        var63 = null;
                        break;
                    }
                }
                boolean var65 = false;
                if (var63 != null && class27.field537 < 200) {
                    class26.field442[class27.field537] = var60;
                    class60.field1256[class27.field537] = var63;
                    class74.field1547[class27.field537] = var62;
                    class27.field537++;
                    class39.field798 = true;
                }
                while (!var65) {
                    var65 = true;
                    for (int var66 = 0; var66 < class27.field537 - 1; var66++) {
                        if (class74.field1547[var66] != class5.field90 && class74.field1547[var66 + 1] == class5.field90 || class74.field1547[var66] == 0 && class74.field1547[var66 + 1] != 0) {
                            var65 = false;
                            int var67 = class74.field1547[var66];
                            class74.field1547[var66] = class74.field1547[var66 + 1];
                            class74.field1547[var66 + 1] = var67;
                            class84 var68 = class60.field1256[var66];
                            class60.field1256[var66] = class60.field1256[var66 + 1];
                            class60.field1256[var66 + 1] = var68;
                            long var69 = class26.field442[var66];
                            class26.field442[var66] = class26.field442[var66 + 1];
                            class26.field442[var66 + 1] = var69;
                            class39.field798 = true;
                        }
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 197) {
                class73.method551(-105);
                class107.field2278 = -1;
                return false;
            }
            if (class107.field2278 == 36) {
                int var71 = class65.field1405.method228(118);
                int var72 = class65.field1405.method233(119);
                class75 var73 = class99.method752(var72, 694);
                if (var73 != null && var73.field1627 == 0) {
                    if (var71 < 0) {
                        var71 = 0;
                    }
                    if (var71 > var73.field1609 - var73.field1623) {
                        var71 = var73.field1609 - var73.field1623;
                    }
                    var73.field1588 = var71;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 26) {
                class107.field2278 = -1;
                class73.field1523 = class73.field1524;
                class120.field2654 = 2;
                class86.field1961 = false;
                class85.field1927 = true;
                return true;
            }
            if (class107.field2278 == 3) {
                class84 var74 = class65.field1405.method244((byte) 127);
                if (var74.method665(class126.field2792, true)) {
                    boolean var86 = false;
                    class84 var87 = var74.method650(var74.method670(class116.field2542, (byte) 95), -32, 0);
                    long var88 = var87.method649((byte) -127);
                    for (int var90 = 0; var90 < class118.field2629; var90++) {
                        if (class103.field2166[var90] == var88) {
                            var86 = true;
                            break;
                        }
                    }
                    if (!var86 && class24.field405 == 0) {
                        class67.method514(4, var87, field35, true);
                    }
                } else if (var74.method665(class58.field1192, true)) {
                    boolean var75 = false;
                    class84 var76 = var74.method650(var74.method670(class116.field2542, (byte) 95), -32, 0);
                    long var77 = var76.method649((byte) -128);
                    for (int var79 = 0; var79 < class118.field2629; var79++) {
                        if (class103.field2166[var79] == var77) {
                            var75 = true;
                            break;
                        }
                    }
                    if (!var75 && class24.field405 == 0) {
                        class67.method514(8, var76, class122.field2715, true);
                    }
                } else if (var74.method665(class93.field2030, true)) {
                    class84 var80 = var74.method650(var74.method670(class116.field2542, (byte) 95), -32, 0);
                    long var81 = var80.method649((byte) -126);
                    boolean var83 = false;
                    for (int var84 = 0; var84 < class118.field2629; var84++) {
                        if (class103.field2166[var84] == var81) {
                            var83 = true;
                            break;
                        }
                    }
                    if (!var83 && class24.field405 == 0) {
                        class84 var85 = var74.method650(var74.method639(124) - 9, -32, var74.method670(class116.field2542, (byte) 95) + 1);
                        class67.method514(8, var80, var85, true);
                    }
                } else {
                    class67.method514(0, class73.field1524, var74, true);
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 85) {
                int var91 = class65.field1405.method229(false);
                class84 var92 = class65.field1405.method244((byte) 127);
                int var93 = class65.field1405.method253(-17254);
                if (var93 >= 1 && var93 <= 5) {
                    if (var92.method669(class61.field1269, true)) {
                        var92 = null;
                    }
                    class15.field283[var93 - 1] = var92;
                    class55.field1138[var93 - 1] = var91 == 0;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 110) {
                class113.method874((byte) -29);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 128) {
                class39.field798 = true;
                int var94 = class65.field1405.method251((byte) 105);
                class75 var95 = class99.method752(var94, 694);
                int var96 = class65.field1405.method227(127);
                for (int var97 = 0; var97 < var96; var97++) {
                    int var98 = class65.field1405.method229(false);
                    if (var98 == 255) {
                        var98 = class65.field1405.method251((byte) 105);
                    }
                    var95.field1614[var97] = class65.field1405.method237(52);
                    var95.field1576[var97] = var98;
                }
                for (int var99 = var96; var99 < var95.field1614.length; var99++) {
                    var95.field1614[var99] = 0;
                    var95.field1576[var99] = 0;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 133) {
                int var100 = class65.field1405.method252(4);
                int var101 = class65.field1405.method237(115);
                class75 var102 = class99.method752(var100, 694);
                class107.field2278 = -1;
                var102.field1617 = 1;
                var102.field1610 = var101;
                return true;
            }
            if (class107.field2278 == 54) {
                class118.field2629 = class39.field794 / 8;
                for (int var103 = 0; var103 < class118.field2629; var103++) {
                    class103.field2166[var103] = class65.field1405.method240(121);
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 38) {
                class103.field2169 = class65.field1405.method237(63) * 30;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 66) {
                class115.field2489 = class65.field1405.method231(255);
                class107.field2278 = -1;
                return true;
            }
            if (arg0 > -73) {
                return false;
            }
            if (class107.field2278 == 118 || class107.field2278 == 63 || class107.field2278 == 21 || class107.field2278 == 46 || class107.field2278 == 135 || class107.field2278 == 69 || class107.field2278 == 221 || class107.field2278 == 56 || class107.field2278 == 129 || class107.field2278 == 35 || class107.field2278 == 244) {
                class4.method16(true);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 195) {
                int var104 = class65.field1405.method204(71);
                class123.method962(var104, -63);
                if (class78.field1657 != -1) {
                    class101.method762(256, class78.field1657);
                    class78.field1657 = -1;
                    class27.field522 = true;
                    class39.field798 = true;
                }
                if (class104.field2202 != -1) {
                    class101.method762(256, class104.field2202);
                    class104.field2202 = -1;
                    class85.field1927 = true;
                }
                if (class103.field2165 != -1) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = -1;
                    class8.method63(30, false);
                }
                if (class112.field2422 != -1) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = -1;
                }
                if (class27.field528 != var104) {
                    class101.method762(256, class27.field528);
                    class27.field528 = var104;
                }
                class25.field438 = false;
                if (class120.field2654 != 0) {
                    class120.field2654 = 0;
                    class85.field1927 = true;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 144) {
                class110.field2376 = class65.field1405.method253(-17254);
                class114.field2483 = class65.field1405.method238(119);
                for (int var105 = class114.field2483; var105 < class114.field2483 + 8; var105++) {
                    for (int var106 = class110.field2376; var106 < class110.field2376 + 8; var106++) {
                        if (class110.field2379[class1.field11][var105][var106] != null) {
                            class110.field2379[class1.field11][var105][var106] = null;
                            class101.method768(var106, var105, 101);
                        }
                    }
                }
                for (class41 var107 = (class41) class111.field2404.method695((byte) -114); var107 != null; var107 = (class41) class111.field2404.method702(0)) {
                    if (class114.field2483 <= var107.field823 && var107.field823 < class114.field2483 + 8 && var107.field827 >= class110.field2376 && class110.field2376 + 8 > var107.field827 && class1.field11 == var107.field822) {
                        var107.field840 = 0;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 239) {
                int var108 = class65.field1405.method246(true);
                if (var108 >= 0) {
                    class123.method962(var108, -64);
                }
                if (class4.field60 != var108) {
                    class101.method762(256, class4.field60);
                    class4.field60 = var108;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 202) {
                int var109 = class65.field1405.method255(106);
                int var110 = class65.field1405.method237(84);
                int var111 = var110 >> 10 & 0x1F;
                int var112 = var110 >> 5 & 0x1F;
                int var113 = var110 & 0x1F;
                class75 var114 = class99.method752(var109, 694);
                class107.field2278 = -1;
                var114.field1583 = (var111 << 19) + (var112 << 11) + (var113 << 3);
                return true;
            }
            if (class107.field2278 == 243) {
                for (int var115 = 0; var115 < class69.field1483; var115++) {
                    class51 var116 = class117.method897((byte) -53, var115);
                    if (var116 != null && var116.field1090 == 0) {
                        class63.field1324[var115] = 0;
                        class79.field1692[var115] = 0;
                    }
                }
                class39.field798 = true;
                class107.field2278 = -1;
                if (class45.field962 != -1) {
                    class85.field1927 = true;
                }
                return true;
            }
            if (class107.field2278 == 181) {
                class128.field2830 = class65.field1405.method231(255);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 180) {
                class28.field550 = class65.field1405.method231(255);
                class125.field2771 = class65.field1405.method231(255);
                class123.field2756 = class65.field1405.method231(255);
                class85.field1927 = true;
                class107.field2278 = -1;
                class61.field1271 = true;
                return true;
            }
            if (class107.field2278 == 121) {
                class107.field2278 = -1;
                class45.field970 = 0;
                return true;
            }
            if (class107.field2278 == 53) {
                class84 var117 = class65.field1405.method244((byte) 127);
                int var118 = class65.field1405.method255(115);
                class75 var119 = class99.method752(var118, 694);
                var119.field1585 = var117;
                if (var118 >> 16 == field32[class74.field1546]) {
                    class39.field798 = true;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 45) {
                class39.field798 = true;
                int var120 = class65.field1405.method251((byte) 105);
                class75 var121 = class99.method752(var120, 694);
                while (class39.field794 > class65.field1405.field482) {
                    int var122 = class65.field1405.method221(true);
                    int var123 = class65.field1405.method227(127);
                    int var124 = class65.field1405.method231(255);
                    if (var124 == 255) {
                        var124 = class65.field1405.method251((byte) 105);
                    }
                    if (var122 >= 0 && var122 < var121.field1614.length) {
                        var121.field1614[var122] = var123;
                        var121.field1576[var122] = var124;
                    }
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 58) {
                int var125 = class65.field1405.method204(-106);
                int var126 = class65.field1405.method228(105);
                int var127 = class65.field1405.method252(4);
                int var128 = class65.field1405.method228(126);
                class75 var129 = class99.method752(var127, 694);
                var129.field1573 = var125;
                class107.field2278 = -1;
                var129.field1587 = var126;
                var129.field1628 = var128;
                return true;
            }
            if (class107.field2278 == 24) {
                int var130 = class65.field1405.method237(120);
                int var131 = class65.field1405.method228(98);
                int var132 = class65.field1405.method233(99);
                class75 var133 = class99.method752(var132, 694);
                var133.field1634 = (var130 << 16) + var131;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 25) {
                if (class78.field1657 != -1) {
                    class101.method762(256, class78.field1657);
                    class39.field798 = true;
                    class78.field1657 = -1;
                    class27.field522 = true;
                }
                if (class104.field2202 != -1) {
                    class101.method762(256, class104.field2202);
                    class104.field2202 = -1;
                    class85.field1927 = true;
                }
                if (class103.field2165 != -1) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = -1;
                    class8.method63(30, false);
                }
                if (class112.field2422 != -1) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = -1;
                }
                if (class27.field528 != -1) {
                    class101.method762(256, class27.field528);
                    class27.field528 = -1;
                }
                class107.field2278 = -1;
                if (class120.field2654 != 0) {
                    class120.field2654 = 0;
                    class85.field1927 = true;
                }
                class25.field438 = false;
                return true;
            }
            if (class107.field2278 == 252) {
                int var134 = class65.field1405.method229(false);
                int var135 = class65.field1405.method237(52);
                if (var135 == 65535) {
                    var135 = -1;
                }
                if (field32[var134] != var135) {
                    class101.method762(256, field32[var134]);
                    field32[var134] = var135;
                }
                class39.field798 = true;
                class27.field522 = true;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 203) {
                class49.field1033 = class65.field1405.method231(255);
                class39.field798 = true;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 71) {
                long var136 = class65.field1405.method240(30);
                class84 var138 = class8.method68(-75, class65.field1405).method636((byte) 29);
                class67.method514(6, class57.method463(var136, (byte) 127).method637(true), var138, true);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 163) {
                int var139 = class65.field1405.method204(-128);
                int var140 = class65.field1405.method237(65);
                class123.method962(var140, -34);
                if (var139 != -1) {
                    class123.method962(var139, -74);
                }
                if (class27.field528 != -1) {
                    class101.method762(256, class27.field528);
                    class27.field528 = -1;
                }
                if (class78.field1657 != -1) {
                    class101.method762(256, class78.field1657);
                    class78.field1657 = -1;
                }
                if (class104.field2202 != -1) {
                    class101.method762(256, class104.field2202);
                    class104.field2202 = -1;
                }
                if (class103.field2165 != var140) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = var140;
                    class8.method63(35, false);
                }
                if (class112.field2422 != var140) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = var139;
                }
                class25.field438 = false;
                class107.field2278 = -1;
                class120.field2654 = 0;
                return true;
            }
            if (class107.field2278 == 80) {
                int var141 = class65.field1405.method251((byte) 105);
                int var142 = class65.field1405.method227(127);
                class63.field1324[var142] = var141;
                if (class79.field1692[var142] != var141) {
                    class79.field1692[var142] = var141;
                    class27.method223(var142, (byte) -110);
                    if (class45.field962 != -1) {
                        class85.field1927 = true;
                    }
                    class39.field798 = true;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 223) {
                class110.field2376 = class65.field1405.method238(-114);
                class114.field2483 = class65.field1405.method231(255);
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 102) {
                int var143 = class65.field1405.method204(112);
                class123.method962(var143, -56);
                if (class104.field2202 != -1) {
                    class101.method762(256, class104.field2202);
                    class85.field1927 = true;
                    class104.field2202 = -1;
                }
                if (class103.field2165 != -1) {
                    class101.method762(256, class103.field2165);
                    class103.field2165 = -1;
                    class8.method63(30, false);
                }
                if (class112.field2422 != -1) {
                    class101.method762(256, class112.field2422);
                    class112.field2422 = -1;
                }
                if (class27.field528 != -1) {
                    class101.method762(256, class27.field528);
                    class27.field528 = -1;
                }
                if (class78.field1657 != var143) {
                    class101.method762(256, class78.field1657);
                    class78.field1657 = var143;
                }
                class27.field522 = true;
                class25.field438 = false;
                if (class120.field2654 != 0) {
                    class120.field2654 = 0;
                    class85.field1927 = true;
                }
                class107.field2278 = -1;
                class39.field798 = true;
                return true;
            }
            if (class107.field2278 == 194) {
                int var144 = class65.field1405.method204(92);
                byte var145 = class65.field1405.method213(false);
                class63.field1324[var144] = var145;
                if (class79.field1692[var144] != var145) {
                    class79.field1692[var144] = var145;
                    class27.method223(var144, (byte) -100);
                    if (class45.field962 != -1) {
                        class85.field1927 = true;
                    }
                    class39.field798 = true;
                }
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 255) {
                int var146 = class65.field1405.method231(255);
                int var147 = class65.field1405.method231(255);
                int var148 = class65.field1405.method231(255);
                int var149 = class65.field1405.method231(255);
                class117.field2546[var146] = true;
                class25.field433[var146] = var147;
                class42.field863[var146] = var148;
                class41.field824[var146] = var149;
                class93.field2031[var146] = 0;
                class107.field2278 = -1;
                return true;
            }
            if (class107.field2278 == 213) {
                int var150 = class65.field1405.method252(4);
                int var151 = class65.field1405.method242(false);
                class75 var152 = class99.method752(var150, 694);
                class107.field2278 = -1;
                if (var152.field1565 != var151 || var151 == -1) {
                    var152.field1556 = 0;
                    var152.field1565 = var151;
                    var152.field1596 = 0;
                }
                return true;
            }
            class45.method392((byte) 38, "T1 - " + class107.field2278 + "," + class116.field2517 + "," + class104.field2190 + " - " + class39.field794, null);
            class73.method551(-74);
        } catch (IOException var156) {
            class40.method357(-19030);
        } catch (Exception var157) {
            String var154 = "T2 - " + class107.field2278 + "," + class116.field2517 + "," + class104.field2190 + " - " + class39.field794 + "," + (class107.field2271.field1374[0] + class106.field2242) + "," + (class107.field2271.field1436[0] + class36.field714) + " - ";
            for (int var155 = 0; var155 < class39.field794 && var155 < 50; var155++) {
                var154 = var154 + class65.field1405.field502[var155] + ",";
            }
            class45.method392((byte) 86, var154, var157);
            class73.method551(-99);
        }
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 1919)
    public static final void method13(int arg0) {
        field34++;
        class8.field160 = true;
        class112.method865(13);
        if (arg0 != 1) {
            method11(-89, (byte) 44);
        }
        if (class86.field1961) {
            class16.field291.method311(class73.field1541, 239, 40, 0);
            class16.field291.method311(class97.method746(arg0 ^ 0x1, new class84[] { class73.field1526, class19.field351 }), 239, 60, 128);
        } else if (class120.field2654 == 1) {
            class16.field291.method311(class8.field156, 239, 40, 0);
            class16.field291.method311(class97.method746(0, new class84[] { class73.field1523, class19.field351 }), 239, 60, 128);
        } else if (class120.field2654 == 2) {
            class16.field291.method311(class120.field2702, 239, 40, 0);
            class16.field291.method311(class97.method746(arg0 - 1, new class84[] { class73.field1523, class19.field351 }), 239, 60, 128);
        } else if (class120.field2654 == 3) {
            if (class73.field1540 != class73.field1523) {
                class16.method131(class73.field1523, -111);
                class73.field1540 = class73.field1523;
            }
            class34 var1 = class123.field2762;
            class32.method291(0, 0, 463, 77);
            for (int var2 = 0; var2 < class106.field2254; var2++) {
                int var3 = var2 * 14 + 18 - class4.field65;
                if (var3 > 0 && var3 < 110) {
                    var1.method311(class19.field366[var2], 239, var3, 0);
                }
            }
            class32.method292();
            if (class106.field2254 > 5) {
                class44.method376(77, 13379, 463, class4.field65, 0, class106.field2254 * 14 + 7);
            }
            if (class73.field1523.method639(arg0 + 121) == 0) {
                class16.field291.method311(class28.field548, 239, 40, 255);
            } else if (class106.field2254 == 0) {
                class16.field291.method311(class103.field2175, 239, 40, 0);
            }
            var1.method311(class97.method746(arg0 - 1, new class84[] { class73.field1523, class19.field351 }), 239, 90, 0);
            class32.method281(0, 77, 479, 0);
        } else if (class19.field339 != null) {
            class16.field291.method311(class19.field339, 239, 40, 0);
            class16.field291.method311(class41.field830, 239, 60, 128);
        } else if (class104.field2202 != -1) {
            boolean var18 = class26.method198(0, -1, class104.field2202, 2, 0, 96, 0, 479, 2);
            if (!var18) {
                class85.field1927 = true;
            }
        } else if (class45.field962 == -1) {
            int var4 = 0;
            class34 var5 = class123.field2762;
            class32.method291(0, 0, 463, 77);
            for (int var6 = 0; var6 < 100; var6++) {
                if (class75.field1597[var6] != null) {
                    int var8 = class40.field808 + 70 - var4 * 14;
                    int var9 = class89.field2007[var6];
                    byte var10 = 0;
                    class84 var11 = class127.field2803[var6];
                    if (var11 != null && var11.method638(class49.field1067, 124)) {
                        var11 = var11.method655(28418, 5);
                        var10 = 1;
                    }
                    if (var11 != null && var11.method638(class111.field2412, 68)) {
                        var11 = var11.method655(28418, 5);
                        var10 = 2;
                    }
                    if (var9 == 0) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var5.method320(class75.field1597[var6], 4, var8, 0);
                        }
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class28.field550 == 0 || class28.field550 == 1 && class45.method394(var11, -20281))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            int var12 = 4;
                            if (var10 == 1) {
                                class82.field1770[0].method732(var12, var8 - 12);
                                var12 += 14;
                            }
                            if (var10 == 2) {
                                class82.field1770[1].method732(var12, var8 - 12);
                                var12 += 14;
                            }
                            var5.method320(class97.method746(0, new class84[] { var11, class116.field2542 }), var12, var8, 0);
                            int var13 = var12 + var5.method313(var11) + 8;
                            var5.method320(class75.field1597[var6], var13, var8, 255);
                        }
                    }
                    if ((var9 == 3 || var9 == 7) && class122.field2730 == 0 && (var9 == 7 || class125.field2771 == 0 || class125.field2771 == 1 && class45.method394(var11, -20281))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var14 = 4;
                            var5.method320(class54.field1127, var14, var8, 0);
                            int var15 = var14 + var5.method313(class100.field2123);
                            if (var10 == 1) {
                                class82.field1770[0].method732(var15, var8 - 12);
                                var15 += 14;
                            }
                            if (var10 == 2) {
                                class82.field1770[1].method732(var15, var8 - 12);
                                var15 += 14;
                            }
                            var5.method320(class97.method746(0, new class84[] { var11, class116.field2542 }), var15, var8, 0);
                            int var16 = var15 + var5.method313(var11) + 8;
                            var5.method320(class75.field1597[var6], var16, var8, 8388608);
                        }
                        var4++;
                    }
                    if (var9 == 4 && (class123.field2756 == 0 || class123.field2756 == 1 && class45.method394(var11, arg0 - 20282))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var5.method320(class97.method746(0, new class84[] { var11, class128.field2819, class75.field1597[var6] }), 4, var8, 8388736);
                        }
                    }
                    if (var9 == 5 && class122.field2730 == 0 && class125.field2771 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var5.method320(class75.field1597[var6], 4, var8, 8388608);
                        }
                        var4++;
                    }
                    if (var9 == 6 && class122.field2730 == 0 && class125.field2771 < 2) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var5.method320(class97.method746(arg0 - 1, new class84[] { class119.field2649, var11, class116.field2542 }), 4, var8, 0);
                            var5.method320(class75.field1597[var6], var5.method313(class97.method746(0, new class84[] { class119.field2649, var11 })) + 12, var8, 8388608);
                        }
                    }
                    if (var9 == 8 && (class123.field2756 == 0 || class123.field2756 == 1 && class45.method394(var11, -20281))) {
                        if (var8 > 0 && var8 < 110) {
                            var5.method320(class97.method746(arg0 ^ 0x1, new class84[] { var11, class128.field2819, class75.field1597[var6] }), 4, var8, 8270336);
                        }
                        var4++;
                    }
                }
            }
            class32.method292();
            class69.field1485 = var4 * 14 + 7;
            if (class69.field1485 < 78) {
                class69.field1485 = 78;
            }
            class44.method376(77, arg0 ^ 0x3442, 463, class69.field1485 - class40.field808 - 77, 0, class69.field1485);
            class84 var7;
            if (class107.field2271 == null || class107.field2271.field1312 == null) {
                var7 = class105.field2224;
            } else {
                var7 = class107.field2271.field1312;
            }
            var5.method320(class97.method746(0, new class84[] { var7, class116.field2542 }), 4, 90, 0);
            var5.method320(class97.method746(0, new class84[] { class73.field1539, class19.field351 }), var5.method313(class97.method746(0, new class84[] { var7, class1.field26 })) + 6, 90, 255);
            class32.method281(0, 77, 479, 0);
        } else {
            boolean var17 = class26.method198(0, -1, class45.field962, 3, 0, 96, 0, 479, 2);
            if (!var17) {
                class85.field1927 = true;
            }
        }
        if (class116.field2529 && class1.field24 == 2) {
            class28.method262(30307);
        }
        class5.method19(arg0 - 116, class30.field593);
    }
}

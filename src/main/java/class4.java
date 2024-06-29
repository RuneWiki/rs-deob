import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field61 = 0;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field76 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lva;")
    private static class121 field67 = class107.method797(" is already on your friend list", -10983);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lva;")
    private static class121 field70 = class107.method797("flash2:", -10983);

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lva;")
    public static class121 field63 = class107.method797("backvmid3", -10983);

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field59 = -1;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lva;")
    private static class121 field74 = class107.method797("shake:", -10983);

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lva;")
    public static class121 field72 = field70;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lva;")
    public static class121 field73 = field67;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lva;")
    public static class121 field56 = field74;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lm;")
    public static class72 field55;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Loa;")
    public class85 field64;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 17)
    public static final void method27(int arg0) {
        if (class69.field1628 != null) {
            class97 var1 = class69.field1628;
            synchronized (class69.field1628) {
                class69.field1628 = null;
            }
        }
        if (arg0 > 105) {
            field60++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z", line = 38)
    public static final boolean method28(int arg0) {
        field77++;
        if (class119.field2740 == null) {
            return false;
        }
        try {
            int var1 = class119.field2740.method291(false);
            if (var1 == 0) {
                return false;
            }
            if (~class116.field2640 == arg0) {
                var1--;
                class119.field2740.method292((byte) 32, 1, class66.field1578.field2512, 0);
                class66.field1578.field2507 = 0;
                class116.field2640 = class66.field1578.method621(-121);
                class5.field90 = class41.field944[class116.field2640];
            }
            if (class5.field90 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class119.field2740.method292((byte) 32, 1, class66.field1578.field2512, 0);
                class5.field90 = class66.field1578.field2512[0] & 0xFF;
                var1--;
            }
            if (class5.field90 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class119.field2740.method292((byte) 32, 2, class66.field1578.field2512, 0);
                var1 -= 2;
                class66.field1578.field2507 = 0;
                class5.field90 = class66.field1578.method870(-1);
            }
            if (var1 < class5.field90) {
                return false;
            }
            class66.field1578.field2507 = 0;
            class119.field2740.method292((byte) 32, class5.field90, class66.field1578.field2512, 0);
            class41.field954 = 0;
            class92.field2096 = class60.field1438;
            class60.field1438 = class57.field1329;
            class57.field1329 = class116.field2640;
            if (class116.field2640 == 41) {
                class58.method418(arg0 ^ 0xFFFFFFBC);
                class116.field2640 = -1;
                return false;
            }
            if (class116.field2640 == 17) {
                class27.method212(94, true);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 125) {
                class28.field716 = class66.field1578.method819(-762);
                class97.field2168 = true;
                class116.field2640 = -1;
                class25.field630 = true;
                return true;
            }
            if (class116.field2640 == 232) {
                int var2 = class66.field1578.method834(550259848);
                if (var2 >= 0) {
                    class61.method443((byte) -68, var2);
                }
                if (class91.field2073 != var2) {
                    class125.method982(-74, class91.field2073);
                    class91.field2073 = var2;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 89) {
                class1.field16 = 1;
                class18.field370 = class18.field415;
                class9.field140 = true;
                class40.field902 = false;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 46) {
                class118.field2677 = class66.field1578.method821(true);
                class116.field2640 = -1;
                if (class28.field716 == class118.field2677) {
                    class97.field2168 = true;
                    if (class118.field2677 == 3) {
                        class28.field716 = 1;
                    } else {
                        class28.field716 = 3;
                    }
                }
                return true;
            }
            if (class116.field2640 == 40) {
                int var3 = class66.field1578.method821(true);
                int var4 = class66.field1578.method821(true);
                int var5 = class66.field1578.method821(true);
                int var6 = class66.field1578.method821(true);
                class91.field2067[var3] = true;
                class69.field1627[var3] = var4;
                class1.field5[var3] = var5;
                class58.field1350[var3] = var6;
                class82.field1903[var3] = 0;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 135) {
                class40.field902 = false;
                class18.field370 = class18.field415;
                class116.field2640 = -1;
                class1.field16 = 2;
                class9.field140 = true;
                return true;
            }
            if (class116.field2640 == 211) {
                class35.field846 = class66.field1578.method819(-762);
                class80.field1858 = class66.field1578.method821(true);
                for (int var7 = class35.field846; var7 < class35.field846 + 8; var7++) {
                    for (int var8 = class80.field1858; var8 < class80.field1858 + 8; var8++) {
                        if (class14.field249[class121.field2807][var7][var8] != null) {
                            class14.field249[class121.field2807][var7][var8] = null;
                            class95.method643(var7, var8, false);
                        }
                    }
                }
                for (class25 var9 = (class25) class67.field1607.method57((byte) 86); var9 != null; var9 = (class25) class67.field1607.method66(-29860)) {
                    if (class35.field846 <= var9.field627 && var9.field627 < class35.field846 + 8 && class80.field1858 <= var9.field633 && class80.field1858 + 8 > var9.field633 && class121.field2807 == var9.field618) {
                        var9.field622 = 0;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 154) {
                int var10 = class66.field1578.method870(-1);
                int var11 = class66.field1578.method821(true);
                int var12 = class66.field1578.method870(-1);
                if (class107.field2445 != 0 && var11 != 0 && class50.field1191 < 50) {
                    class78.field1804[class50.field1191] = var10;
                    class114.field2598[class50.field1191] = var11;
                    class118.field2680[class50.field1191] = var12;
                    class90.field2039[class50.field1191] = null;
                    class50.field1191++;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 25) {
                int var13 = class66.field1578.method829(arg0 ^ 0x200);
                class61.method443((byte) -90, var13);
                if (class69.field1651 != -1) {
                    class125.method982(-67, class69.field1651);
                    class25.field630 = true;
                    class97.field2168 = true;
                    class69.field1651 = -1;
                }
                if (class63.field1525 != -1) {
                    class125.method982(-111, class63.field1525);
                    class63.field1525 = -1;
                    class60.method437((byte) 67, 30);
                }
                if (field59 != -1) {
                    class125.method982(-106, field59);
                    field59 = -1;
                }
                if (class26.field659 != -1) {
                    class125.method982(arg0 ^ 0xFFFFFF96, class26.field659);
                    class26.field659 = -1;
                }
                if (class90.field2038 != var13) {
                    class125.method982(-100, class90.field2038);
                    class90.field2038 = var13;
                }
                class126.field2883 = false;
                class9.field140 = true;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 196) {
                int var14 = class66.field1578.method829(512);
                int var15 = class66.field1578.method842((byte) 107);
                class61.method443((byte) -74, var14);
                if (var15 != -1) {
                    class61.method443((byte) -128, var15);
                }
                if (class26.field659 != -1) {
                    class125.method982(-121, class26.field659);
                    class26.field659 = -1;
                }
                if (class69.field1651 != -1) {
                    class125.method982(-100, class69.field1651);
                    class69.field1651 = -1;
                }
                if (class90.field2038 != -1) {
                    class125.method982(-65, class90.field2038);
                    class90.field2038 = -1;
                }
                if (class63.field1525 != var14) {
                    class125.method982(arg0 ^ 0xFFFFFFA4, class63.field1525);
                    class63.field1525 = var14;
                    class60.method437((byte) 67, 35);
                }
                if (field59 != var14) {
                    class125.method982(arg0 ^ 0xFFFFFFA3, field59);
                    field59 = var15;
                }
                class1.field16 = 0;
                class126.field2883 = false;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 23) {
                for (int var16 = 0; var16 < class81.field1882; var16++) {
                    class126 var17 = class76.method526(var16, false);
                    if (var17 != null && var17.field2875 == 0) {
                        class26.field672[var16] = 0;
                        class90.field2045[var16] = 0;
                    }
                }
                if (class118.field2676 != -1) {
                    class9.field140 = true;
                }
                class116.field2640 = -1;
                class97.field2168 = true;
                return true;
            }
            if (class116.field2640 == 225) {
                class42.method285((byte) 124);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 129) {
                long var18 = class66.field1578.method854(108);
                int var20 = class66.field1578.method870(~arg0);
                class121 var21 = class95.method636(-3, var18).method963(-14767);
                for (int var22 = 0; var22 < class8.field119; var22++) {
                    if (class92.field2092[var22] == var18) {
                        if (class41.field951[var22] != var20) {
                            class41.field951[var22] = var20;
                            class97.field2168 = true;
                            if (var20 > 0) {
                                class62.method448(class18.field415, class113.method866((byte) -68, new class121[] { var21, class118.field2675 }), 5, false);
                            }
                            if (var20 == 0) {
                                class62.method448(class18.field415, class113.method866((byte) -126, new class121[] { var21, class97.field2192 }), 5, false);
                            }
                        }
                        var21 = null;
                        break;
                    }
                }
                if (var21 != null && class8.field119 < 200) {
                    class92.field2092[class8.field119] = var18;
                    class128.field2962[class8.field119] = var21;
                    class41.field951[class8.field119] = var20;
                    class97.field2168 = true;
                    class8.field119++;
                }
                boolean var23 = false;
                while (!var23) {
                    var23 = true;
                    for (int var24 = 0; var24 < class8.field119 - 1; var24++) {
                        if (class41.field951[var24] != class20.field547 && class41.field951[var24 + 1] == class20.field547 || class41.field951[var24] == 0 && class41.field951[var24 + 1] != 0) {
                            int var25 = class41.field951[var24];
                            class41.field951[var24] = class41.field951[var24 + 1];
                            var23 = false;
                            class41.field951[var24 + 1] = var25;
                            class121 var26 = class128.field2962[var24];
                            class128.field2962[var24] = class128.field2962[var24 + 1];
                            class128.field2962[var24 + 1] = var26;
                            long var27 = class92.field2092[var24];
                            class92.field2092[var24] = class92.field2092[var24 + 1];
                            class92.field2092[var24 + 1] = var27;
                            class97.field2168 = true;
                        }
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 128) {
                int var29 = class66.field1578.method822(-708753192);
                int var30 = class66.field1578.method842((byte) 110);
                int var31 = class66.field1578.method842((byte) 122);
                class19 var32 = class125.method979(var29, 65535);
                var32.field521 = (var30 << 16) + var31;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 118) {
                class116.field2632 = true;
                class128.field2935 = class66.field1578.method821(true);
                class26.field669 = class66.field1578.method821(true);
                class20.field542 = class66.field1578.method870(-1);
                class23.field616 = class66.field1578.method821(true);
                class69.field1640 = class66.field1578.method821(true);
                if (class69.field1640 >= 100) {
                    class15.field304 = class128.field2935 * 128 + 64;
                    class37.field860 = class26.field669 * 128 + 64;
                    class116.field2645 = class47.method340(class15.field304, -6, class121.field2807, class37.field860) - class20.field542;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 248) {
                class116.field2632 = false;
                for (int var33 = 0; var33 < 5; var33++) {
                    class91.field2067[var33] = false;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 221) {
                long var34 = class66.field1578.method854(20);
                class121 var36 = class22.method186(class66.field1578, 32767).method966((byte) 80);
                class62.method448(class95.method636(arg0 - 3, var34).method963(arg0 - 14767), var36, 6, false);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 195) {
                for (int var37 = 0; var37 < class90.field2045.length; var37++) {
                    if (class90.field2045[var37] != class26.field672[var37]) {
                        class90.field2045[var37] = class26.field672[var37];
                        class29.method227(8, var37);
                        class97.field2168 = true;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 150) {
                int var38 = class66.field1578.method830((byte) 94);
                int var39 = class66.field1578.method829(512);
                class19 var40 = class125.method979(var38, arg0 ^ 0xFFFF);
                class116.field2640 = -1;
                var40.field452 = 1;
                var40.field450 = var39;
                return true;
            }
            if (class116.field2640 == 175) {
                for (int var41 = 0; var41 < class127.field2895.length; var41++) {
                    if (class127.field2895[var41] != null) {
                        class127.field2895[var41].field793 = -1;
                    }
                }
                for (int var42 = 0; var42 < class8.field110.length; var42++) {
                    if (class8.field110[var42] != null) {
                        class8.field110[var42].field793 = -1;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 61 || class116.field2640 == 249 || class116.field2640 == 136 || class116.field2640 == 108 || class116.field2640 == 238 || class116.field2640 == 100 || class116.field2640 == 184 || class116.field2640 == 92 || class116.field2640 == 18 || class116.field2640 == 209 || class116.field2640 == 158) {
                class82.method564(true);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 97) {
                class50.method363(43, class5.field90, class66.field1578, class1.field18);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 254) {
                if (class28.field716 == 12) {
                    class97.field2168 = true;
                }
                class57.field1316 = class66.field1578.method821(true);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 78) {
                int var43 = class66.field1578.method822(-708753192);
                int var44 = class66.field1578.method827((byte) -41);
                class19 var45 = class125.method979(var43, 65535);
                if (var45.field480 != var44 || var44 == -1) {
                    var45.field470 = 0;
                    var45.field448 = 0;
                    var45.field480 = var44;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 222) {
                int var46 = class66.field1578.method834(550259848);
                int var47 = class66.field1578.method830((byte) 94);
                int var48 = class66.field1578.method820(true);
                class19 var49 = class125.method979(var47, arg0 + 65535);
                class116.field2640 = -1;
                var49.field509 = var49.field444 + var48;
                var49.field504 = var49.field516 + var46;
                return true;
            }
            if (class116.field2640 == 98) {
                boolean var50 = class66.field1578.method819(arg0 ^ 0xFFFFFD06) == 1;
                int var51 = class66.field1578.method830((byte) 94);
                class19 var52 = class125.method979(var51, arg0 ^ 0xFFFF);
                class116.field2640 = -1;
                var52.field507 = var50;
                return true;
            }
            if (class116.field2640 == 76) {
                int var53 = class66.field1578.method825((byte) -6);
                class19 var54 = class125.method979(var53, 65535);
                var54.field452 = 3;
                var54.field450 = class62.field1494.field1769.method569((byte) 8);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 157) {
                class97.field2179 = class66.field1578.method821(true);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 2) {
                int var55 = class66.field1578.method842((byte) 116);
                int var56 = class66.field1578.method830((byte) 94);
                int var57 = class66.field1578.method870(-1);
                class19 var58 = class125.method979(var56, arg0 + 65535);
                if (var55 == 65535) {
                    var58.field452 = 0;
                    class116.field2640 = -1;
                    return true;
                }
                class119 var59 = class114.method872((byte) 121, var55);
                var58.field461 = var59.field2717;
                var58.field477 = var59.field2730 * 100 / var57;
                var58.field450 = var55;
                var58.field452 = 4;
                class116.field2640 = -1;
                var58.field485 = var59.field2698;
                return true;
            }
            if (class116.field2640 == 6) {
                class50.method360((byte) 75);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 63) {
                int var60 = class66.field1578.method842((byte) 126);
                class61.method443((byte) -102, var60);
                if (class90.field2038 != -1) {
                    class125.method982(arg0 - 59, class90.field2038);
                    class90.field2038 = -1;
                    class9.field140 = true;
                }
                if (class63.field1525 != -1) {
                    class125.method982(arg0 - 85, class63.field1525);
                    class63.field1525 = -1;
                    class60.method437((byte) 67, 30);
                }
                if (field59 != -1) {
                    class125.method982(-105, field59);
                    field59 = -1;
                }
                if (class26.field659 != -1) {
                    class125.method982(-116, class26.field659);
                    class26.field659 = -1;
                }
                if (class69.field1651 != var60) {
                    class125.method982(-107, class69.field1651);
                    class69.field1651 = var60;
                }
                class126.field2883 = false;
                class97.field2168 = true;
                if (class1.field16 != 0) {
                    class9.field140 = true;
                    class1.field16 = 0;
                }
                class25.field630 = true;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 242) {
                int var61 = class66.field1578.method851(arg0 - 12543);
                if (var61 == 65535) {
                    var61 = -1;
                }
                int var62 = class66.field1578.method819(arg0 - 762);
                if (class42.field956[var62] != var61) {
                    class125.method982(-51, class42.field956[var62]);
                    class42.field956[var62] = var61;
                }
                class116.field2640 = -1;
                class97.field2168 = true;
                class25.field630 = true;
                return true;
            }
            if (class116.field2640 == 252) {
                class21.field560 = class66.field1578.method851(-12543) * 30;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 26) {
                class80.field1858 = class66.field1578.method845(false);
                class35.field846 = class66.field1578.method819(-762);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 10) {
                int var63 = class66.field1578.method851(-12543);
                int var64 = class66.field1578.method842((byte) 113);
                if (class90.field2038 != -1) {
                    class125.method982(-71, class90.field2038);
                    class9.field140 = true;
                    class90.field2038 = -1;
                }
                if (class63.field1525 != -1) {
                    class125.method982(-48, class63.field1525);
                    class63.field1525 = -1;
                    class60.method437((byte) 67, 30);
                }
                if (field59 != -1) {
                    class125.method982(-114, field59);
                    field59 = -1;
                }
                if (class26.field659 != var63) {
                    class125.method982(-108, class26.field659);
                    class26.field659 = var63;
                }
                if (class69.field1651 != var64) {
                    class125.method982(arg0 ^ 0xFFFFFFBA, class69.field1651);
                    class69.field1651 = var64;
                }
                class116.field2640 = -1;
                class25.field630 = true;
                class97.field2168 = true;
                if (class1.field16 != 0) {
                    class9.field140 = true;
                    class1.field16 = 0;
                }
                class126.field2883 = false;
                return true;
            }
            if (class116.field2640 == 77) {
                int var65 = class66.field1578.method837(true);
                int var66 = class66.field1578.method870(-1);
                int var67 = var66 >> 10 & 0x1F;
                int var68 = var66 >> 5 & 0x1F;
                int var69 = var66 & 0x1F;
                class19 var70 = class125.method979(var65, 65535);
                var70.field524 = (var67 << 19) + (var68 << 11) + (var69 << 3);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 13) {
                int var71 = class66.field1578.method829(512);
                int var72 = class66.field1578.method830((byte) 94);
                class19 var73 = class125.method979(var72, 65535);
                class116.field2640 = -1;
                if (var73 != null && var73.field479 == 0) {
                    if (var71 < 0) {
                        var71 = 0;
                    }
                    if (var73.field476 - var73.field449 < var71) {
                        var71 = var73.field476 - var73.field449;
                    }
                    var73.field481 = var71;
                }
                return true;
            }
            if (class116.field2640 == 122) {
                int var74 = class66.field1578.method853(true);
                class121 var75 = class66.field1578.method861(20356);
                int var76 = class66.field1578.method845(false);
                if (var76 >= 1 && var76 <= 5) {
                    if (var75.method940(class86.field1996, (byte) -122)) {
                        var75 = null;
                    }
                    class78.field1800[var76 - 1] = var75;
                    class67.field1617[var76 - 1] = var74 == 0;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 139) {
                class97.field2169 = class5.field90 / 8;
                for (int var77 = 0; var77 < class97.field2169; var77++) {
                    class69.field1650[var77] = class66.field1578.method854(115);
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 174) {
                int var78 = class66.field1578.method851(-12543);
                int var79 = class66.field1578.method851(-12543);
                int var80 = class66.field1578.method842((byte) 104);
                int var81 = class66.field1578.method837(true);
                class19 var82 = class125.method979(var81, arg0 ^ 0xFFFF);
                class116.field2640 = -1;
                var82.field477 = var79;
                var82.field461 = var80;
                var82.field485 = var78;
                return true;
            }
            if (class116.field2640 == 15) {
                if (class69.field1651 != -1) {
                    class125.method982(-128, class69.field1651);
                    class69.field1651 = -1;
                    class25.field630 = true;
                    class97.field2168 = true;
                }
                if (class90.field2038 != -1) {
                    class125.method982(arg0 ^ 0xFFFFFF84, class90.field2038);
                    class9.field140 = true;
                    class90.field2038 = -1;
                }
                if (class63.field1525 != -1) {
                    class125.method982(-73, class63.field1525);
                    class63.field1525 = -1;
                    class60.method437((byte) 67, 30);
                }
                if (field59 != -1) {
                    class125.method982(arg0 ^ 0xFFFFFF95, field59);
                    field59 = -1;
                }
                if (class26.field659 != -1) {
                    class125.method982(-71, class26.field659);
                    class26.field659 = -1;
                }
                if (class1.field16 != 0) {
                    class1.field16 = 0;
                    class9.field140 = true;
                }
                class126.field2883 = false;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 217) {
                class63.field1526 = class66.field1578.method821(true);
                class19.field492 = class66.field1578.method821(true);
                field69 = class66.field1578.method821(true);
                class91.field2070 = true;
                class9.field140 = true;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 164) {
                int var83 = class66.field1578.method851(-12543);
                if (var83 == 65535) {
                    var83 = -1;
                }
                if (var83 == -1 && class85.field1957 == 0) {
                    class18.method153(false);
                } else if (var83 != -1 && class57.field1323 != var83 && class61.field1477 != 0 && class85.field1957 == 0) {
                    class18.method156((byte) 85, 0, 10, class61.field1477, false, 0, var83, class128.field2956);
                }
                class57.field1323 = var83;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 182) {
                int var84 = class66.field1578.method855((byte) 1);
                int var85 = class66.field1578.method829(512);
                if (var85 == 65535) {
                    var85 = -1;
                }
                if (class61.field1477 != 0 && var85 != -1) {
                    class18.method154(class61.field1477, var85, class119.field2756, 0, 1, (byte) -100, false);
                    class85.field1957 = var84;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 50) {
                class8.field109 = class66.field1578.method829(512);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 161) {
                class20.field541 = class66.field1578.method821(true);
                class97.field2168 = true;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 255) {
                class97.field2168 = true;
                int var86 = class66.field1578.method822(-708753192);
                class19 var87 = class125.method979(var86, arg0 + 65535);
                while (class66.field1578.field2507 < class5.field90) {
                    int var88 = class66.field1578.method846(false);
                    int var89 = class66.field1578.method870(-1);
                    int var90 = class66.field1578.method821(true);
                    if (var90 == 255) {
                        var90 = class66.field1578.method822(-708753192);
                    }
                    if (var88 >= 0 && var87.field478.length > var88) {
                        var87.field478[var88] = var89;
                        var87.field487[var88] = var90;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 231) {
                int var91 = class66.field1578.method851(-12543);
                int var92 = class66.field1578.method822(-708753192);
                class19 var93 = class125.method979(var92, arg0 + 65535);
                var93.field452 = 2;
                var93.field450 = var91;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 114) {
                int var94 = class66.field1578.method822(-708753192);
                client.field433 = class1.field18.method774(17009, var94);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 69) {
                class97.field2168 = true;
                int var95 = class66.field1578.method822(-708753192);
                class19 var96 = class125.method979(var95, arg0 + 65535);
                int var97 = class66.field1578.method870(-1);
                for (int var98 = 0; var98 < var97; var98++) {
                    int var99 = class66.field1578.method821(true);
                    if (var99 == 255) {
                        var99 = class66.field1578.method830((byte) 94);
                    }
                    var96.field478[var98] = class66.field1578.method829(512);
                    var96.field487[var98] = var99;
                }
                for (int var100 = var97; var100 < var96.field478.length; var100++) {
                    var96.field478[var100] = 0;
                    var96.field487[var100] = 0;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 183) {
                int var101 = class66.field1578.method825((byte) -6);
                class121 var102 = class66.field1578.method861(arg0 + 20356);
                class19 var103 = class125.method979(var101, 65535);
                var103.field468 = var102;
                if (var101 >> 16 == class42.field956[class28.field716]) {
                    class97.field2168 = true;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 241) {
                class95.field2120 = class66.field1578.method821(true);
                if (class95.field2120 == 1) {
                    class107.field2436 = class66.field1578.method870(-1);
                }
                if (class95.field2120 >= 2 && class95.field2120 <= 6) {
                    if (class95.field2120 == 2) {
                        class61.field1469 = 64;
                        class47.field1103 = 64;
                    }
                    if (class95.field2120 == 3) {
                        class61.field1469 = 64;
                        class47.field1103 = 0;
                    }
                    if (class95.field2120 == 4) {
                        class61.field1469 = 64;
                        class47.field1103 = 128;
                    }
                    if (class95.field2120 == 5) {
                        class61.field1469 = 0;
                        class47.field1103 = 64;
                    }
                    if (class95.field2120 == 6) {
                        class61.field1469 = 128;
                        class47.field1103 = 64;
                    }
                    class95.field2120 = 2;
                    class113.field2559 = class66.field1578.method870(-1);
                    class37.field871 = class66.field1578.method870(-1);
                    class19.field493 = class66.field1578.method821(true);
                }
                if (class95.field2120 == 10) {
                    class59.field1415 = class66.field1578.method870(~arg0);
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 88) {
                class43.field988 = 0;
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 163) {
                byte var104 = class66.field1578.method852(0);
                int var105 = class66.field1578.method842((byte) 124);
                class26.field672[var105] = var104;
                if (class90.field2045[var105] != var104) {
                    class90.field2045[var105] = var104;
                    class29.method227(8, var105);
                    class97.field2168 = true;
                    if (class118.field2676 != -1) {
                        class9.field140 = true;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 75) {
                class121 var106 = class66.field1578.method861(arg0 + 20356);
                if (var106.method934(class99.field2212, -25730)) {
                    class121 var107 = var106.method957(var106.method950(-2, class29.field763), true, 0);
                    long var108 = var107.method932(126);
                    boolean var110 = false;
                    for (int var111 = 0; var111 < class97.field2169; var111++) {
                        if (class69.field1650[var111] == var108) {
                            var110 = true;
                            break;
                        }
                    }
                    if (!var110 && class20.field528 == 0) {
                        class62.method448(var107, class126.field2867, 4, false);
                    }
                } else if (var106.method934(class19.field506, arg0 ^ 0xFFFF9B7E)) {
                    class121 var118 = var106.method957(var106.method950(-2, class29.field763), true, 0);
                    long var119 = var118.method932(106);
                    boolean var121 = false;
                    for (int var122 = 0; var122 < class97.field2169; var122++) {
                        if (class69.field1650[var122] == var119) {
                            var121 = true;
                            break;
                        }
                    }
                    if (!var121 && class20.field528 == 0) {
                        class62.method448(var118, class61.field1459, 8, false);
                    }
                } else if (var106.method934(class56.field1282, -25730)) {
                    class121 var112 = var106.method957(var106.method950(-2, class29.field763), true, 0);
                    long var113 = var112.method932(114);
                    boolean var115 = false;
                    for (int var116 = 0; var116 < class97.field2169; var116++) {
                        if (class69.field1650[var116] == var113) {
                            var115 = true;
                            break;
                        }
                    }
                    if (!var115 && class20.field528 == 0) {
                        class121 var117 = var106.method957(var106.method942(36) - 9, true, var106.method950(-2, class29.field763) + 1);
                        class62.method448(var112, var117, 8, false);
                    }
                } else {
                    class62.method448(class18.field415, var106, 0, false);
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 138) {
                int var123 = class66.field1578.method827((byte) -58);
                if (class118.field2676 != var123) {
                    class125.method982(arg0 ^ 0xFFFFFFB1, class118.field2676);
                    class118.field2676 = var123;
                }
                class116.field2640 = -1;
                class9.field140 = true;
                return true;
            }
            if (class116.field2640 == 145) {
                int var124 = class66.field1578.method851(-12543);
                int var125 = class66.field1578.method830((byte) 94);
                class26.field672[var124] = var125;
                if (class90.field2045[var124] != var125) {
                    class90.field2045[var124] = var125;
                    class29.method227(8, var124);
                    if (class118.field2676 != -1) {
                        class9.field140 = true;
                    }
                    class97.field2168 = true;
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 200) {
                long var126 = class66.field1578.method854(7);
                long var128 = (long) class66.field1578.method870(-1);
                long var130 = (long) class66.field1578.method848(16711680);
                int var132 = class66.field1578.method821(true);
                boolean var133 = false;
                long var134 = (var128 << 32) + var130;
                for (int var136 = 0; var136 < 100; var136++) {
                    if (class5.field82[var136] == var134) {
                        var133 = true;
                        break;
                    }
                }
                if (var132 <= 1) {
                    for (int var137 = 0; var137 < class97.field2169; var137++) {
                        if (class69.field1650[var137] == var126) {
                            var133 = true;
                            break;
                        }
                    }
                }
                if (!var133 && class20.field528 == 0) {
                    class5.field82[class22.field583] = var134;
                    class22.field583 = (class22.field583 + 1) % 100;
                    class121 var138 = class22.method186(class66.field1578, arg0 ^ 0x7FFF).method966((byte) 39);
                    if (var132 == 2 || var132 == 3) {
                        class62.method448(class113.method866((byte) -64, new class121[] { class54.field1249, class95.method636(-3, var126).method963(-14767) }), var138, 7, false);
                    } else if (var132 == 1) {
                        class62.method448(class113.method866((byte) -41, new class121[] { class126.field2866, class95.method636(-3, var126).method963(arg0 ^ 0xFFFFC651) }), var138, 7, false);
                    } else {
                        class62.method448(class95.method636(-3, var126).method963(-14767), var138, 3, false);
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 215) {
                if (class28.field716 == 12) {
                    class97.field2168 = true;
                }
                class23.field604 = class66.field1578.method827((byte) -92);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 142) {
                int var139 = class66.field1578.method870(-1);
                class61.method443((byte) -99, var139);
                if (class69.field1651 != -1) {
                    class125.method982(arg0 - 64, class69.field1651);
                    class97.field2168 = true;
                    class69.field1651 = -1;
                    class25.field630 = true;
                }
                if (class90.field2038 != -1) {
                    class125.method982(-99, class90.field2038);
                    class90.field2038 = -1;
                    class9.field140 = true;
                }
                if (class63.field1525 != -1) {
                    class125.method982(-113, class63.field1525);
                    class63.field1525 = -1;
                    class60.method437((byte) 67, 30);
                }
                if (field59 != -1) {
                    class125.method982(-66, field59);
                    field59 = -1;
                }
                if (class26.field659 != var139) {
                    class125.method982(arg0 ^ 0xFFFFFF82, class26.field659);
                    class26.field659 = var139;
                }
                class116.field2640 = -1;
                class126.field2883 = false;
                if (class1.field16 != 0) {
                    class9.field140 = true;
                    class1.field16 = 0;
                }
                return true;
            }
            if (class116.field2640 == 127) {
                class27.method212(123, false);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 169) {
                class35.field846 = class66.field1578.method853(true);
                class80.field1858 = class66.field1578.method821(true);
                while (class5.field90 > class66.field1578.field2507) {
                    class116.field2640 = class66.field1578.method821(true);
                    class82.method564(true);
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 11) {
                class97.field2168 = true;
                int var140 = class66.field1578.method821(true);
                int var141 = class66.field1578.method830((byte) 94);
                int var142 = class66.field1578.method819(arg0 - 762);
                class22.field581[var142] = var141;
                class29.field747[var142] = var140;
                client.field440[var142] = 1;
                for (int var143 = 0; var143 < 98; var143++) {
                    if (var141 >= class59.field1377[var143]) {
                        client.field440[var142] = var143 + 2;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 253) {
                class116.field2632 = true;
                class82.field1898 = class66.field1578.method821(true);
                class60.field1428 = class66.field1578.method821(true);
                class90.field2031 = class66.field1578.method870(-1);
                class100.field2231 = class66.field1578.method821(true);
                class52.field1216 = class66.field1578.method821(true);
                if (class52.field1216 >= 100) {
                    int var144 = class60.field1428 * 128 + 64;
                    int var145 = class82.field1898 * 128 + 64;
                    int var146 = class47.method340(var145, -6, class121.field2807, var144) - class90.field2031;
                    int var147 = var145 - class15.field304;
                    int var148 = var144 - class37.field860;
                    int var149 = var146 - class116.field2645;
                    int var150 = (int) Math.sqrt((double) (var147 * var147 + var148 * var148));
                    class91.field2066 = (int) (Math.atan2((double) var149, (double) var150) * 325.949D) & 0x7FF;
                    class48.field1152 = (int) (Math.atan2((double) var147, (double) var148) * -325.949D) & 0x7FF;
                    if (class91.field2066 < 128) {
                        class91.field2066 = 128;
                    }
                    if (class91.field2066 > 383) {
                        class91.field2066 = 383;
                    }
                }
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 147) {
                class1.field8 = class66.field1578.method821(true);
                class116.field2640 = -1;
                return true;
            }
            if (class116.field2640 == 197) {
                int var151 = class66.field1578.method825((byte) -6);
                class19 var152 = class125.method979(var151, 65535);
                for (int var153 = 0; var153 < var152.field478.length; var153++) {
                    var152.field478[var153] = -1;
                    var152.field478[var153] = 0;
                }
                class116.field2640 = -1;
                return true;
            }
            class119.method920(true, "T1 - " + class116.field2640 + "," + class60.field1438 + "," + class92.field2096 + " - " + class5.field90, null);
            class58.method418(-88);
        } catch (IOException var157) {
            class21.method184(arg0 ^ 0x5306);
        } catch (Exception var158) {
            String var155 = "T2 - " + class116.field2640 + "," + class60.field1438 + "," + class92.field2096 + " - " + class5.field90 + "," + (class62.field1494.field767[0] + class129.field2977) + "," + (class9.field132 + class62.field1494.field730[0]) + " - ";
            for (int var156 = 0; class5.field90 > var156 && var156 < 50; var156++) {
                var155 = var155 + class66.field1578.field2512[var156] + ",";
            }
            class119.method920(true, var155, var158);
            class58.method418(-113);
        }
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lbc;", line = 1784)
    public static final class10 method29(int arg0) {
        field71++;
        class10 var1 = new class10();
        var1.field161 = class1.field12;
        var1.field163 = class25.field643;
        var1.field166 = class116.field2643[0];
        var1.field162 = class64.field1547[0];
        var1.field167 = class107.field2450[0];
        var1.field165 = class86.field1973[0];
        int var2 = var1.field167 * var1.field165;
        byte[] var3 = class57.field1320[0];
        var1.field164 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            var1.field164[var4] = class28.field701[class90.method614(255, var3[var4])];
        }
        class1.method5((byte) 116);
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ld;II)I", line = 1821)
    public static final int method30(class19 arg0, int arg1, int arg2) {
        field57++;
        if (arg0.field508 == null || arg2 >= arg0.field508.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field508[arg2];
            int var4 = 0;
            int var5 = 0;
            if (arg1 < 108) {
                method29(123);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class29.field747[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = client.field440[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class22.field581[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class19 var12 = class125.method979(var11, 65535);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class114.method872((byte) 121, var13).field2729 || class128.field2950)) {
                        for (int var14 = 0; var14 < var12.field478.length; var14++) {
                            if (var13 + 1 == var12.field478[var14]) {
                                var8 += var12.field487[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class90.field2045[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 6) {
                    var8 = class59.field1377[client.field440[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class90.field2045[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class62.field1494.field1770;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class63.field1521[var15]) {
                            var8 += client.field440[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class19 var18 = class125.method979(var17, 65535);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class114.method872((byte) 121, var19).field2729 || class128.field2950)) {
                        for (int var20 = 0; var20 < var18.field478.length; var20++) {
                            if (var19 + 1 == var18.field478[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class57.field1316;
                }
                if (var7 == 12) {
                    var8 = class23.field604;
                }
                if (var7 == 13) {
                    int var21 = class90.field2045[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class84.method593(9, var23);
                }
                if (var7 == 18) {
                    var8 = (class62.field1494.field750 >> 7) + class129.field2977;
                }
                if (var7 == 19) {
                    var8 = (class62.field1494.field742 >> 7) + class9.field132;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 2044)
    public static void method31(boolean arg0) {
        field67 = null;
        field74 = null;
        field70 = null;
        field56 = null;
        field55 = null;
        field73 = null;
        field63 = null;
        field72 = null;
        if (!arg0) {
            field63 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 2064)
    public static final void method32(byte arg0, Component arg1) {
        try {
            Method var2 = class105.field2420;
            if (var2 != null) {
                var2.invoke(arg1, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg1.addKeyListener(class69.field1628);
        int var3 = 49 % ((arg0 - 5) / 43);
        arg1.addFocusListener(class69.field1628);
        field68++;
    }
}

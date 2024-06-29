import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class24 {

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lqf;")
    private static class117 field825 = class72.method514(126, "Loading game screen )2 ");

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "[I")
    public static int[] field826 = new int[25];

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lqf;")
    public static class117 field828 = class72.method514(101, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "Lqf;")
    public static class117 field832 = field825;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
    public static int field838 = 0;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "Lqf;")
    private static class117 field839 = class72.method514(121, "You have only just left another world)3");

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Z")
    public static volatile boolean field823 = true;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lqf;")
    public static class117 field842 = class72.method514(119, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lqf;")
    public static class117 field831 = field839;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "Leb;")
    public static class31 field837 = new class31(30);

    @OriginalMember(owner = "client!ff", name = "tb", descriptor = "Lqf;")
    private static class117 field848 = class72.method514(115, "red:");

    @OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lqf;")
    public static class117 field850 = field848;

    @OriginalMember(owner = "client!ff", name = "wb", descriptor = "Lqf;")
    public static class117 field851 = field848;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ff", name = "qb", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ff", name = "rb", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!ff", name = "sb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "[I")
    public static int[] field840;

    @OriginalMember(owner = "client!ff", name = "ub", descriptor = "[I")
    public static int[] field849;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLla;)V")
    public final void method291(byte arg0, class77 arg1) {
        field830++;
        if (arg0 != -65) {
            field848 = null;
        }
        while (true) {
            int var3 = arg1.method570((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method298((byte) -86, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lmf;I)I")
    public static final int method292(class89 arg0, int arg1) {
        class19 var2 = (class19) class100.field2418.method1221(73, ((long) arg0.field2125 << 32) + ((long) arg0.field2122));
        field834++;
        if (arg1 != -5447) {
            method296(-112, 116);
        }
        return var2 == null ? arg0.field2106 : var2.field292;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static void method293(byte arg0) {
        field851 = null;
        field828 = null;
        field850 = null;
        field831 = null;
        field832 = null;
        field842 = null;
        field837 = null;
        field839 = null;
        field849 = null;
        if (arg0 >= -21) {
            field826 = null;
        }
        field840 = null;
        field826 = null;
        field825 = null;
        field848 = null;
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)Z")
    public static final boolean method294(int arg0) {
        field845++;
        if (class125.field2957 == null) {
            return false;
        }
        try {
            int var1 = class125.field2957.method731(0);
            if (var1 == 0) {
                return false;
            }
            if (class26.field518 == -1) {
                class125.field2957.method729(1, 0, (byte) 124, class96.field2338.field1748);
                var1--;
                class96.field2338.field1691 = 0;
                class26.field518 = class96.field2338.method962(8);
                class71.field1502 = class35.field734[class26.field518];
            }
            if (class71.field1502 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class125.field2957.method729(1, 0, (byte) 124, class96.field2338.field1748);
                var1--;
                class71.field1502 = class96.field2338.field1748[0] & 0xFF;
            }
            if (class71.field1502 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class125.field2957.method729(2, 0, (byte) 127, class96.field2338.field1748);
                class96.field2338.field1691 = 0;
                var1 -= 2;
                class71.field1502 = class96.field2338.method597(96);
            }
            if (arg0 <= 60) {
                return true;
            }
            if (class71.field1502 > var1) {
                return false;
            }
            class96.field2338.field1691 = 0;
            class125.field2957.method729(class71.field1502, 0, (byte) 124, class96.field2338.field1748);
            class40.field793 = 0;
            class136.field3256 = class19.field300;
            class19.field300 = class81.field1851;
            class81.field1851 = class26.field518;
            if (class26.field518 == 251) {
                int var2 = class96.field2338.method597(43);
                if (var2 == 65535) {
                    var2 = -1;
                }
                class35.method270((byte) -66, var2);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 117) {
                int var3 = class96.field2338.method557((byte) -114);
                int var4 = class96.field2338.method574((byte) -120);
                if (var4 == 65535) {
                    var4 = -1;
                }
                class147.method1178(-1, var3, var4);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 155) {
                int var5 = class96.field2338.method598((byte) 77);
                int var6 = class96.field2338.method567(false);
                class89 var7 = class104.method801(var6, -92);
                class26.field518 = -1;
                if (var7.field2064 != var5 || var5 == -1) {
                    var7.field2111 = 0;
                    var7.field2064 = var5;
                    var7.field2083 = 0;
                }
                return true;
            }
            if (class26.field518 == 50) {
                class121.method969(50, class44.field873, class96.field2338, class71.field1502);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 21) {
                int var8 = class96.field2338.method554((byte) 35);
                class89 var9 = class104.method801(var8, -73);
                var9.field2091 = 3;
                var9.field2113 = class141.field3395.field355.method780(512);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 136) {
                class64.field1281 = class96.field2338.method551(107);
                class26.field518 = -1;
                class139.field3310 = true;
                class55.field1144 = true;
                return true;
            }
            if (class26.field518 == 118) {
                int var10 = class96.field2338.method598((byte) 77);
                if (class152.field3738 != var10) {
                    class140.method1087(-81, class152.field3738);
                    class152.field3738 = var10;
                }
                class87.field1993 = true;
                method297(class152.field3738, 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 179) {
                if (class95.field2288 != -1) {
                    class140.method1087(-110, class95.field2288);
                    class95.field2288 = -1;
                }
                class26.field518 = -1;
                class124.field2924 = 1;
                class141.field3393 = class141.field3351;
                class87.field1993 = true;
                class69.field1445 = false;
                return true;
            }
            if (class26.field518 == 102) {
                int var11 = class96.field2338.method587(false);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class96.field2338.method551(112);
                if (class27.field529[var12] == var11) {
                    class35.method274((byte) -97, class27.field529[var12]);
                } else {
                    class140.method1087(-90, class27.field529[var12]);
                    class27.field529[var12] = var11;
                }
                class55.field1144 = true;
                class139.field3310 = true;
                method297(class27.field529[var12], 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 197) {
                if (class95.field2288 != -1) {
                    class140.method1087(-71, class95.field2288);
                    class95.field2288 = -1;
                }
                class124.field2924 = 2;
                class69.field1445 = false;
                class141.field3393 = class141.field3351;
                class87.field1993 = true;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 192) {
                int var13 = class96.field2338.method574((byte) -104);
                class130.method1012(var13, 97);
                if (class140.field3343 != -1) {
                    class140.method1087(-91, class140.field3343);
                    class55.field1144 = true;
                    class139.field3310 = true;
                    class140.field3343 = -1;
                }
                if (class95.field2288 != -1) {
                    class140.method1087(-97, class95.field2288);
                    class87.field1993 = true;
                    class95.field2288 = -1;
                }
                if (class135.field3227 != -1) {
                    class140.method1087(-83, class135.field3227);
                    class135.field3227 = -1;
                    class62.method430(30, (byte) -47);
                }
                if (class70.field1482 != -1) {
                    class140.method1087(-92, class70.field1482);
                    class70.field1482 = -1;
                }
                if (class96.field2316 == var13) {
                    class35.method274((byte) -109, class96.field2316);
                } else {
                    class140.method1087(-75, class96.field2316);
                    class96.field2316 = var13;
                }
                class115.field2719 = -1;
                if (class124.field2924 != 0) {
                    class87.field1993 = true;
                    class124.field2924 = 0;
                }
                method297(class96.field2316, 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 170) {
                long var14 = class96.field2338.method586(-13628);
                class117 var16 = class46.method317(client.method165(class96.field2338, 1).method941(-50));
                class93.method739(6, 0, var16, class116.method900(var14, 113).method945(-127));
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 201) {
                int var17 = class96.field2338.method603(112);
                if (var17 >= 0) {
                    class130.method1012(var17, -70);
                }
                if (class56.field1155 != var17) {
                    class140.method1087(-102, class56.field1155);
                    class56.field1155 = var17;
                }
                method297(class56.field1155, 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 67) {
                long var18 = class96.field2338.method586(-13628);
                long var20 = (long) class96.field2338.method597(50);
                long var22 = (long) class96.field2338.method557((byte) -114);
                int var24 = class96.field2338.method570((byte) 123);
                long var25 = (var20 << 32) + var22;
                boolean var27 = false;
                for (int var28 = 0; var28 < 100; var28++) {
                    if (class43.field862[var28] == var25) {
                        var27 = true;
                        break;
                    }
                }
                if (var24 <= 1) {
                    for (int var29 = 0; var29 < class128.field3029; var29++) {
                        if (class134.field3195[var29] == var18) {
                            var27 = true;
                            break;
                        }
                    }
                }
                if (!var27 && class149.field3708 == 0) {
                    class43.field862[class60.field1232] = var25;
                    class60.field1232 = (class60.field1232 + 1) % 100;
                    class117 var30 = class46.method317(client.method165(class96.field2338, 1).method941(-81));
                    if (var24 == 2 || var24 == 3) {
                        class93.method739(7, 0, var30, class73.method530((byte) -83, new class117[] { class124.field2921, class116.method900(var18, 102).method945(-113) }));
                    } else if (var24 == 1) {
                        class93.method739(7, 0, var30, class73.method530((byte) -83, new class117[] { class53.field1105, class116.method900(var18, 94).method945(-122) }));
                    } else {
                        class93.method739(3, 0, var30, class116.method900(var18, 107).method945(-128));
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 70) {
                class64.field1334 = class96.field2338.method570((byte) 123);
                class139.field3310 = true;
                class26.field518 = -1;
                class97.field2362 += 32;
                return true;
            }
            if (class26.field518 == 35) {
                class128.field3029 = class71.field1502 / 8;
                for (int var31 = 0; var31 < class128.field3029; var31++) {
                    class134.field3195[var31] = class96.field2338.method586(-13628);
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 226) {
                class122.field2901 = class96.field2338.method559((byte) -73);
                class20.field318 = class96.field2338.method570((byte) 123);
                for (int var32 = class20.field318; var32 < class20.field318 + 8; var32++) {
                    for (int var33 = class122.field2901; var33 < class122.field2901 + 8; var33++) {
                        if (class43.field858[class140.field3344][var32][var33] != null) {
                            class43.field858[class140.field3344][var32][var33] = null;
                            class67.method477(1, var33, var32);
                        }
                    }
                }
                for (class23 var34 = (class23) class97.field2356.method27(18823); var34 != null; var34 = (class23) class97.field2356.method25((byte) -128)) {
                    if (class20.field318 <= var34.field450 && class20.field318 + 8 > var34.field450 && var34.field439 >= class122.field2901 && class122.field2901 + 8 > var34.field439 && class140.field3344 == var34.field445) {
                        var34.field453 = 0;
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 27) {
                class125.method990(true, (byte) 16);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 255) {
                class16.field245 = class96.field2338.method589((byte) -128) * 30;
                class95.field2294 = class43.field856;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 181) {
                class139.field3310 = true;
                int var35 = class96.field2338.method596(91);
                int var36 = class96.field2338.method570((byte) 123);
                int var37 = class96.field2338.method572(126);
                class4.field66[var36] = var37;
                class82.field1880[var36] = var35;
                field826[var36] = 1;
                for (int var38 = 0; var38 < 98; var38++) {
                    if (var37 >= class8.field124[var38]) {
                        field826[var36] = var38 + 2;
                    }
                }
                class103.field2502[class16.method135(31, class134.field3181++)] = var36;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 247) {
                class76.field1676 = true;
                class31.field658 = class96.field2338.method570((byte) 123);
                class114.field2696 = class96.field2338.method570((byte) 123);
                class52.field1065 = class96.field2338.method597(86);
                class66.field1392 = class96.field2338.method570((byte) 123);
                class135.field3241 = class96.field2338.method570((byte) 123);
                if (class135.field3241 >= 100) {
                    class87.field1959 = class31.field658 * 128 + 64;
                    class117.field2813 = class114.field2696 * 128 + 64;
                    class136.field3247 = class80.method626(class87.field1959, class140.field3344, class117.field2813, -125) - class52.field1065;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 203) {
                class4.field65 = class96.field2338.method570((byte) 123);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 177) {
                class141.field3400 = class96.field2338.method577(-121);
                if (class95.field2288 != -1) {
                    class140.method1087(-109, class95.field2288);
                    class95.field2288 = -1;
                }
                class69.field1445 = false;
                class124.field2924 = 4;
                class87.field1993 = true;
                class141.field3393 = class141.field3351;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 200) {
                class32.field695 = class96.field2338.method570((byte) 123);
                class70.field1475 = class96.field2338.method570((byte) 123);
                class75.field1646 = class96.field2338.method570((byte) 123);
                class103.field2498 = true;
                class87.field1993 = true;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 24) {
                int var39 = class96.field2338.method584(255);
                int var40 = class96.field2338.method589((byte) -128);
                if (var40 == 65535) {
                    var40 = -1;
                }
                int var41 = class96.field2338.method584(255);
                int var42 = class96.field2338.method597(108);
                if (var42 == 65535) {
                    var42 = -1;
                }
                for (int var43 = var42; var43 <= var40; var43++) {
                    long var44 = ((long) var39 << 32) + (long) var43;
                    class70 var46 = class100.field2418.method1221(19, var44);
                    if (var46 != null) {
                        var46.method495(-122);
                    }
                    class100.field2418.method1219(new class19(var41), (byte) -109, var44);
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 154) {
                for (int var47 = 0; var47 < class58.field1189; var47++) {
                    class91 var48 = class116.method903(var47, 1);
                    if (var48 != null && var48.field2238 == 0) {
                        class85.field1937[var47] = 0;
                        class23.field461[var47] = 0;
                    }
                }
                class139.field3310 = true;
                class97.field2362 += 32;
                if (class152.field3738 != -1) {
                    class87.field1993 = true;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 174) {
                class96.field2338.method584(255);
                class96.field2338.method570((byte) 123);
                class96.field2338.method574((byte) -106);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 22) {
                int var49 = class96.field2338.method567(false);
                class117 var50 = class96.field2338.method577(-116);
                class89 var51 = class104.method801(var49, -105);
                var51.field2118 = var50;
                if (var49 >> 16 == class27.field529[class64.field1281]) {
                    class139.field3310 = true;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 238) {
                class78.field1765 = class96.field2338.method570((byte) 123);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 225) {
                int var52 = class96.field2338.method589((byte) -128);
                int var53 = class96.field2338.method572(-35);
                if (var52 == 65535) {
                    var52 = -1;
                }
                int var54 = class96.field2338.method572(116);
                class89 var55 = class104.method801(var53, -94);
                if (var55.field2102) {
                    var55.field2070 = var52;
                    var55.field2069 = var54;
                    class72 var57 = class27.method206(var52, (byte) 90);
                    var55.field2150 = var57.field1578;
                    var55.field2147 = var57.field1556;
                    if (var55.field2152 > 0) {
                        var55.field2147 = var55.field2147 * 32 / var55.field2152;
                    }
                    var55.field2078 = var57.field1570;
                    var55.field2138 = var57.field1542;
                    var55.field2149 = var57.field1589;
                    var55.field2071 = var57.field1579;
                    class50.method375(false, var55);
                } else if (var52 == -1) {
                    class26.field518 = -1;
                    var55.field2091 = 0;
                    return true;
                } else {
                    class72 var56 = class27.method206(var52, (byte) 90);
                    var55.field2078 = var56.field1570;
                    var55.field2147 = var56.field1556 * 100 / var54;
                    var55.field2150 = var56.field1578;
                    var55.field2113 = var52;
                    var55.field2091 = 4;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 172) {
                for (int var58 = 0; var58 < class149.field3709.length; var58++) {
                    if (class149.field3709[var58] != null) {
                        class149.field3709[var58].field2017 = -1;
                    }
                }
                for (int var59 = 0; var59 < class72.field1533.length; var59++) {
                    if (class72.field1533[var59] != null) {
                        class72.field1533[var59].field2017 = -1;
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 208) {
                int var60 = class96.field2338.method584(255);
                class78.field1768 = class44.field873.method1072(var60, true);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 206) {
                class76.field1676 = true;
                class66.field1379 = class96.field2338.method570((byte) 123);
                class133.field3152 = class96.field2338.method570((byte) 123);
                class35.field739 = class96.field2338.method597(30);
                class78.field1767 = class96.field2338.method570((byte) 123);
                class27.field536 = class96.field2338.method570((byte) 123);
                if (class27.field536 >= 100) {
                    int var61 = class66.field1379 * 128 + 64;
                    int var62 = class133.field3152 * 128 + 64;
                    int var63 = class80.method626(var61, class140.field3344, var62, -126) - class35.field739;
                    int var64 = var61 - class87.field1959;
                    int var65 = var63 - class136.field3247;
                    int var66 = var62 - class117.field2813;
                    int var67 = (int) Math.sqrt((double) (var64 * var64 + var66 * var66));
                    class77.field1722 = (int) (Math.atan2((double) var65, (double) var67) * 325.949D) & 0x7FF;
                    class27.field530 = (int) (-325.949D * Math.atan2((double) var64, (double) var66)) & 0x7FF;
                    if (class77.field1722 < 128) {
                        class77.field1722 = 128;
                    }
                    if (class77.field1722 > 383) {
                        class77.field1722 = 383;
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 106) {
                class82.field1895 = class96.field2338.method587(false);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 17) {
                class26.field518 = -1;
                class94.field2287 = 0;
                return true;
            }
            if (class26.field518 == 71) {
                int var68 = class96.field2338.method587(false);
                int var69 = class96.field2338.method554((byte) -99);
                class85.field1937[var68] = var69;
                if (class23.field461[var68] != var69) {
                    class23.field461[var68] = var69;
                    class78.method608(var68, true);
                    class139.field3310 = true;
                    if (class152.field3738 != -1) {
                        class87.field1993 = true;
                    }
                }
                class40.field797[class16.method135(class97.field2362++, 31)] = var68;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 254) {
                class15.method133(118);
                class26.field518 = -1;
                return false;
            }
            if (class26.field518 == 188) {
                int var70 = class96.field2338.method574((byte) -119);
                int var71 = class96.field2338.method554((byte) -122);
                class89 var72 = class104.method801(var71, -93);
                class26.field518 = -1;
                var72.field2113 = var70;
                var72.field2091 = 2;
                return true;
            }
            if (class26.field518 == 8) {
                int var73 = class96.field2338.method587(false);
                class27.method204(507, var73);
                class15.field217[class16.method135(class92.field2241++, 31)] = class16.method135(var73, 32767);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 193) {
                class117 var74 = class96.field2338.method577(-124);
                Object[] var75 = new Object[var74.method915(27) + 1];
                for (int var76 = var74.method915(27) - 1; var76 >= 0; var76--) {
                    if (var74.method911(false, var76) == 115) {
                        var75[var76 + 1] = class96.field2338.method577(-121);
                    } else {
                        var75[var76 + 1] = Integer.valueOf(class96.field2338.method554((byte) -100));
                    }
                }
                var75[0] = Integer.valueOf(class96.field2338.method554((byte) -101));
                class18.method145(var75, null, 0, 0, null, 18859, 0);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 7) {
                for (int var77 = 0; var77 < class23.field461.length; var77++) {
                    if (class85.field1937[var77] != class23.field461[var77]) {
                        class23.field461[var77] = class85.field1937[var77];
                        class78.method608(var77, true);
                        class139.field3310 = true;
                        class40.field797[class16.method135(class97.field2362++, 31)] = var77;
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 162) {
                class97.field2362 += 32;
                long var78 = class96.field2338.method586(-13628);
                if (var78 == 0L) {
                    class95.field2292 = null;
                    class26.field518 = -1;
                    class62.field1244 = 0;
                    class97.field2363 = null;
                    return true;
                }
                class97.field2363 = class116.method900(var78, 92);
                int var80 = class96.field2338.method570((byte) 123);
                if (var80 == 255) {
                    class26.field518 = -1;
                    return true;
                }
                class45[] var81 = new class45[100];
                class62.field1244 = var80;
                for (int var82 = 0; var82 < class62.field1244; var82++) {
                    var81[var82] = new class45();
                    var81[var82].field1495 = class96.field2338.method586(-13628);
                    var81[var82].field893 = class116.method900(var81[var82].field1495, 116);
                    var81[var82].field892 = class96.field2338.method597(92);
                }
                boolean var83 = false;
                int var84 = class62.field1244;
                while (var84 > 0) {
                    boolean var85 = true;
                    var84--;
                    for (int var86 = 0; var86 < var84; var86++) {
                        if (var81[var86].field893.method923(var81[var86 + 1].field893, false) > 0) {
                            class45 var87 = var81[var86];
                            var85 = false;
                            var81[var86] = var81[var86 + 1];
                            var81[var86 + 1] = var87;
                        }
                    }
                    if (var85) {
                        break;
                    }
                }
                class26.field518 = -1;
                class95.field2292 = var81;
                return true;
            }
            if (class26.field518 == 189) {
                int var88 = class96.field2338.method587(false);
                int var89 = class96.field2338.method554((byte) -114);
                class89 var90 = class104.method801(var89, -122);
                class26.field518 = -1;
                if (var90 != null && var90.field2142 == 0) {
                    if (var90.field2123 - var90.field2095 < var88) {
                        var88 = var90.field2123 - var90.field2095;
                    }
                    if (var88 < 0) {
                        var88 = 0;
                    }
                    var90.field2043 = var88;
                }
                return true;
            }
            if (class26.field518 == 49) {
                class125.method990(false, (byte) 16);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 81) {
                long var91 = class96.field2338.method586(-13628);
                byte var93 = class96.field2338.method592((byte) -104);
                long var94 = class96.field2338.method586(-13628);
                long var96 = (long) class96.field2338.method597(49);
                long var98 = (long) class96.field2338.method557((byte) -114);
                int var100 = class96.field2338.method570((byte) 123);
                long var101 = (var96 << 32) + var98;
                boolean var103 = false;
                for (int var104 = 0; var104 < 100; var104++) {
                    if (class43.field862[var104] == var101) {
                        var103 = true;
                        break;
                    }
                }
                if (var100 <= 1) {
                    for (int var105 = 0; var105 < class128.field3029; var105++) {
                        if (class134.field3195[var105] == var91) {
                            var103 = true;
                            break;
                        }
                    }
                }
                if (!var103 && class149.field3708 == 0) {
                    class43.field862[class60.field1232] = var101;
                    class60.field1232 = (class60.field1232 + 1) % 100;
                    class117 var106 = class46.method317(client.method165(class96.field2338, 1).method941(-50));
                    class117 var107 = class73.method530((byte) -83, new class117[] { class22.field413, class116.method900(var94, 121), class107.field2554, class79.method614(15591, var93), class102.field2468 });
                    if (var100 == 2 || var100 == 3) {
                        class93.method739(7, 0, var106, class73.method530((byte) -83, new class117[] { var107, class124.field2921, class116.method900(var91, 127).method945(-90) }));
                    } else if (var100 == 1) {
                        class93.method739(7, 0, var106, class73.method530((byte) -83, new class117[] { var107, class53.field1105, class116.method900(var91, 103).method945(-124) }));
                    } else {
                        class93.method739(3, 0, var106, class73.method530((byte) -83, new class117[] { var107, class116.method900(var91, 92).method945(-90) }));
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 94) {
                if (class64.field1281 == 12) {
                    class139.field3310 = true;
                }
                class22.field420 = class96.field2338.method570((byte) 123);
                class95.field2294 = class43.field856;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 32) {
                int var108 = class96.field2338.method596(110);
                int var109 = class96.field2338.method596(96);
                int var110 = class96.field2338.method559((byte) -73);
                class140.field3344 = var108 >> 1;
                class141.field3395.method685((byte) 18, (var108 & 0x1) == 1, var109, var110);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 60) {
                class132.field3119 = class96.field2338.method570((byte) 123);
                if (class132.field3119 == 1) {
                    class120.field2875 = class96.field2338.method597(127);
                }
                if (class132.field3119 >= 2 && class132.field3119 <= 6) {
                    if (class132.field3119 == 2) {
                        class20.field332 = 64;
                        class5.field81 = 64;
                    }
                    if (class132.field3119 == 3) {
                        class20.field332 = 64;
                        class5.field81 = 0;
                    }
                    if (class132.field3119 == 4) {
                        class5.field81 = 128;
                        class20.field332 = 64;
                    }
                    if (class132.field3119 == 5) {
                        class5.field81 = 64;
                        class20.field332 = 0;
                    }
                    if (class132.field3119 == 6) {
                        class5.field81 = 64;
                        class20.field332 = 128;
                    }
                    class132.field3119 = 2;
                    class130.field3109 = class96.field2338.method597(105);
                    class141.field3405 = class96.field2338.method597(40);
                    class8.field127 = class96.field2338.method570((byte) 123);
                }
                if (class132.field3119 == 10) {
                    class146.field3574 = class96.field2338.method597(120);
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 252) {
                int var111 = class96.field2338.method603(70);
                int var112 = class96.field2338.method598((byte) 77);
                int var113 = class96.field2338.method584(255);
                class89 var114 = class104.method801(var113, -78);
                var114.field2133 = var114.field2035 + var111;
                class26.field518 = -1;
                var114.field2046 = var114.field2119 + var112;
                return true;
            }
            if (class26.field518 == 244) {
                byte var115 = class96.field2338.method588(0);
                int var116 = class96.field2338.method574((byte) -98);
                class85.field1937[var116] = var115;
                if (class23.field461[var116] != var115) {
                    class23.field461[var116] = var115;
                    class78.method608(var116, true);
                    class139.field3310 = true;
                    if (class152.field3738 != -1) {
                        class87.field1993 = true;
                    }
                }
                class40.field797[class16.method135(31, class97.field2362++)] = var116;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 148) {
                boolean var117 = class96.field2338.method596(83) == 1;
                int var118 = class96.field2338.method572(125);
                class89 var119 = class104.method801(var118, -49);
                class26.field518 = -1;
                var119.field2120 = var117;
                return true;
            }
            if (class26.field518 == 141) {
                class122.field2901 = class96.field2338.method570((byte) 123);
                class20.field318 = class96.field2338.method559((byte) -73);
                while (class71.field1502 > class96.field2338.field1691) {
                    class26.field518 = class96.field2338.method570((byte) 123);
                    class27.method209(114);
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 2) {
                int var120 = class96.field2338.method589((byte) -128);
                class130.method1012(var120, -58);
                if (class95.field2288 != -1) {
                    class140.method1087(-67, class95.field2288);
                    class95.field2288 = -1;
                    class87.field1993 = true;
                }
                if (class135.field3227 != -1) {
                    class140.method1087(-120, class135.field3227);
                    class135.field3227 = -1;
                    class62.method430(30, (byte) -47);
                }
                if (class70.field1482 != -1) {
                    class140.method1087(-69, class70.field1482);
                    class70.field1482 = -1;
                }
                if (class96.field2316 != -1) {
                    class140.method1087(-128, class96.field2316);
                    class96.field2316 = -1;
                }
                if (class140.field3343 == var120) {
                    class35.method274((byte) -119, class140.field3343);
                } else {
                    class140.method1087(-102, class140.field3343);
                    class140.field3343 = var120;
                }
                class55.field1144 = true;
                class139.field3310 = true;
                if (class124.field2924 != 0) {
                    class124.field2924 = 0;
                    class87.field1993 = true;
                }
                class115.field2719 = -1;
                method297(class140.field3343, 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 224) {
                long var121 = class96.field2338.method586(-13628);
                int var123 = class96.field2338.method597(41);
                int var124 = class96.field2338.method570((byte) 123);
                class117 var125 = class116.method900(var121, 123).method945(-122);
                for (int var126 = 0; var126 < class75.field1651; var126++) {
                    if (class101.field2439[var126] == var121) {
                        if (class50.field1063[var126] != var123) {
                            class50.field1063[var126] = var123;
                            class139.field3310 = true;
                            if (var123 > 0) {
                                class93.method739(5, 0, class73.method530((byte) -83, new class117[] { var125, class93.field2261 }), class141.field3351);
                            }
                            if (var123 == 0) {
                                class93.method739(5, 0, class73.method530((byte) -83, new class117[] { var125, class89.field2067 }), class141.field3351);
                            }
                        }
                        var125 = null;
                        class31.field660[var126] = var124;
                        break;
                    }
                }
                boolean var127 = false;
                if (var125 != null && class75.field1651 < 200) {
                    class101.field2439[class75.field1651] = var121;
                    class67.field1401[class75.field1651] = var125;
                    class50.field1063[class75.field1651] = var123;
                    class31.field660[class75.field1651] = var124;
                    class75.field1651++;
                    class139.field3310 = true;
                    class97.field2362 += 32;
                }
                int var128 = class75.field1651;
                while (var128 > 0) {
                    boolean var129 = true;
                    var128--;
                    for (int var130 = 0; var130 < var128; var130++) {
                        if (class50.field1063[var130] != class56.field1152 && class50.field1063[var130 + 1] == class56.field1152 || class50.field1063[var130] == 0 && class50.field1063[var130 + 1] != 0) {
                            var129 = false;
                            int var131 = class50.field1063[var130];
                            class50.field1063[var130] = class50.field1063[var130 + 1];
                            class50.field1063[var130 + 1] = var131;
                            class117 var132 = class67.field1401[var130];
                            class67.field1401[var130] = class67.field1401[var130 + 1];
                            class67.field1401[var130 + 1] = var132;
                            long var133 = class101.field2439[var130];
                            class101.field2439[var130] = class101.field2439[var130 + 1];
                            class101.field2439[var130 + 1] = var133;
                            int var135 = class31.field660[var130];
                            class31.field660[var130] = class31.field660[var130 + 1];
                            class31.field660[var130 + 1] = var135;
                            class139.field3310 = true;
                        }
                    }
                    if (var129) {
                        break;
                    }
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 125) {
                int var136 = class96.field2338.method574((byte) -114);
                int var137 = class96.field2338.method567(false);
                int var138 = class96.field2338.method597(79);
                class89 var139 = class104.method801(var137, -83);
                var139.field2162 = (var138 << 16) + var136;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 151) {
                class117 var140 = class96.field2338.method577(-113);
                int var141 = class96.field2338.method559((byte) -73);
                int var142 = class96.field2338.method570((byte) 123);
                if (var142 >= 1 && var142 <= 5) {
                    if (var140.method939(-1, class114.field2708)) {
                        var140 = null;
                    }
                    class18.field265[var142 - 1] = var140;
                    class153.field3794[var142 - 1] = var141 == 0;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 230) {
                int var143 = class96.field2338.method597(35);
                int var144 = class96.field2338.method570((byte) 123);
                int var145 = class96.field2338.method597(96);
                class103.method795((byte) -98, var143, var144, var145);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 131) {
                class96.field2338.method554((byte) -119);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 69) {
                int var146 = class96.field2338.method572(123);
                class89 var147 = class104.method801(var146, -49);
                for (int var148 = 0; var148 < var147.field2161.length; var148++) {
                    var147.field2161[var148] = -1;
                    var147.field2161[var148] = 0;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 159) {
                int var149 = class96.field2338.method574((byte) -124);
                int var150 = class96.field2338.method567(false);
                int var151 = var149 >> 10 & 0x1F;
                int var152 = var149 >> 5 & 0x1F;
                int var153 = var149 & 0x1F;
                class89 var154 = class104.method801(var150, -96);
                var154.field2100 = (var153 << 3) + (var151 << 19) + (var152 << 11);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 87 || class26.field518 == 241 || class26.field518 == 227 || class26.field518 == 111 || class26.field518 == 119 || class26.field518 == 39 || class26.field518 == 48 || class26.field518 == 33 || class26.field518 == 209 || class26.field518 == 64 || class26.field518 == 236) {
                class27.method209(119);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 19) {
                class96.field2338.method574((byte) -123);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 80) {
                class41.field821 = class96.field2338.method559((byte) -73);
                class26.field518 = -1;
                if (class64.field1281 == class41.field821) {
                    if (class41.field821 == 3) {
                        class64.field1281 = 1;
                    } else {
                        class64.field1281 = 3;
                    }
                    class139.field3310 = true;
                }
                return true;
            }
            if (class26.field518 == 97) {
                class122.field2901 = class96.field2338.method596(36);
                class20.field318 = class96.field2338.method551(119);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 76) {
                int var155 = class96.field2338.method570((byte) 123);
                int var156 = class96.field2338.method570((byte) 123);
                int var157 = class96.field2338.method570((byte) 123);
                int var158 = class96.field2338.method570((byte) 123);
                class70.field1493[var155] = true;
                class67.field1402[var155] = var156;
                class146.field3567[var155] = var157;
                class72.field1553[var155] = var158;
                class68.field1424[var155] = 0;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 158) {
                class117 var159 = class96.field2338.method577(-124);
                if (var159.method927(class124.field2932, (byte) -8)) {
                    boolean var171 = false;
                    class117 var172 = var159.method943(0, (byte) 119, var159.method926((byte) -101, class35.field737));
                    long var173 = var172.method942((byte) 11);
                    for (int var175 = 0; var175 < class128.field3029; var175++) {
                        if (class134.field3195[var175] == var173) {
                            var171 = true;
                            break;
                        }
                    }
                    if (!var171 && class149.field3708 == 0) {
                        class93.method739(4, 0, class35.field735, var172);
                    }
                } else if (var159.method927(class138.field3282, (byte) -8)) {
                    class117 var166 = var159.method943(0, (byte) 123, var159.method926((byte) -71, class35.field737));
                    long var167 = var166.method942((byte) 11);
                    boolean var169 = false;
                    for (int var170 = 0; var170 < class128.field3029; var170++) {
                        if (class134.field3195[var170] == var167) {
                            var169 = true;
                            break;
                        }
                    }
                    if (!var169 && class149.field3708 == 0) {
                        class93.method739(8, 0, class103.field2493, var166);
                    }
                } else if (var159.method927(class92.field2243, (byte) -8)) {
                    class117 var160 = var159.method943(0, (byte) 122, var159.method926((byte) -120, class35.field737));
                    boolean var161 = false;
                    long var162 = var160.method942((byte) 11);
                    for (int var164 = 0; var164 < class128.field3029; var164++) {
                        if (class134.field3195[var164] == var162) {
                            var161 = true;
                            break;
                        }
                    }
                    if (!var161 && class149.field3708 == 0) {
                        class117 var165 = var159.method943(var159.method926((byte) -67, class35.field737) + 1, (byte) 122, var159.method915(27) - 9);
                        class93.method739(8, 0, var165, var160);
                    }
                } else {
                    class93.method739(0, 0, var159, class141.field3351);
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 250) {
                int var176 = class96.field2338.method584(255);
                int var177 = class96.field2338.method589((byte) -128);
                int var178 = class96.field2338.method587(false);
                int var179 = class96.field2338.method587(false);
                class89 var180 = class104.method801(var176, -93);
                var180.field2078 = var179;
                var180.field2150 = var177;
                class26.field518 = -1;
                var180.field2147 = var178;
                return true;
            }
            if (class26.field518 == 79) {
                int var181 = class96.field2338.method589((byte) -128);
                class130.method1012(var181, -88);
                if (class140.field3343 != -1) {
                    class140.method1087(-75, class140.field3343);
                    class55.field1144 = true;
                    class140.field3343 = -1;
                    class139.field3310 = true;
                }
                if (class135.field3227 != -1) {
                    class140.method1087(-109, class135.field3227);
                    class135.field3227 = -1;
                    class62.method430(30, (byte) -47);
                }
                if (class70.field1482 != -1) {
                    class140.method1087(-95, class70.field1482);
                    class70.field1482 = -1;
                }
                if (class96.field2316 != -1) {
                    class140.method1087(-115, class96.field2316);
                    class96.field2316 = -1;
                }
                if (class95.field2288 == var181) {
                    class35.method274((byte) -122, class95.field2288);
                } else {
                    class140.method1087(-86, class95.field2288);
                    class95.field2288 = var181;
                }
                class115.field2719 = -1;
                method297(class95.field2288, 23228);
                class87.field1993 = true;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 42) {
                class112.method831(-62);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 62) {
                int var182 = class96.field2338.method572(-109);
                int var183 = class96.field2338.method597(89);
                class89 var184 = class104.method801(var182, -102);
                var184.field2113 = var183;
                class26.field518 = -1;
                var184.field2091 = 1;
                return true;
            }
            if (class26.field518 == 129) {
                int var185 = class96.field2338.method597(127);
                int var186 = class96.field2338.method589((byte) -128);
                class130.method1012(var186, 104);
                if (var185 != -1) {
                    class130.method1012(var185, 79);
                }
                if (class96.field2316 != -1) {
                    class140.method1087(-118, class96.field2316);
                    class96.field2316 = -1;
                }
                if (class140.field3343 != -1) {
                    class140.method1087(-71, class140.field3343);
                    class140.field3343 = -1;
                }
                if (class95.field2288 != -1) {
                    class140.method1087(-120, class95.field2288);
                    class95.field2288 = -1;
                }
                if (class135.field3227 == var186) {
                    class35.method274((byte) -88, class135.field3227);
                } else {
                    class140.method1087(-90, class135.field3227);
                    class135.field3227 = var186;
                    class62.method430(35, (byte) -47);
                }
                if (class70.field1482 == var186) {
                    class35.method274((byte) -128, class70.field1482);
                } else {
                    class140.method1087(-124, class70.field1482);
                    class70.field1482 = var185;
                }
                class115.field2719 = -1;
                class124.field2924 = 0;
                method297(class135.field3227, 23228);
                method297(class70.field1482, 23228);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 38) {
                class139.field3310 = true;
                int var187 = class96.field2338.method554((byte) -114);
                int var188 = class96.field2338.method597(126);
                class89 var189;
                if (var187 >= 0) {
                    var189 = class104.method801(var187, -51);
                } else {
                    var189 = null;
                }
                if (var187 < -70000) {
                    var188 += 32768;
                }
                while (class71.field1502 > class96.field2338.field1691) {
                    int var190 = class96.field2338.method582(-116);
                    int var191 = 0;
                    int var192 = class96.field2338.method597(58);
                    if (var192 != 0) {
                        var191 = class96.field2338.method570((byte) 123);
                        if (var191 == 255) {
                            var191 = class96.field2338.method554((byte) -101);
                        }
                    }
                    if (var189 != null && var190 >= 0 && var189.field2161.length > var190) {
                        var189.field2161[var190] = var192;
                        var189.field2088[var190] = var191;
                    }
                    class15.method129(0, var190, var188, var192 - 1, var191);
                }
                class15.field217[class16.method135(31, class92.field2241++)] = class16.method135(var188, 32767);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 202) {
                class76.field1676 = false;
                for (int var193 = 0; var193 < 5; var193++) {
                    class70.field1493[var193] = false;
                }
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 93) {
                if (class140.field3343 != -1) {
                    class140.method1087(-102, class140.field3343);
                    class139.field3310 = true;
                    class140.field3343 = -1;
                    class55.field1144 = true;
                }
                if (class95.field2288 != -1) {
                    class140.method1087(-99, class95.field2288);
                    class95.field2288 = -1;
                    class87.field1993 = true;
                }
                if (class135.field3227 != -1) {
                    class140.method1087(-118, class135.field3227);
                    class135.field3227 = -1;
                    class62.method430(30, (byte) -47);
                }
                if (class70.field1482 != -1) {
                    class140.method1087(-114, class70.field1482);
                    class70.field1482 = -1;
                }
                if (class96.field2316 != -1) {
                    class140.method1087(-65, class96.field2316);
                    class96.field2316 = -1;
                }
                if (class124.field2924 != 0) {
                    class87.field1993 = true;
                    class124.field2924 = 0;
                }
                class115.field2719 = -1;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 163) {
                long var194 = class96.field2338.method586(-13628);
                boolean var196 = false;
                if ((var194 & Long.MIN_VALUE) != 0L) {
                    var196 = true;
                }
                int var197 = class96.field2338.method597(94);
                class96.field2338.method592((byte) -106);
                if (var196) {
                    if (class62.field1244 == 0) {
                        class26.field518 = -1;
                        return true;
                    }
                    long var201 = var194 & Long.MAX_VALUE;
                    boolean var203 = false;
                    int var204;
                    for (var204 = 0; var204 < class62.field1244 && (class95.field2292[var204].field1495 != var201 || class95.field2292[var204].field892 != var197); var204++) {
                    }
                    if (var204 < class62.field1244) {
                        while (class62.field1244 - 1 > var204) {
                            class95.field2292[var204] = class95.field2292[var204 + 1];
                            var204++;
                        }
                        class95.field2292[class62.field1244] = null;
                        class62.field1244--;
                    }
                } else if (class62.field1244 < 100) {
                    class45 var198 = new class45();
                    var198.field1495 = var194;
                    var198.field893 = class116.method900(var198.field1495, 116);
                    var198.field892 = var197;
                    int var199;
                    for (var199 = class62.field1244 - 1; var199 >= 0; var199--) {
                        int var200 = class95.field2292[var199].field893.method923(var198.field893, false);
                        System.out.println("co=" + var200);
                        if (var200 == 0) {
                            class26.field518 = -1;
                            return true;
                        }
                        if (var200 < 0) {
                            break;
                        }
                        class95.field2292[var199 + 1] = class95.field2292[var199];
                    }
                    class95.field2292[var199 + 1] = var198;
                    class62.field1244++;
                } else {
                    class26.field518 = -1;
                    return true;
                }
                class97.field2362 += 32;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 180) {
                if (class64.field1281 == 12) {
                    class139.field3310 = true;
                }
                class153.field3768 = class96.field2338.method603(104);
                class95.field2294 = class43.field856;
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 58) {
                class93.method733(false);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 3) {
                class139.field3310 = true;
                int var205 = class96.field2338.method554((byte) 103);
                int var206 = class96.field2338.method597(59);
                if (var205 < -70000) {
                    var206 += 32768;
                }
                class89 var207;
                if (var205 < 0) {
                    var207 = null;
                } else {
                    var207 = class104.method801(var205, -76);
                }
                if (var207 != null) {
                    for (int var208 = 0; var208 < var207.field2161.length; var208++) {
                        var207.field2161[var208] = 0;
                        var207.field2088[var208] = 0;
                    }
                }
                class73.method529(var206, 0);
                int var209 = class96.field2338.method597(88);
                for (int var210 = 0; var210 < var209; var210++) {
                    int var211 = class96.field2338.method587(false);
                    int var212 = class96.field2338.method559((byte) -73);
                    if (var212 == 255) {
                        var212 = class96.field2338.method554((byte) -126);
                    }
                    if (var207 != null && var207.field2161.length > var210) {
                        var207.field2161[var210] = var211;
                        var207.field2088[var210] = var212;
                    }
                    class15.method129(0, var210, var206, var211 - 1, var212);
                }
                class15.field217[class16.method135(31, class92.field2241++)] = class16.method135(32767, var206);
                class26.field518 = -1;
                return true;
            }
            if (class26.field518 == 171) {
                int var213 = class96.field2338.method589((byte) -128);
                int var214 = class96.field2338.method589((byte) -128);
                if (class95.field2288 != -1) {
                    class140.method1087(-98, class95.field2288);
                    class95.field2288 = -1;
                    class87.field1993 = true;
                }
                if (class135.field3227 != -1) {
                    class140.method1087(-128, class135.field3227);
                    class135.field3227 = -1;
                    class62.method430(30, (byte) -47);
                }
                if (class70.field1482 != -1) {
                    class140.method1087(-75, class70.field1482);
                    class70.field1482 = -1;
                }
                if (class96.field2316 == var213) {
                    class35.method274((byte) -110, class96.field2316);
                } else {
                    class140.method1087(-65, class96.field2316);
                    class96.field2316 = var213;
                }
                if (class140.field3343 == var214) {
                    class35.method274((byte) -117, class140.field3343);
                } else {
                    class140.method1087(-112, class140.field3343);
                    class140.field3343 = var214;
                }
                class55.field1144 = true;
                class139.field3310 = true;
                if (class124.field2924 != 0) {
                    class87.field1993 = true;
                    class124.field2924 = 0;
                }
                class115.field2719 = -1;
                method297(class96.field2316, 23228);
                method297(class140.field3343, 23228);
                class26.field518 = -1;
                return true;
            }
            class105.method803((byte) -56, null, "T1 - " + class26.field518 + "," + class19.field300 + "," + class136.field3256 + " - " + class71.field1502);
            class15.method133(124);
        } catch (IOException var218) {
            class64.method448(97);
        } catch (Exception var219) {
            String var216 = "T2 - " + class26.field518 + "," + class19.field300 + "," + class136.field3256 + " - " + class71.field1502 + "," + (class133.field3153 + class141.field3395.field2004[0]) + "," + (class19.field312 + class141.field3395.field1970[0]) + " - ";
            for (int var217 = 0; var217 < class71.field1502 && var217 < 50; var217++) {
                var216 = var216 + class96.field2338.field1748[var217] + ",";
            }
            class105.method803((byte) -49, var219, var216);
            class15.method133(124);
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BJ)V")
    public static final void method295(byte arg0, long arg1) {
        if (arg0 > -69) {
            field825 = null;
        }
        field833++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
    public static final boolean method296(int arg0, int arg1) {
        field824++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 != -10320) {
            method296(123, -42);
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
    private static final void method297(int arg0, int arg1) {
        field847++;
        if (arg0 == -1 || !class26.method201(arg0, 314356016)) {
            return;
        }
        if (arg1 != 23228) {
            field842 = null;
        }
        class89[] var2 = class141.field3426[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class89 var4 = var2[var3];
            if (var4.field2130 != null) {
                class18.method145(var4.field2130, var4, 0, 0, null, arg1 ^ 0x1317, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLla;I)V")
    private final void method298(byte arg0, class77 arg1, int arg2) {
        if (arg2 == 1) {
            this.field827 = arg1.method597(40);
            this.field846 = arg1.method570((byte) 123);
            this.field822 = arg1.method570((byte) 123);
        }
        if (arg0 == -86) {
            field835++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)I")
    public static final int method299(byte arg0, int arg1, int arg2) {
        field836++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg0 > -94) {
            field842 = null;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}

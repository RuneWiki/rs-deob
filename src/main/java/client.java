import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class107 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lic;")
    public static class59 field481 = class59.method433(0, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lic;")
    public static class59 field479 = class59.method433(0, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lic;")
    public static class59 field478 = class59.method433(0, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lic;")
    public static class59 field486 = class59.method433(0, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lic;")
    public static class59 field485 = class59.method433(0, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lic;")
    private static class59 field498 = class59.method433(0, "Loaded textures");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lic;")
    public static class59 field490 = class59.method433(0, "blinken3:");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lic;")
    private static class59 field499 = class59.method433(0, "Examine");

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lic;")
    public static class59 field491 = field498;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lic;")
    public static class59 field500 = field499;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    public static int[] field488;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (class59.field1415 == 1) {
            class86.field2169 = class137.field3070;
            class49.field1231 = class155.field3363;
            class49.field1244 = class62.field1574;
            class29.field764 = class102.field2493;
        } else {
            class29.field764 = class68.field1747;
            class49.field1244 = class82.field2049;
            class49.field1231 = class98.field2442;
            class86.field2169 = class91.field2322;
        }
        class68.field1723 = class96.field2432 == 0 ? 43594 : class9.field179 + 40000;
        field492++;
        class73.field1817 = class68.field1723;
        class57.field1397 = class96.field2432 == 0 ? 443 : class9.field179 + 50000;
        class22.method137(191);
        class47.method366(1, class142.field3115);
        class91.method753((byte) -16, class142.field3115);
        class1.field22 = class46.method357((byte) 109);
        if (class1.field22 != null) {
            class1.field22.method68(126, class142.field3115);
        }
        class18.field346 = class67.field1673;
        try {
            if (class102.field2497.field1665 != null) {
                class7.field133 = new class61(class102.field2497.field1665, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class143.field3129[var2] = new class61(class102.field2497.field1676[var2], 6000, 0);
                }
                class126.field2870 = new class61(class102.field2497.field1670, 6000, 0);
                class46.field1185 = new class108(255, class7.field133, class126.field2870, 500000);
                class157.field3446 = new class61(class102.field2497.field1674, 24, 0);
                class102.field2497.field1676 = null;
                class102.field2497.field1670 = null;
                class102.field2497.field1665 = null;
                class102.field2497.field1674 = null;
            }
        } catch (IOException var3) {
            class7.field133 = null;
            class46.field1185 = null;
            class157.field3446 = null;
            class126.field2870 = null;
        }
        if (class96.field2432 != arg0) {
            class1.field11 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                method124(true);
            }
            class9.field179 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class96.field2432 = 0;
            } else if (arg0[1].equals("office")) {
                class96.field2432 = 1;
            } else if (arg0[1].equals("local")) {
                class96.field2432 = 2;
            } else {
                method124(true);
            }
            if (arg0[2].equals("live")) {
                class19.field428 = 0;
            } else if (arg0[2].equals("rc")) {
                class19.field428 = 1;
            } else if (arg0[2].equals("wip")) {
                class19.field428 = 2;
            } else {
                method124(true);
            }
            if (arg0[3].equals("lowmem")) {
                class15.method82((byte) -87);
            } else if (arg0[3].equals("highmem")) {
                class64.method527(-7178);
            } else {
                method124(true);
            }
            if (arg0[4].equals("free")) {
                class18.field367 = false;
            } else if (arg0[4].equals("members")) {
                class18.field367 = true;
            } else {
                method124(true);
            }
            if (arg0[5].equals("english")) {
                class136.field3013 = 0;
            } else if (arg0[5].equals("german")) {
                class17.method91(32);
                class38.field996 = class24.field570;
                class136.field3013 = 1;
            } else {
                method124(true);
            }
            if (arg0[6].equals("game0")) {
                class59.field1415 = 0;
            } else if (arg0[6].equals("game1")) {
                class59.field1415 = 1;
            } else {
                method124(true);
            }
            class89.field2263 = "127.0.0.1";
            client var1 = new client();
            var1.method836("runescape", class19.field428 + 32, 472, 503, 115, 16, 765);
        } catch (Exception var3) {
            class86.method704(var3, null, 4436);
        }
        field494++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private static final void method124(boolean arg0) {
        if (!arg0) {
            method125(null, (byte) -7);
        }
        field487++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwf;B)Lwf;")
    public static final class159 method125(class159 arg0, byte arg1) {
        field497++;
        class159 var2 = class46.method363(arg0, (byte) -74);
        if (arg1 > -1) {
            method124(true);
        }
        if (var2 == null) {
            var2 = arg0.field3630;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method126(int arg0) {
        field483++;
        if (class91.field2324 >= 4) {
            this.method835((byte) -93, "js5crc");
            class64.field1635 = 1000;
            return;
        }
        if (class73.field1833 >= 4) {
            if (class64.field1635 <= 5) {
                this.method835((byte) -106, "js5io");
                class64.field1635 = 1000;
                return;
            }
            class73.field1833 = 3;
            class40.field1042 = 3000;
        }
        if (class40.field1042-- > 0) {
            return;
        }
        try {
            if (class36.field950 == 0) {
                class60.field1495 = class102.field2497.method540(class89.field2263, (byte) -65, class73.field1817);
                class36.field950++;
            }
            if (class36.field950 == 1) {
                if (class60.field1495.field252 == 2) {
                    this.method129(-13611, -1);
                    return;
                }
                if (class60.field1495.field252 == 1) {
                    class36.field950++;
                }
            }
            int var2 = 32 / ((arg0 + 58) / 59);
            if (class36.field950 == 2) {
                class153.field3308 = new class40((Socket) class60.field1495.field254, class102.field2497);
                class157 var3 = new class157(5);
                var3.method1205(15, 8584);
                var3.method1195(472, 852);
                class153.field3308.method306(5, 0, 15731, var3.field3473);
                class36.field950++;
                class44.field1122 = class29.method235(-329);
            }
            if (class36.field950 == 3) {
                if (class64.field1635 <= 5 || class153.field3308.method305((byte) 107) > 0) {
                    int var4 = class153.field3308.method302(-109);
                    if (var4 != 0) {
                        this.method129(-13611, var4);
                        return;
                    }
                    class36.field950++;
                } else if (class29.method235(-329) - class44.field1122 > 30000L) {
                    this.method129(-13611, -2);
                    return;
                }
            }
            if (class36.field950 == 4) {
                class73.method619(class153.field3308, 4, class64.field1635 > 20);
                class60.field1495 = null;
                class153.field3308 = null;
                class103.field2507 = 0;
                class36.field950 = 0;
            }
        } catch (IOException var5) {
            this.method129(-13611, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Lve;")
    public static final class151 method127(byte arg0) {
        field493++;
        if (arg0 < 3) {
            field505 = 6;
        }
        try {
            return (class151) Class.forName("re").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class3();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method128(byte arg0) {
        if (class159.field3668 != null) {
            class159.field3668.field1384 = false;
        }
        field506++;
        class159.field3668 = null;
        if (class102.field2491 != null) {
            class102.field2491.method308(19401);
            class102.field2491 = null;
        }
        class87.method717(true);
        class147.method1090((byte) 98);
        class1.field22 = null;
        if (class107.field2582 != null) {
            class107.field2582.method151(false);
        }
        if (class131.field2938 != null) {
            class131.field2938.method151(false);
        }
        class59.method438((byte) -103);
        class127.method969(arg0);
        try {
            if (class7.field133 != null) {
                class7.field133.method507(arg0 - 60);
            }
            if (class143.field3129 != null) {
                for (int var2 = 0; var2 < class143.field3129.length; var2++) {
                    if (class143.field3129[var2] != null) {
                        class143.field3129[var2].method507(-89);
                    }
                }
            }
            if (class126.field2870 != null) {
                class126.field2870.method507(arg0 - 24);
            }
            if (class157.field3446 != null) {
                class157.field3446.method507(-85);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method129(int arg0, int arg1) {
        class103.field2507++;
        field504++;
        if (arg0 != -13611) {
            field490 = null;
        }
        if (class73.field1817 == class68.field1723) {
            class73.field1817 = class57.field1397;
        } else {
            class73.field1817 = class68.field1723;
        }
        class60.field1495 = null;
        class36.field950 = 0;
        class153.field3308 = null;
        if (class103.field2507 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class64.field1635 <= 5) {
                this.method835((byte) 51, "js5connect_full");
                class64.field1635 = 1000;
            } else {
                class40.field1042 = 3000;
            }
        } else if (class103.field2507 >= 2 && arg1 == 6) {
            this.method835((byte) -102, "js5connect_outofdate");
            class64.field1635 = 1000;
        } else if (class103.field2507 >= 4) {
            if (class64.field1635 <= 5) {
                this.method835((byte) -122, "js5connect");
                class64.field1635 = 1000;
            } else {
                class40.field1042 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static final void method130(boolean arg0) {
        if (arg0) {
            field505 = 102;
        }
        field501++;
        if (class127.field2882 && class96.field2437 != class44.field1127) {
            class64.method529((byte) 24, class159.field3650.field1704[0], class159.field3650.field1719[0], class157.field3436, class44.field1127, class106.field2544);
        } else if (class94.field2406 != class44.field1127) {
            class94.field2406 = class44.field1127;
            class147.method1092(class44.field1127, -114);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method131(byte arg0) {
        field496++;
        method132(-107);
        class59.method454(63);
        if (arg0 <= 33) {
            return;
        }
        class107.method834((byte) -89);
        class151.method1113((byte) 111);
        class130.method998((byte) -32);
        class57.method417(true);
        class157.method1212(-1);
        class40.method301(100);
        class87.method722(-29);
        class61.method506(1);
        class108.method854(255);
        class90.method743((byte) 44);
        class143.method1073(113);
        class111.method874();
        class73.method616(64);
        class159.method1225(114);
        class49.method377(true);
        class83.method686(false);
        class7.method34(-25462);
        class98.method803(14282);
        class103.method815(true);
        class24.method153(2000);
        class85.method703((byte) -125);
        class89.method736((byte) -115);
        class25.method167(10368);
        class68.method548((byte) -125);
        class118.method937((byte) 94);
        class125.method952(2);
        class41.method313(14854);
        class116.method928((byte) 47);
        class81.method665((byte) 114);
        class48.method373(98);
        class82.method670(1341);
        class92.method763();
        class28.method231();
        class56.method411(-127);
        class100.method807(-75);
        class47.method370(false);
        class9.method44(-8);
        class21.method117(-13);
        class1.method6(74);
        class70.method553((byte) 2);
        class137.method1049(-1);
        class120.method940((byte) -25);
        class32.method257(-1339);
        class17.method90(0);
        class135.method1039();
        class34.method267(-1);
        class121.method943((byte) 96);
        class38.method293((byte) 99);
        class63.method525(-12979);
        class29.method236(0);
        class5.method26(-50);
        class126.method965(-123);
        class26.method192(4);
        class60.method496(16670);
        class33.method260(false);
        class114.method921((byte) -62);
        class55.method409((byte) 113);
        class2.method8((byte) -86);
        class95.method787(0);
        class4.method19((byte) 127);
        class53.method398(134);
        class106.method822(2047);
        class35.method271(-1412584499);
        class134.method1033(false);
        class145.method1083(0);
        class115.method925(85);
        class129.method985();
        class51.method385(30);
        class11.method60();
        class158.method1221((byte) -110);
        class45.method343();
        class136.method1042(-103);
        class42.method322((byte) -117);
        class155.method1129((byte) 78);
        class46.method359(true);
        class62.method515(-118);
        class31.method250((byte) -119);
        class19.method106(-27483);
        class79.method642((byte) -59);
        class54.method399(16);
        class23.method146(-51);
        class127.method970(true);
        class88.method727((byte) 100);
        class112.method917((byte) 106);
        class44.method337((byte) 17);
        class156.method1153();
        class43.method326(false);
        class146.method1089();
        class36.method274(true);
        class76.method630(false);
        class102.method813((byte) -91);
        class65.method532(false);
        class149.method1107(4);
        class86.method710((byte) 82);
        class10.method46(false);
        class30.method241(-124);
        class64.method528((byte) -107);
        class139.method1054(1);
        class128.method977(109);
        class142.method1060(true);
        class78.method640();
        class148.method1097((byte) 121);
        class91.method751(true);
        class18.method93((byte) -119);
        class15.method84((byte) 123);
        class8.method41((byte) 56);
        class94.method782(-22464);
        class27.method206(-53);
        class80.method659(96);
        class153.method1121(-85);
        class3.method14((byte) -123);
        class154.method1127(-84);
        class96.method788(-7142);
        class147.method1094((byte) 36);
        class152.method1119(0);
        class75.method627(-96);
        class99.method806(true);
        class58.method419();
        class39.method295();
        class131.method1001((byte) -124);
        class69.method551();
        class22.method138((byte) -118);
        class52.method391((byte) 62);
        class97.method801();
        class84.method694(-101);
        class77.method633(0);
        class138.method1051((byte) 125);
        class14.method73();
        class37.method285();
        class6.method29((byte) -115);
        class16.method85((byte) 9);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method132(int arg0) {
        if (arg0 >= -77) {
            main(null);
        }
        field499 = null;
        field478 = null;
        field500 = null;
        field498 = null;
        field490 = null;
        field481 = null;
        field486 = null;
        field491 = null;
        field488 = null;
        field479 = null;
        field485 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method133(int arg0) {
        boolean var2 = class84.method692(2);
        field480++;
        if (var2 && class63.field1625 && class107.field2582 != null) {
            class107.field2582.method165((byte) -41);
        }
        if (class148.field3234) {
            class40.method307(-19465, class142.field3115);
            class151.method1112(true, class142.field3115);
            if (class1.field22 != null) {
                class1.field22.method69(false, class142.field3115);
            }
            this.method844(arg0 ^ 0x95F57B2);
            class47.method366(1, class142.field3115);
            class91.method753((byte) -16, class142.field3115);
            if (class1.field22 != null) {
                class1.field22.method68(124, class142.field3115);
            }
        }
        if (arg0 != 19349) {
            field500 = null;
        }
        if (class64.field1635 == 0) {
            class81.method664(null, class90.field2288, false, class77.field1890);
        } else if (class64.field1635 == 5) {
            class85.method700(271, class43.field1105, class21.field446);
        } else if (class64.field1635 == 10) {
            class85.method700(271, class43.field1105, class21.field446);
        } else if (class64.field1635 == 20) {
            class85.method700(271, class43.field1105, class21.field446);
        } else if (class64.field1635 == 25) {
            if (class34.field913 == 1) {
                if (class153.field3312 > class17.field331) {
                    class17.field331 = class153.field3312;
                }
                int var4 = (class17.field331 - class153.field3312) * 50 / class17.field331;
                class121.method942(class46.method358(new class59[] { class134.field2982, class63.field1599, class46.method361(var4, 118), class155.field3360 }, (byte) -75), false, (byte) 124);
            } else if (class34.field913 == 2) {
                if (class4.field98 < class38.field989) {
                    class4.field98 = class38.field989;
                }
                int var3 = (class4.field98 - class38.field989) * 50 / class4.field98 + 50;
                class121.method942(class46.method358(new class59[] { class134.field2982, class63.field1599, class46.method361(var3, arg0 - 19427), class155.field3360 }, (byte) -75), false, (byte) 127);
            } else {
                class121.method942(class134.field2982, false, (byte) 64);
            }
        } else if (class64.field1635 == 30) {
            class84.method695(arg0 ^ 0xFFFFB46A);
        } else if (class64.field1635 == 40) {
            class121.method942(class46.method358(new class59[] { class157.field3453, class22.field514, class18.field370 }, (byte) -75), false, (byte) 78);
        }
        if (class64.field1635 == 30 && class89.field2247 == 0 && !class41.field1049) {
            try {
                Graphics var7 = class142.field3115.getGraphics();
                for (int var8 = 0; var8 < class158.field3502; var8++) {
                    if (class26.field697[var8]) {
                        class33.field891.method855(32, var7, class40.field1014[var8], class2.field49[var8], class6.field125[var8], class149.field3254[var8]);
                        class26.field697[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class142.field3115.repaint();
            }
        } else if (class64.field1635 > 0) {
            try {
                Graphics var5 = class142.field3115.getGraphics();
                class33.field891.method857(0, arg0 ^ 0x4B95, var5, 0);
                class41.field1049 = false;
                for (int var6 = 0; var6 < class158.field3502; var6++) {
                    class26.field697[var6] = false;
                }
            } catch (Exception var10) {
                class142.field3115.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method134(byte arg0) {
        field482++;
        if (arg0 < 112) {
            field486 = null;
        }
        if (class64.field1635 != 1000) {
            boolean var2 = class73.method610((byte) -122);
            if (!var2) {
                this.method126(-120);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field484++;
        if (!this.method843(false)) {
            return;
        }
        class9.field179 = Integer.parseInt(this.getParameter("worldid"));
        class19.field428 = Integer.parseInt(this.getParameter("modewhat"));
        class96.field2432 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class15.method82((byte) -71);
        } else {
            class64.method527(-7178);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class18.field367 = true;
        } else {
            class18.field367 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class17.method91(32);
            class136.field3013 = 1;
            class38.field996 = class24.field570;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class59.field1415 = 1;
        } else {
            class59.field1415 = 0;
        }
        try {
            class137.field3055 = Integer.parseInt(this.getParameter("js"));
            class52.field1300 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class89.field2263 = this.getCodeBase().getHost();
        this.method846(765, 503, true, 472, class19.field428 + 32);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method135(byte arg0) {
        field502++;
        class23.field561++;
        if (class23.field561 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class55.field1359 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class153.field3322.setSeed((long) class55.field1359);
        }
        if (arg0 < 6) {
            return;
        }
        this.method134((byte) 120);
        class103.method814((byte) -123);
        class106.method819(true);
        class35.method268((byte) 95);
        class48.method375(-24988);
        class125.method947(-10872);
        if (class1.field22 != null) {
            int var3 = class1.field22.method70((byte) 109);
            class154.field3352 = var3;
        }
        if (class64.field1635 == 0) {
            class157.method1192((byte) 104);
            class86.method712((byte) -82);
        } else if (class64.field1635 == 5) {
            class73.method608(this, (byte) -14);
            class157.method1192((byte) 104);
            class86.method712((byte) -119);
        } else if (class64.field1635 == 10) {
            class73.method608(this, (byte) -14);
        } else if (class64.field1635 == 20) {
            class73.method608(this, (byte) -14);
            class19.method107(127);
        } else if (class64.field1635 == 25) {
            class51.method386(120);
        }
        if (class64.field1635 == 30) {
            class25.method172(1);
        } else if (class64.field1635 == 40) {
            class19.method107(104);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILdd;Ldd;Z)Lub;")
    public static final class141 method136(int arg0, int arg1, class26 arg2, class26 arg3, boolean arg4) {
        field503++;
        if (class159.method1234(arg0, -65536, arg1, arg3)) {
            return arg4 ? null : class1.method2(arg2.method193(arg4, arg0, arg1), false);
        } else {
            return null;
        }
    }
}

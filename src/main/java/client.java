import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class205 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Ldd;")
    public static class35 field617 = class180.method1196((byte) 127, "null");

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Ldd;")
    private static class35 field622 = class180.method1196((byte) 126, "No response from server)3");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Ldd;")
    public static class35 field620 = field622;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field614 = -1;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    public static int[] field627 = new int[100];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lld;")
    public static class111 field626 = new class111(20);

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field633;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[[S")
    public static short[][] field613;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method278(int arg0) {
        field623++;
        class210.field4163 = class25.field508 == 0 ? 43594 : class101.field2230 + 40000;
        class82.field1904 = class210.field4163;
        class100.field2202 = class25.field508 == 0 ? 443 : class101.field2230 + 50000;
        if (class64.field1539 == 1) {
            class70.field1678 = class19.field368;
            class179.field3678 = class36.field803;
            field613 = class7.field112;
            class15.field275 = class147.field3095;
        } else {
            class70.field1678 = class183.field3768;
            field613 = class170.field3396;
            class15.field275 = class101.field2215;
            class179.field3678 = class128.field2769;
        }
        class201.method1334((byte) -102);
        class89.method654(class118.field2618, 32768);
        class121.method861(-1287, class118.field2618);
        class80.field1867 = class128.method891((byte) 95);
        if (class80.field1867 != null) {
            class80.field1867.method468(class118.field2618, -4679);
        }
        if (arg0 != -6) {
            field626 = null;
        }
        class159.field3234 = class41.field896;
        try {
            if (class182.field3734.field906 != null) {
                class17.field344 = new class197(class182.field3734.field906, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class39.field858[var2] = new class197(class182.field3734.field901[var2], 6000, 0);
                }
                class200.field3996 = new class197(class182.field3734.field909, 6000, 0);
                class184.field3776 = new class72(255, class17.field344, class200.field3996, 500000);
                class56.field1409 = new class197(class182.field3734.field898, 24, 0);
                class182.field3734.field906 = null;
                class182.field3734.field901 = null;
                class182.field3734.field898 = null;
                class182.field3734.field909 = null;
            }
        } catch (IOException var3) {
            class200.field3996 = null;
            class56.field1409 = null;
            class17.field344 = null;
            class184.field3776 = null;
        }
        if (class25.field508 != 0) {
            class181.field3692 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method279(int arg0) {
        if (class210.field4160 != null) {
            class210.field4160.field1588 = false;
        }
        class210.field4160 = null;
        field616++;
        if (class108.field2408 != null) {
            class108.field2408.method920((byte) -94);
            class108.field2408 = null;
        }
        class210.method1379(-25217);
        class204.method1348(94);
        class80.field1867 = null;
        if (class24.field493 != null) {
            class24.field493.method1159((byte) 62);
        }
        if (class26.field550 != null) {
            class26.field550.method1159((byte) 64);
        }
        class181.method1202(-20);
        class82.method626(15226);
        try {
            if (class17.field344 != null) {
                class17.field344.method1295(0);
            }
            if (class39.field858 != null) {
                for (int var2 = 0; var2 < class39.field858.length; var2++) {
                    if (class39.field858[var2] != null) {
                        class39.field858[var2].method1295(0);
                    }
                }
            }
            if (class200.field3996 != null) {
                class200.field3996.method1295(0);
            }
            if (class56.field1409 != null) {
                class56.field1409.method1295(0);
            }
        } catch (IOException var3) {
        }
        if (arg0 != 0) {
            field614 = -102;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method280(int arg0) {
        method286(75);
        class35.method338(true);
        field611++;
        class205.method1359((byte) 101);
        class180.method1197((byte) 51);
        class170.method1112(-23835);
        class68.method552(84);
        class89.method657((byte) 124);
        class26.method227(-4667);
        class135.method927(-74);
        class134.method916(0);
        class197.method1289(arg0 - 5);
        class72.method572((byte) -93);
        class19.method167(true);
        class90.method663((byte) 120);
        class31.method290((byte) 96);
        class55.method478(arg0 + 100);
        class102.method759(false);
        class187.method1242(-43);
        class107.method791(arg0 ^ 0x7CEA);
        class53.method469((byte) 107);
        class93.method678(arg0 + 145);
        class130.method902(-118);
        class174.method1154(-1);
        class98.method741((byte) -31);
        class20.method180(false);
        class52.method464(65535);
        class69.method562((byte) 85);
        class21.method194((byte) -97);
        class182.method1216(arg0 - 2779);
        class195.method1282(1792);
        class109.method803(arg0 - 126);
        class160.method1064((byte) 121);
        class136.method931((byte) 100);
        class111.method810(-128);
        class81.method604();
        class143.method981((byte) -125);
        class172.method1118(64);
        class207.method1366((byte) 31);
        class54.method474((byte) -128);
        class131.method906((byte) 12);
        class79.method596(128);
        class110.method807(5666);
        class22.method196(0);
        class150.method1023(true);
        class127.method889(-591);
        class16.method141();
        class56.method497(11709);
        class117.method844();
        class108.method797(-77);
        class75.method590(arg0 - 132);
        class61.method519(-1);
        class95.method727(arg0 - 90);
        class190.method1250((byte) 9);
        class147.method1006(120);
        class116.method843(arg0 - 132);
        class8.method54((byte) -89);
        class173.method1130(125);
        class158.method1058(arg0 ^ 0x4);
        class206.method1365(-25464);
        class4.method24(-967);
        class84.method631(32);
        class9.method66(false);
        class162.method1075((byte) -23);
        class183.method1220((byte) 39);
        class175.method1170((byte) 6);
        class121.method864(-29947);
        class138.method943(-110661439);
        class129.method896(false);
        class78.method593(arg0 ^ 0xFFFF8BE3);
        class140.method967();
        class191.method1255((byte) -99);
        class11.method77();
        class101.method756(-91);
        class194.method1279();
        class155.method1043(10483);
        class166.method1097(73);
        class65.method536((byte) 123);
        class92.method676((byte) -83);
        class168.method1105(true);
        class141.method978((byte) -71);
        class145.method997(-1);
        class148.method1013((byte) -78);
        class46.method425((byte) -112);
        class177.method1177();
        class51.method454((byte) -124);
        class17.method152(0);
        class179.method1192(-67);
        class29.method274(0);
        class154.method1037(-1);
        class114.method828(arg0 ^ 0xC);
        class199.method1305();
        class115.method840(-111);
        class32.method312(arg0 ^ 0xFFFFF705);
        class63.method527((byte) 60);
        class167.method1101((byte) -127);
        class25.method209((byte) 79);
        class132.method907((byte) 89);
        class210.method1381(14118);
        class14.method119(arg0 ^ 0x85);
        class120.method856((byte) 71);
        class59.method510(0);
        class125.method886(arg0 - 20196);
        class200.method1332((byte) 83);
        class23.method201((byte) -54);
        class123.method874(0);
        class171.method1113();
        class24.method202((byte) 85);
        class40.method381(arg0 - 5);
        class15.method123(arg0 - 122);
        class176.method1172(false);
        class97.method735(arg0 - 11);
        class42.method400((byte) 35);
        class126.method887(50);
        class71.method570(2);
        class146.method1005((byte) 115);
        class193.method1263(arg0 ^ 0x4E73);
        class203.method1342(8);
        class36.method365(120);
        class28.method267(false);
        class204.method1353(-49);
        class73.method586((byte) 20);
        class198.method1301((byte) 3);
        class119.method852();
        class164.method1085();
        class3.method18(4096);
        class112.method818();
        class100.method753(arg0 - 5);
        class7.method33((byte) -71);
        class161.method1072((byte) 87);
        class86.method641();
        class74.method588(false);
        class186.method1228((byte) 126);
        class165.method1089((byte) 75);
        class104.method769();
        class139.method948();
        class118.method845(18505);
        class39.method377(0);
        class37.method373(18831);
        class43.method402((byte) 107);
        class208.method1374(-128);
        class38.method375(false);
        class88.method647(arg0 ^ 0xFFFFFF86);
        class178.method1188(18976);
        class196.method1283((byte) 103);
        class82.method625(0);
        class80.method600(0);
        class188.method1245(arg0 + 33);
        class62.method521(false);
        class67.method548(false);
        class13.method118(18);
        class99.method745((byte) 37);
        class34.method316(arg0);
        class57.method498((byte) 28);
        class128.method893((byte) 125);
        class201.method1336((byte) 41);
        class157.method1051((byte) 10);
        class163.method1081(2048);
        class45.method406(true);
        class124.method881(true);
        class113.method820(-4097);
        class1.method3((byte) 80);
        class106.method787(99);
        class48.method432((byte) 126);
        class44.method405((byte) 125);
        class50.method446((byte) -86);
        class83.method627(false);
        class5.method29(arg0 + 107);
        class181.method1200(false);
        class159.method1061((byte) -78);
        class209.method1375(arg0 ^ 0x8CD);
        class105.method780(-1);
        class49.method437((byte) -80);
        class58.method506(0);
        class70.method566(107);
        class2.method10((byte) -93);
        class103.method766(-28802);
        class96.method730((byte) 55);
        class64.method532(arg0 ^ arg0);
        class60.method512(true);
        class184.method1224(arg0 + 92);
        class122.method867(-1841);
        class91.method670(0);
        class30.method277(arg0 ^ 0xFFFFCC27);
        class152.method1026(-79);
        class137.method935(false);
        class133.method909((byte) 113);
        if (class205.field4106) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Lt;")
    public static final class179 method281(byte arg0, int arg1) {
        class179 var2 = (class179) class97.field2147.method817(true, (long) arg1);
        field612++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 67) {
            field613 = null;
        }
        byte[] var3 = class60.field1488.method39(14, -1, arg1);
        class179 var4 = new class179();
        if (var3 != null) {
            var4.method1193(125, new class26(var3));
        }
        class97.field2147.method816(var4, (long) arg1, 16);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method282(boolean arg0) {
        field621++;
        if (!arg0) {
            field617 = null;
        }
        if (class2.field27 != 1000) {
            boolean var2 = class46.method417(false);
            if (!var2) {
                this.method283(-66);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method283(int arg0) {
        field619++;
        if (class54.field1216 >= 4) {
            this.method1356("js5crc", (byte) 84);
            class2.field27 = 1000;
            return;
        }
        if (arg0 >= -39) {
            field614 = 1;
        }
        if (class35.field777 >= 4) {
            if (class2.field27 <= 5) {
                this.method1356("js5io", (byte) -86);
                class2.field27 = 1000;
                return;
            }
            class203.field4041 = 3000;
            class35.field777 = 3;
        }
        if (class203.field4041-- > 0) {
            return;
        }
        try {
            if (class141.field2992 == 0) {
                class99.field2176 = class182.field3734.method393(class152.field3150, (byte) 117, class82.field1904);
                class141.field2992++;
            }
            if (class141.field2992 == 1) {
                if (class99.field2176.field1806 == 2) {
                    this.method288((byte) 92, -1);
                    return;
                }
                if (class99.field2176.field1806 == 1) {
                    class141.field2992++;
                }
            }
            if (class141.field2992 == 2) {
                class14.field264 = new class135((Socket) class99.field2176.field1804, class182.field3734);
                class26 var2 = new class26(5);
                var2.method257((byte) 126, 15);
                var2.method249(487, -103);
                class14.field264.method924(0, 5, var2.field529, true);
                class141.field2992++;
                class4.field74 = class190.method1253((byte) 18);
            }
            if (class141.field2992 == 3) {
                if (class2.field27 <= 5 || class14.field264.method923(false) > 0) {
                    int var3 = class14.field264.method928(true);
                    if (var3 != 0) {
                        this.method288((byte) 81, var3);
                        return;
                    }
                    class141.field2992++;
                } else if (class190.method1253((byte) 18) - class4.field74 > 30000L) {
                    this.method288((byte) 68, -2);
                    return;
                }
            }
            if (class141.field2992 == 4) {
                class103.method767(-4, class14.field264, class2.field27 > 20);
                class141.field2992 = 0;
                class99.field2176 = null;
                class146.field3079 = 0;
                class14.field264 = null;
            }
        } catch (IOException var4) {
            this.method288((byte) 62, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method284(byte arg0) {
        field624++;
        boolean var2 = class138.method940(false);
        if (var2 && class181.field3697 && class24.field493 != null) {
            class24.field493.method1163((byte) 89);
        }
        if (class29.field591) {
            class49.method441(class118.field2618, -62);
            class201.method1338((byte) 125, class118.field2618);
            if (class80.field1867 != null) {
                class80.field1867.method472(class118.field2618, 1);
            }
            this.method1363(-14307);
            class89.method654(class118.field2618, arg0 ^ 0xFFFF7FB2);
            class121.method861(arg0 ^ 0x54B, class118.field2618);
            if (class80.field1867 != null) {
                class80.field1867.method468(class118.field2618, arg0 - 4601);
            }
        }
        if (class2.field27 == 0) {
            class43.method401(class176.field3595, class134.field2852, null, 303);
        } else if (class2.field27 == 5) {
            class166.method1099(class122.field2673, false, class15.field270);
        } else if (class2.field27 == 10) {
            class166.method1099(class122.field2673, false, class15.field270);
        } else if (class2.field27 == 20) {
            class166.method1099(class122.field2673, false, class15.field270);
        } else if (class2.field27 == 25) {
            if (class114.field2556 == 1) {
                if (class21.field433 < class31.field659) {
                    class21.field433 = class31.field659;
                }
                int var3 = (class21.field433 - class31.field659) * 50 / class21.field433;
                class162.method1076(class63.method529(new class35[] { class172.field3442, class180.field3681, class3.method19(var3, -29578), class20.field400 }, (byte) 87), (byte) -118, false);
            } else if (class114.field2556 == 2) {
                if (class26.field576 > class9.field174) {
                    class9.field174 = class26.field576;
                }
                int var4 = (class9.field174 - class26.field576) * 50 / class9.field174 + 50;
                class162.method1076(class63.method529(new class35[] { class172.field3442, class180.field3681, class3.method19(var4, -29578), class20.field400 }, (byte) 56), (byte) -112, false);
            } else {
                class162.method1076(class172.field3442, (byte) -116, false);
            }
        } else if (class2.field27 == 30) {
            class145.method996(0);
        } else if (class2.field27 == 40) {
            class162.method1076(class63.method529(new class35[] { class30.field607, class191.field3850, class209.field4140 }, (byte) 100), (byte) -40, false);
        }
        if (arg0 != -78) {
            return;
        }
        if (class2.field27 == 30 && class157.field3198 == 0 && !class17.field335) {
            try {
                Graphics var7 = class118.field2618.getGraphics();
                for (int var8 = 0; var8 < class137.field2935; var8++) {
                    if (class32.field680[var8]) {
                        class97.field2141.method363(class146.field3083[var8], (byte) -124, field627[var8], class135.field2893[var8], var7, class204.field4057[var8]);
                        class32.field680[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class118.field2618.repaint();
            }
        } else if (class2.field27 > 0) {
            try {
                Graphics var5 = class118.field2618.getGraphics();
                class97.field2141.method359(true, 0, var5, 0);
                class17.field335 = false;
                for (int var6 = 0; var6 < class137.field2935; var6++) {
                    class32.field680[var6] = false;
                }
            } catch (Exception var10) {
                class118.field2618.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method285(int arg0, int arg1) {
        if (arg0 != -2039771728) {
            return;
        }
        for (class15 var2 = (class15) class26.field555.method790(arg0 ^ 0x79947237); var2 != null; var2 = (class15) class26.field555.method794((byte) 90)) {
            if ((long) arg1 == (var2.field2416 >> 48 & 0xFFFFL)) {
                var2.method799(-24265);
            }
        }
        field615++;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method286(int arg0) {
        field622 = null;
        field617 = null;
        field626 = null;
        field627 = null;
        field620 = null;
        field613 = null;
        if (arg0 < 26) {
            field620 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class150.method1021((byte) 116);
            }
            class101.field2230 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class25.field508 = 0;
            } else if (arg0[1].equals("office")) {
                class25.field508 = 1;
            } else if (arg0[1].equals("local")) {
                class25.field508 = 2;
            } else {
                class150.method1021((byte) -33);
            }
            if (arg0[2].equals("live")) {
                class200.field4005 = 0;
            } else if (arg0[2].equals("rc")) {
                class200.field4005 = 1;
            } else if (arg0[2].equals("wip")) {
                class200.field4005 = 2;
            } else {
                class150.method1021((byte) 107);
            }
            if (arg0[3].equals("lowmem")) {
                class105.method781((byte) -124);
            } else if (arg0[3].equals("highmem")) {
                class101.method758((byte) 85);
            } else {
                class150.method1021((byte) 107);
            }
            if (arg0[4].equals("free")) {
                class22.field442 = false;
            } else if (arg0[4].equals("members")) {
                class22.field442 = true;
            } else {
                class150.method1021((byte) 123);
            }
            if (arg0[5].equals("english")) {
                class106.field2373 = 0;
            } else if (arg0[5].equals("german")) {
                class53.method473(-54);
                class20.field397 = class4.field73;
                class106.field2373 = 1;
            } else {
                class150.method1021((byte) 8);
            }
            if (arg0[6].equals("game0")) {
                class64.field1539 = 0;
            } else if (arg0[6].equals("game1")) {
                class64.field1539 = 1;
            } else {
                class150.method1021((byte) 6);
            }
            class152.field3150 = "127.0.0.1";
            class158.field3214 = 0;
            class174.field3555 = class20.field387;
            client var1 = new client();
            var1.method1362(765, 16, 503, "runescape", class200.field4005 + 32, 487, -15145);
            class109.field2415.setLocation(40, 40);
        } catch (Exception var3) {
            class173.method1145((byte) -65, null, var3);
        }
        field628++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        field625++;
        if (arg0 > -50) {
            field622 = null;
        }
        class89.field1988++;
        if (class89.field1988 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class72.field1718 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class174.field3540.setSeed((long) class72.field1718);
        }
        this.method282(true);
        class31.method289(true);
        class37.method371((byte) -108);
        class145.method993(true);
        class131.method904(127);
        class67.method547((byte) -107);
        if (class80.field1867 != null) {
            int var3 = class80.field1867.method471(false);
            class166.field3367 = var3;
        }
        if (class2.field27 == 0) {
            class197.method1298((byte) -75);
            class55.method487((byte) 73);
        } else if (class2.field27 == 5) {
            class79.method599(0, this);
            class197.method1298((byte) -75);
            class55.method487((byte) 73);
        } else if (class2.field27 == 10) {
            class79.method599(0, this);
        } else if (class2.field27 == 20) {
            class79.method599(0, this);
            class115.method832(-125);
        } else if (class2.field27 == 25) {
            class68.method553(0);
        }
        if (class2.field27 == 30) {
            class79.method597(false);
        } else if (class2.field27 == 40) {
            class115.method832(-114);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field631++;
        if (!this.method1354(-126)) {
            return;
        }
        class101.field2230 = Integer.parseInt(this.getParameter("worldid"));
        class200.field4005 = Integer.parseInt(this.getParameter("modewhat"));
        class25.field508 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class105.method781((byte) -124);
        } else {
            class101.method758((byte) 100);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class22.field442 = true;
        } else {
            class22.field442 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class53.method473(-84);
            class20.field397 = class4.field73;
            class106.field2373 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class64.field1539 = 1;
        } else {
            class64.field1539 = 0;
        }
        try {
            class1.field12 = Integer.parseInt(this.getParameter("js"));
            class178.field3648 = Integer.parseInt(this.getParameter("plug"));
            class158.field3214 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class174.field3555 = class19.field376.method352((byte) 114, this);
        if (class174.field3555 == null) {
            class174.field3555 = class20.field387;
        }
        class152.field3150 = this.getCodeBase().getHost();
        this.method1355(487, 503, true, 765, class200.field4005 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    private final void method288(byte arg0, int arg1) {
        if (class82.field1904 == class210.field4163) {
            class82.field1904 = class100.field2202;
        } else {
            class82.field1904 = class210.field4163;
        }
        class99.field2176 = null;
        field629++;
        class146.field3079++;
        class141.field2992 = 0;
        class14.field264 = null;
        if (class146.field3079 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class2.field27 > 5) {
                class203.field4041 = 3000;
            } else {
                this.method1356("js5connect_full", (byte) -85);
                class2.field27 = 1000;
            }
        } else if (class146.field3079 >= 2 && arg1 == 6) {
            this.method1356("js5connect_outofdate", (byte) -127);
            class2.field27 = 1000;
        } else if (class146.field3079 >= 4) {
            if (class2.field27 > 5) {
                class203.field4041 = 3000;
            } else {
                this.method1356("js5connect", (byte) -77);
                class2.field27 = 1000;
            }
        }
        if (arg0 < 46) {
            this.method287(112);
        }
    }
}

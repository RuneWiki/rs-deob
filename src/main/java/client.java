import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class193 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Led;")
    public static class43 field553 = class191.method1219("<col=80ff00>", false);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Led;")
    public static class43 field551 = class191.method1219("<)4col>", false);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Led;")
    public static class43 field552 = class191.method1219("<br>", false);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Led;")
    public static class43 field558 = class191.method1219("me", false);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lrf;")
    public static class160 field557;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lje;")
    public static class87 field542;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method147(byte arg0) {
        if (class23.field453 != null) {
            class23.field453.field3218 = false;
        }
        class23.field453 = null;
        if (class48.field977 != null) {
            class48.field977.method522(-23002);
            class48.field977 = null;
        }
        class108.method666(-1);
        field555++;
        class203.method1314(-1);
        class157.field3176 = null;
        if (class82.field1621 != null) {
            class82.field1621.method456(0);
        }
        if (class167.field3295 != null) {
            class167.field3295.method456(0);
        }
        class138.method891(65);
        class191.method1215(false);
        try {
            if (arg0 >= -115) {
                field559 = -35;
            }
            if (class133.field2766 != null) {
                class133.field2766.method221(255);
            }
            if (class103.field1965 != null) {
                for (int var2 = 0; var2 < class103.field1965.length; var2++) {
                    if (class103.field1965[var2] != null) {
                        class103.field1965[var2].method221(255);
                    }
                }
            }
            if (class129.field2667 != null) {
                class129.field2667.method221(255);
            }
            if (class49.field996 != null) {
                class49.field996.method221(255);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method148(byte arg0) {
        field548++;
        boolean var2 = class68.method423((byte) -71);
        if (var2 && class40.field767 && class82.field1621 != null) {
            class82.field1621.method443(arg0 - 60);
        }
        if (class69.field1381) {
            class118.method750(class100.field1911, -128);
            class39.method212(class100.field1911, 0);
            if (class157.field3176 != null) {
                class157.field3176.method186(true, class100.field1911);
            }
            this.method1234(0);
            class156.method989(class100.field1911, -123);
            class193.method1228(class100.field1911, 4000);
            if (class157.field3176 != null) {
                class157.field3176.method190(class100.field1911, -9);
            }
        }
        if (class174.field3473 == 0) {
            class156.method987(false, class95.field1856, null, class68.field1366);
        } else if (class174.field3473 == 5) {
            class22.method107(true, class118.field2294, class89.field1729);
        } else if (class174.field3473 == 10) {
            class22.method107(true, class118.field2294, class89.field1729);
        } else if (class174.field3473 == 20) {
            class22.method107(true, class118.field2294, class89.field1729);
        } else if (class174.field3473 == 25) {
            if (class205.field3998 == 1) {
                if (class159.field3224 < class131.field2744) {
                    class159.field3224 = class131.field2744;
                }
                int var4 = (class159.field3224 - class131.field2744) * 50 / class159.field3224;
                class5.method33(false, class167.method1036(new class43[] { class201.field3951, class40.field775, class30.method161(var4, 10), class12.field181 }, true), (byte) 9);
            } else if (class205.field3998 == 2) {
                if (class121.field2413 > class106.field2026) {
                    class106.field2026 = class121.field2413;
                }
                int var3 = (class106.field2026 - class121.field2413) * 50 / class106.field2026 + 50;
                class5.method33(false, class167.method1036(new class43[] { class201.field3951, class40.field775, class30.method161(var3, 10), class12.field181 }, true), (byte) 126);
            } else {
                class5.method33(false, class201.field3951, (byte) 2);
            }
        } else if (class174.field3473 == 30) {
            class142.method908(-114);
        } else if (class174.field3473 == 40) {
            class5.method33(false, class167.method1036(new class43[] { class65.field1319, field552, class1.field34 }, true), (byte) 127);
        }
        if (arg0 != -39) {
            field542 = null;
        }
        if (class174.field3473 == 30 && class23.field448 == 0 && !class206.field4026) {
            try {
                Graphics var5 = class100.field1911.getGraphics();
                for (int var6 = 0; var6 < class125.field2476; var6++) {
                    if (class21.field355[var6]) {
                        class154.field3132.method277(var5, class21.field364[var6], class96.field1872[var6], -61, class27.field480[var6], class114.field2214[var6]);
                        class21.field355[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class100.field1911.repaint();
            }
        } else if (class174.field3473 > 0) {
            try {
                Graphics var7 = class100.field1911.getGraphics();
                class154.field3132.method278(var7, 29, 0, 0);
                class206.field4026 = false;
                for (int var8 = 0; var8 < class125.field2476; var8++) {
                    class21.field355[var8] = false;
                }
            } catch (Exception var10) {
                class100.field1911.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method149(boolean arg0) {
        field554++;
        if (class153.field3103 >= 4) {
            this.method1230("js5crc", (byte) -82);
            class174.field3473 = 1000;
        } else if (arg0) {
            if (class51.field1024 >= 4) {
                if (class174.field3473 <= 5) {
                    this.method1230("js5io", (byte) -82);
                    class174.field3473 = 1000;
                    return;
                }
                class38.field719 = 3000;
                class51.field1024 = 3;
            }
            if (class38.field719-- <= 0) {
                try {
                    if (class19.field337 == 0) {
                        class132.field2756 = class32.field585.method1005(-117, class87.field1691, class30.field571);
                        class19.field337++;
                    }
                    if (class19.field337 == 1) {
                        if (class132.field2756.field2927 == 2) {
                            this.method154(5660, -1);
                            return;
                        }
                        if (class132.field2756.field2927 == 1) {
                            class19.field337++;
                        }
                    }
                    if (class19.field337 == 2) {
                        class119.field2341 = new class87((Socket) class132.field2756.field2930, class32.field585);
                        class89 var2 = new class89(5);
                        var2.method539(15, 27678);
                        var2.method581(478, -268435456);
                        class119.field2341.method524(var2.field1769, 5, (byte) 61, 0);
                        class19.field337++;
                        class1.field33 = class52.method315((byte) -124);
                    }
                    if (class19.field337 == 3) {
                        if (class174.field3473 <= 5 || class119.field2341.method523(-7) > 0) {
                            int var3 = class119.field2341.method525(-12000);
                            if (var3 != 0) {
                                this.method154(5660, var3);
                                return;
                            }
                            class19.field337++;
                        } else if (class52.method315((byte) 71) - class1.field33 > 30000L) {
                            this.method154(5660, -2);
                            return;
                        }
                    }
                    if (class19.field337 == 4) {
                        class157.method994(class174.field3473 > 20, class119.field2341, 1);
                        class132.field2756 = null;
                        class119.field2341 = null;
                        class128.field2552 = 0;
                        class19.field337 = 0;
                    }
                } catch (IOException var4) {
                    this.method154(5660, -3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Led;BLed;ILed;)V")
    public static final void method150(class43 arg0, byte arg1, class43 arg2, int arg3, class43 arg4) {
        field545++;
        int var5 = 99;
        int var6 = -49 % ((arg1 + 66) / 49);
        while (var5 > 0) {
            class71.field1405[var5] = class71.field1405[var5 - 1];
            class127.field2540[var5] = class127.field2540[var5 - 1];
            class132.field2760[var5] = class132.field2760[var5 - 1];
            class61.field1247[var5] = class61.field1247[var5 - 1];
            var5--;
        }
        class108.field2064 = class200.field3940;
        class127.field2540[0] = arg2;
        class71.field1405[0] = arg3;
        class23.field408++;
        class132.field2760[0] = arg0;
        class61.field1247[0] = arg4;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (class69.field1378 == 1) {
            class30.field570 = class22.field374;
            class131.field2747 = class54.field1098;
            class133.field2767 = class21.field359;
            class44.field869 = class95.field1868;
        } else {
            class131.field2747 = class81.field1610;
            class133.field2767 = class14.field211;
            class30.field570 = class50.field1007;
            class44.field869 = class161.field3248;
        }
        class147.field3013 = class81.field1612 == 0 ? 443 : class95.field1859 + 50000;
        field556++;
        class53.field1070 = class81.field1612 == 0 ? 43594 : class95.field1859 + 40000;
        class87.field1691 = class53.field1070;
        class108.method673(26);
        class156.method989(class100.field1911, -106);
        class193.method1228(class100.field1911, arg0 ^ 0xFAA);
        class157.field3176 = class98.method615((byte) 112);
        if (class157.field3176 != null) {
            class157.field3176.method190(class100.field1911, -9);
        }
        class74.field1468 = class160.field3237;
        try {
            if (class32.field585.field3241 != null) {
                class133.field2766 = new class40(class32.field585.field3241, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class103.field1965[var2] = new class40(class32.field585.field3228[var2], 6000, 0);
                }
                class129.field2667 = new class40(class32.field585.field3239, 6000, 0);
                class96.field1869 = new class48(255, class133.field2766, class129.field2667, 500000);
                class49.field996 = new class40(class32.field585.field3236, 24, 0);
                class32.field585.field3236 = null;
                class32.field585.field3228 = null;
                class32.field585.field3239 = null;
                class32.field585.field3241 = null;
            }
            if (arg0 != 10) {
                this.method155(true);
            }
        } catch (IOException var3) {
            class129.field2667 = null;
            class49.field996 = null;
            class96.field1869 = null;
            class133.field2766 = null;
        }
        if (class81.field1612 != 0) {
            class34.field624 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method152(byte arg0) {
        field550++;
        method153(true);
        class43.method242(127);
        class193.method1222(-347);
        class96.method608(25);
        class147.method923(29);
        class159.method1003((byte) 112);
        class89.method570((byte) 107);
        class80.method491(-29263);
        class40.method222((byte) -87);
        class48.method301(65000);
        class77.method475((byte) -126);
        class54.method333(56);
        class177.method1145();
        class153.method962(8);
        class129.method830(false);
        class1.method3((byte) -19);
        class118.method754(-4);
        class17.method77(124);
        class33.method192(-1);
        class189.method1205((byte) -113);
        class144.method914((byte) -59);
        class73.method448((byte) 100);
        class14.method59((byte) -87);
        class75.method469(-8);
        class205.method1329((byte) -125);
        class119.method761(123);
        class138.method893((byte) 39);
        class59.method371(true);
        class137.method885(127);
        if (arg0 >= -16) {
            return;
        }
        class67.method419(false);
        class108.method669(-25424);
        class68.method424(-5694);
        class176.method1103(4350);
        class199.method1296();
        class124.method802(27710);
        class184.method1184(104);
        class163.method1019((byte) 76);
        class76.method474(0);
        class6.method36(0);
        class133.method856(-1);
        class92.method590(0);
        class83.method510(104);
        class158.method998((byte) -88);
        class191.method1217(0);
        class169.method1065();
        class44.method275((byte) 126);
        class3.method22();
        class166.method1031(119);
        class27.method130(1000);
        class66.method412((byte) 1);
        class107.method662(1);
        class52.method317(-123);
        class36.method205((byte) -78);
        class122.method797(1006);
        class58.method351((byte) 42);
        class114.method709(false);
        class60.method384(110);
        class200.method1307(true);
        class185.method1188(23269);
        class173.method1092(false);
        class103.method640(2);
        class106.method657(-123);
        class64.method407(115);
        class110.method682(false);
        class143.method909((byte) 108);
        class112.method692((byte) -128);
        class156.method991(5);
        class34.method193((byte) -124);
        class168.method1055();
        class5.method28(255);
        class135.method872();
        class167.method1035(-70);
        class31.method174();
        class105.method649(96);
        class19.method94(12643);
        class102.method632(219524424);
        class71.method437((byte) 126);
        class29.method142(-1);
        class28.method133((byte) 127);
        class23.method119((byte) 114);
        class46.method283(111);
        class63.method405();
        class101.method628(83);
        class194.method1240(false);
        class32.method183((byte) 44);
        class53.method324(15);
        class12.method53(-29754);
        class126.method810(-19904);
        class151.method939();
        class2.method13((byte) -23);
        class154.method984(true);
        class55.method339(1);
        class69.method427((byte) -59);
        class203.method1312(114);
        class174.method1098(77);
        class16.method69((byte) -62);
        class204.method1315(0);
        class148.method925(true);
        class131.method852(1);
        class115.method732(39);
        class82.method508((byte) 47);
        class61.method385(16);
        class197.method1292();
        class127.method817(false);
        class125.method804((byte) -107);
        class30.method157((byte) 105);
        class207.method1343(18836);
        class157.method993(0);
        class150.method929(true);
        class175.method1099((byte) -100);
        class65.method409(0);
        class100.method621(true);
        class38.method210(5000);
        class37.method207(false);
        class182.method1176(21177);
        class170.method1081(64);
        class13.method56(0);
        class198.method1294(-266);
        class104.method645(0);
        class186.method1193((byte) -36);
        class162.method1017();
        class70.method432();
        class47.method296(255);
        class146.method920();
        class145.method916(106);
        class201.method1309(-29);
        class190.method1210();
        class121.method793(256);
        class172.method1089(0);
        class39.method215((byte) -39);
        class130.method849();
        class196.method1284();
        class88.method529((byte) 115);
        class18.method89(64);
        class51.method308(false);
        class128.method825(47);
        class26.method127(16);
        class78.method478(60);
        class171.method1085((byte) -111);
        class7.method41(6);
        class136.method882((byte) -72);
        class109.method675(68);
        class79.method485((byte) 80);
        class117.method740(0);
        class98.method614((byte) 29);
        class140.method901(74);
        class74.method459(28031);
        class20.method100(0);
        class90.method586((byte) -89);
        class116.method735((byte) -96);
        class97.method611((byte) -38);
        class21.method101(108);
        class84.method513(0);
        class57.method342(0);
        class95.method605((byte) -125);
        class4.method23(false);
        class41.method229(-12754);
        class93.method595(896913964);
        class22.method105(9179409);
        class180.method1166(3);
        class188.method1198(99);
        class85.method517(-102);
        class187.method1196(4096);
        class50.method305(2);
        class142.method907((byte) -54);
        class99.method618(-173);
        class86.method520(0);
        class161.method1015(-26417);
        class164.method1021((byte) -20);
        class49.method302((byte) -78);
        class132.method854(103);
        class15.method63(628);
        class81.method499(25238);
        class206.method1335(-4096);
        class91.method588(-1162);
        class139.method897(false);
        class35.method198(-112);
        class24.method122(false);
        class9.method48(28403);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field552 = null;
        if (!arg0) {
            method153(true);
        }
        field542 = null;
        field551 = null;
        field558 = null;
        field557 = null;
        field553 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method154(int arg0, int arg1) {
        class132.field2756 = null;
        if (class87.field1691 == class53.field1070) {
            class87.field1691 = class147.field3013;
        } else {
            class87.field1691 = class53.field1070;
        }
        class128.field2552++;
        if (arg0 != 5660) {
            field542 = null;
        }
        class19.field337 = 0;
        field543++;
        class119.field2341 = null;
        if (class128.field2552 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class174.field3473 <= 5) {
                this.method1230("js5connect_full", (byte) -82);
                class174.field3473 = 1000;
            } else {
                class38.field719 = 3000;
            }
        } else if (class128.field2552 >= 2 && arg1 == 6) {
            this.method1230("js5connect_outofdate", (byte) -82);
            class174.field3473 = 1000;
        } else if (class128.field2552 >= 4) {
            if (class174.field3473 <= 5) {
                this.method1230("js5connect", (byte) -82);
                class174.field3473 = 1000;
            } else {
                class38.field719 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method155(boolean arg0) {
        field544++;
        if (class174.field3473 == 1000) {
            return;
        }
        boolean var2 = class101.method624(-12386);
        if (!arg0) {
            main(null);
        }
        if (!var2) {
            this.method149(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field547++;
        if (!this.method1227((byte) -125)) {
            return;
        }
        class95.field1859 = Integer.parseInt(this.getParameter("worldid"));
        class205.field3999 = Integer.parseInt(this.getParameter("modewhat"));
        class81.field1612 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class29.method144(1);
        } else {
            class137.method886(356421735);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class200.field3938 = true;
        } else {
            class200.field3938 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class153.method977(-1);
            class110.field2119 = class5.field111;
            class40.field776 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class69.field1378 = 1;
        } else {
            class69.field1378 = 0;
        }
        try {
            class57.field1114 = Integer.parseInt(this.getParameter("js"));
            class104.field1994 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class30.field571 = this.getCodeBase().getHost();
        this.method1233(class205.field3999 + 32, 478, 765, false, 503);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class157.method995(1);
            }
            class95.field1859 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class81.field1612 = 0;
            } else if (arg0[1].equals("office")) {
                class81.field1612 = 1;
            } else if (arg0[1].equals("local")) {
                class81.field1612 = 2;
            } else {
                class157.method995(1);
            }
            if (arg0[2].equals("live")) {
                class205.field3999 = 0;
            } else if (arg0[2].equals("rc")) {
                class205.field3999 = 1;
            } else if (arg0[2].equals("wip")) {
                class205.field3999 = 2;
            } else {
                class157.method995(1);
            }
            if (arg0[3].equals("lowmem")) {
                class29.method144(1);
            } else if (arg0[3].equals("highmem")) {
                class137.method886(356421735);
            } else {
                class157.method995(1);
            }
            if (arg0[4].equals("free")) {
                class200.field3938 = false;
            } else if (arg0[4].equals("members")) {
                class200.field3938 = true;
            } else {
                class157.method995(1);
            }
            if (arg0[5].equals("english")) {
                class40.field776 = 0;
            } else if (arg0[5].equals("german")) {
                class153.method977(-1);
                class110.field2119 = class5.field111;
                class40.field776 = 1;
            } else {
                class157.method995(1);
            }
            if (arg0[6].equals("game0")) {
                class69.field1378 = 0;
            } else if (arg0[6].equals("game1")) {
                class69.field1378 = 1;
            } else {
                class157.method995(1);
            }
            class30.field571 = "127.0.0.1";
            client var1 = new client();
            var1.method1226("runescape", true, 16, 478, class205.field3999 + 32, 503, 765);
            class198.field3901.setLocation(40, 40);
        } catch (Exception var3) {
            class171.method1086(null, -2929, var3);
        }
        field546++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method156(int arg0) {
        field559++;
        if (arg0 != -41) {
            this.method154(-61, 23);
        }
        field549++;
        if (field559 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class122.field2447 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class147.field3010.setSeed((long) class122.field2447);
        }
        this.method155(true);
        class47.method295(-5);
        class19.method96(-1);
        class41.method228((byte) -108);
        class23.method112((byte) -73);
        class200.method1305(-16);
        if (class157.field3176 != null) {
            int var3 = class157.field3176.method191(true);
            class154.field3135 = var3;
        }
        if (class174.field3473 == 0) {
            class180.method1170(2048);
            class86.method519(8223);
        } else if (class174.field3473 == 5) {
            class85.method516(this, arg0 ^ 0xFFFFFFC3);
            class180.method1170(arg0 + 2089);
            class86.method519(arg0 + 8264);
        } else if (class174.field3473 == 10) {
            class85.method516(this, arg0 ^ 0xFFFFFFC3);
        } else if (class174.field3473 == 20) {
            class85.method516(this, arg0 + 61);
            class67.method422(0);
        } else if (class174.field3473 == 25) {
            class102.method634(arg0 ^ 0xFFFFFFDF);
        }
        if (class174.field3473 == 30) {
            class205.method1328((byte) 99);
        } else if (class174.field3473 == 40) {
            class67.method422(arg0 + 41);
        }
    }
}

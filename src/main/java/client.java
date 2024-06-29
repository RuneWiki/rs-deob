import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class80 {

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Loa;")
    private static class98 field483 = class38.method349(255, "glow2:");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Loa;")
    public static class98 field485 = field483;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Loa;")
    public static class98 field482 = class38.method349(255, "Offline");

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Loa;")
    public static class98 field493 = field483;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ln;")
    public static class90 field481 = new class90(260);

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
    public static int[] field502 = new int[32];

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Loa;")
    private static class98 field503 = class38.method349(255, " is already on your friend list");

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Loa;")
    public static class98 field501 = field503;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Loa;")
    private static class98 field507;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "Loa;")
    public static class98 field506;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "Loa;")
    public static class98 field512;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Loc;")
    public static class100 field505;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "Ltb;")
    public static class130 field511;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lid;")
    public static class60 field508;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lkd;")
    public static class73 field504;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
    public static boolean field514;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[Lid;")
    public static class60[] field488;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field487++;
        if (!this.method643(10373)) {
            return;
        }
        class5.field74 = Integer.parseInt(this.getParameter("worldid"));
        class10.field201 = Integer.parseInt(this.getParameter("modewhat"));
        class115.field2592 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class65.method530(-30662);
        } else {
            class127.method998((byte) -86);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class4.field57 = true;
        } else {
            class4.field57 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class118.method937(true);
            class145.field3521 = class87.field1985;
            class139.field3391 = 1;
        }
        try {
            class97.field2225 = Integer.parseInt(this.getParameter("js"));
            class147.field3598 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class129.field2979 = this.getCodeBase().getHost();
        this.method635(class10.field201 + 32, 455, (byte) -127, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        field492++;
        method213(arg0);
        class98.method784(-115);
        class80.method641((byte) 89);
        class54.method439(496);
        class87.method711((byte) 46);
        class62.method502((byte) -47);
        class8.method79(28845);
        class27.method280((byte) -120);
        class73.method589(-1);
        class119.method948(107);
        class145.method1161(-1);
        class150.method1207((byte) 121);
        class18.method169(-13764);
        class45.method397();
        class22.method225();
        class149.method1197(true);
        class55.method453(24717);
        class63.method511(2047);
        class132.method1080(0);
        class120.method957((byte) -99);
        class3.method18(true);
        class81.method650(-6463);
        class21.method193(255);
        class71.method576((byte) -12);
        class33.method323(95);
        class148.method1184(true);
        class37.method347((byte) 106);
        class137.method1118(-3843);
        class123.method970((byte) -114);
        class111.method906(-82);
        class29.method297(arg0);
        class90.method738((byte) -38);
        class128.method1005();
        class12.method143();
        class38.method350((byte) 102);
        class51.method427(29674);
        class15.method154(arg0);
        class131.method1072(0);
        class46.method404(-2);
        class17.method167((byte) -78);
        class94.method754((byte) 56);
        class127.method1000(!arg0);
        class20.method187((byte) -70);
        class105.method886((byte) -57);
        class84.method701((byte) 116);
        class133.method1085();
        class16.method157((byte) -30);
        class78.method631((byte) -49);
        class44.method376(false);
        class4.method19((byte) 127);
        class130.method1052(96);
        class79.method633(0);
        class1.method3(-1);
        class82.method679(-109);
        class141.method1136((byte) 41);
        class39.method353(128);
        class76.method625(-8404);
        class140.method1124((byte) -76);
        class11.method123(-28427);
        class24.method271(1);
        class5.method23(-12449);
        class124.method983((byte) 59);
        class118.method934(0);
        class125.method988((byte) -69);
        class66.method537();
        class7.method44();
        class138.method1121(-9975);
        class56.method458(7);
        class77.method628(true);
        class146.method1169(-128);
        class142.method1141();
        class10.method118(105);
        class65.method528((byte) -89);
        class64.method523(false);
        class58.method465(1184);
        class97.method778((byte) -75);
        class91.method742(125);
        class129.method1038(-2108702173);
        class74.method608((byte) -40);
        class41.method359(false);
        class19.method185(28859);
        class114.method923((byte) -128);
        class49.method418((byte) 112);
        class99.method821(106);
        class32.method317(-1);
        class110.method900();
        class6.method30(false);
        class121.method959((byte) 116);
        class36.method344(-128);
        class26.method277((byte) 97);
        class139.method1123((byte) 123);
        class126.method991(505);
        class112.method913(false);
        class30.method299(-1);
        class101.method837((byte) -80);
        class143.method1153();
        class31.method306((byte) -111);
        class147.method1177(116);
        class48.method412(32);
        class106.method891(false);
        class86.method708(-452665785);
        class25.method275(119);
        class88.method718(30876);
        class83.method697((byte) 54);
        class115.method926(false);
        class135.method1095(119);
        class102.method842(false);
        class53.method437(-128);
        class57.method461(false);
        class134.method1093((byte) -85);
        class108.method897((byte) 3);
        class113.method918(1004);
        class103.method844();
        class122.method964();
        class14.method149(false);
        class109.method899();
        class96.method770(15088);
        class43.method364();
        class75.method620(119);
        class117.method930((byte) -121);
        class35.method336(false);
        class52.method431(-69);
        class95.method757();
        class89.method723();
        class67.method551(5551);
        class42.method362((byte) -17);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
    public static final boolean method202(int arg0, int arg1) {
        field500++;
        if (class119.field2682[arg0]) {
            return true;
        } else if (class71.field1452.method1046(0, arg0)) {
            int var2 = class71.field1452.method1062(arg0, (byte) 59);
            if (arg1 != -642990672) {
                field488 = null;
            }
            if (var2 == 0) {
                class119.field2682[arg0] = true;
                return true;
            }
            if (class36.field901[arg0] == null) {
                class36.field901[arg0] = new class132[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class36.field901[arg0][var3] == null) {
                    byte[] var4 = class71.field1452.method1058(arg0, 24, var3);
                    if (var4 != null) {
                        class36.field901[arg0][var3] = new class132();
                        class36.field901[arg0][var3].field3135 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class36.field901[arg0][var3].method1081((byte) 17, new class8(var4));
                        } else {
                            class36.field901[arg0][var3].method1077(new class8(var4), 4269);
                        }
                    }
                }
            }
            class119.field2682[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field495++;
        try {
            if (arg0.length != 6) {
                class114.method922((byte) -112);
            }
            class5.field74 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class115.field2592 = 0;
            } else if (arg0[1].equals("office")) {
                class115.field2592 = 1;
            } else if (arg0[1].equals("local")) {
                class115.field2592 = 2;
            } else {
                class114.method922((byte) -123);
            }
            if (arg0[2].equals("live")) {
                class10.field201 = 0;
            } else if (arg0[2].equals("rc")) {
                class10.field201 = 1;
            } else if (arg0[2].equals("wip")) {
                class10.field201 = 2;
            } else {
                class114.method922((byte) 108);
            }
            if (arg0[3].equals("lowmem")) {
                class65.method530(-30662);
            } else if (arg0[3].equals("highmem")) {
                class127.method998((byte) -126);
            } else {
                class114.method922((byte) -112);
            }
            if (arg0[4].equals("free")) {
                class4.field57 = false;
            } else if (arg0[4].equals("members")) {
                class4.field57 = true;
            } else {
                class114.method922((byte) -114);
            }
            if (arg0[5].equals("english")) {
                class139.field3391 = 0;
            } else if (arg0[5].equals("german")) {
                class118.method937(true);
                class139.field3391 = 1;
                class145.field3521 = class87.field1985;
            } else {
                class114.method922((byte) -113);
            }
            class129.field2979 = "127.0.0.1";
            client var1 = new client();
            var1.method646("runescape", 455, (byte) 60, 765, 16, class10.field201 + 32, 503);
        } catch (Exception var3) {
            class75.method617(58, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method203(int arg0) {
        field480++;
        boolean var2 = class24.method269(-16403);
        if (arg0 != 30) {
            field481 = null;
        }
        if (var2 && class8.field193 && class84.field1965 != null) {
            class84.field1965.method655((byte) 26);
        }
        if (class106.field2439) {
            class33.method330(class73.field1506, -128);
            class21.method199(class73.field1506, true);
            if (class106.field2434 != null) {
                class106.field2434.method331(class73.field1506, -102);
            }
            this.method638(0);
            class105.method890(class73.field1506, true);
            class84.method699(class73.field1506, false);
            if (class106.field2434 != null) {
                class106.field2434.method333(class73.field1506, -1418);
            }
        }
        if (class52.field1148 == 0) {
            class15.method155(3, null, class80.field1759, class81.field1835);
        } else if (class52.field1148 == 5) {
            class145.method1168(-1, class145.field3525, class71.field1480);
        } else if (class52.field1148 == 10) {
            class145.method1168(-1, class145.field3525, class71.field1480);
        } else if (class52.field1148 == 20) {
            class145.method1168(-1, class145.field3525, class71.field1480);
        } else if (class52.field1148 == 25) {
            if (class37.field916 == 1) {
                if (class134.field3266 < class1.field12) {
                    class134.field3266 = class1.field12;
                }
                int var4 = (class134.field3266 - class1.field12) * 50 / class134.field3266;
                class96.method766(true, class54.field1194, class102.method840(new class98[] { class134.field3274, class132.method1074(var4, (byte) -90), class126.field2824 }, 10), -21);
            } else if (class37.field916 == 2) {
                if (class64.field1367 < class113.field2549) {
                    class64.field1367 = class113.field2549;
                }
                int var3 = (class64.field1367 - class113.field2549) * 50 / class64.field1367 + 50;
                class96.method766(true, class54.field1194, class102.method840(new class98[] { class134.field3274, class132.method1074(var3, (byte) -111), class126.field2824 }, 10), -21);
            } else {
                class96.method766(false, class54.field1194, null, -21);
            }
        } else if (class52.field1148 == 30) {
            class106.method892(124);
        } else if (class52.field1148 == 35) {
            class111.method904(-51);
        } else if (class52.field1148 == 40) {
            class96.method766(false, class91.field2112, class17.field362, arg0 ^ 0xFFFFFFF5);
        }
        class57.field1269 = 0;
        class146.field3570 = 0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method204(byte arg0) {
        field498++;
        if (class14.field297 >= 4) {
            this.method642("js5crc", 95);
            class52.field1148 = 1000;
            return;
        }
        if (class36.field882 >= 4) {
            if (class52.field1148 <= 5) {
                this.method642("js5io", arg0 - 19);
                class52.field1148 = 1000;
                return;
            }
            class36.field882 = 3;
            class105.field2401 = 3000;
        }
        if (class105.field2401-- > 0) {
            return;
        }
        try {
            if (class114.field2583 == 0) {
                class55.field1227 = class10.field203.method578(class11.field229, class129.field2979, -13550);
                class114.field2583++;
            }
            if (class114.field2583 == 1) {
                if (class55.field1227.field2134 == 2) {
                    this.method212(-72, -1);
                    return;
                }
                if (class55.field1227.field2134 == 1) {
                    class114.field2583++;
                }
            }
            if (arg0 == 113) {
                if (class114.field2583 == 2) {
                    class46.field1075 = new class27((Socket) class55.field1227.field2130, class10.field203);
                    class8 var2 = new class8(5);
                    var2.method95(15, true);
                    var2.method72((byte) -84, 455);
                    class46.field1075.method278(var2.field132, (byte) 60, 5, 0);
                    class114.field2583++;
                    class121.field2716 = class44.method375((byte) 104);
                }
                if (class114.field2583 == 3) {
                    if (class52.field1148 <= 5 || class46.field1075.method284(0) > 0) {
                        int var3 = class46.field1075.method281((byte) 70);
                        if (var3 != 0) {
                            this.method212(-38, var3);
                            return;
                        }
                        class114.field2583++;
                    } else if (class44.method375((byte) 79) - class121.field2716 > 30000L) {
                        this.method212(-113, -2);
                        return;
                    }
                }
                if (class114.field2583 == 4) {
                    class146.method1172((byte) -87, class52.field1148 > 20, class46.field1075);
                    class46.field1075 = null;
                    class114.field2583 = 0;
                    class106.field2440 = 0;
                    class55.field1227 = null;
                }
            }
        } catch (IOException var4) {
            this.method212(-65, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method205(int arg0) {
        class10.field202 = class115.field2592 == 0 ? 443 : class5.field74 + 50000;
        class105.field2416 = class115.field2592 == 0 ? 43594 : class5.field74 + 40000;
        if (arg0 != 1) {
            field508 = null;
        }
        field479++;
        class11.field229 = class105.field2416;
        class135.method1097(59);
        class105.method890(class73.field1506, true);
        class84.method699(class73.field1506, false);
        class106.field2434 = class8.method88(-23772);
        if (class106.field2434 != null) {
            class106.field2434.method333(class73.field1506, -1418);
        }
        class117.field2615 = class72.field1501;
        try {
            if (class10.field203.field1491 != null) {
                class80.field1775 = new class119(class10.field203.field1491, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class14.field287[var2] = new class119(class10.field203.field1489[var2], 6000, 0);
                }
                class105.field2403 = new class119(class10.field203.field1493, 6000, 0);
                class18.field393 = new class145(255, class80.field1775, class105.field2403, 500000);
                class10.field203.field1489 = null;
                class10.field203.field1493 = null;
                class10.field203.field1491 = null;
            }
        } catch (IOException var3) {
            class80.field1775 = null;
            class18.field393 = null;
            class105.field2403 = null;
        }
        if (class115.field2592 != 0) {
            class58.field1304 = true;
        }
        class36.field893 = new class132();
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Lgb;")
    public static final class45 method206(byte arg0) {
        field484++;
        if (arg0 > -46) {
            return null;
        } else {
            class45 var1 = new class45(class83.field1928, class62.field1318, class91.field2103, class83.field1934, class138.field3382);
            class150.method1203(-1454146233);
            return var1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method207(int arg0) {
        field496++;
        if (class20.field444 != null) {
            class20.field444.field1325 = false;
        }
        class20.field444 = null;
        if (class139.field3394 != null) {
            class139.field3394.method283(-30232);
            class139.field3394 = null;
        }
        class17.method164(-22);
        class36.method342(arg0 - 33649);
        class106.field2434 = null;
        if (class84.field1965 != null) {
            class84.field1965.method647(arg0 + 9087);
        }
        if (class41.field971 != null) {
            class41.field971.method647(arg0 ^ 0x7C81);
        }
        class112.method911((byte) 78);
        if (arg0 != 12015) {
            field505 = null;
        }
        class88.method715(-87);
        try {
            if (class80.field1775 != null) {
                class80.field1775.method946(arg0 - 12015);
            }
            if (class14.field287 != null) {
                for (int var2 = 0; var2 < class14.field287.length; var2++) {
                    if (class14.field287[var2] != null) {
                        class14.field287[var2].method946(0);
                    }
                }
            }
            if (class105.field2403 != null) {
                class105.field2403.method946(arg0 ^ 0x2EEF);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbe;B)V")
    public static final void method208(class13 arg0, byte arg1) {
        if (arg0.field285 != null) {
            arg0.field285.field575 = 0;
        }
        arg0.field286 = false;
        if (arg1 == 107) {
            for (class13 var2 = arg0.method113(); var2 != null; var2 = arg0.method110()) {
                method208(var2, (byte) 107);
            }
            field497++;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLtd;)Ltd;")
    public static final class132 method209(byte arg0, class132 arg1) {
        field486++;
        int var2 = class74.method615((byte) -72, class39.method351(arg0 ^ 0xFFFFFF89, arg1));
        if (var2 == 0) {
            return null;
        }
        int var3 = 0;
        if (arg0 != -90) {
            return null;
        }
        while (var3 < var2) {
            arg1 = class117.method932(arg1.field3195, (byte) -116);
            if (arg1 == null) {
                return null;
            }
            var3++;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method210(boolean arg0) {
        field489++;
        class119.field2680++;
        if (!arg0) {
            field483 = null;
        }
        this.method211(-126);
        class78.method630(10764);
        class113.method917((byte) 55);
        class21.method190((byte) -39);
        class6.method33((byte) -86);
        class24.method267(65);
        if (class106.field2434 != null) {
            int var2 = class106.field2434.method332(true);
            class146.field3570 += var2;
            class86.field1977 = var2;
        }
        if (class52.field1148 == 0) {
            class73.method592(-23336);
            class27.method282(false);
        } else if (class52.field1148 == 5) {
            class123.method972(this, (byte) 54);
            class73.method592(-23336);
            class27.method282(false);
        } else if (class52.field1148 == 10) {
            class123.method972(this, (byte) 54);
        } else if (class52.field1148 == 20) {
            class123.method972(this, (byte) 54);
            class120.method952(-10);
        } else if (class52.field1148 == 25) {
            class106.method894(-1);
        }
        if (class52.field1148 == 30) {
            class124.method979(0);
        } else if (class52.field1148 == 35) {
            class124.method979(0);
            return;
        } else if (class52.field1148 == 40) {
            class120.method952(-10);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method211(int arg0) {
        field491++;
        if (class52.field1148 != 1000) {
            boolean var2 = class37.method348(13918);
            if (arg0 < -111 && !var2) {
                this.method204((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method212(int arg0, int arg1) {
        class106.field2440++;
        class55.field1227 = null;
        if (class11.field229 == class105.field2416) {
            class11.field229 = class10.field202;
        } else {
            class11.field229 = class105.field2416;
        }
        class46.field1075 = null;
        class114.field2583 = 0;
        if (arg0 > -27) {
            return;
        }
        field499++;
        if (class106.field2440 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class52.field1148 <= 5) {
                this.method642("js5connect_full", 93);
                class52.field1148 = 1000;
            } else {
                class105.field2401 = 3000;
            }
        } else if (class106.field2440 >= 2 && arg1 == 6) {
            this.method642("js5connect_outofdate", 95);
            class52.field1148 = 1000;
        } else if (class106.field2440 >= 4) {
            if (class52.field1148 > 5) {
                class105.field2401 = 3000;
            } else {
                this.method642("js5connect", 101);
                class52.field1148 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method213(boolean arg0) {
        field501 = null;
        field507 = null;
        field504 = null;
        field508 = null;
        field505 = null;
        field502 = null;
        field481 = null;
        field485 = null;
        field512 = null;
        field506 = null;
        field483 = null;
        if (!arg0) {
            field504 = null;
        }
        field482 = null;
        field488 = null;
        field493 = null;
        field503 = null;
        field511 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field502[var1] = var0 - 1;
            var0 += var0;
        }
        field507 = class38.method349(255, "Loading)3)3)3");
        field509 = 0;
        field506 = class38.method349(255, " )2>");
        field512 = field507;
    }
}

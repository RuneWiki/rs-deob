import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class143 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lad;")
    public static class5 field385 = new class5();

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lqf;")
    public static class117 field396 = class72.method514(103, "m");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lqf;")
    public static class117 field394 = class72.method514(115, "backhmid1");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lqf;")
    private static class117 field391 = class72.method514(118, "Please contact customer support)3");

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lqf;")
    public static class117 field398 = field391;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lqf;")
    public static class117 field397 = class72.method514(125, "An");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lqf;")
    public static class117 field393 = class72.method514(100, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lwd;")
    public static class153 field395 = new class153(32);

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lqf;")
    public static class117 field399 = class72.method514(99, "mapback");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lqf;")
    public static class117 field401 = class72.method514(101, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lha;")
    public static class50 field392;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
    public static boolean field402;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ldc;")
    public static final class25 method164(int arg0, byte arg1) {
        field378++;
        class25 var2 = (class25) class24.field463.method247(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -22 / ((arg1 + 62) / 55);
        byte[] var4 = class141.field3357.method458(false, arg0, 3);
        class25 var5 = new class25();
        if (var4 != null) {
            var5.method198(true, new class77(var4));
        }
        class24.field463.method248((long) arg0, (byte) -117, var5);
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lla;I)Lqf;")
    public static final class117 method165(class77 arg0, int arg1) {
        field383++;
        return arg1 == 1 ? class73.method534(arg0, 32767, false) : null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static void method166(boolean arg0) {
        field399 = null;
        field395 = null;
        field393 = null;
        if (arg0) {
            field394 = null;
        }
        field396 = null;
        field394 = null;
        field392 = null;
        field397 = null;
        field398 = null;
        field401 = null;
        field385 = null;
        field391 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)I")
    public static final int method167(byte[] arg0, int arg1, byte arg2) {
        int var3 = 45 / ((14 - arg2) / 45);
        field384++;
        return class115.method894(0, arg1, -1063626008, arg0);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field380++;
        try {
            if (arg0.length != 6) {
                class3.method9(false);
            }
            class56.field1152 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class89.field2135 = 0;
            } else if (arg0[1].equals("office")) {
                class89.field2135 = 1;
            } else if (arg0[1].equals("local")) {
                class89.field2135 = 2;
            } else {
                class3.method9(false);
            }
            if (arg0[2].equals("live")) {
                class29.field571 = 0;
            } else if (arg0[2].equals("rc")) {
                class29.field571 = 1;
            } else if (arg0[2].equals("wip")) {
                class29.field571 = 2;
            } else {
                class3.method9(false);
            }
            if (arg0[3].equals("lowmem")) {
                class53.method393(-105);
            } else if (arg0[3].equals("highmem")) {
                class81.method638(116);
            } else {
                class3.method9(false);
            }
            if (arg0[4].equals("free")) {
                class146.field3569 = false;
            } else if (arg0[4].equals("members")) {
                class146.field3569 = true;
            } else {
                class3.method9(false);
            }
            if (arg0[5].equals("english")) {
                class144.field3539 = 0;
            } else if (arg0[5].equals("german")) {
                class72.method519(-106);
                class141.field3411 = class141.field3409;
                class144.field3539 = 1;
            } else {
                class3.method9(false);
            }
            class122.field2906 = "127.0.0.1";
            client var1 = new client();
            var1.method1157(503, "runescape", 765, 13044, 16, 459, class29.field571 + 32);
        } catch (Exception var3) {
            class105.method803((byte) -126, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method168(int arg0) {
        field382++;
        if (class48.field1022 == 1000) {
            return;
        }
        if (arg0 != 0) {
            field399 = null;
        }
        boolean var2 = class133.method1028(13);
        if (!var2) {
            this.method170(15);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field390++;
        if (!this.method1147((byte) -91)) {
            return;
        }
        class56.field1152 = Integer.parseInt(this.getParameter("worldid"));
        class29.field571 = Integer.parseInt(this.getParameter("modewhat"));
        class89.field2135 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class53.method393(-123);
        } else {
            class81.method638(116);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class146.field3569 = true;
        } else {
            class146.field3569 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class72.method519(-114);
            class141.field3411 = class141.field3409;
            class144.field3539 = 1;
        }
        try {
            class29.field567 = Integer.parseInt(this.getParameter("js"));
            class19.field299 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class122.field2906 = this.getCodeBase().getHost();
        this.method1159(28818, 459, class29.field571 + 32, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method169(int arg0) {
        field386++;
        boolean var2 = class73.method532(-121);
        if (var2 && class40.field796 && class119.field2853 != null) {
            class119.field2853.method1196(2000);
        }
        if (class13.field186) {
            class150.method1208(class3.field64, -1);
            class44.method304(0, class3.field64);
            if (class133.field3155 != null) {
                class133.field3155.method425(class3.field64, 255);
            }
            this.method1151(0);
            class16.method138((byte) -84, class3.field64);
            class32.method259(class3.field64, (byte) 93);
            if (class133.field3155 != null) {
                class133.field3155.method424((byte) -69, class3.field64);
            }
        }
        if (class48.field1022 == 0) {
            class114.method892(null, -11736, class95.field2299, class126.field2980);
        } else if (class48.field1022 == 5) {
            class94.method742(class144.field3554, 80, class25.field486);
        } else if (class48.field1022 == 10) {
            class94.method742(class144.field3554, 99, class25.field486);
        } else if (class48.field1022 == 20) {
            class94.method742(class144.field3554, 87, class25.field486);
        } else if (class48.field1022 == 25) {
            if (class112.field2626 == 1) {
                if (class91.field2237 < class26.field521) {
                    class91.field2237 = class26.field521;
                }
                int var3 = (class91.field2237 - class26.field521) * 50 / class91.field2237;
                class119.method955(class76.field1659, true, class73.method530((byte) -83, new class117[] { class147.field3589, class79.method614(15591, var3), class125.field2947 }), 3);
            } else if (class112.field2626 == 2) {
                if (class96.field2343 > class47.field950) {
                    class47.field950 = class96.field2343;
                }
                int var4 = (class47.field950 - class96.field2343) * 50 / class47.field950 + 50;
                class119.method955(class76.field1659, true, class73.method530((byte) -83, new class117[] { class147.field3589, class79.method614(15591, var4), class125.field2947 }), 3);
            } else {
                class119.method955(class76.field1659, false, null, 3);
            }
        } else if (class48.field1022 == 30) {
            class78.method607((byte) -123);
        } else if (class48.field1022 == 35) {
            class5.method21((byte) 73);
        } else if (class48.field1022 == 40) {
            class119.method955(class104.field2508, false, class126.field2979, 3);
        }
        class122.field2894 = 0;
        int var5 = 18 / ((arg0 - 42) / 58);
        class42.field838 = 0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method170(int arg0) {
        field389++;
        if (class15.field205 >= 4) {
            this.method1149(-87, "js5crc");
            class48.field1022 = 1000;
            return;
        }
        if (class129.field3072 >= 4) {
            if (class48.field1022 <= 5) {
                this.method1149(-109, "js5io");
                class48.field1022 = 1000;
                return;
            }
            class129.field3072 = 3;
            class115.field2730 = 3000;
        }
        if (class115.field2730-- > 0) {
            return;
        }
        try {
            if (arg0 != 15) {
                field393 = null;
            }
            if (class67.field1396 == 0) {
                class31.field656 = class44.field873.method1070(class122.field2906, class85.field1938, (byte) -69);
                class67.field1396++;
            }
            if (class67.field1396 == 1) {
                if (class31.field656.field108 == 2) {
                    this.method175(23448, -1);
                    return;
                }
                if (class31.field656.field108 == 1) {
                    class67.field1396++;
                }
            }
            if (class67.field1396 == 2) {
                class29.field576 = new class93((Socket) class31.field656.field106, class44.field873);
                class77 var2 = new class77(5);
                var2.method571(15, arg0 ^ 0xFFFFD483);
                var2.method600(459, -30515);
                class29.field576.method736((byte) 42, var2.field1748, 5, 0);
                class67.field1396++;
                class104.field2511 = class122.method977(false);
            }
            if (class67.field1396 == 3) {
                if (class48.field1022 <= 5 || class29.field576.method731(arg0 ^ 0xF) > 0) {
                    int var3 = class29.field576.method732(27426);
                    if (var3 != 0) {
                        this.method175(23448, var3);
                        return;
                    }
                    class67.field1396++;
                } else if (class122.method977(false) - class104.field2511 > 30000L) {
                    this.method175(23448, -2);
                    return;
                }
            }
            if (class67.field1396 == 4) {
                class121.method967(class29.field576, (byte) -94, class48.field1022 > 20);
                class67.field1396 = 0;
                class29.field576 = null;
                class31.field656 = null;
                class114.field2706 = 0;
            }
        } catch (IOException var4) {
            this.method175(arg0 + 23433, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjb;IZ)Lr;")
    public static final class118 method171(int arg0, class64 arg1, int arg2, boolean arg3) {
        field376++;
        if (arg3) {
            method171(-6, null, 80, false);
        }
        return class68.method478(12127, arg2, arg0, arg1) ? class47.method337(!arg3) : null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method172(byte arg0) {
        if (arg0 < 20) {
            this.method169(111);
        }
        class16.field248 = class89.field2135 == 0 ? 443 : class56.field1152 + 50000;
        class125.field2943 = class89.field2135 == 0 ? 43594 : class56.field1152 + 40000;
        class85.field1938 = class125.field2943;
        class128.method1001(-106957112);
        field387++;
        class16.method138((byte) -84, class3.field64);
        class32.method259(class3.field64, (byte) 115);
        class133.field3155 = class55.method408(109);
        if (class133.field3155 != null) {
            class133.field3155.method424((byte) -69, class3.field64);
        }
        class42.field841 = class137.field3268;
        try {
            if (class44.field873.field3276 != null) {
                class70.field1490 = new class79(class44.field873.field3276, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class135.field3233[var2] = new class79(class44.field873.field3271[var2], 6000, 0);
                }
                class101.field2443 = new class79(class44.field873.field3265, 6000, 0);
                class15.field215 = new class16(255, class70.field1490, class101.field2443, 500000);
                class44.field873.field3271 = null;
                class44.field873.field3276 = null;
                class44.field873.field3265 = null;
            }
        } catch (IOException var3) {
            class101.field2443 = null;
            class70.field1490 = null;
            class15.field215 = null;
        }
        if (class89.field2135 != 0) {
            class3.field42 = true;
        }
        class103.field2492 = new class89();
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method173(int arg0) {
        class43.field856++;
        field388++;
        this.method168(arg0 - 10);
        class70.method499(1000);
        class140.method1086(true);
        class120.method964(arg0 ^ 0xB);
        class13.method110((byte) -38);
        class8.method41(112);
        if (class133.field3155 != null) {
            int var2 = class133.field3155.method426((byte) -118);
            class42.field838 += var2;
            class126.field2989 = var2;
        }
        if (class48.field1022 == 0) {
            class121.method970(arg0 ^ 0xFFFFFFF5);
            class143.method1153(12289);
        } else if (class48.field1022 == 5) {
            class117.method930(this, 82);
            class121.method970(arg0 ^ 0xFFFFFFF5);
            class143.method1153(12289);
        } else if (class48.field1022 == 10) {
            class117.method930(this, -67);
        } else if (class48.field1022 == 20) {
            class117.method930(this, -47);
            class136.method1059(arg0 + 3784);
        } else if (class48.field1022 == 25) {
            class133.method1027(-7213);
        }
        if (class48.field1022 == 30) {
            class120.method966(false);
        } else if (class48.field1022 == 35) {
            class120.method966(false);
        } else if (class48.field1022 == 40) {
            class136.method1059(arg0 ^ 0xED8);
        }
        if (arg0 != 10) {
            this.method176(-37);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (class26.field525 != null) {
            class26.field525.field3586 = false;
        }
        field377++;
        if (arg0 > -3) {
            return;
        }
        class26.field525 = null;
        if (class125.field2957 != null) {
            class125.field2957.method738(1);
            class125.field2957 = null;
        }
        class25.method190(0);
        class79.method619(true);
        class133.field3155 = null;
        if (class119.field2853 != null) {
            class119.field2853.method1201((byte) -120);
        }
        if (class90.field2170 != null) {
            class90.field2170.method1201((byte) 88);
        }
        class124.method985(-1);
        class44.method305(true);
        try {
            if (class70.field1490 != null) {
                class70.field1490.method621(-9837);
            }
            if (class135.field3233 != null) {
                for (int var2 = 0; var2 < class135.field3233.length; var2++) {
                    if (class135.field3233[var2] != null) {
                        class135.field3233[var2].method621(-9837);
                    }
                }
            }
            if (class101.field2443 != null) {
                class101.field2443.method621(-9837);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method175(int arg0, int arg1) {
        class29.field576 = null;
        class31.field656 = null;
        if (class85.field1938 == class125.field2943) {
            class85.field1938 = class16.field248;
        } else {
            class85.field1938 = class125.field2943;
        }
        if (arg0 != 23448) {
            method166(false);
        }
        field379++;
        class114.field2706++;
        class67.field1396 = 0;
        if (class114.field2706 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class48.field1022 <= 5) {
                this.method1149(-112, "js5connect_full");
                class48.field1022 = 1000;
            } else {
                class115.field2730 = 3000;
            }
        } else if (class114.field2706 >= 2 && arg1 == 6) {
            this.method1149(arg0 - 23545, "js5connect_outofdate");
            class48.field1022 = 1000;
        } else if (class114.field2706 >= 4) {
            if (class48.field1022 > 5) {
                class115.field2730 = 3000;
            } else {
                this.method1149(-116, "js5connect");
                class48.field1022 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method176(int arg0) {
        field381++;
        method166(false);
        class117.method917(false);
        class143.method1158(-118);
        class146.method1171((byte) 118);
        class28.method211(119);
        class147.method1175((byte) 74);
        class77.method564((byte) 125);
        class93.method737(-63);
        class50.method374(-15075);
        class79.method615(true);
        class16.method137(-79);
        class58.method414(-121);
        class119.method958((byte) 99);
        class46.method326();
        class113.method869();
        class135.method1054((byte) 110);
        class21.method163((byte) 65);
        class5.method15(true);
        class89.method709(-128);
        class104.method802((byte) -62);
        class153.method1217((byte) -18);
        class45.method312(-28853);
        class149.method1197((byte) 38);
        class110.method827(false);
        class99.method775(512);
        class96.method753((byte) -96);
        class87.method689((byte) 87);
        class23.method183(-7);
        class134.method1038((byte) -86);
        class70.method500(17484);
        class128.method1003(-5);
        class13.method111((byte) 39);
        class31.method252(-4);
        class30.method226();
        class142.method1144();
        class126.method993(false);
        class121.method968((byte) 54);
        class133.method1032(27250);
        class130.method1016((byte) -115);
        class125.method991(8);
        class62.method427(4280);
        class34.method266(-1);
        class129.method1009(5625);
        class48.method345(-30303);
        class102.method790(0);
        class66.method471(113);
        class1.method1();
        class152.method1213(true);
        class53.method394(102);
        class122.method976(false);
        class64.method454(false);
        class85.method681(0);
        class101.method788(false);
        class141.method1099((byte) 100);
        class55.method404(120);
        class94.method744(16777215);
        class76.method550(false);
        class32.method258((byte) -124);
        class73.method527((byte) -94);
        class56.method412(-119);
        class95.method745((byte) -113);
        class82.method640(10892);
        class26.method203(10);
        class150.method1207(-2);
        class12.method94();
        class49.method365();
        class24.method188(32331);
        class15.method131(-17873);
        class114.method885(false);
        class27.method207(-19549);
        class36.method276(102);
        class14.method127();
        class47.method340(-1);
        class69.method487(56);
        class92.method728(0);
        class75.method546(0);
        class29.method216(true);
        class25.method195(-1);
        class148.method1189(false);
        class72.method522((byte) 20);
        class43.method300((byte) 127);
        class60.method420(-112);
        class42.method293((byte) -38);
        class91.method725((byte) -46);
        class52.method388(101);
        class97.method768(true);
        class71.method505(115);
        class106.method807();
        class40.method286(0);
        class107.method809(0);
        class80.method628((byte) 118);
        class120.method965(3);
        class78.method609(18485);
        class22.method178((byte) -96);
        class65.method465(false);
        class136.method1061(-124);
        class67.method476((byte) 15);
        class127.method999();
        class90.method713(2);
        class81.method633(0);
        class41.method289(0);
        class139.method1080(-1);
        class19.method152(-1);
        class3.method8(-72);
        class8.method40((byte) -12);
        class20.method156((byte) -126);
        class138.method1078(4);
        class68.method480(true);
        class44.method303(true);
        class140.method1090((byte) 69);
        class103.method793(true);
        class105.method804((byte) 77);
        class112.method832(true);
        class35.method269((byte) 112);
        class83.method650((byte) 121);
        class111.method830();
        class131.method1020();
        class18.method150((byte) 106);
        int var2 = -20 / ((arg0 + 48) / 32);
        class57.method413();
        class100.method784((byte) -114);
        class6.method38();
        class144.method1168((byte) 101);
        class124.method987(585);
        class115.method896(-19310);
        class132.method1025((byte) -69);
        class108.method813();
        class54.method399();
        class4.method10(3207);
        class116.method899(-57);
    }
}

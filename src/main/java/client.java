import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class137 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lid;")
    public static class60 field501 = class11.method72("Suche nach Updates )2 ", (byte) -91);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lie;")
    public static class61 field514;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
    public static int[] field509;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method167(int arg0, boolean arg1, Object arg2) {
        field502++;
        if (arg0 != -23224) {
            field498 = -7;
        }
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class30.method228(var3, (byte) -35) : var3;
        } else if (arg2 instanceof class129) {
            class129 var4 = (class129) arg2;
            return var4.method924(-81);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method168(boolean arg0) {
        field513++;
        method173((byte) -72);
        class60.method454((byte) 43);
        class137.method1075((byte) -117);
        class141.method1097(0);
        class152.method1157(1);
        class63.method489(500);
        class103.method815(-252);
        class90.method732(-23828);
        class105.method864(-1);
        class28.method211((byte) 126);
        class59.method415((byte) 4);
        class53.method391((byte) 108);
        class157.method1208(117);
        class76.method619();
        class106.method868(-1);
        class40.method316(30234);
        class1.method3((byte) -69);
        class66.method507(-25064);
        class86.method719(-95);
        class102.method796((byte) 43);
        class75.method570(12223);
        class155.method1191(0);
        class74.method564((byte) 78);
        class17.method140(38);
        class46.method363((byte) -81);
        class35.method267(-2);
        class12.method78(-5040);
        class154.method1173(true);
        class81.method686(-16385);
        class128.method1008(8338);
        class153.method1166(-66057173);
        class32.method243(-11);
        class115.method913((byte) -111);
        class70.method541();
        class96.method753();
        class21.method164(-6);
        class48.method374(5);
        class116.method922(3);
        class22.method179(-20116);
        class41.method326((byte) -54);
        class78.method633(41);
        class50.method380(true);
        class89.method727(false);
        class54.method392(99);
        class101.method792(2185);
        class112.method904((byte) 61);
        class95.method747();
        class120.method938((byte) 92);
        class109.method893((byte) 124);
        class145.method1112(74);
        class133.method1051(false);
        class39.method308((byte) -86);
        class125.method984((byte) 81);
        class38.method298(-123);
        class61.method460(-103);
        class14.method102((byte) 66);
        class73.method553((byte) 96);
        class4.method15(10);
        class80.method679(60);
        class30.method231((byte) -81);
        class55.method399(10804);
        class94.method746(arg0);
        class158.method1217((byte) -11);
        class151.method1154(-110);
        class93.method744(-1);
        class104.method852((byte) -122);
        class140.method1089((byte) -14);
        class11.method71((byte) 110);
        class130.method1023();
        class31.method233(0);
        class127.method990();
        class52.method389((byte) 15);
        class37.method279();
        class25.method192(5);
        class24.method189(1);
        class67.method512((byte) 127);
        class131.method1037((byte) -102);
        class132.method1040(-103);
        class42.method332((byte) 44);
        class148.method1131(65535);
        class85.method703(-14);
        class47.method371((byte) 104);
        class121.method943(-31828);
        class7.method49((byte) 84);
        class8.method53(0);
        class136.method1064(false);
        class111.method897((byte) 93);
        class122.method968();
        class139.method1079((byte) 114);
        class126.method988();
        class34.method255((byte) 114);
        class69.method518((byte) 124);
        class99.method781(0);
        class13.method82(-54);
        class23.method183(!arg0);
        class144.method1111(128);
        class146.method1118(768);
        class19.method158((byte) -124);
        class5.method17((byte) -72);
        class15.method125((byte) -82);
        class87.method725((byte) 41);
        class2.method7(7);
        class91.method742();
        class82.method688(-1024);
        class100.method789((byte) -46);
        class62.method487((byte) 108);
        class135.method1059(72);
        class97.method768((byte) 33);
        class113.method907(64);
        class44.method346(-3583);
        class43.method339(true);
        class107.method883(5618);
        class18.method153((byte) -17);
        class9.method62(32);
        class129.method1012(false);
        class124.method981((byte) -51);
        class33.method253(7);
        class64.method494(31336);
        class57.method405();
        class123.method973();
        class51.method384(73);
        class20.method161();
        class45.method349(-55);
        class98.method779(false);
        class150.method1144();
        class16.method132(-78);
        class77.method624(true);
        class72.method550(29269);
        class156.method1198();
        class58.method413();
        class56.method403((byte) -65);
        class10.method69(29799);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class40.method318((byte) -127);
            }
            class17.field434 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class34.field785 = 0;
            } else if (arg0[1].equals("office")) {
                class34.field785 = 1;
            } else if (arg0[1].equals("local")) {
                class34.field785 = 2;
            } else {
                class40.method318((byte) -127);
            }
            if (arg0[2].equals("live")) {
                class132.field3006 = 0;
            } else if (arg0[2].equals("rc")) {
                class132.field3006 = 1;
            } else if (arg0[2].equals("wip")) {
                class132.field3006 = 2;
            } else {
                class40.method318((byte) -127);
            }
            if (arg0[3].equals("lowmem")) {
                class121.method941((byte) -96);
            } else if (arg0[3].equals("highmem")) {
                class90.method738(126);
            } else {
                class40.method318((byte) -127);
            }
            if (arg0[4].equals("free")) {
                class31.field719 = false;
            } else if (arg0[4].equals("members")) {
                class31.field719 = true;
            } else {
                class40.method318((byte) -127);
            }
            if (arg0[5].equals("english")) {
                class145.field3273 = 0;
            } else if (arg0[5].equals("german")) {
                class137.method1065(126);
                class145.field3273 = 1;
                class94.field2311 = class38.field918;
            } else {
                class40.method318((byte) -127);
            }
            if (arg0[6].equals("game0")) {
                class19.field470 = 0;
            } else if (arg0[6].equals("game1")) {
                class19.field470 = 1;
            } else {
                class40.method318((byte) -127);
            }
            class56.field1401 = "127.0.0.1";
            client var1 = new client();
            var1.method1076(503, (byte) 84, class132.field3006 + 32, 16, "runescape", 463, 765);
        } catch (Exception var3) {
            class73.method558(-1, null, var3);
        }
        field506++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II[Lfd;)V")
    public static final void method169(int arg0, int arg1, class40[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class40 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field938 == 0) {
                    if (var4.field1052 != null) {
                        method169(arg0, arg1, var4.field1052);
                    }
                    class81 var5 = (class81) class39.field929.method716((byte) 85, (long) var4.field1008);
                    if (var5 != null) {
                        class16.method129(-29873, var5.field2012, arg1);
                    }
                }
                if (arg1 == 0 && var4.field1035 != null) {
                    class15 var6 = new class15();
                    var6.field361 = var4;
                    var6.field353 = var4.field1035;
                    class61.method467(false, var6);
                }
                if (arg1 == 1 && var4.field1063 != null) {
                    class15 var7 = new class15();
                    var7.field353 = var4.field1063;
                    var7.field361 = var4;
                    class61.method467(false, var7);
                }
            }
        }
        if (arg0 == -10897) {
            field505++;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method170(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field508++;
        if (class48.field1265 != 1000) {
            boolean var2 = class48.method373((byte) 121);
            if (!var2) {
                this.method174(463);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method171(int arg0) {
        field510++;
        boolean var2 = class73.method559((byte) -43);
        if (var2 && class72.field1733 && class113.field2703 != null) {
            class113.field2703.method1187((byte) -128);
        }
        if (class87.field2169) {
            class5.method18(-110, class9.field148);
            class77.method630((byte) -122, class9.field148);
            if (class139.field3181 != null) {
                class139.field3181.method695((byte) 27, class9.field148);
            }
            this.method1077(false);
            class102.method797(class9.field148, 15129);
            class31.method235(class9.field148, (byte) -22);
            if (class139.field3181 != null) {
                class139.field3181.method696(class9.field148, (byte) 122);
            }
        }
        if (arg0 != 40) {
            return;
        }
        if (class48.field1265 == 0) {
            class157.method1215(null, class4.field67, class141.field3216, (byte) -54);
        } else if (class48.field1265 == 5) {
            class136.method1060((byte) 115, class18.field447, class103.field2491);
        } else if (class48.field1265 == 10) {
            class136.method1060((byte) 115, class18.field447, class103.field2491);
        } else if (class48.field1265 == 20) {
            class136.method1060((byte) 115, class18.field447, class103.field2491);
        } else if (class48.field1265 == 25) {
            if (class136.field3081 == 1) {
                if (class120.field2757 < class148.field3372) {
                    class120.field2757 = class148.field3372;
                }
                int var4 = (class120.field2757 - class148.field3372) * 50 / class120.field2757;
                class81.method687(false, arg0 - 1064, class104.method853(-78, new class60[] { class19.field465, class60.field1488, class98.method774((byte) -121, var4), class15.field330 }));
            } else if (class136.field3081 == 2) {
                if (class102.field2474 > class13.field235) {
                    class13.field235 = class102.field2474;
                }
                int var3 = (class13.field235 - class102.field2474) * 50 / class13.field235 + 50;
                class81.method687(false, -1024, class104.method853(-92, new class60[] { class19.field465, class60.field1488, class98.method774((byte) -121, var3), class15.field330 }));
            } else {
                class81.method687(false, arg0 - 1064, class19.field465);
            }
        } else if (class48.field1265 == 30) {
            class31.method239((byte) 89);
        } else if (class48.field1265 == 40) {
            class81.method687(false, arg0 - 1064, class104.method853(arg0 + -144, new class60[] { class89.field2211, class104.field2546, class125.field2880 }));
        }
        if (class48.field1265 == 30 && class64.field1604 == 0 && !class99.field2411) {
            try {
                Graphics var5 = class9.field148.getGraphics();
                for (int var6 = 0; var6 < class87.field2164; var6++) {
                    if (class47.field1237[var6]) {
                        class69.field1660.method59(class38.field903[var6], var5, class35.field885[var6], class19.field469[var6], class14.field281[var6], -57);
                        class47.field1237[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class9.field148.repaint();
            }
        } else if (class48.field1265 > 0) {
            try {
                Graphics var7 = class9.field148.getGraphics();
                class69.field1660.method63(0, 103, 0, var7);
                class99.field2411 = false;
                for (int var8 = 0; var8 < class87.field2164; var8++) {
                    class47.field1237[var8] = false;
                }
            } catch (Exception var10) {
                class9.field148.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method172(int arg0) {
        field511++;
        if (class53.field1339 != null) {
            class53.field1339.field1583 = false;
        }
        class53.field1339 = null;
        if (class4.field73 != null) {
            class4.field73.method729(false);
            class4.field73 = null;
        }
        class51.method386(arg0 ^ 0xFFFFFF84);
        class154.method1175(30467);
        if (arg0 != 0) {
            return;
        }
        class139.field3181 = null;
        if (class113.field2703 != null) {
            class113.field2703.method1181(-122);
        }
        if (class152.field3397 != null) {
            class152.field3397.method1181(-127);
        }
        class151.method1153(true);
        class107.method885(54);
        try {
            if (class67.field1640 != null) {
                class67.field1640.method220(125);
            }
            if (class5.field85 != null) {
                for (int var2 = 0; var2 < class5.field85.length; var2++) {
                    if (class5.field85[var2] != null) {
                        class5.field85[var2].method220(126);
                    }
                }
            }
            if (class64.field1587 != null) {
                class64.field1587.method220(127);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method173(byte arg0) {
        field514 = null;
        field501 = null;
        if (arg0 != -72) {
            field514 = null;
        }
        field509 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method174(int arg0) {
        field507++;
        if (class85.field2107 >= 4) {
            this.method1072(-63, "js5crc");
            class48.field1265 = 1000;
            return;
        }
        if (arg0 != 463) {
            this.method171(-41);
        }
        if (class121.field2764 >= 4) {
            if (class48.field1265 <= 5) {
                this.method1072(-127, "js5io");
                class48.field1265 = 1000;
                return;
            }
            class121.field2764 = 3;
            class66.field1636 = 3000;
        }
        if (class66.field1636-- > 0) {
            return;
        }
        try {
            if (class129.field2941 == 0) {
                class50.field1276 = class116.field2731.method196(class90.field2230, -114, class56.field1401);
                class129.field2941++;
            }
            if (class129.field2941 == 1) {
                if (class50.field1276.field3145 == 2) {
                    this.method175(-1, arg0 - 561);
                    return;
                }
                if (class50.field1276.field3145 == 1) {
                    class129.field2941++;
                }
            }
            if (class129.field2941 == 2) {
                class144.field3241 = new class90((Socket) class50.field1276.field3144, class116.field2731);
                class103 var2 = new class103(5);
                var2.method818(false, 15);
                var2.method819(463, (byte) -88);
                class144.field3241.method730(0, 0, var2.field2498, 5);
                class129.field2941++;
                class112.field2698 = class39.method307(8);
            }
            if (class129.field2941 == 3) {
                if (class48.field1265 <= 5 || class144.field3241.method735(0) > 0) {
                    int var3 = class144.field3241.method739(true);
                    if (var3 != 0) {
                        this.method175(var3, 22);
                        return;
                    }
                    class129.field2941++;
                } else if (class39.method307(8) - class112.field2698 > 30000L) {
                    this.method175(-2, -105);
                    return;
                }
            }
            if (class129.field2941 == 4) {
                class90.method731(class144.field3241, class48.field1265 > 20, true);
                class50.field1276 = null;
                class129.field2941 = 0;
                class144.field3241 = null;
                class64.field1600 = 0;
            }
        } catch (IOException var4) {
            this.method175(-3, arg0 ^ -428);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method175(int arg0, int arg1) {
        class144.field3241 = null;
        int var3 = -35 / ((arg1 + 37) / 36);
        class50.field1276 = null;
        class129.field2941 = 0;
        if (class90.field2230 == class60.field1442) {
            class90.field2230 = class125.field2881;
        } else {
            class90.field2230 = class60.field1442;
        }
        field504++;
        class64.field1600++;
        if (class64.field1600 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class48.field1265 <= 5) {
                this.method1072(-87, "js5connect_full");
                class48.field1265 = 1000;
            } else {
                class66.field1636 = 3000;
            }
        } else if (class64.field1600 >= 2 && arg0 == 6) {
            this.method1072(-123, "js5connect_outofdate");
            class48.field1265 = 1000;
        } else if (class64.field1600 >= 4) {
            if (class48.field1265 > 5) {
                class66.field1636 = 3000;
            } else {
                this.method1072(-99, "js5connect");
                class48.field1265 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method176(int arg0) {
        class60.field1442 = class34.field785 == arg0 ? 43594 : class17.field434 + 40000;
        if (class19.field470 == 1) {
            class152.field3401 = class10.field179;
            class89.field2208 = class129.field2951;
            class61.field1532 = class87.field2194;
            class59.field1424 = class55.field1372;
        } else {
            class89.field2208 = class87.field2170;
            class59.field1424 = class105.field2569;
            class61.field1532 = class153.field3427;
            class152.field3401 = class33.field763;
        }
        field512++;
        class125.field2881 = class34.field785 == 0 ? 443 : class17.field434 + 50000;
        class90.field2230 = class60.field1442;
        class38.method295(42);
        class102.method797(class9.field148, arg0 ^ 0x3B19);
        class31.method235(class9.field148, (byte) -64);
        class139.field3181 = class38.method301(-95);
        if (class139.field3181 != null) {
            class139.field3181.method696(class9.field148, (byte) 124);
        }
        class4.field62 = class26.field639;
        try {
            if (class116.field2731.field634 != null) {
                class67.field1640 = new class28(class116.field2731.field634, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class5.field85[var2] = new class28(class116.field2731.field623[var2], 6000, 0);
                }
                class64.field1587 = new class28(class116.field2731.field637, 6000, 0);
                class133.field3035 = new class59(255, class67.field1640, class64.field1587, 500000);
                class116.field2731.field637 = null;
                class116.field2731.field634 = null;
                class116.field2731.field623 = null;
            }
        } catch (IOException var3) {
            class64.field1587 = null;
            class67.field1640 = null;
            class133.field3035 = null;
        }
        if (class34.field785 != 0) {
            class34.field800 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field497++;
        if (!this.method1070(false)) {
            return;
        }
        class17.field434 = Integer.parseInt(this.getParameter("worldid"));
        class132.field3006 = Integer.parseInt(this.getParameter("modewhat"));
        class34.field785 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class121.method941((byte) -96);
        } else {
            class90.method738(120);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class31.field719 = true;
        } else {
            class31.field719 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class137.method1065(125);
            class94.field2311 = class38.field918;
            class145.field3273 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class19.field470 = 1;
        } else {
            class19.field470 = 0;
        }
        try {
            class18.field445 = Integer.parseInt(this.getParameter("js"));
            class101.field2468 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class56.field1401 = this.getCodeBase().getHost();
        this.method1068(class132.field3006 + 32, 765, 463, -31773, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method177(int arg0) {
        class82.field2065++;
        field499++;
        this.method170(arg0 - 2);
        class87.method723(2);
        class62.method485(true);
        if (arg0 != 1) {
            return;
        }
        class139.method1080((byte) 15);
        class120.method937(87);
        class101.method793(-13021);
        if (class139.field3181 != null) {
            int var2 = class139.field3181.method697(-125);
            class151.field3392 = var2;
        }
        if (class48.field1265 == 0) {
            class40.method309((byte) -105);
            class98.method778((byte) -116);
        } else if (class48.field1265 == 5) {
            class25.method193((byte) 11, this);
            class40.method309((byte) -115);
            class98.method778((byte) -121);
        } else if (class48.field1265 == 10) {
            class25.method193((byte) 11, this);
        } else if (class48.field1265 == 20) {
            class25.method193((byte) 11, this);
            class55.method398(23);
        } else if (class48.field1265 == 25) {
            class11.method75(-119);
        }
        if (class48.field1265 == 30) {
            class66.method503(34);
        } else if (class48.field1265 == 40) {
            class55.method398(66);
            return;
        }
    }
}

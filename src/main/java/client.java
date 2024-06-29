import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class76 {

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lpe;")
    public static class109 field522 = class141.method1120("AUS", 0);

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lpe;")
    private static class109 field530 = class141.method1120("glow3:", 0);

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Lpe;")
    public static class109 field521 = field530;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lpe;")
    public static class109 field533 = field530;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
    public static int[] field525;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "[Lpe;")
    public static class109[] field529;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method207(boolean arg0) {
        field520++;
        if (class146.field3195 == 1) {
            class156.field3588 = class85.field1817;
            class61.field1231 = class23.field543;
            class52.field1083 = class143.field3149;
            class128.field2839 = class101.field2114;
        } else {
            class128.field2839 = class55.field1128;
            class61.field1231 = class88.field1871;
            class52.field1083 = class115.field2568;
            class156.field3588 = class11.field253;
        }
        class72.field1458 = class83.field1774 == 0 ? 43594 : class19.field474 + 40000;
        class89.field1888 = class83.field1774 == 0 ? 443 : class19.field474 + 50000;
        class136.field2971 = class72.field1458;
        class76.method594(8900);
        class43.method392(128, class137.field2980);
        class11.method91((byte) -125, class137.field2980);
        class152.field3341 = class24.method229(-108);
        if (class152.field3341 != null) {
            class152.field3341.method808(class137.field2980, (byte) 49);
        }
        class42.field874 = class28.field646;
        try {
            if (class35.field755.field655 != null) {
                class61.field1253 = new class118(class35.field755.field655, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class91.field1950[var2] = new class118(class35.field755.field652[var2], 6000, 0);
                }
                class71.field1437 = new class118(class35.field755.field658, 6000, 0);
                class147.field3213 = new class38(255, class61.field1253, class71.field1437, 500000);
                class99.field2082 = new class118(class35.field755.field647, 24, 0);
                class35.field755.field652 = null;
                class35.field755.field655 = null;
                class35.field755.field658 = null;
                class35.field755.field647 = null;
            }
        } catch (IOException var3) {
            class147.field3213 = null;
            class99.field2082 = null;
            class61.field1253 = null;
            class71.field1437 = null;
        }
        if (class83.field1774 != 0) {
            class136.field2962 = true;
        }
        if (arg0) {
            field532 = -87;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method208(byte arg0) {
        method210(-44);
        field527++;
        class109.method890((byte) -6);
        class76.method595(-26929);
        class15.method174(false);
        class18.method186(-21515);
        class49.method422((byte) -54);
        class13.method117(-1911);
        class9.method84((byte) 51);
        class123.method997(false);
        class118.method967(112);
        class38.method368((byte) 56);
        class108.method868((byte) -121);
        class68.method528((byte) -125);
        class81.method698();
        class77.method614(-110);
        class154.method1191(1);
        class50.method425((byte) 104);
        class19.method189((byte) 115);
        class64.method507((byte) 87);
        class100.method807(false);
        class128.method1040(-500);
        class4.method31(3);
        class107.method864(true);
        class14.method169((byte) 23);
        class6.method56(-20101);
        class141.method1119(-30);
        class133.method1066(0);
        class113.method940((byte) 110);
        class79.method635(-1);
        class12.method102((byte) -54);
        class3.method20(64);
        class122.method987((byte) 61);
        class11.method94(16565);
        class155.method1217();
        class33.method352();
        class44.method407(-15974);
        class46.method412((byte) 122);
        class136.method1080(19895);
        class82.method706(0);
        class17.method182(-106);
        class42.method391(3);
        class84.method711(23649);
        class110.method912(119);
        class149.method1166(123);
        class114.method942(1);
        class99.method798((byte) -126);
        class37.method360();
        class146.method1144(0);
        class48.method419((byte) -125);
        class72.method581((byte) -126);
        class62.method494(205);
        class94.method780(true);
        class83.method708(-14215);
        class137.method1087(28584);
        class91.method760(-100);
        class61.method471(3546);
        class78.method625(-31671);
        class139.method1099(-19447);
        class116.method956((byte) -83);
        class144.method1136(2);
        class43.method394(119);
        class87.method726((byte) 126);
        class53.method433(false);
        class135.method1072(-6660);
        class152.method1177((byte) 90);
        class153.method1183(121);
        class25.method232(676596801);
        class7.method69((byte) -84);
        class140.method1117();
        class124.method1008(-2);
        class105.method856();
        class157.method1226(true);
        class80.method639();
        class119.method974(-25418);
        class127.method1030((byte) 64);
        class67.method520((byte) 53);
        class71.method569(255);
        class23.method222((byte) 109);
        class101.method818(10925);
        class148.method1159(-121);
        class112.method928(-122);
        class47.method414(-10354);
        class85.method715((byte) 111);
        class63.method498(21);
        class120.method981(-2);
        class55.method440((byte) 121);
        class138.method1093((byte) -35);
        class70.method547();
        class1.method8(-16713);
        class96.method790();
        class20.method202(-1);
        class104.method835((byte) 127);
        class88.method727(-15);
        class95.method781(20646);
        class145.method1142(-27104);
        class126.method1021((byte) 24);
        class156.method1223(-124);
        class52.method432((byte) -90);
        class16.method180(false);
        class93.method774(128);
        class86.method724(1);
        class151.method1172(255);
        class111.method916();
        class115.method950(true);
        class35.method358((byte) -127);
        class158.method1229(true);
        class131.method1057(false);
        class2.method15((byte) -5);
        class121.method984((byte) 117);
        class66.method512(11590);
        class92.method768(-36);
        class125.method1015(0);
        class75.method590(106);
        class8.method77(true);
        class27.method239(19156);
        class57.method448(0);
        class32.method329(120);
        class74.method588(-125);
        class89.method735((byte) -28);
        class65.method509();
        class31.method324();
        class41.method382(true);
        class90.method740();
        class60.method456(20709);
        class134.method1070(true);
        class39.method370();
        class24.method230(0);
        class102.method822(96);
        if (arg0 <= 90) {
            this.method211(-8);
        }
        class143.method1133((byte) 47);
        class103.method831();
        class129.method1048();
        class45.method410(66);
        class147.method1147((byte) -70);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method209(int arg0, int arg1) {
        class94.field2031 = 0;
        class15.field394 = null;
        if (class72.field1458 == class136.field2971) {
            class136.field2971 = class89.field1888;
        } else {
            class136.field2971 = class72.field1458;
        }
        field518++;
        int var3 = -43 / ((arg0 + 4) / 49);
        class152.field3347 = null;
        class131.field2881++;
        if (class131.field2881 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class153.field3373 <= 5) {
                this.method600("js5connect_full", 4);
                class153.field3373 = 1000;
            } else {
                class113.field2457 = 3000;
            }
        } else if (class131.field2881 >= 2 && arg1 == 6) {
            this.method600("js5connect_outofdate", 4);
            class153.field3373 = 1000;
        } else if (class131.field2881 >= 4) {
            if (class153.field3373 > 5) {
                class113.field2457 = 3000;
            } else {
                this.method600("js5connect", 4);
                class153.field3373 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field531++;
        if (!this.method603((byte) -64)) {
            return;
        }
        class19.field474 = Integer.parseInt(this.getParameter("worldid"));
        class25.field622 = Integer.parseInt(this.getParameter("modewhat"));
        class83.field1774 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class143.method1131(-112);
        } else {
            class61.method482(255);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class63.field1291 = true;
        } else {
            class63.field1291 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class27.method243(19781);
            class131.field2873 = class151.field3331;
            class89.field1887 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class146.field3195 = 1;
        } else {
            class146.field3195 = 0;
        }
        try {
            class99.field2071 = Integer.parseInt(this.getParameter("js"));
            class86.field1833 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class53.field1093 = this.getCodeBase().getHost();
        this.method597(765, (byte) -114, 466, class25.field622 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method210(int arg0) {
        field521 = null;
        field522 = null;
        field529 = null;
        field530 = null;
        field525 = null;
        if (arg0 >= -15) {
            field533 = null;
        }
        field533 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class55.method442(26451);
            }
            class19.field474 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class83.field1774 = 0;
            } else if (arg0[1].equals("office")) {
                class83.field1774 = 1;
            } else if (arg0[1].equals("local")) {
                class83.field1774 = 2;
            } else {
                class55.method442(26451);
            }
            if (arg0[2].equals("live")) {
                class25.field622 = 0;
            } else if (arg0[2].equals("rc")) {
                class25.field622 = 1;
            } else if (arg0[2].equals("wip")) {
                class25.field622 = 2;
            } else {
                class55.method442(26451);
            }
            if (arg0[3].equals("lowmem")) {
                class143.method1131(28);
            } else if (arg0[3].equals("highmem")) {
                class61.method482(255);
            } else {
                class55.method442(26451);
            }
            if (arg0[4].equals("free")) {
                class63.field1291 = false;
            } else if (arg0[4].equals("members")) {
                class63.field1291 = true;
            } else {
                class55.method442(26451);
            }
            if (arg0[5].equals("english")) {
                class89.field1887 = 0;
            } else if (arg0[5].equals("german")) {
                class27.method243(19781);
                class131.field2873 = class151.field3331;
                class89.field1887 = 1;
            } else {
                class55.method442(26451);
            }
            if (arg0[6].equals("game0")) {
                class146.field3195 = 0;
            } else if (arg0[6].equals("game1")) {
                class146.field3195 = 1;
            } else {
                class55.method442(26451);
            }
            class53.field1093 = "127.0.0.1";
            client var1 = new client();
            var1.method601(466, "runescape", (byte) 124, 765, class25.field622 + 32, 503, 16);
        } catch (Exception var3) {
            class112.method921(null, false, var3);
        }
        field534++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method211(int arg0) {
        field526++;
        if (~class153.field3373 != arg0) {
            boolean var2 = class16.method181(arg0 ^ 0x4B1A);
            if (!var2) {
                this.method214((byte) -51);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method212(boolean arg0) {
        if (arg0) {
            field519 = 20;
        }
        field528++;
        boolean var2 = class24.method227((byte) 107);
        if (var2 && class120.field2664 && class49.field1013 != null) {
            class49.field1013.method46(1);
        }
        if (class116.field2582) {
            class61.method461(class137.field2980, (byte) -19);
            class127.method1031(126, class137.field2980);
            if (class152.field3341 != null) {
                class152.field3341.method801((byte) 48, class137.field2980);
            }
            this.method599((byte) 92);
            class43.method392(128, class137.field2980);
            class11.method91((byte) -125, class137.field2980);
            if (class152.field3341 != null) {
                class152.field3341.method808(class137.field2980, (byte) 102);
            }
        }
        if (class153.field3373 == 0) {
            class19.method197(null, class72.field1460, 300, class11.field248);
        } else if (class153.field3373 == 5) {
            class115.method949(class2.field46, !arg0, class127.field2833);
        } else if (class153.field3373 == 10) {
            class115.method949(class2.field46, !arg0, class127.field2833);
        } else if (class153.field3373 == 20) {
            class115.method949(class2.field46, true, class127.field2833);
        } else if (class153.field3373 == 25) {
            if (class136.field2958 == 1) {
                if (class91.field1967 > class55.field1125) {
                    class55.field1125 = class91.field1967;
                }
                int var4 = (class55.field1125 - class91.field1967) * 50 / class55.field1125;
                class23.method216(class44.method405(new class109[] { class46.field967, class61.field1255, class143.method1132(var4, 97), class139.field3044 }, (byte) -74), false, (byte) -35);
            } else if (class136.field2958 == 2) {
                if (class148.field3238 < class122.field2690) {
                    class148.field3238 = class122.field2690;
                }
                int var3 = (class148.field3238 - class122.field2690) * 50 / class148.field3238 + 50;
                class23.method216(class44.method405(new class109[] { class46.field967, class61.field1255, class143.method1132(var3, 117), class139.field3044 }, (byte) -74), false, (byte) -35);
            } else {
                class23.method216(class46.field967, false, (byte) -35);
            }
        } else if (class153.field3373 == 30) {
            class128.method1038(106);
        } else if (class153.field3373 == 40) {
            class23.method216(class44.method405(new class109[] { class13.field335, class7.field173, class50.field1038 }, (byte) -74), false, (byte) -35);
        }
        if (class153.field3373 == 30 && class23.field562 == 0 && !class53.field1088) {
            try {
                Graphics var5 = class137.field2980.getGraphics();
                for (int var6 = 0; var6 < class19.field490; var6++) {
                    if (class11.field249[var6]) {
                        class75.field1510.method78(class61.field1207[var6], class114.field2520[var6], var5, class137.field2981[var6], -1, class50.field1045[var6]);
                        class11.field249[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class137.field2980.repaint();
            }
        } else if (class153.field3373 > 0) {
            try {
                Graphics var7 = class137.field2980.getGraphics();
                class75.field1510.method73(var7, 106, 0, 0);
                class53.field1088 = false;
                for (int var8 = 0; var8 < class19.field490; var8++) {
                    class11.field249[var8] = false;
                }
            } catch (Exception var10) {
                class137.field2980.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method213(byte arg0) {
        if (class19.field477 != null) {
            class19.field477.field1004 = false;
        }
        field535++;
        class19.field477 = null;
        int var2 = 118 / ((17 - arg0) / 45);
        if (class153.field3363 != null) {
            class153.field3363.method83((byte) -114);
            class153.field3363 = null;
        }
        class143.method1130((byte) -25);
        class108.method869(10494);
        class152.field3341 = null;
        if (class49.field1013 != null) {
            class49.field1013.method37(-21);
        }
        if (class147.field3210 != null) {
            class147.field3210.method37(-31);
        }
        class93.method777(0);
        class4.method26(1);
        try {
            if (class61.field1253 != null) {
                class61.field1253.method960((byte) 9);
            }
            if (class91.field1950 != null) {
                for (int var3 = 0; var3 < class91.field1950.length; var3++) {
                    if (class91.field1950[var3] != null) {
                        class91.field1950[var3].method960((byte) 9);
                    }
                }
            }
            if (class71.field1437 != null) {
                class71.field1437.method960((byte) 9);
            }
            if (class99.field2082 != null) {
                class99.field2082.method960((byte) 9);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method214(byte arg0) {
        field523++;
        if (class109.field2291 >= 4) {
            this.method600("js5crc", 4);
            class153.field3373 = 1000;
            return;
        }
        if (class92.field1992 >= 4) {
            if (class153.field3373 <= 5) {
                this.method600("js5io", 4);
                class153.field3373 = 1000;
                return;
            }
            class92.field1992 = 3;
            class113.field2457 = 3000;
        }
        if (class113.field2457-- > 0) {
            return;
        }
        try {
            if (class94.field2031 == 0) {
                class15.field394 = class35.field755.method249(class136.field2971, (byte) 66, class53.field1093);
                class94.field2031++;
            }
            if (class94.field2031 == 1) {
                if (class15.field394.field513 == 2) {
                    this.method209(92, -1);
                    return;
                }
                if (class15.field394.field513 == 1) {
                    class94.field2031++;
                }
            }
            if (class94.field2031 == 2) {
                class152.field3347 = new class9((Socket) class15.field394.field514, class35.field755);
                class13 var2 = new class13(5);
                var2.method135(15, (byte) -50);
                var2.method123(466, 1375221240);
                class152.field3347.method87(-81, var2.field279, 5, 0);
                class94.field2031++;
                class11.field250 = class94.method779(114);
            }
            if (class94.field2031 == 3) {
                if (class153.field3373 <= 5 || class152.field3347.method81((byte) -102) > 0) {
                    int var3 = class152.field3347.method86(-52);
                    if (var3 != 0) {
                        this.method209(61, var3);
                        return;
                    }
                    class94.field2031++;
                } else if (class94.method779(114) - class11.field250 > 30000L) {
                    this.method209(-122, -2);
                    return;
                }
            }
            if (arg0 >= -21) {
                field522 = null;
            }
            if (class94.field2031 == 4) {
                class7.method67(100, class153.field3373 > 20, class152.field3347);
                class152.field3347 = null;
                class131.field2881 = 0;
                class15.field394 = null;
                class94.field2031 = 0;
            }
        } catch (IOException var4) {
            this.method209(47, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method215(byte arg0) {
        field524++;
        class12.field264++;
        this.method211(-1001);
        class61.method473((byte) -104);
        class86.method721((byte) -121);
        class147.method1148(false);
        int var2 = -40 / ((-arg0 - 69) / 49);
        class61.method488(-20624);
        class44.method398(0);
        if (class152.field3341 != null) {
            int var3 = class152.field3341.method805(1);
            class154.field3519 = var3;
        }
        if (class153.field3373 == 0) {
            class1.method3(22779);
            class7.method70(116);
        } else if (class153.field3373 == 5) {
            class88.method730(-2, this);
            class1.method3(22779);
            class7.method70(-4);
        } else if (class153.field3373 == 10) {
            class88.method730(-2, this);
        } else if (class153.field3373 == 20) {
            class88.method730(-2, this);
            class66.method515(0);
        } else if (class153.field3373 == 25) {
            class25.method233(118);
        }
        if (class153.field3373 == 30) {
            class123.method996((byte) 31);
        } else if (class153.field3373 == 40) {
            class66.method515(0);
        }
    }
}

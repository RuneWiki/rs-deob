import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class29 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lr;")
    public static class118 field521 = class153.method1136(102, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lr;")
    public static class118 field520 = class153.method1136(121, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljf;")
    public static class68 field518;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field525++;
        if (!this.method244((byte) -70)) {
            return;
        }
        class74.field1836 = Integer.parseInt(this.getParameter("worldid"));
        class78.field1891 = Integer.parseInt(this.getParameter("modewhat"));
        class33.field842 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class69.method592((byte) -19);
        } else {
            class32.method268(-6836);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class61.field1410 = true;
        } else {
            class61.field1410 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class113.method880(17071);
            class110.field2547 = class87.field2111;
            class15.field390 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class125.field2869 = 1;
        } else {
            class125.field2869 = 0;
        }
        try {
            class19.field472 = Integer.parseInt(this.getParameter("js"));
            class103.field2369 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class33.field839 = this.getCodeBase().getHost();
        this.method248(471, class78.field1891 + 32, 503, (byte) -71, 765);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method194(int arg0) {
        class65.field1479++;
        int var2 = -128 % ((arg0 + 28) / 48);
        field526++;
        if (class65.field1479 % 1000 == 1) {
            GregorianCalendar var3 = new GregorianCalendar();
            class108.field2527 = var3.get(11) * 600 + var3.get(12) * 10 + var3.get(13) / 6;
            class105.field2438.setSeed((long) class108.field2527);
        }
        this.method200((byte) 101);
        class35.method287((byte) -43);
        class122.method957(-121);
        class54.method490(262144);
        class59.method527((byte) 98);
        class20.method185((byte) 97);
        if (class126.field2871 != null) {
            int var4 = class126.field2871.method31((byte) 127);
            class101.field2315 = var4;
        }
        if (class26.field631 == 0) {
            class44.method367(66);
            class134.method1025(true);
        } else if (class26.field631 == 5) {
            class87.method706(this, -75);
            class44.method367(-40);
            class134.method1025(true);
        } else if (class26.field631 == 10) {
            class87.method706(this, -75);
        } else if (class26.field631 == 20) {
            class87.method706(this, -75);
            class56.method502(-3);
        } else if (class26.field631 == 25) {
            class59.method525(108);
        }
        if (class26.field631 == 30) {
            class77.method654(51);
        } else if (class26.field631 == 40) {
            class56.method502(-3);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field516++;
        try {
            if (arg0.length != 7) {
                class35.method286(64);
            }
            class74.field1836 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class33.field842 = 0;
            } else if (arg0[1].equals("office")) {
                class33.field842 = 1;
            } else if (arg0[1].equals("local")) {
                class33.field842 = 2;
            } else {
                class35.method286(64);
            }
            if (arg0[2].equals("live")) {
                class78.field1891 = 0;
            } else if (arg0[2].equals("rc")) {
                class78.field1891 = 1;
            } else if (arg0[2].equals("wip")) {
                class78.field1891 = 2;
            } else {
                class35.method286(64);
            }
            if (arg0[3].equals("lowmem")) {
                class69.method592((byte) -19);
            } else if (arg0[3].equals("highmem")) {
                class32.method268(-6836);
            } else {
                class35.method286(64);
            }
            if (arg0[4].equals("free")) {
                class61.field1410 = false;
            } else if (arg0[4].equals("members")) {
                class61.field1410 = true;
            } else {
                class35.method286(64);
            }
            if (arg0[5].equals("english")) {
                class15.field390 = 0;
            } else if (arg0[5].equals("german")) {
                class113.method880(17071);
                class110.field2547 = class87.field2111;
                class15.field390 = 1;
            } else {
                class35.method286(64);
            }
            if (arg0[6].equals("game0")) {
                class125.field2869 = 0;
            } else if (arg0[6].equals("game1")) {
                class125.field2869 = 1;
            } else {
                class35.method286(64);
            }
            class33.field839 = "127.0.0.1";
            client var1 = new client();
            var1.method246(class78.field1891 + 32, "runescape", 16, 503, 765, 62, 471);
        } catch (Exception var3) {
            class23.method212(null, (byte) 87, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method195(int arg0) {
        field517++;
        boolean var2 = class20.method187(true);
        if (arg0 != 2) {
            this.method198(true);
        }
        if (var2 && class85.field2059 && class47.field1134 != null) {
            class47.field1134.method381(-13834);
        }
        if (class133.field3042) {
            class105.method791(-65, class4.field70);
            class99.method767(class4.field70, arg0 - 3);
            if (class126.field2871 != null) {
                class126.field2871.method29(class4.field70, (byte) -68);
            }
            this.method249(true);
            class89.method716(class4.field70, -95);
            class41.method332((byte) 119, class4.field70);
            if (class126.field2871 != null) {
                class126.field2871.method30(4, class4.field70);
            }
        }
        if (class26.field631 == 0) {
            class67.method576(null, class36.field917, -28994, class132.field3028);
        } else if (class26.field631 == 5) {
            class121.method949(class115.field2699, 117, class70.field1640);
        } else if (class26.field631 == 10) {
            class121.method949(class115.field2699, 125, class70.field1640);
        } else if (class26.field631 == 20) {
            class121.method949(class115.field2699, 122, class70.field1640);
        } else if (class26.field631 == 25) {
            if (class148.field3303 == 1) {
                if (class157.field3616 < class47.field1144) {
                    class157.field3616 = class47.field1144;
                }
                int var4 = (class157.field3616 - class47.field1144) * 50 / class157.field3616;
                class35.method292(class144.method1066(true, new class118[] { class20.field481, class48.field1161, class43.method359(var4, (byte) -122), class78.field1910 }), false, (byte) -92);
            } else if (class148.field3303 == 2) {
                if (class113.field2649 > class136.field3079) {
                    class136.field3079 = class113.field2649;
                }
                int var3 = (class136.field3079 - class113.field2649) * 50 / class136.field3079 + 50;
                class35.method292(class144.method1066(true, new class118[] { class20.field481, class48.field1161, class43.method359(var3, (byte) -122), class78.field1910 }), false, (byte) -92);
            } else {
                class35.method292(class20.field481, false, (byte) -92);
            }
        } else if (class26.field631 == 30) {
            class112.method875(-29322);
        } else if (class26.field631 == 40) {
            class35.method292(class144.method1066(true, new class118[] { class14.field331, class44.field1057, class101.field2325 }), false, (byte) -92);
        }
        if (class26.field631 == 30 && class73.field1687 == 0 && !class65.field1491) {
            try {
                Graphics var7 = class4.field70.getGraphics();
                for (int var8 = 0; var8 < class153.field3481; var8++) {
                    if (class67.field1555[var8]) {
                        class13.field291.method528(class63.field1447[var8], class44.field1059[var8], class89.field2144[var8], class91.field2183[var8], (byte) 69, var7);
                        class67.field1555[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class4.field70.repaint();
            }
        } else if (class26.field631 > 0) {
            try {
                Graphics var5 = class4.field70.getGraphics();
                class13.field291.method529(0, var5, 0, -9680);
                class65.field1491 = false;
                for (int var6 = 0; var6 < class153.field3481; var6++) {
                    class67.field1555[var6] = false;
                }
            } catch (Exception var10) {
                class4.field70.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static final void method196(int arg0) {
        field519++;
        if (!class35.field884) {
            return;
        }
        class74 var1 = class113.method887(class66.field1510, (byte) 1, class19.field465);
        if (var1 != null && var1.field1777 != null) {
            class136 var2 = new class136();
            var2.field3077 = var1;
            var2.field3067 = var1.field1777;
            class83.method681(var2, (byte) -97);
        }
        class35.field884 = false;
        if (arg0 != 5) {
            field518 = null;
        }
        class26.method232((byte) 87, var1);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method197(int arg0) {
        field520 = null;
        int var1 = 118 % ((-arg0 - 57) / 52);
        field518 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method198(boolean arg0) {
        field530++;
        if (class9.field181 >= 4) {
            this.method243(false, "js5crc");
            class26.field631 = 1000;
            return;
        }
        if (class9.field205 >= 4) {
            if (class26.field631 <= 5) {
                this.method243(!arg0, "js5io");
                class26.field631 = 1000;
                return;
            }
            class159.field3656 = 3000;
            class9.field205 = 3;
        }
        if (class159.field3656-- > 0) {
            return;
        }
        try {
            if (class37.field928 == 0) {
                class2.field44 = class95.field2247.method1127(class33.field839, (byte) -22, class87.field2105);
                class37.field928++;
            }
            if (class37.field928 == 1) {
                if (class2.field44.field268 == 2) {
                    this.method201(-1, (byte) -67);
                    return;
                }
                if (class2.field44.field268 == 1) {
                    class37.field928++;
                }
            }
            if (class37.field928 == 2) {
                class67.field1562 = new class48((Socket) class2.field44.field269, class95.field2247);
                class105 var2 = new class105(5);
                var2.method800(93, 15);
                var2.method811(471, 2073135696);
                class67.field1562.method409((byte) -111, var2.field2405, 0, 5);
                class37.field928++;
                class67.field1551 = class120.method945(20794);
            }
            if (!arg0) {
                this.method202((byte) 36);
            }
            if (class37.field928 == 3) {
                if (class26.field631 <= 5 || class67.field1562.method406(-65) > 0) {
                    int var3 = class67.field1562.method400(114);
                    if (var3 != 0) {
                        this.method201(var3, (byte) -59);
                        return;
                    }
                    class37.field928++;
                } else if (class120.method945(20794) - class67.field1551 > 30000L) {
                    this.method201(-2, (byte) -80);
                    return;
                }
            }
            if (class37.field928 == 4) {
                class79.method668(class26.field631 > 20, (byte) 52, class67.field1562);
                class67.field1562 = null;
                class85.field2058 = 0;
                class37.field928 = 0;
                class2.field44 = null;
            }
        } catch (IOException var4) {
            this.method201(-3, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method199(byte arg0) {
        if (class53.field1264 != null) {
            class53.field1264.field548 = false;
        }
        class53.field1264 = null;
        field527++;
        if (class127.field2915 != null) {
            class127.field2915.method408((byte) 114);
            class127.field2915 = null;
        }
        class70.method599((byte) -110);
        class121.method954(15);
        class126.field2871 = null;
        int var2 = -62 / ((-arg0 - 17) / 51);
        if (class47.field1134 != null) {
            class47.field1134.method377(121);
        }
        if (class127.field2902 != null) {
            class127.field2902.method377(108);
        }
        class61.method549(123);
        class125.method971(103);
        try {
            if (class127.field2919 != null) {
                class127.field2919.method74(-120);
            }
            if (class148.field3311 != null) {
                for (int var3 = 0; var3 < class148.field3311.length; var3++) {
                    if (class148.field3311[var3] != null) {
                        class148.field3311[var3].method74(-107);
                    }
                }
            }
            if (class157.field3626 != null) {
                class157.field3626.method74(-111);
            }
            if (class91.field2187 != null) {
                class91.field2187.method74(14);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method200(byte arg0) {
        field528++;
        if (class26.field631 == 1000) {
            return;
        }
        boolean var2 = class146.method1077((byte) -125);
        if (arg0 <= 48) {
            this.method198(false);
        }
        if (!var2) {
            this.method198(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method201(int arg0, byte arg1) {
        class85.field2058++;
        class67.field1562 = null;
        if (class87.field2105 == class126.field2897) {
            class87.field2105 = class151.field3420;
        } else {
            class87.field2105 = class126.field2897;
        }
        field522++;
        class37.field928 = 0;
        class2.field44 = null;
        int var3 = -64 % ((14 - arg1) / 54);
        if (class85.field2058 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class26.field631 > 5) {
                class159.field3656 = 3000;
            } else {
                this.method243(false, "js5connect_full");
                class26.field631 = 1000;
            }
        } else if (class85.field2058 >= 2 && arg0 == 6) {
            this.method243(false, "js5connect_outofdate");
            class26.field631 = 1000;
        } else if (class85.field2058 >= 4) {
            if (class26.field631 <= 5) {
                this.method243(false, "js5connect");
                class26.field631 = 1000;
            } else {
                class159.field3656 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method202(byte arg0) {
        class151.field3420 = class33.field842 == 0 ? 443 : class74.field1836 + 50000;
        if (class125.field2869 == 1) {
            class37.field925 = class64.field1473;
            class20.field491 = class103.field2377;
            class137.field3096 = class32.field818;
            class120.field2780 = class148.field3281;
        } else {
            class120.field2780 = class1.field32;
            class20.field491 = class64.field1470;
            class137.field3096 = class4.field80;
            class37.field925 = class108.field2509;
        }
        class126.field2897 = class33.field842 == 0 ? 43594 : class74.field1836 + 40000;
        class87.field2105 = class126.field2897;
        field531++;
        class20.method184(arg0 ^ 0x62);
        class89.method716(class4.field70, arg0 ^ 0x71);
        class41.method332((byte) 119, class4.field70);
        class126.field2871 = class134.method1028(arg0 ^ 0x4D);
        if (class126.field2871 != null) {
            class126.field2871.method30(4, class4.field70);
        }
        if (arg0 != -17) {
            field521 = null;
        }
        class72.field1665 = class152.field3436;
        try {
            if (class95.field2247.field3425 != null) {
                class127.field2919 = new class9(class95.field2247.field3425, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class148.field3311[var2] = new class9(class95.field2247.field3422[var2], 6000, 0);
                }
                class157.field3626 = new class9(class95.field2247.field3434, 6000, 0);
                class62.field1443 = new class65(255, class127.field2919, class157.field3626, 500000);
                class91.field2187 = new class9(class95.field2247.field3437, 24, 0);
                class95.field2247.field3422 = null;
                class95.field2247.field3425 = null;
                class95.field2247.field3434 = null;
                class95.field2247.field3437 = null;
            }
        } catch (IOException var3) {
            class157.field3626 = null;
            class91.field2187 = null;
            class62.field1443 = null;
            class127.field2919 = null;
        }
        if (class33.field842 != 0) {
            class120.field2786 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method203(byte arg0) {
        field523++;
        method197(-119);
        class118.method937(false);
        class29.method247((byte) 37);
        class79.method667((byte) 54);
        class71.method605((byte) 94);
        class23.method210((byte) -122);
        class105.method835(1);
        class48.method404(21958);
        class68.method585(-6);
        class9.method76(0);
        class65.method565(124);
        class83.method680((byte) -33);
        class91.method730(-1);
        class154.method1170();
        class128.method999((byte) -90);
        class74.method622(97);
        class132.method1018((byte) -119);
        class113.method891(48);
        class35.method291(685067815);
        class127.method984(850814254);
        class81.method673(97);
        class45.method380(2);
        class11.method88((byte) 59);
        class61.method548(true);
        class153.method1141(-107);
        class30.method254(false);
        class13.method91(-1);
        class110.method869((byte) 78);
        if (arg0 < 82) {
            this.method195(37);
        }
        class87.method707(85);
        class99.method769((byte) -74);
        class27.method236(2);
        class66.method573(-126);
        class47.method398(-85);
        class155.method1209();
        class17.method163();
        class134.method1027(916);
        class62.method557(-107);
        class114.method895((byte) -125);
        class112.method876(106);
        class137.method1037(36);
        class115.method899(0);
        class89.method712(0);
        class108.method858((byte) 78);
        class80.method672(-118);
        class64.method563(125);
        class43.method361((byte) 101);
        class7.method32();
        class73.method614(112);
        class19.method177(-124);
        class75.method633(false);
        class56.method498(-26550);
        class120.method944(-1);
        class94.method743(-101);
        class37.method306(false);
        class42.method349(-1);
        class14.method97(false);
        class125.method968(64);
        class82.method677(0);
        class1.method4((byte) 36);
        class32.method269(-29357);
        class139.method1041((byte) 120);
        class41.method331((byte) -119);
        class22.method206(-71);
        class159.method1234(0);
        class31.method267(false);
        class2.method9((byte) -103);
        class149.method1092(18);
        class138.method1038(-25798);
        class52.method469();
        class124.method965(102);
        class58.method523();
        class101.method775(0);
        class38.method318();
        class54.method487((byte) -100);
        class70.method598(83);
        class33.method279(false);
        class60.method539((byte) 113);
        class36.method300(-99);
        class126.method976(0);
        class148.method1084((byte) 74);
        class85.method700((byte) 45);
        class72.method610(64);
        class51.method457(-54);
        class46.method383(71);
        class130.method1007((byte) -109);
        class20.method180(true);
        class69.method590(-46);
        class8.method46();
        class77.method646((byte) 115);
        class21.method191();
        class53.method480(-115);
        class26.method231((byte) -124);
        class140.method1046(81);
        class55.method497(2047);
        class97.method758(-95);
        class10.method78(116);
        class144.method1068((byte) -118);
        class133.method1023(-128);
        class95.method746((byte) -128);
        class136.method1032(67);
        class44.method368(32);
        class39.method327(-86);
        class107.method853();
        class24.method216(106);
        class88.method711((byte) 126);
        class15.method136(false);
        class157.method1225((byte) 27);
        class84.method687(120);
        class146.method1076(0);
        class121.method955(-113);
        class100.method774((byte) 99);
        class141.method1051((byte) -32);
        class78.method664((byte) -109);
        class59.method524((byte) 41);
        class4.method15((byte) 34);
        class122.method958(-8);
        class151.method1122(0);
        class63.method558(false);
        class131.method1015((byte) -15);
        class93.method742();
        class143.method1059();
        class142.method1054(false);
        class3.method11();
        class158.method1231((byte) -127);
        class34.method281((byte) 103);
        class76.method640();
        class67.method577((byte) -108);
        class25.method225(32);
        class92.method738(0);
        class5.method23();
        class16.method141();
        class106.method848(7);
        class103.method787(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lr;I)Z")
    public static final boolean method204(class118 arg0, int arg1) {
        field529++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -28 % ((60 - arg1) / 40);
        for (int var3 = 0; var3 < class134.field3055; var3++) {
            if (arg0.method911(class122.field2824[var3], 14934)) {
                return true;
            }
        }
        return false;
    }
}

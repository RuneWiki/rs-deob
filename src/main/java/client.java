import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class109 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lae;")
    private static class6 field458 = class64.method474(110, "Loaded gamescreen");

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lae;")
    private static class6 field459 = class64.method474(106, "level)2");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lae;")
    private static class6 field470 = class64.method474(107, "Loading config )2 ");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lae;")
    private static class6 field471 = class64.method474(105, "No reply from loginserver)3");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    public static int[] field464 = new int[100];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
    public static int[] field477 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lae;")
    public static class6 field472 = null;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field475 = new int[] { 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 6, -1, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 8, 6, 0, 0, -1, 0, 7, 0, 5, 2, 0, 3, 0, 0, 1, 6, 0, 3, 3, 0, 0, 7, 6, 6, 2, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 5, 6, 6, 0, 0, 0, 6, 0, 2, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 14, -1, 0, 0, 2, 0, 0, 0, 10, 0, 0, 2, 0, 0, 0, 0, 0, 4, 10, 1, 2, 0, 0, 0, 0, 4, 5, 4, -1, 0, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 2, 0, 5, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, 1, 6, -2, 0, 2, 0, 8, 0, 5, 0, 1, 0, -2, 0, 0, 6, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lae;")
    public static class6 field469 = field459;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lae;")
    public static class6 field479 = field470;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lae;")
    public static class6 field457 = field471;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lae;")
    public static class6 field483 = field458;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "J")
    public static long field456;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "J")
    public static long field482;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lsd;")
    public static class114 field462;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 20)
    public static void method195(int arg0) {
        field470 = null;
        field483 = null;
        if (arg0 != 111) {
            return;
        }
        field457 = null;
        field479 = null;
        field471 = null;
        field459 = null;
        field469 = null;
        field477 = null;
        field464 = null;
        field472 = null;
        field462 = null;
        field458 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 43)
    private final void method196(byte arg0, int arg1) {
        if (class42.field964 == class30.field720) {
            class30.field720 = class116.field2755;
        } else {
            class30.field720 = class42.field964;
        }
        class107.field2538 = 0;
        class41.field928++;
        class138.field3363 = null;
        if (arg0 > -81) {
            method197(49, 31, (byte) 33, null);
        }
        class27.field676 = null;
        field481++;
        if (class41.field928 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class59.field1295 > 5) {
                class130.field3163 = 3000;
            } else {
                this.method919((byte) 25, "js5connect_full");
                class59.field1295 = 1000;
            }
        } else if (class41.field928 >= 2 && arg1 == 6) {
            this.method919((byte) 25, "js5connect_outofdate");
            class59.field1295 = 1000;
        } else if (class41.field928 >= 4) {
            if (class59.field1295 > 5) {
                class130.field3163 = 3000;
            } else {
                this.method919((byte) 25, "js5connect");
                class59.field1295 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLbf;)Z", line = 130)
    public static final boolean method197(int arg0, int arg1, byte arg2, class14 arg3) {
        byte[] var4 = arg3.method160(arg2 + 30576, arg0, arg1);
        if (arg2 != 29) {
            field472 = null;
        }
        field476++;
        if (var4 == null) {
            return false;
        } else {
            class78.method671(arg2 - 149, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 159)
    public final void method198(boolean arg0) {
        field478++;
        if (class78.field1877) {
            class118.method968((byte) 52, class70.field1564);
            class104.method878(-15828, class70.field1564);
            if (class79.field1922 != null) {
                class79.field1922.method441(99, class70.field1564);
            }
            this.method926(64);
            class19.method181((byte) -70, class70.field1564);
            class32.method291(class70.field1564, 13331);
            if (class79.field1922 != null) {
                class79.field1922.method446(class70.field1564, (byte) 114);
            }
        }
        if (!arg0) {
            return;
        }
        if (class59.field1295 == 0) {
            class60.method449(null, 28366, class102.field2416, class78.field1899);
        } else if (class59.field1295 == 5) {
            class90.method756(class2.field15, -27620, class56.field1229);
        } else if (class59.field1295 == 10) {
            class90.method756(class2.field15, -27620, class56.field1229);
        } else if (class59.field1295 == 20) {
            class90.method756(class2.field15, -27620, class56.field1229);
        } else if (class59.field1295 == 25) {
            if (class4.field39 == 1) {
                if (class133.field3250 < class63.field1387) {
                    class133.field3250 = class63.field1387;
                }
                int var3 = (class133.field3250 - class63.field1387) * 50 / class133.field3250;
                class43.method359(true, class15.field319, class85.method731(new class6[] { class76.field1802, class114.method942((byte) 71, var3), class77.field1827 }, 14569), -122);
            } else if (class4.field39 == 2) {
                if (class85.field2061 < class25.field634) {
                    class85.field2061 = class25.field634;
                }
                int var2 = (class85.field2061 - class25.field634) * 50 / class85.field2061 + 50;
                class43.method359(true, class15.field319, class85.method731(new class6[] { class76.field1802, class114.method942((byte) 71, var2), class77.field1827 }, 14569), 75);
            } else {
                class43.method359(false, class15.field319, null, -109);
            }
        } else if (class59.field1295 == 30) {
            class77.method659(0);
        } else if (class59.field1295 == 35) {
            class87.method738((byte) -127);
        } else if (class59.field1295 == 40) {
            class43.method359(false, class105.field2499, class123.field3021, -94);
        }
        class58.field1250 = 0;
        class108.field2591 = 0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 245)
    public final void method199(int arg0) {
        field480++;
        method195(111);
        class6.method35((byte) 97);
        class109.method920((byte) -60);
        class89.method749(-84);
        class114.method943(-90);
        class59.method439(3);
        class77.method618((byte) -124);
        class21.method205(-1);
        class129.method1046((byte) 105);
        class26.method240(-1);
        class8.method83(true);
        class2.method8(124);
        class111.method935(false);
        class9.method102();
        class71.method567();
        class47.method380(17448960);
        class66.method485(false);
        class95.method797((byte) 92);
        class121.method991((byte) -58);
        class60.method443(arg0 - 502);
        class79.method679(arg0 ^ 0xFFFFFE08);
        class82.method699(0);
        class76.method606(-29);
        class103.method876(28549);
        class100.method838((byte) 102);
        class30.method274(-126);
        class68.method494(false);
        class117.method961(false);
        class20.method194(-31054);
        class12.method131(92);
        class85.method727((byte) -58);
        class131.method1070();
        class104.method879((byte) 112);
        class25.method229((byte) 78);
        class135.method1104(15);
        class139.method1123(arg0 - 498);
        class18.method179(arg0 ^ 0xFFFFFE50);
        class43.method354(127);
        class42.method353(-3157);
        class62.method457((byte) -45);
        class81.method694(false);
        class93.method777(2);
        class56.method424(239);
        class23.method226();
        class61.method453(-13461);
        class73.method576(-6088);
        class5.method24(0);
        class72.method573(arg0 ^ arg0);
        class14.method145(29320);
        class138.method1114(41);
        class70.method516(106);
        class19.method185(arg0 ^ 0xFFFFFE77);
        class130.method1050(114);
        class27.method246((byte) 114);
        class67.method487(103);
        class105.method891((byte) -52);
        class34.method307(-54);
        class133.method1091((byte) 126);
        class29.method253();
        class74.method581();
        class15.method165(118);
        class37.method326(arg0 - 504);
        class123.method1013(arg0 ^ 0x1F7);
        class102.method874(102);
        class64.method468(arg0 ^ 0xFFFF9CD7);
        class51.method406(false);
        class107.method905(65535);
        class22.method221(-30765);
        class90.method758(18051);
        class134.method1100(true);
        class63.method466((byte) -81);
        class118.method971(0);
        class108.method910((byte) 126);
        class83.method714();
        class69.method509(true);
        class54.method418(0);
        class88.method744(false);
        class57.method429(28375);
        class136.method1107((byte) -79);
        class96.method800(false);
        class32.method295(24311);
        class24.method228((byte) 117);
        class119.method973();
        class91.method761((byte) -121);
        class41.method344(-30);
        class126.method1025((byte) 121);
        class16.method168(83);
        class38.method334(false);
        class49.method391((byte) -6);
        class46.method370(68);
        class52.method414(-95);
        class7.method71((byte) 121);
        class80.method689(296);
        class58.method434(false);
        class92.method773(true);
        class137.method1110((byte) -127);
        class115.method948();
        class40.method340(arg0 ^ 0xFFFFE040);
        class98.method830();
        class125.method1022(15003);
        class33.method302();
        class116.method951(83);
        class87.method739(false);
        class122.method1009(-43);
        class65.method480(-57);
        class86.method735();
        class36.method324();
        class4.method18(29053);
        class78.method673((byte) -87);
        class50.method399(1000);
        class35.method317(-109);
        class11.method115();
        class75.method594(arg0 ^ 0xB6C96E1F);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 365)
    public final void method200(int arg0) {
        if (class12.field250 != null) {
            class12.field250.field1284 = false;
        }
        class12.field250 = null;
        field463++;
        if (class67.field1491 != null) {
            class67.field1491.method207(arg0 ^ 0xFFFFE730);
            class67.field1491 = null;
        }
        class7.method72((byte) -88);
        class69.method507(arg0 - 1886);
        class79.field1922 = null;
        class70.method515(-119);
        class70.method517(0);
        class2.method11((byte) -127);
        class76.method615((byte) -125);
        try {
            if (class79.field1937 != null) {
                class79.field1937.method234((byte) -80);
            }
            if (class2.field23 != null) {
                for (int var2 = 0; var2 < class2.field23.length; var2++) {
                    if (class2.field23[var2] != null) {
                        class2.field23[var2].method234((byte) -125);
                    }
                }
            }
            if (arg0 != 4258) {
                this.method202(126);
            }
            if (class40.field899 != null) {
                class40.field899.method234((byte) -72);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 429)
    private final void method201(int arg0) {
        if (arg0 != 17151) {
            field458 = null;
        }
        field473++;
        if (class27.field679 >= 4) {
            this.method919((byte) 25, "js5crc");
            class59.field1295 = 1000;
            return;
        }
        if (class130.field3156 >= 4) {
            if (class59.field1295 <= 5) {
                this.method919((byte) 25, "js5io");
                class59.field1295 = 1000;
                return;
            }
            class130.field3163 = 3000;
            class130.field3156 = 3;
        }
        if (class130.field3163-- > 0) {
            return;
        }
        try {
            if (class107.field2538 == 0) {
                class27.field676 = class64.field1391.method283(class30.field720, 4);
                class107.field2538++;
            }
            if (class107.field2538 == 1) {
                if (class27.field676.field2686 == 2) {
                    this.method196((byte) -104, -1);
                    return;
                }
                if (class27.field676.field2686 == 1) {
                    class107.field2538++;
                }
            }
            if (class107.field2538 == 2) {
                class138.field3363 = new class21((Socket) class27.field676.field2687, class64.field1391);
                class77 var2 = new class77(5);
                var2.method641((byte) -28, 15);
                var2.method644(443, (byte) 38);
                class138.field3363.method211(-1, var2.field1858, 5, 0);
                class107.field2538++;
                class34.field806 = class5.method22(89);
            }
            if (class107.field2538 == 3) {
                if (class59.field1295 <= 5 || class138.field3363.method210(0) > 0) {
                    int var3 = class138.field3363.method209(arg0 - 17234);
                    if (var3 != 0) {
                        this.method196((byte) -118, var3);
                        return;
                    }
                    class107.field2538++;
                } else if (class5.method22(arg0 ^ 0x42BD) - class34.field806 > 30000L) {
                    this.method196((byte) -83, -2);
                    return;
                }
            }
            if (class107.field2538 == 4) {
                class49.method392(class138.field3363, class59.field1295 > 20, 74);
                class41.field928 = 0;
                class107.field2538 = 0;
                class27.field676 = null;
                class138.field3363 = null;
            }
        } catch (IOException var4) {
            this.method196((byte) -101, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 569)
    private final void method202(int arg0) {
        field461++;
        if (arg0 != 0) {
            field456 = 110L;
        }
        if (class59.field1295 != 1000) {
            boolean var2 = class61.method452(512);
            if (!var2) {
                this.method201(17151);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 601)
    public final void init() {
        field465++;
        if (!this.method927(1)) {
            return;
        }
        class26.field654 = Integer.parseInt(this.getParameter("worldid"));
        class14.field265 = Integer.parseInt(this.getParameter("modewhat"));
        class51.field1159 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class2.method10((byte) -125);
        } else {
            class95.method793(1);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class30.field725 = true;
        } else {
            class30.field725 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class12.method127(-8);
            class30.field732 = 1;
        }
        this.method918(48, 503, class14.field265 + 32, 443, 765);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 639)
    public final void method203(byte arg0) {
        field466++;
        class5.field61++;
        this.method202(0);
        class126.method1028(32257);
        if (arg0 != 19) {
            method197(-99, 61, (byte) 15, null);
        }
        class70.method514((byte) -93);
        class50.method401(6);
        class63.method463(3116);
        class134.method1096((byte) -99);
        if (class79.field1922 != null) {
            int var2 = class79.field1922.method447(arg0 + 107);
            class122.field3005 = var2;
            class108.field2591 += var2;
        }
        if (class59.field1295 == 0) {
            class125.method1021((byte) -87);
            class38.method329(-33);
        } else if (class59.field1295 == 5) {
            class125.method1021((byte) 113);
            class38.method329(-33);
        } else if (class59.field1295 == 10) {
            class14.method151((byte) 121);
        } else if (class59.field1295 == 20) {
            class14.method151((byte) 125);
            class40.method339(-10);
        } else if (class59.field1295 == 25) {
            class75.method603((byte) -125);
        }
        if (class59.field1295 == 30) {
            class60.method445(-72);
        } else if (class59.field1295 == 35) {
            class60.method445(-91);
        } else if (class59.field1295 == 40) {
            class40.method339(-10);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 705)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class6.method59(-44);
            }
            class26.field654 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class51.field1159 = 0;
            } else if (arg0[1].equals("office")) {
                class51.field1159 = 1;
            } else if (arg0[1].equals("local")) {
                class51.field1159 = 2;
            } else {
                class6.method59(-44);
            }
            if (arg0[2].equals("live")) {
                class14.field265 = 0;
            } else if (arg0[2].equals("rc")) {
                class14.field265 = 1;
            } else if (arg0[2].equals("wip")) {
                class14.field265 = 2;
            } else {
                class6.method59(-44);
            }
            if (arg0[3].equals("lowmem")) {
                class2.method10((byte) -126);
            } else if (arg0[3].equals("highmem")) {
                class95.method793(1);
            } else {
                class6.method59(-44);
            }
            if (arg0[4].equals("free")) {
                class30.field725 = false;
            } else if (arg0[4].equals("members")) {
                class30.field725 = true;
            } else {
                class6.method59(-44);
            }
            if (arg0[5].equals("english")) {
                class30.field732 = 0;
            } else if (arg0[5].equals("german")) {
                class12.method127(80);
                class30.field732 = 1;
            } else {
                class6.method59(-44);
            }
            client var1 = new client();
            var1.method921(443, InetAddress.getLocalHost(), "runescape", 765, 503, 14, -97, class14.field265 + 32);
        } catch (Exception var3) {
            class78.method675(var3, 64, null);
        }
        field467++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 823)
    public final void method204(boolean arg0) {
        field460++;
        if (arg0) {
            return;
        }
        class42.field964 = class51.field1159 == 0 ? 43594 : class26.field654 + 40000;
        class116.field2755 = class51.field1159 == 0 ? 443 : class26.field654 + 50000;
        class30.field720 = class42.field964;
        class69.method501(116);
        class19.method181((byte) -95, class70.field1564);
        class32.method291(class70.field1564, 13331);
        class79.field1922 = class41.method343(true);
        if (class79.field1922 != null) {
            class79.field1922.method446(class70.field1564, (byte) 87);
        }
        class67.field1479 = class31.field765;
        try {
            if (class64.field1391.field763 != null) {
                class79.field1937 = new class26(class64.field1391.field763, 5200, 0);
                for (int var2 = 0; var2 < 14; var2++) {
                    class2.field23[var2] = new class26(class64.field1391.field769[var2], 6000, 0);
                }
                class40.field899 = new class26(class64.field1391.field761, 6000, 0);
                class20.field410 = new class8(255, class79.field1937, class40.field899, 500000);
                class64.field1391.field763 = null;
                class64.field1391.field769 = null;
                class64.field1391.field761 = null;
            }
        } catch (IOException var3) {
            class79.field1937 = null;
            class40.field899 = null;
            class20.field410 = null;
        }
        if (class51.field1159 != 0) {
            class34.field808 = true;
        }
        class130.field3153 = new class121();
    }
}

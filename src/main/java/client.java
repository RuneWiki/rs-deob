import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class49 {

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
    public static boolean field435 = true;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Ltd;")
    public static class136 field448 = class145.method1172("Suche nach Updates )2 ", 45);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    public static int[] field451 = new int[128];

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Ltd;")
    public static class136 field446 = class145.method1172("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 45);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    public static boolean field449 = false;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    public static int[] field455 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "J")
    public static long field458 = 0L;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lk;")
    public static class69 field443 = new class69();

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ltd;")
    public static class136 field461 = class145.method1172("mapback", 45);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lbb;")
    public static class10 field450;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lfd;")
    public static class40 field459;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lmd;")
    public static class87 field439;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public static final int method165(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & arg2;
        field447++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field457++;
        if (!this.method411(false)) {
            return;
        }
        class44.field1011 = Integer.parseInt(this.getParameter("worldid"));
        class53.field1183 = Integer.parseInt(this.getParameter("modewhat"));
        class81.field1932 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class85.method632(-76);
        } else {
            class53.method430(true);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class146.field3378 = true;
        } else {
            class146.field3378 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class79.method566(0);
            class54.field1194 = 1;
            class37.field857 = class53.field1184;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class99.field2378 = 1;
        } else {
            class99.field2378 = 0;
        }
        try {
            class118.field2686 = Integer.parseInt(this.getParameter("js"));
            class108.field2565 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class43.field982 = this.getCodeBase().getHost();
        this.method414(503, 765, class53.field1183 + 32, 462, -121);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method166(int arg0) {
        field450 = null;
        if (arg0 != -1642) {
            return;
        }
        field461 = null;
        field439 = null;
        field443 = null;
        field459 = null;
        field448 = null;
        field451 = null;
        field446 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method167(int arg0) {
        field441++;
        class4.field70.method875((byte) 37);
        int var1 = class4.field70.method877(false, 8);
        if (arg0 >= -101) {
            method167(-69);
        }
        if (class51.field1145 > var1) {
            for (int var2 = var1; var2 < class51.field1145; var2++) {
                class78.field1799[class149.field3433++] = class139.field3237[var2];
            }
        }
        if (var1 > class51.field1145) {
            throw new RuntimeException("gnpov1");
        }
        class51.field1145 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class139.field3237[var3];
            class67 var5 = class122.field2846[var4];
            int var6 = class4.field70.method877(false, 1);
            if (var6 == 0) {
                class139.field3237[class51.field1145++] = var4;
                var5.field3555 = class44.field1013;
            } else {
                int var7 = class4.field70.method877(false, 2);
                if (var7 == 0) {
                    class139.field3237[class51.field1145++] = var4;
                    var5.field3555 = class44.field1013;
                    class108.field2532[class26.field591++] = var4;
                } else if (var7 == 1) {
                    class139.field3237[class51.field1145++] = var4;
                    var5.field3555 = class44.field1013;
                    int var8 = class4.field70.method877(false, 3);
                    var5.method1214((byte) 125, false, var8);
                    int var9 = class4.field70.method877(false, 1);
                    if (var9 == 1) {
                        class108.field2532[class26.field591++] = var4;
                    }
                } else if (var7 == 2) {
                    class139.field3237[class51.field1145++] = var4;
                    var5.field3555 = class44.field1013;
                    int var10 = class4.field70.method877(false, 3);
                    var5.method1214((byte) -113, true, var10);
                    int var11 = class4.field70.method877(false, 3);
                    var5.method1214((byte) -67, true, var11);
                    int var12 = class4.field70.method877(false, 1);
                    if (var12 == 1) {
                        class108.field2532[class26.field591++] = var4;
                    }
                } else if (var7 == 3) {
                    class78.field1799[class149.field3433++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method168(byte arg0, int arg1) {
        if (class81.field1933 == class101.field2423) {
            class101.field2423 = class136.field3217;
        } else {
            class101.field2423 = class81.field1933;
        }
        class67.field1426 = null;
        field442++;
        class43.field997 = 0;
        class67.field1431++;
        class116.field2667 = null;
        if (arg0 != -59) {
            return;
        }
        if (class67.field1431 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class139.field3248 > 5) {
                class12.field226 = 3000;
            } else {
                this.method418((byte) -53, "js5connect_full");
                class139.field3248 = 1000;
            }
        } else if (class67.field1431 >= 2 && arg1 == 6) {
            this.method418((byte) -53, "js5connect_outofdate");
            class139.field3248 = 1000;
        } else if (class67.field1431 >= 4) {
            if (class139.field3248 > 5) {
                class12.field226 = 3000;
            } else {
                this.method418((byte) -53, "js5connect");
                class139.field3248 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method169(int arg0) {
        field438++;
        if (class73.field1522 != null) {
            class73.field1522.field3263 = false;
        }
        class73.field1522 = null;
        if (class133.field3140 != null) {
            class133.field3140.method144(1);
            class133.field3140 = null;
        }
        class129.method1060((byte) 123);
        class112.method881(-90);
        class7.field131 = null;
        if (class71.field1506 != null) {
            class71.field1506.method271(true);
        }
        if (class21.field419 != null) {
            class21.field419.method271(true);
        }
        class145.method1174(-56);
        class83.method627(-1);
        if (arg0 > -74) {
            return;
        }
        try {
            if (class49.field1093 != null) {
                class49.field1093.method218(0);
            }
            if (class110.field2599 != null) {
                for (int var2 = 0; var2 < class110.field2599.length; var2++) {
                    if (class110.field2599[var2] != null) {
                        class110.field2599[var2].method218(0);
                    }
                }
            }
            if (class101.field2420 != null) {
                class101.field2420.method218(0);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method170(int arg0) {
        if (arg0 > -119) {
            method165(-79, -14, 53, -61);
        }
        field445++;
        if (class153.field3497 >= 4) {
            this.method418((byte) -53, "js5crc");
            class139.field3248 = 1000;
            return;
        }
        if (class143.field3311 >= 4) {
            if (class139.field3248 <= 5) {
                this.method418((byte) -53, "js5io");
                class139.field3248 = 1000;
                return;
            }
            class143.field3311 = 3;
            class12.field226 = 3000;
        }
        if (class12.field226-- > 0) {
            return;
        }
        try {
            if (class43.field997 == 0) {
                class67.field1426 = class44.field1010.method182(class43.field982, class101.field2423, (byte) 62);
                class43.field997++;
            }
            if (class43.field997 == 1) {
                if (class67.field1426.field3442 == 2) {
                    this.method168((byte) -59, -1);
                    return;
                }
                if (class67.field1426.field3442 == 1) {
                    class43.field997++;
                }
            }
            if (class43.field997 == 2) {
                class116.field2667 = new class19((Socket) class67.field1426.field3441, class44.field1010);
                class127 var2 = new class127(5);
                var2.method1026(15, (byte) 127);
                var2.method989(462, (byte) 92);
                class116.field2667.method145(5, -6660, var2.field2960, 0);
                class43.field997++;
                class7.field129 = class27.method233((byte) 103);
            }
            if (class43.field997 == 3) {
                if (class139.field3248 <= 5 || class116.field2667.method142((byte) 102) > 0) {
                    int var3 = class116.field2667.method137(0);
                    if (var3 != 0) {
                        this.method168((byte) -59, var3);
                        return;
                    }
                    class43.field997++;
                } else if (class27.method233((byte) -76) - class7.field129 > 30000L) {
                    this.method168((byte) -59, -2);
                    return;
                }
            }
            if (class43.field997 == 4) {
                class119.method935(class116.field2667, class139.field3248 > 20, -128);
                class43.field997 = 0;
                class67.field1431 = 0;
                class116.field2667 = null;
                class67.field1426 = null;
            }
        } catch (IOException var4) {
            this.method168((byte) -59, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method171(int arg0) {
        field440++;
        class44.field1013++;
        this.method175((byte) -109);
        class12.method81((byte) -52);
        class86.method643(arg0 - 20050);
        class21.method155(119);
        if (arg0 != 19110) {
            return;
        }
        class81.method607(-85);
        class146.method1178(0);
        if (class7.field131 != null) {
            int var2 = class7.field131.method449(true);
            class83.field1975 = var2;
        }
        if (class139.field3248 == 0) {
            class38.method325((byte) -125);
            class76.method553(-65);
        } else if (class139.field3248 == 5) {
            class55.method440(this, arg0 - 19109);
            class38.method325((byte) -128);
            class76.method553(-78);
        } else if (class139.field3248 == 10) {
            class55.method440(this, arg0 ^ 0x4AA7);
        } else if (class139.field3248 == 20) {
            class55.method440(this, 1);
            class44.method354(20103);
        } else if (class139.field3248 == 25) {
            class4.method27((byte) -51);
        }
        if (class139.field3248 == 30) {
            class81.method609(false);
        } else if (class139.field3248 == 40) {
            class44.method354(20103);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method172(int arg0) {
        boolean var2 = class63.method480(22050);
        if (arg0 != 2) {
            return;
        }
        field453++;
        if (var2 && class47.field1078 && class71.field1506 != null) {
            class71.field1506.method267(-123);
        }
        if (class84.field1981) {
            class2.method10(125, class14.field279);
            class14.method99((byte) -43, class14.field279);
            if (class7.field131 != null) {
                class7.field131.method447(class14.field279, (byte) 97);
            }
            this.method420(0);
            class41.method342(108, class14.field279);
            class129.method1058(32, class14.field279);
            if (class7.field131 != null) {
                class7.field131.method448(-28706, class14.field279);
            }
        }
        if (class139.field3248 == 0) {
            class54.method436(4617, class81.field1910, class75.field1695, null);
        } else if (class139.field3248 == 5) {
            class64.method483(class81.field1943, arg0 + 9200, class87.field2039);
        } else if (class139.field3248 == 10) {
            class64.method483(class81.field1943, 9202, class87.field2039);
        } else if (class139.field3248 == 20) {
            class64.method483(class81.field1943, arg0 ^ 0x23F0, class87.field2039);
        } else if (class139.field3248 == 25) {
            if (class86.field2026 == 1) {
                if (class35.field842 > class64.field1384) {
                    class64.field1384 = class35.field842;
                }
                int var4 = (class64.field1384 - class35.field842) * 50 / class64.field1384;
                class105.method843(true, class79.method570(0, new class136[] { class47.field1073, class37.field854, class19.method140(var4, -98), class120.field2729 }), false);
            } else if (class86.field2026 == 2) {
                if (class113.field2622 > class89.field2117) {
                    class89.field2117 = class113.field2622;
                }
                int var3 = (class89.field2117 - class113.field2622) * 50 / class89.field2117 + 50;
                class105.method843(true, class79.method570(0, new class136[] { class47.field1073, class37.field854, class19.method140(var3, -89), class120.field2729 }), false);
            } else {
                class105.method843(true, class47.field1073, false);
            }
        } else if (class139.field3248 == 30) {
            class37.method320((byte) 103);
        } else if (class139.field3248 == 40) {
            class105.method843(true, class79.method570(arg0 ^ 0x2, new class136[] { class64.field1367, class113.field2624, class80.field1865 }), false);
        }
        if (class139.field3248 == 30 && class15.field303 == 0 && !class12.field224) {
            try {
                Graphics var5 = class14.field279.getGraphics();
                for (int var6 = 0; var6 < class70.field1477; var6++) {
                    if (class38.field879[var6]) {
                        class12.field219.method523((byte) -20, class133.field3137[var6], class100.field2408[var6], class154.field3535[var6], var5, class125.field2907[var6]);
                        class38.field879[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class14.field279.repaint();
            }
        } else if (class139.field3248 > 0) {
            try {
                Graphics var7 = class14.field279.getGraphics();
                class12.field219.method521(0, 0, arg0 ^ 0x2, var7);
                class12.field224 = false;
                for (int var8 = 0; var8 < class70.field1477; var8++) {
                    class38.field879[var8] = false;
                }
            } catch (Exception var10) {
                class14.field279.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        method166(-1642);
        field437++;
        class136.method1106(1);
        class49.method413(91);
        class131.method1064(37);
        class70.method526((byte) 103);
        class141.method1145(false);
        class127.method988(0);
        class19.method133((byte) -70);
        class108.method858((byte) -95);
        class24.method222(false);
        class7.method36((byte) -121);
        class67.method494(-31666);
        class110.method863((byte) 110);
        class95.method705();
        class97.method767();
        class83.method620(-123);
        class74.method543(112);
        class13.method96(11116);
        class69.method518((byte) -98);
        class15.method105(15);
        class129.method1059(103);
        class3.method21(false);
        class31.method273(127);
        class104.method836((byte) 56);
        class99.method803(-1);
        class116.method921((byte) -106);
        class155.method1212(116);
        class16.method114(true);
        class96.method729((byte) 94);
        class118.method929(-15);
        class88.method673(true);
        class14.method100(8);
        class142.method1157((byte) 114);
        class143.method1159(45056);
        class23.method210();
        class126.method981();
        class132.method1070((byte) -30);
        class63.method479(122);
        class149.method1189(5);
        class147.method1181((byte) 93);
        class33.method292(93);
        class124.method956((byte) 105);
        class112.method879(98);
        class120.method938(-106);
        class51.method422(false);
        class107.method848(true);
        class56.method446(false);
        class30.method253();
        class52.method425(-80);
        class61.method463(79);
        class27.method234((byte) -126);
        class86.method642(32768);
        class140.method1141(0);
        class87.method644((byte) -85);
        class80.method605(16384);
        class40.method334(29416);
        class146.method1176(0);
        class39.method329(true);
        class11.method76(-17905);
        if (arg0 <= 58) {
            this.init();
        }
        class71.method527(124);
        class84.method630(27522);
        class59.method452(false);
        class21.method158(103);
        class77.method556(65280);
        class53.method431((byte) -97);
        class105.method842((byte) 24);
        class76.method554(-29971);
        class114.method899();
        class145.method1170((byte) -58);
        class103.method834();
        class81.method606(-2);
        class32.method276();
        class12.method86(-125);
        class5.method29(0);
        class152.method1195(-35);
        class154.method1205(21);
        class28.method244((byte) -124);
        class18.method129(2974);
        class128.method1055((byte) -100);
        class121.method949((byte) 124);
        class133.method1076((byte) -46);
        class29.method247((byte) 90);
        class62.method467((byte) -118);
        class65.method487((byte) -75);
        class75.method548(72);
        class78.method562(-98);
        class2.method8((byte) 61);
        class134.method1084();
        class37.method318(-1);
        class101.method813(-39);
        class89.method676(1);
        class94.method700((byte) 99);
        class79.method569(true);
        class43.method351(123);
        class9.method43(10);
        class125.method959(-2177);
        class109.method862(true);
        class139.method1133((byte) 105);
        class100.method810((byte) -88);
        class135.method1088((byte) 61);
        class45.method361();
        class55.method443((byte) 98);
        class151.method1193(false);
        class85.method638(-5631);
        class106.method847(22340);
        class47.method405(false);
        class91.method686((byte) 35);
        class54.method434(63);
        class4.method24(8);
        class73.method533(true);
        class41.method341(-27724);
        class122.method952(0);
        class8.method40((byte) -97);
        class90.method680(1222);
        class153.method1201(1);
        class38.method327(18862);
        class130.method1063();
        class115.method904();
        class44.method358(false);
        class66.method491();
        class26.method231(-21006);
        class93.method696((byte) 49);
        class68.method502();
        class35.method306(1000);
        class1.method2(30503);
        class64.method481((byte) -128);
        class34.method304();
        class17.method122();
        class113.method884((byte) 105);
        class119.method932((byte) 115);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method174(int arg0) {
        class99.field2391.method1165((byte) -73);
        field436++;
        if (arg0 != 12812) {
            method167(-95);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method175(byte arg0) {
        field460++;
        if (class139.field3248 == 1000) {
            return;
        }
        if (arg0 >= -78) {
            method167(64);
        }
        boolean var2 = class149.method1186(20);
        if (!var2) {
            this.method170(-128);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method176(byte arg0) {
        field444++;
        class136.field3217 = class81.field1932 == 0 ? 443 : class44.field1011 + 50000;
        class81.field1933 = class81.field1932 == 0 ? 43594 : class44.field1011 + 40000;
        if (arg0 > -49) {
            field451 = null;
        }
        class101.field2423 = class81.field1933;
        class91.method685((byte) 44);
        class41.method342(80, class14.field279);
        class129.method1058(32, class14.field279);
        class7.field131 = class26.method230(0);
        if (class7.field131 != null) {
            class7.field131.method448(-28706, class14.field279);
        }
        class52.field1170 = class22.field471;
        try {
            if (class44.field1010.field465 != null) {
                class49.field1093 = new class24(class44.field1010.field465, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class110.field2599[var2] = new class24(class44.field1010.field466[var2], 6000, 0);
                }
                class101.field2420 = new class24(class44.field1010.field469, 6000, 0);
                class89.field2102 = new class7(255, class49.field1093, class101.field2420, 500000);
                class44.field1010.field466 = null;
                class44.field1010.field465 = null;
                class44.field1010.field469 = null;
            }
        } catch (IOException var3) {
            class101.field2420 = null;
            class89.field2102 = null;
            class49.field1093 = null;
        }
        if (class81.field1932 != 0) {
            class73.field1523 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field452++;
        try {
            if (arg0.length != 7) {
                class120.method936(4098);
            }
            class44.field1011 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class81.field1932 = 0;
            } else if (arg0[1].equals("office")) {
                class81.field1932 = 1;
            } else if (arg0[1].equals("local")) {
                class81.field1932 = 2;
            } else {
                class120.method936(4098);
            }
            if (arg0[2].equals("live")) {
                class53.field1183 = 0;
            } else if (arg0[2].equals("rc")) {
                class53.field1183 = 1;
            } else if (arg0[2].equals("wip")) {
                class53.field1183 = 2;
            } else {
                class120.method936(4098);
            }
            if (arg0[3].equals("lowmem")) {
                class85.method632(-70);
            } else if (arg0[3].equals("highmem")) {
                class53.method430(true);
            } else {
                class120.method936(4098);
            }
            if (arg0[4].equals("free")) {
                class146.field3378 = false;
            } else if (arg0[4].equals("members")) {
                class146.field3378 = true;
            } else {
                class120.method936(4098);
            }
            if (arg0[5].equals("english")) {
                class54.field1194 = 0;
            } else if (arg0[5].equals("german")) {
                class79.method566(0);
                class54.field1194 = 1;
                class37.field857 = class53.field1184;
            } else {
                class120.method936(4098);
            }
            if (arg0[6].equals("game0")) {
                class99.field2378 = 0;
            } else if (arg0[6].equals("game1")) {
                class99.field2378 = 1;
            } else {
                class120.method936(4098);
            }
            class43.field982 = "127.0.0.1";
            client var1 = new client();
            var1.method415(class53.field1183 + 32, 1, 765, "runescape", 503, 462, 16);
        } catch (Exception var3) {
            class53.method433(var3, false, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public static final int method177(int arg0, int arg1, int arg2, int arg3) {
        field454++;
        if ((class125.field2895[arg0][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class125.field2895[1][arg2][arg3] & 0x2) == 0) {
            if (arg1 != 2) {
                main(null);
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }
}

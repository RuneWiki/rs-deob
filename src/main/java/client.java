import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class22 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Laf;")
    public static class7 field558 = class48.method406(40, ":chalreq:");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
    public static boolean field552 = false;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Laf;")
    public static class7 field557 = class48.method406(40, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Laf;")
    public static class7 field561 = class48.method406(40, "Angreifen");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Laf;")
    public static class7 field560 = class48.method406(40, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public static int[] field569 = new int[5];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lbd;")
    public static class12 field551 = new class12(4096);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private static int field575 = 2301979;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lgd;")
    public static class46 field574 = new class46(30);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field576 = new CRC32();

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Laf;")
    public static class7 field579 = class48.method406(40, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lkb;")
    public static class71 field578;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method197(byte arg0) {
        if (arg0 > -38) {
            return;
        }
        boolean var2 = class106.method859(48);
        field556++;
        if (var2 && class19.field440 && class133.field3118 != null) {
            class133.field3118.method587(114);
        }
        if (class133.field3116) {
            class87.method723(class13.field324, false);
            class68.method551(28243, class13.field324);
            if (class83.field1970 != null) {
                class83.field1970.method728((byte) -117, class13.field324);
            }
            this.method219(true);
            class105.method851(class13.field324, 0);
            class91.method737((byte) 68, class13.field324);
            if (class83.field1970 != null) {
                class83.field1970.method726(1777027655, class13.field324);
            }
        }
        if (class108.field2634 == 0) {
            class9.method104(303, null, class106.field2600, class13.field330);
        } else if (class108.field2634 == 5) {
            class116.method903(-108, class25.field660, class51.field1224);
        } else if (class108.field2634 == 10) {
            class116.method903(-107, class25.field660, class51.field1224);
        } else if (class108.field2634 == 20) {
            class116.method903(-51, class25.field660, class51.field1224);
        } else if (class108.field2634 == 25) {
            if (class105.field2574 == 1) {
                if (class57.field1371 < class147.field3466) {
                    class57.field1371 = class147.field3466;
                }
                int var4 = (class57.field1371 - class147.field3466) * 50 / class57.field1371;
                class43.method382(-38, class116.method905(new class7[] { class13.field342, class142.field3349, class51.method421((byte) 118, var4), class133.field3117 }, 1), false);
            } else if (class105.field2574 == 2) {
                if (class13.field331 > class11.field290) {
                    class11.field290 = class13.field331;
                }
                int var3 = (class11.field290 - class13.field331) * 50 / class11.field290 + 50;
                class43.method382(114, class116.method905(new class7[] { class13.field342, class142.field3349, class51.method421((byte) 117, var3), class133.field3117 }, 1), false);
            } else {
                class43.method382(110, class13.field342, false);
            }
        } else if (class108.field2634 == 30) {
            class89.method729(-61);
        } else if (class108.field2634 == 40) {
            class43.method382(118, class116.method905(new class7[] { class153.field3571, class142.field3371, class101.field2400 }, 1), false);
        }
        if (class108.field2634 == 30 && class126.field3007 == 0 && !class8.field217) {
            try {
                Graphics var5 = class13.field324.getGraphics();
                for (int var6 = 0; var6 < class83.field1951; var6++) {
                    if (class133.field3114[var6]) {
                        class102.field2425.method646(class86.field2002[var6], 75, var5, class28.field730[var6], class96.field2294[var6], class105.field2579[var6]);
                        class133.field3114[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class13.field324.repaint();
            }
        } else if (class108.field2634 > 0) {
            try {
                Graphics var7 = class13.field324.getGraphics();
                class102.field2425.method647(var7, 0, 0, (byte) 46);
                class8.field217 = false;
                for (int var8 = 0; var8 < class83.field1951; var8++) {
                    class133.field3114[var8] = false;
                }
            } catch (Exception var10) {
                class13.field324.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method198(int arg0) {
        method199((byte) 68);
        field563++;
        class7.method67((byte) 87);
        class22.method210(1);
        class13.method134((byte) 34);
        class75.method644(0);
        class151.method1199(0);
        class122.method935(23);
        class145.method1177(10237);
        class118.method909(true);
        class97.method790(127);
        class126.method1045(-2177);
        class141.method1153(52);
        class139.method1144(4);
        class5.method46();
        class124.method1001();
        class87.method720(true);
        class103.method838(-98);
        class92.method740(-1537);
        class94.method763(-127);
        class12.method124(0);
        class142.method1159(200);
        class84.method702((byte) -102);
        class72.method594(0);
        class6.method52(-5375);
        class136.method1122(false);
        class93.method752((byte) 84);
        class19.method181((byte) 126);
        class130.method1069((byte) -108);
        class95.method776(99);
        class28.method252(31658);
        class137.method1129((byte) -122);
        class143.method1161(508);
        if (arg0 >= -87) {
            field552 = true;
        }
        class25.method235((byte) 124);
        class46.method389((byte) 88);
        class31.method273();
        class15.method159();
        class68.method549((byte) 48);
        class155.method1212(3);
        class105.method854(false);
        class133.method1076(-93);
        class127.method1050(-32);
        class78.method666((byte) -105);
        class101.method830((byte) -46);
        class115.method897(-24324);
        class44.method383(false);
        class37.method327(-19681);
        class23.method222(0);
        class29.method253();
        class113.method889(false);
        class32.method284(-7299);
        class55.method444(28348);
        class21.method196(19661064);
        class54.method438(-116);
        class71.method579(false);
        class73.method601(2);
        class111.method884((byte) -73);
        class50.method414((byte) 54);
        class77.method662(127);
        class14.method138((byte) -96);
        class80.method677((byte) -60);
        class3.method19(111);
        class38.method332(54);
        class30.method257(-1);
        class109.method869((byte) -116);
        class74.method635(true);
        class43.method379(false);
        class153.method1203(-105);
        class33.method292();
        class99.method812(1);
        class134.method1088();
        class83.method700(0);
        class56.method461();
        class89.method733(-117);
        class10.method116((byte) 117);
        class64.method524(-113);
        class18.method169(0);
        class9.method110(-11);
        class98.method802((byte) 24);
        class82.method694((byte) -109);
        class135.method1104(false);
        class49.method410(-8490);
        class27.method247(850);
        class102.method833(true);
        class149.method1194((byte) -114);
        class57.method466((byte) -123);
        class26.method239(22335);
        class66.method538((byte) -10);
        class70.method559();
        class4.method20(-13402);
        class131.method1071((byte) -63);
        class106.method857(false);
        class81.method678(0);
        class2.method13((byte) -17);
        class96.method787(0);
        class11.method121((byte) 113);
        class17.method167(true);
        class121.method928(98);
        class39.method335(0);
        class47.method399(-3);
        class116.method902(-2);
        class35.method314();
        class53.method430(-28542);
        class69.method555(-27669);
        class123.method986(9);
        class20.method193(123);
        class52.method426((byte) -107);
        class79.method670(18084);
        class42.method370(-3);
        class152.method1200(-91);
        class120.method923(true);
        class148.method1192((byte) 117);
        class147.method1186(-13682);
        class48.method400((byte) 77);
        class91.method738((byte) -125);
        class24.method228((byte) -79);
        class58.method470((byte) -2);
        class16.method161();
        class154.method1210();
        class144.method1167((byte) 1);
        class107.method861();
        class86.method707(-1641);
        class119.method919(84);
        class128.method1056();
        class8.method102(6);
        class108.method862(0);
        class51.method423(1);
        class36.method324();
        class76.method652();
        class45.method387(false);
        class67.method543((byte) -107);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method199(byte arg0) {
        field578 = null;
        field574 = null;
        field557 = null;
        field560 = null;
        field576 = null;
        field579 = null;
        field551 = null;
        field561 = null;
        field558 = null;
        if (arg0 <= 16) {
            field558 = null;
        }
        field569 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method200(int arg0) {
        field571++;
        if (class108.field2634 != 1000 && arg0 > 39) {
            boolean var2 = class42.method377(0);
            if (!var2) {
                this.method208((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field567++;
        if (!this.method211((byte) 88)) {
            return;
        }
        class133.field3123 = Integer.parseInt(this.getParameter("worldid"));
        class18.field432 = Integer.parseInt(this.getParameter("modewhat"));
        class22.field617 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class22.method214(1);
        } else {
            class68.method550(2);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class94.field2188 = true;
        } else {
            class94.field2188 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class139.method1132((byte) -19);
            class155.field3610 = 1;
            class52.field1268 = class52.field1255;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class37.field930 = 1;
        } else {
            class37.field930 = 0;
        }
        try {
            class109.field2661 = Integer.parseInt(this.getParameter("js"));
            class126.field3024 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class2.field5 = this.getCodeBase().getHost();
        this.method213(19170, class18.field432 + 32, 461, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method201(int arg0, byte arg1) {
        class28.field738++;
        if (class52.field1267 == class109.field2658) {
            class52.field1267 = class66.field1443;
        } else {
            class52.field1267 = class109.field2658;
        }
        class144.field3401 = 0;
        field568++;
        class75.field1742 = null;
        class84.field1992 = null;
        if (class28.field738 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class108.field2634 <= 5) {
                this.method216("js5connect_full", 94);
                class108.field2634 = 1000;
            } else {
                class95.field2262 = 3000;
            }
        } else if (class28.field738 >= 2 && arg0 == 6) {
            this.method216("js5connect_outofdate", -112);
            class108.field2634 = 1000;
        } else if (class28.field738 >= 4) {
            if (class108.field2634 <= 5) {
                this.method216("js5connect", -108);
                class108.field2634 = 1000;
            } else {
                class95.field2262 = 3000;
            }
        }
        if (arg1 >= -17) {
            method209(18, 59, 74, (byte) 103, 73, 27, 62);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (class43.field1033 != null) {
            class43.field1033.field3529 = false;
        }
        class43.field1033 = null;
        field566++;
        if (class12.field302 != null) {
            class12.field302.method1172((byte) 10);
            class12.field302 = null;
        }
        class92.method744(-28034);
        class24.method227(false);
        class83.field1970 = null;
        int var2 = -2 % ((arg0 - 70) / 51);
        if (class133.field3118 != null) {
            class133.field3118.method596(true);
        }
        if (class111.field2674 != null) {
            class111.field2674.method596(true);
        }
        class11.method117((byte) 18);
        class109.method865((byte) -47);
        try {
            if (class49.field1178 != null) {
                class49.field1178.method797((byte) 1);
            }
            if (class2.field20 != null) {
                for (int var3 = 0; var3 < class2.field20.length; var3++) {
                    if (class2.field20[var3] != null) {
                        class2.field20[var3].method797((byte) 1);
                    }
                }
            }
            if (class84.field1994 != null) {
                class84.field1994.method797((byte) 1);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZILkb;)V")
    public static final void method203(int arg0, int arg1, int arg2, boolean arg3, int arg4, class71 arg5) {
        class148.field3479 = 1;
        if (arg2 != -11361) {
            field575 = 82;
        }
        class82.field1932 = arg5;
        class79.field1831 = arg0;
        field562++;
        class20.field517 = arg4;
        class3.field39 = arg1;
        class108.field2647 = arg3;
        class26.field689 = 10000;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method204(byte arg0) {
        field559++;
        class109.field2658 = class22.field617 == 0 ? 43594 : class133.field3123 + 40000;
        class52.field1267 = class109.field2658;
        if (arg0 != 39) {
            return;
        }
        class66.field1443 = class22.field617 == 0 ? 443 : class133.field3123 + 50000;
        class113.method891(-21888);
        class105.method851(class13.field324, arg0 - 39);
        class91.method737((byte) 115, class13.field324);
        class83.field1970 = class109.method867((byte) 118);
        if (class83.field1970 != null) {
            class83.field1970.method726(1777027655, class13.field324);
        }
        class108.field2642 = class100.field2373;
        try {
            if (class74.field1717.field2374 != null) {
                class49.field1178 = new class97(class74.field1717.field2374, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class2.field20[var2] = new class97(class74.field1717.field2375[var2], 6000, 0);
                }
                class84.field1994 = new class97(class74.field1717.field2379, 6000, 0);
                class139.field3287 = new class126(255, class49.field1178, class84.field1994, 500000);
                class74.field1717.field2375 = null;
                class74.field1717.field2379 = null;
                class74.field1717.field2374 = null;
            }
        } catch (IOException var3) {
            class84.field1994 = null;
            class49.field1178 = null;
            class139.field3287 = null;
        }
        if (class22.field617 != 0) {
            class72.field1608 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method205(byte arg0) {
        field555++;
        class155.field3611++;
        this.method200(40);
        class66.method532(-18481);
        class118.method908(true);
        class118.method915((byte) -89);
        int var2 = -33 / ((-arg0 - 68) / 46);
        class105.method850(-113);
        class93.method747((byte) 119);
        if (class83.field1970 != null) {
            int var3 = class83.field1970.method727(true);
            class142.field3364 = var3;
        }
        if (class108.field2634 == 0) {
            class127.method1049((byte) 66);
            class18.method170(false);
        } else if (class108.field2634 == 5) {
            class47.method398(this, -106);
            class127.method1049((byte) 66);
            class18.method170(false);
        } else if (class108.field2634 == 10) {
            class47.method398(this, -108);
        } else if (class108.field2634 == 20) {
            class47.method398(this, -110);
            class144.method1166(15);
        } else if (class108.field2634 == 25) {
            class95.method772(-30);
        }
        if (class108.field2634 == 30) {
            class145.method1179((byte) -124);
        } else if (class108.field2634 == 40) {
            class144.method1166(15);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
    public static final void method206(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 0) {
            return;
        }
        field565++;
        int var6 = (arg2 - 32) * arg2 / arg3;
        class39.field983[0].method896(arg1, arg4);
        class39.field983[1].method896(arg1, arg4 + arg2 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg5 / (arg3 - arg2);
        class33.method304(arg1, arg4 + 16, 16, arg2 - 32, field575);
        class33.method304(arg1, var7 + arg4 + 16, 16, var6, class141.field3326);
        class33.method288(arg1, var7 + arg4 + 16, var6, class139.field3293);
        class33.method288(arg1 + 1, arg4 + 16 - -var7, var6, class139.field3293);
        class33.method291(arg1, arg4 + var7 + 16, 16, class139.field3293);
        class33.method291(arg1, arg4 + var7 + 17, 16, class139.field3293);
        class33.method288(arg1 + 15, arg4 + var7 + 16, var6, class25.field664);
        class33.method288(arg1 + 14, arg4 - -17 + var7, var6 - 1, class25.field664);
        class33.method291(arg1, arg4 + var6 + var7 + 15, 16, class25.field664);
        class33.method291(arg1 + 1, arg4 + var6 - (-var7 + -14), 15, class25.field664);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class84.method703((byte) -81);
            }
            class133.field3123 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class22.field617 = 0;
            } else if (arg0[1].equals("office")) {
                class22.field617 = 1;
            } else if (arg0[1].equals("local")) {
                class22.field617 = 2;
            } else {
                class84.method703((byte) -93);
            }
            if (arg0[2].equals("live")) {
                class18.field432 = 0;
            } else if (arg0[2].equals("rc")) {
                class18.field432 = 1;
            } else if (arg0[2].equals("wip")) {
                class18.field432 = 2;
            } else {
                class84.method703((byte) -118);
            }
            if (arg0[3].equals("lowmem")) {
                class22.method214(1);
            } else if (arg0[3].equals("highmem")) {
                class68.method550(2);
            } else {
                class84.method703((byte) -125);
            }
            if (arg0[4].equals("free")) {
                class94.field2188 = false;
            } else if (arg0[4].equals("members")) {
                class94.field2188 = true;
            } else {
                class84.method703((byte) -46);
            }
            if (arg0[5].equals("english")) {
                class155.field3610 = 0;
            } else if (arg0[5].equals("german")) {
                class139.method1132((byte) -19);
                class155.field3610 = 1;
                class52.field1268 = class52.field1255;
            } else {
                class84.method703((byte) -106);
            }
            if (arg0[6].equals("game0")) {
                class37.field930 = 0;
            } else if (arg0[6].equals("game1")) {
                class37.field930 = 1;
            } else {
                class84.method703((byte) -127);
            }
            class2.field5 = "127.0.0.1";
            client var1 = new client();
            var1.method212(16, 503, 5, 461, 765, "runescape", class18.field432 + 32);
        } catch (Exception var3) {
            class144.method1169(var3, (byte) 70, null);
        }
        field570++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static final void method207(byte arg0) {
        short var1 = 256;
        if (class98.field2327 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class98.field2327 > 768) {
                    class47.field1152[var2] = class99.method810(class80.field1851[var2], true, 1024 - class98.field2327, class115.field2750[var2]);
                } else if (class98.field2327 <= 256) {
                    class47.field1152[var2] = class99.method810(class115.field2750[var2], true, 256 - class98.field2327, class80.field1851[var2]);
                } else {
                    class47.field1152[var2] = class115.field2750[var2];
                }
            }
        } else if (class68.field1494 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class47.field1152[var3] = class80.field1851[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class68.field1494 > 768) {
                    class47.field1152[var4] = class99.method810(class80.field1851[var4], true, 1024 - class68.field1494, class4.field42[var4]);
                } else if (class68.field1494 > 256) {
                    class47.field1152[var4] = class4.field42[var4];
                } else {
                    class47.field1152[var4] = class99.method810(class4.field42[var4], true, 256 - class68.field1494, class80.field1851[var4]);
                }
            }
        }
        class33.method301(0, 9, 128, var1 + 7);
        class144.field3403.method366(0, 0);
        class33.method302();
        field553++;
        int var5 = 6885;
        int var6 = 0;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class94.field2207[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class123.field2939[var6++];
                if (var23 == 0) {
                    var5++;
                } else {
                    int var24 = 256 - var23;
                    int var25 = class102.field2425.field1735[var5];
                    int var27 = class47.field1152[var23];
                    class102.field2425.field1735[var5++] = class84.method705(-16711936, class84.method705(var25, 16711935) * var24 + class84.method705(16711935, var27) * var23) + class84.method705(16711680, var24 * class84.method705(65280, var25) + var23 * class84.method705(65280, var27)) >> 8;
                }
            }
            var5 += var21 + 765 - 128;
        }
        if (arg0 != 22) {
            main(null);
        }
        int var8 = 7546;
        class33.method301(637, 9, 765, var1 + 7);
        class58.field1377.method366(382, 0);
        int var9 = 0;
        class33.method302();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class94.field2207[var10] / var1;
            int var12 = 103 - var11;
            int var13 = var8 + var11;
            for (int var14 = 0; var14 < var12; var14++) {
                int var15 = class123.field2939[var9++];
                if (var15 == 0) {
                    var13++;
                } else {
                    int var17 = class102.field2425.field1735[var13];
                    int var18 = 256 - var15;
                    int var19 = class47.field1152[var15];
                    class102.field2425.field1735[var13++] = class84.method705(-16711936, var15 * class84.method705(16711935, var19) + var18 * class84.method705(var17, 16711935)) + class84.method705(class84.method705(var19, 65280) * var15 + var18 * class84.method705(65280, var17), 16711680) >> 8;
                }
            }
            var9 += 128 - var12;
            var8 = var13 + 765 - var11 - var12;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method208(byte arg0) {
        field573++;
        if (class92.field2122 >= 4) {
            this.method216("js5crc", 100);
            class108.field2634 = 1000;
            return;
        }
        if (class142.field3338 >= 4) {
            if (class108.field2634 <= 5) {
                this.method216("js5io", -118);
                class108.field2634 = 1000;
                return;
            }
            class95.field2262 = 3000;
            class142.field3338 = 3;
        }
        if (class95.field2262-- > 0) {
            return;
        }
        if (arg0 > -114) {
            field579 = null;
        }
        try {
            if (class144.field3401 == 0) {
                class75.field1742 = class74.field1717.method822(-10176, class2.field5, class52.field1267);
                class144.field3401++;
            }
            if (class144.field3401 == 1) {
                if (class75.field1742.field2087 == 2) {
                    this.method201(-1, (byte) -72);
                    return;
                }
                if (class75.field1742.field2087 == 1) {
                    class144.field3401++;
                }
            }
            if (class144.field3401 == 2) {
                class84.field1992 = new class145((Socket) class75.field1742.field2090, class74.field1717);
                class122 var2 = new class122(5);
                var2.method959(15, (byte) -120);
                var2.method970((byte) -96, 461);
                class84.field1992.method1178(5, (byte) 87, 0, var2.field2895);
                class144.field3401++;
                class153.field3572 = class55.method445(0);
            }
            if (class144.field3401 == 3) {
                if (class108.field2634 <= 5 || class84.field1992.method1175((byte) -122) > 0) {
                    int var3 = class84.field1992.method1171(3429);
                    if (var3 != 0) {
                        this.method201(var3, (byte) -99);
                        return;
                    }
                    class144.field3401++;
                } else if (class55.method445(0) - class153.field3572 > 30000L) {
                    this.method201(-2, (byte) -60);
                    return;
                }
            }
            if (class144.field3401 == 4) {
                class147.method1184(class108.field2634 > 20, class84.field1992, 0);
                class28.field738 = 0;
                class75.field1742 = null;
                class144.field3401 = 0;
                class84.field1992 = null;
            }
        } catch (IOException var4) {
            this.method201(-3, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIII)I")
    public static final int method209(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        field554++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg2;
        }
        if (arg3 < 42) {
            field560 = null;
        }
        if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return 7 + 1 - arg4 - arg0;
        }
    }
}

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class84 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lsc;")
    private static class128 field420 = class129.method1017(false, "Feb");

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lsc;")
    private static class128 field422 = class129.method1017(false, "Jan");

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lsc;")
    private static class128 field423 = class129.method1017(false, "Dec");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lsc;")
    public static class128 field419 = class129.method1017(false, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[B")
    public static byte[] field425 = new byte[520];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lsc;")
    private static class128 field431 = class129.method1017(false, "Apr");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lsc;")
    public static class128 field437 = class129.method1017(false, "Hidden)2use");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lsc;")
    private static class128 field439 = class129.method1017(false, "Mar");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lsc;")
    private static class128 field442 = class129.method1017(false, "May");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lsc;")
    private static class128 field440 = class129.method1017(false, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lsc;")
    private static class128 field441 = class129.method1017(false, "Nov");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lsc;")
    public static class128 field443 = class129.method1017(false, "<col=ffb000>");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lsc;")
    private static class128 field438 = class129.method1017(false, "Oct");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lsc;")
    public static class128 field447 = field440;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lsc;")
    private static class128 field450 = class129.method1017(false, "Jun");

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lsc;")
    private static class128 field452 = class129.method1017(false, "Sep");

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lsc;")
    private static class128 field446 = class129.method1017(false, "Jul");

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lsc;")
    private static class128 field451 = class129.method1017(false, "Aug");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[Lsc;")
    public static class128[] field421 = new class128[] { field422, field420, field439, field431, field442, field450, field446, field451, field452, field438, field441, field423 };

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lrb;")
    public static class120 field430 = new class120(64);

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Lsc;")
    public static class128 field455 = class129.method1017(false, ":clan:");

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lsc;")
    private static class128 field454 = class129.method1017(false, "Loaded interfaces");

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lsc;")
    public static class128 field453 = field454;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[Lb;")
    public static class8[] field427;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method182(int arg0) {
        class9.field145 = class151.field3484 == 0 ? 443 : class142.field3335 + 50000;
        field436++;
        class149.field3442 = ~class151.field3484 == arg0 ? 43594 : class142.field3335 + 40000;
        class111.field2506 = class149.field3442;
        if (class27.field523 == 1) {
            class21.field408 = class63.field1343;
            class89.field2041 = class11.field184;
            class21.field403 = class50.field972;
            class20.field364 = class106.field2422;
        } else {
            class21.field403 = class103.field2339;
            class21.field408 = class105.field2388;
            class89.field2041 = class64.field1413;
            class20.field364 = class44.field826;
        }
        class14.method148(arg0 + 44);
        class50.method393(88, class127.field2888);
        class6.method28(class127.field2888, (byte) 83);
        class73.field1636 = class128.method980((byte) -128);
        if (class73.field1636 != null) {
            class73.field1636.method13((byte) -24, class127.field2888);
        }
        class151.field3478 = class10.field167;
        try {
            if (class144.field3353.field158 != null) {
                class49.field884 = new class140(class144.field3353.field158, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class140.field3270[var2] = new class140(class144.field3353.field161[var2], 6000, 0);
                }
                class147.field3396 = new class140(class144.field3353.field155, 6000, 0);
                class156.field3578 = new class37(255, class49.field884, class147.field3396, 500000);
                class70.field1571 = new class140(class144.field3353.field165, 24, 0);
                class144.field3353.field165 = null;
                class144.field3353.field161 = null;
                class144.field3353.field155 = null;
                class144.field3353.field158 = null;
            }
        } catch (IOException var3) {
            class156.field3578 = null;
            class147.field3396 = null;
            class49.field884 = null;
            class70.field1571 = null;
        }
        if (class151.field3484 != 0) {
            class151.field3488 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static void method183(int arg0) {
        field431 = null;
        field446 = null;
        field447 = null;
        field420 = null;
        field437 = null;
        field443 = null;
        field425 = null;
        field441 = null;
        field438 = null;
        field439 = null;
        field427 = null;
        field421 = null;
        field453 = null;
        field440 = null;
        field455 = null;
        field419 = null;
        field450 = null;
        field430 = null;
        field422 = null;
        if (arg0 != 0) {
            return;
        }
        field442 = null;
        field423 = null;
        field451 = null;
        field454 = null;
        field452 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field449++;
        if (!this.method619(-97)) {
            return;
        }
        class142.field3335 = Integer.parseInt(this.getParameter("worldid"));
        class79.field1758 = Integer.parseInt(this.getParameter("modewhat"));
        class151.field3484 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class60.method457(true);
        } else {
            class125.method953(113);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class40.field740 = true;
        } else {
            class40.field740 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class157.method1226((byte) 2);
            class18.field319 = class66.field1484;
            class154.field3535 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class27.field523 = 1;
        } else {
            class27.field523 = 0;
        }
        try {
            class21.field395 = Integer.parseInt(this.getParameter("js"));
            class132.field3069 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class121.field2742 = this.getCodeBase().getHost();
        this.method613(470, false, 765, 503, class79.field1758 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        field418++;
        if (class73.field1641 != null) {
            class73.field1641.field2609 = false;
        }
        class73.field1641 = null;
        if (class63.field1358 != null) {
            class63.field1358.method502((byte) -1);
            class63.field1358 = null;
        }
        class53.method403(18);
        class34.method249((byte) -109);
        int var2 = -30 / ((arg0 + 20) / 41);
        class73.field1636 = null;
        if (class27.field521 != null) {
            class27.field521.method719(true);
        }
        if (class124.field2814 != null) {
            class124.field2814.method719(true);
        }
        class70.method526((byte) 122);
        class110.method849(0);
        try {
            if (class49.field884 != null) {
                class49.field884.method1146(-1);
            }
            if (class140.field3270 != null) {
                for (int var3 = 0; var3 < class140.field3270.length; var3++) {
                    if (class140.field3270[var3] != null) {
                        class140.field3270[var3].method1146(-1);
                    }
                }
            }
            if (class147.field3396 != null) {
                class147.field3396.method1146(-1);
            }
            if (class70.field1571 != null) {
                class70.field1571.method1146(-1);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method185(int arg0) {
        class29.field554++;
        field424++;
        if (class29.field554 % 1000 == 0) {
            GregorianCalendar var2 = new GregorianCalendar();
            class116.field2614 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class79.field1768.setSeed((long) class116.field2614);
        }
        this.method190(4);
        class126.method961((byte) -115);
        class128.method985(0);
        class7.method31((byte) 0);
        class37.method264(-1);
        class110.method852(arg0 ^ 0xFFFFFF90);
        if (class73.field1636 != null) {
            int var3 = class73.field1636.method12((byte) 74);
            class146.field3370 = var3;
        }
        if (class14.field282 == 0) {
            class71.method529((byte) 25);
            class104.method777((byte) 44);
        } else if (class14.field282 == 5) {
            class53.method410(113, this);
            class71.method529((byte) -119);
            class104.method777((byte) 38);
        } else if (class14.field282 == 10) {
            class53.method410(122, this);
        } else if (class14.field282 == 20) {
            class53.method410(117, this);
            class53.method407(24638);
        } else if (class14.field282 == 25) {
            class44.method317(21180);
        }
        if (class14.field282 == 30) {
            class90.method702(-3);
        } else if (class14.field282 == 40) {
            class53.method407(24638);
        }
        if (arg0 != -8) {
            this.method184(-68);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method186(boolean arg0) {
        if (!arg0) {
            field439 = null;
        }
        field435++;
        boolean var2 = class92.method716((byte) -118);
        if (var2 && class67.field1511 && class27.field521 != null) {
            class27.field521.method722(-128);
        }
        if (class106.field2409) {
            class94.method741((byte) 108, class127.field2888);
            class65.method492(18122, class127.field2888);
            if (class73.field1636 != null) {
                class73.field1636.method11((byte) 97, class127.field2888);
            }
            this.method610(6513);
            class50.method393(109, class127.field2888);
            class6.method28(class127.field2888, (byte) 83);
            if (class73.field1636 != null) {
                class73.field1636.method13((byte) -24, class127.field2888);
            }
        }
        if (class14.field282 == 0) {
            class44.method318(class14.field275, class132.field3058, null, -113);
        } else if (class14.field282 == 5) {
            class87.method679(382, class97.field2255, class124.field2815);
        } else if (class14.field282 == 10) {
            class87.method679(382, class97.field2255, class124.field2815);
        } else if (class14.field282 == 20) {
            class87.method679(382, class97.field2255, class124.field2815);
        } else if (class14.field282 == 25) {
            if (class89.field2034 == 1) {
                if (class27.field529 < field428) {
                    class27.field529 = field428;
                }
                int var3 = (class27.field529 - field428) * 50 / class27.field529;
                class63.method468(false, class51.method395(new class128[] { class27.field526, class66.field1481, class111.method857(var3, (byte) -125), class5.field47 }, false), (byte) 46);
            } else if (class89.field2034 == 2) {
                if (class147.field3402 < class49.field876) {
                    class147.field3402 = class49.field876;
                }
                int var4 = (class147.field3402 - class49.field876) * 50 / class147.field3402 + 50;
                class63.method468(false, class51.method395(new class128[] { class27.field526, class66.field1481, class111.method857(var4, (byte) 105), class5.field47 }, false), (byte) 58);
            } else {
                class63.method468(false, class27.field526, (byte) 67);
            }
        } else if (class14.field282 == 30) {
            class142.method1158(-121);
        } else if (class14.field282 == 40) {
            class63.method468(false, class51.method395(new class128[] { class35.field678, class106.field2426, class99.field2291 }, false), (byte) 41);
        }
        if (class14.field282 == 30 && class90.field2058 == 0 && !class121.field2755) {
            try {
                Graphics var5 = class127.field2888.getGraphics();
                for (int var6 = 0; var6 < class117.field2657; var6++) {
                    if (class7.field111[var6]) {
                        class5.field51.method71(var5, true, class2.field16[var6], class35.field652[var6], class122.field2772[var6], class18.field336[var6]);
                        class7.field111[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class127.field2888.repaint();
            }
        } else if (class14.field282 > 0) {
            try {
                Graphics var7 = class127.field2888.getGraphics();
                class5.field51.method66((byte) 85, 0, var7, 0);
                class121.field2755 = false;
                for (int var8 = 0; var8 < class117.field2657; var8++) {
                    class7.field111[var8] = false;
                }
            } catch (Exception var10) {
                class127.field2888.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method187(byte arg0, int arg1) {
        class123.field2789 = null;
        if (class149.field3442 == class111.field2506) {
            class111.field2506 = class9.field145;
        } else {
            class111.field2506 = class149.field3442;
        }
        class36.field692 = null;
        class149.field3425 = 0;
        class154.field3530++;
        int var3 = 74 % ((18 - arg0) / 46);
        field432++;
        if (class154.field3530 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class14.field282 <= 5) {
                this.method618(-29434, "js5connect_full");
                class14.field282 = 1000;
            } else {
                class63.field1346 = 3000;
            }
        } else if (class154.field3530 >= 2 && arg1 == 6) {
            this.method618(-29434, "js5connect_outofdate");
            class14.field282 = 1000;
        } else if (class154.field3530 >= 4) {
            if (class14.field282 > 5) {
                class63.field1346 = 3000;
            } else {
                this.method618(-29434, "js5connect");
                class14.field282 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method188(int arg0) {
        field448++;
        method183(0);
        class128.method1009(34);
        class84.method614(116);
        class89.method699(true);
        class122.method936(125);
        class116.method897(-51);
        class86.method627(-128);
        class66.method499((byte) 113);
        class6.method25((byte) -79);
        class140.method1145(21700);
        class37.method265(6);
        class51.method396(arg0 - 18642);
        class67.method513(111);
        class13.method96();
        class23.method198(1);
        class54.method419(false);
        class53.method406(-28318);
        class121.method929((byte) 63);
        class127.method967((byte) 107);
        class42.method297((byte) 79);
        class63.method469((byte) 15);
        class92.method718(50);
        class21.method177((byte) 116);
        class71.method532((byte) -68);
        class134.method1088(false);
        class50.method394(127);
        class16.method154(32188);
        class60.method455(19494);
        class143.method1164(true);
        class20.method174((byte) 43);
        class65.method487((byte) 126);
        class148.method1186((byte) 28);
        class120.method915(124);
        class78.method594();
        class136.method1119();
        class129.method1016(0);
        class150.method1194((byte) 68);
        class87.method683(4365);
        class119.method907(0);
        class141.method1155(-97);
        class95.method748(424470960);
        class156.method1224(arg0 - 19888);
        class36.method262(true);
        class75.method556(-105);
        class157.method1228(1000);
        class99.method760((byte) -27);
        class130.method1021();
        class55.method427((byte) -126);
        class147.method1182((byte) -45);
        class111.method856(false);
        class69.method522((byte) 102);
        class68.method515(126);
        class41.method294((byte) 62);
        class70.method523(arg0 ^ 0x1B7);
        class131.method1025(arg0 ^ 0xFFFFFE45);
        class49.method346(false);
        class104.method783((byte) -94);
        class144.method1171((byte) -102);
        class158.method1230((byte) 24);
        class5.method15(95);
        class25.method218(0);
        class33.method246(9602);
        class103.method774(100);
        class77.method565((byte) -53);
        class44.method320((byte) 108);
        class73.method551(arg0 ^ 0xFFFFFE44);
        class153.method1214(arg0 - 443);
        class90.method703((byte) 35);
        class138.method1132();
        if (arg0 != 443) {
            field419 = null;
        }
        class46.method342((byte) 43);
        class114.method874();
        class82.method605((byte) -33);
        class45.method326();
        class105.method787(-123);
        class19.method170(121);
        class31.method243(false);
        class146.method1180((byte) 88);
        class118.method905((byte) 106);
        class125.method956(-1);
        class94.method743(-4187);
        class64.method481(false);
        class108.method837(2);
        class112.method863(-21);
        class149.method1187(5555);
        class72.method546(-1);
        class11.method91(2);
        class93.method726(arg0 ^ 0xFFFFFE2B);
        class133.method1075();
        class115.method887(0);
        class28.method235();
        class126.method963(66);
        class29.method237((byte) -100);
        class34.method250(116);
        class12.method92(0);
        class159.method1233(128);
        class79.method596(127);
        class106.method793((byte) -37);
        class123.method941(0);
        class97.method756(arg0 ^ 0x1BA);
        class18.method165(arg0 ^ 0xFFFFFE04);
        class135.method1095(false);
        class154.method1216(101);
        class80.method602();
        class30.method240(-6359);
        class7.method35(false);
        class110.method850((byte) -123);
        class1.method3(103);
        class40.method289(-126);
        class14.method147(-124);
        class152.method1204(-113);
        class62.method465(arg0 ^ 0xBB);
        class124.method945(true);
        class35.method253(-105);
        class9.method75(-28809);
        class113.method867(-1);
        class27.method231(0);
        class155.method1223((byte) -116);
        class43.method304(arg0 ^ 0xFFFFFE2B);
        class132.method1050(arg0 ^ 0xFFFFFE77);
        class39.method282();
        class59.method450();
        class137.method1120(32768);
        class98.method757();
        class142.method1163((byte) -26);
        class102.method771((byte) -68);
        class38.method271();
        class117.method900(0);
        class2.method5(arg0 ^ 0xFFFFFE44);
        class151.method1199(-89);
        class88.method689();
        class91.method711();
        class58.method442((byte) 113);
        class100.method764((byte) -111);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsf;ILsf;)V")
    public static final void method189(class131 arg0, int arg1, class131 arg2) {
        class79.field1755 = arg0;
        class30.field587 = arg2;
        class86.field1932 = class79.field1755.method1022(-115, arg1);
        field434++;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method190(int arg0) {
        field429++;
        if (arg0 == 4 && class14.field282 != 1000) {
            boolean var2 = class36.method259((byte) 115);
            if (!var2) {
                this.method191((byte) 94);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    private final void method191(byte arg0) {
        field445++;
        if (class97.field2256 >= 4) {
            this.method618(-29434, "js5crc");
            class14.field282 = 1000;
            return;
        }
        if (class27.field525 >= 4) {
            if (class14.field282 <= 5) {
                this.method618(-29434, "js5io");
                class14.field282 = 1000;
                return;
            }
            class27.field525 = 3;
            class63.field1346 = 3000;
        }
        if (class63.field1346-- > 0) {
            return;
        }
        try {
            if (class149.field3425 == 0) {
                class36.field692 = class144.field3353.method82(class111.field2506, class121.field2742, (byte) 104);
                class149.field3425++;
            }
            if (class149.field3425 == 1) {
                if (class36.field692.field1320 == 2) {
                    this.method187((byte) 83, -1);
                    return;
                }
                if (class36.field692.field1320 == 1) {
                    class149.field3425++;
                }
            }
            if (class149.field3425 == 2) {
                class123.field2789 = new class66((Socket) class36.field692.field1319, class144.field3353);
                class86 var2 = new class86(5);
                var2.method653(15, 0);
                var2.method649(-76, 470);
                class123.field2789.method496(true, var2.field1920, 5, 0);
                class149.field3425++;
                class120.field2722 = class68.method516(false);
            }
            if (class149.field3425 == 3) {
                if (class14.field282 <= 5 || class123.field2789.method501((byte) 10) > 0) {
                    int var3 = class123.field2789.method498(-28);
                    if (var3 != 0) {
                        this.method187((byte) 125, var3);
                        return;
                    }
                    class149.field3425++;
                } else if (class68.method516(false) - class120.field2722 > 30000L) {
                    this.method187((byte) 93, -2);
                    return;
                }
            }
            if (class149.field3425 == 4) {
                class119.method908((byte) -106, class14.field282 > 20, class123.field2789);
                class149.field3425 = 0;
                class36.field692 = null;
                class154.field3530 = 0;
                class123.field2789 = null;
            }
            if (arg0 < 56) {
                this.method190(-62);
            }
        } catch (IOException var4) {
            this.method187((byte) -124, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field426++;
        try {
            if (arg0.length != 7) {
                class67.method503((byte) -122);
            }
            class142.field3335 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class151.field3484 = 0;
            } else if (arg0[1].equals("office")) {
                class151.field3484 = 1;
            } else if (arg0[1].equals("local")) {
                class151.field3484 = 2;
            } else {
                class67.method503((byte) -122);
            }
            if (arg0[2].equals("live")) {
                class79.field1758 = 0;
            } else if (arg0[2].equals("rc")) {
                class79.field1758 = 1;
            } else if (arg0[2].equals("wip")) {
                class79.field1758 = 2;
            } else {
                class67.method503((byte) -122);
            }
            if (arg0[3].equals("lowmem")) {
                class60.method457(true);
            } else if (arg0[3].equals("highmem")) {
                class125.method953(110);
            } else {
                class67.method503((byte) -122);
            }
            if (arg0[4].equals("free")) {
                class40.field740 = false;
            } else if (arg0[4].equals("members")) {
                class40.field740 = true;
            } else {
                class67.method503((byte) -122);
            }
            if (arg0[5].equals("english")) {
                class154.field3535 = 0;
            } else if (arg0[5].equals("german")) {
                class157.method1226((byte) -66);
                class154.field3535 = 1;
                class18.field319 = class66.field1484;
            } else {
                class67.method503((byte) -122);
            }
            if (arg0[6].equals("game0")) {
                class27.field523 = 0;
            } else if (arg0[6].equals("game1")) {
                class27.field523 = 1;
            } else {
                class67.method503((byte) -122);
            }
            class121.field2742 = "127.0.0.1";
            client var1 = new client();
            var1.method612(class79.field1758 + 32, 503, 16, "runescape", 470, 0, 765);
        } catch (Exception var3) {
            class116.method895(-1, var3, null);
        }
    }
}

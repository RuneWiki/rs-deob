import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class86 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lke;")
    private static class65 field378 = class1.method17("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -121);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lke;")
    private static class65 field385 = class1.method17("button near the top of that page)3", -116);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lke;")
    public static class65 field393 = class1.method17("blaugr-Un:", -118);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lke;")
    public static class65 field380 = field378;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lke;")
    private static class65 field392 = class1.method17("Offline", -123);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lke;")
    public static class65 field396 = field392;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lke;")
    public static class65 field398 = class1.method17("backright1", -119);

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lke;")
    private static class65 field404 = class1.method17("Ok", -120);

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Lke;")
    public static class65 field403 = field404;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lke;")
    public static class65 field383 = field385;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
    public static int[] field400 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field381;

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

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lkb;")
    public static class61 field405;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    public static boolean field407;

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 29)
    public final void init() {
        field387++;
        if (!this.method771(-10)) {
            return;
        }
        class102.field2651 = Integer.parseInt(this.getParameter("worldid"));
        class113.field2801 = Integer.parseInt(this.getParameter("modewhat"));
        class44.field1168 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class32.method255((byte) 55);
        } else {
            class113.method927(false);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class26.field640 = true;
        } else {
            class26.field640 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class123.method975(false);
            class53.field1343 = 1;
        }
        this.method764(418, 503, class113.field2801 + 32, 0, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZLca;)V", line = 78)
    private static final void method139(boolean arg0, boolean arg1, class13 arg2) {
        field379++;
        if (class112.field2773 != null) {
            try {
                class112.field2773.method73(112);
            } catch (Exception var8) {
            }
            class112.field2773 = null;
        }
        class112.field2773 = arg2;
        if (arg1) {
            return;
        }
        class87.method780(arg0, (byte) -112);
        class21.field504 = 0;
        class65.field1744.field998 = 0;
        class5.field98 = null;
        class114.field2839 = null;
        while (true) {
            class110 var3 = (class110) class91.field2420.method856(!arg1);
            if (var3 == null) {
                while (true) {
                    class110 var4 = (class110) class116.field2917.method856(!arg1);
                    if (var4 == null) {
                        if (class5.field95 != 0) {
                            try {
                                class39 var5 = new class39(4);
                                var5.method305(false, 4);
                                var5.method305(arg1, class5.field95);
                                var5.method310((byte) 127, 0);
                                class112.field2773.method82(4, -117, 0, var5.field994);
                            } catch (IOException var7) {
                                try {
                                    class112.field2773.method73(108);
                                } catch (Exception var6) {
                                }
                                class57.field1523++;
                                class112.field2773 = null;
                            }
                        }
                        class117.field2926 = 0;
                        class54.field1390 = System.currentTimeMillis();
                        return;
                    }
                    class123.field2990.method394((byte) -121, var4);
                    class65.field1725.method854(var4.field349, false, var4);
                    class91.field2408++;
                    class90.field2394--;
                }
            }
            class88.field2344.method854(var3.field349, arg1, var3);
            class88.field2359--;
            class125.field3053++;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)[Lkb;", line = 159)
    public static final class61[] method140(byte arg0) {
        field381++;
        class61[] var1 = new class61[class111.field2737];
        for (int var2 = 0; var2 < class111.field2737; var2++) {
            class61 var3 = var1[var2] = new class61();
            var3.field1626 = class65.field1747;
            var3.field1628 = class88.field2348;
            var3.field1625 = class99.field2582[var2];
            var3.field1627 = class12.field254[var2];
            var3.field1622 = class113.field2832[var2];
            var3.field1624 = class35.field891[var2];
            int var4 = var3.field1624 * var3.field1622;
            byte[] var5 = class58.field1561[var2];
            var3.field1623 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field1623[var6] = class53.field1366[class114.method934(255, var5[var6])];
            }
        }
        class104.method860(false);
        if (arg0 > -92) {
            field397 = 78;
        }
        return var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lke;Lke;IZ)V", line = 208)
    public static final void method141(class65 arg0, class65 arg1, int arg2, boolean arg3) {
        field389++;
        if (class5.field90) {
            class5.field90 = false;
            class91.method797((byte) -113);
            class29.method242((byte) 27);
            class89.method786(true);
            class70.method579((byte) 91);
            class4.method34(class114.field2865, true, class93.field2442, class6.field108, class55.field1422);
            class43.method374(-1, (byte) -122, class89.field2368, class66.field1767 == -1, class27.field728);
            class89.field2363 = true;
            class24.field596 = true;
            class62.field1644 = true;
        }
        short var4 = 151;
        int var6 = var4 - 3;
        class44.method376((byte) -123);
        if (arg2 != 7066) {
            return;
        }
        class55.field1422.method119(arg1, 257, var6, 0);
        class55.field1422.method119(arg1, 256, var6 - 1, 16777215);
        if (arg0 != null) {
            var6 += 15;
            if (arg3) {
                int var5 = class55.field1422.method116(arg0) + 4;
                class108.method886(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class55.field1422.method119(arg0, 257, var6, 0);
            class55.field1422.method119(arg0, 256, var6 - 1, 16777215);
        }
        class92.method800((byte) 120);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 258)
    private final void method142(byte arg0) {
        field391++;
        if (class53.field1361 >= 4) {
            this.method762("js5crc", (byte) 127);
            class19.field456 = 1000;
            return;
        }
        if (class57.field1523 >= 4) {
            if (class19.field456 <= 5) {
                this.method762("js5io", (byte) -17);
                class19.field456 = 1000;
                return;
            }
            class89.field2371 = 3000;
            class57.field1523 = 3;
        }
        if (class89.field2371-- > 0) {
            return;
        }
        try {
            if (class98.field2528 == 0) {
                class28.field750 = class72.field1891.method93(0, class113.field2827);
                class98.field2528++;
            }
            if (arg0 != -84) {
                method140((byte) -19);
            }
            if (class98.field2528 == 1) {
                if (class28.field750.field875 == 2) {
                    this.method147(-1, 120);
                    return;
                }
                if (class28.field750.field875 == 1) {
                    class98.field2528++;
                }
            }
            if (class98.field2528 == 2) {
                class20.field488 = new class13((Socket) class28.field750.field878, class72.field1891);
                class39 var2 = new class39(5);
                var2.method305(false, 15);
                var2.method351(418, -105);
                class20.field488.method82(5, arg0 + 124, 0, var2.field994);
                class98.field2528++;
                class20.field487 = System.currentTimeMillis();
            }
            if (class98.field2528 == 3) {
                if (class19.field456 <= 5 || class20.field488.method81(-22925) > 0) {
                    int var3 = class20.field488.method76(64);
                    if (var3 != 0) {
                        this.method147(var3, 9);
                        return;
                    }
                    class98.field2528++;
                } else if (System.currentTimeMillis() - class20.field487 > 30000L) {
                    this.method147(-2, arg0 + 87);
                    return;
                }
            }
            if (class98.field2528 == 4) {
                method139(class19.field456 > 20, false, class20.field488);
                class98.field2528 = 0;
                class20.field488 = null;
                class28.field750 = null;
                class12.field239 = 0;
            }
        } catch (IOException var4) {
            this.method147(-3, 95);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 388)
    public final void method143(int arg0) {
        if (arg0 >= -3) {
            return;
        }
        field390++;
        if (class19.field411) {
            class86.method770(class10.field210, 168);
            class3.method25(class10.field210, -6087);
            this.method773(-3);
            class32.method253((byte) 127, class10.field210);
            class29.method239(class10.field210, 21151);
        }
        if (class19.field456 == 0) {
            class117.method955(class24.field608, 10, null, class21.field505);
        } else if (class19.field456 == 5) {
            class81.method712(-126, class116.field2922, class27.field660);
        } else if (class19.field456 == 10) {
            class81.method712(-111, class116.field2922, class27.field660);
        } else if (class19.field456 == 20) {
            class81.method712(-95, class116.field2922, class27.field660);
        } else if (class19.field456 == 25) {
            if (class21.field497 == 1) {
                if (class21.field510 < class9.field151) {
                    class21.field510 = class9.field151;
                }
                int var3 = (class21.field510 - class9.field151) * 50 / class21.field510;
                method141(class21.method172(-104, new class65[] { class56.field1467, class39.method320(var3, (byte) -36), class114.field2837 }), class131.field3187, 7066, true);
            } else if (class21.field497 == 2) {
                if (class24.field575 > class111.field2751) {
                    class111.field2751 = class24.field575;
                }
                int var2 = (class111.field2751 - class24.field575) * 50 / class111.field2751 + 50;
                method141(class21.method172(-72, new class65[] { class56.field1467, class39.method320(var2, (byte) -36), class114.field2837 }), class131.field3187, 7066, true);
            } else {
                method141(null, class131.field3187, 7066, false);
            }
        } else if (class19.field456 == 30) {
            class76.method673(-6);
        } else if (class19.field456 == 35) {
            class24.method193(-70);
        } else if (class19.field456 == 40) {
            method141(class79.field2105, class128.field3103, 7066, false);
        }
        class26.field649 = 0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 474)
    private final void method144(int arg0) {
        field406++;
        if (class19.field456 == 1000) {
            return;
        }
        if (arg0 != -10051) {
            field404 = null;
        }
        boolean var2 = class35.method264((byte) -108);
        if (!var2) {
            this.method142((byte) -84);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 520)
    public final void method145(byte arg0) {
        field399++;
        class76.field2028++;
        this.method144(-10051);
        int var2 = -67 / ((88 - arg0) / 36);
        class72.method638(299);
        class84.method756(0);
        class20.method164((byte) -52);
        class87.method774(13063);
        class112.method915((byte) -41);
        if (class19.field456 == 0) {
            class114.method935((byte) 109);
            class27.method227(false);
        } else if (class19.field456 == 5) {
            class114.method935((byte) 119);
            class27.method227(false);
        } else if (class19.field456 == 10) {
            class93.method806(64);
        } else if (class19.field456 == 20) {
            class93.method806(92);
            class81.method711(false);
        } else if (class19.field456 == 25) {
            class65.method537(13);
        }
        if (class19.field456 == 30) {
            class46.method392(0);
        } else if (class19.field456 == 35) {
            class46.method392(0);
        } else if (class19.field456 == 40) {
            class81.method711(false);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 579)
    public final void method146(int arg0) {
        method148((byte) -77);
        field386++;
        class65.method532(true);
        class86.method763(118);
        class50.method405(false);
        class102.method845(false);
        class90.method792((byte) -79);
        class21.method173(arg0 + arg0);
        class39.method313(true);
        class13.method78(-110);
        class112.method922(80);
        class98.method822(arg0 ^ 0xFFFFFF87);
        class70.method581((byte) 126);
        class129.method1016((byte) -121);
        class73.method640(-11513);
        class16.method123();
        class71.method635();
        class83.method744(-55);
        class114.method938(71);
        class53.method416(true);
        class27.method220(arg0 ^ 0x672F);
        class125.method985(-104);
        class54.method437((byte) 98);
        class41.method369(113);
        class22.method174(true);
        class55.method447((byte) 115);
        class104.method855(arg0);
        class17.method131((byte) -96);
        class121.method974((byte) -74);
        class48.method399(0);
        class97.method814((byte) 116);
        class58.method493(arg0 ^ 0x4);
        class100.method838(false);
        class1.method1(-1);
        class37.method283();
        class4.method32(32);
        class116.method948(-53);
        class130.method1018(-6605);
        class24.method189(true);
        class66.method566(-85);
        class6.method42(117);
        class26.method215(false);
        class33.method260(arg0 ^ 0x6D);
        class31.method246(-116);
        class9.method56((byte) 39);
        class85.method760();
        class101.method840(0);
        class47.method397((byte) 57);
        class92.method803((byte) 92);
        class84.method749(arg0 + 357);
        class75.method662(60);
        class28.method235(0);
        class52.method413(-86);
        class80.method699((byte) -51);
        class46.method390((byte) 49);
        class110.method904(false);
        class89.method787(true);
        class127.method1007();
        class108.method890();
        class3.method28(-1);
        class60.method505((byte) 85);
        class32.method251(0);
        class74.method651(false);
        class115.method939(-115);
        class12.method65(4784);
        class19.method154(-108);
        class57.method457(-1);
        class117.method953((byte) 122);
        class79.method692(40);
        class78.method682(0);
        class76.method674(-63);
        class111.method907(-1);
        class59.method502();
        class51.method412((byte) 41);
        class131.method1020(true);
        class43.method372(153);
        class87.method781(~arg0);
        class123.method976(false);
        class124.method979();
        class20.method167(arg0 - 118);
        class29.method243(false);
        class64.method523(true);
        class5.method38((byte) -110);
        class99.method828(true);
        class93.method805(-78);
        class88.method783(arg0 + 12397);
        class77.method679(-100);
        class56.method456(75);
        class44.method377((byte) 42);
        class94.method807((byte) 29);
        class62.method522(19);
        class2.method21();
        class126.method993(-122);
        class40.method360();
        class10.method57(2);
        class38.method298();
        class7.method53((byte) -126);
        class81.method710(true);
        class128.method1011((byte) -105);
        class72.method636((byte) 120);
        class45.method381();
        class49.method403();
        class35.method262(arg0 + 16711935);
        class91.method798(true);
        class23.method183((byte) 34);
        class82.method718();
        class113.method929(arg0 + 12836);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 713)
    private final void method147(int arg0, int arg1) {
        class28.field750 = null;
        field388++;
        class12.field239++;
        int var3 = -73 % ((arg1 + 77) / 42);
        class98.field2528 = 0;
        if (class66.field1771 == class113.field2827) {
            class113.field2827 = class55.field1440;
        } else {
            class113.field2827 = class66.field1771;
        }
        class20.field488 = null;
        if (class12.field239 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class19.field456 > 5) {
                class89.field2371 = 3000;
            } else {
                this.method762("js5connect_full", (byte) 120);
                class19.field456 = 1000;
            }
        } else if (class12.field239 >= 2 && arg0 == 6) {
            this.method762("js5connect_outofdate", (byte) 122);
            class19.field456 = 1000;
        } else if (class12.field239 >= 4) {
            if (class19.field456 <= 5) {
                this.method762("js5connect", (byte) 122);
                class19.field456 = 1000;
            } else {
                class89.field2371 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 769)
    public static void method148(byte arg0) {
        field405 = null;
        field396 = null;
        field392 = null;
        field385 = null;
        field400 = null;
        field378 = null;
        field393 = null;
        field383 = null;
        field404 = null;
        field398 = null;
        field380 = null;
        field403 = null;
        int var1 = -127 / ((-arg0 - 35) / 41);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I", line = 790)
    public static final int method149(int arg0) {
        if (arg0 != -6) {
            field378 = null;
        }
        field384++;
        return 5;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 807)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class115.method941(1);
            }
            class102.field2651 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class44.field1168 = 0;
            } else if (arg0[1].equals("office")) {
                class44.field1168 = 1;
            } else if (arg0[1].equals("local")) {
                class44.field1168 = 2;
            } else {
                class115.method941(1);
            }
            if (arg0[2].equals("live")) {
                class113.field2801 = 0;
            } else if (arg0[2].equals("rc")) {
                class113.field2801 = 1;
            } else if (arg0[2].equals("wip")) {
                class113.field2801 = 2;
            } else {
                class115.method941(1);
            }
            if (arg0[3].equals("lowmem")) {
                class32.method255((byte) 55);
            } else if (arg0[3].equals("highmem")) {
                class113.method927(false);
            } else {
                class115.method941(1);
            }
            if (arg0[4].equals("free")) {
                class26.field640 = false;
            } else if (arg0[4].equals("members")) {
                class26.field640 = true;
            } else {
                class115.method941(1);
            }
            if (arg0[5].equals("english")) {
                class53.field1343 = 0;
            } else if (arg0[5].equals("german")) {
                class123.method975(false);
                class53.field1343 = 1;
            } else {
                class115.method941(1);
            }
            client var1 = new client();
            var1.method769("runescape", class113.field2801 + 32, 503, InetAddress.getLocalHost(), 12, 765, (byte) -92, 418);
        } catch (Exception var3) {
            class129.method1015(-112, var3, null);
        }
        field395++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 907)
    public final void method150(int arg0) {
        field394++;
        if (class13.field264 != null) {
            class13.field264.field503 = false;
        }
        class13.field264 = null;
        if (class98.field2541 != null) {
            class98.field2541.method73(96);
        }
        int var2 = 110 % ((arg0 - 17) / 48);
        class17.method126(19789);
        class33.method258((byte) 116);
        class84.method754((byte) 94);
        class23.method188(0);
        class73.method644((byte) 76);
        class117.method954(31);
        try {
            if (class88.field2343 != null) {
                class88.field2343.method820((byte) -82);
            }
            if (class10.field188 != null) {
                for (int var3 = 0; var3 < class10.field188.length; var3++) {
                    if (class10.field188[var3] != null) {
                        class10.field188[var3].method820((byte) -82);
                    }
                }
            }
            if (class102.field2645 != null) {
                class102.field2645.method820((byte) -82);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 963)
    public final void method151(boolean arg0) {
        if (!arg0) {
            return;
        }
        field401++;
        class66.field1771 = class44.field1168 == 0 ? 43594 : class102.field2651 + 40000;
        class55.field1440 = class44.field1168 == 0 ? 443 : class102.field2651 + 50000;
        class113.field2827 = class66.field1771;
        class4.method33(2347);
        class32.method253((byte) 116, class10.field210);
        class29.method239(class10.field210, 21151);
        class19.field430 = class15.field299;
        try {
            if (class72.field1891.field296 != null) {
                class88.field2343 = new class98(class72.field1891.field296, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class10.field188[var2] = new class98(class72.field1891.field304[var2], 6000, 0);
                }
                class102.field2645 = new class98(class72.field1891.field308, 6000, 0);
                class91.field2412 = new class70(255, class88.field2343, class102.field2645, 500000);
                class72.field1891.field296 = null;
                class72.field1891.field304 = null;
                class72.field1891.field308 = null;
            }
        } catch (IOException var3) {
            class91.field2412 = null;
            class102.field2645 = null;
            class88.field2343 = null;
        }
        if (class44.field1168 != 0) {
            class12.field253 = true;
        }
    }
}

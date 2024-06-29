import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class165 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[Lud;")
    public static class192[] field674 = new class192[256];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Loe;")
    public static class139 field672 = new class139(64);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljd;")
    private static class92 field680 = class202.method1325((byte) 90, "Fri");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljd;")
    private static class92 field681 = class202.method1325((byte) 90, "Sun");

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljd;")
    private static class92 field686 = class202.method1325((byte) 90, "Wed");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Ljd;")
    private static class92 field685 = class202.method1325((byte) 90, "Tue");

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljd;")
    public static class92 field689 = class202.method1325((byte) 90, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljd;")
    private static class92 field684 = class202.method1325((byte) 90, "Thu");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljd;")
    public static class92 field692 = class202.method1325((byte) 90, "title)3jpg");

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "La;")
    public static class1 field687 = null;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Ljd;")
    private static class92 field682 = class202.method1325((byte) 90, "Sat");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljd;")
    private static class92 field688 = class202.method1325((byte) 90, "Mon");

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[Ljd;")
    public static class92[] field693 = new class92[] { field681, field688, field685, field686, field684, field680, field682 };

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ldb;")
    public static class33 field683;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
    public static boolean field694;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[[[B")
    public static byte[][][] field691;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[[[I")
    public static int[][][] field675;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method190(int arg0) {
        field671++;
        if (class127.field2570 != null) {
            class127.field2570.field285 = false;
        }
        class127.field2570 = null;
        if (class66.field1334 != null) {
            class66.field1334.method319(true);
            class66.field1334 = null;
        }
        class20.method127(-1, class153.field3032);
        class159.method1026(114, class153.field3032);
        if (class125.field2534 != null) {
            class125.field2534.method379(3, class153.field3032);
        }
        class142.method937(false);
        class108.method744((byte) 114);
        class125.field2534 = null;
        if (class177.field3404 != null) {
            class177.field3404.method822(false);
        }
        if (class47.field1022 != null) {
            class47.field1022.method822(false);
        }
        class107.method730(3);
        if (arg0 > -56) {
            return;
        }
        class204.method1331(74);
        try {
            if (class195.field3819 != null) {
                class195.field3819.method777(125);
            }
            if (class121.field2451 != null) {
                for (int var2 = 0; var2 < class121.field2451.length; var2++) {
                    if (class121.field2451[var2] != null) {
                        class121.field2451[var2].method777(124);
                    }
                }
            }
            if (class150.field2983 != null) {
                class150.field2983.method777(121);
            }
            if (class55.field1153 != null) {
                class55.field1153.method777(126);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field678++;
        if (!this.method1070(0)) {
            return;
        }
        class77.field1606 = Integer.parseInt(this.getParameter("worldid"));
        class64.field1309 = Integer.parseInt(this.getParameter("modewhat"));
        class98.field1996 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class33.method213((byte) 93);
        } else {
            class105.method719((byte) 112);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class103.field2127 = true;
        } else {
            class103.field2127 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class97.method680((byte) 37);
            class3.field190 = class175.field3373;
            class72.field1532 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class45.field1006 = 1;
        } else {
            class45.field1006 = 0;
        }
        try {
            class42.field927 = Integer.parseInt(this.getParameter("js"));
            class158.field3137 = Integer.parseInt(this.getParameter("plug"));
            class90.field1769 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class86.field1714 = class130.field2613.method645(true, this);
        if (class86.field1714 == null) {
            class86.field1714 = class3.field189;
        }
        class64.field1307 = this.getCodeBase().getHost();
        this.method1067(503, class64.field1309 + 32, 488, 765, (byte) 41);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method191(boolean arg0) {
        class158.field3150++;
        field668++;
        if (class158.field3150 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class153.field3038 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class43.field952.setSeed((long) class153.field3038);
        }
        this.method197(112);
        class159.method1028(0);
        if (arg0) {
            field688 = null;
        }
        class16.method96(-127);
        class6.method42((byte) -79);
        class31.method207(79);
        class175.method1150((byte) 81);
        if (class125.field2534 != null) {
            int var3 = class125.field2534.method378(-81);
            class79.field1611 = var3;
        }
        if (class159.field3169 == 0) {
            this.method192((byte) -83);
            class6.method43((byte) -63);
        } else if (class159.field3169 == 5) {
            class81.method549(false, this);
            this.method192((byte) -127);
            class6.method43((byte) -81);
        } else if (class159.field3169 == 10) {
            class81.method549(arg0, this);
        } else if (class159.field3169 == 20) {
            class81.method549(false, this);
            class136.method910(-1949);
        } else if (class159.field3169 == 25) {
            class28.method174(77);
        }
        if (class159.field3169 == 30) {
            class73.method510(-62);
        } else if (class159.field3169 == 40) {
            class136.method910(-1949);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method192(byte arg0) {
        field666++;
        if (class20.field484 == 0) {
            class135.method903(4, 104, 104, class125.field2538);
            for (int var2 = 0; var2 < 4; var2++) {
                class32.field729[var2] = new class118(104, 104);
            }
            class139.field2784 = new class167(512, 512);
            class101.field2076 = 5;
            class20.field484 = 20;
            class3.field173 = class197.field3845;
        } else if (class20.field484 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 143;
                int var6 = class194.field3787[var5];
                int var7 = var5 * 3 + 600;
                var3[var4] = var6 * var7 >> 16;
            }
            class74.method518(var3, 500, 800, 512, 334, 25, 3500);
            class20.field484 = 30;
            class3.field173 = class39.field875;
            class101.field2076 = 10;
        } else if (class20.field484 == 30) {
            class114.field2307 = class135.method902(0, true, 1000000, true, false);
            class18.field459 = class135.method902(1, true, 1000000, true, false);
            class93.field1892 = class135.method902(2, true, 1000000, false, true);
            class84.field1690 = class135.method902(3, true, 1000000, true, false);
            class214.field4183 = class135.method902(4, true, 1000000, true, false);
            class182.field3462 = class135.method902(5, true, 1000000, true, true);
            class81.field1653 = class135.method902(6, false, 1000000, true, true);
            class29.field643 = class135.method902(7, true, 1000000, true, false);
            class58.field1220 = class135.method902(8, true, 1000000, true, false);
            class31.field700 = class135.method902(9, true, 1000000, false, true);
            class26.field593 = class135.method902(10, true, 1000000, true, false);
            class124.field2520 = class135.method902(11, true, 1000000, true, false);
            class15.field439 = class135.method902(12, true, 1000000, true, false);
            class198.field3862 = class135.method902(13, true, 1000000, false, true);
            class84.field1692 = class135.method902(14, false, 1000000, true, false);
            class18.field450 = class135.method902(15, true, 1000000, true, false);
            class155.field3090 = class135.method902(16, true, 1000000, true, false);
            class200.field3895 = class135.method902(17, true, 1000000, true, false);
            class27.field608 = class135.method902(18, true, 1000000, true, false);
            class12.field366 = class135.method902(19, true, 1000000, true, false);
            class95.field1924 = class135.method902(20, true, 1000000, true, false);
            class125.field2540 = class135.method902(21, true, 1000000, true, false);
            class144.field2870 = class135.method902(22, true, 1000000, true, false);
            class101.field2076 = 20;
            class3.field173 = class110.field2247;
            class20.field484 = 40;
        } else if (class20.field484 == 40) {
            byte var8 = 0;
            int var9 = var8 + class114.field2307.method1267(1) * 4 / 100;
            int var10 = var9 + class18.field459.method1267(1) * 4 / 100;
            int var11 = var10 + class93.field1892.method1267(1) / 100;
            int var12 = var11 + class84.field1690.method1267(1) * 2 / 100;
            int var13 = var12 + class214.field4183.method1267(1) * 6 / 100;
            int var14 = var13 + class182.field3462.method1267(1) * 4 / 100;
            int var15 = var14 + class81.field1653.method1267(1) * 2 / 100;
            int var16 = var15 + class29.field643.method1267(1) * 54 / 100;
            int var17 = var16 + class58.field1220.method1267(1) * 2 / 100;
            int var18 = var17 + class31.field700.method1267(1) * 2 / 100;
            int var19 = var18 + class26.field593.method1267(1) * 2 / 100;
            int var20 = var19 + class124.field2520.method1267(1) * 2 / 100;
            int var21 = var20 + class15.field439.method1267(1) * 2 / 100;
            int var22 = var21 + class198.field3862.method1267(1) * 2 / 100;
            int var23 = var22 + class84.field1692.method1267(1) * 2 / 100;
            int var24 = var23 + class18.field450.method1267(1) * 2 / 100;
            int var25 = var24 + class155.field3090.method1267(1) / 100;
            int var26 = var25 + class200.field3895.method1267(1) / 100;
            int var27 = var26 + class27.field608.method1267(1) / 100;
            int var28 = var27 + class12.field366.method1267(1) / 100;
            int var29 = var28 + class95.field1924.method1267(1) / 100;
            int var30 = var29 + class125.field2540.method1267(1) / 100;
            int var31 = var30 + class144.field2870.method1267(1) / 100;
            if (var31 == 100) {
                class101.field2076 = 30;
                class3.field173 = class190.field3616;
                class67.method398(class81.field1653, (byte) 88, class26.field593, class58.field1220);
                class20.field484 = 45;
            } else {
                if (var31 != 0) {
                    class3.field173 = class77.method529(-3, new class92[] { class151.field2990, class142.method938(var31, false), class113.field2278 });
                }
                class101.field2076 = 30;
            }
        } else if (class20.field484 == 45) {
            class193.method1276(2, !class115.field2339, (byte) 127, 22050);
            class190 var32 = new class190();
            var32.method1244(107, 9, 128);
            class177.field3404 = class40.method260(class153.field3032, class140.field2817, 22050, 0, 1);
            class177.field3404.method819(-99, var32);
            class36.method229(var32, class214.field4183, 0, class18.field450, class84.field1692);
            class47.field1022 = class40.method260(class153.field3032, class140.field2817, 2048, 1, 1);
            class55.field1136 = new class62();
            class47.field1022.method819(53, class55.field1136);
            class67.field1361 = new class52(22050, class175.field3378);
            class3.field173 = class200.field3899;
            class101.field2076 = 35;
            class20.field484 = 50;
        } else {
            int var33 = 115 % ((arg0 - 63) / 63);
            if (class20.field484 == 50) {
                int var34 = 0;
                if (class182.field3469 == null) {
                    class182.field3469 = class208.method1353(class63.field1281, class58.field1220, 0, class3.field189, class198.field3862);
                } else {
                    var34++;
                }
                if (class36.field833 == null) {
                    class36.field833 = class182.field3469;
                } else {
                    var34++;
                }
                if (class176.field3387 == null) {
                    class176.field3387 = class208.method1353(class33.field742, class58.field1220, 0, class3.field189, class198.field3862);
                } else {
                    var34++;
                }
                if (class4.field242 == null) {
                    class4.field242 = class208.method1353(class205.field3950, class58.field1220, 0, class3.field189, class198.field3862);
                } else {
                    var34++;
                }
                if (var34 < 4) {
                    class3.field173 = class77.method529(-3, new class92[] { class174.field3365, class142.method938(var34 * 100 / 4, false), class113.field2278 });
                    class101.field2076 = 40;
                } else {
                    class101.field2076 = 40;
                    class20.field484 = 60;
                    class3.field173 = class150.field2984;
                }
            } else if (class20.field484 == 60) {
                int var35 = class86.method575((byte) -65, class58.field1220, class26.field593);
                int var36 = class45.method283(12053);
                if (var36 > var35) {
                    class3.field173 = class77.method529(-3, new class92[] { class111.field2260, class142.method938(var35 * 100 / var36, false), class113.field2278 });
                    class101.field2076 = 50;
                } else {
                    class3.field173 = class4.field257;
                    class20.field484 = 65;
                    class101.field2076 = 50;
                }
            } else if (class20.field484 == 65) {
                class101.field2076 = 50;
                class3.field173 = class29.field645;
                class213.method1385((byte) 91, 5);
                class20.field484 = 70;
            } else if (class20.field484 == 70) {
                class93.field1892.method890((byte) 109);
                byte var37 = 0;
                int var38 = var37 + class93.field1892.method888((byte) 98);
                class155.field3090.method890((byte) 96);
                int var39 = var38 + class155.field3090.method888((byte) 98);
                class200.field3895.method890((byte) 116);
                int var40 = var39 + class200.field3895.method888((byte) 98);
                class27.field608.method890((byte) 107);
                int var41 = var40 + class27.field608.method888((byte) 98);
                class12.field366.method890((byte) 77);
                int var42 = var41 + class12.field366.method888((byte) 98);
                class95.field1924.method890((byte) 122);
                int var43 = var42 + class95.field1924.method888((byte) 98);
                class125.field2540.method890((byte) 76);
                int var44 = var43 + class125.field2540.method888((byte) 98);
                class144.field2870.method890((byte) 96);
                int var45 = var44 + class144.field2870.method888((byte) 98);
                if (var45 < 800) {
                    class3.field173 = class77.method529(-3, new class92[] { class107.field2212, class142.method938(var45 / 8, false), class113.field2278 });
                    class101.field2076 = 60;
                } else {
                    class176.method1164(class93.field1892, -75);
                    class16.method94(class93.field1892, 0);
                    class9.method61(class29.field643, 128, class93.field1892);
                    class126.method842((byte) 122, class29.field643, class115.field2339, class155.field3090);
                    class15.method91(true, class27.field608, class29.field643);
                    class175.method1153(class29.field643, (byte) 97, class36.field833, class103.field2127, class12.field366);
                    class28.method177(class18.field459, class95.field1924, class114.field2307, 0);
                    class58.method358(class29.field643, class125.field2540, (byte) 97);
                    class180.method1180(1468, class144.field2870);
                    class63.method381(class93.field1892, true);
                    class59.method362(class58.field1220, class198.field3862, (byte) 62, class84.field1690, class29.field643);
                    class105.method717(114, class93.field1892);
                    class189.method1217(class200.field3895, (byte) 79);
                    class101.field2076 = 60;
                    class3.field173 = class186.field3517;
                    class92.method603(73);
                    class20.field484 = 80;
                }
            } else if (class20.field484 == 80) {
                int var46 = 0;
                if (class100.field2056 == null) {
                    class100.field2056 = class30.method189(class124.field2533, (byte) -78, class58.field1220, class3.field189);
                } else {
                    var46++;
                }
                if (class68.field1381 == null) {
                    class68.field1381 = class126.method843(class3.field189, (byte) 80, class58.field1220, class55.field1133);
                } else {
                    var46++;
                }
                if (class70.field1442 == null) {
                    class70.field1442 = class43.method271(class3.field189, class165.field3236, 124, class58.field1220);
                } else {
                    var46++;
                }
                if (class5.field277 == null) {
                    class5.field277 = class43.method271(class3.field189, class117.field2360, -121, class58.field1220);
                } else {
                    var46++;
                }
                if (class91.field1794 == null) {
                    class91.field1794 = class43.method271(class3.field189, class159.field3157, 117, class58.field1220);
                } else {
                    var46++;
                }
                if (class121.field2457 == null) {
                    class121.field2457 = class43.method271(class3.field189, class114.field2308, 92, class58.field1220);
                } else {
                    var46++;
                }
                if (class212.field4106 == null) {
                    class212.field4106 = class43.method271(class3.field189, class103.field2128, -58, class58.field1220);
                } else {
                    var46++;
                }
                if (class108.field2235 == null) {
                    class108.field2235 = class43.method271(class3.field189, class74.field1562, 122, class58.field1220);
                } else {
                    var46++;
                }
                if (class45.field996 == null) {
                    class45.field996 = class43.method271(class3.field189, class49.field1077, 96, class58.field1220);
                } else {
                    var46++;
                }
                if (class211.field4086 == null) {
                    class211.field4086 = class30.method189(class129.field2595, (byte) -116, class58.field1220, class3.field189);
                } else {
                    var46++;
                }
                if (class155.field3092 == null) {
                    class155.field3092 = class43.method271(class3.field189, class131.field2624, 120, class58.field1220);
                } else {
                    var46++;
                }
                if (class36.field835 == null) {
                    class36.field835 = class43.method271(class3.field189, class177.field3407, -37, class58.field1220);
                } else {
                    var46++;
                }
                if (class10.field359 == null) {
                    class10.field359 = class126.method843(class3.field189, (byte) 115, class58.field1220, class3.field168);
                } else {
                    var46++;
                }
                if (class114.field2305 == null) {
                    class114.field2305 = class126.method843(class3.field189, (byte) 45, class58.field1220, class16.field447);
                } else {
                    var46++;
                }
                if (class13.field384 == null) {
                    class13.field384 = class126.method843(class3.field189, (byte) 39, class58.field1220, class170.field3327);
                } else {
                    var46++;
                }
                if (var46 < 15) {
                    class3.field173 = class77.method529(-3, new class92[] { class159.field3161, class142.method938(var46 * 100 / 13, false), class113.field2278 });
                    class101.field2076 = 70;
                } else {
                    class182.field3469.method1006(class114.field2305, null);
                    class176.field3387.method1006(class114.field2305, null);
                    class4.field242.method1006(class114.field2305, null);
                    if (class36.field833 != class182.field3469) {
                        class36.field833.method1006(class114.field2305, null);
                    }
                    for (int var47 = 0; var47 < class45.field996.length; var47++) {
                        class45.field996[var47].method1105();
                    }
                    for (int var48 = 0; var48 < class13.field384.length; var48++) {
                        class13.field384[var48].method1147();
                    }
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    class100.field2056.method1105();
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < class70.field1442.length; var53++) {
                        class70.field1442[var53].method1110(var49 + var52, var50 + var52, var51 + var52);
                    }
                    class68.field1381[0].method1142(var49 + var52, var50 + var52, var51 + var52);
                    class3.field173 = class200.field3891;
                    class101.field2076 = 70;
                    class20.field484 = 90;
                }
            } else if (class20.field484 == 90) {
                if (class31.field700.method890((byte) 94)) {
                    class26 var54 = new class26(class31.field700, class58.field1220, 20, class115.field2339 ? 64 : 128);
                    class194.method1288(var54);
                    class194.method1297(0.7F);
                    class3.field173 = class187.field3546;
                    class101.field2076 = 90;
                    class20.field484 = 110;
                } else {
                    class3.field173 = class77.method529(-3, new class92[] { class3.field187, class142.method938(class31.field700.method888((byte) 98), false), class113.field2278 });
                    class101.field2076 = 90;
                }
            } else if (class20.field484 == 110) {
                class127.field2570 = new class6();
                class140.field2817.method1125(class127.field2570, 10, 17258);
                class20.field484 = 120;
                class3.field173 = class101.field2077;
                class101.field2076 = 94;
            } else if (class20.field484 == 120) {
                if (class26.field593.method876(class179.field3430, class3.field189, 123)) {
                    class180 var55 = new class180(class26.field593.method883(class179.field3430, class3.field189, 0));
                    class104.method716(var55, -49);
                    class20.field484 = 130;
                    class101.field2076 = 96;
                    class3.field173 = class75.field1566;
                } else {
                    class3.field173 = class77.method529(-3, new class92[] { class189.field3599, class51.field1084 });
                    class101.field2076 = 96;
                }
            } else if (class20.field484 == 130) {
                if (!class84.field1690.method890((byte) 118)) {
                    class3.field173 = class77.method529(-3, new class92[] { class123.field2475, class142.method938(class84.field1690.method888((byte) 98) * 4 / 5, false), class113.field2278 });
                    class101.field2076 = 100;
                } else if (!class15.field439.method890((byte) 100)) {
                    class3.field173 = class77.method529(-3, new class92[] { class123.field2475, class142.method938(class15.field439.method888((byte) 98) / 6 + 80, false), class113.field2278 });
                    class101.field2076 = 100;
                } else if (class198.field3862.method890((byte) 80)) {
                    class101.field2076 = 100;
                    class3.field173 = class64.field1296;
                    class20.field484 = 140;
                } else {
                    class3.field173 = class77.method529(-3, new class92[] { class123.field2475, class142.method938(class198.field3862.method888((byte) 98) / 20 + 96, false), class113.field2278 });
                    class101.field2076 = 100;
                }
            } else if (class20.field484 == 140) {
                class182.field3462.method875(true, -2760, false);
                class81.field1653.method875(true, -2760, true);
                class58.field1220.method875(true, -2760, true);
                class198.field3862.method875(true, -2760, true);
                class26.field593.method875(true, -2760, true);
                class213.method1385((byte) 79, 10);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field681 = null;
        field685 = null;
        field682 = null;
        field686 = null;
        field692 = null;
        field687 = null;
        field680 = null;
        field689 = null;
        if (arg0 != -2) {
            return;
        }
        field672 = null;
        field683 = null;
        field674 = null;
        field684 = null;
        field693 = null;
        field688 = null;
        field691 = null;
        field675 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method194(int arg0, int arg1) {
        class152.field3010 = null;
        field677++;
        class18.field452 = null;
        if (class135.field2708 == class102.field2097) {
            class135.field2708 = class162.field3178;
        } else {
            class135.field2708 = class102.field2097;
        }
        class162.field3184 = 0;
        class3.field186++;
        if (class3.field186 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class159.field3169 > 5) {
                class189.field3582 = 3000;
            } else {
                this.method1071((byte) -99, "js5connect_full");
                class159.field3169 = 1000;
            }
        } else if (class3.field186 >= 2 && arg1 == 6) {
            this.method1071((byte) -73, "js5connect_outofdate");
            class159.field3169 = 1000;
        } else if (class3.field186 >= 4) {
            if (class159.field3169 > 5) {
                class189.field3582 = 3000;
            } else {
                this.method1071((byte) -86, "js5connect");
                class159.field3169 = 1000;
            }
        }
        if (arg0 != -20653) {
            field692 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method195(int arg0) {
        method193((byte) -2);
        class92.method619(true);
        class165.method1077(22547);
        field673++;
        class175.method1152(false);
        class84.method568(arg0 ^ 0x7F4E);
        class6.method44(true);
        class205.method1338(true);
        class70.method452((byte) 82);
        class55.method323(31876);
        class192.method1272(-16278);
        class115.method779(-16561);
        class108.method743((byte) -121);
        class129.method853((byte) -86);
        class68.method399((byte) 100);
        class118.method801(128);
        class1.method12((byte) -125);
        class91.method602((byte) 37);
        class18.method98(0);
        class33.method211((byte) 51);
        class63.method380(arg0 + 42071);
        class39.method255(0);
        class142.method936((byte) 19);
        class123.method823(true);
        class86.method581(false);
        class22.method139(arg0 ^ 0xFFFF80C9);
        class4.method31(arg0 + 32613);
        class102.method700(true);
        class97.method672((byte) 113);
        class105.method721(-127);
        class210.method1367((byte) -119);
        class198.method1315(10455);
        class80.method545((byte) -128);
        class139.method921(-127);
        class38.method239();
        class76.method525(-22763);
        class127.method848(arg0 + 32788);
        class69.method409(65536);
        class43.method273(arg0 + 32598);
        class185.method1202((byte) -122);
        class13.method84((byte) 65);
        class186.method1205((byte) -87);
        class48.method297((byte) -92);
        class138.method919(arg0 ^ 0xFFFF808C);
        class28.method180(-19308);
        class57.method331();
        class59.method363(arg0 ^ 0xFFFFA4DA);
        class82.method554();
        class177.method1166((byte) 75);
        class88.method588(false);
        class196.method1303(-1);
        class65.method388(-1);
        class168.method1115(0);
        class77.method526(4);
        class79.method540(false);
        class133.method897(true);
        class190.method1253((byte) -100);
        class172.method1140((byte) 115);
        class95.method665(false);
        class189.method1215(arg0 + 32575);
        class32.method208(arg0 ^ 0x7F41);
        class90.method596(1);
        class3.method23((byte) 71);
        class114.method768(-12);
        class176.method1158(true);
        class153.method977(1);
        class132.method871(-32276);
        class211.method1373(false);
        class2.method17(arg0 ^ 0xFFFF808E);
        class163.method1036();
        class125.method841(-120);
        class194.method1283();
        class188.method1209(3);
        class19.method110();
        class121.method812(-38);
        class124.method832(-115);
        class202.method1326(118);
        class89.method593((byte) 78);
        class143.method943(-14264);
        class10.method72(60);
        class214.method1392(98);
        class96.method668(true);
        class107.method740((byte) 73);
        class191.method1257();
        class47.method295((byte) 94);
        class64.method384((byte) 36);
        class5.method37(-85);
        class29.method183(-15297);
        class111.method752(0);
        class164.method1055((byte) 101);
        class154.method993();
        class26.method160(0);
        class197.method1308(1);
        class180.method1182(22968);
        class159.method1025(0);
        class155.method1010(arg0 ^ 0xFF7391DA);
        class110.method751(125);
        class116.method784(95);
        class187.method1207(-14789);
        class120.method809(-27912);
        class135.method905(arg0 ^ 0x50C0);
        class131.method863((byte) 121);
        class156.method1012(118);
        class204.method1334(false);
        class53.method313(-27322);
        class149.method964();
        class35.method226((byte) 104);
        class42.method264(false);
        class130.method859(arg0 ^ 0x40CE);
        class87.method585((byte) -76);
        class34.method222(arg0 - 302849866);
        class16.method95(1);
        class162.method1035(arg0 + 623);
        class166.method1079(122);
        class119.method808((byte) -42);
        class46.method290((byte) 58);
        class212.method1375(arg0 ^ arg0);
        class157.method1015(arg0 + 54240);
        class104.method715(13271);
        class44.method277(16711680);
        class27.method173(false);
        class7.method48((byte) -118);
        class83.method556();
        class184.method1198();
        class25.method159((byte) -89);
        class117.method785(1536);
        class128.method851();
        class147.method959(true);
        class45.method282((byte) -90);
        class150.method969(arg0 + 32550);
        class78.method531();
        class100.method697(79);
        class58.method355(103);
        class140.method934(106);
        class24.method156();
        class178.method1177();
        class179.method1178(false);
        class61.method366(-111);
        class93.method655((byte) 70);
        class152.method975((byte) 112);
        class101.method699(arg0 ^ 0x7F34);
        class98.method686(arg0 + 62990);
        class81.method550(24704);
        class137.method912(126);
        class209.method1356(1);
        class136.method906(false);
        class60.method365(123);
        class30.method187(-111);
        class49.method304(1895496720);
        class14.method85(false);
        class9.method60(false);
        class151.method971(35);
        class15.method89(4096);
        class200.method1323((byte) -2);
        class40.method257(0);
        class158.method1022(-121);
        class170.method1131(arg0 ^ 0x7F4C);
        class54.method316(arg0 + 32820);
        class182.method1193(false);
        class148.method963((byte) 123);
        class193.method1280((byte) -37);
        class146.method956(64);
        class21.method132(-3728);
        class74.method517(14418);
        class67.method397(arg0 ^ 0xFFFF80CB);
        class12.method78(-34);
        class41.method261(-30812);
        class174.method1149(0);
        class206.method1341((byte) 103);
        class72.method509((byte) -11);
        class213.method1379(1);
        class126.method845((byte) -73);
        class36.method228((byte) -123);
        class99.method689(arg0 ^ 0x7F5A);
        class195.method1299(false);
        class73.method512((byte) 14);
        class94.method658(32755);
        class207.method1347(-26593);
        class66.method392(true);
        class144.method947((byte) -97);
        class75.method520((byte) 110);
        class103.method706(arg0 + 1417676641);
        class113.method761(arg0 ^ 0xFFFF80B3);
        class208.method1351(arg0 ^ 0x7F34);
        class51.method307((byte) -28);
        class20.method126((byte) -125);
        class31.method200(arg0 + 32577);
        if (class165.field3257) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method196(byte arg0) {
        if (class45.field1006 == 1) {
            class40.field908 = class30.field653;
            class88.field1743 = class166.field3270;
            class118.field2385 = class95.field1922;
            class207.field3985 = class20.field490;
        } else {
            class88.field1743 = class43.field967;
            class207.field3985 = class53.field1110;
            class40.field908 = class133.field2679;
            class118.field2385 = class102.field2107;
        }
        field667++;
        class102.field2097 = class98.field1996 == 0 ? 43594 : class77.field1606 + 40000;
        class135.field2708 = class102.field2097;
        class162.field3178 = class98.field1996 == 0 ? 443 : class77.field1606 + 50000;
        class127.method847(arg0 ^ 0x3D);
        class172.method1134(class153.field3032, arg0 - 16);
        class144.method952((byte) -121, class153.field3032);
        if (arg0 != 16) {
            return;
        }
        class125.field2534 = class5.method36(arg0 ^ 0x3EF);
        if (class125.field2534 != null) {
            class125.field2534.method377(class153.field3032, (byte) 62);
        }
        class67.field1351 = class169.field3299;
        try {
            if (class140.field2817.field3307 != null) {
                class195.field3819 = new class115(class140.field2817.field3307, 5200, 0);
                for (int var2 = 0; var2 < 23; var2++) {
                    class121.field2451[var2] = new class115(class140.field2817.field3304[var2], 6000, 0);
                }
                class150.field2983 = new class115(class140.field2817.field3300, 6000, 0);
                class46.field1015 = new class108(255, class195.field3819, class150.field2983, 500000);
                class55.field1153 = new class115(class140.field2817.field3306, 24, 0);
                class140.field2817.field3300 = null;
                class140.field2817.field3306 = null;
                class140.field2817.field3307 = null;
                class140.field2817.field3304 = null;
            }
        } catch (IOException var3) {
            class46.field1015 = null;
            class195.field3819 = null;
            class55.field1153 = null;
            class150.field2983 = null;
        }
        if (class98.field1996 != 0) {
            class30.field650 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method197(int arg0) {
        int var2 = -21 / ((-arg0 - 45) / 50);
        field679++;
        if (class159.field3169 != 1000) {
            boolean var3 = class164.method1058(4);
            if (!var3) {
                this.method198(-42);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method198(int arg0) {
        field670++;
        if (class76.field1579 >= 4) {
            this.method1071((byte) -78, "js5crc");
            class159.field3169 = 1000;
            return;
        }
        if (class43.field975 >= 4) {
            if (class159.field3169 <= 5) {
                this.method1071((byte) -47, "js5io");
                class159.field3169 = 1000;
                return;
            }
            class189.field3582 = 3000;
            class43.field975 = 3;
        }
        if (class189.field3582-- > 0) {
            return;
        }
        try {
            if (arg0 < -32) {
                if (class162.field3184 == 0) {
                    class152.field3010 = class140.field2817.method1123(class64.field1307, 0, class135.field2708);
                    class162.field3184++;
                }
                if (class162.field3184 == 1) {
                    if (class152.field3010.field3476 == 2) {
                        this.method194(-20653, -1);
                        return;
                    }
                    if (class152.field3010.field3476 == 1) {
                        class162.field3184++;
                    }
                }
                if (class162.field3184 == 2) {
                    class18.field452 = new class55((Socket) class152.field3010.field3474, class140.field2817);
                    class70 var2 = new class70(5);
                    var2.method428(15, 114);
                    var2.method446(488, -26751);
                    class18.field452.method324(0, var2.field1493, 5, 2084);
                    class162.field3184++;
                    class42.field929 = class168.method1118(1);
                }
                if (class162.field3184 == 3) {
                    if (class159.field3169 <= 5 || class18.field452.method326(0) > 0) {
                        int var3 = class18.field452.method321(-121);
                        if (var3 != 0) {
                            this.method194(-20653, var3);
                            return;
                        }
                        class162.field3184++;
                    } else if (class168.method1118(1) - class42.field929 > 30000L) {
                        this.method194(-20653, -2);
                        return;
                    }
                }
                if (class162.field3184 == 4) {
                    class198.method1313(class159.field3169 > 20, 4, class18.field452);
                    class18.field452 = null;
                    class162.field3184 = 0;
                    class152.field3010 = null;
                    class3.field186 = 0;
                }
            }
        } catch (IOException var4) {
            this.method194(-20653, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class146.method957(1);
            }
            class77.field1606 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class98.field1996 = 0;
            } else if (arg0[1].equals("office")) {
                class98.field1996 = 1;
            } else if (arg0[1].equals("local")) {
                class98.field1996 = 2;
            } else {
                class146.method957(1);
            }
            if (arg0[2].equals("live")) {
                class64.field1309 = 0;
            } else if (arg0[2].equals("rc")) {
                class64.field1309 = 1;
            } else if (arg0[2].equals("wip")) {
                class64.field1309 = 2;
            } else {
                class146.method957(1);
            }
            if (arg0[3].equals("lowmem")) {
                class33.method213((byte) 93);
            } else if (arg0[3].equals("highmem")) {
                class105.method719((byte) 23);
            } else {
                class146.method957(1);
            }
            if (arg0[4].equals("free")) {
                class103.field2127 = false;
            } else if (arg0[4].equals("members")) {
                class103.field2127 = true;
            } else {
                class146.method957(1);
            }
            if (arg0[5].equals("english")) {
                class72.field1532 = 0;
            } else if (arg0[5].equals("german")) {
                class97.method680((byte) 37);
                class72.field1532 = 1;
                class3.field190 = class175.field3373;
            } else {
                class146.method957(1);
            }
            if (arg0[6].equals("game0")) {
                class45.field1006 = 0;
            } else if (arg0[6].equals("game1")) {
                class45.field1006 = 1;
            } else {
                class146.method957(1);
            }
            class90.field1769 = 0;
            class64.field1307 = "127.0.0.1";
            class86.field1714 = class3.field189;
            client var1 = new client();
            var1.method1074("runescape", 765, 1, 23, 503, 488, class64.field1309 + 32);
            class187.field3539.setLocation(40, 40);
        } catch (Exception var3) {
            class164.method1059(null, var3, 106);
        }
        field676++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method199(int arg0) {
        field669++;
        boolean var2 = class176.method1162(false);
        if (var2 && class118.field2399 && class177.field3404 != null) {
            class177.field3404.method820(23620);
        }
        if (class70.field1481) {
            class20.method127(arg0 ^ 0xFFFFDCB6, class153.field3032);
            class159.method1026(99, class153.field3032);
            if (class125.field2534 != null) {
                class125.field2534.method379(arg0 ^ 0x234A, class153.field3032);
            }
            this.method1069((byte) -45);
            class172.method1134(class153.field3032, 0);
            class144.method952((byte) -109, class153.field3032);
            if (class125.field2534 != null) {
                class125.field2534.method377(class153.field3032, (byte) 50);
            }
        }
        if (arg0 != 9033) {
            this.method192((byte) 63);
        }
        if (class159.field3169 == 0) {
            class30.method188(33, null, class3.field173, class101.field2076);
        } else if (class159.field3169 == 5) {
            class155.method1009(arg0 - 8960, class182.field3469, class4.field242);
        } else if (class159.field3169 == 10) {
            class155.method1009(arg0 - 8960, class182.field3469, class4.field242);
        } else if (class159.field3169 == 20) {
            class155.method1009(73, class182.field3469, class4.field242);
        } else if (class159.field3169 == 25) {
            if (class51.field1085 == 1) {
                if (class66.field1336 > class135.field2701) {
                    class135.field2701 = class66.field1336;
                }
                int var3 = (class135.field2701 - class66.field1336) * 50 / class135.field2701;
                class15.method93((byte) -90, false, class77.method529(-3, new class92[] { class143.field2846, class136.field2733, class142.method938(var3, false), class151.field2998 }));
            } else if (class51.field1085 == 2) {
                if (class210.field4075 < class29.field638) {
                    class210.field4075 = class29.field638;
                }
                int var4 = (class210.field4075 - class29.field638) * 50 / class210.field4075 + 50;
                class15.method93((byte) -90, false, class77.method529(-3, new class92[] { class143.field2846, class136.field2733, class142.method938(var4, false), class151.field2998 }));
            } else {
                class15.method93((byte) -90, false, class143.field2846);
            }
        } else if (class159.field3169 == 30) {
            class63.method376(arg0 ^ 0xFFFF9DE2);
        } else if (class159.field3169 == 40) {
            class15.method93((byte) -90, false, class77.method529(arg0 ^ 0xFFFFDCB4, new class92[] { class46.field1018, class27.field612, class76.field1580 }));
        }
        if (class159.field3169 == 30 && class142.field2832 == 0 && !class10.field363) {
            try {
                Graphics var7 = class153.field3032.getGraphics();
                for (int var8 = 0; var8 < class66.field1346; var8++) {
                    if (class42.field942[var8]) {
                        class77.field1605.method569(class135.field2703[var8], class74.field1564[var8], var7, class206.field3963[var8], (byte) -116, class190.field3653[var8]);
                        class42.field942[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class153.field3032.repaint();
            }
        } else if (class159.field3169 > 0) {
            try {
                Graphics var5 = class153.field3032.getGraphics();
                class77.field1605.method566(88, var5, 0, 0);
                class10.field363 = false;
                for (int var6 = 0; var6 < class66.field1346; var6++) {
                    class42.field942[var6] = false;
                }
            } catch (Exception var10) {
                class153.field3032.repaint();
            }
        }
    }
}

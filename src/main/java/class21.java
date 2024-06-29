import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 extends class119 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Lkc;")
    private static class67 field425 = class19.method144("Suche nach Updates )2 ", 79);

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Lkc;")
    public static class67 field426 = class19.method144("@or3@", 86);

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "[[[B")
    public static byte[][][] field443 = new byte[4][104][104];

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Lkc;")
    private static class67 field440 = class19.method144("Nehmen", 115);

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field438 = -1;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "[I")
    public static int[] field439 = new int[5];

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    public static boolean field434 = false;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
    public static boolean field427 = false;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Lkc;")
    private static class67 field432 = class19.method144("Members object", 90);

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Lkc;")
    public static class67 field444 = field432;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Lkc;")
    private static class67 field433 = class19.method144("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 97);

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field441;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field436;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhd;B)V", line = 8)
    public static final void method158(class50 arg0, byte arg1) {
        ++field428;
        if (~arg0.field1249 != -1) {
            if (~arg0.field1200 != 0 && ~arg0.field1200 > -32769) {
                class66 var2 = class9.field189[arg0.field1200];
                if (var2 != null) {
                    int var3 = arg0.field1260 - var2.field1260;
                    int var4 = arg0.field1190 - var2.field1190;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg0.field1218 = 2047 & (int) (325.949D * Math.atan2((double) var3, (double) var4));
                    }
                }
            }
            if (arg0.field1200 >= 32768) {
                int var5 = arg0.field1200 + -32768;
                if (~class22.field485 == ~var5) {
                    var5 = 2047;
                }
                class103 var6 = class44.field1067[var5];
                if (var6 != null) {
                    int var7 = -var6.field1260 + arg0.field1260;
                    int var8 = -var6.field1190 + arg0.field1190;
                    if (~var7 != -1 || ~var8 != -1) {
                        arg0.field1218 = (int) (325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
                    }
                }
            }
            if ((arg0.field1248 != 0 || arg0.field1225 != 0) && (~arg0.field1201 == -1 || arg0.field1189 > 0)) {
                int var9 = -((-class32.field685 + arg0.field1248 + -class32.field685) * 64) + arg0.field1260;
                int var10 = -((-class30.field640 + -class30.field640 + arg0.field1225) * 64) + arg0.field1190;
                if (~var9 != -1 || ~var10 != -1) {
                    arg0.field1218 = (int) (325.949D * Math.atan2((double) var9, (double) var10)) & 2047;
                }
                arg0.field1248 = 0;
                arg0.field1225 = 0;
            }
            int var11 = 2047 & -arg0.field1199 + arg0.field1218;
            if (arg1 > -74) {
                method164((byte) 75);
            }
            if (var11 == 0) {
                arg0.field1209 = 0;
            } else {
                ++arg0.field1209;
                if (var11 > 1024) {
                    arg0.field1199 -= arg0.field1249;
                    boolean var12 = true;
                    if (arg0.field1249 > var11 || var11 > -arg0.field1249 + 2048) {
                        var12 = false;
                        arg0.field1199 = arg0.field1218;
                    }
                    if (~arg0.field1254 == ~arg0.field1233 && (~arg0.field1209 < -26 || var12)) {
                        if (~arg0.field1220 != 0) {
                            arg0.field1233 = arg0.field1220;
                        } else {
                            arg0.field1233 = arg0.field1237;
                        }
                    }
                } else {
                    arg0.field1199 += arg0.field1249;
                    boolean var13 = true;
                    if (~arg0.field1249 < ~var11 || ~var11 < ~(2048 - arg0.field1249)) {
                        arg0.field1199 = arg0.field1218;
                        var13 = false;
                    }
                    if (arg0.field1254 == arg0.field1233 && (~arg0.field1209 < -26 || var13)) {
                        if (arg0.field1197 == -1) {
                            arg0.field1233 = arg0.field1237;
                        } else {
                            arg0.field1233 = arg0.field1197;
                        }
                    }
                }
                arg0.field1199 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 139)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field447;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V", line = 150)
    public final void method159(Component arg0, int arg1, boolean arg2, int arg3) {
        super.field2812 = arg1;
        super.field2807 = new int[arg1 * arg3 + 1];
        ++field446;
        super.field2802 = arg3;
        this.field441 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2814 = arg0.createImage(this);
        this.method160(0);
        arg0.prepareImage(super.field2814, this);
        if (arg2) {
            field438 = 86;
        }
        this.method160(0);
        arg0.prepareImage(super.field2814, this);
        this.method160(0);
        arg0.prepareImage(super.field2814, this);
        this.method939((byte) -53);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 172)
    private final synchronized void method160(int arg0) {
        ++field445;
        if (this.field436 != null) {
            if (arg0 != 0) {
                field425 = null;
            }
            this.field436.setPixels(0, 0, super.field2812, super.field2802, this.field441, super.field2807, 0, super.field2812);
            this.field436.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 193)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field437;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)V", line = 209)
    public static final void method161(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field451;
        if (class29.field614 != arg2 || ~class88.field2022 != ~arg3 || class19.field364 != arg5 && class45.field1105) {
            class19.field364 = arg5;
            class88.field2022 = arg3;
            class29.field614 = arg2;
            if (!class45.field1105) {
                class19.field364 = 0;
            }
            class126.method981(25, (byte) -120);
            class108.method827(false, (class67) null, class19.field373, -8038);
            int var6 = class32.field685;
            class32.field685 = arg2 * 8 - 48;
            int var7 = -var6 + class32.field685;
            int var8 = class30.field640;
            int var9 = class32.field685;
            class30.field640 = arg3 * 8 + -48;
            int var10 = -var8 + class30.field640;
            int var11 = class30.field640;
            int var12 = -58 / ((15 - arg4) / 51);
            for (int var13 = 0; var13 < 32768; ++var13) {
                class66 var29 = class9.field189[var13];
                if (var29 != null) {
                    for (int var30 = 0; var30 < 10; ++var30) {
                        var29.field1198[var30] -= var7;
                        var29.field1263[var30] -= var10;
                    }
                    var29.field1190 -= var10 * 128;
                    var29.field1260 -= var7 * 128;
                }
            }
            for (int var14 = 0; var14 < 2048; ++var14) {
                class103 var27 = class44.field1067[var14];
                if (var27 != null) {
                    for (int var28 = 0; var28 < 10; ++var28) {
                        var27.field1198[var28] -= var7;
                        var27.field1263[var28] -= var10;
                    }
                    var27.field1260 -= var7 * 128;
                    var27.field1190 -= var10 * 128;
                }
            }
            class112.field2593 = arg5;
            byte var15 = 0;
            byte var16 = 104;
            class69.field1640.method415(arg0, arg1, false, false);
            byte var17 = 0;
            byte var18 = 104;
            byte var19 = 1;
            byte var20 = 1;
            if (var10 < 0) {
                var17 = 103;
                var18 = -1;
                var20 = -1;
            }
            if (~var7 > -1) {
                var19 = -1;
                var15 = 103;
                var16 = -1;
            }
            for (int var21 = var15; var16 != var21; var21 += var19) {
                for (int var23 = var17; ~var18 != ~var23; var23 += var20) {
                    int var24 = var7 + var21;
                    int var25 = var10 + var23;
                    for (int var26 = 0; ~var26 > -5; ++var26) {
                        if (var24 >= 0 && ~var25 <= -1 && var24 < 104 && ~var25 > -105) {
                            class4.field67[var26][var21][var23] = class4.field67[var26][var24][var25];
                        } else {
                            class4.field67[var26][var21][var23] = null;
                        }
                    }
                }
            }
            for (class54 var22 = (class54) class49.field1174.method83(64); var22 != null; var22 = (class54) class49.field1174.method81(-60)) {
                var22.field1287 -= var7;
                var22.field1294 -= var10;
                if (var22.field1287 < 0 || ~var22.field1294 > -1 || ~var22.field1287 <= -105 || ~var22.field1294 <= -105) {
                    var22.method13(111);
                }
            }
            class138.field3303 = 0;
            class106.field2420 = false;
            if (~class29.field609 != -1) {
                class96.field2174 -= var10;
                class29.field609 -= var7;
            }
            class60.field1411 = -1;
            class88.field2026.method87((byte) -80);
            class74.field1769.method87((byte) -101);
        }
    }

    @OriginalMember(owner = "client!cf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 393)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field442;
        this.field436 = arg0;
        arg0.setDimensions(super.field2812, super.field2802);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field441);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 406)
    public final void method162(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method160(arg0 + 1);
        if (arg0 != -1) {
            this.removeConsumer((ImageConsumer) null);
        }
        arg2.drawImage(super.field2814, arg1, arg3, this);
        ++field449;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 419)
    public static void method163(int arg0) {
        field444 = null;
        field426 = null;
        field433 = null;
        if (arg0 != 447) {
            method163(88);
        }
        field440 = null;
        field432 = null;
        field425 = null;
        field443 = null;
        field439 = null;
    }

    @OriginalMember(owner = "client!cf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 436)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field450;
        return this.field436 == arg0;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V", line = 472)
    public static final void method164(byte arg0) {
        class116.field2746 = class84.field1988;
        class19.field362 = field425;
        class70.field1668 = class101.field2270;
        class77.field1823 = class33.field817;
        class55.field1346 = class103.field2324;
        class109.field2478 = class131.field3099;
        ++field448;
        class94.field2147 = class14.field307;
        class141.field3392 = class104.field2344;
        class73.field1702 = class140.field3363;
        class85.field1999 = class93.field2127;
        class12.field265 = class90.field2081;
        class7.field172 = class93.field2123;
        class138.field3295 = class9.field190;
        class74.field1772 = class48.field1155;
        class114.field2695 = class58.field1382;
        class88.field2029 = class5.field127;
        class109.field2510 = class122.field2876;
        class117.field2756 = class114.field2684;
        class114.field2675 = class49.field1186;
        class109.field2507 = class131.field3099;
        class30.field636 = class90.field2064;
        class44.field1065 = class1.field13;
        field444 = class29.field608;
        class18.field350 = class100.field2237;
        class41.field1010 = class58.field1376;
        class30.field635 = class85.field2007;
        class100.field2256 = class85.field2006;
        class52.field1275 = class134.field3196;
        class133.field3163 = class108.field2436;
        class71.field1681 = class50.field1245;
        class109.field2479 = class122.field2895;
        class44.field1088 = class46.field1112;
        class25.field546 = class12.field281;
        class14.field298 = class25.field537;
        class109.field2508 = class131.field3099;
        class109.field2511 = class131.field3099;
        class66.field1559 = class20.field416;
        class77.field1829 = class99.field2223;
        class108.field2447 = class91.field2117;
        class34.field832 = class7.field149;
        class30.field646 = class131.field3108;
        class38.field871 = class38.field876;
        class109.field2490 = class84.field1990;
        class5.field117 = class49.field1180;
        class109.field2516 = class131.field3099;
        class121.field2844 = class74.field1775;
        class71.field1678 = class114.field2668;
        class116.field2732 = class102.field2296;
        class109.field2512 = class102.field2296;
        class109.field2509 = class131.field3099;
        class109.field2485 = class55.field1348;
        class109.field2515 = class131.field3099;
        class97.field2209 = class24.field515;
        class94.field2152 = class117.field2791;
        class109.field2499 = class112.field2587;
        class109.field2491 = class94.field2157;
        class75.field1784 = class90.field2070;
        class12.field279 = class61.field1447;
        class128.field2991 = class67.field1608;
        class109.field2495 = class102.field2293;
        class5.field96 = class11.field242;
        class5.field133 = class129.field3027;
        class29.field602 = class80.field1876;
        class99.field2229 = class31.field673;
        class125.field2925 = class73.field1714;
        class69.field1638 = class100.field2253;
        class61.field1455 = class112.field2561;
        class49.field1185 = class12.field268;
        class12.field274 = field433;
        class104.field2341 = class78.field1853;
        class109.field2488 = class131.field3099;
        class7.field167 = class59.field1389;
        client.field470 = class98.field2217;
        class81.field1932 = class14.field310;
        class127.field2970 = class38.field890;
        class29.field601 = class137.field3279;
        class109.field2519 = class55.field1322;
        class116.field2753 = class102.field2296;
        class85.field1995 = class112.field2555;
        class49.field1178 = class41.field988;
        class141.field3396 = class46.field1122;
        class94.field2134 = class20.field405;
        class63.field1469 = class33.field731;
        class66.field1560 = class4.field50;
        class48.field1164 = class119.field2821;
        class140.field3371 = class59.field1392;
        class32.field688 = class60.field1434;
        class59.field1395 = class77.field1838;
        class11.field250 = class25.field540;
        class119.field2818 = class135.field3241;
        class10.field229 = class134.field3212;
        class7.field173 = class52.field1266;
        class109.field2489 = class131.field3099;
        class34.field839 = class109.field2501;
        class134.field3222 = class10.field213;
        class101.field2279 = field440;
        class11.field238 = class121.field2853;
        class126.field2945 = class114.field2666;
        class22.field489 = class61.field1438;
        class91.field2108 = class112.field2588;
        class25.field549 = class131.field3076;
        class140.field3339 = class9.field201;
        class126.field2942 = client.field482;
        class61.field1440 = class58.field1362;
        class19.field373 = class65.field1540;
        class61.field1444 = class9.field196;
        class63.field1488 = class96.field2170;
        class109.field2518 = class131.field3099;
        class55.field1351 = class131.field3099;
        class63.field1470 = class77.field1826;
        class109.field2484 = class119.field2815;
        class132.field3147 = class11.field234;
        class109.field2496 = class131.field3099;
        class78.field1850 = class131.field3105;
        class109.field2497 = class131.field3099;
        class109.field2517 = class131.field3099;
        class104.field2338 = class78.field1853;
        class4.field59 = class54.field1312;
        class108.field2454 = class80.field1869;
        class106.field2392 = class96.field2166;
        class78.field1851 = class5.field135;
        class117.field2780 = class82.field1957;
        class58.field1377 = class45.field1106;
        class91.field2113 = class29.field603;
        class116.field2729 = class122.field2881;
        class102.field2290 = class135.field3234;
        class5.field130 = class22.field495;
        class66.field1553 = class125.field2915;
        class60.field1425 = class128.field2998;
        class80.field1877 = class93.field2124;
        class7.field182 = class80.field1872;
        class116.field2730 = class114.field2696;
        class88.field2033 = class54.field1311;
        class50.field1255 = class33.field753;
        class127.field2954 = class33.field818;
        class116.field2745 = class84.field1993;
        class127.field2957 = class10.field232;
        class71.field1691 = class106.field2388;
        class117.field2782 = class114.field2680;
        class38.field888 = class103.field2330;
        class78.field1845 = class66.field1551;
        class135.field3235 = class131.field3063;
        class128.field3007 = class102.field2291;
        class104.field2348 = class90.field2063;
        class42.field1022 = class80.field1893;
        class109.field2476 = class132.field3133;
        class18.field360 = class46.field1110;
        class116.field2740 = class84.field1988;
        class48.field1156 = class117.field2759;
        class131.field3077 = class30.field634;
        class7.field177 = class49.field1175;
        class117.field2777 = class125.field2918;
        class34.field824 = class137.field3289;
        class101.field2278 = class61.field1460;
        class130.field3054 = class131.field3107;
        class109.field2486 = class131.field3099;
        class116.field2750 = class134.field3195;
        class94.field2148 = class10.field228;
        class29.field604 = class132.field3131;
        class109.field2477 = class55.field1348;
        class66.field1548 = class7.field175;
        class45.field1093 = class42.field1053;
        client.field473 = class140.field3361;
        class61.field1457 = class60.field1419;
        class91.field2118 = class50.field1211;
        class38.field880 = class137.field3265;
        class4.field41 = class12.field268;
        class109.field2494 = class132.field3133;
        class109.field2506 = class131.field3099;
        class38.field865 = class137.field3265;
        class74.field1760 = class70.field1671;
        class69.field1637 = class115.field2724;
        class137.field3293 = class55.field1334;
        class52.field1264 = class82.field1962;
        class134.field3215 = class114.field2669;
        client.field456 = class20.field421;
        class90.field2072 = class66.field1557;
        class109.field2502 = class5.field99;
        class74.field1764 = class128.field2998;
        class133.field3156 = class122.field2876;
        class109.field2493 = class131.field3099;
        class18.field357 = class93.field2122;
        class25.field547 = class70.field1672;
        class103.field2337 = class90.field2065;
        class101.field2263 = class60.field1415;
        class128.field3000 = class41.field996;
        class55.field1337 = class140.field3367;
        class67.field1591 = class4.field73;
        class106.field2396 = class83.field1965;
        class141.field3398 = class24.field503;
        class77.field1833 = class50.field1214;
        class115.field2722 = class97.field2193;
        class73.field1722 = class41.field999;
        class14.field303 = class93.field2125;
        class20.field403 = class24.field517;
        class34.field820 = class41.field1011;
        if (arg0 <= -102) {
            class76.field1806 = class128.field2990;
            class109.field2482 = class67.field1612;
            class77.field1822 = class42.field1041;
            class121.field2856 = class114.field2692;
            class117.field2760 = class81.field1917;
            class109.field2514 = class38.field864;
            class141.field3395 = class25.field531;
            class116.field2748 = class102.field2296;
            class96.field2171 = class73.field1731;
            class98.field2212 = class126.field2947;
            class78.field1857 = class50.field1206;
            class61.field1450 = class112.field2561;
            class31.field657 = class108.field2443;
            class52.field1269 = class25.field552;
            class115.field2723 = class112.field2597;
            class141.field3397 = class132.field3151;
            class109.field2498 = class131.field3099;
            class32.field694 = class60.field1434;
            class117.field2790 = class137.field3285;
            class24.field501 = class114.field2677;
            if (class42.field1062) {
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 751)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field422;
    }

    @OriginalMember(owner = "client!cf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 758)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field424;
        if (this.field436 == arg0) {
            this.field436 = null;
        }
    }
}

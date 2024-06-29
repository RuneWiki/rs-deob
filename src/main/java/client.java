import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class34 {

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Ljd;")
    public static class86 field2851 = class122.method868("Schlie-8en", true);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Ljd;")
    public static class86 field2862 = class122.method868("leuchten3:", true);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Ljd;")
    public static class86 field2859 = class122.method868(")4l=", true);

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lwj;")
    public static class6 field2855;

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1105(int arg0) {
        field2863++;
        if (!class50.field1045) {
            label222: while (true) {
                do {
                    if (!class136.method975((byte) 117)) {
                        break label222;
                    }
                } while (class268.field4720 != 115 && class268.field4720 != 83);
                class50.field1045 = true;
            }
        }
        if (class121.field2351 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class253.method1711((byte) -68);
            if (class124.field2408 == 0L) {
                class124.field2408 = var4;
            }
            if (var3 > 16384 && (var4 - class124.field2408) < 5000L) {
                if ((var4 - class84.field1635) > 1000L) {
                    System.gc();
                    class84.field1635 = var4;
                }
                class234.field4223 = 5;
                class122.field2389 = class78.field1530;
            } else {
                class234.field4223 = 5;
                class121.field2351 = 10;
                class122.field2389 = class139.field2650;
            }
        } else if (class121.field2351 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class122.field2388[var6] = new class9(104, 104);
            }
            class122.field2389 = class37.field815;
            class121.field2351 = 30;
            class234.field4223 = 10;
        } else if (class121.field2351 == 30) {
            if (class86.field1668 == null) {
                class86.field1668 = new class230(class253.field4496, class200.field3541);
            }
            if (class86.field1668.method1601((byte) -18)) {
                class252.field4478 = class177.method1246(false, true, true, 0, arg0 ^ 0xFFFFFF8E);
                class87.field1725 = class177.method1246(false, true, true, 1, 121);
                class134.field2537 = class177.method1246(true, false, true, 2, 120);
                class249.field4417 = class177.method1246(false, true, true, 3, -123);
                class220.field3964 = class177.method1246(false, true, true, 4, -66);
                class149.field2777 = class177.method1246(true, true, true, 5, -52);
                class232.field4204 = class177.method1246(true, true, false, 6, -18);
                class189.field3348 = class177.method1246(false, true, true, 7, arg0 ^ 0xFFFFFF8A);
                class56.field1141 = class177.method1246(false, true, true, 8, -118);
                class12.field394 = class177.method1246(false, true, true, 9, 127);
                class201.field3616 = class177.method1246(false, true, true, 10, 103);
                class70.field1448 = class177.method1246(false, true, true, 11, 108);
                class109.field2082 = class177.method1246(false, true, true, 12, 106);
                class98.field1951 = class177.method1246(false, true, true, 13, arg0 - 115);
                class162.field3054 = class177.method1246(false, true, false, 14, arg0 ^ 0xFFFFFF8C);
                class161.field3017 = class177.method1246(false, true, true, 15, 102);
                class130.field2479 = class177.method1246(false, true, true, 16, -10);
                class191.field3383 = class177.method1246(false, true, true, 17, -4);
                class79.field1553 = class177.method1246(false, true, true, 18, arg0 - 30);
                class56.field1154 = class177.method1246(false, true, true, 19, -61);
                class119.field2330 = class177.method1246(false, true, true, 20, arg0 - 23);
                class125.field2428 = class177.method1246(false, true, true, 21, -11);
                class43.field960 = class177.method1246(false, true, true, 22, -11);
                class56.field1139 = class177.method1246(true, true, true, 23, -78);
                class251.field4464 = class177.method1246(false, true, true, 24, -94);
                class18.field509 = class177.method1246(false, true, true, 25, 111);
                class181.field3261 = class177.method1246(true, true, true, 26, 104);
                class121.field2351 = 40;
                class122.field2389 = class202.field3656;
                class234.field4223 = 15;
            } else {
                class234.field4223 = 12;
                class122.field2389 = class56.field1149;
            }
        } else if (class121.field2351 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class53.field1084[var8].method146(arg0 ^ 0x2D) * class104.field1989[var8] / 100;
            }
            if (var7 == 100) {
                class234.field4223 = 20;
                class122.field2389 = class229.field4163;
                class137.method979(class56.field1141, 61);
                class142.method1007(false, class56.field1141);
                class149.method1062(-21591, class56.field1141);
                class121.field2351 = 45;
            } else {
                if (var7 != 0) {
                    class122.field2389 = class109.method783(2, new class86[] { class188.field3320, class4.method26(false, var7), class116.field2231 });
                }
                class234.field4223 = 20;
            }
        } else if (class121.field2351 == 45) {
            class176.method1242(2, class31.field647, false, 22050);
            class227.field4114 = new class37();
            class227.field4114.method301((byte) -44, 9, 128);
            class25.field601 = class200.method1378(class157.field2954, 22050, 0, class50.field1057, false);
            class25.field601.method353(false, class227.field4114);
            class16.method123(class220.field3964, class162.field3054, (byte) 83, class161.field3017, class227.field4114);
            class76.field1517 = class200.method1378(class157.field2954, 2048, 1, class50.field1057, false);
            class2.field18 = new class47();
            class76.field1517.method353(false, class2.field18);
            class50.field1059 = new class163(22050, class65.field1277);
            class46.field1019 = class232.field4204.method1079(-45, class257.field4559);
            class122.field2389 = class91.field1851;
            class121.field2351 = 50;
            class234.field4223 = 30;
        } else if (class121.field2351 == 50) {
            int var9 = class58.method420(class98.field1951, class56.field1141, false);
            int var10 = class275.method1869(arg0 + 122);
            if (var9 < var10) {
                class122.field2389 = class109.method783(arg0 + 3, new class86[] { class273.field4795, class4.method26(false, var9 * 100 / var10), class116.field2231 });
                class234.field4223 = 35;
            } else {
                class234.field4223 = 35;
                class121.field2351 = 60;
                class122.field2389 = class18.field507;
            }
        } else if (class121.field2351 == 60) {
            int var11 = class153.method1119(class56.field1141, arg0 ^ 0xFFFFFF9C);
            int var12 = class156.method1141(false);
            if (var11 < var12) {
                class122.field2389 = class109.method783(arg0 + 3, new class86[] { class205.field3710, class4.method26(false, var11 * 100 / var12), class116.field2231 });
                class234.field4223 = 40;
            } else {
                class121.field2351 = 65;
                class122.field2389 = class75.field1494;
                class234.field4223 = 40;
            }
        } else if (class121.field2351 == 65) {
            class48.method374(true, class56.field1141, class98.field1951);
            class122.field2389 = class132.field2506;
            class234.field4223 = 45;
            class138.method983(5, (byte) 13);
            class121.field2351 = 70;
        } else if (class121.field2351 == 70) {
            class134.field2537.method1099(19638);
            byte var13 = 0;
            int var14 = var13 + class134.field2537.method1078(1);
            class130.field2479.method1099(19638);
            int var15 = var14 + class130.field2479.method1078(1);
            class191.field3383.method1099(19638);
            int var16 = var15 + class191.field3383.method1078(1);
            class79.field1553.method1099(arg0 ^ 0xFFFFB349);
            int var17 = var16 + class79.field1553.method1078(1);
            class56.field1154.method1099(19638);
            int var18 = var17 + class56.field1154.method1078(1);
            class119.field2330.method1099(19638);
            int var19 = var18 + class119.field2330.method1078(1);
            class125.field2428.method1099(19638);
            int var20 = var19 + class125.field2428.method1078(1);
            class43.field960.method1099(19638);
            int var21 = var20 + class43.field960.method1078(arg0 + 2);
            class251.field4464.method1099(19638);
            int var22 = var21 + class251.field4464.method1078(1);
            class18.field509.method1099(19638);
            int var23 = var22 + class18.field509.method1078(1);
            if (var23 < 1000) {
                class122.field2389 = class109.method783(arg0 ^ 0xFFFFFFFD, new class86[] { class178.field3229, class4.method26(false, var23 / 10), class116.field2231 });
                class234.field4223 = 50;
            } else {
                class202.method1441(~arg0, class134.field2537);
                class7.method52(class134.field2537, -11339);
                class108.method769(class134.field2537, (byte) 123);
                class3.method16(class134.field2537, 3, class189.field3348);
                class61.method439(class189.field3348, class130.field2479, (byte) 68, true);
                class116.method820(class79.field1553, 16752611, class189.field3348);
                class264.method1791(true, 47, class189.field3348, class56.field1154, class1.field10);
                class221.method1557(class134.field2537, false);
                class42.method338(class252.field4478, class119.field2330, -4097, class87.field1725);
                class49.method378(class189.field3348, class125.field2428, (byte) -125);
                class86.method595(class43.field960, 25586);
                class87.method635(class134.field2537, 1);
                class96.method695(class98.field1951, class56.field1141, class189.field3348, class249.field4417, 70);
                class27.method182(class134.field2537, arg0 ^ 0xFFFFFFFE);
                class154.method1124(0, class191.field3383);
                class35.method267(class18.field509, 667, new class168(), class251.field4464);
                class125.method886(127, class18.field509, class251.field4464);
                class234.field4223 = 50;
                class122.field2389 = class251.field4454;
                class178.method1252((byte) -120);
                class121.field2351 = 80;
            }
        } else if (class121.field2351 == 80) {
            int var24 = class265.method1796(class56.field1141, 0);
            int var25 = class210.method1493(arg0 + 17);
            if (var24 < var25) {
                class122.field2389 = class109.method783(2, new class86[] { class73.field1472, class4.method26(false, var24 * 100 / var25), class116.field2231 });
                class234.field4223 = 60;
            } else {
                class65.method465(class56.field1141, (byte) -34);
                class121.field2351 = 90;
                class234.field4223 = 60;
                class122.field2389 = class9.field278;
            }
        } else if (class121.field2351 == 90) {
            if (class181.field3261.method1099(19638)) {
                class201 var26 = new class201(class12.field394, class181.field3261, class56.field1141, 20, !class202.field3655);
                class145.method1045(var26);
                if (class21.field547 == 1) {
                    class145.method1042(0.9F);
                }
                if (class21.field547 == 2) {
                    class145.method1042(0.8F);
                }
                if (class21.field547 == 3) {
                    class145.method1042(0.7F);
                }
                if (class21.field547 == 4) {
                    class145.method1042(0.6F);
                }
                class234.field4223 = 70;
                class121.field2351 = 100;
                class122.field2389 = class155.field2936;
            } else {
                class122.field2389 = class109.method783(arg0 + 3, new class86[] { class241.field4327, class4.method26(false, class181.field3261.method1078(1)), class116.field2231 });
                class234.field4223 = 70;
            }
        } else if (class121.field2351 == 100) {
            if (class15.method109(class56.field1141, (byte) 77)) {
                class121.field2351 = 110;
            }
        } else if (class121.field2351 == 110) {
            class258.field4578 = new class198();
            class157.field2954.method1724(true, 10, class258.field4578);
            class234.field4223 = 75;
            class121.field2351 = 120;
            class122.field2389 = class149.field2778;
        } else if (class121.field2351 == 120) {
            if (class201.field3616.method1100(class56.field1155, class37.field845, (byte) 40)) {
                class72 var27 = new class72(class201.field3616.method1095(class37.field845, class56.field1155, -25761));
                class267.method1838(var27, -72);
                class122.field2389 = class238.field4287;
                class121.field2351 = 130;
                class234.field4223 = 80;
            } else {
                class122.field2389 = class109.method783(2, new class86[] { class38.field898, class49.field1042 });
                class234.field4223 = 80;
            }
        } else if (class121.field2351 == 130) {
            if (!class249.field4417.method1099(19638)) {
                class122.field2389 = class109.method783(arg0 + 3, new class86[] { class248.field4404, class4.method26(false, class249.field4417.method1078(1) * 3 / 4), class116.field2231 });
                class234.field4223 = 85;
            } else if (!class109.field2082.method1099(19638)) {
                class122.field2389 = class109.method783(arg0 + 3, new class86[] { class248.field4404, class4.method26(false, class109.field2082.method1078(1) / 10 + 75), class116.field2231 });
                class234.field4223 = 85;
            } else if (!class98.field1951.method1099(19638)) {
                class122.field2389 = class109.method783(2, new class86[] { class248.field4404, class4.method26(false, class98.field1951.method1078(arg0 + 2) / 20 + 85), class116.field2231 });
                class234.field4223 = 85;
            } else if (class56.field1139.method1072(class61.field1212, arg0 ^ 0xFFFFFF90)) {
                class207.method1471((byte) 62, class56.field1139, class209.field3781, class125.field2430, class66.field1314, class272.field4767, class114.field2185);
                class122.field2389 = class217.field3904;
                class234.field4223 = 95;
                class121.field2351 = 135;
            } else {
                class122.field2389 = class109.method783(2, new class86[] { class248.field4404, class4.method26(false, class56.field1139.method1086(class61.field1212, 89) / 10 + 90), class116.field2231 });
                class234.field4223 = 85;
            }
        } else if (class121.field2351 == 135) {
            if (class150.method1064(0)) {
                class122.field2389 = class248.field4400;
                class234.field4223 = 96;
                class121.field2351 = 140;
            } else {
                class234.field4223 = 95;
                class122.field2389 = class198.field3522;
            }
        } else if (class121.field2351 == 140) {
            class55.field1131 = class249.field4417.method1079(115, class189.field3347);
            class149.field2777.method1083(false, 0, true);
            class232.field4204.method1083(true, 0, true);
            class56.field1141.method1083(true, 0, true);
            class98.field1951.method1083(true, 0, true);
            class201.field3616.method1083(true, 0, true);
            class249.field4417.method1083(true, 0, true);
            class121.field2351 = 150;
            class14.field435 = true;
            class122.field2389 = class161.field3021;
            class234.field4223 = 97;
        } else {
            if (arg0 != -1) {
                field2862 = null;
            }
            if (class121.field2351 == 150) {
                if (class50.field1045) {
                    class42.field949 = 0;
                }
                class50.field1045 = true;
                class3.method15(arg0 ^ 0x4D, class157.field2954);
                class119.method848(false, -1, arg0 + 1, class42.field949, -1);
                class121.field2351 = 160;
                class122.field2389 = class111.field2125;
                class234.field4223 = 100;
            } else if (class121.field2351 == 160) {
                class139.method997(5604, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method266(int arg0) {
        method1114(-89);
        class86.method616(arg0 - 1218);
        field2857++;
        class179.method1257(arg0 - 1346);
        class210.method1489((byte) 65);
        class58.method421(true);
        class34.method250(arg0 - 1307);
        class115.method814(3353893);
        class21.method161((byte) -55);
        class198.method1367(true);
        class20.method152((byte) 103);
        class200.method1419((byte) 27);
        class31.method203((byte) 75);
        class159.method1153(-126);
        class109.method782(0);
        class230.method1604(100);
        class17.method133(arg0 ^ 0x570);
        class151.method1089(-127);
        class155.method1128((byte) -81);
        class144.method1028(arg0 ^ 0x53E);
        class96.method699(-125);
        class170.method1219(true);
        class195.method1357((byte) -109);
        class9.method71((byte) -120);
        class6.method41(-85);
        class224.method1569(64);
        class257.method1736(false);
        class252.method1702((byte) -13);
        class164.method1187(271801008);
        class54.method400(103);
        class188.method1292(-110);
        class90.method667((byte) -57);
        class37.method315((byte) -96);
        class44.method354((byte) -110);
        class163.method1182(46);
        class70.method506(111);
        class122.method869(arg0 - 1320);
        class33.method247(0);
        class249.method1684((byte) 101);
        class162.method1177(arg0 - 1339);
        class11.method92(arg0 - 1231);
        class1.method2((byte) -88);
        class207.method1474(-126);
        class139.method989(arg0 ^ 0x5BA);
        class213.method1511(116);
        class100.method723(2);
        class181.method1264(arg0 - 1241);
        class38.method323(-104);
        class211.method1496((byte) -115);
        class205.method1466(-37);
        class30.method193((byte) -115);
        class246.method1669((byte) -111);
        class8.method54(arg0 - 1457);
        class125.method888(false);
        class117.method833(arg0 - 1241);
        class216.method1529((byte) 58);
        class23.method171(arg0 ^ 0xFFFFFAA5);
        class49.method381(-1);
        class192.method1325();
        class244.method1666((byte) -126);
        class69.method488(17);
        class89.method658();
        class118.method843(-115);
        class227.method1589((byte) 82);
        class253.method1710(arg0 ^ 0x53A);
        class274.method1868(true);
        class42.method341((byte) -82);
        class124.method884((byte) 120);
        class173.method1237(32);
        class62.method444(5);
        class259.method1763();
        class130.method914((byte) -119);
        class88.method648(-79);
        class71.method523();
        class133.method948(-1);
        class63.method450(0);
        class25.method177((byte) -19);
        class212.method1507();
        class160.method1164(arg0 ^ arg0);
        class251.method1697(arg0 - 1220);
        class226.method1587((byte) 124);
        class152.method1117(12746);
        class131.method931();
        class177.method1245((byte) 79);
        class22.method166(-32);
        class105.method750(true);
        class256.method1729(-18485);
        class53.method393(1);
        class190.method1303(true);
        class184.method1269(true);
        class234.method1622((byte) -87);
        class202.method1448(arg0 - 1479);
        class194.method1351((byte) -92);
        class108.method772(true);
        class193.method1345(false);
        class127.method898(7687);
        class77.method548((byte) 121);
        class209.method1484((byte) 85);
        class147.method1053(arg0 ^ 0xFFFFFAC5);
        class219.method1549(0);
        class113.method804(1802);
        class168.method1211((byte) 123);
        class16.method117((byte) 12);
        class201.method1438(128);
        class116.method824(3);
        class145.method1048();
        class72.method530((byte) 82);
        class180.method1261((byte) 63);
        class15.method112(arg0 ^ 0xFFFFFAC5);
        class264.method1793((byte) 36);
        class239.method1644((byte) -119);
        class67.method475(true);
        class185.method1275(7966);
        class83.method579(0);
        class55.method408((byte) 68);
        class80.method566((byte) -63);
        class228.method1590(-549119647);
        class106.method756(2);
        class221.method1556((byte) -128);
        class258.method1745(-128);
        class107.method760(-128);
        class97.method707(4047);
        class236.method1633(10);
        class110.method784();
        class157.method1142((byte) 97);
        class45.method360(30);
        class271.method1851(1804);
        class79.method556(-4);
        class12.method98(110);
        class92.method683(-53);
        class161.method1175((byte) -103);
        class13.method100((byte) 89);
        class14.method103(5);
        class183.method1268((byte) 103);
        class191.method1309((byte) 108);
        class132.method942(-51);
        class223.method1566();
        class270.method1848(true);
        class204.method1458(true);
        class134.method960(39);
        class82.method572((byte) -71);
        class48.method373(arg0 ^ 0x5C5);
        class2.method11((byte) -125);
        class140.method998(arg0 ^ 0x43E);
        class215.method1524(-1);
        class3.method12((byte) -12);
        class187.method1284((byte) -103);
        class232.method1610(27418);
        class18.method149(true);
        class248.method1679(arg0 - 19155);
        class247.method1673((byte) 60);
        class240.method1647(arg0 ^ 0xF2E31A2A);
        class4.method22(-1855471984);
        class114.method805((byte) 110);
        class142.method1013((byte) -48);
        class39.method327((byte) 86);
        class36.method271(arg0 - 31427);
        class61.method438(15681);
        class128.method907();
        class206.method1468(6);
        class76.method544(-84);
        class153.method1120(false);
        class241.method1654(-640041400);
        class78.method554(true);
        class104.method745((byte) 68);
        class40.method331();
        class222.method1558();
        class269.method1847();
        class263.method1786((byte) -110);
        class156.method1140(80);
        class121.method855(false);
        class225.method1586();
        class123.method877();
        class154.method1122(-1);
        class129.method909(0);
        class273.method1862((byte) 127);
        class158.method1148((byte) -24);
        class243.method1660((byte) 77);
        class171.method1226((byte) 115);
        class59.method426((byte) 112);
        class65.method461(866);
        class260.method1778((byte) -99);
        class87.method639(25);
        class218.method1536(arg0 - 2349);
        class176.method1243((byte) 90);
        class136.method976(-5675);
        class81.method567(10497);
        class255.method1725((byte) 91);
        class208.method1482(0);
        class272.method1856(107);
        class10.method81(-129);
        class119.method850(0);
        class41.method337(arg0 ^ 0xFFFFFAC5);
        class214.method1517(false);
        class189.method1302(true);
        class237.method1636(108);
        class24.method173((byte) 84);
        class43.method345(true);
        class265.method1795(-1480506268);
        class98.method710(2);
        class233.method1612(arg0 ^ 0x53A);
        class203.method1452((byte) 86);
        class7.method50(918);
        class150.method1065(-27757);
        class111.method785(20207);
        class135.method971(true);
        class102.method736(-2002479284);
        class35.method268(1);
        class56.method410(749476044);
        class149.method1063(54);
        class50.method384(-27297);
        class186.method1281(255);
        class169.method1216(32);
        class91.method675(false);
        class275.method1872(true);
        class84.method580(-3137);
        class5.method36(13);
        class68.method480(false);
        class238.method1640(-1806144756);
        class75.method539(arg0 - 1336);
        class267.method1837(true);
        class141.method1001(arg0 - 1338);
        class64.method456(1047693);
        class51.method390((byte) -126);
        class268.method1844(arg0 - 1215);
        class217.method1531(arg0 + 709);
        class165.method1190(arg0 ^ 0xFFFFFAFB);
        class46.method364(true);
        class57.method418(true);
        class143.method1020((byte) 97);
        class126.method891(false);
        class27.method181(16773818);
        class178.method1254(-1);
        class220.method1554((byte) 105);
        class60.method432(119);
        class73.method537((byte) -85);
        class138.method987((byte) -88);
        class137.method981((byte) -111);
        class66.method466(-1);
        class229.method1595((byte) -110);
        class93.method685((byte) 66);
        class235.method1627(-69);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1106(byte arg0, int arg1) {
        class24.field585 = null;
        class21.field543++;
        field2869++;
        class115.field2199 = null;
        if (class59.field1188 == class191.field3390) {
            class191.field3390 = class113.field2162;
        } else {
            class191.field3390 = class59.field1188;
        }
        class23.field568 = 0;
        if (class21.field543 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class84.field1634 == 0 || class84.field1634 == 5) {
                this.method260("js5connect_full", -58);
                class84.field1634 = 1000;
            } else {
                class127.field2453 = 3000;
            }
        } else if (class21.field543 >= 2 && arg1 == 6) {
            this.method260("js5connect_outofdate", -58);
            class84.field1634 = 1000;
        } else if (class21.field543 >= 4) {
            if (class84.field1634 == 0 || class84.field1634 == 5) {
                this.method260("js5connect", -58);
                class84.field1634 = 1000;
            } else {
                class127.field2453 = 3000;
            }
        }
        if (arg0 > -102) {
            field2862 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwj;)Lwj;")
    public static final class6 method1107(class6 arg0) {
        int var1 = class173.method1235(32, method1111(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class25.method178(106, arg0.field221);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwj;IIIIIII)V")
    public static final void method1108(class6[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class6 var9 = arg0[var8];
            if (var9 != null && var9.field221 == arg1 && (!var9.field217 || var9.field184 == 0 || var9.field152 || method1111(var9) != 0 || class198.field3517 == var9 || var9.field100 == 1338) && (!var9.field217 || !method1112(var9))) {
                int var10 = var9.field117 + arg6;
                int var11 = var9.field158 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field184 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field163 + var10;
                    int var17 = var9.field131 + var11;
                    if (var9.field184 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class84.field1637 == var9) {
                    class114.field2181 = true;
                    class30.field628 = var10;
                    class8.field263 = var11;
                }
                if (!var9.field217 || var12 < var14 && var13 < var15) {
                    if (var9.field184 == 0) {
                        if (!var9.field217 && method1112(var9) && class229.field4162 != var9) {
                            continue;
                        }
                        if (var9.field118 && class6.field207 >= var12 && class90.field1841 >= var13 && class6.field207 < var14 && class90.field1841 < var15) {
                            for (class55 var18 = (class55) class42.field937.method1737((byte) 74); var18 != null; var18 = (class55) class42.field937.method1740(-8843)) {
                                if (var18.field1112) {
                                    var18.method1477(1);
                                }
                            }
                            if (class100.field1958 == 0) {
                                class84.field1637 = null;
                                class198.field3517 = null;
                            }
                            class56.field1140 = false;
                            class213.field3843 = null;
                        }
                    }
                    if (var9.field217) {
                        boolean var19;
                        if (class6.field207 >= var12 && class90.field1841 >= var13 && class6.field207 < var14 && class90.field1841 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class56.field1151 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class143.field2712 == 1 && class185.field3288 >= var12 && class39.field906 >= var13 && class185.field3288 < var14 && class39.field906 < var15) {
                            var21 = true;
                        }
                        if (class83.field1615 > 0 && var9.field143 != null) {
                            for (int var22 = 0; var22 < var9.field143.length; var22++) {
                                for (int var23 = 0; var23 < class83.field1615; var23++) {
                                    int var24 = var9.field143[var22] & 0xFF;
                                    if (class20.field519[var23] == var24) {
                                        if (var9.field172 != null) {
                                            byte var25 = var9.field172[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class9.field295[86] || (var25 & 0x1) != 0 && !class9.field295[82] || (var25 & 0x4) != 0 && !class9.field295[81])) {
                                                continue;
                                            }
                                        }
                                        class179.method1256(class56.field1155, var22 + 1, -1, -124, var9.field222);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class210.method1491(class39.field906 - var11, class185.field3288 - var10, var9, -89);
                        }
                        if (class84.field1637 != null && class84.field1637 != var9 && var19 && class202.method1450(method1111(var9), (byte) 99)) {
                            class98.field1943 = var9;
                        }
                        if (class198.field3517 == var9) {
                            class20.field532 = true;
                            class208.field3769 = var10;
                            class247.field4387 = var11;
                        }
                        if (var9.field152 || var9.field100 != 0) {
                            if (var19 && class181.field3262 != 0 && var9.field130 != null) {
                                class55 var26 = new class55();
                                var26.field1112 = true;
                                var26.field1114 = var9;
                                var26.field1113 = class181.field3262;
                                var26.field1128 = var9.field130;
                                class42.field937.method1731(88, var26);
                            }
                            if (class84.field1637 != null || class4.field64 != null || class195.field3506 || var9.field100 != 1400 && class56.field1140) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field100 != 0) {
                                if (var9.field100 == 1337) {
                                    class91.field1855 = var9;
                                    class62.method441(-29481, var9);
                                    continue;
                                }
                                if (var9.field100 == 1338) {
                                    if (var21) {
                                        class213.field3843 = var9;
                                        class80.field1577 = class185.field3288 - var10;
                                        class77.field1527 = class39.field906 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field100 == 1400) {
                                    class239.field4310 = var9;
                                    if (var21) {
                                        if (class9.field295[82] && class38.field905 > 0) {
                                            int var27 = (int) ((double) (class185.field3288 - var10 - var9.field163 / 2) * 2.0D / (double) class202.field3658);
                                            int var28 = (int) ((double) (class39.field906 - var11 - var9.field131 / 2) * 2.0D / (double) class202.field3658);
                                            int var29 = class274.field4814 + var27;
                                            int var30 = class156.field2952 + var28;
                                            int var31 = class90.field1847 + var29;
                                            int var32 = class38.field894 + class238.field4289 - var30 - 1;
                                            class16.method115(var32, 0, var31, (byte) 119);
                                            class51.method389(true);
                                            continue;
                                        }
                                        class56.field1140 = true;
                                        class260.field4653 = class6.field207;
                                        class273.field4790 = class90.field1841;
                                        class15.field442 = class274.field4814;
                                        class22.field561 = class156.field2952;
                                        continue;
                                    }
                                    if (var20 && class56.field1140) {
                                        class18.method148((int) ((double) (class260.field4653 - class6.field207) * 2.0D / (double) class88.field1769) + class15.field442, -251);
                                        class100.method720((int) ((double) (class273.field4790 - class90.field1841) * 2.0D / (double) class88.field1769) + class22.field561, 31506);
                                        continue;
                                    }
                                    class56.field1140 = false;
                                    continue;
                                }
                                if (var9.field100 == 1401) {
                                    if (var20) {
                                        class36.method275(20003, class6.field207 - var10, var9.field131, var9.field163, class90.field1841 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field100 == 1402) {
                                    class62.method441(-29481, var9);
                                    continue;
                                }
                            }
                            if (!var9.field139 && var21) {
                                var9.field139 = true;
                                if (var9.field122 != null) {
                                    class55 var33 = new class55();
                                    var33.field1112 = true;
                                    var33.field1114 = var9;
                                    var33.field1121 = class185.field3288 - var10;
                                    var33.field1113 = class39.field906 - var11;
                                    var33.field1128 = var9.field122;
                                    class42.field937.method1731(124, var33);
                                }
                            }
                            if (var9.field139 && var20 && var9.field120 != null) {
                                class55 var34 = new class55();
                                var34.field1112 = true;
                                var34.field1114 = var9;
                                var34.field1121 = class6.field207 - var10;
                                var34.field1113 = class90.field1841 - var11;
                                var34.field1128 = var9.field120;
                                class42.field937.method1731(-35, var34);
                            }
                            if (var9.field139 && !var20) {
                                var9.field139 = false;
                                if (var9.field89 != null) {
                                    class55 var35 = new class55();
                                    var35.field1112 = true;
                                    var35.field1114 = var9;
                                    var35.field1121 = class6.field207 - var10;
                                    var35.field1113 = class90.field1841 - var11;
                                    var35.field1128 = var9.field89;
                                    class92.field1872.method1731(-60, var35);
                                }
                            }
                            if (var20 && var9.field83 != null) {
                                class55 var36 = new class55();
                                var36.field1112 = true;
                                var36.field1114 = var9;
                                var36.field1121 = class6.field207 - var10;
                                var36.field1113 = class90.field1841 - var11;
                                var36.field1128 = var9.field83;
                                class42.field937.method1731(112, var36);
                            }
                            if (!var9.field191 && var19) {
                                var9.field191 = true;
                                if (var9.field164 != null) {
                                    class55 var37 = new class55();
                                    var37.field1112 = true;
                                    var37.field1114 = var9;
                                    var37.field1121 = class6.field207 - var10;
                                    var37.field1113 = class90.field1841 - var11;
                                    var37.field1128 = var9.field164;
                                    class42.field937.method1731(-75, var37);
                                }
                            }
                            if (var9.field191 && var19 && var9.field157 != null) {
                                class55 var38 = new class55();
                                var38.field1112 = true;
                                var38.field1114 = var9;
                                var38.field1121 = class6.field207 - var10;
                                var38.field1113 = class90.field1841 - var11;
                                var38.field1128 = var9.field157;
                                class42.field937.method1731(-86, var38);
                            }
                            if (var9.field191 && !var19) {
                                var9.field191 = false;
                                if (var9.field166 != null) {
                                    class55 var39 = new class55();
                                    var39.field1112 = true;
                                    var39.field1114 = var9;
                                    var39.field1121 = class6.field207 - var10;
                                    var39.field1113 = class90.field1841 - var11;
                                    var39.field1128 = var9.field166;
                                    class92.field1872.method1731(-24, var39);
                                }
                            }
                            if (var9.field215 != null) {
                                class55 var40 = new class55();
                                var40.field1114 = var9;
                                var40.field1128 = var9.field215;
                                class147.field2762.method1731(93, var40);
                            }
                            if (var9.field86 != null && class48.field1034 > var9.field123) {
                                if (var9.field160 == null || class48.field1034 - var9.field123 > 32) {
                                    class55 var45 = new class55();
                                    var45.field1114 = var9;
                                    var45.field1128 = var9.field86;
                                    class42.field937.method1731(-44, var45);
                                } else {
                                    label546: for (int var41 = var9.field123; var41 < class48.field1034; var41++) {
                                        int var42 = class96.field1909[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field160.length; var43++) {
                                            if (var9.field160[var43] == var42) {
                                                class55 var44 = new class55();
                                                var44.field1114 = var9;
                                                var44.field1128 = var9.field86;
                                                class42.field937.method1731(-127, var44);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field123 = class48.field1034;
                            }
                            if (var9.field95 != null && class69.field1410 > var9.field148) {
                                if (var9.field113 == null || class69.field1410 - var9.field148 > 32) {
                                    class55 var50 = new class55();
                                    var50.field1114 = var9;
                                    var50.field1128 = var9.field95;
                                    class42.field937.method1731(-65, var50);
                                } else {
                                    label522: for (int var46 = var9.field148; var46 < class69.field1410; var46++) {
                                        int var47 = class221.field3969[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field113.length; var48++) {
                                            if (var9.field113[var48] == var47) {
                                                class55 var49 = new class55();
                                                var49.field1114 = var9;
                                                var49.field1128 = var9.field95;
                                                class42.field937.method1731(-44, var49);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field148 = class69.field1410;
                            }
                            if (var9.field204 != null && class111.field2128 > var9.field150) {
                                if (var9.field171 == null || class111.field2128 - var9.field150 > 32) {
                                    class55 var55 = new class55();
                                    var55.field1114 = var9;
                                    var55.field1128 = var9.field204;
                                    class42.field937.method1731(-67, var55);
                                } else {
                                    label498: for (int var51 = var9.field150; var51 < class111.field2128; var51++) {
                                        int var52 = class240.field4313[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field171.length; var53++) {
                                            if (var9.field171[var53] == var52) {
                                                class55 var54 = new class55();
                                                var54.field1114 = var9;
                                                var54.field1128 = var9.field204;
                                                class42.field937.method1731(60, var54);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field150 = class111.field2128;
                            }
                            if (var9.field93 != null && class273.field4791 > var9.field82) {
                                if (var9.field242 == null || class273.field4791 - var9.field82 > 32) {
                                    class55 var60 = new class55();
                                    var60.field1114 = var9;
                                    var60.field1128 = var9.field93;
                                    class42.field937.method1731(-106, var60);
                                } else {
                                    label474: for (int var56 = var9.field82; var56 < class273.field4791; var56++) {
                                        int var57 = class125.field2421[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field242.length; var58++) {
                                            if (var9.field242[var58] == var57) {
                                                class55 var59 = new class55();
                                                var59.field1114 = var9;
                                                var59.field1128 = var9.field93;
                                                class42.field937.method1731(-49, var59);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field82 = class273.field4791;
                            }
                            if (var9.field80 != null && class248.field4405 > var9.field188) {
                                if (var9.field175 == null || class248.field4405 - var9.field188 > 32) {
                                    class55 var65 = new class55();
                                    var65.field1114 = var9;
                                    var65.field1128 = var9.field80;
                                    class42.field937.method1731(-97, var65);
                                } else {
                                    label450: for (int var61 = var9.field188; var61 < class248.field4405; var61++) {
                                        int var62 = class168.field3107[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field175.length; var63++) {
                                            if (var9.field175[var63] == var62) {
                                                class55 var64 = new class55();
                                                var64.field1114 = var9;
                                                var64.field1128 = var9.field80;
                                                class42.field937.method1731(-106, var64);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field188 = class248.field4405;
                            }
                            if (class92.field1874 > var9.field189 && var9.field85 != null) {
                                class55 var66 = new class55();
                                var66.field1114 = var9;
                                var66.field1128 = var9.field85;
                                class42.field937.method1731(52, var66);
                            }
                            if (class177.field3207 > var9.field189 && var9.field135 != null) {
                                class55 var67 = new class55();
                                var67.field1114 = var9;
                                var67.field1128 = var9.field135;
                                class42.field937.method1731(107, var67);
                            }
                            if (class190.field3373 > var9.field189 && var9.field101 != null) {
                                class55 var68 = new class55();
                                var68.field1114 = var9;
                                var68.field1128 = var9.field101;
                                class42.field937.method1731(127, var68);
                            }
                            if (class191.field3396 > var9.field189 && var9.field78 != null) {
                                class55 var69 = new class55();
                                var69.field1114 = var9;
                                var69.field1128 = var9.field78;
                                class42.field937.method1731(121, var69);
                            }
                            if (class111.field2127 > var9.field189 && var9.field167 != null) {
                                class55 var70 = new class55();
                                var70.field1114 = var9;
                                var70.field1128 = var9.field167;
                                class42.field937.method1731(75, var70);
                            }
                            var9.field189 = class27.field621;
                            if (var9.field205 != null) {
                                for (int var71 = 0; var71 < class83.field1615; var71++) {
                                    class55 var72 = new class55();
                                    var72.field1114 = var9;
                                    var72.field1115 = class20.field519[var71];
                                    var72.field1119 = class15.field443[var71];
                                    var72.field1128 = var9.field205;
                                    class42.field937.method1731(122, var72);
                                }
                            }
                            if (class252.field4488 && var9.field112 != null) {
                                class55 var73 = new class55();
                                var73.field1114 = var9;
                                var73.field1128 = var9.field112;
                                class42.field937.method1731(104, var73);
                            }
                        }
                    }
                    if (!var9.field217 && class84.field1637 == null && class4.field64 == null && !class195.field3506) {
                        if ((var9.field145 >= 0 || var9.field156 != 0) && class6.field207 >= var12 && class90.field1841 >= var13 && class6.field207 < var14 && class90.field1841 < var15) {
                            if (var9.field145 >= 0) {
                                class229.field4162 = arg0[var9.field145];
                            } else {
                                class229.field4162 = var9;
                            }
                        }
                        if (var9.field184 == 8 && class6.field207 >= var12 && class90.field1841 >= var13 && class6.field207 < var14 && class90.field1841 < var15) {
                            class38.field901 = var9;
                        }
                        if (var9.field199 > var9.field131) {
                            class230.method1602(var9.field163 + var10, (byte) -70, var9.field199, var11, var9.field131, class90.field1841, class6.field207, var9);
                        }
                    }
                    if (var9.field184 == 0) {
                        method1108(arg0, var9.field222, var12, var13, var14, var15, var10 - var9.field138, var11 - var9.field102);
                        if (var9.field216 != null) {
                            method1108(var9.field216, var9.field222, var12, var13, var14, var15, var10 - var9.field138, var11 - var9.field102);
                        }
                        class1 var74 = (class1) class1.field15.method1698((long) var9.field222, (byte) -121);
                        if (var74 != null) {
                            class70.method512(var11, var14, var74.field2, var12, var15, false, var10, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2868++;
        try {
            if (arg0.length != 4) {
                class249.method1683(-127, "argument count");
            }
            class13.field408 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class220.field3961 = 2;
            if (arg0[1].equals("live")) {
                class239.field4300 = 0;
            } else if (arg0[1].equals("rc")) {
                class239.field4300 = 1;
            } else if (arg0[1].equals("wip")) {
                class239.field4300 = 2;
            } else {
                class249.method1683(-121, "modewhat");
            }
            class33.field723 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class76.method546(27168, class102.method733((byte) 51, var2.length, 0, var2));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class257.field4558 = var1;
            } else if (arg0[2].equals("english")) {
                class257.field4558 = 0;
            } else if (arg0[2].equals("german")) {
                class257.field4558 = 1;
            } else {
                class249.method1683(-128, "language");
            }
            class133.method949(class257.field4558, (byte) 11);
            class64.field1258 = false;
            class20.field538 = false;
            if (arg0[3].equals("game0")) {
                class39.field910 = 0;
            } else if (arg0[3].equals("game1")) {
                class39.field910 = 1;
            } else {
                class249.method1683(-125, "game");
            }
            class179.field3232 = false;
            class130.field2487 = class56.field1155;
            class179.field3235 = 0;
            client var3 = new client();
            class98.field1942 = var3;
            var3.method249(27, 1024, class239.field4300 + 32, (byte) 104, 768, "runescape", 514);
            class138.field2627.setLocation(40, 40);
        } catch (Exception var6) {
            class143.method1018(var6, (String) null, 41);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    private final void method1109(byte arg0) {
        field2861++;
        for (class83.field1615 = 0; class136.method975((byte) 32) && class83.field1615 < 128; class83.field1615++) {
            class20.field519[class83.field1615] = class227.field4120;
            class15.field443[class83.field1615] = class268.field4720;
        }
        class194.field3474++;
        int var2 = 110 % ((-arg0 - 19) / 51);
        if (class178.field3225 != -1) {
            class70.method512(0, class4.field53, class178.field3225, 0, class248.field4414, false, 0, 0);
        }
        class27.field621++;
        class8.method53(30);
        while (true) {
            class55 var3;
            class6 var4;
            class6 var5;
            do {
                var3 = (class55) class147.field2762.method1735((byte) 62);
                if (var3 == null) {
                    while (true) {
                        class55 var6;
                        class6 var7;
                        class6 var8;
                        do {
                            var6 = (class55) class92.field1872.method1735((byte) 62);
                            if (var6 == null) {
                                while (true) {
                                    class55 var9;
                                    class6 var10;
                                    class6 var11;
                                    do {
                                        var9 = (class55) class42.field937.method1735((byte) 62);
                                        if (var9 == null) {
                                            if (class84.field1637 != null) {
                                                class143.method1019(179);
                                            }
                                            if (class62.field1219 != null && class62.field1219.field613 == 1) {
                                                if (class62.field1219.field611 != null) {
                                                    class109.method778(class124.field2413, 3031, class97.field1931);
                                                }
                                                class97.field1931 = null;
                                                class62.field1219 = null;
                                                class124.field2413 = false;
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1114;
                                        if (var10.field177 < 0) {
                                            break;
                                        }
                                        var11 = class25.method178(114, var10.field221);
                                    } while (var11 == null || var11.field216 == null || var11.field216.length <= var10.field177 || var11.field216[var10.field177] != var10);
                                    class59.method427(var9, 200000);
                                }
                            }
                            var7 = var6.field1114;
                            if (var7.field177 < 0) {
                                break;
                            }
                            var8 = class25.method178(72, var7.field221);
                        } while (var8 == null || var8.field216 == null || var7.field177 >= var8.field216.length || var8.field216[var7.field177] != var7);
                        class59.method427(var6, 200000);
                    }
                }
                var4 = var3.field1114;
                if (var4.field177 < 0) {
                    break;
                }
                var5 = class25.method178(78, var4.field221);
            } while (var5 == null || var5.field216 == null || var4.field177 >= var5.field216.length || var5.field216[var4.field177] != var4);
            class59.method427(var3, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2866++;
        if (!this.method259(127)) {
            return;
        }
        class13.field408 = Integer.parseInt(this.getParameter("worldid"));
        class220.field3961 = Integer.parseInt(this.getParameter("modewhere"));
        if (class220.field3961 < 0 || class220.field3961 > 1) {
            class220.field3961 = 0;
        }
        class239.field4300 = Integer.parseInt(this.getParameter("modewhat"));
        if (class239.field4300 < 0 || class239.field4300 > 2) {
            class239.field4300 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class33.field723 = true;
        } else {
            class33.field723 = false;
        }
        try {
            class257.field4558 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class257.field4558 = 0;
        }
        class133.method949(class257.field4558, (byte) 11);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class20.field538 = true;
        } else {
            class20.field538 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class64.field1258 = true;
        } else {
            class64.field1258 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class39.field910 = 1;
        } else {
            class39.field910 = 0;
        }
        try {
            class179.field3235 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class179.field3235 = 0;
        }
        class130.field2487 = class125.field2426.method630(this, 0);
        if (class130.field2487 == null) {
            class130.field2487 = class56.field1155;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class179.field3232 = true;
        } else {
            class179.field3232 = false;
        }
        class98.field1942 = this;
        this.method262(14896, 514, 503, 765, class239.field4300 + 32);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1110(int arg0) {
        field2852++;
        if (class253.field4496.field3004 >= 4) {
            this.method260("js5crc", -58);
            class84.field1634 = 1000;
            return;
        }
        if (class253.field4496.field3003 >= 4) {
            if (class84.field1634 == 0 || class84.field1634 == 5) {
                this.method260("js5io", -58);
                class84.field1634 = 1000;
                return;
            }
            class253.field4496.field3003 = 3;
            class127.field2453 = 3000;
        }
        if (class127.field2453-- > 0) {
            return;
        }
        try {
            if (class23.field568 == 0) {
                class115.field2199 = class157.field2954.method1715(class91.field1852, class191.field3390, true);
                class23.field568++;
            }
            if (class23.field568 == 1) {
                if (class115.field2199.field613 == 2) {
                    this.method1106((byte) -105, -1);
                    return;
                }
                if (class115.field2199.field613 == 1) {
                    class23.field568++;
                }
            }
            int var2 = -31 % ((-arg0 - 75) / 50);
            if (class23.field568 == 2) {
                class24.field585 = new class31((Socket) class115.field2199.field611, class157.field2954);
                class200 var3 = new class200(5);
                var3.method1388(-80, 15);
                var3.method1406(1472534024, 514);
                class24.field585.method209(var3.field3547, 4900, 5, 0);
                class23.field568++;
                class253.field4498 = class253.method1711((byte) -30);
            }
            if (class23.field568 == 3) {
                if (class84.field1634 == 0 || class84.field1634 == 5 || class24.field585.method208(-11084) > 0) {
                    int var4 = class24.field585.method204(-30290);
                    if (var4 != 0) {
                        this.method1106((byte) -125, var4);
                        return;
                    }
                    class23.field568++;
                } else if ((class253.method1711((byte) -121) - class253.field4498) > 30000L) {
                    this.method1106((byte) -120, -2);
                    return;
                }
            }
            if (class23.field568 == 4) {
                boolean var5 = class84.field1634 == 5 || class84.field1634 == 10 || class84.field1634 == 28;
                class253.field4496.method1156(class24.field585, 31359, !var5);
                class21.field543 = 0;
                class115.field2199 = null;
                class23.field568 = 0;
                class24.field585 = null;
            }
        } catch (IOException var6) {
            this.method1106((byte) -106, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method258(int arg0) {
        if (class258.field4578 != null) {
            class258.field4578.field3521 = false;
        }
        class258.field4578 = null;
        if (class248.field4415 != null) {
            class248.field4415.method207((byte) 119);
            class248.field4415 = null;
        }
        field2864++;
        class232.method1609(class50.field1057, false);
        class179.method1255(arg0 - 5, class50.field1057);
        if (class218.field3918 != null) {
            class218.field3918.method190(class50.field1057, (byte) -22);
        }
        if (arg0 != 5) {
            field2862 = null;
        }
        class53.method396(90);
        class55.method405((byte) 51);
        class218.field3918 = null;
        if (class25.field601 != null) {
            class25.field601.method352(-12563);
        }
        if (class76.field1517 != null) {
            class76.field1517.method352(arg0 ^ 0xFFFFCEE8);
        }
        class253.field4496.method1161(128);
        class200.field3541.method779((byte) -12);
        try {
            if (class25.field604 != null) {
                class25.field604.method1127(arg0 ^ 0xFFFFC96E);
            }
            if (class104.field1993 != null) {
                for (int var2 = 0; var2 < class104.field1993.length; var2++) {
                    if (class104.field1993[var2] != null) {
                        class104.field1993[var2].method1127(-13973);
                    }
                }
            }
            if (class180.field3249 != null) {
                class180.field3249.method1127(-13973);
            }
            if (class55.field1109 != null) {
                class55.field1109.method1127(arg0 - 13978);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method257(boolean arg0) {
        field2860++;
        if (class84.field1634 == 1000) {
            return;
        }
        class236.field4265++;
        if ((class236.field4265 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class178.field3217 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class263.field4669.setSeed((long) class178.field3217);
        }
        this.method1113(4102);
        if (class86.field1668 != null) {
            class86.field1668.method1603(0);
        }
        class91.method680(-11344);
        class7.method51(21966);
        class4.method21(arg0);
        class158.method1146(-10);
        if (class218.field3918 != null) {
            int var3 = class218.field3918.method191((byte) 83);
            class181.field3262 = var3;
        }
        if (class84.field1634 == 0) {
            this.method1105(-1);
            class142.method1012((byte) -7);
        } else if (class84.field1634 == 5) {
            this.method1105(-1);
            class142.method1012((byte) -7);
        } else if (class84.field1634 == 25 || class84.field1634 == 28) {
            class108.method767((byte) -78);
        }
        if (class84.field1634 == 10) {
            this.method1109((byte) 76);
            class113.method802((byte) 121);
            class264.method1792(101);
            class16.method124(0);
        } else if (class84.field1634 == 30) {
            class227.method1588(-14);
        } else if (class84.field1634 == 40) {
            class16.method124(0);
            if (class185.field3282 != -3) {
                if (class185.field3282 == 15) {
                    class97.method706((byte) -82);
                } else if (class185.field3282 != 2) {
                    class139.method997(5604, true);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method254(int arg0) {
        field2865++;
        if (class84.field1634 == 1000) {
            return;
        }
        boolean var2 = class184.method1272(22050);
        if (var2 && class91.field1854 && class25.field601 != null) {
            class25.field601.method351(256);
        }
        if ((class84.field1634 == 30 || class84.field1634 == 10) && (class144.field2739 || class267.field4716 != 0L && class253.method1711((byte) -98) > class267.field4716)) {
            class119.method848(class144.field2739, class65.field1286, 0, class173.method1236(-52), class7.field248);
        }
        if (class88.field1746 == null) {
            Container var3;
            if (class88.field1746 != null) {
                var3 = class88.field1746;
            } else if (class138.field2627 == null) {
                var3 = class157.field2954.field4514;
            } else {
                var3 = class138.field2627;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class138.field2627 == var3) {
                Insets var6 = class138.field2627.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class255.field4540 != var4 || class200.field3571 != var5) {
                if (class254.field4511.startsWith("mac")) {
                    class200.field3571 = var5;
                    class255.field4540 = var4;
                } else {
                    class60.method430((byte) 57);
                }
                class267.field4716 = class253.method1711((byte) -53) + 500L;
            }
        }
        boolean var7 = false;
        if (class136.field2603) {
            class136.field2603 = false;
            var7 = true;
        }
        if (var7) {
            class104.method746((byte) -22);
        }
        if (class84.field1634 == 0) {
            class106.method757(class122.field2389, var7, (Color) null, class234.field4223, 2);
        } else if (class84.field1634 == 5) {
            class218.method1535(false, (byte) 115, class141.field2684);
        } else if (class84.field1634 == 10) {
            class9.method72(20);
        } else if (class84.field1634 == 25 || class84.field1634 == 28) {
            if (class132.field2497 == 1) {
                if (class30.field635 < class23.field578) {
                    class30.field635 = class23.field578;
                }
                int var8 = (class30.field635 - class23.field578) * 50 / class30.field635;
                class46.method361((byte) -83, class109.method783(2, new class86[] { class272.field4768, class33.field726, class4.method26(false, var8), class220.field3954 }), false);
            } else if (class132.field2497 == 2) {
                if (class169.field3124 > class10.field324) {
                    class10.field324 = class169.field3124;
                }
                int var9 = ((class10.field324 - class169.field3124) * 50 / class10.field324) + 50;
                class46.method361((byte) -113, class109.method783(2, new class86[] { class272.field4768, class33.field726, class4.method26(false, var9), class220.field3954 }), false);
            } else {
                class46.method361((byte) -124, class272.field4768, false);
            }
        } else if (class84.field1634 == 30) {
            class141.method1000(-122);
        } else if (class84.field1634 == 40) {
            class46.method361((byte) -117, class109.method783(2, new class86[] { class143.field2718, class17.field496, class155.field2939 }), false);
        }
        if (arg0 <= 27) {
            this.method254(-13);
        }
        if ((class84.field1634 == 30 || class84.field1634 == 10) && class195.field3501 == 0 && !var7) {
            try {
                Graphics var10 = class50.field1057.getGraphics();
                for (int var11 = 0; var11 < class51.field1062; var11++) {
                    if (class204.field3686[var11]) {
                        class107.field2055.method159(class31.field665[var11], class216.field3902[var11], var10, class127.field2439[var11], (byte) -73, class37.field842[var11]);
                        class204.field3686[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class50.field1057.repaint();
            }
        } else if (class84.field1634 != 0) {
            try {
                Graphics var12 = class50.field1057.getGraphics();
                class107.field2055.method158(0, var12, 0, false);
                for (int var13 = 0; var13 < class51.field1062; var13++) {
                    class204.field3686[var13] = false;
                }
            } catch (Exception var14) {
                class50.field1057.repaint();
            }
        }
        if (class14.field435) {
            class43.method348(107);
        }
        if (class50.field1045 && class84.field1634 == 10 && class178.field3225 != -1) {
            class50.field1045 = false;
            class3.method15(75, class157.field2954);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwj;)I")
    public static final int method1111(class6 arg0) {
        class2 var1 = (class2) class56.field1132.method1698(((long) arg0.field222 << 32) + (long) arg0.field177, (byte) -3);
        return var1 == null ? arg0.field151 : var1.field24;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwj;)Z")
    public static final boolean method1112(class6 arg0) {
        if (class180.field3251) {
            if (method1111(arg0) != 0) {
                return false;
            }
            if (arg0.field184 == 0) {
                return false;
            }
        }
        return arg0.field231;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1113(int arg0) {
        field2854++;
        if (arg0 != 4102) {
            field2853 = 116;
        }
        boolean var2 = class253.field4496.method1163(arg0 ^ 0xFFFFE9F2);
        if (!var2) {
            this.method1110(45);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method265(int arg0) {
        class60.method430((byte) 69);
        class200.field3541 = new class109();
        field2856++;
        class253.field4496 = new class159();
        class208.method1480(-12, class157.field2954);
        if (class220.field3961 == 0) {
            class217.field3909 = this.getCodeBase().getHost();
            class187.field3314 = 443;
            class179.field3233 = 43594;
        } else if (class220.field3961 == 1) {
            class217.field3909 = this.getCodeBase().getHost();
            class187.field3314 = class13.field408 + 50000;
            class179.field3233 = class13.field408 + 40000;
        } else if (class220.field3961 == 2) {
            class187.field3314 = class13.field408 + 50000;
            class217.field3909 = "127.0.0.1";
            class179.field3233 = class13.field408 + 40000;
        }
        class260.field4648 = class179.field3233;
        class59.field1188 = class179.field3233;
        class191.field3390 = class260.field4648;
        if (class254.field4522 == 3 && class220.field3961 != 2) {
            class147.field2766 = class13.field408;
        }
        class91.field1852 = class217.field3909;
        if (class39.field910 == 1) {
            class142.field2699 = class77.field1521;
            class114.field2167 = class205.field3696;
            class81.field1589 = class88.field1750;
            class116.field2211 = class185.field3276;
        } else {
            class142.field2699 = class142.field2698;
            class116.field2211 = class7.field257;
            class81.field1589 = class241.field4331;
            class114.field2167 = class190.field3372;
        }
        class176.field3188 = class56.field1148 = class125.field2424 = class204.field3689 = new short[256];
        class113.field2162 = class187.field3314;
        class5.method33(arg0 ^ 0x5A);
        class160.method1167((byte) 70, class50.field1057);
        if (arg0 != 24) {
            this.method1109((byte) 125);
        }
        class39.method325(class50.field1057, -47);
        class218.field3918 = class260.method1773((byte) -8);
        if (class218.field3918 != null) {
            class218.field3918.method192(class50.field1057, false);
        }
        class271.field4761 = class254.field4522;
        try {
            if (class157.field2954.field4518 != null) {
                class25.field604 = new class155(class157.field2954.field4518, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class104.field1993[var2] = new class155(class157.field2954.field4524[var2], 6000, 0);
                }
                class180.field3249 = new class155(class157.field2954.field4520, 6000, 0);
                class118.field2313 = new class144(255, class25.field604, class180.field3249, 500000);
                class55.field1109 = new class155(class157.field2954.field4515, 24, 0);
                class157.field2954.field4515 = null;
                class157.field2954.field4518 = null;
                class157.field2954.field4524 = null;
                class157.field2954.field4520 = null;
            }
        } catch (IOException var3) {
            class25.field604 = null;
            class55.field1109 = null;
            class118.field2313 = null;
            class180.field3249 = null;
        }
        if (class220.field3961 != 0) {
            class68.field1327 = true;
        }
        class98.field1947 = class139.field2655;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field2859 = null;
        field2855 = null;
        if (arg0 < -24) {
            field2862 = null;
            field2851 = null;
        }
    }
}

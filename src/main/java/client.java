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
public class client extends class291 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Ltg;")
    public static class182 field2774;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Ltg;")
    public static class182 field2780;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    public static boolean field2789;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1050(int arg0) {
        field2775++;
        if (arg0 == 2) {
            boolean var2 = class58.field975.method1395(93);
            if (!var2) {
                this.method1059(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1051(byte arg0) {
        if (class278.field4888 != null) {
            class278.field4888.field2592 = false;
        }
        class278.field4888 = null;
        field2784++;
        if (class133.field2322 != null) {
            class133.field2322.method54((byte) -39);
            class133.field2322 = null;
        }
        class248.method1608(32767, class166.field2951);
        class265.method1766(class166.field2951, (byte) -46);
        if (arg0 >= -20) {
            field2779 = 37;
        }
        if (class144.field2538 != null) {
            class144.field2538.method614(class166.field2951, 0);
        }
        class95.method639((byte) -92);
        class116.method782(0);
        class144.field2538 = null;
        if (class226.field3917 != null) {
            class226.field3917.method1363((byte) 125);
        }
        if (class125.field2204 != null) {
            class125.field2204.method1363((byte) -123);
        }
        class58.field975.method1398(false);
        class22.field259.method381((byte) -83);
        try {
            if (class264.field4681 != null) {
                class264.field4681.method631((byte) -127);
            }
            if (class69.field1150 != null) {
                for (int var2 = 0; var2 < class69.field1150.length; var2++) {
                    if (class69.field1150[var2] != null) {
                        class69.field1150[var2].method631((byte) 122);
                    }
                }
            }
            if (class172.field3050 != null) {
                class172.field3050.method631((byte) 16);
            }
            if (class128.field2237 != null) {
                class128.field2237.method631((byte) 40);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltf;)Ltf;")
    public static final class107 method1052(class107 arg0) {
        int var1 = class23.method143(method1066(arg0), (byte) 26);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class22.method131(arg0.field1801, 1538872048);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1053(int arg0) {
        field2773++;
        method1054(-17243);
        class99.method688(false);
        class136.method930();
        class252.method1634((byte) 121);
        class25.method186(-27447);
        class41.method316((byte) -110);
        class229.method1505(-37);
        class88.method602(27201);
        class291.method1955((byte) -116);
        class60.method404((byte) -76);
        class17.method104((byte) 30);
        class146.method993(500);
        class284.method1857(0);
        class261.method1749((byte) 103);
        class7.method59(-1);
        class209.method1402(0);
        class56.method379(-55);
        class161.method1092((byte) -122);
        class236.method1538(true);
        class182.method1232(-1);
        class93.method624(-1627456160);
        class141.method957(120);
        class273.method1815((byte) 115);
        class156.method1070((byte) 124);
        class143.method969(-15);
        class131.method878(true);
        class107.method739((byte) 101);
        class183.method1254((byte) -38);
        class76.method532(-75);
        class237.method1546(-128);
        class133.method890(125);
        class86.method584((byte) 6);
        class224.method1481(false);
        class139.method948(16);
        class23.method139(-2);
        class202.method1365((byte) -109);
        class135.method917(4628);
        class28.method248(0);
        class270.method1785(-12);
        class75.method515(64);
        class216.method1444(-16119);
        class288.method1937(false);
        class257.method1664(-78);
        class2.method12(190);
        class125.method823((byte) -5);
        class197.method1320(-10454);
        class37.method288(8827);
        class151.method1006(1);
        class221.method1465(false);
        class97.method647(0);
        class276.method1826(-29234);
        class58.method390(0);
        class254.method1643((byte) 32);
        class230.method1508(4);
        class199.method1341((byte) -84);
        class69.method469((byte) -12);
        class239.method1559(true);
        class108.method746(127);
        class22.method128(-23);
        class13.method89(48);
        class11.method70((byte) -55);
        class153.method1031((byte) 103);
        class198.method1335(0);
        class21.method125(0);
        class79.method553((byte) 124);
        class285.method1881();
        class268.method1776(false);
        class166.method1116(-1);
        class27.method207();
        class290.method1942(108);
        class24.method185(0);
        class258.method1674((byte) -61);
        class181.method1212(1);
        class211.method1414((byte) 25);
        class192.method1301((byte) -33);
        class170.method1148((byte) 56);
        class70.method494();
        class55.method375(91);
        class50.method350(-120);
        class84.method577();
        class137.method937(true);
        class20.method120((byte) -118);
        class217.method1448((byte) 94);
        class155.method1043();
        class178.method1187((byte) -102);
        class150.method1004(false);
        class106.method728(-75);
        class277.method1832((byte) 41);
        class68.method458();
        class35.method283((byte) 92);
        class267.method1771(50);
        class212.method1420((byte) -79);
        class200.method1345(-75);
        class74.method510((byte) 94);
        class152.method1009(false);
        class164.method1106((byte) 65);
        class259.method1679(14547);
        class245.method1584(false);
        class243.method1576(false);
        class29.method250(-750968352);
        class39.method303(true);
        class180.method1204((byte) -45);
        class71.method501(false);
        class281.method1855((byte) 113);
        class234.method1525(127);
        class63.method409(125);
        class1.method5((byte) 126);
        class201.method1352(90);
        class145.method986((byte) 72);
        class247.method1602(255);
        class134.method896();
        class222.method1469(13);
        class94.method634(-1118394456);
        class173.method1164(true);
        if (arg0 <= 114) {
            field2774 = null;
        }
        class12.method83((byte) -43);
        class144.method983((byte) -82);
        class256.method1657(8);
        class174.method1170(false);
        class289.method1939((byte) 49);
        class54.method368(302);
        class260.method1690(44);
        class98.method650(1);
        class248.method1610(2);
        class77.method544((byte) 73);
        class57.method386(false);
        class167.method1135(false);
        class62.method407((byte) -123);
        class278.method1835((byte) 125);
        class78.method550((byte) 113);
        class61.method406();
        class101.method713(-121);
        class193.method1304(true);
        class171.method1153((byte) -82);
        class83.method565((byte) 125);
        class287.method1931(false);
        class206.method1382((byte) 120);
        class172.method1156(true);
        class65.method425(105);
        class9.method67(true);
        class80.method556((byte) 97);
        class121.method804((byte) 116);
        class269.method1777(-35);
        class227.method1490((byte) 29);
        class14.method95();
        class265.method1767(true);
        class90.method612(true);
        class190.method1293(true);
        class19.method116(-83);
        class43.method321((byte) 127);
        class263.method1758((byte) 49);
        class187.method1285(1);
        class208.method1390(4223);
        class67.method441((byte) -2);
        class111.method767(-6931);
        class36.method286((byte) 79);
        class127.method841(0);
        class169.method1146(-4);
        class244.method1580(-18945);
        class272.method1806(0);
        class64.method423(200);
        class123.method816(-2);
        class149.method1000(-14662);
        class100.method712((byte) -72);
        class44.method329(81);
        class52.method361((byte) -105);
        class204.method1374(115);
        class103.method720(116);
        class262.method1756(250);
        class185.method1272(112);
        class246.method1591();
        class242.method1574(92);
        class194.method1312((byte) -94);
        class205.method1376(122);
        class249.method1612(-101);
        class225.method1486(false);
        class240.method1561((byte) -15);
        class176.method1178();
        class274.method1824();
        class16.method99();
        class53.method364(-49);
        class89.method608(-107);
        class213.method1425();
        class154.method1039();
        class250.method1616((byte) 32);
        class168.method1139((byte) 70);
        class228.method1499(false);
        class130.method861(64);
        class271.method1801(-17217);
        class184.method1260((byte) -63);
        class189.method1291((byte) 52);
        class47.method338(-1);
        class142.method962((byte) 53);
        class251.method1624(true);
        class30.method256(1);
        class59.method401(-94);
        class42.method318((byte) 112);
        class115.method778((byte) -85);
        class46.method337(true);
        class218.method1454(false);
        class177.method1183(-216014384);
        class255.method1651(-42);
        class220.method1458(true);
        class73.method507((byte) -114);
        class124.method818(-18135);
        class34.method282((byte) 115);
        class138.method941(true);
        class96.method644(-120);
        class232.method1517(22742);
        class175.method1173(-21346);
        class223.method1473((byte) 112);
        class117.method787((byte) 41);
        class40.method310(121);
        class31.method259(86);
        class132.method882(true);
        class51.method354(0);
        class120.method802(false);
        class219.method1457((byte) -20);
        class105.method725((byte) -109);
        class92.method618(2);
        class253.method1637((byte) -82);
        class128.method849((byte) -124);
        class112.method770((byte) 49);
        class160.method1087(-106);
        class116.method786((byte) 111);
        class118.method796(-27110);
        class110.method759((byte) -105);
        class18.method107(-118);
        class122.method807(10700);
        class85.method582((byte) 47);
        class129.method851((byte) 105);
        class191.method1296(255);
        class264.method1762(-1);
        class226.method1489(255);
        class38.method300((byte) 31);
        class32.method266(-11);
        class102.method716(0);
        class119.method800(-105);
        class238.method1554(-81);
        class280.method1844(-106);
        class210.method1413(107);
        class215.method1439((byte) -126);
        class214.method1438((byte) 127);
        class165.method1109(false);
        class158.method1081((byte) -92);
        class81.method561(-126);
        class48.method343(75);
        class186.method1273(-3);
        class196.method1318(10305);
        class207.method1387(-1);
        class95.method636(-762835668);
        class33.method270((byte) 120);
        class82.method562(true);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field2774 = null;
        if (arg0 != -17243) {
            field2780 = null;
        }
        field2780 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1055(int arg0) {
        field2786++;
        if (!class229.field3961) {
            label229: while (true) {
                do {
                    if (!class174.method1171((byte) -118)) {
                        break label229;
                    }
                } while (class110.field1971 != 115 && class110.field1971 != 83);
                class229.field3961 = true;
            }
        }
        if (class118.field2092 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class231.method1513(77);
            if (class128.field2240 == 0L) {
                class128.field2240 = var4;
            }
            if (var3 > 16384 && var4 - class128.field2240 < 5000L) {
                if (var4 - class75.field1286 > 1000L) {
                    System.gc();
                    class75.field1286 = var4;
                }
                class54.field890 = class117.field2072;
                class244.field4217 = 5;
            } else {
                class244.field4217 = 5;
                class118.field2092 = 10;
                class54.field890 = class244.field4213;
            }
        } else if (class118.field2092 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class177.field3091[var6] = new class131(104, 104);
            }
            class118.field2092 = 30;
            class54.field890 = class110.field1975;
            class244.field4217 = 10;
        } else if (class118.field2092 == 30) {
            if (class12.field110 == null) {
                class12.field110 = new class161(class58.field975, class22.field259);
            }
            if (class12.field110.method1089(-24696)) {
                class119.field2112 = class145.method987(0, true, 13379, true, false);
                class260.field4535 = class145.method987(1, true, 13379, true, false);
                class208.field3604 = class145.method987(2, true, 13379, false, true);
                class138.field2430 = class145.method987(3, true, arg0 + 13309, true, false);
                class271.field4788 = class145.method987(4, true, arg0 ^ 0x3405, true, false);
                class269.field4732 = class145.method987(5, true, 13379, true, true);
                class227.field3923 = class145.method987(6, false, 13379, true, true);
                class9.field74 = class145.method987(7, true, 13379, true, false);
                class280.field4908 = class145.method987(8, true, 13379, true, false);
                class164.field2878 = class145.method987(9, true, 13379, true, false);
                class236.field4064 = class145.method987(10, true, 13379, true, false);
                class242.field4199 = class145.method987(11, true, 13379, true, false);
                class111.field2014 = class145.method987(12, true, arg0 + 13309, true, false);
                class276.field4860 = class145.method987(13, true, arg0 ^ 0x3405, true, false);
                class118.field2101 = class145.method987(14, false, 13379, true, false);
                class255.field4414 = class145.method987(15, true, 13379, true, false);
                class21.field246 = class145.method987(16, true, 13379, true, false);
                class240.field4157 = class145.method987(17, true, 13379, true, false);
                class185.field3277 = class145.method987(18, true, arg0 ^ 0x3405, true, false);
                class29.field540 = class145.method987(19, true, 13379, true, false);
                class169.field3019 = class145.method987(20, true, arg0 + 13309, true, false);
                class19.field212 = class145.method987(21, true, arg0 + 13309, true, false);
                class31.field563 = class145.method987(22, true, arg0 + 13309, true, false);
                class139.field2465 = class145.method987(23, true, arg0 + 13309, true, true);
                class260.field4547 = class145.method987(24, true, 13379, true, false);
                class239.field4123 = class145.method987(25, true, arg0 ^ 0x3405, true, false);
                class19.field211 = class145.method987(26, true, arg0 ^ 0x3405, true, true);
                class18.field188 = class145.method987(27, true, arg0 + 13309, true, false);
                class118.field2092 = 40;
                class54.field890 = class244.field4204;
                class244.field4217 = 15;
            } else {
                class54.field890 = class262.field4639;
                class244.field4217 = 12;
            }
        } else if (class118.field2092 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class127.field2216[var8].method1541(23836) * class189.field3338[var8] / 100;
            }
            if (var7 == 100) {
                class54.field890 = class82.field1448;
                class244.field4217 = 20;
                class168.method1141((byte) -95, class280.field4908);
                class11.method76(-126, class280.field4908);
                class208.method1393(true, class280.field4908);
                class118.field2092 = 45;
            } else {
                if (var7 != 0) {
                    class54.field890 = class198.method1332(104, new class99[] { class156.field2807, class198.method1333(-118, var7), class218.field3778 });
                }
                class244.field4217 = 20;
            }
        } else if (class118.field2092 == 45) {
            class187.method1282(2, class107.field1819, (byte) -30, 22050);
            class81.field1431 = new class23();
            class81.field1431.method167((byte) -107, 9, 128);
            class226.field3917 = class201.method1354(arg0 - 135, class24.field368, class166.field2951, 0, 22050);
            class226.field3917.method1366(class81.field1431, arg0 ^ 0x79CD);
            class92.method619(class271.field4788, class255.field4414, (byte) -16, class81.field1431, class118.field2101);
            class125.field2204 = class201.method1354(22, class24.field368, class166.field2951, 1, 2048);
            class165.field2899 = new class157();
            class125.field2204.method1366(class165.field2899, 31115);
            class51.field844 = new class135(22050, class225.field3905);
            class183.field3236 = class227.field3923.method1245(class270.field4754, false);
            class244.field4217 = 30;
            class54.field890 = class167.field2983;
            class118.field2092 = 50;
        } else if (class118.field2092 == 50) {
            int var9 = class202.method1364(class276.field4860, 50, class280.field4908);
            int var10 = class3.method15(-31903);
            if (var9 < var10) {
                class54.field890 = class198.method1332(116, new class99[] { class55.field901, class198.method1333(-103, var9 * 100 / var10), class218.field3778 });
                class244.field4217 = 35;
            } else {
                class118.field2092 = 60;
                class244.field4217 = 35;
                class54.field890 = class284.field4933;
            }
        } else if (class118.field2092 == 60) {
            int var11 = class288.method1933(arg0 - 13499, class280.field4908);
            int var12 = class12.method80((byte) -78);
            if (var11 < var12) {
                class54.field890 = class198.method1332(arg0 - 16, new class99[] { class223.field3878, class198.method1333(-110, var11 * 100 / var12), class218.field3778 });
                class244.field4217 = 40;
            } else {
                class54.field890 = class103.field1753;
                class244.field4217 = 40;
                class118.field2092 = 65;
            }
        } else if (class118.field2092 == 65) {
            class206.method1383(class276.field4860, 128, class280.field4908);
            class244.field4217 = 45;
            class54.field890 = class149.field2627;
            class138.method943(0, 5);
            class118.field2092 = 70;
        } else if (class118.field2092 == arg0) {
            byte var13 = 0;
            class208.field3604.method1241((byte) -79);
            int var14 = var13 + class208.field3604.method1237((byte) -90);
            class21.field246.method1241((byte) -93);
            int var15 = var14 + class21.field246.method1237((byte) -77);
            class240.field4157.method1241((byte) -87);
            int var16 = var15 + class240.field4157.method1237((byte) -97);
            class185.field3277.method1241((byte) -108);
            int var17 = var16 + class185.field3277.method1237((byte) -63);
            class29.field540.method1241((byte) -80);
            int var18 = var17 + class29.field540.method1237((byte) -39);
            class169.field3019.method1241((byte) -90);
            int var19 = var18 + class169.field3019.method1237((byte) -48);
            class19.field212.method1241((byte) -117);
            int var20 = var19 + class19.field212.method1237((byte) -66);
            class31.field563.method1241((byte) -68);
            int var21 = var20 + class31.field563.method1237((byte) -54);
            class260.field4547.method1241((byte) -99);
            int var22 = var21 + class260.field4547.method1237((byte) -29);
            class239.field4123.method1241((byte) -107);
            int var23 = var22 + class239.field4123.method1237((byte) -110);
            class18.field188.method1241((byte) -107);
            int var24 = var23 + class18.field188.method1237((byte) -59);
            if (var24 < 1100) {
                class54.field890 = class198.method1332(arg0 + 30, new class99[] { class198.field3445, class198.method1333(-99, var24 / 11), class218.field3778 });
                class244.field4217 = 50;
            } else {
                class22.method135(class208.field3604, 0);
                class1.method9(arg0 ^ 0x42, class208.field3604);
                class41.method314(-100, class208.field3604);
                class17.method103(class9.field74, class208.field3604, true);
                class201.method1350(class21.field246, 11034, class9.field74, true);
                class223.method1477(arg0 ^ 0xFFFFFFC5, class185.field3277, class9.field74);
                class190.method1292(class152.field2667, true, class29.field540, class9.field74, 18507);
                class198.method1334(arg0 ^ 0xFFFFFFE6, class208.field3604);
                class217.method1450(class260.field4535, class169.field3019, class119.field2112, 52);
                class65.method428(class19.field212, false, class9.field74);
                class143.method971(class31.field563, 0);
                class265.method1765(class208.field3604, (byte) -123);
                class11.method78(class138.field2430, -400, class9.field74, class280.field4908, class276.field4860);
                class291.method1951(class208.field3604, 1000);
                class273.method1819((byte) -16, class240.field4157);
                class102.method714(class260.field4547, class239.field4123, -87, new class1());
                class267.method1772(true, class239.field4123, class260.field4547);
                class54.field890 = class50.field819;
                class244.field4217 = 50;
                class71.method497(0);
                class118.field2092 = 80;
            }
        } else if (class118.field2092 == 80) {
            int var25 = class267.method1770(class280.field4908, true);
            int var26 = class192.method1300(16);
            if (var26 > var25) {
                class54.field890 = class198.method1332(118, new class99[] { class118.field2082, class198.method1333(arg0 - 185, var25 * 100 / var26), class218.field3778 });
                class244.field4217 = 60;
            } else {
                class11.method75(0, class280.field4908);
                class118.field2092 = 90;
                class54.field890 = class263.field4650;
                class244.field4217 = 60;
            }
        } else if (class118.field2092 == 90) {
            if (class19.field211.method1241((byte) -92)) {
                class145 var27 = new class145(class164.field2878, class19.field211, class280.field4908, 20, !class272.field4792);
                class134.method902(var27);
                if (class264.field4669 == 1) {
                    class134.method893(0.9F);
                }
                if (class264.field4669 == 2) {
                    class134.method893(0.8F);
                }
                if (class264.field4669 == 3) {
                    class134.method893(0.7F);
                }
                if (class264.field4669 == 4) {
                    class134.method893(0.6F);
                }
                class118.field2092 = 100;
                class54.field890 = class9.field82;
                class244.field4217 = 70;
            } else {
                class54.field890 = class198.method1332(105, new class99[] { class82.field1447, class198.method1333(-84, class19.field211.method1237((byte) -96)), class218.field3778 });
                class244.field4217 = 70;
            }
        } else if (class118.field2092 == 100) {
            if (class163.method1103(class280.field4908, -11176)) {
                class118.field2092 = 110;
            }
        } else if (class118.field2092 == 110) {
            class278.field4888 = new class146();
            class24.field368.method594(-30175, class278.field4888, 10);
            class118.field2092 = 120;
            class244.field4217 = 75;
            class54.field890 = class142.field2501;
        } else if (class118.field2092 == 120) {
            if (class236.field4064.method1221(class20.field234, class215.field3729, (byte) -127)) {
                class222 var28 = new class222(class236.field4064.method1231(class215.field3729, class20.field234, (byte) 70));
                class124.method821(var28, 0);
                class118.field2092 = 130;
                class244.field4217 = 80;
                class54.field890 = class204.field3544;
            } else {
                class54.field890 = class198.method1332(100, new class99[] { class288.field5047, class137.field2416 });
                class244.field4217 = 80;
            }
        } else if (class118.field2092 == 130) {
            if (!class138.field2430.method1241((byte) -120)) {
                class54.field890 = class198.method1332(123, new class99[] { class259.field4526, class198.method1333(-116, class138.field2430.method1237((byte) -10) * 3 / 4), class218.field3778 });
                class244.field4217 = 85;
            } else if (!class111.field2014.method1241((byte) -111)) {
                class54.field890 = class198.method1332(arg0 + 22, new class99[] { class259.field4526, class198.method1333(arg0 ^ 0xFFFFFFDB, class111.field2014.method1237((byte) -46) / 10 + 75), class218.field3778 });
                class244.field4217 = 85;
            } else if (!class276.field4860.method1241((byte) -88)) {
                class54.field890 = class198.method1332(101, new class99[] { class259.field4526, class198.method1333(arg0 ^ 0xFFFFFFEC, (class276.field4860.method1237((byte) -22) / 20) + 85), class218.field3778 });
                class244.field4217 = 85;
            } else if (class139.field2465.method1238(arg0 + 40, class237.field4098)) {
                class262.method1752(class139.field2465, class120.field2124, class290.field5095, class265.field4692, class92.field1558, class93.field1560, (byte) -77);
                class136.method926(class18.field188);
                class244.field4217 = 95;
                class118.field2092 = 135;
                class54.field890 = class190.field3344;
            } else {
                class54.field890 = class198.method1332(93, new class99[] { class259.field4526, class198.method1333(arg0 - 198, class139.field2465.method1235(class237.field4098, true) / 10 + 90), class218.field3778 });
                class244.field4217 = 85;
            }
        } else if (class118.field2092 == 135) {
            int var29 = class165.method1108(126);
            if (var29 == -1) {
                class54.field890 = class110.field1979;
                class244.field4217 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method1953("worldlistfull", arg0 - 70);
                class138.method943(0, 1000);
            } else if (class30.field554) {
                class244.field4217 = 96;
                class54.field890 = class287.field5025;
                class118.field2092 = 140;
            } else {
                this.method1953("worldlistio_" + var29, 0);
                class138.method943(0, 1000);
            }
        } else if (class118.field2092 == 140) {
            class190.field3341 = class138.field2430.method1245(class272.field4814, false);
            class269.field4732.method1225(true, false, arg0 + 50);
            class227.field3923.method1225(true, true, arg0 ^ 0x76);
            class280.field4908.method1225(true, true, -99);
            class276.field4860.method1225(true, true, 56);
            class236.field4064.method1225(true, true, arg0 ^ 0xFFFFFFD1);
            class138.field2430.method1225(true, true, 98);
            class54.field890 = class29.field544;
            class118.field2092 = 150;
            class244.field4217 = 97;
            class234.field4038 = true;
        } else if (class118.field2092 == 150) {
            if (class229.field3961) {
                class36.field628 = 0;
                class65.field1102 = 0;
                class221.field3844 = 0;
            }
            class229.field3961 = true;
            class1.method8((byte) 34, class24.field368);
            class249.method1613(-128, -1, false, -1, class36.field628);
            class244.field4217 = 100;
            class54.field890 = class48.field796;
            class118.field2092 = 160;
        } else if (class118.field2092 == 160) {
            class223.method1476(true, arg0 ^ 0xFFFFFFC8);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method1056(int arg0, int arg1) {
        int var2 = 91 / ((22 - arg1) / 62);
        field2788++;
        class24 var3 = class205.field3552;
        synchronized (class205.field3552) {
            class108.field1957 = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1057(boolean arg0) {
        if (!arg0) {
            field2780 = null;
        }
        field2783++;
        if (class156.field2808 == 1000) {
            return;
        }
        class56.field926++;
        if (class56.field926 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class257.field4431 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class9.field68.setSeed((long) class257.field4431);
        }
        this.method1050(2);
        if (class12.field110 != null) {
            class12.field110.method1093((byte) -102);
        }
        class227.method1491((byte) -104);
        class225.method1485(0);
        class125.method827(false);
        class225.method1484(false);
        if (class144.field2538 != null) {
            int var3 = class144.field2538.method616(1000);
            class156.field2801 = var3;
        }
        if (class156.field2808 == 0) {
            this.method1055(70);
            class228.method1496((byte) -114);
        } else if (class156.field2808 == 5) {
            this.method1055(70);
            class228.method1496((byte) -79);
        } else if (class156.field2808 == 25 || class156.field2808 == 28) {
            class167.method1137(32104);
        }
        if (class156.field2808 == 10) {
            this.method1065(-109);
            class271.method1798((byte) 92);
            class20.method119(128);
            class46.method336(20939);
        } else if (class156.field2808 == 30) {
            class22.method130(-2046862544);
        } else if (class156.field2808 == 40) {
            class46.method336(20939);
            if (class65.field1107 != -3) {
                if (class65.field1107 == 15) {
                    class249.method1614(-106);
                } else if (class65.field1107 != 2) {
                    class116.method784((byte) 12);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltf;)Z")
    public static final boolean method1058(class107 arg0) {
        if (class278.field4881) {
            if (method1066(arg0) != 0) {
                return false;
            }
            if (arg0.field1814 == 0) {
                return false;
            }
        }
        return arg0.field1934;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1059(boolean arg0) {
        field2782++;
        if (class58.field975.field3639 > class273.field4828) {
            if (class7.field63 == class165.field2898) {
                class7.field63 = class28.field528;
            } else {
                class7.field63 = class165.field2898;
            }
            class41.field702 = (class58.field975.field3639 - 1) * 50 * 5;
            if (class41.field702 > 3000) {
                class41.field702 = 3000;
            }
            if (class58.field975.field3639 >= 2 && class58.field975.field3642 == 6) {
                this.method1953("js5connect_outofdate", 0);
                class156.field2808 = 1000;
                return;
            }
            if (class58.field975.field3639 >= 4 && class58.field975.field3642 == -1) {
                this.method1953("js5crc", 0);
                class156.field2808 = 1000;
                return;
            }
            if (class58.field975.field3639 >= 4 && (class156.field2808 == 0 || class156.field2808 == 5)) {
                if (class58.field975.field3642 == 7 || class58.field975.field3642 == 9) {
                    this.method1953("js5connect_full", 0);
                } else if (class58.field975.field3642 > 0) {
                    this.method1953("js5connect", 0);
                } else {
                    this.method1953("js5io", 0);
                }
                class156.field2808 = 1000;
                return;
            }
        }
        class273.field4828 = class58.field975.field3639;
        if (class41.field702 > 0) {
            class41.field702--;
            return;
        }
        try {
            if (class19.field204 == 0) {
                class73.field1220 = class24.field368.method586(class196.field3420, 47, class7.field63);
                class19.field204++;
            }
            if (class19.field204 == 1) {
                if (class73.field1220.field4844 == 2) {
                    this.method1061(1000, -12978);
                    return;
                }
                if (class73.field1220.field4844 == 1) {
                    class19.field204++;
                }
            }
            if (class19.field204 == 2) {
                class63.field1047 = new class7((Socket) class73.field1220.field4843, class24.field368);
                class261 var2 = new class261(5);
                var2.method1691(15, (byte) 53);
                var2.method1701(524, 4994);
                class63.field1047.method55(var2.field4619, (byte) -88, 0, 5);
                class19.field204++;
                class137.field2417 = class231.method1513(69);
            }
            if (class19.field204 == 3) {
                if (class156.field2808 == 0 || class156.field2808 == 5 || class63.field1047.method62(-1) > 0) {
                    int var3 = class63.field1047.method57(-108);
                    if (var3 != 0) {
                        this.method1061(var3, -12978);
                        return;
                    }
                    class19.field204++;
                } else if (class231.method1513(-26) - class137.field2417 > 30000L) {
                    this.method1061(1001, -12978);
                    return;
                }
            }
            if (arg0) {
                this.method1065(-111);
            }
            if (class19.field204 == 4) {
                boolean var4 = class156.field2808 == 5 || class156.field2808 == 10 || class156.field2808 == 28;
                class58.field975.method1405((byte) -63, !var4, class63.field1047);
                class63.field1047 = null;
                class19.field204 = 0;
                class73.field1220 = null;
            }
        } catch (IOException var5) {
            this.method1061(1002, -12978);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2778++;
        if (!this.method1952(-89)) {
            return;
        }
        class222.field3859 = Integer.parseInt(this.getParameter("worldid"));
        class161.field2856 = Integer.parseInt(this.getParameter("modewhere"));
        if (class161.field2856 < 0 || class161.field2856 > 1) {
            class161.field2856 = 0;
        }
        class169.field3010 = Integer.parseInt(this.getParameter("modewhat"));
        if (class169.field3010 < 0 || class169.field3010 > 2) {
            class169.field3010 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class123.field2161 = true;
        } else {
            class123.field2161 = false;
        }
        try {
            class184.field3271 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class184.field3271 = 0;
        }
        class271.method1800(class184.field3271, -61);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class137.field2412 = true;
        } else {
            class137.field2412 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class37.field650 = true;
        } else {
            class37.field650 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class34.field613 = 1;
        } else {
            class34.field613 = 0;
        }
        try {
            class64.field1083 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class64.field1083 = 0;
        }
        class281.field4928 = class17.field170.method666(this, -13);
        if (class281.field4928 == null) {
            class281.field4928 = class20.field234;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class29.field541 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class29.field541 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class63.field1073 = true;
        } else {
            class63.field1073 = false;
        }
        class175.field3082 = this;
        this.method1950(class169.field3010 + 32, 524, (byte) -128, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1060(int arg0) {
        field2785++;
        if (class156.field2808 == 1000) {
            return;
        }
        boolean var2 = class258.method1672(false);
        if (var2 && class127.field2222 && class226.field3917 != null) {
            class226.field3917.method1360(arg0 ^ 0x2606);
        }
        if ((class156.field2808 == 30 || class156.field2808 == 10) && (class41.field698 || class178.field3099 != 0L && class231.method1513(-107) > class178.field3099)) {
            class249.method1613(-127, class101.field1719, class41.field698, class158.field2824, class143.method972(-3));
        }
        if (class253.field4377 == null) {
            Container var3;
            if (class253.field4377 != null) {
                var3 = class253.field4377;
            } else if (class75.field1281 == null) {
                var3 = class24.field368.field1493;
            } else {
                var3 = class75.field1281;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class75.field1281 == var3) {
                Insets var6 = class75.field1281.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class254.field4390 != var4 || class280.field4901 != var5) {
                if (class87.field1510.startsWith("mac")) {
                    class254.field4390 = var4;
                    class280.field4901 = var5;
                } else {
                    class40.method311(-91);
                }
                class178.field3099 = class231.method1513(115) + 500L;
            }
        }
        boolean var7 = false;
        if (class125.field2193) {
            var7 = true;
            class125.field2193 = false;
        }
        if (var7) {
            class122.method810((byte) 70);
        }
        if (class156.field2808 == 0) {
            class95.method640(class244.field4217, class54.field890, (byte) 107, var7, (Color) null);
        } else if (class156.field2808 == 5) {
            class54.method370(false, class228.field3950, (byte) -121);
        } else if (class156.field2808 == 10) {
            class193.method1309(true);
        } else if (class156.field2808 == 25 || class156.field2808 == 28) {
            if (class222.field3866 == 1) {
                if (class184.field3274 > class269.field4727) {
                    class269.field4727 = class184.field3274;
                }
                int var8 = (class269.field4727 - class184.field3274) * 50 / class269.field4727;
                class99.method672(class198.method1332(95, new class99[] { class251.field4324, class276.field4859, class198.method1333(-128, var8), class57.field941 }), false, true);
            } else if (class222.field3866 == 2) {
                if (class117.field2076 > class39.field671) {
                    class39.field671 = class117.field2076;
                }
                int var9 = ((class39.field671 - class117.field2076) * 50 / class39.field671) + 50;
                class99.method672(class198.method1332(60, new class99[] { class251.field4324, class276.field4859, class198.method1333(-103, var9), class57.field941 }), false, true);
            } else {
                class99.method672(class251.field4324, false, true);
            }
        } else if (class156.field2808 == 30) {
            class166.method1131(arg0 ^ 0x731F);
        } else if (class156.field2808 == 40) {
            class99.method672(class198.method1332(124, new class99[] { class225.field3907, class271.field4785, class22.field257 }), false, true);
        }
        if (arg0 != 28) {
            field2779 = 120;
        }
        if ((class156.field2808 == 30 || class156.field2808 == 10) && class164.field2881 == 0 && !var7) {
            try {
                Graphics var10 = class166.field2951.getGraphics();
                for (int var11 = 0; var11 < class227.field3928; var11++) {
                    if (class101.field1720[var11]) {
                        class123.field2156.method65(class51.field848[var11], class94.field1584[var11], class33.field581[var11], (byte) 122, var10, class112.field2029[var11]);
                        class101.field1720[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class166.field2951.repaint();
            }
        } else if (class156.field2808 != 0) {
            try {
                Graphics var12 = class166.field2951.getGraphics();
                class123.field2156.method63(0, var12, -22828, 0);
                for (int var13 = 0; var13 < class227.field3928; var13++) {
                    class101.field1720[var13] = false;
                }
            } catch (Exception var14) {
                class166.field2951.repaint();
            }
        }
        if (class234.field4038) {
            class21.method124(-76);
        }
        if (class229.field3961 && class156.field2808 == 10 && class9.field75 != -1) {
            class229.field3961 = false;
            class1.method8((byte) 34, class24.field368);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1061(int arg0, int arg1) {
        class58.field975.field3639++;
        class19.field204 = 0;
        class58.field975.field3642 = arg0;
        class73.field1220 = null;
        class63.field1047 = null;
        field2777++;
        if (arg1 != -12978) {
            this.method1065(67);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltf;IIIIIII)V")
    public static final void method1062(class107[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class107 var9 = arg0[var8];
            if (var9 != null && var9.field1801 == arg1 && (!var9.field1915 || var9.field1814 == 0 || var9.field1827 || method1066(var9) != 0 || class149.field2616 == var9 || var9.field1937 == 1338) && (!var9.field1915 || !method1058(var9))) {
                int var10 = var9.field1921 + arg6;
                int var11 = var9.field1856 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1814 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1933 + var10;
                    int var17 = var9.field1793 + var11;
                    if (var9.field1814 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class42.field717 == var9) {
                    class209.field3632 = true;
                    class23.field322 = var10;
                    class7.field56 = var11;
                }
                if (!var9.field1915 || var12 < var14 && var13 < var15) {
                    if (var9.field1814 == 0) {
                        if (!var9.field1915 && method1058(var9) && class192.field3382 != var9) {
                            continue;
                        }
                        if (var9.field1859 && class172.field3054 >= var12 && class38.field656 >= var13 && class172.field3054 < var14 && class38.field656 < var15) {
                            for (class260 var18 = (class260) class34.field612.method529(10); var18 != null; var18 = (class260) class34.field612.method533(-59)) {
                                if (var18.field4550) {
                                    var18.method828((byte) 122);
                                    var18.field4553.field1826 = false;
                                }
                            }
                            if (class11.field84 == 0) {
                                class42.field717 = null;
                                class149.field2616 = null;
                            }
                            class56.field918 = false;
                        }
                    }
                    if (var9.field1915) {
                        boolean var19;
                        if (class172.field3054 >= var12 && class38.field656 >= var13 && class172.field3054 < var14 && class38.field656 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class51.field849 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class21.field243 == 1 && class11.field97 >= var12 && class122.field2133 >= var13 && class11.field97 < var14 && class122.field2133 < var15) {
                            var21 = true;
                        }
                        if (class124.field2176 > 0 && var9.field1902 != null) {
                            for (int var22 = 0; var22 < var9.field1902.length; var22++) {
                                for (int var23 = 0; var23 < class124.field2176; var23++) {
                                    int var24 = var9.field1902[var22] & 0xFF;
                                    if (class180.field3131[var23] == var24) {
                                        if (var9.field1896 != null) {
                                            byte var25 = var9.field1896[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class51.field839[86] || (var25 & 0x1) != 0 && !class51.field839[82] || (var25 & 0x4) != 0 && !class51.field839[81])) {
                                                continue;
                                            }
                                        }
                                        class65.method424(var9.field1873, var22 + 1, class20.field234, (byte) -45, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class280.method1842(class122.field2133 - var11, class11.field97 - var10, -129, var9);
                        }
                        if (class42.field717 != null && class42.field717 != var9 && var19 && class163.method1100((byte) 96, method1066(var9))) {
                            class214.field3722 = var9;
                        }
                        if (class149.field2616 == var9) {
                            class260.field4537 = true;
                            class76.field1354 = var10;
                            class103.field1748 = var11;
                        }
                        if (var9.field1827 || var9.field1937 != 0) {
                            if (var19 && class156.field2801 != 0 && var9.field1817 != null) {
                                class260 var26 = new class260();
                                var26.field4550 = true;
                                var26.field4553 = var9;
                                var26.field4552 = class156.field2801;
                                var26.field4543 = var9.field1817;
                                class34.field612.method536(var26, (byte) 77);
                            }
                            if (class42.field717 != null || class289.field5058 != null || class244.field4209 || var9.field1937 != 1400 && class56.field918) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1937 != 0) {
                                if (var9.field1937 == 1337) {
                                    class28.field532 = var9;
                                    class238.method1555(var9, 10555);
                                    continue;
                                }
                                if (var9.field1937 == 1338) {
                                    if (var21) {
                                        class131.field2283 = class11.field97 - var10;
                                        class208.field3602 = class122.field2133 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1937 == 1400) {
                                    class76.field1351 = var9;
                                    if (var21) {
                                        if (class51.field839[82] && class103.field1751 > 0) {
                                            int var27 = (int) ((double) (class11.field97 - var10 - var9.field1933 / 2) * 2.0D / (double) class31.field560);
                                            int var28 = (int) ((double) (class122.field2133 - var11 - var9.field1793 / 2) * 2.0D / (double) class31.field560);
                                            int var29 = class217.field3775 + var27;
                                            int var30 = class119.field2102 + var28;
                                            int var31 = class48.field802 + var29;
                                            int var32 = class230.field3983 + class112.field2026 - var30 - 1;
                                            class278.method1836((byte) 95, var31, 0, var32);
                                            class57.method388((byte) 46);
                                            continue;
                                        }
                                        class56.field918 = true;
                                        class139.field2466 = class172.field3054;
                                        class90.field1537 = class38.field656;
                                        class59.field996 = class217.field3775;
                                        class32.field577 = class119.field2102;
                                        continue;
                                    }
                                    if (var20 && class56.field918) {
                                        class251.method1629(-1, (int) ((double) (class139.field2466 - class172.field3054) * 2.0D / (double) class121.field2131) + class59.field996);
                                        class48.method344(17399, (int) ((double) (class90.field1537 - class38.field656) * 2.0D / (double) class121.field2131) + class32.field577);
                                        continue;
                                    }
                                    class56.field918 = false;
                                    continue;
                                }
                                if (var9.field1937 == 1401) {
                                    if (var20) {
                                        class181.method1214(true, class172.field3054 - var10, class38.field656 - var11, var9.field1793, var9.field1933);
                                    }
                                    continue;
                                }
                                if (var9.field1937 == 1402) {
                                    class238.method1555(var9, 10555);
                                    continue;
                                }
                            }
                            if (!var9.field1868 && var21) {
                                var9.field1868 = true;
                                if (var9.field1824 != null) {
                                    class260 var33 = new class260();
                                    var33.field4550 = true;
                                    var33.field4553 = var9;
                                    var33.field4541 = class11.field97 - var10;
                                    var33.field4552 = class122.field2133 - var11;
                                    var33.field4543 = var9.field1824;
                                    class34.field612.method536(var33, (byte) -11);
                                }
                            }
                            if (var9.field1868 && var20 && var9.field1800 != null) {
                                class260 var34 = new class260();
                                var34.field4550 = true;
                                var34.field4553 = var9;
                                var34.field4541 = class172.field3054 - var10;
                                var34.field4552 = class38.field656 - var11;
                                var34.field4543 = var9.field1800;
                                class34.field612.method536(var34, (byte) 81);
                            }
                            if (var9.field1868 && !var20) {
                                var9.field1868 = false;
                                if (var9.field1846 != null) {
                                    class260 var35 = new class260();
                                    var35.field4550 = true;
                                    var35.field4553 = var9;
                                    var35.field4541 = class172.field3054 - var10;
                                    var35.field4552 = class38.field656 - var11;
                                    var35.field4543 = var9.field1846;
                                    class101.field1730.method536(var35, (byte) 90);
                                }
                            }
                            if (var20 && var9.field1938 != null) {
                                class260 var36 = new class260();
                                var36.field4550 = true;
                                var36.field4553 = var9;
                                var36.field4541 = class172.field3054 - var10;
                                var36.field4552 = class38.field656 - var11;
                                var36.field4543 = var9.field1938;
                                class34.field612.method536(var36, (byte) 126);
                            }
                            if (!var9.field1826 && var19) {
                                var9.field1826 = true;
                                if (var9.field1795 != null) {
                                    class260 var37 = new class260();
                                    var37.field4550 = true;
                                    var37.field4553 = var9;
                                    var37.field4541 = class172.field3054 - var10;
                                    var37.field4552 = class38.field656 - var11;
                                    var37.field4543 = var9.field1795;
                                    class34.field612.method536(var37, (byte) 111);
                                }
                            }
                            if (var9.field1826 && var19 && var9.field1931 != null) {
                                class260 var38 = new class260();
                                var38.field4550 = true;
                                var38.field4553 = var9;
                                var38.field4541 = class172.field3054 - var10;
                                var38.field4552 = class38.field656 - var11;
                                var38.field4543 = var9.field1931;
                                class34.field612.method536(var38, (byte) 127);
                            }
                            if (var9.field1826 && !var19) {
                                var9.field1826 = false;
                                if (var9.field1778 != null) {
                                    class260 var39 = new class260();
                                    var39.field4550 = true;
                                    var39.field4553 = var9;
                                    var39.field4541 = class172.field3054 - var10;
                                    var39.field4552 = class38.field656 - var11;
                                    var39.field4543 = var9.field1778;
                                    class101.field1730.method536(var39, (byte) 127);
                                }
                            }
                            if (var9.field1944 != null) {
                                class260 var40 = new class260();
                                var40.field4553 = var9;
                                var40.field4543 = var9.field1944;
                                class44.field772.method536(var40, (byte) 89);
                            }
                            if (var9.field1854 != null && class191.field3362 > var9.field1900) {
                                if (var9.field1807 == null || class191.field3362 - var9.field1900 > 32) {
                                    class260 var45 = new class260();
                                    var45.field4553 = var9;
                                    var45.field4543 = var9.field1854;
                                    class34.field612.method536(var45, (byte) 73);
                                } else {
                                    label546: for (int var41 = var9.field1900; var41 < class191.field3362; var41++) {
                                        int var42 = class43.field751[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1807.length; var43++) {
                                            if (var9.field1807[var43] == var42) {
                                                class260 var44 = new class260();
                                                var44.field4553 = var9;
                                                var44.field4543 = var9.field1854;
                                                class34.field612.method536(var44, (byte) 96);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field1900 = class191.field3362;
                            }
                            if (var9.field1840 != null && class180.field3128 > var9.field1882) {
                                if (var9.field1892 == null || class180.field3128 - var9.field1882 > 32) {
                                    class260 var50 = new class260();
                                    var50.field4553 = var9;
                                    var50.field4543 = var9.field1840;
                                    class34.field612.method536(var50, (byte) 93);
                                } else {
                                    label522: for (int var46 = var9.field1882; var46 < class180.field3128; var46++) {
                                        int var47 = class77.field1370[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1892.length; var48++) {
                                            if (var9.field1892[var48] == var47) {
                                                class260 var49 = new class260();
                                                var49.field4553 = var9;
                                                var49.field4543 = var9.field1840;
                                                class34.field612.method536(var49, (byte) 81);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field1882 = class180.field3128;
                            }
                            if (var9.field1821 != null && class211.field3663 > var9.field1909) {
                                if (var9.field1841 == null || class211.field3663 - var9.field1909 > 32) {
                                    class260 var55 = new class260();
                                    var55.field4553 = var9;
                                    var55.field4543 = var9.field1821;
                                    class34.field612.method536(var55, (byte) -126);
                                } else {
                                    label498: for (int var51 = var9.field1909; var51 < class211.field3663; var51++) {
                                        int var52 = class21.field239[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1841.length; var53++) {
                                            if (var9.field1841[var53] == var52) {
                                                class260 var54 = new class260();
                                                var54.field4553 = var9;
                                                var54.field4543 = var9.field1821;
                                                class34.field612.method536(var54, (byte) -68);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field1909 = class211.field3663;
                            }
                            if (var9.field1878 != null && class191.field3367 > var9.field1799) {
                                if (var9.field1884 == null || class191.field3367 - var9.field1799 > 32) {
                                    class260 var60 = new class260();
                                    var60.field4553 = var9;
                                    var60.field4543 = var9.field1878;
                                    class34.field612.method536(var60, (byte) -89);
                                } else {
                                    label474: for (int var56 = var9.field1799; var56 < class191.field3367; var56++) {
                                        int var57 = class137.field2423[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1884.length; var58++) {
                                            if (var9.field1884[var58] == var57) {
                                                class260 var59 = new class260();
                                                var59.field4553 = var9;
                                                var59.field4543 = var9.field1878;
                                                class34.field612.method536(var59, (byte) -87);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field1799 = class191.field3367;
                            }
                            if (var9.field1870 != null && class234.field4028 > var9.field1839) {
                                if (var9.field1888 == null || class234.field4028 - var9.field1839 > 32) {
                                    class260 var65 = new class260();
                                    var65.field4553 = var9;
                                    var65.field4543 = var9.field1870;
                                    class34.field612.method536(var65, (byte) 85);
                                } else {
                                    label450: for (int var61 = var9.field1839; var61 < class234.field4028; var61++) {
                                        int var62 = class86.field1483[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1888.length; var63++) {
                                            if (var9.field1888[var63] == var62) {
                                                class260 var64 = new class260();
                                                var64.field4553 = var9;
                                                var64.field4543 = var9.field1870;
                                                class34.field612.method536(var64, (byte) 94);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field1839 = class234.field4028;
                            }
                            if (class261.field4621 > var9.field1864 && var9.field1879 != null) {
                                class260 var66 = new class260();
                                var66.field4553 = var9;
                                var66.field4543 = var9.field1879;
                                class34.field612.method536(var66, (byte) 79);
                            }
                            if (class290.field5084 > var9.field1864 && var9.field1835 != null) {
                                class260 var67 = new class260();
                                var67.field4553 = var9;
                                var67.field4543 = var9.field1835;
                                class34.field612.method536(var67, (byte) -126);
                            }
                            if (class96.field1624 > var9.field1864 && var9.field1910 != null) {
                                class260 var68 = new class260();
                                var68.field4553 = var9;
                                var68.field4543 = var9.field1910;
                                class34.field612.method536(var68, (byte) -9);
                            }
                            if (class88.field1519 > var9.field1864 && var9.field1894 != null) {
                                class260 var69 = new class260();
                                var69.field4553 = var9;
                                var69.field4543 = var9.field1894;
                                class34.field612.method536(var69, (byte) -7);
                            }
                            if (class21.field244 > var9.field1864 && var9.field1901 != null) {
                                class260 var70 = new class260();
                                var70.field4553 = var9;
                                var70.field4543 = var9.field1901;
                                class34.field612.method536(var70, (byte) 107);
                            }
                            var9.field1864 = class28.field514;
                            if (var9.field1849 != null) {
                                for (int var71 = 0; var71 < class124.field2176; var71++) {
                                    class260 var72 = new class260();
                                    var72.field4553 = var9;
                                    var72.field4556 = class180.field3131[var71];
                                    var72.field4551 = class30.field552[var71];
                                    var72.field4543 = var9.field1849;
                                    class34.field612.method536(var72, (byte) 113);
                                }
                            }
                            if (class250.field4321 && var9.field1869 != null) {
                                class260 var73 = new class260();
                                var73.field4553 = var9;
                                var73.field4543 = var9.field1869;
                                class34.field612.method536(var73, (byte) -59);
                            }
                        }
                    }
                    if (!var9.field1915 && class42.field717 == null && class289.field5058 == null && !class244.field4209) {
                        if ((var9.field1940 >= 0 || var9.field1831 != 0) && class172.field3054 >= var12 && class38.field656 >= var13 && class172.field3054 < var14 && class38.field656 < var15) {
                            if (var9.field1940 >= 0) {
                                class192.field3382 = arg0[var9.field1940];
                            } else {
                                class192.field3382 = var9;
                            }
                        }
                        if (var9.field1814 == 8 && class172.field3054 >= var12 && class38.field656 >= var13 && class172.field3054 < var14 && class38.field656 < var15) {
                            class277.field4870 = var9;
                        }
                        if (var9.field1803 > var9.field1793) {
                            class92.method617(var9.field1793, class38.field656, var9, var11, var9.field1933 + var10, true, var9.field1803, class172.field3054);
                        }
                    }
                    if (var9.field1814 == 0) {
                        method1062(arg0, var9.field1873, var12, var13, var14, var15, var10 - var9.field1871, var11 - var9.field1832);
                        if (var9.field1837 != null) {
                            method1062(var9.field1837, var9.field1873, var12, var13, var14, var15, var10 - var9.field1871, var11 - var9.field1832);
                        }
                        class2 var74 = (class2) class57.field959.method1550(true, (long) var9.field1873);
                        if (var74 != null) {
                            class37.method291(var11, var15, var12, var74.field12, true, var10, var14, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1063(byte arg0) {
        class40.method311(108);
        class22.field259 = new class56();
        field2771++;
        class58.field975 = new class209();
        if (class169.field3010 != 0) {
            class214.field3718 = new byte[50][];
        }
        class43.method328(1182, class24.field368);
        if (class161.field2856 == 0) {
            class129.field2260 = this.getCodeBase().getHost();
            class289.field5056 = 443;
            class256.field4424 = 43594;
        } else if (class161.field2856 == 1) {
            class129.field2260 = this.getCodeBase().getHost();
            class256.field4424 = class222.field3859 + 40000;
            class289.field5056 = class222.field3859 + 50000;
        } else if (class161.field2856 == 2) {
            class289.field5056 = class222.field3859 + 50000;
            class129.field2260 = "127.0.0.1";
            class256.field4424 = class222.field3859 + 40000;
        }
        class202.field3523 = class256.field4424;
        class7.field63 = class202.field3523;
        class165.field2898 = class256.field4424;
        if (class34.field613 == 1) {
            class13.field117 = class135.field2363;
            class65.field1104 = true;
            class211.field3657 = class224.field3896;
            class133.field2333 = class124.field2179;
            class226.field3918 = class38.field660;
        } else {
            class13.field117 = class186.field3301;
            class226.field3918 = class46.field781;
            class211.field3657 = class142.field2504;
            class133.field2333 = class178.field3103;
        }
        if (class87.field1494 == 3 && class161.field2856 != 2) {
            class33.field585 = class222.field3859;
        }
        class28.field528 = class289.field5056;
        class196.field3420 = class129.field2260;
        class264.field4676 = class173.field3058 = class57.field948 = class153.field2703 = new short[256];
        class208.method1388(-117);
        class174.method1169(class166.field2951, 4188);
        class172.method1159(class166.field2951, 7);
        class144.field2538 = class243.method1575((byte) -124);
        if (class144.field2538 != null) {
            class144.field2538.method615(-109, class166.field2951);
        }
        class277.field4866 = class87.field1494;
        try {
            if (class24.field368.field1495 != null) {
                class264.field4681 = new class93(class24.field368.field1495, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class69.field1150[var2] = new class93(class24.field368.field1505[var2], 6000, 0);
                }
                class172.field3050 = new class93(class24.field368.field1507, 6000, 0);
                class220.field3836 = new class141(255, class264.field4681, class172.field3050, 500000);
                class128.field2237 = new class93(class24.field368.field1499, 24, 0);
                class24.field368.field1505 = null;
                class24.field368.field1499 = null;
                class24.field368.field1495 = null;
                class24.field368.field1507 = null;
            }
        } catch (IOException var3) {
            class264.field4681 = null;
            class220.field3836 = null;
            class172.field3050 = null;
            class128.field2237 = null;
        }
        class86.field1484 = class73.field1222;
        if (class161.field2856 != 0) {
            class170.field3022 = true;
        }
        if (arg0 != -61) {
            field2780 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)I")
    public static final int method1064(int arg0, int arg1) {
        int var2 = -99 / ((arg0 + 41) / 33);
        int var3 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        int var4 = (var3 & 0x33333333) + ((var3 & 0xCCCCCCCF) >>> 2);
        int var5 = (var4 >>> 4) + var4 & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        field2787++;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1065(int arg0) {
        field2776++;
        for (class124.field2176 = 0; class174.method1171((byte) -112) && class124.field2176 < 128; class124.field2176++) {
            class180.field3131[class124.field2176] = class47.field792;
            class30.field552[class124.field2176] = class110.field1971;
        }
        class224.field3889++;
        if (arg0 >= -107) {
            method1062((class107[]) null, 95, 73, -61, -74, 126, 20, -22);
        }
        if (class9.field75 != -1) {
            class37.method291(0, class24.field373, 0, class9.field75, true, 0, class199.field3458, 0);
        }
        class28.field514++;
        class69.method470(false);
        while (true) {
            class260 var2;
            class107 var3;
            class107 var4;
            do {
                var2 = (class260) class44.field772.method528(1);
                if (var2 == null) {
                    while (true) {
                        class260 var5;
                        class107 var6;
                        class107 var7;
                        do {
                            var5 = (class260) class101.field1730.method528(1);
                            if (var5 == null) {
                                while (true) {
                                    class260 var8;
                                    class107 var9;
                                    class107 var10;
                                    do {
                                        var8 = (class260) class34.field612.method528(1);
                                        if (var8 == null) {
                                            if (class42.field717 != null) {
                                                class186.method1274(0);
                                            }
                                            if (class11.field96 != null && class11.field96.field4844 == 1) {
                                                if (class11.field96.field4843 != null) {
                                                    class177.method1185(class261.field4585, class193.field3401, (byte) 126);
                                                }
                                                class261.field4585 = false;
                                                class193.field3401 = null;
                                                class11.field96 = null;
                                            }
                                            if (class56.field926 % 1500 == 0) {
                                                class59.method398(54);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4553;
                                        if (var9.field1922 < 0) {
                                            break;
                                        }
                                        var10 = class22.method131(var9.field1801, 1538872048);
                                    } while (var10 == null || var10.field1837 == null || var9.field1922 >= var10.field1837.length || var10.field1837[var9.field1922] != var9);
                                    class56.method385(200000, var8);
                                }
                            }
                            var6 = var5.field4553;
                            if (var6.field1922 < 0) {
                                break;
                            }
                            var7 = class22.method131(var6.field1801, 1538872048);
                        } while (var7 == null || var7.field1837 == null || var6.field1922 >= var7.field1837.length || var7.field1837[var6.field1922] != var6);
                        class56.method385(200000, var5);
                    }
                }
                var3 = var2.field4553;
                if (var3.field1922 < 0) {
                    break;
                }
                var4 = class22.method131(var3.field1801, 1538872048);
            } while (var4 == null || var4.field1837 == null || var4.field1837.length <= var3.field1922 || var4.field1837[var3.field1922] != var3);
            class56.method385(200000, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class146.method994(2, "argument count");
            }
            class222.field3859 = Integer.parseInt(arg0[0]);
            class161.field2856 = 2;
            if (arg0[1].equals("live")) {
                class169.field3010 = 0;
            } else if (arg0[1].equals("rc")) {
                class169.field3010 = 1;
            } else if (arg0[1].equals("wip")) {
                class169.field3010 = 2;
            } else {
                class146.method994(2, "modewhat");
            }
            int var1 = -1;
            class123.field2161 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class199.method1338(class205.method1379(0, var2.length, var2, (byte) 119), -1);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class184.field3271 = var1;
            } else if (arg0[2].equals("english")) {
                class184.field3271 = 0;
            } else if (arg0[2].equals("german")) {
                class184.field3271 = 1;
            } else {
                class146.method994(2, "language");
            }
            class271.method1800(class184.field3271, -101);
            class37.field650 = false;
            class137.field2412 = false;
            if (arg0[3].equals("game0")) {
                class34.field613 = 0;
            } else if (arg0[3].equals("game1")) {
                class34.field613 = 1;
            } else {
                class146.method994(2, "game");
            }
            class29.field541 = 0;
            class281.field4928 = class20.field234;
            class64.field1083 = 0;
            class63.field1073 = false;
            client var3 = new client();
            class175.field3082 = var3;
            var3.method1946(28, 1024, 524, (byte) -118, class169.field3010 + 32, "runescape", 768);
            class75.field1281.setLocation(40, 40);
        } catch (Exception var6) {
            class196.method1315(false, var6, (String) null);
        }
        field2781++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltf;)I")
    public static final int method1066(class107 arg0) {
        class208 var1 = (class208) class139.field2454.method1550(true, ((long) arg0.field1873 << 32) + (long) arg0.field1922);
        return var1 == null ? arg0.field1842 : var1.field3605;
    }
}

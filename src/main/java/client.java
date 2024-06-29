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
public class client extends class99 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1658 = 0;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "S")
    public static short field1663 = 1;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[Lgn;")
    public static class77[] field1666 = new class77[29];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field1667 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    public static int[] field1675 = new int[128];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field1678;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
    public static int[] field1657;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Log;)Lvj;", line = 6)
    public static final class279 method766(class157 arg0) {
        class279 var1 = (class279) class60.field839.method451(((long) arg0.field2486 << 32) + (long) arg0.field2482, (byte) 100);
        return var1 == null ? arg0.field2466 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I", line = 14)
    public static int method767(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 21)
    public final void method673(byte arg0) {
        class280.method2031(97);
        class245.field3865 = new class302();
        field1671++;
        class286.field4589 = new class182();
        if (class34.field456 != 0) {
            class77.field1090 = new byte[50][];
        }
        class210.method1521(class14.field159, 127);
        if (class122.field1909 == 0) {
            class245.field3877 = this.getCodeBase().getHost();
            class178.field2965 = 43594;
            class210.field3451 = 443;
        } else if (class122.field1909 == 1) {
            class245.field3877 = this.getCodeBase().getHost();
            class178.field2965 = class102.field1497 + 40000;
            class210.field3451 = class102.field1497 + 50000;
        } else if (class122.field1909 == 2) {
            class210.field3451 = class102.field1497 + 50000;
            class245.field3877 = "127.0.0.1";
            class178.field2965 = class102.field1497 + 40000;
        }
        class190.field3109 = class323.field5012 = class91.field1257 = class302.field4748 = new short[256];
        if (class15.field169 == 1) {
            class11.field143 = class304.field4765;
            class176.field2940 = class106.field1573;
            class119.field1802 = class34.field455;
            class32.field439 = class331.field5162;
            class87.field1203 = 0;
            class87.field1201 = 16777215;
            class13.field151 = true;
        } else {
            class119.field1802 = class131.field2073;
            class176.field2940 = class196.field3201;
            class11.field143 = class180.field2981;
            class32.field439 = class100.field1455;
        }
        class147.field2281 = class178.field2965;
        class34.field451 = class245.field3877;
        class165.field2755 = class210.field3451;
        if (class124.field1933 == 3 && class122.field1909 != 2) {
            class21.field306 = class102.field1497;
        }
        class288.field4613 = class147.field2281;
        class109.field1625 = class178.field2965;
        class32.method175(27);
        class50.method326(9063, class94.field1290);
        int var2 = -87 / ((arg0 + 81) / 42);
        class246.method1759(class94.field1290, (byte) 113);
        class158.field2614 = class101.method697(-23994);
        if (class158.field2614 != null) {
            class158.field2614.method1703(1000, class94.field1290);
        }
        class50.field724 = class124.field1933;
        try {
            if (class14.field159.field1943 != null) {
                class61.field859 = new class77(class14.field159.field1943, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    field1666[var3] = new class77(class14.field159.field1939[var3], 6000, 0);
                }
                class179.field2978 = new class77(class14.field159.field1946, 6000, 0);
                class318.field4947 = new class127(255, class61.field859, class179.field2978, 500000);
                class316.field4901 = new class77(class14.field159.field1938, 24, 0);
                class14.field159.field1946 = null;
                class14.field159.field1938 = null;
                class14.field159.field1943 = null;
                class14.field159.field1939 = null;
            }
        } catch (IOException var5) {
            class61.field859 = null;
            class318.field4947 = null;
            class316.field4901 = null;
            class179.field2978 = null;
        }
        if (class122.field1909 != 0) {
            class247.field3899 = true;
        }
        class108.field1595 = class217.field3519;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 136)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class253.method1820("argument count", (byte) 102);
            }
            class102.field1497 = Integer.parseInt(arg0[0]);
            class122.field1909 = 2;
            if (arg0[1].equals("live")) {
                class34.field456 = 0;
            } else if (arg0[1].equals("rc")) {
                class34.field456 = 1;
            } else if (arg0[1].equals("wip")) {
                class34.field456 = 2;
            } else {
                class253.method1820("modewhat", (byte) 94);
            }
            class64.field930 = false;
            class8.field121 = class335.method2340(arg0[2], 0);
            if (class8.field121 == -1) {
                if (arg0[2].equals("english")) {
                    class8.field121 = 0;
                } else if (arg0[2].equals("german")) {
                    class8.field121 = 1;
                } else {
                    class253.method1820("language", (byte) 100);
                }
            }
            class185.method1388(-3, class8.field121);
            class102.field1494 = false;
            class34.field459 = false;
            if (arg0[3].equals("game0")) {
                class15.field169 = 0;
            } else if (arg0[3].equals("game1")) {
                class15.field169 = 1;
            } else {
                class253.method1820("game", (byte) 101);
            }
            class44.field594 = 0;
            class27.field379 = false;
            class13.field154 = "";
            class77.field1069 = 0;
            client var1 = new client();
            class341.field5296 = var1;
            var1.method682(768, 540, false, 1024, class34.field456 + 32, (byte) 28, 29, "runescape");
            class278.field4482.setLocation(40, 40);
        } catch (Exception var3) {
            class26.method152(var3, (String) null, -126);
        }
        field1662++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 203)
    public final void method681(int arg0) {
        field1677++;
        if (class5.field75 == 1000) {
            return;
        }
        long var2 = class130.method946(-91) / 1000000L - class126.field1968;
        class126.field1968 = class130.method946(-117) / 1000000L;
        boolean var4 = class178.method1336(-120);
        if (var4 && class137.field2164 && class198.field3225 != null) {
            class198.field3225.method2222(arg0 ^ 0xFFFFC0D0);
        }
        if ((class5.field75 == 30 || class5.field75 == 10) && (class129.field2013 || class343.field5341 != 0L && class343.field5341 < class283.method2038((byte) 123))) {
            class8.method43(class204.method1490((byte) 59), class129.field2013, 0, class45.field634, class70.field994);
        }
        if (class204.field3362 == null) {
            Container var5;
            if (class204.field3362 != null) {
                var5 = class204.field3362;
            } else if (class278.field4482 == null) {
                var5 = class14.field159.field1951;
            } else {
                var5 = class278.field4482;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class278.field4482 == var5) {
                Insets var8 = class278.field4482.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class55.field780 != var6 || class88.field1221 != var7) {
                if (class124.field1932.startsWith("mac")) {
                    class88.field1221 = var7;
                    class55.field780 = var6;
                } else {
                    class280.method2031(57);
                }
                class343.field5341 = class283.method2038((byte) 125) + 500L;
            }
        }
        if (class204.field3362 != null && !class101.field1469 && (class5.field75 == 30 || class5.field75 == 10)) {
            class8.method43(class318.field4946, false, 0, -1, -1);
        }
        boolean var9 = false;
        if (class182.field3010) {
            class182.field3010 = false;
            var9 = true;
        }
        if (var9) {
            class31.method174(false);
        }
        if (class232.field3690) {
            for (int var10 = 0; var10 < 100; var10++) {
                class174.field2884[var10] = true;
            }
        }
        if (class5.field75 == 0) {
            class97.method663(var9, class213.field3483, class339.field5278, (Color) null, arg0 ^ 0x2F43);
        } else if (class5.field75 == 5) {
            class57.method366(false, (byte) 122, class282.field4538);
        } else if (class5.field75 == 10) {
            class167.method1222(98);
        } else if (class5.field75 == 25 || class5.field75 == 28) {
            if (class38.field484 == 1) {
                if (class173.field2870 < class295.field4681) {
                    class173.field2870 = class295.field4681;
                }
                int var12 = (class173.field2870 - class295.field4681) * 50 / class173.field2870;
                class138.method1025(arg0 + 43044, false, class108.field1605 + "<br>(" + var12 + "%)");
            } else if (class38.field484 == 2) {
                if (class89.field1230 > class57.field812) {
                    class57.field812 = class89.field1230;
                }
                int var11 = (class57.field812 - class89.field1230) * 50 / class57.field812 + 50;
                class138.method1025(26835, false, class108.field1605 + "<br>(" + var11 + "%)");
            } else {
                class138.method1025(26835, false, class108.field1605);
            }
        } else if (class5.field75 == 30) {
            class211.method1525((byte) 68, var2);
        } else if (class5.field75 == 40) {
            class138.method1025(26835, false, class284.field4541 + "<br>" + class158.field2619);
        }
        if (class232.field3690 && class5.field75 != 0) {
            class232.method1675();
            for (int var19 = 0; var19 < class20.field291; var19++) {
                class127.field1991[var19] = false;
            }
        } else if ((class5.field75 == 30 || class5.field75 == 10) && class130.field2055 == 0 && !var9) {
            try {
                Graphics var16 = class94.field1290.getGraphics();
                for (int var17 = 0; var17 < class20.field291; var17++) {
                    if (class127.field1991[var17]) {
                        class8.field120.method556(class81.field1146[var17], class197.field3215[var17], false, class213.field3481[var17], var16, class323.field5013[var17]);
                        class127.field1991[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class94.field1290.repaint();
            }
        } else if (class5.field75 != 0) {
            try {
                Graphics var13 = class94.field1290.getGraphics();
                class8.field120.method557(0, 0, var13, -27039);
                for (int var14 = 0; var14 < class20.field291; var14++) {
                    class127.field1991[var14] = false;
                }
            } catch (Exception var21) {
                class94.field1290.repaint();
            }
        }
        if (class81.field1126) {
            class274.method1985(50);
        }
        if (arg0 != -16209) {
            field1675 = (int[]) null;
        }
        if (class159.field2627 && class5.field75 == 10 && class147.field2287 != -1) {
            class159.field2627 = false;
            class61.method412(class14.field159, arg0 ^ 0xFFFFC0AC);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 431)
    private final void method768(byte arg0) {
        boolean var2 = class286.field4589.method1367((byte) -128);
        if (!var2) {
            this.method773(false);
        }
        if (arg0 <= 96) {
            field1666 = (class77[]) null;
        }
        field1669++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 449)
    public final void method683(int arg0) {
        field1660++;
        if (class5.field75 == 1000) {
            return;
        }
        class240.field3818++;
        if (class240.field3818 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class117.field1779 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class200.field3244.setSeed((long) class117.field1779);
        }
        this.method768((byte) 124);
        if (class165.field2752 != null) {
            class165.field2752.method617((byte) 94);
        }
        class316.method2223((byte) -31);
        class76.method516((byte) -51);
        class14.method82((byte) 66);
        class303.method2161(-27);
        if (class232.field3690) {
            class230.method1632();
        }
        if (class158.field2614 != null) {
            int var3 = class158.field2614.method1700(-111);
            class34.field452 = var3;
        }
        if (class5.field75 == arg0) {
            this.method771(40);
            class53.method342(25376);
        } else if (class5.field75 == 5) {
            this.method771(93);
            class53.method342(25376);
        } else if (class5.field75 == 25 || class5.field75 == 28) {
            class119.method840(0);
        }
        if (class5.field75 == 10) {
            this.method774(-112);
            class324.method2268(0);
            class74.method494(arg0 ^ 0xFFFFFFC5);
            class285.method2052((byte) -102);
        } else if (class5.field75 == 30) {
            class48.method308(0);
        } else if (class5.field75 == 40) {
            class285.method2052((byte) -102);
            if (class39.field514 != -3) {
                if (class39.field514 == 15) {
                    class197.method1447(0);
                } else if (class39.field514 != 2) {
                    class42.method214(-105);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Log;)Log;", line = 540)
    public static final class157 method769(class157 arg0) {
        int var1 = method766(arg0).method2016(21782);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class142.method1053(arg0.field2463, 65535);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Lvk;", line = 561)
    public static final class90 method770(int arg0, int arg1, int arg2, int arg3) {
        field1668++;
        class90 var4 = new class90();
        var4.field1247 = arg2;
        var4.field1249 = arg3;
        class243.field3842.method461(81, (long) arg0, var4);
        class84.method574(arg3, 128);
        class157 var5 = class142.method1053(arg0, 65535);
        if (arg1 != 26) {
            main((String[]) null);
        }
        if (var5 != null) {
            class320.method2252(var5, 0);
        }
        if (class52.field740 != null) {
            class320.method2252(class52.field740, arg1 - 26);
            class52.field740 = null;
        }
        int var6 = class185.field3070;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class100.method690((byte) 101, class113.field1727[var7])) {
                class219.method1557(-1, var7);
            }
        }
        if (class185.field3070 == 1) {
            class196.field3204 = false;
            class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
        } else {
            class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
            int var8 = class282.field4538.method1804(class116.field1762);
            for (int var9 = 0; var9 < class185.field3070; var9++) {
                int var10 = class282.field4538.method1804(class129.method935(var9, 2017));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class295.field4671 = (class52.field737 ? 26 : 22) + class185.field3070 * 15;
            class227.field3617 = var8 + 8;
        }
        if (var5 != null) {
            class109.method758(false, var5, 26);
        }
        class100.method693((byte) 94, arg3);
        if (class147.field2287 != -1) {
            class60.method410(-11484, 1, class147.field2287);
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 639)
    public final void method678(boolean arg0) {
        method778((byte) -7);
        class150.method1095(119);
        field1673++;
        class291.method2083((byte) -126);
        class201.method1469((byte) -120);
        class4.method26(false);
        class138.method1026(-5086);
        class24.method133(15902);
        class178.method1338((byte) 117);
        class99.method675(false);
        class232.method1656();
        class36.method197(-18269);
        class336.method2349(-4);
        class187.method1393((byte) -65);
        class193.method1425(-1);
        class44.method261(-361014556);
        class15.method92(true);
        class182.method1360(1);
        class302.method2157((byte) -26);
        class91.method610((byte) 13);
        class275.method1997((byte) 12);
        class172.method1283(0);
        class77.method531(0);
        class127.method920(255);
        class102.method705(3550);
        class234.method1694((byte) -88);
        class342.method2378(-13393);
        class108.method743(-56);
        class157.method1129(0);
        class167.method1221((byte) -40);
        class334.method2336(-24624);
        class169.method1241(-87);
        class58.method378(84);
        class235.method1704(true);
        class315.method2216((byte) -127);
        class49.method319(92);
        class121.method879(-1);
        class316.method2228(121);
        class145.method1073((byte) -123);
        class106.method726(0);
        class202.method1473((byte) 72);
        class263.method1880(2);
        class204.method1488((byte) 58);
        class97.method652(!arg0);
        class327.method2291((byte) 54);
        class256.method1836(-83);
        class90.method606(3);
        class279.method2021(85);
        class165.method1213(0);
        class191.method1414(99);
        class142.method1052(113);
        class297.method2118(-102);
        class126.method917(-125);
        class240.method1722((byte) 111);
        class94.method626((byte) -123);
        class325.method2278(0);
        class63.method427(57);
        class286.method2057(0);
        class160.method1141(11729);
        class221.method1579((byte) 17);
        class343.method2381(-91);
        class33.method181(-116);
        class269.method1919();
        class276.method2003(-1);
        class116.method799(true);
        class298.method2123((byte) 14);
        class324.method2270(-16);
        class87.method597();
        class84.method573(104);
        class134.method979();
        class163.method1164();
        class330.method2316(0);
        class250.method1784();
        class23.method129(0);
        class331.method2321((byte) -45);
        class296.method2113(-85);
        class333.method2326((byte) -117);
        class230.method1631();
        class132.method970();
        class322.method2259(6188);
        class2.method9(0);
        class212.method1533((byte) 59);
        class260.method1858(true);
        class251.method1805();
        class51.method332(-10950);
        class309.method2184(124);
        class96.method637();
        class181.method1353((byte) 55);
        class198.method1458(29581);
        class52.method337(-118);
        class140.method1033();
        class118.method814();
        class48.method309((byte) -121);
        class277.method2007(-11);
        class89.method603(-112);
        class143.method1057(-127);
        class59.method388();
        class168.method1226(-2390);
        class8.method44(0);
        class109.method752(true);
        class278.method2011((byte) 126);
        class180.method1350(true);
        class229.method1620(true);
        class50.method321((byte) 76);
        class144.method1069(-97);
        class101.method698(true);
        class21.method115(-201);
        class17.method94((byte) -66);
        class323.method2263(-97);
        class27.method158(-126);
        class228.method1611(1);
        class266.method1893();
        class271.method1924((byte) -119);
        class184.method1386((byte) 120);
        class329.method2302(-30182);
        class289.method2079(true);
        class176.method1328((byte) -126);
        class71.method470();
        class79.method537(true);
        class273.method1970(!arg0);
        class130.method961((byte) 89);
        class65.method436((byte) -34);
        class18.method98(-115);
        class25.method142(0);
        class1.method6();
        class210.method1519(-6184);
        class170.method1251();
        class133.method976(0);
        class43.method220((byte) -115);
        class259.method1854((byte) 54);
        class55.method355((byte) 116);
        class339.method2361(127);
        class173.method1305((byte) 16);
        class136.method1015();
        class149.method1091(-12451);
        class328.method2297();
        class166.method1218(-3);
        class258.method1850(-84);
        class123.method886(102);
        class39.method209(0);
        class7.method37(false);
        class206.method1494();
        class20.method107(-14537);
        class225.method1601((byte) 121);
        class38.method204((byte) -127);
        class113.method785(!arg0);
        class32.method176(18637);
        class31.method173((byte) -115);
        class104.method713();
        class122.method884(arg0);
        class301.method2146(true);
        class208.method1505((byte) -90);
        class6.method32();
        class241.method1735();
        class254.method1827();
        class245.method1754(97);
        class299.method2132();
        class75.method502();
        class249.method1773();
        class117.method801(1840);
        class226.method1605(1);
        class205.method1493((byte) -77);
        class253.method1823(22679);
        class344.method2386(16755200);
        class111.method764((byte) 37);
        class100.method694((byte) -119);
        class335.method2343(-10396);
        class203.method1481();
        class103.method712(-69);
        class146.method1078(32754);
        class207.method1503(127);
        class112.method784(-1);
        class81.method552(3);
        class287.method2061(-457);
        class129.method934(3194);
        class270.method1920((byte) 119);
        class175.method1315((byte) 127);
        class60.method409(false);
        class174.method1312(1);
        class119.method832(-119);
        class261.method1863((byte) -124);
        class281.method2033((byte) -66);
        class128.method928(16);
        class105.method714((byte) 77);
        class29.method169(true);
        class76.method520(118);
        class231.method1637(8225);
        class14.method79(!arg0);
        class292.method2093();
        class61.method413(100);
        class86.method584(-11017);
        class233.method1689(false);
        class195.method1440(1);
        class179.method1346(-1905858078);
        class42.method213(-5);
        class72.method486();
        class242.method1746();
        class131.method964(116);
        class80.method544((byte) 0);
        class190.method1410(46);
        class338.method2355(20930);
        class188.method1396();
        class337.method2350();
        class151.method1097(-22432);
        class158.method1137(2);
        class114.method789();
        class46.method294((byte) 40);
        class3.method16();
        class239.method1719();
        class288.method2069((byte) 98);
        class304.method2169(90);
        class285.method2049(-23132);
        class217.method1553(1);
        class156.method1121(true);
        class5.method27((byte) -126);
        class211.method1522((byte) 126);
        class311.method2194(4096);
        class139.method1029(1);
        class214.method1541(8);
        class34.method184(-92);
        class62.method419(-1);
        class265.method1889(88);
        class164.method1208((byte) -60);
        class152.method1102(-95);
        class303.method2160(50);
        class223.method1585((byte) 4);
        class189.method1400(-47);
        class73.method489(124);
        class197.method1446(true);
        class236.method1708(13);
        class11.method59(1);
        class209.method1514((byte) -34);
        class213.method1535(1);
        class83.method563(arg0);
        class120.method841(-105);
        class246.method1755(-105);
        class307.method2178(125);
        class341.method2367(-124);
        class13.method76(true);
        class282.method2037((byte) 55);
        class98.method665((byte) 113);
        class141.method1044(19076);
        class224.method1589(255);
        class295.method2112(-1800);
        class66.method441((byte) -119);
        class64.method432((byte) -39);
        class318.method2238((byte) 79);
        class199.method1461(-50);
        class274.method1986((byte) -40);
        class310.method2189(-27115);
        class284.method2043(2048);
        class74.method491(0);
        class53.method340(-1188982228);
        class26.method150(-76);
        class227.method1609(0);
        class93.method624(24750);
        class57.method365(19569);
        class243.method1749(0);
        class319.method2242(false);
        class110.method762((byte) -80);
        class70.method465((byte) 123);
        class247.method1764(-101);
        class320.method2247((byte) 126);
        class135.method1009(-2);
        class185.method1387(20);
        class340.method2364(120);
        class54.method349((byte) -74);
        class280.method2032(-57);
        class10.method57(false);
        class252.method1819(166);
        class45.method293(-1);
        class192.method1422(0);
        class137.method1019(-20500);
        class196.method1443((byte) 93);
        class147.method1084(false);
        class159.method1139(-126);
        class200.method1465((byte) -88);
        class194.method1431(arg0);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 927)
    private final void method771(int arg0) {
        if (!class159.field2627) {
            label247: while (true) {
                do {
                    if (!class212.method1531((byte) -81)) {
                        break label247;
                    }
                } while (class54.field767 != 's' && class54.field767 != 'S');
                class159.field2627 = true;
            }
        }
        field1676++;
        if (class316.field4903 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class283.method2038((byte) 123);
            if (class94.field1292 == 0L) {
                class94.field1292 = var4;
            }
            if (var3 > 16384 && (var4 - class94.field1292) < 5000L) {
                if ((var4 - class173.field2873) > 1000L) {
                    System.gc();
                    class173.field2873 = var4;
                }
                class339.field5278 = class164.field2735;
                class213.field3483 = 5;
            } else {
                class316.field4903 = 10;
                class213.field3483 = 5;
                class339.field5278 = class32.field427;
            }
        } else if (class316.field4903 == 10) {
            class118.method821(4, 104, 104);
            for (int var29 = 0; var29 < 4; var29++) {
                class126.field1964[var29] = new class108(104, 104);
            }
            class213.field3483 = 10;
            class339.field5278 = class146.field2276;
            class316.field4903 = 30;
        } else if (class316.field4903 == 30) {
            if (class165.field2752 == null) {
                class165.field2752 = new class91(class286.field4589, class245.field3865);
            }
            if (class165.field2752.method611(255)) {
                class309.field4806 = class198.method1459(true, 0, true, false, false);
                class304.field4777 = class198.method1459(true, 1, true, false, false);
                class217.field3513 = class198.method1459(true, 2, false, false, true);
                class79.field1106 = class198.method1459(true, 3, true, false, false);
                class128.field1997 = class198.method1459(true, 4, true, false, false);
                class234.field3748 = class198.method1459(true, 5, true, false, true);
                class243.field3846 = class198.method1459(false, 6, true, false, true);
                class126.field1967 = class198.method1459(true, 7, true, false, false);
                class130.field2034 = class198.method1459(true, 8, true, false, false);
                class278.field4476 = class198.method1459(true, 9, true, false, false);
                class2.field26 = class198.method1459(true, 10, true, false, false);
                class288.field4615 = class198.method1459(true, 11, true, false, false);
                class226.field3610 = class198.method1459(true, 12, true, false, false);
                class76.field1061 = class198.method1459(true, 13, true, false, false);
                class279.field4502 = class198.method1459(false, 14, true, false, false);
                class270.field4354 = class198.method1459(true, 15, true, false, false);
                class172.field2864 = class198.method1459(true, 16, true, false, false);
                class205.field3369 = class198.method1459(true, 17, true, false, false);
                class341.field5310 = class198.method1459(true, 18, true, false, false);
                class228.field3629 = class198.method1459(true, 19, true, false, false);
                class138.field2179 = class198.method1459(true, 20, true, false, false);
                class45.field632 = class198.method1459(true, 21, true, false, false);
                class200.field3255 = class198.method1459(true, 22, true, false, false);
                class176.field2939 = class198.method1459(true, 23, true, false, true);
                class164.field2731 = class198.method1459(true, 24, true, false, false);
                class204.field3361 = class198.method1459(true, 25, true, false, false);
                class15.field171 = class198.method1459(true, 26, true, false, true);
                class202.field3277 = class198.method1459(true, 27, true, false, false);
                class142.field2223 = class198.method1459(true, 28, true, false, true);
                class339.field5278 = class259.field4149;
                class316.field4903 = 40;
                class213.field3483 = 15;
            } else {
                class213.field3483 = 12;
                class339.field5278 = class298.field4707;
            }
        } else if (class316.field4903 == 40) {
            int var6 = 0;
            for (int var7 = 0; var7 < 29; var7++) {
                var6 += class333.field5192[var7].method1992(-122) * class18.field244[var7] / 100;
            }
            if (var6 == 100) {
                class213.field3483 = 20;
                class339.field5278 = class298.field4702;
                class300.method2138(class130.field2034, (byte) -89);
                class23.method130(class130.field2034, (byte) 75);
                class234.method1696(0, class130.field2034);
                class316.field4903 = 41;
            } else {
                class213.field3483 = 20;
                if (var6 != 0) {
                    class339.field5278 = class196.field3194 + var6 + "%";
                }
            }
        } else if (class316.field4903 == 41) {
            if (class142.field2223.method1295(0)) {
                this.method772(class142.field2223.method1292(false, 1), (byte) -82);
                class339.field5278 = class282.field4532;
                class316.field4903 = 45;
                class213.field3483 = 25;
            } else {
                class339.field5278 = class280.field4522 + class142.field2223.method1270(-23483) + "%";
                class213.field3483 = 25;
            }
        } else if (class316.field4903 == 45) {
            class61.method415(2, 22050, class152.field2352, true);
            class111.field1646 = new class121();
            class111.field1646.method875(14789, 128, 9);
            class198.field3225 = class108.method735(class94.field1290, 22050, class14.field159, 100, 0);
            class198.field3225.method2217(class111.field1646, false);
            class42.method212(class128.field1997, class270.field4354, class111.field1646, class279.field4502, true);
            class49.field693 = class108.method735(class94.field1290, 2048, class14.field159, 29, 1);
            class191.field3127 = new class22();
            class49.field693.method2217(class191.field3127, false);
            class333.field5184 = new class145(22050, class338.field5275);
            class236.field3773 = class243.field3846.method1298((byte) -63, "scape main");
            class316.field4903 = 50;
            class213.field3483 = 30;
            class339.field5278 = class55.field781;
        } else if (class316.field4903 == 50) {
            int var27 = class261.method1860(class76.field1061, 70, class130.field2034);
            int var28 = class128.method930((byte) 2);
            if (var27 >= var28) {
                class213.field3483 = 35;
                class339.field5278 = class341.field5312;
                class316.field4903 = 60;
            } else {
                class213.field3483 = 35;
                class339.field5278 = class94.field1288 + var27 * 100 / var28 + "%";
            }
        } else if (class316.field4903 == 60) {
            int var25 = class212.method1529(255, class130.field2034);
            int var26 = class289.method2076(2);
            if (var26 > var25) {
                class339.field5278 = class2.field32 + var25 * 100 / var26 + "%";
                class213.field3483 = 40;
            } else {
                class213.field3483 = 40;
                class316.field4903 = 65;
                class339.field5278 = class221.field3550;
            }
        } else if (class316.field4903 == 65) {
            class74.method493(class76.field1061, 0, class130.field2034);
            class213.field3483 = 45;
            class339.field5278 = class287.field4594;
            class278.method2012(5, 65);
            class316.field4903 = 70;
        } else if (class316.field4903 == 70) {
            byte var13 = 0;
            class217.field3513.method1295(0);
            int var14 = var13 + class217.field3513.method1270(-23483);
            class172.field2864.method1295(0);
            int var15 = var14 + class172.field2864.method1270(-23483);
            class205.field3369.method1295(0);
            int var16 = var15 + class205.field3369.method1270(-23483);
            class341.field5310.method1295(0);
            int var17 = var16 + class341.field5310.method1270(-23483);
            class228.field3629.method1295(0);
            int var18 = var17 + class228.field3629.method1270(-23483);
            class138.field2179.method1295(0);
            int var19 = var18 + class138.field2179.method1270(-23483);
            class45.field632.method1295(0);
            int var20 = var19 + class45.field632.method1270(-23483);
            class200.field3255.method1295(0);
            int var21 = var20 + class200.field3255.method1270(-23483);
            class164.field2731.method1295(0);
            int var22 = var21 + class164.field2731.method1270(-23483);
            class204.field3361.method1295(0);
            int var23 = var22 + class204.field3361.method1270(-23483);
            class202.field3277.method1295(0);
            int var24 = var23 + class202.field3277.method1270(-23483);
            if (var24 >= 1100) {
                class211.method1523(class217.field3513, 82);
                class297.method2119(2059, class217.field3513);
                class181.method1357(class217.field3513, 25353);
                class344.method2383(class126.field1967, true, class217.field3513);
                class100.method691(class126.field1967, true, -76, class172.field2864);
                class145.method1072(class126.field1967, 41, class341.field5310);
                class100.method692(class126.field1967, (byte) -31, class121.field1846, class228.field3629, true);
                class164.method1205(class217.field3513, (byte) 27);
                class39.method208(class138.field2179, (byte) -38, class309.field4806, class304.field4777);
                class81.method553(class217.field3513, true);
                class149.method1089(class45.field632, class126.field1967, 0);
                class102.method700(1, class200.field3255);
                class298.method2125(-1, class217.field3513);
                class235.method1705(class130.field2034, class126.field1967, 24601, class79.field1106, class76.field1061);
                class93.method622(class217.field3513, 91);
                class191.method1415(0, class205.field3369);
                class295.method2110(class164.field2731, (byte) 101, new class329(), class204.field3361);
                class273.method1976(class204.field3361, (byte) -85, class164.field2731);
                class51.method333((byte) -64, class217.field3513);
                class259.method1852(class217.field3513, (byte) 92);
                class98.method669(false, class217.field3513);
                class180.method1351(class130.field2034, -14628, class217.field3513);
                class300.method2142(class130.field2034, 26843, class217.field3513);
                class339.field5278 = class108.field1598;
                class213.field3483 = 50;
                class79.method542(0);
                class316.field4903 = 80;
            } else {
                class339.field5278 = class287.field4592 + var24 / 11 + "%";
                class213.field3483 = 50;
            }
        } else if (class316.field4903 == 80) {
            int var11 = class93.method625((byte) -125, class130.field2034);
            int var12 = class296.method2115(false);
            if (var12 > var11) {
                class213.field3483 = 60;
                class339.field5278 = class185.field3066 + var11 * 100 / var12 + "%";
            } else {
                class141.method1043(class130.field2034, -27431);
                class339.field5278 = class127.field1992;
                class316.field4903 = 90;
                class213.field3483 = 60;
            }
        } else {
            if (arg0 <= 16) {
                field1658 = 46;
            }
            if (class316.field4903 == 90) {
                if (class15.field171.method1295(0)) {
                    class130 var10 = new class130(class278.field4476, class15.field171, class130.field2034, 20, !class245.field3863);
                    class170.method1261(var10);
                    if (class149.field2311 == 1) {
                        class170.method1243(0.9F);
                    }
                    if (class149.field2311 == 2) {
                        class170.method1243(0.8F);
                    }
                    if (class149.field2311 == 3) {
                        class170.method1243(0.7F);
                    }
                    if (class149.field2311 == 4) {
                        class170.method1243(0.6F);
                    }
                    class213.field3483 = 70;
                    class316.field4903 = 100;
                    class339.field5278 = class334.field5208;
                } else {
                    class339.field5278 = class106.field1575 + class15.field171.method1270(-23483) + "%";
                    class213.field3483 = 70;
                }
            } else if (class316.field4903 == 100) {
                if (class89.method605(class130.field2034, 1)) {
                    class316.field4903 = 110;
                }
            } else if (class316.field4903 == 110) {
                class181.field3002 = new class187();
                class14.field159.method898(class181.field3002, (byte) -98, 10);
                class316.field4903 = 120;
                class339.field5278 = class109.field1612;
                class213.field3483 = 75;
            } else if (class316.field4903 == 120) {
                if (class2.field26.method1293("", "huffman", (byte) 15)) {
                    class133 var8 = new class133(class2.field26.method1294("", "huffman", true));
                    class298.method2124(var8, 2);
                    class213.field3483 = 80;
                    class316.field4903 = 130;
                    class339.field5278 = class282.field4536;
                } else {
                    class213.field3483 = 80;
                    class339.field5278 = class73.field1028 + "0%";
                }
            } else if (class316.field4903 == 130) {
                if (!class79.field1106.method1295(0)) {
                    class339.field5278 = class133.field2084 + class79.field1106.method1270(-23483) * 3 / 4 + "%";
                    class213.field3483 = 85;
                } else if (!class226.field3610.method1295(0)) {
                    class339.field5278 = class133.field2084 + (class226.field3610.method1270(-23483) / 10 + 75) + "%";
                    class213.field3483 = 85;
                } else if (!class76.field1061.method1295(0)) {
                    class339.field5278 = class133.field2084 + (class76.field1061.method1270(-23483) / 20 + 85) + "%";
                    class213.field3483 = 85;
                } else if (class176.field2939.method1285("details", false)) {
                    class263.method1874(class176.field2939, class49.field688, -128);
                    class266.method1894(class126.field1967);
                    class316.field4903 = 135;
                    class213.field3483 = 95;
                    class339.field5278 = class179.field2968;
                } else {
                    class339.field5278 = class133.field2084 + (class176.field2939.method1289(0, "details") / 10 + 90) + "%";
                    class213.field3483 = 85;
                }
            } else if (class316.field4903 == 135) {
                int var9 = class303.method2159(420);
                if (var9 == -1) {
                    class213.field3483 = 95;
                    class339.field5278 = class167.field2769;
                } else if (var9 == 7 || var9 == 9) {
                    this.method685(-64, "worldlistfull");
                    class278.method2012(1000, 76);
                } else if (class103.field1507) {
                    class316.field4903 = 140;
                    class213.field3483 = 96;
                    class339.field5278 = class160.field2643;
                } else {
                    this.method685(-49, "worldlistio_" + var9);
                    class278.method2012(1000, -118);
                }
            } else if (class316.field4903 == 140) {
                class138.field2177 = class79.field1106.method1298((byte) 88, "loginscreen");
                class234.field3748.method1271(true, (byte) -49, false);
                class243.field3846.method1271(true, (byte) -40, true);
                class130.field2034.method1271(true, (byte) -48, true);
                class76.field1061.method1271(true, (byte) -62, true);
                class2.field26.method1271(true, (byte) -113, true);
                class79.field1106.method1271(true, (byte) -40, true);
                class213.field3483 = 97;
                class81.field1126 = true;
                class339.field5278 = class289.field4640;
                class316.field4903 = 150;
            } else if (class316.field4903 == 150) {
                class136.method1013();
                if (class159.field2627) {
                    class34.field460 = 0;
                    class318.field4946 = 0;
                    class185.field3065 = 0;
                    class105.field1537 = 0;
                }
                class159.field2627 = true;
                class61.method412(class14.field159, 3);
                class8.method43(class318.field4946, false, 0, -1, -1);
                class213.field3483 = 100;
                class316.field4903 = 160;
                class339.field5278 = class103.field1509;
            } else if (class316.field4903 == 160) {
                class301.method2145((byte) 68, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 1457)
    private final void method772(byte[] arg0, byte arg1) {
        if (arg1 > -52) {
            field1663 = 111;
        }
        field1672++;
        class44 var3 = new class44(arg0);
        while (true) {
            int var4 = var3.method286((byte) -97);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class127.field1981 = new int[6];
                var5[0] = var3.method271(21081);
                var5[1] = var3.method271(21081);
                var5[2] = var3.method271(21081);
                var5[3] = var3.method271(21081);
                var5[4] = var3.method271(21081);
                var5[5] = var3.method271(21081);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1502)
    private final void method773(boolean arg0) {
        field1661++;
        if (class205.field3374 < class286.field4589.field3034) {
            class247.field3901 = (class286.field4589.field3034 - 1) * 50 * 5;
            if (class247.field3901 > 3000) {
                class247.field3901 = 3000;
            }
            if (class288.field4613 == class109.field1625) {
                class288.field4613 = class165.field2755;
            } else {
                class288.field4613 = class109.field1625;
            }
            if (class286.field4589.field3034 >= 2 && class286.field4589.field3036 == 6) {
                this.method685(-128, "js5connect_outofdate");
                class5.field75 = 1000;
                return;
            }
            if (class286.field4589.field3034 >= 4 && class286.field4589.field3036 == -1) {
                this.method685(-128, "js5crc");
                class5.field75 = 1000;
                return;
            }
            if (class286.field4589.field3034 >= 4 && (class5.field75 == 0 || class5.field75 == 5)) {
                if (class286.field4589.field3036 == 7 || class286.field4589.field3036 == 9) {
                    this.method685(-79, "js5connect_full");
                } else if (class286.field4589.field3036 > 0) {
                    this.method685(-46, "js5connect");
                } else {
                    this.method685(-81, "js5io");
                }
                class5.field75 = 1000;
                return;
            }
        }
        class205.field3374 = class286.field4589.field3034;
        if (class247.field3901 > 0) {
            class247.field3901--;
            return;
        }
        try {
            if (class340.field5295 == 0) {
                class214.field3499 = class14.field159.method904(class34.field451, 70, class288.field4613);
                class340.field5295++;
            }
            if (class340.field5295 == 1) {
                if (class214.field3499.field2661 == 2) {
                    this.method775(0, 1000);
                    return;
                }
                if (class214.field3499.field2661 == 1) {
                    class340.field5295++;
                }
            }
            if (class340.field5295 == 2) {
                class160.field2648 = new class15((Socket) class214.field3499.field2664, class14.field159);
                class44 var2 = new class44(5);
                var2.method257(-2, 15);
                var2.method283((byte) -51, 540);
                class160.field2648.method85((byte) -121, 5, var2.field573, 0);
                class340.field5295++;
                class317.field4928 = class283.method2038((byte) 124);
            }
            if (class340.field5295 == 3) {
                if (class5.field75 == 0 || class5.field75 == 5 || class160.field2648.method87(5000) > 0) {
                    int var3 = class160.field2648.method86((byte) 118);
                    if (var3 != 0) {
                        this.method775(0, var3);
                        return;
                    }
                    class340.field5295++;
                } else if (class283.method2038((byte) 122) - class317.field4928 > 30000L) {
                    this.method775(0, 1001);
                    return;
                }
            }
            if (class340.field5295 == 4) {
                boolean var4 = class5.field75 == 5 || class5.field75 == 10 || class5.field75 == 28;
                class286.field4589.method1368(class160.field2648, false, !var4);
                class160.field2648 = null;
                class214.field3499 = null;
                class340.field5295 = 0;
            }
        } catch (IOException var6) {
            this.method775(0, 1002);
        }
        if (arg0) {
            field1675 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1650)
    private final void method774(int arg0) {
        field1659++;
        for (class43.field545 = 0; class212.method1531((byte) -81) && class43.field545 < 128; class43.field545++) {
            class26.field360[class43.field545] = class176.field2933;
            class246.field3887[class43.field545] = class54.field767;
        }
        class36.field477++;
        if (class147.field2287 != -1) {
            class97.method651(class133.field2095, 0, 0, 0, 0, (byte) -7, class20.field276, class147.field2287);
        }
        class186.field3074++;
        if (class232.field3690) {
            int var2 = 2359807;
            label191: for (int var3 = 0; var3 < 32768; var3++) {
                class234 var4 = class99.field1445[var3];
                if (var4 != null) {
                    byte var5 = var4.field3752.field4095;
                    if ((var5 & 0x2) > 0 && var4.field4251 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4246[0] = 1;
                            var4.field4248[0] = (var4.field4255 >> 7) + var6;
                            var4.field4184[0] = (var4.field4264 >> 7) + var7;
                            class126.field1964[class49.field698].method744(false, var4.method1881(-20395), false, 0, var4.method1881(-20395), var4.field4255 >> 7, -70, var4.field4264 >> 7);
                            if (var4.field4248[0] >= 0 && var4.field4248[0] <= 104 - var4.method1881(-20395) && var4.field4184[0] >= 0 && var4.field4184[0] <= (104 - var4.method1881(-20395)) && class126.field1964[class49.field698].method746(var4.field4248[0], var4.field4255 >> 7, var4.field4264 >> 7, 41, var4.field4184[0])) {
                                if (var4.method1881(-20395) > 1) {
                                    for (int var8 = var4.field4248[0]; var4.field4248[0] + var4.method1881(-20395) > var8; var8++) {
                                        for (int var9 = var4.field4184[0]; var9 < var4.field4184[0] + var4.method1881(-20395); var9++) {
                                            if ((class126.field1964[class49.field698].field1592[var8][var9] & var2) != 0) {
                                                continue label191;
                                            }
                                        }
                                    }
                                }
                                var4.field4251 = 1;
                            }
                        }
                    }
                    class323.method2264((byte) -6, var4);
                    class133.method975(-1, var4);
                    class318.method2241(-70, var4);
                    class126.field1964[class49.field698].method745(false, (byte) -60, var4.method1881(-20395), var4.field4264 >> 7, var4.method1881(-20395), var4.field4255 >> 7, false);
                }
            }
        }
        if (!class232.field3690) {
            class122.method881((byte) -117);
        } else if (class70.field996 == 0 && class149.field2318 == 0) {
            if (class31.field423 == 2) {
                class65.method438(-27);
            } else {
                class173.method1303(-16980);
            }
            if ((class120.field1825 >> 7) < 14 || (class120.field1825 >> 7) >= 90 || class260.field4150 >> 7 < 14 || (class260.field4150 >> 7) >= 90) {
                class172.method1296(-85);
            }
        }
        while (true) {
            class39 var10;
            class157 var18;
            class157 var19;
            do {
                var10 = (class39) class98.field1392.method1234((byte) 112);
                if (var10 == null) {
                    while (true) {
                        class39 var11;
                        class157 var16;
                        class157 var17;
                        do {
                            var11 = (class39) class271.field4375.method1234((byte) 18);
                            if (var11 == null) {
                                while (true) {
                                    class39 var12;
                                    class157 var14;
                                    class157 var15;
                                    do {
                                        var12 = (class39) class126.field1957.method1234((byte) 95);
                                        if (var12 == null) {
                                            if (class307.field4783 != null) {
                                                class105.method717((byte) -120);
                                            }
                                            if (class4.field72 != null && class4.field72.field2661 == 1) {
                                                if (class4.field72.field2664 != null) {
                                                    class110.method763(class315.field4873, -20206, class208.field3419);
                                                }
                                                class4.field72 = null;
                                                class315.field4873 = null;
                                                class208.field3419 = false;
                                            }
                                            if (class240.field3818 % 1500 == 0) {
                                                class320.method2253((byte) 92);
                                            }
                                            int var13 = -15 / ((arg0 + 46) / 56);
                                            return;
                                        }
                                        var14 = var12.field500;
                                        if (var14.field2482 < 0) {
                                            break;
                                        }
                                        var15 = class142.method1053(var14.field2463, 65535);
                                    } while (var15 == null || var15.field2472 == null || var15.field2472.length <= var14.field2482 || var15.field2472[var14.field2482] != var14);
                                    class144.method1065(var12, (byte) 67);
                                }
                            }
                            var16 = var11.field500;
                            if (var16.field2482 < 0) {
                                break;
                            }
                            var17 = class142.method1053(var16.field2463, 65535);
                        } while (var17 == null || var17.field2472 == null || var17.field2472.length <= var16.field2482 || var17.field2472[var16.field2482] != var16);
                        class144.method1065(var11, (byte) 67);
                    }
                }
                var18 = var10.field500;
                if (var18.field2482 < 0) {
                    break;
                }
                var19 = class142.method1053(var18.field2463, 65535);
            } while (var19 == null || var19.field2472 == null || var18.field2482 >= var19.field2472.length || var19.field2472[var18.field2482] != var18);
            class144.method1065(var10, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 1869)
    private final void method775(int arg0, int arg1) {
        class286.field4589.field3036 = arg1;
        class340.field5295 = arg0;
        class160.field2648 = null;
        field1664++;
        class286.field4589.field3034++;
        class214.field3499 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1882)
    public final void method674(int arg0) {
        if (class232.field3690) {
            class232.method1676();
        }
        field1656++;
        if (class204.field3362 != null) {
            class271.method1927(class14.field159, class204.field3362, 4);
            class204.field3362 = null;
        }
        if (arg0 <= 42) {
            field1667 = (int[]) null;
        }
        if (class14.field159 != null) {
            class14.field159.method895((byte) 113, this.getClass());
        }
        if (class181.field3002 != null) {
            class181.field3002.field3083 = false;
        }
        class181.field3002 = null;
        if (class320.field4966 != null) {
            class320.field4966.method91(-112);
            class320.field4966 = null;
        }
        class51.method336(class94.field1290, -1);
        class79.method538(class94.field1290, (byte) -34);
        if (class158.field2614 != null) {
            class158.field2614.method1701((byte) 35, class94.field1290);
        }
        class274.method1983(-7864);
        class91.method609((byte) -87);
        class158.field2614 = null;
        if (class198.field3225 != null) {
            class198.field3225.method2221(64);
        }
        if (class49.field693 != null) {
            class49.field693.method2221(120);
        }
        class286.field4589.method1372((byte) -78);
        class245.field3865.method2149((byte) 66);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Log;IIIIIII)V", line = 1940)
    public static final void method776(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && var9.field2463 == arg1 && (!var9.field2421 || var9.field2478 == 0 || var9.field2485 || method766(var9).field4503 != 0 || class194.field3181 == var9 || var9.field2467 == 1338) && (!var9.field2421 || !method777(var9))) {
                int var10 = var9.field2519 + arg6;
                int var11 = var9.field2517 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2478 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2468 + var10;
                    int var17 = var9.field2520 + var11;
                    if (var9.field2478 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class307.field4783 == var9) {
                    class210.field3446 = true;
                    class252.field4024 = var10;
                    class117.field1780 = var11;
                }
                if (!var9.field2421 || var12 < var14 && var13 < var15) {
                    if (var9.field2478 == 0) {
                        if (!var9.field2421 && method777(var9) && class256.field4101 != var9) {
                            continue;
                        }
                        if (var9.field2422 && class70.field995 >= var12 && class233.field3738 >= var13 && class70.field995 < var14 && class233.field3738 < var15) {
                            for (class39 var18 = (class39) class126.field1957.method1240(3); var18 != null; var18 = (class39) class126.field1957.method1235(false)) {
                                if (var18.field511) {
                                    var18.method1212((byte) 99);
                                    var18.field500.field2527 = false;
                                }
                            }
                            if (class333.field5189 == 0) {
                                class307.field4783 = null;
                                class194.field3181 = null;
                            }
                            class91.field1260 = 0;
                        }
                    }
                    if (var9.field2421) {
                        boolean var19;
                        if (class70.field995 >= var12 && class233.field3738 >= var13 && class70.field995 < var14 && class233.field3738 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class99.field1446 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class160.field2642 == 1 && class105.field1542 >= var12 && class198.field3221 >= var13 && class105.field1542 < var14 && class198.field3221 < var15) {
                            var21 = true;
                        }
                        if (var9.field2477 != null) {
                            for (int var22 = 0; var22 < var9.field2477.length; var22++) {
                                if (class117.field1770[var9.field2477[var22]]) {
                                    if (var9.field2489 == null || class240.field3818 >= var9.field2489[var22]) {
                                        byte var23 = var9.field2491[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class117.field1770[86] && !class117.field1770[82] && !class117.field1770[81]) && ((var23 & 0x2) == 0 || class117.field1770[86]) && ((var23 & 0x1) == 0 || class117.field1770[82]) && ((var23 & 0x4) == 0 || class117.field1770[81])) {
                                            class193.method1428(var22 + 1, var9.field2486, false, -1, "");
                                            int var24 = var9.field2600[var22];
                                            if (var9.field2489 == null) {
                                                var9.field2489 = new int[var9.field2477.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2489[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2489[var22] = class240.field3818 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2489 != null) {
                                    var9.field2489[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class98.method667(-98, var9, class198.field3221 - var11, class105.field1542 - var10);
                        }
                        if (class307.field4783 != null && class307.field4783 != var9 && var19 && method766(var9).method2025(false)) {
                            class240.field3805 = var9;
                        }
                        if (class194.field3181 == var9) {
                            class31.field424 = true;
                            class158.field2608 = var10;
                            class276.field4459 = var11;
                        }
                        if (var9.field2485 || var9.field2467 != 0) {
                            if (var19 && class34.field452 != 0 && var9.field2441 != null) {
                                class39 var25 = new class39();
                                var25.field511 = true;
                                var25.field500 = var9;
                                var25.field498 = class34.field452;
                                var25.field501 = var9.field2441;
                                class126.field1957.method1232(121, var25);
                            }
                            if (class307.field4783 != null || class279.field4504 != null || class196.field3204 || var9.field2467 != 1400 && class91.field1260 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2467 != 0) {
                                if (var9.field2467 == 1337) {
                                    class89.field1234 = var9;
                                    continue;
                                }
                                if (var9.field2467 == 1338) {
                                    if (var21) {
                                        class327.field5061 = class105.field1542 - var10;
                                        class246.field3891 = class198.field3221 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2467 == 1400) {
                                    class127.field1989 = var9;
                                    if (var21) {
                                        if (class117.field1770[82] && class341.field5311 > 0) {
                                            int var26 = (int) ((double) (class105.field1542 - var10 - var9.field2468 / 2) * 2.0D / (double) class122.field1920);
                                            int var27 = (int) ((double) (class198.field3221 - var11 - var9.field2520 / 2) * 2.0D / (double) class122.field1920);
                                            int var28 = class139.field2195 + var26;
                                            int var29 = class91.field1254 + var27;
                                            int var30 = class27.field377 + var28;
                                            int var31 = class74.field1048 + class93.field1276 - var29 - 1;
                                            class291 var32 = class25.method139(false);
                                            int[] var33 = var32.method2085((byte) -91, var31, var30);
                                            if (var33 != null) {
                                                class11.method58(var33[0], var33[1], var33[2], -32586);
                                                class231.method1638(30);
                                            }
                                            continue;
                                        }
                                        class91.field1260 = 1;
                                        class76.field1067 = class70.field995;
                                        class307.field4792 = class233.field3738;
                                        continue;
                                    }
                                    if (var20 && class91.field1260 > 0) {
                                        if (class91.field1260 == 1 && (class76.field1067 != class70.field995 || class307.field4792 != class233.field3738)) {
                                            class78.field1096 = class139.field2195;
                                            class307.field4789 = class91.field1254;
                                            class91.field1260 = 2;
                                        }
                                        if (class91.field1260 == 2) {
                                            class289.method2071(-111, (int) ((double) (class76.field1067 - class70.field995) * 2.0D / (double) class43.field543) + class78.field1096);
                                            class204.method1489(-1, (int) ((double) (class307.field4792 - class233.field3738) * 2.0D / (double) class43.field543) + class307.field4789);
                                        }
                                        continue;
                                    }
                                    class91.field1260 = 0;
                                    continue;
                                }
                                if (var9.field2467 == 1401) {
                                    if (var20) {
                                        class291.method2081(var9.field2520, var9.field2468, class70.field995 - var10, class233.field3738 - var11, -123);
                                    }
                                    continue;
                                }
                                if (var9.field2467 == 1402) {
                                    if (!class232.field3690) {
                                        class320.method2252(var9, 0);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2540 && var21) {
                                var9.field2540 = true;
                                if (var9.field2579 != null) {
                                    class39 var34 = new class39();
                                    var34.field511 = true;
                                    var34.field500 = var9;
                                    var34.field516 = class105.field1542 - var10;
                                    var34.field498 = class198.field3221 - var11;
                                    var34.field501 = var9.field2579;
                                    class126.field1957.method1232(116, var34);
                                }
                            }
                            if (var9.field2540 && var20 && var9.field2500 != null) {
                                class39 var35 = new class39();
                                var35.field511 = true;
                                var35.field500 = var9;
                                var35.field516 = class70.field995 - var10;
                                var35.field498 = class233.field3738 - var11;
                                var35.field501 = var9.field2500;
                                class126.field1957.method1232(92, var35);
                            }
                            if (var9.field2540 && !var20) {
                                var9.field2540 = false;
                                if (var9.field2488 != null) {
                                    class39 var36 = new class39();
                                    var36.field511 = true;
                                    var36.field500 = var9;
                                    var36.field516 = class70.field995 - var10;
                                    var36.field498 = class233.field3738 - var11;
                                    var36.field501 = var9.field2488;
                                    class271.field4375.method1232(104, var36);
                                }
                            }
                            if (var20 && var9.field2507 != null) {
                                class39 var37 = new class39();
                                var37.field511 = true;
                                var37.field500 = var9;
                                var37.field516 = class70.field995 - var10;
                                var37.field498 = class233.field3738 - var11;
                                var37.field501 = var9.field2507;
                                class126.field1957.method1232(122, var37);
                            }
                            if (!var9.field2527 && var19) {
                                var9.field2527 = true;
                                if (var9.field2586 != null) {
                                    class39 var38 = new class39();
                                    var38.field511 = true;
                                    var38.field500 = var9;
                                    var38.field516 = class70.field995 - var10;
                                    var38.field498 = class233.field3738 - var11;
                                    var38.field501 = var9.field2586;
                                    class126.field1957.method1232(107, var38);
                                }
                            }
                            if (var9.field2527 && var19 && var9.field2505 != null) {
                                class39 var39 = new class39();
                                var39.field511 = true;
                                var39.field500 = var9;
                                var39.field516 = class70.field995 - var10;
                                var39.field498 = class233.field3738 - var11;
                                var39.field501 = var9.field2505;
                                class126.field1957.method1232(106, var39);
                            }
                            if (var9.field2527 && !var19) {
                                var9.field2527 = false;
                                if (var9.field2484 != null) {
                                    class39 var40 = new class39();
                                    var40.field511 = true;
                                    var40.field500 = var9;
                                    var40.field516 = class70.field995 - var10;
                                    var40.field498 = class233.field3738 - var11;
                                    var40.field501 = var9.field2484;
                                    class271.field4375.method1232(121, var40);
                                }
                            }
                            if (var9.field2577 != null) {
                                class39 var41 = new class39();
                                var41.field500 = var9;
                                var41.field501 = var9.field2577;
                                class98.field1392.method1232(114, var41);
                            }
                            if (var9.field2565 != null && class335.field5243 > var9.field2546) {
                                if (var9.field2506 == null || class335.field5243 - var9.field2546 > 32) {
                                    class39 var46 = new class39();
                                    var46.field500 = var9;
                                    var46.field501 = var9.field2565;
                                    class126.field1957.method1232(114, var46);
                                } else {
                                    label575: for (int var42 = var9.field2546; var42 < class335.field5243; var42++) {
                                        int var43 = class34.field468[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2506.length; var44++) {
                                            if (var9.field2506[var44] == var43) {
                                                class39 var45 = new class39();
                                                var45.field500 = var9;
                                                var45.field501 = var9.field2565;
                                                class126.field1957.method1232(122, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field2546 = class335.field5243;
                            }
                            if (var9.field2444 != null && class265.field4286 > var9.field2425) {
                                if (var9.field2474 == null || class265.field4286 - var9.field2425 > 32) {
                                    class39 var51 = new class39();
                                    var51.field500 = var9;
                                    var51.field501 = var9.field2444;
                                    class126.field1957.method1232(93, var51);
                                } else {
                                    label551: for (int var47 = var9.field2425; var47 < class265.field4286; var47++) {
                                        int var48 = class256.field4072[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2474.length; var49++) {
                                            if (var9.field2474[var49] == var48) {
                                                class39 var50 = new class39();
                                                var50.field500 = var9;
                                                var50.field501 = var9.field2444;
                                                class126.field1957.method1232(127, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field2425 = class265.field4286;
                            }
                            if (var9.field2568 != null && class281.field4528 > var9.field2550) {
                                if (var9.field2556 == null || class281.field4528 - var9.field2550 > 32) {
                                    class39 var56 = new class39();
                                    var56.field500 = var9;
                                    var56.field501 = var9.field2568;
                                    class126.field1957.method1232(103, var56);
                                } else {
                                    label527: for (int var52 = var9.field2550; var52 < class281.field4528; var52++) {
                                        int var53 = class273.field4411[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2556.length; var54++) {
                                            if (var9.field2556[var54] == var53) {
                                                class39 var55 = new class39();
                                                var55.field500 = var9;
                                                var55.field501 = var9.field2568;
                                                class126.field1957.method1232(119, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field2550 = class281.field4528;
                            }
                            if (var9.field2423 != null && class324.field5031 > var9.field2553) {
                                if (var9.field2504 == null || class324.field5031 - var9.field2553 > 32) {
                                    class39 var61 = new class39();
                                    var61.field500 = var9;
                                    var61.field501 = var9.field2423;
                                    class126.field1957.method1232(105, var61);
                                } else {
                                    label503: for (int var57 = var9.field2553; var57 < class324.field5031; var57++) {
                                        int var58 = class243.field3849[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2504.length; var59++) {
                                            if (var9.field2504[var59] == var58) {
                                                class39 var60 = new class39();
                                                var60.field500 = var9;
                                                var60.field501 = var9.field2423;
                                                class126.field1957.method1232(115, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field2553 = class324.field5031;
                            }
                            if (var9.field2471 != null && class29.field389 > var9.field2605) {
                                if (var9.field2457 == null || class29.field389 - var9.field2605 > 32) {
                                    class39 var66 = new class39();
                                    var66.field500 = var9;
                                    var66.field501 = var9.field2471;
                                    class126.field1957.method1232(116, var66);
                                } else {
                                    label479: for (int var62 = var9.field2605; var62 < class29.field389; var62++) {
                                        int var63 = class53.field755[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2457.length; var64++) {
                                            if (var9.field2457[var64] == var63) {
                                                class39 var65 = new class39();
                                                var65.field500 = var9;
                                                var65.field501 = var9.field2471;
                                                class126.field1957.method1232(125, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field2605 = class29.field389;
                            }
                            if (class146.field2277 > var9.field2558 && var9.field2434 != null) {
                                class39 var67 = new class39();
                                var67.field500 = var9;
                                var67.field501 = var9.field2434;
                                class126.field1957.method1232(127, var67);
                            }
                            if (class133.field2092 > var9.field2558 && var9.field2440 != null) {
                                class39 var68 = new class39();
                                var68.field500 = var9;
                                var68.field501 = var9.field2440;
                                class126.field1957.method1232(106, var68);
                            }
                            if (class32.field436 > var9.field2558 && var9.field2535 != null) {
                                class39 var69 = new class39();
                                var69.field500 = var9;
                                var69.field501 = var9.field2535;
                                class126.field1957.method1232(96, var69);
                            }
                            if (class110.field1640 > var9.field2558 && var9.field2575 != null) {
                                class39 var70 = new class39();
                                var70.field500 = var9;
                                var70.field501 = var9.field2575;
                                class126.field1957.method1232(106, var70);
                            }
                            if (class201.field3266 > var9.field2558 && var9.field2475 != null) {
                                class39 var71 = new class39();
                                var71.field500 = var9;
                                var71.field501 = var9.field2475;
                                class126.field1957.method1232(117, var71);
                            }
                            var9.field2558 = class186.field3074;
                            if (var9.field2534 != null) {
                                for (int var72 = 0; var72 < class43.field545; var72++) {
                                    class39 var73 = new class39();
                                    var73.field500 = var9;
                                    var73.field513 = class26.field360[var72];
                                    var73.field507 = class246.field3887[var72];
                                    var73.field501 = var9.field2534;
                                    class126.field1957.method1232(122, var73);
                                }
                            }
                            if (class189.field3105 && var9.field2426 != null) {
                                class39 var74 = new class39();
                                var74.field500 = var9;
                                var74.field501 = var9.field2426;
                                class126.field1957.method1232(97, var74);
                            }
                        }
                    }
                    if (!var9.field2421 && class307.field4783 == null && class279.field4504 == null && !class196.field3204) {
                        if ((var9.field2511 >= 0 || var9.field2524 != 0) && class70.field995 >= var12 && class233.field3738 >= var13 && class70.field995 < var14 && class233.field3738 < var15) {
                            if (var9.field2511 >= 0) {
                                class256.field4101 = arg0[var9.field2511];
                            } else {
                                class256.field4101 = var9;
                            }
                        }
                        if (var9.field2478 == 8 && class70.field995 >= var12 && class233.field3738 >= var13 && class70.field995 < var14 && class233.field3738 < var15) {
                            class52.field742 = var9;
                        }
                        if (var9.field2528 > var9.field2520) {
                            class324.method2269(class233.field3738, class70.field995, (byte) 120, var9, var11, var9.field2468 + var10, var9.field2528, var9.field2520);
                        }
                    }
                    if (var9.field2478 == 0) {
                        method776(arg0, var9.field2486, var12, var13, var14, var15, var10 - var9.field2499, var11 - var9.field2591);
                        if (var9.field2472 != null) {
                            method776(var9.field2472, var9.field2486, var12, var13, var14, var15, var10 - var9.field2499, var11 - var9.field2591);
                        }
                        class90 var75 = (class90) class243.field3842.method451((long) var9.field2486, (byte) 100);
                        if (var75 != null) {
                            class97.method651(var14, var11, var13, var10, var12, (byte) -7, var15, var75.field1249);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Log;)Z", line = 2708)
    public static final boolean method777(class157 arg0) {
        if (class301.field4727) {
            if (method766(arg0).field4503 != 0) {
                return false;
            }
            if (arg0.field2478 == 0) {
                return false;
            }
        }
        return arg0.field2592;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2726)
    public final void init() {
        field1674++;
        if (!this.method672(false)) {
            return;
        }
        class102.field1497 = Integer.parseInt(this.getParameter("worldid"));
        class122.field1909 = Integer.parseInt(this.getParameter("modewhere"));
        if (class122.field1909 < 0 || class122.field1909 > 1) {
            class122.field1909 = 0;
        }
        class34.field456 = Integer.parseInt(this.getParameter("modewhat"));
        if (class34.field456 < 0 || class34.field456 > 2) {
            class34.field456 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class64.field930 = true;
        } else {
            class64.field930 = false;
        }
        try {
            class8.field121 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class8.field121 = 0;
        }
        class185.method1388(-3, class8.field121);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class34.field459 = true;
        } else {
            class34.field459 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class102.field1494 = true;
        } else {
            class102.field1494 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class15.field169 = 1;
        } else {
            class15.field169 = 0;
        }
        try {
            class44.field594 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class44.field594 = 0;
        }
        class13.field154 = this.getParameter("settings");
        if (class13.field154 == null) {
            class13.field154 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class77.field1069 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class77.field1069 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class27.field379 = true;
        } else {
            class27.field379 = false;
        }
        class341.field5296 = this;
        this.method680(503, 85, 765, 1540, class34.field456 + 32);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2818)
    public static void method778(byte arg0) {
        field1667 = null;
        field1666 = null;
        field1657 = null;
        if (arg0 != -7) {
            method778((byte) 37);
        }
        field1675 = null;
    }
}

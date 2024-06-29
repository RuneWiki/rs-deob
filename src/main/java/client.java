import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class121 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lwj;")
    public static class270 field2802 = new class270(32, 14);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lar;")
    public static class479 field2810 = new class479();

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[J")
    public static long[] field2811 = new long[32];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lae;")
    public static class164 field2793;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field2812;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 4)
    private final void method1219(boolean arg0) {
        if (!class20.field269.field7633) {
            for (int var2 = 0; var2 < class296.field4062; var2++) {
                if (class373.field5481[var2].method1151((byte) -29) == 's' || class373.field5481[var2].method1151((byte) -28) == 'S') {
                    class20.field269.field7633 = true;
                    break;
                }
            }
        }
        field2792++;
        if (class216.field3005 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class246.method1483(5957);
            if (class67.field920 == 0L) {
                class67.field920 = var5;
            }
            if (var4 > 16384 && (var5 - class67.field920) < 5000L) {
                if ((var5 - class231.field3258) > 1000L) {
                    System.gc();
                    class231.field3258 = var5;
                }
                class57.field674 = class176.field2610.method2731(62, class372.field5455);
                class339.field4895 = 5;
            } else {
                class57.field674 = class495.field7234.method2731(62, class372.field5455);
                class216.field3005 = 10;
                class339.field4895 = 5;
            }
        } else if (class216.field3005 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class82.field1229[var7] = class217.method1347(class527.field7799, 5761, class422.field6182);
            }
            class57.field674 = class141.field2008.method2731(62, class372.field5455);
            class216.field3005 = 20;
            class339.field4895 = 10;
        } else if (class216.field3005 == 20) {
            if (class307.field4188 == null) {
                class307.field4188 = new class458(class366.field5366, class413.field6029);
            }
            if (class307.field4188.method2688((byte) -125)) {
                class179.field2630 = class398.method2394(false, -96, true, 0, 1);
                class294.field4051 = class398.method2394(false, -47, true, 1, 1);
                class356.field5196 = class398.method2394(false, -72, true, 2, 1);
                class73.field995 = class398.method2394(false, -44, true, 3, 1);
                class167.field2509 = class398.method2394(false, -88, true, 4, 1);
                class297.field4079 = class398.method2394(true, -98, true, 5, 1);
                class177.field2625 = class398.method2394(true, -113, false, 6, 1);
                class523.field7739 = class398.method2394(false, -50, true, 7, 1);
                class364.field5334 = class398.method2394(false, -78, true, 8, 1);
                class23.field308 = class398.method2394(false, -106, true, 9, 1);
                class144.field2062 = class398.method2394(false, -86, true, 10, 1);
                class414.field6044 = class398.method2394(false, -100, true, 11, 1);
                class481.field7022 = class398.method2394(false, -124, true, 12, 1);
                class188.field2726 = class398.method2394(false, -105, true, 13, 1);
                class497.field7247 = class398.method2394(false, -54, false, 14, 1);
                class251.field3473 = class398.method2394(false, -51, true, 15, 1);
                class427.field6259 = class398.method2394(false, -88, true, 16, 1);
                class27.field358 = class398.method2394(false, -69, true, 17, 1);
                class127.field1888 = class398.method2394(false, -58, true, 18, 1);
                class469.field6853 = class398.method2394(false, -79, true, 19, 1);
                class115.field1719 = class398.method2394(false, -82, true, 20, 1);
                class138.field1974 = class398.method2394(false, -90, true, 21, 1);
                class128.field1903 = class398.method2394(false, -57, true, 22, 1);
                class352.field5173 = class398.method2394(true, -73, true, 23, 1);
                class279.field3821 = class398.method2394(false, -94, true, 24, 1);
                class252.field3499 = class398.method2394(false, -70, true, 25, 1);
                class62.field777 = class398.method2394(true, -91, true, 26, 1);
                class432.field6342 = class398.method2394(false, -107, true, 27, 1);
                class138.field1975 = class398.method2394(true, -92, true, 28, 1);
                class425.field6244 = class398.method2394(false, -112, true, 29, 1);
                class57.field674 = class476.field6941.method2731(62, class372.field5455);
                class216.field3005 = 30;
                class339.field4895 = 15;
            } else {
                class57.field674 = class66.field902.method2731(62, class372.field5455);
                class339.field4895 = 12;
            }
        } else if (class216.field3005 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class328.field4478[var9].method2803(1) * class51.field619[var9] / 100;
            }
            if (var8 == 100) {
                class57.field674 = class11.field172.method2731(62, class372.field5455);
                class339.field4895 = 20;
                class386.method2278(class364.field5334, (byte) -98);
                class164.method1095(class364.field5334, (byte) 117);
                class216.field3005 = 40;
            } else {
                if (var8 != 0) {
                    class57.field674 = class359.field5238.method2731(62, class372.field5455) + var8 + "%";
                }
                class339.field4895 = 20;
            }
        } else if (class216.field3005 == 40) {
            if (class138.field1975.method737(121)) {
                this.method1235(class138.field1975.method742(1, 1), -71);
                class57.field674 = class333.field4515.method2731(62, class372.field5455);
                class339.field4895 = 25;
                class216.field3005 = 50;
            } else {
                class57.field674 = class374.field5487.method2731(62, class372.field5455) + class138.field1975.method731((byte) 123) + "%";
                class339.field4895 = 25;
            }
        } else if (class216.field3005 == 50) {
            class439.method2612(-12576);
            class57.field674 = class235.field3336.method2731(62, class372.field5455);
            class216.field3005 = 60;
            class339.field4895 = 30;
        } else if (class216.field3005 == 60) {
            int var10 = class340.method2022(class188.field2726, class364.field5334, 0);
            int var11 = class256.method1536((byte) -31);
            if (var10 < var11) {
                class57.field674 = class325.field4439.method2731(62, class372.field5455) + var10 * 100 / var11 + "%";
                class339.field4895 = 35;
            } else {
                class57.field674 = class476.field6943.method2731(62, class372.field5455);
                class216.field3005 = 70;
                class339.field4895 = 35;
            }
        } else if (class216.field3005 == 70) {
            int var12 = class148.method991(true, class364.field5334);
            int var13 = class105.method774((byte) 83);
            if (var12 < var13) {
                class57.field674 = class411.field6015.method2731(62, class372.field5455) + var12 * 100 / var13 + "%";
                class339.field4895 = 40;
            } else {
                class57.field674 = class365.field5355.method2731(62, class372.field5455);
                class339.field4895 = 40;
                class216.field3005 = 80;
            }
        } else if (class216.field3005 == 80) {
            if (class62.field777.method737(-108)) {
                class124.field1851 = new class531(class62.field777, class23.field308, class364.field5334);
                class57.field674 = class227.field3231.method2731(62, class372.field5455);
                class216.field3005 = 90;
                class339.field4895 = 45;
            } else {
                class57.field674 = class85.field1258.method2731(62, class372.field5455) + class62.field777.method731((byte) 126) + "%";
                class339.field4895 = 45;
            }
        } else if (class216.field3005 == 90) {
            class57.field674 = class403.field5919.method2731(62, class372.field5455);
            class339.field4895 = 50;
            class216.field3005 = 95;
        } else if (class216.field3005 == 95) {
            if (class20.field269.field7633) {
                class20.field269.field7663 = 0;
                class20.field269.field7662 = 0;
                class20.field269.field7669 = 0;
                class20.field269.field7643 = 1;
                class20.field269.field7670 = 0;
            }
            class20.field269.field7633 = true;
            class20.field269.method1715((byte) -128, class202.field2840);
            class361.method2165(false, class20.field269.field7662, (byte) 96);
            class57.field674 = class58.field704.method2731(62, class372.field5455);
            class339.field4895 = 55;
            class216.field3005 = 100;
        } else if (class216.field3005 == 100) {
            class65.method561(class364.field5334, class269.field3721, class188.field2726, (byte) 123);
            class57.field674 = class512.field7593.method2731(62, class372.field5455);
            class339.field4895 = 60;
            class448.method2651(5, (byte) 112);
            class216.field3005 = 110;
        } else {
            if (!arg0) {
                field2802 = null;
            }
            if (class216.field3005 == 110) {
                byte var14 = 0;
                class356.field5196.method737(-97);
                int var15 = var14 + class356.field5196.method731((byte) 123);
                class427.field6259.method737(112);
                int var16 = var15 + class427.field6259.method731((byte) 122);
                class27.field358.method737(-66);
                int var17 = var16 + class27.field358.method731((byte) 127);
                class127.field1888.method737(98);
                int var18 = var17 + class127.field1888.method731((byte) 122);
                class469.field6853.method737(104);
                int var19 = var18 + class469.field6853.method731((byte) 124);
                class115.field1719.method737(-47);
                int var20 = var19 + class115.field1719.method731((byte) 125);
                class138.field1974.method737(-90);
                int var21 = var20 + class138.field1974.method731((byte) 127);
                class128.field1903.method737(-87);
                int var22 = var21 + class128.field1903.method731((byte) 124);
                class279.field3821.method737(100);
                int var23 = var22 + class279.field3821.method731((byte) 127);
                class252.field3499.method737(93);
                int var24 = var23 + class252.field3499.method731((byte) 123);
                class432.field6342.method737(-46);
                int var25 = var24 + class432.field6342.method731((byte) 123);
                class425.field6244.method737(86);
                int var26 = var25 + class425.field6244.method731((byte) 127);
                if (var26 < 1200) {
                    class57.field674 = class449.field6614.method2731(62, class372.field5455) + var26 / 12 + "%";
                    class339.field4895 = 65;
                } else {
                    class177.field2622 = new class342(class323.field4400, class372.field5455, class356.field5196);
                    class501.field7375 = new class211(class323.field4400, class372.field5455, class356.field5196);
                    class253.field3517 = new class100(class323.field4400, class372.field5455, class356.field5196, class364.field5334);
                    class231.field3269 = new class182(class323.field4400, class372.field5455, class27.field358);
                    class511.field7575 = new class303(class323.field4400, class372.field5455, class356.field5196);
                    class324.field4405 = new class226(class323.field4400, class372.field5455, class356.field5196);
                    class168.field2515 = new class216(class323.field4400, class372.field5455, class356.field5196, class523.field7739);
                    class154.field2359 = new class385(class323.field4400, class372.field5455, class356.field5196);
                    class104.field1572 = new class266(class323.field4400, class372.field5455, class356.field5196);
                    class78.field1141 = new class351(class323.field4400, class372.field5455, true, class427.field6259, class523.field7739);
                    class362.field5299 = new class25(class323.field4400, class372.field5455, class356.field5196, class364.field5334);
                    class227.field3232 = new class402(class323.field4400, class372.field5455, class356.field5196, class364.field5334);
                    class158.field2401 = new class366(class323.field4400, class372.field5455, true, class127.field1888, class523.field7739);
                    class328.field4480 = new class519(class323.field4400, class372.field5455, true, class177.field2622, class469.field6853, class523.field7739);
                    class351.field5158 = new class389(class323.field4400, class372.field5455, class356.field5196);
                    class222.field3168 = new class20(class323.field4400, class372.field5455, class115.field1719, class179.field2630, class294.field4051);
                    class214.field2995 = new class204(class323.field4400, class372.field5455, class356.field5196);
                    class328.field4481 = new class446(class323.field4400, class372.field5455, class356.field5196);
                    class27.field357 = new class244(class323.field4400, class372.field5455, class138.field1974, class523.field7739);
                    class360.field5255 = new class388(class323.field4400, class372.field5455, class356.field5196);
                    class424.field6242 = new class196(class323.field4400, class372.field5455, class356.field5196);
                    class176.field2614 = new class144(class323.field4400, class372.field5455, class356.field5196);
                    class302.field4142 = new class261(class323.field4400, class372.field5455, class128.field1903);
                    class73.field996 = new class115(class323.field4400, class372.field5455, class356.field5196);
                    class365.method2201(class523.field7739, class73.field995, class364.field5334, true, class188.field2726);
                    class305.method1775(class425.field6244, 0);
                    class398.field5822 = new class195(class372.field5455, class279.field3821, class252.field3499);
                    class224.field3195 = new class259(class372.field5455, class279.field3821, class252.field3499, new class514());
                    class57.field674 = class341.field4908.method2731(62, class372.field5455);
                    class339.field4895 = 65;
                    class511.method3055(true);
                    class78.field1141.method2110(!class20.field269.method1712(class152.field2332, false), (byte) -122);
                    class421.field6166 = new class138();
                    class446.method2643(-3623);
                    class305.method1774(class432.field6342, (byte) 66);
                    class225.method1397(class124.field1851, -2074982072, class523.field7739);
                    class216.field3005 = 120;
                }
            } else if (class216.field3005 == 120) {
                int var27 = class169.method1112((byte) -76, class364.field5334);
                int var28 = class480.method2824(16);
                if (var27 < var28) {
                    class57.field674 = class122.field1826.method2731(62, class372.field5455) + var27 * 100 / var28 + "%";
                    class339.field4895 = 70;
                } else {
                    class132.method904(class364.field5334, class269.field3721, (byte) -127);
                    class253.method1518(-10, class134.field1947);
                    class57.field674 = class247.field3425.method2731(62, class372.field5455);
                    class216.field3005 = 130;
                    class339.field4895 = 70;
                }
            } else if (class216.field3005 == 130) {
                if (class144.field2062.method734("huffman", (byte) 122, "")) {
                    class475 var29 = new class475(class144.field2062.method752("huffman", "", 126));
                    class434.method2561(var29, (byte) -118);
                    class57.field674 = class402.field5900.method2731(62, class372.field5455);
                    class339.field4895 = 75;
                    class216.field3005 = 140;
                } else {
                    class57.field674 = class455.field6697.method2731(62, class372.field5455) + "0%";
                    class339.field4895 = 75;
                }
            } else if (class216.field3005 == 140) {
                if (class73.field995.method737(-83)) {
                    class57.field674 = class327.field4475.method2731(62, class372.field5455);
                    class216.field3005 = 150;
                    class339.field4895 = 80;
                } else {
                    class57.field674 = class13.field196.method2731(62, class372.field5455) + class73.field995.method731((byte) 126) + "%";
                    class339.field4895 = 80;
                }
            } else if (class216.field3005 == 150) {
                if (class481.field7022.method737(-58)) {
                    class57.field674 = class249.field3446.method2731(62, class372.field5455);
                    class339.field4895 = 82;
                    class216.field3005 = 160;
                } else {
                    class57.field674 = class141.field2027.method2731(62, class372.field5455) + class481.field7022.method731((byte) 125) + "%";
                    class339.field4895 = 82;
                }
            } else if (class216.field3005 == 160) {
                if (class188.field2726.method737(-61)) {
                    class57.field674 = class487.field7125.method2731(62, class372.field5455);
                    class339.field4895 = 85;
                    class216.field3005 = 170;
                } else {
                    class57.field674 = class487.field7125.method2731(62, class372.field5455) + class188.field2726.method731((byte) 123) + "%";
                    class339.field4895 = 85;
                }
            } else if (class216.field3005 == 170) {
                if (class352.field5173.method740(arg0, "details")) {
                    class350.method2101(class352.field5173, class511.field7575, class324.field4405, class78.field1141, class362.field5299, class227.field3232, class421.field6166);
                    class57.field674 = class204.field2867.method2731(62, class372.field5455);
                    class339.field4895 = 89;
                    class216.field3005 = 180;
                } else {
                    class57.field674 = class263.field3633.method2731(62, class372.field5455) + class352.field5173.method736((byte) -109, "details") + "%";
                    class339.field4895 = 87;
                }
            } else if (class216.field3005 == 180) {
                int var30 = class266.method1597(-29218);
                if (var30 == -1) {
                    class57.field674 = class118.field1766.method2731(62, class372.field5455);
                    class339.field4895 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method850(1000, "worldlistfull");
                    class448.method2651(1000, (byte) 112);
                } else if (class93.field1367) {
                    class57.field674 = class228.field3241.method2731(62, class372.field5455);
                    class216.field3005 = 190;
                    class339.field4895 = 90;
                } else {
                    this.method850(1000, "worldlistio_" + var30);
                    class448.method2651(1000, (byte) 112);
                }
            } else if (class216.field3005 == 190) {
                class518.field7673 = new String[class424.field6242.field2787];
                class357.field5216 = new boolean[class176.field2614.field2068];
                class263.field3635 = new int[class176.field2614.field2068];
                for (int var31 = 0; var31 < class176.field2614.field2068; var31++) {
                    if (class176.field2614.method972(var31, (byte) 54).field7629 == 0) {
                        class357.field5216[var31] = true;
                        class376.field5510++;
                    }
                    class263.field3635[var31] = -1;
                }
                class70.method586((byte) 125);
                class489.field7137 = class73.field995.method735(-124, "loginscreen");
                class297.field4079.method749(true, false, (byte) -15);
                class177.field2625.method749(true, true, (byte) -64);
                class364.field5334.method749(true, true, (byte) -21);
                class188.field2726.method749(true, true, (byte) -90);
                class144.field2062.method749(true, true, (byte) -46);
                class73.field995.method749(true, true, (byte) -66);
                class356.field5196.field1541 = 2;
                class489.field7145 = true;
                class27.field358.field1541 = 2;
                class427.field6259.field1541 = 2;
                class127.field1888.field1541 = 2;
                class469.field6853.field1541 = 2;
                class115.field1719.field1541 = 2;
                class138.field1974.field1541 = 2;
                class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
                class57.field674 = class26.field348.method2731(62, class372.field5455);
                class339.field4895 = 95;
                class216.field3005 = 200;
            } else if (class216.field3005 == 200) {
                class227.method1411(35044, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lem;IIIIIIIII)V", line = 557)
    public static final void method1220(class150[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class150 var11 = arg0[var10];
            if (var11 != null && var11.field2259 == arg1) {
                int var12 = var11.field2309 + arg6;
                int var13 = var11.field2247 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2315 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2204 + var12;
                    int var19 = var11.field2322 + var13;
                    if (var11.field2315 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2315 == 0 || var11.field2162 || method1228(var11).field2719 != 0 || class257.field3566 == var11 || class210.field2932 == var11.field2289) {
                    if (!method1222(var11)) {
                        if (class110.field1664 == var11) {
                            class438.field6452 = true;
                            class378.field5537 = var12;
                            class146.field2093 = var13;
                        }
                        if (var11.field2316 || var14 < var16 && var15 < var17) {
                            if (var11.field2232 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class437 var20 = (class437) class416.field6052.method2818((byte) -53); var20 != null; var20 = (class437) class416.field6052.method2820((byte) -58)) {
                                    if (var20.field6396) {
                                        var20.method1565(0);
                                        var20.field6390.field2246 = false;
                                    }
                                }
                                if (class436.field6383 == 0) {
                                    class110.field1664 = null;
                                    class257.field3566 = null;
                                }
                                class514.field7607 = 0;
                                class494.field7219 = false;
                                class524.field7745 = false;
                                if (!class181.field2659) {
                                    class142.method960(0);
                                }
                            }
                            boolean var21;
                            if (class518.field7668.method1813(0) >= var14 && class518.field7668.method1822(126) >= var15 && class518.field7668.method1813(0) < var16 && class518.field7668.method1822(126) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class59.field720 && var21) {
                                if (var11.field2256 >= 0) {
                                    class226.field3209 = var11.field2256;
                                } else if (var11.field2232) {
                                    class226.field3209 = -1;
                                }
                            }
                            if (!class181.field2659 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class323.method1868(arg9 - var13, var11, arg8 - var12, (byte) -27);
                            }
                            boolean var22 = false;
                            if (class518.field7668.method1819(4) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class528 var24 = (class528) class391.field5737.method2818((byte) -78);
                            if (var24 != null && var24.method2741(48) == 0 && var24.method2749(-2257) >= var14 && var24.method2747(5) >= var15 && var24.method2749(-2257) < var16 && var24.method2747(5) < var17) {
                                var23 = true;
                            }
                            if (var11.field2208 != null) {
                                for (int var25 = 0; var25 < var11.field2208.length; var25++) {
                                    if (class310.field4231.method901(0, var11.field2208[var25])) {
                                        if (var11.field2205 == null || class441.field6516 >= var11.field2205[var25]) {
                                            byte var26 = var11.field2239[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class310.field4231.method901(0, 86) && !class310.field4231.method901(0, 82) && !class310.field4231.method901(0, 81)) && ((var26 & 0x2) == 0 || class310.field4231.method901(0, 86)) && ((var26 & 0x1) == 0 || class310.field4231.method901(0, 82)) && ((var26 & 0x4) == 0 || class310.field4231.method901(0, 81))) {
                                                if (var25 < 10) {
                                                    class462.method2714(var11.field2277, "", -31433, -1, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class88.method668((byte) -70);
                                                    class188 var27 = method1228(var11);
                                                    class26.method150(var11, -8605, var27.method1182((byte) 104), var27.field2720);
                                                    class78.field1131 = class339.method2017(var11, 16776960);
                                                    if (class78.field1131 == null) {
                                                        class78.field1131 = "Null";
                                                    }
                                                    class253.field3513 = var11.field2203 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2216[var25];
                                                if (var11.field2205 == null) {
                                                    var11.field2205 = new int[var11.field2208.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2205[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2205[var25] = class441.field6516 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2205 != null) {
                                        var11.field2205[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class300.method1757(var24.method2749(-2257) - var12, var11, var24.method2747(5) - var13, (byte) -86);
                            }
                            if (class110.field1664 != null && class110.field1664 != var11 && var21 && method1228(var11).method1183((byte) -79)) {
                                class21.field303 = var11;
                            }
                            if (class257.field3566 == var11) {
                                class493.field7200 = true;
                                class241.field3372 = var12;
                                class33.field442 = var13;
                            }
                            if (var11.field2162 || var11.field2289 != 0) {
                                if (var21 && class244.field3409 != 0 && var11.field2226 != null) {
                                    class437 var29 = new class437();
                                    var29.field6396 = true;
                                    var29.field6390 = var11;
                                    var29.field6388 = class244.field3409;
                                    var29.field6389 = var11.field2226;
                                    class416.field6052.method2809(var29, 2);
                                }
                                if (class110.field1664 != null || class181.field2659 || class362.field5292 != var11.field2289 && class514.field7607 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2289 != 0) {
                                    if (class186.field2700 == var11.field2289 || class425.field6247 == var11.field2289) {
                                        class510.field7564 = var11;
                                        if (class294.field4052 != null) {
                                            class294.field4052.method1807(class269.field3721, 0, var11.field2322);
                                        }
                                        if (class186.field2700 == var11.field2289) {
                                            if (!class181.field2659 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class348.method2065(class269.field3721, arg8, arg9, (byte) -109);
                                                for (class375 var30 = (class375) class225.field3202.method2461(-122); var30 != null; var30 = (class375) class225.field3202.method2458(-75)) {
                                                    if (arg8 >= var30.field5495 && arg8 < var30.field5497 && arg9 >= var30.field5494 && arg9 < var30.field5499) {
                                                        class142.method960(0);
                                                        class199.method1243(var30.field5496, 22865);
                                                    }
                                                }
                                            }
                                            class322.method1866(var12, var11, -5386, var13);
                                            continue;
                                        }
                                    }
                                    if (class210.field2932 == var11.field2289) {
                                        if (var11.method1012(false, class269.field3721) == null || class18.field238 != 0 && class18.field238 != 3 || class181.field2659 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2202[var32];
                                        if (var31 < var33 || var31 > var11.field2170[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2204 / 2;
                                        int var35 = var32 - var11.field2322 / 2;
                                        int var36;
                                        if (class491.field7168 == 4) {
                                            var36 = (int) class498.field7255 & 0x3FFF;
                                        } else {
                                            var36 = (int) class498.field7255 + class302.field4143 & 0x3FFF;
                                        }
                                        int var37 = class183.field2684[var36];
                                        int var38 = class183.field2678[var36];
                                        if (class491.field7168 != 4) {
                                            var37 = (class162.field2435 + 256) * var37 >> 8;
                                            var38 = (class162.field2435 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class491.field7168 == 4) {
                                            var41 = (class405.field5940 >> 7) + (var39 >> 2);
                                            var42 = (class177.field2621 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class316.field4324.method626((byte) 120) - 1) * 64;
                                            var41 = (class316.field4324.field1732 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class316.field4324.field1735 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class59.field720 && (class13.field199 & 0x40) != 0) {
                                            class150 var44 = class525.method3121(class214.field2994, class250.field3462, -9140);
                                            if (var44 == null) {
                                                class88.method668((byte) -70);
                                            } else {
                                                class407.method2438(51, class352.field5167, true, 1L, class78.field1131, var41, " ->", var11.field2237, 500, false, var42);
                                            }
                                            continue;
                                        }
                                        if (class323.field4400 == class11.field173) {
                                            class407.method2438(44, -1, true, 1L, class111.field1674.method2731(62, class372.field5455), var41, "", -1, 500, false, var42);
                                        }
                                        class407.method2438(59, class347.field4972, true, 1L, class259.field3609, var41, "", -1, 500, false, var42);
                                        continue;
                                    }
                                    if (class362.field5292 == var11.field2289) {
                                        class68.field931 = var11;
                                        if (var21) {
                                            class494.field7219 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method2749(-2257) - var12 - var11.field2204 / 2) * 2.0D / (double) class350.field5112);
                                            int var46 = (int) (-((double) (var24.method2747(5) - var13 - var11.field2322 / 2) * 2.0D / (double) class350.field5112));
                                            int var47 = class299.field4107 + var45 + class350.field5133;
                                            int var48 = class80.field1216 + var46 + class350.field5124;
                                            class252 var49 = class489.method2861((byte) -113);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1516((byte) -72, var50, var47, var48);
                                            if (var50 != null) {
                                                if (class310.field4231.method901(0, 82) && class68.field929 > 0) {
                                                    class422.method2513(var50[0], var50[1], var50[2], (byte) 109);
                                                    continue;
                                                }
                                                class524.field7745 = true;
                                                class223.field3190 = var50[0];
                                                class473.field6912 = var50[1];
                                                class521.field7732 = var50[2];
                                            }
                                            class514.field7607 = 1;
                                            class239.field3361 = false;
                                            class233.field3292 = class518.field7668.method1813(0);
                                            class12.field194 = class518.field7668.method1822(126);
                                            continue;
                                        }
                                        if (var22 && class514.field7607 > 0) {
                                            if (class514.field7607 == 1 && (class233.field3292 != class518.field7668.method1813(0) || class12.field194 != class518.field7668.method1822(126))) {
                                                class107.field1609 = class299.field4107;
                                                class209.field2903 = class80.field1216;
                                                class514.field7607 = 2;
                                            }
                                            if (class514.field7607 == 2) {
                                                class239.field3361 = true;
                                                class147.method987((byte) -126, class107.field1609 + (int) ((double) (class233.field3292 - class518.field7668.method1813(0)) * 2.0D / (double) class350.field5117));
                                                class425.method2522(class209.field2903 - (int) ((double) (class12.field194 - class518.field7668.method1822(126)) * 2.0D / (double) class350.field5117), (byte) 69);
                                            }
                                            continue;
                                        }
                                        if (class514.field7607 > 0 && !class239.field3361) {
                                            if ((class70.field990 == 1 || class442.method2634(-96)) && class274.field3764 > 2) {
                                                class381.method2261(0, class12.field194, class233.field3292);
                                            } else if (class421.method2508(105)) {
                                                class381.method2261(0, class12.field194, class233.field3292);
                                            }
                                        }
                                        class514.field7607 = 0;
                                        continue;
                                    }
                                    if (class117.field1747 == var11.field2289) {
                                        if (var22) {
                                            class479.method2805(class518.field7668.method1813(0) - var12, var11.field2204, var11.field2322, -1, class518.field7668.method1822(126) - var13);
                                        }
                                        continue;
                                    }
                                    if (class459.field6735 == var11.field2289) {
                                        class493.method2886(var12, var11, var13, false);
                                        continue;
                                    }
                                }
                                if (!var11.field2200 && var23) {
                                    var11.field2200 = true;
                                    if (var11.field2274 != null) {
                                        class437 var51 = new class437();
                                        var51.field6396 = true;
                                        var51.field6390 = var11;
                                        var51.field6387 = var24.method2749(-2257) - var12;
                                        var51.field6388 = var24.method2747(5) - var13;
                                        var51.field6389 = var11.field2274;
                                        class416.field6052.method2809(var51, 2);
                                    }
                                }
                                if (var11.field2200 && var22 && var11.field2293 != null) {
                                    class437 var52 = new class437();
                                    var52.field6396 = true;
                                    var52.field6390 = var11;
                                    var52.field6387 = class518.field7668.method1813(0) - var12;
                                    var52.field6388 = class518.field7668.method1822(126) - var13;
                                    var52.field6389 = var11.field2293;
                                    class416.field6052.method2809(var52, 2);
                                }
                                if (var11.field2200 && !var22) {
                                    var11.field2200 = false;
                                    if (var11.field2312 != null) {
                                        class437 var53 = new class437();
                                        var53.field6396 = true;
                                        var53.field6390 = var11;
                                        var53.field6387 = class518.field7668.method1813(0) - var12;
                                        var53.field6388 = class518.field7668.method1822(126) - var13;
                                        var53.field6389 = var11.field2312;
                                        class276.field3783.method2809(var53, 2);
                                    }
                                }
                                if (var22 && var11.field2175 != null) {
                                    class437 var54 = new class437();
                                    var54.field6396 = true;
                                    var54.field6390 = var11;
                                    var54.field6387 = class518.field7668.method1813(0) - var12;
                                    var54.field6388 = class518.field7668.method1822(126) - var13;
                                    var54.field6389 = var11.field2175;
                                    class416.field6052.method2809(var54, 2);
                                }
                                if (!var11.field2246 && var21) {
                                    var11.field2246 = true;
                                    if (var11.field2283 != null) {
                                        class437 var55 = new class437();
                                        var55.field6396 = true;
                                        var55.field6390 = var11;
                                        var55.field6387 = class518.field7668.method1813(0) - var12;
                                        var55.field6388 = class518.field7668.method1822(126) - var13;
                                        var55.field6389 = var11.field2283;
                                        class416.field6052.method2809(var55, 2);
                                    }
                                }
                                if (var11.field2246 && var21 && var11.field2227 != null) {
                                    class437 var56 = new class437();
                                    var56.field6396 = true;
                                    var56.field6390 = var11;
                                    var56.field6387 = class518.field7668.method1813(0) - var12;
                                    var56.field6388 = class518.field7668.method1822(126) - var13;
                                    var56.field6389 = var11.field2227;
                                    class416.field6052.method2809(var56, 2);
                                }
                                if (var11.field2246 && !var21) {
                                    var11.field2246 = false;
                                    if (var11.field2169 != null) {
                                        class437 var57 = new class437();
                                        var57.field6396 = true;
                                        var57.field6390 = var11;
                                        var57.field6387 = class518.field7668.method1813(0) - var12;
                                        var57.field6388 = class518.field7668.method1822(126) - var13;
                                        var57.field6389 = var11.field2169;
                                        class276.field3783.method2809(var57, 2);
                                    }
                                }
                                if (var11.field2164 != null) {
                                    class437 var58 = new class437();
                                    var58.field6390 = var11;
                                    var58.field6389 = var11.field2164;
                                    class86.field1268.method2809(var58, 2);
                                }
                                if (var11.field2250 != null && class310.field4234 > var11.field2241) {
                                    if (var11.field2255 == null || class310.field4234 - var11.field2241 > 32) {
                                        class437 var63 = new class437();
                                        var63.field6390 = var11;
                                        var63.field6389 = var11.field2250;
                                        class416.field6052.method2809(var63, 2);
                                    } else {
                                        label691: for (int var59 = var11.field2241; var59 < class310.field4234; var59++) {
                                            int var60 = class341.field4913[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2255.length; var61++) {
                                                if (var11.field2255[var61] == var60) {
                                                    class437 var62 = new class437();
                                                    var62.field6390 = var11;
                                                    var62.field6389 = var11.field2250;
                                                    class416.field6052.method2809(var62, 2);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2241 = class310.field4234;
                                }
                                if (var11.field2193 != null && class287.field3986 > var11.field2302) {
                                    if (var11.field2244 == null || class287.field3986 - var11.field2302 > 32) {
                                        class437 var68 = new class437();
                                        var68.field6390 = var11;
                                        var68.field6389 = var11.field2193;
                                        class416.field6052.method2809(var68, 2);
                                    } else {
                                        label667: for (int var64 = var11.field2302; var64 < class287.field3986; var64++) {
                                            int var65 = class428.field6290[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field2244.length; var66++) {
                                                if (var11.field2244[var66] == var65) {
                                                    class437 var67 = new class437();
                                                    var67.field6390 = var11;
                                                    var67.field6389 = var11.field2193;
                                                    class416.field6052.method2809(var67, 2);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2302 = class287.field3986;
                                }
                                if (var11.field2254 != null && class255.field3548 > var11.field2230) {
                                    if (var11.field2231 == null || class255.field3548 - var11.field2230 > 32) {
                                        class437 var73 = new class437();
                                        var73.field6390 = var11;
                                        var73.field6389 = var11.field2254;
                                        class416.field6052.method2809(var73, 2);
                                    } else {
                                        label643: for (int var69 = var11.field2230; var69 < class255.field3548; var69++) {
                                            int var70 = class346.field4960[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2231.length; var71++) {
                                                if (var11.field2231[var71] == var70) {
                                                    class437 var72 = new class437();
                                                    var72.field6390 = var11;
                                                    var72.field6389 = var11.field2254;
                                                    class416.field6052.method2809(var72, 2);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2230 = class255.field3548;
                                }
                                if (var11.field2306 != null && class400.field5879 > var11.field2211) {
                                    if (var11.field2261 == null || class400.field5879 - var11.field2211 > 32) {
                                        class437 var78 = new class437();
                                        var78.field6390 = var11;
                                        var78.field6389 = var11.field2306;
                                        class416.field6052.method2809(var78, 2);
                                    } else {
                                        label619: for (int var74 = var11.field2211; var74 < class400.field5879; var74++) {
                                            int var75 = class347.field4973[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2261.length; var76++) {
                                                if (var11.field2261[var76] == var75) {
                                                    class437 var77 = new class437();
                                                    var77.field6390 = var11;
                                                    var77.field6389 = var11.field2306;
                                                    class416.field6052.method2809(var77, 2);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2211 = class400.field5879;
                                }
                                if (var11.field2260 != null && class23.field313 > var11.field2243) {
                                    if (var11.field2233 == null || class23.field313 - var11.field2243 > 32) {
                                        class437 var83 = new class437();
                                        var83.field6390 = var11;
                                        var83.field6389 = var11.field2260;
                                        class416.field6052.method2809(var83, 2);
                                    } else {
                                        label595: for (int var79 = var11.field2243; var79 < class23.field313; var79++) {
                                            int var80 = class9.field144[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field2233.length; var81++) {
                                                if (var11.field2233[var81] == var80) {
                                                    class437 var82 = new class437();
                                                    var82.field6390 = var11;
                                                    var82.field6389 = var11.field2260;
                                                    class416.field6052.method2809(var82, 2);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2243 = class23.field313;
                                }
                                if (class211.field2946 > var11.field2192 && var11.field2196 != null) {
                                    class437 var84 = new class437();
                                    var84.field6390 = var11;
                                    var84.field6389 = var11.field2196;
                                    class416.field6052.method2809(var84, 2);
                                }
                                if (class78.field1138 > var11.field2192 && var11.field2307 != null) {
                                    class437 var85 = new class437();
                                    var85.field6390 = var11;
                                    var85.field6389 = var11.field2307;
                                    class416.field6052.method2809(var85, 2);
                                }
                                if (class422.field6183 > var11.field2192 && var11.field2275 != null) {
                                    class437 var86 = new class437();
                                    var86.field6390 = var11;
                                    var86.field6389 = var11.field2275;
                                    class416.field6052.method2809(var86, 2);
                                }
                                if (class3.field14 > var11.field2192 && var11.field2318 != null) {
                                    class437 var87 = new class437();
                                    var87.field6390 = var11;
                                    var87.field6389 = var11.field2318;
                                    class416.field6052.method2809(var87, 2);
                                }
                                if (class251.field3469 > var11.field2192 && var11.field2296 != null) {
                                    class437 var88 = new class437();
                                    var88.field6390 = var11;
                                    var88.field6389 = var11.field2296;
                                    class416.field6052.method2809(var88, 2);
                                }
                                var11.field2192 = class483.field7062;
                                if (var11.field2176 != null) {
                                    for (int var89 = 0; var89 < class296.field4062; var89++) {
                                        class437 var90 = new class437();
                                        var90.field6390 = var11;
                                        var90.field6398 = class373.field5481[var89].method1149(true);
                                        var90.field6384 = class373.field5481[var89].method1151((byte) -35);
                                        var90.field6389 = var11.field2176;
                                        class416.field6052.method2809(var90, 2);
                                    }
                                }
                                if (class486.field7095 && var11.field2201 != null) {
                                    class437 var91 = new class437();
                                    var91.field6390 = var11;
                                    var91.field6389 = var11.field2201;
                                    class416.field6052.method2809(var91, 2);
                                }
                            }
                            if (var11.field2315 == 5 && var11.field2279 != -1) {
                                var11.method998(class214.field2995, class328.field4481, -105).method1807(class269.field3721, 0, var11.field2322);
                            }
                            class279.method1658((byte) -109, var11);
                            if (var11.field2315 == 0) {
                                method1220(arg0, var11.field2277, var14, var15, var16, var17, var12 - var11.field2181, var13 - var11.field2173, arg8, arg9);
                                if (var11.field2299 != null) {
                                    method1220(var11.field2299, var11.field2277, var14, var15, var16, var17, var12 - var11.field2181, var13 - var11.field2173, arg8, arg9);
                                }
                                class295 var92 = (class295) class212.field2960.method1492((long) var11.field2277, 6340);
                                if (var92 != null) {
                                    if (class323.field4400 == class166.field2502 && var92.field4059 == 0 && !class181.field2659 && var21 && !class214.field2982) {
                                        class142.method960(0);
                                    }
                                    class111.method806(var16, var17, var12, var14, var92.field4055, var15, var13, arg8, 24294, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class279.method1658((byte) -100, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1460)
    public final void init() {
        field2799++;
        if (!this.method857(-18671)) {
            return;
        }
        class89.field1303 = Integer.parseInt(this.getParameter("worldid"));
        class404.field5937 = class65.method564(Integer.parseInt(this.getParameter("modewhere")), (byte) 19);
        if (!class324.method1873(class404.field5937, (byte) 125) && class404.field5937 != class373.field5469) {
            class404.field5937 = class373.field5469;
        }
        class423.field6196 = class343.method2035(-104, Integer.parseInt(this.getParameter("modewhat")));
        if (class423.field6196 != class138.field1976 && class453.field6659 != class423.field6196 && class467.field6839 != class423.field6196) {
            class423.field6196 = class467.field6839;
        }
        try {
            class372.field5455 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class372.field5455 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class438.field6451 = true;
        } else {
            class438.field6451 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class194.field2769 = true;
        } else {
            class194.field2769 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class308.field4197 = true;
        } else {
            class308.field4197 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class323.field4400 = class11.field173;
        } else {
            class323.field4400 = class166.field2502;
        }
        try {
            class461.field6784 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class461.field6784 = 0;
        }
        class374.field5486 = this.getParameter("quiturl");
        class194.field2773 = this.getParameter("settings");
        if (class194.field2773 == null) {
            class194.field2773 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class50.field616 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class50.field616 = 0;
            }
        }
        class414.field6041 = Integer.parseInt(this.getParameter("colourid"));
        if (class414.field6041 < 0 || class414.field6041 >= class341.field4922.length) {
            class414.field6041 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class158.field2403 = true;
            class217.field3019 = true;
        }
        class67.field921 = this;
        if (class323.field4400 == class166.field2502) {
            class512.field7598 = 503;
            class320.field4381 = 765;
        } else if (class323.field4400 == class11.field173) {
            class320.field4381 = 640;
            class512.field7598 = 480;
        }
        this.method844(class423.field6196.method2560(7) + 32, class320.field4381, true, class512.field7598, 591);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1558)
    public final void method859(boolean arg0) {
        method1233(25557);
        field2798++;
        class249.method1497(1);
        class308.method1790((byte) 100);
        class97.method716(6709);
        class466.method2733(true);
        class218.method1355((byte) 96);
        class132.method902(0);
        class435.method2566((byte) 63);
        class325.method1884((byte) 106);
        class6.method35(32437);
        class260.method1566((byte) -123);
        class356.method2134(true);
        class247.method1489((byte) 117);
        class121.method840(-48);
        class96.method707((byte) 14);
        class433.method2559(-20876);
        class357.method2136(-1);
        class66.method566(0);
        class122.method862(false);
        class38.method264((byte) 10);
        class287.method1716(54);
        class371.method2228(-117);
        class138.method932(0);
        class479.method2810(2);
        class206.method1272((byte) 99);
        class483.method2832(544);
        class393.method2369(-118);
        class269.method1606(63);
        class458.method2689((byte) 123);
        class461.method2705((byte) 76);
        class343.method2041(true);
        class211.method1303(false);
        class100.method725((byte) -108);
        class303.method1764(0);
        class226.method1400(!arg0);
        class216.method1337((byte) 59);
        class385.method2277(11922);
        class266.method1594(false);
        class351.method2108(27701);
        class25.method144(-117);
        class402.method2426(-124);
        class366.method2206(15579);
        class519.method3088((byte) -41);
        class389.method2291(67108863);
        class20.method127(417);
        class204.method1268((byte) 118);
        class446.method2647(-31);
        class244.method1476(-57);
        class388.method2286((byte) -50);
        class196.method1217((byte) 8);
        class144.method973(!arg0);
        class261.method1568(-118);
        class115.method821(-113);
        class195.method1214(true);
        class259.method1562(-115);
        class502.method2941((byte) 109);
        class207.method1283((byte) -109);
        class270.method1614((byte) 13);
        class251.method1503(59);
        class333.method1917(-5143);
        class141.method941(arg0);
        class349.method2074((byte) 79);
        class252.method1506(14282);
        class414.method2470((byte) 107);
        class312.method1806((byte) 106);
        class410.method2460((byte) 97);
        class150.method999(2085405040);
        class68.method576(!arg0);
        class438.method2585(false);
        class282.method1677(-106);
        class92.method683(-116);
        class181.method1163(13);
        class391.method2327(false);
        class77.method611(-1299);
        class315.method1836((byte) 87);
        class486.method2858((byte) 0);
        class74.method597((byte) -109);
        class12.method57(2048);
        class440.method2615(0);
        class188.method1178(-1);
        class202.method1260(-20950);
        class22.method135(-1);
        class464.method2727(1);
        class491.method2877(3);
        class254.method1523(82);
        class364.method2197(-26);
        class148.method990(3);
        class306.method1778((byte) 33);
        class73.method595(0);
        class526.method3128(-69);
        class84.method655(false);
        class518.method3086(true);
        class441.method2628((byte) -43);
        class327.method1895((byte) 87);
        class104.method767(1024);
        class431.method2553(arg0);
        class471.method2772((byte) 1);
        class368.method2219((byte) 21);
        class373.method2231((byte) -52);
        class444.method2638(-9116);
        class179.method1154(0);
        class419.method2490(-123);
        class329.method1906((byte) -67);
        class79.method637(12112);
        class508.method3040(110);
        class183.method1166(50);
        class64.method544((byte) 125);
        class439.method2604(22);
        class157.method1043(3);
        class233.method1436((byte) -9);
        class10.method46(-26340);
        class53.method455((byte) 36);
        class490.method2873((byte) -38);
        class523.method3111(-120);
        class153.method1030(-14215);
        class510.method3052((byte) 122);
        class134.method916(26295);
        class240.method1463((byte) 21);
        class271.method1618(!arg0);
        class275.method1630(-18545);
        class447.method2648(8411);
        class230.method1423(105);
        class302.method1763((byte) 83);
        class116.method827(true);
        class291.method1727(126);
        class289.method1721(1736);
        class95.method704((byte) 11);
        class190.method1191();
        class420.method2504((byte) -53);
        class93.method688((byte) 46);
        class217.method1343(-128);
        class200.method1247(0);
        class453.method2668(0);
        class127.method880(-1);
        class429.method2546();
        class350.method2083();
        class339.method2018(true);
        class75.method603();
        class146.method984(true);
        class23.method138(25541);
        class175.method1131(-4122);
        class531.method3138(1559);
        class524.method3115((byte) -108);
        class166.method1101(393216);
        class495.method2896(0);
        class412.method2467(100);
        class177.method1144(57);
        class223.method1388(3);
        class26.method147(-128);
        class107.method787(0);
        class235.method1447(4);
        class120.method837(-22123);
        class256.method1535((byte) 102);
        class512.method3066(127);
        class118.method834((byte) 71);
        class398.method2397(52);
        class297.method1740(-1);
        class517.method3075(65);
        class417.method2483(0);
        class358.method2142((byte) -77);
        class514.method3070(false);
        class55.method467((byte) 91);
        class361.method2171(-10111);
        class30.method176((byte) 109);
        class199.method1242(5);
        class36.method214((byte) -121);
        class280.method1668();
        class305.method1772(true);
        class475.method2790(-1);
        class197.method1239(0);
        class170.method1113(0);
        class86.method665(false);
        class61.method505(arg0);
        class59.method481((byte) 96);
        class229.method1421(false);
        class173.method1123(-5217);
        class14.method63((byte) -123);
        class515.method3074((byte) -118);
        class437.method2571(arg0);
        class242.method1467((byte) 113);
        class501.method2938(5000);
        class310.method1793(0);
        class525.method3120(110);
        class117.method829(105);
        class413.method2468((byte) 11);
        class90.method674(true);
        class147.method989(-18);
        class164.method1092((byte) -123);
        class194.method1208(true);
        class263.method1576(false);
        class416.method2477(124);
        class401.method2419(13);
        class128.method884(-125);
        class268.method1603(-52);
        class278.method1655(32033);
        class335.method1918(-124);
        class186.method1171(-5067);
        class345.method2045(-86);
        class365.method2200(109);
        class94.method696(true);
        class281.method1672(-128);
        class225.method1396(28657);
        class51.method448((byte) -39);
        class520.method3103((byte) 63);
        class136.method922(10115);
        class238.method1457((byte) 49);
        class375.method2240((byte) 24);
        class285.method1695((byte) -22);
        class124.method863((byte) -117);
        class346.method2047(4);
        class135.method919(77);
        class296.method1739(103);
        class125.method866((byte) 87);
        class317.method1851((byte) 122);
        class253.method1519(-19585);
        class267.method1601(-79);
        class167.method1104(0);
        class383.method2272((byte) -123);
        class367.method2212(-117);
        class478.method2804();
        class521.method3108((byte) -103);
        class169.method1111(0);
        class448.method2650(-6);
        class314.method1820((byte) 73);
        class359.method2152(-38);
        class484.method2849(25);
        class279.method1657(-24406);
        class176.method1136((byte) -121);
        class165.method1100(100);
        class294.method1736(0);
        class34.method201();
        class424.method2518(63);
        class156.method1038(true);
        class222.method1381((byte) 124);
        class422.method2515((byte) -32);
        class318.method1856(255);
        class386.method2279(60);
        class377.method2247(arg0);
        class428.method2533(false);
        class418.method2484(-58);
        class60.method491(-35);
        class372.method2229(9553);
        class158.method1050(-94);
        class450.method2658(31546);
        class57.method470((byte) -51);
        class63.method514((byte) -118);
        class470.method2753();
        class299.method1753((byte) -82);
        class382.method2266(50);
        class363.method2196();
        class180.method1158();
        class232.method1432();
        class423.method2517(-89);
        class198.method1240();
        class340.method2019(81);
        class347.method2050(112);
        class21.method134(-27677);
        class474.method2786((byte) 122);
        class213.method1314();
        class436.method2570(7);
        class243.method1470(true);
        class11.method56(255);
        class489.method2863((byte) 111);
        class494.method2891(30537);
        class288.method1718(124);
        class212.method1313(100);
        class52.method453(arg0);
        class472.method2783(64);
        class511.method3054((byte) -75);
        class154.method1034((byte) -49);
        class400.method2417((byte) -85);
        class360.method2161(-3090);
        class403.method2430(-66);
        class67.method575((byte) 89);
        class89.method669(0);
        class228.method1418(-126);
        class5.method30(29823);
        class338.method2000(1);
        class352.method2114((byte) -122);
        class459.method2695(8);
        class58.method480(0);
        class455.method2676((byte) -103);
        class234.method1442(0);
        class19.method122(106);
        class493.method2890(0);
        class276.method1639(1);
        class40.method334(0);
        class264.method1580(39);
        class274.method1627((byte) -75);
        class442.method2633((byte) -124);
        class348.method2059(383495064);
        class39.method330(50);
        class311.method1802();
        class408.method2442(-1);
        class497.method2902((byte) -62);
        class473.method2785((byte) 8);
        class485.method2855(-16450);
        class427.method2529((byte) 65);
        class481.method2825((byte) 64);
        class272.method1625(!arg0);
        class98.method718(0);
        class210.method1296((byte) 99);
        class321.method1862((byte) 122);
        class376.method2244(0);
        class140.method940(-28689);
        class476.method2793((byte) 4);
        class506.method3018((byte) 21);
        class421.method2509((byte) -115);
        class37.method220(!arg0);
        class465.method2730(547404172);
        class76.method608(true);
        class407.method2436(false);
        class111.method804(2);
        class80.method648(true);
        class292.method1731(3353);
        class374.method2236(-1);
        class290.method1725(true);
        class50.method443(-52);
        class378.method2250(-1);
        class9.method40(true);
        class309.method1792(81);
        class62.method508((byte) -37);
        class509.method3051(85);
        class113.method812((byte) -100);
        class110.method801(-4);
        class395.method2386();
        class499.method2929();
        class487.method2860((byte) -78);
        class404.method2433(3);
        class172.method1121(-23608);
        class300.method1758(14);
        class498.method2907(true);
        class322.method1864(-86);
        class33.method197(96);
        class380.method2255(117);
        class362.method2182((byte) -21);
        class126.method871(false);
        class457.method2680(102);
        class88.method667(6409);
        class214.method1326((byte) 125);
        class102.method758(8);
        class320.method1859(-25779);
        class70.method588(5126);
        class257.method1546(16711680);
        class143.method965(1);
        class236.method1454(0);
        class449.method2657((byte) -76);
        class331.method1913(-1);
        class527.method3130(1);
        class445.method2640(-123);
        class227.method1409((byte) 51);
        class409.method2451(false);
        class17.method105(2);
        class324.method1874(4075);
        class209.method1293(-8);
        class307.method1781(1);
        class49.method432((byte) -1);
        class353.method2115(120);
        class239.method1459(0);
        class65.method559((byte) 49);
        class231.method1426(34168);
        class112.method810(-101);
        class432.method2557((byte) 124);
        class27.method155(44);
        class85.method663(true);
        class507.method3023(-28);
        class13.method62(-27252);
        class316.method1849((byte) 99);
        class224.method1394(-111);
        class426.method2525((byte) -53);
        class463.method2722(8261);
        class397.method2390((byte) 12);
        class341.method2028((byte) -107);
        class149.method994((byte) -115);
        class323.method1869(19);
        class78.method629((byte) 34);
        class425.method2523((byte) -126);
        class255.method1529(28166);
        class44.method415(!arg0);
        class451.method2660((byte) -53);
        class434.method2562((byte) 90);
        class258.method1552(false);
        class178.method1148(-31389);
        class528.method3133(-7855);
        class168.method1107(124);
        class265.method1588(-2);
        class82.method651((byte) -117);
        class411.method2462(-95);
        class469.method2745(105);
        class106.method781(-4203);
        class24.method140(21816);
        class354.method2120(125);
        class384.method2273(14);
        class18.method114((byte) -125);
        class467.method2734(-18799);
        class381.method2260(0);
        class328.method1903(false);
        class87.method666((byte) 47);
        class250.method1499(1141967820);
        class405.method2435((byte) 121);
        class480.method2821((byte) -115);
        class129.method889((byte) 112);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1969)
    public static final void method1221() {
        int var0 = class375.field5498;
        int[] var1 = class397.field5793;
        boolean var2 = class20.field269.field7661 == 1 && var0 > 200 || class20.field269.field7661 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class438 var12 = class12.field182[var1[var3]];
            if (var12.method2579((byte) -123)) {
                var12.method610(7);
                if (var12.field1729 >= 0 && var12.field1730 >= 0 && var12.field1736 < class527.field7799 && var12.field1742 < class422.field6182) {
                    var12.field6416 = var12.field1099 ? var2 : false;
                    if (class316.field4324 == var12) {
                        var12.field1042 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1071) {
                            var13++;
                        }
                        if (var12.field1056 > class441.field6516) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method626((byte) 120) << 2);
                        if (var12.field6413) {
                            var14 += 512;
                        } else {
                            if (class343.field4934 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field1042 = var14 + 1;
                    }
                } else {
                    var12.field1042 = -1;
                }
            } else {
                var12.field1042 = -1;
            }
        }
        for (int var4 = 0; var4 < class275.field3772; var4++) {
            class502 var9 = class378.field5533[class65.field899[var4]];
            if (var9.method2942((byte) -123) && var9.field7387.method644((byte) -47, class421.field6166)) {
                var9.method610(7);
                if (var9.field1729 >= 0 && var9.field1730 >= 0 && var9.field1736 < class527.field7799 && var9.field1742 < class422.field6182) {
                    int var10 = 0;
                    if (!var9.field1071) {
                        var10++;
                    }
                    if (var9.field1056 > class441.field6516) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method626((byte) 120) << 2);
                    if (class343.field4934 == 0) {
                        if (var9.field7387.field1203) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class343.field4934 == 1) {
                        if (var9.field7387.field1203) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field7387.field1183) {
                        var11 += 1024;
                    } else if (!var9.field7387.field1199) {
                        var11 += 256;
                    }
                    var9.field1042 = var11 + 1;
                } else {
                    var9.field1042 = -1;
                }
            } else {
                var9.field1042 = -1;
            }
        }
        for (int var5 = 0; var5 < class218.field3046.length; var5++) {
            class371 var6 = class218.field3046[var5];
            if (var6 != null) {
                if (var6.field5433 == 1) {
                    class502 var7 = class378.field5533[var6.field5428];
                    if (var7 != null && var7.field1042 >= 0) {
                        var7.field1042 += 2048;
                    }
                } else if (var6.field5433 == 10) {
                    class438 var8 = class12.field182[var6.field5428];
                    if (var8 != null && class316.field4324 != var8 && var8.field1042 >= 0) {
                        var8.field1042 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lem;)Z", line = 2131)
    public static final boolean method1222(class150 arg0) {
        if (class214.field2982) {
            if (method1228(arg0).field2719 != 0) {
                return false;
            }
            if (arg0.field2315 == 0) {
                return false;
            }
        }
        return arg0.field2268;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V", line = 2144)
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class424.field6204 <= (arg2 - arg1) && class76.field1021 >= arg1 + arg2 && arg3 - arg1 >= class417.field6057 && arg1 + arg3 <= class224.field3193) {
            class194.method1211(arg0, arg2, arg3, (byte) -38, arg1);
        } else {
            class464.method2728(arg0, arg2, 116, arg1, arg3);
        }
        field2804++;
        if (arg4 != 10) {
            field2811 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 2164)
    private final void method1224(byte arg0, int arg1) {
        class366.field5366.field5767++;
        class166.field2504 = 0;
        field2796++;
        if (arg0 >= -49) {
            field2793 = null;
        }
        class183.field2685 = null;
        class164.field2471 = null;
        class366.field5366.field5770 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2179)
    public final void method856(int arg0) {
        field2809++;
        if (class492.field7178 == 1000) {
            return;
        }
        long var2 = class486.method2857(47) / 1000000L - class528.field7804;
        class528.field7804 = class486.method2857(47) / 1000000L;
        boolean var4 = class144.method970(-257);
        if (var4 && class486.field7122 && class118.field1759 != null) {
            class118.field1759.method2613(121);
        }
        if (class492.field7178 == 30 || class492.field7178 == 10) {
            if (class196.field2784 != 0L && class196.field2784 < class246.method1483(5957)) {
                class463.method2721(class20.field269.field7642, class20.field269.field7637, false, class50.method445(arg0 ^ 0xFFFFFFF8), (byte) 113);
            } else if (!class269.field3721.method278() && class223.field3175) {
                class242.method1466(21924);
            }
        }
        if (class147.field2140 == null) {
            Container var5;
            if (class367.field5383 == null) {
                var5 = class202.field2840.field7425;
            } else {
                var5 = class367.field5383;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class367.field5383 == var5) {
                Insets var8 = class367.field5383.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class105.field1586 != var6 || class480.field7020 != var7) {
                if (class269.field3721 == null || class269.field3721.method298()) {
                    class19.method117(true);
                } else {
                    class105.field1586 = var6;
                    class480.field7020 = var7;
                }
                class196.field2784 = class246.method1483(arg0 + 5957) + 500L;
            }
        }
        if (class147.field2140 != null && !class424.field6226 && (class492.field7178 == 30 || class492.field7178 == 10)) {
            class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
        }
        boolean var9 = false;
        if (class292.field4042) {
            class292.field4042 = false;
            var9 = true;
        }
        if (var9) {
            class57.method469((byte) 122);
        }
        if (class269.field3721 != null && class269.field3721.method278() || class50.method445(-8) != 1) {
            class361.method2180(true);
        }
        if (class492.field7178 == 0) {
            class324.method1872(class341.field4922[class414.field6041], class269.field3719[class414.field6041], class339.field4895, class116.field1739[class414.field6041], class57.field674, var9, true);
        } else if (class492.field7178 == 5) {
            class279.method1659(class341.field4922[class414.field6041].getRGB(), arg0 - 124, var9 | class269.field3721.method278(), class135.field1949, class116.field1739[class414.field6041].getRGB(), class269.field3721, class269.field3719[class414.field6041].getRGB());
        } else if (class492.field7178 == 10) {
            class175.method1130((byte) 31);
        } else if (class492.field7178 == 25 || class492.field7178 == 28) {
            if (class30.field401 == 1) {
                if (class464.field6809 < class509.field7554) {
                    class464.field6809 = class509.field7554;
                }
                int var11 = (class464.field6809 - class509.field7554) * 50 / class464.field6809;
                class203.method1262(class297.field4084, true, class156.field2371.method2731(62, class372.field5455) + "<br>(" + var11 + "%)", 2048);
            } else if (class30.field401 == 2) {
                if (class445.field6556 > class219.field3048) {
                    class219.field3048 = class445.field6556;
                }
                int var10 = (class219.field3048 - class445.field6556) * 50 / class219.field3048 + 50;
                class203.method1262(class297.field4084, true, class156.field2371.method2731(arg0 ^ 0x3E, class372.field5455) + "<br>(" + var10 + "%)", 2048);
            } else {
                class203.method1262(class297.field4084, true, class156.field2371.method2731(arg0 ^ 0x3E, class372.field5455), arg0 ^ 0x800);
            }
        } else if (class492.field7178 == 30) {
            class520.method3102(0, var2);
        } else if (class492.field7178 == 40) {
            class203.method1262(class297.field4084, true, class290.field4025.method2731(arg0 + 62, class372.field5455) + "<br>" + class378.field5535.method2731(arg0 + 62, class372.field5455), 2048);
        }
        if (class278.field3812 == 3) {
            for (int var12 = 0; var12 < class9.field146; var12++) {
                Rectangle var13 = class521.field7729[var12];
                if (class25.field330[var12]) {
                    class269.field3721.method325(var13.x, var13.width, -1996553985, 1, var13.y, var13.height);
                } else if (class165.field2477[var12]) {
                    class269.field3721.method325(var13.x, var13.width, -1996554240, 1, var13.y, var13.height);
                }
            }
        }
        if (class129.method890(12600)) {
            class263.method1575(true, class269.field3721);
        }
        if ((class492.field7178 == 30 || class492.field7178 == 10) && class278.field3812 == 0 && class50.method445(-8) == 1 && !var9 && class504.field7428.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class9.field146; var15++) {
                if (class165.field2477[var15]) {
                    class165.field2477[var15] = false;
                    class413.field6028[var14++] = class521.field7729[var15];
                }
            }
            class269.field3721.method228(class413.field6028, var14);
        } else if (class492.field7178 != 0) {
            class269.field3721.method229();
            for (int var16 = 0; var16 < class9.field146; var16++) {
                class165.field2477[var16] = false;
            }
        }
        if (class20.field269.field7635 == arg0) {
            class157.method1046(arg0 - 128, 15L);
        } else if (class20.field269.field7635 == 1) {
            class157.method1046(-128, 10L);
        } else if (class20.field269.field7635 == 2) {
            class157.method1046(-128, 5L);
        } else if (class20.field269.field7635 == 3) {
            class157.method1046(-128, 2L);
        }
        if (class489.field7145) {
            class526.method3126(-11848);
        }
        if (class20.field269.field7633 && class492.field7178 == 10 && class188.field2723 != -1) {
            class20.field269.field7633 = false;
            class20.field269.method1715((byte) 57, class202.field2840);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 2415)
    public final String method858(boolean arg0) {
        field2803++;
        String var2 = null;
        try {
            var2 = "[1)" + class510.field7566 + "," + class14.field204 + "," + class527.field7799 + "," + class422.field6182 + "|";
            if (class316.field4324 != null) {
                var2 = var2 + "2)" + class436.field6379 + "," + (class316.field4324.field1127[0] + class510.field7566) + "," + (class316.field4324.field1117[0] + class14.field204) + "|";
            }
            var2 = var2 + "3)" + class152.field2332 + "|4)" + class20.field269.field7670 + "|5)" + class50.method445(-8) + "|6)" + class117.field1754 + "," + class27.field359 + "|";
            var2 = var2 + "7)" + class20.field269.method3084((byte) -126, class152.field2332) + "|";
            var2 = var2 + "8)" + class20.field269.method3085(class152.field2332, (byte) 119) + "|";
            var2 = var2 + "9)" + class20.field269.field7636 + "|";
            var2 = var2 + "10)" + class20.field269.field7632 + "|";
            var2 = var2 + "11)" + class20.field269.field7656 + "|";
            var2 = var2 + "12)" + class20.field269.method1712(class152.field2332, arg0) + "|";
            var2 = var2 + "13)" + class261.field3627 + "]";
        } catch (Throwable var3) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2440)
    public final void method848(int arg0) {
        if (arg0 != 7) {
            field2811 = null;
        }
        field2808++;
        if (class489.field7143) {
            class207.method1285((byte) -81);
        }
        if (class269.field3721 != null) {
            class269.field3721.method267(-48);
        }
        if (class147.field2140 != null) {
            class218.method1353(class147.field2140, class202.field2840, (byte) -61);
            class147.field2140 = null;
        }
        if (class33.field438 != null) {
            class33.field438.method2839(-20828);
            class33.field438 = null;
        }
        if (class420.field6136 != null) {
            class420.field6136.method1273(class426.field6248, 120);
        }
        class420.field6136 = null;
        class377.method2246(true);
        class366.field5366.method2382((byte) -79);
        class413.field6029.method1609(27);
        if (class239.field3360 != null) {
            class239.field3360.method1500(15110);
            class239.field3360 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2483)
    public static final void method1225() {
        class367.field5390 = 0;
        for (int var0 = 0; var0 < class275.field3772; var0++) {
            class502 var1 = class378.field5533[class65.field899[var0]];
            if (var1.field1071 && var1.method623((byte) 107) != -1) {
                int var2 = (var1.method626((byte) 120) - 1) * 64 + 60;
                int var3 = var1.field1732 - var2 >> 7;
                int var4 = var1.field1735 - var2 >> 7;
                class77 var5 = class414.method2471(-4533, var4, var3, var1.field1738);
                if (var5 != null) {
                    int var6 = var5.field1035;
                    if (var5 instanceof class502) {
                        var6 += 2048;
                    }
                    if (var5.field1053 == 0 && var5.method623((byte) 109) != -1) {
                        class52.field634[class367.field5390] = var6;
                        class309.field4208[class367.field5390] = var6;
                        class367.field5390++;
                        var5.field1053++;
                    }
                    class52.field634[class367.field5390] = var6;
                    class309.field4208[class367.field5390] = var1.field1035 + 2048;
                    class367.field5390++;
                    var5.field1053++;
                }
            }
        }
        class127.method882(class367.field5390 - 1, 0, class52.field634, class309.field4208, true);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2534)
    private final void method1226(int arg0) {
        if (arg0 >= -98) {
            return;
        }
        field2794++;
        boolean var2 = class366.field5366.method2373(false);
        if (!var2) {
            this.method1227(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2550)
    public final void method843(int arg0) {
        field2800++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class19.method117(true);
        class413.field6029 = new class269(class202.field2840);
        class366.field5366 = new class393();
        if (class404.field5937 != class373.field5469) {
            class361.field5268 = new byte[50][];
        }
        class20.field269 = new class287(class202.field2840);
        if (class404.field5937 == class373.field5469) {
            class267.field3697 = this.getCodeBase().getHost();
            class241.field3373 = 43594;
            class220.field3117 = 443;
        } else if (class324.method1873(class404.field5937, (byte) 104)) {
            class267.field3697 = this.getCodeBase().getHost();
            class220.field3117 = class89.field1303 + 50000;
            class241.field3373 = class89.field1303 + 40000;
        } else if (class404.field5937 == class181.field2670) {
            class241.field3373 = class89.field1303 + 40000;
            class220.field3117 = class89.field1303 + 50000;
            class267.field3697 = "127.0.0.1";
        }
        class494.field7216 = class267.field3697;
        class223.field3177 = class220.field3117;
        class27.field353 = class241.field3373;
        class140.field1991 = class241.field3373;
        class435.field6377 = class59.field716 = class249.field3443 = class373.field5479 = new short[256];
        class314.field4277 = class140.field1991;
        if (class323.field4400 == class11.field173) {
            class305.field4168 = 16777215;
            class282.field3865 = class481.field7030;
            class484.field7078 = class489.field7136;
            class481.field7023 = true;
            class442.field6546 = 0;
            class21.field288 = class186.field2703;
            class289.field4010 = class508.field7545;
        } else {
            class289.field4010 = class238.field3351;
            class484.field7078 = class104.field1552;
            class282.field3865 = class271.field3735;
            class21.field288 = class385.field5604;
        }
        if (class504.field7417 == 3) {
            class316.field4329 = class89.field1303;
        }
        class310.field4231 = class63.method515(class426.field6248, 26564);
        class518.field7668 = class327.method1894(class426.field6248, (byte) -51, true);
        if (arg0 != 26) {
            method1230(37);
        }
        class420.field6136 = class310.method1799((byte) 61);
        if (class420.field6136 != null) {
            class420.field6136.method1271(-14358, class426.field6248);
        }
        class124.field1845 = class504.field7417;
        try {
            if (class202.field2840.field7410 != null) {
                class166.field2505 = new class461(class202.field2840.field7410, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class117.field1744[var3] = new class461(class202.field2840.field7429[var3], 6000, 0);
                }
                class55.field661 = new class461(class202.field2840.field7414, 6000, 0);
                class111.field1675 = new class343(255, class166.field2505, class55.field661, 500000);
                class82.field1237 = new class461(class202.field2840.field7421, 24, 0);
                class202.field2840.field7414 = null;
                class202.field2840.field7410 = null;
                class202.field2840.field7421 = null;
                class202.field2840.field7429 = null;
            }
        } catch (IOException var4) {
            class55.field661 = null;
            class82.field1237 = null;
            class166.field2505 = null;
            class111.field1675 = null;
        }
        if (class404.field5937 != class373.field5469) {
            class225.field3200 = true;
        }
        class349.field5099 = (class323.field4400 == class166.field2502 ? class107.field1605 : class234.field3321).method2731(62, class372.field5455);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 2667)
    private final void method1227(boolean arg0) {
        field2801++;
        if (class366.field5366.field5767 > class397.field5796) {
            class214.field2996 = (class366.field5366.field5767 * 50 - 50) * 5;
            if (class314.field4277 == class27.field353) {
                class314.field4277 = class223.field3177;
            } else {
                class314.field4277 = class27.field353;
            }
            if (class214.field2996 > 3000) {
                class214.field2996 = 3000;
            }
            if (class366.field5366.field5767 >= 2 && class366.field5366.field5770 == 6) {
                this.method850(1000, "js5connect_outofdate");
                class492.field7178 = 1000;
                return;
            }
            if (class366.field5366.field5767 >= 4 && class366.field5366.field5770 == -1) {
                this.method850(1000, "js5crc");
                class492.field7178 = 1000;
                return;
            }
            if (class366.field5366.field5767 >= 4 && (class492.field7178 == 0 || class492.field7178 == 5)) {
                if (class366.field5366.field5770 == 7 || class366.field5366.field5770 == 9) {
                    this.method850(1000, "js5connect_full");
                } else if (class366.field5366.field5770 > 0) {
                    this.method850(1000, "js5connect");
                } else {
                    this.method850(1000, "js5io");
                }
                class492.field7178 = 1000;
                return;
            }
        }
        if (arg0) {
            this.init();
        }
        class397.field5796 = class366.field5366.field5767;
        if (class214.field2996 > 0) {
            class214.field2996--;
            return;
        }
        try {
            if (class166.field2504 == 0) {
                class183.field2685 = class202.field2840.method2952(class314.field4277, false, class494.field7216);
                class166.field2504++;
            }
            if (class166.field2504 == 1) {
                if (class183.field2685.field667 == 2) {
                    this.method1224((byte) -111, 1000);
                    return;
                }
                if (class183.field2685.field667 == 1) {
                    class166.field2504++;
                }
            }
            if (class166.field2504 == 2) {
                class164.field2471 = new class483((Socket) class183.field2685.field670, class202.field2840);
                class391 var2 = new class391(5);
                var2.method2302(-4, class141.field2017.field311);
                var2.method2359(591, -110);
                class164.field2471.method2835((byte) 98, 5, var2.field5678, 0);
                class166.field2504++;
                class128.field1905 = class246.method1483(5957);
            }
            if (class166.field2504 == 3) {
                if (class492.field7178 == 0 || class492.field7178 == 5 || class164.field2471.method2842(0) > 0) {
                    int var3 = class164.field2471.method2844(73);
                    if (var3 != 0) {
                        this.method1224((byte) -84, var3);
                        return;
                    }
                    class166.field2504++;
                } else if ((class246.method1483(5957) - class128.field1905) > 30000L) {
                    this.method1224((byte) -96, 1001);
                    return;
                }
            }
            if (class166.field2504 == 4) {
                boolean var4 = class492.field7178 == 5 || class492.field7178 == 10 || class492.field7178 == 28;
                class366.field5366.method2380(-117, class164.field2471, !var4);
                class164.field2471 = null;
                class183.field2685 = null;
                class166.field2504 = 0;
            }
        } catch (IOException var5) {
            this.method1224((byte) -87, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lem;)Luu;", line = 2813)
    public static final class188 method1228(class150 arg0) {
        class188 var1 = (class188) class359.field5235.method1492(((long) arg0.field2277 << 32) + (long) arg0.field2248, 6340);
        return var1 == null ? arg0.field2218 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2820)
    public static final void method1229() {
        for (int var0 = 0; var0 < class527.field7799; var0++) {
            int[] var1 = class300.field4132[var0];
            for (int var2 = 0; var2 < class422.field6182; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2840)
    public static final void method1230(int arg0) {
        int var1 = class375.field5498;
        int[] var2 = class397.field5793;
        int var3 = class64.field869 ? var1 : class275.field3772 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class77 var5;
            if (var4 < var1) {
                var5 = class12.field182[var2[var4]];
            } else {
                var5 = class378.field5533[class65.field899[var4 - var1]];
            }
            if (var5.field1738 == arg0) {
                var5.field1053 = 0;
                if (var5.field1042 < 0) {
                    var5.field1071 = false;
                } else {
                    int var6 = var5.method626((byte) 120);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1732 & 0x7F) != 0 || (var5.field1735 & 0x7F) != 0) {
                            var5.field1071 = false;
                            continue;
                        }
                    } else if ((var5.field1732 & 0x7F) != 64 || (var5.field1735 & 0x7F) != 64) {
                        var5.field1071 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1732 >> 7;
                        int var8 = var5.field1735 >> 7;
                        if (class300.field4132[var7][var8] != var5.field1042) {
                            var5.field1071 = true;
                            continue;
                        }
                        if (class351.field5160[var7][var8] > 1) {
                            var10002 = class351.field5160[var7][var8]--;
                            var5.field1071 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1732 - var9 >> 7;
                        int var11 = var5.field1735 - var9 >> 7;
                        int var12 = var5.field1732 + var9 >> 7;
                        int var13 = var5.field1735 + var9 >> 7;
                        if (!class357.method2138(14869, var5.field1042, var11, var12, var10, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class300.field4132[var14][var15] == var5.field1042) {
                                        var10002 = class351.field5160[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1071 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class438 && var5.field1125 != null && class441.field6516 >= var5.field1125.field6140 && class441.field6516 < var5.field1125.field6143) {
                        ((class438) var5).field6416 = false;
                    }
                    var5.field1071 = false;
                    var5.field1734 = class242.method1465(121, var5.field1738, var5.field1735, var5.field1732);
                    class51.method449(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2958)
    public static final void main(String[] arg0) {
        field2795++;
        try {
            if (arg0.length != 4) {
                class6.method38((byte) 84, "argument count");
            }
            class89.field1303 = Integer.parseInt(arg0[0]);
            class404.field5937 = class181.field2670;
            if (arg0[1].equals("live")) {
                class423.field6196 = class467.field6839;
            } else if (arg0[1].equals("rc")) {
                class423.field6196 = class453.field6659;
            } else if (arg0[1].equals("wip")) {
                class423.field6196 = class138.field1976;
            } else {
                class6.method38((byte) 121, "modewhat");
            }
            class372.field5455 = class508.method3029(arg0[2], (byte) -127);
            if (class372.field5455 == -1) {
                if (arg0[2].equals("english")) {
                    class372.field5455 = 0;
                } else if (arg0[2].equals("german")) {
                    class372.field5455 = 1;
                } else {
                    class6.method38((byte) 79, "language");
                }
            }
            class194.field2769 = false;
            class438.field6451 = false;
            if (arg0[3].equals("game0")) {
                class323.field4400 = class166.field2502;
            } else if (arg0[3].equals("game1")) {
                class323.field4400 = class11.field173;
            } else {
                class6.method38((byte) 34, "game");
            }
            class158.field2403 = true;
            class217.field3019 = true;
            class194.field2773 = "";
            class50.field616 = 0;
            class414.field6041 = class323.field4400.field907;
            class461.field6784 = 0;
            client var1 = new client();
            class67.field921 = var1;
            var1.method854(false, class323.field4400.field904, class423.field6196.method2560(7) + 32, 1024, 30, 768, -122, 591);
            class367.field5383.setLocation(40, 40);
        } catch (Exception var3) {
            class320.method1861(var3, (byte) -91, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 3025)
    public static final void method1231(int arg0) {
        int var1 = class375.field5498;
        int[] var2 = class397.field5793;
        for (int var3 = 0; var3 < class275.field3772 + var1; var3++) {
            class77 var4;
            if (var3 < var1) {
                var4 = class12.field182[var2[var3]];
            } else {
                var4 = class378.field5533[class65.field899[var3 - var1]];
            }
            if (var4.field1738 == arg0 && var4.field1042 >= 0) {
                int var5 = var4.method626((byte) 120);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1732 & 0x7F) != 0 || (var4.field1735 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1732 & 0x7F) != 64 || (var4.field1735 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1732 >> 7;
                    int var7 = var4.field1735 >> 7;
                    if (var4.field1042 > class300.field4132[var6][var7]) {
                        class300.field4132[var6][var7] = var4.field1042;
                        class351.field5160[var6][var7] = 1;
                    } else if (class300.field4132[var6][var7] == var4.field1042) {
                        var10002 = class351.field5160[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1732 - var8 >> 7;
                    int var10 = var4.field1735 - var8 >> 7;
                    int var11 = var4.field1732 + var8 >> 7;
                    int var12 = var4.field1735 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1042 > class300.field4132[var13][var14]) {
                                class300.field4132[var13][var14] = var4.field1042;
                                class351.field5160[var13][var14] = 1;
                            } else if (class300.field4132[var13][var14] == var4.field1042) {
                                var10002 = class351.field5160[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lem;)Lem;", line = 3126)
    public static final class150 method1232(class150 arg0) {
        int var1 = method1228(arg0).method1180((byte) 70);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class60.method497(arg0.field2259, (byte) -122);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3145)
    public static void method1233(int arg0) {
        field2802 = null;
        field2811 = null;
        field2810 = null;
        field2793 = null;
        if (arg0 != 25557) {
            field2793 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3161)
    private final void method1234(int arg0) {
        field2791++;
        class193.field2758++;
        class322.method1866(-1, null, -5386, -1);
        class493.method2886(-1, null, -1, false);
        class457.method2679(0);
        class483.field7062++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class502 var12 = class378.field5533[var2];
            if (var12 != null) {
                byte var13 = var12.field7387.field1205;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method626((byte) 120);
                    if ((var13 & 0x2) != 0 && var12.field1123 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1127[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class527.field7799 - var14 - 1) {
                                var17 = class527.field7799 - (var14 + 1);
                            }
                            int var18 = var12.field1117[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class422.field6182 - var14 - 1) {
                                var18 = class422.field6182 - var14 - 1;
                            }
                            int var19 = class74.method598(true, class244.field3415, -33, var14, class82.field1229[var12.field1738], var14, 0, var12.field1127[0], 0, var18, var14, -1, var17, class502.field7386, var12.field1117[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1127[var20] = class502.field7386[var19 - var20 - 1];
                                    var12.field1117[var20] = class244.field3415[var19 - var20 - 1];
                                    var12.field1121[var20] = 1;
                                }
                                var12.field1123 = var19;
                            }
                        }
                    }
                    class354.method2118(var12, (byte) 32, true);
                    int var21 = class77.method627(var12, 88);
                    class27.method154(var21, -8898, var12, class455.field6698, class343.field4947);
                    class240.method1460(0, var12);
                }
            }
        }
        if (class459.field6727 == 0 && class66.field906 == 0) {
            if (class491.field7168 == 2) {
                class37.method219((byte) 119);
            } else {
                class341.method2027(-31193);
            }
            if ((class329.field4493 >> 7) < 14 || (class527.field7799 - 14) <= (class329.field4493 >> 7) || (class373.field5478 >> 7) < 14 || class373.field5478 >> 7 >= class422.field6182 - 14) {
                class175.method1129(true);
            }
        }
        while (true) {
            class437 var3;
            class150 var4;
            class150 var5;
            do {
                var3 = (class437) class86.field1268.method2816(true);
                if (var3 == null) {
                    if (arg0 != 13693) {
                        return;
                    }
                    while (true) {
                        class437 var6;
                        class150 var7;
                        class150 var8;
                        do {
                            var6 = (class437) class276.field3783.method2816(true);
                            if (var6 == null) {
                                while (true) {
                                    class437 var9;
                                    class150 var10;
                                    class150 var11;
                                    do {
                                        var9 = (class437) class416.field6052.method2816(true);
                                        if (var9 == null) {
                                            if (class110.field1664 != null) {
                                                class266.method1593(-114);
                                            }
                                            if (class441.field6516 % 1500 == 0) {
                                                class368.method2218(-121);
                                            }
                                            class252.method1513(-121);
                                            if (class489.field7143 && class522.field7735 < (class246.method1483(5957) - 60000L)) {
                                                class207.method1285((byte) -81);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field6390;
                                        if (var10.field2248 < 0) {
                                            break;
                                        }
                                        var11 = class60.method497(var10.field2259, (byte) -122);
                                    } while (var11 == null || var11.field2299 == null || var11.field2299.length <= var10.field2248 || var11.field2299[var10.field2248] != var10);
                                    class429.method2537(var9);
                                }
                            }
                            var7 = var6.field6390;
                            if (var7.field2248 < 0) {
                                break;
                            }
                            var8 = class60.method497(var7.field2259, (byte) -119);
                        } while (var8 == null || var8.field2299 == null || var8.field2299.length <= var7.field2248 || var8.field2299[var7.field2248] != var7);
                        class429.method2537(var6);
                    }
                }
                var4 = var3.field6390;
                if (var4.field2248 < 0) {
                    break;
                }
                var5 = class60.method497(var4.field2259, (byte) -117);
            } while (var5 == null || var5.field2299 == null || var4.field2248 >= var5.field2299.length || var5.field2299[var4.field2248] != var4);
            class429.method2537(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 3365)
    public final void method846(int arg0) {
        field2805++;
        if (class492.field7178 == 1000) {
            return;
        }
        class441.field6516++;
        if ((class441.field6516 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class483.field7064 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class448.field6584.setSeed((long) class483.field7064);
        }
        if ((class441.field6516 % 50) == 0) {
            class110.field1651 = class353.field5180;
            class353.field5180 = 0;
            class454.field6666 = class397.field5794;
            class397.field5794 = 0;
        }
        this.method1226(arg0 ^ 0xFFFFEB6C);
        if (class307.field4188 != null) {
            class307.field4188.method2687(0);
        }
        class108.method790(true);
        class310.field4231.method903(0);
        class518.field7668.method1818(14494);
        if (class420.field6136 != null) {
            int var3 = class420.field6136.method1275(120);
            class244.field3409 = var3;
        }
        if (class269.field3721 != null) {
            class269.field3721.method281((int) class246.method1483(5957));
        }
        class342.method2031(-2);
        class296.field4062 = 0;
        for (class178 var4 = class310.field4231.method905(1); var4 != null && class296.field4062 < 128; var4 = class310.field4231.method905(arg0 ^ 0x14F8)) {
            if (var4.method1147((byte) 116) != 1) {
                char var5 = var4.method1151((byte) -101);
                if (!class283.method1685(-11182) || !(var5 == '`' || var5 == '§')) {
                    class373.field5481[class296.field4062] = var4;
                    class296.field4062++;
                } else if (class129.method890(arg0 ^ 0x25C1)) {
                    class328.method1904(0);
                } else {
                    class217.method1349(14246);
                }
            }
        }
        for (class528 var6 = class518.field7668.method1823(16384); var6 != null; var6 = class518.field7668.method1823(16384)) {
            int var7 = var6.method2741(76);
            if (var7 == -1) {
                class376.field5508.method2809(var6, 2);
            } else if (class317.method1852(var7, (byte) 125)) {
                class391.field5737.method2809(var6, arg0 ^ 0x14FB);
            }
            if (class391.field5737.method2806((byte) -93) > 10) {
                class391.field5737.method2816(true);
            }
        }
        if (class129.method890(12600)) {
            class254.method1525((byte) 90);
        }
        if (class492.field7178 == 0) {
            this.method1219(true);
            class409.method2445(-33);
        } else if (class492.field7178 == 5) {
            this.method1219(true);
            class409.method2445(arg0 - 5402);
        } else if (class492.field7178 == 25 || class492.field7178 == 28) {
            class18.method115(arg0 ^ 0xFFFFBFFD);
        }
        if (class492.field7178 == 10) {
            this.method1234(13693);
            class64.method520(false);
            class292.method1733(1);
            class111.method809(arg0 - 5369);
        } else if (class492.field7178 == 30) {
            class219.method1359(63);
        } else if (class492.field7178 == 40) {
            class111.method809(arg0 - 5369);
            if (class154.field2357 != -3 && class154.field2357 != 2 && class154.field2357 != 15) {
                class285.method1701(arg0 - 30196);
            }
        }
        class411.method2465(class269.field3721, -108);
        if (arg0 != 5369) {
            field2810 = null;
        }
        class391.field5737.method2816(true);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "([BI)V", line = 3513)
    private final void method1235(byte[] arg0, int arg1) {
        field2806++;
        class391 var3 = new class391(arg0);
        int var4 = 82 % ((arg1 + 4) / 63);
        while (true) {
            int var5;
            label45: do {
                while (true) {
                    while (true) {
                        var5 = var3.method2348(-2);
                        if (var5 == 0) {
                            return;
                        }
                        if (var5 == 1) {
                            int[] var10 = class58.field699 = new int[6];
                            var10[0] = var3.method2353((byte) 99);
                            var10[1] = var3.method2353((byte) 99);
                            var10[2] = var3.method2353((byte) 71);
                            var10[3] = var3.method2353((byte) 66);
                            var10[4] = var3.method2353((byte) 98);
                            var10[5] = var3.method2353((byte) 109);
                        } else {
                            if (var5 != 4) {
                                continue label45;
                            }
                            int var8 = var3.method2348(-2);
                            class409.field5984 = new int[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                class409.field5984[var9] = var3.method2353((byte) 112);
                                if (class409.field5984[var9] == 65535) {
                                    class409.field5984[var9] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var5 != 5);
            int var6 = var3.method2348(-2);
            class68.field930 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                class68.field930[var7] = var3.method2353((byte) 98);
                if (class68.field930[var7] == 65535) {
                    class68.field930[var7] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILsk;II)V", line = 3588)
    public static final void method1236(int arg0, class438 arg1, int arg2, int arg3) {
        if (arg1.field1064 == arg3 && arg3 != -1) {
            class104 var4 = class222.field3168.method126(-117, arg3);
            int var5 = var4.field1566;
            if (var5 == 1) {
                arg1.field1048 = 0;
                arg1.field1084 = 0;
                arg1.field1037 = arg2;
                arg1.field1089 = 0;
                arg1.field1072 = 1;
                class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var4, arg1.field1048, arg0 + 93);
            }
            if (var5 == 2) {
                arg1.field1089 = 0;
            }
        } else if (arg3 == -1 || arg1.field1064 == -1 || class222.field3168.method126(-82, arg3).field1570 >= class222.field3168.method126(-125, arg1.field1064).field1570) {
            arg1.field1048 = 0;
            arg1.field1119 = arg1.field1123;
            arg1.field1089 = 0;
            arg1.field1064 = arg3;
            arg1.field1072 = 1;
            arg1.field1084 = 0;
            arg1.field1037 = arg2;
            if (arg1.field1064 != -1) {
                class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, class222.field3168.method126(arg0 ^ 0x35, arg1.field1064), arg1.field1048, 96);
            }
        }
        if (arg0 == -11) {
            field2807++;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3639)
    public static final void method1237() {
        int var0 = class375.field5498;
        int[] var1 = class397.field5793;
        int var2 = class64.field869 ? var0 : class275.field3772 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class77 var4;
            if (var3 < var0) {
                var4 = class12.field182[var1[var3]];
            } else {
                var4 = class378.field5533[class65.field899[var3 - var0]];
            }
            if (var4.field1042 >= 0) {
                int var5 = var4.method626((byte) 120);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1732 & 0x7F) == 0 && (var4.field1735 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1732 & 0x7F) == 64 && (var4.field1735 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class438 && var4.field1125 != null && class441.field6516 >= var4.field1125.field6140 && class441.field6516 < var4.field1125.field6143) {
                    ((class438) var4).field6416 = false;
                }
                var4.field1734 = class242.method1465(127, var4.field1738, var4.field1735, var4.field1732);
                class51.method449(var4, true);
            }
        }
    }
}

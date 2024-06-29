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
public class client extends class133 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lfh;")
    public static class170 field6676 = null;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field6666 = 127;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field6663 = 0;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Liq;")
    public static class134 field6680;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[[[I")
    public static int[][][] field6665;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method2782(byte arg0) {
        field6670++;
        if (!class121.field1597) {
            for (int var2 = 0; var2 < class296.field4495; var2++) {
                if (class43.field542[var2].method1070((byte) -100) == 's' || class43.field542[var2].method1070((byte) -100) == 'S') {
                    class121.field1597 = true;
                    break;
                }
            }
        }
        if (class425.field6245 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class445.method2750(-27580);
            if (class320.field4842 == 0L) {
                class320.field4842 = var5;
            }
            if (var4 > 16384 && var5 - class320.field4842 < 5000L) {
                if ((var5 - class372.field5428) > 1000L) {
                    System.gc();
                    class372.field5428 = var5;
                }
                class303.field4586 = class312.field4704.method937((byte) -73, class27.field356);
                class71.field934 = 5;
            } else {
                class303.field4586 = class257.field3946.method937((byte) 122, class27.field356);
                class425.field6245 = 10;
                class71.field934 = 5;
            }
        } else if (class425.field6245 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class449.field6599[var7] = class375.method2262((byte) -33, class198.field3004, class115.field1522);
            }
            class303.field4586 = class133.field1695.method937((byte) -84, class27.field356);
            class425.field6245 = 20;
            class71.field934 = 10;
        } else if (arg0 > 56) {
            if (class425.field6245 == 20) {
                if (class132.field1690 == null) {
                    class132.field1690 = new class286(class8.field92, class196.field2963);
                }
                if (class132.field1690.method1772(true)) {
                    class447.field6591 = class299.method1852(true, 0, false, false, 1);
                    class355.field5241 = class299.method1852(true, 1, false, false, 1);
                    class296.field4494 = class299.method1852(true, 2, false, false, 1);
                    class316.field4786 = class299.method1852(true, 3, false, false, 1);
                    class435.field6408 = class299.method1852(true, 4, false, false, 1);
                    class265.field4048 = class299.method1852(true, 5, true, false, 1);
                    class298.field4505 = class299.method1852(false, 6, true, false, 1);
                    class320.field4840 = class299.method1852(true, 7, false, false, 1);
                    class427.field6274 = class299.method1852(true, 8, false, false, 1);
                    class357.field5265 = class299.method1852(true, 9, false, false, 1);
                    class13.field169 = class299.method1852(true, 10, false, false, 1);
                    class95.field1330 = class299.method1852(true, 11, false, false, 1);
                    class241.field3627 = class299.method1852(true, 12, false, false, 1);
                    class430.field6321 = class299.method1852(true, 13, false, false, 1);
                    class339.field5051 = class299.method1852(false, 14, false, false, 1);
                    class163.field2258 = class299.method1852(true, 15, false, false, 1);
                    class261.field3978 = class299.method1852(true, 16, false, false, 1);
                    class296.field4496 = class299.method1852(true, 17, false, false, 1);
                    class253.field3862 = class299.method1852(true, 18, false, false, 1);
                    class81.field1079 = class299.method1852(true, 19, false, false, 1);
                    class458.field6792 = class299.method1852(true, 20, false, false, 1);
                    class133.field1727 = class299.method1852(true, 21, false, false, 1);
                    class183.field2741 = class299.method1852(true, 22, false, false, 1);
                    class135.field1786 = class299.method1852(true, 23, true, false, 1);
                    class387.field5724 = class299.method1852(true, 24, false, false, 1);
                    class451.field6658 = class299.method1852(true, 25, false, false, 1);
                    class324.field4876 = class299.method1852(true, 26, true, false, 1);
                    class362.field5335 = class299.method1852(true, 27, false, false, 1);
                    class302.field4572 = class299.method1852(true, 28, true, false, 1);
                    class303.field4586 = class112.field1463.method937((byte) 97, class27.field356);
                    class71.field934 = 15;
                    class425.field6245 = 30;
                } else {
                    class303.field4586 = class238.field3565.method937((byte) 118, class27.field356);
                    class71.field934 = 12;
                }
            } else if (class425.field6245 == 30) {
                int var8 = 0;
                for (int var9 = 0; var9 < 29; var9++) {
                    var8 += class151.field2087[var9].method2820((byte) -79) * class210.field3137[var9] / 100;
                }
                if (var8 == 100) {
                    class303.field4586 = class418.field6198.method937((byte) 124, class27.field356);
                    class71.field934 = 20;
                    class253.method1559(127, class427.field6274);
                    class380.method2288(-48, class427.field6274);
                    class425.field6245 = 40;
                } else {
                    if (var8 != 0) {
                        class303.field4586 = class410.field6110.method937((byte) 124, class27.field356) + var8 + "%";
                    }
                    class71.field934 = 20;
                }
            } else if (class425.field6245 == 40) {
                if (class302.field4572.method828(true)) {
                    this.method2788(-115, class302.field4572.method825(1, 0));
                    class303.field4586 = class354.field5233.method937((byte) 107, class27.field356);
                    class425.field6245 = 50;
                    class71.field934 = 25;
                } else {
                    class303.field4586 = class136.field1830.method937((byte) 106, class27.field356) + class302.field4572.method814(0) + "%";
                    class71.field934 = 25;
                }
            } else if (class425.field6245 == 50) {
                class176.method1078(2, false, 22050, class1.field12);
                class324.field4874 = new class255();
                class324.field4874.method1565(128, (byte) -104, 9);
                class245.field3670 = class236.method1423((byte) -118, 0, class170.field2631, class79.field1043, 22050);
                class245.field3670.method240(class324.field4874, (byte) 3);
                class77.method498(0, class339.field5051, class435.field6408, class163.field2258, class324.field4874);
                class236.field3536 = class236.method1423((byte) -111, 1, class170.field2631, class79.field1043, 2048);
                class267.field4077 = new class356();
                class236.field3536.method240(class267.field4077, (byte) 3);
                class165.field2298 = new class405(22050, class81.field1082);
                class244.field3653 = class298.field4505.method836(-1, "scape main");
                class303.field4586 = class381.field5559.method937((byte) 113, class27.field356);
                class425.field6245 = 60;
                class71.field934 = 30;
            } else if (class425.field6245 == 60) {
                int var10 = class13.method78(class427.field6274, class430.field6321, (byte) -128);
                int var11 = class378.method2276((byte) 2);
                if (var10 < var11) {
                    class303.field4586 = class429.field6310.method937((byte) -72, class27.field356) + var10 * 100 / var11 + "%";
                    class71.field934 = 35;
                } else {
                    class303.field4586 = class277.field4215.method937((byte) -90, class27.field356);
                    class425.field6245 = 70;
                    class71.field934 = 35;
                }
            } else if (class425.field6245 == 70) {
                int var12 = class465.method2863(0, class427.field6274);
                int var13 = class171.method1056(-15481);
                if (var12 < var13) {
                    class303.field4586 = class106.field1420.method937((byte) -107, class27.field356) + var12 * 100 / var13 + "%";
                    class71.field934 = 40;
                } else {
                    class303.field4586 = class462.field6809.method937((byte) 98, class27.field356);
                    class425.field6245 = 80;
                    class71.field934 = 40;
                }
            } else if (class425.field6245 == 80) {
                if (class324.field4876.method828(true)) {
                    class362.field5334 = new class31(class324.field4876, class357.field5265, class427.field6274);
                    class303.field4586 = class443.field6537.method937((byte) 124, class27.field356);
                    class425.field6245 = 90;
                    class71.field934 = 45;
                } else {
                    class303.field4586 = class364.field5359.method937((byte) 111, class27.field356) + class324.field4876.method814(0) + "%";
                    class71.field934 = 45;
                }
            } else if (class425.field6245 == 90) {
                class303.field4586 = class345.field5152.method937((byte) -89, class27.field356);
                class425.field6245 = 95;
                class71.field934 = 50;
            } else if (class425.field6245 == 95) {
                if (class121.field1597) {
                    class14.field176 = 0;
                    class376.field5479 = 1;
                    class95.field1324 = 0;
                    class109.field1445 = 0;
                    class287.field4376 = 0;
                }
                class121.field1597 = true;
                class36.method206(-18199, class79.field1043);
                class227.method1377(false, 58, class14.field176);
                class303.field4586 = class95.field1329.method937((byte) 108, class27.field356);
                class71.field934 = 55;
                class425.field6245 = 100;
            } else if (class425.field6245 == 100) {
                class245.method1502(class430.field6321, (byte) -107, class427.field6274, class196.field2965);
                class303.field4586 = class363.field5336.method937((byte) -44, class27.field356);
                class71.field934 = 60;
                class316.method1929(false, 5);
                class425.field6245 = 110;
            } else if (class425.field6245 == 110) {
                class296.field4494.method828(true);
                byte var14 = 0;
                int var15 = var14 + class296.field4494.method814(0);
                class261.field3978.method828(true);
                int var16 = var15 + class261.field3978.method814(0);
                class296.field4496.method828(true);
                int var17 = var16 + class296.field4496.method814(0);
                class253.field3862.method828(true);
                int var18 = var17 + class253.field3862.method814(0);
                class81.field1079.method828(true);
                int var19 = var18 + class81.field1079.method814(0);
                class458.field6792.method828(true);
                int var20 = var19 + class458.field6792.method814(0);
                class133.field1727.method828(true);
                int var21 = var20 + class133.field1727.method814(0);
                class183.field2741.method828(true);
                int var22 = var21 + class183.field2741.method814(0);
                class387.field5724.method828(true);
                int var23 = var22 + class387.field5724.method814(0);
                class451.field6658.method828(true);
                int var24 = var23 + class451.field6658.method814(0);
                class362.field5335.method828(true);
                int var25 = var24 + class362.field5335.method814(0);
                if (var25 < 1100) {
                    class303.field4586 = class275.field4205.method937((byte) 101, class27.field356) + var25 / 11 + "%";
                    class71.field934 = 65;
                } else {
                    class304.method1870(class296.field4494, -1786);
                    class281.method1732(-32665, class296.field4494);
                    class385.method2362((byte) -71, class296.field4494);
                    class441.method2699(class296.field4494, -128, class320.field4840);
                    class66.method446(class27.field356, class261.field3978, class320.field4840, true, (byte) 111);
                    class121.method731(true, class320.field4840, true, class27.field356, class253.field3862);
                    class186.field2796 = new class183(class466.field6855, class27.field356, true, class81.field1079, class320.field4840);
                    class299.method1849(class296.field4494, (byte) 90);
                    class247.method1507(class458.field6792, class447.field6591, class355.field5241, 0);
                    class55.method315(class296.field4494, true);
                    class291.method1805((byte) 87, class320.field4840, class133.field1727);
                    class80.method520(512, class183.field2741);
                    class219.method1332(class296.field4494, (byte) -53);
                    class387.method2390(class316.field4786, false, class430.field6321, class427.field6274, class320.field4840);
                    class145.method899(0, class296.field4494);
                    class453.method2813(121, class296.field4496);
                    class424.method2614(class451.field6658, 1, new class191(), class387.field5724);
                    class155.method955(-1, class387.field5724, class451.field6658);
                    class113.method686(-4, class296.field4494);
                    class433.method2662(class296.field4494, -237);
                    class401.method2522(0, class296.field4494);
                    class339.method2069(class427.field6274, class296.field4494, false);
                    class31.method184(false, class296.field4494, class427.field6274);
                    class255.method1574((byte) 124, class296.field4494);
                    class153.method947(class427.field6274, -16093, class296.field4494);
                    class177.method1079((byte) -107, class296.field4494);
                    class67.method455(false, class296.field4494);
                    class303.field4586 = class324.field4873.method937((byte) 119, class27.field356);
                    class71.field934 = 65;
                    class191.method1155(0);
                    class163.method983(28);
                    class425.field6245 = 120;
                }
            } else if (class425.field6245 == 120) {
                int var26 = class278.method1725(class427.field6274, 0);
                int var27 = class429.method2637(-94);
                if (var27 > var26) {
                    class303.field4586 = class221.field3373.method937((byte) 124, class27.field356) + var26 * 100 / var27 + "%";
                    class71.field934 = 70;
                } else {
                    class267.method1656(class196.field2965, (byte) -110, class427.field6274);
                    class426.method2623((byte) -77, class107.field1426);
                    class303.field4586 = class407.field6064.method937((byte) -125, class27.field356);
                    class71.field934 = 70;
                    class425.field6245 = 130;
                }
            } else if (class425.field6245 == 130) {
                class303.field4586 = class269.field4083.method937((byte) -87, class27.field356);
                class71.field934 = 75;
                class425.field6245 = 140;
            } else if (class425.field6245 == 140) {
                if (class13.field169.method829("huffman", 0, "")) {
                    class37 var28 = new class37(class13.field169.method827("huffman", 0, ""));
                    class20.method126(-294, var28);
                    class303.field4586 = class429.field6312.method937((byte) -73, class27.field356);
                    class425.field6245 = 150;
                    class71.field934 = 80;
                } else {
                    class303.field4586 = class210.field3149.method937((byte) -119, class27.field356) + "0%";
                    class71.field934 = 80;
                }
            } else if (class425.field6245 == 150) {
                if (!class316.field4786.method828(true)) {
                    class303.field4586 = class196.field2957.method937((byte) 121, class27.field356) + class316.field4786.method814(0) * 3 / 4 + "%";
                    class71.field934 = 85;
                } else if (!class241.field3627.method828(true)) {
                    class303.field4586 = class196.field2957.method937((byte) -71, class27.field356) + (class241.field3627.method814(0) / 10 + 75) + "%";
                    class71.field934 = 85;
                } else if (!class430.field6321.method828(true)) {
                    class303.field4586 = class196.field2957.method937((byte) -115, class27.field356) + (class430.field6321.method814(0) / 20 + 85) + "%";
                    class71.field934 = 85;
                } else if (class135.field1786.method820(0, "details")) {
                    class223.method1350(class135.field1786);
                    class86.method564(2129, class362.field5335);
                    class452.method2802(5, class362.field5334, class320.field4840);
                    class303.field4586 = class17.field254.method937((byte) 98, class27.field356);
                    class425.field6245 = 160;
                    class71.field934 = 85;
                } else {
                    class303.field4586 = class196.field2957.method937((byte) -99, class27.field356) + (class135.field1786.method810("details", (byte) -90) / 10 + 90) + "%";
                    class71.field934 = 85;
                }
            } else if (class425.field6245 == 160) {
                int var29 = class153.method942((byte) -70);
                if (var29 == -1) {
                    class303.field4586 = class399.field5959.method937((byte) -86, class27.field356);
                    class71.field934 = 90;
                } else if (var29 == 7 || var29 == 9) {
                    this.method802(35, "worldlistfull");
                    class316.method1929(false, 1000);
                } else if (class414.field6155) {
                    class303.field4586 = class304.field4591.method937((byte) 113, class27.field356);
                    class425.field6245 = 170;
                    class71.field934 = 90;
                } else {
                    this.method802(105, "worldlistio_" + var29);
                    class316.method1929(false, 1000);
                }
            } else if (class425.field6245 == 170) {
                class14.field174 = new boolean[class21.field286];
                class413.field6135 = new int[class21.field286];
                class403.field6013 = new String[class45.field566];
                for (int var30 = 0; var30 < class21.field286; var30++) {
                    if (class409.method2571(var30, 69).field271 == 0) {
                        class14.field174[var30] = true;
                        class425.field6242++;
                    }
                    class413.field6135[var30] = -1;
                }
                class91.method594(119);
                class442.field6500 = class316.field4786.method836(-1, "loginscreen");
                class265.field4048.method821(false, true, (byte) 126);
                class298.field4505.method821(true, true, (byte) 117);
                class427.field6274.method821(true, true, (byte) 118);
                class430.field6321.method821(true, true, (byte) 117);
                class13.field169.method821(true, true, (byte) 123);
                class316.field4786.method821(true, true, (byte) 108);
                class296.field4494.field1767 = 2;
                class281.field4301 = true;
                class296.field4496.field1767 = 2;
                class261.field3978.field1767 = 2;
                class253.field3862.field1767 = 2;
                class81.field1079.field1767 = 2;
                class458.field6792.field1767 = 2;
                class133.field1727.field1767 = 2;
                class446.method2757(-1, class376.field5479, -1, -4, false);
                class303.field4586 = class287.field4370.method937((byte) 110, class27.field356);
                class71.field934 = 95;
                class425.field6245 = 180;
            } else if (class425.field6245 == 180) {
                class378.method2275(true, 9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfh;)Z")
    public static final boolean method2783(class170 arg0) {
        if (class120.field1586) {
            if (method2796(arg0).field4689 != 0) {
                return false;
            }
            if (arg0.field2558 == 0) {
                return false;
            }
        }
        return arg0.field2573;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method2784(byte arg0) {
        field6665 = null;
        field6680 = null;
        if (arg0 > -26) {
            field6665 = null;
        }
        field6676 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfh;)Lfh;")
    public static final class170 method2785(class170 arg0) {
        int var1 = method2796(arg0).method1906(-16777216);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class168.method1020(arg0.field2474, (byte) 83);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2786() {
        class80.field1052 = 0;
        for (int var0 = 0; var0 < class38.field458; var0++) {
            class155 var1 = class170.field2626[class87.field1235[var0]];
            if (var1.field1942 && var1.method900((byte) 38) != -1) {
                int var2 = (var1.method911(0) - 1) * 64 + 60;
                int var3 = var1.field1900 - var2 >> 7;
                int var4 = var1.field1892 - var2 >> 7;
                class145 var5 = class133.method799(var3, var1.field1902, var4, 1);
                if (var5 != null) {
                    int var6 = var5.field1929;
                    if (var5 instanceof class155) {
                        var6 += 2048;
                    }
                    if (var5.field2008 == 0 && var5.method900((byte) 38) != -1) {
                        class375.field5471[class80.field1052] = var6;
                        class294.field4470[class80.field1052] = var6;
                        class80.field1052++;
                        var5.field2008++;
                    }
                    class375.field5471[class80.field1052] = var6;
                    class294.field4470[class80.field1052] = var1.field1929 + 2048;
                    class80.field1052++;
                    var5.field2008++;
                }
            }
        }
        class43.method252(class80.field1052 - 1, class375.field5471, true, class294.field4470, 0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method798(int arg0) {
        field6671++;
        if (class26.field346) {
            class5.method46((byte) -120);
        }
        if (class196.field2965 != null) {
            class196.field2965.method1617((byte) -37);
        }
        if (class90.field1277 != null) {
            class187.method1139(class90.field1277, 0, class79.field1043);
            class90.field1277 = null;
        }
        if (class301.field4543 != null) {
            class301.field4543.method2163(true);
            class301.field4543 = null;
        }
        if (class229.field3496 != null) {
            class229.field3496.method649((byte) -62, class170.field2631);
        }
        if (arg0 > -98) {
            method2796((class170) null);
        }
        class229.field3496 = null;
        if (class245.field3670 != null) {
            class245.field3670.method238(0);
        }
        if (class236.field3536 != null) {
            class236.field3536.method238(0);
        }
        class8.field92.method292(-111);
        class196.field2963.method990(-1);
        if (class410.field6112 != null) {
            class410.field6112.method1704(0);
            class410.field6112 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class442.method2703("argument count", 1);
            }
            class45.field563 = Integer.parseInt(arg0[0]);
            class454.field6750 = 2;
            if (arg0[1].equals("live")) {
                class265.field4046 = 0;
            } else if (arg0[1].equals("rc")) {
                class265.field4046 = 1;
            } else if (arg0[1].equals("wip")) {
                class265.field4046 = 2;
            } else {
                class442.method2703("modewhat", 1);
            }
            class27.field356 = class282.method1737(arg0[2], true);
            if (class27.field356 == -1) {
                if (arg0[2].equals("english")) {
                    class27.field356 = 0;
                } else if (arg0[2].equals("german")) {
                    class27.field356 = 1;
                } else {
                    class442.method2703("language", 1);
                }
            }
            class120.field1585 = false;
            class355.field5242 = false;
            if (arg0[3].equals("game0")) {
                class466.field6855 = class88.field1254;
            } else if (arg0[3].equals("game1")) {
                class466.field6855 = class17.field253;
            } else {
                class442.method2703("game", 1);
            }
            class455.field6757 = true;
            class426.field6266 = true;
            class240.field3600 = 0;
            class405.field6021 = class466.field6855.field6041;
            class462.field6820 = 0;
            class54.field730 = "";
            client var1 = new client();
            class68.field876 = var1;
            var1.method789(class265.field4046 + 32, (byte) -125, 570, class466.field6855.field6037, 1024, 29, 768, false);
            class143.field1914.setLocation(40, 40);
        } catch (Exception var3) {
            class288.method1783((String) null, var3, -114);
        }
        field6681++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method794(int arg0) {
        field6662++;
        method2784((byte) -101);
        class288.method1779(false);
        class32.method191(0);
        class151.method939((byte) 50);
        class381.method2294(5);
        class162.method982(true);
        class77.method500((byte) -24);
        class426.method2626((byte) -124);
        class97.method626(arg0 ^ 0xFFFF92B8);
        class5.method41((byte) -128);
        class382.method2306(false);
        class133.method793(true);
        class360.method2169(-84);
        class406.method2550(false);
        class261.method1608(90);
        class8.method64(121);
        class398.method2510((byte) 7);
        class246.method1505(95);
        class359.method2160((byte) 119);
        class164.method987(arg0 ^ 0xFFFFFF80);
        class286.method1768(false);
        class453.method2817(true);
        class134.method806(arg0 ^ 0xFFFFFFD9);
        class198.method1186(-124);
        class415.method2589(1);
        class241.method1484(true);
        class183.method1117((byte) -100);
        class155.method962(-1);
        class119.method714((byte) 127);
        class452.method2805(32767);
        class273.method1705((byte) -91);
        class26.method156(arg0 ^ 0x180);
        class375.method2260(-27960);
        class341.method2077((byte) -84);
        class378.method2273(-17295);
        class130.method773(1);
        class354.method2120(arg0 ^ 0xFFFFFFFA);
        class170.method1042(58);
        class411.method2576((byte) -124);
        class169.method1028(-67);
        class311.method1896((byte) 87);
        class319.method1946(arg0 + 7019);
        class255.method1576(arg0 + 26064);
        class42.method230(82);
        class405.method2545(-126);
        class379.method2281(arg0 ^ 0x1C);
        class145.method898((byte) -56);
        class137.method865(-121);
        class13.method77(arg0 - 217);
        class55.method318(arg0);
        class343.method2095((byte) -70);
        class146.method915((byte) -117);
        class333.method2042(false);
        class312.method1899((byte) 126);
        class425.method2619((byte) 117);
        class153.method946(arg0 ^ 0x7C);
        class351.method2112((byte) -52);
        class272.method1699(0);
        class49.method282((byte) 118);
        class292.method1818(arg0 ^ 0x1B);
        class143.method891(arg0 ^ 0xFFFFFFA2);
        class439.method2692(-7780);
        class396.method2499(arg0 - 26);
        class6.method50(arg0 - 127);
        class253.method1560(arg0 - 145);
        class264.method1634(arg0 - 32);
        class447.method2762((byte) -28);
        class258.method1603(2);
        class150.method936(true);
        class113.method688(-111);
        class374.method2242((byte) 106);
        class303.method1863(100);
        class138.method881((byte) 109);
        class328.method2023((byte) 109);
        class85.method540(arg0 ^ 0x363E);
        class128.method759(false);
        class265.method1642(arg0 ^ 0x7B);
        class410.method2572((byte) -86);
        class431.method2648(-60);
        class451.method2777(114);
        class110.method675(111);
        class221.method1342((byte) -115);
        class271.method1680(21543);
        class167.method1005((byte) -77);
        class177.method1081(0);
        class217.method1323(69);
        class180.method1093((byte) 28);
        class176.method1075(arg0 - 64);
        class142.method890(-121);
        class363.method2181(1);
        class412.method2578(1578027969);
        class283.method1741(5);
        class355.method2130(true);
        class347.method2105(true);
        class368.method2213();
        class188.method1146(false);
        class438.method2688(58);
        class413.method2580(-256);
        class387.method2389((byte) 77);
        class318.method1944((byte) -30);
        class268.method1669((byte) -125);
        class90.method591(true);
        class384.method2317();
        class223.method1345();
        class60.method330(arg0 - 117);
        class227.method1374(false);
        class290.method1794();
        class172.method1062(arg0 ^ 0xFF80);
        class228.method1388((byte) 53);
        class344.method2096(-8926);
        class31.method179(0);
        class149.method931(-1);
        class154.method953(false);
        class408.method2561(arg0 ^ 0x7D);
        class56.method321(-1);
        class15.method90(-106);
        class446.method2755(arg0 ^ 0xFFFFC161);
        class364.method2189((byte) 82);
        class87.method571(arg0 ^ 0x1007F);
        class289.method1789(false);
        class267.method1655(0);
        class126.method745(-12032);
        class109.method670(false);
        class433.method2663((byte) -124);
        class195.method1166(-8);
        class353.method2114((byte) 70);
        class111.method680(false);
        class132.method786(arg0 ^ 0xFFFFFF85);
        class402.method2533(4);
        class191.method1153(arg0 ^ 0x26);
        class357.method2149((byte) -66);
        class94.method621((byte) -109);
        class284.method1745(arg0 ^ 0xFFFFFF16);
        class287.method1775(arg0 ^ 0xFFFFE80B);
        class57.method324((byte) -123);
        class66.method451(6);
        class161.method973(-6);
        class20.method131(126);
        class371.method2232((byte) 120);
        class62.method338(-5);
        class37.method212(-114);
        class301.method1858(arg0 ^ 0xFFFFFF80);
        class44.method255(true);
        class358.method2154(23202);
        class317.method1939();
        class403.method2539((byte) 56);
        class189.method1147((byte) -22);
        class432.method2654(12530);
        class107.method664((byte) 79);
        class19.method122(true);
        class173.method1065(-1);
        class383.method2311(false);
        class327.method2019((byte) -43);
        class463.method2854(-10693000);
        class201.method1202(121);
        class269.method1676(14793);
        class70.method471(0);
        class362.method2175((byte) -84);
        class336.method2053();
        class38.method219(2);
        class462.method2851(104);
        class112.method682(false);
        class21.method138((byte) -111);
        class316.method1928((byte) -92);
        class337.method2062((byte) 121);
        class466.method2872(-1);
        class45.method257(true);
        class380.method2291((byte) 122);
        class399.method2519(112);
        class131.method776((byte) -113);
        class148.method921(106);
        class184.method1127((byte) 124);
        class307.method1885(-1);
        class43.method253((byte) -3);
        class106.method660(false);
        class71.method475(0);
        class192.method1159(18769);
        class291.method1803(Integer.MAX_VALUE);
        class465.method2869(24785);
        class25.method155(115);
        class9.method69();
        class416.method2594(1);
        class186.method1132(0);
        class236.method1426((byte) 21);
        class74.method490(false);
        class320.method1953(arg0 ^ 0x7B);
        class54.method313(39);
        class459.method2845((byte) 81);
        class99.method633(arg0 ^ 0x78);
        class429.method2640(31);
        class212.method1241((byte) 77);
        class103.method653(arg0 ^ 0xFFFFB053);
        class262.method1629(true);
        class1.method5(arg0 ^ 0x7E);
        class163.method984(arg0 - 123);
        class39.method223(99);
        class14.method84((byte) 82);
        class168.method1021(arg0 - 117);
        class340.method2076();
        class219.method1330(0);
        class95.method622(3);
        class247.method1508(arg0 - 127);
        class88.method573((byte) 32);
        class210.method1237((byte) 4);
        class36.method204((byte) 123);
        class365.method2190(-7758);
        class391.method2410((byte) -86);
        class390.method2409(arg0 - 127);
        class455.method2829(true);
        class392.method2417();
        class443.method2708(true);
        class50.method283((byte) 95);
        class251.method1532(arg0 - 214);
        class324.method1995((byte) -88);
        class135.method847(arg0 - 5);
        class277.method1714(13454);
        class308.method1886((byte) 122);
        class256.method1599();
        class200.method1200();
        class315.method1926(-251);
        class79.method517((byte) 108);
        class304.method1871(103);
        class435.method2669((byte) 43);
        class249.method1519();
        class83.method535();
        class140.method882(arg0 - 17);
        class182.method1096();
        class276.method1711(-114);
        class118.method701(0);
        class259.method1605((byte) 78);
        class108.method669(255);
        class326.method2017(0);
        class388.method2403(arg0 ^ 0x80);
        class372.method2238(100);
        class454.method2826(-987276671);
        class334.method2043(arg0 ^ 0x7E);
        class100.method640((byte) 125);
        class250.method1522((byte) 123);
        class407.method2554(4);
        class53.method307((byte) 108);
        class298.method1842(2);
        class302.method1861(1);
        class82.method528(-1);
        class314.method1921(6368);
        class401.method2523((byte) 72);
        class409.method2568((byte) 94);
        class458.method2838(arg0 ^ 0x40);
        class299.method1846((byte) 92);
        class345.method2102(false);
        class280.method1728(-6788);
        class282.method1739(false);
        class17.method118((byte) 48);
        class136.method851(-1);
        class338.method2067(6000);
        class230.method1397(true);
        class278.method1724((byte) -103);
        class28.method164((byte) 121);
        class244.method1499(23273);
        class424.method2613((byte) 127);
        class207.method1213((byte) 126);
        class72.method476((byte) -128);
        class296.method1836(-913602128);
        class120.method724((byte) -79);
        class33.method196((byte) 121);
        class339.method2070((byte) -101);
        class257.method1601(false);
        class185.method1131(-72);
        class52.method303((byte) 56);
        class243.method1494(115);
        class105.method657(-92);
        class238.method1431(50000);
        class116.method697((byte) -116);
        class205.method1210(0);
        class335.method2048(arg0 + 93);
        class394.method2498(25668);
        class377.method2268(arg0 ^ 0xFFFFDA7B);
        class423.method2612(arg0 - 11444);
        class187.method1137(0);
        class456.method2834(-17);
        class373.method2241(29246);
        class3.method23(arg0 ^ 0xC);
        class440.method2696((byte) 124);
        class220.method1340((byte) 95);
        class160.method970(95);
        class75.method494(27344);
        class67.method456(arg0 ^ 0xFFFFFFB9);
        class414.method2583(arg0 - 219);
        class127.method748(-1185674196);
        class427.method2634(false);
        class294.method1831((byte) 87);
        class252.method1538();
        class300.method1854();
        class165.method991(arg0 ^ arg0);
        class81.method523(-187);
        class11.method73(arg0 ^ 0xFFFFFFD6);
        class121.method729(false);
        class196.method1173(64);
        class386.method2383((byte) 127);
        class295.method1834(-95);
        class213.method1246(true);
        class449.method2765(-60);
        class114.method690(true);
        class275.method1709(arg0 ^ 0x7F);
        class80.method519((byte) 114);
        class174.method1071((byte) -121);
        class281.method1731((byte) 112);
        class422.method2607(110);
        class442.method2701(true);
        class418.method2602(arg0 ^ 0x2996);
        class450.method2770(9217);
        class245.method1500(125);
        class306.method1882(23344);
        class310.method1894(74);
        class68.method464(-4547);
        class63.method339(arg0 + 19513);
        class430.method2645(-16441);
        class91.method598((byte) 62);
        class441.method2698(0);
        class47.method263(arg0 ^ 0xFFFFFFA3);
        class229.method1392(5784);
        class30.method173((byte) -123);
        class98.method631(-69);
        if (class133.field1732) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
    public static final int method2787(int arg0, int arg1, int arg2) {
        field6661++;
        if (arg0 != 12345678) {
            field6666 = 89;
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method2788(int arg0, byte[] arg1) {
        int var3 = 102 % ((arg0 + 48) / 54);
        field6672++;
        class385 var4 = new class385(arg1);
        while (true) {
            while (true) {
                int var5 = var4.method2343(255);
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int[] var6 = class416.field6182 = new int[6];
                    var6[0] = var4.method2323(-65);
                    var6[1] = var4.method2323(-31);
                    var6[2] = var4.method2323(-97);
                    var6[3] = var4.method2323(-11);
                    var6[4] = var4.method2323(-42);
                    var6[5] = var4.method2323(-29);
                } else if (var5 == 4) {
                    int var7 = var4.method2343(255);
                    class149.field2065 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class149.field2065[var8] = var4.method2323(-65);
                        if (class149.field2065[var8] == 65535) {
                            class149.field2065[var8] = -1;
                        }
                    }
                } else if (var5 == 5) {
                    int var9 = var4.method2343(255);
                    class81.field1084 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        class81.field1084[var10] = var4.method2323(-77);
                        if (class81.field1084[var10] == 65535) {
                            class81.field1084[var10] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method2789(boolean arg0, Object arg1, byte arg2) {
        if (arg2 < 41) {
            field6680 = null;
        }
        field6673++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class327.method2018(-1, var3) : var3;
        } else if (arg1 instanceof class171) {
            class171 var4 = (class171) arg1;
            return var4.method1051((byte) 100);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILef;)Lfd;")
    public static final class98 method2790(int arg0, class385 arg1) {
        field6669++;
        if (arg0 != 30526) {
            field6680 = null;
        }
        return new class98(arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2382((byte) -107), arg1.method2382((byte) -83), arg1.method2343(255));
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method2791(byte arg0) {
        field6664++;
        if (class219.field3339 < class8.field92.field671) {
            if (class432.field6334 == class284.field4336) {
                class284.field4336 = class109.field1443;
            } else {
                class284.field4336 = class432.field6334;
            }
            class163.field2276 = (class8.field92.field671 - 1) * 50 * 5;
            if (class163.field2276 > 3000) {
                class163.field2276 = 3000;
            }
            if (class8.field92.field671 >= 2 && class8.field92.field669 == 6) {
                this.method802(32, "js5connect_outofdate");
                class19.field263 = 1000;
                return;
            }
            if (class8.field92.field671 >= 4 && class8.field92.field669 == -1) {
                this.method802(65, "js5crc");
                class19.field263 = 1000;
                return;
            }
            if (class8.field92.field671 >= 4 && (class19.field263 == 0 || class19.field263 == 5)) {
                if (class8.field92.field669 == 7 || class8.field92.field669 == 9) {
                    this.method802(39, "js5connect_full");
                } else if (class8.field92.field669 > 0) {
                    this.method802(113, "js5connect");
                } else {
                    this.method802(98, "js5io");
                }
                class19.field263 = 1000;
                return;
            }
        }
        class219.field3339 = class8.field92.field671;
        if (class163.field2276 > 0) {
            class163.field2276--;
            return;
        }
        try {
            if (class259.field3961 == 0) {
                class386.field5702 = class79.field1043.method1450((byte) -71, class284.field4336, class228.field3490);
                class259.field3961++;
            }
            if (class259.field3961 == 1) {
                if (class386.field5702.field3172 == 2) {
                    this.method2799(1000, false);
                    return;
                }
                if (class386.field5702.field3172 == 1) {
                    class259.field3961++;
                }
            }
            if (class259.field3961 == 2) {
                class443.field6521 = new class359((Socket) class386.field5702.field3175, class79.field1043);
                class385 var2 = new class385(5);
                var2.method2366(class386.field5691.field6435, true);
                var2.method2381(570, 0);
                class443.field6521.method2164(0, (byte) -35, 5, var2.field5685);
                class259.field3961++;
                class401.field5969 = class445.method2750(-27580);
            }
            if (arg0 == 30) {
                if (class259.field3961 == 3) {
                    if (class19.field263 == 0 || class19.field263 == 5 || class443.field6521.method2158(false) > 0) {
                        int var3 = class443.field6521.method2156(true);
                        if (var3 != 0) {
                            this.method2799(var3, false);
                            return;
                        }
                        class259.field3961++;
                    } else if (class445.method2750(-27580) - class401.field5969 > 30000L) {
                        this.method2799(1001, false);
                        return;
                    }
                }
                if (class259.field3961 == 4) {
                    boolean var4 = class19.field263 == 5 || class19.field263 == 10 || class19.field263 == 28;
                    class8.field92.method300(class443.field6521, false, !var4);
                    class259.field3961 = 0;
                    class386.field5702 = null;
                    class443.field6521 = null;
                }
            }
        } catch (IOException var5) {
            this.method2799(1002, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method791(int arg0) {
        field6668++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class52.method305((byte) 70);
        class196.field2963 = new class164(class79.field1043);
        class8.field92 = new class51();
        if (class265.field4046 != 0) {
            class138.field1874 = new byte[50][];
        }
        class446.method2754(22394, class79.field1043);
        if (class454.field6750 == 0) {
            class98.field1355 = this.getCodeBase().getHost();
            class141.field1898 = 43594;
            class264.field4032 = 443;
        } else if (class454.field6750 == 1) {
            class98.field1355 = this.getCodeBase().getHost();
            class141.field1898 = class45.field563 + 40000;
            class264.field4032 = class45.field563 + 50000;
        } else if (class454.field6750 == 2) {
            class98.field1355 = "127.0.0.1";
            class141.field1898 = class45.field563 + 40000;
            class264.field4032 = class45.field563 + 50000;
        }
        if (arg0 != 0) {
            return;
        }
        class228.field3490 = class98.field1355;
        class109.field1443 = class264.field4032;
        class244.field3661 = class141.field1898;
        class432.field6334 = class141.field1898;
        if (class466.field6855 == class17.field253) {
            class426.field6270 = 0;
            class201.field3032 = class272.field4177;
            class162.field2253 = 16777215;
            class295.field4481 = class347.field5188;
            class372.field5435 = class441.field6480;
            class246.field3685 = class169.field2439;
            class67.field865 = true;
        } else {
            class295.field4481 = class187.field2810;
            class246.field3685 = class466.field6865;
            class372.field5435 = class409.field6098;
            class201.field3032 = class63.field796;
        }
        class66.field858 = class465.field6852 = class151.field2083 = class425.field6246 = new short[256];
        class284.field4336 = class244.field3661;
        if (class239.field3584 == 3) {
            class414.field6149 = class45.field563;
        }
        class185.field2786 = class155.method958(class170.field2631, (byte) 91);
        class74.field1004 = class271.method1681(-128, true, class170.field2631);
        class229.field3496 = class284.method1750(true);
        if (class229.field3496 != null) {
            class229.field3496.method648(arg0 + 3, class170.field2631);
        }
        class72.field957 = class239.field3584;
        try {
            if (class79.field1043.field3587 != null) {
                class81.field1068 = new class198(class79.field1043.field3587, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class137.field1852[var3] = new class198(class79.field1043.field3572[var3], 6000, 0);
                }
                class450.field6623 = new class198(class79.field1043.field3578, 6000, 0);
                class282.field4307 = new class415(255, class81.field1068, class450.field6623, 500000);
                class353.field5222 = new class198(class79.field1043.field3589, 24, 0);
                class79.field1043.field3572 = null;
                class79.field1043.field3589 = null;
                class79.field1043.field3587 = null;
                class79.field1043.field3578 = null;
            }
        } catch (IOException var4) {
            class450.field6623 = null;
            class282.field4307 = null;
            class81.field1068 = null;
            class353.field5222 = null;
        }
        if (class454.field6750 != 0) {
            class212.field3194 = true;
        }
        class107.field1427 = (class88.field1254 == class466.field6855 ? class255.field3874 : class426.field6252).method937((byte) 99, class27.field356);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method800(byte arg0) {
        field6675++;
        if (class19.field263 == 1000) {
            return;
        }
        class26.field332++;
        if (class26.field332 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class44.field552 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class164.field2281.setSeed((long) class44.field552);
        }
        this.method2793(11837);
        if (class132.field1690 != null) {
            class132.field1690.method1774(0);
        }
        class401.method2521(0);
        if (arg0 < 74) {
            field6676 = null;
        }
        class374.method2244((byte) -78);
        class185.field2786.method583(1);
        class74.field1004.method508((byte) -124);
        if (class229.field3496 != null) {
            int var3 = class229.field3496.method647(8);
            class91.field1286 = var3;
        }
        if (class196.field2965 != null) {
            class196.field2965.method403((int) class445.method2750(-27580));
        }
        class68.method459((byte) 20);
        class296.field4495 = 0;
        for (class174 var4 = class185.field2786.method576((byte) -86); var4 != null && class296.field4495 < 128; var4 = class185.field2786.method576((byte) -86)) {
            if (var4.method1072(-14977) != 1) {
                char var5 = var4.method1070((byte) -100);
                if (!class220.method1339(-1) || var5 != '`' && var5 != '§') {
                    class43.field542[class296.field4495] = var4;
                    class296.field4495++;
                } else if (class198.method1182(4)) {
                    class77.method509(0);
                } else {
                    class414.method2581(true);
                }
            }
        }
        class465.field6850 = null;
        for (class281 var6 = class74.field1004.method502((byte) -71); var6 != null; var6 = class74.field1004.method502((byte) -26)) {
            int var7 = var6.method461(88);
            if (var7 == -1) {
                class195.field2952.method2504(42, var6);
            } else if (class85.method549(var7, (byte) 113)) {
                class465.field6850 = var6;
            }
        }
        if (class198.method1182(4)) {
            class68.method458(true);
        }
        if (class19.field263 == 0) {
            this.method2782((byte) 113);
            class341.method2078(0);
        } else if (class19.field263 == 5) {
            this.method2782((byte) 106);
            class341.method2078(0);
        } else if (class19.field263 == 25 || class19.field263 == 28) {
            class339.method2075(-32769);
        }
        if (class19.field263 == 10) {
            this.method2795(19719);
            class141.method888(84);
            class26.method157(512);
            class116.method699(1);
        } else if (class19.field263 == 30) {
            class423.method2610((byte) -105);
        } else if (class19.field263 == 40) {
            class116.method699(1);
            if (class298.field4511 != -3 && class298.field4511 != 2 && class298.field4511 != 15) {
                class77.method504((byte) 15);
            }
        }
        class320.method1950(false, class196.field2965);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method801(byte arg0) {
        field6678++;
        if (class19.field263 == 1000) {
            return;
        }
        long var2 = class140.method884((byte) 117) / 1000000L - class74.field977;
        class74.field977 = class140.method884((byte) 122) / 1000000L;
        boolean var4 = class313.method1916((byte) -68);
        if (var4 && class437.field6428 && class245.field3670 != null) {
            class245.field3670.method249(1);
        }
        if (arg0 <= 34) {
            field6676 = null;
        }
        if (class19.field263 == 30 || class19.field263 == 10) {
            if (class98.field1360 != 0L && class98.field1360 < class445.method2750(-27580)) {
                class446.method2757(class243.field3646, class246.method1503((byte) -78), class57.field767, -4, false);
            } else if (class196.field2965.method393() && class57.field758) {
                class341.method2087(-104);
            }
        }
        if (class90.field1277 == null) {
            Container var5;
            if (class143.field1914 == null) {
                var5 = class79.field1043.field3583;
            } else {
                var5 = class143.field1914;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class143.field1914 == var5) {
                Insets var8 = class143.field1914.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class71.field933 != var6 || class204.field3063 != var7) {
                if (class196.field2965 == null || class196.field2965.method386()) {
                    class52.method305((byte) 70);
                } else {
                    class204.field3063 = var7;
                    class71.field933 = var6;
                }
                class98.field1360 = class445.method2750(-27580) + 500L;
            }
        }
        if (class90.field1277 != null && !class351.field5211 && (class19.field263 == 30 || class19.field263 == 10)) {
            class446.method2757(-1, class376.field5479, -1, -4, false);
        }
        boolean var9 = false;
        if (class207.field3094) {
            class207.field3094 = false;
            var9 = true;
        }
        if (var9) {
            class60.method328(0);
        }
        if (class196.field2965 != null && class196.field2965.method421() || class246.method1503((byte) -66) != 1) {
            class141.method887((byte) -122);
        }
        if (class19.field263 == 0) {
            class253.method1558(class253.field3864[class405.field6021], class142.field1904[class405.field6021], class71.field934, class364.field5354[class405.field6021], class303.field4586, var9, true);
        } else if (class19.field263 == 5) {
            class284.method1748(class196.field2965.method421() | var9, class364.field5354[class405.field6021].getRGB(), class161.field2244, 3, class142.field1904[class405.field6021].getRGB(), class196.field2965, class253.field3864[class405.field6021].getRGB());
        } else if (class19.field263 == 10) {
            class236.method1427(-32);
        } else if (class19.field263 == 25 || class19.field263 == 28) {
            if (class168.field2415 == 1) {
                if (class429.field6311 < class302.field4548) {
                    class429.field6311 = class302.field4548;
                }
                int var10 = (class429.field6311 - class302.field4548) * 50 / class429.field6311;
                class217.method1322(class380.field5552, class28.field365.method937((byte) 96, class27.field356) + "<br>(" + var10 + "%)", 94, true);
            } else if (class168.field2415 == 2) {
                if (class408.field6078 < class360.field5319) {
                    class408.field6078 = class360.field5319;
                }
                int var11 = (class408.field6078 - class360.field5319) * 50 / class408.field6078 + 50;
                class217.method1322(class380.field5552, class28.field365.method937((byte) 108, class27.field356) + "<br>(" + var11 + "%)", 94, true);
            } else {
                class217.method1322(class380.field5552, class28.field365.method937((byte) -109, class27.field356), 101, true);
            }
        } else if (class19.field263 == 30) {
            class316.method1930(var2, -2939);
        } else if (class19.field263 == 40) {
            class217.method1322(class380.field5552, class191.field2845.method937((byte) 112, class27.field356) + "<br>" + class5.field61.method937((byte) 103, class27.field356), 115, true);
        }
        if (class243.field3649 == 3) {
            for (int var12 = 0; var12 < class174.field2662; var12++) {
                Rectangle var13 = class247.field3700[var12];
                if (class71.field914[var12]) {
                    class196.field2965.method1615(var13.width, -1996553985, var13.height, var13.x, var13.y, (byte) -119);
                } else if (class71.field931[var12]) {
                    class196.field2965.method1615(var13.width, -1996554240, var13.height, var13.x, var13.y, (byte) -119);
                }
            }
        }
        if (class198.method1182(4)) {
            class201.method1203(false, class196.field2965);
        }
        if ((class19.field263 == 30 || class19.field263 == 10) && class243.field3649 == 0 && class246.method1503((byte) -118) == 1 && !var9 && class239.field3571.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class174.field2662; var15++) {
                if (class71.field931[var15]) {
                    class71.field931[var15] = false;
                    class26.field344[var14++] = class247.field3700[var15];
                }
            }
            class196.field2965.method392(class26.field344, var14);
        } else if (class19.field263 != 0) {
            class196.field2965.method435();
            for (int var16 = 0; var16 < class174.field2662; var16++) {
                class71.field931[var16] = false;
            }
        }
        if (class350.field5205 == 0) {
            class109.method674((byte) 99, 15L);
        } else if (class350.field5205 == 1) {
            class109.method674((byte) 99, 10L);
        } else if (class350.field5205 == 2) {
            class109.method674((byte) 99, 5L);
        } else if (class350.field5205 == 3) {
            class109.method674((byte) 99, 2L);
        }
        if (class281.field4301) {
            class462.method2852((byte) 107);
        }
        if (class121.field1597 && class19.field263 == 10 && class6.field69 != -1) {
            class121.field1597 = false;
            class36.method206(-18199, class79.field1043);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfh;IIIIIIIII)V")
    public static final void method2792(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class170 var11 = arg0[var10];
            if (var11 != null && var11.field2474 == arg1) {
                int var12 = var11.field2476 + arg6;
                int var13 = var11.field2478 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2558 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2561 + var12;
                    int var19 = var11.field2501 + var13;
                    if (var11.field2558 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2558 == 0 || var11.field2469 || method2796(var11).field4689 != 0 || class402.field6011 == var11 || class431.field6331 == var11.field2473) {
                    if (!method2783(var11)) {
                        if (class14.field173 == var11) {
                            class406.field6040 = true;
                            class98.field1358 = var12;
                            class5.field63 = var13;
                        }
                        if (var11.field2537 || var14 < var16 && var15 < var17) {
                            if (var11.field2558 == 0 && var11.field2580 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class327 var20 = (class327) class431.field6330.method2514((byte) 61); var20 != null; var20 = (class327) class431.field6330.method2511(-115)) {
                                    if (var20.field4916) {
                                        var20.method625((byte) -50);
                                        var20.field4909.field2518 = false;
                                    }
                                }
                                if (class314.field4764 == 0) {
                                    class14.field173 = null;
                                    class402.field6011 = null;
                                }
                                class462.field6819 = 0;
                                class230.field3516 = false;
                                class359.field5311 = false;
                                if (!class306.field4628) {
                                    class447.method2758(0);
                                }
                            }
                            boolean var21;
                            if (class74.field1004.method505((byte) -106) >= var14 && class74.field1004.method501(58) >= var15 && class74.field1004.method505((byte) -120) < var16 && class74.field1004.method501(46) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class306.field4628 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class195.method1169(0, arg8 - var12, var11, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class74.field1004.method497((byte) 81) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class465.field6850 != null && class465.field6850.method461(89) == 0 && class465.field6850.method467(9) >= var14 && class465.field6850.method465((byte) -87) >= var15 && class465.field6850.method467(9) < var16 && class465.field6850.method465((byte) -85) < var17) {
                                var23 = true;
                            }
                            if (var11.field2482 != null) {
                                for (int var24 = 0; var24 < var11.field2482.length; var24++) {
                                    if (class185.field2786.method578(false, var11.field2482[var24])) {
                                        if (var11.field2514 == null || class26.field332 >= var11.field2514[var24]) {
                                            byte var25 = var11.field2524[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class185.field2786.method578(false, 86) && !class185.field2786.method578(false, 82) && !class185.field2786.method578(false, 81)) && ((var25 & 0x2) == 0 || class185.field2786.method578(false, 86)) && ((var25 & 0x1) == 0 || class185.field2786.method578(false, 82)) && ((var25 & 0x4) == 0 || class185.field2786.method578(false, 81))) {
                                                class427.method2631("", false, -1, var24 + 1, var11.field2525);
                                                int var26 = var11.field2470[var24];
                                                if (var11.field2514 == null) {
                                                    var11.field2514 = new int[var11.field2482.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field2514[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2514[var24] = class26.field332 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field2514 != null) {
                                        var11.field2514[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class111.method681(0, class465.field6850.method467(9) - var12, class465.field6850.method465((byte) -116) - var13, var11);
                            }
                            if (class14.field173 != null && class14.field173 != var11 && var21 && method2796(var11).method1897(-48)) {
                                class405.field6031 = var11;
                            }
                            if (class402.field6011 == var11) {
                                class72.field956 = true;
                                class456.field6764 = var12;
                                class446.field6574 = var13;
                            }
                            if (var11.field2469 || var11.field2473 != 0) {
                                if (var21 && class91.field1286 != 0 && var11.field2493 != null) {
                                    class327 var27 = new class327();
                                    var27.field4916 = true;
                                    var27.field4909 = var11;
                                    var27.field4911 = class91.field1286;
                                    var27.field4908 = var11.field2493;
                                    class431.field6330.method2504(42, var27);
                                }
                                if (class14.field173 != null || class306.field4628 || class191.field2850 != var11.field2473 && class462.field6819 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2473 != 0) {
                                    if (class210.field3162 == var11.field2473 || class17.field248 == var11.field2473) {
                                        field6676 = var11;
                                        if (class31.field396 != null) {
                                            class31.field396.method774(61, var11.field2501, class196.field2965);
                                        }
                                        if (class210.field3162 == var11.field2473) {
                                            if (!class306.field4628 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class288.method1780(arg8, class196.field2965, arg9, -5);
                                                for (class236 var28 = (class236) class303.field4577.method2127(-1489721243); var28 != null; var28 = (class236) class303.field4577.method2126(-38)) {
                                                    if (arg8 >= var28.field3533 && arg8 < var28.field3535 && arg9 >= var28.field3539 && arg9 < var28.field3534) {
                                                        class447.method2758(0);
                                                        class350.method2110(var28.field3538, (byte) -98);
                                                    }
                                                }
                                            }
                                            class145.method912(var11, var12, var13, (byte) -16);
                                            continue;
                                        }
                                    }
                                    if (class431.field6331 == var11.field2473) {
                                        if (var11.method1047((byte) 80, class196.field2965) == null || class97.field1337 != 0 && class97.field1337 != 3 || class306.field4628 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field2536[var30];
                                        if (var29 < var31 || var29 > var11.field2628[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field2561 / 2;
                                        int var33 = var30 - var11.field2501 / 2;
                                        int var34;
                                        if (class80.field1054 == 4) {
                                            var34 = (int) class462.field6810 & 0x3FFF;
                                        } else {
                                            var34 = (int) class462.field6810 + class3.field39 & 0x3FFF;
                                        }
                                        int var35 = class110.field1450[var34];
                                        int var36 = class110.field1452[var34];
                                        if (class80.field1054 != 4) {
                                            var35 = (class343.field5138 + 256) * var35 >> 8;
                                            var36 = (class343.field5138 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class80.field1054 == 4) {
                                            var39 = (class331.field4950 >> 7) + (var37 >> 2);
                                            var40 = (class155.field2138 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class113.field1500.method911(0) - 1) * 64;
                                            var39 = (class113.field1500.field1900 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class113.field1500.field1892 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class132.field1692 && (class108.field1435 & 0x40) != 0) {
                                            class170 var42 = class455.method2827(class54.field729, false, class186.field2795);
                                            if (var42 == null) {
                                                class284.method1746(-1);
                                            } else {
                                                class371.method2234(var40, 17, var39, false, class284.field4319, (byte) -65, " ->", class105.field1411, 1L, true);
                                            }
                                            continue;
                                        }
                                        if (class466.field6855 == class17.field253) {
                                            class371.method2234(var40, 59, var39, false, class418.field6193.method937((byte) -46, class27.field356), (byte) -65, "", -1, 1L, true);
                                        }
                                        class371.method2234(var40, 20, var39, false, class375.field5460, (byte) -65, "", -1, 1L, true);
                                        continue;
                                    }
                                    if (class191.field2850 == var11.field2473) {
                                        class288.field4381 = var11;
                                        if (var21) {
                                            class230.field3516 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class465.field6850.method467(9) - var12 - var11.field2561 / 2) * 2.0D / (double) class223.field3388);
                                            int var44 = (int) (-((double) (class465.field6850.method465((byte) -118) - var13 - var11.field2501 / 2) * 2.0D / (double) class223.field3388));
                                            int var45 = class295.field4480 + var43 + class223.field3394;
                                            int var46 = class217.field3305 + var44 + class223.field3405;
                                            class341 var47 = class452.method2808(-97);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method2086(var48, var45, var46, -128);
                                            if (var48 != null) {
                                                if (class185.field2786.method578(false, 82) && class143.field1912 > 0) {
                                                    class367.method2205(var48[2], var48[0], (byte) -62, var48[1]);
                                                    continue;
                                                }
                                                class359.field5311 = true;
                                                class233.field3522 = var48[0];
                                                class97.field1343 = var48[1];
                                                class427.field6295 = var48[2];
                                            }
                                            class462.field6819 = 1;
                                            class210.field3160 = false;
                                            class247.field3703 = class74.field1004.method505((byte) -124);
                                            class146.field2029 = class74.field1004.method501(83);
                                            continue;
                                        }
                                        if (var22 && class462.field6819 > 0) {
                                            if (class462.field6819 == 1 && (class247.field3703 != class74.field1004.method505((byte) -117) || class146.field2029 != class74.field1004.method501(119))) {
                                                class385.field5683 = class295.field4480;
                                                class296.field4498 = class217.field3305;
                                                class462.field6819 = 2;
                                            }
                                            if (class462.field6819 == 2) {
                                                class210.field3160 = true;
                                                class54.method314(class385.field5683 + (int) ((double) (class247.field3703 - class74.field1004.method505((byte) -128)) * 2.0D / (double) class223.field3385), -79);
                                                class437.method2685(-94, class296.field4498 - (int) ((double) (class146.field2029 - class74.field1004.method501(122)) * 2.0D / (double) class223.field3385));
                                            }
                                            continue;
                                        }
                                        if (class462.field6819 > 0 && !class210.field3160) {
                                            if ((class412.field6129 == 1 || class328.method2024(false)) && class149.field2067 > 2) {
                                                class364.method2183(class247.field3703, 2, class146.field2029, (byte) 107);
                                            } else if (class106.method662((byte) -125)) {
                                                class364.method2183(class247.field3703, 0, class146.field2029, (byte) -92);
                                            }
                                        }
                                        class462.field6819 = 0;
                                        continue;
                                    }
                                    if (class87.field1233 == var11.field2473) {
                                        if (var22) {
                                            class402.method2536(var11.field2561, class74.field1004.method505((byte) -117) - var12, class74.field1004.method501(51) - var13, var11.field2501, (byte) -42);
                                        }
                                        continue;
                                    }
                                    if (class72.field959 == var11.field2473) {
                                        class398.method2518(1, var13, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2553 && var23) {
                                    var11.field2553 = true;
                                    if (var11.field2550 != null) {
                                        class327 var49 = new class327();
                                        var49.field4916 = true;
                                        var49.field4909 = var11;
                                        var49.field4905 = class465.field6850.method467(9) - var12;
                                        var49.field4911 = class465.field6850.method465((byte) -126) - var13;
                                        var49.field4908 = var11.field2550;
                                        class431.field6330.method2504(42, var49);
                                    }
                                }
                                if (var11.field2553 && var22 && var11.field2497 != null) {
                                    class327 var50 = new class327();
                                    var50.field4916 = true;
                                    var50.field4909 = var11;
                                    var50.field4905 = class74.field1004.method505((byte) -118) - var12;
                                    var50.field4911 = class74.field1004.method501(62) - var13;
                                    var50.field4908 = var11.field2497;
                                    class431.field6330.method2504(42, var50);
                                }
                                if (var11.field2553 && !var22) {
                                    var11.field2553 = false;
                                    if (var11.field2504 != null) {
                                        class327 var51 = new class327();
                                        var51.field4916 = true;
                                        var51.field4909 = var11;
                                        var51.field4905 = class74.field1004.method505((byte) -126) - var12;
                                        var51.field4911 = class74.field1004.method501(84) - var13;
                                        var51.field4908 = var11.field2504;
                                        class453.field6703.method2504(42, var51);
                                    }
                                }
                                if (var22 && var11.field2540 != null) {
                                    class327 var52 = new class327();
                                    var52.field4916 = true;
                                    var52.field4909 = var11;
                                    var52.field4905 = class74.field1004.method505((byte) -110) - var12;
                                    var52.field4911 = class74.field1004.method501(122) - var13;
                                    var52.field4908 = var11.field2540;
                                    class431.field6330.method2504(42, var52);
                                }
                                if (!var11.field2518 && var21) {
                                    var11.field2518 = true;
                                    if (var11.field2513 != null) {
                                        class327 var53 = new class327();
                                        var53.field4916 = true;
                                        var53.field4909 = var11;
                                        var53.field4905 = class74.field1004.method505((byte) -108) - var12;
                                        var53.field4911 = class74.field1004.method501(76) - var13;
                                        var53.field4908 = var11.field2513;
                                        class431.field6330.method2504(42, var53);
                                    }
                                }
                                if (var11.field2518 && var21 && var11.field2595 != null) {
                                    class327 var54 = new class327();
                                    var54.field4916 = true;
                                    var54.field4909 = var11;
                                    var54.field4905 = class74.field1004.method505((byte) -115) - var12;
                                    var54.field4911 = class74.field1004.method501(59) - var13;
                                    var54.field4908 = var11.field2595;
                                    class431.field6330.method2504(42, var54);
                                }
                                if (var11.field2518 && !var21) {
                                    var11.field2518 = false;
                                    if (var11.field2520 != null) {
                                        class327 var55 = new class327();
                                        var55.field4916 = true;
                                        var55.field4909 = var11;
                                        var55.field4905 = class74.field1004.method505((byte) -110) - var12;
                                        var55.field4911 = class74.field1004.method501(99) - var13;
                                        var55.field4908 = var11.field2520;
                                        class453.field6703.method2504(42, var55);
                                    }
                                }
                                if (var11.field2591 != null) {
                                    class327 var56 = new class327();
                                    var56.field4909 = var11;
                                    var56.field4908 = var11.field2591;
                                    class212.field3185.method2504(42, var56);
                                }
                                if (var11.field2596 != null && class121.field1598 > var11.field2507) {
                                    if (var11.field2498 == null || class121.field1598 - var11.field2507 > 32) {
                                        class327 var61 = new class327();
                                        var61.field4909 = var11;
                                        var61.field4908 = var11.field2596;
                                        class431.field6330.method2504(42, var61);
                                    } else {
                                        label672: for (int var57 = var11.field2507; var57 < class121.field1598; var57++) {
                                            int var58 = class438.field6453[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field2498.length; var59++) {
                                                if (var11.field2498[var59] == var58) {
                                                    class327 var60 = new class327();
                                                    var60.field4909 = var11;
                                                    var60.field4908 = var11.field2596;
                                                    class431.field6330.method2504(42, var60);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2507 = class121.field1598;
                                }
                                if (var11.field2502 != null && class341.field5084 > var11.field2566) {
                                    if (var11.field2569 == null || class341.field5084 - var11.field2566 > 32) {
                                        class327 var66 = new class327();
                                        var66.field4909 = var11;
                                        var66.field4908 = var11.field2502;
                                        class431.field6330.method2504(42, var66);
                                    } else {
                                        label648: for (int var62 = var11.field2566; var62 < class341.field5084; var62++) {
                                            int var63 = class315.field4773[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field2569.length; var64++) {
                                                if (var11.field2569[var64] == var63) {
                                                    class327 var65 = new class327();
                                                    var65.field4909 = var11;
                                                    var65.field4908 = var11.field2502;
                                                    class431.field6330.method2504(42, var65);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2566 = class341.field5084;
                                }
                                if (var11.field2546 != null && class463.field6825 > var11.field2613) {
                                    if (var11.field2509 == null || class463.field6825 - var11.field2613 > 32) {
                                        class327 var71 = new class327();
                                        var71.field4909 = var11;
                                        var71.field4908 = var11.field2546;
                                        class431.field6330.method2504(42, var71);
                                    } else {
                                        label624: for (int var67 = var11.field2613; var67 < class463.field6825; var67++) {
                                            int var68 = class463.field6824[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field2509.length; var69++) {
                                                if (var11.field2509[var69] == var68) {
                                                    class327 var70 = new class327();
                                                    var70.field4909 = var11;
                                                    var70.field4908 = var11.field2546;
                                                    class431.field6330.method2504(42, var70);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2613 = class463.field6825;
                                }
                                if (var11.field2611 != null && class184.field2776 > var11.field2505) {
                                    if (var11.field2624 == null || class184.field2776 - var11.field2505 > 32) {
                                        class327 var76 = new class327();
                                        var76.field4909 = var11;
                                        var76.field4908 = var11.field2611;
                                        class431.field6330.method2504(42, var76);
                                    } else {
                                        label600: for (int var72 = var11.field2505; var72 < class184.field2776; var72++) {
                                            int var73 = class53.field719[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field2624.length; var74++) {
                                                if (var11.field2624[var74] == var73) {
                                                    class327 var75 = new class327();
                                                    var75.field4909 = var11;
                                                    var75.field4908 = var11.field2611;
                                                    class431.field6330.method2504(42, var75);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2505 = class184.field2776;
                                }
                                if (var11.field2492 != null && class30.field381 > var11.field2506) {
                                    if (var11.field2605 == null || class30.field381 - var11.field2506 > 32) {
                                        class327 var81 = new class327();
                                        var81.field4909 = var11;
                                        var81.field4908 = var11.field2492;
                                        class431.field6330.method2504(42, var81);
                                    } else {
                                        label576: for (int var77 = var11.field2506; var77 < class30.field381; var77++) {
                                            int var78 = class401.field5976[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field2605.length; var79++) {
                                                if (var11.field2605[var79] == var78) {
                                                    class327 var80 = new class327();
                                                    var80.field4909 = var11;
                                                    var80.field4908 = var11.field2492;
                                                    class431.field6330.method2504(42, var80);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2506 = class30.field381;
                                }
                                if (class153.field2105 > var11.field2486 && var11.field2487 != null) {
                                    class327 var82 = new class327();
                                    var82.field4909 = var11;
                                    var82.field4908 = var11.field2487;
                                    class431.field6330.method2504(42, var82);
                                }
                                if (class72.field958 > var11.field2486 && var11.field2612 != null) {
                                    class327 var83 = new class327();
                                    var83.field4909 = var11;
                                    var83.field4908 = var11.field2612;
                                    class431.field6330.method2504(42, var83);
                                }
                                if (class243.field3650 > var11.field2486 && var11.field2588 != null) {
                                    class327 var84 = new class327();
                                    var84.field4909 = var11;
                                    var84.field4908 = var11.field2588;
                                    class431.field6330.method2504(42, var84);
                                }
                                if (class146.field2032 > var11.field2486 && var11.field2479 != null) {
                                    class327 var85 = new class327();
                                    var85.field4909 = var11;
                                    var85.field4908 = var11.field2479;
                                    class431.field6330.method2504(42, var85);
                                }
                                if (class277.field4212 > var11.field2486 && var11.field2603 != null) {
                                    class327 var86 = new class327();
                                    var86.field4909 = var11;
                                    var86.field4908 = var11.field2603;
                                    class431.field6330.method2504(42, var86);
                                }
                                var11.field2486 = class172.field2639;
                                if (var11.field2602 != null) {
                                    for (int var87 = 0; var87 < class296.field4495; var87++) {
                                        class327 var88 = new class327();
                                        var88.field4909 = var11;
                                        var88.field4917 = class43.field542[var87].method1067(54);
                                        var88.field4914 = class43.field542[var87].method1070((byte) -100);
                                        var88.field4908 = var11.field2602;
                                        class431.field6330.method2504(42, var88);
                                    }
                                }
                                if (class344.field5146 && var11.field2556 != null) {
                                    class327 var89 = new class327();
                                    var89.field4909 = var11;
                                    var89.field4908 = var11.field2556;
                                    class431.field6330.method2504(42, var89);
                                }
                            }
                            if (var11.field2558 == 5 && var11.field2597 != -1) {
                                var11.method1045(805095472).method774(-74, var11.field2501, class196.field2965);
                            }
                            class437.method2682(var11, 125);
                            if (var11.field2558 == 0) {
                                method2792(arg0, var11.field2525, var14, var15, var16, var17, var12 - var11.field2521, var13 - var11.field2559, arg8, arg9);
                                if (var11.field2625 != null) {
                                    method2792(var11.field2625, var11.field2525, var14, var15, var16, var17, var12 - var11.field2521, var13 - var11.field2559, arg8, arg9);
                                }
                                class333 var90 = (class333) class308.field4647.method2302((long) var11.field2525, 23576);
                                if (var90 != null) {
                                    if (class88.field1254 == class466.field6855 && var90.field4962 == 0 && !class306.field4628 && var21 && !class120.field1586) {
                                        class447.method2758(0);
                                    }
                                    class450.method2771(var12, var90.field4965, arg8, var16, -1, var17, arg9, var15, var14, var13);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class437.method2682(var11, 110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method2793(int arg0) {
        if (arg0 != 11837) {
            method2789(false, (Object) null, (byte) -85);
        }
        field6660++;
        boolean var2 = class8.field92.method296(true);
        if (!var2) {
            this.method2791((byte) 30);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2794() {
        for (int var0 = 0; var0 < class115.field1522; var0++) {
            int[] var1 = class99.field1363[var0];
            for (int var2 = 0; var2 < class198.field3004; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method2795(int arg0) {
        class342.field5118++;
        if (arg0 != 19719) {
            method2798();
        }
        field6679++;
        class145.method912((class170) null, -1, -1, (byte) -16);
        class398.method2518(1, -1, (class170) null, -1);
        class168.method1024(arg0 ^ 0xFFFFB2F3);
        class172.field2639++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class155 var12 = class170.field2626[var2];
            if (var12 != null) {
                byte var13 = var12.field2137.field4095;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method911(0);
                    if ((var13 & 0x2) != 0 && var12.field2013 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field2019[0] + var15;
                            int var18 = var12.field2018[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class115.field1522 - var14 - 1) {
                                var17 = class115.field1522 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class198.field3004 - var14 - 1) < var18) {
                                var18 = class198.field3004 - var14 - 1;
                            }
                            int var19 = class265.method1641(var18, var14, class465.field6846, var14, class177.field2682, var17, var14, class449.field6599[var12.field1902], 0, -1, true, var12.field2018[0], 0, var12.field2019[0], (byte) -65);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field2019[var20] = class177.field2682[var19 - var20 - 1];
                                    var12.field2018[var20] = class465.field6846[var19 - var20 - 1];
                                    var12.field2020[var20] = 1;
                                }
                                var12.field2013 = var19;
                            }
                        }
                    }
                    class51.method301((byte) -128, true, var12);
                    int var21 = class456.method2832((byte) 33, var12);
                    class387.method2387((byte) 52, class331.field4949, var12, class126.field1617, var21);
                    class187.method1138(var12, -8079);
                }
            }
        }
        if (class6.field67 == 0 && class426.field6269 == 0) {
            if (class80.field1054 == 2) {
                class137.method863(arg0 ^ 0xD07);
            } else {
                class172.method1059(1);
            }
            if (class185.field2790 >> 7 < 14 || (class185.field2790 >> 7) >= (class115.field1522 - 14) || (class196.field2967 >> 7) < 14 || class198.field3004 - 14 <= class196.field2967 >> 7) {
                class135.method846(arg0 ^ 0x4D4F);
            }
        }
        while (true) {
            class327 var3;
            class170 var4;
            class170 var5;
            do {
                var3 = (class327) class212.field3185.method2509(false);
                if (var3 == null) {
                    while (true) {
                        class327 var6;
                        class170 var7;
                        class170 var8;
                        do {
                            var6 = (class327) class453.field6703.method2509(false);
                            if (var6 == null) {
                                while (true) {
                                    class327 var9;
                                    class170 var10;
                                    class170 var11;
                                    do {
                                        var9 = (class327) class431.field6330.method2509(false);
                                        if (var9 == null) {
                                            if (class14.field173 != null) {
                                                class17.method119(-36);
                                            }
                                            if ((class26.field332 % 1500) == 0) {
                                                class21.method140(-3);
                                            }
                                            class116.method698((byte) 102);
                                            if (class26.field346 && (class445.method2750(-27580) - 60000L) > class250.field3749) {
                                                class5.method46((byte) -120);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field4909;
                                        if (var10.field2511 < 0) {
                                            break;
                                        }
                                        var11 = class168.method1020(var10.field2474, (byte) 77);
                                    } while (var11 == null || var11.field2625 == null || var10.field2511 >= var11.field2625.length || var11.field2625[var10.field2511] != var10);
                                    class384.method2316(var9);
                                }
                            }
                            var7 = var6.field4909;
                            if (var7.field2511 < 0) {
                                break;
                            }
                            var8 = class168.method1020(var7.field2474, (byte) 93);
                        } while (var8 == null || var8.field2625 == null || var8.field2625.length <= var7.field2511 || var8.field2625[var7.field2511] != var7);
                        class384.method2316(var6);
                    }
                }
                var4 = var3.field4909;
                if (var4.field2511 < 0) {
                    break;
                }
                var5 = class168.method1020(var4.field2474, (byte) 76);
            } while (var5 == null || var5.field2625 == null || var5.field2625.length <= var4.field2511 || var5.field2625[var4.field2511] != var4);
            class384.method2316(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfh;)Lvo;")
    public static final class312 method2796(class170 arg0) {
        class312 var1 = (class312) class80.field1050.method2302(((long) arg0.field2525 << 32) + (long) arg0.field2511, 23576);
        return var1 == null ? arg0.field2480 : var1;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method2797(int arg0) {
        int var1 = class307.field4634;
        int[] var2 = class201.field3038;
        int var3 = class71.field932 ? var1 : class38.field458 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class145 var5;
            if (var4 < var1) {
                var5 = class140.field1883[var2[var4]];
            } else {
                var5 = class170.field2626[class87.field1235[var4 - var1]];
            }
            if (var5.field1902 == arg0) {
                var5.field2008 = 0;
                if (var5.field1994 < 0) {
                    var5.field1942 = false;
                } else {
                    int var6 = var5.method911(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1900 & 0x7F) != 0 || (var5.field1892 & 0x7F) != 0) {
                            var5.field1942 = false;
                            continue;
                        }
                    } else if ((var5.field1900 & 0x7F) != 64 || (var5.field1892 & 0x7F) != 64) {
                        var5.field1942 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1900 >> 7;
                        int var8 = var5.field1892 >> 7;
                        if (class99.field1363[var7][var8] != var5.field1994) {
                            var5.field1942 = true;
                            continue;
                        }
                        if (class119.field1571[var7][var8] > 1) {
                            var10002 = class119.field1571[var7][var8]--;
                            var5.field1942 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1900 - var9 >> 7;
                        int var11 = var5.field1892 - var9 >> 7;
                        int var12 = var5.field1900 + var9 >> 7;
                        int var13 = var5.field1892 + var9 >> 7;
                        if (!class416.method2598(var12, var10, -2, var13, var5.field1994, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class99.field1363[var14][var15] == var5.field1994) {
                                        var10002 = class119.field1571[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1942 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class169 && var5.field2016 != null && class26.field332 >= var5.field2016.field466 && class26.field332 < var5.field2016.field471) {
                        ((class169) var5).field2448 = false;
                    }
                    var5.field1942 = false;
                    var5.field1888 = class437.method2686(var5.field1902, 0, var5.field1892, var5.field1900);
                    class50.method287(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2798() {
        int var0 = class307.field4634;
        int[] var1 = class201.field3038;
        boolean var2 = class452.field6683 == 1 && var0 > 200 || class452.field6683 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class169 var12 = class140.field1883[var1[var3]];
            if (var12.method1034((byte) 106)) {
                var12.method489(28155);
                if (var12.field1895 >= 0 && var12.field1901 >= 0 && var12.field1890 < class115.field1522 && var12.field1889 < class198.field3004) {
                    var12.field2448 = var12.field1933 ? var2 : false;
                    if (class113.field1500 == var12) {
                        var12.field1994 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1942) {
                            var13++;
                        }
                        if (var12.field1981 > class26.field332) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method911(0) << 2);
                        if (class5.field62 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field1994 = var14 + 1;
                    }
                } else {
                    var12.field1994 = -1;
                }
            } else {
                var12.field1994 = -1;
            }
        }
        for (int var4 = 0; var4 < class38.field458; var4++) {
            class155 var9 = class170.field2626[class87.field1235[var4]];
            if (var9.method963((byte) 56) && var9.field2137.method1683(-1)) {
                var9.method489(28155);
                if (var9.field1895 >= 0 && var9.field1901 >= 0 && var9.field1890 < class115.field1522 && var9.field1889 < class198.field3004) {
                    int var10 = 0;
                    if (!var9.field1942) {
                        var10++;
                    }
                    if (var9.field1981 > class26.field332) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method911(0) << 2);
                    if (class5.field62 == 0) {
                        if (var9.field2137.field4143) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class5.field62 == 1) {
                        if (var9.field2137.field4143) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field2137.field4146) {
                        var11 += 512;
                    } else if (!var9.field2137.field4145) {
                        var11 += 256;
                    }
                    var9.field1994 = var11 + 1;
                } else {
                    var9.field1994 = -1;
                }
            } else {
                var9.field1994 = -1;
            }
        }
        for (int var5 = 0; var5 < class55.field744.length; var5++) {
            class8 var6 = class55.field744[var5];
            if (var6 != null) {
                if (var6.field85 == 1) {
                    class155 var7 = class170.field2626[var6.field79];
                    if (var7 != null && var7.field1994 >= 0) {
                        var7.field1994 += 1024;
                    }
                } else if (var6.field85 == 10) {
                    class169 var8 = class140.field1883[var6.field79];
                    if (var8 != null && var8.field1994 >= 0) {
                        var8.field1994 += 1024;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    private final void method2799(int arg0, boolean arg1) {
        class386.field5702 = null;
        field6674++;
        class443.field6521 = null;
        if (arg1) {
            main((String[]) null);
        }
        class8.field92.field669 = arg0;
        class259.field3961 = 0;
        class8.field92.field671++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2800() {
        int var0 = class307.field4634;
        int[] var1 = class201.field3038;
        int var2 = class71.field932 ? var0 : class38.field458 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class145 var4;
            if (var3 < var0) {
                var4 = class140.field1883[var1[var3]];
            } else {
                var4 = class170.field2626[class87.field1235[var3 - var0]];
            }
            if (var4.field1994 >= 0) {
                int var5 = var4.method911(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1900 & 0x7F) == 0 && (var4.field1892 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1900 & 0x7F) == 64 && (var4.field1892 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class169 && var4.field2016 != null && class26.field332 >= var4.field2016.field466 && class26.field332 < var4.field2016.field471) {
                    ((class169) var4).field2448 = false;
                }
                var4.field1888 = class437.method2686(var4.field1902, 0, var4.field1892, var4.field1900);
                class50.method287(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method2801(int arg0) {
        int var1 = class307.field4634;
        int[] var2 = class201.field3038;
        for (int var3 = 0; var3 < class38.field458 + var1; var3++) {
            class145 var4;
            if (var3 < var1) {
                var4 = class140.field1883[var2[var3]];
            } else {
                var4 = class170.field2626[class87.field1235[var3 - var1]];
            }
            if (var4.field1902 == arg0 && var4.field1994 >= 0) {
                int var5 = var4.method911(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1900 & 0x7F) != 0 || (var4.field1892 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1900 & 0x7F) != 64 || (var4.field1892 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1900 >> 7;
                    int var7 = var4.field1892 >> 7;
                    if (var4.field1994 > class99.field1363[var6][var7]) {
                        class99.field1363[var6][var7] = var4.field1994;
                        class119.field1571[var6][var7] = 1;
                    } else if (class99.field1363[var6][var7] == var4.field1994) {
                        var10002 = class119.field1571[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1900 - var8 >> 7;
                    int var10 = var4.field1892 - var8 >> 7;
                    int var11 = var4.field1900 + var8 >> 7;
                    int var12 = var4.field1892 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1994 > class99.field1363[var13][var14]) {
                                class99.field1363[var13][var14] = var4.field1994;
                                class119.field1571[var13][var14] = 1;
                            } else if (class99.field1363[var13][var14] == var4.field1994) {
                                var10002 = class119.field1571[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field6677++;
        if (!this.method788(113)) {
            return;
        }
        class45.field563 = Integer.parseInt(this.getParameter("worldid"));
        class454.field6750 = Integer.parseInt(this.getParameter("modewhere"));
        if (class454.field6750 < 0 || class454.field6750 > 1) {
            class454.field6750 = 0;
        }
        class265.field4046 = Integer.parseInt(this.getParameter("modewhat"));
        if (class265.field4046 < 0 || class265.field4046 > 2) {
            class265.field4046 = 0;
        }
        try {
            class27.field356 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class27.field356 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class355.field5242 = true;
        } else {
            class355.field5242 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class120.field1585 = true;
        } else {
            class120.field1585 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class87.field1227 = true;
        } else {
            class87.field1227 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class466.field6855 = class17.field253;
        } else {
            class466.field6855 = class88.field1254;
        }
        try {
            class240.field3600 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class240.field3600 = 0;
        }
        class355.field5247 = this.getParameter("quiturl");
        class54.field730 = this.getParameter("settings");
        if (class54.field730 == null) {
            class54.field730 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class462.field6820 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class462.field6820 = 0;
            }
        }
        class405.field6021 = Integer.parseInt(this.getParameter("colourid"));
        if (class405.field6021 < 0 || class405.field6021 >= class253.field3864.length) {
            class405.field6021 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class455.field6757 = true;
            class426.field6266 = true;
        }
        if (class88.field1254 == class466.field6855) {
            class68.field886 = 765;
            class88.field1262 = 503;
        } else if (class466.field6855 == class17.field253) {
            class88.field1262 = 480;
            class68.field886 = 640;
        }
        class68.field876 = this;
        this.method805(class265.field4046 + 32, (byte) -107, class68.field886, class88.field1262, 570);
    }
}

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
public class client extends class448 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/String;")
    public static String field2346 = "yellow:";

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field2344 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 3)
    private final void method1094(byte[] arg0, byte arg1) {
        field2342++;
        class371 var3 = new class371(arg0);
        if (arg1 != 63) {
            return;
        }
        while (true) {
            while (true) {
                int var4 = var3.method2429(arg1 ^ 0x3F);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class48.field735 = new int[6];
                    var5[0] = var3.method2403((byte) 101);
                    var5[1] = var3.method2403((byte) 72);
                    var5[2] = var3.method2403((byte) 115);
                    var5[3] = var3.method2403((byte) 99);
                    var5[4] = var3.method2403((byte) 95);
                    var5[5] = var3.method2403((byte) 123);
                } else if (var4 == 4) {
                    int var6 = var3.method2429(arg1 ^ 0x3F);
                    class76.field1179 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class76.field1179[var7] = var3.method2403((byte) 91);
                        if (class76.field1179[var7] == 65535) {
                            class76.field1179[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 66)
    public static final void method1095() {
        for (int var0 = -1; var0 < class71.field1096 + class169.field2407; var0++) {
            class61 var1;
            if (var0 < 0) {
                var1 = class307.field4211;
            } else if (var0 < class169.field2407) {
                var1 = class12.field153[class67.field1055[var0]];
            } else {
                var1 = class445.field6422[class280.field3837[var0 - class169.field2407]];
            }
            if (var1.field855 >= 0) {
                int var2 = var1.method410((byte) 110);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field6197 & 0x7F) != 0 || (var1.field6192 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field6197 & 0x7F) != 64 || (var1.field6192 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field6197 >> 7;
                    int var4 = var1.field6192 >> 7;
                    if (var1.field855 > class262.field3580[var3][var4]) {
                        class262.field3580[var3][var4] = var1.field855;
                        class14.field170[var3][var4] = 1;
                    } else if (class262.field3580[var3][var4] == var1.field855) {
                        var10002 = class14.field170[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field6197 - var5 >> 7;
                    int var7 = var1.field6192 - var5 >> 7;
                    int var8 = var1.field6197 + var5 >> 7;
                    int var9 = var1.field6192 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field855 > class262.field3580[var10][var11]) {
                                class262.field3580[var10][var11] = var1.field855;
                                class14.field170[var10][var11] = 1;
                            } else if (class262.field3580[var10][var11] == var1.field855) {
                                var10002 = class14.field170[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 163)
    private final void method1096(int arg0) {
        if (!class198.field2742) {
            label227: while (true) {
                do {
                    if (!class258.method1594((byte) 121)) {
                        break label227;
                    }
                } while (class215.field2859 != 's' && class215.field2859 != 'S');
                class198.field2742 = true;
            }
        }
        field2327++;
        if (class354.field4991 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class224.method1425(-26805);
            if (class426.field6107 == 0L) {
                class426.field6107 = var4;
            }
            if (var3 > 16384 && (var4 - class426.field6107) < 5000L) {
                if ((var4 - class435.field6252) > 1000L) {
                    System.gc();
                    class435.field6252 = var4;
                }
                class293.field4054 = 5;
                class276.field3743 = class129.field1814;
            } else {
                class276.field3743 = class371.field5287;
                class354.field4991 = 10;
                class293.field4054 = 5;
            }
        } else if (class354.field4991 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class24.field326[var6] = class260.method1603(arg0 + 110, class432.field6220, class267.field3646);
            }
            class276.field3743 = class141.field2012;
            class293.field4054 = 10;
            class354.field4991 = 20;
        } else if (class354.field4991 == 20) {
            if (class125.field1746 == null) {
                class125.field1746 = new class167(class296.field4115, class450.field6541);
            }
            if (class125.field1746.method1131(-5)) {
                class215.field2861 = class257.method1571(true, false, 0, true, 1);
                class169.field2411 = class257.method1571(true, false, 1, true, 1);
                class287.field3989 = class257.method1571(true, false, 2, true, 1);
                class163.field2282 = class257.method1571(true, false, 3, true, 1);
                class367.field5152 = class257.method1571(true, false, 4, true, 1);
                class215.field2857 = class257.method1571(true, true, 5, true, 1);
                class331.field4488 = class257.method1571(true, true, 6, false, 1);
                class387.field5645 = class257.method1571(true, false, 7, true, 1);
                class353.field4943 = class257.method1571(true, false, 8, true, 1);
                class271.field3704 = class257.method1571(true, false, 9, true, 1);
                class33.field516 = class257.method1571(true, false, 10, true, 1);
                class169.field2412 = class257.method1571(true, false, 11, true, 1);
                class146.field2121 = class257.method1571(true, false, 12, true, 1);
                class435.field6251 = class257.method1571(true, false, 13, true, 1);
                class82.field1265 = class257.method1571(true, false, 14, false, 1);
                class5.field85 = class257.method1571(true, false, 15, true, 1);
                class2.field16 = class257.method1571(true, false, 16, true, 1);
                class265.field3618 = class257.method1571(true, false, 17, true, 1);
                class3.field33 = class257.method1571(true, false, 18, true, 1);
                class109.field1612 = class257.method1571(true, false, 19, true, 1);
                class34.field533 = class257.method1571(true, false, 20, true, 1);
                class408.field5923 = class257.method1571(true, false, 21, true, 1);
                class364.field5108 = class257.method1571(true, false, 22, true, 1);
                class441.field6379 = class257.method1571(true, true, 23, true, 1);
                class368.field5161 = class257.method1571(true, false, 24, true, 1);
                class431.field6200 = class257.method1571(true, false, 25, true, 1);
                class179.field2502 = class257.method1571(true, true, 26, true, 1);
                class229.field3049 = class257.method1571(true, false, 27, true, 1);
                class190.field2638 = class257.method1571(true, true, 28, true, 1);
                class276.field3743 = class234.field3184;
                class293.field4054 = 15;
                class354.field4991 = 30;
            } else {
                class276.field3743 = class55.field807;
                class293.field4054 = 12;
            }
        } else if (class354.field4991 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class31.field486[var8].method2816(255) * class209.field2818[var8] / 100;
            }
            if (var7 == 100) {
                class293.field4054 = 20;
                class276.field3743 = class44.field678;
                class210.method1363(false, class353.field4943);
                class390.method2553(class353.field4943, (byte) -120);
                class354.field4991 = 40;
            } else {
                class293.field4054 = 20;
                if (var7 != 0) {
                    class276.field3743 = class189.field2622 + var7 + "%";
                }
            }
        } else if (class354.field4991 == 40) {
            if (class190.field2638.method1903((byte) 82)) {
                this.method1094(class190.field2638.method1904(1, arg0 ^ 0xFF), (byte) 63);
                class293.field4054 = 25;
                class354.field4991 = 50;
                class276.field3743 = class146.field2119;
            } else {
                class276.field3743 = class81.field1252 + class190.field2638.method1896(-5142) + "%";
                class293.field4054 = 25;
            }
        } else if (class354.field4991 == 50) {
            class217.method1384(class267.field3639, 22050, 2, arg0 ^ 0x713F);
            class108.field1600 = new class25();
            class108.field1600.method206(9, (byte) 50, 128);
            class326.field4451 = class67.method458(1, 22050, 0, class204.field2772, class41.field617);
            class326.field4451.method1476((byte) 23, class108.field1600);
            class218.method1385(class82.field1265, class108.field1600, false, class367.field5152, class5.field85);
            class64.field993 = class67.method458(arg0 + 1, 2048, 1, class204.field2772, class41.field617);
            class252.field3467 = new class128();
            class64.field993.method1476((byte) 23, class252.field3467);
            class300.field4158 = new class28(22050, class327.field4473);
            class221.field2915 = class331.field4488.method1914(arg0 - 1, "scape main");
            class293.field4054 = 30;
            class276.field3743 = class34.field537;
            class354.field4991 = 60;
        } else if (class354.field4991 == 60) {
            int var9 = class170.method1146(class353.field4943, (byte) -76, class435.field6251);
            int var10 = class362.method2331(-87);
            if (var10 > var9) {
                class276.field3743 = class379.field5396 + var9 * 100 / var10 + "%";
                class293.field4054 = 35;
            } else {
                class293.field4054 = 35;
                class276.field3743 = class118.field1694;
                class354.field4991 = 70;
            }
        } else if (class354.field4991 == 70) {
            int var11 = class362.method2335((byte) -40, class353.field4943);
            int var12 = class312.method1975(-1);
            if (var11 < var12) {
                class276.field3743 = class423.field6091 + var11 * 100 / var12 + "%";
                class293.field4054 = 40;
            } else {
                class276.field3743 = class448.field6451;
                class293.field4054 = 40;
                class354.field4991 = 80;
            }
        } else if (class354.field4991 == 80) {
            if (class179.field2502.method1903((byte) 82)) {
                class65.field1027 = new class89(class179.field2502, class271.field3704, class353.field4943);
                class276.field3743 = class144.field2093;
                class354.field4991 = 90;
                class293.field4054 = 45;
            } else {
                class276.field3743 = class191.field2659 + class179.field2502.method1896(-5142) + "%";
                class293.field4054 = 45;
            }
        } else if (class354.field4991 == 90) {
            class354.field4991 = 95;
            class276.field3743 = class300.field4161;
            class293.field4054 = 50;
        } else if (class354.field4991 == 95) {
            if (class198.field2742) {
                class129.field1800 = 0;
                class410.field5960 = 0;
                class152.field2153 = 1;
                class67.field1056 = 0;
                class28.field448 = 0;
            }
            class198.field2742 = true;
            class29.method228(-109, class204.field2772);
            class1.method1((byte) 94);
            class152.method1030(9977, false, class28.field448);
            class354.field4991 = 100;
            class293.field4054 = 55;
            class276.field3743 = class189.field2620;
        } else if (class354.field4991 == 100) {
            class266.method1651(class353.field4943, 0, class435.field6251, class408.field5920);
            class293.field4054 = 60;
            class276.field3743 = class290.field4012;
            class312.method1977(5, (byte) -97);
            class354.field4991 = 110;
        } else if (class354.field4991 == 110) {
            byte var13 = 0;
            class287.field3989.method1903((byte) 82);
            int var14 = var13 + class287.field3989.method1896(-5142);
            class2.field16.method1903((byte) 82);
            int var15 = var14 + class2.field16.method1896(-5142);
            class265.field3618.method1903((byte) 82);
            int var16 = var15 + class265.field3618.method1896(-5142);
            class3.field33.method1903((byte) 82);
            int var17 = var16 + class3.field33.method1896(-5142);
            class109.field1612.method1903((byte) 82);
            int var18 = var17 + class109.field1612.method1896(-5142);
            class34.field533.method1903((byte) 82);
            int var19 = var18 + class34.field533.method1896(-5142);
            class408.field5923.method1903((byte) 82);
            int var20 = var19 + class408.field5923.method1896(-5142);
            class364.field5108.method1903((byte) 82);
            int var21 = var20 + class364.field5108.method1896(arg0 ^ 0xFFFFEBEA);
            class368.field5161.method1903((byte) 82);
            int var22 = var21 + class368.field5161.method1896(-5142);
            class431.field6200.method1903((byte) 82);
            int var23 = var22 + class431.field6200.method1896(-5142);
            class229.field3049.method1903((byte) 82);
            int var24 = var23 + class229.field3049.method1896(-5142);
            if (var24 < 1100) {
                class293.field4054 = 65;
                class276.field3743 = class218.field2880 + var24 / 11 + "%";
            } else {
                class289.method1866(class287.field3989, arg0 - 19253);
                class403.method2597(true, class287.field3989);
                class398.method2576(class287.field3989, (byte) -54);
                class285.method1842(class287.field3989, 3, class387.field5645);
                class165.method1123(class2.field16, -229100319, true, class387.field5645);
                class108.method728(0, class387.field5645, true, class3.field33);
                class387.method2534(class109.field1612, true, arg0 ^ 0x1D, class387.field5645);
                class142.method971(-6480, class287.field3989);
                class66.method452((byte) 123, class215.field2861, class34.field533, class169.field2411);
                class301.method1940((byte) -128, class287.field3989);
                class192.method1270(class408.field5923, arg0 ^ 0xFFFFFFB3, class387.field5645);
                class125.method835(-22496, class364.field5108);
                class124.method826(class287.field3989, 31666);
                class198.method1324(class387.field5645, class163.field2282, class353.field4943, -1, class435.field6251);
                class347.method2229(class287.field3989, arg0 ^ 0xE0);
                class68.method462(true, class265.field3618);
                class275.method1689(new class298(), class368.field5161, class431.field6200, (byte) 19);
                class34.method250(class368.field5161, true, class431.field6200);
                class286.method1847(true, class287.field3989);
                class394.method2561(class287.field3989, -126);
                class267.method1653((byte) 11, class287.field3989);
                class144.method983(arg0 + 12, class353.field4943, class287.field3989);
                class409.method2625(class287.field3989, class353.field4943, 0);
                class270.method1661(class287.field3989, arg0 + 43);
                class281.method1775(3827, class287.field3989, class353.field4943);
                class30.method231(-3624, class287.field3989);
                class339.method2180((byte) -19, class287.field3989);
                class276.field3743 = class266.field3634;
                class293.field4054 = 65;
                class24.method164(25256);
                class354.field4991 = 120;
            }
        } else if (class354.field4991 == 120) {
            int var25 = class44.method314((byte) -56, class353.field4943);
            int var26 = class305.method1943(11503);
            if (var26 > var25) {
                class276.field3743 = class309.field4239 + var25 * 100 / var26 + "%";
                class293.field4054 = 70;
            } else {
                class64.method433(class408.field5920, class353.field4943, 16568);
                class30.method232(class140.field1992, -71);
                class276.field3743 = class155.field2193;
                class354.field4991 = 130;
                class293.field4054 = 70;
            }
        } else if (class354.field4991 == 130) {
            class60.field851 = new class264();
            class204.field2772.method2261(10, arg0 + 29171, class60.field851);
            class293.field4054 = 75;
            class276.field3743 = class290.field4005;
            class354.field4991 = 140;
        } else {
            if (arg0 != 0) {
                field2328 = 34;
            }
            if (class354.field4991 == 140) {
                if (class33.field516.method1889((byte) 6, "", "huffman")) {
                    class293 var27 = new class293(class33.field516.method1892("huffman", false, ""));
                    class377.method2463(var27, 2);
                    class354.field4991 = 150;
                    class276.field3743 = class24.field334;
                    class293.field4054 = 80;
                } else {
                    class276.field3743 = class109.field1606 + "0%";
                    class293.field4054 = 80;
                }
            } else if (class354.field4991 == 150) {
                if (!class163.field2282.method1903((byte) 82)) {
                    class276.field3743 = class97.field1478 + class163.field2282.method1896(arg0 - 5142) * 3 / 4 + "%";
                    class293.field4054 = 85;
                } else if (!class146.field2121.method1903((byte) 82)) {
                    class276.field3743 = class97.field1478 + (class146.field2121.method1896(arg0 - 5142) / 10 + 75) + "%";
                    class293.field4054 = 85;
                } else if (!class435.field6251.method1903((byte) 82)) {
                    class276.field3743 = class97.field1478 + (class435.field6251.method1896(-5142) / 20 + 85) + "%";
                    class293.field4054 = 85;
                } else if (class441.field6379.method1906("details", 124)) {
                    class42.method300(class441.field6379);
                    class290.method1873(-112, class229.field3049);
                    class97.method690(class65.field1027, class387.field5645, (byte) -33);
                    class276.field3743 = class409.field5942;
                    class354.field4991 = 160;
                    class293.field4054 = 85;
                } else {
                    class276.field3743 = class97.field1478 + (class441.field6379.method1913("details", false) / 10 + 90) + "%";
                    class293.field4054 = 85;
                }
            } else if (class354.field4991 == 160) {
                int var28 = class227.method1436((byte) 33);
                if (var28 == -1) {
                    class293.field4054 = 90;
                    class276.field3743 = class411.field5968;
                } else if (var28 == 7 || var28 == 9) {
                    this.method2792((byte) 99, "worldlistfull");
                    class312.method1977(1000, (byte) 67);
                } else if (class196.field2722) {
                    class293.field4054 = 90;
                    class276.field3743 = class72.field1108;
                    class354.field4991 = 170;
                } else {
                    this.method2792((byte) 92, "worldlistio_" + var28);
                    class312.method1977(1000, (byte) 55);
                }
            } else if (class354.field4991 == 170) {
                class220.field2890 = new int[class382.field5420];
                class97.field1505 = new String[class229.field3064];
                class137.field1958 = new boolean[class382.field5420];
                for (int var29 = 0; var29 < class382.field5420; var29++) {
                    if (class344.method2210(-95, var29).field25 == 0) {
                        class137.field1958[var29] = true;
                        class247.field3428++;
                    }
                    class220.field2890[var29] = -1;
                }
                class169.method1144((byte) 91);
                class142.field2048 = class163.field2282.method1914(-1, "loginscreen");
                class215.field2857.method1902(93, true, false);
                class331.field4488.method1902(113, true, true);
                class353.field4943.method1902(120, true, true);
                class435.field6251.method1902(arg0 + 92, true, true);
                class33.field516.method1902(105, true, true);
                class163.field2282.method1902(102, true, true);
                class347.field4870 = true;
                class287.field3989.field4113 = 2;
                class265.field3618.field4113 = 2;
                class2.field16.field4113 = 2;
                class3.field33.field4113 = 2;
                class109.field1612.field4113 = 2;
                class34.field533.field4113 = 2;
                class408.field5923.field4113 = 2;
                class365.method2347(-1, -31718, false, class152.field2153, -1);
                class354.field4991 = 180;
                class276.field3743 = class202.field2762;
                class293.field4054 = 95;
            } else if (class354.field4991 == 180) {
                class276.method1694(true, (byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 696)
    public final void method1097(int arg0) {
        field2337++;
        method1118((byte) -1);
        class411.method2631(false);
        class270.method1658(-16805);
        class448.method2794((byte) 88);
        class409.method2627(-94);
        class261.method1606(-126);
        class281.method1727((byte) 126);
        class264.method1632(-80);
        class451.method2822(2);
        class371.method2376(0);
        class258.method1583(8126);
        class341.method2191(1);
        class77.method554(127);
        class167.method1133(-128);
        class450.method2809(-1);
        class296.method1890(255);
        class423.method2674((byte) -48);
        class197.method1322((byte) -111);
        class190.method1253(false);
        class24.method168((byte) -21);
        class4.method32((byte) -128);
        class125.method832((byte) -1);
        class249.method1548((byte) -89);
        class145.method1000((byte) 122);
        class357.method2308((byte) -68);
        class383.method2512((byte) 0);
        class337.method2097(3008);
        class354.method2297(6587);
        class223.method1414((byte) 115);
        class196.method1302(2);
        class393.method2557(57);
        class327.method2056(15714);
        class16.method94(17958);
        class25.method186(109);
        class233.method1477(0);
        class28.method223(false);
        class412.method2638((byte) 121);
        class61.method404(false);
        class352.method2275(1);
        class142.method967(-83);
        class308.method1958(2155);
        class210.method1364(4);
        class432.method2715((byte) 10);
        class265.method1640(false);
        class220.method1395(true);
        class55.method373(true);
        class65.method445(0);
        class279.method1700(-88);
        class75.method496(3);
        class156.method1049(76);
        class260.method1602(24723);
        class107.method726(true);
        class407.method2613(-1);
        class307.method1953(false);
        class376.method2458((byte) -103);
        class120.method812(true);
        class390.method2554((byte) -99);
        class387.method2532(646);
        class7.method51((byte) 75);
        class12.method71((byte) 0);
        class40.method284((byte) 126);
        class126.method843(-22435);
        class99.method703(104);
        class366.method2351(9246);
        class141.method964(16000);
        class290.method1871(1024);
        class369.method2372(84);
        class78.method561((byte) -67);
        class44.method315(-1453);
        class433.method2719(23964);
        class169.method1140(3346);
        class221.method1409(true);
        class389.method2535(36);
        class272.method1675(false);
        class225.method1428(true);
        class1.method5(106);
        class310.method1962(-123);
        class162.method1079(1);
        class349.method2233((byte) 122);
        class217.method1383(121);
        class181.method1200(-28603);
        class309.method1959(20883);
        class323.method2039(-30175);
        class288.method1860((byte) 86);
        class215.method1378(0);
        class361.method2328(1);
        class31.method238((byte) -39);
        class248.method1546(115);
        class70.method477(1);
        class267.method1654((byte) -91);
        class263.method1622();
        class382.method2494(5000);
        class137.method940((byte) 38);
        class405.method2603(-28);
        class321.method2033((byte) -54);
        class13.method72((byte) 47);
        class381.method2485(128);
        class403.method2600(false);
        class111.method742();
        class42.method293();
        class132.method900(89);
        class173.method1168((byte) -45);
        class183.method1206();
        class29.method230(12);
        class46.method331((byte) 47);
        class301.method1939(118);
        class89.method606(-11602);
        class79.method566((byte) 57);
        class164.method1093((byte) 114);
        class64.method431(1648896848);
        class32.method244(-1);
        class305.method1948(-1);
        class447.method2786(-93);
        class6.method47(false);
        class168.method1137((byte) 33);
        class170.method1149((byte) -71);
        class91.method625((byte) 127);
        class339.method2176(22);
        class118.method799(-121);
        class36.method264(0);
        class312.method1972((byte) -122);
        class69.method471(0);
        class413.method2647(83);
        class414.method2654((byte) -115);
        class362.method2332(-112);
        class144.method990((byte) 33);
        class298.method1927(false);
        class257.method1573((byte) 127);
        class266.method1650(84);
        class236.method1484((byte) -107);
        class311.method1967((byte) -96);
        class374.method2450((byte) 112);
        class139.method957((byte) 59);
        class2.method9((byte) -45);
        class184.method1213(8912);
        class293.method1881(false);
        class34.method251(-16);
        class208.method1357(100);
        class138.method947(false);
        class314.method1996();
        class250.method1552(0);
        class66.method453((byte) -84);
        class275.method1690(1762);
        class410.method2628(-93);
        class84.method593(-1);
        class430.method2706(false);
        class43.method312((byte) 26);
        class300.method1934((byte) 86);
        class377.method2466(-116);
        class147.method1009();
        class171.method1154((byte) 34);
        class33.method249(-1);
        int var2 = 47 % ((arg0 + 3) / 60);
        class127.method847(453195655);
        class254.method1564(4);
        class81.method578((byte) -121);
        class218.method1387(0);
        class378.method2468(2);
        class294.method1882((byte) -42);
        class8.method56(false);
        class235.method1482((byte) -99);
        class124.method827((byte) -84);
        class313.method1984(196);
        class71.method481(false);
        class202.method1334(true);
        class322.method2038(3);
        class399.method2586((byte) -28);
        class398.method2570((byte) 105);
        class97.method687(-1);
        class188.method1235(64);
        class10.method65(20602);
        class182.method1204((byte) -118);
        class49.method345();
        class48.method341(-120);
        class395.method2564((byte) 95);
        class331.method2061(-102);
        class439.method2754(-1);
        class368.method2359((byte) -110);
        class176.method1179(0);
        class282.method1827(-1);
        class26.method214(-15392);
        class166.method1125(599);
        class20.method130(27647);
        class438.method2748(-5472);
        class155.method1044(-30444);
        class278.method1697(-12688);
        class429.method2700(89);
        class289.method1865((byte) -128);
        class346.method2221(12288);
        class343.method2202();
        class140.method958(14033);
        class179.method1191(115);
        class191.method1266(8224);
        class216.method1382(126);
        class418.method2663(16746);
        class344.method2209(81);
        class14.method78(-117);
        class231.method1446(121);
        class240.method1522((byte) -91);
        class109.method733(55);
        class364.method2342((byte) 115);
        class380.method2478();
        class73.method489(18002);
        class189.method1241((byte) 124);
        class237.method1492(-19593);
        class149.method1019(109);
        class129.method860((byte) -113);
        class35.method257(3737);
        class394.method2560(true);
        class201.method1331();
        class332.method2066();
        class442.method2764((byte) -115);
        class299.method1933(8);
        class350.method2235(125);
        class41.method285(-27278);
        class324.method2044(true);
        class424.method2675(118);
        class23.method150((byte) -100);
        class262.method1612(-1);
        class445.method2781(23613);
        class17.method97();
        class116.method763();
        class180.method1196(8);
        class108.method731(4);
        class187.method1228();
        class379.method2473((byte) -89);
        class436.method2732((byte) 43);
        class318.method2025((byte) 127);
        class58.method389((byte) -50);
        class286.method1851((byte) -48);
        class427.method2689((byte) 100);
        class271.method1669(false);
        class426.method2681(-5420);
        class76.method541((byte) -34);
        class446.method2783(-120);
        class287.method1854((byte) 107);
        class157.method1054(-31377);
        class431.method2711((byte) -110);
        class247.method1544(-14273);
        class54.method364(0);
        class359.method2321(-1);
        class115.method758(-3);
        class123.method822(7901);
        class401.method2591((byte) -86);
        class245.method1534((byte) -112);
        class86.method595(-127);
        class135.method937(1);
        class230.method1443((byte) 18);
        class57.method378(1);
        class336.method2091((byte) -111);
        class30.method234((byte) 118);
        class163.method1082((byte) 125);
        class198.method1325(true);
        class45.method318(-115);
        class353.method2287(115);
        class373.method2439(2);
        class252.method1556(-49);
        class243.method1526(-9857);
        class83.method586((byte) -22);
        class60.method393((byte) 110);
        class356.method2301(112);
        class276.method1696(6656);
        class143.method977((byte) -123);
        class259.method1600(16196);
        class146.method1003(-12362);
        class406.method2608((byte) 121);
        class333.method2071(-86);
        class227.method1438(29805);
        class204.method1339((byte) 9);
        class435.method2726(-112);
        class15.method86(0);
        class386.method2521(511);
        class214.method1375((byte) -32);
        class365.method2343(-107);
        class158.method1060(true);
        class419.method2664(93);
        class103.method712(-64);
        class408.method2617(false);
        class22.method146(96);
        class199.method1329(true);
        class62.method422(-125);
        class27.method216(-51);
        class5.method43(103);
        class67.method456(false);
        class3.method15((byte) 120);
        class367.method2356(-2049);
        class269.method1656((byte) -101);
        class239.method1515();
        class316.method2014();
        class105.method715(79);
        class113.method746((byte) 83);
        class441.method2763((byte) -34);
        class153.method1034(-29781);
        class213.method1371(-30600);
        class11.method68(true);
        class68.method468(20);
        class152.method1031((byte) -18);
        class358.method2315((byte) -30);
        class165.method1121((byte) 100);
        class326.method2049(128);
        class209.method1359(87);
        class234.method1479((byte) 104);
        class229.method1440(104);
        class72.method483((byte) -75);
        class206.method1346((byte) 43);
        class207.method1352(0);
        class434.method2725(-123);
        class82.method583(0);
        class53.method360((byte) -78);
        class194.method1288(134);
        class222.method1410(-80);
        class154.method1036((byte) 50);
        class280.method1716(true);
        class285.method1843((byte) -114);
        if (class448.field6490) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1019)
    public final void init() {
        field2338++;
        if (!this.method2796(10)) {
            return;
        }
        class435.field6243 = Integer.parseInt(this.getParameter("worldid"));
        class67.field1043 = Integer.parseInt(this.getParameter("modewhere"));
        if (class67.field1043 < 0 || class67.field1043 > 1) {
            class67.field1043 = 0;
        }
        class62.field975 = Integer.parseInt(this.getParameter("modewhat"));
        if (class62.field975 < 0 || class62.field975 > 2) {
            class62.field975 = 0;
        }
        try {
            class40.field608 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class40.field608 = 0;
        }
        class28.method219(32768, class40.field608);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class188.field2614 = true;
        } else {
            class188.field2614 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class318.field4370 = true;
        } else {
            class318.field4370 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class180.field2521 = 1;
        } else {
            class180.field2521 = 0;
        }
        try {
            class237.field3231 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class237.field3231 = 0;
        }
        class399.field5830 = this.getParameter("quiturl");
        class441.field6390 = this.getParameter("settings");
        if (class441.field6390 == null) {
            class441.field6390 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class406.field5913 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class406.field5913 = 0;
            }
        }
        class84.field1299 = Integer.parseInt(this.getParameter("colourid"));
        if (class84.field1299 < 0 || class84.field1299 >= class357.field5028.length) {
            class84.field1299 = 0;
        }
        class331.field4489 = this;
        this.method2799(503, 0, class62.field975 + 32, 765, 563);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1094)
    public static final void method1098() {
        for (int var0 = 0; var0 < class432.field6220; var0++) {
            int[] var1 = class262.field3580[var0];
            for (int var2 = 0; var2 < class267.field3646; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1111)
    private final void method1099(int arg0) {
        field2332++;
        if (class435.field6244 < class296.field4115.field4781) {
            if (class276.field3748 == class254.field3489) {
                class254.field3489 = class281.field3863;
            } else {
                class254.field3489 = class276.field3748;
            }
            class8.field124 = (class296.field4115.field4781 - 1) * 50 * 5;
            if (class8.field124 > 3000) {
                class8.field124 = 3000;
            }
            if (class296.field4115.field4781 >= 2 && class296.field4115.field4780 == 6) {
                this.method2792((byte) -78, "js5connect_outofdate");
                class79.field1220 = 1000;
                return;
            }
            if (class296.field4115.field4781 >= 4 && class296.field4115.field4780 == -1) {
                this.method2792((byte) 72, "js5crc");
                class79.field1220 = 1000;
                return;
            }
            if (class296.field4115.field4781 >= 4 && (class79.field1220 == 0 || class79.field1220 == 5)) {
                if (class296.field4115.field4780 == 7 || class296.field4115.field4780 == 9) {
                    this.method2792((byte) 121, "js5connect_full");
                } else if (class296.field4115.field4780 > 0) {
                    this.method2792((byte) 76, "js5connect");
                } else {
                    this.method2792((byte) -61, "js5io");
                }
                class79.field1220 = 1000;
                return;
            }
        }
        class435.field6244 = class296.field4115.field4781;
        if (class8.field124 > 0) {
            class8.field124--;
            return;
        }
        try {
            if (class362.field5086 == 0) {
                class165.field2358 = class204.field2772.method2239(class7.field115, class254.field3489, 0);
                class362.field5086++;
            }
            if (class362.field5086 == 1) {
                if (class165.field2358.field4068 == 2) {
                    this.method1110(1000, -114);
                    return;
                }
                if (class165.field2358.field4068 == 1) {
                    class362.field5086++;
                }
            }
            if (class362.field5086 == 2) {
                class312.field4269 = new class258((Socket) class165.field2358.field4070, class204.field2772);
                class371 var2 = new class371(5);
                var2.method2396(15, 12450);
                var2.method2386(563, arg0 ^ 0x4F34);
                class312.field4269.method1579(0, 5000, var2.field5258, 5);
                class362.field5086++;
                class53.field779 = class224.method1425(-26805);
            }
            if (class362.field5086 == 3) {
                if (class79.field1220 == 0 || class79.field1220 == 5 || class312.field4269.method1580(arg0 ^ 0x4F) > 0) {
                    int var3 = class312.field4269.method1591(arg0 - 1096);
                    if (var3 != 0) {
                        this.method1110(var3, arg0 - 1216);
                        return;
                    }
                    class362.field5086++;
                } else if ((class224.method1425(arg0 - 27901) - class53.field779) > 30000L) {
                    this.method1110(1001, arg0 ^ 0xFFFFFBC1);
                    return;
                }
            }
            if (arg0 != 1096) {
                main((String[]) null);
            }
            if (class362.field5086 == 4) {
                boolean var4 = class79.field1220 == 5 || class79.field1220 == 10 || class79.field1220 == 28;
                class296.field4115.method2187(!var4, class312.field4269, (byte) -102);
                class362.field5086 = 0;
                class165.field2358 = null;
                class312.field4269 = null;
            }
        } catch (IOException var5) {
            this.method1110(1002, arg0 - 1210);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1256)
    public static final void method1100(boolean arg0) {
        field2339++;
        if (class234.field3188 == 175) {
            int var1 = class393.field5747.method2429(0);
            int var2 = (var1 >> 4 & 0x7) + class245.field3410;
            int var3 = (var1 & 0x7) + class34.field534;
            int var4 = class393.field5747.method2403((byte) 97);
            int var5 = class393.field5747.method2429(0);
            int var6 = class393.field5747.method2403((byte) 89);
            if (var2 >= 0 && var3 >= 0 && class432.field6220 > var2 && var3 < class267.field3646) {
                int var7 = var2 * 128 + 64;
                int var8 = var3 * 128 + 64;
                class232 var9 = new class232(var4, var6, class35.field541, class265.field3617, var7, class279.method1698(var7, var8, class265.field3617, (byte) 3) - var5, var8, var2, var2, var3, var3);
                class365.field5111.method1301(50, new class326(var9));
            }
        } else if (class234.field3188 == 22) {
            int var10 = class393.field5747.method2429(0);
            int var11 = ((var10 & 0x7E) >> 4) + class245.field3410;
            int var12 = (var10 & 0x7) + class34.field534;
            int var13 = class393.field5747.method2403((byte) 47);
            int var14 = class393.field5747.method2403((byte) 48);
            int var15 = class393.field5747.method2403((byte) 45);
            if (class272.field3718 != null && var11 >= 0 && var12 >= 0 && var11 < class432.field6220 && var12 < class267.field3646) {
                class26 var16 = (class26) class272.field3718.method1412((byte) -54, (long) (var11 | class265.field3617 << 28 | var12 << 14));
                if (var16 != null) {
                    for (class210 var17 = (class210) var16.field423.method1312((byte) 25); var17 != null; var17 = (class210) var16.field423.method1304(-75)) {
                        if ((var13 & 0x7FFF) == var17.field2829 && var17.field2827 == var14) {
                            var17.method2459(198);
                            var17.field2827 = var15;
                            class248.method1547(class265.field3617, var11, var17, var12, -94956594);
                            break;
                        }
                    }
                    class192.method1276(-18330, var11, class265.field3617, var12);
                }
            }
        } else if (class234.field3188 == 198) {
            class393.field5747.method2429(0);
            int var18 = class393.field5747.method2429(0);
            int var19 = ((var18 & 0x7F) >> 4) + class245.field3410;
            int var20 = (var18 & 0x7) + class34.field534;
            int var21 = class393.field5747.method2403((byte) 76);
            int var22 = class393.field5747.method2429(0);
            int var23 = class393.field5747.method2425(58);
            String var24 = class393.field5747.method2422(-1);
            class188.method1236(var22, 64, var20, var21, var19, var23, var24);
        } else if (class234.field3188 == 35) {
            int var25 = class393.field5747.method2403((byte) 82);
            int var26 = class393.field5747.method2388((byte) 86);
            int var27 = class245.field3410 + (var26 >> 4 & 0x7);
            int var28 = (var26 & 0x7) + class34.field534;
            if (var27 >= 0 && var28 >= 0 && class432.field6220 > var27 && class267.field3646 > var28) {
                class26 var29 = (class26) class272.field3718.method1412((byte) -54, (long) (var28 << 14 | class265.field3617 << 28 | var27));
                if (var29 != null) {
                    for (class210 var30 = (class210) var29.field423.method1312((byte) 25); var30 != null; var30 = (class210) var29.field423.method1304(-114)) {
                        if ((var25 & 0x7FFF) == var30.field2829) {
                            var30.method2459(198);
                            break;
                        }
                    }
                    if (var29.field423.method1300((byte) 119)) {
                        var29.method2459(198);
                    }
                    class192.method1276(-18330, var27, class265.field3617, var28);
                }
            }
        } else if (class234.field3188 == 189) {
            int var31 = class393.field5747.method2429(0);
            int var32 = (var31 >> 4 & 0xF) + class245.field3410 * 2;
            int var33 = class34.field534 * 2 + (var31 & 0xF);
            int var34 = class393.field5747.method2418(-21337) + var32;
            int var35 = class393.field5747.method2418(-21337) + var33;
            int var36 = class393.field5747.method2378(-1);
            int var37 = class393.field5747.method2378(-1);
            int var38 = class393.field5747.method2403((byte) 85);
            int var39 = class393.field5747.method2418(-21337);
            int var40 = class393.field5747.method2429(0) * 4;
            int var41 = class393.field5747.method2403((byte) 40);
            int var42 = class393.field5747.method2403((byte) 93);
            int var43 = class393.field5747.method2429(0);
            int var44 = class393.field5747.method2429(0);
            if (var43 == 255) {
                var43 = -1;
            }
            if (var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var38 != 65535) {
                int var45 = var33 * 64;
                int var46 = var34 * 64;
                int var47 = var35 * 64;
                int var48 = var32 * 64;
                if (var36 != 0) {
                    int var51;
                    class61 var52;
                    if (var36 < 0) {
                        int var49 = -var36 - 1;
                        int var50 = var49 & 0x7FF;
                        var51 = (var49 & 0x7B3F) >> 11;
                        if (class414.field6012 == var50) {
                            var52 = class307.field4211;
                        } else {
                            var52 = class12.field153[var50];
                        }
                    } else {
                        int var53 = var36 - 1;
                        int var54 = var53 & 0x7FF;
                        var51 = var53 >> 11 & 0xF;
                        var52 = class445.field6422[var54];
                    }
                    if (var52 != null) {
                        class312 var55 = var52.method402(0);
                        if (var55.field4289 != null && var55.field4289[var51] != null) {
                            int var56 = var55.field4289[var51][0];
                            int var57 = var55.field4289[var51][2];
                            int var58 = var52.field859.method2464(126);
                            int var59 = class362.field5083[var58];
                            int var60 = class362.field5082[var58];
                            int var61 = var56 * var60 + var57 * var59 >> 15;
                            int var62 = var57 * var60 - (var56 * var59) >> 15;
                            var48 += var61;
                            var39 -= var55.field4289[var51][1];
                            var45 += var62;
                        }
                    }
                }
                class439 var64 = new class439(var38, class265.field3617, var48, var45, class279.method1698(var48, var45, class265.field3617, (byte) 3) - var39, class35.field541 + var41, class35.field541 + var42, var43, var44, var37, var40);
                var64.method2758(class279.method1698(var46, var47, class265.field3617, (byte) 3) - var40, (byte) 111, var47, var46, var41 + class35.field541);
                class300.field4163.method1301(50, new class165(var64));
            }
        } else if (class234.field3188 == 6) {
            int var65 = class393.field5747.method2429(0);
            int var66 = (var65 >> 4 & 0xF) + class245.field3410 * 2;
            int var67 = (var65 & 0xF) + class34.field534 * 2;
            int var68 = class393.field5747.method2418(-21337) + var66;
            int var69 = var67 + class393.field5747.method2418(-21337);
            int var70 = class393.field5747.method2378(-1);
            int var71 = class393.field5747.method2403((byte) 43);
            int var72 = class393.field5747.method2429(0) * 4;
            int var73 = class393.field5747.method2429(0) * 4;
            int var74 = class393.field5747.method2403((byte) 65);
            int var75 = class393.field5747.method2403((byte) 97);
            int var76 = class393.field5747.method2429(0);
            if (var76 == 255) {
                var76 = -1;
            }
            int var77 = class393.field5747.method2429(0);
            if (var66 >= 0 && var67 >= 0 && var66 < 208 && var67 < 208 && var68 >= 0 && var69 >= 0 && var68 < 208 && var69 < 208 && var71 != 65535) {
                int var78 = var68 * 64;
                int var79 = var66 * 64;
                int var80 = var67 * 64;
                int var81 = var69 * 64;
                class439 var82 = new class439(var71, class265.field3617, var79, var80, class279.method1698(var79, var80, class265.field3617, (byte) 3) - var72, class35.field541 + var74, class35.field541 + var75, var76, var77, var70, var73);
                var82.method2758(class279.method1698(var78, var81, class265.field3617, (byte) 3) - var73, (byte) 87, var81, var78, var74 + class35.field541);
                class300.field4163.method1301(50, new class165(var82));
            }
        } else if (class234.field3188 == 176) {
            int var83 = class393.field5747.method2429(0);
            int var84 = (var83 >> 4 & 0x7) + class245.field3410;
            int var85 = class34.field534 + (var83 & 0x7);
            int var86 = class393.field5747.method2403((byte) 77);
            int var87 = class393.field5747.method2403((byte) 81);
            if (var84 >= 0 && var85 >= 0 && var84 < class432.field6220 && class267.field3646 > var85) {
                class248.method1547(class265.field3617, var84, new class210(var87, var86), var85, -94956594);
                class192.method1276(-18330, var84, class265.field3617, var85);
            }
        } else if (class234.field3188 == 133) {
            int var88 = class393.field5747.method2388((byte) 89);
            int var89 = var88 >> 2;
            int var90 = var88 & 0x3;
            int var91 = class135.field1925[var89];
            int var92 = class393.field5747.method2403((byte) 88);
            int var93 = class393.field5747.method2382(false);
            int var94 = class245.field3410 + (var93 >> 4 & 0x7);
            int var95 = (var93 & 0x7) + class34.field534;
            if (var94 >= 0 && var95 >= 0 && class432.field6220 > var94 && class267.field3646 > var95) {
                class439.method2756(false, var92, var89, var95, var91, var94, class265.field3617, -1, 0, var90);
            }
        } else if (class234.field3188 == 226) {
            int var96 = class393.field5747.method2403((byte) 40);
            int var97 = class393.field5747.method2429(0);
            class310.method1961(var96, (byte) 35).method2370((byte) 101, var97);
        } else if (class234.field3188 == 95) {
            int var98 = class393.field5747.method2429(0);
            int var99 = ((var98 & 0x78) >> 4) + class245.field3410;
            int var100 = (var98 & 0x7) + class34.field534;
            int var101 = class393.field5747.method2403((byte) 80);
            if (var101 == 65535) {
                var101 = -1;
            }
            int var102 = class393.field5747.method2429(0);
            int var103 = (var102 & 0xFC) >> 4;
            int var104 = var102 & 0x7;
            int var105 = class393.field5747.method2429(0);
            int var106 = class393.field5747.method2429(0);
            if (var99 >= 0 && var100 >= 0 && class432.field6220 > var99 && class267.field3646 > var100) {
                int var107 = var103 + 1;
                if (class307.field4211.field956[0] >= (var99 - var107) && class307.field4211.field956[0] <= (var99 + var107) && class307.field4211.field944[0] >= (var100 - var107) && class307.field4211.field944[0] <= (var100 + var107) && class406.field5895 != 0 && var104 > 0 && class145.field2115 < 50 && var101 != -1) {
                    class337.field4592[class145.field2115] = var101;
                    class270.field3681[class145.field2115] = var104;
                    class61.field935[class145.field2115] = var105;
                    class423.field6076[class145.field2115] = null;
                    class4.field66[class145.field2115] = (var99 << 16) + (var100 << 8) + var103;
                    class27.field438[class145.field2115] = var106;
                    class145.field2115++;
                }
            }
        } else if (class234.field3188 == 186) {
            int var108 = class393.field5747.method2429(0);
            int var109 = var108 >> 2;
            int var110 = var108 & 0x3;
            int var111 = class135.field1925[var109];
            int var112 = class393.field5747.method2389(62);
            if (var112 == 65535) {
                var112 = -1;
            }
            int var113 = class393.field5747.method2388((byte) 105);
            int var114 = class245.field3410 + (var113 >> 4 & 0x7);
            int var115 = class34.field534 + (var113 & 0x7);
            class48.method335(var112, var114, var109, var115, class265.field3617, var111, -17044, var110);
        } else if (class234.field3188 == 82) {
            int var116 = class393.field5747.method2388((byte) 122);
            int var117 = class245.field3410 + (var116 >> 4 & 0x7);
            int var118 = (var116 & 0x7) + class34.field534;
            int var119 = class393.field5747.method2435((byte) 84);
            int var120 = class393.field5747.method2389(47);
            int var121 = class393.field5747.method2435((byte) 79);
            if (var117 >= 0 && var118 >= 0 && var117 < class432.field6220 && class267.field3646 > var118 && class414.field6012 != var121) {
                class248.method1547(class265.field3617, var117, new class210(var119, var120), var118, -94956594);
                class192.method1276(-18330, var117, class265.field3617, var118);
            }
        } else if (class234.field3188 == 25) {
            int var122 = class393.field5747.method2388((byte) 94);
            int var123 = var122 >> 2;
            int var124 = var122 & 0x3;
            int var125 = class135.field1925[var123];
            int var126 = class393.field5747.method2388((byte) 110);
            int var127 = (var126 >> 4 & 0x7) + class245.field3410;
            int var128 = (var126 & 0x7) + class34.field534;
            if (var127 >= 0 && var128 >= 0 && var127 < class432.field6220 && class267.field3646 > var128) {
                class439.method2756(arg0, -1, var123, var128, var125, var127, class265.field3617, -1, 0, var124);
            }
        } else {
            if (arg0) {
                field2331 = -113;
            }
            if (class234.field3188 == 218) {
                byte var129 = class393.field5747.method2408(10798);
                int var130 = class393.field5747.method2400((byte) 123);
                int var131 = ((var130 & 0x70) >> 4) + class245.field3410;
                int var132 = (var130 & 0x7) + class34.field534;
                int var133 = class393.field5747.method2411((byte) 22);
                byte var134 = class393.field5747.method2418(-21337);
                int var135 = class393.field5747.method2403((byte) 127);
                int var136 = class393.field5747.method2382(false);
                int var137 = var136 >> 2;
                int var138 = var136 & 0x3;
                byte var139 = class393.field5747.method2431((byte) -112);
                byte var140 = class393.field5747.method2381(-4412);
                int var141 = class393.field5747.method2435((byte) 91);
                int var142 = class393.field5747.method2403((byte) 111);
                if (!class408.field5920.method1790()) {
                    class143.method976(var131, (byte) 31, var138, var141, var129, var140, var137, var142, var132, var135, var133, var134, var139);
                }
            }
            if (class234.field3188 == 8) {
                int var143 = class393.field5747.method2429(0);
                int var144 = class245.field3410 + (var143 >> 4 & 0x7);
                int var145 = class34.field534 + (var143 & 0x7);
                int var146 = class393.field5747.method2418(-21337) + var144;
                int var147 = var145 + class393.field5747.method2418(-21337);
                int var148 = class393.field5747.method2378(-1);
                int var149 = class393.field5747.method2403((byte) 61);
                int var150 = class393.field5747.method2429(0) * 4;
                int var151 = class393.field5747.method2429(0) * 4;
                int var152 = class393.field5747.method2403((byte) 90);
                int var153 = class393.field5747.method2403((byte) 110);
                int var154 = class393.field5747.method2429(0);
                if (var154 == 255) {
                    var154 = -1;
                }
                int var155 = class393.field5747.method2429(0);
                if (var144 >= 0 && var145 >= 0 && var144 < class432.field6220 && var145 < class267.field3646 && var146 >= 0 && var147 >= 0 && class432.field6220 > var146 && class267.field3646 > var147 && var149 != 65535) {
                    int var156 = var147 * 128 + 64;
                    int var157 = var145 * 128 + 64;
                    int var158 = var144 * 128 + 64;
                    int var159 = var146 * 128 + 64;
                    class439 var160 = new class439(var149, class265.field3617, var158, var157, class279.method1698(var158, var157, class265.field3617, (byte) 3) - var150, class35.field541 + var152, var153 + class35.field541, var154, var155, var148, var151);
                    var160.method2758(class279.method1698(var159, var156, class265.field3617, (byte) 3) - var151, (byte) 122, var156, var159, class35.field541 + var152);
                    class300.field4163.method1301(50, new class165(var160));
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILaa;ILrg;I)V", line = 1863)
    public static final void method1101(int arg0, class281 arg1, int arg2, class383 arg3, int arg4) {
        if (arg4 <= 41) {
            return;
        }
        if (arg3.field5488 == 2) {
            for (int var6 = arg0; var6 <= arg2; var6++) {
                int var7 = arg3.field5564[var6] - 1;
                if (var7 != -1) {
                    if (class222.field2980 == 1 && class29.field458 == var6 && class55.field805 == arg3.field5507) {
                        boolean var8 = class434.method2724(arg3.field5560[var6], arg1, 2, var7, (class412) null, (byte) -78, 0, arg3.field5430) == null;
                        if (var8) {
                            class171.field2443.method1301(50, new class72(var7, arg3.field5560[var6], 2, 0, arg3.field5430, false));
                        }
                    } else {
                        boolean var9 = class434.method2724(arg3.field5560[var6], arg1, 1, var7, (class412) null, (byte) -78, -13623264, arg3.field5430) == null;
                        if (var9) {
                            class171.field2443.method1301(50, new class72(var7, arg3.field5560[var6], 1, -13623264, arg3.field5430, false));
                        }
                    }
                }
            }
        } else if (arg3.field5488 == 5) {
            boolean var5 = class434.method2724(arg3.field5571, arg1, arg3.field5510, arg3.field5569, arg3.field5466 ? class307.field4211.field4965 : null, (byte) -78, arg3.field5520 | 0xFF000000, arg3.field5430) == null;
            if (var5) {
                class171.field2443.method1301(50, new class72(arg3.field5569, arg3.field5571, arg3.field5510, arg3.field5520 | 0xFF000000, arg3.field5430, arg3.field5466));
            }
        }
        field2335++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrg;IIIIIIIII)V", line = 1920)
    public static final void method1102(class383[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class383 var11 = arg0[var10];
            if (var11 != null && var11.field5538 == arg1) {
                int var12 = var11.field5470 + arg6;
                int var13 = var11.field5428 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5488 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5431 + var12;
                    int var19 = var11.field5491 + var13;
                    if (var11.field5488 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (!var11.field5589 || var11.field5488 == 0 || var11.field5455 || method1119(var11).field3612 != 0 || class32.field497 == var11 || var11.field5480 == 1338) {
                    if (!var11.field5589 || !method1113(var11)) {
                        if (class142.field2046 == var11) {
                            class182.field2558 = true;
                            class54.field790 = var12;
                            class169.field2402 = var13;
                        }
                        if (!var11.field5589 || var11.field5450 || var14 < var16 && var15 < var17) {
                            if (var11.field5488 == 0) {
                                if (!var11.field5589 && method1113(var11) && class75.field1168 != var11) {
                                    continue;
                                }
                                if (var11.field5567 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                    for (class410 var20 = (class410) class5.field76.method1312((byte) 25); var20 != null; var20 = (class410) class5.field76.method1304(84)) {
                                        if (var20.field5947) {
                                            var20.method2459(198);
                                            var20.field5946.field5429 = false;
                                        }
                                    }
                                    if (class359.field5046 == 0) {
                                        class142.field2046 = null;
                                        class32.field497 = null;
                                    }
                                    class299.field4145 = 0;
                                    class76.field1195 = false;
                                    class223.field3010 = false;
                                    if (!class349.field4882) {
                                        class77.method552(95);
                                    }
                                }
                            }
                            boolean var21;
                            if (class349.field4883 >= var14 && class162.field2269 >= var15 && class349.field4883 < var16 && class162.field2269 < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class349.field4882 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class389.method2538((byte) -112, arg9 - var13, var11, arg8 - var12);
                            }
                            if (var11.field5589) {
                                boolean var22 = false;
                                if (class409.field5938 == 1 && var21) {
                                    var22 = true;
                                }
                                boolean var23 = false;
                                if (class383.field5452 == 1 && class349.field4879 >= var14 && class361.field5073 >= var15 && class349.field4879 < var16 && class361.field5073 < var17) {
                                    var23 = true;
                                }
                                if (var11.field5477 != null) {
                                    for (int var24 = 0; var24 < var11.field5477.length; var24++) {
                                        if (class293.field4056[var11.field5477[var24]]) {
                                            if (var11.field5543 == null || class35.field541 >= var11.field5543[var24]) {
                                                byte var25 = var11.field5539[var24];
                                                if (var25 == 0 || ((var25 & 0x8) == 0 || !class293.field4056[86] && !class293.field4056[82] && !class293.field4056[81]) && ((var25 & 0x2) == 0 || class293.field4056[86]) && ((var25 & 0x1) == 0 || class293.field4056[82]) && ((var25 & 0x4) == 0 || class293.field4056[81])) {
                                                    class395.method2562(-1, var11.field5507, true, var24 + 1, "");
                                                    int var26 = var11.field5559[var24];
                                                    if (var11.field5543 == null) {
                                                        var11.field5543 = new int[var11.field5477.length];
                                                    }
                                                    if (var26 == 0) {
                                                        var11.field5543[var24] = Integer.MAX_VALUE;
                                                    } else {
                                                        var11.field5543[var24] = class35.field541 + var26;
                                                    }
                                                }
                                            }
                                        } else if (var11.field5543 != null) {
                                            var11.field5543[var24] = 0;
                                        }
                                    }
                                }
                                if (var23) {
                                    class176.method1178(var11, 128, class361.field5073 - var13, class349.field4879 - var12);
                                }
                                if (class142.field2046 != null && class142.field2046 != var11 && var21 && method1119(var11).method1636((byte) -2)) {
                                    class327.field4472 = var11;
                                }
                                if (class32.field497 == var11) {
                                    class259.field3551 = true;
                                    class34.field535 = var12;
                                    class31.field491 = var13;
                                }
                                if (var11.field5455 || var11.field5480 != 0) {
                                    if (var21 && class107.field1586 != 0 && var11.field5612 != null) {
                                        class410 var27 = new class410();
                                        var27.field5947 = true;
                                        var27.field5946 = var11;
                                        var27.field5959 = class107.field1586;
                                        var27.field5961 = var11.field5612;
                                        class5.field76.method1301(50, var27);
                                    }
                                    if (class142.field2046 != null || class145.field2106 != null || class349.field4882 || var11.field5480 != 1400 && class299.field4145 > 0) {
                                        var23 = false;
                                        var22 = false;
                                        var21 = false;
                                    }
                                    if (var11.field5480 != 0) {
                                        if (var11.field5480 == 1337 || var11.field5480 == 1403) {
                                            class359.field5051 = var11;
                                            if (class66.field1040 != null) {
                                                class66.field1040.method999(var11.field5491, class408.field5920, (byte) 111);
                                            }
                                            if (var11.field5480 == 1337) {
                                                if (!class349.field4882 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                    class126.method844(class408.field5920, arg8, arg9, 78);
                                                    for (class331 var28 = (class331) class140.field2004.method2307(false); var28 != null; var28 = (class331) class140.field2004.method2311(-5116)) {
                                                        if (arg8 >= var28.field4485 && arg8 < var28.field4490 && arg9 >= var28.field4487 && arg9 < var28.field4486) {
                                                            class77.method552(111);
                                                            class231.method1447(var28.field4484, (byte) -92);
                                                        }
                                                    }
                                                }
                                                class123.method820(var13, var11, var12, -8018);
                                                continue;
                                            }
                                        }
                                        if (var11.field5480 == 1338) {
                                            if (var11.method2496(-16243, class408.field5920) == null || class254.field3486 != 0 && class254.field3486 != 3 || class349.field4882 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                                continue;
                                            }
                                            int var29 = arg8 - var12;
                                            int var30 = arg9 - var13;
                                            int var31 = var11.field5566[var30];
                                            if (var29 < var31 || var29 > var11.field5529[var30] + var31) {
                                                continue;
                                            }
                                            int var32 = var29 - var11.field5431 / 2;
                                            int var33 = var30 - var11.field5491 / 2;
                                            int var34;
                                            if (class123.field1731 == 4) {
                                                var34 = (int) class6.field98 & 0x3FFF;
                                            } else {
                                                var34 = (int) class6.field98 + class390.field5737 & 0x3FFF;
                                            }
                                            int var35 = class362.field5083[var34];
                                            int var36 = class362.field5082[var34];
                                            if (class123.field1731 != 4) {
                                                var35 = (class23.field312 + 256) * var35 >> 8;
                                                var36 = (class23.field312 + 256) * var36 >> 8;
                                            }
                                            int var37 = var32 * var36 + var33 * var35 >> 15;
                                            int var38 = var33 * var36 - var32 * var35 >> 15;
                                            int var39;
                                            int var40;
                                            if (class123.field1731 == 4) {
                                                var39 = (class164.field2311 >> 7) + (var37 >> 2);
                                                var40 = (class120.field1714 >> 7) - (var38 >> 2);
                                            } else {
                                                int var41 = (class307.field4211.method410((byte) 51) - 1) * 64;
                                                var39 = (class307.field4211.field6197 - var41 >> 7) + (var37 >> 2);
                                                var40 = (class307.field4211.field6192 - var41 >> 7) - (var38 >> 2);
                                            }
                                            if (class309.field4235 && (class439.field6373 & 0x40) != 0) {
                                                class383 var42 = class315.method2010(class339.field4745, class236.field3214, -27590);
                                                if (var42 == null) {
                                                    class378.method2471(70);
                                                } else {
                                                    class336.method2092(class289.field3993, var40, " ->", 1L, (byte) 87, 3, var39, class25.field359);
                                                }
                                                continue;
                                            }
                                            if (class180.field2521 == 1) {
                                                class336.method2092(-1, var40, "", 1L, (byte) 114, 12, var39, class149.field2148);
                                            }
                                            class336.method2092(-1, var40, "", 1L, (byte) 40, 11, var39, class207.field2796);
                                            continue;
                                        }
                                        if (var11.field5480 == 1400) {
                                            class245.field3389 = var11;
                                            if (var21) {
                                                class76.field1195 = true;
                                            }
                                            if (var23) {
                                                int var43 = (int) ((double) (class349.field4879 - var12 - var11.field5431 / 2) * 2.0D / (double) class42.field628);
                                                int var44 = (int) (-((double) (class361.field5073 - var13 - var11.field5491 / 2) * 2.0D / (double) class42.field628));
                                                int var45 = class339.field4742 + var43 + class42.field641;
                                                int var46 = class448.field6472 + var44 + class42.field650;
                                                class125 var47 = class331.method2060((byte) -59);
                                                if (var47 == null) {
                                                    continue;
                                                }
                                                int[] var48 = new int[3];
                                                var47.method838(-117, var45, var46, var48);
                                                if (var48 != null) {
                                                    if (class293.field4056[82] && class204.field2771 > 0) {
                                                        class99.method701(var48[2], false, var48[1], var48[0]);
                                                        continue;
                                                    }
                                                    class223.field3010 = true;
                                                    class298.field4129 = var48[0];
                                                    class20.field272 = var48[1];
                                                    class280.field3846 = var48[2];
                                                }
                                                class299.field4145 = 1;
                                                class296.field4098 = false;
                                                class341.field4765 = class349.field4883;
                                                class259.field3552 = class162.field2269;
                                                continue;
                                            }
                                            if (var22 && class299.field4145 > 0) {
                                                if (class299.field4145 == 1 && (class349.field4883 != class341.field4765 || class259.field3552 != class162.field2269)) {
                                                    class9.field142 = class339.field4742;
                                                    class221.field2945 = class448.field6472;
                                                    class299.field4145 = 2;
                                                }
                                                if (class299.field4145 == 2) {
                                                    class296.field4098 = true;
                                                    class53.method359(24931, (int) ((double) (class341.field4765 - class349.field4883) * 2.0D / (double) class42.field629) + class9.field142);
                                                    class127.method850(class221.field2945 - (int) ((double) (class259.field3552 - class162.field2269) * 2.0D / (double) class42.field629), (byte) -75);
                                                }
                                                continue;
                                            }
                                            if (class299.field4145 > 0 && !class296.field4098) {
                                                if ((class202.field2757 == 1 || class298.method1926((byte) -59)) && class390.field5740 > 2) {
                                                    class154.method1040(2, 82);
                                                } else if (class265.method1645(true)) {
                                                    class154.method1040(1, 126);
                                                }
                                            }
                                            class299.field4145 = 0;
                                            continue;
                                        }
                                        if (var11.field5480 == 1401) {
                                            if (var22) {
                                                class257.method1574(var11.field5491, (byte) -93, var11.field5431, class349.field4883 - var12, class162.field2269 - var13);
                                            }
                                            continue;
                                        }
                                        if (var11.field5480 == 1406) {
                                            class236.method1489(var12, var11, var13, -128);
                                            continue;
                                        }
                                    }
                                    if (!var11.field5605 && var23) {
                                        var11.field5605 = true;
                                        if (var11.field5604 != null) {
                                            class410 var49 = new class410();
                                            var49.field5947 = true;
                                            var49.field5946 = var11;
                                            var49.field5949 = class349.field4879 - var12;
                                            var49.field5959 = class361.field5073 - var13;
                                            var49.field5961 = var11.field5604;
                                            class5.field76.method1301(50, var49);
                                        }
                                    }
                                    if (var11.field5605 && var22 && var11.field5586 != null) {
                                        class410 var50 = new class410();
                                        var50.field5947 = true;
                                        var50.field5946 = var11;
                                        var50.field5949 = class349.field4883 - var12;
                                        var50.field5959 = class162.field2269 - var13;
                                        var50.field5961 = var11.field5586;
                                        class5.field76.method1301(50, var50);
                                    }
                                    if (var11.field5605 && !var22) {
                                        var11.field5605 = false;
                                        if (var11.field5598 != null) {
                                            class410 var51 = new class410();
                                            var51.field5947 = true;
                                            var51.field5946 = var11;
                                            var51.field5949 = class349.field4883 - var12;
                                            var51.field5959 = class162.field2269 - var13;
                                            var51.field5961 = var11.field5598;
                                            class209.field2814.method1301(50, var51);
                                        }
                                    }
                                    if (var22 && var11.field5449 != null) {
                                        class410 var52 = new class410();
                                        var52.field5947 = true;
                                        var52.field5946 = var11;
                                        var52.field5949 = class349.field4883 - var12;
                                        var52.field5959 = class162.field2269 - var13;
                                        var52.field5961 = var11.field5449;
                                        class5.field76.method1301(50, var52);
                                    }
                                    if (!var11.field5429 && var21) {
                                        var11.field5429 = true;
                                        if (var11.field5565 != null) {
                                            class410 var53 = new class410();
                                            var53.field5947 = true;
                                            var53.field5946 = var11;
                                            var53.field5949 = class349.field4883 - var12;
                                            var53.field5959 = class162.field2269 - var13;
                                            var53.field5961 = var11.field5565;
                                            class5.field76.method1301(50, var53);
                                        }
                                    }
                                    if (var11.field5429 && var21 && var11.field5579 != null) {
                                        class410 var54 = new class410();
                                        var54.field5947 = true;
                                        var54.field5946 = var11;
                                        var54.field5949 = class349.field4883 - var12;
                                        var54.field5959 = class162.field2269 - var13;
                                        var54.field5961 = var11.field5579;
                                        class5.field76.method1301(50, var54);
                                    }
                                    if (var11.field5429 && !var21) {
                                        var11.field5429 = false;
                                        if (var11.field5448 != null) {
                                            class410 var55 = new class410();
                                            var55.field5947 = true;
                                            var55.field5946 = var11;
                                            var55.field5949 = class349.field4883 - var12;
                                            var55.field5959 = class162.field2269 - var13;
                                            var55.field5961 = var11.field5448;
                                            class209.field2814.method1301(50, var55);
                                        }
                                    }
                                    if (var11.field5435 != null) {
                                        class410 var56 = new class410();
                                        var56.field5946 = var11;
                                        var56.field5961 = var11.field5435;
                                        class405.field5884.method1301(50, var56);
                                    }
                                    if (var11.field5574 != null && class234.field3189 > var11.field5568) {
                                        if (var11.field5528 == null || class234.field3189 - var11.field5568 > 32) {
                                            class410 var61 = new class410();
                                            var61.field5946 = var11;
                                            var61.field5961 = var11.field5574;
                                            class5.field76.method1301(50, var61);
                                        } else {
                                            label705: for (int var57 = var11.field5568; var57 < class234.field3189; var57++) {
                                                int var58 = class395.field5778[var57 & 0x1F];
                                                for (int var59 = 0; var59 < var11.field5528.length; var59++) {
                                                    if (var11.field5528[var59] == var58) {
                                                        class410 var60 = new class410();
                                                        var60.field5946 = var11;
                                                        var60.field5961 = var11.field5574;
                                                        class5.field76.method1301(50, var60);
                                                        break label705;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field5568 = class234.field3189;
                                    }
                                    if (var11.field5537 != null && class300.field4160 > var11.field5530) {
                                        if (var11.field5609 == null || class300.field4160 - var11.field5530 > 32) {
                                            class410 var66 = new class410();
                                            var66.field5946 = var11;
                                            var66.field5961 = var11.field5537;
                                            class5.field76.method1301(50, var66);
                                        } else {
                                            label685: for (int var62 = var11.field5530; var62 < class300.field4160; var62++) {
                                                int var63 = class450.field6533[var62 & 0x1F];
                                                for (int var64 = 0; var64 < var11.field5609.length; var64++) {
                                                    if (var11.field5609[var64] == var63) {
                                                        class410 var65 = new class410();
                                                        var65.field5946 = var11;
                                                        var65.field5961 = var11.field5537;
                                                        class5.field76.method1301(50, var65);
                                                        break label685;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field5530 = class300.field4160;
                                    }
                                    if (var11.field5600 != null && class163.field2298 > var11.field5611) {
                                        if (var11.field5509 == null || class163.field2298 - var11.field5611 > 32) {
                                            class410 var71 = new class410();
                                            var71.field5946 = var11;
                                            var71.field5961 = var11.field5600;
                                            class5.field76.method1301(50, var71);
                                        } else {
                                            label665: for (int var67 = var11.field5611; var67 < class163.field2298; var67++) {
                                                int var68 = class354.field4986[var67 & 0x1F];
                                                for (int var69 = 0; var69 < var11.field5509.length; var69++) {
                                                    if (var11.field5509[var69] == var68) {
                                                        class410 var70 = new class410();
                                                        var70.field5946 = var11;
                                                        var70.field5961 = var11.field5600;
                                                        class5.field76.method1301(50, var70);
                                                        break label665;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field5611 = class163.field2298;
                                    }
                                    if (var11.field5473 != null && class300.field4150 > var11.field5607) {
                                        if (var11.field5500 == null || class300.field4150 - var11.field5607 > 32) {
                                            class410 var76 = new class410();
                                            var76.field5946 = var11;
                                            var76.field5961 = var11.field5473;
                                            class5.field76.method1301(50, var76);
                                        } else {
                                            label645: for (int var72 = var11.field5607; var72 < class300.field4150; var72++) {
                                                int var73 = class359.field5063[var72 & 0x1F];
                                                for (int var74 = 0; var74 < var11.field5500.length; var74++) {
                                                    if (var11.field5500[var74] == var73) {
                                                        class410 var75 = new class410();
                                                        var75.field5946 = var11;
                                                        var75.field5961 = var11.field5473;
                                                        class5.field76.method1301(50, var75);
                                                        break label645;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field5607 = class300.field4150;
                                    }
                                    if (var11.field5572 != null && class353.field4935 > var11.field5536) {
                                        if (var11.field5595 == null || class353.field4935 - var11.field5536 > 32) {
                                            class410 var81 = new class410();
                                            var81.field5946 = var11;
                                            var81.field5961 = var11.field5572;
                                            class5.field76.method1301(50, var81);
                                        } else {
                                            label625: for (int var77 = var11.field5536; var77 < class353.field4935; var77++) {
                                                int var78 = class418.field6050[var77 & 0x1F];
                                                for (int var79 = 0; var79 < var11.field5595.length; var79++) {
                                                    if (var11.field5595[var79] == var78) {
                                                        class410 var80 = new class410();
                                                        var80.field5946 = var11;
                                                        var80.field5961 = var11.field5572;
                                                        class5.field76.method1301(50, var80);
                                                        break label625;
                                                    }
                                                }
                                            }
                                        }
                                        var11.field5536 = class353.field4935;
                                    }
                                    if (class54.field789 > var11.field5483 && var11.field5481 != null) {
                                        class410 var82 = new class410();
                                        var82.field5946 = var11;
                                        var82.field5961 = var11.field5481;
                                        class5.field76.method1301(50, var82);
                                    }
                                    if (class184.field2579 > var11.field5483 && var11.field5534 != null) {
                                        class410 var83 = new class410();
                                        var83.field5946 = var11;
                                        var83.field5961 = var11.field5534;
                                        class5.field76.method1301(50, var83);
                                    }
                                    if (class324.field4433 > var11.field5483 && var11.field5558 != null) {
                                        class410 var84 = new class410();
                                        var84.field5946 = var11;
                                        var84.field5961 = var11.field5558;
                                        class5.field76.method1301(50, var84);
                                    }
                                    if (class6.field86 > var11.field5483 && var11.field5506 != null) {
                                        class410 var85 = new class410();
                                        var85.field5946 = var11;
                                        var85.field5961 = var11.field5506;
                                        class5.field76.method1301(50, var85);
                                    }
                                    if (class9.field133 > var11.field5483 && var11.field5575 != null) {
                                        class410 var86 = new class410();
                                        var86.field5946 = var11;
                                        var86.field5961 = var11.field5575;
                                        class5.field76.method1301(50, var86);
                                    }
                                    var11.field5483 = class441.field6398;
                                    if (var11.field5596 != null) {
                                        for (int var87 = 0; var87 < class327.field4459; var87++) {
                                            class410 var88 = new class410();
                                            var88.field5946 = var11;
                                            var88.field5953 = class123.field1724[var87];
                                            var88.field5957 = class327.field4471[var87];
                                            var88.field5961 = var11.field5596;
                                            class5.field76.method1301(50, var88);
                                        }
                                    }
                                    if (class8.field120 && var11.field5587 != null) {
                                        class410 var89 = new class410();
                                        var89.field5946 = var11;
                                        var89.field5961 = var11.field5587;
                                        class5.field76.method1301(50, var89);
                                    }
                                }
                                if (var11.field5488 == 5 && var11.field5503 != -1) {
                                    var11.method2502((byte) 118).method999(var11.field5491, class408.field5920, (byte) 107);
                                }
                            }
                            if (!var11.field5589 && class142.field2046 == null && class145.field2106 == null && !class349.field4882) {
                                if ((var11.field5464 >= 0 || var11.field5547 != 0) && class349.field4883 >= var14 && class162.field2269 >= var15 && class349.field4883 < var16 && class162.field2269 < var17) {
                                    if (var11.field5464 >= 0) {
                                        class75.field1168 = arg0[var11.field5464];
                                    } else {
                                        class75.field1168 = var11;
                                    }
                                }
                                if (var11.field5488 == 8 && class349.field4883 >= var14 && class162.field2269 >= var15 && class349.field4883 < var16 && class162.field2269 < var17) {
                                    class393.field5754 = var11;
                                }
                                if (var11.field5590 > var11.field5491) {
                                    class288.method1861(16, var11.field5590, var11.field5491, var11.field5431 + var12, class162.field2269, class349.field4883, var11, var13);
                                }
                            }
                            class1.method4(arg3, (byte) 70, arg2, var11, arg5, var12, arg4, var13);
                            if (var11.field5488 == 0) {
                                method1102(arg0, var11.field5507, var14, var15, var16, var17, var12 - var11.field5511, var13 - var11.field5434, arg8, arg9);
                                if (var11.field5465 != null) {
                                    method1102(var11.field5465, var11.field5507, var14, var15, var16, var17, var12 - var11.field5511, var13 - var11.field5434, arg8, arg9);
                                }
                                class432 var90 = (class432) class271.field3700.method1412((byte) -54, (long) var11.field5507);
                                if (var90 != null) {
                                    if (var90.field6219 == 0 && !class349.field4882 && var21 && !class280.field3829) {
                                        class77.method552(107);
                                    }
                                    class45.method320(arg9, (byte) 68, var17, var90.field6217, var14, var13, var16, arg8, var12, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class1.method4(arg3, (byte) 70, arg2, var11, arg5, var12, arg4, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2829)
    public static final void method1103() {
        boolean var0 = class207.field2795 == 1 && class169.field2407 > 200 || class207.field2795 == 0 && class169.field2407 > 50;
        for (int var1 = 0; var1 < class169.field2407; var1++) {
            class354 var10 = class12.field153[class67.field1055[var1]];
            if (var10.method2292(1)) {
                var10.method400((byte) 66);
                if (var10.field6182 >= 0 && var10.field6186 >= 0 && var10.field6195 < class432.field6220 && var10.field6185 < class267.field3646) {
                    var10.field5001 = var10.field861 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field903) {
                        var11++;
                    }
                    if (var10.field868 > class35.field541) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method410((byte) 65) << 2);
                    if (class20.field269 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field855 = var12 + 1;
                } else {
                    var10.field855 = -1;
                }
            } else {
                var10.field855 = -1;
            }
        }
        for (int var2 = 0; var2 < class71.field1096; var2++) {
            class437 var7 = class445.field6422[class280.field3837[var2]];
            if (var7.method2736(1) && var7.field6290.method1397(0)) {
                var7.method400((byte) 66);
                if (var7.field6182 >= 0 && var7.field6186 >= 0 && var7.field6195 < class432.field6220 && var7.field6185 < class267.field3646) {
                    int var8 = 0;
                    if (!var7.field903) {
                        var8++;
                    }
                    if (var7.field868 > class35.field541) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method410((byte) 81) << 2);
                    if (class20.field269 == 0) {
                        if (var7.field6290.field2942) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class20.field269 == 1) {
                        if (var7.field6290.field2942) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field6290.field2937) {
                        var9 += 512;
                    } else if (!var7.field6290.field2935) {
                        var9 += 256;
                    }
                    var7.field855 = var9 + 1;
                } else {
                    var7.field855 = -1;
                }
            } else {
                var7.field855 = -1;
            }
        }
        for (int var3 = 0; var3 < class132.field1831.length; var3++) {
            class451 var4 = class132.field1831[var3];
            if (var4 != null) {
                if (var4.field6581 == 1) {
                    class437 var5 = class445.field6422[var4.field6576];
                    if (var5 != null && var5.field855 >= 0) {
                        var5.field855 += 1024;
                    }
                } else if (var4.field6581 == 10) {
                    class354 var6 = class12.field153[var4.field6576];
                    if (var6 != null && var6.field855 >= 0) {
                        var6.field855 += 1024;
                    }
                }
            }
        }
        class307.field4211.field855 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2965)
    public static final void method1104() {
        int var0 = class340.field4749 ? class169.field2407 : class71.field1096 + class169.field2407;
        for (int var1 = -1; var1 < var0; var1++) {
            class61 var2;
            if (var1 < 0) {
                var2 = class307.field4211;
            } else if (var1 < class169.field2407) {
                var2 = class12.field153[class67.field1055[var1]];
            } else {
                var2 = class445.field6422[class280.field3837[var1 - class169.field2407]];
            }
            var2.field866 = 0;
            if (var2.field855 < 0) {
                var2.field903 = false;
            } else {
                int var3 = var2.method410((byte) 89);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6197 & 0x7F) != 0 || (var2.field6192 & 0x7F) != 0) {
                        var2.field903 = false;
                        continue;
                    }
                } else if ((var2.field6197 & 0x7F) != 64 || (var2.field6192 & 0x7F) != 64) {
                    var2.field903 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field6197 >> 7;
                    int var5 = var2.field6192 >> 7;
                    if (class262.field3580[var4][var5] != var2.field855) {
                        var2.field903 = true;
                        continue;
                    }
                    if (class14.field170[var4][var5] > 1) {
                        var10002 = class14.field170[var4][var5]--;
                        var2.field903 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field6197 - var6 >> 7;
                    int var8 = var2.field6192 - var6 >> 7;
                    int var9 = var2.field6197 + var6 >> 7;
                    int var10 = var2.field6192 + var6 >> 7;
                    if (!class223.method1422(var7, var8, var2.field855, var10, 118, var9)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class262.field3580[var11][var12] == var2.field855) {
                                    var10002 = class14.field170[var11][var12]--;
                                }
                            }
                        }
                        var2.field903 = true;
                        continue;
                    }
                }
                if (var2 instanceof class354 && var2.field953 != null && class35.field541 >= var2.field943 && class35.field541 < var2.field945) {
                    ((class354) var2).field5001 = false;
                }
                var2.field903 = false;
                var2.field6191 = class279.method1698(var2.field6197, var2.field6192, class265.field3617, (byte) 3);
                class259.method1601(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 3086)
    public final void method1105(byte arg0) {
        if (class27.field435) {
            class412.method2637(0);
        }
        field2336++;
        if (class408.field5920 != null) {
            class408.field5920.method1809((byte) 113);
        }
        if (class227.field3044 != null) {
            class305.method1949(class204.field2772, class227.field3044, -1);
            class227.field3044 = null;
        }
        if (class60.field851 != null) {
            class60.field851.field3603 = false;
        }
        class60.field851 = null;
        if (class199.field2749 != null) {
            class199.field2749.method1593(3);
            class199.field2749 = null;
        }
        class8.method57(116, class41.field617);
        class2.method11(class41.field617, true);
        if (class353.field4938 != null) {
            class353.field4938.method1569(42, class41.field617);
        }
        class264.method1634(false);
        class167.method1130(-70);
        class353.field4938 = null;
        if (class326.field4451 != null) {
            class326.field4451.method1472(0);
        }
        if (class64.field993 != null) {
            class64.field993.method1472(0);
        }
        class296.field4115.method2190((byte) -102);
        if (arg0 >= -73) {
            this.init();
        }
        class450.field6541.method559(false);
        if (class77.field1210 != null) {
            class77.field1210.method480(-126);
            class77.field1210 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIII)V", line = 3147)
    public static final void method1106(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 13412) {
            return;
        }
        class267.field3661 = arg6;
        field2348++;
        class389.field5658 = arg0;
        class208.field2809 = arg4;
        class235.field3196 = arg1;
        class336.field4534 = arg5;
        if (arg3 && class336.field4534 >= 100) {
            class368.field5158 = class389.field5658 * 128 + 64;
            class336.field4561 = class208.field2809 * 128 + 64;
            class34.field528 = class279.method1698(class368.field5158, class336.field4561, class265.field3617, (byte) 3) - class235.field3196;
        }
        class123.field1731 = 2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3176)
    private final void method1107(byte arg0) {
        if (arg0 != -99) {
            field2341 = 16;
        }
        field2345++;
        boolean var2 = class296.field4115.method2188((byte) -69);
        if (!var2) {
            this.method1099(arg0 ^ 0xFFFFFBD5);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 3192)
    public final void method1108(byte arg0) {
        field2343++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class194.method1286(-113);
        class450.field6541 = new class77(class204.field2772);
        class296.field4115 = new class341();
        if (class62.field975 != 0) {
            class184.field2574 = new byte[50][];
        }
        class80.method568(false, class204.field2772);
        if (class67.field1043 == 0) {
            class61.field932 = this.getCodeBase().getHost();
            class188.field2616 = 443;
            class232.field3140 = 43594;
        } else if (class67.field1043 == 1) {
            class61.field932 = this.getCodeBase().getHost();
            class188.field2616 = class435.field6243 + 50000;
            class232.field3140 = class435.field6243 + 40000;
        } else if (class67.field1043 == 2) {
            class232.field3140 = class435.field6243 + 40000;
            class61.field932 = "127.0.0.1";
            class188.field2616 = class435.field6243 + 50000;
        }
        class7.field115 = class61.field932;
        class281.field3863 = class188.field2616;
        if (arg0 != -116) {
            return;
        }
        class34.field530 = class232.field3140;
        class276.field3748 = class232.field3140;
        class254.field3489 = class34.field530;
        if (class351.field4889 == 3) {
            class393.field5755 = class435.field6243;
        }
        if (class180.field2521 == 1) {
            class262.field3579 = class357.field5023;
            class333.field4512 = class298.field4133;
            class262.field3584 = 16777215;
            class389.field5708 = true;
            class138.field1971 = 0;
            class450.field6535 = class169.field2410;
            class173.field2465 = class260.field3562;
        } else {
            class262.field3579 = class435.field6246;
            class173.field2465 = class67.field1046;
            class450.field6535 = class55.field806;
            class333.field4512 = class234.field3185;
        }
        class313.field4313 = class138.field1962 = class31.field484 = class353.field4942 = new short[256];
        class438.method2742(false);
        class447.method2785(class41.field617, arg0 ^ 0x73);
        class344.method2207(99, class41.field617);
        class353.field4938 = class137.method943((byte) -59);
        if (class353.field4938 != null) {
            class353.field4938.method1570(class41.field617, -94);
        }
        class352.field4913 = class351.field4889;
        try {
            if (class204.field2772.field4890 != null) {
                class426.field6115 = new class423(class204.field2772.field4890, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class285.field3921[var3] = new class423(class204.field2772.field4902[var3], 6000, 0);
                }
                class61.field927 = new class423(class204.field2772.field4891, 6000, 0);
                class171.field2444 = new class197(255, class426.field6115, class61.field927, 500000);
                class245.field3396 = new class423(class204.field2772.field4908, 24, 0);
                class204.field2772.field4890 = null;
                class204.field2772.field4891 = null;
                class204.field2772.field4902 = null;
                class204.field2772.field4908 = null;
            }
        } catch (IOException var4) {
            class171.field2444 = null;
            class61.field927 = null;
            class426.field6115 = null;
            class245.field3396 = null;
        }
        if (class67.field1043 != 0) {
            class75.field1162 = true;
        }
        if (class180.field2521 == 0) {
            class109.field1610 = class259.field3550;
        } else if (class180.field2521 == 1) {
            class109.field1610 = class356.field5010;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3315)
    public final void method1109(boolean arg0) {
        field2347++;
        if (class79.field1220 == 1000) {
            return;
        }
        long var2 = class206.method1347(-13952) / 1000000L - class171.field2437;
        if (!arg0) {
            method1116(-1, (byte) 77);
        }
        class171.field2437 = class206.method1347(-13952) / 1000000L;
        boolean var4 = class287.method1856((byte) 105);
        if (var4 && class1.field12 && class326.field4451 != null) {
            class326.field4451.method1473((byte) 117);
        }
        if (class79.field1220 == 30 || class79.field1220 == 10) {
            if (class35.field543 != 0L && class35.field543 < class224.method1425(-26805)) {
                class365.method2347(class308.field4227, -31718, false, class162.method1075(-45), class29.field457);
            } else if (class408.field5920.method1759() && class79.field1232) {
                class23.method151(-101);
            }
        }
        if (class227.field3044 == null) {
            Container var5;
            if (class393.field5746 == null) {
                var5 = class204.field2772.field4888;
            } else {
                var5 = class393.field5746;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class393.field5746 == var5) {
                Insets var8 = class393.field5746.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class33.field502 != var6 || class358.field5043 != var7) {
                if (class408.field5920 == null || class408.field5920.method1740()) {
                    class194.method1286(-93);
                } else {
                    class33.field502 = var6;
                    class358.field5043 = var7;
                }
                class35.field543 = class224.method1425(-26805) + 500L;
            }
        }
        if (class227.field3044 != null && !class182.field2540 && (class79.field1220 == 30 || class79.field1220 == 10)) {
            class365.method2347(-1, -31718, false, class152.field2153, -1);
        }
        boolean var9 = false;
        if (class289.field3995) {
            class289.field3995 = false;
            var9 = true;
        }
        if (var9) {
            class236.method1486(-830);
        }
        if (class408.field5920 != null && class408.field5920.method1722() || class162.method1075(-45) != 1) {
            class210.method1362(17612);
        }
        if (class79.field1220 == 0) {
            class333.method2068(class293.field4054, var9, class357.field5028[class84.field1299], class390.field5735[class84.field1299], class276.field3743, class7.field117[class84.field1299], 300);
        } else if (class79.field1220 == 5) {
            class73.method487(class220.field2899, class408.field5920, class408.field5920.method1722() | var9, class357.field5028[class84.field1299].getRGB(), class7.field117[class84.field1299].getRGB(), class390.field5735[class84.field1299].getRGB(), -82);
        } else if (class79.field1220 == 10) {
            class58.method390(0);
        } else if (class79.field1220 == 25 || class79.field1220 == 28) {
            if (class265.field3626 == 1) {
                if (class448.field6481 > class346.field4852) {
                    class346.field4852 = class448.field6481;
                }
                int var10 = (class346.field4852 - class448.field6481) * 50 / class346.field4852;
                class176.method1176(class75.field1163 + "<br>(" + var10 + "%)", true, false, class216.field2867);
            } else if (class265.field3626 == 2) {
                if (class31.field482 < class64.field989) {
                    class31.field482 = class64.field989;
                }
                int var11 = (class31.field482 - class64.field989) * 50 / class31.field482 + 50;
                class176.method1176(class75.field1163 + "<br>(" + var11 + "%)", true, false, class216.field2867);
            } else {
                class176.method1176(class75.field1163, true, false, class216.field2867);
            }
        } else if (class79.field1220 == 30) {
            class191.method1263(0, var2);
        } else if (class79.field1220 == 40) {
            class176.method1176(class199.field2744 + "<br>" + class164.field2318, true, false, class216.field2867);
        }
        if (class152.field2156 == 3) {
            for (int var12 = 0; var12 < class75.field1161; var12++) {
                Rectangle var13 = class60.field840[var12];
                if (class257.field3512[var12]) {
                    class408.field5920.method1762(var13.y, var13.height, var13.x, -1996553985, var13.width, -1);
                } else if (class296.field4100[var12]) {
                    class408.field5920.method1762(var13.y, var13.height, var13.x, -1996554240, var13.width, -1);
                }
            }
        }
        if (class64.method430(0)) {
            class11.method69(class408.field5920, -111);
        }
        if ((class79.field1220 == 30 || class79.field1220 == 10) && class152.field2156 == 0 && class162.method1075(-45) == 1 && !var9 && class351.field4897.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class75.field1161; var15++) {
                if (class296.field4100[var15]) {
                    class296.field4100[var15] = false;
                    class426.field6110[var14++] = class60.field840[var15];
                }
            }
            class408.field5920.method1799(class426.field6110, var14);
        } else if (class79.field1220 != 0) {
            class408.field5920.method1749();
            for (int var16 = 0; var16 < class75.field1161; var16++) {
                class296.field4100[var16] = false;
            }
        }
        if (class347.field4870) {
            class43.method311(-13042);
        }
        if (class198.field2742 && class79.field1220 == 10 && class230.field3089 != -1) {
            class198.field2742 = false;
            class29.method228(-92, class204.field2772);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3532)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class21.method143((byte) -34, "argument count");
            }
            class435.field6243 = Integer.parseInt(arg0[0]);
            class67.field1043 = 2;
            if (arg0[1].equals("live")) {
                class62.field975 = 0;
            } else if (arg0[1].equals("rc")) {
                class62.field975 = 1;
            } else if (arg0[1].equals("wip")) {
                class62.field975 = 2;
            } else {
                class21.method143((byte) -68, "modewhat");
            }
            class40.field608 = class181.method1198(arg0[2], 0);
            if (class40.field608 == -1) {
                if (arg0[2].equals("english")) {
                    class40.field608 = 0;
                } else if (arg0[2].equals("german")) {
                    class40.field608 = 1;
                } else {
                    class21.method143((byte) -123, "language");
                }
            }
            class28.method219(32768, class40.field608);
            class318.field4370 = false;
            class188.field2614 = false;
            if (arg0[3].equals("game0")) {
                class180.field2521 = 0;
            } else if (arg0[3].equals("game1")) {
                class180.field2521 = 1;
            } else {
                class21.method143((byte) -73, "game");
            }
            class441.field6390 = "";
            class237.field3231 = 0;
            class84.field1299 = class180.field2521;
            class406.field5913 = 0;
            client var1 = new client();
            class331.field4489 = var1;
            var1.method2793(1024, 29, false, 768, class62.field975 + 32, (byte) -127, class180.field2521 == 1 ? "stellardawn" : "runescape", 563);
            class393.field5746.setLocation(40, 40);
        } catch (Exception var3) {
            class184.method1214(-77, (String) null, var3);
        }
        field2334++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 3597)
    private final void method1110(int arg0, int arg1) {
        class362.field5086 = 0;
        class296.field4115.field4781++;
        class165.field2358 = null;
        class296.field4115.field4780 = arg0;
        field2340++;
        if (arg1 > -86) {
            method1112(true);
        }
        class312.field4269 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 3617)
    private final void method1111(boolean arg0) {
        field2330++;
        class327.field4459 = 0;
        while (class258.method1594((byte) -90) && class327.field4459 < 128) {
            if (!class8.method59(23191) || class215.field2859 != '`' && class215.field2859 != '§') {
                class123.field1724[class327.field4459] = class243.field3356;
                class327.field4471[class327.field4459] = class215.field2859;
                class327.field4459++;
            } else if (class64.method430(0)) {
                class168.method1136((byte) -17);
            } else {
                class53.method357(100);
            }
        }
        if (class64.method430(0)) {
            class169.method1143((byte) -124);
        }
        class63.field980++;
        class123.method820(-1, (class383) null, -1, -8018);
        class236.method1489(-1, (class383) null, -1, -121);
        if (!arg0) {
            return;
        }
        class269.method1657((byte) 83);
        class441.field6398++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class437 var12 = class445.field6422[var2];
            if (var12 != null) {
                byte var13 = var12.field6290.field2957;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method410((byte) 94);
                    if ((var13 & 0x2) != 0 && var12.field948 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field956[0] + var15;
                            int var18 = var12.field944[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class432.field6220 - var14 - 1) {
                                var17 = class432.field6220 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class267.field3646 - var14 - 1)) {
                                var18 = class267.field3646 - var14 - 1;
                            }
                            int var19 = class237.method1493(class333.field4502, var17, class24.field326[var12.field6198], -1, 0, true, var14, class66.field1039, var14, var18, 0, 0, var14, var12.field956[0], var12.field944[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field956[var20] = class66.field1039[var19 - var20 - 1];
                                    var12.field944[var20] = class333.field4502[var19 - var20 - 1];
                                    var12.field940[var20] = 1;
                                }
                                var12.field948 = var19;
                            }
                        }
                    }
                    class401.method2587(var12, true, 0);
                    int var21 = class9.method60(var12, (byte) -82);
                    class374.method2446((byte) 120, class229.field3050, var12, var21, class83.field1283);
                    class58.method385((byte) -113, var12);
                }
            }
        }
        if (class24.field323 == 0 && class282.field3867 == 0) {
            if (class123.field1731 == 2) {
                class289.method1867(10526);
            } else {
                class258.method1585(-1);
            }
            if (class368.field5158 >> 7 < 14 || (class368.field5158 >> 7) >= (class432.field6220 - 14) || (class336.field4561 >> 7) < 14 || (class267.field3646 - 14) <= (class336.field4561 >> 7)) {
                class157.method1059(-62);
            }
        }
        while (true) {
            class410 var3;
            class383 var4;
            class383 var5;
            do {
                var3 = (class410) class405.field5884.method1314((byte) -127);
                if (var3 == null) {
                    while (true) {
                        class410 var6;
                        class383 var7;
                        class383 var8;
                        do {
                            var6 = (class410) class209.field2814.method1314((byte) -124);
                            if (var6 == null) {
                                while (true) {
                                    class410 var9;
                                    class383 var10;
                                    class383 var11;
                                    do {
                                        var9 = (class410) class5.field76.method1314((byte) 21);
                                        if (var9 == null) {
                                            if (class142.field2046 != null) {
                                                class36.method261((byte) 72);
                                            }
                                            if ((class35.field541 % 1500) == 0) {
                                                class376.method2457((byte) -10);
                                            }
                                            class437.method2737((byte) -90);
                                            if (class27.field435 && (class224.method1425(-26805) - 60000L) > class371.field5253) {
                                                class412.method2637(0);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field5946;
                                        if (var10.field5545 < 0) {
                                            break;
                                        }
                                        var11 = class290.method1869((byte) 49, var10.field5538);
                                    } while (var11 == null || var11.field5465 == null || var11.field5465.length <= var10.field5545 || var11.field5465[var10.field5545] != var10);
                                    class111.method738(var9);
                                }
                            }
                            var7 = var6.field5946;
                            if (var7.field5545 < 0) {
                                break;
                            }
                            var8 = class290.method1869((byte) 116, var7.field5538);
                        } while (var8 == null || var8.field5465 == null || var7.field5545 >= var8.field5465.length || var8.field5465[var7.field5545] != var7);
                        class111.method738(var6);
                    }
                }
                var4 = var3.field5946;
                if (var4.field5545 < 0) {
                    break;
                }
                var5 = class290.method1869((byte) 31, var4.field5538);
            } while (var5 == null || var5.field5465 == null || var5.field5465.length <= var4.field5545 || var5.field5465[var4.field5545] != var4);
            class111.method738(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V", line = 3846)
    public static final void method1112(boolean arg0) {
        if (arg0) {
            class5.field79 = class77.field1200;
            class249.field3456 = class435.field6248;
        } else {
            class5.field79 = class383.field5456;
            class249.field3456 = class156.field2213;
        }
        class176.field2480 = class5.field79.length;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrg;)Z", line = 3860)
    public static final boolean method1113(class383 arg0) {
        if (class280.field3829) {
            if (method1119(arg0).field3612 != 0) {
                return false;
            }
            if (arg0.field5488 == 0) {
                return false;
            }
        }
        return arg0.field5444;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3883)
    public static final void method1114() {
        class48.field743 = 0;
        for (int var0 = 0; var0 < class71.field1096; var0++) {
            class437 var1 = class445.field6422[class280.field3837[var0]];
            if (var1.field903 && var1.method411(-516) != -1) {
                int var2 = (var1.method410((byte) 59) - 1) * 64 + 60;
                int var3 = var1.field6197 - var2 >> 7;
                int var4 = var1.field6192 - var2 >> 7;
                class61 var5 = class32.method241(true, var4, class265.field3617, var3);
                if (var5 != null) {
                    int var6 = var5.field862;
                    if (var5 instanceof class437) {
                        var6 += 2048;
                    }
                    if (var5.field866 == 0 && var5.method411(-516) != -1) {
                        class125.field1750[class48.field743] = var6;
                        class30.field472[class48.field743] = var6;
                        class48.field743++;
                        var5.field866++;
                    }
                    class125.field1750[class48.field743] = var6;
                    class30.field472[class48.field743] = var1.field862 + 2048;
                    class48.field743++;
                    var5.field866++;
                }
            }
        }
        class66.method454(-20333, class48.field743 - 1, class30.field472, class125.field1750, 0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrg;)Lrg;", line = 3939)
    public static final class383 method1115(class383 arg0) {
        int var1 = method1119(arg0).method1635(573849150);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class290.method1869((byte) 108, arg0.field5538);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lui;", line = 3958)
    public static final class124 method1116(int arg0, byte arg1) {
        if (arg1 > -2) {
            return null;
        } else {
            field2333++;
            return (class124) class71.field1103.method1412((byte) -54, (long) arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3970)
    public static final void method1117() {
        int var0 = class340.field4749 ? class169.field2407 : class71.field1096 + class169.field2407;
        for (int var1 = -1; var1 < var0; var1++) {
            class61 var2;
            if (var1 < 0) {
                var2 = class307.field4211;
            } else if (var1 < class169.field2407) {
                var2 = class12.field153[class67.field1055[var1]];
            } else {
                var2 = class445.field6422[class280.field3837[var1 - class169.field2407]];
            }
            if (var2.field855 >= 0) {
                int var3 = var2.method410((byte) 101);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field6197 & 0x7F) == 0 && (var2.field6192 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field6197 & 0x7F) == 64 && (var2.field6192 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class354 && var2.field953 != null && class35.field541 >= var2.field943 && class35.field541 < var2.field945) {
                    ((class354) var2).field5001 = false;
                }
                var2.field6191 = class279.method1698(var2.field6197, var2.field6192, class265.field3617, (byte) 3);
                class259.method1601(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 4015)
    public static void method1118(byte arg0) {
        field2344 = null;
        field2346 = null;
        if (arg0 != -1) {
            method1101(-3, (class281) null, 88, (class383) null, 126);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrg;)Lsj;", line = 4027)
    public static final class265 method1119(class383 arg0) {
        class265 var1 = (class265) class287.field3986.method1412((byte) -54, ((long) arg0.field5507 << 32) + (long) arg0.field5545);
        return var1 == null ? arg0.field5501 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4034)
    public final void method1120(int arg0) {
        field2329++;
        if (class79.field1220 == 1000) {
            return;
        }
        class35.field541++;
        if (class35.field541 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class165.field2354 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class442.field6412.setSeed((long) class165.field2354);
        }
        this.method1107((byte) -99);
        if (class125.field1746 != null) {
            class125.field1746.method1129(0);
        }
        class207.method1353((byte) -90);
        class154.method1038(0);
        class366.method2350((byte) 2);
        class68.method464((byte) 104);
        if (class353.field4938 != null) {
            int var3 = class353.field4938.method1568(arg0 + 80);
            class107.field1586 = var3;
        }
        if (class408.field5920 != null) {
            class408.field5920.method1726((int) class224.method1425(-26805));
        }
        class327.method2055(1);
        if (class79.field1220 == 0) {
            this.method1096(0);
            class312.method1982((byte) 61);
        } else if (class79.field1220 == 5) {
            this.method1096(0);
            class312.method1982((byte) 78);
        } else if (class79.field1220 == 25 || class79.field1220 == 28) {
            class137.method942((byte) -23);
        }
        if (arg0 != 40) {
            field2341 = 37;
        }
        if (class79.field1220 == 10) {
            this.method1111(true);
            class353.method2284(1);
            class260.method1604(true);
            class5.method40(-13366);
        } else if (class79.field1220 == 30) {
            class67.method460(false);
        } else if (class79.field1220 == 40) {
            class5.method40(-13366);
            if (class163.field2296 != -3) {
                if (class163.field2296 == 15) {
                    class305.method1945(115);
                } else if (class163.field2296 != 2) {
                    class83.method590(0);
                }
            }
        }
        class197.method1323(class408.field5920, (byte) 70);
    }
}

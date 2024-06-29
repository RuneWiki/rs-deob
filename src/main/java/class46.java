import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lmb;")
    public static class84[] field994 = new class84[500];

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public static int[] field998 = new int[500];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lmb;")
    public static class84 field997 = class79.method672(true, "");

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field1001;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        field998 = null;
        field995 = null;
        field997 = null;
        if (arg0 != 0) {
            method330(24);
        }
        field994 = null;
        field1001 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method330(int arg0) {
        class115 var1 = class88.field2209;
        synchronized (class88.field2209) {
            class129.field3109 = class109.field2644;
            class20.field427 = class6.field115;
            class60.field1498 = class83.field2046;
            int var2 = 63 % ((-arg0 - 80) / 35);
            class37.field831 = class49.field1043;
            class83.field2034 = class129.field3119;
            class47.field1035 = class86.field2120;
            class44.field972 = class59.field1473;
            class49.field1043 = 0;
        }
        field999++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static final void method331(int arg0) {
        class20.field416++;
        field1002++;
        class118.method960(19450, true);
        class43.method317(true, 84);
        class118.method960(arg0 + 19453, false);
        class43.method317(false, -112);
        class8.method41((byte) -98);
        class122.method985((byte) 63);
        if (!class138.field3330) {
            int var1 = class123.field2987;
            if (var1 < class66.field1638 / 256) {
                var1 = class66.field1638 / 256;
            }
            if (class133.field3194[4] && var1 < class76.field1892[4] + 128) {
                var1 = class76.field1892[4] + 128;
            }
            int var2 = class93.field2316 + class136.field3300 & 0x7FF;
            class139.method1130(class44.field976, var1 * 3 + 600, -1121700368, -50 + class41.method309((byte) 64, class40.field925.field3549, class40.field925.field3535, class13.field251), class64.field1581, var2, var1);
        }
        int var3;
        if (class138.field3330) {
            var3 = class123.method1016((byte) -100);
        } else {
            var3 = class143.method1169((byte) 109);
        }
        if (arg0 != -3) {
            return;
        }
        int var4 = class64.field1575;
        int var5 = class33.field733;
        int var6 = class59.field1463;
        int var7 = class50.field1072;
        int var8 = class71.field1733;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class133.field3194[var9]) {
                int var10 = (int) ((double) -class19.field408[var9] + (double) (class19.field408[var9] * 2 + 1) * Math.random() + Math.sin((double) class118.field2826[var9] / 100.0D * (double) class119.field2846[var9]) * (double) class76.field1892[var9]);
                if (var9 == 1) {
                    class64.field1575 += var10;
                }
                if (var9 == 3) {
                    class71.field1733 = class71.field1733 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class33.field733 += var10;
                }
                if (var9 == 4) {
                    class50.field1072 += var10;
                    if (class50.field1072 < 128) {
                        class50.field1072 = 128;
                    }
                    if (class50.field1072 > 383) {
                        class50.field1072 = 383;
                    }
                }
                if (var9 == 2) {
                    class59.field1463 += var10;
                }
            }
        }
        class106.method883(48);
        class26.field644 = class60.field1498 - 4;
        class26.field626 = class20.field427 - 4;
        class26.field641 = 0;
        class26.field614 = true;
        class125.method1027(85);
        class142.method1158();
        class125.method1027(105);
        class133.field3173.method478(class33.field733, class64.field1575, class59.field1463, class50.field1072, class71.field1733, var3);
        class125.method1027(94);
        class133.field3173.method474();
        class66.method597((byte) 7);
        class122.method1006(-92);
        ((class105) class104.field2528).method880((byte) -99, class108.field2613);
        class129.method1052(111);
        if (class27.field660 && class16.method100(true, false, (byte) -22) == 0) {
            class27.field660 = false;
        }
        if (class27.field660) {
            class106.method883(48);
            class142.method1158();
            class74.method645(null, 16777215, class134.field3214, false);
        }
        class125.method1027(118);
        class97.method807((byte) -73);
        class59.field1463 = var6;
        class33.field733 = var5;
        class50.field1072 = var7;
        class64.field1575 = var4;
        class71.field1733 = var8;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLsd;Ljava/awt/Component;)V")
    public static final void method332(byte arg0, class122 arg1, Component arg2) {
        field1003++;
        if (class8.field144) {
            return;
        }
        class128.field3083 = class91.method776(class38.field836, false, class1.field7, arg1);
        class141.field3372 = class91.method776(class38.field836, false, class49.field1057, arg1);
        class141.field3380 = class91.method776(class38.field836, false, class108.field2609, arg1);
        class120.field2872 = class91.method776(class38.field836, false, class103.field2504, arg1);
        class90.field2251 = class91.method776(class38.field836, false, class124.field2996, arg1);
        class109.field2647 = class91.method776(class38.field836, false, class97.field2395, arg1);
        class14.field279 = class70.method619(479, 96, arg0 ^ 0xFFFFFFD9, arg2);
        class141.field3372.method979(0, 0);
        class17.field378 = class70.method619(172, 156, 4, arg2);
        class142.method1158();
        class141.field3380.method979(0, 0);
        class52.field1160 = class70.method619(190, 261, arg0 ^ 0xFFFFFFD9, arg2);
        class128.field3083.method979(0, 0);
        class17.field368 = class70.method619(512, 334, 4, arg2);
        class142.method1158();
        client.field490 = class70.method619(496, 50, arg0 ^ 0xFFFFFFD9, arg2);
        class119.field2858 = class70.method619(269, 37, 4, arg2);
        class20.field425 = class70.method619(249, 45, 4, arg2);
        class112 var3 = class141.method1145(class38.field836, arg1, 95, class120.field2894);
        class120.field2889 = class70.method619(var3.field2687, var3.field2685, 4, arg2);
        var3.method920(0, 0);
        class112 var4 = class141.method1145(class38.field836, arg1, arg0 ^ 0xFFFFFF8C, class127.field3069);
        class108.field2618 = class70.method619(var4.field2687, var4.field2685, 4, arg2);
        var4.method920(0, 0);
        class112 var5 = class141.method1145(class38.field836, arg1, 110, class96.field2373);
        class20.field415 = class70.method619(var5.field2687, var5.field2685, arg0 + 39, arg2);
        var5.method920(0, 0);
        class112 var6 = class141.method1145(class38.field836, arg1, arg0 ^ 0xFFFFFFAC, class109.field2646);
        class84.field2080 = class70.method619(var6.field2687, var6.field2685, 4, arg2);
        var6.method920(0, 0);
        class112 var7 = class141.method1145(class38.field836, arg1, arg0 + 150, class77.field1949);
        class136.field3298 = class70.method619(var7.field2687, var7.field2685, 4, arg2);
        var7.method920(0, 0);
        class112 var8 = class141.method1145(class38.field836, arg1, 77, class83.field2043);
        if (arg0 != -35) {
            field1000 = 35;
        }
        class65.field1614 = class70.method619(var8.field2687, var8.field2685, 4, arg2);
        var8.method920(0, 0);
        class112 var9 = class141.method1145(class38.field836, arg1, 57, class126.field3038);
        class108.field2615 = class70.method619(var9.field2687, var9.field2685, 4, arg2);
        var9.method920(0, 0);
        class112 var10 = class141.method1145(class38.field836, arg1, 50, class88.field2191);
        class133.field3160 = class70.method619(var10.field2687, var10.field2685, 4, arg2);
        var10.method920(0, 0);
        class112 var11 = class141.method1145(class38.field836, arg1, arg0 ^ 0xFFFFFFA5, class10.field166);
        class51.field1137 = class70.method619(var11.field2687, var11.field2685, 4, arg2);
        var11.method920(0, 0);
        client.field477 = class91.method776(class38.field836, false, class27.field665, arg1);
        class84.field2107 = class91.method776(class38.field836, false, class115.field2764, arg1);
        class54.field1238 = class91.method776(class38.field836, false, class79.field1953, arg1);
        class38.field838 = client.field477.method983();
        class38.field838.method980();
        class110.field2667 = class84.field2107.method983();
        class110.field2667.method980();
        class75.field1848 = client.field477.method983();
        class75.field1848.method978();
        class64.field1586 = class84.field2107.method983();
        class64.field1586.method978();
        class14.field272 = class54.field1238.method983();
        class14.field272.method978();
        class16.field359 = client.field477.method983();
        class16.field359.method980();
        class16.field359.method978();
        class8.field147 = class84.field2107.method983();
        class8.field147.method980();
        class8.field147.method978();
        class144.field3484 = class115.method945(76, class107.field2591, arg1, class38.field836);
        class129.field3106 = new int[151];
        class82.field2015 = new int[33];
        class72.field1776 = new int[151];
        class62.field1543 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 0;
            int var18 = 999;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class141.field3380.field2903[class141.field3380.field2904 * var12 + var19] == 0) {
                    if (var18 == 999) {
                        var18 = var19;
                    }
                } else if (var18 != 999) {
                    var17 = var19;
                    break;
                }
            }
            class82.field2015[var12] = var18;
            class62.field1543[var12] = var17 - var18;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class141.field3380.field2903[class141.field3380.field2904 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class129.field3106[var13 - 5] = var14 - 25;
            class72.field1776[var13 - 5] = var15 - var14;
        }
        class8.field144 = true;
    }
}

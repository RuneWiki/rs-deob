import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class477 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6638 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field6641 = 0;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Z")
    public static boolean field6644 = true;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Luu;")
    public static class237 field6645;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lda;")
    public static class402 field6640;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lfe;")
    public static class638 field6642;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2905(int arg0) {
        field6645 = null;
        if (arg0 != -978) {
            field6643 = 124;
        }
        field6642 = null;
        field6640 = null;
        field6638 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZI)Luu;")
    private static final class237 method2906(int arg0, int arg1, boolean arg2, int arg3) {
        field6637++;
        class684 var4 = null;
        if (class261.field3769 != null) {
            var4 = new class684(arg0, class261.field3769, class685.field9522[arg0], 1000000);
        }
        class114.field1524[arg0] = class491.field6908.method681(arg0, class230.field3122, 9108, var4);
        if (arg3 != 1000000) {
            field6643 = -55;
        }
        class114.field1524[arg0].method2964(8220);
        return new class237(class114.field1524[arg0], arg2, arg1);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
    public static final int method2907(int arg0) {
        if (class332.field4707.field4754.method3378(0) == 0) {
            for (int var1 = 0; var1 < class1.field3; var1++) {
                if (class434.field6050[var1].method1620(-2815) == 's' || class434.field6050[var1].method1620(-2815) == 'S') {
                    class332.field4707.method2158(1, class332.field4707.field4754, arg0 - 25);
                    class292.field4188 = true;
                    break;
                }
            }
        }
        field6639++;
        if (class712.field9957 == class490.field6862) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class97.method664((byte) -50);
            if (class572.field7903 == 0L) {
                class572.field7903 = var4;
            }
            if (var3 > 16384 && var4 - class572.field7903 < 5000L) {
                if ((var4 - class397.field5704) > 1000L) {
                    System.gc();
                    class397.field5704 = var4;
                }
                return 0;
            }
        }
        if (arg0 != 10) {
            return 27;
        }
        if (class712.field9957 == class490.field6871) {
            if (class491.field6908 == null) {
                class491.field6908 = new class103(class396.field5689, class360.field5163, class505.field7028, class715.field9978);
            }
            if (!class491.field6908.method685((byte) 95)) {
                return 0;
            }
            class542.method3209(true, 0, (byte) -88, null);
            class31.field373 = !class172.method1101((byte) -127);
            class287.field4122 = method2906(class31.field373 ? 34 : 32, 1, false, arg0 + 999990);
            class274.field3969 = method2906(33, 1, false, 1000000);
            class307.field4312 = method2906(13, 1, false, 1000000);
        }
        if (class712.field9957 == class490.field6872) {
            boolean var6 = class274.field3969.method1591(0);
            int var7 = class114.field1524[33].method2961(0);
            int var8 = var7 + class114.field1524[class31.field373 ? 34 : 32].method2961(arg0 ^ 0xA);
            int var9 = var8 + class114.field1524[13].method2961(0);
            int var10 = var9 + (var6 ? 100 : class274.field3969.method1601((byte) -117));
            if (var10 != 400) {
                return var10 / 4;
            }
            class392.field5630 = class287.field4122.method1593((byte) -88);
            class649.field8705 = class274.field3969.method1593((byte) -78);
            class47.method275(class287.field4122, 113);
            int var11 = class332.field4707.field4781.method630(0);
            class73.field1100 = new class486(class289.field4140, class120.field1576, class274.field3969);
            int[] var12 = class73.field1100.method2954((byte) -41, var11);
            if (var12.length == 0) {
                var12 = class73.field1100.method2954((byte) -41, 0);
            }
            class340 var13 = new class340(class287.field4122, class307.field4312);
            if (var12.length > 0) {
                class312.field4340 = new class201[var12.length];
                for (int var14 = 0; var14 < class312.field4340.length; var14++) {
                    class312.field4340[var14] = new class517(class73.field1100.method2955(var12[var14], (byte) 38), var13);
                }
            }
        }
        if (class712.field9957 == class490.field6873) {
            class656.method3659(class287.field4122, class712.method4008((byte) -106), class307.field4312, -6);
        }
        if (class712.field9957 == class490.field6874) {
            int var15 = class304.method2001(-11523);
            int var16 = class659.method3664((byte) -39);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class712.field9957 == class490.field6875) {
            if (class312.field4340 != null && class312.field4340.length > 0) {
                if (class312.field4340[0].method1226(-124) < 100) {
                    return 0;
                }
                if (class312.field4340.length > 1 && class73.field1100.method2953((byte) -64) && class312.field4340[1].method1226(arg0 ^ 0xFFFFFF8E) < 100) {
                    return 0;
                }
            }
            class169.method1083(arg0 + 21585, class129.field1802);
            class114.method731(-29269, class129.field1802);
            class647.method3624(1, true);
        }
        if (class712.field9957 == class490.field6876) {
            for (int var17 = 0; var17 < 4; var17++) {
                class209.field2735[var17] = method2908(class277.field4036, (byte) -20, class667.field9202);
            }
        }
        if (class712.field9957 == class490.field6877) {
            class671.field9318 = method2906(8, 1, false, 1000000);
            class442.field6139 = method2906(0, 1, false, 1000000);
            class723.field10039 = method2906(1, 1, false, 1000000);
            class27.field350 = method2906(2, 1, false, arg0 ^ 0xF424A);
            class432.field6032 = method2906(3, 1, false, 1000000);
            class648.field8694 = method2906(4, 1, false, 1000000);
            class413.field5861 = method2906(5, 1, true, 1000000);
            field6645 = method2906(6, 1, true, 1000000);
            class186.field2537 = method2906(7, 1, false, 1000000);
            class281.field4078 = method2906(9, 1, false, 1000000);
            class463.field6440 = method2906(10, 1, false, 1000000);
            class95.field1311 = method2906(11, 1, false, 1000000);
            class587.field7997 = method2906(12, 1, false, 1000000);
            class425.field5962 = method2906(14, 1, false, arg0 + 999990);
            class656.field8765 = method2906(15, 1, false, 1000000);
            class244.field3628 = method2906(16, 1, false, arg0 ^ 0xF424A);
            class171.field2377 = method2906(17, 1, false, 1000000);
            class41.field502 = method2906(18, 1, false, 1000000);
            class589.field8029 = method2906(19, 1, false, 1000000);
            class604.field8153 = method2906(20, 1, false, 1000000);
            class259.field3748 = method2906(21, 1, false, 1000000);
            class380.field5457 = method2906(22, 1, false, 1000000);
            class701.field9774 = method2906(23, 1, true, 1000000);
            class715.field9979 = method2906(24, 1, false, 1000000);
            class329.field4661 = method2906(25, 1, false, arg0 ^ 0xF424A);
            class357.field5130 = method2906(26, 1, true, 1000000);
            class652.field8737 = method2906(27, 1, false, arg0 ^ 0xF424A);
            class436.field6092 = method2906(28, 1, true, 1000000);
            class23.field277 = method2906(29, 1, false, 1000000);
            class209.field2734 = method2906(30, 1, true, 1000000);
            class137.field1945 = method2906(31, 1, true, arg0 + 999990);
            class449.field6213 = method2906(36, 2, true, 1000000);
        }
        if (class712.field9957 == class490.field6878) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class114.field1524[var19] != null) {
                    var18 += class114.field1524[var19].method2961(0) * class524.field7277[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class719.field10009 < 0) {
                    class719.field10009 = var18;
                }
                return (var18 - class719.field10009) * 100 / (100 - class719.field10009);
            }
            class370.method2324(40, class671.field9318);
            class656.method3659(class671.field9318, class712.method4008((byte) -106), class307.field4312, -6);
        }
        if (class712.field9957 == class490.field6879) {
            if (class756.field10560 == -1) {
                class756.field10560 = field6645.method1598("scape main", false);
            }
            class8.method37(false);
            class647.method3624(2, true);
        }
        if (class712.field9957 == class490.field6880) {
            class469.method2859(class209.field2734, true, class159.field2227);
        }
        if (class712.field9957 == class490.field6881) {
            int var20 = class35.method191(arg0 ^ 0x57);
            if (var20 < 100) {
                return var20;
            }
            class649.method3636((byte) -102, class436.field6092.method1583(1, -60));
            class47.method340(class436.field6092.method1583(3, -56), -108);
        }
        if (class712.field9957 == class490.field6882) {
            if (class32.field411 != -1 && !class186.field2537.method1570(-2, class32.field411, 0)) {
                return 99;
            }
            class267.field3902 = new class64(class357.field5130, class281.field4078, class671.field9318);
            class360.field5161 = new class356(class289.field4140, class120.field1576, class27.field350);
            class464.field6461 = new class72(class289.field4140, class120.field1576, class27.field350);
            class481.field6713 = new class357(class289.field4140, class120.field1576, class27.field350, class671.field9318);
            class189.field2579 = new class550(class289.field4140, class120.field1576, class171.field2377);
            class34.field447 = new class547(class289.field4140, class120.field1576, class27.field350);
            class228.field3059 = new class289(class289.field4140, class120.field1576, class27.field350);
            class594.field8074 = new class512(class289.field4140, class120.field1576, class27.field350, class671.field9318);
            class145.field2041 = new class416(class289.field4140, class120.field1576, class27.field350, class186.field2537);
            class258.field3739 = new class560(class289.field4140, class120.field1576, class27.field350);
            class95.field1312 = new class200(class289.field4140, class120.field1576, class27.field350);
            class20.field192 = new class109(class289.field4140, class120.field1576, true, class244.field3628, class186.field2537);
            class700.field9771 = new class1(class289.field4140, class120.field1576, class27.field350, class671.field9318);
            class71.field1078 = new class496(class289.field4140, class120.field1576, class27.field350, class671.field9318);
            class525.field7291 = new class26(class289.field4140, class120.field1576, true, class41.field502, class186.field2537);
            class291.field4179 = new class221(class289.field4140, class120.field1576, true, class360.field5161, class589.field8029, class186.field2537);
            class248.field3649 = new class649(class289.field4140, class120.field1576, class27.field350);
            class607.field8188 = new class495(class289.field4140, class120.field1576, class604.field8153, class442.field6139, class723.field10039);
            class463.field6453 = new class569(class289.field4140, class120.field1576, class27.field350);
            class560.field7796 = new class162(class289.field4140, class120.field1576, class27.field350);
            class129.field1776 = new class729(class289.field4140, class120.field1576, class259.field3748, class186.field2537);
            class664.field8919 = new class627(class289.field4140, class120.field1576, class27.field350);
            class155.field2183 = new class368(class289.field4140, class120.field1576, class27.field350);
            class501.field6986 = new class519(class289.field4140, class120.field1576, class27.field350);
            class601.field8138 = new class286(class289.field4140, class120.field1576, class380.field5457);
            class131.field1846 = new class65(class289.field4140, class120.field1576, class27.field350);
            class445.method2717(class671.field9318, class432.field6032, class186.field2537, class307.field4312, -1751013887);
            class626.method3527(class23.field277, -22694);
            class179.field2470 = new class140(class120.field1576, class715.field9979, class329.field4661);
            class145.field2038 = new class173(class120.field1576, class715.field9979, class329.field4661, new class336());
            class327.method2085(true);
            class20.field192.method713(94, class332.field4707.field4774.method1242(0) == 0);
            class124.field1712 = new class645();
            class211.method1261(18388);
            class435.method2682(116, class652.field8737);
            class596.method3419(class267.field3902, class186.field2537, arg0 ^ 0xE);
            class20 var21 = new class20(class463.field6440.method1582("", false, "huffman"));
            class726.method4053(var21, (byte) 116);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class67.field1033 = class303.method1993((byte) -77);
            class372.field5248 = new class594(true, class159.field2227);
        }
        if (class712.field9957 == class490.field6884) {
            int var22 = class72.method554(class671.field9318, 0) + class501.method3019(0, true);
            int var23 = class670.method3776(arg0 ^ 0x1A) + class659.method3664((byte) -39);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class712.field9957 == class490.field6885) {
            class461.method2808(class701.field9774, class34.field447, class228.field3059, class20.field192, class700.field9771, class71.field1078, class124.field1712);
        }
        if (class712.field9957 == class490.field6886) {
            class380.field5458 = new String[class155.field2183.field5209];
            class621.field8315 = new int[class501.field6986.field7239];
            class693.field9627 = new boolean[class501.field6986.field7239];
            for (int var24 = 0; var24 < class501.field6986.field7239; var24++) {
                if (class501.field6986.method3097(var24, (byte) 114).field100 == 0) {
                    class693.field9627[var24] = true;
                    class671.field9313++;
                }
                class621.field8315[var24] = -1;
            }
            class268.method1821(false);
            class12.field106 = class432.field6032.method1598("loginscreen", false);
            class211.field2789 = class432.field6032.method1598("lobbyscreen", false);
            class413.field5861.method1589((byte) 126, false, true);
            field6645.method1589((byte) 113, true, true);
            class671.field9318.method1589((byte) 121, true, true);
            class307.field4312.method1589((byte) 91, true, true);
            class463.field6440.method1589((byte) 97, true, true);
            class432.field6032.method1589((byte) 121, true, true);
            class27.field350.field3498 = 2;
            class131.field1839 = true;
            class171.field2377.field3498 = 2;
            class244.field3628.field3498 = 2;
            class41.field502.field3498 = 2;
            class589.field8029.field3498 = 2;
            class604.field8153.field3498 = 2;
            class259.field3748.field3498 = 2;
        }
        if (class712.field9957 == class490.field6887) {
            if (!class424.method2641(class12.field106, arg0 ^ 0xFFFFD27A)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class266.field3900[class12.field106].length; var26++) {
                class755 var27 = class266.field3900[class12.field106][var26];
                if (var27.field10416 == 5 && var27.field10490 != -1 && !class671.field9318.method1570(-2, var27.field10490, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class712.field9957 == class490.field6888) {
            class62.method443(true, 115);
        }
        if (class712.field9957 == class490.field6889) {
            class155.field2184.method2774(-128);
            try {
                class368.field5215.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class312.field4340 = null;
            class73.field1100 = null;
            class155.field2184 = null;
            class274.field3969 = null;
            class287.field4122 = null;
            class368.field5215 = null;
            class111.method722((byte) -2);
            class580.field7940 = class332.field4707.field4754.method3378(0) == 1;
            class332.field4707.method2158(1, class332.field4707.field4754, -15);
            if (class580.field7940) {
                class332.field4707.method2158(0, class332.field4707.field4753, -15);
            } else if (class332.field4707.field4753.field2097 && class372.field5248.field8060 < 512 && class372.field5248.field8060 != 0) {
                class332.field4707.method2158(0, class332.field4707.field4753, -15);
            }
            class263.method1802(-2);
            if (class580.field7940) {
                class393.method2459(0, false, 1);
            } else {
                class393.method2459(class332.field4707.field4753.method963(0), false, arg0 ^ 0xB);
            }
            class372.method2330(-1, class332.field4707.field4801.method2799(0), -1, false, 3);
            class169.method1083(21595, class129.field1802);
            class114.method731(-29269, class129.field1802);
            class686.method3863(class671.field9318, class129.field1802, (byte) 80);
            class726.method4056((byte) 120, class113.field1513);
        }
        return class85.method596(-1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)Lnfa;")
    public static final class228 method2908(int arg0, byte arg1, int arg2) {
        field6636++;
        class228 var3 = new class228();
        var3.field3052 = -1;
        var3.field3061 = arg2 + 1 + 5;
        var3.field3063 = -1;
        var3.field3060 = arg0 + 5 + 1;
        var3.field3049 = new int[var3.field3060][var3.field3061];
        var3.method1354((byte) 114);
        if (arg1 != -20) {
            field6644 = false;
        }
        return var3;
    }
}

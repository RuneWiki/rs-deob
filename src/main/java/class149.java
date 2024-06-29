import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class149 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field2111 = 0;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Z")
    public static boolean field2114 = false;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Lvg;")
    public static class622 field2110 = new class622(79, 8);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "J")
    public static long field2108;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I", line = 8)
    public static final int method1064(boolean arg0) {
        if (!class335.field4872.field9494) {
            for (int var1 = 0; var1 < class314.field4593; var1++) {
                if (class272.field3551[var1].method2604(-97) == 's' || class272.field3551[var1].method2604(-70) == 'S') {
                    class335.field4872.field9494 = true;
                    break;
                }
            }
        }
        field2107++;
        if (class580.field8424 == class205.field2797) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class60.method371(!arg0);
            if (class243.field3227 == 0L) {
                class243.field3227 = var4;
            }
            if (var3 > 16384 && var4 - class243.field3227 < 5000L) {
                if (var4 - class147.field2091 > 1000L) {
                    System.gc();
                    class147.field2091 = var4;
                }
                return 0;
            }
        }
        if (class580.field8426 == class205.field2797) {
            if (class550.field8096 == null) {
                class550.field8096 = new class370(class212.field2856, class72.field1147, class60.field963, class144.field2080);
            }
            if (!class550.field8096.method2289(98)) {
                return 0;
            }
            class4.method14(0, 25474, null);
            class409.field6099 = !class360.method2214(0);
            class139.field2024 = class357.method2201(class409.field6099 ? 34 : 32, -5400, 1, false);
            class147.field2096 = class357.method2201(33, -5400, 1, false);
            class283.field3785 = class357.method2201(13, -5400, 1, false);
        }
        if (class580.field8427 == class205.field2797) {
            class147.field2096.method1847(false);
            int var6 = class81.field1311[33].method3493(72);
            int var7 = var6 + class81.field1311[class409.field6099 ? 34 : 32].method3493(54);
            int var8 = var7 + class81.field1311[13].method3493(90);
            int var9 = var8 + class147.field2096.method1840(-19396);
            if (var9 != 400) {
                return var9 / 4;
            }
            class85.field1333 = class139.field2024.method1820((byte) 72);
            class529.field7810 = class147.field2096.method1820((byte) -98);
            class165.method1161((byte) -22, class139.field2024);
            int var10 = class335.field4872.field9502;
            class430.field6256 = new class197(class478.field6840, class262.field3401, class147.field2096);
            int[] var11 = class430.field6256.method1292((byte) 110, var10);
            class595 var12 = new class595(class139.field2024, class283.field3785);
            if (var11.length > 0) {
                class326.field4725 = new class126[var11.length];
                for (int var13 = 0; var13 < class326.field4725.length; var13++) {
                    class326.field4725[var13] = new class365(class430.field6256.method1287(var11[var13], 1), var12);
                }
            }
        }
        if (!arg0) {
            return -35;
        }
        if (class580.field8428 == class205.field2797) {
            class522.method2948(class139.field2024, class621.method3582(0), class283.field3785, -1);
        }
        if (class580.field8429 == class205.field2797) {
            int var14 = class484.method2769(200);
            int var15 = class223.method1392((byte) -29);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class580.field8430 == class205.field2797) {
            if (class326.field4725 != null && class326.field4725.length > 0) {
                if (class326.field4725[0].method900((byte) -123) < 100) {
                    return 0;
                }
                if (class326.field4725.length > 1 && class430.field6256.method1289((byte) -92) && class326.field4725[1].method900((byte) -127) < 100) {
                    return 0;
                }
            }
            class584.method3346(class332.field4821, (byte) 127);
            class502.method2862(class332.field4821, -61);
            class322.method2003(0, 1);
        }
        if (class580.field8431 == class205.field2797) {
            for (int var16 = 0; var16 < 4; var16++) {
                class629.field9104[var16] = class14.method95((byte) 28, class72.field1144, class668.field9444);
            }
        }
        if (class580.field8432 == class205.field2797) {
            class595.field8616 = class357.method2201(8, -5400, 1, false);
            class282.field3772 = class357.method2201(0, -5400, 1, false);
            class197.field2702 = class357.method2201(1, -5400, 1, false);
            class223.field2947 = class357.method2201(2, -5400, 1, false);
            class97.field1483 = class357.method2201(3, -5400, 1, false);
            class148.field2100 = class357.method2201(4, -5400, 1, false);
            class43.field625 = class357.method2201(5, -5400, 1, true);
            class18.field360 = class357.method2201(6, -5400, 1, true);
            class638.field9171 = class357.method2201(7, -5400, 1, false);
            class510.field7199 = class357.method2201(9, -5400, 1, false);
            class288.field4178 = class357.method2201(10, -5400, 1, false);
            class251.field3297 = class357.method2201(11, -5400, 1, false);
            class587.field8518 = class357.method2201(12, -5400, 1, false);
            class674.field9509 = class357.method2201(14, -5400, 1, false);
            class657.field9379 = class357.method2201(15, -5400, 1, false);
            class554.field8140 = class357.method2201(16, -5400, 1, false);
            class654.field9365 = class357.method2201(17, -5400, 1, false);
            class425.field6216 = class357.method2201(18, -5400, 1, false);
            class394.field5968 = class357.method2201(19, -5400, 1, false);
            class224.field2958 = class357.method2201(20, -5400, 1, false);
            class56.field878 = class357.method2201(21, -5400, 1, false);
            class49.field777 = class357.method2201(22, -5400, 1, false);
            class326.field4732 = class357.method2201(23, -5400, 1, true);
            class537.field7867 = class357.method2201(24, -5400, 1, false);
            class51.field797 = class357.method2201(25, -5400, 1, false);
            class683.field9637 = class357.method2201(26, -5400, 1, true);
            class583.field8473 = class357.method2201(27, -5400, 1, false);
            class259.field3360 = class357.method2201(28, -5400, 1, true);
            class280.field3711 = class357.method2201(29, -5400, 1, false);
            class223.field2951 = class357.method2201(30, -5400, 1, true);
            class466.field6715 = class357.method2201(31, -5400, 1, true);
        }
        if (class580.field8433 == class205.field2797) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class81.field1311[var18] != null) {
                    var17 += class81.field1311[var18].method3493(48) * class132.field1925[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class64.field1005 < 0) {
                    class64.field1005 = var17;
                }
                return (var17 - class64.field1005) * 100 / (100 - class64.field1005);
            }
            class57.method357(class595.field8616, 100);
            class522.method2948(class595.field8616, class621.method3582(0), class283.field3785, -1);
        }
        if (class580.field8434 == class205.field2797) {
            class652.method3692(22050);
            class322.method2003(0, 2);
        }
        if (class580.field8435 == class205.field2797) {
            class39.method224(class223.field2951, true, class61.field978);
        }
        if (class580.field8436 == class205.field2797) {
            int var19 = class424.method2558((byte) 29);
            if (var19 < 100) {
                return var19;
            }
            class620.method3571(-15888, class259.field3360.method1830(!arg0, 1));
            class606.method3464(class259.field3360.method1830(false, 3), 496);
        }
        if (class580.field8437 == class205.field2797) {
            if (class197.field2698 != -1 && !class638.field9171.method1843((byte) -61, class197.field2698, 0)) {
                return 99;
            }
            class28.field492 = new class134(class683.field9637, class510.field7199, class595.field8616);
            class141.field2041 = new class247(class478.field6840, class262.field3401, class223.field2947);
            class547.field8070 = new class70(class478.field6840, class262.field3401, class223.field2947);
            class252.field3301 = new class104(class478.field6840, class262.field3401, class223.field2947, class595.field8616);
            class553.field8131 = new class291(class478.field6840, class262.field3401, class654.field9365);
            class2.field15 = new class397(class478.field6840, class262.field3401, class223.field2947);
            class547.field8069 = new class488(class478.field6840, class262.field3401, class223.field2947);
            class177.field2477 = new class621(class478.field6840, class262.field3401, class223.field2947, class638.field9171);
            class613.field8826 = new class533(class478.field6840, class262.field3401, class223.field2947);
            class342.field5068 = new class483(class478.field6840, class262.field3401, class223.field2947);
            class60.field965 = new class438(class478.field6840, class262.field3401, true, class554.field8140, class638.field9171);
            class189.field2572 = new class481(class478.field6840, class262.field3401, class223.field2947, class595.field8616);
            class652.field9331 = new class40(class478.field6840, class262.field3401, class223.field2947, class595.field8616);
            class563.field8235 = new class153(class478.field6840, class262.field3401, true, class425.field6216, class638.field9171);
            class259.field3355 = new class387(class478.field6840, class262.field3401, true, class141.field2041, class394.field5968, class638.field9171);
            class586.field8507 = new class236(class478.field6840, class262.field3401, class223.field2947);
            class203.field2769 = new class524(class478.field6840, class262.field3401, class224.field2958, class282.field3772, class197.field2702);
            class251.field3294 = new class61(class478.field6840, class262.field3401, class223.field2947);
            class274.field3588 = new class28(class478.field6840, class262.field3401, class223.field2947);
            class134.field1945 = new class531(class478.field6840, class262.field3401, class56.field878, class638.field9171);
            class503.field7119 = new class9(class478.field6840, class262.field3401, class223.field2947);
            class90.field1373 = new class73(class478.field6840, class262.field3401, class223.field2947);
            class92.field1400 = new class199(class478.field6840, class262.field3401, class223.field2947);
            class449.field6504 = new class315(class478.field6840, class262.field3401, class49.field777);
            class683.field9635 = new class219(class478.field6840, class262.field3401, class223.field2947);
            class200.method1300(class638.field9171, class97.field1483, class283.field3785, class595.field8616, 0);
            class273.method1627((byte) -123, class280.field3711);
            class177.field2474 = new class108(class262.field3401, class537.field7867, class51.field797);
            class23.field431 = new class480(class262.field3401, class537.field7867, class51.field797, new class105());
            class250.method1515(false);
            class60.field965.method2594(!class335.field4872.method3439(class62.field996, false), (byte) -99);
            class308.field4545 = new class596();
            class614.method3500(81);
            class372.method2293(class583.field8473, (byte) 42);
            class72.method424(class28.field492, 6, class638.field9171);
            class48 var20 = new class48(class288.field4178.method1817(127, "huffman", ""));
            class571.method3280((byte) 109, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class639.field9177 = class399.method2475((byte) -118);
            class202.field2761 = new class131(true, class61.field978);
        }
        if (class580.field8439 == class205.field2797) {
            int var21 = class646.method3681(class595.field8616, (byte) 54) + class594.method3380(true, -30);
            int var22 = class328.method2024(16) + class223.method1392((byte) -29);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class580.field8440 == class205.field2797) {
            class55.method332(class326.field4732, class2.field15, class547.field8069, class60.field965, class189.field2572, class652.field9331, class308.field4545);
        }
        if (class580.field8441 == class205.field2797) {
            class338.field4914 = new boolean[class92.field1400.field2712];
            class298.field4380 = new String[class90.field1373.field1154];
            class653.field9351 = new int[class92.field1400.field2712];
            for (int var23 = 0; var23 < class92.field1400.field2712; var23++) {
                if (class92.field1400.method1297(var23, (byte) 76).field1931 == 0) {
                    class338.field4914[var23] = true;
                    class401.field6041++;
                }
                class653.field9351[var23] = -1;
            }
            class476.method2737((byte) -122);
            class537.field7871 = class97.field1483.method1819("loginscreen", (byte) 52);
            class630.field9125 = class97.field1483.method1819("lobbyscreen", (byte) 53);
            class43.field625.method1833(true, false, (byte) -109);
            class18.field360.method1833(true, true, (byte) -128);
            class595.field8616.method1833(true, true, (byte) -110);
            class283.field3785.method1833(true, true, (byte) 16);
            class288.field4178.method1833(true, true, (byte) -125);
            class97.field1483.method1833(true, true, (byte) 121);
            class223.field2947.field4344 = 2;
            class544.field8040 = true;
            class654.field9365.field4344 = 2;
            class554.field8140.field4344 = 2;
            class425.field6216.field4344 = 2;
            class394.field5968.field4344 = 2;
            class224.field2958.field4344 = 2;
            class56.field878.field4344 = 2;
        }
        if (class580.field8442 == class205.field2797) {
            if (!class233.method1442(!arg0, class537.field7871)) {
                return 0;
            }
            for (int var24 = 0; var24 < class220.field2917[class537.field7871].length; var24++) {
                class5 var25 = class220.field2917[class537.field7871][var24];
                if (var25.field172 == 5 && var25.field132 != -1) {
                    var25.method26(class332.field4821, -115);
                }
            }
        }
        if (class580.field8443 == class205.field2797) {
            for (int var26 = 0; var26 < class220.field2917[class537.field7871].length; var26++) {
                class5 var27 = class220.field2917[class537.field7871][var26];
                if (var27.field172 == 5 && var27.field132 != -1 && var27.method26(class332.field4821, -114) == null && class321.field4677) {
                    return 0;
                }
            }
        }
        if (class580.field8444 == class205.field2797) {
            class153.method1086(true, (byte) -84);
        }
        if (class580.field8445 == class205.field2797) {
            class199.field2714.method3315(-96);
            try {
                class81.field1298.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class81.field1298 = null;
            class199.field2714 = null;
            class139.field2024 = null;
            class147.field2096 = null;
            class430.field6256 = null;
            class326.field4725 = null;
            class366.method2245(128);
            class480.field6866 = class335.field4872.field9494;
            class335.field4872.field9494 = true;
            class335.field4872.method3442(class61.field978, 109);
            if (class480.field6866) {
                class409.method2509(512, 0);
            } else {
                class409.method2509(512, class335.field4872.field9483);
            }
            class378.method2336(-1, false, (byte) -117, -1, class335.field4872.field9474);
            class584.method3346(class332.field4821, (byte) 127);
            class502.method2862(class332.field4821, -86);
            class27.method176(class595.field8616, class332.field4821, (byte) 58);
            class339.method2097((byte) -124, class97.field1481);
        }
        return class96.method601(100);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V", line = 452)
    public class149(int arg0) {
        this.field2109 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 461)
    public static void method1065(byte arg0) {
        field2110 = null;
        int var1 = -54 / ((arg0 + 60) / 49);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 471)
    public static final void method1066(int arg0) {
        int var1 = -38 / ((arg0 - 23) / 51);
        field2115++;
        if (class264.field3451 == 9) {
            class322.method2003(0, 5);
        } else if (class264.field3451 == 5 || class264.field3451 == 6) {
            class322.method2003(0, 3);
        } else if (class264.field3451 == 12) {
            class322.method2003(0, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;", line = 497)
    public final String toString() {
        field2112++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)Loda;", line = 506)
    public static final class654 method1067(int arg0) {
        if (arg0 < 22) {
            method1066(84);
        }
        field2113++;
        class654 var1 = class572.method3286(114);
        var1.field9362 = 0;
        var1.field9355 = null;
        var1.field9358 = new class311(5000);
        return var1;
    }
}

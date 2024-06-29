import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class111 extends class313 {

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
    public static int[] field1567 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lct;")
    public static class285 field1566 = new class285(24, 7);

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lo;")
    public static class332 field1571 = new class332(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "F")
    public static float field1570;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[[I")
    public static int[][] field1568;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static void method810(int arg0) {
        field1566 = null;
        field1568 = null;
        field1571 = null;
        if (arg0 != 0) {
            method810(-123);
        }
        field1567 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Z")
    public static final boolean method811(int arg0) throws IOException {
        field1565++;
        if (class27.field335 == null) {
            return false;
        }
        int var1 = class27.field335.method1005(5000);
        if (var1 == 0) {
            return false;
        }
        if (class147.field2099 == null) {
            if (class309.field4626) {
                class27.field335.method996(1, class220.field3246.field6316, true, 0);
                var1--;
                class186.field2822++;
                class309.field4626 = false;
            }
            class220.field3246.field6315 = 0;
            if (class220.field3246.method374((byte) -94)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class27.field335.method996(1, class220.field3246.field6316, true, 1);
                class186.field2822++;
            }
            class309.field4626 = true;
            class472[] var2 = class349.method2149((byte) -100);
            int var3 = class220.field3246.method368((byte) -4);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3);
            }
            class147.field2099 = var2[var3];
            class95.field1342 = class147.field2099.field6615;
        }
        if (class95.field1342 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class27.field335.method996(1, class220.field3246.field6316, true, 0);
            var1--;
            class95.field1342 = class220.field3246.field6316[0] & 0xFF;
            class186.field2822++;
        }
        if (class95.field1342 == arg0) {
            if (var1 <= 1) {
                return false;
            }
            class27.field335.method996(2, class220.field3246.field6316, true, 0);
            class220.field3246.field6315 = 0;
            class95.field1342 = class220.field3246.method2631(arg0 + 2532);
            var1 -= 2;
            class186.field2822 += 2;
        }
        if (var1 < class95.field1342) {
            return false;
        }
        class220.field3246.field6315 = 0;
        class27.field335.method996(class95.field1342, class220.field3246.field6316, true, 0);
        class352.field5365 = 0;
        class186.field2822 += class95.field1342;
        class392.field5788 = class273.field4143;
        class273.field4143 = class280.field4236;
        class280.field4236 = class147.field2099;
        if (class161.field2224 == class147.field2099) {
            int var4 = class220.field3246.method2598(15229);
            int var5 = class220.field3246.method2598(15229);
            int var6 = class220.field3246.method2585(arg0 ^ 0xFFFFFF9C);
            if (class191.method1327(32255, var4)) {
                class122.method859(var6, -124, var5, 0);
            }
            class147.field2099 = null;
            return true;
        } else if (class227.field3328 == class147.field2099) {
            class156.method1062(true, false);
            class147.field2099 = null;
            return true;
        } else if (class426.field6084 == class147.field2099) {
            int var7 = class220.field3246.method2626(109);
            int var8 = class220.field3246.method2628(arg0 + 49154);
            if (var7 == 255) {
                var7 = -1;
                var8 = -1;
            }
            class406.method2436(var8, var7, 0);
            class147.field2099 = null;
            return true;
        } else if (class204.field3104 == class147.field2099) {
            class75.field1041 = class12.field169;
            if (class95.field1342 == 0) {
                class124.field1709 = null;
                class119.field1651 = null;
                class353.field5369 = null;
                class147.field2099 = null;
                class210.field3152 = 0;
                return true;
            }
            class124.field1709 = class220.field3246.method2582((byte) -66);
            boolean var9 = class220.field3246.method2628(49152) == 1;
            if (var9) {
                class220.field3246.method2582((byte) -99);
            }
            long var10 = class220.field3246.method2632((byte) 1);
            class119.field1651 = class154.method1055(0, var10);
            class483.field6779 = class220.field3246.method2642(true);
            int var12 = class220.field3246.method2628(49152);
            if (var12 == 255) {
                class147.field2099 = null;
                return true;
            }
            class210.field3152 = var12;
            class338[] var13 = new class338[100];
            for (int var14 = 0; var14 < class210.field3152; var14++) {
                var13[var14] = new class338();
                var13[var14].field5068 = class220.field3246.method2582((byte) -47);
                boolean var20 = class220.field3246.method2628(49152) == 1;
                if (var20) {
                    var13[var14].field5072 = class220.field3246.method2582((byte) -107);
                } else {
                    var13[var14].field5072 = var13[var14].field5068;
                }
                var13[var14].field5067 = class226.method1463(-1, var13[var14].field5072);
                var13[var14].field5069 = class220.field3246.method2631(arg0 + 2532);
                var13[var14].field5075 = class220.field3246.method2642(true);
                var13[var14].field5074 = class220.field3246.method2582((byte) -102);
                if (var13[var14].field5072.equals(class472.field6622.field3839)) {
                    class220.field3249 = var13[var14].field5075;
                }
            }
            boolean var15 = false;
            int var16 = class210.field3152;
            while (var16 > 0) {
                boolean var17 = true;
                var16--;
                for (int var18 = 0; var18 < var16; var18++) {
                    if (var13[var18].field5067.compareTo(var13[var18 + 1].field5067) > 0) {
                        class338 var19 = var13[var18];
                        var13[var18] = var13[var18 + 1];
                        var13[var18 + 1] = var19;
                        var17 = false;
                    }
                }
                if (var17) {
                    break;
                }
            }
            class353.field5369 = var13;
            class147.field2099 = null;
            return true;
        } else if (class220.field3248 == class147.field2099) {
            class27.field358 = class220.field3246.method2620(-127);
            class412.field5943 = class220.field3246.method2620(-123);
            class147.field2099 = null;
            return true;
        } else if (class416.field5995 == class147.field2099) {
            int var21 = class220.field3246.method2631(2530);
            int var22 = class220.field3246.method2628(arg0 + 49154);
            int var23 = class220.field3246.method2628(49152);
            int var24 = class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
            int var25 = class220.field3246.method2628(49152);
            int var26 = class220.field3246.method2628(49152);
            if (class191.method1327(32255, var21)) {
                class450.method2651(var22, var24, true, var26, var23, -15415, var25);
            }
            class147.field2099 = null;
            return true;
        } else if (class280.field4234 == class147.field2099) {
            int var27 = class220.field3246.method2628(arg0 + 49154);
            int var28 = class220.field3246.method2611(arg0 - 105);
            int var29 = class220.field3246.method2598(15229);
            if (class191.method1327(arg0 + 32257, var29)) {
                class285.method1820(var28, true, var27);
            }
            class147.field2099 = null;
            return true;
        } else if (class244.field3497 == class147.field2099) {
            int var30 = class220.field3246.method2631(2530);
            int var31 = class220.field3246.method2631(2530);
            int var32 = class220.field3246.method2616((byte) -115);
            class349 var33 = class18.field241[var31];
            if (var33 != null) {
                class305.method1904(var30, var33, -103, var32);
            }
            class147.field2099 = null;
            return true;
        } else if (class163.field2263 == class147.field2099) {
            boolean var34 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE) == 1;
            String var35 = class220.field3246.method2582((byte) -126);
            String var36 = var35;
            if (var34) {
                var36 = class220.field3246.method2582((byte) -127);
            }
            long var37 = (long) class220.field3246.method2631(2530);
            long var39 = (long) class220.field3246.method2613(-25778);
            int var41 = class220.field3246.method2628(49152);
            long var42 = (var37 << 32) + var39;
            boolean var44 = false;
            int var45 = 0;
            while (true) {
                if (var45 >= 100) {
                    if (var41 <= 1) {
                        if (!(!class305.field4555 || class174.field2468) || class206.field3122) {
                            var44 = true;
                        } else if (class15.method140(var36, (byte) -68)) {
                            var44 = true;
                        }
                    }
                    break;
                }
                if (class260.field3867[var45] == var42) {
                    var44 = true;
                    break;
                }
                var45++;
            }
            if (!var44 && class301.field4488 == 0) {
                class260.field3867[class70.field950] = var42;
                class70.field950 = (class70.field950 + 1) % 100;
                String var46 = class459.method2712(class436.method2541(false, class220.field3246), -107);
                if (var41 == 2) {
                    class269.method1748(var46, "<img=1>" + var35, 7, "<img=1>" + var36, (byte) -99, -1, (String) null, 0);
                } else if (var41 == 1) {
                    class269.method1748(var46, "<img=0>" + var35, 7, "<img=0>" + var36, (byte) 83, -1, (String) null, 0);
                } else {
                    class269.method1748(var46, var35, 3, var36, (byte) -61, -1, (String) null, 0);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class401.field5862 == class147.field2099) {
            int var47 = class220.field3246.method2628(arg0 + 49154);
            boolean var48 = (var47 & 0x1) == 1;
            String var49 = class220.field3246.method2582((byte) -92);
            String var50 = class220.field3246.method2582((byte) -48);
            if (var50.equals("")) {
                var50 = var49;
            }
            String var51 = class220.field3246.method2582((byte) -76);
            String var52 = class220.field3246.method2582((byte) -68);
            if (var52.equals("")) {
                var52 = var51;
            }
            if (var48) {
                for (int var53 = 0; var53 < class330.field4951; var53++) {
                    if (class456.field6474[var53].equals(var52)) {
                        class436.field6168[var53] = var49;
                        class456.field6474[var53] = var50;
                        class68.field930[var53] = var51;
                        class335.field5012[var53] = var52;
                        break;
                    }
                }
            } else {
                class436.field6168[class330.field4951] = var49;
                class456.field6474[class330.field4951] = var50;
                class68.field930[class330.field4951] = var51;
                class335.field5012[class330.field4951] = var52;
                class78.field1106[class330.field4951] = class412.method2463(var47, 2) == 2;
                class330.field4951++;
            }
            class147.field2099 = null;
            class475.field6649 = class12.field169;
            return true;
        } else if (class51.field740 == class147.field2099) {
            int var54 = class220.field3246.method2631(2530);
            int var55 = class220.field3246.method2628(arg0 + 49154);
            boolean var56 = (var55 & 0x1) == 1;
            class238.method1545(var56, var54, (byte) 107);
            int var57 = class220.field3246.method2631(arg0 + 2532);
            for (int var58 = 0; var58 < var57; var58++) {
                int var59 = class220.field3246.method2631(2530);
                int var60 = class220.field3246.method2620(-125);
                if (var60 == 255) {
                    var60 = class220.field3246.method2611(-119);
                }
                class145.method990(var59 - 1, var54, true, var56, var60, var58);
            }
            class18.field242[class412.method2463(class262.field3888++, 31)] = var54;
            class147.field2099 = null;
            return true;
        } else if (class322.field4842 == class147.field2099) {
            int var61 = class220.field3246.method2631(2530);
            int var62 = class220.field3246.method2628(49152);
            boolean var63 = (var62 & 0x1) == 1;
            while (class95.field1342 > class220.field3246.field6315) {
                int var64 = class220.field3246.method2635(85);
                int var65 = class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
                int var66 = 0;
                if (var65 != 0) {
                    var66 = class220.field3246.method2628(49152);
                    if (var66 == 255) {
                        var66 = class220.field3246.method2604(-123);
                    }
                }
                class145.method990(var65 - 1, var61, true, var63, var66, var64);
            }
            class18.field242[class412.method2463(class262.field3888++, 31)] = var61;
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class109.field1548) {
            class341.method2092(class220.field3246.method2582((byte) -59), arg0 ^ 0xFFFFFF83);
            class147.field2099 = null;
            return true;
        } else if (class365.field5518 == class147.field2099) {
            class306.method1909(arg0 ^ 0xFFFFFFBE, class193.field2936);
            class147.field2099 = null;
            return true;
        } else if (class352.field5359 == class147.field2099) {
            int var67 = class220.field3246.method2631(2530);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class220.field3246.method2628(49152);
            int var69 = class220.field3246.method2631(2530);
            int var70 = class220.field3246.method2628(arg0 + 49154);
            class68.method601(var67, var70, var69, var68, true);
            class147.field2099 = null;
            return true;
        } else if (class92.field1280 == class147.field2099) {
            int var71 = class220.field3246.method2637(-4);
            int var72 = class220.field3246.method2628(49152);
            boolean var73 = (var72 & 0x1) == 1;
            class472.method2753(-30484, var73, var71);
            class18.field242[class412.method2463(31, class262.field3888++)] = var71;
            class147.field2099 = null;
            return true;
        } else if (class419.field6023 == class147.field2099) {
            class306.method1909(64, class252.field3623);
            class147.field2099 = null;
            return true;
        } else if (class233.field3408 == class147.field2099) {
            class306.method1909(arg0 ^ 0xFFFFFFBE, class161.field2221);
            class147.field2099 = null;
            return true;
        } else if (class380.field5647 == class147.field2099) {
            class229.method1496(1862775652, true);
            class147.field2099 = null;
            return false;
        } else if (class321.field4795 == class147.field2099) {
            int var74 = class220.field3246.method2631(2530);
            int var75 = class220.field3246.method2604(arg0 ^ 0x76);
            class315.field4736.method22((byte) -18, var75, var74);
            class147.field2099 = null;
            return true;
        } else if (class212.field3202 == class147.field2099) {
            int var76 = class220.field3246.method2631(2530);
            int var77 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            int var78 = class220.field3246.method2628(49152);
            int var79 = class220.field3246.method2631(2530);
            int var80 = class220.field3246.method2628(49152);
            int var81 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var76)) {
                class48.method350(-3073, var79, var77, var78, var80, var81);
            }
            class147.field2099 = null;
            return true;
        } else if (class29.field393 == class147.field2099) {
            int var82 = class220.field3246.method2631(arg0 + 2532);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class220.field3246.method2616((byte) -81);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = class352.field5363[var84];
            int var87 = class220.field3246.method2617(1538701744);
            int var88 = (var87 & 0x3BF3AB80) >> 28;
            int var89 = var87 >> 14 & 0x3FFF;
            int var90 = var89 - class68.field922;
            int var91 = var87 & 0x3FFF;
            int var92 = var91 - class468.field6588;
            class485.method2841(var86, var84, var82, var88, 5, var85, var92, var90);
            class147.field2099 = null;
            return true;
        } else if (class287.field4391 == class147.field2099) {
            class306.method1909(64, class332.field4966);
            class147.field2099 = null;
            return true;
        } else if (class237.field3460 == class147.field2099) {
            int var93 = class220.field3246.method2617(1538701744);
            int var94 = class220.field3246.method2598(arg0 ^ 0xFFFFC483);
            int var95 = class220.field3246.method2585(91);
            if (class191.method1327(32255, var95)) {
                class138.method961(var94, arg0 ^ 0xFFFFEFFE, var93);
            }
            class147.field2099 = null;
            return true;
        } else if (class40.field564 == class147.field2099) {
            int var96 = class220.field3246.method2614(7);
            int var97 = class220.field3246.method2637(-4);
            int var98 = class220.field3246.method2598(15229);
            if (var98 == 65535) {
                var98 = -1;
            }
            int var99 = class220.field3246.method2604(39);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var97)) {
                class170.method1178(var96, var98, (byte) -90, var99);
                class184 var100 = class23.field309.method2364((byte) 118, var98);
                class486.method2845((byte) -125, var96, var100.field2784, var100.field2776, var100.field2767);
                class486.method2844(var100.field2734, var100.field2765, var96, 10, var100.field2742);
            }
            class147.field2099 = null;
            return true;
        } else if (class431.field6130 == class147.field2099) {
            class305.field4549 = class220.field3246.method2626(-22);
            class95.field1341 = class220.field3246.method2616((byte) -95);
            class131.field1832 = class220.field3246.method2620(arg0 - 123);
            for (class31 var101 = (class31) class491.field6897.method2296((byte) 39); var101 != null; var101 = (class31) class491.field6897.method2297(true)) {
                int var103 = (int) (var101.field436 & 0x3FFFL);
                int var104 = (int) (var101.field436 >> 14 & 0x3FFFL);
                int var105 = (int) (var101.field436 >> 28 & 0x3L);
                if (class95.field1341 == var105 && class305.field4549 <= var103 && (class305.field4549 + 8) > var103 && var104 >= class131.field1832 && var104 < (class131.field1832 + 8)) {
                    var101.method283(arg0 ^ 0xFFFFFFFC);
                    class409.method2444(class95.field1341, var103, (byte) 26, var104);
                }
            }
            for (class198 var102 = (class198) class428.field6108.method2456(32101); var102 != null; var102 = (class198) class428.field6108.method2461(301)) {
                if (var102.field2986 >= class305.field4549 && (class305.field4549 + 8) > var102.field2986 && class131.field1832 <= var102.field2974 && var102.field2974 < class131.field1832 + 8 && class95.field1341 == var102.field2988) {
                    var102.field2983 = 0;
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class49.field722 == class147.field2099) {
            int var106 = class220.field3246.method2585(arg0 + 72);
            int var107 = class220.field3246.method2598(15229);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class220.field3246.method2611(123);
            if (class191.method1327(32255, var106)) {
                class5.method37(-1, (byte) -127, var108, 1, var107);
            }
            class147.field2099 = null;
            return true;
        } else if (class439.field6201 == class147.field2099) {
            class184.field2732 = class220.field3246.method2628(49152);
            class273.field4162 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class464.field6542 == class147.field2099) {
            int var109 = class220.field3246.method2616((byte) 80);
            int var110 = class220.field3246.method2585(115);
            class315.field4736.method20(var109, (byte) -28, var110);
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class140.field2007) {
            class306.method1909(64, class327.field4920);
            class147.field2099 = null;
            return true;
        } else if (class182.field2696 == class147.field2099) {
            int var111 = class220.field3246.method2598(15229);
            int var112 = class220.field3246.method2614(7);
            int var113 = class220.field3246.method2616((byte) -119);
            int var114 = class220.field3246.method2637(-4);
            if (class191.method1327(32255, var114)) {
                class468 var115 = (class468) class466.field6564.method2305((long) var112, (byte) 67);
                if (var115 != null) {
                    class479.method2811(1711162608, false, var115, var115.field6584 != var111);
                }
                class163.method1106(var112, var111, var113, arg0 ^ 0x8192A7EE, false);
            }
            class147.field2099 = null;
            return true;
        } else if (class422.field6042 == class147.field2099) {
            int var116 = class220.field3246.method2631(2530);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class220.field3246.method2604(-112);
            int var118 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var118)) {
                class5.method37(-1, (byte) -127, var117, 2, var116);
            }
            class147.field2099 = null;
            return true;
        } else if (class198.field2993 == class147.field2099) {
            int var119 = class220.field3246.method2628(49152);
            if (class220.field3246.method2628(arg0 + 49154) == 0) {
                class447.field6338[var119] = new class379();
            } else {
                class220.field3246.field6315--;
                class447.field6338[var119] = new class379(class220.field3246);
            }
            class412.field5945 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class408.field5920 == class147.field2099) {
            int var120 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var120)) {
                class478.method2804(false);
            }
            class147.field2099 = null;
            return true;
        } else if (class307.field4589 == class147.field2099) {
            int var121 = class220.field3246.method2637(-4);
            int var122 = class220.field3246.method2637(-4);
            if (var122 == 65535) {
                var122 = -1;
            }
            int var123 = class220.field3246.method2637(-4);
            int var124 = class220.field3246.method2604(-119);
            int var125 = class220.field3246.method2631(2530);
            if (var125 == 65535) {
                var125 = -1;
            }
            if (class191.method1327(arg0 ^ 0xFFFF8201, var123)) {
                for (int var126 = var125; var126 <= var122; var126++) {
                    long var127 = ((long) var124 << 32) + (long) var126;
                    class176 var129 = (class176) class206.field3111.method2305(var127, (byte) 30);
                    class176 var130;
                    if (var129 != null) {
                        var130 = new class176(var129.field2506, var121);
                        var129.method283(2);
                    } else if (var126 == -1) {
                        var130 = new class176(class493.method2885(var124, 65535).field2668.field2506, var121);
                    } else {
                        var130 = new class176(0, var121);
                    }
                    class206.field3111.method2307(var127, var130, (byte) 123);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class97.field1398 == class147.field2099) {
            int var131 = class220.field3246.method2635(arg0 + 110);
            int var132 = class220.field3246.method2604(-126);
            int var133 = class220.field3246.method2628(49152);
            String var134 = "";
            String var135 = var134;
            if ((var133 & 0x1) != 0) {
                var134 = class220.field3246.method2582((byte) -72);
                if ((var133 & 0x2) == 0) {
                    var135 = var134;
                } else {
                    var135 = class220.field3246.method2582((byte) -96);
                }
            }
            String var136 = class220.field3246.method2582((byte) -40);
            if (var131 == 99) {
                class360.method2214(var136, -15036);
            } else if (var135.equals("") || !class15.method140(var135, (byte) -68)) {
                class462.method2719(var135, var131, var132, (byte) -78, var134, var136);
            } else {
                class147.field2099 = null;
                return true;
            }
            class147.field2099 = null;
            return true;
        } else if (class65.field899 == class147.field2099) {
            class32.field422 = class220.field3246.method2631(arg0 + 2532) * 30;
            class273.field4162 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class147.field2088) {
            int var137 = class220.field3246.method2614(7);
            int var138 = class220.field3246.method2585(68);
            if (class191.method1327(32255, var138)) {
                class5.method37(-1, (byte) -127, var137, 3, -1);
            }
            class147.field2099 = null;
            return true;
        } else if (class382.field5656 == class147.field2099) {
            class38.method295(69);
            class147.field2099 = null;
            return false;
        } else if (class169.field2405 == class147.field2099) {
            int var139 = class220.field3246.method2611(123);
            int var140 = class220.field3246.method2598(15229);
            int var141 = class220.field3246.method2585(89);
            if (class191.method1327(32255, var140)) {
                class463.method2727(var141, (byte) 115, var139);
            }
            class147.field2099 = null;
            return true;
        } else if (class85.field1220 == class147.field2099) {
            boolean var142 = class220.field3246.method2628(49152) == 1;
            String var143 = class220.field3246.method2582((byte) -35);
            String var144 = var143;
            if (var142) {
                var144 = class220.field3246.method2582((byte) -57);
            }
            long var145 = class220.field3246.method2632((byte) 1);
            long var147 = (long) class220.field3246.method2631(2530);
            long var149 = (long) class220.field3246.method2613(arg0 ^ 0x64B0);
            int var151 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            long var152 = (var147 << 32) + var149;
            boolean var154 = false;
            int var155 = 0;
            while (true) {
                if (var155 >= 100) {
                    if (var151 <= 1) {
                        if (!(!class305.field4555 || class174.field2468) || class206.field3122) {
                            var154 = true;
                        } else if (class15.method140(var144, (byte) -68)) {
                            var154 = true;
                        }
                    }
                    break;
                }
                if (class260.field3867[var155] == var152) {
                    var154 = true;
                    break;
                }
                var155++;
            }
            if (!var154 && class301.field4488 == 0) {
                class260.field3867[class70.field950] = var152;
                class70.field950 = (class70.field950 + 1) % 100;
                String var156 = class459.method2712(class436.method2541(false, class220.field3246), -74);
                if (var151 == 2 || var151 == 3) {
                    class269.method1748(var156, "<img=1>" + var143, 9, "<img=1>" + var144, (byte) -117, -1, class246.method1568(var145, 50), 0);
                } else if (var151 == 1) {
                    class269.method1748(var156, "<img=0>" + var143, 9, "<img=0>" + var144, (byte) 97, -1, class246.method1568(var145, -73), 0);
                } else {
                    class269.method1748(var156, var143, 9, var144, (byte) 100, -1, class246.method1568(var145, -93), 0);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class13.field189) {
            class229.method1496(1862775652, false);
            class147.field2099 = null;
            return false;
        } else if (class187.field2844 == class147.field2099) {
            class220.field3246.field6315 += 28;
            if (class220.field3246.method2638(16711680)) {
                class134.method952(class220.field3246.field6315 - 28, (byte) 39, class220.field3246);
            }
            class147.field2099 = null;
            return true;
        } else if (class182.field2700 == class147.field2099) {
            for (int var157 = 0; var157 < class40.field565.length; var157++) {
                if (class40.field565[var157] != null) {
                    class40.field565[var157].field4612 = -1;
                }
            }
            for (int var158 = 0; var158 < class18.field241.length; var158++) {
                if (class18.field241[var158] != null) {
                    class18.field241[var158].field4612 = -1;
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class304.field4529 == class147.field2099) {
            int var159 = class220.field3246.method2611(arg0 + 109);
            int var160 = class220.field3246.method2614(7);
            int var161 = class220.field3246.method2637(-4);
            int var162 = class220.field3246.method2637(-4);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class220.field3246.method2585(67);
            if (var163 == 65535) {
                var163 = -1;
            }
            if (class191.method1327(32255, var161)) {
                for (int var164 = var162; var164 <= var163; var164++) {
                    long var165 = ((long) var160 << 32) + (long) var164;
                    class176 var167 = (class176) class206.field3111.method2305(var165, (byte) 118);
                    class176 var168;
                    if (var167 != null) {
                        var168 = new class176(var159, var167.field2504);
                        var167.method283(2);
                    } else if (var164 == -1) {
                        var168 = new class176(var159, class493.method2885(var160, 65535).field2668.field2504);
                    } else {
                        var168 = new class176(var159, -1);
                    }
                    class206.field3111.method2307(var165, var168, (byte) 121);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class351.field5347 == class147.field2099) {
            while (class220.field3246.field6315 < class95.field1342) {
                boolean var179 = class220.field3246.method2628(49152) == 1;
                String var180 = class220.field3246.method2582((byte) -45);
                String var181 = class220.field3246.method2582((byte) -122);
                int var182 = class220.field3246.method2631(2530);
                int var183 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
                String var184 = "";
                boolean var185 = false;
                if (var182 > 0) {
                    var184 = class220.field3246.method2582((byte) -68);
                    var185 = class220.field3246.method2628(49152) == 1;
                }
                for (int var186 = 0; var186 < class157.field2190; var186++) {
                    if (var179) {
                        if (var181.equals(class42.field570[var186])) {
                            class42.field570[var186] = var180;
                            var180 = null;
                            class310.field4681[var186] = var181;
                            break;
                        }
                    } else if (var180.equals(class42.field570[var186])) {
                        if (class484.field6787[var186] != var182) {
                            class484.field6787[var186] = var182;
                            if (var182 > 0) {
                                class462.method2719("", 5, 0, (byte) -78, "", var180 + class35.field437.method2036(class4.field85, (byte) -21));
                            }
                            if (var182 == 0) {
                                class462.method2719("", 5, 0, (byte) -78, "", var180 + class47.field676.method2036(class4.field85, (byte) -21));
                            }
                        }
                        class310.field4681[var186] = var181;
                        class95.field1354[var186] = var184;
                        class245.field3499[var186] = var183;
                        class176.field2498[var186] = var185;
                        var180 = null;
                        break;
                    }
                }
                if (var180 != null && class157.field2190 < 200) {
                    class42.field570[class157.field2190] = var180;
                    class310.field4681[class157.field2190] = var181;
                    class484.field6787[class157.field2190] = var182;
                    class95.field1354[class157.field2190] = var184;
                    class245.field3499[class157.field2190] = var183;
                    class176.field2498[class157.field2190] = var185;
                    class157.field2190++;
                }
            }
            class425.field6082 = 2;
            class475.field6649 = class12.field169;
            boolean var169 = false;
            int var170 = class157.field2190;
            while (var170 > 0) {
                var170--;
                boolean var171 = true;
                for (int var172 = 0; var172 < var170; var172++) {
                    if (class484.field6787[var172] != class212.field3196 && class484.field6787[var172 + 1] == class212.field3196 || class484.field6787[var172] == 0 && class484.field6787[var172 + 1] != 0) {
                        int var173 = class484.field6787[var172];
                        class484.field6787[var172] = class484.field6787[var172 + 1];
                        class484.field6787[var172 + 1] = var173;
                        String var174 = class95.field1354[var172];
                        class95.field1354[var172] = class95.field1354[var172 + 1];
                        class95.field1354[var172 + 1] = var174;
                        String var175 = class42.field570[var172];
                        class42.field570[var172] = class42.field570[var172 + 1];
                        class42.field570[var172 + 1] = var175;
                        String var176 = class310.field4681[var172];
                        class310.field4681[var172] = class310.field4681[var172 + 1];
                        class310.field4681[var172 + 1] = var176;
                        int var177 = class245.field3499[var172];
                        class245.field3499[var172] = class245.field3499[var172 + 1];
                        class245.field3499[var172 + 1] = var177;
                        boolean var178 = class176.field2498[var172];
                        class176.field2498[var172] = class176.field2498[var172 + 1];
                        var171 = false;
                        class176.field2498[var172 + 1] = var178;
                    }
                }
                if (var171) {
                    break;
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class395.field5813 == class147.field2099) {
            int var187 = class220.field3246.method2585(75);
            if (var187 == 65535) {
                var187 = -1;
            }
            int var188 = class220.field3246.method2620(-125);
            int var189 = class220.field3246.method2626(-83);
            class352.method2174(var188, -3235, var187, var189);
            class147.field2099 = null;
            return true;
        } else if (class472.field6613 == class147.field2099) {
            int var190 = class220.field3246.method2620(-124);
            int var191 = class220.field3246.method2640(262102576);
            int var192 = class220.field3246.method2637(-4);
            if (var192 == 65535) {
                var192 = -1;
            }
            class325.method2004((byte) -117, var192, var191, var190);
            class147.field2099 = null;
            return true;
        } else if (class96.field1386 == class147.field2099) {
            int var193 = class220.field3246.method2637(-4);
            int var194 = class220.field3246.method2611(24);
            int var195 = class220.field3246.method2637(-4);
            int var196 = class220.field3246.method2614(7);
            if (class191.method1327(32255, var193)) {
                class5.method37(var194, (byte) -127, var196, 5, var195);
            }
            class147.field2099 = null;
            return true;
        } else if (class469.field6590 == class147.field2099) {
            class330.field4951 = class220.field3246.method2628(49152);
            for (int var197 = 0; var197 < class330.field4951; var197++) {
                class436.field6168[var197] = class220.field3246.method2582((byte) -119);
                class456.field6474[var197] = class220.field3246.method2582((byte) -121);
                if (class456.field6474[var197].equals("")) {
                    class456.field6474[var197] = class436.field6168[var197];
                }
                class68.field930[var197] = class220.field3246.method2582((byte) -61);
                class335.field5012[var197] = class220.field3246.method2582((byte) -78);
                if (class335.field5012[var197].equals("")) {
                    class335.field5012[var197] = class68.field930[var197];
                }
                class78.field1106[var197] = false;
            }
            class475.field6649 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class480.field6766 == class147.field2099) {
            int var198 = class220.field3246.method2585(arg0 ^ 0xFFFFFF8B);
            String var199 = class220.field3246.method2582((byte) -124);
            int var200 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var200)) {
                class143.method981(0, var199, var198);
            }
            class147.field2099 = null;
            return true;
        } else if (class409.field5925 == class147.field2099) {
            int var201 = class220.field3246.method2585(100);
            int var202 = class220.field3246.method2604(-123);
            int var203 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var201)) {
                class301.method1877((byte) -46, var203, var202);
            }
            class147.field2099 = null;
            return true;
        } else if (class3.field74 == class147.field2099) {
            int var204 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var204)) {
                class145.method989(-100);
            }
            class147.field2099 = null;
            return true;
        } else if (class198.field2982 == class147.field2099) {
            class306.method1909(64, class262.field3900);
            class147.field2099 = null;
            return true;
        } else if (class346.field5289 == class147.field2099) {
            int var205 = class220.field3246.method2604(45);
            int var206 = class220.field3246.method2637(-4);
            int var207 = class220.field3246.method2598(15229);
            int var208 = class220.field3246.method2598(arg0 ^ 0xFFFFC483);
            if (var205 >> 30 != 0) {
                int var209 = var205 >> 28 & 0x3;
                int var210 = ((var205 & 0xFFFD9BC) >> 14) - class68.field922;
                int var211 = (var205 & 0x3FFF) - class468.field6588;
                if (var210 >= 0 && var211 >= 0 && var210 < class379.field5642 && class456.field6477 > var211) {
                    int var212 = var210 * 128 + 64;
                    int var213 = var211 * 128 + 64;
                    class200 var214 = new class200(var206, 0, class452.field6418, var209, var212, class25.method219(48602855, var209, var213, var212) - var208, var213, var210, var210, var211, var211);
                    class467.field6578.method2453((byte) -102, new class425(var214));
                }
            } else if (var205 >> 29 != 0) {
                int var227 = var205 & 0xFFFF;
                class349 var228 = class18.field241[var227];
                if (var228 != null) {
                    if (var206 == 65535) {
                        var206 = -1;
                    }
                    boolean var229 = true;
                    if (var206 != -1 && var228.field4618 != -1) {
                        if (var228.field4618 == var206) {
                            class188 var234 = class322.field4848.method951(var206, (byte) 79);
                            if (var234.field2861 && var234.field2862 != -1) {
                                class356 var235 = class170.field2423.method1586(var234.field2862, (byte) 36);
                                int var236 = var235.field5415;
                                if (var236 == 0 || var236 == 2) {
                                    var229 = false;
                                } else if (var236 == 1) {
                                    var229 = true;
                                }
                            }
                        } else {
                            class188 var230 = class322.field4848.method951(var206, (byte) 93);
                            class188 var231 = class322.field4848.method951(var228.field4618, (byte) 56);
                            if (var230.field2862 != -1 && var231.field2862 != -1) {
                                class356 var232 = class170.field2423.method1586(var230.field2862, (byte) 36);
                                class356 var233 = class170.field2423.method1586(var231.field2862, (byte) 36);
                                if (var233.field5419 > var232.field5419) {
                                    var229 = false;
                                }
                            }
                        }
                    }
                    if (var229) {
                        var228.field4659 = 0;
                        var228.field4633 = var208;
                        var228.field4658 = 0;
                        var228.field4618 = var206;
                        var228.field4637 = class452.field6418 + var207;
                        var228.field4608 = 1;
                        if (var228.field4637 > class452.field6418) {
                            var228.field4659 = -1;
                        }
                        if (var228.field4618 != -1 && class452.field6418 == var228.field4637) {
                            int var237 = class322.field4848.method951(var228.field4618, (byte) 81).field2862;
                            if (var237 != -1) {
                                class356 var238 = class170.field2423.method1586(var237, (byte) 36);
                                if (var238 != null && var238.field5389 != null) {
                                    class210.method1416(0, var228.field4543, false, var228.field4545, var238, 15806, var228.field4538);
                                }
                            }
                        }
                    }
                }
            } else if ((var205 >> 28) != 0) {
                int var215 = var205 & 0xFFFF;
                class257 var216;
                if (class263.field3910 == var215) {
                    var216 = class472.field6622;
                } else {
                    var216 = class40.field565[var215];
                }
                if (var216 != null) {
                    if (var206 == 65535) {
                        var206 = -1;
                    }
                    boolean var217 = true;
                    if (var206 != -1 && var216.field4618 != -1) {
                        if (var216.field4618 == var206) {
                            class188 var218 = class322.field4848.method951(var206, (byte) 54);
                            if (var218.field2861 && var218.field2862 != -1) {
                                class356 var219 = class170.field2423.method1586(var218.field2862, (byte) 36);
                                int var220 = var219.field5415;
                                if (var220 == 0 || var220 == 2) {
                                    var217 = false;
                                } else if (var220 == 1) {
                                    var217 = true;
                                }
                            }
                        } else {
                            class188 var221 = class322.field4848.method951(var206, (byte) 119);
                            class188 var222 = class322.field4848.method951(var216.field4618, (byte) 112);
                            if (var221.field2862 != -1 && var222.field2862 != -1) {
                                class356 var223 = class170.field2423.method1586(var221.field2862, (byte) 36);
                                class356 var224 = class170.field2423.method1586(var222.field2862, (byte) 36);
                                if (var224.field5419 > var223.field5419) {
                                    var217 = false;
                                }
                            }
                        }
                    }
                    if (var217) {
                        var216.field4659 = 0;
                        var216.field4658 = 0;
                        var216.field4633 = var208;
                        var216.field4608 = 1;
                        var216.field4618 = var206;
                        var216.field4637 = class452.field6418 + var207;
                        if (var216.field4637 > class452.field6418) {
                            var216.field4659 = -1;
                        }
                        if (var216.field4618 == 65535) {
                            var216.field4618 = -1;
                        }
                        if (var216.field4618 != -1 && class452.field6418 == var216.field4637) {
                            int var225 = class322.field4848.method951(var216.field4618, (byte) 115).field2862;
                            if (var225 != -1) {
                                class356 var226 = class170.field2423.method1586(var225, (byte) 36);
                                if (var226 != null && var226.field5389 != null) {
                                    class210.method1416(0, var216.field4543, class472.field6622 == var216, var216.field4545, var226, 15806, var216.field4538);
                                }
                            }
                        }
                    }
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class48.field692 == class147.field2099) {
            int var239 = class220.field3246.method2631(2530);
            int var240 = class220.field3246.method2620(-124);
            int var241 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var239)) {
                if (var240 == 2) {
                    class443.method2576((byte) -77);
                }
                class279.field4220 = var241;
                class392.method2376(var241, (byte) 127);
                class355.method2187(false, -1);
                class477.method2795(class279.field4220);
                for (int var242 = 0; var242 < 100; var242++) {
                    class103.field1442[var242] = true;
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class115.field1603) {
            class443.method2577(arg0 ^ 0xFFFFCDF8, class95.field1342, class220.field3246, class21.field261);
            class147.field2099 = null;
            return true;
        } else if (class230.field3386 == class147.field2099) {
            class425.field6082 = 1;
            class475.field6649 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class270.field3990 == class147.field2099) {
            class305.field4549 = class220.field3246.method2626(arg0 ^ 0xFFFFFF86);
            class95.field1341 = class220.field3246.method2626(116);
            class131.field1832 = class220.field3246.method2620(-124);
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class119.field1654) {
            int var243 = class220.field3246.method2628(49152);
            int var244 = var243 >> 5;
            int var245 = var243 & 0x1F;
            if (var245 == 0) {
                class365.field5522[var244] = null;
                class147.field2099 = null;
                return true;
            }
            class208 var246 = new class208();
            var246.field3129 = var245;
            var246.field3135 = class220.field3246.method2628(arg0 + 49154);
            if (var246.field3135 >= 0 && var246.field3135 < class293.field4415.length) {
                if (var246.field3129 == 1 || var246.field3129 == 10) {
                    var246.field3134 = class220.field3246.method2631(arg0 + 2532);
                    class220.field3246.field6315 += 6;
                } else if (var246.field3129 >= 2 && var246.field3129 <= 6) {
                    if (var246.field3129 == 2) {
                        var246.field3140 = 64;
                        var246.field3144 = 64;
                    }
                    if (var246.field3129 == 3) {
                        var246.field3140 = 64;
                        var246.field3144 = 0;
                    }
                    if (var246.field3129 == 4) {
                        var246.field3144 = 128;
                        var246.field3140 = 64;
                    }
                    if (var246.field3129 == 5) {
                        var246.field3140 = 0;
                        var246.field3144 = 64;
                    }
                    if (var246.field3129 == 6) {
                        var246.field3140 = 128;
                        var246.field3144 = 64;
                    }
                    var246.field3129 = 2;
                    var246.field3138 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
                    var246.field3141 = class220.field3246.method2631(2530);
                    var246.field3136 = class220.field3246.method2631(2530);
                    var246.field3130 = class220.field3246.method2628(arg0 + 49154);
                    var246.field3131 = class220.field3246.method2631(2530);
                }
                var246.field3139 = class220.field3246.method2631(2530);
                if (var246.field3139 == 65535) {
                    var246.field3139 = -1;
                }
                class365.field5522[var244] = var246;
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class110.field1560) {
            class132.field1836 = class17.method175(11332, class220.field3246.method2628(49152));
            class147.field2099 = null;
            return true;
        } else if (class333.field4976 == class147.field2099) {
            int var247 = class220.field3246.method2585(99);
            int var248 = class220.field3246.method2585(106);
            int var249 = class220.field3246.method2585(arg0 ^ 0xFFFFFF95);
            int var250 = class220.field3246.method2604(arg0 ^ 0xFFFFFFA5);
            int var251 = class220.field3246.method2598(15229);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var249)) {
                class486.method2845((byte) -123, var250, var251, var247, var248);
            }
            class147.field2099 = null;
            return true;
        } else if (class244.field3495 == class147.field2099) {
            class306.method1909(64, class220.field3247);
            class147.field2099 = null;
            return true;
        } else if (class286.field4364 == class147.field2099) {
            if (class279.field4220 != -1) {
                class231.method1517(class279.field4220, 0, -1);
            }
            class147.field2099 = null;
            return true;
        } else if (class297.field4449 == class147.field2099) {
            class95.field1341 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            class131.field1832 = class220.field3246.method2616((byte) -127);
            class305.field4549 = class220.field3246.method2616((byte) -94);
            while (class220.field3246.field6315 < class95.field1342) {
                class240 var252 = class346.method2134(-1)[class220.field3246.method2628(49152)];
                class306.method1909(64, var252);
            }
            class147.field2099 = null;
            return true;
        } else if (class350.field5333 == class147.field2099) {
            class306.method1909(64, class72.field969);
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class1.field9) {
            int var253 = class220.field3246.method2637(arg0 - 2);
            byte var254 = class220.field3246.method2636(-115);
            class315.field4736.method22((byte) -18, var254, var253);
            class147.field2099 = null;
            return true;
        } else if (class294.field4425 == class147.field2099) {
            class186.field2833 = class220.field3246.method2634(118);
            class147.field2099 = null;
            class273.field4162 = class12.field169;
            return true;
        } else if (class298.field4455 == class147.field2099) {
            int var255 = class220.field3246.method2621((byte) -121);
            int var256 = class220.field3246.method2631(2530);
            int var257 = class220.field3246.method2604(67);
            if (class191.method1327(32255, var256)) {
                class32.method269(var257, -70, var255);
            }
            class147.field2099 = null;
            return true;
        } else if (class340.field5099 == class147.field2099) {
            class306.method1909(64, class150.field2115);
            class147.field2099 = null;
            return true;
        } else if (class298.field4461 == class147.field2099) {
            boolean var258 = class220.field3246.method2628(49152) == 1;
            String var259 = class220.field3246.method2582((byte) -86);
            String var260 = var259;
            if (var258) {
                var260 = class220.field3246.method2582((byte) -71);
            }
            long var261 = class220.field3246.method2632((byte) 1);
            long var263 = (long) class220.field3246.method2631(2530);
            long var265 = (long) class220.field3246.method2613(-25778);
            int var267 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            int var268 = class220.field3246.method2631(2530);
            long var269 = (var263 << 32) + var265;
            boolean var271 = false;
            int var272 = 0;
            while (true) {
                if (var272 >= 100) {
                    if (var267 <= 1 && class15.method140(var260, (byte) -68)) {
                        var271 = true;
                    }
                    break;
                }
                if (class260.field3867[var272] == var269) {
                    var271 = true;
                    break;
                }
                var272++;
            }
            if (!var271 && class301.field4488 == 0) {
                class260.field3867[class70.field950] = var269;
                class70.field950 = (class70.field950 + 1) % 100;
                String var273 = class305.method1903(var268, true).method754((byte) 94, class220.field3246);
                if (var267 == 2) {
                    class269.method1748(var273, "<img=1>" + var259, 20, "<img=1>" + var260, (byte) -97, var268, class246.method1568(var261, 99), 0);
                } else if (var267 == 1) {
                    class269.method1748(var273, "<img=0>" + var259, 20, "<img=0>" + var260, (byte) 104, var268, class246.method1568(var261, -82), 0);
                } else {
                    class269.method1748(var273, var259, 20, var260, (byte) 115, var268, class246.method1568(var261, 39), 0);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class147.field2098) {
            class28.method237(-25463, class220.field3246, class95.field1342);
            class147.field2099 = null;
            return true;
        } else if (class394.field5800 == class147.field2099) {
            String var274 = class220.field3246.method2582((byte) -78);
            boolean var275 = class220.field3246.method2628(49152) == 1;
            String var276;
            if (var275) {
                var276 = class220.field3246.method2582((byte) -74);
            } else {
                var276 = var274;
            }
            int var277 = class220.field3246.method2631(2530);
            byte var278 = class220.field3246.method2642(true);
            boolean var279 = false;
            if (var278 == -128) {
                var279 = true;
            }
            if (var279) {
                if (class210.field3152 == 0) {
                    class147.field2099 = null;
                    return true;
                }
                boolean var285 = false;
                int var286;
                for (var286 = 0; var286 < class210.field3152 && (!class353.field5369[var286].field5072.equals(var276) || class353.field5369[var286].field5069 != var277); var286++) {
                }
                if (class210.field3152 > var286) {
                    while (class210.field3152 - 1 > var286) {
                        class353.field5369[var286] = class353.field5369[var286 + 1];
                        var286++;
                    }
                    class210.field3152--;
                    class353.field5369[class210.field3152] = null;
                }
            } else {
                String var280 = class220.field3246.method2582((byte) -42);
                class338 var281 = new class338();
                var281.field5072 = var276;
                var281.field5068 = var274;
                var281.field5067 = class226.method1463(-1, var281.field5072);
                var281.field5075 = var278;
                var281.field5069 = var277;
                var281.field5074 = var280;
                int var282;
                for (var282 = class210.field3152 - 1; var282 >= 0; var282--) {
                    int var283 = class353.field5369[var282].field5067.compareTo(var281.field5067);
                    if (var283 == 0) {
                        class353.field5369[var282].field5069 = var277;
                        class353.field5369[var282].field5075 = var278;
                        class353.field5369[var282].field5074 = var280;
                        if (var276.equals(class472.field6622.field3839)) {
                            class220.field3249 = var278;
                        }
                        class75.field1041 = class12.field169;
                        class147.field2099 = null;
                        return true;
                    }
                    if (var283 < 0) {
                        break;
                    }
                }
                if (class210.field3152 >= class353.field5369.length) {
                    class147.field2099 = null;
                    return true;
                }
                for (int var284 = class210.field3152 - 1; var284 > var282; var284--) {
                    class353.field5369[var284 + 1] = class353.field5369[var284];
                }
                if (class210.field3152 == 0) {
                    class353.field5369 = new class338[100];
                }
                class353.field5369[var282 + 1] = var281;
                class210.field3152++;
                if (var276.equals(class472.field6622.field3839)) {
                    class220.field3249 = var278;
                }
            }
            class75.field1041 = class12.field169;
            class147.field2099 = null;
            return true;
        } else if (class157.field2188 == class147.field2099) {
            int var287 = class220.field3246.method2631(2530);
            String var288 = class220.field3246.method2582((byte) -105);
            Object[] var289 = new Object[var288.length() + 1];
            for (int var290 = var288.length() - 1; var290 >= 0; var290--) {
                if (var288.charAt(var290) == 's') {
                    var289[var290 + 1] = class220.field3246.method2582((byte) -63);
                } else {
                    var289[var290 + 1] = Integer.valueOf(class220.field3246.method2604(86));
                }
            }
            var289[0] = Integer.valueOf(class220.field3246.method2604(arg0 - 108));
            if (class191.method1327(arg0 + 32257, var287)) {
                class415 var291 = new class415();
                var291.field5989 = var289;
                class477.method2797(var291);
            }
            class147.field2099 = null;
            return true;
        } else if (class3.field73 == class147.field2099) {
            int var292 = class220.field3246.method2598(15229);
            int var293 = class220.field3246.method2598(15229);
            byte var294 = class220.field3246.method2642(true);
            if (class191.method1327(32255, var292)) {
                class463.method2727(var293, (byte) -101, var294);
            }
            class147.field2099 = null;
            return true;
        } else if (class400.field5835 == class147.field2099) {
            class315.field4736.method27(false);
            class161.field2228 += 32;
            class147.field2099 = null;
            return true;
        } else if (class65.field900 == class147.field2099) {
            class306.method1909(64, class493.field6935);
            class147.field2099 = null;
            return true;
        } else if (class36.field469 == class147.field2099) {
            class306.method1909(64, class306.field4556);
            class147.field2099 = null;
            return true;
        } else if (class2.field23 == class147.field2099) {
            int var295 = class220.field3246.method2598(15229);
            if (var295 == 65535) {
                var295 = -1;
            }
            int var296 = class220.field3246.method2598(15229);
            int var297 = class220.field3246.method2617(1538701744);
            if (class191.method1327(32255, var296)) {
                class94.method729(var295, var297, arg0 ^ 0xFFFFFFCC);
            }
            class147.field2099 = null;
            return true;
        } else if (class346.field5277 == class147.field2099) {
            int var298 = class220.field3246.method2616((byte) 50);
            int var299 = class220.field3246.method2617(arg0 + 1538701746);
            int var300 = class220.field3246.method2616((byte) 28);
            class441.field6227[var298] = var299;
            class126.field1721[var298] = var300;
            class219.field3242[var298] = 1;
            int var301 = class219.field3235[var298] - 1;
            for (int var302 = 0; var302 < var301; var302++) {
                if (class186.field2815[var302] <= var299) {
                    class219.field3242[var298] = var302 + 2;
                }
            }
            class386.field5700[class412.method2463(31, class358.field5440++)] = var298;
            class147.field2099 = null;
            return true;
        } else if (class464.field6544 == class147.field2099) {
            if (class95.field1342 == 0) {
                class200.field3036 = class485.field6808.method2036(class4.field85, (byte) -21);
            } else {
                class200.field3036 = class220.field3246.method2582((byte) -56);
            }
            class147.field2099 = null;
            return true;
        } else if (class43.field596 == class147.field2099) {
            class488.field6847 = class220.field3246.method2628(49152);
            class147.field2099 = null;
            return true;
        } else if (class40.field563 == class147.field2099) {
            class306.method1909(64, class331.field4958);
            class147.field2099 = null;
            return true;
        } else if (class355.field5380 == class147.field2099) {
            int var303 = class220.field3246.method2617(arg0 + 1538701746);
            int var304 = class220.field3246.method2637(-4);
            class315.field4736.method20(var303, (byte) -28, var304);
            class147.field2099 = null;
            return true;
        } else if (class303.field4511 == class147.field2099) {
            String var305 = class220.field3246.method2582((byte) -119);
            int var306 = class220.field3246.method2631(2530);
            String var307 = class305.method1903(var306, true).method754((byte) 94, class220.field3246);
            class269.method1748(var307, var305, 19, var305, (byte) -85, var306, (String) null, 0);
            class147.field2099 = null;
            return true;
        } else if (class53.field755 == class147.field2099) {
            int var308 = class220.field3246.method2598(15229);
            int var309 = class220.field3246.method2598(15229);
            int var310 = class220.field3246.method2598(15229);
            int var311 = class220.field3246.method2637(-4);
            int var312 = class220.field3246.method2617(1538701744);
            if (class191.method1327(32255, var310)) {
                class5.method37(var311, (byte) -127, var312, 7, var309 | var308 << 16);
            }
            class147.field2099 = null;
            return true;
        } else if (class252.field3626 == class147.field2099) {
            int var313 = class220.field3246.method2604(30);
            class72.field963 = class21.field261.method1047(var313, arg0 - 118);
            class147.field2099 = null;
            return true;
        } else if (class200.field3026 == class147.field2099) {
            class156.method1062(true, true);
            class147.field2099 = null;
            return true;
        } else if (class70.field947 == class147.field2099) {
            int var314 = class220.field3246.method2626(arg0 + 116);
            String var315 = class220.field3246.method2582((byte) -106);
            int var316 = class220.field3246.method2620(arg0 ^ 0x7C);
            int var317 = class220.field3246.method2585(94);
            if (var317 == 65535) {
                var317 = -1;
            }
            if (var316 >= 1 && var316 <= 8) {
                if (var315.equalsIgnoreCase("null")) {
                    var315 = null;
                }
                class163.field2267[var316 - 1] = var315;
                class447.field6336[var316 - 1] = var317;
                class432.field6132[var316 - 1] = var314 == 0;
            }
            class147.field2099 = null;
            return true;
        } else if (class436.field6175 == class147.field2099) {
            String var318 = class220.field3246.method2582((byte) -123);
            String var319 = class459.method2712(class436.method2541(false, class220.field3246), arg0 - 69);
            class462.method2719(var318, 6, 0, (byte) -78, var318, var319);
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class116.field1622) {
            class306.method1909(64, class459.field6502);
            class147.field2099 = null;
            return true;
        } else if (class403.field5879 == class147.field2099) {
            class306.method1909(64, class253.field3631);
            class147.field2099 = null;
            return true;
        } else if (class370.field5571 == class147.field2099) {
            int var320 = class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
            int var321 = class220.field3246.method2617(1538701744);
            int var322 = class220.field3246.method2637(arg0 - 2);
            int var323 = class220.field3246.method2598(15229);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var322)) {
                class462.method2725(var321, (var320 << 16) + var323, (byte) 127);
            }
            class147.field2099 = null;
            return true;
        } else if (class65.field901 == class147.field2099) {
            boolean var324 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE) == 1;
            String var325 = class220.field3246.method2582((byte) -60);
            String var326 = var325;
            if (var324) {
                var326 = class220.field3246.method2582((byte) -71);
            }
            long var327 = (long) class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
            long var329 = (long) class220.field3246.method2613(-25778);
            int var331 = class220.field3246.method2628(49152);
            int var332 = class220.field3246.method2631(2530);
            long var333 = (var327 << 32) + var329;
            boolean var335 = false;
            int var336 = 0;
            while (true) {
                if (var336 >= 100) {
                    if (var331 <= 1 && class15.method140(var326, (byte) -68)) {
                        var335 = true;
                    }
                    break;
                }
                if (class260.field3867[var336] == var333) {
                    var335 = true;
                    break;
                }
                var336++;
            }
            if (!var335 && class301.field4488 == 0) {
                class260.field3867[class70.field950] = var333;
                class70.field950 = (class70.field950 + 1) % 100;
                String var337 = class305.method1903(var332, true).method754((byte) 94, class220.field3246);
                if (var331 == 2) {
                    class269.method1748(var337, "<img=1>" + var325, 18, "<img=1>" + var326, (byte) -118, var332, (String) null, 0);
                } else if (var331 == 1) {
                    class269.method1748(var337, "<img=0>" + var325, 18, "<img=0>" + var326, (byte) 113, var332, (String) null, 0);
                } else {
                    class269.method1748(var337, var325, 18, var326, (byte) 105, var332, (String) null, 0);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class178.field2666 == class147.field2099) {
            class306.method1909(64, class229.field3369);
            class147.field2099 = null;
            return true;
        } else if (class486.field6834 == class147.field2099) {
            int var338 = class220.field3246.method2631(2530);
            int var339 = class220.field3246.method2604(-123);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var338)) {
                class468 var340 = (class468) class466.field6564.method2305((long) var339, (byte) 56);
                if (var340 != null) {
                    class479.method2811(1711162608, false, var340, true);
                }
                if (class232.field3403 != null) {
                    class205.method1396(arg0 ^ 0xFFFFFFAB, class232.field3403);
                    class232.field3403 = null;
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class29.field378 == class147.field2099) {
            if (class123.field1698 != null) {
                class76.method650((byte) -95, -1, class337.field5038.field3947, -1, false);
            }
            byte[] var341 = new byte[class95.field1342];
            class220.field3246.method373(0, class95.field1342, var341, 0);
            String var342 = class320.method1971(-28530, class95.field1342, var341, 0);
            class119.method847(true, var342, class170.field2424 == 1, class21.field261, (byte) 60);
            class147.field2099 = null;
            return true;
        } else if (class340.field5101 == class147.field2099) {
            int var343 = class220.field3246.method2628(49152);
            int var344 = class220.field3246.method2598(15229);
            if (class191.method1327(32255, var344)) {
                class451.field6386 = var343;
            }
            class147.field2099 = null;
            return true;
        } else if (class48.field695 == class147.field2099) {
            int var345 = class220.field3246.method2631(2530);
            int var346 = class220.field3246.method2617(arg0 ^ 0xA449464E);
            if (class191.method1327(32255, var345)) {
                class5.method37(0, (byte) -127, var346, 5, class263.field3910);
            }
            class147.field2099 = null;
            return true;
        } else if (class275.field4179 == class147.field2099) {
            int var347 = class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
            int var348 = class220.field3246.method2611(2);
            int var349 = class220.field3246.method2614(7);
            if (class191.method1327(32255, var347)) {
                class468 var350 = (class468) class466.field6564.method2305((long) var348, (byte) 97);
                class468 var351 = (class468) class466.field6564.method2305((long) var349, (byte) 56);
                if (var351 != null) {
                    class479.method2811(1711162608, false, var351, var350 == null || var350.field6584 != var351.field6584);
                }
                if (var350 != null) {
                    var350.method283(2);
                    class466.field6564.method2307((long) var349, var350, (byte) -69);
                }
                class178 var352 = class493.method2885(var348, 65535);
                if (var352 != null) {
                    class205.method1396(111, var352);
                }
                class178 var353 = class493.method2885(var349, 65535);
                if (var353 != null) {
                    class205.method1396(85, var353);
                    class426.method2508(true, var353, arg0 + 1);
                }
                if (class279.field4220 != -1) {
                    class231.method1517(class279.field4220, 1, -1);
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class13.field193) {
            int var354 = class220.field3246.method2631(arg0 ^ 0xFFFFF61C);
            int var355 = class220.field3246.method2631(2530);
            int var356 = class220.field3246.method2631(2530);
            int var357 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var354) && class467.field6572[var355] != null) {
                for (int var358 = var356; var358 < var357; var358++) {
                    int var359 = class220.field3246.method2613(-25778);
                    if (class467.field6572[var355].length > var358 && class467.field6572[var355][var358] != null) {
                        class467.field6572[var355][var358].field2570 = var359;
                    }
                }
            }
            class147.field2099 = null;
            return true;
        } else if (class441.field6236 == class147.field2099) {
            int var360 = class220.field3246.method2631(2530);
            int var361 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            int var362 = class220.field3246.method2628(49152);
            int var363 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            int var364 = class220.field3246.method2628(arg0 ^ 0xFFFF3FFE);
            int var365 = class220.field3246.method2631(2530);
            if (class191.method1327(arg0 + 32257, var360)) {
                client.field6675[var361] = true;
                class229.field3372[var361] = var362;
                class312.field4708[var361] = var363;
                class131.field1826[var361] = var364;
                class462.field6510[var361] = var365;
            }
            class147.field2099 = null;
            return true;
        } else if (class208.field3143 == class147.field2099) {
            int var366 = class220.field3246.method2600((byte) 26);
            int var367 = class220.field3246.method2634(arg0 ^ 0xFFFFFFEE);
            int var368 = class220.field3246.method2598(arg0 + 15231);
            int var369 = class220.field3246.method2611(arg0 + 40);
            if (class191.method1327(arg0 ^ 0xFFFF8201, var368)) {
                class448.method2648(11, var369, var366, var367);
            }
            class147.field2099 = null;
            return true;
        } else if (class147.field2099 == class103.field1438) {
            int var370 = class220.field3246.method2637(arg0 ^ 0x2);
            int var371 = class220.field3246.method2637(-4);
            String var372 = class220.field3246.method2582((byte) -80);
            if (class191.method1327(32255, var370)) {
                class143.method981(0, var372, var371);
            }
            class147.field2099 = null;
            return true;
        } else if (class199.field3002 == class147.field2099) {
            int var373 = class220.field3246.method2611(91);
            int var374 = class220.field3246.method2585(124);
            String var375 = class220.field3246.method2582((byte) -114);
            if (class191.method1327(32255, var374)) {
                class198.method1348(var375, -28225, var373);
            }
            class147.field2099 = null;
            return true;
        } else if (class191.field2925 == class147.field2099) {
            int var376 = class220.field3246.method2604(96);
            int var377 = class220.field3246.method2585(101);
            int var378 = class220.field3246.method2631(2530);
            if (class191.method1327(32255, var377)) {
                class443.method2574(var376, (byte) 88, var378);
            }
            class147.field2099 = null;
            return true;
        } else {
            class416.method2475(false, (Throwable) null, "T1 - " + (class147.field2099 == null ? -1 : class147.field2099.method2755(false)) + "," + (class273.field4143 == null ? -1 : class273.field4143.method2755(false)) + "," + (class392.field5788 == null ? -1 : class392.field5788.method2755(false)) + " - " + class95.field1342);
            class38.method295(71);
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILre;)V")
    public static final void method812(int arg0, class446 arg1) {
        field1569++;
        int var2 = arg1.method2635(arg0 + 47);
        class449.field6347 = new class256[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class449.field6347[var3] = new class256();
            class449.field6347[var3].field3793 = arg1.method2635(arg0 ^ 0xFFFFFFB7);
            class449.field6347[var3].field3795 = arg1.method2643((byte) -86);
        }
        class203.field3091 = arg1.method2635(108);
        class345.field5253 = arg1.method2635(36);
        if (arg0 != -2) {
            field1566 = null;
        }
        class306.field4563 = arg1.method2635(94);
        class472.field6620 = new class187[class345.field5253 + 1 - class203.field3091];
        for (int var4 = 0; var4 < class306.field4563; var4++) {
            int var5 = arg1.method2635(21);
            class187 var6 = class472.field6620[var5] = new class187();
            var6.field4983 = arg1.method2628(49152);
            var6.field4987 = arg1.method2604(94);
            var6.field2845 = class203.field3091 + var5;
            var6.field2841 = arg1.method2643((byte) -86);
            var6.field2837 = arg1.method2643((byte) -86);
        }
        class3.field71 = arg1.method2604(74);
        class373.field5604 = true;
    }
}

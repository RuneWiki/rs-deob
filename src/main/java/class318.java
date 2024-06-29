import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class318 extends class289 {

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lmo;")
    public static class482 field4387 = new class482(8);

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Z")
    public static boolean field4389 = false;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(FB)V")
    public final void method1778(float arg0, byte arg1) {
        ++field4388;
        super.field4062 = arg0;
        if (arg1 < 91) {
            method1912(119, -55, -65, 0.427044F, 4, 0.24287449F, 5, -29, -31, -90, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
    public static final boolean method1910(int arg0) throws IOException {
        ++field4386;
        if (class256.field3696 == null) {
            return false;
        } else {
            if (class447.field6457 == null) {
                if (class366.field5081) {
                    if (!class256.field3696.method921(1, -5794)) {
                        return false;
                    }
                    class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                    class366.field5081 = false;
                    ++class163.field2696;
                    class426.field6089 = 0;
                }
                class376.field5209.field6710 = 0;
                if (class376.field5209.method2230(255)) {
                    if (!class256.field3696.method921(1, arg0 ^ -5793)) {
                        return false;
                    }
                    class256.field3696.method918(19001, 1, 1, class376.field5209.field6719);
                    ++class163.field2696;
                    class426.field6089 = 0;
                }
                class366.field5081 = true;
                class116[] var1 = class627.method3535((byte) -97);
                int var2 = class376.field5209.method2222((byte) -119);
                if (var2 < 0 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class376.field5209.field6710);
                }
                class447.field6457 = var1[var2];
                class99.field1481 = class447.field6457.field1843;
            }
            if (~class99.field1481 == 0) {
                if (!class256.field3696.method921(1, -5794)) {
                    return false;
                }
                class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                class426.field6089 = 0;
                ++class163.field2696;
                class99.field1481 = 255 & class376.field5209.field6719[0];
            }
            if (class99.field1481 == -2) {
                if (!class256.field3696.method921(2, -5794)) {
                    return false;
                }
                class256.field3696.method918(19001, 0, 2, class376.field5209.field6719);
                class376.field5209.field6710 = 0;
                class99.field1481 = class376.field5209.method2755((byte) -87);
                class163.field2696 += 2;
                class426.field6089 = 0;
            }
            if (~class99.field1481 < -1) {
                if (!class256.field3696.method921(class99.field1481, -5794)) {
                    return false;
                }
                class376.field5209.field6710 = 0;
                class256.field3696.method918(19001, 0, class99.field1481, class376.field5209.field6719);
                class426.field6089 = 0;
                class163.field2696 += class99.field1481;
            }
            class127.field2083 = class256.field3697;
            class256.field3697 = class305.field4260;
            class305.field4260 = class447.field6457;
            if (class447.field6457 == class112.field1783) {
                class352.method2133(arg0 + 32073, false);
                class447.field6457 = null;
                return false;
            } else if (class447.field6457 == class229.field3392) {
                int var3 = class376.field5209.method2706((byte) 97);
                int var4 = class376.field5209.method2710((byte) 107);
                if (var4 == 255) {
                    var4 = -1;
                    var3 = -1;
                }
                class9.method48(var3, true, var4);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class128.field2094) {
                int var5 = class376.field5209.method2690(108);
                int var6 = class376.field5209.method2755((byte) -90);
                if (~var6 == -65536) {
                    var6 = -1;
                }
                int var7 = class376.field5209.method2696(-1605640280);
                int var8 = class376.field5209.method2711(-96);
                int var9 = class376.field5209.method2696(-1605640280);
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (class448.method2609((byte) -79, var7)) {
                    for (int var10 = var9; var10 <= var6; ++var10) {
                        long var11 = ((long) var5 << 32) - -((long) var10);
                        class330 var13 = (class330) class511.field7608.method2818(arg0 ^ -22804, var11);
                        class330 var14;
                        if (var13 == null) {
                            if (~var10 != 0) {
                                var14 = new class330(0, var8);
                            } else {
                                var14 = new class330(class271.method1711(var5, arg0 + 23726).field1590.field4572, var8);
                            }
                        } else {
                            var14 = new class330(var13.field4572, var8);
                            var13.method2549((byte) 74);
                        }
                        class511.field7608.method2816(var14, var11, false);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class669.field9481 == class447.field6457) {
                class331.method1962(-23875);
                class447.field6457 = null;
                return false;
            } else if (class545.field8004 == class447.field6457) {
                int var15 = class376.field5209.method2696(arg0 + -1605640281);
                int var16 = class376.field5209.method2690(120);
                int var17 = class376.field5209.method2711(arg0 ^ -82);
                if (class448.method2609((byte) -79, var17)) {
                    class64.method525(var16, var15, 105112724);
                }
                class447.field6457 = null;
                return true;
            } else if (class677.field9649 == class447.field6457) {
                int var18 = class376.field5209.method2710((byte) 107);
                int var19 = class376.field5209.method2696(arg0 ^ -1605640279);
                if (class448.method2609((byte) -79, var19)) {
                    class640.field9070 = var18;
                }
                class447.field6457 = null;
                return true;
            } else if (class677.field9632 == class447.field6457) {
                class230.field3404.method1422((byte) 76);
                class627.field8927 += 32;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class17.field261) {
                boolean var20 = ~class376.field5209.method2705(-93) == -2;
                String var21 = class376.field5209.method2717(true);
                String var22 = var21;
                if (var20) {
                    var22 = class376.field5209.method2717(true);
                }
                long var23 = class376.field5209.method2727(arg0 ^ 1);
                long var25 = (long) class376.field5209.method2755((byte) -91);
                long var27 = (long) class376.field5209.method2714(true);
                int var29 = class376.field5209.method2705(-77);
                long var30 = (var25 << 32) - -var27;
                boolean var32 = false;
                int var33 = 0;
                while (true) {
                    if (var33 >= 100) {
                        if (~var29 >= -2) {
                            if ((!class296.field4187 || class375.field5202) && !class289.field4065) {
                                if (class536.method3143((byte) 23, var22)) {
                                    var32 = true;
                                }
                            } else {
                                var32 = true;
                            }
                        }
                        break;
                    }
                    if (class176.field2808[var33] == var30) {
                        var32 = true;
                        break;
                    }
                    ++var33;
                }
                if (!var32 && ~class80.field1210 == -1) {
                    class176.field2808[class462.field6640] = var30;
                    class462.field6640 = (class462.field6640 + 1) % 100;
                    String var34 = class563.method3294(1375731712, class235.method1541(32767, class376.field5209));
                    if (var29 != 2 && var29 != 3) {
                        if (var29 != 1) {
                            class244.method1573(0, 9, class311.method1880(var23, -86), var21, -1, (byte) -87, var34, var22, var21);
                        } else {
                            class244.method1573(0, 9, class311.method1880(var23, -52), "<img=0>" + var21, -1, (byte) -87, var34, "<img=0>" + var22, var21);
                        }
                    } else {
                        class244.method1573(0, 9, class311.method1880(var23, arg0 + -52), "<img=1>" + var21, -1, (byte) -87, var34, "<img=1>" + var22, var21);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class562.field8202 == class447.field6457) {
                int var35 = class376.field5209.method2755((byte) -90);
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = class376.field5209.method2705(-107);
                int var37 = class376.field5209.method2755((byte) -101);
                int var38 = class376.field5209.method2705(-92);
                class522.method3076((byte) -47, true, var38, var37, 256, var36, var35);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class374.field5186) {
                class549.method3220(class626.field8921, true);
                class447.field6457 = null;
                return true;
            } else if (class91.field1340 == class447.field6457) {
                int var39 = class376.field5209.method2755((byte) -75);
                if (class448.method2609((byte) -79, var39)) {
                    class537.method3147(false);
                }
                class447.field6457 = null;
                return true;
            } else if (class59.field863 == class447.field6457) {
                class549.method3220(class658.field9279, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class253.field3665) {
                int var40 = class376.field5209.method2755((byte) -69);
                String var41 = class376.field5209.method2717(true);
                Object[] var42 = new Object[1 + var41.length()];
                for (int var43 = -1 + var41.length(); var43 >= 0; --var43) {
                    if (var41.charAt(var43) != 's') {
                        var42[var43 + 1] = new Integer(class376.field5209.method2691((byte) -67));
                    } else {
                        var42[var43 - -1] = class376.field5209.method2717(true);
                    }
                }
                var42[0] = new Integer(class376.field5209.method2691((byte) -67));
                if (class448.method2609((byte) -79, var40)) {
                    class400 var44 = new class400();
                    var44.field5790 = var42;
                    class362.method2171(var44);
                }
                class447.field6457 = null;
                return true;
            } else if (class680.field9684 == class447.field6457) {
                int var45 = class376.field5209.method2755((byte) -104);
                int var46 = class376.field5209.method2755((byte) -86);
                int var47 = class376.field5209.method2755((byte) -127);
                int var48 = class376.field5209.method2755((byte) -108);
                if (class448.method2609((byte) -79, var45) && class265.field3806[var46] != null) {
                    for (int var49 = var47; var48 > var49; ++var49) {
                        int var50 = class376.field5209.method2714(true);
                        if (var49 < class265.field3806[var46].length && class265.field3806[var46][var49] != null) {
                            class265.field3806[var46][var49].field1521 = var50;
                        }
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class433.field6232) {
                int var51 = class376.field5209.method2688(128);
                int var52 = class376.field5209.method2711(arg0 + -79);
                boolean var53 = ~(var51 & 1) == -2;
                class532.method3128((byte) 124, var52, var53);
                class88.field1311[class248.method1593(class309.field4299++, 31)] = var52;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class103.field1707) {
                int var54 = class376.field5209.method2747((byte) -102);
                int var55 = class376.field5209.method2755((byte) -125);
                if (class448.method2609((byte) -79, var55)) {
                    class690.method3885(var54, -1, -1, 3, (byte) 96);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class194.field3040) {
                int var56 = class376.field5209.method2755((byte) -128);
                int var57 = class376.field5209.method2705(-99);
                int var58 = class376.field5209.method2705(-98);
                int var59 = class376.field5209.method2705(-27);
                int var60 = class376.field5209.method2705(arg0 + -87);
                int var61 = class376.field5209.method2755((byte) -65);
                if (class448.method2609((byte) -79, var56)) {
                    class73.field1162[var57] = true;
                    class196.field3071[var57] = var58;
                    class528.field7759[var57] = var59;
                    class325.field4528[var57] = var60;
                    class557.field8147[var57] = var61;
                }
                class447.field6457 = null;
                return true;
            } else if (class535.field7863 == class447.field6457) {
                boolean var62 = class376.field5209.method2705(-64) == 1;
                String var63 = class376.field5209.method2717(true);
                String var64 = var63;
                if (var62) {
                    var64 = class376.field5209.method2717(true);
                }
                long var65 = (long) class376.field5209.method2755((byte) -55);
                long var67 = (long) class376.field5209.method2714(true);
                int var69 = class376.field5209.method2705(-58);
                int var70 = class376.field5209.method2755((byte) -43);
                long var71 = (var65 << 32) + var67;
                boolean var73 = false;
                int var74 = 0;
                while (true) {
                    if (var74 >= 100) {
                        if (var69 <= 1 && class536.method3143((byte) 114, var64)) {
                            var73 = true;
                        }
                        break;
                    }
                    if (class176.field2808[var74] == var71) {
                        var73 = true;
                        break;
                    }
                    ++var74;
                }
                if (!var73 && class80.field1210 == 0) {
                    class176.field2808[class462.field6640] = var71;
                    class462.field6640 = (class462.field6640 + 1) % 100;
                    String var75 = class116.field1840.method2157(var70, (byte) -82).method3208(false, class376.field5209);
                    if (var69 == 2) {
                        class244.method1573(0, 18, (String) null, "<img=1>" + var63, var70, (byte) -87, var75, "<img=1>" + var64, var63);
                    } else if (var69 == 1) {
                        class244.method1573(0, 18, (String) null, "<img=0>" + var63, var70, (byte) -87, var75, "<img=0>" + var64, var63);
                    } else {
                        class244.method1573(0, 18, (String) null, var63, var70, (byte) -87, var75, var64, var63);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class90.field1331 == class447.field6457) {
                class549.method3220(class475.field6808, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class24.field327) {
                int var76 = class376.field5209.method2696(-1605640280);
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = class376.field5209.method2688(128);
                int var78 = class376.field5209.method2706((byte) 97);
                class69.method567(var78, var77, -1536601784, var76);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class232.field3446) {
                int var79 = class376.field5209.method2706((byte) 97);
                int var80 = class376.field5209.method2696(arg0 ^ -1605640279);
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = class376.field5209.method2699((byte) -124);
                class258.method1641(var80, var79, (byte) -90, var81);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class341.field4734) {
                class376.field5209.field6710 += 28;
                if (class376.field5209.method2716(arg0 + -632)) {
                    class557.method3264(class376.field5209, class376.field5209.field6710 + -28, 0);
                }
                class447.field6457 = null;
                return true;
            } else if (class624.field8887 == class447.field6457) {
                int var82 = class376.field5209.method2755((byte) -61);
                int var83 = class376.field5209.method2705(-71);
                boolean var84 = ~(var83 & 1) == -2;
                while (~class376.field5209.field6710 > ~class99.field1481) {
                    int var85 = class376.field5209.method2720(arg0 + -127);
                    int var86 = class376.field5209.method2755((byte) -68);
                    int var87 = 0;
                    if (~var86 != -1) {
                        var87 = class376.field5209.method2705(-75);
                        if (~var87 == -256) {
                            var87 = class376.field5209.method2691((byte) -67);
                        }
                    }
                    class331.method1961(var87, var86 - 1, var82, var84, (byte) 56, var85);
                }
                class88.field1311[class248.method1593(31, class309.field4299++)] = var82;
                class447.field6457 = null;
                return true;
            } else if (class618.field8824 == class447.field6457) {
                byte var88 = class376.field5209.method2712(-108);
                int var89 = class376.field5209.method2755((byte) -97);
                int var90 = class376.field5209.method2696(arg0 + -1605640281);
                if (class448.method2609((byte) -79, var90)) {
                    class42.method340(false, var88, var89);
                }
                class447.field6457 = null;
                return true;
            } else if (class682.field9714 == class447.field6457) {
                int var91 = class376.field5209.method2711(arg0 + -71);
                int var92 = class376.field5209.method2694((byte) -76);
                int var93 = class376.field5209.method2711(-123);
                if (~var93 == -65536) {
                    var93 = -1;
                }
                int var94 = class376.field5209.method2694((byte) -76);
                if (class448.method2609((byte) -79, var91)) {
                    class466.method2758(var92, (byte) 103, var93, var94);
                    class432 var95 = class430.field6132.method42(var93, false);
                    class390.method2376(var92, var95.field6187, var95.field6172, var95.field6199, (byte) -128);
                    class412.method2457(var92, var95.field6191, (byte) 124, var95.field6221, var95.field6140);
                }
                class447.field6457 = null;
                return true;
            } else if (class498.field7406 == class447.field6457) {
                class90.field1333 = class376.field5209.method2705(-105);
                for (int var96 = 0; class90.field1333 > var96; ++var96) {
                    class623.field8878[var96] = class376.field5209.method2717(true);
                    class57.field854[var96] = class376.field5209.method2717(true);
                    if (class57.field854[var96].equals("")) {
                        class57.field854[var96] = class623.field8878[var96];
                    }
                    class409.field5848[var96] = class376.field5209.method2717(true);
                    class617.field8817[var96] = class376.field5209.method2717(true);
                    if (class617.field8817[var96].equals("")) {
                        class617.field8817[var96] = class409.field5848[var96];
                    }
                    class373.field5181[var96] = false;
                }
                class419.field5960 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class327.field4549) {
                class413.field5890 = class376.field5209.method2710((byte) 107);
                class334.field4666 = class376.field5209.method2705(-36);
                class447.field6457 = null;
                return true;
            } else if (class545.field8000 == class447.field6457) {
                int var97 = class376.field5209.method2755((byte) -66);
                int var98 = class376.field5209.method2736(false);
                String var99 = class376.field5209.method2717(true);
                if (class448.method2609((byte) -79, var97)) {
                    class270.method1703(25748, var98, var99);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class334.field4656) {
                class284.field3974 = class231.method1514(class376.field5209.method2705(-34), (byte) -85);
                class447.field6457 = null;
                return true;
            } else if (class648.field9187 == class447.field6457) {
                int var100 = class376.field5209.method2694((byte) -76);
                int var101 = class376.field5209.method2696(arg0 + -1605640281);
                int var102 = class376.field5209.method2755((byte) -76);
                if (~var102 == -65536) {
                    var102 = -1;
                }
                if (class448.method2609((byte) -79, var101)) {
                    class690.method3885(var100, var102, -1, 2, (byte) 96);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class247.field3586) {
                class549.method3220(class127.field2070, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class396.field5737) {
                class506.field7520 = class330.field4562;
                if (class99.field1481 == 0) {
                    class447.field6457 = null;
                    class320.field4407 = 0;
                    class122.field1989 = null;
                    class230.field3409 = null;
                    class57.field857 = null;
                    return true;
                } else {
                    class122.field1989 = class376.field5209.method2717(true);
                    boolean var103 = class376.field5209.method2705(-24) == 1;
                    if (var103) {
                        class376.field5209.method2717(true);
                    }
                    long var104 = class376.field5209.method2727(arg0 + -1);
                    class57.field857 = class618.method3494(var104, -32105);
                    class329.field4560 = class376.field5209.method2712(-75);
                    int var106 = class376.field5209.method2705(-118);
                    if (var106 == 255) {
                        class447.field6457 = null;
                        return true;
                    } else {
                        class320.field4407 = var106;
                        class34[] var107 = new class34[100];
                        for (int var108 = 0; ~class320.field4407 < ~var108; ++var108) {
                            var107[var108] = new class34();
                            var107[var108].field485 = class376.field5209.method2717(true);
                            boolean var114 = ~class376.field5209.method2705(-71) == -2;
                            if (!var114) {
                                var107[var108].field482 = var107[var108].field485;
                            } else {
                                var107[var108].field482 = class376.field5209.method2717(true);
                            }
                            var107[var108].field479 = class57.method494(var107[var108].field482, (byte) 96);
                            var107[var108].field481 = class376.field5209.method2755((byte) -109);
                            var107[var108].field483 = class376.field5209.method2712(-126);
                            var107[var108].field486 = class376.field5209.method2717(true);
                            if (var107[var108].field482.equals(class103.field1708.field3848)) {
                                class466.field6730 = var107[var108].field483;
                            }
                        }
                        boolean var109 = false;
                        int var110 = class320.field4407;
                        while (~var110 < -1) {
                            --var110;
                            boolean var111 = true;
                            for (int var112 = 0; var110 > var112; ++var112) {
                                if (~var107[var112].field479.compareTo(var107[var112 + 1].field479) < -1) {
                                    class34 var113 = var107[var112];
                                    var107[var112] = var107[var112 + 1];
                                    var111 = false;
                                    var107[var112 + 1] = var113;
                                }
                            }
                            if (var111) {
                                break;
                            }
                        }
                        class230.field3409 = var107;
                        class447.field6457 = null;
                        return true;
                    }
                }
            } else if (class447.field6457 == class446.field6454) {
                class549.method3220(class457.field6572, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class142.field2463) {
                String var115 = class376.field5209.method2717(true);
                int var116 = class376.field5209.method2688(128);
                int var117 = class376.field5209.method2688(arg0 + 127);
                int var118 = class376.field5209.method2755((byte) -122);
                if (~var118 == -65536) {
                    var118 = -1;
                }
                if (var116 >= 1 && var116 <= 8) {
                    if (var115.equalsIgnoreCase("null")) {
                        var115 = null;
                    }
                    class288.field4050[var116 + -1] = var115;
                    class236.field3496[var116 + -1] = var118;
                    class23.field317[var116 + -1] = var117 == 0;
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class421.field6013) {
                int var119 = class376.field5209.method2691((byte) -67);
                class300.field4214 = class653.field9220.method3965(-10, var119);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class425.field6077) {
                int var120 = class376.field5209.method2696(-1605640280);
                if (~var120 == -65536) {
                    var120 = -1;
                }
                int var121 = class376.field5209.method2755((byte) -66);
                int var122 = class376.field5209.method2690(118);
                if (class448.method2609((byte) -79, var121)) {
                    class690.method3885(var122, var120, -1, 1, (byte) 96);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class124.field2044) {
                int var123 = class376.field5209.method2705(-87);
                boolean var124 = ~(1 & var123) == -2;
                String var125 = class376.field5209.method2717(true);
                String var126 = class376.field5209.method2717(true);
                if (var126.equals("")) {
                    var126 = var125;
                }
                String var127 = class376.field5209.method2717(true);
                String var128 = class376.field5209.method2717(true);
                if (var128.equals("")) {
                    var128 = var127;
                }
                if (var124) {
                    for (int var129 = 0; ~var129 > ~class90.field1333; ++var129) {
                        if (class57.field854[var129].equals(var128)) {
                            class623.field8878[var129] = var125;
                            class57.field854[var129] = var126;
                            class409.field5848[var129] = var127;
                            class617.field8817[var129] = var128;
                            break;
                        }
                    }
                } else {
                    class623.field8878[class90.field1333] = var125;
                    class57.field854[class90.field1333] = var126;
                    class409.field5848[class90.field1333] = var127;
                    class617.field8817[class90.field1333] = var128;
                    class373.field5181[class90.field1333] = ~class248.method1593(2, var123) == -3;
                    ++class90.field1333;
                }
                class419.field5960 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class253.field3662) {
                class458.field6577 = class99.field1481 > 2 ? class376.field5209.method2717(true) : class343.field4775.method2059(class238.field3511, true);
                class497.field7402 = class99.field1481 > 0 ? class376.field5209.method2755((byte) -125) : -1;
                class447.field6457 = null;
                if (class497.field7402 == 65535) {
                    class497.field7402 = -1;
                }
                return true;
            } else if (class622.field8861 == class447.field6457) {
                class475.field6809 = class376.field5209.method2712(arg0 + -124) << 3;
                class334.field4664 = class376.field5209.method2709(128) << 3;
                class183.field2900 = class376.field5209.method2688(128);
                for (class430 var130 = (class430) class480.field6870.method2815(0); var130 != null; var130 = (class430) class480.field6870.method2814(4)) {
                    int var132 = (int) (var130.field6265 >> 28 & 3L);
                    int var133 = (int) (16383L & var130.field6265);
                    int var134 = -class143.field2474 + var133;
                    int var135 = (int) (16383L & var130.field6265 >> 14);
                    int var136 = -class63.field917 + var135;
                    if (class183.field2900 == var132 && var134 >= class334.field4664 && class334.field4664 - -8 > var134 && ~var136 <= ~class475.field6809 && class475.field6809 + 8 > var136) {
                        var130.method2549((byte) 76);
                        if (var134 >= 0 && ~var136 <= -1 && ~var134 > ~class430.field6136 && ~class580.field8504 < ~var136) {
                            class155.method1163((byte) -84, var136, class183.field2900, var134);
                        }
                    }
                }
                for (class131 var131 = (class131) class221.field3303.method3905(-122); var131 != null; var131 = (class131) class221.field3303.method3899(0)) {
                    if (class334.field4664 <= var131.field2128 && ~(class334.field4664 + 8) < ~var131.field2128 && var131.field2140 >= class475.field6809 && var131.field2140 < class475.field6809 - -8 && class183.field2900 == var131.field2129) {
                        var131.field2136 = 0;
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class311.field4310) {
                class334.field4664 = class376.field5209.method2708((byte) -125) << 3;
                class183.field2900 = class376.field5209.method2710((byte) 107);
                class475.field6809 = class376.field5209.method2712(-101) << 3;
                while (class99.field1481 > class376.field5209.field6710) {
                    class511 var137 = class269.method1692((byte) 121)[class376.field5209.method2705(-128)];
                    class549.method3220(var137, true);
                }
                class447.field6457 = null;
                return true;
            } else if (class564.field8230 == class447.field6457) {
                class549.method3220(class250.field3618, true);
                class447.field6457 = null;
                return true;
            } else if (class467.field6736 == class447.field6457) {
                int var138 = class376.field5209.method2755((byte) -58);
                int var139 = class376.field5209.method2705(arg0 + -50);
                boolean var140 = (1 & var139) == 1;
                class77.method606(var138, var140, 0);
                int var141 = class376.field5209.method2755((byte) -83);
                for (int var142 = 0; var142 < var141; ++var142) {
                    int var143 = class376.field5209.method2711(-119);
                    int var144 = class376.field5209.method2705(-103);
                    if (~var144 == -256) {
                        var144 = class376.field5209.method2690(107);
                    }
                    class331.method1961(var144, var143 + -1, var138, var140, (byte) 63, var142);
                }
                class88.field1311[class248.method1593(31, class309.field4299++)] = var138;
                class447.field6457 = null;
                return true;
            } else if (class642.field9119 == class447.field6457) {
                class549.method3220(class235.field3482, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class103.field1701) {
                for (int var145 = 0; class76.field1186.length > var145; ++var145) {
                    if (class76.field1186[var145] != null) {
                        class76.field1186[var145].field2438 = null;
                        class76.field1186[var145].field2371 = -1;
                    }
                }
                for (int var146 = 0; var146 < class392.field5702; ++var146) {
                    class82.field1259[var146].field49.field2438 = null;
                    class82.field1259[var146].field49.field2371 = -1;
                }
                class447.field6457 = null;
                return true;
            } else if (class456.field6549 == class447.field6457) {
                class549.method3220(class86.field1285, true);
                class447.field6457 = null;
                return true;
            } else if (class537.field7884 == class447.field6457) {
                int var147 = class376.field5209.method2736(false);
                int var148 = class376.field5209.method2711(-113);
                int var149 = class376.field5209.method2694((byte) -76);
                if (class448.method2609((byte) -79, var148)) {
                    class118.method954(23306, var147, var149);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class42.field567) {
                if (class352.method2135(class515.field7636, (byte) -122)) {
                    class26.field363 = (int) (2.5F * (float) class376.field5209.method2755((byte) -69));
                } else {
                    class26.field363 = 30 * class376.field5209.method2755((byte) -46);
                }
                class587.field8579 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class75.field1177 == class447.field6457) {
                boolean var150 = ~class376.field5209.method2705(-25) == -2;
                String var151 = class376.field5209.method2717(true);
                String var152 = var151;
                if (var150) {
                    var152 = class376.field5209.method2717(true);
                }
                long var153 = (long) class376.field5209.method2755((byte) -78);
                long var155 = (long) class376.field5209.method2714(true);
                int var157 = class376.field5209.method2705(arg0 + -86);
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                int var161 = 0;
                while (true) {
                    if (var161 >= 100) {
                        if (var157 <= 1) {
                            if ((!class296.field4187 || class375.field5202) && !class289.field4065) {
                                if (class536.method3143((byte) 50, var152)) {
                                    var160 = true;
                                }
                            } else {
                                var160 = true;
                            }
                        }
                        break;
                    }
                    if (class176.field2808[var161] == var158) {
                        var160 = true;
                        break;
                    }
                    ++var161;
                }
                if (!var160 && ~class80.field1210 == -1) {
                    class176.field2808[class462.field6640] = var158;
                    class462.field6640 = (class462.field6640 + 1) % 100;
                    String var162 = class563.method3294(arg0 ^ 1375731713, class235.method1541(arg0 ^ 32766, class376.field5209));
                    if (~var157 != -3) {
                        if (~var157 == -2) {
                            class244.method1573(0, 7, (String) null, "<img=0>" + var151, -1, (byte) -87, var162, "<img=0>" + var152, var151);
                        } else {
                            class244.method1573(0, 3, (String) null, var151, -1, (byte) -87, var162, var152, var151);
                        }
                    } else {
                        class244.method1573(0, 7, (String) null, "<img=1>" + var151, -1, (byte) -87, var162, "<img=1>" + var152, var151);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class374.field5190) {
                int var163 = class376.field5209.method2694((byte) -76);
                int var164 = class376.field5209.method2696(-1605640280);
                int var165 = class376.field5209.method2696(-1605640280);
                int var166 = class376.field5209.method2696(-1605640280);
                if (class448.method2609((byte) -79, var166)) {
                    class154.method1161(-26076, var163, (var164 << 16) + var165);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class340.field4728) {
                int var167 = class376.field5209.method2711(-77);
                int var168 = class376.field5209.method2705(-104);
                class230.field3404.method1429(var167, var168, -94);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class30.field445) {
                int var169 = class376.field5209.method2696(-1605640280);
                int var170 = class376.field5209.method2696(-1605640280);
                int var171 = class376.field5209.method2747((byte) -102);
                int var172 = class376.field5209.method2736(false);
                int var173 = class376.field5209.method2711(arg0 ^ -65);
                if (class448.method2609((byte) -79, var173)) {
                    class390.method2376(var171, var172, var169, var170, (byte) -97);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class163.field2664) {
                int var174 = class376.field5209.method2705(-28);
                int var175 = var174 >> 5;
                int var176 = var174 & 31;
                if (var176 == 0) {
                    class481.field6873[var175] = null;
                    class447.field6457 = null;
                    return true;
                } else {
                    class258 var177 = new class258();
                    var177.field3709 = var176;
                    var177.field3701 = class376.field5209.method2705(-23);
                    if (~var177.field3701 <= -1 && ~var177.field3701 > ~class149.field2517.length) {
                        if (~var177.field3709 != -2 && ~var177.field3709 != -11) {
                            if (var177.field3709 >= 2 && ~var177.field3709 >= -7) {
                                if (var177.field3709 == 2) {
                                    var177.field3698 = 256;
                                    var177.field3704 = 256;
                                }
                                if (~var177.field3709 == -4) {
                                    var177.field3704 = 256;
                                    var177.field3698 = 0;
                                }
                                if (var177.field3709 == 4) {
                                    var177.field3704 = 256;
                                    var177.field3698 = 512;
                                }
                                if (~var177.field3709 == -6) {
                                    var177.field3704 = 0;
                                    var177.field3698 = 256;
                                }
                                if (~var177.field3709 == -7) {
                                    var177.field3704 = 512;
                                    var177.field3698 = 256;
                                }
                                var177.field3709 = 2;
                                var177.field3700 = class376.field5209.method2705(-115);
                                var177.field3698 += class376.field5209.method2755((byte) -114) + -class143.field2474 << 9;
                                var177.field3704 += class376.field5209.method2755((byte) -63) - class63.field917 << 9;
                                var177.field3702 = class376.field5209.method2705(arg0 ^ -42) << 2;
                                var177.field3706 = class376.field5209.method2755((byte) -88);
                            }
                        } else {
                            var177.field3705 = class376.field5209.method2755((byte) -93);
                            class376.field5209.field6710 += 6;
                        }
                        var177.field3708 = class376.field5209.method2755((byte) -75);
                        if (var177.field3708 == 65535) {
                            var177.field3708 = -1;
                        }
                        class481.field6873[var175] = var177;
                    }
                    class447.field6457 = null;
                    return true;
                }
            } else if (class447.field6457 == class103.field1704) {
                int var178 = class376.field5209.method2690(115);
                int var179 = class376.field5209.method2696(-1605640280);
                int var180 = class376.field5209.method2706((byte) 97);
                if (class448.method2609((byte) -79, var179)) {
                    class42.method341(var178, var180, arg0 + -10828);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class177.field2815) {
                class457.field6575 = class376.field5209.method2701(true);
                class296.field4187 = ~class376.field5209.method2705(-81) == -2;
                class447.field6457 = null;
                return true;
            } else if (class642.field9123 == class447.field6457) {
                int var181 = class376.field5209.method2696(-1605640280);
                byte var182 = class376.field5209.method2712(-71);
                class230.field3404.method1431(-1, var182, var181);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class211.field3223) {
                class84.method637(-1, class376.field5209.method2717(true));
                class447.field6457 = null;
                return true;
            } else if (class675.field9617 == class447.field6457) {
                int var183 = class376.field5209.method2755((byte) -64);
                if (var183 == 65535) {
                    var183 = -1;
                }
                int var184 = class376.field5209.method2705(-45);
                int var185 = class376.field5209.method2755((byte) -84);
                int var186 = class376.field5209.method2705(arg0 ^ -49);
                int var187 = class376.field5209.method2755((byte) -59);
                class522.method3076((byte) -96, false, var186, var185, var187, var184, var183);
                class447.field6457 = null;
                return true;
            } else if (class467.field6747 == class447.field6457) {
                boolean var188 = ~class376.field5209.method2705(-110) == -2;
                String var189 = class376.field5209.method2717(true);
                String var190 = var189;
                if (var188) {
                    var190 = class376.field5209.method2717(true);
                }
                long var191 = class376.field5209.method2727(arg0 + -1);
                long var193 = (long) class376.field5209.method2755((byte) -56);
                long var195 = (long) class376.field5209.method2714(true);
                int var197 = class376.field5209.method2705(arg0 + -70);
                int var198 = class376.field5209.method2755((byte) -66);
                long var199 = (var193 << 32) + var195;
                boolean var201 = false;
                int var202 = 0;
                while (true) {
                    if (var202 >= 100) {
                        if (var197 <= 1 && class536.method3143((byte) 68, var190)) {
                            var201 = true;
                        }
                        break;
                    }
                    if (~class176.field2808[var202] == ~var199) {
                        var201 = true;
                        break;
                    }
                    ++var202;
                }
                if (!var201 && class80.field1210 == 0) {
                    class176.field2808[class462.field6640] = var199;
                    class462.field6640 = (class462.field6640 + 1) % 100;
                    String var203 = class116.field1840.method2157(var198, (byte) -127).method3208(false, class376.field5209);
                    if (var197 == 2) {
                        class244.method1573(0, 20, class311.method1880(var191, -28), "<img=1>" + var189, var198, (byte) -87, var203, "<img=1>" + var190, var189);
                    } else if (var197 == 1) {
                        class244.method1573(0, 20, class311.method1880(var191, -95), "<img=0>" + var189, var198, (byte) -87, var203, "<img=0>" + var190, var189);
                    } else {
                        class244.method1573(0, 20, class311.method1880(var191, -35), var189, var198, (byte) -87, var203, var190, var189);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class297.field4198) {
                int var204 = class376.field5209.method2696(-1605640280);
                int var205 = class376.field5209.method2711(-114);
                int var206 = class376.field5209.method2755((byte) -54);
                if (class448.method2609((byte) -79, var206)) {
                    class199.method1398(var205, var204, 0, (byte) 115);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class22.field300) {
                String var207 = class376.field5209.method2717(true);
                String var208 = class563.method3294(arg0 + 1375731711, class235.method1541(32767, class376.field5209));
                class418.method2478(6, var207, var207, var208, 0, var207, 0);
                class447.field6457 = null;
                return true;
            } else if (class561.field8179 == class447.field6457) {
                class549.method3220(class9.field120, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class184.field2921) {
                class472.field6789 = class376.field5209.method2705(-114);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class311.field4316) {
                int var209 = class376.field5209.method2755((byte) -128);
                if (class448.method2609((byte) -79, var209)) {
                    class25.method242(0);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class265.field3802) {
                int var210 = class376.field5209.method2694((byte) -76);
                int var211 = class376.field5209.method2691((byte) -67);
                int var212 = class376.field5209.method2736(false);
                if (class448.method2609((byte) -79, var212)) {
                    class259 var213 = (class259) class199.field3098.method2818(arg0 ^ -22804, (long) var211);
                    class259 var214 = (class259) class199.field3098.method2818(arg0 ^ -22804, (long) var210);
                    if (var214 != null) {
                        class270.method1705(var213 == null || ~var213.field3716 != ~var214.field3716, -67, var214, false);
                    }
                    if (var213 != null) {
                        var213.method2549((byte) 56);
                        class199.field3098.method2816(var213, (long) var210, false);
                    }
                    class101 var215 = class271.method1711(var211, 23727);
                    if (var215 != null) {
                        class326.method1948(1, var215);
                    }
                    class101 var216 = class271.method1711(var210, 23727);
                    if (var216 != null) {
                        class326.method1948(1, var216);
                        class486.method2843(82, true, var216);
                    }
                    if (class557.field8146 != -1) {
                        class611.method3461(1, class557.field8146, true);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class42.field572) {
                int var217 = class376.field5209.method2755((byte) -86);
                int var218 = class376.field5209.method2705(-38);
                int var219 = class376.field5209.method2705(-89);
                int var220 = class376.field5209.method2755((byte) -79) << 2;
                int var221 = class376.field5209.method2705(-107);
                int var222 = class376.field5209.method2705(-128);
                if (class448.method2609((byte) -79, var217)) {
                    class397.method2415(var221, var220, var218, var222, arg0 + 5276, var219);
                }
                class447.field6457 = null;
                return true;
            } else if (class458.field6584 == class447.field6457) {
                int var223 = class376.field5209.method2711(-127);
                int var224 = class376.field5209.method2690(123);
                class230.field3404.method1429(var223, var224, -98);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class129.field2097) {
                class266.method1688(class99.field1481, class376.field5209, 1);
                class447.field6457 = null;
                return true;
            } else if (class636.field9016 == class447.field6457) {
                int var225 = class376.field5209.method2710((byte) 107);
                int var226 = class376.field5209.method2705(-52);
                int var227 = class376.field5209.method2691((byte) -67);
                class696.field9877[var225] = var227;
                class207.field3193[var225] = var226;
                class243.field3565[var225] = 1;
                int var228 = class412.field5871[var225] - 1;
                for (int var229 = 0; ~var228 < ~var229; ++var229) {
                    if (var227 >= class70.field1097[var229]) {
                        class243.field3565[var225] = var229 - -2;
                    }
                }
                class383.field5615[class248.method1593(class544.field7992++, 31)] = var225;
                class447.field6457 = null;
                return true;
            } else if (class503.field7457 == class447.field6457) {
                String var230 = class376.field5209.method2717(true);
                int var231 = class376.field5209.method2755((byte) -108);
                String var232 = class116.field1840.method2157(var231, (byte) -55).method3208(false, class376.field5209);
                class244.method1573(0, 19, (String) null, var230, var231, (byte) -87, var232, var230, var230);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class440.field6362) {
                class549.method3220(class387.field5672, true);
                class447.field6457 = null;
                return true;
            } else if (class583.field8547 == class447.field6457) {
                String var233 = class376.field5209.method2717(true);
                boolean var234 = class376.field5209.method2705(arg0 + -20) == 1;
                String var235;
                if (!var234) {
                    var235 = var233;
                } else {
                    var235 = class376.field5209.method2717(true);
                }
                int var236 = class376.field5209.method2755((byte) -126);
                byte var237 = class376.field5209.method2712(-63);
                boolean var238 = false;
                if (var237 == -128) {
                    var238 = true;
                }
                if (!var238) {
                    String var239 = class376.field5209.method2717(true);
                    class34 var240 = new class34();
                    var240.field482 = var235;
                    var240.field485 = var233;
                    var240.field479 = class57.method494(var240.field482, (byte) 75);
                    var240.field486 = var239;
                    var240.field481 = var236;
                    var240.field483 = var237;
                    int var241;
                    for (var241 = class320.field4407 + -1; var241 >= 0; --var241) {
                        int var242 = class230.field3409[var241].field479.compareTo(var240.field479);
                        if (var242 == 0) {
                            class230.field3409[var241].field481 = var236;
                            class230.field3409[var241].field483 = var237;
                            class230.field3409[var241].field486 = var239;
                            if (var235.equals(class103.field1708.field3848)) {
                                class466.field6730 = var237;
                            }
                            class447.field6457 = null;
                            class506.field7520 = class330.field4562;
                            return true;
                        }
                        if (~var242 > -1) {
                            break;
                        }
                    }
                    if (~class230.field3409.length >= ~class320.field4407) {
                        class447.field6457 = null;
                        return true;
                    }
                    for (int var243 = class320.field4407 - 1; ~var241 > ~var243; --var243) {
                        class230.field3409[var243 + 1] = class230.field3409[var243];
                    }
                    if (class320.field4407 == 0) {
                        class230.field3409 = new class34[100];
                    }
                    class230.field3409[var241 - -1] = var240;
                    ++class320.field4407;
                    if (var235.equals(class103.field1708.field3848)) {
                        class466.field6730 = var237;
                    }
                } else {
                    if (~class320.field4407 == -1) {
                        class447.field6457 = null;
                        return true;
                    }
                    boolean var244 = false;
                    int var245;
                    for (var245 = 0; ~var245 > ~class320.field4407 && (!class230.field3409[var245].field482.equals(var235) || ~class230.field3409[var245].field481 != ~var236); ++var245) {
                    }
                    if (~class320.field4407 < ~var245) {
                        while (var245 < class320.field4407 + -1) {
                            class230.field3409[var245] = class230.field3409[var245 + 1];
                            ++var245;
                        }
                        --class320.field4407;
                        class230.field3409[class320.field4407] = null;
                    }
                }
                class447.field6457 = null;
                class506.field7520 = class330.field4562;
                return true;
            } else if (class447.field6457 == class136.field2195) {
                int var246 = class376.field5209.method2747((byte) -86);
                int var247 = (var246 & 843846181) >> 28;
                int var248 = var246 >> 14 & 16383;
                int var249 = var246 & 16383;
                int var250 = class376.field5209.method2710((byte) 107);
                int var251 = var250 >> 2;
                int var252 = 3 & var250;
                int var253 = class233.field3452[var251];
                int var254 = class376.field5209.method2736(false);
                int var255 = var248 - class143.field2474;
                int var256 = var249 - class63.field917;
                if (~var254 == -65536) {
                    var254 = -1;
                }
                class293.method1793(var256, var252, (byte) -84, var254, var253, var251, var255, var247);
                class447.field6457 = null;
                return true;
            } else if (class511.field7604 == class447.field6457) {
                boolean var257 = ~class376.field5209.method2705(arg0 + -109) == -2;
                String var258 = class376.field5209.method2717(true);
                String var259 = var258;
                if (var257) {
                    var259 = class376.field5209.method2717(true);
                }
                int var260 = class376.field5209.method2705(-125);
                int var261 = class376.field5209.method2755((byte) -104);
                boolean var262 = false;
                if (var260 <= 1 && class536.method3143((byte) 96, var259)) {
                    var262 = true;
                }
                if (!var262 && class80.field1210 == 0) {
                    String var263 = class116.field1840.method2157(var261, (byte) -112).method3208(false, class376.field5209);
                    if (var260 != 2) {
                        if (var260 != 1) {
                            class244.method1573(0, 25, (String) null, var258, var261, (byte) -87, var263, var259, var258);
                        } else {
                            class244.method1573(0, 25, (String) null, "<img=0>" + var258, var261, (byte) -87, var263, "<img=0>" + var259, var258);
                        }
                    } else {
                        class244.method1573(0, 25, (String) null, "<img=1>" + var258, var261, (byte) -87, var263, "<img=1>" + var259, var258);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class638.field9050 == class447.field6457) {
                class549.method3220(class642.field9124, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class332.field4616) {
                int var264 = class376.field5209.method2755((byte) -55);
                int var265 = class376.field5209.method2691((byte) -67);
                if (class448.method2609((byte) -79, var264)) {
                    class690.method3885(var265, class609.field8749, 0, 5, (byte) 96);
                }
                class447.field6457 = null;
                return true;
            } else if (class679.field9673 == class447.field6457) {
                class219.field3281 = 1;
                class419.field5960 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class259.field3712) {
                int var266 = class376.field5209.method2711(-71);
                int var267 = class376.field5209.method2694((byte) -76);
                int var268 = class376.field5209.method2744(-1);
                int var269 = class376.field5209.method2744(arg0 ^ -2);
                if (class448.method2609((byte) -79, var266)) {
                    class125.method998(var269, arg0 ^ -49, var267, var268);
                }
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class180.field2839) {
                int var270 = class376.field5209.method2755((byte) -72);
                if (var270 == 65535) {
                    var270 = -1;
                }
                int var271 = class376.field5209.method2705(arg0 + -31);
                int var272 = class376.field5209.method2755((byte) -94);
                int var273 = class376.field5209.method2705(-72);
                int var274 = class376.field5209.method2755((byte) -64);
                class542.method3190(var274, var273, var272, true, var271, var270);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class290.field4072) {
                int var275 = class376.field5209.method2755((byte) -43);
                int var276 = class376.field5209.method2694((byte) -76);
                int var277 = class376.field5209.method2706((byte) 97);
                int var278 = class376.field5209.method2755((byte) -49);
                int var279 = class376.field5209.method2711(-72);
                boolean var280 = (128 & var277) != 0;
                if (~(var276 >> 30) == -1) {
                    if (var276 >> 29 != 0) {
                        int var281 = var276 & 65535;
                        class6 var282 = (class6) class314.field4359.method2818(-22803, (long) var281);
                        if (var282 != null) {
                            class88 var283 = var282.field49;
                            if (~var278 == -65536) {
                                var278 = -1;
                            }
                            boolean var284 = true;
                            int var285 = var280 ? var283.field2391 : var283.field2400;
                            if (~var278 != 0 && ~var285 != 0) {
                                if (~var278 != ~var285) {
                                    class81 var286 = class554.field8108.method598(-14624, var278);
                                    class81 var287 = class554.field8108.method598(-14624, var285);
                                    if (var286.field1229 != -1 && ~var287.field1229 != 0) {
                                        class606 var288 = class480.field6871.method1417(arg0 + -3586, var286.field1229);
                                        class606 var289 = class480.field6871.method1417(-3585, var287.field1229);
                                        if (var289.field8716 > var288.field8716) {
                                            var284 = false;
                                        }
                                    }
                                } else {
                                    class81 var290 = class554.field8108.method598(-14624, var278);
                                    if (var290.field1232 && var290.field1229 != -1) {
                                        class606 var291 = class480.field6871.method1417(-3585, var290.field1229);
                                        int var292 = var291.field8710;
                                        if (var292 != 0 && ~var292 != -3) {
                                            if (var292 == 1) {
                                                var284 = true;
                                            }
                                        } else {
                                            var284 = false;
                                        }
                                    }
                                }
                            }
                            if (var284) {
                                if (var280) {
                                    var283.field2442 = 0;
                                    var283.field2391 = var278;
                                    var283.field2420 = 7 & var277;
                                    var283.field2367 = 0;
                                    var283.field2416 = 1;
                                    var283.field2377 = class148.field2508 + var279;
                                    var283.field2390 = var275;
                                    if (~var283.field2377 < ~class148.field2508) {
                                        var283.field2442 = -1;
                                    }
                                    if (var283.field2391 != -1 && ~class148.field2508 == ~var283.field2377) {
                                        int var293 = class554.field8108.method598(-14624, var283.field2391).field1229;
                                        if (~var293 != 0) {
                                            class606 var294 = class480.field6871.method1417(arg0 ^ -3586, var293);
                                            if (var294 != null && var294.field8707 != null && !var283.field2389) {
                                                class150.method1144(0, (byte) 32, var283, var294);
                                            }
                                        }
                                    }
                                } else {
                                    var283.field2388 = 7 & var277;
                                    var283.field2443 = 1;
                                    var283.field2401 = var275;
                                    var283.field2365 = 0;
                                    var283.field2400 = var278;
                                    var283.field2404 = 0;
                                    var283.field2398 = class148.field2508 + var279;
                                    if (var283.field2398 > class148.field2508) {
                                        var283.field2404 = -1;
                                    }
                                    if (var283.field2400 != -1 && ~class148.field2508 == ~var283.field2398) {
                                        int var295 = class554.field8108.method598(-14624, var283.field2400).field1229;
                                        if (~var295 != 0) {
                                            class606 var296 = class480.field6871.method1417(-3585, var295);
                                            if (var296 != null && var296.field8707 != null && !var283.field2389) {
                                                class150.method1144(0, (byte) 115, var283, var296);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var276 >> 28 != 0) {
                        int var297 = 65535 & var276;
                        class270 var298;
                        if (class609.field8749 == var297) {
                            var298 = class103.field1708;
                        } else {
                            var298 = class76.field1186[var297];
                        }
                        if (var298 != null) {
                            if (~var278 == -65536) {
                                var278 = -1;
                            }
                            boolean var299 = true;
                            int var300 = var280 ? var298.field2391 : var298.field2400;
                            if (var278 != -1 && ~var300 != 0) {
                                if (~var278 == ~var300) {
                                    class81 var301 = class554.field8108.method598(arg0 + -14625, var278);
                                    if (var301.field1232 && var301.field1229 != -1) {
                                        class606 var302 = class480.field6871.method1417(arg0 + -3586, var301.field1229);
                                        int var303 = var302.field8710;
                                        if (~var303 != -1 && ~var303 != -3) {
                                            if (var303 == 1) {
                                                var299 = true;
                                            }
                                        } else {
                                            var299 = false;
                                        }
                                    }
                                } else {
                                    class81 var304 = class554.field8108.method598(-14624, var278);
                                    class81 var305 = class554.field8108.method598(-14624, var300);
                                    if (~var304.field1229 != 0 && ~var305.field1229 != 0) {
                                        class606 var306 = class480.field6871.method1417(-3585, var304.field1229);
                                        class606 var307 = class480.field6871.method1417(-3585, var305.field1229);
                                        if (var307.field8716 > var306.field8716) {
                                            var299 = false;
                                        }
                                    }
                                }
                            }
                            if (var299) {
                                if (var280) {
                                    var298.field2377 = class148.field2508 + var279;
                                    var298.field2442 = 0;
                                    var298.field2391 = var278;
                                    var298.field2390 = var275;
                                    var298.field2420 = var277 & 7;
                                    var298.field2367 = 0;
                                    var298.field2416 = 1;
                                    if (~var298.field2377 < ~class148.field2508) {
                                        var298.field2442 = -1;
                                    }
                                    if (var298.field2391 == 65535) {
                                        var298.field2391 = -1;
                                    }
                                    if (var298.field2391 != -1 && ~class148.field2508 == ~var298.field2377) {
                                        int var308 = class554.field8108.method598(-14624, var298.field2391).field1229;
                                        if (var308 != -1) {
                                            class606 var309 = class480.field6871.method1417(-3585, var308);
                                            if (var309 != null && var309.field8707 != null && !var298.field2389) {
                                                class150.method1144(0, (byte) 23, var298, var309);
                                            }
                                        }
                                    }
                                } else {
                                    var298.field2365 = 0;
                                    var298.field2443 = 1;
                                    var298.field2388 = 7 & var277;
                                    var298.field2401 = var275;
                                    var298.field2404 = 0;
                                    var298.field2398 = class148.field2508 + var279;
                                    var298.field2400 = var278;
                                    if (var298.field2398 > class148.field2508) {
                                        var298.field2404 = -1;
                                    }
                                    if (~var298.field2400 == -65536) {
                                        var298.field2400 = -1;
                                    }
                                    if (var298.field2400 != -1 && ~class148.field2508 == ~var298.field2398) {
                                        int var310 = class554.field8108.method598(-14624, var298.field2400).field1229;
                                        if (var310 != -1) {
                                            class606 var311 = class480.field6871.method1417(-3585, var310);
                                            if (var311 != null && var311.field8707 != null && !var298.field2389) {
                                                class150.method1144(0, (byte) 93, var298, var311);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var312 = (var276 & 936115979) >> 28;
                    int var313 = (var276 >> 14 & 16383) + -class143.field2474;
                    int var314 = (16383 & var276) + -class63.field917;
                    if (var313 >= 0 && var314 >= 0 && var313 < class430.field6136 && class580.field8504 > var314) {
                        int var315 = var313 * 512 + 256;
                        int var316 = var314 * 512 + 256;
                        int var317 = var312;
                        if (var312 < 3 && class151.method1151(var314, var313, (byte) -49)) {
                            var317 = var312 + 1;
                        }
                        class202 var318 = new class202(var278, 0, class148.field2508, var312, var317, var315, class603.method3433(var316, var312, var315, -31) - var275, var316, var313, var313, var314, var314, 7 & var277);
                        class396.field5740.method3904(new class582(var318), arg0 ^ 1);
                    }
                }
                class447.field6457 = null;
                return true;
            } else if (class689.field9782 == class447.field6457) {
                int var319 = class376.field5209.method2696(-1605640280);
                int var320 = class376.field5209.method2747((byte) -48);
                class230.field3404.method1431(-1, var320, var319);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class18.field264) {
                class549.method3220(class63.field903, true);
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class255.field3682) {
                int var321 = class376.field5209.method2690(arg0 ^ 108);
                int var322 = class376.field5209.method2711(-94);
                int var323 = class376.field5209.method2737(arg0 + 65535);
                if (class448.method2609((byte) -79, var322)) {
                    class56.method470(var323, -12685, var321);
                }
                class447.field6457 = null;
                return true;
            } else if (class611.field8773 == class447.field6457) {
                class627.field8930 = class376.field5209.method2744(-1);
                class587.field8579 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class447.field6457 == class333.field4639) {
                if (class557.field8146 != -1) {
                    class611.method3461(0, class557.field8146, true);
                }
                class447.field6457 = null;
                return true;
            } else if (class49.field636 == class447.field6457) {
                class72.field1155 = class376.field5209.method2705(arg0 ^ -108);
                class587.field8579 = class330.field4562;
                class447.field6457 = null;
                return true;
            } else if (class667.field9374 == class447.field6457) {
                class352.method2133(32074, class436.field6278);
                class447.field6457 = null;
                return false;
            } else if (class528.field7799 == class447.field6457) {
                int var324 = class376.field5209.method2755((byte) -123);
                class270 var325;
                if (class609.field8749 != var324) {
                    var325 = class76.field1186[var324];
                } else {
                    var325 = class103.field1708;
                }
                if (var325 == null) {
                    class447.field6457 = null;
                    return true;
                } else {
                    int var326 = class376.field5209.method2755((byte) -58);
                    int var327 = class376.field5209.method2705(arg0 + -90);
                    boolean var328 = (32768 & var326) != 0;
                    if (var325.field3848 != null && var325.field3841 != null) {
                        boolean var329 = false;
                        if (~var327 >= -2) {
                            if (!var328 && (class296.field4187 && !class375.field5202 || class289.field4065)) {
                                var329 = true;
                            } else if (class536.method3143((byte) 81, var325.field3848)) {
                                var329 = true;
                            }
                        }
                        if (!var329 && ~class80.field1210 == -1) {
                            int var330 = -1;
                            String var331;
                            if (!var328) {
                                var331 = class563.method3294(1375731712, class235.method1541(32767, class376.field5209));
                            } else {
                                var326 &= 32767;
                                class353 var332 = class369.method2211((byte) -74, class376.field5209);
                                var330 = var332.field4950;
                                var331 = var332.field4953.method3208(false, class376.field5209);
                            }
                            var325.field2350 = var331.trim();
                            var325.field2409 = 150;
                            var325.field2419 = var326 >> 8;
                            var325.field2366 = 255 & var326;
                            int var333;
                            if (var327 != 1 && ~var327 != -3) {
                                var333 = !var328 ? 2 : 17;
                            } else {
                                var333 = var328 ? 17 : 1;
                            }
                            if (~var327 == -3) {
                                class244.method1573(0, var333, (String) null, "<img=1>" + var325.method1698(true, arg0 ^ 9879), var330, (byte) -87, var331, "<img=1>" + var325.method1701(false, arg0 + -2), var325.field3849);
                            } else if (var327 == 1) {
                                class244.method1573(0, var333, (String) null, "<img=0>" + var325.method1698(true, 9878), var330, (byte) -87, var331, "<img=0>" + var325.method1701(false, arg0 ^ -2), var325.field3849);
                            } else {
                                class244.method1573(0, var333, (String) null, var325.method1698(true, 9878), var330, (byte) -87, var331, var325.method1701(false, -1), var325.field3849);
                            }
                        }
                    }
                    class447.field6457 = null;
                    return true;
                }
            } else if (class561.field8176 == class447.field6457) {
                String var334 = class376.field5209.method2717(true);
                int var335 = class376.field5209.method2696(-1605640280);
                int var336 = class376.field5209.method2696(-1605640280);
                if (class448.method2609((byte) -79, var336)) {
                    class270.method1703(arg0 ^ 25749, var335, var334);
                }
                class447.field6457 = null;
                return true;
            } else if (class480.field6867 == class447.field6457) {
                if (class35.field490 != null) {
                    class246.method1584((byte) -101, -1, class525.field7713.field5974, false, -1);
                }
                byte[] var337 = new byte[class99.field1481];
                class376.field5209.method2225(-7088, var337, 0, class99.field1481);
                String var338 = class353.method2137(var337, 0, class99.field1481, 0);
                class105.method884(true, class653.field9220, -1, var338, ~class76.field1182 == -2);
                class447.field6457 = null;
                return true;
            } else {
                if (arg0 != 1) {
                    field4389 = false;
                }
                if (class457.field6563 == class447.field6457) {
                    class549.method3220(class128.field2086, true);
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class106.field1754) {
                    int var339 = class376.field5209.method2736(false);
                    int var340 = class376.field5209.method2755((byte) -56);
                    int var341 = class376.field5209.method2747((byte) -84);
                    if (class448.method2609((byte) -79, var339)) {
                        class256.method1627(var340, 115, var341);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class83.field1263 == class447.field6457) {
                    int var342 = class376.field5209.method2705(arg0 ^ -123);
                    if (~class376.field5209.method2705(-18) == -1) {
                        class490.field7031[var342] = new class576();
                    } else {
                        --class376.field5209.field6710;
                        class490.field7031[var342] = new class576(class376.field5209);
                    }
                    class486.field6941 = class330.field4562;
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class150.field2531) {
                    int var343 = class376.field5209.method2691((byte) -67);
                    int var344 = class376.field5209.method2736(false);
                    int var345 = class376.field5209.method2691((byte) -67);
                    int var346 = class376.field5209.method2696(-1605640280);
                    if (var346 == 65535) {
                        var346 = -1;
                    }
                    int var347 = class376.field5209.method2736(false);
                    if (~var347 == -65536) {
                        var347 = -1;
                    }
                    if (class448.method2609((byte) -79, var344)) {
                        for (int var348 = var347; var346 >= var348; ++var348) {
                            long var349 = ((long) var345 << 32) + (long) var348;
                            class330 var351 = (class330) class511.field7608.method2818(-22803, var349);
                            class330 var352;
                            if (var351 != null) {
                                var352 = new class330(var343, var351.field4567);
                                var351.method2549((byte) -98);
                            } else if (var348 != -1) {
                                var352 = new class330(var343, -1);
                            } else {
                                var352 = new class330(var343, class271.method1711(var345, 23727).field1590.field4567);
                            }
                            class511.field7608.method2816(var352, var349, false);
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class640.field9069 == class447.field6457) {
                    int var353 = class376.field5209.method2755((byte) -89);
                    int[] var354 = new int[4];
                    for (int var355 = 0; var355 < 4; ++var355) {
                        var354[var355] = class376.field5209.method2711(-96);
                    }
                    int var356 = class376.field5209.method2710((byte) 107);
                    class6 var357 = (class6) class314.field4359.method2818(-22803, (long) var353);
                    if (var357 != null) {
                        class458.method2661(var356, var354, var357.field49, -1);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class464.field6651 == class447.field6457) {
                    int var358 = class376.field5209.method2711(-115);
                    int var359 = class376.field5209.method2696(-1605640280);
                    int var360 = class376.field5209.method2711(-72);
                    int var361 = class376.field5209.method2755((byte) -42);
                    int var362 = class376.field5209.method2691((byte) -67);
                    if (class448.method2609((byte) -79, var359)) {
                        class690.method3885(var362, var360 | var358 << 16, var361, 7, (byte) 96);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class565.field8270 == class447.field6457) {
                    while (class376.field5209.field6710 < class99.field1481) {
                        boolean var373 = class376.field5209.method2705(-68) == 1;
                        String var374 = class376.field5209.method2717(true);
                        String var375 = class376.field5209.method2717(true);
                        int var376 = class376.field5209.method2755((byte) -128);
                        int var377 = class376.field5209.method2705(-69);
                        String var378 = "";
                        boolean var379 = false;
                        if (~var376 < -1) {
                            var378 = class376.field5209.method2717(true);
                            var379 = class376.field5209.method2705(-94) == 1;
                        }
                        for (int var380 = 0; ~class520.field7677 < ~var380; ++var380) {
                            if (var373) {
                                if (var375.equals(class437.field6290[var380])) {
                                    class437.field6290[var380] = var374;
                                    class661.field9302[var380] = var375;
                                    var374 = null;
                                    break;
                                }
                            } else if (var374.equals(class437.field6290[var380])) {
                                if (~class311.field4318[var380] != ~var376) {
                                    boolean var381 = true;
                                    for (class499 var382 = (class499) class678.field9654.method3313((byte) 67); var382 != null; var382 = (class499) class678.field9654.method3308(108)) {
                                        if (var382.field7421.equals(var374)) {
                                            if (~var376 != -1 && var382.field7417 == 0) {
                                                var382.method3421(3);
                                                var381 = false;
                                            } else if (var376 == 0 && var382.field7417 != 0) {
                                                var382.method3421(arg0 ^ 2);
                                                var381 = false;
                                            }
                                        }
                                    }
                                    if (var381) {
                                        class678.field9654.method3307(0, new class499(var374, var376));
                                    }
                                    class311.field4318[var380] = var376;
                                }
                                class661.field9302[var380] = var375;
                                class418.field5954[var380] = var378;
                                class351.field4937[var380] = var377;
                                class412.field5874[var380] = var379;
                                var374 = null;
                                break;
                            }
                        }
                        if (var374 != null && ~class520.field7677 > -201) {
                            class437.field6290[class520.field7677] = var374;
                            class661.field9302[class520.field7677] = var375;
                            class311.field4318[class520.field7677] = var376;
                            class418.field5954[class520.field7677] = var378;
                            class351.field4937[class520.field7677] = var377;
                            class412.field5874[class520.field7677] = var379;
                            ++class520.field7677;
                        }
                    }
                    class219.field3281 = 2;
                    class419.field5960 = class330.field4562;
                    boolean var363 = false;
                    int var364 = class520.field7677;
                    while (var364 > 0) {
                        --var364;
                        boolean var365 = true;
                        for (int var366 = 0; ~var366 > ~var364; ++var366) {
                            if (class311.field4318[var366] != class97.field1450.field4294 && ~class311.field4318[var366 - -1] == ~class97.field1450.field4294 || ~class311.field4318[var366] == -1 && ~class311.field4318[var366 - -1] != -1) {
                                int var367 = class311.field4318[var366];
                                class311.field4318[var366] = class311.field4318[var366 + 1];
                                class311.field4318[var366 - -1] = var367;
                                String var368 = class418.field5954[var366];
                                class418.field5954[var366] = class418.field5954[var366 + 1];
                                class418.field5954[var366 + 1] = var368;
                                String var369 = class437.field6290[var366];
                                class437.field6290[var366] = class437.field6290[var366 - -1];
                                class437.field6290[var366 + 1] = var369;
                                String var370 = class661.field9302[var366];
                                class661.field9302[var366] = class661.field9302[var366 - -1];
                                class661.field9302[var366 + 1] = var370;
                                int var371 = class351.field4937[var366];
                                class351.field4937[var366] = class351.field4937[var366 + 1];
                                class351.field4937[var366 - -1] = var371;
                                boolean var372 = class412.field5874[var366];
                                class412.field5874[var366] = class412.field5874[var366 + 1];
                                var365 = false;
                                class412.field5874[var366 + 1] = var372;
                            }
                        }
                        if (var365) {
                            break;
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class127.field2077) {
                    int var383 = class376.field5209.method2755((byte) -67);
                    int var384 = class376.field5209.method2691((byte) -67);
                    if (class448.method2609((byte) -79, var383)) {
                        class259 var385 = (class259) class199.field3098.method2818(-22803, (long) var384);
                        if (var385 != null) {
                            class270.method1705(true, arg0 + -78, var385, false);
                        }
                        if (class223.field3353 != null) {
                            class326.method1948(1, class223.field3353);
                            class223.field3353 = null;
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class511.field7609 == class447.field6457) {
                    int var386 = class376.field5209.method2706((byte) 97);
                    int var387 = class376.field5209.method2736(false);
                    int var388 = class376.field5209.method2755((byte) -127);
                    if (class448.method2609((byte) -79, var388)) {
                        if (var386 == 2) {
                            class277.method1725(11);
                        }
                        class557.field8146 = var387;
                        class130.method1018(var387, -16686);
                        class7.method29(false, 22739);
                        class362.method2167(class557.field8146);
                        for (int var389 = 0; ~var389 > -101; ++var389) {
                            class636.field9030[var389] = true;
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class385.field5640) {
                    boolean var390 = class376.field5209.method2705(-35) == 1;
                    String var391 = class376.field5209.method2717(true);
                    String var392 = var391;
                    if (var390) {
                        var392 = class376.field5209.method2717(true);
                    }
                    int var393 = class376.field5209.method2705(-19);
                    boolean var394 = false;
                    if (var393 <= 1) {
                        if ((!class296.field4187 || class375.field5202) && !class289.field4065) {
                            if (var393 <= 1 && class536.method3143((byte) 68, var392)) {
                                var394 = true;
                            }
                        } else {
                            var394 = true;
                        }
                    }
                    if (!var394 && ~class80.field1210 == -1) {
                        String var395 = class563.method3294(1375731712, class235.method1541(32767, class376.field5209));
                        if (~var393 == -3) {
                            class244.method1573(0, 24, (String) null, "<img=1>" + var391, -1, (byte) -87, var395, "<img=1>" + var392, var391);
                        } else if (~var393 != -2) {
                            class244.method1573(0, 24, (String) null, var391, -1, (byte) -87, var395, var392, var391);
                        } else {
                            class244.method1573(0, 24, (String) null, "<img=0>" + var391, -1, (byte) -87, var395, "<img=0>" + var392, var391);
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class60.field881 == class447.field6457) {
                    class475.field6809 = class376.field5209.method2746((byte) -39) << 3;
                    class334.field4664 = class376.field5209.method2708((byte) -122) << 3;
                    class183.field2900 = class376.field5209.method2706((byte) 97);
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class23.field315) {
                    class447.field6457 = null;
                    return false;
                } else if (class447.field6457 == class409.field5851) {
                    int var396 = class376.field5209.method2690(120);
                    int var397 = class376.field5209.method2711(-66);
                    if (class448.method2609((byte) -79, var397)) {
                        if (~var396 != 0) {
                            int var398 = 16383 & var396 >> 14;
                            int var399 = var398 - class143.field2474;
                            int var400 = 16383 & var396;
                            int var401 = var400 - class63.field917;
                            if (~var399 > -1) {
                                var399 = 0;
                            } else if (~class430.field6136 >= ~var399) {
                                var399 = class430.field6136;
                            }
                            class294.field4104 = (var399 << 9) + 256;
                            if (~var401 > -1) {
                                var401 = 0;
                            } else if (~var401 <= ~class580.field8504) {
                                var401 = class580.field8504;
                            }
                            class76.field1181 = (var401 << 9) - -256;
                        } else {
                            class76.field1181 = -1;
                            class294.field4104 = -1;
                        }
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class102.field1667) {
                    int var402 = class376.field5209.method2696(-1605640280);
                    if (var402 == 65535) {
                        var402 = -1;
                    }
                    int var403 = class376.field5209.method2694((byte) -76);
                    int var404 = class376.field5209.method2755((byte) -120);
                    if (class448.method2609((byte) -79, var404)) {
                        class412.method2460(var403, false, var402);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class493.field7073 == class447.field6457) {
                    int var405 = class376.field5209.method2755((byte) -115);
                    int var406 = class376.field5209.method2705(-105);
                    int var407 = class376.field5209.method2705(-60);
                    int var408 = class376.field5209.method2755((byte) -100) << 2;
                    int var409 = class376.field5209.method2705(-80);
                    int var410 = class376.field5209.method2705(-57);
                    if (class448.method2609((byte) -79, var405)) {
                        class549.method3222(var408, true, var406, 256, var409, var410, var407);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class568.field8310 == class447.field6457) {
                    class63.method521(true);
                    class447.field6457 = null;
                    return false;
                } else if (class447.field6457 == class196.field3065) {
                    class549.method3220(class293.field4085, true);
                    class447.field6457 = null;
                    return true;
                } else if (class692.field9815 == class447.field6457) {
                    class549.method3220(class689.field9777, true);
                    class447.field6457 = null;
                    return true;
                } else if (class486.field6935 == class447.field6457) {
                    int var411 = class376.field5209.method2736(false);
                    String var412 = class376.field5209.method2717(true);
                    int var413 = class376.field5209.method2747((byte) -47);
                    if (class448.method2609((byte) -79, var411)) {
                        class176.method1285(var413, var412, 3);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class597.field8632 == class447.field6457) {
                    int var414 = class376.field5209.method2711(-92);
                    boolean var415 = ~class376.field5209.method2688(arg0 + 127) == -2;
                    if (class448.method2609((byte) -79, var414)) {
                        class140.field2347 = var415;
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class466.field6727 == class447.field6457) {
                    int var416 = class376.field5209.method2696(-1605640280);
                    int var417 = class376.field5209.method2736(false);
                    int var418 = class376.field5209.method2694((byte) -76);
                    if (class448.method2609((byte) -79, var416)) {
                        class42.method340(false, var418, var417);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class243.field3559) {
                    class693.method3910(-122);
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class286.field4035) {
                    int var419 = class376.field5209.method2688(128);
                    int var420 = class376.field5209.method2755((byte) -118);
                    byte var421 = class376.field5209.method2708((byte) -128);
                    if (class448.method2609((byte) -79, var420)) {
                        class143.method1112(var421, 20, var419);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class92.field1353 == class447.field6457) {
                    int var422 = class376.field5209.method2696(-1605640280);
                    int var423 = class376.field5209.method2755((byte) -122);
                    int var424 = class376.field5209.method2710((byte) 107);
                    int var425 = class376.field5209.method2747((byte) -81);
                    if (class448.method2609((byte) -79, var423)) {
                        class259 var426 = (class259) class199.field3098.method2818(-22803, (long) var425);
                        if (var426 != null) {
                            class270.method1705(var426.field3716 != var422, arg0 + 111, var426, false);
                        }
                        class536.method3142(var424, var425, false, var422, -76);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class238.field3508) {
                    int var427 = class376.field5209.method2720(-127);
                    int var428 = class376.field5209.method2691((byte) -67);
                    int var429 = class376.field5209.method2705(-99);
                    String var430 = "";
                    String var431 = var430;
                    if ((1 & var429) != 0) {
                        var430 = class376.field5209.method2717(true);
                        if ((2 & var429) != 0) {
                            var431 = class376.field5209.method2717(true);
                        } else {
                            var431 = var430;
                        }
                    }
                    String var432 = class376.field5209.method2717(true);
                    if (var427 == 99) {
                        class28.method269(32316, var432);
                    } else {
                        if (!var431.equals("") && class536.method3143((byte) 99, var431)) {
                            class447.field6457 = null;
                            return true;
                        }
                        class418.method2478(var427, var431, var430, var432, var428, var430, 0);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class500.field7432 == class447.field6457) {
                    int var433 = class376.field5209.method2755((byte) -119);
                    int var434 = class376.field5209.method2691((byte) -67);
                    int var435 = class376.field5209.method2694((byte) -76);
                    int var436 = class376.field5209.method2696(-1605640280);
                    if (class448.method2609((byte) -79, var436)) {
                        class690.method3885(var435, var433, var434, 5, (byte) 96);
                    }
                    class447.field6457 = null;
                    return true;
                } else if (class479.field6862 == class447.field6457) {
                    class197.method1388(true);
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class373.field5171) {
                    class430.method2520(class653.field9220, class99.field1481, class376.field5209, (byte) 108);
                    class447.field6457 = null;
                    return true;
                } else if (class447.field6457 == class314.field4348) {
                    boolean var437 = ~class376.field5209.method2705(-44) == -2;
                    byte[] var438 = new byte[class99.field1481 + -1];
                    class376.field5209.method2750(var438, -118, class99.field1481 + -1, 0);
                    class695.method3914(var438, 0, var437);
                    class447.field6457 = null;
                    return true;
                } else {
                    class18.method200("T1 - " + (class447.field6457 != null ? class447.field6457.method934(93) : -1) + "," + (class256.field3697 != null ? class256.field3697.method934(93) : -1) + "," + (class127.field2083 != null ? class127.field2083.method934(100) : -1) + " - " + class99.field1481, (Throwable) null, 10296);
                    class352.method2133(arg0 ^ 32075, false);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIF)V")
    public class318(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method1911(int arg0) {
        if (arg0 != 0) {
            method1912(-21, 48, 76, 0.05973079F, 17, -0.06842306F, 24, -23, -56, -95, (float[]) null);
        }
        field4387 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIFIFIIII[F)V")
    public static final void method1912(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        int var11 = arg8 - arg1;
        int var12 = arg0 - arg7;
        int var13 = arg4 - arg9;
        ++field4391;
        float var14 = arg10[2] * (float) var13 + arg10[1] * (float) var11 + arg10[0] * (float) var12;
        float var15 = arg10[5] * (float) var13 + arg10[4] * (float) var11 + arg10[3] * (float) var12;
        if (arg6 == -17668) {
            float var16 = arg10[8] * (float) var13 + arg10[7] * (float) var11 + arg10[6] * (float) var12;
            float var17 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
            if (arg3 != 1.0F) {
                var17 = arg3 * var17;
            }
            float var18 = var15 + 0.5F + arg5;
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    var17 = -var17;
                    var18 = -var18;
                } else if (arg2 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                float var20 = var17;
                var17 = -var18;
                var18 = var20;
            }
            class352.field4942 = var17;
            class656.field9265 = var18;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)V")
    public final void method1770(byte arg0, int arg1, int arg2, int arg3) {
        super.field4064 = arg3;
        int var5 = -109 / ((35 - arg0) / 54);
        ++field4390;
        super.field4066 = arg2;
        super.field4054 = arg1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class60 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lfn;")
    public static class52 field940 = new class52(69, -1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILkm;II)V", line = 4)
    public static final void method441(int arg0, class487 arg1, int arg2, int arg3) {
        field942++;
        if (arg2 >= -64 || arg3 < 0 || arg0 < 0 || class175.field2578 == 0 || class251.field3522 == 0) {
            return;
        }
        arg1.method1079(class306.field4192, class196.field2797, class175.field2578, class251.field3522);
        arg1.method1094(class41.field684, class389.field5485, class175.field2578, class251.field3522);
        class250 var4 = arg1.method1124();
        var4.method1383(class9.field183, class232.field3274, class47.field757, class182.field2649, class109.field1549, class335.field4592);
        arg1.method1071(var4);
        if (class366.field5215 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method1134();
            int var8 = (arg3 - class306.field4192) * var7 / class175.field2578;
            int var9 = (arg0 - class196.field2797) * var7 / class251.field3522;
            int var10 = arg1.method1056();
            int var11 = (arg3 - class306.field4192) * var10 / class175.field2578;
            int var12 = (arg0 - class196.field2797) * var10 / class251.field3522;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1375(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1375(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class200.field2875 && class422.field5811 > var22) {
                    int var23 = class2.field21.field6766;
                    if (var23 < 3 && (class205.field2947[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class366.field5215[var23].method701(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + class2.field21.method206(0) * 64 - 64 >> 7;
                        var6 = var21 - (64 - (class2.field21.method206(0) * 64)) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class184.field2678 && (class416.field5733 & 0x40) != 0) {
                    class363 var24 = class485.method2840(class58.field919, class99.field1406, (byte) 21);
                    if (var24 == null) {
                        class7.method84(36);
                    } else {
                        class225.method1415(false, var5, " ->", var6, 2, 0L, class90.field1346, -1, class238.field3363, 0, true);
                    }
                } else {
                    if (class307.field4208 == class172.field2553) {
                        class225.method1415(false, var5, "", var6, 6, 0L, -1, -1, class66.field981.method695(-118, class487.field6867), 0, true);
                    }
                    class80.field1210++;
                    class225.method1415(false, var5, "", var6, 9, 0L, -1, -1, class449.field6181, 0, true);
                }
            }
        }
        class479 var25 = class123.field1703;
        for (class370 var26 = (class370) var25.method2823(54); var26 != null; var26 = (class370) var25.method2818(0)) {
            if (class2.field21.field6766 == var26.field5238 && var26.method2220(arg0, true, arg1, arg3)) {
                if (var26.field5232 instanceof class23) {
                    class23 var27 = (class23) var26.field5232;
                    int var28 = var27.method206(0);
                    if ((var28 & 0x1) == 0 && (var27.field6765 & 0x7F) == 0 && (var27.field6746 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6765 & 0x7F) == 64 && (var27.field6746 & 0x7F) == 64) {
                        int var29 = var27.field6765 - ((var27.method206(0) - 1) * 64);
                        int var30 = var27.field6746 + 64 - (var27.method206(0) * 64);
                        for (int var31 = 0; var31 < class32.field520; var31++) {
                            class196 var38 = class256.field3581[class42.field718[var31]];
                            if (var38 != null && class356.field4972 != var38.field1120 && var38.field1123) {
                                int var39 = 64 - (var38.field2789.field1786 * 64 - var38.field6765);
                                int var40 = -(var38.field2789.field1786 * 64) - (-var38.field6746 - 64);
                                if (var29 <= var39 && var38.field2789.field1786 <= (var27.method206(0) - (var39 - var29 >> 7)) && var40 >= var30 && var38.field2789.field1786 <= (var27.method206(0) - (var40 - var30 >> 7))) {
                                    class409.method2395(var38, (byte) 92, class2.field21.field6766 != var26.field5238);
                                    var38.field1120 = class356.field4972;
                                }
                            }
                        }
                        int var32 = class163.field2345;
                        int[] var33 = class482.field6800;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class23 var35 = class310.field4235[var33[var34]];
                            if (var35 != null && class356.field4972 != var35.field1120 && var27 != var35 && var35.field1123) {
                                int var36 = var35.field6765 - ((var35.method206(0) - 1) * 64);
                                int var37 = var35.field6746 + (64 - (var35.method206(0) * 64));
                                if (var36 >= var29 && var35.method206(0) <= var27.method206(0) - (var36 - var29 >> 7) && var30 <= var37 && var35.method206(0) <= var27.method206(0) - (var37 - var30 >> 7)) {
                                    class80.method552(class2.field21.field6766 != var26.field5238, (byte) 106, var35);
                                    var35.field1120 = class356.field4972;
                                }
                            }
                        }
                    }
                    if (class356.field4972 == var27.field1120) {
                        continue;
                    }
                    class80.method552(class2.field21.field6766 != var26.field5238, (byte) 106, var27);
                    var27.field1120 = class356.field4972;
                }
                if (var26.field5232 instanceof class196) {
                    class196 var41 = (class196) var26.field5232;
                    if (var41.field2789 != null) {
                        if ((var41.field2789.field1786 & 0x1) == 0 && (var41.field6765 & 0x7F) == 0 && (var41.field6746 & 0x7F) == 0 || (var41.field2789.field1786 & 0x1) == 1 && (var41.field6765 & 0x7F) == 64 && (var41.field6746 & 0x7F) == 64) {
                            int var42 = var41.field6765 - (var41.field2789.field1786 * 64 - 64);
                            int var43 = var41.field6746 - (var41.field2789.field1786 - 1) * 64;
                            for (int var44 = 0; var44 < class32.field520; var44++) {
                                class196 var51 = class256.field3581[class42.field718[var44]];
                                if (var51 != null && class356.field4972 != var51.field1120 && var41 != var51 && var51.field1123) {
                                    int var52 = var51.field6765 + 64 - var51.field2789.field1786 * 64;
                                    int var53 = var51.field6746 + 64 - var51.field2789.field1786 * 64;
                                    if (var52 >= var42 && (var41.field2789.field1786 - (var52 - var42 >> 7)) >= var51.field2789.field1786 && var53 >= var43 && var41.field2789.field1786 - (var53 - var43 >> 7) >= var51.field2789.field1786) {
                                        class409.method2395(var51, (byte) 67, class2.field21.field6766 != var26.field5238);
                                        var51.field1120 = class356.field4972;
                                    }
                                }
                            }
                            int var45 = class163.field2345;
                            int[] var46 = class482.field6800;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class23 var48 = class310.field4235[var46[var47]];
                                if (var48 != null && class356.field4972 != var48.field1120 && var48.field1123) {
                                    int var49 = var48.field6765 + 64 - var48.method206(0) * 64;
                                    int var50 = var48.field6746 + (64 - (var48.method206(0) * 64));
                                    if (var49 >= var42 && var48.method206(0) <= (var41.field2789.field1786 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method206(0) <= var41.field2789.field1786 - (var50 - var43 >> 7)) {
                                        class80.method552(class2.field21.field6766 != var26.field5238, (byte) 106, var48);
                                        var48.field1120 = class356.field4972;
                                    }
                                }
                            }
                        }
                        if (class356.field4972 == var41.field1120) {
                            continue;
                        }
                        class409.method2395(var41, (byte) 53, class2.field21.field6766 != var26.field5238);
                        var41.field1120 = class356.field4972;
                    }
                }
                if (var26.field5232 instanceof class484) {
                    class418 var54 = (class418) class135.field1898.method2614((long) (var26.field5231 | var26.field5238 << 28 | var26.field5239 << 14), -110);
                    if (var54 != null) {
                        for (class155 var55 = (class155) var54.field5749.method1545(-116); var55 != null; var55 = (class155) var54.field5749.method1543(4)) {
                            class164 var56 = class58.field918.method344(var55.field2233, 31757);
                            if (!class184.field2678) {
                                if (class2.field21.field6766 == var26.field5238) {
                                    String[] var58 = var56.field2376;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 4;
                                            }
                                            int var61 = class19.field314;
                                            if (var59 == 1) {
                                                var60 = 51;
                                            }
                                            if (var59 == 2) {
                                                var60 = 30;
                                            }
                                            if (var59 == 3) {
                                                var60 = 58;
                                            }
                                            if (var56.field2367 == var59) {
                                                var61 = var56.field2400;
                                            }
                                            if (var59 == 4) {
                                                var60 = 47;
                                            }
                                            if (var56.field2384 == var59) {
                                                var61 = var56.field2416;
                                            }
                                            class225.method1415(false, var26.field5231, "<col=ff9040>" + var56.field2374, var26.field5239, var60, (long) var55.field2233, var61, -1, var58[var59], 0, true);
                                            class46.field740++;
                                        }
                                    }
                                }
                                class267.field3713++;
                                class225.method1415(class2.field21.field6766 != var26.field5238, var26.field5231, "<col=ff9040>" + var56.field2374, var26.field5239, 1002, (long) var55.field2233, class115.field1628, -1, class407.field5636.method695(-119, class487.field6867), 0, true);
                            } else if (class2.field21.field6766 == var26.field5238) {
                                class307 var57 = class227.field3209 == -1 ? null : class68.field1007.method963(class227.field3209, (byte) -57);
                                if ((class416.field5733 & 0x1) != 0 && (var57 == null || var56.method997(var57.field4199, (byte) -21, class227.field3209) != var57.field4199)) {
                                    class225.method1415(false, var26.field5231, class357.field4981 + " -> <col=ff9040>" + var56.field2374, var26.field5239, 19, (long) var55.field2233, class90.field1346, -1, class238.field3363, 0, true);
                                    class106.field1526++;
                                }
                            }
                        }
                    }
                }
                if (var26.field5232 instanceof class278) {
                    class278 var62 = (class278) var26.field5232;
                    class475 var63 = class304.field4160.method2075(var62.method211(true), false);
                    if (var63.field6690 != null) {
                        var63 = var63.method2797(class320.field4376, -127);
                    }
                    if (var63 != null) {
                        if (!class184.field2678) {
                            if (class2.field21.field6766 == var26.field5238) {
                                String[] var65 = var63.field6672;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            if (var66 == 0) {
                                                var67 = 11;
                                            }
                                            int var68 = class19.field314;
                                            if (var66 == 1) {
                                                var67 = 45;
                                            }
                                            if (var66 == 2) {
                                                var67 = 46;
                                            }
                                            if (var66 == 3) {
                                                var67 = 60;
                                            }
                                            if (var63.field6696 == var66) {
                                                var68 = var63.field6723;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1011;
                                            }
                                            if (var63.field6679 == var66) {
                                                var68 = var63.field6657;
                                            }
                                            class489.field6897++;
                                            class225.method1415(false, var26.field5231, "<col=00ffff>" + var63.field6651, var26.field5239, var67, class20.method178(var62, var26.field5239, var26.field5231, (byte) -54), var68, -1, var65[var66], 0, true);
                                        }
                                    }
                                }
                            }
                            class225.method1415(class2.field21.field6766 != var26.field5238, var26.field5231, "<col=00ffff>" + var63.field6651, var26.field5239, 1007, (long) var63.field6705, class115.field1628, -1, class407.field5636.method695(-117, class487.field6867), 0, true);
                            class32.field513++;
                        } else if (class2.field21.field6766 == var26.field5238) {
                            class307 var64 = class227.field3209 == -1 ? null : class68.field1007.method963(class227.field3209, (byte) -124);
                            if ((class416.field5733 & 0x4) != 0 && (var64 == null || var63.method2789(var64.field4199, class227.field3209, true) != var64.field4199)) {
                                class225.method1415(false, var26.field5231, class357.field4981 + " -> <col=00ffff>" + var63.field6651, var26.field5239, 22, class20.method178(var62, var26.field5239, var26.field5231, (byte) -95), class90.field1346, -1, class238.field3363, 0, true);
                                class326.field4493++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 468)
    public static final void method442(byte arg0) {
        class104 var1 = class152.field2155;
        synchronized (class152.field2155) {
            class152.field2155.method656(94);
        }
        int var2 = 105 % ((arg0 + 65) / 46);
        field935++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 483)
    public static final void method443(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field936++;
        class114 var8 = new class114();
        var8.field1604 = arg0;
        var8.field1611 = arg2;
        var8.field1606 = class356.field4972 + arg1;
        var8.field1610 = arg3;
        var8.field1609 = arg5;
        var8.field1602 = arg7;
        if (arg6 != -1) {
            method442((byte) -7);
        }
        var8.field1607 = arg4;
        class261.field3644.method2817(false, var8);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V", line = 503)
    public static void method444(byte arg0) {
        if (arg0 >= -34) {
            field940 = null;
        }
        field940 = null;
    }
}

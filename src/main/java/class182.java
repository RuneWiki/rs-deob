import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class182 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lqi;")
    private class216 field3123 = new class216();

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lwc;")
    private class53 field3137 = new class53();

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Lbe;")
    private class235 field3140;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lbd;")
    public static class162 field3134 = class17.method142(0, "Okay");

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[F")
    public static float[] field3128 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field3130 = 0;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Lbd;")
    public static class162 field3141 = class17.method142(0, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V", line = 10)
    public static final void method1376(boolean arg0, int arg1) {
        field3132++;
        byte var2;
        byte[][] var3;
        if (class117.field2159 && arg0) {
            var2 = 1;
            var3 = class280.field4730;
        } else {
            var3 = class147.field2654;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class123.field2230[var5] >> 8) * 64 - class178.field3052;
            int var7 = (class123.field2230[var5] & 0xFF) * 64 - class258.field4294;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class58.method401((byte) 62);
                class13.method110(class165.field2928 * 8 - 48, var8, class123.field2238 * 8 - 48, var6, arg0, class267.field4473, (byte) -80, var7);
            }
        }
        for (int var9 = arg1; var9 < var4; var9++) {
            int var10 = (class123.field2230[var9] >> 8) * 64 - class178.field3052;
            byte[] var11 = var3[var9];
            int var12 = (class123.field2230[var9] & 0xFF) * 64 - class258.field4294;
            if (var11 == null && class123.field2238 < 800) {
                class58.method401((byte) 62);
                for (int var13 = 0; var13 < var2; var13++) {
                    class19.method175(9179409, 64, 64, var13, var10, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Ljm;", line = 79)
    public final class151 method1377(int arg0) {
        field3133++;
        if (arg0 > -33) {
            field3134 = (class162) null;
        }
        return this.field3140.method1666((byte) 36);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 90)
    public static final void method1378(int arg0) {
        field3135++;
        if (class86.field1524 == 233) {
            int var1 = class63.field975.method756(915905888);
            int var2 = (var1 >> 4 & 0x7) + class259.field4306;
            int var3 = class45.field722 + (var1 & 0x7);
            int var4 = class63.field975.method761((byte) 108);
            int var5 = class63.field975.method761((byte) 108);
            int var6 = class63.field975.method761((byte) 108);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class18 var7 = class212.field3557[class157.field2765][var2][var3];
                if (var7 != null) {
                    for (class40 var8 = (class40) var7.method169(-120); var8 != null; var8 = (class40) var7.method165((byte) -101)) {
                        class57 var9 = var8.field653;
                        if ((var4 & 0x7FFF) == var9.field892 && var9.field891 == var5) {
                            var9.field891 = var6;
                            break;
                        }
                    }
                    class134.method1059(arg0 + 2740, var3, var2);
                }
            }
        } else if (class86.field1524 == 130) {
            int var131 = class63.field975.method734(2);
            int var132 = class63.field975.method707(2);
            int var133 = ((var132 & 0x7F) >> 4) + class259.field4306;
            int var134 = (var132 & 0x7) + class45.field722;
            if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                class18 var135 = class212.field3557[class157.field2765][var133][var134];
                if (var135 != null) {
                    for (class40 var136 = (class40) var135.method169(arg0 + 37); var136 != null; var136 = (class40) var135.method165((byte) -101)) {
                        if ((var131 & 0x7FFF) == var136.field653.field892) {
                            var136.method1183(false);
                            break;
                        }
                    }
                    if (var135.method169(-119) == null) {
                        class212.field3557[class157.field2765][var133][var134] = null;
                    }
                    class134.method1059(2747, var134, var133);
                }
            }
        } else if (class86.field1524 == 170) {
            int var123 = class63.field975.method715(250);
            if (var123 == 65535) {
                var123 = -1;
            }
            int var124 = class63.field975.method756(915905888);
            int var125 = var124 >> 2;
            int var126 = var124 & 0x3;
            int var127 = class84.field1511[var125];
            int var128 = class63.field975.method735((byte) -114);
            int var129 = (var128 >> 4 & 0x7) + class259.field4306;
            int var130 = class45.field722 + (var128 & 0x7);
            class224.method1622(var129, var123, class157.field2765, var127, var125, var126, 2, var130);
        } else if (class86.field1524 == 223) {
            int var10 = class63.field975.method714((byte) 34);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = class84.field1511[var12];
            int var14 = class63.field975.method711(255);
            int var15 = class63.field975.method714((byte) 34);
            int var16 = (var15 & 0x7) + class45.field722;
            int var17 = ((var15 & 0x78) >> 4) + class259.field4306;
            if (var17 >= 0 && var16 >= 0 && var17 < 104 && var16 < 104) {
                class22.method183(var13, 0, var12, var17, var16, 9581, -1, var14, var11, class157.field2765);
            }
        } else if (class86.field1524 == 186) {
            int var105 = class63.field975.method756(915905888);
            int var106 = ((var105 & 0xF9) >> 4) + class259.field4306 * 2;
            int var107 = (var105 & 0xF) + class45.field722 * 2;
            int var108 = var106 + class63.field975.method719((byte) -42);
            int var109 = class63.field975.method719((byte) -42) + var107;
            int var110 = class63.field975.method750((byte) -24);
            int var111 = class63.field975.method761((byte) 108);
            int var112 = class63.field975.method756(arg0 ^ 0x36979D67) * 4;
            int var113 = class63.field975.method756(arg0 + 915905881) * 4;
            int var114 = class63.field975.method761((byte) 108);
            int var115 = class63.field975.method761((byte) 108);
            int var116 = class63.field975.method756(arg0 + 915905881);
            int var117 = class63.field975.method756(915905888);
            if (var106 >= 0 && var107 >= 0 && var106 < 208 && var107 < 208 && var108 >= 0 && var109 >= 0 && var108 < 208 && var109 < 208 && var111 != 65535) {
                int var118 = var107 * 64;
                int var119 = var108 * 64;
                int var120 = var106 * 64;
                int var121 = var109 * 64;
                class110 var122 = new class110(var111, class157.field2765, var120, var118, class3.method15(var120, class157.field2765, var118, false) - var112, class90.field1598 + var114, class90.field1598 + var115, var116, var117, var110, var113);
                var122.method892(class90.field1598 + var114, var121, var119, (byte) 127, class3.method15(var119, class157.field2765, var121, false) - var113);
                class291.field4899.method167(false, new class148(var122));
            }
        } else if (class86.field1524 == 109) {
            int var96 = class63.field975.method756(915905888);
            int var97 = ((var96 & 0x75) >> 4) + class259.field4306;
            int var98 = (var96 & 0x7) + class45.field722;
            int var99 = class63.field975.method761((byte) 108);
            if (var99 == 65535) {
                var99 = -1;
            }
            int var100 = class63.field975.method756(915905888);
            int var101 = var100 >> 4 & 0xF;
            int var102 = var100 & 0x7;
            int var103 = class63.field975.method756(arg0 + 915905881);
            if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                int var104 = var101 + 1;
                if (var97 - var104 <= class122.field2215.field5050[0] && var97 + var104 >= class122.field2215.field5050[0] && var98 - var104 <= class122.field2215.field5034[0] && class122.field2215.field5034[0] <= (var98 + var104) && class256.field4256 != 0 && var102 > 0 && class255.field4233 < 50 && var99 != -1) {
                    class270.field4518[class255.field4233] = var99;
                    class29.field495[class255.field4233] = var102;
                    class237.field3948[class255.field4233] = var103;
                    class194.field3270[class255.field4233] = null;
                    class30.field504[class255.field4233] = (var97 << 16) + (var98 << 8) + var101;
                    class255.field4233++;
                }
            }
        } else if (class86.field1524 == 135) {
            int var18 = class63.field975.method707(2);
            int var19 = class45.field722 + (var18 & 0x7);
            int var20 = ((var18 & 0x7D) >> 4) + class259.field4306;
            int var21 = class63.field975.method761((byte) 108);
            int var22 = class63.field975.method715(arg0 + 243);
            int var23 = class63.field975.method715(250);
            if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104 && class263.field4390 != var21) {
                class57 var24 = new class57();
                var24.field891 = var23;
                var24.field892 = var22;
                if (class212.field3557[class157.field2765][var20][var19] == null) {
                    class212.field3557[class157.field2765][var20][var19] = new class18();
                }
                class212.field3557[class157.field2765][var20][var19].method167(false, new class40(var24));
                class134.method1059(2747, var19, var20);
            }
        } else if (class86.field1524 == 33) {
            int var25 = class63.field975.method756(915905888);
            int var26 = class259.field4306 + ((var25 & 0x79) >> 4);
            int var27 = class45.field722 + (var25 & 0x7);
            int var28 = class63.field975.method719((byte) -42) + var26;
            int var29 = var27 + class63.field975.method719((byte) -42);
            int var30 = class63.field975.method750((byte) -24);
            int var31 = class63.field975.method761((byte) 108);
            int var32 = class63.field975.method756(915905888) * 4;
            int var33 = class63.field975.method756(915905888) * 4;
            int var34 = class63.field975.method761((byte) 108);
            int var35 = class63.field975.method761((byte) 108);
            int var36 = class63.field975.method756(915905888);
            int var37 = class63.field975.method756(915905888);
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var31 != 65535) {
                int var38 = var28 * 128 + 64;
                int var39 = var26 * 128 + 64;
                int var40 = var29 * 128 + 64;
                int var41 = var27 * 128 + 64;
                class110 var42 = new class110(var31, class157.field2765, var39, var41, class3.method15(var39, class157.field2765, var41, false) - var32, var34 - -class90.field1598, var35 + class90.field1598, var36, var37, var30, var33);
                var42.method892(class90.field1598 + var34, var40, var38, (byte) 127, class3.method15(var38, class157.field2765, var40, false) - var33);
                class291.field4899.method167(false, new class148(var42));
            }
        } else if (class86.field1524 == 239) {
            int var90 = class63.field975.method715(250);
            int var91 = class63.field975.method761((byte) 108);
            int var92 = class63.field975.method714((byte) 34);
            int var93 = (var92 & 0x7) + class45.field722;
            int var94 = ((var92 & 0x7A) >> 4) + class259.field4306;
            if (var94 >= 0 && var93 >= 0 && var94 < 104 && var93 < 104) {
                class57 var95 = new class57();
                var95.field891 = var91;
                var95.field892 = var90;
                if (class212.field3557[class157.field2765][var94][var93] == null) {
                    class212.field3557[class157.field2765][var94][var93] = new class18();
                }
                class212.field3557[class157.field2765][var94][var93].method167(false, new class40(var95));
                class134.method1059(2747, var93, var94);
            }
        } else if (class86.field1524 == 18) {
            int var83 = class63.field975.method714((byte) 34);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = class84.field1511[var84];
            int var87 = class63.field975.method714((byte) 34);
            int var88 = class259.field4306 + (var87 >> 4 & 0x7);
            int var89 = (var87 & 0x7) + class45.field722;
            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                class22.method183(var86, 0, var84, var88, var89, 9581, -1, -1, var85, class157.field2765);
            }
        } else if (class86.field1524 == 243) {
            int var43 = class63.field975.method756(arg0 + 915905881);
            int var44 = ((var43 & 0x7E) >> 4) + class259.field4306;
            int var45 = (var43 & 0x7) + class45.field722;
            int var46 = class63.field975.method761((byte) 108);
            int var47 = class63.field975.method756(915905888);
            int var48 = class63.field975.method761((byte) 108);
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                int var49 = var45 * 128 + 64;
                int var50 = var44 * 128 + 64;
                class8 var51 = new class8(var46, class157.field2765, var50, var49, class3.method15(var50, class157.field2765, var49, false) - var47, var48, class90.field1598);
                class220.field3670.method167(false, new class98(var51));
            }
        } else {
            if (class86.field1524 == 175) {
                int var52 = class63.field975.method715(250);
                int var53 = class63.field975.method711(255);
                int var54 = class63.field975.method711(arg0 + 248);
                byte var55 = class63.field975.method741(0);
                int var56 = class63.field975.method756(915905888);
                int var57 = ((var56 & 0x71) >> 4) + class259.field4306;
                int var58 = (var56 & 0x7) + class45.field722;
                byte var59 = class63.field975.method719((byte) -42);
                int var60 = class63.field975.method734(2);
                byte var61 = class63.field975.method719((byte) -42);
                int var62 = class63.field975.method714((byte) 34);
                int var63 = var62 & 0x3;
                int var64 = var62 >> 2;
                int var65 = class84.field1511[var64];
                byte var66 = class63.field975.method741(arg0 ^ 0x7);
                class39 var67;
                if (class263.field4390 == var60) {
                    var67 = class122.field2215;
                } else {
                    var67 = class270.field4520[var60];
                }
                if (!class117.field2159 && var67 != null) {
                    class311 var68 = class229.method1637(var52, (byte) 93);
                    int var69;
                    int var70;
                    if (var63 == 1 || var63 == 3) {
                        var69 = var68.field5217;
                        var70 = var68.field5201;
                    } else {
                        var69 = var68.field5201;
                        var70 = var68.field5217;
                    }
                    int var71 = (var69 + 1 >> 1) + var57;
                    int var72 = (var69 >> 1) + var57;
                    int var73 = var58 + (var70 >> 1);
                    int var74 = (var70 + 1 >> 1) + var58;
                    int[][] var75 = class206.field3473[class157.field2765];
                    int[][] var76 = (int[][]) null;
                    int var77 = (var57 << 7) + (var69 << 6);
                    if (class157.field2765 < 3) {
                        var76 = class206.field3473[class157.field2765 + 1];
                    }
                    int var78 = var75[var71][var73] + var75[var72][var74] + var75[var71][var74] + var75[var72][var73] >> 2;
                    int var79 = (var58 << 7) + (var70 << 6);
                    class128 var80 = var68.method2100(false, var78, var64, var76, -1, var63, var75, var79, var68.field5242, var77, (class99) null);
                    if (var80 != null) {
                        if (var61 > var59) {
                            byte var81 = var61;
                            var61 = var59;
                            var59 = var81;
                        }
                        if (var55 > var66) {
                            byte var82 = var55;
                            var55 = var66;
                            var66 = var82;
                        }
                        class22.method183(var65, var54 + 1, 0, var57, var58, 9581, var53 + 1, -1, 0, class157.field2765);
                        var67.field641 = var58 + var66;
                        var67.field605 = var57 + var59;
                        var67.field603 = var55 + var58;
                        var67.field610 = var58 * 128 + var70 * 64;
                        var67.field608 = var57 + var61;
                        var67.field628 = class90.field1598 + var54;
                        var67.field635 = class90.field1598 + var53;
                        var67.field623 = var78;
                        var67.field625 = (class176) var80.field2327;
                        var67.field632 = var57 * 128 + var69 * 64;
                    }
                }
            }
            if (arg0 != 7) {
                field3130 = -83;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 642)
    public static final void method1379(int arg0, int arg1) {
        int var2 = -115 % ((arg0 - 65) / 56);
        field3131++;
        class101 var3 = (class101) class40.field651.method1672((long) arg1, 19760);
        if (var3 != null) {
            var3.method1183(false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 658)
    public static void method1380(int arg0) {
        field3128 = null;
        field3134 = null;
        if (arg0 == 7) {
            field3141 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JI)Lbd;", line = 681)
    public static final class162 method1381(long arg0, int arg1) {
        class15.field234.setTime(new Date(arg0));
        field3136++;
        int var3 = class15.field234.get(7);
        int var4 = class15.field234.get(5);
        int var5 = class15.field234.get(2);
        int var6 = class15.field234.get(1);
        if (arg1 != -22637) {
            field3141 = (class162) null;
        }
        int var7 = class15.field234.get(11);
        int var8 = class15.field234.get(12);
        int var9 = class15.field234.get(13);
        return class135.method1062(new class162[] { class94.field1717[var3 - 1], class23.field397, class156.method1212(10, var4 / 10), class156.method1212(10, var4 % 10), class187.field3231, class144.field2635[var5], class187.field3231, class156.method1212(10, var6), class135.field2407, class156.method1212(10, var7 / 10), class156.method1212(10, var7 % 10), class106.field1933, class156.method1212(10, var8 / 10), class156.method1212(10, var8 % 10), class106.field1933, class156.method1212(10, var9 / 10), class156.method1212(10, var9 % 10), class171.field2968 }, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BJ)Lqi;", line = 712)
    public final class216 method1382(byte arg0, long arg1) {
        field3126++;
        class216 var4 = (class216) this.field3140.method1672(arg1, 19760);
        if (arg0 > -70) {
            field3141 = (class162) null;
        }
        if (var4 != null) {
            this.field3137.method379(var4, 255);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)Ljm;", line = 734)
    public final class151 method1383(int arg0) {
        field3127++;
        int var2 = -75 / ((-arg0 - 18) / 37);
        return this.field3140.method1673((byte) -124);
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 754)
    public final void method1384(int arg0) {
        this.field3137.method378(-55);
        field3125++;
        this.field3140.method1667(arg0 ^ 0x297F);
        this.field3123 = new class216();
        if (arg0 != -10506) {
            field3142 = 15;
        }
        this.field3138 = this.field3139;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V", line = 770)
    public static final void method1385(byte arg0, int arg1) {
        field3124++;
        class63 var2 = class46.method332(10, arg1, -12770);
        var2.method427(-22507);
        if (arg0 != -51) {
            field3142 = 16;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lqi;IJ)V", line = 782)
    public final void method1386(class216 arg0, int arg1, long arg2) {
        field3129++;
        if (this.field3138 == 0) {
            class216 var5 = this.field3137.method374(1348);
            var5.method1183(false);
            var5.method1573(-9728);
            if (this.field3123 == var5) {
                class216 var6 = this.field3137.method374(1348);
                var6.method1183(false);
                var6.method1573(-9728);
            }
        } else {
            this.field3138--;
        }
        this.field3140.method1674(arg0, false, arg2);
        this.field3137.method379(arg0, 255);
        if (arg1 >= -58) {
            method1376(false, -115);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V", line = 836)
    public class182(int arg0) {
        this.field3139 = arg0;
        this.field3138 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3140 = new class235(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class89 {

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public int field1359 = 128;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public int field1362 = 128;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lpw;")
    public final class89 method498(byte arg0) {
        field1366++;
        if (arg0 != -24) {
            this.field1364 = -104;
        }
        return new class89(this.field1364, this.field1359, this.field1362, this.field1361, this.field1356, this.field1367);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLpw;)V")
    public final void method499(byte arg0, class89 arg1) {
        this.field1367 = arg1.field1367;
        this.field1356 = arg1.field1356;
        this.field1359 = arg1.field1359;
        field1355++;
        if (arg0 < 83) {
            method500(-46, -48, (byte) -118, -8, 59, false);
        }
        this.field1361 = arg1.field1361;
        this.field1364 = arg1.field1364;
        this.field1362 = arg1.field1362;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBIIZ)V")
    public static final void method500(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field1360++;
        if (class603.field8695 == null) {
            class332.field4821.method710(arg4, 22339, -16777216, arg0, arg1, arg3);
        } else if (class321.field4681.field7895 >= 0 && (class72.field1144 * 512) > class321.field4681.field7895 && class321.field4681.field7896 >= 0 && class321.field4681.field7896 < class668.field9444 * 512) {
            class229.field3041++;
            if (class321.field4681 != null && (class321.field4681.field7895 - (class321.field4681.method422((byte) 113) - 1) * 256 >> 9) == class373.field5521 && class321.field4681.field7896 - (class321.field4681.method422((byte) -75) - 1) * 256 >> 9 == class338.field4907) {
                class338.field4907 = -1;
                class373.field5521 = -1;
                class222.method1390(false);
            }
            class235.method1447(arg2 ^ 0x54);
            if (!arg5) {
                class576.method3319(512);
            }
            class699.method3923(true);
            class208.method1330(arg1, true, arg3, arg0, arg4, false);
            int var6 = class122.field1816;
            int var7 = class496.field7021;
            int var8 = class643.field9225;
            int var9 = class85.field1331;
            if (class684.field9659 == 1) {
                int var12 = (int) class528.field7602;
                if (var12 < (class265.field3474 >> 8)) {
                    var12 = class265.field3474 >> 8;
                }
                if (class215.field2883[4] && var12 < class412.field6119[4] + 128) {
                    var12 = class412.field6119[4] + 128;
                }
                int var13 = (int) class311.field4589 + class91.field1395 & 0x3FFF;
                class301.method1894(((var12 >> 3) * 3) + 600 << 2, class502.field7101, class677.field9587, var9, false, var13, var12, class504.method2870((byte) -123, class321.field4681.field7896, class321.field4681.field7895, class49.field779) - 200);
            } else if (class684.field9659 == 4) {
                int var10 = (int) class528.field7602;
                if (class265.field3474 >> 8 > var10) {
                    var10 = class265.field3474 >> 8;
                }
                if (class215.field2883[4] && var10 < class412.field6119[4] + 128) {
                    var10 = class412.field6119[4] + 128;
                }
                int var11 = (int) class311.field4589 & 0x3FFF;
                class301.method1894(((var10 >> 3) * 3) + 600 << 2, class502.field7101, class677.field9587, var9, false, var11, var10, class504.method2870((byte) -125, class35.field550, class475.field6814, class49.field779) - 200);
            } else if (class684.field9659 == 5) {
                class258.method1542(var9, -86);
            }
            int var14 = class306.field4529;
            int var15 = class533.field7839;
            int var16 = class603.field8702;
            int var17 = class246.field3255;
            int var18 = class481.field6886;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class215.field2883[var19]) {
                    int var22 = (int) ((double) (-class564.field8246[var19]) + (double) (class564.field8246[var19] * 2 + 1) * Math.random() + Math.sin((double) class684.field9660[var19] / 100.0D * (double) class264.field3453[var19]) * (double) class412.field6119[var19]);
                    if (var19 == 0) {
                        class306.field4529 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class246.field3255 += var22;
                        if (class246.field3255 < 1024) {
                            class246.field3255 = 1024;
                        } else if (class246.field3255 > 3072) {
                            class246.field3255 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class603.field8702 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class533.field7839 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class481.field6886 = class481.field6886 + var22 & 0x3FFF;
                    }
                }
            }
            if (class306.field4529 < 0) {
                class306.field4529 = 0;
            }
            if (class306.field4529 > ((class91.field1390 << 9) - 1)) {
                class306.field4529 = (class91.field1390 << 9) - 1;
            }
            if (class603.field8702 < 0) {
                class603.field8702 = 0;
            }
            if (((class575.field8372 << 9) - 1) < class603.field8702) {
                class603.field8702 = (class575.field8372 << 9) - 1;
            }
            class687.method3845(-3);
            class351.method2180(arg2 ^ 0xFFFFBD27);
            class332.field4821.method652(var7, var8, var6 + var7, var8 + var9);
            class332.field4821.method638();
            int var20 = class45.field684;
            if (class383.field5750 == null) {
                class332.field4821.method646(var20);
            } else {
                class383.field5750.method1978(class500.field7077 << 3, var7, class481.field6886, var6, var9, var20, class332.field4821, var8, class246.field3255, 8414);
            }
            class413.method2520(false);
            class242.field3215.method878(class306.field4529, class533.field7839, class603.field8702, -class246.field3255 & 0x3FFF, -class481.field6886 & 0x3FFF, -class276.field3597 & 0x3FFF);
            class332.field4821.method616(class242.field3215);
            class332.field4821.method667(var7 + (var6 / 2), var9 / 2 + var8, class395.field5975 << 1, class395.field5975 << 1);
            class697.method3917((byte) 102, var9 / 2 + var8, class395.field5975 << 1, class395.field5975 << 1, var6 / 2 + var7);
            if (arg2 != 87) {
                field1357 = -58;
            }
            class49.method293(-class246.field3255 & 0x3FFF, -class276.field3597 & 0x3FFF, class533.field7839, -class481.field6886 & 0x3FFF, 78, class603.field8702, class306.field4529);
            byte var21 = class335.field4872.method3427(class62.field996, arg2 ^ 0xFFFFFFAA) == 2 ? (byte) class229.field3041 : 1;
            class345.method2144(class45.field685, class306.field4529, class533.field7839, class603.field8702, class603.field8703, class426.field6229, class444.field6452, class232.field3068, class657.field9381, class433.field6282, class321.field4681.field7905 + 1, var21, class321.field4681.field7895 >> 9, class321.field4681.field7896 >> 9, !class335.field4872.field9467, true);
            class413.method2520(false);
            if (class264.field3451 == 10) {
                class620.method3566(256, 256, var7, var9, arg2 ^ 0x56, var8, var6);
                class78.method455(true, var7, 256, 256, var8, var9, var6);
                class397.method2467((byte) 103, var9, 256, var8, var6, 256, var7);
                class379.method2341(var9, var7, var6, -124, var8);
            }
            class134.method950();
            class603.field8702 = var16;
            class481.field6886 = var18;
            class246.field3255 = var17;
            class306.field4529 = var14;
            class533.field7839 = var15;
            if (class489.field6944 && class212.field2856.method2845((byte) -11) == 0) {
                class489.field6944 = false;
            }
            if (class489.field6944) {
                class332.field4821.method710(var8, 22339, -16777216, var6, var7, var9);
                class453.method2656(0, class244.field3236, class279.field3637.method1654(-121, class262.field3401), class332.field4821, false, class624.field9024);
            }
        } else {
            class332.field4821.method710(arg4, 22339, -16777216, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field1364 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIIII)V")
    private class89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1362 = arg2;
        this.field1359 = arg1;
        this.field1367 = arg5;
        this.field1364 = arg0;
        this.field1361 = arg3;
        this.field1356 = arg4;
    }
}

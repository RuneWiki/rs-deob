import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class652 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    private int field9183;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Lkn;")
    private class770 field9185;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public int field9190;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field9186;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lgo;")
    public static class652 field9189 = new class652(0, 3, class770.field10618);

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lgo;")
    public static class652 field9191 = new class652(1, 3, class770.field10618);

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lgo;")
    public static class652 field9192 = new class652(2, 4, class770.field10614);

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Lgo;")
    public static class652 field9193 = new class652(3, 1, class770.field10618);

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Lgo;")
    public static class652 field9194 = new class652(4, 2, class770.field10618);

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lgo;")
    public static class652 field9195 = new class652(5, 3, class770.field10618);

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Lgo;")
    public static class652 field9196 = new class652(6, 4, class770.field10618);

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field9197 = class305.method2009(16, (byte) 63);

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Lke;")
    public static class622 field9198 = new class622(69, 2);

    @OriginalMember(owner = "client!go", name = "s", descriptor = "Lofa;")
    public static class345 field9200 = new class345(1);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9182++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Lot;")
    public static final class614 method3735(boolean arg0) {
        if (!arg0) {
            field9199 = 126;
        }
        field9187++;
        return class436.field6206;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method3736(int arg0) {
        field9196 = null;
        field9192 = null;
        field9198 = null;
        if (arg0 != -16478) {
            method3737(-102, 0);
        }
        field9195 = null;
        field9193 = null;
        field9200 = null;
        field9189 = null;
        field9191 = null;
        field9194 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Lgo;")
    public static final class652 method3737(int arg0, int arg1) {
        int var2 = -68 / ((arg1 - 17) / 40);
        field9184++;
        if (arg0 == 0) {
            return field9189;
        } else if (arg0 == 1) {
            return field9191;
        } else if (arg0 == 2) {
            return field9192;
        } else if (arg0 == 3) {
            return field9193;
        } else if (arg0 == 4) {
            return field9194;
        } else if (arg0 == 5) {
            return field9195;
        } else if (arg0 == 6) {
            return field9196;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IILkn;)V")
    private class652(int arg0, int arg1, class770 arg2) {
        this.field9183 = arg1;
        this.field9185 = arg2;
        this.field9190 = arg0;
        this.field9186 = this.field9185.field10608 * this.field9183;
        if (this.field9190 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILha;IB)V")
    public static final void method3738(int arg0, class66 arg1, int arg2, byte arg3) {
        field9188++;
        if (arg0 < 0 || arg2 < 0 || class684.field9715 == 0 || class490.field6969 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class378 var8;
        int var9;
        int var10;
        if (class607.field8578) {
            class561.method3259(114, false);
            var8 = arg1.method493();
            int[] var11 = arg1.method469();
            var7 = var11[2];
            var4 = var11[0];
            var6 = var11[1];
            var5 = var11[3];
            var10 = arg0 + class553.method3221(false, 107);
            var9 = class275.method1778(0, false) + arg2;
        } else {
            arg1.method409(class438.field6266, class569.field8060, class684.field9715, class490.field6969);
            var4 = class438.field6266;
            var5 = class490.field6969;
            var6 = class569.field8060;
            var7 = class684.field9715;
            arg1.method455(class472.field6737, class258.field3632, class684.field9715, class490.field6969);
            var8 = arg1.method462();
            var8.method1938(class115.field1450, class786.field10811, class435.field6183, class73.field976, class539.field7576, class205.field3020);
            var9 = arg2;
            arg1.method445(var8);
            var10 = arg0;
        }
        class291.method1970(true, -106);
        if (arg3 <= 41) {
            return;
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var5 == 0) {
            var5 = 1;
        }
        if (class750.field10395 != null && (!class26.field382 || (class641.field9043 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg1.method460();
            int var15 = arg1.method425();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class475.field6760) {
                var17 = var16 = (var10 - var4) * class412.field5822 / var7;
                var19 = var18 = (var9 - var6) * class412.field5822 / var5;
            } else {
                var19 = (var9 - var6) * var14 / var5;
                var17 = (var10 - var4) * var14 / var7;
                var16 = (var10 - var4) * var15 / var7;
                var18 = (var9 - var6) * var15 / var5;
            }
            int[] var20 = new int[] { var17, var19, var14 };
            int[] var21 = new int[] { var16, var18, var15 };
            var8.method1962(var20);
            var8.method1962(var21);
            float var22 = class472.method2788((float) var21[2], 4, (float) var20[2], (float) var20[0], -73, (float) var20[1], (float) var21[1], (float) var21[0]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class251.field3549.method2692((byte) -124) - 1 << 8) >> 9;
                var13 = var26 + (class251.field3549.method2692((byte) -128) - 1 << 8) >> 9;
                byte var27 = class251.field3549.field7710;
                if (var27 < 3 && (class617.field8700[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class26.field382 && (class641.field9043 & 0x40) != 0) {
                    class176 var28 = class333.method2152(false, class76.field1018, class483.field6863);
                    if (var28 == null) {
                        class272.method1770(-1);
                    } else {
                        class502.method2933(12, " ->", true, -1, 6947, class361.field5239, class75.field1013, (long) (var12 << 0 | var13), false, true, var12, var13, 0L);
                    }
                } else {
                    if (class372.field5368) {
                        class502.method2933(44, "", true, -1, 6947, class674.field9578.method3825((byte) -10, class526.field7494), -1, (long) (var13 | var12 << 0), false, true, var12, var13, 0L);
                    }
                    class502.method2933(18, "", true, -1, 6947, class190.field2841, class402.field5697, (long) (var13 | var12 << 0), false, true, var12, var13, 0L);
                    class123.field1605++;
                }
            }
        }
        if (class607.field8578) {
            class21.method163((byte) -128);
        }
        for (int var29 = 0; var29 < (class607.field8578 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class650 var31 = var30 ? class619.field8726 : class369.field5300;
            int var32 = arg0;
            int var33 = arg2;
            if (class607.field8578) {
                class561.method3259(123, var30);
                var32 = arg0 + class553.method3221(var30, 123);
                var33 = arg2 + class275.method1778(0, var30);
            }
            class310 var34 = var31.field9153;
            for (class167 var35 = (class167) var34.method2033(0); var35 != null; var35 = (class167) var34.method2025((byte) -88)) {
                if ((class467.field6638 || class251.field3549.field7710 == var35.field2428.field7710) && var35.method1292(-2139972631, var32, var33, arg1)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field2428 instanceof class778)) {
                        var39 = ((class778) var35.field2428).field10733;
                        var38 = ((class778) var35.field2428).field10730;
                    } else {
                        var38 = var35.field2428.field7719 >> 9;
                        var39 = var35.field2428.field7718 >> 9;
                    }
                    if (var35.field2428 instanceof class559) {
                        class559 var40 = (class559) var35.field2428;
                        int var41 = var40.method2692((byte) -126);
                        if ((var41 & 0x1) == 0 && (var40.field7718 & 0x1FF) == 0 && (var40.field7719 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field7718 & 0x1FF) == 256 && (var40.field7719 & 0x1FF) == 256) {
                            int var42 = var40.field7718 - (var40.method2692((byte) -2) - 1 << 8);
                            int var43 = var40.field7719 - (var40.method2692((byte) -125) - 1 << 8);
                            for (int var44 = 0; var44 < class26.field379; var44++) {
                                class14 var51 = (class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var44]);
                                if (var51 != null) {
                                    class645 var52 = var51.field262;
                                    if (class673.field9441 != var52.field6357 && var52.field6430) {
                                        int var53 = var52.field7718 - (var52.field9071.field3878 - 1 << 8);
                                        int var54 = var52.field7719 - (var52.field9071.field3878 - 1 << 8);
                                        if (var53 >= var42 && var52.field9071.field3878 <= (var40.method2692((byte) -125) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field9071.field3878 <= var40.method2692((byte) -128) - (var54 - var43 >> 9)) {
                                            class380.method2343(var52, class251.field3549.field7710 != var35.field2428.field7710, 30845);
                                            var52.field6357 = class673.field9441;
                                        }
                                    }
                                }
                            }
                            int var45 = class147.field1873;
                            int[] var46 = class568.field8045;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class559 var48 = class581.field8250[var46[var47]];
                                if (var48 != null && class673.field9441 != var48.field6357 && var40 != var48 && var48.field6430) {
                                    int var49 = var48.field7718 - (var48.method2692((byte) -124) - 1 << 8);
                                    int var50 = var48.field7719 - (var48.method2692((byte) 114) - 1 << 8);
                                    if (var49 >= var42 && var48.method2692((byte) -9) <= (var40.method2692((byte) -126) - (var49 - var42 >> 9)) && var43 <= var50 && var48.method2692((byte) -128) <= (var40.method2692((byte) -124) - (var50 - var43 >> 9))) {
                                        class518.method3016(class251.field3549.field7710 != var35.field2428.field7710, 5385, var48);
                                        var48.field6357 = class673.field9441;
                                    }
                                }
                            }
                        }
                        if (class673.field9441 == var40.field6357) {
                            continue;
                        }
                        class518.method3016(class251.field3549.field7710 != var35.field2428.field7710, 5385, var40);
                        var40.field6357 = class673.field9441;
                    }
                    if (var35.field2428 instanceof class645) {
                        class645 var55 = (class645) var35.field2428;
                        if (var55.field9071 != null) {
                            if ((var55.field9071.field3878 & 0x1) == 0 && (var55.field7718 & 0x1FF) == 0 && (var55.field7719 & 0x1FF) == 0 || (var55.field9071.field3878 & 0x1) == 1 && (var55.field7718 & 0x1FF) == 256 && (var55.field7719 & 0x1FF) == 256) {
                                int var56 = var55.field7718 - (var55.field9071.field3878 - 1 << 8);
                                int var57 = var55.field7719 - (var55.field9071.field3878 - 1 << 8);
                                for (int var58 = 0; var58 < class26.field379; var58++) {
                                    class14 var65 = (class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var58]);
                                    if (var65 != null) {
                                        class645 var66 = var65.field262;
                                        if (class673.field9441 != var66.field6357 && var55 != var66 && var66.field6430) {
                                            int var67 = var66.field7718 - (var66.field9071.field3878 - 1 << 8);
                                            int var68 = var66.field7719 - (var66.field9071.field3878 - 1 << 8);
                                            if (var56 <= var67 && var66.field9071.field3878 <= var55.field9071.field3878 - (var67 - var56 >> 9) && var57 <= var68 && var66.field9071.field3878 <= (var55.field9071.field3878 - (var68 - var57 >> 9))) {
                                                class380.method2343(var66, class251.field3549.field7710 != var35.field2428.field7710, 30845);
                                                var66.field6357 = class673.field9441;
                                            }
                                        }
                                    }
                                }
                                int var59 = class147.field1873;
                                int[] var60 = class568.field8045;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class559 var62 = class581.field8250[var60[var61]];
                                    if (var62 != null && class673.field9441 != var62.field6357 && var62.field6430) {
                                        int var63 = var62.field7718 - (var62.method2692((byte) 50) - 1 << 8);
                                        int var64 = var62.field7719 - (var62.method2692((byte) -18) - 1 << 8);
                                        if (var56 <= var63 && var62.method2692((byte) -126) <= (var55.field9071.field3878 - (var63 - var56 >> 9)) && var64 >= var57 && var62.method2692((byte) -127) <= (var55.field9071.field3878 - (var64 - var57 >> 9))) {
                                            class518.method3016(class251.field3549.field7710 != var35.field2428.field7710, 5385, var62);
                                            var62.field6357 = class673.field9441;
                                        }
                                    }
                                }
                            }
                            if (class673.field9441 == var55.field6357) {
                                continue;
                            }
                            class380.method2343(var55, class251.field3549.field7710 != var35.field2428.field7710, 30845);
                            var55.field6357 = class673.field9441;
                        }
                    }
                    if (var35.field2428 instanceof class230) {
                        int var69 = class103.field1295 + var39;
                        int var70 = var38 + class175.field2496;
                        class541 var71 = (class541) class70.field959.method380((byte) -3, (long) (var35.field2428.field7710 << 28 | var70 << 14 | var69));
                        if (var71 != null) {
                            int var72 = 0;
                            for (class6 var73 = (class6) var71.field7586.method2509(false); var73 != null; var73 = (class6) var71.field7586.method2515(119)) {
                                class501 var74 = class526.field7490.method3567(var73.field62, true);
                                if (class26.field382 && class251.field3549.field7710 == var35.field2428.field7710) {
                                    class330 var75 = class466.field6628 == -1 ? null : class788.field10824.method1609(class466.field6628, -79);
                                    if ((class641.field9043 & 0x1) != 0 && (var75 == null || var74.method2914(0, var75.field4920, class466.field6628) != var75.field4920)) {
                                        class54.field746++;
                                        class502.method2933(3, class373.field5373 + " -> <col=ff9040>" + var74.field7108, true, -1, 6947, class361.field5239, class75.field1013, (long) var72, false, false, var39, var38, (long) var73.field62);
                                    }
                                }
                                if (class251.field3549.field7710 == var35.field2428.field7710) {
                                    String[] var76 = var74.field7172;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 21;
                                            }
                                            int var79 = class23.field347;
                                            if (var77 == 1) {
                                                var78 = 15;
                                            }
                                            if (var77 == 2) {
                                                var78 = 22;
                                            }
                                            if (var77 == 3) {
                                                var78 = 50;
                                            }
                                            if (var77 == 4) {
                                                var78 = 4;
                                            }
                                            if (var74.field7158 == var77) {
                                                var79 = var74.field7117;
                                            }
                                            if (var74.field7145 == var77) {
                                                var79 = var74.field7165;
                                            }
                                            class653.field9201++;
                                            class502.method2933(var78, "<col=ff9040>" + var74.field7108, true, -1, 6947, var76[var77], var79, (long) var72, false, false, var39, var38, (long) var73.field62);
                                        }
                                    }
                                }
                                class502.method2933(1012, "<col=ff9040>" + var74.field7108, true, -1, 6947, class674.field9573.method3825((byte) -10, class526.field7494), class788.field10830, (long) var72, class251.field3549.field7710 != var35.field2428.field7710, false, var39, var38, (long) var73.field62);
                                class25.field364++;
                                var72++;
                            }
                        }
                    }
                    if (var35.field2428 instanceof class362) {
                        class362 var80 = (class362) var35.field2428;
                        class322 var81 = class496.field7061.method319(-36, var80.method650(124));
                        if (var81.field4830 != null) {
                            var81 = var81.method2099(class271.field3796, -74);
                        }
                        if (var81 != null) {
                            if (class26.field382 && class251.field3549.field7710 == var35.field2428.field7710) {
                                class330 var82 = class466.field6628 == -1 ? null : class788.field10824.method1609(class466.field6628, -69);
                                if ((class641.field9043 & 0x4) != 0 && (var82 == null || var81.method2095((byte) 95, var82.field4920, class466.field6628) != var82.field4920)) {
                                    class502.method2933(25, class373.field5373 + " -> <col=00ffff>" + var81.field4791, true, -1, 6947, class361.field5239, class75.field1013, (long) var80.hashCode(), false, false, var39, var38, class123.method907(var80, 6951, var39, var38));
                                    class624.field8801++;
                                }
                            }
                            if (class251.field3549.field7710 == var35.field2428.field7710) {
                                String[] var83 = var81.field4820;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 6;
                                            }
                                            int var86 = class23.field347;
                                            if (var84 == 1) {
                                                var85 = 59;
                                            }
                                            if (var84 == 2) {
                                                var85 = 20;
                                            }
                                            if (var84 == 3) {
                                                var85 = 53;
                                            }
                                            if (var81.field4797 == var84) {
                                                var86 = var81.field4838;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1010;
                                            }
                                            if (var81.field4790 == var84) {
                                                var86 = var81.field4780;
                                            }
                                            class502.method2933(var85, "<col=00ffff>" + var81.field4791, true, -1, 6947, var83[var84], var86, (long) var80.hashCode(), false, false, var39, var38, class123.method907(var80, 6951, var39, var38));
                                            class722.field10138++;
                                        }
                                    }
                                }
                                class502.method2933(1007, "<col=00ffff>" + var81.field4791, true, -1, 6947, class674.field9573.method3825((byte) -10, class526.field7494), class788.field10830, (long) var80.hashCode(), class251.field3549.field7710 != var35.field2428.field7710, false, var39, var38, (long) var81.field4759);
                                class201.field2946++;
                            }
                        }
                    }
                }
            }
            if (class607.field8578) {
                class21.method163((byte) -128);
            }
        }
        class291.method1970(false, -42);
    }
}

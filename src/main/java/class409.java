import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class409 {

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field5747 = 0;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "Ljn;")
    public static class134 field5746 = new class134(13, 0);

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "Ljn;")
    public static class134 field5751 = new class134(29, 9);

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "Lofa;")
    public static class145 field5750;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lha;III)V")
    public static final void method2500(class473 arg0, int arg1, int arg2, int arg3) {
        field5748++;
        if (arg2 < 0 || arg1 < 0 || class471.field6524 == 0 || class734.field10128 == 0) {
            return;
        }
        if (arg3 != 254240553) {
            field5751 = null;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class12 var8;
        int var9;
        int var10;
        if (class55.field651) {
            class340.method2159(false, (byte) 115);
            var8 = arg0.method187();
            int[] var11 = arg0.method238();
            var4 = var11[0];
            var6 = var11[2];
            var7 = var11[3];
            var5 = var11[1];
            var9 = class789.method4326(false, arg3 ^ 0xF0D898B8) + arg2;
            var10 = arg1 + class305.method1989(false, arg3 ^ 0xF0D88DD2);
        } else {
            arg0.method242(class597.field8368, class638.field8977, class471.field6524, class734.field10128);
            var4 = class597.field8368;
            var5 = class638.field8977;
            var6 = class471.field6524;
            var7 = class734.field10128;
            arg0.method225(class110.field1326, class604.field8475, class471.field6524, class734.field10128);
            var8 = arg0.method159();
            var8.method39(class141.field1802, class426.field5950, class93.field1085, class423.field5878, class399.field5646, class400.field5654);
            var9 = arg2;
            var10 = arg1;
            arg0.method194(var8);
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var6 == 0) {
            var6 = 1;
        }
        class35.method287(1, true);
        if (class95.field1115 != null && (!class773.field10644 || (class774.field10657 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg0.method241();
            int var15 = arg0.method177();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class529.field7284) {
                var16 = var18 = (var9 - var4) * class775.field10662 / var6;
                var19 = var17 = (var10 - var5) * class775.field10662 / var7;
            } else {
                var16 = (var9 - var4) * var14 / var6;
                var17 = (var10 - var5) * var15 / var7;
                var18 = (var9 - var4) * var15 / var6;
                var19 = (var10 - var5) * var14 / var7;
            }
            int[] var20 = new int[] { var16, var19, var14 };
            int[] var21 = new int[] { var18, var17, var15 };
            var8.method34(var20);
            var8.method34(var21);
            float var22 = class263.method1729((float) var21[0], (float) var20[0], (float) var20[2], 4, -1, (float) var20[1], (float) var21[2], (float) var21[1]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = (class724.field10031.method3744(1) - 1 << 8) + var25 >> 9;
                var13 = var26 + (class724.field10031.method3744(1) - 1 << 8) >> 9;
                byte var27 = class724.field10031.field3467;
                if (var27 < 3 && (class533.field7338[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class773.field10644 && (class774.field10657 & 0x40) != 0) {
                    class115 var28 = class446.method2705(class539.field7462, 122, class326.field4586);
                    if (var28 == null) {
                        class76.method561(arg3 ^ 0xF0D898D6);
                    } else {
                        class86.method647((long) (var12 << 0 | var13), class56.field656, var13, false, 0L, " ->", 15, class50.field602, -1, arg3 ^ 0xF27676C, true, var12, true);
                    }
                } else {
                    if (class73.field814) {
                        class86.method647((long) (var13 | var12 << 0), class712.field9880.method3999(class553.field7667, (byte) -122), var13, false, 0L, "", 59, -1, -1, 91, true, var12, true);
                    }
                    class86.method647((long) (var13 | var12 << 0), class633.field8839, var13, false, 0L, "", 45, class345.field5008, -1, 82, true, var12, true);
                    class453.field6316++;
                }
            }
        }
        if (class55.field651) {
            class634.method3641((byte) -72);
        }
        for (int var29 = 0; var29 < (class55.field651 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class705 var31 = var30 ? class539.field7444 : class177.field2233;
            int var32 = arg2;
            int var33 = arg1;
            if (class55.field651) {
                class340.method2159(var30, (byte) 126);
                var32 = arg2 + class789.method4326(var30, -116);
                var33 = arg1 + class305.method1989(var30, arg3 ^ 0xF0D88DD2);
            }
            class519 var34 = var31.field9809;
            for (class289 var35 = (class289) var34.method3103((byte) 72); var35 != null; var35 = (class289) var34.method3104(-10964)) {
                if ((class149.field1964 || class724.field10031.field3467 == var35.field4258.field3467) && var35.method1922(var32, (byte) -122, var33, arg0)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field4258 instanceof class253) {
                        var38 = ((class253) var35.field4258).field3745;
                        var39 = ((class253) var35.field4258).field3758;
                    } else {
                        var39 = var35.field4258.field3460 >> 9;
                        var38 = var35.field4258.field3470 >> 9;
                    }
                    if (var35.field4258 instanceof class723) {
                        class723 var40 = (class723) var35.field4258;
                        int var41 = var40.method3744(1);
                        if ((var41 & 0x1) == 0 && (var40.field3470 & 0x1FF) == 0 && (var40.field3460 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field3470 & 0x1FF) == 256 && (var40.field3460 & 0x1FF) == 256) {
                            int var42 = var40.field3470 - (var40.method3744(1) - 1 << 8);
                            int var43 = var40.field3460 - (var40.method3744(1) - 1 << 8);
                            for (int var44 = 0; var44 < class429.field5988; var44++) {
                                class685 var51 = (class685) class450.field6288.method3669(false, (long) class425.field5934[var44]);
                                if (var51 != null) {
                                    class359 var52 = var51.field9573;
                                    if (class533.field7336 != var52.field9190 && var52.field9136) {
                                        int var53 = var52.field3470 - (var52.field5172.field8899 - 1 << 8);
                                        int var54 = var52.field3460 - (var52.field5172.field8899 - 1 << 8);
                                        if (var53 >= var42 && var52.field5172.field8899 <= (var40.method3744(arg3 - 254240552) - (var53 - var42 >> 9)) && var54 >= var43 && var52.field5172.field8899 <= var40.method3744(arg3 - 254240552) - (var54 - var43 >> 9)) {
                                            class658.method3769(class724.field10031.field3467 != var35.field4258.field3467, var52, (byte) -44);
                                            var52.field9190 = class533.field7336;
                                        }
                                    }
                                }
                            }
                            int var45 = class783.field10748;
                            int[] var46 = class244.field3610;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class723 var48 = class413.field5787[var46[var47]];
                                if (var48 != null && class533.field7336 != var48.field9190 && var40 != var48 && var48.field9136) {
                                    int var49 = var48.field3470 - (var48.method3744(1) - 1 << 8);
                                    int var50 = var48.field3460 - (var48.method3744(1) - 1 << 8);
                                    if (var49 >= var42 && var48.method3744(1) <= var40.method3744(1) - (var49 - var42 >> 9) && var50 >= var43 && var48.method3744(1) <= var40.method3744(1) - (var50 - var43 >> 9)) {
                                        class310.method2003(2048, class724.field10031.field3467 != var35.field4258.field3467, var48);
                                        var48.field9190 = class533.field7336;
                                    }
                                }
                            }
                        }
                        if (class533.field7336 == var40.field9190) {
                            continue;
                        }
                        class310.method2003(2048, class724.field10031.field3467 != var35.field4258.field3467, var40);
                        var40.field9190 = class533.field7336;
                    }
                    if (var35.field4258 instanceof class359) {
                        class359 var55 = (class359) var35.field4258;
                        if (var55.field5172 != null) {
                            if ((var55.field5172.field8899 & 0x1) == 0 && (var55.field3470 & 0x1FF) == 0 && (var55.field3460 & 0x1FF) == 0 || (var55.field5172.field8899 & 0x1) == 1 && (var55.field3470 & 0x1FF) == 256 && (var55.field3460 & 0x1FF) == 256) {
                                int var56 = var55.field3470 - (var55.field5172.field8899 - 1 << 8);
                                int var57 = var55.field3460 - (var55.field5172.field8899 - 1 << 8);
                                for (int var58 = 0; var58 < class429.field5988; var58++) {
                                    class685 var65 = (class685) class450.field6288.method3669(false, (long) class425.field5934[var58]);
                                    if (var65 != null) {
                                        class359 var66 = var65.field9573;
                                        if (class533.field7336 != var66.field9190 && var55 != var66 && var66.field9136) {
                                            int var67 = var66.field3470 - (var66.field5172.field8899 - 1 << 8);
                                            int var68 = var66.field3460 - (var66.field5172.field8899 - 1 << 8);
                                            if (var67 >= var56 && var66.field5172.field8899 <= (var55.field5172.field8899 - (var67 - var56 >> 9)) && var68 >= var57 && var66.field5172.field8899 <= (var55.field5172.field8899 - (var68 - var57 >> 9))) {
                                                class658.method3769(class724.field10031.field3467 != var35.field4258.field3467, var66, (byte) -44);
                                                var66.field9190 = class533.field7336;
                                            }
                                        }
                                    }
                                }
                                int var59 = class783.field10748;
                                int[] var60 = class244.field3610;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class723 var62 = class413.field5787[var60[var61]];
                                    if (var62 != null && class533.field7336 != var62.field9190 && var62.field9136) {
                                        int var63 = var62.field3470 - (var62.method3744(arg3 ^ 0xF276728) - 1 << 8);
                                        int var64 = var62.field3460 - (var62.method3744(1) - 1 << 8);
                                        if (var56 <= var63 && var62.method3744(arg3 - 254240552) <= (var55.field5172.field8899 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method3744(1) <= (var55.field5172.field8899 - (var64 - var57 >> 9))) {
                                            class310.method2003(2048, class724.field10031.field3467 != var35.field4258.field3467, var62);
                                            var62.field9190 = class533.field7336;
                                        }
                                    }
                                }
                            }
                            if (class533.field7336 == var55.field9190) {
                                continue;
                            }
                            class658.method3769(class724.field10031.field3467 != var35.field4258.field3467, var55, (byte) -44);
                            var55.field9190 = class533.field7336;
                        }
                    }
                    if (var35.field4258 instanceof class78) {
                        int var69 = class444.field6151 + var38;
                        int var70 = class236.field3535 + var39;
                        class656 var71 = (class656) class752.field10377.method3669(false, (long) (var35.field4258.field3467 << 28 | var70 << 14 | var69));
                        if (var71 != null) {
                            int var72 = 0;
                            class728 var73 = (class728) var71.field9258.method1045((byte) -128);
                            while (var73 != null) {
                                class581 var74 = class35.field367.method3051((byte) -20, var73.field10064);
                                if (class773.field10644 && class724.field10031.field3467 == var35.field4258.field3467) {
                                    class771 var75 = class358.field5156 == -1 ? null : class734.field10126.method709((byte) 123, class358.field5156);
                                    if ((class774.field10657 & 0x1) != 0 && (var75 == null || var74.method3412(var75.field10602, class358.field5156, 1000) != var75.field10602)) {
                                        class114.field1382++;
                                        class86.method647((long) var72, class56.field656, var39, false, (long) var73.field10064, class523.field7205 + " -> <col=ff9040>" + var74.field8230, 46, class50.field602, -1, 97, true, var38, false);
                                    }
                                }
                                if (class724.field10031.field3467 == var35.field4258.field3467) {
                                    String[] var76 = var74.field8191;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 18;
                                            }
                                            int var79 = class233.field3500;
                                            if (var77 == 1) {
                                                var78 = 10;
                                            }
                                            if (var77 == 2) {
                                                var78 = 16;
                                            }
                                            if (var77 == 3) {
                                                var78 = 21;
                                            }
                                            if (var77 == 4) {
                                                var78 = 9;
                                            }
                                            if (var74.field8226 == var77) {
                                                var79 = var74.field8183;
                                            }
                                            if (var74.field8178 == var77) {
                                                var79 = var74.field8233;
                                            }
                                            class86.method647((long) var72, var76[var77], var39, false, (long) var73.field10064, "<col=ff9040>" + var74.field8230, var78, var79, -1, 120, true, var38, false);
                                            class145.field1866++;
                                        }
                                    }
                                }
                                class86.method647((long) var72, class712.field9875.method3999(class553.field7667, (byte) -31), var39, class724.field10031.field3467 != var35.field4258.field3467, (long) var73.field10064, "<col=ff9040>" + var74.field8230, 1011, class538.field7439, -1, 84, true, var38, false);
                                class403.field5682++;
                                var73 = (class728) var71.field9258.method1035((byte) 91);
                                var72++;
                            }
                        }
                    }
                    if (var35.field4258 instanceof class466) {
                        class466 var80 = (class466) var35.field4258;
                        class286 var81 = class390.field5558.method3065(arg3 - 254240445, var80.method760(-27640));
                        if (var81.field4136 != null) {
                            var81 = var81.method1889(class173.field2192, false);
                        }
                        if (var81 != null) {
                            if (class773.field10644 && class724.field10031.field3467 == var35.field4258.field3467) {
                                class771 var82 = class358.field5156 == -1 ? null : class734.field10126.method709((byte) 99, class358.field5156);
                                if ((class774.field10657 & 0x4) != 0 && (var82 == null || var81.method1894(class358.field5156, (byte) -117, var82.field10602) != var82.field10602)) {
                                    class271.field3911++;
                                    class86.method647((long) var80.hashCode(), class56.field656, var39, false, class443.method2665(var39, var80, 19448, var38), class523.field7205 + " -> <col=00ffff>" + var81.field4118, 12, class50.field602, -1, 108, true, var38, false);
                                }
                            }
                            if (class724.field10031.field3467 == var35.field4258.field3467) {
                                String[] var83 = var81.field4181;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 44;
                                            }
                                            int var86 = class233.field3500;
                                            if (var84 == 1) {
                                                var85 = 50;
                                            }
                                            if (var84 == 2) {
                                                var85 = 60;
                                            }
                                            if (var84 == 3) {
                                                var85 = 5;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1001;
                                            }
                                            if (var81.field4190 == var84) {
                                                var86 = var81.field4168;
                                            }
                                            if (var81.field4129 == var84) {
                                                var86 = var81.field4147;
                                            }
                                            class304.field4410++;
                                            class86.method647((long) var80.hashCode(), var83[var84], var39, false, class443.method2665(var39, var80, 19448, var38), "<col=00ffff>" + var81.field4118, var85, var86, -1, 125, true, var38, false);
                                        }
                                    }
                                }
                                class123.field1622++;
                                class86.method647((long) var80.hashCode(), class712.field9875.method3999(class553.field7667, (byte) -84), var39, class724.field10031.field3467 != var35.field4258.field3467, (long) var81.field4124, "<col=00ffff>" + var81.field4118, 1003, class538.field7439, -1, 126, true, var38, false);
                            }
                        }
                    }
                }
            }
            if (class55.field651) {
                class634.method3641((byte) -72);
            }
        }
        class35.method287(arg3 - 254240552, false);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Llm;Llm;I)V")
    public static final void method2501(class49 arg0, class49 arg1, int arg2) {
        if (arg1.field586 != null) {
            arg1.method416(9867);
        }
        field5749++;
        arg1.field586 = arg0.field586;
        arg1.field591 = arg0;
        arg1.field586.field591 = arg1;
        arg1.field591.field586 = arg1;
        if (arg2 < 40) {
            field5751 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static void method2502(int arg0) {
        if (arg0 != 2287) {
            field5746 = null;
        }
        field5746 = null;
        field5751 = null;
        field5750 = null;
    }
}

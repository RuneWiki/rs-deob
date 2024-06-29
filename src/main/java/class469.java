import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class469 {

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field6707 = -1;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Lps;")
    public static class469 field6705 = new class469(2, 4);

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "F")
    public static float field6712;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[[Lrb;")
    public static class383[][] field6711;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)Z")
    public static final boolean method2706(int arg0, byte arg1) {
        field6709++;
        if (arg1 <= 96) {
            method2707(null, 48);
        }
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lr;I)V")
    public static final void method2707(class564 arg0, int arg1) {
        field6706++;
        int var2 = class200.field2357;
        int var3 = class376.field5112;
        int var4 = class598.field8426;
        int var5 = class361.field4841 - 3;
        byte var6 = 20;
        if (class699.field9807 == null || class128.field1438 == null) {
            if (class408.field5441.method3849(class416.field5577, false) && class408.field5441.method3849(class373.field5084, false)) {
                class699.field9807 = arg0.method1041(class550.method3122(class408.field5441, class416.field5577, 0), true);
                class550 var7 = class550.method3122(class408.field5441, class373.field5084, 0);
                class128.field1438 = arg0.method1041(var7, true);
                var7.method3115();
                class8.field88 = arg0.method1041(var7, true);
            } else {
                arg0.method1022(var2, var3, var4, var6, 255 - class647.field9126 << 24 | class688.field9687, 1);
            }
        }
        if (class699.field9807 != null && class128.field1438 != null) {
            int var8 = (var4 - (class128.field1438.method315() * 2)) / class699.field9807.method315();
            for (int var9 = 0; var9 < var8; var9++) {
                class699.field9807.method3001(class128.field1438.method315() + (var2 + (var9 * class699.field9807.method315())), var3);
            }
            class128.field1438.method3001(var2, var3);
            class8.field88.method3001(var2 + var4 - class8.field88.method315(), var3);
        }
        class282.field3535.method2318(class198.field2309.method1195((byte) 62, class504.field7267), -1, var2 + 3, arg1, class596.field8392 | 0xFF000000, var3 + 14);
        arg0.method1022(var2, var3 + var6, var4, var5 - var6, class688.field9687 | -class647.field9126 + 255 << 24, 1);
        int var10 = class108.field1166.method253(true);
        int var11 = class108.field1166.method252(arg1 + 7);
        int var12 = 0;
        for (class336 var13 = (class336) class694.field9730.method3434((byte) 2); var13 != null; var13 = (class336) class694.field9730.method3430(true)) {
            int var31 = (class661.field9266 - var12 - 1) * 16 + var6 + var3 + 13;
            var12++;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > (var31 - 13) && var11 < (var31 + 4) && var13.field4233) {
                arg0.method1022(var2, var31 - 12, var4, 16, 255 - class129.field1441 << 24 | class693.field9724, 1);
            }
        }
        if ((class169.field1887 == null || class563.field8047 == null || class674.field9378 == null) && class408.field5441.method3849(class597.field8413, false) && class408.field5441.method3849(class425.field5988, false) && class408.field5441.method3849(class311.field3847, false)) {
            class550 var14 = class550.method3122(class408.field5441, class425.field5988, 0);
            class563.field8047 = arg0.method1041(var14, true);
            var14.method3115();
            class430.field6107 = arg0.method1041(var14, true);
            class169.field1887 = arg0.method1041(class550.method3122(class408.field5441, class597.field8413, 0), true);
            class550 var15 = class550.method3122(class408.field5441, class311.field3847, 0);
            class674.field9378 = arg0.method1041(var15, true);
            var15.method3115();
            class262.field3268 = arg0.method1041(var15, true);
        }
        if (class169.field1887 != null && class563.field8047 != null && class674.field9378 != null) {
            int var16 = (var4 - (class674.field9378.method315() * 2)) / class169.field1887.method315();
            for (int var17 = 0; var17 < var16; var17++) {
                class169.field1887.method3001(class674.field9378.method315() + var2 + class169.field1887.method315() * var17, -class169.field1887.method306() + var3 - -var5);
            }
            int var18 = (var5 - (var6 + class674.field9378.method306())) / class563.field8047.method306();
            for (int var19 = 0; var19 < var18; var19++) {
                class563.field8047.method3001(var2, var3 + var6 + (class563.field8047.method306() * var19));
                class430.field6107.method3001(var2 + var4 - class430.field6107.method315(), var3 - (-var6 - class563.field8047.method306() * var19));
            }
            class674.field9378.method3001(var2, (var3 + var5) - class674.field9378.method306());
            class262.field3268.method3001(var2 + (var4 - class674.field9378.method315()), var3 - -var5 - class674.field9378.method306());
        }
        int var20 = 0;
        for (class336 var21 = (class336) class694.field9730.method3434((byte) 2); var21 != null; var21 = (class336) class694.field9730.method3430(true)) {
            int var22 = (class661.field9266 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class596.field8392 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var22 - 13 && var11 < (var22 + 4) && var21.field4233) {
                var23 = class31.field298 | 0xFF000000;
            }
            int[] var24 = null;
            if (class151.method822(var21.field4231, false)) {
                var24 = class19.field153.method272((int) var21.field4226, -11824).field7033;
            } else if (var21.field4229 != -1) {
                var24 = class19.field153.method272(var21.field4229, -11824).field7033;
            } else if (class231.method1388(125, var21.field4231)) {
                class214 var25 = (class214) class274.field3433.method3669((long) ((int) var21.field4226), arg1 - 1);
                if (var25 != null) {
                    class600 var26 = var25.field2601;
                    class210 var27 = var26.field8461;
                    if (var27.field2492 != null) {
                        var27 = var27.method1247((byte) 99, class628.field8859);
                    }
                    if (var27 != null) {
                        var24 = var27.field2504;
                    }
                }
            } else if (class638.method3598(var21.field4231, arg1)) {
                Object var28 = null;
                class638 var29;
                if (var21.field4231 == 1011) {
                    var29 = class364.field4891.method2134((int) var21.field4226, true);
                } else {
                    var29 = class364.field4891.method2134((int) (var21.field4226 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var29.field8974 != null) {
                    var29 = var29.method3597(-1, class628.field8859);
                }
                if (var29 != null) {
                    var24 = var29.field8998;
                }
            }
            String var30 = class203.method1210(var21, -124);
            if (var24 != null) {
                var30 = var30 + class243.method1439(var24, 0);
            }
            class282.field3535.method2311(0, class587.field8315, (byte) 30, class420.field5596, var30, var23, var22, var2 + 3);
            var20++;
            if (var21.field4223) {
                class232.field2863.method3001(class488.field7097.method2657((byte) 62, var30) + var2 + 5, var22 - 12);
            }
        }
        class420.method2351(class200.field2357, class376.field5112, true, class361.field4841, class598.field8426);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILr;I)V")
    public static final void method2708(int arg0, int arg1, class564 arg2, int arg3) {
        field6708++;
        if (arg0 < 0 || arg1 < 0 || class107.field1157 == 0 || class688.field9678 == 0) {
            return;
        }
        arg2.method997(class387.field5220, class679.field9567, class107.field1157, class688.field9678);
        arg2.method982(class201.field2381, class628.field8857, class107.field1157, class688.field9678);
        if (arg3 != -21051) {
            return;
        }
        class490 var4 = arg2.method1035();
        var4.method25(class206.field2456, class246.field3039, class362.field4857, class555.field7930, class145.field1603, class129.field1453);
        arg2.method992(var4);
        if (class385.field5193 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method966();
            int var8 = (arg0 - class387.field5220) * var7 / class107.field1157;
            int var9 = (arg1 - class679.field9567) * var7 / class688.field9678;
            int var10 = arg2.method971();
            int var11 = (arg0 - class387.field5220) * var10 / class107.field1157;
            int var12 = (arg1 - class679.field9567) * var10 / class688.field9678;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method21(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method21(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && var20 < class142.field1574 && class140.field1550 > var22) {
                    int var23 = class362.field4859.field5166;
                    if (var23 < 3 && (class16.field131[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class385.field5193[var23].method1610(var19, 108, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class362.field4859.method1414(-31789) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class362.field4859.method1414(-31789) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class348.field4665 && (class512.field7345 & 0x40) != 0) {
                    class452 var24 = class633.method3558(class128.field1439, arg3 + 21050, class465.field6641);
                    if (var24 == null) {
                        class204.method1218(119);
                    } else {
                        class53.method279(-1, var6, " ->", 0L, 107, true, 11, class286.field3580, false, class185.field2084, var5);
                    }
                } else {
                    if (class312.field3886 == class246.field3031) {
                        class53.method279(-1, var6, "", 0L, 106, true, 15, class198.field2312.method1195((byte) 62, class504.field7267), false, -1, var5);
                    }
                    class53.method279(-1, var6, "", 0L, 123, true, 19, class223.field2772, false, class676.field9407, var5);
                    class206.field2451++;
                }
            }
        }
        class287 var25 = class517.field7362;
        for (class315 var26 = (class315) var25.method1672((byte) 105); var26 != null; var26 = (class315) var25.method1669(arg3 ^ 0x5880)) {
            if ((class226.field2806 || class362.field4859.field5166 == var26.field3914.field5166) && var26.method1811(arg1, arg2, arg0, (byte) 104)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if ((var26.field3914 instanceof class613)) {
                    var29 = ((class613) var26.field3914).field8635;
                    var30 = ((class613) var26.field3914).field8627;
                } else {
                    var29 = var26.field3914.field5179 >> 9;
                    var30 = var26.field3914.field5176 >> 9;
                }
                if (var26.field3914 instanceof class236) {
                    class236 var31 = (class236) var26.field3914;
                    int var32 = var31.method1414(-31789);
                    if ((var32 & 0x1) == 0 && (var31.field5179 & 0x1FF) == 0 && (var31.field5176 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field5179 & 0x1FF) == 256 && (var31.field5176 & 0x1FF) == 256) {
                        int var33 = var31.field5179 - (var31.method1414(-31789) - 1 << 8);
                        int var34 = var31.field5176 - (var31.method1414(-31789) - 1 << 8);
                        for (int var35 = 0; var35 < class651.field9144; var35++) {
                            class214 var42 = (class214) class274.field3433.method3669((long) class398.field5375[var35], arg3 ^ 0x523A);
                            if (var42 != null) {
                                class600 var43 = var42.field2601;
                                if (class678.field9539 != var43.field9474 && var43.field9505) {
                                    int var44 = var43.field5179 - (var43.field8461.field2524 - 1 << 8);
                                    int var45 = var43.field5176 - (var43.field8461.field2524 - 1 << 8);
                                    if (var33 <= var44 && var43.field8461.field2524 <= var31.method1414(-31789) - (var44 - var33 >> 9) && var34 <= var45 && var43.field8461.field2524 <= var31.method1414(-31789) - (var45 - var34 >> 9)) {
                                        class80.method429(class362.field4859.field5166 != var26.field3914.field5166, var43, (byte) 127);
                                        var43.field9474 = class678.field9539;
                                    }
                                }
                            }
                        }
                        int var36 = class306.field3786;
                        int[] var37 = class396.field5353;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class236 var39 = class139.field1540[var37[var38]];
                            if (var39 != null && class678.field9539 != var39.field9474 && var31 != var39 && var39.field9505) {
                                int var40 = var39.field5179 - (var39.method1414(-31789) - 1 << 8);
                                int var41 = var39.field5176 - (var39.method1414(-31789) - 1 << 8);
                                if (var33 <= var40 && var39.method1414(-31789) <= var31.method1414(-31789) - (var40 - var33 >> 9) && var34 <= var41 && var39.method1414(-31789) <= var31.method1414(arg3 ^ 0x2E16) - (var41 - var34 >> 9)) {
                                    class600.method3364((byte) 30, var39, class362.field4859.field5166 != var26.field3914.field5166);
                                    var39.field9474 = class678.field9539;
                                }
                            }
                        }
                    }
                    if (class678.field9539 == var31.field9474) {
                        continue;
                    }
                    class600.method3364((byte) 30, var31, class362.field4859.field5166 != var26.field3914.field5166);
                    var31.field9474 = class678.field9539;
                }
                if (var26.field3914 instanceof class600) {
                    class600 var46 = (class600) var26.field3914;
                    if (var46.field8461 != null) {
                        if ((var46.field8461.field2524 & 0x1) == 0 && (var46.field5179 & 0x1FF) == 0 && (var46.field5176 & 0x1FF) == 0 || (var46.field8461.field2524 & 0x1) == 1 && (var46.field5179 & 0x1FF) == 256 && (var46.field5176 & 0x1FF) == 256) {
                            int var47 = var46.field5179 - (var46.field8461.field2524 - 1 << 8);
                            int var48 = var46.field5176 - (var46.field8461.field2524 - 1 << 8);
                            for (int var49 = 0; var49 < class651.field9144; var49++) {
                                class214 var56 = (class214) class274.field3433.method3669((long) class398.field5375[var49], arg3 + 21050);
                                if (var56 != null) {
                                    class600 var57 = var56.field2601;
                                    if (class678.field9539 != var57.field9474 && var46 != var57 && var57.field9505) {
                                        int var58 = var57.field5179 - (var57.field8461.field2524 - 1 << 8);
                                        int var59 = var57.field5176 - (var57.field8461.field2524 - 1 << 8);
                                        if (var47 <= var58 && var57.field8461.field2524 <= (var46.field8461.field2524 - (var58 - var47 >> 9)) && var48 <= var59 && var46.field8461.field2524 - (var59 - var48 >> 9) >= var57.field8461.field2524) {
                                            class80.method429(class362.field4859.field5166 != var26.field3914.field5166, var57, (byte) -80);
                                            var57.field9474 = class678.field9539;
                                        }
                                    }
                                }
                            }
                            int var50 = class306.field3786;
                            int[] var51 = class396.field5353;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class236 var53 = class139.field1540[var51[var52]];
                                if (var53 != null && class678.field9539 != var53.field9474 && var53.field9505) {
                                    int var54 = var53.field5179 - (var53.method1414(arg3 - 10738) - 1 << 8);
                                    int var55 = var53.field5176 - (var53.method1414(-31789) - 1 << 8);
                                    if (var47 <= var54 && var53.method1414(-31789) <= (var46.field8461.field2524 - (var54 - var47 >> 9)) && var48 <= var55 && var53.method1414(arg3 ^ 0x2E16) <= (var46.field8461.field2524 - (var55 - var48 >> 9))) {
                                        class600.method3364((byte) 30, var53, class362.field4859.field5166 != var26.field3914.field5166);
                                        var53.field9474 = class678.field9539;
                                    }
                                }
                            }
                        }
                        if (class678.field9539 == var46.field9474) {
                            continue;
                        }
                        class80.method429(class362.field4859.field5166 != var26.field3914.field5166, var46, (byte) 125);
                        var46.field9474 = class678.field9539;
                    }
                }
                if (var26.field3914 instanceof class696) {
                    int var60 = class26.field245 + var29;
                    int var61 = var30 + class231.field2860;
                    class310 var62 = (class310) class200.field2354.method3669((long) (var60 | var61 << 14 | var26.field3914.field5166 << 28), -1);
                    if (var62 != null) {
                        for (class190 var63 = (class190) var62.field3833.method3432(120); var63 != null; var63 = (class190) var62.field3833.method3426((byte) 29)) {
                            class487 var64 = class19.field153.method272(var63.field2177, -11824);
                            if (class348.field4665 && class362.field4859.field5166 == var26.field3914.field5166) {
                                class166 var65 = class616.field8673 == -1 ? null : class53.field531.method1562(class616.field8673, (byte) 79);
                                if ((class512.field7345 & 0x1) != 0 && (var65 == null || var64.method2827(var65.field1859, class616.field8673, 0) != var65.field1859)) {
                                    class53.method279(-1, var30, class679.field9566 + " -> <col=ff9040>" + var64.field7027, (long) var63.field2177, 108, true, 50, class286.field3580, false, class185.field2084, var29);
                                    class320.field3941++;
                                }
                            }
                            if (class362.field4859.field5166 == var26.field3914.field5166) {
                                String[] var66 = var64.field7063;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        int var69 = class329.field4032;
                                        if (var67 == 0) {
                                            var68 = 47;
                                        }
                                        if (var67 == 1) {
                                            var68 = 45;
                                        }
                                        if (var67 == 2) {
                                            var68 = 46;
                                        }
                                        if (var67 == 3) {
                                            var68 = 60;
                                        }
                                        if (var67 == 4) {
                                            var68 = 9;
                                        }
                                        if (var64.field7026 == var67) {
                                            var69 = var64.field7051;
                                        }
                                        if (var64.field7009 == var67) {
                                            var69 = var64.field7081;
                                        }
                                        class599.field8430++;
                                        class53.method279(-1, var30, "<col=ff9040>" + var64.field7027, (long) var63.field2177, 119, true, var68, var66[var67], false, var69, var29);
                                    }
                                }
                            }
                            class53.method279(-1, var30, "<col=ff9040>" + var64.field7027, (long) var63.field2177, 111, true, 1003, class198.field2307.method1195((byte) 62, class504.field7267), class362.field4859.field5166 != var26.field3914.field5166, field6707, var29);
                            class60.field616++;
                        }
                    }
                }
                if (var26.field3914 instanceof class49) {
                    class49 var70 = (class49) var26.field3914;
                    class638 var71 = class364.field4891.method2134(var70.method238(arg3 + 27569), true);
                    if (var71.field8974 != null) {
                        var71 = var71.method3597(-1, class628.field8859);
                    }
                    if (var71 != null) {
                        if (class348.field4665 && class362.field4859.field5166 == var26.field3914.field5166) {
                            class166 var72 = class616.field8673 == -1 ? null : class53.field531.method1562(class616.field8673, (byte) -125);
                            if ((class512.field7345 & 0x4) != 0 && (var72 == null || var71.method3586(var72.field1859, class616.field8673, 17882) != var72.field1859)) {
                                class53.method279(-1, var30, class679.field9566 + " -> <col=00ffff>" + var71.field9045, class240.method1429(-89, var70, var30, var29), 108, true, 22, class286.field3580, false, class185.field2084, var29);
                                class671.field9351++;
                            }
                        }
                        if (class362.field4859.field5166 == var26.field3914.field5166) {
                            String[] var73 = var71.field9005;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        if (var74 == 0) {
                                            var75 = 12;
                                        }
                                        int var76 = class329.field4032;
                                        if (var74 == 1) {
                                            var75 = 17;
                                        }
                                        if (var74 == 2) {
                                            var75 = 2;
                                        }
                                        if (var74 == 3) {
                                            var75 = 57;
                                        }
                                        if (var71.field9016 == var74) {
                                            var76 = var71.field9034;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1004;
                                        }
                                        if (var71.field9037 == var74) {
                                            var76 = var71.field9043;
                                        }
                                        class34.field314++;
                                        class53.method279(-1, var30, "<col=00ffff>" + var71.field9045, class240.method1429(-67, var70, var30, var29), 109, true, var75, var73[var74], false, var76, var29);
                                    }
                                }
                            }
                        }
                        class411.field5493++;
                        class53.method279(-1, var30, "<col=00ffff>" + var71.field9045, (long) var71.field9021, arg3 + 21151, true, 1011, class198.field2307.method1195((byte) 62, class504.field7267), class362.field4859.field5166 != var26.field3914.field5166, field6707, var29);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6704++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method2709(byte arg0) {
        field6711 = null;
        field6705 = null;
        if (arg0 != 103) {
            field6712 = -0.4284615F;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2710(int arg0, String arg1) {
        if (arg0 > -20) {
            return null;
        }
        field6703++;
        String var2 = class105.method571(37, class266.method1569(arg1, (byte) -106));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(II)V")
    public class469(int arg0, int arg1) {
    }
}

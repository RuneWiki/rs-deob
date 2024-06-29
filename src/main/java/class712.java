import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class712 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lmga;")
    public static class739 field9957 = new class739(31, -1);

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field9963 = 0;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Lsja;")
    public static class11 field9964 = new class11(true);

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public int field9960;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public int field9961;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public int field9962;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lfca;")
    public static class92 field9959;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V", line = 8)
    public static final void method3981(int arg0, int arg1, int arg2) {
        boolean var3 = class626.field8501[0][arg1][arg2] != null && class626.field8501[0][arg1][arg2].field3281 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class626.field8501[var4][arg1][arg2] == null) {
                class243 var5 = class626.field8501[var4][arg1][arg2] = new class243(var4);
                if (var3) {
                    var5.field3275++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BIILha;)V", line = 29)
    public static final void method3982(byte arg0, int arg1, int arg2, class65 arg3) {
        field9958++;
        if (arg1 < 0 || arg2 < 0 || class334.field4856 == 0 || class417.field5978 == 0) {
            return;
        }
        class303 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class130.field1934) {
            class577.method3223(false, (byte) -92);
            var4 = arg3.method565();
            int[] var5 = arg3.method496();
            var6 = var5[1];
            var7 = var5[0];
            var8 = var5[2];
            var9 = var5[3];
            var10 = class259.method1716(false, (byte) 110) + arg1;
            var11 = arg2 + class659.method3650(false, (byte) -58);
        } else {
            arg3.method540(class419.field6024, class751.field10384, class334.field4856, class417.field5978);
            var8 = class334.field4856;
            var6 = class751.field10384;
            var7 = class419.field6024;
            var9 = class417.field5978;
            arg3.method456(class717.field10009, class733.field10173, class334.field4856, class417.field5978);
            var4 = arg3.method472();
            var4.method984(class307.field4444, class273.field4061, class432.field6128, class502.field6949, class670.field9430, class276.field4091);
            var11 = arg2;
            var10 = arg1;
            arg3.method526(var4);
        }
        if (var8 == 0) {
            var8 = 1;
        }
        if (var9 == 0) {
            var9 = 1;
        }
        class565.method3163(true, (byte) -102);
        if (class412.field5933 != null && (!class497.field6870 || (class344.field5067 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg3.method539();
            int var15 = arg3.method457();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class200.field2658) {
                var17 = var19 = (var11 - var6) * class330.field4773 / var9;
                var18 = var16 = (var10 - var7) * class330.field4773 / var8;
            } else {
                var16 = (var10 - var7) * var15 / var8;
                var17 = (var11 - var6) * var14 / var9;
                var18 = (var10 - var7) * var14 / var8;
                var19 = (var11 - var6) * var15 / var9;
            }
            int[] var20 = new int[] { var18, var17, var14 };
            var4.method982(var20);
            int[] var21 = new int[] { var16, var19, var15 };
            var4.method982(var21);
            float var22 = class441.method2659(45, (float) var21[1], (float) var20[2], (float) var20[1], (float) var21[2], (float) var20[0], 4, (float) var21[0]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class551.field7456.method655(-125) - 1 << 8) >> 9;
                var13 = var26 + (class551.field7456.method655(-125) - 1 << 8) >> 9;
                byte var27 = class551.field7456.field2250;
                if (var27 < 3 && (class66.field931[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class497.field6870 && (class344.field5067 & 0x40) != 0) {
                    class668 var28 = class452.method2690(-4353, class372.field5384, class121.field1770);
                    if (var28 == null) {
                        class701.method3909(0);
                    } else {
                        class251.method1684(false, class66.field942, true, -1, " ->", (byte) -101, true, var12, 2, (long) (var13 | var12 << 0), var13, class678.field9483, 0L);
                    }
                } else {
                    if (class516.field7059) {
                        class251.method1684(false, class474.field6566.method2780(97, class38.field589), true, -1, "", (byte) -102, true, var12, 57, (long) (var12 << 0 | var13), var13, -1, 0L);
                    }
                    class182.field2414++;
                    class251.method1684(false, class300.field4344, true, -1, "", (byte) -91, true, var12, 51, (long) (var12 << 0 | var13), var13, class407.field5895, 0L);
                }
            }
        }
        if (class130.field1934) {
            class668.method3716(-15443);
        }
        for (int var29 = 0; var29 < (class130.field1934 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class11 var31 = var30 ? class201.field2670 : field9964;
            int var32 = arg1;
            int var33 = arg2;
            if (class130.field1934) {
                class577.method3223(var30, (byte) -92);
                var32 = arg1 + class259.method1716(var30, (byte) 121);
                var33 = arg2 + class659.method3650(var30, (byte) -52);
            }
            class15 var34 = var31.field171;
            for (class176 var35 = (class176) var34.method109(0); var35 != null; var35 = (class176) var34.method115((byte) -95)) {
                if ((class290.field4244 || class551.field7456.field2250 == var35.field2347.field2250) && var35.method1241(var32, 5, var33, arg3)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field2347 instanceof class319)) {
                        var38 = ((class319) var35.field2347).field4600;
                        var39 = ((class319) var35.field2347).field4590;
                    } else {
                        var38 = var35.field2347.field2257 >> 9;
                        var39 = var35.field2347.field2259 >> 9;
                    }
                    if (var35.field2347 instanceof class73) {
                        class73 var40 = (class73) var35.field2347;
                        int var41 = var40.method655(-128);
                        if ((var41 & 0x1) == 0 && (var40.field2257 & 0x1FF) == 0 && (var40.field2259 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field2257 & 0x1FF) == 256 && (var40.field2259 & 0x1FF) == 256) {
                            int var42 = var40.field2257 - (var40.method655(-128) - 1 << 8);
                            int var43 = var40.field2259 - (var40.method655(-128) - 1 << 8);
                            for (int var44 = 0; var44 < class688.field9678; var44++) {
                                class174 var51 = (class174) class234.field3169.method3953((long) class382.field5588[var44], 14);
                                if (var51 != null) {
                                    class192 var52 = var51.field2336;
                                    if (class100.field1401 != var52.field1792 && var52.field1823) {
                                        int var53 = var52.field2257 - (var52.field2577.field2960 - 1 << 8);
                                        int var54 = var52.field2259 - (var52.field2577.field2960 - 1 << 8);
                                        if (var53 >= var42 && var52.field2577.field2960 <= (var40.method655(-126) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field2577.field2960 <= var40.method655(-125) - (var54 - var43 >> 9)) {
                                            class652.method3632(class551.field7456.field2250 != var35.field2347.field2250, var52, (byte) 16);
                                            var52.field1792 = class100.field1401;
                                        }
                                    }
                                }
                            }
                            int var45 = class571.field7608;
                            int[] var46 = class79.field1136;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class73 var48 = class599.field8149[var46[var47]];
                                if (var48 != null && class100.field1401 != var48.field1792 && var40 != var48 && var48.field1823) {
                                    int var49 = var48.field2257 - (var48.method655(-125) - 1 << 8);
                                    int var50 = var48.field2259 - (var48.method655(-126) - 1 << 8);
                                    if (var42 <= var49 && var48.method655(-126) <= (var40.method655(-126) - (var49 - var42 >> 9)) && var43 <= var50 && var48.method655(-126) <= (var40.method655(-125) - (var50 - var43 >> 9))) {
                                        class378.method2416((byte) 77, var48, class551.field7456.field2250 != var35.field2347.field2250);
                                        var48.field1792 = class100.field1401;
                                    }
                                }
                            }
                        }
                        if (class100.field1401 == var40.field1792) {
                            continue;
                        }
                        class378.method2416((byte) 77, var40, class551.field7456.field2250 != var35.field2347.field2250);
                        var40.field1792 = class100.field1401;
                    }
                    if (var35.field2347 instanceof class192) {
                        class192 var55 = (class192) var35.field2347;
                        if (var55.field2577 != null) {
                            if ((var55.field2577.field2960 & 0x1) == 0 && (var55.field2257 & 0x1FF) == 0 && (var55.field2259 & 0x1FF) == 0 || (var55.field2577.field2960 & 0x1) == 1 && (var55.field2257 & 0x1FF) == 256 && (var55.field2259 & 0x1FF) == 256) {
                                int var56 = var55.field2257 - (var55.field2577.field2960 - 1 << 8);
                                int var57 = var55.field2259 - (var55.field2577.field2960 - 1 << 8);
                                for (int var58 = 0; var58 < class688.field9678; var58++) {
                                    class174 var65 = (class174) class234.field3169.method3953((long) class382.field5588[var58], 14);
                                    if (var65 != null) {
                                        class192 var66 = var65.field2336;
                                        if (class100.field1401 != var66.field1792 && var55 != var66 && var66.field1823) {
                                            int var67 = var66.field2257 - (var66.field2577.field2960 - 1 << 8);
                                            int var68 = var66.field2259 - (var66.field2577.field2960 - 1 << 8);
                                            if (var67 >= var56 && var66.field2577.field2960 <= var55.field2577.field2960 - (var67 - var56 >> 9) && var68 >= var57 && var66.field2577.field2960 <= var55.field2577.field2960 - (var68 - var57 >> 9)) {
                                                class652.method3632(class551.field7456.field2250 != var35.field2347.field2250, var66, (byte) 16);
                                                var66.field1792 = class100.field1401;
                                            }
                                        }
                                    }
                                }
                                int var59 = class571.field7608;
                                int[] var60 = class79.field1136;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class73 var62 = class599.field8149[var60[var61]];
                                    if (var62 != null && class100.field1401 != var62.field1792 && var62.field1823) {
                                        int var63 = var62.field2257 - (var62.method655(-125) - 1 << 8);
                                        int var64 = var62.field2259 - (var62.method655(-128) - 1 << 8);
                                        if (var63 >= var56 && var62.method655(-125) <= (var55.field2577.field2960 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method655(-126) <= var55.field2577.field2960 - (var64 - var57 >> 9)) {
                                            class378.method2416((byte) 77, var62, class551.field7456.field2250 != var35.field2347.field2250);
                                            var62.field1792 = class100.field1401;
                                        }
                                    }
                                }
                            }
                            if (class100.field1401 == var55.field1792) {
                                continue;
                            }
                            class652.method3632(class551.field7456.field2250 != var35.field2347.field2250, var55, (byte) 16);
                            var55.field1792 = class100.field1401;
                        }
                    }
                    if (var35.field2347 instanceof class428) {
                        int var69 = var38 + class121.field1765;
                        int var70 = var39 + class230.field3147;
                        class193 var71 = (class193) class558.field7516.method3953((long) (var69 | var70 << 14 | var35.field2347.field2250 << 28), 14);
                        if (var71 != null) {
                            int var72 = 0;
                            for (class309 var73 = (class309) var71.field2590.method2541(-57); var73 != null; var73 = (class309) var71.field2590.method2548(8)) {
                                class322 var74 = class770.field10602.method2467(121, var73.field4453);
                                if (class497.field6870 && class551.field7456.field2250 == var35.field2347.field2250) {
                                    class486 var75 = class648.field8998 == -1 ? null : class206.field2703.method3905(true, class648.field8998);
                                    if ((class344.field5067 & 0x1) != 0 && (var75 == null || var74.method2045(var75.field6728, class648.field8998, -1) != var75.field6728)) {
                                        class321.field4621++;
                                        class251.method1684(false, class66.field942, false, -1, class341.field4924 + " -> <col=ff9040>" + var74.field4668, (byte) -90, true, var38, 10, (long) var72, var39, class678.field9483, (long) var73.field4453);
                                    }
                                }
                                if (class551.field7456.field2250 == var35.field2347.field2250) {
                                    String[] var76 = var74.field4637;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class607.field8248;
                                            if (var77 == 0) {
                                                var78 = 44;
                                            }
                                            if (var77 == 1) {
                                                var78 = 3;
                                            }
                                            if (var77 == 2) {
                                                var78 = 46;
                                            }
                                            if (var77 == 3) {
                                                var78 = 48;
                                            }
                                            if (var77 == 4) {
                                                var78 = 53;
                                            }
                                            if (var74.field4628 == var77) {
                                                var79 = var74.field4638;
                                            }
                                            if (var74.field4706 == var77) {
                                                var79 = var74.field4705;
                                            }
                                            class139.field2032++;
                                            class251.method1684(false, var76[var77], false, -1, "<col=ff9040>" + var74.field4668, (byte) 125, true, var38, var78, (long) var72, var39, var79, (long) var73.field4453);
                                        }
                                    }
                                }
                                class412.field5920++;
                                class251.method1684(class551.field7456.field2250 != var35.field2347.field2250, class474.field6561.method2780(114, class38.field589), false, -1, "<col=ff9040>" + var74.field4668, (byte) 58, true, var38, 1003, (long) var72, var39, class16.field246, (long) var73.field4453);
                                var72++;
                            }
                        }
                    }
                    if (var35.field2347 instanceof class392) {
                        class392 var80 = (class392) var35.field2347;
                        class589 var81 = class350.field5132.method3732((byte) 48, var80.method31(-23356));
                        if (var81.field7865 != null) {
                            var81 = var81.method3290(1, class382.field5602);
                        }
                        if (var81 != null) {
                            if (class497.field6870 && class551.field7456.field2250 == var35.field2347.field2250) {
                                class486 var82 = class648.field8998 == -1 ? null : class206.field2703.method3905(true, class648.field8998);
                                if ((class344.field5067 & 0x4) != 0 && (var82 == null || var81.method3280(class648.field8998, 1312515360, var82.field6728) != var82.field6728)) {
                                    class485.field6713++;
                                    class251.method1684(false, class66.field942, false, -1, class341.field4924 + " -> <col=00ffff>" + var81.field7941, (byte) -74, true, var38, 22, (long) var80.hashCode(), var39, class678.field9483, class509.method2952(0, var80, var38, var39));
                                }
                            }
                            if (class551.field7456.field2250 == var35.field2347.field2250) {
                                String[] var83 = var81.field7901;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            int var86 = class607.field8248;
                                            if (var84 == 0) {
                                                var85 = 13;
                                            }
                                            if (var84 == 1) {
                                                var85 = 58;
                                            }
                                            if (var84 == 2) {
                                                var85 = 23;
                                            }
                                            if (var84 == 3) {
                                                var85 = 17;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1012;
                                            }
                                            if (var81.field7905 == var84) {
                                                var86 = var81.field7928;
                                            }
                                            if (var81.field7877 == var84) {
                                                var86 = var81.field7888;
                                            }
                                            class203.field2681++;
                                            class251.method1684(false, var83[var84], false, -1, "<col=00ffff>" + var81.field7941, (byte) -72, true, var38, var85, (long) var80.hashCode(), var39, var86, class509.method2952(0, var80, var38, var39));
                                        }
                                    }
                                }
                                class134.field1967++;
                                class251.method1684(class551.field7456.field2250 != var35.field2347.field2250, class474.field6561.method2780(106, class38.field589), false, -1, "<col=00ffff>" + var81.field7941, (byte) 90, true, var38, 1008, (long) var80.hashCode(), var39, class16.field246, (long) var81.field7856);
                            }
                        }
                    }
                }
            }
            if (class130.field1934) {
                class668.method3716(-15443);
            }
        }
        class565.method3163(false, (byte) -102);
        if (arg0 <= 64) {
            field9963 = 81;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 571)
    public static void method3983(byte arg0) {
        field9959 = null;
        field9957 = null;
        if (arg0 != 34) {
            field9963 = 1;
        }
        field9964 = null;
    }
}

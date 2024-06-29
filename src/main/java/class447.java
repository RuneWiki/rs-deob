import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class447 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field6211 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public int field6210;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field6212;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public int field6214;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field6215;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public int field6218;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILqa;)V")
    public static final void method2655(int arg0, int arg1, int arg2, class129 arg3) {
        field6213++;
        if (arg1 < 0 || arg0 < 0 || class60.field788 == 0 || class474.field6928 == 0) {
            return;
        }
        arg3.method821(class388.field5088, class452.field6320, class60.field788, class474.field6928);
        arg3.method925(field6211, class371.field4809, class60.field788, class474.field6928);
        class142 var4 = arg3.method916();
        var4.method978(class278.field3556, class294.field3818, class19.field325, class429.field5880, class111.field1537, class51.field699);
        arg3.method829(var4);
        if (class405.field5436 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method871();
            int var8 = (arg1 - class388.field5088) * var7 / class60.field788;
            int var9 = (arg0 - class452.field6320) * var7 / class474.field6928;
            int var10 = arg3.method876();
            int var11 = (arg1 - class388.field5088) * var10 / class60.field788;
            int var12 = (arg0 - class452.field6320) * var10 / class474.field6928;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method983(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method983(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class200.field2594 && class118.field1647 > var22) {
                    int var23 = class37.field573.field6220;
                    if (var23 < 3 && (class8.field76[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class405.field5436[var23].method1185(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class37.field573.method2342(10804) - 1 << 6) + var19 >> 7;
                        var6 = var21 + (class37.field573.method2342(10804) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class515.field7573 && (class182.field2380 & 0x40) != 0) {
                    class423 var24 = class520.method3091(class172.field2229, (byte) 126, class206.field2687);
                    if (var24 == null) {
                        class356.method2082(-1);
                    } else {
                        class126.method793(var6, 20, 0L, -1, var5, (byte) -5, false, " ->", true, class257.field3252, class35.field543);
                    }
                } else {
                    if (class494.field7234 == class10.field134) {
                        class126.method793(var6, 12, 0L, -1, var5, (byte) -5, false, "", true, class388.field5095.method1127(class379.field4920, false), -1);
                    }
                    class126.method793(var6, 21, 0L, -1, var5, (byte) -5, false, "", true, class211.field2712, class381.field4965);
                    class448.field6234++;
                }
            }
        }
        class362 var25 = class193.field2500;
        class465 var26 = (class465) var25.method2122(0);
        if (arg2 <= 34) {
            return;
        }
        while (var26 != null) {
            if (class37.field573.field6220 == var26.field6834 && var26.method2808(arg0, arg1, false, arg3)) {
                label466: {
                    if (var26.field6835 instanceof class518) {
                        class518 var27 = (class518) var26.field6835;
                        int var28 = var27.method2342(10804);
                        if ((var28 & 0x1) == 0 && (var27.field6239 & 0x7F) == 0 && (var27.field6241 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6239 & 0x7F) == 64 && (var27.field6241 & 0x7F) == 64) {
                            int var29 = var27.field6239 - (var27.method2342(10804) - 1 << 6);
                            int var30 = var27.field6241 - (var27.method2342(10804) - 1 << 6);
                            for (int var31 = 0; var31 < class16.field264; var31++) {
                                class295 var38 = class527.field7791[class414.field5507[var31]];
                                if (var38 != null && class264.field3353 != var38.field5230 && var38.field5184) {
                                    int var39 = var38.field6239 - (var38.field3831.field128 - 1 << 6);
                                    int var40 = var38.field6241 - (var38.field3831.field128 - 1 << 6);
                                    if (var29 <= var39 && var38.field3831.field128 <= var27.method2342(10804) - (var39 - var29 >> 7) && var30 <= var40 && var38.field3831.field128 <= var27.method2342(10804) - (var40 - var30 >> 7)) {
                                        class138.method966(var38, class37.field573.field6220 != var26.field6834, 49);
                                        var38.field5230 = class264.field3353;
                                    }
                                }
                            }
                            int var32 = class206.field2684;
                            int[] var33 = class143.field1892;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class518 var35 = class76.field952[var33[var34]];
                                if (var35 != null && class264.field3353 != var35.field5230 && var27 != var35 && var35.field5184) {
                                    int var36 = var35.field6239 - (var35.method2342(10804) - 1 << 6);
                                    int var37 = var35.field6241 - (var35.method2342(10804) - 1 << 6);
                                    if (var29 <= var36 && var35.method2342(10804) <= (var27.method2342(10804) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method2342(10804) <= (var27.method2342(10804) - (var37 - var30 >> 7))) {
                                        class259.method1621(var35, class37.field573.field6220 != var26.field6834, -32527);
                                        var35.field5230 = class264.field3353;
                                    }
                                }
                            }
                        }
                        if (class264.field3353 == var27.field5230) {
                            break label466;
                        }
                        class259.method1621(var27, class37.field573.field6220 != var26.field6834, -32527);
                        var27.field5230 = class264.field3353;
                    }
                    if (var26.field6835 instanceof class295) {
                        class295 var41 = (class295) var26.field6835;
                        if (var41.field3831 != null) {
                            if ((var41.field3831.field128 & 0x1) == 0 && (var41.field6239 & 0x7F) == 0 && (var41.field6241 & 0x7F) == 0 || (var41.field3831.field128 & 0x1) == 1 && (var41.field6239 & 0x7F) == 64 && (var41.field6241 & 0x7F) == 64) {
                                int var42 = var41.field6239 - (var41.field3831.field128 - 1 << 6);
                                int var43 = var41.field6241 - (var41.field3831.field128 - 1 << 6);
                                for (int var44 = 0; var44 < class16.field264; var44++) {
                                    class295 var51 = class527.field7791[class414.field5507[var44]];
                                    if (var51 != null && class264.field3353 != var51.field5230 && var41 != var51 && var51.field5184) {
                                        int var52 = var51.field6239 - (var51.field3831.field128 - 1 << 6);
                                        int var53 = var51.field6241 - (var51.field3831.field128 - 1 << 6);
                                        if (var42 <= var52 && var51.field3831.field128 <= var41.field3831.field128 - (var52 - var42 >> 7) && var53 >= var43 && (var41.field3831.field128 - (var53 - var43 >> 7)) >= var51.field3831.field128) {
                                            class138.method966(var51, class37.field573.field6220 != var26.field6834, 49);
                                            var51.field5230 = class264.field3353;
                                        }
                                    }
                                }
                                int var45 = class206.field2684;
                                int[] var46 = class143.field1892;
                                for (int var47 = 0; var47 < var45; var47++) {
                                    class518 var48 = class76.field952[var46[var47]];
                                    if (var48 != null && class264.field3353 != var48.field5230 && var48.field5184) {
                                        int var49 = var48.field6239 - (var48.method2342(10804) - 1 << 6);
                                        int var50 = var48.field6241 - (var48.method2342(10804) - 1 << 6);
                                        if (var42 <= var49 && var48.method2342(10804) <= var41.field3831.field128 - (var49 - var42 >> 7) && var43 <= var50 && var48.method2342(10804) <= (var41.field3831.field128 - (var50 - var43 >> 7))) {
                                            class259.method1621(var48, class37.field573.field6220 != var26.field6834, -32527);
                                            var48.field5230 = class264.field3353;
                                        }
                                    }
                                }
                            }
                            if (class264.field3353 == var41.field5230) {
                                break label466;
                            }
                            class138.method966(var41, class37.field573.field6220 != var26.field6834, 49);
                            var41.field5230 = class264.field3353;
                        }
                    }
                    if (var26.field6835 instanceof class54) {
                        class237 var54 = (class237) class376.field4885.method2085((long) (var26.field6834 << 28 | var26.field6841 << 14 | var26.field6836), -5423);
                        if (var54 != null) {
                            for (class9 var55 = (class9) var54.field3082.method39(true); var55 != null; var55 = (class9) var54.field3082.method50((byte) 126)) {
                                class497 var56 = class89.field1238.method111(var55.field92, 86);
                                if (!class515.field7573) {
                                    if (class37.field573.field6220 == var26.field6834) {
                                        String[] var57 = var56.field7251;
                                        for (int var58 = 4; var58 >= 0; var58--) {
                                            if (var57 != null && var57[var58] != null) {
                                                byte var59 = 0;
                                                if (var58 == 0) {
                                                    var59 = 15;
                                                }
                                                int var60 = class395.field5239;
                                                if (var58 == 1) {
                                                    var59 = 51;
                                                }
                                                if (var58 == 2) {
                                                    var59 = 9;
                                                }
                                                if (var58 == 3) {
                                                    var59 = 17;
                                                }
                                                if (var56.field7292 == var58) {
                                                    var60 = var56.field7310;
                                                }
                                                if (var58 == 4) {
                                                    var59 = 47;
                                                }
                                                if (var56.field7277 == var58) {
                                                    var60 = var56.field7279;
                                                }
                                                class126.method793(var26.field6841, var59, (long) var55.field92, -1, var26.field6836, (byte) -5, false, "<col=ff9040>" + var56.field7262, true, var57[var58], var60);
                                                class207.field2688++;
                                            }
                                        }
                                    }
                                    class126.method793(var26.field6841, 1012, (long) var55.field92, -1, var26.field6836, (byte) -5, class37.field573.field6220 != var26.field6834, "<col=ff9040>" + var56.field7262, true, class122.field1702.method1127(class379.field4920, false), class291.field3721);
                                    class181.field2367++;
                                } else if (class37.field573.field6220 == var26.field6834) {
                                    class483 var61 = class227.field2931 == -1 ? null : class495.field7242.method1837(11, class227.field2931);
                                    if ((class182.field2380 & 0x1) != 0 && (var61 == null || var56.method2966(var61.field7035, true, class227.field2931) != var61.field7035)) {
                                        class249.field3185++;
                                        class126.method793(var26.field6841, 16, (long) var55.field92, -1, var26.field6836, (byte) -5, false, class195.field2532 + " -> <col=ff9040>" + var56.field7262, true, class257.field3252, class35.field543);
                                    }
                                }
                            }
                        }
                    }
                    if (var26.field6835 instanceof class323) {
                        class323 var62 = (class323) var26.field6835;
                        class402 var63 = class52.field715.method1164(var62.method413(-30502), 0);
                        if (var63.field5419 != null) {
                            var63 = var63.method2393(class198.field2555, (byte) 32);
                        }
                        if (var63 != null) {
                            if (!class515.field7573) {
                                if (class37.field573.field6220 == var26.field6834) {
                                    String[] var64 = var63.field5360;
                                    if (var64 != null) {
                                        for (int var65 = 4; var65 >= 0; var65--) {
                                            if (var64[var65] != null) {
                                                short var66 = 0;
                                                int var67 = class395.field5239;
                                                if (var65 == 0) {
                                                    var66 = 6;
                                                }
                                                if (var65 == 1) {
                                                    var66 = 2;
                                                }
                                                if (var65 == 2) {
                                                    var66 = 57;
                                                }
                                                if (var65 == 3) {
                                                    var66 = 48;
                                                }
                                                if (var65 == 4) {
                                                    var66 = 1007;
                                                }
                                                if (var63.field5416 == var65) {
                                                    var67 = var63.field5361;
                                                }
                                                if (var63.field5348 == var65) {
                                                    var67 = var63.field5338;
                                                }
                                                class126.method793(var26.field6841, var66, class222.method1419(var62, -83, var26.field6836, var26.field6841), -1, var26.field6836, (byte) -5, false, "<col=00ffff>" + var63.field5346, true, var64[var65], var67);
                                                class319.field4109++;
                                            }
                                        }
                                    }
                                }
                                class126.method793(var26.field6841, 1004, (long) var63.field5377, -1, var26.field6836, (byte) -5, class37.field573.field6220 != var26.field6834, "<col=00ffff>" + var63.field5346, true, class122.field1702.method1127(class379.field4920, false), class291.field3721);
                                class51.field701++;
                            } else if (class37.field573.field6220 == var26.field6834) {
                                class483 var68 = class227.field2931 == -1 ? null : class495.field7242.method1837(11, class227.field2931);
                                if ((class182.field2380 & 0x4) != 0 && (var68 == null || var63.method2398(false, class227.field2931, var68.field7035) != var68.field7035)) {
                                    class126.method793(var26.field6841, 5, class222.method1419(var62, -35, var26.field6836, var26.field6841), -1, var26.field6836, (byte) -5, false, class195.field2532 + " -> <col=00ffff>" + var63.field5346, true, class257.field3252, class35.field543);
                                    class121.field1685++;
                                }
                            }
                        }
                    }
                }
            }
            var26 = (class465) var25.method2129(69);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLgf;)V")
    public static final void method2656(byte arg0, class395 arg1) {
        field6217++;
        if (arg0 != 60) {
            field6211 = -73;
        }
        if ((arg1 instanceof class295)) {
            class295 var3 = (class295) arg1;
            if (var3.field3831 == null) {
                return;
            }
            class138.method966(var3, class37.field573.field6220 != var3.field6220, 49);
        } else if (arg1 instanceof class518) {
            class518 var2 = (class518) arg1;
            class259.method1621(var2, class37.field573.field6220 != var2.field6220, -32527);
            return;
        }
    }
}

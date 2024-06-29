import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class205 extends class678 {

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    public int field3147 = 0;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    public static int field3144 = 13156520;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "Lcb;")
    public static class483 field3145 = new class483();

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        field3146++;
        if (class482.field6915 > 1) {
            class264.field3867 = class104.field1844;
            class482.field6915--;
        }
        if (class310.field4624) {
            class310.field4624 = false;
            class400.method2454(-95);
            return;
        }
        if (!class308.field4551) {
            class65.method764(false);
        }
        for (int var1 = 0; var1 < 100 && class638.method3640(-19507); var1++) {
        }
        if (class199.field3098 != 10) {
            return;
        }
        while (class164.method1251(0)) {
            class275 var2 = class185.method1355(0, class522.field7392, class395.field5772);
            var2.field4103.method693((byte) 106, 0);
            int var3 = var2.field4103.field1393;
            class673.method3794(false, var2.field4103);
            var2.field4103.method741(var2.field4103.field1393 - var3, 3539);
            class140.method1141(var2, 19321);
        }
        if (class385.field5659 == null) {
            if (class674.field9595 <= class525.method3074((byte) -101)) {
                class385.field5659 = class163.field2727.method1974(class394.field5757.field4425, true);
            }
        } else if (class385.field5659.field1143 != -1) {
            class275 var4 = class185.method1355(0, class476.field6848, class395.field5772);
            var4.field4103.method745(class385.field5659.field1143, 128);
            class140.method1141(var4, 19321);
            class385.field5659 = null;
            class674.field9595 = class525.method3074((byte) -101) + 30000L;
        }
        class441 var5 = (class441) class488.field6985.method1224(-2);
        if (var5 != null || class239.field3538 < (class525.method3074((byte) -101) - 2000L)) {
            class275 var6 = null;
            int var7 = 0;
            for (class441 var8 = (class441) class320.field4698.method1224(-2); var8 != null && (var6 == null || var6.field4103.field1393 - var7 < 240); var8 = (class441) class320.field4698.method1232(-2)) {
                var8.method2588(300);
                int var9 = var8.method1093(5);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1092(-128);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class206.field3160 != var10 || class526.field7417 != var9) {
                    if (var6 == null) {
                        class428.field6166++;
                        var6 = class185.method1355(0, class696.field9802, class395.field5772);
                        var6.field4103.method693((byte) 106, 0);
                        var7 = var6.field4103.field1393;
                    }
                    int var11 = var10 - class206.field3160;
                    class206.field3160 = var10;
                    int var12 = var9 - class526.field7417;
                    class526.field7417 = var9;
                    int var13 = (int) ((var8.method1090(3) - class239.field3538) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field4103.method745((var11 << 6) + (var13 << 12) + var12, 128);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var12 += 128;
                        var6.field4103.method693((byte) 106, var13 + 128);
                        var6.field4103.method745((var11 << 8) + var12, 128);
                    } else if (var13 >= 32) {
                        var6.field4103.method745(var13 + 57344, 128);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4103.method715(Integer.MIN_VALUE, 1949991176);
                        } else {
                            var6.field4103.method715(var9 << 16 | var10, 1949991176);
                        }
                    } else {
                        var6.field4103.method693((byte) 106, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4103.method715(Integer.MIN_VALUE, 1949991176);
                        } else {
                            var6.field4103.method715(var9 << 16 | var10, 1949991176);
                        }
                    }
                    class239.field3538 = var8.method1090(3);
                }
            }
            if (var6 != null) {
                var6.field4103.method741(var6.field4103.field1393 - var7, 3539);
                class140.method1141(var6, 19321);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1090(3) - class418.field6032) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class418.field6032 = var5.method1090(3);
            int var16 = var5.method1093(5);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1092(-128);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1094(true) == 2) {
                var18 = 1;
            }
            class575.field8354++;
            int var19 = (int) var14;
            class275 var20 = class185.method1355(0, class646.field9311, class395.field5772);
            var20.field4103.method725(-384477912, var16 << 16 | var17);
            var20.field4103.method746(0, var18 << 15 | var19);
            class140.method1141(var20, 19321);
        }
        if (class504.field7156 > 0) {
            class703.field9889++;
            class275 var21 = class185.method1355(0, class138.field2446, class395.field5772);
            var21.field4103.method693((byte) 106, class504.field7156 * 3);
            for (int var22 = 0; var22 < class504.field7156; var22++) {
                class53 var23 = class271.field4070[var22];
                long var24 = (var23.method633(-118) - class438.field6316) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class438.field6316 = var23.method633(-50);
                var21.field4103.method693((byte) 106, var23.method635((byte) -95));
                var21.field4103.method745((int) var24, 128);
            }
            class140.method1141(var21, 19321);
        }
        if (class601.field8615 > 0) {
            class601.field8615--;
        }
        if (class292.field4392 && class601.field8615 <= 0) {
            class292.field4392 = false;
            class601.field8615 = 20;
            class275.field4107++;
            class275 var26 = class185.method1355(0, class194.field3054, class395.field5772);
            var26.field4103.method709((int) class591.field8509 >> 3, -103);
            var26.field4103.method745((int) class27.field926 >> 3, 128);
            class140.method1141(var26, 19321);
        }
        if (class584.field8436 != class533.field7479) {
            class584.field8436 = class533.field7479;
            class517.field7299++;
            class275 var27 = class185.method1355(0, class577.field8383, class395.field5772);
            var27.field4103.method693((byte) 106, class533.field7479 ? 1 : 0);
            class140.method1141(var27, 19321);
        }
        if (!class33.field966) {
            class433.field6256++;
            class275 var28 = class185.method1355(0, class655.field9421, class395.field5772);
            var28.field4103.method693((byte) 106, 0);
            int var29 = var28.field4103.field1393;
            class61 var30 = new class61(class180.method1331(-86));
            class527.field7429.method1209(var30, -74);
            var28.field4103.method698(66, var30.field1393, 0, var30.field1397);
            var28.field4103.method741(var28.field4103.field1393 - var29, 3539);
            class140.method1141(var28, 19321);
            class33.field966 = true;
        }
        if (class257.field3792 != null) {
            if (class423.field6123 == 2) {
                class290.method1939(1000);
            } else if (class423.field6123 == 3) {
                class110.method1000(25701);
            }
        }
        if (class194.field3050) {
            class194.field3050 = false;
        } else {
            class623.field9015 /= 2.0F;
        }
        if (class147.field2546) {
            class147.field2546 = false;
        } else {
            class565.field8253 /= 2.0F;
        }
        class640.method3642(true);
        if (class199.field3098 != 10) {
            return;
        }
        class562.method3261((byte) -86);
        class462.method2764(-24874);
        class645.method3677(-127);
        class445.field6405++;
        if (class445.field6405 > 750) {
            class400.method2454(-128);
            return;
        }
        class604.method3458((byte) 36);
        class163.method1246((byte) 76);
        int var31 = -30 % ((arg0 - 19) / 40);
        class152.method1191(0);
        for (int var32 = class113.field2038.method1125(true, (byte) 107); var32 != -1; var32 = class113.field2038.method1125(false, (byte) 85)) {
            class143.method1148(var32, 10090);
            class454.field6485[class481.method2919(class679.field9636++, 31)] = var32;
        }
        for (class19 var33 = class672.method3791(0); var33 != null; var33 = class672.method3791(0)) {
            int var34 = var33.method435(0);
            int var35 = var33.method439(1121826720);
            if (var34 == 1) {
                class650.field9383[var35] = var33.field829;
                class164.field2750 |= class302.field4501[var35];
                class577.field8393[class481.method2919(31, class70.field1484++)] = var35;
            } else if (var34 == 2) {
                class25.field914[var35] = var33.field831;
                class198.field3082[class481.method2919(class478.field6870++, 31)] = var35;
            } else if (var34 == 3) {
                class545 var58 = class415.method2533((byte) 46, var35);
                if (!var33.field831.equals(var58.field7739)) {
                    var58.field7739 = var33.field831;
                    class531.method3088(var58, (byte) 100);
                }
            } else if (var34 == 4) {
                class545 var36 = class415.method2533((byte) 88, var35);
                int var37 = var33.field829;
                int var38 = var33.field833;
                int var39 = var33.field827;
                if (var36.field7602 != var37 || var36.field7742 != var38 || var36.field7677 != var39) {
                    var36.field7742 = var38;
                    var36.field7677 = var39;
                    var36.field7602 = var37;
                    class531.method3088(var36, (byte) 109);
                }
            } else if (var34 == 5) {
                class545 var40 = class415.method2533((byte) -116, var35);
                if (var33.field829 != var40.field7698 || var33.field829 == -1) {
                    var40.field7715 = 0;
                    var40.field7624 = 0;
                    var40.field7661 = 1;
                    var40.field7698 = var33.field829;
                    class138 var41 = var40.field7698 == -1 ? null : class357.field5338.method2099(var40.field7698, true);
                    if (var41 != null) {
                        class130.method1098(var40.field7624, (byte) 88, var41);
                    }
                    class531.method3088(var40, (byte) 108);
                }
            } else if (var34 == 6) {
                int var52 = var33.field829;
                int var53 = var52 >> 10 & 0x1F;
                int var54 = var52 >> 5 & 0x1F;
                int var55 = var52 & 0x1F;
                int var56 = (var55 << 3) + ((var53 << 19) + (var54 << 11));
                class545 var57 = class415.method2533((byte) -110, var35);
                if (var57.field7608 != var56) {
                    var57.field7608 = var56;
                    class531.method3088(var57, (byte) 19);
                }
            } else if (var34 == 7) {
                class545 var42 = class415.method2533((byte) -53, var35);
                boolean var43 = var33.field829 == 1;
                if (var43 != var42.field7690) {
                    var42.field7690 = var43;
                    class531.method3088(var42, (byte) 48);
                }
            } else if (var34 == 8) {
                class545 var51 = class415.method2533((byte) 83, var35);
                if (var33.field829 != var51.field7737 || var33.field833 != var51.field7635 || var33.field827 != var51.field7688) {
                    var51.field7688 = var33.field827;
                    var51.field7635 = var33.field833;
                    var51.field7737 = var33.field829;
                    if (var51.field7702 != -1) {
                        if (var51.field7743 > 0) {
                            var51.field7688 = var51.field7688 * 32 / var51.field7743;
                        } else if (var51.field7658 > 0) {
                            var51.field7688 = var51.field7688 * 32 / var51.field7658;
                        }
                    }
                    class531.method3088(var51, (byte) 95);
                }
            } else if (var34 == 9) {
                class545 var44 = class415.method2533((byte) -97, var35);
                if (var33.field829 != var44.field7702 || var33.field833 != var44.field7687) {
                    var44.field7687 = var33.field833;
                    var44.field7702 = var33.field829;
                    class531.method3088(var44, (byte) 91);
                }
            } else if (var34 == 10) {
                class545 var50 = class415.method2533((byte) -65, var35);
                if (var33.field829 != var50.field7595 || var33.field833 != var50.field7754 || var33.field827 != var50.field7756) {
                    var50.field7754 = var33.field833;
                    var50.field7756 = var33.field827;
                    var50.field7595 = var33.field829;
                    class531.method3088(var50, (byte) 85);
                }
            } else if (var34 == 11) {
                class545 var49 = class415.method2533((byte) 80, var35);
                var49.field7751 = var49.field7708 = var33.field829;
                var49.field7592 = var49.field7731 = var33.field833;
                var49.field7725 = 0;
                var49.field7634 = 0;
                class531.method3088(var49, (byte) 63);
            } else if (var34 == 12) {
                class545 var47 = class415.method2533((byte) 59, var35);
                int var48 = var33.field829;
                if (var47 != null && var47.field7649 == 0) {
                    if (var48 > (var47.field7699 - var47.field7652)) {
                        var48 = var47.field7699 - var47.field7652;
                    }
                    if (var48 < 0) {
                        var48 = 0;
                    }
                    if (var47.field7716 != var48) {
                        var47.field7716 = var48;
                        class531.method3088(var47, (byte) 35);
                    }
                }
            } else if (var34 == 14) {
                class545 var46 = class415.method2533((byte) -90, var35);
                var46.field7685 = var33.field829;
            } else if (var34 == 15) {
                class459.field6558 = var33.field829;
                class202.field3118 = true;
                class51.field1189 = var33.field833;
            } else if (var34 == 16) {
                class545 var45 = class415.method2533((byte) -121, var35);
                var45.field7669 = var33.field829;
            }
        }
        class620.field8990++;
        if (class137.field2426 != 0) {
            class469.field6641 += 20;
            if (class469.field6641 >= 400) {
                class137.field2426 = 0;
            }
        }
        if (class659.field9503 != null) {
            class177.field2888++;
            if (class177.field2888 >= 15) {
                class531.method3088(class659.field9503, (byte) 90);
                class659.field9503 = null;
            }
        }
        class36.field1037 = null;
        class282.field4183 = false;
        class72.field1494 = null;
        class478.field6865 = false;
        class46.method593(-1, (byte) 66, -1, null);
        class291.method1943(null, 10, -1, -1);
        if (!class65.field1435) {
            class139.field2461 = -1;
        }
        class292.method1946((byte) -122);
        class104.field1844++;
        if (class189.field3020) {
            class24.field894++;
            class275 var59 = class185.method1355(0, class277.field4151, class395.field5772);
            var59.field4103.method715(class273.field4098 << 28 | class1.field194 << 14 | class430.field6216, 1949991176);
            class140.method1141(var59, 19321);
            class189.field3020 = false;
        }
        while (true) {
            class476 var60;
            class545 var61;
            class545 var62;
            do {
                var60 = (class476) class271.field4065.method1226(0);
                if (var60 == null) {
                    while (true) {
                        class476 var63;
                        class545 var64;
                        class545 var65;
                        do {
                            var63 = (class476) class181.field2926.method1226(0);
                            if (var63 == null) {
                                while (true) {
                                    class476 var66;
                                    class545 var67;
                                    class545 var68;
                                    do {
                                        var66 = (class476) class610.field8886.method1226(0);
                                        if (var66 == null) {
                                            if (class36.field1037 == null) {
                                                class386.field5665 = 0;
                                            }
                                            if (class44.field1094 != null) {
                                                class242.method1608(-2);
                                            }
                                            if (class249.field3737 > 0 && class486.field6965.method2194(82, (byte) 77) && class486.field6965.method2194(81, (byte) -95) && class675.field9599 != 0) {
                                                int var69 = class532.field7456.field9814 - class675.field9599;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class99.method935(var69, class532.field7456.field8787[0] + class33.field967, class532.field7456.field8785[0] + class323.field4749, 63);
                                            }
                                            class231.method1564((byte) -126);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class2.field379[var70]++;
                                            }
                                            if (class164.field2750 && class542.field7565 < (class525.method3074((byte) -101) - 60000L)) {
                                                class239.method1587((byte) 69);
                                            }
                                            for (class208 var71 = (class208) class195.field3065.method3317(-121); var71 != null; var71 = (class208) class195.field3065.method3321(-121)) {
                                                if (class525.method3074((byte) -101) / 1000L - 5L > (long) var71.field3182) {
                                                    if (var71.field3180 > 0) {
                                                        class428.method2605("", "", "", 5, 0, 4096, var71.field3181 + class265.field3894.method1733(255, class140.field2466));
                                                    }
                                                    if (var71.field3180 == 0) {
                                                        class428.method2605("", "", "", 5, 0, 4096, var71.field3181 + class265.field3895.method1733(255, class140.field2466));
                                                    }
                                                    var71.method1318(8);
                                                }
                                            }
                                            class283.field4203++;
                                            if (class283.field4203 > 500) {
                                                class283.field4203 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x4) == 4) {
                                                    class295.field4422 += class457.field6511;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class121.field2217 += class294.field4410;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class27.field924 += class625.field9025;
                                                }
                                            }
                                            if (class27.field924 < -50) {
                                                class625.field9025 = 2;
                                            }
                                            if (class121.field2217 < -55) {
                                                class294.field4410 = 2;
                                            }
                                            if (class27.field924 > 50) {
                                                class625.field9025 = -2;
                                            }
                                            if (class295.field4422 < -40) {
                                                class457.field6511 = 1;
                                            }
                                            if (class121.field2217 > 55) {
                                                class294.field4410 = -2;
                                            }
                                            class479.field6878++;
                                            if (class295.field4422 > 40) {
                                                class457.field6511 = -1;
                                            }
                                            if (class479.field6878 > 500) {
                                                class479.field6878 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class527.field7433 += class207.field3176;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class130.field2350 += class504.field7164;
                                                }
                                            }
                                            if (class527.field7433 < -60) {
                                                class207.field3176 = 2;
                                            }
                                            if (class527.field7433 > 60) {
                                                class207.field3176 = -2;
                                            }
                                            if (class130.field2350 < -20) {
                                                class504.field7164 = 1;
                                            }
                                            if (class130.field2350 > 10) {
                                                class504.field7164 = -1;
                                            }
                                            class6.field500++;
                                            if (class6.field500 > 50) {
                                                class208.field3183++;
                                                class275 var74 = class185.method1355(0, class392.field5746, class395.field5772);
                                                class140.method1141(var74, 19321);
                                            }
                                            if (class590.field8486) {
                                                class361.method2305(-54);
                                                class590.field8486 = false;
                                            }
                                            try {
                                                class469.method2804(true);
                                                return;
                                            } catch (IOException var75) {
                                                class400.method2454(-74);
                                                return;
                                            }
                                        }
                                        var67 = var66.field6850;
                                        if (var67.field7697 < 0) {
                                            break;
                                        }
                                        var68 = class415.method2533((byte) -119, var67.field7733);
                                    } while (var68 == null || var68.field7641 == null || var67.field7697 >= var68.field7641.length || var68.field7641[var67.field7697] != var67);
                                    class683.method3847(var66);
                                }
                            }
                            var64 = var63.field6850;
                            if (var64.field7697 < 0) {
                                break;
                            }
                            var65 = class415.method2533((byte) -50, var64.field7733);
                        } while (var65 == null || var65.field7641 == null || var65.field7641.length <= var64.field7697 || var65.field7641[var64.field7697] != var64);
                        class683.method3847(var63);
                    }
                }
                var61 = var60.field6850;
                if (var61.field7697 < 0) {
                    break;
                }
                var62 = class415.method2533((byte) -91, var61.field7733);
            } while (var62 == null || var62.field7641 == null || var62.field7641.length <= var61.field7697 || var62.field7641[var61.field7697] != var61);
            class683.method3847(var60);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lqh;I)V")
    public final void method1442(class61 arg0, int arg1) {
        field3141++;
        while (true) {
            int var3 = arg0.method732(arg1 ^ 0x2159DF1B);
            if (var3 == 0) {
                if (arg1 == -61) {
                    return;
                } else {
                    method1441(-43);
                    return;
                }
            }
            this.method1444(var3, arg0, arg1 ^ 0xA);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)V")
    public static final void method1443(int arg0, byte arg1) {
        int var2 = 52 % ((arg0 - 32) / 41);
        field3148++;
        if (class483.field6917 == null) {
            class483.field6917 = new byte[4][class675.field9604][class218.field3316];
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class675.field9604; var4++) {
                for (int var5 = 0; var5 < class218.field3316; var5++) {
                    class483.field6917[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILqh;I)V")
    private final void method1444(int arg0, class61 arg1, int arg2) {
        if (arg0 == 2) {
            this.field3147 = arg1.method723((byte) -25);
        }
        field3143++;
        if (arg2 != -55) {
            this.method1444(36, null, 15);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
    public static void method1445(byte arg0) {
        if (arg0 == -33) {
            field3145 = null;
        }
    }
}

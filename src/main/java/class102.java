import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class102 extends class194 {

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    private int field1185 = 4096;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1187 = new String[100];

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "[[[B")
    public static byte[][][] field1186;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)J")
    public static final long method613(byte arg0) {
        if (arg0 != -54) {
            method616(-114);
        }
        ++field1192;
        return class89.field1027.method1986((byte) 127);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1184;
        int var3 = 23 % ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 119, arg0 + -1 & class210.field2551);
            int[] var6 = this.method1203(0, 109, arg0);
            int[] var7 = this.method1203(0, 114, arg0 + 1 & class210.field2551);
            for (int var8 = 0; var8 < class138.field1579; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field1185;
                int var10 = (var6[class442.field6113 & var8 + 1] + -var6[var8 - 1 & class442.field6113]) * this.field1185;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field1188;
        int var4 = 62 / ((arg1 - 52) / 61);
        if (~arg0 == -1) {
            this.field1185 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, true);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public static final void method614(boolean arg0) {
        ++field1191;
        if (~class276.field3571 < -2) {
            --class276.field3571;
            class364.field4955 = class383.field5246;
        }
        if (~class40.field484 < -1) {
            --class40.field484;
        }
        if (class420.field5755) {
            class420.field5755 = false;
            class143.method921(14445);
        } else {
            if (!class49.field574) {
                class398.method2458(true);
            }
            for (int var1 = 0; ~var1 > -101 && class349.method2224(110); ++var1) {
            }
            if (class174.field2017 == 30) {
                class346.method2199(class427.field5837, (byte) 92, 191);
                if (class208.field2516 != null || -2000L + class164.method1038(8635) > class190.field2225) {
                    boolean var2 = false;
                    int var3 = class427.field5837.field3211;
                    for (class373 var4 = (class373) class186.field2159.method1690((byte) -116); var4 != null && -var3 + class427.field5837.field3211 < 240; var4 = (class373) class186.field2159.method1699((byte) 47)) {
                        var4.method263(false);
                        int var5 = var4.method2(false);
                        if (~var5 <= -1) {
                            if (var5 > 65534) {
                                var5 = 65534;
                            }
                        } else {
                            var5 = 0;
                        }
                        int var6 = var4.method5(27878);
                        if (~var6 > -1) {
                            var6 = 0;
                        } else if (var6 > 65534) {
                            var6 = 65534;
                        }
                        boolean var7 = false;
                        if (var4.method2(arg0) == -1 && ~var4.method5(27878) == 0) {
                            var5 = -1;
                            var6 = -1;
                            var7 = true;
                        }
                        if (class98.field1147 != var6 || class280.field3623 != var5) {
                            if (!var2) {
                                class427.field5837.method2162(false, 114);
                                ++class240.field3152;
                                class427.field5837.method1593(0, -92);
                                var3 = class427.field5837.field3211;
                                var2 = true;
                            }
                            int var8 = -class98.field1147 + var6;
                            class98.field1147 = var6;
                            int var9 = var5 - class280.field3623;
                            class280.field3623 = var5;
                            int var10 = (int) ((var4.method3((byte) -126) - class190.field2225) / 20L);
                            if (~var10 > -9 && ~var8 <= 31 && ~var8 >= -32 && var9 >= -32 && ~var9 >= -32) {
                                var9 += 32;
                                var8 += 32;
                                class427.field5837.method1573(-6266, (var8 << 6) + (var10 << 12) + var9);
                            } else if (~var10 > -33 && var8 >= -128 && var8 <= 127 && ~var9 <= 127 && var9 <= 127) {
                                var8 += 128;
                                var9 += 128;
                                class427.field5837.method1593(128 - -var10, -122);
                                class427.field5837.method1573(-6266, (var8 << 8) - -var9);
                            } else if (var10 >= 32) {
                                class427.field5837.method1573(-6266, 57344 - -var10);
                                if (!var7) {
                                    class427.field5837.method1560(-26356, var5 << 16 | var6);
                                } else {
                                    class427.field5837.method1560(-26356, Integer.MIN_VALUE);
                                }
                            } else {
                                class427.field5837.method1593(var10 + 192, -106);
                                if (!var7) {
                                    class427.field5837.method1560(-26356, var5 << 16 | var6);
                                } else {
                                    class427.field5837.method1560(-26356, Integer.MIN_VALUE);
                                }
                            }
                            class190.field2225 = var4.method3((byte) -120);
                        }
                    }
                    if (var2) {
                        class427.field5837.method1597(-var3 + class427.field5837.field3211, -106);
                    }
                }
                if (class208.field2516 != null) {
                    long var11 = (class208.field2516.method3((byte) -113) - class293.field3858) / 50L;
                    if (~var11 < -32768L) {
                        var11 = 32767L;
                    }
                    class293.field3858 = class208.field2516.method3((byte) -104);
                    int var13 = class208.field2516.method2(arg0);
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = class208.field2516.method5(27878);
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    byte var15 = 0;
                    if (~class208.field2516.method6(arg0) == -3) {
                        var15 = 1;
                    }
                    class427.field5837.method2162(arg0, 65);
                    ++class163.field1898;
                    int var16 = (int) var11;
                    class427.field5837.method1595((byte) 90, var13 << 16 | var14);
                    class427.field5837.method1592(var15 << 15 | var16, (byte) -83);
                }
                if (class40.field481 > 0) {
                    int var17 = 0;
                    for (int var18 = 0; ~var18 > ~class40.field481; ++var18) {
                        if (class6.field56[var18].method324((byte) -81)) {
                            ++var17;
                        }
                    }
                    if (~var17 < -1) {
                        class427.field5837.method2162(false, 119);
                        ++class5.field32;
                        if (~var17 < -76) {
                            var17 = 75;
                        }
                        class427.field5837.method1593(var17 * 3, -128);
                        for (int var19 = 0; class40.field481 > var19; ++var19) {
                            class57 var20 = class6.field56[var19];
                            if (var20.method324((byte) -113)) {
                                long var21 = (var20.method321(-16) - class152.field1768) / 50L;
                                class152.field1768 = var20.method321(-16);
                                if (~var21 < -65536L) {
                                    var21 = 65535L;
                                }
                                class427.field5837.method1593(var20.method323(0), -97);
                                class427.field5837.method1573(-6266, (int) var21);
                            }
                        }
                    }
                }
                if (~class379.field5161 < -1) {
                    --class379.field5161;
                }
                if (class392.field5340 && ~class379.field5161 >= -1) {
                    ++class200.field2360;
                    class392.field5340 = false;
                    class379.field5161 = 20;
                    class427.field5837.method2162(false, 84);
                    class427.field5837.method1588((int) class434.field5929 >> 3, -71);
                    class427.field5837.method1588((int) class301.field4020 >> 3, -55);
                }
                if (class178.field2084 && !class272.field3508) {
                    class272.field3508 = true;
                    ++class141.field1632;
                    class427.field5837.method2162(arg0, 118);
                    class427.field5837.method1593(1, -125);
                }
                if (!class178.field2084 && class272.field3508) {
                    ++class141.field1632;
                    class272.field3508 = false;
                    class427.field5837.method2162(false, 118);
                    class427.field5837.method1593(0, -106);
                }
                if (!class75.field905) {
                    class427.field5837.method2162(false, 228);
                    ++class183.field2123;
                    class427.field5837.method1554(-1844808528, class389.method2416(32364));
                    class75.field905 = true;
                }
                if (class347.field4722 != null) {
                    if (~class320.field4294 != -3) {
                        if (class320.field4294 == 3) {
                            class307.method1953(false);
                        }
                    } else {
                        class146.method944(false);
                    }
                }
                if (!class140.field1629) {
                    class49.field571 /= 2.0F;
                } else {
                    class140.field1629 = false;
                }
                if (class380.field5165) {
                    class380.field5165 = false;
                } else {
                    class288.field3792 /= 2.0F;
                }
                class420.method2575(32417);
                if (class174.field2017 == 30) {
                    class51.method296((byte) -46);
                    class379.method2358((byte) -65);
                    class285.method1814((byte) 80);
                    ++class383.field5248;
                    if (class383.field5248 > 750) {
                        class143.method921(14445);
                    } else {
                        class306.method1941((byte) -119);
                        class431.method2625(false);
                        class174.method1093(0);
                        for (int var23 = class444.method2744((byte) -118, true); var23 != -1; var23 = class444.method2744((byte) -126, false)) {
                            class266.method1665(true, var23);
                            class204.field2469[class191.method1183(31, class283.field3709++)] = var23;
                        }
                        for (class12 var24 = class326.method2042(0); var24 != null; var24 = class326.method2042(0)) {
                            int var25 = var24.method67(-1834579454);
                            int var26 = var24.method62((byte) 61);
                            if (var25 == 1) {
                                class198.field2338[var26] = var24.field144;
                                class181.field2109 |= class53.field618[var26];
                                class262.field3370[class191.method1183(31, class17.field184++)] = var26;
                            } else if (var25 != 2) {
                                if (~var25 != -4) {
                                    if (~var25 == -5) {
                                        class453 var27 = class195.method1212(var26, (byte) 49);
                                        int var28 = var24.field144;
                                        int var29 = var24.field152;
                                        int var30 = var24.field149;
                                        if (var27.field6411 != var28 || ~var27.field6435 != ~var29 || var27.field6330 != var30) {
                                            var27.field6435 = var29;
                                            var27.field6411 = var28;
                                            var27.field6330 = var30;
                                            class303.method1923(var27, 10240);
                                        }
                                    } else if (~var25 != -6) {
                                        if (var25 == 6) {
                                            int var31 = var24.field144;
                                            int var32 = 31 & var31 >> 10;
                                            int var33 = var31 >> 5 & 31;
                                            int var34 = var31 & 31;
                                            int var35 = (var34 << 3) + (var32 << 19) + (var33 << 11);
                                            class453 var36 = class195.method1212(var26, (byte) 49);
                                            if (~var36.field6357 != ~var35) {
                                                var36.field6357 = var35;
                                                class303.method1923(var36, 10240);
                                            }
                                        } else if (var25 != 7) {
                                            if (~var25 == -9) {
                                                class453 var37 = class195.method1212(var26, (byte) 49);
                                                if (~var24.field144 != ~var37.field6478 || var24.field152 != var37.field6332 || ~var24.field149 != ~var37.field6414) {
                                                    var37.field6478 = var24.field144;
                                                    var37.field6332 = var24.field152;
                                                    var37.field6414 = var24.field149;
                                                    if (~var37.field6358 != 0) {
                                                        if (var37.field6398 > 0) {
                                                            var37.field6414 = var37.field6414 * 32 / var37.field6398;
                                                        } else if (var37.field6390 > 0) {
                                                            var37.field6414 = var37.field6414 * 32 / var37.field6390;
                                                        }
                                                    }
                                                    class303.method1923(var37, 10240);
                                                }
                                            } else if (~var25 == -10) {
                                                class453 var38 = class195.method1212(var26, (byte) 49);
                                                if (var24.field144 != var38.field6358 || var24.field152 != var38.field6453) {
                                                    var38.field6453 = var24.field152;
                                                    var38.field6358 = var24.field144;
                                                    class303.method1923(var38, 10240);
                                                }
                                            } else if (~var25 != -11) {
                                                if (~var25 != -12) {
                                                    if (~var25 == -13) {
                                                        class453 var39 = class195.method1212(var26, (byte) 49);
                                                        int var40 = var24.field144;
                                                        if (var39 != null && ~var39.field6383 == -1) {
                                                            if (var40 > var39.field6417 - var39.field6432) {
                                                                var40 = -var39.field6432 + var39.field6417;
                                                            }
                                                            if (~var40 > -1) {
                                                                var40 = 0;
                                                            }
                                                            if (~var39.field6386 != ~var40) {
                                                                var39.field6386 = var40;
                                                                class303.method1923(var39, 10240);
                                                            }
                                                        }
                                                    } else if (~var25 != -15) {
                                                        if (var25 == 15) {
                                                            class249.field3276 = var24.field152;
                                                            class90.field1043 = var24.field144;
                                                            class319.field4292 = true;
                                                        } else if (var25 == 16) {
                                                            class453 var41 = class195.method1212(var26, (byte) 49);
                                                            var41.field6403 = var24.field144;
                                                        }
                                                    } else {
                                                        class453 var42 = class195.method1212(var26, (byte) 49);
                                                        var42.field6460 = var24.field144;
                                                    }
                                                } else {
                                                    class453 var43 = class195.method1212(var26, (byte) 49);
                                                    var43.field6394 = var43.field6474 = var24.field144;
                                                    var43.field6454 = 0;
                                                    var43.field6416 = 0;
                                                    var43.field6434 = var43.field6381 = var24.field152;
                                                    class303.method1923(var43, 10240);
                                                }
                                            } else {
                                                class453 var44 = class195.method1212(var26, (byte) 49);
                                                if (~var24.field144 != ~var44.field6457 || var24.field152 != var44.field6351 || ~var24.field149 != ~var44.field6477) {
                                                    var44.field6477 = var24.field149;
                                                    var44.field6351 = var24.field152;
                                                    var44.field6457 = var24.field144;
                                                    class303.method1923(var44, 10240);
                                                }
                                            }
                                        } else {
                                            class453 var45 = class195.method1212(var26, (byte) 49);
                                            boolean var46 = var24.field144 == 1;
                                            if (var46 == !var45.field6459) {
                                                var45.field6459 = var46;
                                                class303.method1923(var45, 10240);
                                            }
                                        }
                                    } else {
                                        class453 var47 = class195.method1212(var26, (byte) 49);
                                        if (~var24.field144 != ~var47.field6426 || var24.field144 == -1) {
                                            var47.field6315 = 0;
                                            var47.field6331 = 1;
                                            var47.field6426 = var24.field144;
                                            var47.field6439 = 0;
                                            class303.method1923(var47, 10240);
                                        }
                                    }
                                } else {
                                    class453 var48 = class195.method1212(var26, (byte) 49);
                                    if (!var24.field140.equals(var48.field6406)) {
                                        var48.field6406 = var24.field140;
                                        class303.method1923(var48, 10240);
                                    }
                                }
                            } else {
                                class51.field597[var26] = var24.field140;
                                class282.field3681[class191.method1183(31, class346.field4698++)] = var26;
                            }
                        }
                        ++class439.field6032;
                        if (~class432.field5904 != -1) {
                            client.field6058 += 20;
                            if (client.field6058 >= 400) {
                                class432.field5904 = 0;
                            }
                        }
                        if (class27.field306 != null) {
                            ++class308.field4181;
                            if (class308.field4181 >= 15) {
                                class303.method1923(class27.field306, 10240);
                                class27.field306 = null;
                            }
                        }
                        class262.field3369 = false;
                        class334.field4561 = null;
                        class143.field1683 = arg0;
                        class310.field4200 = null;
                        class333.method2135((class453) null, 2, -1, -1);
                        class2.method10(-84, (class453) null, -1, -1);
                        class399.method2470((byte) -24);
                        ++class383.field5246;
                        if (class252.field3304) {
                            ++class141.field1646;
                            class427.field5837.method2162(false, 185);
                            class427.field5837.method1595((byte) 124, class310.field4204 << 14 | class106.field1255 << 28 | class23.field251);
                            class252.field3304 = false;
                        }
                        while (true) {
                            class221 var49;
                            class453 var50;
                            class453 var51;
                            do {
                                var49 = (class221) class161.field1871.method1688(114);
                                if (var49 == null) {
                                    while (true) {
                                        class221 var52;
                                        class453 var53;
                                        class453 var54;
                                        do {
                                            var52 = (class221) class53.field625.method1688(117);
                                            if (var52 == null) {
                                                while (true) {
                                                    class221 var55;
                                                    class453 var56;
                                                    class453 var57;
                                                    do {
                                                        var55 = (class221) class302.field4054.method1688(113);
                                                        if (var55 == null) {
                                                            if (class310.field4200 == null) {
                                                                class38.field453 = 0;
                                                            }
                                                            if (class264.field3404 != null) {
                                                                class361.method2271((byte) 119);
                                                            }
                                                            if (class427.field5842 > 0 && class261.field3359.method623(9, 82) && class261.field3359.method623(9, 81) && class236.field3097 != 0) {
                                                                int var58 = -class236.field3097 + class43.field513;
                                                                if (var58 >= 0) {
                                                                    if (var58 > 3) {
                                                                        var58 = 3;
                                                                    }
                                                                } else {
                                                                    var58 = 0;
                                                                }
                                                                class424.method2597(class129.field1432 - -class143.field1684.field2482[0], var58, class278.field3608 - -class143.field1684.field2480[0], 66885254);
                                                            }
                                                            class357.method2255(89);
                                                            for (int var59 = 0; ~var59 > -6; ++var59) {
                                                                int var10002 = class153.field1790[var59]++;
                                                            }
                                                            if (class181.field2109 && class368.field5015 < -60000L + class164.method1038(8635)) {
                                                                class380.method2363(940);
                                                            }
                                                            ++class368.field5016;
                                                            if (~class368.field5016 < -501) {
                                                                class368.field5016 = 0;
                                                                int var60 = (int) (Math.random() * 8.0D);
                                                                if ((var60 & 4) == 4) {
                                                                    class301.field4019 += class449.field6274;
                                                                }
                                                                if ((var60 & 2) == 2) {
                                                                    class79.field968 += class349.field4762;
                                                                }
                                                                if ((var60 & 1) == 1) {
                                                                    class314.field4235 += class23.field248;
                                                                }
                                                            }
                                                            if (class314.field4235 < -50) {
                                                                class23.field248 = 2;
                                                            }
                                                            if (class79.field968 < -55) {
                                                                class349.field4762 = 2;
                                                            }
                                                            if (~class314.field4235 < -51) {
                                                                class23.field248 = -2;
                                                            }
                                                            if (class79.field968 > 55) {
                                                                class349.field4762 = -2;
                                                            }
                                                            if (~class301.field4019 > 39) {
                                                                class449.field6274 = 1;
                                                            }
                                                            if (~class301.field4019 < -41) {
                                                                class449.field6274 = -1;
                                                            }
                                                            ++class281.field3664;
                                                            if (~class281.field3664 < -501) {
                                                                class281.field3664 = 0;
                                                                int var61 = (int) (Math.random() * 8.0D);
                                                                if (~(2 & var61) == -3) {
                                                                    class280.field3627 += class127.field1416;
                                                                }
                                                                if (~(1 & var61) == -2) {
                                                                    class231.field3043 += class116.field1339;
                                                                }
                                                            }
                                                            if (~class231.field3043 > 59) {
                                                                class116.field1339 = 2;
                                                            }
                                                            if (~class231.field3043 < -61) {
                                                                class116.field1339 = -2;
                                                            }
                                                            if (~class280.field3627 > 19) {
                                                                class127.field1416 = 1;
                                                            }
                                                            if (~class280.field3627 < -11) {
                                                                class127.field1416 = -1;
                                                            }
                                                            ++class72.field898;
                                                            if (~class72.field898 < -51) {
                                                                class427.field5837.method2162(false, 95);
                                                                ++class314.field4228;
                                                            }
                                                            if (class68.field823) {
                                                                class119.method798(-13);
                                                                class68.field823 = false;
                                                            }
                                                            try {
                                                                if (class181.field2107 != null && ~class427.field5837.field3211 < -1) {
                                                                    class181.field2107.method2464((byte) 93, 0, class427.field5837.field3211, class427.field5837.field3188);
                                                                    class427.field5837.field3211 = 0;
                                                                    class72.field898 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var62) {
                                                                class143.method921(14445);
                                                                return;
                                                            }
                                                        }
                                                        var56 = var55.field2732;
                                                        if (~var56.field6364 > -1) {
                                                            break;
                                                        }
                                                        var57 = class195.method1212(var56.field6462, (byte) 49);
                                                    } while (var57 == null || var57.field6350 == null || var56.field6364 >= var57.field6350.length || var57.field6350[var56.field6364] != var56);
                                                    class93.method578(var55);
                                                }
                                            }
                                            var53 = var52.field2732;
                                            if (~var53.field6364 > -1) {
                                                break;
                                            }
                                            var54 = class195.method1212(var53.field6462, (byte) 49);
                                        } while (var54 == null || var54.field6350 == null || var54.field6350.length <= var53.field6364 || var54.field6350[var53.field6364] != var53);
                                        class93.method578(var52);
                                    }
                                }
                                var50 = var49.field2732;
                                if (~var50.field6364 > -1) {
                                    break;
                                }
                                var51 = class195.method1212(var50.field6462, (byte) 49);
                            } while (var51 == null || var51.field6350 == null || var50.field6364 >= var51.field6350.length || var51.field6350[var50.field6364] != var50);
                            class93.method578(var49);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
    public static final void method615(int arg0, boolean arg1) {
        if (arg1 && class224.field2802 != null) {
            class17.field187 = class224.field2802.field2313;
        } else {
            class17.field187 = -1;
        }
        ++field1190;
        class224.field2802 = null;
        class342.field4655 = 0;
        class310.field4200 = null;
        class141.field1663 = null;
        class224.method1364();
        class224.field2806.method1701(true);
        class414.field5680 = null;
        class55.field637 = null;
        class212.field2588 = null;
        class419.field5717 = -1;
        class41.field489 = null;
        class282.field3685 = null;
        class8.field75 = null;
        class157.field1832 = -1;
        class224.field2805 = null;
        class340.field4643 = null;
        class373.field5059 = null;
        class438.field6019 = null;
        class167.method1063(-114);
        class356.method2251(45, 128, 64);
        class341.method2184(64, 64, (byte) -84);
        if (arg0 > -84) {
            field1189 = -114;
        }
        class236.method1516(64, 101);
        class334.method2145(69, 64);
    }

    @OriginalMember(owner = "client!io", name = "h", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1186 = null;
        field1187 = null;
        if (arg0 >= -6) {
            field1189 = 32;
        }
    }
}

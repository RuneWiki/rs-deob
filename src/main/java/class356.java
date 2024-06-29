import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class356 extends class115 {

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    private int field5218 = 4;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    private int field5205 = 4;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field5209 = 0;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field5217 = 1;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Z")
    public static boolean field5221 = false;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
    public static int[] field5206;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILen;)V", line = 4)
    public static final void method2269(int arg0, class174 arg1) {
        ++field5216;
        if (class57.field654 >= 0 && class48.field562 >= 0 && class1.field9 != 0 && class216.field2946 != 0) {
            arg1.method971(class111.field1284, class302.field4301, class1.field9, class216.field2946);
            arg1.method968(class223.field3051, class30.field273, class1.field9, class216.field2946);
            class71 var2 = arg1.method922();
            var2.method127(class152.field2139, class147.field2059, class269.field3783, class199.field2716, class88.field991, class102.field1157);
            arg1.method949(var2);
            if (~class423.field6070 == -1 && class78.field887 != null) {
                int var3 = -1;
                int var4 = -1;
                int var5 = arg1.method992();
                int var6 = (-class111.field1284 + class57.field654) * var5 / class1.field9;
                int var7 = (-class302.field4301 + class48.field562) * var5 / class216.field2946;
                int var8 = arg1.method959();
                int var9 = (-class111.field1284 + class57.field654) * var8 / class1.field9;
                int var10 = (-class302.field4301 + class48.field562) * var8 / class216.field2946;
                int[] var11 = new int[] { var6, var7, var5 };
                var2.method121(var11);
                int[] var12 = new int[] { var9, var10, var8 };
                var2.method121(var12);
                float var13 = 0.0F;
                int var14 = var12[0] + -var11[0];
                int var15 = var12[1] + -var11[1];
                int var16 = var12[2] - var11[2];
                while (var13 < 1.0F) {
                    int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                    int var18 = var17 >> 7;
                    int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                    int var20 = var19 >> 7;
                    if (~var18 < -1 && ~var20 < -1 && class279.field3935 > var18 && ~class164.field2287 < ~var20) {
                        int var21 = class410.field5931;
                        if (var21 < 3 && ~(class166.field2327[1][var18][var20] & 2) != -1) {
                            ++var21;
                        }
                        if ((float) class78.field887[var21].method1991(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                            var3 = 64 * class390.field5715.method786((byte) 70) + var17 + -64 >> 7;
                            var4 = var19 + -64 + 64 * class390.field5715.method786((byte) 70) >> 7;
                            break;
                        }
                    }
                    var13 = (float) ((double) var13 + 0.01D);
                }
                if (var3 != -1 && ~var4 != 0) {
                    if (class271.field3842 && (class289.field4103 & 64) != 0) {
                        class119 var22 = class354.method2262(-128, class24.field243, class199.field2715);
                        if (var22 == null) {
                            class428.method2664(arg0 ^ 22304);
                        } else {
                            class70.method411(1, class110.field1275, " ->", class338.field5007, 0, var3, var4, 0L);
                        }
                    } else {
                        if (~class136.field1912 == -2) {
                            class70.method411(21, class437.field6408, "", -1, 0, var3, var4, 0L);
                        }
                        class70.method411(59, class433.field6286, "", -1, 0, var3, var4, 0L);
                        ++class138.field1961;
                    }
                }
            }
            class257 var23 = class148.field2068;
            if (arg0 == -22305) {
                for (class19 var24 = (class19) var23.method1604((byte) 92); var24 != null; var24 = (class19) var23.method1612(-1)) {
                    if (var24.method134(class57.field654, class48.field562, arg1, (byte) -72) && ~class410.field5931 == ~var24.field193) {
                        if (var24.field189 instanceof class133) {
                            class133 var25 = (class133) var24.field189;
                            int var26 = var25.method786((byte) 70);
                            if (~(var26 & 1) == -1 && (127 & var25.field1304) == 0 && ~(127 & var25.field1311) == -1 || (1 & var26) == 1 && (127 & var25.field1304) == 64 && (var25.field1311 & 127) == 64) {
                                int var27 = var25.field1304 + -((var25.method786((byte) 70) + -1) * 64);
                                int var28 = var25.field1311 - (-1 + var25.method786((byte) 70)) * 64;
                                for (int var29 = 0; ~var29 > ~class426.field6168; ++var29) {
                                    class358 var34 = class81.field917[class201.field2770[var29]];
                                    if (var34 != null && class221.field3033 != var34.field6273 && var34.field6287) {
                                        int var35 = var34.field1304 + 64 + -(var34.field5229.field4982 * 64);
                                        int var36 = -(var34.field5229.field4982 * 64) + 64 + var34.field1311;
                                        if (var35 >= var27 && ~var34.field5229.field4982 >= ~(-(-var27 + var35 >> 7) + var25.method786((byte) 70)) && ~var28 >= ~var36 && ~var34.field5229.field4982 >= ~(-(-var28 + var36 >> 7) + var25.method786((byte) 70))) {
                                            class195.method1238(true, var34);
                                            var34.field6273 = class221.field3033;
                                        }
                                    }
                                }
                                for (int var30 = 0; ~class148.field2082 < ~var30; ++var30) {
                                    class133 var31 = class375.field5473[class294.field4217[var30]];
                                    if (var31 != null && class221.field3033 != var31.field6273 && var25 != var31 && var31.field6287) {
                                        int var32 = var31.field1304 - -64 - var31.method786((byte) 70) * 64;
                                        int var33 = var31.field1311 - (64 * var31.method786((byte) 70) + -64);
                                        if (var27 <= var32 && var31.method786((byte) 70) <= var25.method786((byte) 70) + -(var32 - var27 >> 7) && ~var33 <= ~var28 && var31.method786((byte) 70) <= var25.method786((byte) 70) - (-var28 + var33 >> 7)) {
                                            class393.method2509(-55, var31);
                                            var31.field6273 = class221.field3033;
                                        }
                                    }
                                }
                            }
                            if (class221.field3033 == var25.field6273) {
                                continue;
                            }
                            class393.method2509(-50, var25);
                            var25.field6273 = class221.field3033;
                        }
                        if (var24.field189 instanceof class358) {
                            class358 var37 = (class358) var24.field189;
                            if (var37.field5229 != null) {
                                if (~(1 & var37.field5229.field4982) == -1 && ~(127 & var37.field1304) == -1 && ~(var37.field1311 & 127) == -1 || ~(1 & var37.field5229.field4982) == -2 && ~(127 & var37.field1304) == -65 && (var37.field1311 & 127) == 64) {
                                    int var38 = var37.field1304 + 64 + -(var37.field5229.field4982 * 64);
                                    int var39 = var37.field1311 - var37.field5229.field4982 * 64 + 64;
                                    for (int var40 = 0; ~var40 > ~class426.field6168; ++var40) {
                                        class358 var45 = class81.field917[class201.field2770[var40]];
                                        if (var45 != null && ~class221.field3033 != ~var45.field6273 && var37 != var45 && var45.field6287) {
                                            int var46 = -((var45.field5229.field4982 + -1) * 64) + var45.field1304;
                                            int var47 = var45.field1311 + 64 + -(var45.field5229.field4982 * 64);
                                            if (~var46 <= ~var38 && var45.field5229.field4982 <= var37.field5229.field4982 - (var46 - var38 >> 7) && var39 <= var47 && -(-var39 + var47 >> 7) + var37.field5229.field4982 >= var45.field5229.field4982) {
                                                class195.method1238(true, var45);
                                                var45.field6273 = class221.field3033;
                                            }
                                        }
                                    }
                                    for (int var41 = 0; class148.field2082 > var41; ++var41) {
                                        class133 var42 = class375.field5473[class294.field4217[var41]];
                                        if (var42 != null && ~class221.field3033 != ~var42.field6273 && var42.field6287) {
                                            int var43 = var42.field1304 + -((-1 + var42.method786((byte) 70)) * 64);
                                            int var44 = var42.field1311 + -(64 * (var42.method786((byte) 70) + -1));
                                            if (~var43 <= ~var38 && ~var42.method786((byte) 70) >= ~(-(-var38 + var43 >> 7) + var37.field5229.field4982) && var39 <= var44 && var42.method786((byte) 70) <= -(var44 - var39 >> 7) + var37.field5229.field4982) {
                                                class393.method2509(-35, var42);
                                                var42.field6273 = class221.field3033;
                                            }
                                        }
                                    }
                                }
                                if (class221.field3033 == var37.field6273) {
                                    continue;
                                }
                                class195.method1238(true, var37);
                                var37.field6273 = class221.field3033;
                            }
                        }
                        if (var24.field189 instanceof class407) {
                            class111 var48 = (class111) class319.field4527.method1204((byte) -94, (long) (var24.field193 << 28 | var24.field194 << 14 | var24.field190));
                            if (var48 != null) {
                                for (class437 var49 = (class437) var48.field1280.method1117((byte) -122); var49 != null; var49 = (class437) var48.field1280.method1120(arg0 + 27305)) {
                                    class260 var50 = class392.method2498(var49.field6402, arg0 ^ 22349);
                                    if (class423.field6070 == 1) {
                                        ++class334.field4903;
                                        class70.method411(43, class179.field2467, class318.field4526 + " -> <col=ff9040>" + var50.field3527, class423.field6069, 0, var24.field190, var24.field194, (long) var49.field6402);
                                    } else if (class271.field3842) {
                                        class176 var55 = ~class43.field535 != 0 ? class349.method2223(false, class43.field535) : null;
                                        if (~(1 & class289.field4103) != -1 && (var55 == null || ~var50.method1620(class43.field535, 16, var55.field2451) != ~var55.field2451)) {
                                            ++class186.field2542;
                                            class70.method411(18, class110.field1275, class75.field825 + " -> <col=ff9040>" + var50.field3527, class338.field5007, 0, var24.field190, var24.field194, (long) var49.field6402);
                                        }
                                    } else {
                                        String[] var51 = var50.field3532;
                                        for (int var52 = 4; ~var52 <= -1; --var52) {
                                            if (var51 != null && var51[var52] != null) {
                                                byte var53 = 0;
                                                if (var52 == 0) {
                                                    var53 = 50;
                                                }
                                                int var54 = class207.field2818;
                                                if (var52 == 1) {
                                                    var53 = 10;
                                                }
                                                if (var52 == 2) {
                                                    var53 = 16;
                                                }
                                                if (~var52 == -4) {
                                                    var53 = 35;
                                                }
                                                if (~var52 == -5) {
                                                    var53 = 14;
                                                }
                                                if (var50.field3546 == var52) {
                                                    var54 = var50.field3555;
                                                }
                                                if (var50.field3559 == var52) {
                                                    var54 = var50.field3554;
                                                }
                                                ++class305.field4358;
                                                class70.method411(var53, var51[var52], "<col=ff9040>" + var50.field3527, var54, 0, var24.field190, var24.field194, (long) var49.field6402);
                                            }
                                        }
                                        class70.method411(1007, class291.field4175, "<col=ff9040>" + var50.field3527, class438.field6424, 0, var24.field190, var24.field194, (long) var49.field6402);
                                        ++class16.field163;
                                    }
                                }
                            }
                        }
                        if (var24.field189 instanceof class265) {
                            class265 var56 = (class265) var24.field189;
                            class327 var57 = class157.method1036(0, var56.method225(91));
                            if (var57.field4645 != null) {
                                var57 = var57.method2029(-1);
                            }
                            if (var57 != null) {
                                if (~class423.field6070 == -2) {
                                    class70.method411(4, class179.field2467, class318.field4526 + " -> <col=00ffff>" + var57.field4641, class423.field6069, 0, var24.field190, var24.field194, class300.method1895(var24.field190, var56, (byte) -10, var24.field194));
                                    ++class382.field5606;
                                } else if (class271.field3842) {
                                    class176 var62 = ~class43.field535 != 0 ? class349.method2223(false, class43.field535) : null;
                                    if (~(4 & class289.field4103) != -1 && (var62 == null || var57.method2020(var62.field2451, (byte) -30, class43.field535) != var62.field2451)) {
                                        class70.method411(33, class110.field1275, class75.field825 + " -> <col=00ffff>" + var57.field4641, class338.field5007, 0, var24.field190, var24.field194, class300.method1895(var24.field190, var56, (byte) -10, var24.field194));
                                        ++class66.field741;
                                    }
                                } else {
                                    String[] var58 = var57.field4650;
                                    if (var58 != null) {
                                        for (int var59 = 4; ~var59 <= -1; --var59) {
                                            if (var58[var59] != null) {
                                                short var60 = 0;
                                                if (~var59 == -1) {
                                                    var60 = 7;
                                                }
                                                int var61 = class207.field2818;
                                                if (var59 == 1) {
                                                    var60 = 42;
                                                }
                                                if (~var59 == -3) {
                                                    var60 = 32;
                                                }
                                                if (~var59 == -4) {
                                                    var60 = 24;
                                                }
                                                if (var59 == 4) {
                                                    var60 = 1005;
                                                }
                                                if (var57.field4672 == var59) {
                                                    var61 = var57.field4593;
                                                }
                                                if (var57.field4618 == var59) {
                                                    var61 = var57.field4630;
                                                }
                                                ++class43.field528;
                                                class70.method411(var60, var58[var59], "<col=00ffff>" + var57.field4641, var61, 0, var24.field190, var24.field194, class300.method1895(var24.field190, var56, (byte) -10, var24.field194));
                                            }
                                        }
                                    }
                                    class70.method411(1002, class291.field4175, "<col=00ffff>" + var57.field4641, class438.field6424, 0, var24.field190, var24.field194, (long) var57.field4592);
                                    ++class148.field2088;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BII)I", line = 455)
    public static final int method2270(byte arg0, int arg1, int arg2) {
        ++field5212;
        class417 var3 = (class417) class201.field2774.method1204((byte) -104, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (~arg2 == 0) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 > -34) {
                method2269(-105, (class174) null);
            }
            for (int var5 = 0; ~var3.field5984.length < ~var5; ++var5) {
                if (~var3.field5987[var5] == ~arg2) {
                    var4 += var3.field5984[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I", line = 492)
    public final int[][] method144(int arg0, int arg1) {
        int var3 = 101 / ((-80 - arg1) / 45);
        ++field5210;
        int[][] var4 = super.field1342.method2530(arg0, (byte) 125);
        if (super.field1342.field5819) {
            int var5 = class218.field2979 / this.field5218;
            int var6 = class392.field5738 / this.field5205;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method639((byte) 34, class392.field5738 * var7 / var6, 0);
            } else {
                var8 = this.method639((byte) 34, 0, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class218.field2979 < ~var15; ++var15) {
                int var16;
                if (~var5 >= -1) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class218.field2979 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V", line = 563)
    public static final void method2271(int arg0, int arg1, int arg2, int arg3) {
        class302 var4 = class19.field202[arg0][arg1][arg2];
        if (var4 != null) {
            class143 var5 = var4.field4311;
            class143 var6 = var4.field4306;
            if (var5 != null) {
                var5.field2030 = var5.field2030 * arg3 / 16;
                var5.field2025 = var5.field2025 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field2030 = var6.field2030 * arg3 / 16;
                var6.field2025 = var6.field2025 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 593)
    public static final void method2272(byte arg0) {
        int var1 = 5 / ((50 - arg0) / 55);
        ++field5220;
        class143.field2026.method1116((byte) -122);
        for (class159 var2 = (class159) class32.field301.method1124(-1); var2 != null; var2 = (class159) class32.field301.method1119(false)) {
            if (var2.field2257 < 1000) {
                var2.method2290((byte) 98);
                class143.field2026.method1125(-1, var2);
            }
        }
        class143.field2026.method1115(class32.field301, (byte) -105);
        if (class189.field2571 == null) {
            if (class193.field2632 == null) {
                if (~class366.field5338 >= -1) {
                    int var3 = class353.field5154;
                    if (!class81.field903) {
                        if (~var3 == -2 && class433.field6324 > 0) {
                            int var4 = ((class159) class32.field301.field2358.field5247).field2257;
                            if (~var4 == -24 || ~var4 == -3 || ~var4 == -20 || ~var4 == -12 || var4 == 57 || ~var4 == -27 || ~var4 == -35 || var4 == 22 || ~var4 == -50 || var4 == 44 || var4 == 41 || var4 == 1012) {
                                class159 var5 = (class159) class32.field301.field2358.field5247;
                                class119 var6 = class179.method1170(var5.field2249, 818041328);
                                class3 var7 = client.method1076(var6);
                                if (var7.method30(true)) {
                                    class444.field6482 = 0;
                                    class186.field2525 = false;
                                    if (class189.field2571 != null) {
                                        class101.method543((byte) -100, class189.field2571);
                                    }
                                    class189.field2571 = class179.method1170(var5.field2249, 818041328);
                                    class98.field1098 = class302.field4326;
                                    class217.field2977 = var5.field2266;
                                    class222.field3037 = class124.field1643;
                                    class101.method543((byte) 91, class189.field2571);
                                    return;
                                }
                            }
                        }
                        if (var3 <= 0 && ~class369.field5414 < -1) {
                            var3 = class369.field5414;
                        }
                        class369.field5414 = 0;
                        if (~var3 == -2 && (class354.field5175 == 1 && ~class433.field6324 < -3 || class247.method1555(0))) {
                            var3 = 2;
                        }
                        if (~var3 == -3 && class433.field6324 > 0) {
                            class135.method805(true);
                        }
                        if (var3 == 1 && ~class433.field6324 < -1) {
                            class246.method1554((byte) -118);
                            return;
                        }
                    } else {
                        if (var3 != 1) {
                            int var8 = class57.field654;
                            int var9 = class48.field562;
                            if (class162.field2286 + -10 > var8 || var8 > class119.field1595 + 10 + class162.field2286 || var9 < class428.field6219 + -10 || ~(class428.field6219 + class149.field2094 - -10) > ~var9) {
                                class81.field903 = false;
                                class334.method2144(class428.field6219, (byte) -64, class162.field2286, class149.field2094, class119.field1595);
                            }
                        }
                        if (~var3 != -2) {
                            return;
                        }
                        int var10 = class162.field2286;
                        int var11 = class428.field6219;
                        int var12 = class119.field1595;
                        int var13 = class302.field4326;
                        int var14 = class124.field1643;
                        int var15 = -1;
                        for (int var16 = 0; ~var16 > ~class433.field6324; ++var16) {
                            if (class94.field1041) {
                                int var20 = var11 - -33 - -((class433.field6324 + -1 + -var16) * 16);
                                if (var10 < var13 && ~var13 > ~(var10 + var12) && ~(var20 + -13) > ~var14 && ~var14 > ~(var20 + 3)) {
                                    var15 = var16;
                                }
                            } else {
                                int var21 = var11 + 31 - -((class433.field6324 + -1 + -var16) * 16);
                                if (~var13 < ~var10 && ~var13 > ~(var10 - -var12) && ~var14 < ~(var21 + -13) && ~(var21 - -3) < ~var14) {
                                    var15 = var16;
                                }
                            }
                        }
                        if (~var15 != 0) {
                            int var17 = 0;
                            class108 var18 = new class108(class32.field301);
                            for (class159 var19 = (class159) var18.method602((byte) 113); var19 != null; var19 = (class159) var18.method599(-17)) {
                                if (var15 == var17) {
                                    class105.method566(1, var19);
                                }
                                ++var17;
                            }
                        }
                        class81.field903 = false;
                        class334.method2144(class428.field6219, (byte) -64, class162.field2286, class149.field2094, class119.field1595);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILra;)I", line = 771)
    public static final int method2273(int arg0, class57 arg1) {
        ++field5207;
        int var2 = 13 % ((arg0 - 57) / 60);
        int var3 = 0;
        if (arg1.method345(1, class302.field4325)) {
            ++var3;
        }
        if (arg1.method345(1, class382.field5605)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I", line = 791)
    public static final int method2274(int arg0, int arg1) {
        ++field5213;
        if (arg0 != 1002) {
            field5219 = 11;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + -61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V", line = 808)
    public static void method2275(int arg0) {
        field5206 = null;
        if (arg0 != 64) {
            method2272((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLbk;I)V", line = 819)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 < 83) {
            method2272((byte) -58);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field5205 = arg1.method1342((byte) -128);
            }
        } else {
            this.field5218 = arg1.method1342((byte) -128);
        }
        ++field5208;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 859)
    public class356() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)V", line = 862)
    public static final void method2276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 >= 65) {
            if (arg1 >= class143.field2029 && ~class128.field1785 <= ~arg1 && ~class143.field2029 >= ~arg5 && ~class128.field1785 <= ~arg5 && ~arg2 <= ~class143.field2029 && arg2 <= class128.field1785 && class143.field2029 <= arg7 && arg7 <= class128.field1785 && class20.field209 <= arg6 && class407.field5914 >= arg6 && arg9 >= class20.field209 && ~arg9 >= ~class407.field5914 && ~arg0 <= ~class20.field209 && class407.field5914 >= arg0 && arg4 >= class20.field209 && arg4 <= class407.field5914) {
                class130.method779(arg1, arg5, arg3, arg9, arg6, arg4, arg7, (byte) -125, arg0, arg2);
            } else {
                class238.method1520(arg6, arg7, arg1, arg9, (byte) -111, arg3, arg4, arg2, arg0, arg5);
            }
            ++field5215;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I", line = 883)
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field5211;
            int[] var3 = super.field1340.method14(34, arg0);
            if (super.field1340.field35) {
                int var4 = class218.field2979 / this.field5218;
                int var5 = class392.field5738 / this.field5205;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method631(true, 0, class392.field5738 * var6 / var5);
                } else {
                    var7 = this.method631(true, 0, 0);
                }
                for (int var8 = 0; ~class218.field2979 < ~var8; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class218.field2979 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }
}

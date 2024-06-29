import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 extends class175 {

    @OriginalMember(owner = "client!iha", name = "H", descriptor = "Ljb;")
    public static class519 field307 = new class519(24, -2);

    @OriginalMember(owner = "client!iha", name = "F", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!iha", name = "G", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!iha", name = "I", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!iha", name = "J", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field305;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            this.method180(25, -128, -124);
        }
        if (super.field2310.field169) {
            int var4 = class456.field6536[arg1];
            for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                var3[var5] = this.method180(var4, class693.field9221[var5], Integer.MAX_VALUE) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(Z)V")
    public static void method177(boolean arg0) {
        field307 = null;
        if (!arg0) {
            method178(92);
        }
    }

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)V")
    public static final void method178(int arg0) {
        ++field309;
        if (~class125.field1721.field5172.method2553(43) == -3) {
            byte var1 = (byte) (255 & class327.field4642 + -4);
            int var2 = class327.field4642 % class102.field1467;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var18 = 0; ~var18 > ~class393.field5663; ++var18) {
                    class641.field8644[var3][var2][var18] = var1;
                }
            }
            if (class184.field2420 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class304.field4276[var4] = -1000000;
                    class730.field9894[var4] = 1000000;
                    class157.field2114[var4] = 0;
                    class414.field5958[var4] = 1000000;
                    class23.field237[var4] = 0;
                }
                if (arg0 != -28035) {
                    method178(84);
                }
                int var5 = class625.field8475.field2802;
                int var6 = class625.field8475.field2810;
                if (class697.field9252 != 1 && ~class702.field9303 == 0) {
                    int var7 = class778.method4273(class223.field2892, (byte) -123, class435.field6273, class184.field2420);
                    if (~(-class269.field3926 + var7) > -3201 && (class328.field4667[class184.field2420][class435.field6273 >> 9][class223.field2892 >> 9] & 4) != 0) {
                        class618.method3425(class223.field2892 >> 9, 1, false, 126, class443.field6387, class435.field6273 >> 9);
                        return;
                    }
                } else {
                    if (~class697.field9252 != -2) {
                        var6 = class609.field8242;
                        var5 = class702.field9303;
                    }
                    if ((4 & class328.field4667[class184.field2420][var5 >> 9][var6 >> 9]) != 0) {
                        class618.method3425(var6 >> 9, 0, false, arg0 + 28155, class443.field6387, var5 >> 9);
                    }
                    if (~class74.field1000 <= -2561) {
                        return;
                    }
                    int var8 = class435.field6273 >> 9;
                    int var9 = class223.field2892 >> 9;
                    int var10 = var5 >> 9;
                    int var11 = var6 >> 9;
                    int var12;
                    if (var10 <= var8) {
                        var12 = -var10 + var8;
                    } else {
                        var12 = -var8 + var10;
                    }
                    int var13;
                    if (var9 >= var11) {
                        var13 = -var11 + var9;
                    } else {
                        var13 = -var9 + var11;
                    }
                    if (var12 == 0 && var13 == 0 || -class102.field1467 >= var12 || class102.field1467 <= var12 || var13 <= -class393.field5663 || ~var13 <= ~class393.field5663) {
                        class607.method3379("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class120.field1625 + "," + class259.field3849, (Throwable) null, true);
                        return;
                    }
                    if (~var12 < ~var13) {
                        int var14 = var13 * 65536 / var12;
                        int var15 = 32768;
                        while (var8 != var10) {
                            if (~var10 < ~var8) {
                                ++var8;
                            } else if (~var8 < ~var10) {
                                --var8;
                            }
                            if (~(class328.field4667[class184.field2420][var8][var9] & 4) != -1) {
                                class618.method3425(var9, 1, false, arg0 + 28151, class443.field6387, var8);
                                return;
                            }
                            var15 += var14;
                            if (~var15 <= -65537) {
                                if (var9 < var11) {
                                    ++var9;
                                } else if (~var9 < ~var11) {
                                    --var9;
                                }
                                var15 -= 65536;
                                if ((4 & class328.field4667[class184.field2420][var8][var9]) != 0) {
                                    class618.method3425(var9, 1, false, 117, class443.field6387, var8);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var16 = var12 * 65536 / var13;
                    int var17 = 32768;
                    while (var9 != var11) {
                        if (~var11 >= ~var9) {
                            if (~var9 < ~var11) {
                                --var9;
                            }
                        } else {
                            ++var9;
                        }
                        if ((class328.field4667[class184.field2420][var8][var9] & 4) != 0) {
                            class618.method3425(var9, 1, false, arg0 ^ -28155, class443.field6387, var8);
                            return;
                        }
                        var17 += var16;
                        if (var17 >= 65536) {
                            if (var10 > var8) {
                                ++var8;
                            } else if (~var8 < ~var10) {
                                --var8;
                            }
                            var17 -= 65536;
                            if (~(class328.field4667[class184.field2420][var8][var9] & 4) != -1) {
                                class618.method3425(var9, 1, false, 119, class443.field6387, var8);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILha;I)V")
    public static final void method179(int arg0, int arg1, class66 arg2, int arg3) {
        ++field306;
        if (~arg1 <= -1 && ~arg3 <= -1 && ~class127.field1745 != -1 && class96.field1380 != 0) {
            class109 var4;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            if (class24.field246) {
                class305.method1973(false, (byte) 77);
                var4 = arg2.method444();
                int[] var5 = arg2.method532();
                var6 = var5[1];
                var7 = var5[0];
                var8 = var5[3];
                var9 = var5[2];
                var10 = arg1 - -class271.method1802((byte) 60, false);
                var11 = arg3 - -class547.method3151((byte) 56, false);
            } else {
                arg2.method436(class538.field7448, class770.field10603, class127.field1745, class96.field1380);
                var6 = class770.field10603;
                var7 = class538.field7448;
                var9 = class127.field1745;
                var8 = class96.field1380;
                arg2.method453(class502.field7071, class570.field7770, class127.field1745, class96.field1380);
                var4 = arg2.method541();
                var4.method823(class716.field9761, class290.field4140, class685.field9177, class416.field6000, class624.field8420, class684.field9130);
                var10 = arg1;
                arg2.method509(var4);
                var11 = arg3;
            }
            if (~var9 == -1) {
                var9 = 1;
            }
            if (~var8 == -1) {
                var8 = 1;
            }
            class24.method143(true, (byte) -65);
            if (class648.field8748 != null && (!class506.field7094 || ~(class384.field5578 & 64) != -1)) {
                int var12 = -1;
                int var13 = -1;
                int var14 = arg2.method507();
                int var15 = arg2.method469();
                int var16;
                int var17;
                int var18;
                int var19;
                if (class408.field5786) {
                    var17 = var16 = (-var6 + var11) * class72.field972 / var8;
                    var19 = var18 = (-var7 + var10) * class72.field972 / var9;
                } else {
                    var18 = (-var7 + var10) * var15 / var9;
                    var19 = (var10 - var7) * var14 / var9;
                    var17 = (-var6 + var11) * var14 / var8;
                    var16 = (-var6 + var11) * var15 / var8;
                }
                int[] var20 = new int[] { var19, var17, var14 };
                var4.method809(var20);
                int[] var21 = new int[] { var18, var16, var15 };
                var4.method809(var21);
                float var22 = class674.method3718((float) var21[0], 4, (float) var21[2], (float) var20[2], 0, (float) var20[1], (float) var21[1], (float) var20[0]);
                if (var22 > 0.0F) {
                    int var23 = var21[0] - var20[0];
                    int var24 = var21[2] - var20[2];
                    int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                    int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                    var12 = var25 + (-1 + class625.field8475.method2563(arg0 + -12840) << 8) >> 9;
                    var13 = var26 + (class625.field8475.method2563(-12840) + -1 << 8) >> 9;
                    byte var27 = class625.field8475.field2813;
                    if (var27 < 3 && (class328.field4667[1][var25 >> 9][var26 >> 9] & 2) != 0) {
                        int var87 = var27 + 1;
                    }
                }
                if (var12 != -1 && ~var13 != 0) {
                    if (class506.field7094 && ~(64 & class384.field5578) != -1) {
                        class347 var28 = class90.method717(class294.field4170, class658.field8875, (byte) -42);
                        if (var28 != null) {
                            class26.method147(-1, true, class385.field5594, 0L, 3, var13, " ->", (long) (var13 | var12 << 0), true, var12, -1, class182.field2384, false);
                        } else {
                            class579.method3278(-1);
                        }
                    } else {
                        if (class416.field6008) {
                            class26.method147(-1, true, class58.field724.method365(class55.field647, (byte) 87), 0L, 9, var13, "", (long) (var12 << 0 | var13), true, var12, -1, -1, false);
                        }
                        ++class72.field975;
                        class26.method147(-1, true, class384.field5580, 0L, 8, var13, "", (long) (var13 | var12 << 0), true, var12, -1, class333.field4717, false);
                    }
                }
            }
            if (class24.field246) {
                class30.method173(arg0 + 21072);
            }
            for (int var29 = arg0; ~(class24.field246 ? 2 : 1) < ~var29; ++var29) {
                boolean var30 = var29 == 0;
                class485 var31 = !var30 ? class422.field6071 : class627.field8492;
                int var32 = arg1;
                int var33 = arg3;
                if (class24.field246) {
                    class305.method1973(var30, (byte) 77);
                    var32 = arg1 + class271.method1802((byte) 60, var30);
                    var33 = arg3 + class547.method3151((byte) 56, var30);
                }
                class345 var34 = var31.field6769;
                for (class104 var35 = (class104) var34.method2189((byte) 87); var35 != null; var35 = (class104) var34.method2192(arg0)) {
                    if ((class600.field8179 || class625.field8475.field2813 == var35.field1478.field2813) && var35.method798(var32, var33, (byte) 106, arg2)) {
                        boolean var36 = false;
                        boolean var37 = false;
                        int var38;
                        int var39;
                        if (var35.field1478 instanceof class539) {
                            var38 = ((class539) var35.field1478).field7466;
                            var39 = ((class539) var35.field1478).field7467;
                        } else {
                            var38 = var35.field1478.field2802 >> 9;
                            var39 = var35.field1478.field2810 >> 9;
                        }
                        if (var35.field1478 instanceof class758) {
                            class758 var40 = (class758) var35.field1478;
                            int var41 = var40.method2563(-12840);
                            if ((1 & var41) == 0 && (511 & var40.field2802) == 0 && ~(511 & var40.field2810) == -1 || ~(1 & var41) == -2 && (var40.field2802 & 511) == 256 && (511 & var40.field2810) == 256) {
                                int var42 = var40.field2802 + -(var40.method2563(-12840) + -1 << 8);
                                int var43 = var40.field2810 - (-1 + var40.method2563(arg0 ^ -12840) << 8);
                                for (int var44 = 0; class178.field2352 > var44; ++var44) {
                                    class316 var51 = (class316) class176.field2326.method1248(arg0 ^ 89, (long) class245.field3206[var44]);
                                    if (var51 != null) {
                                        class22 var52 = var51.field4455;
                                        if (class572.field7788 != var52.field6167 && var52.field6135) {
                                            int var53 = -(var52.field217.field4300 - 1 << 8) + var52.field2802;
                                            int var54 = var52.field2810 - (var52.field217.field4300 + -1 << 8);
                                            if (var42 <= var53 && var52.field217.field4300 <= -(var53 - var42 >> 9) + var40.method2563(arg0 ^ -12840) && ~var43 >= ~var54 && ~var52.field217.field4300 >= ~(-(-var43 + var54 >> 9) + var40.method2563(-12840))) {
                                                class336.method2156(var52, false, class625.field8475.field2813 != var35.field1478.field2813);
                                                var52.field6167 = class572.field7788;
                                            }
                                        }
                                    }
                                }
                                int var45 = class652.field8795;
                                int[] var46 = class497.field6986;
                                for (int var47 = 0; var47 < var45; ++var47) {
                                    class758 var48 = class84.field1204[var46[var47]];
                                    if (var48 != null && ~class572.field7788 != ~var48.field6167 && var40 != var48 && var48.field6135) {
                                        int var49 = var48.field2802 + -(-1 + var48.method2563(-12840) << 8);
                                        int var50 = var48.field2810 + -(var48.method2563(arg0 + -12840) + -1 << 8);
                                        if (~var42 >= ~var49 && ~var48.method2563(-12840) >= ~(var40.method2563(-12840) + -(-var42 + var49 >> 9)) && ~var50 <= ~var43 && ~var48.method2563(-12840) >= ~(-(-var43 + var50 >> 9) + var40.method2563(-12840))) {
                                            class661.method3661(var48, -71, class625.field8475.field2813 != var35.field1478.field2813);
                                            var48.field6167 = class572.field7788;
                                        }
                                    }
                                }
                            }
                            if (class572.field7788 == var40.field6167) {
                                continue;
                            }
                            class661.method3661(var40, arg0 + 125, class625.field8475.field2813 != var35.field1478.field2813);
                            var40.field6167 = class572.field7788;
                        }
                        if (var35.field1478 instanceof class22) {
                            class22 var55 = (class22) var35.field1478;
                            if (var55.field217 != null) {
                                if (~(var55.field217.field4300 & 1) == -1 && ~(511 & var55.field2802) == -1 && ~(511 & var55.field2810) == -1 || (1 & var55.field217.field4300) == 1 && (511 & var55.field2802) == 256 && (511 & var55.field2810) == 256) {
                                    int var56 = -(var55.field217.field4300 + -1 << 8) + var55.field2802;
                                    int var57 = -(var55.field217.field4300 - 1 << 8) + var55.field2810;
                                    for (int var58 = 0; ~class178.field2352 < ~var58; ++var58) {
                                        class316 var65 = (class316) class176.field2326.method1248(85, (long) class245.field3206[var58]);
                                        if (var65 != null) {
                                            class22 var66 = var65.field4455;
                                            if (class572.field7788 != var66.field6167 && var55 != var66 && var66.field6135) {
                                                int var67 = -(var66.field217.field4300 + -1 << 8) + var66.field2802;
                                                int var68 = -(var66.field217.field4300 + -1 << 8) + var66.field2810;
                                                if (var67 >= var56 && var66.field217.field4300 <= -(var67 - var56 >> 9) + var55.field217.field4300 && ~var57 >= ~var68 && -(-var57 + var68 >> 9) + var55.field217.field4300 >= var66.field217.field4300) {
                                                    class336.method2156(var66, false, ~class625.field8475.field2813 != ~var35.field1478.field2813);
                                                    var66.field6167 = class572.field7788;
                                                }
                                            }
                                        }
                                    }
                                    int var59 = class652.field8795;
                                    int[] var60 = class497.field6986;
                                    for (int var61 = 0; ~var61 > ~var59; ++var61) {
                                        class758 var62 = class84.field1204[var60[var61]];
                                        if (var62 != null && ~class572.field7788 != ~var62.field6167 && var62.field6135) {
                                            int var63 = var62.field2802 + -(-1 + var62.method2563(arg0 + -12840) << 8);
                                            int var64 = var62.field2810 - (var62.method2563(-12840) - 1 << 8);
                                            if (~var56 >= ~var63 && var62.method2563(-12840) <= -(-var56 + var63 >> 9) + var55.field217.field4300 && ~var57 >= ~var64 && ~var62.method2563(-12840) >= ~(-(-var57 + var64 >> 9) + var55.field217.field4300)) {
                                                class661.method3661(var62, arg0 ^ 94, class625.field8475.field2813 != var35.field1478.field2813);
                                                var62.field6167 = class572.field7788;
                                            }
                                        }
                                    }
                                }
                                if (~class572.field7788 == ~var55.field6167) {
                                    continue;
                                }
                                class336.method2156(var55, false, class625.field8475.field2813 != var35.field1478.field2813);
                                var55.field6167 = class572.field7788;
                            }
                        }
                        if (var35.field1478 instanceof class145) {
                            int var69 = class120.field1625 + var38;
                            int var70 = class259.field3849 + var39;
                            class769 var71 = (class769) class523.field7265.method1248(arg0 ^ 106, (long) (var35.field1478.field2813 << 28 | var70 << 14 | var69));
                            if (var71 != null) {
                                int var72 = 0;
                                for (class309 var73 = (class309) var71.field10592.method678(false); var73 != null; var73 = (class309) var71.field10592.method685(arg0 ^ -92)) {
                                    class369 var74 = class16.field156.method2121(var73.field4380, 25928);
                                    if (class506.field7094 && ~class625.field8475.field2813 == ~var35.field1478.field2813) {
                                        class560 var75 = ~class503.field7077 == 0 ? null : class315.field4447.method3515(class503.field7077, arg0);
                                        if ((class384.field5578 & 1) != 0 && (var75 == null || var74.method2312(var75.field7679, class503.field7077, (byte) 109) != var75.field7679)) {
                                            ++class332.field4703;
                                            class26.method147(-1, true, class385.field5594, (long) var73.field4380, 49, var39, class545.field7534 + " -> <col=ff9040>" + var74.field5349, (long) var72, false, var38, -1, class182.field2384, false);
                                        }
                                    }
                                    if (class625.field8475.field2813 == var35.field1478.field2813) {
                                        String[] var76 = var74.field5369;
                                        for (int var77 = 4; var77 >= 0; --var77) {
                                            if (var76 != null && var76[var77] != null) {
                                                byte var78 = 0;
                                                int var79 = class37.field393;
                                                if (~var77 == -1) {
                                                    var78 = 11;
                                                }
                                                if (~var77 == -2) {
                                                    var78 = 51;
                                                }
                                                if (~var77 == -3) {
                                                    var78 = 18;
                                                }
                                                if (~var77 == -4) {
                                                    var78 = 23;
                                                }
                                                if (~var77 == -5) {
                                                    var78 = 12;
                                                }
                                                if (~var74.field5325 == ~var77) {
                                                    var79 = var74.field5389;
                                                }
                                                if (~var74.field5320 == ~var77) {
                                                    var79 = var74.field5370;
                                                }
                                                class26.method147(-1, true, var76[var77], (long) var73.field4380, var78, var39, "<col=ff9040>" + var74.field5349, (long) var72, false, var38, -1, var79, false);
                                                ++class61.field785;
                                            }
                                        }
                                    }
                                    class26.method147(-1, true, class58.field719.method365(class55.field647, (byte) 83), (long) var73.field4380, 1003, var39, "<col=ff9040>" + var74.field5349, (long) var72, false, var38, -1, class463.field6579, ~class625.field8475.field2813 != ~var35.field1478.field2813);
                                    ++class525.field7292;
                                    ++var72;
                                }
                            }
                        }
                        if (var35.field1478 instanceof class602) {
                            class602 var80 = (class602) var35.field1478;
                            class412 var81 = class210.field2705.method1362(arg0, var80.method1748(5875));
                            if (var81.field5919 != null) {
                                var81 = var81.method2478(class480.field6740, -1);
                            }
                            if (var81 != null) {
                                if (class506.field7094 && class625.field8475.field2813 == var35.field1478.field2813) {
                                    class560 var82 = class503.field7077 == -1 ? null : class315.field4447.method3515(class503.field7077, 0);
                                    if ((class384.field5578 & 4) != 0 && (var82 == null || ~var81.method2473((byte) 103, var82.field7679, class503.field7077) != ~var82.field7679)) {
                                        ++class646.field8708;
                                        class26.method147(-1, true, class385.field5594, class275.method1810(var38, var80, var39, (byte) 120), 4, var39, class545.field7534 + " -> <col=00ffff>" + var81.field5913, (long) var80.hashCode(), false, var38, arg0 + -1, class182.field2384, false);
                                    }
                                }
                                if (~class625.field8475.field2813 == ~var35.field1478.field2813) {
                                    String[] var83 = var81.field5938;
                                    if (var83 != null) {
                                        for (int var84 = 4; var84 >= 0; --var84) {
                                            if (var83[var84] != null) {
                                                short var85 = 0;
                                                if (var84 == 0) {
                                                    var85 = 25;
                                                }
                                                int var86 = class37.field393;
                                                if (var84 == 1) {
                                                    var85 = 53;
                                                }
                                                if (var84 == 2) {
                                                    var85 = 6;
                                                }
                                                if (~var84 == -4) {
                                                    var85 = 60;
                                                }
                                                if (var84 == 4) {
                                                    var85 = 1008;
                                                }
                                                if (var81.field5852 == var84) {
                                                    var86 = var81.field5848;
                                                }
                                                if (var81.field5929 == var84) {
                                                    var86 = var81.field5933;
                                                }
                                                class26.method147(-1, true, var83[var84], class275.method1810(var38, var80, var39, (byte) 123), var85, var39, "<col=00ffff>" + var81.field5913, (long) var80.hashCode(), false, var38, -1, var86, false);
                                                ++class603.field8191;
                                            }
                                        }
                                    }
                                    class26.method147(-1, true, class58.field719.method365(class55.field647, (byte) 58), (long) var81.field5850, 1012, var39, "<col=00ffff>" + var81.field5913, (long) var80.hashCode(), false, var38, -1, class463.field6579, ~class625.field8475.field2813 != ~var35.field1478.field2813);
                                    ++class299.field4214;
                                }
                            }
                        }
                    }
                }
                if (class24.field246) {
                    class30.method173(21072);
                }
            }
            class24.method143(false, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(III)I")
    private final int method180(int arg0, int arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            field307 = null;
        }
        ++field308;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}

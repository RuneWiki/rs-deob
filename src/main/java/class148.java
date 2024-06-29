import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class148 extends class517 {

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "[I")
    public static int[] field2097 = null;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "Lid;")
    public static class388 field2099 = new class388();

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "Lau;")
    public static class692 field2105 = new class692(8);

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field2106 = 100;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "Lmv;")
    public static class295 field2100;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V", line = 3)
    public final void method847(byte arg0) {
        if (arg0 != -79) {
            method1062(-82, -118, 51, 85, (byte) -38, -85, -60, -87, -22, (byte[][][]) null, (class98) null, -110, -35);
        }
        ++field2101;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IZ)V", line = 13)
    public final void method1060(int arg0, boolean arg1) {
        ++field2102;
        super.field7252.method1709((byte) -78, this);
        OpenGL.glTexParameteri(super.field7260, 10242, !arg1 ? 33071 : 10497);
        if (arg0 != -3351) {
            method1063(4);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Luca;II[BI)V", line = 29)
    public class148(class287 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2104 = arg2;
        super.field7252.method1709((byte) -112, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7260, 0, super.field7259, this.field2104, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2924(true, -33);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIII[Lps;I)V", line = 43)
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class5[] arg8, int arg9) {
        class332.field4821.method652(arg3, arg0, arg5, arg1);
        int var10 = -12 / ((69 - arg7) / 43);
        ++field2103;
        for (int var11 = 0; ~var11 > ~arg8.length; ++var11) {
            class5 var12 = arg8[var11];
            if (var12 != null && (var12.field87 == arg6 || ~arg6 == 1412584498 && class188.field2561 == var12)) {
                int var13;
                if (arg2 != -1) {
                    var13 = arg2;
                } else {
                    class696.field9811[class7.field215].setBounds(var12.field80 + arg9, var12.field150 + arg4, var12.field202, var12.field76);
                    var13 = class7.field215++;
                }
                var12.field79 = var13;
                var12.field177 = class45.field685;
                if (!client.method569(var12)) {
                    if (~var12.field96 != -1) {
                        class8.method45(256, var12);
                    }
                    int var14 = var12.field80 + arg9;
                    int var15 = var12.field150 + arg4;
                    int var16 = var12.field182;
                    if (class1.field9 && (~client.method564(var12).field1275 != -1 || var12.field172 == 0) && ~var16 < -128) {
                        var16 = 127;
                    }
                    if (class188.field2561 == var12) {
                        if (~arg6 != 1412584498 && (~class232.field3075 == ~var12.field190 || class108.field1618 == var12.field190)) {
                            class252.field3303 = arg4;
                            class661.field9417 = arg9;
                            class14.field324 = arg8;
                            continue;
                        }
                        if (class684.field9657 && class603.field8716) {
                            int var17 = class315.field4612.method2340(40960);
                            int var18 = class315.field4612.method2338((byte) -88);
                            int var19 = var18 - class581.field8459;
                            int var20 = var17 - class230.field3048;
                            if (~var20 > ~class371.field5495) {
                                var20 = class371.field5495;
                            }
                            if (~(class371.field5495 + class272.field3554.field202) > ~(var12.field202 + var20)) {
                                var20 = -var12.field202 + class272.field3554.field202 + class371.field5495;
                            }
                            if (class697.field9821 > var19) {
                                var19 = class697.field9821;
                            }
                            if (var12.field76 + var19 > class697.field9821 + class272.field3554.field76) {
                                var19 = class697.field9821 - var12.field76 + class272.field3554.field76;
                            }
                            var14 = var20;
                            var15 = var19;
                        }
                        if (class108.field1618 == var12.field190) {
                            var16 = 128;
                        }
                    }
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    if (~var12.field172 != -3) {
                        int var21 = var12.field202 + var14;
                        int var22 = var12.field76 + var15;
                        var23 = arg3 >= var14 ? arg3 : var14;
                        if (~var12.field172 == -10) {
                            ++var21;
                            ++var22;
                        }
                        var24 = ~var15 >= ~arg0 ? arg0 : var15;
                        var25 = var21 >= arg5 ? arg5 : var21;
                        var26 = ~var22 > ~arg1 ? var22 : arg1;
                    } else {
                        var26 = arg1;
                        var24 = arg0;
                        var23 = arg3;
                        var25 = arg5;
                    }
                    if (var23 < var25 && var24 < var26) {
                        if (~var12.field96 != -1) {
                            if (class188.field2535 == var12.field96 || ~class556.field8169 == ~var12.field96) {
                                class89.method500(var12.field202, var14, (byte) 87, var12.field76, var15, ~class556.field8169 == ~var12.field96);
                                class394.field5969[var13] = true;
                                class332.field4821.method652(arg3, arg0, arg5, arg1);
                                continue;
                            }
                            if (class317.field4618 == var12.field96) {
                                if (var12.method18(class332.field4821, (byte) 68) != null) {
                                    class413.method2520(false);
                                    class79.method462(var12, var15, var14, -108, class332.field4821);
                                    class27.field475[var13] = true;
                                    class332.field4821.method652(arg3, arg0, arg5, arg1);
                                }
                                continue;
                            }
                            if (class32.field540 == var12.field96) {
                                if (var12.method18(class332.field4821, (byte) 68) != null) {
                                    class505.method2878(var15, var12, var14, (byte) -16);
                                    class27.field475[var13] = true;
                                    class332.field4821.method652(arg3, arg0, arg5, arg1);
                                }
                                continue;
                            }
                            if (class164.field2306 == var12.field96) {
                                class234.method1445(class28.field492, var12.field202, var14, 15, var12.field76, class332.field4821, var15);
                                class394.field5969[var13] = true;
                                class332.field4821.method652(arg3, arg0, arg5, arg1);
                                continue;
                            }
                            if (class457.field6592 == var12.field96) {
                                class305.method1917(var12.field76, var12.field202, 4, class332.field4821, var15, var14);
                                class394.field5969[var13] = true;
                                class332.field4821.method652(arg3, arg0, arg5, arg1);
                                continue;
                            }
                            if (~class620.field8982 == ~var12.field96) {
                                if (!class300.field4448 && !class111.field1637) {
                                    continue;
                                }
                                int var27 = var14 - -var12.field202;
                                int var28 = var15 - -15;
                                if (class300.field4448) {
                                    int var29 = -256;
                                    if (~class116.field1741 > -21) {
                                        var29 = -65536;
                                    }
                                    class244.field3236.method2434(var29, 22118, "Fps:" + class116.field1741, -1, var27, var28);
                                    var28 += 15;
                                    Runtime var30 = Runtime.getRuntime();
                                    int var31 = (int) ((var30.totalMemory() - var30.freeMemory()) / 1024L);
                                    int var32 = -256;
                                    if (var31 > 98304) {
                                        if (class364.field5343) {
                                            class186.method1234(0);
                                            for (int var33 = 0; ~var33 > -11; ++var33) {
                                                System.gc();
                                            }
                                            var31 = (int) ((var30.totalMemory() + -var30.freeMemory()) / 1024L);
                                            if (var31 > 65536) {
                                                class36.method213(0, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var32 = -65536;
                                    }
                                    class244.field3236.method2434(var32, 22118, "Mem:" + var31 + "k", -1, var27, var28);
                                    var28 += 15;
                                    class244.field3236.method2434(-256, 22118, "In:" + class13.field302 + "B/s Out:" + class370.field5493 + "B/s", -1, var27, var28);
                                    var28 += 15;
                                    int var34 = class332.field4821.method615() / 1024;
                                    class244.field3236.method2434(var34 <= 65536 ? -256 : -65536, 22118, "Offheap:" + var34 + "k", -1, var27, var28);
                                    var28 += 15;
                                    int var35 = 0;
                                    int var36 = 0;
                                    int var37 = 0;
                                    for (int var38 = 0; ~var38 > -36; ++var38) {
                                        if (class81.field1311[var38] != null) {
                                            var35 += class81.field1311[var38].method3506(0);
                                            var36 += class81.field1311[var38].method3501((byte) 70);
                                            var37 += class81.field1311[var38].method3495((byte) 124);
                                        }
                                    }
                                    int var39 = var37 * 100 / var35;
                                    int var40 = var36 * 10000 / var35;
                                    String var41 = "Cache:" + class103.method736((long) var40, (byte) -55, 2, 0, true) + "% (" + var39 + "%)";
                                    class597.field8642.method2434(-256, 22118, var41, -1, var27, var28);
                                    var28 += 12;
                                }
                                if (~class267.field3483 < -1) {
                                    class597.field8642.method2434(-256, 22118, "Particles: " + class596.field8627 + " / " + class267.field3483, -1, var27, var28);
                                }
                                var28 += 12;
                                if (class111.field1637) {
                                    class597.field8642.method2434(-256, 22118, "Polys: " + class332.field4821.method666() + " Models: " + class332.field4821.method627(), -1, var27, var28);
                                    var28 += 12;
                                    class597.field8642.method2434(-256, 22118, "Ls: " + class1.field4 + " La: " + class372.field5506 + " NPC: " + class454.field6557 + " Pl: " + class408.field6085, -1, var27, var28);
                                    var28 += 12;
                                    class405.method2494(15774);
                                }
                                class394.field5969[var13] = true;
                                continue;
                            }
                        }
                        if (~var12.field172 == -1) {
                            if (~class42.field620 == ~var12.field96 && class332.field4821.method705()) {
                                class332.field4821.method670(var14, var15, var12.field202, var12.field76);
                            }
                            method1061(var24, var26, var13, var23, -var12.field196 + var15, var25, var12.field65, -101, arg8, -var12.field74 + var14);
                            if (var12.field109 != null) {
                                method1061(var24, var26, var13, var23, -var12.field196 + var15, var25, var12.field65, -65, var12.field109, -var12.field74 + var14);
                            }
                            class200 var42 = (class200) class318.field4623.method2002((byte) -127, (long) var12.field65);
                            if (var42 != null) {
                                class504.method2871(var26, var13, var25, var14, var42.field2716, var15, (byte) -95, var24, var23);
                            }
                            if (~class42.field620 == ~var12.field96 && class332.field4821.method705()) {
                                class332.field4821.method676();
                            }
                            class332.field4821.method652(arg3, arg0, arg5, arg1);
                        }
                        if (class586.field8509[var13] || ~class145.field2086 < -2) {
                            if (~var12.field172 == -4) {
                                if (~var16 != -1) {
                                    if (!var12.field203) {
                                        class332.field4821.method633(var14, var15, var12.field202, var12.field76, 16777215 & var12.field147 | -(255 & var16) + 255 << 24, 1);
                                    } else {
                                        class332.field4821.method700(var14, var15, var12.field202, var12.field76, -(var16 & 255) + 255 << 24 | var12.field147 & 16777215, 1);
                                    }
                                } else if (!var12.field203) {
                                    class332.field4821.method633(var14, var15, var12.field202, var12.field76, var12.field147, 0);
                                } else {
                                    class332.field4821.method700(var14, var15, var12.field202, var12.field76, var12.field147, 0);
                                }
                            } else if (var12.field172 == 4) {
                                class393 var43 = var12.method35(-1, class332.field4821);
                                if (var43 == null) {
                                    if (class321.field4677) {
                                        class284.method1679(var12, -116);
                                    }
                                } else {
                                    int var44 = var12.field147;
                                    String var45 = var12.field162;
                                    if (~var12.field59 != 0) {
                                        class390 var46 = class259.field3355.method2382(var12.field59, (byte) 28);
                                        var45 = var46.field5869;
                                        if (var45 == null) {
                                            var45 = "null";
                                        }
                                        if ((~var46.field5866 == -2 || ~var12.field108 != -2) && var12.field108 != -1) {
                                            var45 = "<col=ff9040>" + var45 + "</col> x" + class432.method2574((byte) -44, var12.field108);
                                        }
                                    }
                                    if (class246.field3254 == var12) {
                                        var45 = class279.field3656.method1654(-96, class262.field3401);
                                        var44 = var12.field147;
                                    }
                                    if (class257.field3336) {
                                        class332.field4821.method692(var14, var15, var12.field202 + var14, var12.field76 + var15);
                                    }
                                    var43.method2441(var12.field76, var12.field131, 0, class97.field1481, var12.field202, 0, var45, (int[]) null, var12.field168, var12.field77, (class591) null, -(255 & var16) + 255 << 24 | var44, var15, var14, var12.field61, -1, !var12.field189 ? -1 : -(255 & var16) + 255 << 24);
                                    if (class257.field3336) {
                                        class332.field4821.method652(arg3, arg0, arg5, arg1);
                                    }
                                }
                            } else if (~var12.field172 == -6) {
                                if (~var12.field37 <= -1) {
                                    var12.method29(class274.field3588, class251.field3294, (byte) -101).method1978(0, var14, var12.field136 << 3, var12.field202, var12.field76, 0, class332.field4821, var15, var12.field62 << 3, 8414);
                                } else {
                                    class256 var47;
                                    if (var12.field59 == -1) {
                                        var47 = var12.method26(class332.field4821, -122);
                                    } else {
                                        class242 var48 = var12.field86 ? class321.field4681.field1105 : null;
                                        var47 = class259.field3355.method2385(var12.field59, var48, class332.field4821, var12.field75, var12.field171 | -16777216, var12.field108, var12.field93, (byte) 114);
                                    }
                                    if (var47 != null) {
                                        int var49 = var47.method50();
                                        int var50 = var47.method43();
                                        int var51 = (var12.field147 != 0 ? var12.field147 & 16777215 : 16777215) | -(255 & var16) + 255 << 24;
                                        if (!var12.field82) {
                                            if (~var12.field147 == -1 && var16 == 0) {
                                                if (~var12.field45 == -1) {
                                                    if (var12.field202 == var49 && var12.field76 == var50) {
                                                        var47.method1534(var14, var15);
                                                    } else {
                                                        var47.method1535(var14, var15, var12.field202, var12.field76);
                                                    }
                                                } else {
                                                    var47.method1527((float) var12.field202 / 2.0F + (float) var14, (float) var12.field76 / 2.0F + (float) var15, var12.field202 * 4096 / var49, var12.field45);
                                                }
                                            } else if (~var12.field45 != -1) {
                                                var47.method1526((float) var12.field202 / 2.0F + (float) var14, (float) var12.field76 / 2.0F + (float) var15, var12.field202 * 4096 / var49, var12.field45, 0, var51, 1);
                                            } else if (~var12.field202 == ~var49 && var12.field76 == var50) {
                                                var47.method49(var14, var15, 0, var51, 1);
                                            } else {
                                                var47.method1532(var14, var15, var12.field202, var12.field76, 0, var51, 1);
                                            }
                                        } else {
                                            class332.field4821.method692(var14, var15, var12.field202 + var14, var12.field76 + var15);
                                            if (~var12.field45 != -1) {
                                                int var52 = (var49 - (1 - var12.field202)) / var49;
                                                int var53 = (var12.field76 - (-var50 + 1)) / var50;
                                                for (int var54 = 0; ~var52 < ~var54; ++var54) {
                                                    for (int var55 = 0; ~var55 > ~var53; ++var55) {
                                                        if (~var12.field147 != -1) {
                                                            var47.method1526((float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), (float) var50 / 2.0F + (float) (var50 * var55 + var15), 4096, var12.field45, 0, var51, 1);
                                                        } else {
                                                            var47.method1527((float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), (float) var50 / 2.0F + (float) (var15 - -(var50 * var55)), 4096, var12.field45);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field147 == 0 && ~var16 == -1) {
                                                var47.method1528(var14, var15, var12.field202, var12.field76);
                                            } else {
                                                var47.method53(var14, var15, var12.field202, var12.field76, 0, var51, 1);
                                            }
                                            class332.field4821.method652(arg3, arg0, arg5, arg1);
                                        }
                                    } else if (class321.field4677) {
                                        class284.method1679(var12, -128);
                                    }
                                }
                            } else if (~var12.field172 != -7) {
                                if (~var12.field172 == -10) {
                                    int var75;
                                    int var76;
                                    int var77;
                                    int var78;
                                    if (!var12.field146) {
                                        var75 = var14;
                                        var76 = var12.field76 + var15;
                                        var77 = var12.field202 + var14;
                                        var78 = var15;
                                    } else {
                                        var75 = var14;
                                        var78 = var12.field76 + var15;
                                        var76 = var15;
                                        var77 = var12.field202 + var14;
                                    }
                                    if (var12.field42 != 1) {
                                        class332.field4821.method703(var75, var78, var77, var76, var12.field147, var12.field42, 0);
                                    } else {
                                        class332.field4821.method609(var75, var78, var77, var76, var12.field147, 0);
                                    }
                                }
                            } else {
                                class321.method1991(-200);
                                class395 var56 = null;
                                int var57 = 0;
                                if (~var12.field59 == 0) {
                                    if (var12.field142 != 5) {
                                        if (~var12.field142 != -9 && ~var12.field142 != -10) {
                                            if (var12.field51 != -1) {
                                                class47 var58 = class203.field2769.method2971(-112, var12.field51);
                                                var56 = var12.method23(class547.field8070, class563.field8235, var12.field115, class332.field4821, class321.field4681.field1105, true, var12.field69, class259.field3355, class203.field2769, 2048, class308.field4545, class177.field2477, var12.field56, var58);
                                                if (var56 == null && class321.field4677) {
                                                    class284.method1679(var12, -10);
                                                }
                                            } else {
                                                var56 = var12.method23(class547.field8070, class563.field8235, -1, class332.field4821, class321.field4681.field1105, true, 0, class259.field3355, class203.field2769, 2048, class308.field4545, class177.field2477, -1, (class47) null);
                                                if (var56 == null && class321.field4677) {
                                                    class284.method1679(var12, -17);
                                                }
                                            }
                                        } else {
                                            class15 var59 = class262.method1577((byte) -17, var12.field105, false);
                                            class47 var60 = var12.field51 != -1 ? class203.field2769.method2971(-112, var12.field51) : null;
                                            if (var59 != null) {
                                                class242 var61 = !var12.field86 ? null : class321.field4681.field1105;
                                                var56 = var59.method103(var61, ~var12.field142 == -10, class332.field4821, 2048, var12.field69, var12.field56, var60, var12.field185, (byte) 126, var12.field115);
                                            }
                                        }
                                    } else {
                                        int var62 = var12.field105;
                                        if (var62 >= 0 && var62 < 2048) {
                                            class71 var63 = class35.field551[var62];
                                            class47 var64 = ~var12.field51 != 0 ? class203.field2769.method2971(-62, var12.field51) : null;
                                            if (var63 != null && (class478.field6850 == var62 || class323.method2004(var63.field1094, (byte) 42) == var12.field185)) {
                                                var56 = var63.field1105.method1486(var12.field69, 2048, -103, class547.field8070, class177.field2477, true, 0, class203.field2769, var12.field115, class332.field4821, -1, 0, var12.field56, class308.field4545, (class220[]) null, var64, (int[]) null, 0, (class47) null, class563.field8235, class259.field3355);
                                            }
                                        }
                                    }
                                } else {
                                    class390 var65 = class259.field3355.method2382(var12.field59, (byte) 28);
                                    if (var65 != null) {
                                        class390 var66 = var65.method2403(var12.field108, (byte) -59);
                                        class47 var67 = var12.field51 != -1 ? class203.field2769.method2971(-119, var12.field51) : null;
                                        class242 var68 = !var12.field86 ? null : class321.field4681.field1105;
                                        var56 = var66.method2421(2048, 1, var12.field69, var12.field56, var12.field115, -2, var67, class332.field4821, var68);
                                        if (var56 == null) {
                                            class284.method1679(var12, -122);
                                        } else {
                                            var57 = -var56.method1007() >> 1;
                                        }
                                    }
                                }
                                if (var56 != null) {
                                    int var69;
                                    if (var12.field141 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var12.field202 << 9) / var12.field141;
                                    }
                                    int var70;
                                    if (var12.field169 <= 0) {
                                        var70 = 512;
                                    } else {
                                        var70 = (var12.field76 << 9) / var12.field169;
                                    }
                                    int var71 = var14 - -(var12.field202 / 2);
                                    int var72 = var12.field76 / 2 + var15;
                                    if (!var12.field175) {
                                        var72 += var12.field38 * var70 >> 9;
                                        var71 += var12.field130 * var69 >> 9;
                                    }
                                    class242.field3215.method890();
                                    class332.field4821.method616(class242.field3215);
                                    class332.field4821.method667(var71, var72, var69, var70);
                                    class332.field4821.method638();
                                    if (var12.field188) {
                                        class332.field4821.method636(false);
                                    }
                                    if (!var12.field175) {
                                        int var73 = (var12.field138 << 2) * class271.field3549[var12.field164 << 3] >> 14;
                                        int var74 = (var12.field138 << 2) * class271.field3544[var12.field164 << 3] >> 14;
                                        class510.field7197.method891(-var12.field137 << 3);
                                        class510.field7197.method881(var12.field54 << 3);
                                        class510.field7197.method893(var12.field49 << 2, (var12.field125 << 2) + var57 + var73, (var12.field125 << 2) + var74);
                                        class510.field7197.method884(var12.field164 << 3);
                                    } else {
                                        class510.field7197.method886(var12.field164);
                                        class510.field7197.method881(var12.field54);
                                        class510.field7197.method879(var12.field137);
                                        class510.field7197.method893(var12.field130, var12.field38, var12.field103);
                                    }
                                    var12.method17(class510.field7197, 0, class45.field685, class332.field4821, var56);
                                    if (class257.field3336) {
                                        class332.field4821.method692(var14, var15, var12.field202 + var14, var12.field76 + var15);
                                    }
                                    if (var12.field175) {
                                        if (!var12.field183) {
                                            var56.method1054(class510.field7197, (class67) null, 1);
                                            if (var12.field36 != null) {
                                                class332.field4821.method679(var12.field36.method117());
                                            }
                                        } else {
                                            var56.method1030(class510.field7197, (class67) null, var12.field138, 1);
                                        }
                                    } else if (!var12.field183) {
                                        var56.method1054(class510.field7197, (class67) null, 1);
                                        if (var12.field36 != null) {
                                            class332.field4821.method679(var12.field36.method117());
                                        }
                                    } else {
                                        var56.method1030(class510.field7197, (class67) null, var12.field138 << 2, 1);
                                    }
                                    if (class257.field3336) {
                                        class332.field4821.method652(arg3, arg0, arg5, arg1);
                                    }
                                    if (var12.field188) {
                                        class332.field4821.method636(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIBIIII[[[BLr;II)V", line = 749)
    public static final void method1062(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, byte[][][] arg9, class98 arg10, int arg11, int arg12) {
        ++field2098;
        if (arg4 < 79) {
            field2099 = null;
        }
        if (~arg1 != -1 && arg8 != 0) {
            if (~arg1 == -10) {
                arg1 = 1;
                arg5 = 3 & arg5 - -1;
            }
            if (arg1 == 10) {
                arg5 = 3 & arg5 - -3;
                arg1 = 1;
            }
            if (arg1 == 11) {
                arg5 = arg5 + 3 & 3;
                arg1 = 8;
            }
            arg10.method716(arg3, arg2, arg12, arg11, arg7, arg6, arg9[arg1 + -1][arg5], arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V", line = 790)
    public static void method1063(int arg0) {
        field2100 = null;
        field2105 = null;
        if (arg0 != -6) {
            field2105 = null;
        }
        field2099 = null;
        field2097 = null;
    }
}

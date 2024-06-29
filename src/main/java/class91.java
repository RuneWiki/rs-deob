import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class91 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    public static int[] field1443 = new int[2];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Ldp;")
    public static class174 field1449;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lck;")
    public static class351 field1446;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1450;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/lang/String;")
    public String field1444;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method778(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lbk;I)V", line = 4)
    public static final void method769(class32 arg0, int arg1) {
        field1445++;
        if (class443.field6447 == null) {
            return;
        }
        class395 var2 = null;
        if (arg0.field460 == 0) {
            var2 = (class395) class219.method1656(arg0.field458, arg0.field459, arg0.field462);
        }
        if (arg0.field460 == 1) {
            var2 = (class395) class336.method2189(arg0.field458, arg0.field459, arg0.field462);
        }
        if (arg0.field460 == arg1) {
            var2 = (class395) class371.method2358(arg0.field458, arg0.field459, arg0.field462, field1450 == null ? (field1450 = method778("sc")) : field1450);
        }
        if (arg0.field460 == 3) {
            var2 = (class395) class37.method311(arg0.field458, arg0.field459, arg0.field462);
        }
        if (var2 == null) {
            arg0.field455 = 0;
            arg0.field456 = -1;
            arg0.field461 = 0;
        } else {
            arg0.field456 = var2.method1013(false);
            arg0.field455 = var2.method1024(arg1 ^ 0x50D1);
            arg0.field461 = var2.method1020(15829);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILpe;I)V", line = 43)
    public static final void method770(int arg0, int arg1, int arg2, class390 arg3, int arg4) {
        field1441++;
        if (arg2 != 0) {
            return;
        }
        class419 var5 = arg3.method2476((byte) 70);
        int var6 = arg3.field5606 - arg3.field5623.field1305 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg3.field5614 > 25) {
                arg3.field5661 = false;
                if (arg4 < 0 && var5.field6088 != -1) {
                    arg3.field5642 = var5.field6088;
                } else if (arg4 <= 0 || var5.field6114 == -1) {
                    arg3.field5642 = var5.field6087;
                } else {
                    arg3.field5642 = var5.field6114;
                }
            } else if (!arg3.field5661 || !var5.method2633(false, arg3.field5642)) {
                arg3.field5642 = var5.method2627((byte) 127);
                arg3.field5661 = arg3.field5642 != -1;
            }
        } else if (arg3.field5625 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class288.field4296[arg0] - arg3.field5623.field1305 & 0x3FFF;
            arg3.field5661 = false;
            if (arg1 == 2 && var5.field6081 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6116 != -1) {
                    arg3.field5642 = var5.field6116;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6098 != -1) {
                    arg3.field5642 = var5.field6098;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6096 == -1) {
                    arg3.field5642 = var5.field6081;
                } else {
                    arg3.field5642 = var5.field6096;
                }
            } else if (arg1 == 0 && var5.field6103 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6086 != -1) {
                    arg3.field5642 = var5.field6086;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6076 != -1) {
                    arg3.field5642 = var5.field6076;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6117 == -1) {
                    arg3.field5642 = var5.field6103;
                } else {
                    arg3.field5642 = var5.field6117;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6099 != -1) {
                arg3.field5642 = var5.field6099;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6118 != -1) {
                arg3.field5642 = var5.field6118;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6077 == -1) {
                arg3.field5642 = var5.field6087;
            } else {
                arg3.field5642 = var5.field6077;
            }
        } else if (var6 == 0 && arg3.field5614 <= 25) {
            arg3.field5661 = false;
            if (arg1 == 2 && var5.field6081 != -1) {
                arg3.field5642 = var5.field6081;
            } else if (arg1 == 0 && var5.field6103 != -1) {
                arg3.field5642 = var5.field6103;
            } else {
                arg3.field5642 = var5.field6087;
            }
        } else {
            if (arg1 == 2 && var5.field6081 != -1) {
                if (arg4 < 0 && var5.field6080 != -1) {
                    arg3.field5642 = var5.field6080;
                } else if (arg4 <= 0 || var5.field6111 == -1) {
                    arg3.field5642 = var5.field6081;
                } else {
                    arg3.field5642 = var5.field6111;
                }
            } else if (arg1 == 0 && var5.field6103 != -1) {
                if (arg4 < 0 && var5.field6090 != -1) {
                    arg3.field5642 = var5.field6090;
                } else if (arg4 <= 0 || var5.field6110 == -1) {
                    arg3.field5642 = var5.field6103;
                } else {
                    arg3.field5642 = var5.field6110;
                }
            } else if (arg4 < 0 && var5.field6078 != -1) {
                arg3.field5642 = var5.field6078;
            } else if (arg4 <= 0 || var5.field6104 == -1) {
                arg3.field5642 = var5.field6087;
            } else {
                arg3.field5642 = var5.field6104;
            }
            arg3.field5661 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII[Lmb;IIIIZ)V", line = 206)
    public static final void method771(int arg0, int arg1, int arg2, int arg3, class258[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field1437++;
        class73.field1235.method752(arg3, arg2, arg6, arg5);
        if (arg9) {
            field1449 = null;
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class258 var11 = arg4[var10];
            if (var11 != null && (var11.field3754 == arg0 || arg0 == -1412584499 && class273.field4109 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class256.field3698[class32.field449].setBounds(var11.field3750 + arg7, var11.field3908 - -arg8, var11.field3764, var11.field3758);
                    var12 = class32.field449++;
                } else {
                    var12 = arg1;
                }
                var11.field3885 = var12;
                var11.field3896 = class267.field4002;
                if (!var11.field3825 || !client.method1823(var11)) {
                    if (var11.field3821 > 0) {
                        class377.method2393(true, var11);
                    }
                    int var13 = var11.field3750 + arg7;
                    int var14 = var11.field3908 + arg8;
                    int var15 = var11.field3832;
                    if (class342.field4850 && (client.method1815(var11).field6033 != 0 || var11.field3793 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class273.field4109 == var11) {
                        if (arg0 != -1412584499 && !var11.field3876) {
                            class40.field622 = arg4;
                            class117.field1852 = arg7;
                            class452.field6567 = arg8;
                            continue;
                        }
                        if (class243.field3542 && class239.field3451) {
                            int var16 = class129.field2111;
                            int var17 = var16 - class174.field2567;
                            int var18 = class291.field4327;
                            int var19 = var18 - class197.field2877;
                            if (var17 < class278.field4187) {
                                var17 = class278.field4187;
                            }
                            if (class278.field4187 + class276.field4156.field3764 < var11.field3764 + var17) {
                                var17 = class278.field4187 + class276.field4156.field3764 - var11.field3764;
                            }
                            if (var19 < class452.field6584) {
                                var19 = class452.field6584;
                            }
                            var13 = var17;
                            if (var11.field3758 + var19 > class452.field6584 - -class276.field4156.field3758) {
                                var19 = class452.field6584 + class276.field4156.field3758 - var11.field3758;
                            }
                            var14 = var19;
                        }
                        if (!var11.field3876) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field3793 == 2) {
                        var25 = arg5;
                        var22 = arg3;
                        var24 = arg6;
                        var23 = arg2;
                    } else {
                        int var20 = var11.field3764 + var13;
                        int var21 = var11.field3758 + var14;
                        var22 = arg3 >= var13 ? arg3 : var13;
                        if (var11.field3793 == 9) {
                            var20++;
                            var21++;
                        }
                        var23 = arg2 < var14 ? var14 : arg2;
                        var24 = arg6 > var20 ? var20 : arg6;
                        var25 = arg5 > var21 ? var21 : arg5;
                    }
                    if (!var11.field3825 || var22 < var24 && var25 > var23) {
                        if (var11.field3821 != 0) {
                            if (var11.field3821 == 1337 || var11.field3821 == 1403) {
                                class156.method1218(var14, var11.field3758, 1, var13, var11.field3821 == 1403, var11.field3764);
                                class254.field3685[var12] = true;
                                class73.field1235.method752(arg3, arg2, arg6, arg5);
                                continue;
                            }
                            if (var11.field3821 == 1338) {
                                if (var11.method1871(class73.field1235, 16785) != null) {
                                    class11.method65((byte) 40);
                                    class408.method2577(0, var11, var14, var13, class73.field1235);
                                    class255.field3697[var12] = true;
                                    class73.field1235.method752(arg3, arg2, arg6, arg5);
                                }
                                continue;
                            }
                            if (var11.field3821 == 1339) {
                                if (var11.method1871(class73.field1235, 16785) != null) {
                                    class5.method24(var11, -112, var14, var13);
                                    class255.field3697[var12] = true;
                                    class73.field1235.method752(arg3, arg2, arg6, arg5);
                                }
                                continue;
                            }
                            if (var11.field3821 == 1400) {
                                class348.method2240(var13, var11.field3758, var11.field3764, class73.field1235, var14, (byte) 107, class196.field2873);
                                class254.field3685[var12] = true;
                                class73.field1235.method752(arg3, arg2, arg6, arg5);
                                continue;
                            }
                            if (var11.field3821 == 1401) {
                                class294.method2055(var11.field3764, var14, -111, var13, class73.field1235, var11.field3758);
                                class254.field3685[var12] = true;
                                class73.field1235.method752(arg3, arg2, arg6, arg5);
                                continue;
                            }
                            if (var11.field3821 == 1405) {
                                if (!class153.field2337 && !class399.field5871) {
                                    continue;
                                }
                                int var26 = var13 + var11.field3764;
                                int var27 = var14 + 15;
                                if (class153.field2337) {
                                    class107.field1763.method1673(var26, "Fps:" + class60.field970, -1, -256, -108, var27);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class107.field1763.method1673(var26, "Mem:" + var29 + "k", -1, var30, -102, var27);
                                    var27 += 15;
                                    int var31 = class73.field1235.method671() / 1024;
                                    class107.field1763.method1673(var26, "Offheap:" + var31 + "k", -1, var31 <= 65536 ? -256 : -65536, -105, var27);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class359.field5121[var35].method2391((byte) -15);
                                        var33 += class359.field5121[var35].method2396(2);
                                        var34 += class359.field5121[var35].method2395(-3202);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class333.method2178((long) var37, true, (byte) 21, 0, 2) + "% (" + var36 + "%)";
                                    class273.field4110.method1673(var26, var38, -1, -256, -121, var27);
                                    var27 += 12;
                                }
                                if (class198.field2888 > 0) {
                                    class273.field4110.method1673(var26, "Particles: " + class193.field2843 + " / " + class198.field2888, -1, -256, -114, var27);
                                }
                                var27 += 12;
                                if (class399.field5871) {
                                    class273.field4110.method1673(var26, "Polys: " + class73.field1235.method737() + " Models: " + class73.field1235.method740(), -1, -256, -111, var27);
                                    var27 += 12;
                                    class273.field4110.method1673(var26, "Ls: " + class107.field1769 + " La: " + class273.field4113 + " NPC: " + class117.field1844 + " Pl: " + class20.field306, -1, -256, -104, var27);
                                    var27 += 12;
                                    class248.method1791(40);
                                }
                                class254.field3685[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3793 == 0) {
                            if (!var11.field3825 && client.method1823(var11) && class183.field2714 != var11) {
                                continue;
                            }
                            if (!var11.field3825) {
                                if (var11.field3900 > var11.field3882 - var11.field3758) {
                                    var11.field3900 = var11.field3882 - var11.field3758;
                                }
                                if (var11.field3900 < 0) {
                                    var11.field3900 = 0;
                                }
                            }
                            if (var11.field3821 == 1407 && class73.field1235.method743()) {
                                class73.field1235.method680(var13, var14, var11.field3764, var11.field3758);
                            }
                            method771(var11.field3854, var12, var23, var22, arg4, var25, var24, var13 - var11.field3791, -var11.field3900 + var14, false);
                            if (var11.field3869 != null) {
                                method771(var11.field3854, var12, var23, var22, var11.field3869, var25, var24, var13 - var11.field3791, -var11.field3900 + var14, arg9);
                            }
                            class120 var39 = (class120) class355.field5045.method1219((long) var11.field3854, -114);
                            if (var39 != null) {
                                class303.method2077(var25, var24, var39.field1874, var22, 17968, var23, var13, var14, var12);
                            }
                            if (var11.field3821 == 1407 && class73.field1235.method743()) {
                                class73.field1235.method741();
                                class289.field4316 = true;
                            }
                            class73.field1235.method752(arg3, arg2, arg6, arg5);
                        }
                        if (class371.field5250[var12] || class447.field6525 > 1) {
                            if (var11.field3793 == 0 && !var11.field3825 && var11.field3882 > var11.field3758) {
                                class8.method56(var11.field3764 + var13, var11.field3900, -119, var14, var11.field3758, var11.field3882);
                            }
                            if (var11.field3793 != 1) {
                                if (var11.field3793 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field3814; var41++) {
                                        for (int var42 = 0; var42 < var11.field3905; var42++) {
                                            int var43 = (var11.field3769 + 32) * var42 + var13;
                                            int var44 = (var11.field3755 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var43 += var11.field3839[var40];
                                                var44 += var11.field3874[var40];
                                            }
                                            if (var11.field3847[var40] > 0) {
                                                boolean var45 = false;
                                                boolean var46 = false;
                                                int var47 = var11.field3847[var40] - 1;
                                                if ((var43 + 32) > arg3 && arg6 > var43 && arg2 < (var44 + 32) && arg5 > var44 || class133.field2141 == var11 && class225.field3326 == var40) {
                                                    class421 var48;
                                                    if (class47.field765 == 1 && class372.field5285 == var40 && class22.field335 == var11.field3854) {
                                                        var48 = class119.method1005(var11.field3759, 2, var47, class73.field1235, var11.field3837[var40], true, (class153) null, 0);
                                                    } else {
                                                        var48 = class119.method1005(var11.field3759, 1, var47, class73.field1235, var11.field3837[var40], !arg9, (class153) null, -13623264);
                                                    }
                                                    if (var48 == null) {
                                                        class107.method947(!arg9, var11);
                                                    } else if (class133.field2141 == var11 && class225.field3326 == var40) {
                                                        int var49 = class291.field4327 - class341.field4841;
                                                        int var50 = class129.field2111 - class380.field5388;
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class372.field5278 < 5) {
                                                            var49 = 0;
                                                            var50 = 0;
                                                        }
                                                        var48.method498(var43 + var50, var44 - -var49, 0, -2013265920, 1);
                                                        if (arg0 != -1) {
                                                            class258 var51 = arg4[arg0 & 0xFFFF];
                                                            int[] var52 = new int[4];
                                                            class73.field1235.method708(var52);
                                                            int var53 = var52[1];
                                                            int var54 = var52[3];
                                                            if (var53 > var44 + var49 && var51.field3900 > 0) {
                                                                int var55 = (var53 - var49 - var44) * class409.field5967 / 3;
                                                                if (var55 > (class409.field5967 * 10)) {
                                                                    var55 = class409.field5967 * 10;
                                                                }
                                                                if (var55 > var51.field3900) {
                                                                    var55 = var51.field3900;
                                                                }
                                                                class341.field4841 += var55;
                                                                var51.field3900 -= var55;
                                                                class107.method947(true, var51);
                                                            }
                                                            if (var54 < (var44 + var49 + 32) && var51.field3882 - var51.field3758 > var51.field3900) {
                                                                int var56 = (var44 + var49 + 32 - var54) * class409.field5967 / 3;
                                                                if ((class409.field5967 * 10) < var56) {
                                                                    var56 = class409.field5967 * 10;
                                                                }
                                                                if (var56 > (var51.field3882 - var51.field3758 - var51.field3900)) {
                                                                    var56 = var51.field3882 - var51.field3758 - var51.field3900;
                                                                }
                                                                var51.field3900 += var56;
                                                                class341.field4841 -= var56;
                                                                class107.method947(true, var51);
                                                            }
                                                        }
                                                    } else if (class21.field318 == var11 && class258.field3773 == var40) {
                                                        var48.method498(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var48.method2645(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field3846 != null && var40 < 20) {
                                                class421 var57 = var11.method1865(class73.field1235, var40, -97);
                                                if (var57 != null) {
                                                    var57.method2645(var43, var44);
                                                } else if (class22.field330) {
                                                    class107.method947(true, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field3793 == 3) {
                                    int var58;
                                    if (class85.method650(var11, 97)) {
                                        var58 = var11.field3732;
                                        if (class183.field2714 == var11 && var11.field3763 != 0) {
                                            var58 = var11.field3763;
                                        }
                                    } else {
                                        var58 = var11.field3772;
                                        if (class183.field2714 == var11 && var11.field3856 != 0) {
                                            var58 = var11.field3856;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3729) {
                                            class73.field1235.method681(var13, var14, var11.field3764, var11.field3758, var58, 0);
                                        } else {
                                            class73.field1235.method711(var13, var14, var11.field3764, var11.field3758, var58, 0);
                                        }
                                    } else if (var11.field3729) {
                                        class73.field1235.method681(var13, var14, var11.field3764, var11.field3758, var58 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class73.field1235.method711(var13, var14, var11.field3764, var11.field3758, 255 - (var15 & 0xFF) << 24 | var58 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field3793 == 4) {
                                    class220 var59 = var11.method1867(class73.field1235, -29873);
                                    if (var59 != null) {
                                        String var60 = var11.field3733;
                                        int var61;
                                        if (class85.method650(var11, 126)) {
                                            var61 = var11.field3732;
                                            if (class183.field2714 == var11 && var11.field3763 != 0) {
                                                var61 = var11.field3763;
                                            }
                                            if (var11.field3906.length() > 0) {
                                                var60 = var11.field3906;
                                            }
                                        } else {
                                            var61 = var11.field3772;
                                            if (class183.field2714 == var11 && var11.field3856 != 0) {
                                                var61 = var11.field3856;
                                            }
                                        }
                                        if (var11.field3825 && var11.field3765 != -1) {
                                            class124 var62 = class206.method1561(-124, var11.field3765);
                                            var60 = var62.field1999;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field2032 == 1 || var11.field3743 != 1) && var11.field3743 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class341.method2204(var11.field3743, 3);
                                            }
                                        }
                                        if (class132.field2132 == var11) {
                                            var60 = class281.field4212;
                                            var61 = var11.field3772;
                                        }
                                        if (!var11.field3825) {
                                            var60 = class231.method1715(var60, var11, 93);
                                        }
                                        if (class46.field754) {
                                            class73.field1235.method672(var13, var14, var11.field3764 + var13, var11.field3758 + var14);
                                        }
                                        var59.method1674(var13, var14, class171.field2548, var11.field3737, var11.field3764, (int[]) null, var11.field3788, var11.field3766, 0, 0, (class134) null, var60, (byte) -5, var61 | 0xFF000000, var11.field3758, var11.field3787 ? -16777216 : -1);
                                        if (class46.field754) {
                                            class73.field1235.method752(arg3, arg2, arg6, arg5);
                                        }
                                    } else if (class22.field330) {
                                        class107.method947(true, var11);
                                    }
                                } else if (var11.field3793 == 5) {
                                    if (!var11.field3825) {
                                        class421 var63 = var11.method1862(class85.method650(var11, 125), (byte) -26, class73.field1235);
                                        if (var63 != null) {
                                            var63.method2645(var13, var14);
                                        } else if (class22.field330) {
                                            class107.method947(!arg9, var11);
                                        }
                                    } else if (var11.field3892 < 0) {
                                        class421 var65;
                                        if (var11.field3765 == -1) {
                                            var65 = var11.method1862(false, (byte) -26, class73.field1235);
                                        } else {
                                            class153 var64 = var11.field3879 ? class86.field1394.field2072 : null;
                                            var65 = class119.method1005(var11.field3759, var11.field3842, var11.field3765, class73.field1235, var11.field3743, true, var64, var11.field3798 | 0xFF000000);
                                        }
                                        if (var65 != null) {
                                            int var66 = var65.method1461();
                                            int var67 = var65.method1463();
                                            if (var11.field3903) {
                                                class73.field1235.method672(var13, var14, var11.field3764 + var13, var11.field3758 + var14);
                                                if (var11.field3912 != 0) {
                                                    int var69 = (var11.field3764 - (1 - var66)) / var66;
                                                    int var70 = (var67 + var11.field3758 - 1) / var67;
                                                    for (int var71 = 0; var71 < var69; var71++) {
                                                        for (int var72 = 0; var72 < var70; var72++) {
                                                            var65.method2642((float) var66 / 2.0F + (float) (var66 * var71 + var13), (float) var67 / 2.0F + (float) (var67 * var72 + var14), 4096, var11.field3912);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var65.method1464(var13, var14, var11.field3764, var11.field3758, 0, 0, 1);
                                                } else {
                                                    var65.method1464(var13, var14, var11.field3764, var11.field3758, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class73.field1235.method752(arg3, arg2, arg6, arg5);
                                            } else if (var15 != 0) {
                                                int var68 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field3912 != 0) {
                                                    var65.method2643((float) var11.field3764 / 2.0F + (float) var13, (float) var11.field3758 / 2.0F + (float) var14, var11.field3764 * 4096 / var66, var11.field3912, 1, var68, 1);
                                                } else if (var11.field3764 == var66 && var11.field3758 == var67) {
                                                    var65.method498(var13, var14, 1, var68, 1);
                                                } else {
                                                    var65.method494(var13, var14, var11.field3764, var11.field3758, 1, var68, 1);
                                                }
                                            } else if (var11.field3912 != 0) {
                                                var65.method2642((float) var11.field3764 / 2.0F + (float) var13, (float) var11.field3758 / 2.0F + (float) var14, var11.field3764 * 4096 / var66, var11.field3912);
                                            } else if (var11.field3764 == var66 && var11.field3758 == var67) {
                                                var65.method2645(var13, var14);
                                            } else {
                                                var65.method2644(var13, var14, var11.field3764, var11.field3758);
                                            }
                                        } else if (class22.field330) {
                                            class107.method947(true, var11);
                                        }
                                    } else {
                                        var11.method1858(-99).method2816(0, var11.field3764, var11.field3758, class73.field1235, var13, var14, 0, var11.field3841 << 3, var11.field3736 << 3, false);
                                    }
                                } else if (var11.field3793 == 6) {
                                    boolean var73 = class85.method650(var11, 97);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field3790;
                                    } else {
                                        var74 = var11.field3828;
                                    }
                                    class19.method119(5);
                                    class100 var75 = null;
                                    int var76 = 0;
                                    if (var11.field3765 != -1) {
                                        class124 var77 = class206.method1561(126, var11.field3765);
                                        if (var77 != null) {
                                            class124 var78 = var77.method1047(var11.field3743, -1);
                                            class51 var79 = var74 == -1 ? null : class113.method974(var74, (byte) -121);
                                            class153 var80 = var11.field3879 ? class86.field1394.field2072 : null;
                                            var75 = var78.method1053(var80, var11.field3894, var11.field3811, var11.field3731, (byte) 111, 1024, var79, class73.field1235, 1);
                                            if (var75 == null) {
                                                class107.method947(!arg9, var11);
                                            } else {
                                                var76 = -var75.method541() / 2;
                                            }
                                        }
                                    } else if (var11.field3858 == 5) {
                                        if (var11.field3864 == -1) {
                                            var75 = class333.field4770.method1175((class51) null, (class51) null, 1024, true, -1, (byte) 118, (class109[]) null, class73.field1235, -1, -1, 0, -1, 0);
                                        } else {
                                            int var85 = var11.field3864;
                                            class127 var86;
                                            if (class379.field5381 == var85) {
                                                var86 = class86.field1394;
                                            } else {
                                                var86 = class367.field5225[var85];
                                            }
                                            class51 var87 = var74 == -1 ? null : class113.method974(var74, (byte) -86);
                                            if (var86 != null && (var85 == 2047 || class88.method660((byte) -88, var86.field2066) == var11.field3872)) {
                                                var75 = var86.field2072.method1175(var87, (class51) null, 1024, true, var11.field3731, (byte) 102, (class109[]) null, class73.field1235, var11.field3811, 0, var11.field3894, -1, 0);
                                            }
                                        }
                                    } else if (var11.field3858 == 8 || var11.field3858 == 9) {
                                        class188 var82 = class247.method1787(45, var11.field3864);
                                        class51 var83 = var74 == -1 ? null : class113.method974(var74, (byte) -65);
                                        if (var82 != null) {
                                            class153 var84 = var11.field3879 ? class86.field1394.field2072 : null;
                                            var75 = var82.method1458(var11.field3894, var11.field3872, 1024, (byte) 62, var84, var83, var11.field3858 == 9, class73.field1235, var11.field3731, var11.field3811);
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method1868(0, 1024, -26, (class51) null, class73.field1235, -1, var73, -1, class86.field1394.field2072);
                                        if (var75 == null && class22.field330) {
                                            class107.method947(true, var11);
                                        }
                                    } else {
                                        class51 var81 = class113.method974(var74, (byte) -95);
                                        var75 = var11.method1868(var11.field3894, 1024, 79, var81, class73.field1235, var11.field3811, var73, var11.field3731, class86.field1394.field2072);
                                        if (var75 == null && class22.field330) {
                                            class107.method947(!arg9, var11);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (var11.field3819 > 0) {
                                            var88 = (var11.field3764 << 9) / var11.field3819;
                                        } else {
                                            var88 = 512;
                                        }
                                        int var89;
                                        if (var11.field3728 > 0) {
                                            var89 = (var11.field3758 << 9) / var11.field3728;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = (var11.field3897 * var88 >> 9) + (var13 + (var11.field3764 / 2));
                                        int var91 = (var11.field3816 * var89 >> 9) + var11.field3758 / 2 + var14;
                                        class293.field4355.method1531();
                                        class73.field1235.method673(class293.field4355);
                                        int var92 = class56.field897[var11.field3771 << 3] * var11.field3888 >> 15;
                                        int var93 = class56.field898[var11.field3771 << 3] * var11.field3888 >> 15;
                                        class73.field1235.method704(var90, var91, var88, var89);
                                        class73.field1235.method693((float) var11.field3843, var11.field3871 ? (float) var11.field3776 : (float) var11.field3776 * 1.5F);
                                        if (class289.field4316) {
                                            class73.field1235.method751();
                                            class73.field1235.method742();
                                            class73.field1235.method752(arg3, arg2, arg6, arg5);
                                            class289.field4316 = false;
                                        }
                                        if (var11.field3789) {
                                            class73.field1235.method676(false);
                                        }
                                        if (var11.field3825) {
                                            class198.field2893.method1532(-var11.field3774 << 3);
                                            class198.field2893.method1534(var11.field3889 << 3);
                                            class198.field2893.method1528(var11.field3785, var92 + var76 + var11.field3752, var93 - -var11.field3752);
                                        } else {
                                            class198.field2893.method1541(var11.field3889 << 3);
                                            class198.field2893.method1528(0, var92, var93);
                                        }
                                        class198.field2893.method1542(var11.field3771 << 3);
                                        if (class46.field754) {
                                            class73.field1235.method672(var13, var14, var11.field3764 + var13, var14 - -var11.field3758);
                                        }
                                        if (var11.field3871) {
                                            var75.method531(class198.field2893, (class290) null, var11.field3888, 1);
                                        } else {
                                            var75.method530(class198.field2893, (class290) null, 1);
                                        }
                                        if (class46.field754) {
                                            class73.field1235.method752(arg3, arg2, arg6, arg5);
                                        }
                                        if (var11.field3789) {
                                            class73.field1235.method676(true);
                                        }
                                    }
                                } else {
                                    if (var11.field3793 == 7) {
                                        class220 var94 = var11.method1867(class73.field1235, -29873);
                                        if (var94 == null) {
                                            if (class22.field330) {
                                                class107.method947(true, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field3814; var96++) {
                                            for (int var97 = 0; var97 < var11.field3905; var97++) {
                                                if (var11.field3847[var95] > 0) {
                                                    class124 var98 = class206.method1561(-124, var11.field3847[var95] - 1);
                                                    String var99;
                                                    if (var98.field2032 != 1 && var11.field3837[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field1999 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field1999 + "</col> x" + class341.method2204(var11.field3837[var95], 3);
                                                    }
                                                    int var100 = (var11.field3769 + 115) * var97 + var13;
                                                    int var101 = (var11.field3755 + 12) * var96 + var14;
                                                    if (var11.field3766 == 0) {
                                                        var94.method1682((int[]) null, var101, var11.field3787 ? -16777216 : -1, class171.field2548, var100, var11.field3772 | 0xFF000000, var99, false);
                                                    } else if (var11.field3766 == 1) {
                                                        var94.method1668((byte) 92, var101, (int[]) null, var11.field3772 | 0xFF000000, var99, var11.field3787 ? -16777216 : -1, var100 + 57, class171.field2548);
                                                    } else {
                                                        var94.method1678(var100 + 114, class171.field2548, var11.field3772 | 0xFF000000, var99, (int[]) null, var11.field3787 ? -16777216 : -1, var101, (byte) -126);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field3793 == 8 && class348.field4926 == var11 && class390.field5679 == class351.field4984) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class220 var104 = class107.field1763;
                                        String var105 = var11.field3733;
                                        String var106 = class231.method1715(var105, var11, 121);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class269.field4041.method1448(var115, -20814);
                                            var103 += class269.field4041.field2741 + 1;
                                            if (var102 < var116) {
                                                var102 = var116;
                                            }
                                        }
                                        var102 += 6;
                                        var103 += 7;
                                        int var107 = var11.field3764 + var13 - var102 - 5;
                                        int var108 = var14 + var11.field3758 + 5;
                                        if (var107 < var13 + 5) {
                                            var107 = var13 + 5;
                                        }
                                        if (var102 + var107 > arg6) {
                                            var107 = arg6 - var102;
                                        }
                                        if (arg5 < var103 + var108) {
                                            var108 = arg5 - var103;
                                        }
                                        class73.field1235.method681(var107, var108, var102, var103, -96, 0);
                                        class73.field1235.method711(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field3733;
                                        int var110 = class269.field4041.field2741 + var108 + 2;
                                        String var111 = class231.method1715(var109, var11, 109);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 == -1) {
                                                var113 = var111;
                                                var111 = "";
                                            } else {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            }
                                            var104.method1677(var110, -16777216, (byte) 20, -1, var113, var107 + 3);
                                            var110 += class269.field4041.field2741 + 1;
                                        }
                                    }
                                    if (var11.field3793 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field3818) {
                                            var117 = var14;
                                            var118 = var13;
                                            var119 = var11.field3758 + var14;
                                            var120 = var11.field3764 + var13;
                                        } else {
                                            var117 = var11.field3758 + var14;
                                            var118 = var13;
                                            var119 = var14;
                                            var120 = var11.field3764 + var13;
                                        }
                                        if (var11.field3880 == 1) {
                                            class73.field1235.method762(var118, var119, var120, var117, var11.field3772, 0);
                                        } else {
                                            class73.field1235.method696(var118, var119, var120, var117, var11.field3772, var11.field3880, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lec;B)Lba;", line = 1257)
    public static final class270 method772(class37 arg0, byte arg1) {
        arg0.method271((byte) 123);
        if (arg1 <= 33) {
            field1443 = null;
        }
        field1448++;
        int var2 = arg0.method271((byte) 102);
        class270 var3 = class373.method2375(81, var2);
        var3.field4059 = arg0.method271((byte) 122);
        int var4 = arg0.method271((byte) 116);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method271((byte) 106);
            var3.method78((byte) 108, arg0, var6);
        }
        var3.method83(true);
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Ljq;", line = 1293)
    public static final class183 method773(int arg0, int arg1) {
        field1438++;
        class18 var2 = class205.field3011;
        class183 var3;
        synchronized (class205.field3011) {
            var3 = (class183) class205.field3011.method103(arg0 - 14038, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class397.field5848.method1355(arg1, arg0 ^ 0xFFFFF817, 3);
        class183 var5 = new class183();
        if (arg0 != 14038) {
            field1449 = null;
        }
        if (var4 != null) {
            var5.method1421(new class37(var4), -128);
        }
        class18 var6 = class205.field3011;
        synchronized (class205.field3011) {
            class205.field3011.method113(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V", line = 1332)
    public static final void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1439++;
        class115.method982(arg6, -45);
        int var7 = 0;
        int var8 = arg6 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class286.field4283[arg4];
        int var16 = arg1 - var8;
        class47.method379(var16, (byte) 71, arg2, var15, arg1 - arg6);
        if (arg0 < 51) {
            return;
        }
        int var17 = arg1 + var8;
        class47.method379(var17, (byte) 97, arg5, var15, var16);
        class47.method379(arg1 + arg6, (byte) 66, arg2, var15, var17);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class355.field5054[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class286.field4283[arg4 + var9];
                    int[] var19 = class286.field4283[arg4 - var9];
                    int var20 = class355.field5054[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class47.method379(var24, (byte) 75, arg2, var18, var22);
                    class47.method379(var23, (byte) 64, arg5, var18, var24);
                    class47.method379(var21, (byte) 105, arg2, var18, var23);
                    class47.method379(var24, (byte) 77, arg2, var19, var22);
                    class47.method379(var23, (byte) 126, arg5, var19, var24);
                    class47.method379(var21, (byte) 99, arg2, var19, var23);
                } else {
                    int[] var25 = class286.field4283[arg4 + var9];
                    int[] var26 = class286.field4283[arg4 - var9];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class47.method379(var27, (byte) 85, arg2, var25, var28);
                    class47.method379(var27, (byte) 108, arg2, var26, var28);
                }
            }
            int[] var29 = class286.field4283[arg4 + var7];
            int[] var30 = class286.field4283[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class355.field5054[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class47.method379(var35, (byte) 113, arg2, var29, var32);
                class47.method379(var34, (byte) 64, arg5, var29, var35);
                class47.method379(var31, (byte) 64, arg2, var29, var34);
                class47.method379(var35, (byte) 111, arg2, var30, var32);
                class47.method379(var34, (byte) 63, arg5, var30, var35);
                class47.method379(var31, (byte) 63, arg2, var30, var34);
            } else {
                class47.method379(var31, (byte) 65, arg2, var29, var32);
                class47.method379(var31, (byte) 93, arg2, var30, var32);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lec;Z)Llp;", line = 1461)
    public static final class62 method775(class37 arg0, boolean arg1) {
        field1442++;
        if (!arg1) {
            field1449 = null;
        }
        return new class62(arg0.method321((byte) 124), arg0.method321((byte) 113), arg0.method321((byte) 108), arg0.method321((byte) 111), arg0.method321((byte) 96), arg0.method321((byte) 110), arg0.method321((byte) 102), arg0.method321((byte) 125), arg0.method295(true), arg0.method271((byte) 105));
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 1483)
    public static void method776(int arg0) {
        if (arg0 != -1) {
            method777(70, -82);
        }
        field1443 = null;
        field1449 = null;
        field1446 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V", line = 1496)
    public static final void method777(int arg0, int arg1) {
        field1440++;
        int var2 = -21 / ((-arg0 - 35) / 39);
        class221 var3 = class447.method2795(14, (byte) -49, arg1);
        var3.method1689(-47);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class562 extends class360 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field8030 = 0;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Z")
    public boolean field8035 = false;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    private int field8059 = 0;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    private int field8060 = 0;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    private int field8045 = -1;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field8036 = -32768;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    private int field8033;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field8041;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field8049;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "Lbj;")
    private class439 field8061;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field8052 = 0;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lqp;")
    private class585 field8039;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIILqa;)Lr;", line = 7)
    private final class519 method3197(byte arg0, int arg1, int arg2, class167 arg3) {
        if (arg0 != 4) {
            return null;
        } else {
            ++field8044;
            class347 var5 = class522.field7247.method2489(30, arg1);
            class542 var6 = class587.field8363[super.field5116];
            class542 var7 = this.field8033 < 3 ? class587.field8363[this.field8033 + 1] : null;
            return !this.field8035 ? var5.method2103(true, this.field8060, var7, super.field5111, (byte) -125, var6, arg3, arg2, class49.field739, this.field8045, super.field5108, super.field5109, this.field8030) : var5.method2103(true, 0, var7, super.field5111, (byte) -104, var6, arg3, arg2, class49.field739, -1, super.field5108, super.field5109, -1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 29)
    public class562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8033 = arg4;
        this.field8041 = arg0;
        this.field8059 = arg12;
        this.field8049 = arg1 + arg2;
        class347 var14 = class522.field7247.method2489(30, this.field8041);
        int var15 = var14.field4961;
        if (~var15 == 0) {
            this.field8035 = true;
        } else {
            this.field8061 = class49.field739.method2297((byte) 114, var15);
            this.field8035 = false;
        }
        if (~this.field8049 == ~arg2) {
            class402.method2456(false, super.field5109, this.field8030, this.field8061, (byte) -23, super.field5108, super.field5116);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;I)Lbi;", line = 63)
    public final class465 method267(class167 arg0, int arg1) {
        ++field8046;
        class519 var3 = this.method3197((byte) 4, this.field8041, (this.field8059 != 0 ? 5 : 0) | 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (this.field8059 != 0) {
                var3.method1367(this.field8059 * 2048);
            }
            class105 var4 = arg0.method637();
            var4.method884(super.field5108, super.field5111, super.field5109);
            if (this.field8039 != null) {
                class616 var5 = this.field8039.method3350();
                arg0.method553(var3, var5, var4, (class315) null, 0);
            } else {
                var3.method1379(var4, (class315) null, 0);
            }
            if (arg1 != 2) {
                return null;
            } else {
                this.field8036 = var3.method1390();
                this.method3198(true, arg0, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLqa;Lr;)V", line = 105)
    private final void method3198(boolean arg0, class167 arg1, class519 arg2) {
        ++field8055;
        class595[] var4 = arg2.method1375();
        class643[] var5 = arg2.method1372();
        if ((this.field8039 == null || this.field8039.field8333) && (var4 != null || var5 != null)) {
            this.field8039 = class585.method3353(class310.field4553);
        }
        if (!arg0) {
            this.method868(false);
        }
        if (this.field8039 != null) {
            this.field8039.method3345(arg1, (long) class310.field4553, var4, var5, false);
            this.field8039.method3346(super.field5116, super.field5117, super.field5119, super.field5113, super.field5107);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(ILqa;)Lkm;", line = 137)
    public final class120 method260(int arg0, class167 arg1) {
        ++field8054;
        return arg0 >= -50 ? null : null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 149)
    public static final void method3199(byte arg0) {
        ++field8043;
        class611.field8683 = new class47();
        if (arg0 != -91) {
            method3204(-34, 71, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I", line = 161)
    public static final int method3200(int arg0) {
        if (arg0 >= -19) {
            method3204(108, 71, (byte) -107);
        }
        ++field8050;
        return class424.field6208;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)I", line = 172)
    public final int method1175(boolean arg0) {
        ++field8047;
        if (arg0) {
            this.method866((byte) 59, false, -100, (class167) null, 0, -12, (class103) null);
        }
        return this.field8036;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)I", line = 184)
    public static final int method3201(byte arg0, int arg1, int arg2) {
        int var3 = -91 % ((arg0 - -4) / 46);
        ++field8032;
        return ~arg1 != -5 && arg1 != 5 ? 256 : class24.field329[3 & arg2];
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 197)
    protected final void finalize() {
        if (this.field8039 != null) {
            this.field8039.method3347();
        }
        ++field8062;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIII)V", line = 210)
    public static final void method3202(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field8031;
        int var7 = class43.field586;
        int[] var8 = class343.field4927;
        class24.field327 = 0;
        for (int var9 = 0; ~(class128.field2098 + var7) < ~var9; ++var9) {
            class432 var32 = null;
            class85 var33;
            if (var9 < var7) {
                var33 = class39.field536[var8[var9]];
            } else {
                var33 = ((class181) class432.field6368.method740(0, (long) class591.field8401[-var7 + var9])).field2623;
                var32 = ((class170) var33).field2492;
                if (var32.field6304 != null) {
                    var32 = var32.method2582(0, class401.field6001);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (~var33.field1497 <= -1 && (class79.field1432 == var33.field1502 || class644.field9367.field5116 == var33.field5116)) {
                class341.method2089(0, var33, arg1 >> 1, var33.method784((byte) 113), arg0, arg6, arg4 >> 1);
                if (class621.field8750[0] >= 0) {
                    if (var33.field1512 != null && (var9 >= var7 || class390.field5815 == 0 || class390.field5815 == 3 || ~class390.field5815 == -2 && class220.method1474((byte) -119, ((class400) var33).field5958)) && class206.field2918 > class24.field327) {
                        class206.field2914[class24.field327] = class26.field358.method3651(-10408, var33.field1512) / 2;
                        class206.field2910[class24.field327] = class621.field8750[0];
                        class206.field2920[class24.field327] = class621.field8750[1];
                        class206.field2912[class24.field327] = var33.field1470;
                        class206.field2922[class24.field327] = var33.field1541;
                        class206.field2919[class24.field327] = var33.field1562;
                        class206.field2911[class24.field327] = var33.field1512;
                        ++class24.field327;
                    }
                    int var34 = class621.field8750[1] + arg5;
                    int var45;
                    if (!var33.field1493 && class310.field4553 < var33.field1547) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (~var9 <= ~var7) {
                            var37 = var32.field6353;
                            if (~var37 == 0) {
                                var37 = var33.method772(0).field4285;
                            }
                        } else {
                            class400 var38 = class39.field536[var8[var9]];
                            var37 = var33.method772(0).field4285;
                            if (var38.field5977) {
                                var36 = 2;
                            }
                        }
                        class116[] var39 = class498.field6975;
                        if (var37 != -1) {
                            class116[] var40 = (class116[]) class111.field1831.method2407(arg3, (long) var37);
                            if (var40 == null) {
                                class518[] var41 = class518.method2924(class325.field4675, var37, 0);
                                if (var41 != null) {
                                    var40 = new class116[var41.length];
                                    for (int var42 = 0; ~var42 > ~var41.length; ++var42) {
                                        var40[var42] = class159.field2378.method548(var41[var42], true);
                                    }
                                    class111.field1831.method2408(var40, (long) var37, -117);
                                }
                            }
                            if (var40 != null && ~var40.length <= -3) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class116 var43 = var39[0];
                        class116 var44 = var39[var36];
                        var45 = var34 - Math.max(class26.field358.field9193, var43.method968());
                        int var46 = class621.field8750[0] + arg2 + -(var43.method962() >> 1);
                        int var47 = var43.method962() * var33.field1548 / 255;
                        if (var33.field1548 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method953(var46, var45);
                        class159.field2378.method581(var46, var45, var46 + var47, var43.method968() + var45);
                        var44.method953(var46, var45);
                        class159.field2378.method615(arg2, arg5, arg2 + arg4, arg1 + arg5);
                    } else {
                        var45 = var34 - Math.max(class26.field358.field9193, class498.field6975[0].method968());
                    }
                    var45 -= 2;
                    if (!var33.field1493) {
                        if (var33.field1490 > class310.field4553) {
                            class116 var48 = class384.field5708[!var33.field1517 ? 0 : 2];
                            class116 var49 = class384.field5708[!var33.field1517 ? 1 : 3];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class170) {
                                var51 = var32.field6364;
                                if (~var51 == 0) {
                                    var51 = var33.method772(0).field4294;
                                }
                            } else {
                                var51 = var33.method772(0).field4294;
                            }
                            if (~var51 != 0) {
                                class116[] var52 = (class116[]) class332.field4767.method2407(arg3, (long) var51);
                                if (var52 == null) {
                                    class518[] var53 = class518.method2924(class325.field4675, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class116[var53.length];
                                        for (int var54 = 0; var53.length > var54; ++var54) {
                                            var52[var54] = class159.field2378.method548(var53[var54], true);
                                        }
                                        class332.field4767.method2408(var52, (long) var51, -122);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var48 = var52[var33.field1517 ? 2 : 0];
                                    var49 = var52[!var33.field1517 ? 1 : 3];
                                }
                            }
                            int var55 = -class310.field4553 + var33.field1490;
                            int var56;
                            if (var55 <= var33.field1474) {
                                var56 = var48.method962();
                            } else {
                                int var57 = var55 - var33.field1474;
                                int var58 = var33.field1528 == 0 ? 0 : (-var57 + var33.field1501) / var33.field1528 * var33.field1528;
                                var56 = var48.method962() * var58 / var33.field1501;
                            }
                            int var59 = var48.method968();
                            var45 -= var59;
                            int var60 = class621.field8750[0] + arg2 + -(var48.method962() >> 1);
                            var48.method953(var60, var45);
                            class159.field2378.method581(var60, var45, var60 - -var56, var45 + var59);
                            var49.method953(var60, var45);
                            var45 -= 2;
                            class159.field2378.method615(arg2, arg5, arg2 - -arg4, arg1 + arg5);
                        }
                        if (~var7 < ~var9) {
                            class400 var61 = (class400) var33;
                            if (~var61.field5975 != 0) {
                                var45 -= 25;
                                class501.field7032[var61.field5975].method953(arg2 + -12 - -class621.field8750[0], var45);
                                var45 -= 2;
                            }
                            if (var61.field5982 != -1) {
                                var45 -= 25;
                                class471.field6769[var61.field5982].method953(class621.field8750[0] + -12 + arg2, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field6348 >= 0 && ~class471.field6769.length < ~var32.field6348) {
                            class116 var62 = class471.field6769[var32.field6348];
                            var45 -= 25;
                            var62.method953(class621.field8750[0] + arg2 + -(var62.method962() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (var33 instanceof class400) {
                        if (~var9 <= -1) {
                            int var63 = 0;
                            class371[] var64 = class451.field6552;
                            for (int var65 = 0; ~var65 > ~var64.length; ++var65) {
                                class371 var67 = var64[var65];
                                if (var67 != null && var67.field5361 == 10 && ~var8[var9] == ~var67.field5357) {
                                    class116 var68 = class128.field2091[var67.field5360];
                                    if (~var63 > ~var68.method968()) {
                                        var63 = var68.method968();
                                    }
                                    var68.method953(arg2 - (-class621.field8750[0] - -12), -var68.method968() + var45);
                                }
                            }
                            if (~var63 < -1) {
                                var10000 = var45 - (var63 + 2);
                            }
                        }
                    } else {
                        int var69 = 0;
                        class371[] var70 = class451.field6552;
                        for (int var71 = 0; ~var71 > ~var70.length; ++var71) {
                            class371 var76 = var70[var71];
                            if (var76 != null && ~var76.field5361 == -2 && ~class591.field8401[var9 - var7] == ~var76.field5357) {
                                class116 var77 = class128.field2091[var76.field5360];
                                if (var69 < var77.method968()) {
                                    var69 = var77.method968();
                                }
                                if (class310.field4553 % 20 < 10) {
                                    var77.method953(class621.field8750[0] + -12 + arg2, var45 - var77.method968());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var73 = 0; ~var73 > -5; ++var73) {
                        if (~var33.field1499[var73] < ~class310.field4553) {
                            int var74 = var33.method784((byte) 80) / 2;
                            class341.method2089(0, var33, arg1 >> 1, var74, arg0, arg6, arg4 >> 1);
                            if (~class621.field8750[0] < 0) {
                                int var75 = class225.field3360[var33.field1532[var73]].method962();
                                if (~var73 == -2) {
                                    class621.field8750[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class621.field8750[0] -= var75 + -9;
                                    class621.field8750[1] -= 10;
                                }
                                if (~var73 == -4) {
                                    class621.field8750[0] += var75 + -9;
                                    class621.field8750[1] -= 10;
                                }
                                class225.field3360[var33.field1532[var73]].method953(arg2 - (var75 >> 1) + class621.field8750[0], class621.field8750[1] + arg5 + -12);
                                class380.field5593.method1635(Integer.toString(var33.field1482[var73]), class621.field8750[0] - 1 + arg2, 0, 16777215, class621.field8750[1] + arg5 - -3, -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class142.field2217; ++var10) {
            int var28 = class189.field2716[var10];
            class85 var29;
            if (~var28 > -2049) {
                var29 = class39.field536[var28];
            } else {
                var29 = ((class181) class432.field6368.method740(0, (long) (var28 - 2048))).field2623;
            }
            int var30 = class441.field6444[var10];
            class85 var31;
            if (~var30 <= -2049) {
                var31 = ((class181) class432.field6368.method740(0, (long) (var30 + -2048))).field2623;
            } else {
                var31 = class39.field536[var30];
            }
            class524.method2953(-125, var31, arg4, arg2, arg0, arg5, var29, --var29.field1529, arg6, arg1);
        }
        int var11 = class26.field358.field9193 + class26.field358.field9192 + 2;
        int var12 = 0;
        if (arg3) {
            field8052 = 58;
        }
        while (~class24.field327 < ~var12) {
            int var13 = class206.field2910[var12];
            int var14 = class206.field2920[var12];
            int var15 = class206.field2914[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; ~var27 > ~var12; ++var27) {
                    if (~(class206.field2920[var27] + -var11) > ~(var14 + 2) && -var11 + var14 < class206.field2920[var27] - -2 && ~(class206.field2914[var27] + class206.field2910[var27]) < ~(-var15 + var13) && ~(var13 + var15) < ~(class206.field2910[var27] + -class206.field2914[var27]) && ~(class206.field2920[var27] + -var11) > ~var14) {
                        var14 = class206.field2920[var27] + -var11;
                        var16 = true;
                    }
                }
            }
            class206.field2920[var12] = var14;
            String var17 = class206.field2911[var12];
            if (class229.field3402 != 0) {
                class273.field3996.method1635(var17, arg2 + var13, -16777216, 16777215, arg5 - -var14, -256);
            } else {
                int var18 = 16776960;
                if (class206.field2912[var12] < 6) {
                    var18 = class261.field3787[class206.field2912[var12]];
                }
                if (~class206.field2912[var12] == -7) {
                    var18 = class79.field1432 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class206.field2912[var12] == -8) {
                    var18 = ~(class79.field1432 % 20) > -11 ? 255 : 65535;
                }
                if (~class206.field2912[var12] == -9) {
                    var18 = ~(class79.field1432 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class206.field2912[var12] == 9) {
                    int var19 = -class206.field2919[var12] + 150;
                    if (~var19 <= -51) {
                        if (~var19 > -101) {
                            var18 = -((var19 + -50) * 327680) + 16776960;
                        } else if (var19 < 150) {
                            var18 = (var19 + -100) * 5 + 65280;
                        }
                    } else {
                        var18 = var19 * 1280 + 16711680;
                    }
                }
                if (class206.field2912[var12] == 10) {
                    int var20 = -class206.field2919[var12] + 150;
                    if (~var20 > -51) {
                        var18 = 16711680 - -(var20 * 5);
                    } else if (~var20 > -101) {
                        var18 = 16711935 - var20 * 327680 + 16384000;
                    } else if (var20 < 150) {
                        var18 = -((var20 + -100) * 5) + -32767745 - -(var20 * 327680);
                    }
                }
                if (~class206.field2912[var12] == -12) {
                    int var21 = 150 - class206.field2919[var12];
                    if (var21 >= 50) {
                        if (~var21 <= -101) {
                            if (~var21 > -151) {
                                var18 = 32768000 - var21 * 327680 + 16777215;
                            }
                        } else {
                            var18 = 65280 - -((var21 - 50) * 327685);
                        }
                    } else {
                        var18 = -(var21 * 327685) + 16777215;
                    }
                }
                int var22 = var18 | -16777216;
                if (~class206.field2922[var12] == -1) {
                    class273.field3996.method1635(var17, arg2 - -var13, -16777216, 16777215, arg5 + var14, var22);
                }
                if (class206.field2922[var12] == 1) {
                    class273.field3996.method1643((byte) 63, var22, class79.field1432, var17, -16777216, arg2 + var13, arg5 - -var14);
                }
                if (~class206.field2922[var12] == -3) {
                    class273.field3996.method1633(19047, var22, -16777216, arg5 + var14, var17, arg2 - -var13, class79.field1432);
                }
                if (class206.field2922[var12] == 3) {
                    class273.field3996.method1644(class79.field1432, 150 - class206.field2919[var12], arg5 + var14, false, -16777216, var22, arg2 + var13, var17);
                }
                if (~class206.field2922[var12] == -5) {
                    int var23 = (-class206.field2919[var12] + 150) * (100 + class26.field358.method3651(-10408, var17)) / 150;
                    class159.field2378.method581(arg2 + var13 - 50, arg5, arg2 + 50 - -var13, arg5 - -arg1);
                    class273.field3996.method1642(-16777216, (byte) 105, var13 + 50 + arg2 + -var23, arg5 - -var14, var17, var22);
                    class159.field2378.method615(arg2, arg5, arg2 + arg4, arg1 + arg5);
                }
                if (~class206.field2922[var12] == -6) {
                    int var24 = 150 - class206.field2919[var12];
                    int var25 = 0;
                    if (var24 >= 25) {
                        if (~var24 < -126) {
                            var25 = var24 - 125;
                        }
                    } else {
                        var25 = var24 + -25;
                    }
                    int var26 = class26.field358.field9193 + class26.field358.field9192;
                    class159.field2378.method581(arg2, arg5 + -1 - (-var14 - -var26), arg2 - -arg4, arg5 - -var14 + 5);
                    class273.field3996.method1635(var17, arg2 + var13, -16777216, 16777215, arg5 + var25 + var14, var22);
                    class159.field2378.method615(arg2, arg5, arg2 + arg4, arg1 + arg5);
                }
            }
            ++var12;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;B)V", line = 796)
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 != -40) {
            method3202(38, -90, -20, false, -18, 79, 79);
        }
        ++field8051;
        class519 var3 = this.method3197((byte) 4, this.field8041, 0, arg0);
        if (var3 != null) {
            this.method3198(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Z", line = 812)
    public final boolean method868(boolean arg0) {
        ++field8037;
        if (arg0) {
            this.field8045 = -85;
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljk;III)V", line = 825)
    public static final void method3203(class170 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 9656) {
            field8052 = -81;
        }
        if (~arg0.field1514 == ~arg2 && ~arg2 != 0) {
            class439 var4 = class49.field739.method2297((byte) 117, arg2);
            int var5 = var4.field6396;
            if (var5 == 1) {
                arg0.field1488 = 0;
                arg0.field1519 = arg1;
                arg0.field1537 = 1;
                arg0.field1511 = 0;
                arg0.field1506 = 0;
                class402.method2456(false, arg0.field5109, arg0.field1511, var4, (byte) -23, arg0.field5108, arg0.field5116);
            }
            if (~var5 == -3) {
                arg0.field1488 = 0;
            }
        } else if (~arg2 == 0 || ~arg0.field1514 == 0 || class49.field739.method2297((byte) 109, arg2).field6408 >= class49.field739.method2297((byte) 122, arg0.field1514).field6408) {
            arg0.field1519 = arg1;
            arg0.field1514 = arg2;
            arg0.field1488 = 0;
            arg0.field1537 = 1;
            arg0.field1511 = 0;
            arg0.field1576 = arg0.field1567;
            arg0.field1506 = 0;
            if (~arg0.field1514 != 0) {
                class402.method2456(false, arg0.field5109, arg0.field1511, class49.field739.method2297((byte) 110, arg0.field1514), (byte) -23, arg0.field5108, arg0.field5116);
            }
        }
        ++field8053;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Z", line = 882)
    public static final boolean method3204(int arg0, int arg1, byte arg2) {
        ++field8057;
        if (arg2 != -104) {
            field8052 = 98;
        }
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 893)
    public final void method3205(int arg0, byte arg1) {
        ++field8034;
        if (!this.field8035) {
            this.field8060 += arg0;
            if (arg1 == -96) {
                while (this.field8060 > this.field8061.field6413[this.field8030]) {
                    this.field8060 -= this.field8061.field6413[this.field8030];
                    ++this.field8030;
                    if (~this.field8061.field6416.length >= ~this.field8030) {
                        this.field8035 = true;
                        break;
                    }
                }
                if (!this.field8035) {
                    class402.method2456(false, super.field5109, this.field8030, this.field8061, (byte) -23, super.field5108, super.field5116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 929)
    public static final void method3206(int arg0) {
        if (arg0 == 23874) {
            if (!class159.field2378.method660()) {
                class471.method2738(127, class646.field9388);
            } else {
                class159.field2378.method605(class474.field6795);
                class185.method1243((byte) -122);
                class159.field2378.method624(class474.field6795);
                class159.field2378.method394(class474.field6795);
            }
            ++field8038;
            class530.method2980(-6891);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 953)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field8058;
        if (arg0 != -84) {
            method3206(-112);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLqa;II)Z", line = 964)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        if (arg0 != 29) {
            this.method260(-11, (class167) null);
        }
        ++field8048;
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)V", line = 976)
    public final void method3207(boolean arg0) {
        ++field8040;
        if (this.field8039 != null) {
            this.field8039.method3347();
        }
        if (arg0) {
            this.field8039 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lae;Lco;BI)V", line = 989)
    public static final void method3208(class40 arg0, class268 arg1, byte arg2, int arg3) {
        ++field8056;
        if (arg2 != -115) {
            method3202(72, -58, 65, false, -16, -33, 72);
        }
        class418 var4 = new class418();
        var4.field6155 = arg1.method1738(255);
        var4.field6152 = arg1.method1748(-94);
        var4.field6148 = new class329[var4.field6155];
        var4.field6146 = new int[var4.field6155];
        var4.field6147 = new class329[var4.field6155];
        var4.field6151 = new int[var4.field6155];
        var4.field6150 = new int[var4.field6155];
        var4.field6156 = new byte[var4.field6155][][];
        for (int var5 = 0; var4.field6155 > var5; ++var5) {
            try {
                int var6 = arg1.method1738(255);
                if (~var6 != -1 && var6 != 1 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = arg1.method1752(false);
                        String var8 = arg1.method1752(false);
                        int var9 = arg1.method1738(arg2 ^ -142);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = arg1.method1752(false);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var9 > var13; ++var13) {
                                int var14 = arg1.method1748(-48);
                                var12[var13] = new byte[var14];
                                arg1.method1695(var12[var13], (byte) -52, var14, 0);
                            }
                        }
                        var4.field6150[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var16 < var9; ++var16) {
                            var15[var16] = class366.method2210(150, var10[var16]);
                        }
                        var4.field6148[var5] = arg0.method352(class366.method2210(150, var7), -45, var15, var8);
                        var4.field6156[var5] = var12;
                    }
                } else {
                    String var17 = arg1.method1752(false);
                    String var18 = arg1.method1752(false);
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg1.method1748(85);
                    }
                    var4.field6150[var5] = var6;
                    var4.field6146[var5] = var19;
                    var4.field6147[var5] = arg0.method368(class366.method2210(150, var17), (byte) 60, var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field6151[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6151[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6151[var5] = -3;
            } catch (Exception var23) {
                var4.field6151[var5] = -4;
            } catch (Throwable var24) {
                var4.field6151[var5] = -5;
            }
        }
        class611.field8683.method414(var4, (byte) 17);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V", line = 1100)
    public final void method867(int arg0) {
        ++field8042;
        if (arg0 >= 12) {
            throw new IllegalStateException();
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class416 extends class264 {

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "Ljo;")
    public static class351 field5877 = new class351(23, 4);

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(ILmfa;)V")
    public class416(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
    public final boolean method2492(int arg0) {
        if (arg0 != 14996) {
            return false;
        } else {
            ++field5875;
            return !super.field3731.method3633(110);
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field5879;
        int var2 = -44 % ((arg0 - 1) / 41);
        if (super.field3731.method3633(99)) {
            super.field3733 = 0;
        }
        if (super.field3733 < 0 && super.field3733 > 2) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lmfa;)V")
    public class416(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 != 82) {
            field5877 = null;
        }
        field5877 = null;
    }

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)I")
    public static final int method2494(int arg0) {
        ++field5873;
        if (arg0 != 0) {
            method2493(55);
        }
        return class203.field2976.method616(-4604);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)I")
    public final int method2495(byte arg0) {
        ++field5876;
        if (arg0 > -31) {
            this.method2495((byte) -10);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBILnba;)V")
    public static final void method2496(int arg0, byte arg1, int arg2, class312 arg3) {
        ++field5871;
        if (arg3 != null && class551.field7826.field5911 != arg3) {
            int var4 = arg3.field4639;
            int var5 = arg3.field4632;
            int var6 = arg3.field4640;
            int var7 = (int) arg3.field4647;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            long var8 = arg3.field4647;
            if (~var6 == -20 || var6 == 1009) {
                class587.method3405(var4, var7, true, arg3.field4633, var5);
            }
            if (~var6 == -4) {
                class235.field3406 = 0;
                class667.field9389 = arg0;
                class419.field5898 = arg2;
                class575.field8137 = 2;
                ++class458.field6561;
                class731 var10 = class155.method1222(260, class704.field9912, class237.field3417);
                var10.field10211.method860(class103.field1295 + var4, (byte) 126);
                var10.field10211.method864((byte) -85, class483.field6863);
                var10.field10211.method836(-30411, !class311.field4630.method2733(116, 82) ? 0 : 1);
                var10.field10211.method832(-122, class189.field2820);
                var10.field10211.method896(class76.field1018, (byte) 104);
                var10.field10211.method860(class175.field2496 + var5, (byte) 119);
                var10.field10211.method856(-99, var7);
                class533.method3088(var10, 0);
                class27.method205(-75, var5, var4);
            }
            if (~var6 == -60) {
                class419.field5898 = arg2;
                ++class624.field8792;
                class575.field8137 = 2;
                class667.field9389 = arg0;
                class235.field3406 = 0;
                class731 var11 = class155.method1222(260, class581.field8248, class237.field3417);
                var11.field10211.method847((byte) 120, class311.field4630.method2733(124, 82) ? 1 : 0);
                var11.field10211.method832(-124, class103.field1295 + var4);
                var11.field10211.method856(-120, Integer.MAX_VALUE & (int) (var8 >>> 32));
                var11.field10211.method860(var5 - -class175.field2496, (byte) 127);
                class533.method3088(var11, 0);
                class432.method2595(var8, var5, 93, var4);
            }
            if (~var6 == -59) {
                class559 var12 = class581.field8250[var7];
                if (var12 != null) {
                    class575.field8137 = 2;
                    ++class262.field3701;
                    class667.field9389 = arg0;
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    class731 var13 = class155.method1222(260, class277.field3852, class237.field3417);
                    var13.field10211.method836(-30411, !class311.field4630.method2733(97, 82) ? 0 : 1);
                    var13.field10211.method832(78, var7);
                    class533.method3088(var13, 0);
                    class553.method3214(var12.method2692((byte) -126), var12.field6448[0], 14, 0, true, -2, 0, var12.method2692((byte) 87), var12.field6445[0]);
                }
            }
            if (~var6 == -6) {
                class14 var14 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var14 != null) {
                    class667.field9389 = arg0;
                    class419.field5898 = arg2;
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    ++class393.field5576;
                    class645 var15 = var14.field262;
                    class731 var16 = class155.method1222(260, class345.field5082, class237.field3417);
                    var16.field10211.method860(var7, (byte) 124);
                    var16.field10211.method840(class311.field4630.method2733(93, 82) ? 1 : 0, (byte) 93);
                    class533.method3088(var16, 0);
                    class553.method3214(var15.method2692((byte) 62), var15.field6448[0], 14, 0, true, -2, 0, var15.method2692((byte) -124), var15.field6445[0]);
                }
            }
            if (~var6 == -58) {
                class176 var17 = class333.method2152(false, var4, var5);
                if (var17 != null) {
                    class460.method2741(var17, 63);
                }
            }
            if (var6 == 25) {
                class419.field5898 = arg2;
                class667.field9389 = arg0;
                ++class292.field4427;
                class575.field8137 = 2;
                class235.field3406 = 0;
                class731 var18 = class155.method1222(260, class685.field9726, class237.field3417);
                var18.field10211.method860(class76.field1018, (byte) 120);
                var18.field10211.method875(class483.field6863, (byte) 120);
                var18.field10211.method896(class103.field1295 + var4, (byte) 98);
                var18.field10211.method832(116, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                var18.field10211.method847((byte) 120, class311.field4630.method2733(121, 82) ? 1 : 0);
                var18.field10211.method860(class189.field2820, (byte) 127);
                var18.field10211.method860(var5 - -class175.field2496, (byte) 115);
                class533.method3088(var18, 0);
                class432.method2595(var8, var5, 94, var4);
            }
            if (~var6 == -12) {
                class559 var19 = class581.field8250[var7];
                if (var19 != null) {
                    class419.field5898 = arg2;
                    class575.field8137 = 2;
                    class667.field9389 = arg0;
                    ++class792.field10854;
                    class235.field3406 = 0;
                    class731 var20 = class155.method1222(260, class234.field3390, class237.field3417);
                    var20.field10211.method840(!class311.field4630.method2733(106, 82) ? 0 : 1, (byte) 126);
                    var20.field10211.method860(var7, (byte) 127);
                    class533.method3088(var20, 0);
                    class553.method3214(var19.method2692((byte) 80), var19.field6448[0], 14, 0, true, -2, 0, var19.method2692((byte) 31), var19.field6445[0]);
                }
            }
            if (var6 == 30) {
                class559 var21 = class581.field8250[var7];
                if (var21 != null) {
                    class667.field9389 = arg0;
                    ++class537.field7561;
                    class419.field5898 = arg2;
                    class575.field8137 = 2;
                    class235.field3406 = 0;
                    class731 var22 = class155.method1222(260, class164.field2408, class237.field3417);
                    var22.field10211.method856(-125, var7);
                    var22.field10211.method851((byte) -2, class311.field4630.method2733(75, 82) ? 1 : 0);
                    class533.method3088(var22, 0);
                    class553.method3214(var21.method2692((byte) -32), var21.field6448[0], 14, 0, true, -2, 0, var21.method2692((byte) 95), var21.field6445[0]);
                }
            }
            if (~var6 == -1008) {
                class235.field3406 = 0;
                class575.field8137 = 2;
                class667.field9389 = arg0;
                ++class581.field8244;
                class419.field5898 = arg2;
                class731 var23 = class155.method1222(260, class206.field3024, class237.field3417);
                var23.field10211.method860(var7, (byte) 127);
                class533.method3088(var23, 0);
            }
            if (var6 == 8) {
                class559 var24 = class581.field8250[var7];
                if (var24 != null) {
                    class667.field9389 = arg0;
                    ++class163.field2389;
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    class575.field8137 = 2;
                    class731 var25 = class155.method1222(260, class745.field10366, class237.field3417);
                    var25.field10211.method856(-99, var7);
                    var25.field10211.method847((byte) 120, class311.field4630.method2733(123, 82) ? 1 : 0);
                    class533.method3088(var25, 0);
                    class553.method3214(var24.method2692((byte) 2), var24.field6448[0], 14, 0, true, -2, 0, var24.method2692((byte) -125), var24.field6445[0]);
                }
            }
            if (var6 == 20) {
                class419.field5898 = arg2;
                class235.field3406 = 0;
                ++class95.field1226;
                class575.field8137 = 2;
                class667.field9389 = arg0;
                class731 var26 = class155.method1222(260, class377.field5416, class237.field3417);
                var26.field10211.method847((byte) 120, !class311.field4630.method2733(108, 82) ? 0 : 1);
                var26.field10211.method860(var5 - -class175.field2496, (byte) 119);
                var26.field10211.method832(113, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                var26.field10211.method896(class103.field1295 + var4, (byte) 80);
                class533.method3088(var26, 0);
                class432.method2595(var8, var5, 86, var4);
            }
            if (~var6 == -13) {
                class235.field3406 = 0;
                ++class4.field47;
                class419.field5898 = arg2;
                class667.field9389 = arg0;
                class575.field8137 = 1;
                class731 var27 = class155.method1222(260, class403.field5700, class237.field3417);
                var27.field10211.method896(class175.field2496 + var5, (byte) 85);
                var27.field10211.method879((byte) -122, class483.field6863);
                var27.field10211.method832(-101, class189.field2820);
                var27.field10211.method896(class103.field1295 + var4, (byte) 89);
                var27.field10211.method860(class76.field1018, (byte) 124);
                class533.method3088(var27, 0);
                class553.method3214(1, var4, 14, 0, true, -4, 0, 1, var5);
            }
            if (var6 == 6) {
                class667.field9389 = arg0;
                ++class444.field6321;
                class235.field3406 = 0;
                class575.field8137 = 2;
                class419.field5898 = arg2;
                class731 var28 = class155.method1222(260, class224.field3212, class237.field3417);
                var28.field10211.method896(var5 - -class175.field2496, (byte) 112);
                var28.field10211.method856(-117, Integer.MAX_VALUE & (int) (var8 >>> 32));
                var28.field10211.method896(var4 - -class103.field1295, (byte) 63);
                var28.field10211.method840(!class311.field4630.method2733(104, 82) ? 0 : 1, (byte) 125);
                class533.method3088(var28, 0);
                class432.method2595(var8, var5, 123, var4);
            }
            if (var6 == 22) {
                class419.field5898 = arg2;
                ++class619.field8721;
                class235.field3406 = 0;
                class575.field8137 = 2;
                class667.field9389 = arg0;
                class731 var29 = class155.method1222(260, class783.field10771, class237.field3417);
                var29.field10211.method856(-92, var7);
                var29.field10211.method860(class175.field2496 + var5, (byte) 125);
                var29.field10211.method860(class103.field1295 + var4, (byte) 115);
                var29.field10211.method851((byte) -2, !class311.field4630.method2733(108, 82) ? 0 : 1);
                class533.method3088(var29, 0);
                class27.method205(-91, var5, var4);
            }
            if (~var6 == -52) {
                class559 var30 = class581.field8250[var7];
                if (var30 != null) {
                    ++class676.field9628;
                    class575.field8137 = 2;
                    class235.field3406 = 0;
                    class667.field9389 = arg0;
                    class419.field5898 = arg2;
                    class731 var31 = class155.method1222(260, class619.field8717, class237.field3417);
                    var31.field10211.method847((byte) 120, class311.field4630.method2733(115, 82) ? 1 : 0);
                    var31.field10211.method860(var7, (byte) 126);
                    class533.method3088(var31, 0);
                    class553.method3214(var30.method2692((byte) 111), var30.field6448[0], 14, 0, true, -2, 0, var30.method2692((byte) 119), var30.field6445[0]);
                }
            }
            if (~var6 == -47) {
                class14 var32 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var32 != null) {
                    class645 var33 = var32.field262;
                    class667.field9389 = arg0;
                    class419.field5898 = arg2;
                    ++class332.field4951;
                    class575.field8137 = 2;
                    class235.field3406 = 0;
                    class731 var34 = class155.method1222(260, class483.field6861, class237.field3417);
                    var34.field10211.method896(var7, (byte) 104);
                    var34.field10211.method847((byte) 120, class311.field4630.method2733(117, 82) ? 1 : 0);
                    class533.method3088(var34, 0);
                    class553.method3214(var33.method2692((byte) -13), var33.field6448[0], 14, 0, true, -2, 0, var33.method2692((byte) 25), var33.field6445[0]);
                }
            }
            if (~var6 == -49) {
                class559 var35 = class581.field8250[var7];
                if (var35 != null) {
                    ++class579.field8186;
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    class667.field9389 = arg0;
                    class419.field5898 = arg2;
                    class731 var36 = class155.method1222(260, class586.field8297, class237.field3417);
                    var36.field10211.method840(class311.field4630.method2733(125, 82) ? 1 : 0, (byte) 95);
                    var36.field10211.method856(-118, var7);
                    class533.method3088(var36, 0);
                    class553.method3214(var35.method2692((byte) -126), var35.field6448[0], 14, 0, true, -2, 0, var35.method2692((byte) -127), var35.field6445[0]);
                }
            }
            if (var6 == 49) {
                class559 var37 = class581.field8250[var7];
                if (var37 != null) {
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    ++class201.field2947;
                    class667.field9389 = arg0;
                    class575.field8137 = 2;
                    class731 var38 = class155.method1222(260, class750.field10394, class237.field3417);
                    var38.field10211.method896(var7, (byte) 109);
                    var38.field10211.method836(-30411, class311.field4630.method2733(118, 82) ? 1 : 0);
                    class533.method3088(var38, 0);
                    class553.method3214(var37.method2692((byte) 29), var37.field6448[0], 14, 0, true, -2, 0, var37.method2692((byte) 102), var37.field6445[0]);
                }
            }
            if (var6 == 4) {
                class575.field8137 = 2;
                class667.field9389 = arg0;
                ++class143.field1833;
                class419.field5898 = arg2;
                class235.field3406 = 0;
                class731 var39 = class155.method1222(260, class498.field7076, class237.field3417);
                var39.field10211.method896(var7, (byte) 74);
                var39.field10211.method847((byte) 120, class311.field4630.method2733(96, 82) ? 1 : 0);
                var39.field10211.method860(class175.field2496 + var5, (byte) 124);
                var39.field10211.method860(class103.field1295 + var4, (byte) 116);
                class533.method3088(var39, 0);
                class27.method205(87, var5, var4);
            }
            if (var6 == 21) {
                class235.field3406 = 0;
                class667.field9389 = arg0;
                class419.field5898 = arg2;
                ++class338.field5024;
                class575.field8137 = 2;
                class731 var40 = class155.method1222(260, class714.field10073, class237.field3417);
                var40.field10211.method832(63, var5 - -class175.field2496);
                var40.field10211.method896(var7, (byte) 110);
                var40.field10211.method840(!class311.field4630.method2733(105, 82) ? 0 : 1, (byte) 118);
                var40.field10211.method856(-97, class103.field1295 + var4);
                class533.method3088(var40, 0);
                class27.method205(127, var5, var4);
            }
            if (arg1 >= -125) {
                field5877 = null;
            }
            if (~var6 == -1005 || var6 == 1008 || ~var6 == -1004 || ~var6 == -1007 || ~var6 == -1012) {
                class364.method2275((byte) 103, var6, var4, var7);
            }
            if (var6 == 10 && class273.field3815 == null) {
                class431.method2594(var5, 3, var4);
                class273.field3815 = class333.method2152(false, var4, var5);
                class288.method1923((byte) -19, class273.field3815);
            }
            if (var6 == 1002) {
                class419.field5898 = arg2;
                class575.field8137 = 2;
                class667.field9389 = arg0;
                class235.field3406 = 0;
                class14 var41 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var41 != null) {
                    class645 var42 = var41.field262;
                    class279 var43 = var42.field9071;
                    if (var43.field3943 != null) {
                        var43 = var43.method1810((byte) -14, class271.field3796);
                    }
                    if (var43 != null) {
                        ++class705.field9931;
                        class731 var44 = class155.method1222(260, class136.field1761, class237.field3417);
                        var44.field10211.method860(var43.field3916, (byte) 114);
                        class533.method3088(var44, 0);
                    }
                }
            }
            if (~var6 == -19) {
                if (class282.field4334 > 0 && class311.field4630.method2733(102, 82) && class311.field4630.method2733(89, 81)) {
                    class460.method2740(class103.field1295 + var4, (byte) 81, class251.field3549.field7710, class175.field2496 - -var5);
                } else {
                    class731 var45 = class204.method1469(var4, var7, 0, var5);
                    if (var7 != 1) {
                        class419.field5898 = arg2;
                        class235.field3406 = 0;
                        class667.field9389 = arg0;
                        class575.field8137 = 1;
                    } else {
                        var45.field10211.method851((byte) -2, -1);
                        var45.field10211.method851((byte) -2, -1);
                        var45.field10211.method860((int) class562.field8001, (byte) 127);
                        var45.field10211.method851((byte) -2, 57);
                        var45.field10211.method851((byte) -2, class77.field1042);
                        var45.field10211.method851((byte) -2, class611.field8630);
                        var45.field10211.method851((byte) -2, 89);
                        var45.field10211.method860(class251.field3549.field7718, (byte) 114);
                        var45.field10211.method860(class251.field3549.field7719, (byte) 119);
                        var45.field10211.method851((byte) -2, 63);
                    }
                    class533.method3088(var45, 0);
                    class553.method3214(1, var4, 14, 0, true, -4, 0, 1, var5);
                }
            }
            if (var6 == 45) {
                class559 var46 = class581.field8250[var7];
                if (var46 != null) {
                    class575.field8137 = 2;
                    class667.field9389 = arg0;
                    ++class647.field9112;
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    class731 var47 = class155.method1222(260, class180.field2724, class237.field3417);
                    var47.field10211.method860(var7, (byte) 126);
                    var47.field10211.method836(-30411, class311.field4630.method2733(89, 82) ? 1 : 0);
                    var47.field10211.method860(class189.field2820, (byte) 114);
                    var47.field10211.method860(class76.field1018, (byte) 125);
                    var47.field10211.method879((byte) 122, class483.field6863);
                    class533.method3088(var47, 0);
                    class553.method3214(var46.method2692((byte) -126), var46.field6448[0], 14, 0, true, -2, 0, var46.method2692((byte) 75), var46.field6445[0]);
                }
            }
            if (var6 == 23) {
                class14 var48 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var48 != null) {
                    class575.field8137 = 2;
                    class419.field5898 = arg2;
                    ++class758.field10461;
                    class667.field9389 = arg0;
                    class645 var49 = var48.field262;
                    class235.field3406 = 0;
                    class731 var50 = class155.method1222(260, class759.field10477, class237.field3417);
                    var50.field10211.method864((byte) -98, class483.field6863);
                    var50.field10211.method832(122, class189.field2820);
                    var50.field10211.method896(var7, (byte) 60);
                    var50.field10211.method847((byte) 120, !class311.field4630.method2733(126, 82) ? 0 : 1);
                    var50.field10211.method832(-47, class76.field1018);
                    class533.method3088(var50, 0);
                    class553.method3214(var49.method2692((byte) -124), var49.field6448[0], 14, 0, true, -2, 0, var49.method2692((byte) -125), var49.field6445[0]);
                }
            }
            if (~var6 == -53) {
                class559 var51 = class581.field8250[var7];
                if (var51 != null) {
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    class575.field8137 = 2;
                    ++class781.field10758;
                    class667.field9389 = arg0;
                    class731 var52 = class155.method1222(260, class649.field9143, class237.field3417);
                    var52.field10211.method860(var7, (byte) 127);
                    var52.field10211.method847((byte) 120, class311.field4630.method2733(113, 82) ? 1 : 0);
                    class533.method3088(var52, 0);
                    class553.method3214(var51.method2692((byte) 8), var51.field6448[0], 14, 0, true, -2, 0, var51.method2692((byte) -124), var51.field6445[0]);
                }
            }
            if (var6 == 9) {
                class14 var53 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var53 != null) {
                    class667.field9389 = arg0;
                    class645 var54 = var53.field262;
                    class419.field5898 = arg2;
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    ++class242.field3468;
                    class731 var55 = class155.method1222(260, class74.field995, class237.field3417);
                    var55.field10211.method851((byte) -2, !class311.field4630.method2733(81, 82) ? 0 : 1);
                    var55.field10211.method860(var7, (byte) 118);
                    class533.method3088(var55, 0);
                    class553.method3214(var54.method2692((byte) 18), var54.field6448[0], 14, 0, true, -2, 0, var54.method2692((byte) -124), var54.field6445[0]);
                }
            }
            if (var6 == 2) {
                class559 var56 = class581.field8250[var7];
                if (var56 != null) {
                    class667.field9389 = arg0;
                    class575.field8137 = 2;
                    class419.field5898 = arg2;
                    class235.field3406 = 0;
                    ++class537.field7561;
                    class731 var57 = class155.method1222(260, class34.field451, class237.field3417);
                    var57.field10211.method840(class311.field4630.method2733(122, 82) ? 1 : 0, (byte) 124);
                    var57.field10211.method896(var7, (byte) 106);
                    class533.method3088(var57, 0);
                    class553.method3214(var56.method2692((byte) -128), var56.field6448[0], 14, 0, true, -2, 0, var56.method2692((byte) 37), var56.field6445[0]);
                }
            }
            if (~var6 == -18) {
                class14 var58 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                if (var58 != null) {
                    ++class191.field2844;
                    class235.field3406 = 0;
                    class419.field5898 = arg2;
                    class645 var59 = var58.field262;
                    class575.field8137 = 2;
                    class667.field9389 = arg0;
                    class731 var60 = class155.method1222(260, class284.field4362, class237.field3417);
                    var60.field10211.method847((byte) 120, !class311.field4630.method2733(115, 82) ? 0 : 1);
                    var60.field10211.method856(-100, var7);
                    class533.method3088(var60, 0);
                    class553.method3214(var59.method2692((byte) -126), var59.field6448[0], 14, 0, true, -2, 0, var59.method2692((byte) 75), var59.field6445[0]);
                }
            }
            if (var6 == 1010) {
                class667.field9389 = arg0;
                class419.field5898 = arg2;
                class575.field8137 = 2;
                ++class772.field10645;
                class235.field3406 = 0;
                class731 var61 = class155.method1222(260, class250.field3542, class237.field3417);
                var61.field10211.method856(-110, Integer.MAX_VALUE & (int) (var8 >>> 32));
                var61.field10211.method860(class103.field1295 + var4, (byte) 118);
                var61.field10211.method840(class311.field4630.method2733(113, 82) ? 1 : 0, (byte) 121);
                var61.field10211.method896(class175.field2496 + var5, (byte) 76);
                class533.method3088(var61, 0);
                class432.method2595(var8, var5, 121, var4);
            }
            if (~var6 == -61) {
                class176 var62 = class333.method2152(false, var4, var5);
                if (var62 != null) {
                    class272.method1770(-1);
                    class654 var63 = client.method2049(var62);
                    class574.method3337((byte) 121, var62, var63.field9230, var63.method3748(67));
                    class361.field5239 = class573.method3324((byte) 115, var62);
                    if (class361.field5239 == null) {
                        class361.field5239 = "Null";
                    }
                    class373.field5373 = var62.field2662 + "<col=ffffff>";
                }
            } else {
                if (~var6 == -45) {
                    if (class282.field4334 > 0 && class311.field4630.method2733(99, 82) && class311.field4630.method2733(100, 81)) {
                        class460.method2740(class103.field1295 - -var4, (byte) 81, class251.field3549.field7710, class175.field2496 + var5);
                    } else {
                        class667.field9389 = arg0;
                        class235.field3406 = 0;
                        class575.field8137 = 1;
                        class419.field5898 = arg2;
                        ++class428.field6022;
                        class731 var64 = class155.method1222(260, class191.field2843, class237.field3417);
                        var64.field10211.method860(class175.field2496 - -var5, (byte) 119);
                        var64.field10211.method860(class103.field1295 + var4, (byte) 121);
                        class533.method3088(var64, 0);
                    }
                }
                if (~var6 == -48) {
                    class14 var65 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                    if (var65 != null) {
                        ++class305.field4560;
                        class235.field3406 = 0;
                        class667.field9389 = arg0;
                        class645 var66 = var65.field262;
                        class575.field8137 = 2;
                        class419.field5898 = arg2;
                        class731 var67 = class155.method1222(260, class27.field390, class237.field3417);
                        var67.field10211.method860(var7, (byte) 123);
                        var67.field10211.method847((byte) 120, class311.field4630.method2733(119, 82) ? 1 : 0);
                        class533.method3088(var67, 0);
                        class553.method3214(var66.method2692((byte) -124), var66.field6448[0], 14, 0, true, -2, 0, var66.method2692((byte) 64), var66.field6445[0]);
                    }
                }
                if (var6 == 16) {
                    class559 var68 = class581.field8250[var7];
                    if (var68 != null) {
                        ++class537.field7561;
                        class575.field8137 = 2;
                        class667.field9389 = arg0;
                        class235.field3406 = 0;
                        class419.field5898 = arg2;
                        class731 var69 = class155.method1222(260, class1.field7, class237.field3417);
                        var69.field10211.method832(-57, var7);
                        var69.field10211.method840(class311.field4630.method2733(126, 82) ? 1 : 0, (byte) 102);
                        class533.method3088(var69, 0);
                        class553.method3214(var68.method2692((byte) 111), var68.field6448[0], 14, 0, true, -2, 0, var68.method2692((byte) -128), var68.field6445[0]);
                    }
                }
                if (var6 == 15) {
                    class667.field9389 = arg0;
                    class419.field5898 = arg2;
                    class575.field8137 = 2;
                    ++class666.field9378;
                    class235.field3406 = 0;
                    class731 var70 = class155.method1222(260, class13.field255, class237.field3417);
                    var70.field10211.method856(-121, class175.field2496 + var5);
                    var70.field10211.method851((byte) -2, class311.field4630.method2733(125, 82) ? 1 : 0);
                    var70.field10211.method860(class103.field1295 + var4, (byte) 125);
                    var70.field10211.method896(var7, (byte) 126);
                    class533.method3088(var70, 0);
                    class27.method205(94, var5, var4);
                }
                if (~var6 == -51) {
                    ++class341.field5055;
                    class575.field8137 = 2;
                    class419.field5898 = arg2;
                    class667.field9389 = arg0;
                    class235.field3406 = 0;
                    class731 var71 = class155.method1222(260, class258.field3631, class237.field3417);
                    var71.field10211.method832(-122, var4 - -class103.field1295);
                    var71.field10211.method832(-127, var7);
                    var71.field10211.method832(-86, class175.field2496 + var5);
                    var71.field10211.method847((byte) 120, class311.field4630.method2733(107, 82) ? 1 : 0);
                    class533.method3088(var71, 0);
                    class27.method205(-75, var5, var4);
                }
                if (~var6 == -54) {
                    class419.field5898 = arg2;
                    class667.field9389 = arg0;
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    ++class426.field5988;
                    class731 var72 = class155.method1222(260, class455.field6534, class237.field3417);
                    var72.field10211.method836(-30411, !class311.field4630.method2733(77, 82) ? 0 : 1);
                    var72.field10211.method896(var5 - -class175.field2496, (byte) 109);
                    var72.field10211.method856(-114, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    var72.field10211.method896(class103.field1295 + var4, (byte) 124);
                    class533.method3088(var72, 0);
                    class432.method2595(var8, var5, 93, var4);
                }
                if (var6 == 1012) {
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    class667.field9389 = arg0;
                    ++class703.field9900;
                    class419.field5898 = arg2;
                    class731 var73 = class155.method1222(260, class512.field7313, class237.field3417);
                    var73.field10211.method860(var7, (byte) 127);
                    class533.method3088(var73, 0);
                }
                if (~var6 == -14) {
                    ++class647.field9112;
                    class667.field9389 = arg0;
                    class235.field3406 = 0;
                    class575.field8137 = 2;
                    class419.field5898 = arg2;
                    class731 var74 = class155.method1222(260, class180.field2724, class237.field3417);
                    var74.field10211.method860(class251.field3549.field6361, (byte) 117);
                    var74.field10211.method836(-30411, !class311.field4630.method2733(95, 82) ? 0 : 1);
                    var74.field10211.method860(class189.field2820, (byte) 115);
                    var74.field10211.method860(class76.field1018, (byte) 126);
                    var74.field10211.method879((byte) 112, class483.field6863);
                    class533.method3088(var74, 0);
                }
                if (class26.field382) {
                    class272.method1770(-1);
                }
                if (class296.field4458 != null && ~class568.field8047 == -1) {
                    class288.method1923((byte) -19, class296.field4458);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 > -114) {
            field5877 = null;
        }
        super.field3733 = arg1;
        ++field5872;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field5874;
        if (super.field3731.method3633(103)) {
            return 3;
        } else if (arg1 != 0 && super.field3731.field9030.method661((byte) -68) != 1) {
            if (arg0 != 112) {
                this.method663((byte) 10);
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field5878;
        if (arg0 != -38) {
            method2494(18);
        }
        return 1;
    }
}

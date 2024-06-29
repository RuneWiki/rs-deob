import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class470 extends class751 {

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    private int field6709 = 4096;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[I")
    private int[] field6705 = new int[3];

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    private int field6706 = 4096;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    private int field6707 = 4096;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    private int field6710 = 409;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Ljo;")
    public static class351 field6713 = new class351(50, -1);

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class470() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static final void method2783(int arg0) {
        if (class638.field8975 > 1) {
            --class638.field8975;
            class778.field10735 = class717.field10086;
        }
        ++field6711;
        if (class255.field3580) {
            class255.field3580 = false;
            class204.method1458((byte) -80);
        } else {
            if (!class422.field5962) {
                class626.method3588(false);
            }
            for (int var1 = 0; ~var1 > -101 && class703.method3983((byte) -66); ++var1) {
            }
            if (~class757.field10456 == -11) {
                while (class33.method231((byte) 80)) {
                    class731 var2 = class155.method1222(arg0 ^ 262, class485.field6882, class237.field3417);
                    var2.field10211.method851((byte) -2, 0);
                    int var3 = var2.field10211.field1521;
                    class226.method1561(var2.field10211, -101);
                    var2.field10211.method849(-61, -var3 + var2.field10211.field1521);
                    class533.method3088(var2, 0);
                }
                if (class212.field3072 == null) {
                    if (class668.field9399 <= class109.method731(arg0 + 120)) {
                        class212.field3072 = class188.field2817.method4128(class444.field6319.field6987, arg0 ^ -111);
                    }
                } else if (class212.field3072.field4738 != -1) {
                    class731 var4 = class155.method1222(arg0 + 258, class206.field3025, class237.field3417);
                    var4.field10211.method860(class212.field3072.field4738, (byte) 117);
                    class533.method3088(var4, 0);
                    class212.field3072 = null;
                    class668.field9399 = class109.method731(71) - -30000L;
                }
                class218 var5 = (class218) class585.field8267.method2508((byte) 121);
                if (var5 != null || ~(class109.method731(124) + -2000L) < ~class188.field2818) {
                    class731 var6 = null;
                    int var7 = 0;
                    for (class218 var8 = (class218) class157.field2329.method2508((byte) -41); var8 != null && (var6 == null || ~(-var7 + var6.field10211.field1521) > -241); var8 = (class218) class157.field2329.method2505((byte) -55)) {
                        var8.method3117((byte) -128);
                        int var9 = var8.method1506((byte) 91);
                        if (var9 < -1) {
                            var9 = -1;
                        } else if (var9 > 65534) {
                            var9 = 65534;
                        }
                        int var10 = var8.method1508((byte) 110);
                        if (~var10 > 0) {
                            var10 = -1;
                        } else if (~var10 < -65535) {
                            var10 = 65534;
                        }
                        if (~class496.field7059 != ~var10 || class790.field10844 != var9) {
                            if (var6 == null) {
                                var6 = class155.method1222(arg0 + 258, class73.field984, class237.field3417);
                                ++class758.field10465;
                                var6.field10211.method851((byte) -2, 0);
                                var7 = var6.field10211.field1521;
                            }
                            int var11 = var10 - class496.field7059;
                            class496.field7059 = var10;
                            int var12 = -class790.field10844 + var9;
                            class790.field10844 = var9;
                            int var13 = (int) ((var8.method1507((byte) 117) + -class188.field2818) / 20L);
                            if (var13 < 8 && var11 >= -32 && ~var11 >= -32 && ~var12 <= 31 && ~var12 >= -32) {
                                var12 += 32;
                                var11 += 32;
                                var6.field10211.method860((var11 << 6) + (var13 << 12) - -var12, (byte) 114);
                            } else if (~var13 > -33 && ~var11 <= 127 && var11 <= 127 && var12 >= -128 && ~var12 >= -128) {
                                var11 += 128;
                                var6.field10211.method851((byte) -2, var13 + 128);
                                var12 += 128;
                                var6.field10211.method860((var11 << 8) + var12, (byte) 115);
                            } else if (var13 >= 32) {
                                var6.field10211.method860(var13 + 57344, (byte) 123);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field10211.method879((byte) -67, var9 << 16 | var10);
                                } else {
                                    var6.field10211.method879((byte) -90, Integer.MIN_VALUE);
                                }
                            } else {
                                var6.field10211.method851((byte) -2, var13 + 192);
                                if (var10 != 1 && ~var9 != 0) {
                                    var6.field10211.method879((byte) -119, var10 | var9 << 16);
                                } else {
                                    var6.field10211.method879((byte) -95, Integer.MIN_VALUE);
                                }
                            }
                            class188.field2818 = var8.method1507((byte) -33);
                        }
                    }
                    if (var6 != null) {
                        var6.field10211.method849(-118, -var7 + var6.field10211.field1521);
                        class533.method3088(var6, arg0 ^ 2);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method1507((byte) 107) + -class495.field7025) / 50L;
                    class495.field7025 = var5.method1507((byte) -58);
                    if (~var14 < -32768L) {
                        var14 = 32767L;
                    }
                    int var16 = var5.method1506((byte) -109);
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 65535) {
                        var16 = 65535;
                    }
                    int var17 = var5.method1508((byte) 110);
                    if (~var17 <= -1) {
                        if (~var17 < -65536) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    byte var18 = 0;
                    if (~var5.method1511((byte) 111) == -3) {
                        var18 = 1;
                    }
                    ++class736.field10282;
                    int var19 = (int) var14;
                    class731 var20 = class155.method1222(260, class481.field6845, class237.field3417);
                    var20.field10211.method896(var18 << 15 | var19, (byte) 67);
                    var20.field10211.method897(13114, var16 << 16 | var17);
                    class533.method3088(var20, 0);
                }
                if (~class593.field8366 < -1) {
                    ++class386.field5499;
                    class731 var21 = class155.method1222(260, class3.field41, class237.field3417);
                    var21.field10211.method851((byte) -2, class593.field8366 * 3);
                    for (int var22 = 0; ~class593.field8366 < ~var22; ++var22) {
                        class706 var23 = class673.field9513[var22];
                        long var24 = (var23.method2711(-10422) + -class334.field4986) / 50L;
                        class334.field4986 = var23.method2711(-10422);
                        if (~var24 < -65536L) {
                            var24 = 65535L;
                        }
                        var21.field10211.method851((byte) -2, var23.method2709((byte) -122));
                        var21.field10211.method860((int) var24, (byte) 120);
                    }
                    class533.method3088(var21, 0);
                }
                if (class187.field2808 > 0) {
                    --class187.field2808;
                }
                if (class452.field6508 && ~class187.field2808 >= -1) {
                    ++class576.field8140;
                    class452.field6508 = false;
                    class187.field2808 = 20;
                    class731 var26 = class155.method1222(arg0 + 258, class677.field9633, class237.field3417);
                    var26.field10211.method896((int) class509.field7256 >> 3, (byte) 84);
                    var26.field10211.method860((int) class562.field8001 >> 3, (byte) 123);
                    class533.method3088(var26, 0);
                }
                if (class235.field3401 != class130.field1709) {
                    ++class758.field10467;
                    class235.field3401 = class130.field1709;
                    class731 var27 = class155.method1222(260, class268.field3764, class237.field3417);
                    var27.field10211.method851((byte) -2, class130.field1709 ? 1 : 0);
                    class533.method3088(var27, 0);
                }
                if (!class399.field5669) {
                    ++class523.field7459;
                    class731 var28 = class155.method1222(260, class48.field672, class237.field3417);
                    var28.field10211.method851((byte) -2, 0);
                    int var29 = var28.field10211.field1521;
                    class120 var30 = class145.field1852.method3640(-5);
                    var28.field10211.method885(var30.field1556, -18983, var30.field1521, 0);
                    var28.field10211.method849(-119, -var29 + var28.field10211.field1521);
                    class533.method3088(var28, 0);
                    class399.field5669 = true;
                }
                if (class378.field5427 != null) {
                    if (~class763.field10510 != -3) {
                        if (~class763.field10510 == -4) {
                            class437.method2636(arg0 ^ 3);
                        }
                    } else {
                        class368.method2284((byte) -82);
                    }
                }
                if (class367.field5288) {
                    class367.field5288 = false;
                } else {
                    class318.field4733 /= 2.0F;
                }
                if (!class533.field7529) {
                    class243.field3478 /= 2.0F;
                } else {
                    class533.field7529 = false;
                }
                class270.method1763((byte) -21);
                if (class757.field10456 == 10) {
                    class498.method2906(false);
                    class399.method2422(226);
                    class180.method1357((byte) 126);
                    ++class786.field10810;
                    if (class786.field10810 > 750) {
                        class204.method1458((byte) -80);
                    } else {
                        class317.method2075(76);
                        class289.method1928(80);
                        class3.method24(-13847);
                        for (int var31 = class271.field3796.method1784(true, arg0); ~var31 != 0; var31 = class271.field3796.method1784(false, 2)) {
                            class492.method2877(true, var31);
                            class526.field7492[class111.method773(31, class217.field3114++)] = var31;
                        }
                        for (class678 var32 = class405.method2437((byte) -87); var32 != null; var32 = class405.method2437((byte) -117)) {
                            int var33 = var32.method3833(96);
                            long var34 = var32.method3837(true);
                            if (~var33 != -2) {
                                if (var33 == 2) {
                                    class434.field6173[(int) var34] = var32.field9641;
                                    class64.field850[class111.method773(class191.field2853++, 31)] = (int) var34;
                                } else if (~var33 != -4) {
                                    if (var33 == 4) {
                                        class176 var36 = class518.method3014((int) var34, -87);
                                        int var37 = var32.field9649;
                                        int var38 = var32.field9639;
                                        int var39 = var32.field9651;
                                        if (~var36.field2569 != ~var37 || ~var36.field2656 != ~var38 || ~var36.field2525 != ~var39) {
                                            var36.field2525 = var39;
                                            var36.field2569 = var37;
                                            var36.field2656 = var38;
                                            class288.method1923((byte) -19, var36);
                                        }
                                    } else if (~var33 == -6) {
                                        class176 var40 = class518.method3014((int) var34, 122);
                                        if (~var32.field9649 != ~var40.field2609 || var32.field9649 == -1) {
                                            var40.field2668 = 0;
                                            var40.field2670 = 1;
                                            var40.field2506 = 0;
                                            var40.field2609 = var32.field9649;
                                            class129 var41 = ~var40.field2609 != 0 ? class203.field2975.method1931((byte) -81, var40.field2609) : null;
                                            if (var41 != null) {
                                                class384.method2350(var41, (byte) 117, var40.field2506);
                                            }
                                            class288.method1923((byte) -19, var40);
                                        }
                                    } else if (~var33 != -7) {
                                        if (~var33 != -8) {
                                            if (var33 != 8) {
                                                if (var33 != 9) {
                                                    if (~var33 != -11) {
                                                        if (var33 != 11) {
                                                            if (~var33 == -13) {
                                                                class176 var42 = class518.method3014((int) var34, -32);
                                                                int var43 = var32.field9649;
                                                                if (var42 != null && ~var42.field2560 == -1) {
                                                                    if (-var42.field2664 + var42.field2542 < var43) {
                                                                        var43 = -var42.field2664 + var42.field2542;
                                                                    }
                                                                    if (var43 < 0) {
                                                                        var43 = 0;
                                                                    }
                                                                    if (var42.field2508 != var43) {
                                                                        var42.field2508 = var43;
                                                                        class288.method1923((byte) -19, var42);
                                                                    }
                                                                }
                                                            } else if (var33 != 14) {
                                                                if (var33 != 15) {
                                                                    if (~var33 == -17) {
                                                                        class176 var44 = class518.method3014((int) var34, -48);
                                                                        var44.field2654 = var32.field9649;
                                                                    } else if (var33 != 17) {
                                                                        if (~var33 == -19) {
                                                                            class176 var45 = class518.method3014((int) var34, 119);
                                                                            int var46 = (int) (var34 >> 32);
                                                                            var45.method1322(5527, (short) var32.field9649, (short) var32.field9639, var46);
                                                                        } else if (~var33 == -20) {
                                                                            class176 var47 = class518.method3014((int) var34, arg0 + 112);
                                                                            int var48 = (int) (var34 >> 32);
                                                                            var47.method1315((short) var32.field9649, (short) var32.field9639, (byte) -79, var48);
                                                                        }
                                                                    } else {
                                                                        class176 var49 = class518.method3014((int) var34, -105);
                                                                        var49.field2592 = var32.field9649;
                                                                    }
                                                                } else {
                                                                    class334.field4981 = true;
                                                                    class336.field4995 = var32.field9639;
                                                                    class697.field9843 = var32.field9649;
                                                                }
                                                            } else {
                                                                class176 var50 = class518.method3014((int) var34, -66);
                                                                var50.field2638 = var32.field9649;
                                                            }
                                                        } else {
                                                            class176 var51 = class518.method3014((int) var34, -54);
                                                            var51.field2634 = 0;
                                                            var51.field2578 = var51.field2589 = var32.field9639;
                                                            var51.field2599 = var51.field2602 = var32.field9649;
                                                            var51.field2581 = 0;
                                                            class288.method1923((byte) -19, var51);
                                                        }
                                                    } else {
                                                        class176 var52 = class518.method3014((int) var34, arg0 ^ -100);
                                                        if (~var32.field9649 != ~var52.field2548 || ~var32.field9639 != ~var52.field2547 || ~var32.field9651 != ~var52.field2632) {
                                                            var52.field2548 = var32.field9649;
                                                            var52.field2547 = var32.field9639;
                                                            var52.field2632 = var32.field9651;
                                                            class288.method1923((byte) -19, var52);
                                                        }
                                                    }
                                                } else {
                                                    class176 var53 = class518.method3014((int) var34, 109);
                                                    if (var32.field9649 != var53.field2540 || var32.field9639 != var53.field2648) {
                                                        var53.field2540 = var32.field9649;
                                                        var53.field2648 = var32.field9639;
                                                        class288.method1923((byte) -19, var53);
                                                    }
                                                }
                                            } else {
                                                class176 var54 = class518.method3014((int) var34, -100);
                                                if (var32.field9649 != var54.field2597 || ~var32.field9639 != ~var54.field2520 || var32.field9651 != var54.field2636) {
                                                    var54.field2520 = var32.field9639;
                                                    var54.field2597 = var32.field9649;
                                                    var54.field2636 = var32.field9651;
                                                    if (var54.field2540 != -1) {
                                                        if (var54.field2514 > 0) {
                                                            var54.field2636 = var54.field2636 * 32 / var54.field2514;
                                                        } else if (~var54.field2530 < -1) {
                                                            var54.field2636 = var54.field2636 * 32 / var54.field2530;
                                                        }
                                                    }
                                                    class288.method1923((byte) -19, var54);
                                                }
                                            }
                                        } else {
                                            class176 var55 = class518.method3014((int) var34, -51);
                                            boolean var56 = ~var32.field9649 == -2;
                                            if (!var56 != !var55.field2591) {
                                                var55.field2591 = var56;
                                                class288.method1923((byte) -19, var55);
                                            }
                                        }
                                    } else {
                                        int var57 = var32.field9649;
                                        int var58 = var57 >> 10 & 31;
                                        int var59 = (1011 & var57) >> 5;
                                        int var60 = 31 & var57;
                                        int var61 = (var59 << 11) + (var58 << 19) + (var60 << 3);
                                        class176 var62 = class518.method3014((int) var34, -86);
                                        if (var62.field2573 != var61) {
                                            var62.field2573 = var61;
                                            class288.method1923((byte) -19, var62);
                                        }
                                    }
                                } else {
                                    class176 var63 = class518.method3014((int) var34, -68);
                                    if (!var32.field9641.equals(var63.field2672)) {
                                        var63.field2672 = var32.field9641;
                                        class288.method1923((byte) -19, var63);
                                    }
                                }
                            } else {
                                class604.field8499[(int) var34] = var32.field9649;
                                class387.field5502 |= class9.field127[(int) var34];
                                class502.field7183[class111.method773(31, class457.field6557++)] = (int) var34;
                            }
                        }
                        ++class55.field755;
                        if (class575.field8137 != 0) {
                            class235.field3406 += 20;
                            if (class235.field3406 >= 400) {
                                class575.field8137 = 0;
                            }
                        }
                        if (class296.field4458 != null) {
                            ++class568.field8047;
                            if (~class568.field8047 <= -16) {
                                class288.method1923((byte) -19, class296.field4458);
                                class296.field4458 = null;
                            }
                        }
                        class788.field10825 = null;
                        class739.field10309 = false;
                        class271.field3793 = null;
                        class595.field8382 = false;
                        class145.method998(-107, (class176) null, -1, -1);
                        class694.method3913(-1, (class176) null, -1, true);
                        if (!class26.field382) {
                            class303.field4540 = -1;
                        }
                        class45.method304(-123);
                        ++class717.field10086;
                        if (class745.field10374) {
                            ++class676.field9625;
                            class731 var64 = class155.method1222(260, class90.field1167, class237.field3417);
                            var64.field10211.method879((byte) -114, class203.field2973 << 14 | class640.field8983 << 28 | class464.field6624);
                            class533.method3088(var64, 0);
                            class745.field10374 = false;
                        }
                        while (true) {
                            class140 var65;
                            class176 var66;
                            class176 var67;
                            do {
                                var65 = (class140) class430.field6138.method2507(arg0 ^ -124);
                                if (var65 == null) {
                                    while (true) {
                                        class140 var68;
                                        class176 var69;
                                        class176 var70;
                                        do {
                                            var68 = (class140) class325.field4866.method2507(-86);
                                            if (var68 == null) {
                                                while (true) {
                                                    class140 var71;
                                                    class176 var72;
                                                    class176 var73;
                                                    do {
                                                        var71 = (class140) class526.field7486.method2507(arg0 ^ -93);
                                                        if (var71 == null) {
                                                            if (class271.field3793 == null) {
                                                                class391.field5549 = 0;
                                                            }
                                                            if (class169.field2433 != null) {
                                                                class607.method3502(arg0 + -2);
                                                            }
                                                            if (class282.field4334 > 0 && class311.field4630.method2733(111, 82) && class311.field4630.method2733(109, 81) && class516.field7387 != 0) {
                                                                int var74 = class251.field3549.field7710 - class516.field7387;
                                                                if (var74 >= 0) {
                                                                    if (var74 > 3) {
                                                                        var74 = 3;
                                                                    }
                                                                } else {
                                                                    var74 = 0;
                                                                }
                                                                class460.method2740(class251.field3549.field6448[0] + class103.field1295, (byte) 81, var74, class251.field3549.field6445[0] + class175.field2496);
                                                            }
                                                            class647.method3696(11410);
                                                            for (int var75 = 0; var75 < 5; ++var75) {
                                                                int var10002 = class747.field10381[var75]++;
                                                            }
                                                            if (class387.field5502 && ~class696.field9827 > ~(-60000L + class109.method731(119))) {
                                                                class711.method4025(-20081);
                                                            }
                                                            for (class464 var76 = (class464) class619.field8724.method2033(0); var76 != null; var76 = (class464) class619.field8724.method2025((byte) -88)) {
                                                                if (-5L + class109.method731(73) / 1000L > (long) var76.field6619) {
                                                                    if (~var76.field6618 < -1) {
                                                                        class422.method2520(5, 0, var76.field6620 + class674.field9570.method3825((byte) -10, class526.field7494), "", "", arg0 + -100, "");
                                                                    }
                                                                    if (~var76.field6618 == -1) {
                                                                        class422.method2520(5, 0, var76.field6620 + class674.field9571.method3825((byte) -10, class526.field7494), "", "", -114, "");
                                                                    }
                                                                    var76.method592(2);
                                                                }
                                                            }
                                                            ++class165.field2419;
                                                            if (class165.field2419 > 500) {
                                                                class165.field2419 = 0;
                                                                int var77 = (int) (8.0D * Math.random());
                                                                if (~(var77 & 4) == -5) {
                                                                    class87.field1122 += class367.field5287;
                                                                }
                                                                if (~(2 & var77) == -3) {
                                                                    class519.field7426 += class208.field3037;
                                                                }
                                                                if ((var77 & 1) == 1) {
                                                                    class572.field8101 += class612.field8638;
                                                                }
                                                            }
                                                            if (~class572.field8101 > 49) {
                                                                class612.field8638 = 2;
                                                            }
                                                            if (class572.field8101 > 50) {
                                                                class612.field8638 = -2;
                                                            }
                                                            if (class519.field7426 < -55) {
                                                                class208.field3037 = 2;
                                                            }
                                                            if (class519.field7426 > 55) {
                                                                class208.field3037 = -2;
                                                            }
                                                            if (~class87.field1122 > 39) {
                                                                class367.field5287 = 1;
                                                            }
                                                            if (class87.field1122 > 40) {
                                                                class367.field5287 = -1;
                                                            }
                                                            ++class369.field5312;
                                                            if (class369.field5312 > 500) {
                                                                class369.field5312 = 0;
                                                                int var78 = (int) (Math.random() * 8.0D);
                                                                if (~(var78 & 1) == -2) {
                                                                    class77.field1042 += class672.field9423;
                                                                }
                                                                if (~(var78 & 2) == -3) {
                                                                    class611.field8630 += class325.field4867;
                                                                }
                                                            }
                                                            if (~class77.field1042 > 59) {
                                                                class672.field9423 = 2;
                                                            }
                                                            if (class611.field8630 < -20) {
                                                                class325.field4867 = 1;
                                                            }
                                                            if (class77.field1042 > 60) {
                                                                class672.field9423 = -2;
                                                            }
                                                            if (class611.field8630 > 10) {
                                                                class325.field4867 = -1;
                                                            }
                                                            ++class403.field5707;
                                                            if (~class403.field5707 < -51) {
                                                                ++class475.field6758;
                                                                class731 var79 = class155.method1222(260, class481.field6846, class237.field3417);
                                                                class533.method3088(var79, 0);
                                                            }
                                                            if (class650.field9155) {
                                                                class259.method1706(-71);
                                                                class650.field9155 = false;
                                                            }
                                                            try {
                                                                class663.method3778(126);
                                                                return;
                                                            } catch (IOException var80) {
                                                                class204.method1458((byte) -80);
                                                                return;
                                                            }
                                                        }
                                                        var72 = var71.field1802;
                                                        if (~var72.field2612 > -1) {
                                                            break;
                                                        }
                                                        var73 = class518.method3014(var72.field2661, arg0 ^ -126);
                                                    } while (var73 == null || var73.field2543 == null || var73.field2543.length <= var72.field2612 || var73.field2543[var72.field2612] != var72);
                                                    class353.method2219(var71);
                                                }
                                            }
                                            var69 = var68.field1802;
                                            if (~var69.field2612 > -1) {
                                                break;
                                            }
                                            var70 = class518.method3014(var69.field2661, -36);
                                        } while (var70 == null || var70.field2543 == null || var70.field2543.length <= var69.field2612 || var70.field2543[var69.field2612] != var69);
                                        class353.method2219(var68);
                                    }
                                }
                                var66 = var65.field1802;
                                if (var66.field2612 < 0) {
                                    break;
                                }
                                var67 = class518.method3014(var66.field2661, 110);
                            } while (var67 == null || var67.field2543 == null || ~var66.field2612 <= ~var67.field2543.length || var67.field2543[var66.field2612] != var66);
                            class353.method2219(var65);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
    public static final void method2784(byte arg0) {
        ++field6712;
        if (arg0 != 74) {
            field6713 = null;
        }
        class634.field8944.method2364(arg0 ^ 75);
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        field6713 = null;
        if (arg0 != 55) {
            method2783(-46);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg1.method833(-3);
                            this.field6705[0] = class111.method773(var5 << 4, 267386880);
                            this.field6705[2] = class111.method773(255, var5) >> 12;
                            this.field6705[1] = class111.method773(65280, var5) >> 4;
                        }
                    } else {
                        this.field6709 = arg1.method898((byte) -84);
                    }
                } else {
                    this.field6707 = arg1.method898((byte) -99);
                }
            } else {
                this.field6706 = arg1.method898((byte) -111);
            }
        } else {
            this.field6710 = arg1.method898((byte) -101);
        }
        ++field6708;
        int var6 = 13 / ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)I")
    public static int method2786(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field6704;
        int[][] var3 = super.field10409.method3474(arg1 ^ 2157, arg0);
        if (arg1 != 57) {
            this.field6707 = 114;
        }
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class673.field9452 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field6705[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field6710) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field6705[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field6710 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field6705[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field6710) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6709 * var12 >> 12;
                            var9[var11] = this.field6707 * var14 >> 12;
                            var10[var11] = this.field6706 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}

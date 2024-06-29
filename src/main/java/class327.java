import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class327 extends class214 {

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    private int field4501 = 8;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    private int field4505 = 204;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    private int field4516 = 81;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    private int field4517 = 1024;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field4515 = 409;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    private int field4512 = 1024;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    private int field4519 = 4;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    private int field4521 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field4510 = 0;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lsm;")
    public static class249 field4504 = new class249();

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    public static int field4523 = -1;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "Z")
    public static boolean field4526 = true;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "J")
    public static long field4525 = 0L;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4522 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
    private int[] field4506;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[[I")
    private int[][] field4507;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "[[I")
    private int[][] field4518;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V", line = 3)
    public static final void method1963(int arg0, byte arg1) {
        int var2 = -75 / ((27 - arg1) / 59);
        ++field4502;
        class265 var3 = class440.method2554(arg0, 2, 7);
        var3.method1677(21748);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIB)V", line = 17)
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field4503;
        int var7 = class163.field2345;
        int[] var8 = class482.field6800;
        class285.field3903 = 0;
        byte var9 = class372.method2228(arg6 + -66) != 2 ? 1 : (byte) class195.field2771;
        label442: for (int var10 = 0; class32.field520 + var7 > var10; ++var10) {
            class127 var33 = null;
            class75 var34;
            if (~var7 >= ~var10) {
                var34 = class256.field3581[class42.field718[-var7 + var10]];
                var33 = ((class196) var34).field2789;
                if (var33.field1780 != null) {
                    var33 = var33.method767(class320.field4376, (byte) 80);
                    if (var33 == null) {
                        continue;
                    }
                }
            } else {
                var34 = class310.field4235[var8[var10]];
            }
            if (var34.field1114 >= 0) {
                if (class484.field6821 != null && ~var34.field6766 < ~class2.field21.field6766) {
                    for (int var35 = var34.field6753; var34.field6751 >= var35; ++var35) {
                        for (int var36 = var34.field6747; ~var36 >= ~var34.field6749; ++var36) {
                            if (class484.field6821[var34.field6766][var35][var36] == var9) {
                                continue label442;
                            }
                        }
                    }
                }
                class146.method903(var34, arg0, var34.method515(false), (byte) -110, arg2 >> 1, arg4 >> 1, arg3);
                if (class460.field6483[0] >= 0) {
                    if (var34.field1118 != null && (~var7 >= ~var10 || ~class436.field5986 == -1 || class436.field5986 == 3 || class436.field5986 == 1 && class249.method1551(((class23) var34).field407, true)) && class285.field3903 < class175.field2582) {
                        class175.field2584[class285.field3903] = class328.field4531.method522(class382.method2292(arg6, 76), var34.field1118) / 2;
                        class175.field2587[class285.field3903] = class460.field6483[0];
                        class175.field2583[class285.field3903] = class460.field6483[1];
                        class175.field2589[class285.field3903] = var34.field1078;
                        class175.field2586[class285.field3903] = var34.field1102;
                        class175.field2579[class285.field3903] = var34.field1084;
                        class175.field2581[class285.field3903] = var34.field1118;
                        ++class285.field3903;
                    }
                    class385 var37 = class36.field626[0];
                    int var38 = class460.field6483[1] + arg5 - Math.max(class328.field4531.field1156, var37.method394());
                    if (!var34.field1123 && ~class356.field4972 > ~var34.field1069) {
                        class385 var39 = class36.field626[1];
                        if (var34 instanceof class196) {
                            class196 var40 = (class196) var34;
                            class385[] var41 = (class385[]) class344.field4712.method659((long) var40.field2789.field1748, (byte) -1);
                            if (var41 == null) {
                                class140[] var42 = class140.method864(class120.field1685, var40.field2789.field1748, 0);
                                if (var42 != null) {
                                    var41 = new class385[var42.length];
                                    for (int var43 = 0; var42.length > var43; ++var43) {
                                        var41[var43] = class338.field4636.method1139(var42[var43], true);
                                    }
                                    class344.field4712.method653(56, (long) var40.field2789.field1748, var41);
                                }
                            }
                            if (var41 != null && var41.length == 2) {
                                var39 = var41[1];
                                var37 = var41[0];
                            }
                        }
                        int var44 = class460.field6483[0] + arg1 - (var37.method388() >> 1);
                        var37.method2301(var44, var38);
                        int var45 = var37.method388() * var34.field1113 / 255;
                        if (~var34.field1113 < -1 && var45 < 2) {
                            var45 = 2;
                        }
                        class338.field4636.method1117(var44, var38, var44 + var45, var37.method394() + var38);
                        var39.method2301(var44, var38);
                        class338.field4636.method1094(arg1, arg5, arg1 + arg2, arg4 + arg5);
                    }
                    var38 -= 2;
                    if (!var34.field1123) {
                        if (~var34.field1066 < ~class356.field4972) {
                            class385 var46 = class64.field976[var34.field1122 ? 2 : 0];
                            class385 var47 = class64.field976[!var34.field1122 ? 1 : 3];
                            boolean var48 = true;
                            int var49;
                            if (!(var34 instanceof class196)) {
                                var49 = var34.method517(-92).field4316;
                            } else {
                                var49 = var33.field1789;
                                if (~var49 == 0) {
                                    var49 = var34.method517(-122).field4316;
                                }
                            }
                            if (~var49 != 0) {
                                class385[] var50 = (class385[]) class196.field2786.method659((long) var49, (byte) -1);
                                if (var50 == null) {
                                    class140[] var51 = class140.method864(class120.field1685, var49, 0);
                                    if (var51 != null) {
                                        var50 = new class385[var51.length];
                                        for (int var52 = 0; ~var52 > ~var51.length; ++var52) {
                                            var50[var52] = class338.field4636.method1139(var51[var52], true);
                                        }
                                        class196.field2786.method653(99, (long) var49, var50);
                                    }
                                }
                                if (var50 != null && ~var50.length == -5) {
                                    var47 = var50[!var34.field1122 ? 1 : 3];
                                    var46 = var50[var34.field1122 ? 2 : 0];
                                }
                            }
                            int var53 = var34.field1066 - class356.field4972;
                            int var54;
                            if (~var34.field1067 <= ~var53) {
                                var54 = var46.method388();
                            } else {
                                int var55 = var53 - var34.field1067;
                                int var56 = ~var34.field1130 != -1 ? (-var55 + var34.field1112) / var34.field1130 * var34.field1130 : 0;
                                var54 = var46.method388() * var56 / var34.field1112;
                            }
                            int var57 = var46.method394();
                            var38 -= var57;
                            int var58 = arg1 - (-class460.field6483[0] + (var46.method388() >> 1));
                            var46.method2301(var58, var38);
                            class338.field4636.method1117(var58, var38, var58 - -var54, var38 + var57);
                            var47.method2301(var58, var38);
                            var38 -= 2;
                            class338.field4636.method1094(arg1, arg5, arg1 + arg2, arg4 + arg5);
                        }
                        if (~var10 <= ~var7) {
                            if (var33.field1799 >= 0 && class308.field4210.length > var33.field1799) {
                                var38 -= 25;
                                class385 var59 = class308.field4210[var33.field1799];
                                var59.method2301(arg1 + (class460.field6483[0] - (var59.method388() >> 1)), var38);
                                var38 -= 2;
                            }
                        } else {
                            class23 var60 = (class23) var34;
                            if (var60.field387 != -1) {
                                var38 -= 25;
                                class388.field5462[var60.field387].method2301(arg1 - -class460.field6483[0] + -12, var38);
                                var38 -= 2;
                            }
                            if (~var60.field399 != 0) {
                                var38 -= 25;
                                class308.field4210[var60.field399].method2301(arg1 + -12 + class460.field6483[0], var38);
                                var38 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var34 instanceof class23)) {
                        int var61 = 0;
                        class147[] var62 = class51.field860;
                        for (int var63 = 0; ~var63 > ~var62.length; ++var63) {
                            class147 var65 = var62[var63];
                            if (var65 != null && var65.field2071 == 1 && ~class42.field718[-var7 + var10] == ~var65.field2074) {
                                class385 var66 = class289.field3971[var65.field2087];
                                if (var61 < var66.method394()) {
                                    var61 = var66.method394();
                                }
                                if (~(class356.field4972 % 20) > -11) {
                                    var66.method2301(class460.field6483[0] + arg1 + -12, var38 + -var66.method394());
                                }
                            }
                        }
                        if (var61 > 0) {
                            var10000 = var38 - (var61 + 2);
                        }
                    } else if (var10 >= 0) {
                        int var67 = 0;
                        class147[] var68 = class51.field860;
                        for (int var69 = 0; var68.length > var69; ++var69) {
                            class147 var71 = var68[var69];
                            if (var71 != null && ~var71.field2071 == -11 && ~var8[var10] == ~var71.field2074) {
                                class385 var72 = class289.field3971[var71.field2087];
                                if (var72.method394() > var67) {
                                    var67 = var72.method394();
                                }
                                var72.method2301(class460.field6483[0] + arg1 + -12, -var72.method394() + var38);
                            }
                        }
                        if (var67 > 0) {
                            var10000 = var38 - (var67 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; ++var73) {
                        if (class356.field4972 < var34.field1100[var73]) {
                            int var74 = var34.method515(false) / 2;
                            class146.method903(var34, arg0, var74, (byte) -110, arg2 >> 1, arg4 >> 1, arg3);
                            if (~class460.field6483[0] < 0) {
                                if (~var73 == -2) {
                                    class460.field6483[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class460.field6483[0] -= 15;
                                    class460.field6483[1] -= 10;
                                }
                                if (~var73 == -4) {
                                    class460.field6483[1] -= 10;
                                    class460.field6483[0] += 15;
                                }
                                class19.field304[var34.field1107[var73]].method2301(arg1 - -class460.field6483[0] + -12, arg5 + -12 + class460.field6483[1]);
                                class96.field1381.method2849((byte) -42, arg1 - 1 + class460.field6483[0], -1, 0, Integer.toString(var34.field1077[var73]), class460.field6483[1] + arg5 + 3);
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != -50) {
            field4526 = true;
        }
        for (int var11 = 0; ~class275.field3812 < ~var11; ++var11) {
            int var29 = class47.field760[var11];
            class75 var30;
            if (~var29 > -2049) {
                var30 = class310.field4235[var29];
            } else {
                var30 = class256.field3581[var29 + -2048];
            }
            int var31 = class301.field4129[var11];
            class75 var32;
            if (~var31 > -2049) {
                var32 = class310.field4235[var31];
            } else {
                var32 = class256.field3581[var31 + -2048];
            }
            class23.method194(arg1, --var30.field1082, var32, arg5, arg0, arg4, var30, arg3, 82, arg2);
        }
        int var12 = class328.field4531.field1156 - -class328.field4531.field1148 + 2;
        for (int var13 = 0; ~var13 > ~class285.field3903; ++var13) {
            int var14 = class175.field2587[var13];
            int var15 = class175.field2583[var13];
            int var16 = class175.field2584[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; ~var28 > ~var13; ++var28) {
                    if (class175.field2583[var28] - var12 < var15 + 2 && ~(-var12 + var15) > ~(class175.field2583[var28] + 2) && class175.field2587[var28] + class175.field2584[var28] > -var16 + var14 && ~(class175.field2587[var28] + -class175.field2584[var28]) > ~(var14 - -var16) && ~var15 < ~(class175.field2583[var28] - var12)) {
                        var17 = true;
                        var15 = class175.field2583[var28] + -var12;
                    }
                }
            }
            class175.field2583[var13] = var15;
            String var18 = class175.field2581[var13];
            if (~class19.field309 != -1) {
                class211.field2981.method2849((byte) -42, arg1 + var14, -256, -16777216, var18, arg5 + var15);
            } else {
                int var19 = 16776960;
                if (class175.field2589[var13] < 6) {
                    var19 = class233.field3284[class175.field2589[var13]];
                }
                if (~class175.field2589[var13] == -7) {
                    var19 = class195.field2771 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class175.field2589[var13] == -8) {
                    var19 = class195.field2771 % 20 < 10 ? 255 : 65535;
                }
                if (class175.field2589[var13] == 8) {
                    var19 = ~(class195.field2771 % 20) > -11 ? 45056 : 8454016;
                }
                if (class175.field2589[var13] == 9) {
                    int var20 = 150 - class175.field2579[var13];
                    if (var20 >= 50) {
                        if (var20 >= 100) {
                            if (~var20 > -151) {
                                var19 = (var20 + -100) * 5 + 65280;
                            }
                        } else {
                            var19 = -(var20 * 327680) + 16384000 + 16776960;
                        }
                    } else {
                        var19 = var20 * 1280 + 16711680;
                    }
                }
                if (class175.field2589[var13] == 10) {
                    int var21 = -class175.field2579[var13] + 150;
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = -((var21 + -50) * 327680) + 16711935;
                    } else if (~var21 > -151) {
                        var19 = 255 - (-(var21 * 327680) + 32768000) + -((var21 - 100) * 5);
                    }
                }
                if (class175.field2589[var13] == 11) {
                    int var22 = -class175.field2579[var13] + 150;
                    if (var22 < 50) {
                        var19 = -(var22 * 327685) + 16777215;
                    } else if (~var22 > -101) {
                        var19 = var22 * 327685 + 65280 + -16384250;
                    } else if (var22 < 150) {
                        var19 = -(var22 * 327680) - -49545215;
                    }
                }
                int var23 = -16777216 | var19;
                if (class175.field2586[var13] == 0) {
                    class211.field2981.method2849((byte) -42, arg1 - -var14, var23, -16777216, var18, arg5 + var15);
                }
                if (class175.field2586[var13] == 1) {
                    class211.field2981.method2853(arg5 - -var15, var23, var18, arg6 ^ 31548, -16777216, arg1 + var14, class195.field2771);
                }
                if (~class175.field2586[var13] == -3) {
                    class211.field2981.method2845(var18, -16777216, -72, arg1 - -var14, arg5 + var15, class195.field2771, var23);
                }
                if (class175.field2586[var13] == 3) {
                    class211.field2981.method2841(arg6 + 50, -16777216, var18, arg5 + var15, var23, arg1 - -var14, class195.field2771, -class175.field2579[var13] + 150);
                }
                if (~class175.field2586[var13] == -5) {
                    int var24 = (150 - class175.field2579[var13]) * (class328.field4531.method522(-112, var18) - -100) / 150;
                    class338.field4636.method1117(arg1 + var14 + -50, arg5, arg1 - (-var14 - 50), arg4 + arg5);
                    class211.field2981.method2835(arg5 + var15, var18, var23, -16777216, (byte) 98, arg1 - -50 - var24 + var14);
                    class338.field4636.method1094(arg1, arg5, arg1 + arg2, arg4 + arg5);
                }
                if (~class175.field2586[var13] == -6) {
                    int var25 = -class175.field2579[var13] + 150;
                    int var26 = 0;
                    if (var25 >= 25) {
                        if (~var25 < -126) {
                            var26 = var25 + -125;
                        }
                    } else {
                        var26 = var25 + -25;
                    }
                    int var27 = class328.field4531.field1156 + class328.field4531.field1148;
                    class338.field4636.method1117(arg1, arg5 + -1 + var15 - var27, arg1 + arg2, arg5 + var15 - -5);
                    class211.field2981.method2849((byte) -42, arg1 + var14, var23, -16777216, var18, arg5 + var15 + var26);
                    class338.field4636.method1094(arg1, arg5, arg1 + arg2, arg5 - -arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 904)
    public class327() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 614)
    private final void method1965(byte arg0) {
        ++field4508;
        if (arg0 != 44) {
            this.method1965((byte) 33);
        }
        Random var2 = new Random((long) this.field4501);
        this.field4513 = this.field4516 / 2;
        this.field4511 = 4096 / this.field4501;
        this.field4509 = 4096 / this.field4519;
        int var3 = this.field4509 / 2;
        this.field4518 = new int[this.field4501][this.field4519];
        this.field4506 = new int[this.field4501 + 1];
        int var4 = this.field4511 / 2;
        this.field4507 = new int[this.field4501][this.field4519 + 1];
        this.field4506[0] = 0;
        for (int var5 = 0; ~this.field4501 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field4511;
                int var7 = (-2048 + class10.method100((byte) -113, 4096, var2)) * this.field4505 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4506[var5] = this.field4506[var5 - 1] + var8;
            }
            this.field4507[var5][0] = 0;
            for (int var9 = 0; this.field4519 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field4509;
                    int var11 = (class10.method100((byte) -120, 4096, var2) - 2048) * this.field4515 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4507[var5][var9] = this.field4507[var5][var9 + -1] + var12;
                }
                this.field4518[var5][var9] = this.field4512 <= 0 ? 4096 : -class10.method100((byte) -100, this.field4512, var2) + 4096;
            }
            this.field4507[var5][this.field4519] = 4096;
        }
        this.field4506[this.field4501] = 4096;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I", line = 678)
    public final int[] method14(byte arg0, int arg1) {
        ++field4524;
        if (arg0 != 123) {
            this.field4505 = 1;
        }
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = 0;
            int var5;
            for (var5 = class56.field909[arg1] + this.field4521; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field4501 > var4 && var5 >= this.field4506[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field4506[var4];
            int var9 = this.field4506[var4 + -1];
            if (var5 > this.field4513 + var9 && var5 < -this.field4513 + var8) {
                for (int var10 = 0; class399.field5585 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field4517 : -this.field4517;
                    int var13;
                    for (var13 = (this.field4509 * var12 >> 12) + class436.field5989[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4519 > var11 && ~this.field4507[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field4507[var6][var11];
                    int var16 = this.field4507[var6][var14];
                    if (~var13 < ~(var16 - -this.field4513) && ~var13 > ~(-this.field4513 + var15)) {
                        var3[var10] = this.field4518[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class415.method2422(var3, 0, class399.field5585, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llk;II)V", line = 782)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field4514;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field4512 = arg0.method2508(true);
                                    }
                                } else {
                                    this.field4516 = arg0.method2508(true);
                                }
                            } else {
                                this.field4521 = arg0.method2508(true);
                            }
                        } else {
                            this.field4517 = arg0.method2508(true);
                        }
                    } else {
                        this.field4505 = arg0.method2508(true);
                    }
                } else {
                    this.field4515 = arg0.method2508(true);
                }
            } else {
                this.field4501 = arg0.method2503(true);
            }
        } else {
            this.field4519 = arg0.method2503(true);
        }
        if (arg1 >= -114) {
            this.method1965((byte) 51);
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 889)
    public final void method12(int arg0) {
        this.method1965((byte) 44);
        ++field4520;
        if (arg0 != 27108) {
            field4522 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 920)
    public static void method1966(byte arg0) {
        field4504 = null;
        field4522 = null;
        if (arg0 >= -71) {
            method1966((byte) -28);
        }
    }
}

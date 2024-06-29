import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class264 {

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "Leo;")
    public static class443 field9 = new class443(9, 7);

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static final void method1(boolean arg0) {
        ++field2;
        class107.field1502 = new class73(class404.field5532.method1078(class66.field967, 100), "", class377.field5197, 1003, -1, 0L, 0, 0, true, arg0);
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
    public static final void method2(int arg0) {
        class266.field3835.method415(((float) class172.field2621 * 0.1F + 0.7F) * 1.1523438F);
        ++field3;
        class266.field3835.method420(class450.field6409, 0.69921875F, 1.2F, -50.0F, (float) arg0, -50.0F);
        class266.field3835.method296(class428.field5969, -1);
        class266.field3835.method446(class394.field5437);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIZLnl;II)V")
    public static final void method3(boolean arg0, int arg1, int arg2, boolean arg3, class435 arg4, int arg5, int arg6) {
        class363.field5004 = arg2;
        class347.field4785 = 1;
        class449.field6386 = arg5;
        class26.field278 = arg4;
        if (arg3) {
            class353.field4855 = arg0;
            class56.field829 = arg6;
            ++field10;
            class33.field342 = arg1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V")
    public static void method4(int arg0) {
        field9 = null;
        if (arg0 != -1) {
            field9 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class1() {
        this(0);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        if (arg0 != 116) {
            return null;
        } else {
            ++field8;
            int[][] var3 = super.field3816.method1928((byte) 53, arg1);
            if (super.field3816.field4208) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class478.field6792 < ~var7; ++var7) {
                    var4[var7] = this.field11;
                    var5[var7] = this.field5;
                    var6[var7] = this.field7;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    private final void method6(int arg0, int arg1) {
        this.field5 = (65280 & arg0) >> 4;
        ++field4;
        int var3 = 87 / ((44 - arg1) / 51);
        this.field7 = (255 & arg0) << 4;
        this.field11 = (arg0 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 > 31) {
            ++field6;
            if (arg2 == 0) {
                this.method6(arg1.method1178((byte) 63), 116);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZILvc;I)V")
    public static final void method8(boolean arg0, int arg1, class89 arg2, int arg3) {
        ++field1;
        if (arg3 >= 0 && arg1 >= 0 && class480.field6800 != 0 && class333.field4632 != 0) {
            arg2.method448(class312.field4421, class104.field1468, class480.field6800, class333.field4632);
            arg2.method453(class296.field4175, class361.field4979, class480.field6800, class333.field4632);
            class257 var4 = arg2.method328();
            var4.method111(class320.field4509, class128.field1740, class301.field4260, class35.field376, class368.field5069, class423.field5857);
            if (arg0) {
                field9 = null;
            }
            arg2.method454(var4);
            if (class190.field2858 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg2.method334();
                int var8 = (arg3 - class312.field4421) * var7 / class480.field6800;
                int var9 = (-class104.field1468 + arg1) * var7 / class333.field4632;
                int var10 = arg2.method369();
                int var11 = (-class312.field4421 + arg3) * var10 / class480.field6800;
                int var12 = (-class104.field1468 + arg1) * var10 / class333.field4632;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method103(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method103(var14);
                float var15 = 0.0F;
                int var16 = var14[0] + -var13[0];
                int var17 = var14[1] - var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (~var20 < -1 && ~var22 < -1 && ~class36.field388 < ~var20 && ~class68.field998 < ~var22) {
                        int var23 = class262.field3781.field4531;
                        if (var23 < 3 && ~(2 & class372.field5120[1][var20][var22]) != -1) {
                            ++var23;
                        }
                        if ((float) class190.field2858[var23].method590(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = 64 * class262.field3781.method245(4452) - 64 + var19 >> 7;
                            var6 = 64 * class262.field3781.method245(4452) - (64 - var21) >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (var5 != -1 && var6 != -1) {
                    if (class450.field6405 && (64 & class182.field2751) != 0) {
                        class172 var24 = class77.method678(class4.field29, 126, class124.field1679);
                        if (var24 == null) {
                            class2.method9(149799361);
                        } else {
                            class19.method140(false, (byte) -116, " ->", true, class347.field4784, var5, 0L, 21, var6, -1, class95.field1336);
                        }
                    } else {
                        if (class350.field4825 == class35.field378) {
                            class19.method140(false, (byte) -111, "", true, class161.field2331.method1078(class66.field967, 100), var5, 0L, 51, var6, -1, -1);
                        }
                        class19.method140(false, (byte) 121, "", true, class309.field4390, var5, 0L, 60, var6, -1, -1);
                        ++class269.field3933;
                    }
                }
            }
            class262 var25 = class280.field4024;
            for (class309 var26 = (class309) var25.method1763((byte) -71); var26 != null; var26 = (class309) var25.method1767(true)) {
                if (class262.field3781.field4531 == var26.field4378 && var26.method1976(115, arg3, arg2, arg1)) {
                    if (var26.field4382 instanceof class39) {
                        class39 var27 = (class39) var26.field4382;
                        int var28 = var27.method245(4452);
                        if ((1 & var28) == 0 && (var27.field4537 & 127) == 0 && ~(127 & var27.field4530) == -1 || ~(1 & var28) == -2 && ~(127 & var27.field4537) == -65 && (127 & var27.field4530) == 64) {
                            int var29 = var27.field4537 + -(64 * (-1 + var27.method245(4452)));
                            int var30 = var27.field4530 + -((var27.method245(4452) + -1) * 64);
                            for (int var31 = 0; ~class24.field257 < ~var31; ++var31) {
                                class361 var38 = class163.field2377[class193.field2873[var31]];
                                if (var38 != null && class364.field5010 != var38.field5739 && var38.field5760) {
                                    int var39 = -(var38.field4952.field400 * 64) + var38.field4537 + 64;
                                    int var40 = var38.field4530 - (var38.field4952.field400 + -1) * 64;
                                    if (~var39 <= ~var29 && ~var38.field4952.field400 >= ~(var27.method245(4452) - (var39 - var29 >> 7)) && ~var40 <= ~var30 && ~var38.field4952.field400 >= ~(var27.method245(4452) - (-var30 + var40 >> 7))) {
                                        class52.method496(0, var38, class262.field3781.field4531 != var26.field4378);
                                        var38.field5739 = class364.field5010;
                                    }
                                }
                            }
                            int var32 = class143.field1996;
                            int[] var33 = class464.field6536;
                            for (int var34 = 0; var34 < var32; ++var34) {
                                class39 var35 = class112.field1570[var33[var34]];
                                if (var35 != null && ~class364.field5010 != ~var35.field5739 && var27 != var35 && var35.field5760) {
                                    int var36 = var35.field4537 + -(64 * (var35.method245(4452) - 1));
                                    int var37 = var35.field4530 + -((-1 + var35.method245(4452)) * 64);
                                    if (var36 >= var29 && ~var35.method245(4452) >= ~(-(-var29 + var36 >> 7) + var27.method245(4452)) && ~var37 <= ~var30 && ~var35.method245(4452) >= ~(var27.method245(4452) + -(var37 - var30 >> 7))) {
                                        class397.method2391(class262.field3781.field4531 != var26.field4378, var35, 44);
                                        var35.field5739 = class364.field5010;
                                    }
                                }
                            }
                        }
                        if (class364.field5010 == var27.field5739) {
                            continue;
                        }
                        class397.method2391(class262.field3781.field4531 != var26.field4378, var27, 44);
                        var27.field5739 = class364.field5010;
                    }
                    if (var26.field4382 instanceof class361) {
                        class361 var41 = (class361) var26.field4382;
                        if (var41.field4952 != null) {
                            if (~(var41.field4952.field400 & 1) == -1 && (var41.field4537 & 127) == 0 && (var41.field4530 & 127) == 0 || ~(var41.field4952.field400 & 1) == -2 && (var41.field4537 & 127) == 64 && ~(var41.field4530 & 127) == -65) {
                                int var42 = 64 - (var41.field4952.field400 * 64 - var41.field4537);
                                int var43 = -((var41.field4952.field400 + -1) * 64) + var41.field4530;
                                for (int var44 = 0; ~class24.field257 < ~var44; ++var44) {
                                    class361 var51 = class163.field2377[class193.field2873[var44]];
                                    if (var51 != null && class364.field5010 != var51.field5739 && var41 != var51 && var51.field5760) {
                                        int var52 = var51.field4537 - (var51.field4952.field400 - 1) * 64;
                                        int var53 = -((var51.field4952.field400 + -1) * 64) + var51.field4530;
                                        if (~var52 <= ~var42 && -(-var42 + var52 >> 7) + var41.field4952.field400 >= var51.field4952.field400 && var43 <= var53 && ~var51.field4952.field400 >= ~(-(-var43 + var53 >> 7) + var41.field4952.field400)) {
                                            class52.method496(0, var51, class262.field3781.field4531 != var26.field4378);
                                            var51.field5739 = class364.field5010;
                                        }
                                    }
                                }
                                int var45 = class143.field1996;
                                int[] var46 = class464.field6536;
                                for (int var47 = 0; var45 > var47; ++var47) {
                                    class39 var48 = class112.field1570[var46[var47]];
                                    if (var48 != null && class364.field5010 != var48.field5739 && var48.field5760) {
                                        int var49 = var48.field4537 - (-64 + 64 * var48.method245(4452));
                                        int var50 = var48.field4530 + 64 + -(var48.method245(4452) * 64);
                                        if (~var42 >= ~var49 && ~var48.method245(4452) >= ~(-(-var42 + var49 >> 7) + var41.field4952.field400) && ~var43 >= ~var50 && ~var48.method245(4452) >= ~(-(-var43 + var50 >> 7) + var41.field4952.field400)) {
                                            class397.method2391(class262.field3781.field4531 != var26.field4378, var48, 44);
                                            var48.field5739 = class364.field5010;
                                        }
                                    }
                                }
                            }
                            if (~class364.field5010 == ~var41.field5739) {
                                continue;
                            }
                            class52.method496(0, var41, ~class262.field3781.field4531 != ~var26.field4378);
                            var41.field5739 = class364.field5010;
                        }
                    }
                    if (var26.field4382 instanceof class164) {
                        class223 var54 = (class223) class427.field5956.method1104(-124, (long) (var26.field4378 << 28 | var26.field4384 << 14 | var26.field4379));
                        if (var54 != null) {
                            for (class143 var55 = (class143) var54.field3219.method777(103); var55 != null; var55 = (class143) var54.field3219.method767(97)) {
                                class156 var56 = class373.field5128.method1644(var55.field1987, 111);
                                if (class450.field6405) {
                                    if (class262.field3781.field4531 == var26.field4378) {
                                        class129 var61 = class132.field1809 != -1 ? class422.field5847.method1635(class132.field1809, false) : null;
                                        if ((1 & class182.field2751) != 0 && (var61 == null || ~var56.method1114(111, var61.field1765, class132.field1809) != ~var61.field1765)) {
                                            ++class385.field5281;
                                            class19.method140(false, (byte) 20, class352.field4842 + " -> <col=ff9040>" + var56.field2189, true, class347.field4784, var26.field4379, (long) var55.field1987, 25, var26.field4384, -1, class95.field1336);
                                        }
                                    }
                                } else {
                                    if (class262.field3781.field4531 == var26.field4378) {
                                        String[] var57 = var56.field2225;
                                        for (int var58 = 4; ~var58 <= -1; --var58) {
                                            if (var57 != null && var57[var58] != null) {
                                                byte var59 = 0;
                                                if (~var58 == -1) {
                                                    var59 = 58;
                                                }
                                                int var60 = class161.field2332;
                                                if (~var58 == -2) {
                                                    var59 = 23;
                                                }
                                                if (var58 == 2) {
                                                    var59 = 57;
                                                }
                                                if (~var58 == -4) {
                                                    var59 = 45;
                                                }
                                                if (~var56.field2216 == ~var58) {
                                                    var60 = var56.field2175;
                                                }
                                                if (var58 == 4) {
                                                    var59 = 4;
                                                }
                                                if (var56.field2167 == var58) {
                                                    var60 = var56.field2206;
                                                }
                                                class19.method140(false, (byte) 123, "<col=ff9040>" + var56.field2189, true, var57[var58], var26.field4379, (long) var55.field1987, var59, var26.field4384, -1, var60);
                                                ++class419.field5815;
                                            }
                                        }
                                    }
                                    ++class303.field4298;
                                    class19.method140(class262.field3781.field4531 != var26.field4378, (byte) -24, "<col=ff9040>" + var56.field2189, true, class439.field6232.method1078(class66.field967, 100), var26.field4379, (long) var55.field1987, 1007, var26.field4384, -1, class476.field6747);
                                }
                            }
                        }
                    }
                    if (var26.field4382 instanceof class210) {
                        class210 var62 = (class210) var26.field4382;
                        class267 var63 = class468.field6599.method506(-128, var62.method80(10143));
                        if (var63.field3846 != null) {
                            var63 = var63.method1799(class416.field5691, (byte) -111);
                        }
                        if (var63 != null) {
                            if (class450.field6405) {
                                if (class262.field3781.field4531 == var26.field4378) {
                                    class129 var64 = class132.field1809 == -1 ? null : class422.field5847.method1635(class132.field1809, arg0);
                                    if ((4 & class182.field2751) != 0 && (var64 == null || var63.method1808((byte) -52, class132.field1809, var64.field1765) != var64.field1765)) {
                                        class19.method140(false, (byte) 7, class352.field4842 + " -> <col=00ffff>" + var63.field3908, true, class347.field4784, var26.field4379, class33.method205(var26.field4384, var26.field4379, 5, var62), 22, var26.field4384, -1, class95.field1336);
                                        ++class30.field303;
                                    }
                                }
                            } else {
                                if (class262.field3781.field4531 == var26.field4378) {
                                    String[] var65 = var63.field3854;
                                    if (var65 != null) {
                                        for (int var66 = 4; ~var66 <= -1; --var66) {
                                            if (var65[var66] != null) {
                                                short var67 = 0;
                                                if (~var66 == -1) {
                                                    var67 = 19;
                                                }
                                                int var68 = class161.field2332;
                                                if (~var66 == -2) {
                                                    var67 = 49;
                                                }
                                                if (var66 == 2) {
                                                    var67 = 15;
                                                }
                                                if (~var66 == -4) {
                                                    var67 = 20;
                                                }
                                                if (var66 == 4) {
                                                    var67 = 1008;
                                                }
                                                if (var63.field3912 == var66) {
                                                    var68 = var63.field3883;
                                                }
                                                if (~var63.field3893 == ~var66) {
                                                    var68 = var63.field3871;
                                                }
                                                class19.method140(false, (byte) 122, "<col=00ffff>" + var63.field3908, true, var65[var66], var26.field4379, class33.method205(var26.field4384, var26.field4379, 5, var62), var67, var26.field4384, -1, var68);
                                                ++class173.field2639;
                                            }
                                        }
                                    }
                                }
                                class19.method140(class262.field3781.field4531 != var26.field4378, (byte) 105, "<col=00ffff>" + var63.field3908, true, class439.field6232.method1078(class66.field967, 100), var26.field4379, (long) var63.field3887, 1001, var26.field4384, -1, class476.field6747);
                                ++client.field870;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
    private class1(int arg0) {
        super(0, false);
        this.method6(arg0, 104);
    }
}

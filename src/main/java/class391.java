import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class391 extends class170 {

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field5550;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field5553;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    private int field5542;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    private int field5545;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lea;")
    public static class390 field5558 = new class390(0);

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Lbd;")
    public static class44 field5559 = new class44("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[S")
    public static short[] field5560 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lvq;")
    public static class328 field5551;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lbt;IIZ[II)Lhf;")
    public static final class277 method2355(class33 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5) {
        if (arg5 > -43) {
            return null;
        } else {
            ++field5556;
            if (!arg0.field712 && (!class494.method2900((byte) 19, arg2) || !class494.method2900((byte) -102, arg1))) {
                return !arg0.field665 ? new class277(arg0, arg2, arg1, class487.method2869(1366891568, arg2), class487.method2869(1366891568, arg1), arg4) : new class277(arg0, 34037, arg2, arg1, arg3, arg4);
            } else {
                return new class277(arg0, 3553, arg2, arg1, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5558 = null;
        field5560 = null;
        field5551 = null;
        field5559 = null;
        if (arg0 != 82) {
            method2356(-83);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IIB)V")
    public final void method72(int arg0, int arg1, byte arg2) {
        ++field5557;
        if (arg2 != 60) {
            method2358(false, 5);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BIII)I")
    public static final int method2357(byte arg0, int arg1, int arg2, int arg3) {
        ++field5543;
        if (~class421.field5973 > -101) {
            return -2;
        } else if (arg0 > -24) {
            return 87;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class382.field5467 + arg2;
            int var7 = -class382.field5469 + arg3;
            for (class528 var8 = (class528) class382.field5456.method863(-1); var8 != null; var8 = (class528) class382.field5456.method865(-1)) {
                if (~var8.field7723 == ~arg1) {
                    int var9 = var8.field7714;
                    int var10 = var8.field7719;
                    int var11 = class382.field5469 + var10 | var9 - -class382.field5467 << 14;
                    int var12 = (var6 - var9) * (var6 - var9) - -((-var10 + var7) * (-var10 + var7));
                    if (~var4 > -1 || var5 > var12) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
    public final void method69(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field5560 = null;
        }
        ++field5548;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V")
    public static final void method2358(boolean arg0, int arg1) {
        ++field5546;
        if (class410.field5802 != null) {
            class410.field5802.method1291(true);
            class410.field5802 = null;
        }
        class193.field2807 = 0;
        class501.method2928(false);
        class101.method745();
        for (int var2 = 0; var2 < 4; ++var2) {
            class19.field213[var2].method1129((byte) -43);
        }
        class275.method1776(-30196, false);
        System.gc();
        class242.method1593(-77, 2);
        class75.field1240 = false;
        int var3 = -111 / ((-80 - arg1) / 42);
        class441.field6285 = -1;
        class303.method1936(true, (byte) -100);
        class473.field6897 = 0;
        class122.field1908 = 0;
        class251.field3738 = 0;
        class268.field4023 = 0;
        class501.field7240 = 0;
        class82.field1315 = 0;
        for (int var4 = 0; ~class356.field5182.length < ~var4; ++var4) {
            class356.field5182[var4] = null;
        }
        class368.method2251((byte) -37);
        for (int var5 = 0; ~var5 > -2049; ++var5) {
            class494.field7143[var5] = null;
        }
        class477.field6952 = 0;
        class390.field5539.method2286((byte) 19);
        class329.field4838 = 0;
        class191.field2787.method2286((byte) 19);
        class38.method397(-1);
        class114.field1700 = 0;
        class84.field1335.method1953((byte) -124);
        class296.method1903(false);
        class274.method1765(109);
        class73.field1194 = 0L;
        class368.field5312 = null;
        if (arg0) {
            class170.method1206(1, 11);
        } else {
            class170.method1206(1, 2);
            try {
                class325.method2066(class280.field4173.field5824, (byte) -71, "loggedout");
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)V")
    public final void method70(int arg0, int arg1, byte arg2) {
        ++field5544;
        if (arg2 != -99) {
            this.field5545 = 19;
        }
        int var4 = this.field5550 * arg1 >> 12;
        int var5 = this.field5555 * arg0 >> 12;
        int var6 = this.field5547 * arg1 >> 12;
        int var7 = this.field5553 * arg0 >> 12;
        int var8 = this.field5549 * arg1 >> 12;
        int var9 = this.field5554 * arg0 >> 12;
        int var10 = this.field5545 * arg1 >> 12;
        int var11 = this.field5542 * arg0 >> 12;
        class153.method1082(super.field2538, var6, var11, var9, (byte) 94, var7, var10, var8, var5, var4);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5550 = arg0;
        this.field5554 = arg5;
        this.field5553 = arg3;
        this.field5549 = arg4;
        this.field5542 = arg7;
        this.field5555 = arg1;
        this.field5545 = arg6;
        this.field5547 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILeu;)V")
    public static final void method2359(int arg0, int arg1, int arg2, class341 arg3) {
        ++field5552;
        if (arg3 != null && class258.field3829.field1835 != arg3) {
            int var4 = arg3.field5040;
            int var5 = arg3.field5046;
            int var6 = arg3.field5039;
            int var7 = (int) arg3.field5037;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            long var8 = arg3.field5037;
            if (~var6 == -26) {
                class345.field5081 = 2;
                class317.field4713 = 0;
                class163.field2460 = arg1;
                class283.field4214 = arg2;
                ++class491.field7074;
                class228.method1528(true, class24.field352);
                class276.field4124.method3048(-2034159384, !class218.field3339.method74(82, 64) ? 0 : 1);
                class276.field4124.method3016(class82.field1315 + var4, -127);
                class276.field4124.method3045(3, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class276.field4124.method3045(arg0 + 3, class501.field7240 + var5);
                class479.method2836((byte) 125, var5, var8, var4);
            }
            if (var6 == 1001) {
                class317.field4713 = 0;
                class345.field5081 = 2;
                class283.field4214 = arg2;
                class163.field2460 = arg1;
                class193 var10 = (class193) class390.field5539.method2284(true, (long) var7);
                if (var10 != null) {
                    class279 var11 = var10.field2805;
                    class311 var12 = var11.field4157;
                    if (var12.field4631 != null) {
                        var12 = var12.method1972(class84.field1335, (byte) -51);
                    }
                    if (var12 != null) {
                        ++class516.field7479;
                        class228.method1528(true, client.field3112);
                        class276.field4124.method3016(var12.field4645, arg0 ^ -60);
                    }
                }
            }
            if (var6 == 1007) {
                ++class66.field1116;
                class345.field5081 = 2;
                class283.field4214 = arg2;
                class317.field4713 = 0;
                class163.field2460 = arg1;
                class228.method1528(true, class419.field5944);
                class276.field4124.method3016(var7, -70);
            }
            if (~var6 == -1013) {
                class317.field4713 = 0;
                ++class431.field6198;
                class345.field5081 = 2;
                class163.field2460 = arg1;
                class283.field4214 = arg2;
                class228.method1528(true, class45.field883);
                class276.field4124.method3045(3, var4 - -class82.field1315);
                class276.field4124.method3048(arg0 + -2034159384, !class218.field3339.method74(82, arg0 ^ 64) ? 0 : 1);
                class276.field4124.method3029(85, class501.field7240 + var5);
                class276.field4124.method3029(-53, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class479.method2836((byte) 125, var5, var8, var4);
            }
            if (var6 == 47) {
                class317.field4713 = 0;
                ++class313.field4667;
                class283.field4214 = arg2;
                class345.field5081 = 2;
                class163.field2460 = arg1;
                class228.method1528(true, class504.field7289);
                class276.field4124.method3045(3, var7);
                class276.field4124.method3045(3, class82.field1315 + var4);
                class276.field4124.method3048(arg0 ^ -2034159384, !class218.field3339.method74(82, 64) ? 0 : 1);
                class276.field4124.method3045(3, var5 - -class501.field7240);
                class490.method2874(var5, var4, (byte) 49);
            }
            if (var6 == 15) {
                ++class545.field7988;
                class345.field5081 = 2;
                class317.field4713 = 0;
                class163.field2460 = arg1;
                class283.field4214 = arg2;
                class228.method1528(true, class202.field3126);
                class276.field4124.method3045(3, var5 - -class501.field7240);
                class276.field4124.method3016(class82.field1315 + var4, arg0 ^ -12);
                class276.field4124.method3068((byte) 57, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class276.field4124.method3037(!class218.field3339.method74(82, arg0 ^ 64) ? 0 : 1, (byte) 7);
                class479.method2836((byte) -115, var5, var8, var4);
            }
            if (var6 == 4) {
                class193 var13 = (class193) class390.field5539.method2284(true, (long) var7);
                if (var13 != null) {
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class345.field5081 = 2;
                    class279 var14 = var13.field2805;
                    ++class370.field5339;
                    class163.field2460 = arg1;
                    class228.method1528(true, class481.field6990);
                    class276.field4124.method3068((byte) 57, var7);
                    class276.field4124.method3039(arg0 + -60, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class15.method88(var14.method135((byte) 72), 0, var14.field344[0], -2, 17686, var14.field343[0], true, 0, var14.method135((byte) 72));
                }
            }
            if (var6 == 13) {
                ++class334.field4957;
                class317.field4713 = 0;
                class163.field2460 = arg1;
                class345.field5081 = 2;
                class283.field4214 = arg2;
                class228.method1528(true, class485.field7029);
                class276.field4124.method3016(class72.field1164, -119);
                class276.field4124.method3059(class303.field4494, 16711680);
                class276.field4124.method3016(Integer.MAX_VALUE & (int) (var8 >>> 32), -122);
                class276.field4124.method3016(class28.field391, -53);
                class276.field4124.method3029(arg0 ^ 86, class82.field1315 + var4);
                class276.field4124.method3023((byte) 45, class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0);
                class276.field4124.method3029(-105, class501.field7240 + var5);
                class479.method2836((byte) -119, var5, var8, var4);
            }
            if (var6 == 6 || ~var6 == -1009) {
                class503.method2942(var7, arg0, var4, var5, arg3.field5038);
            }
            if (~var6 == -23) {
                class510 var15 = class494.field7143[var7];
                if (var15 != null) {
                    class317.field4713 = 0;
                    class345.field5081 = 2;
                    class283.field4214 = arg2;
                    class163.field2460 = arg1;
                    ++class230.field3449;
                    class228.method1528(true, class220.field3369);
                    class276.field4124.method3039(38, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class276.field4124.method3045(3, var7);
                    class15.method88(var15.method135((byte) 72), 0, var15.field344[0], -2, 17686, var15.field343[0], true, 0, var15.method135((byte) 72));
                }
            }
            if (~var6 == -61) {
                class510 var16 = class494.field7143[var7];
                if (var16 != null) {
                    class163.field2460 = arg1;
                    class317.field4713 = 0;
                    class283.field4214 = arg2;
                    class345.field5081 = 2;
                    ++class49.field913;
                    class228.method1528(true, class360.field5243);
                    class276.field4124.method3045(3, var7);
                    class276.field4124.method3023((byte) 56, class218.field3339.method74(82, 64) ? 1 : 0);
                    class15.method88(var16.method135((byte) 72), 0, var16.field344[0], -2, 17686, var16.field343[0], true, 0, var16.method135((byte) 72));
                }
            }
            if (var6 == 2) {
                class510 var17 = class494.field7143[var7];
                if (var17 != null) {
                    ++class146.field2261;
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    class228.method1528(true, class67.field1121);
                    class276.field4124.method3016(var7, -122);
                    class276.field4124.method3068((byte) 57, class72.field1164);
                    class276.field4124.method3045(3, class28.field391);
                    class276.field4124.method3048(-2034159384, class218.field3339.method74(82, 64) ? 1 : 0);
                    class276.field4124.method3020(-1022807024, class303.field4494);
                    class15.method88(var17.method135((byte) 72), 0, var17.field344[0], -2, arg0 ^ 17686, var17.field343[0], true, 0, var17.method135((byte) 72));
                }
            }
            if (~var6 == -49) {
                class317.field4713 = 0;
                class283.field4214 = arg2;
                ++class249.field3717;
                class163.field2460 = arg1;
                class345.field5081 = 2;
                class228.method1528(true, class77.field1273);
                class276.field4124.method3068((byte) 57, var7);
                class276.field4124.method3016(class501.field7240 + var5, -95);
                class276.field4124.method3068((byte) 57, var4 - -class82.field1315);
                class276.field4124.method3023((byte) 92, class218.field3339.method74(82, 64) ? 1 : 0);
                class490.method2874(var5, var4, (byte) 49);
            }
            if (~var6 == -18) {
                class510 var18 = class494.field7143[var7];
                if (var18 != null) {
                    ++class359.field5220;
                    class345.field5081 = 2;
                    class283.field4214 = arg2;
                    class163.field2460 = arg1;
                    class317.field4713 = 0;
                    class228.method1528(true, class196.field2857);
                    class276.field4124.method3029(-77, var7);
                    class276.field4124.method3037(class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0, (byte) 36);
                    class15.method88(var18.method135((byte) 72), 0, var18.field344[0], -2, 17686, var18.field343[0], true, 0, var18.method135((byte) 72));
                }
            }
            if (var6 == 44) {
                class193 var19 = (class193) class390.field5539.method2284(true, (long) var7);
                if (var19 != null) {
                    class345.field5081 = 2;
                    class163.field2460 = arg1;
                    ++class152.field2313;
                    class317.field4713 = 0;
                    class279 var20 = var19.field2805;
                    class283.field4214 = arg2;
                    class228.method1528(true, class482.field7004);
                    class276.field4124.method3039(39, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class276.field4124.method3045(arg0 + 3, var7);
                    class15.method88(var20.method135((byte) 72), 0, var20.field344[0], -2, arg0 ^ 17686, var20.field343[0], true, 0, var20.method135((byte) 72));
                }
            }
            if (~var6 == -47) {
                class317.field4713 = 0;
                class163.field2460 = arg1;
                class345.field5081 = 2;
                ++class275.field4103;
                class283.field4214 = arg2;
                class228.method1528(true, class88.field1432);
                class276.field4124.method3045(3, var7);
                class276.field4124.method3045(3, class501.field7240 + var5);
                class276.field4124.method3023((byte) 100, !class218.field3339.method74(82, 64) ? 0 : 1);
                class276.field4124.method3045(3, var4 - -class82.field1315);
                class490.method2874(var5, var4, (byte) 49);
            }
            if (~var6 == -13) {
                class193 var21 = (class193) class390.field5539.method2284(true, (long) var7);
                if (var21 != null) {
                    class345.field5081 = 2;
                    class163.field2460 = arg1;
                    class279 var22 = var21.field2805;
                    ++class294.field4390;
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class228.method1528(true, class284.field4225);
                    class276.field4124.method3045(3, class28.field391);
                    class276.field4124.method3020(arg0 ^ -1022807024, class303.field4494);
                    class276.field4124.method3068((byte) 57, var7);
                    class276.field4124.method3045(3, class72.field1164);
                    class276.field4124.method3023((byte) 48, class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0);
                    class15.method88(var22.method135((byte) 72), 0, var22.field344[0], -2, 17686, var22.field343[0], true, 0, var22.method135((byte) 72));
                }
            }
            if (var6 == 57) {
                class345.field5081 = 2;
                class283.field4214 = arg2;
                class317.field4713 = 0;
                ++class440.field6265;
                class163.field2460 = arg1;
                class228.method1528(true, class280.field4180);
                class276.field4124.method3068((byte) 57, class501.field7240 + var5);
                class276.field4124.method3045(3, var4 - -class82.field1315);
                class276.field4124.method3016((int) (var8 >>> 32) & Integer.MAX_VALUE, -118);
                class276.field4124.method3023((byte) 103, class218.field3339.method74(82, arg0 + 64) ? 1 : 0);
                class479.method2836((byte) 121, var5, var8, var4);
            }
            if (~var6 == -59) {
                class510 var23 = class494.field7143[var7];
                if (var23 != null) {
                    class163.field2460 = arg1;
                    class317.field4713 = 0;
                    class283.field4214 = arg2;
                    ++class128.field1996;
                    class345.field5081 = 2;
                    class228.method1528(true, class251.field3736);
                    class276.field4124.method3016(var7, -19);
                    class276.field4124.method3023((byte) 56, !class218.field3339.method74(82, arg0 + 64) ? 0 : 1);
                    class15.method88(var23.method135((byte) 72), 0, var23.field344[0], -2, 17686, var23.field343[0], true, 0, var23.method135((byte) 72));
                }
            }
            if (~var6 == -46) {
                if (~class37.field791 < -1 && class218.field3339.method74(82, arg0 + 64) && class218.field3339.method74(81, 64)) {
                    class329.method2081(class82.field1315 + var4, class364.field5293.field6956, (byte) 97, class501.field7240 + var5);
                } else {
                    class283.field4214 = arg2;
                    class345.field5081 = 1;
                    ++class317.field4706;
                    class163.field2460 = arg1;
                    class317.field4713 = 0;
                    class228.method1528(true, class78.field1278);
                    class276.field4124.method3045(arg0 + 3, class82.field1315 + var4);
                    class276.field4124.method3068((byte) 57, class501.field7240 + var5);
                }
            }
            if (~var6 == -51) {
                class510 var24 = class494.field7143[var7];
                if (var24 != null) {
                    class163.field2460 = arg1;
                    class283.field4214 = arg2;
                    class345.field5081 = 2;
                    class317.field4713 = 0;
                    ++class393.field5578;
                    class228.method1528(true, class390.field5530);
                    class276.field4124.method3016(var7, -19);
                    class276.field4124.method3037(class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0, (byte) 60);
                    class15.method88(var24.method135((byte) 72), 0, var24.field344[0], -2, 17686, var24.field343[0], true, 0, var24.method135((byte) 72));
                }
            }
            if (~var6 == -31) {
                class510 var25 = class494.field7143[var7];
                if (var25 != null) {
                    class283.field4214 = arg2;
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    ++class208.field3154;
                    class317.field4713 = 0;
                    class228.method1528(true, class27.field384);
                    class276.field4124.method3016(var7, -11);
                    class276.field4124.method3037(!class218.field3339.method74(82, 64) ? 0 : 1, (byte) 51);
                    class15.method88(var25.method135((byte) 72), 0, var25.field344[0], -2, 17686, var25.field343[0], true, 0, var25.method135((byte) 72));
                }
            }
            if (~var6 == -10) {
                class510 var26 = class494.field7143[var7];
                if (var26 != null) {
                    class283.field4214 = arg2;
                    ++class172.field2552;
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    class317.field4713 = 0;
                    class228.method1528(true, class421.field5972);
                    class276.field4124.method3023((byte) 58, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class276.field4124.method3068((byte) 57, var7);
                    class15.method88(var26.method135((byte) 72), 0, var26.field344[0], -2, 17686, var26.field343[0], true, 0, var26.method135((byte) 72));
                }
            }
            if (var6 == 51) {
                class198 var27 = class539.method3173(var5, arg0 + 2, var4);
                if (var27 != null) {
                    class461.method2735((byte) -116);
                    class293 var28 = client.method1395(var27);
                    class192.method1308(var28.method1887(-111), -589291614, var27, var28.field4356);
                    class89.field1442 = class342.method2166(var27, 0);
                    if (class89.field1442 == null) {
                        class89.field1442 = "Null";
                    }
                    class503.field7268 = var27.field2954 + "<col=ffffff>";
                }
            } else {
                if (var6 == 5) {
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    ++class146.field2261;
                    class317.field4713 = 0;
                    class283.field4214 = arg2;
                    class228.method1528(true, class67.field1121);
                    class276.field4124.method3016(class364.field5293.field290, arg0 + -71);
                    class276.field4124.method3068((byte) 57, class72.field1164);
                    class276.field4124.method3045(arg0 ^ 3, class28.field391);
                    class276.field4124.method3048(-2034159384, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class276.field4124.method3020(arg0 + -1022807024, class303.field4494);
                }
                if (~var6 == -50) {
                    ++class166.field2499;
                    class163.field2460 = arg1;
                    class345.field5081 = 1;
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class228.method1528(true, class336.field4980);
                    class276.field4124.method3016(class28.field391, -13);
                    class276.field4124.method3029(88, class82.field1315 + var4);
                    class276.field4124.method3059(class303.field4494, 16711680);
                    class276.field4124.method3045(3, class72.field1164);
                    class276.field4124.method3029(-77, class501.field7240 - -var5);
                    class15.method88(1, 0, var5, -4, 17686, var4, true, 0, 1);
                }
                if (var6 == 16) {
                    class193 var29 = (class193) class390.field5539.method2284(true, (long) var7);
                    if (var29 != null) {
                        class317.field4713 = 0;
                        ++class293.field4354;
                        class163.field2460 = arg1;
                        class345.field5081 = 2;
                        class279 var30 = var29.field2805;
                        class283.field4214 = arg2;
                        class228.method1528(true, class342.field5051);
                        class276.field4124.method3048(-2034159384, class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0);
                        class276.field4124.method3029(104, var7);
                        class15.method88(var30.method135((byte) 72), 0, var30.field344[0], -2, 17686, var30.field343[0], true, 0, var30.method135((byte) 72));
                    }
                }
                if (arg0 != 0) {
                    method2355((class33) null, -41, -97, false, (int[]) null, -86);
                }
                if (var6 == 11 && class65.field1112 == null) {
                    class329.method2080(var5, var4, -3);
                    class65.field1112 = class539.method3173(var5, arg0 ^ 2, var4);
                    class284.method1832(-17067, class65.field1112);
                }
                if (var6 == 23) {
                    ++class8.field69;
                    class283.field4214 = arg2;
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    class317.field4713 = 0;
                    class228.method1528(true, class139.field2162);
                    class276.field4124.method3068((byte) 57, class501.field7240 + var5);
                    class276.field4124.method3045(3, class82.field1315 + var4);
                    class276.field4124.method3029(111, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    class276.field4124.method3048(-2034159384, !class218.field3339.method74(82, arg0 ^ 64) ? 0 : 1);
                    class479.method2836((byte) 121, var5, var8, var4);
                }
                if (var6 == 1010) {
                    class317.field4713 = 0;
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    ++class253.field3746;
                    class283.field4214 = arg2;
                    class228.method1528(true, class380.field5436);
                    class276.field4124.method3016(var7, -117);
                }
                if (~var6 == -22) {
                    if (~class37.field791 < -1 && class218.field3339.method74(82, 64) && class218.field3339.method74(81, 64)) {
                        class329.method2081(class82.field1315 + var4, class364.field5293.field6956, (byte) 104, class501.field7240 - -var5);
                    } else {
                        class442.method2601(63, var5, var4, var7);
                        if (var7 == 1) {
                            class276.field4124.method3048(-2034159384, -1);
                            class276.field4124.method3048(-2034159384, -1);
                            class276.field4124.method3016((int) class508.field7354, -16);
                            class276.field4124.method3048(arg0 ^ -2034159384, 57);
                            class276.field4124.method3048(-2034159384, class78.field1280);
                            class276.field4124.method3048(-2034159384, class384.field5495);
                            class276.field4124.method3048(-2034159384, 89);
                            class276.field4124.method3016(class364.field5293.field6961, -26);
                            class276.field4124.method3016(class364.field5293.field6965, arg0 + -116);
                            class276.field4124.method3048(-2034159384, 63);
                        } else {
                            class345.field5081 = 1;
                            class317.field4713 = 0;
                            class283.field4214 = arg2;
                            class163.field2460 = arg1;
                        }
                        class15.method88(1, 0, var5, -4, 17686, var4, true, 0, 1);
                    }
                }
                if (~var6 == -4) {
                    class198 var31 = class539.method3173(var5, arg0 ^ 2, var4);
                    if (var31 != null) {
                        class191.method1306(-6, var31);
                    }
                }
                if (~var6 == -11) {
                    class193 var32 = (class193) class390.field5539.method2284(true, (long) var7);
                    if (var32 != null) {
                        class345.field5081 = 2;
                        class317.field4713 = 0;
                        class283.field4214 = arg2;
                        ++class347.field5110;
                        class163.field2460 = arg1;
                        class279 var33 = var32.field2805;
                        class228.method1528(true, class23.field324);
                        class276.field4124.method3068((byte) 57, var7);
                        class276.field4124.method3037(class218.field3339.method74(82, arg0 ^ 64) ? 1 : 0, (byte) 76);
                        class15.method88(var33.method135((byte) 72), 0, var33.field344[0], -2, 17686, var33.field343[0], true, 0, var33.method135((byte) 72));
                    }
                }
                if (var6 == 59) {
                    class510 var34 = class494.field7143[var7];
                    if (var34 != null) {
                        class317.field4713 = 0;
                        class283.field4214 = arg2;
                        class163.field2460 = arg1;
                        class345.field5081 = 2;
                        ++class448.field6439;
                        class228.method1528(true, class313.field4669);
                        class276.field4124.method3016(var7, -10);
                        class276.field4124.method3048(arg0 ^ -2034159384, !class218.field3339.method74(82, 64) ? 0 : 1);
                        class15.method88(var34.method135((byte) 72), 0, var34.field344[0], -2, 17686, var34.field343[0], true, 0, var34.method135((byte) 72));
                    }
                }
                if (var6 == 18) {
                    class163.field2460 = arg1;
                    class345.field5081 = 2;
                    ++class37.field797;
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class228.method1528(true, class276.field4123);
                    class276.field4124.method3019(class303.field4494, 11648);
                    class276.field4124.method3023((byte) 48, class218.field3339.method74(82, arg0 + 64) ? 1 : 0);
                    class276.field4124.method3029(arg0 ^ 92, var4 - -class82.field1315);
                    class276.field4124.method3029(arg0 + 127, var5 - -class501.field7240);
                    class276.field4124.method3029(85, class72.field1164);
                    class276.field4124.method3029(arg0 ^ -98, class28.field391);
                    class276.field4124.method3029(126, var7);
                    class490.method2874(var5, var4, (byte) 49);
                }
                if (var6 == 8) {
                    ++class371.field5350;
                    class163.field2460 = arg1;
                    class283.field4214 = arg2;
                    class317.field4713 = 0;
                    class345.field5081 = 2;
                    class228.method1528(true, class18.field207);
                    class276.field4124.method3045(arg0 + 3, var7);
                    class276.field4124.method3029(arg0 + -63, var5 - -class501.field7240);
                    class276.field4124.method3045(3, class82.field1315 + var4);
                    class276.field4124.method3039(arg0 + 50, !class218.field3339.method74(82, 64) ? 0 : 1);
                    class490.method2874(var5, var4, (byte) 49);
                }
                if (~var6 == -21) {
                    class317.field4713 = 0;
                    class345.field5081 = 2;
                    class163.field2460 = arg1;
                    ++class314.field4679;
                    class283.field4214 = arg2;
                    class228.method1528(true, class178.field2651);
                    class276.field4124.method3045(arg0 + 3, class82.field1315 + var4);
                    class276.field4124.method3016(class501.field7240 + var5, -22);
                    class276.field4124.method3023((byte) 80, class218.field3339.method74(82, 64) ? 1 : 0);
                    class276.field4124.method3045(3, var7);
                    class490.method2874(var5, var4, (byte) 49);
                }
                if (~var6 == -1004 || ~var6 == -1005 || var6 == 1011 || var6 == 1006 || ~var6 == -1010) {
                    class247.method1615(var4, var7, (byte) 17, var6);
                }
                if (~var6 == -20) {
                    class193 var35 = (class193) class390.field5539.method2284(true, (long) var7);
                    if (var35 != null) {
                        class317.field4713 = 0;
                        class345.field5081 = 2;
                        class163.field2460 = arg1;
                        ++class167.field2511;
                        class283.field4214 = arg2;
                        class279 var36 = var35.field2805;
                        class228.method1528(true, class80.field1297);
                        class276.field4124.method3023((byte) 57, class218.field3339.method74(82, 64) ? 1 : 0);
                        class276.field4124.method3029(109, var7);
                        class15.method88(var36.method135((byte) 72), 0, var36.field344[0], -2, arg0 + 17686, var36.field343[0], true, 0, var36.method135((byte) 72));
                    }
                }
                if (class219.field3351) {
                    class461.method2735((byte) -121);
                }
                if (class214.field3230 != null && ~class126.field1982 == -1) {
                    class284.method1832(-17067, class214.field3230);
                }
            }
        }
    }
}

import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class685 extends class244 {

    @OriginalMember(owner = "client!bs", name = "zb", descriptor = "Ljava/lang/String;")
    public static String field9673 = null;

    @OriginalMember(owner = "client!bs", name = "Eb", descriptor = "J")
    public static long field9678 = -1L;

    @OriginalMember(owner = "client!bs", name = "Bb", descriptor = "Lof;")
    public static class620 field9675 = new class620(64);

    @OriginalMember(owner = "client!bs", name = "Ib", descriptor = "Lso;")
    public static class468 field9682 = new class468(5, 8);

    @OriginalMember(owner = "client!bs", name = "Ab", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!bs", name = "Cb", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!bs", name = "Db", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!bs", name = "Fb", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!bs", name = "Hb", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!bs", name = "Gb", descriptor = "Lbq;")
    public static class289 field9680;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lig;B)Lkk;", line = 6)
    public static final class190 method3876(class244 arg0, byte arg1) {
        int var2 = -56 / ((arg1 - -46) / 37);
        ++field9674;
        int var3 = arg0.method1476(21);
        return new class190(var3);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(Z)V", line = 19)
    public static void method3877(boolean arg0) {
        field9682 = null;
        if (arg0) {
            field9682 = null;
        }
        field9673 = null;
        field9680 = null;
        field9675 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BF)V", line = 32)
    public final void method3878(byte arg0, float arg1) {
        ++field9677;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field2912[super.field2903++] = (byte) (var3 >> 24);
        if (arg0 != 69) {
            method3881(5);
        }
        super.field2912[super.field2903++] = (byte) (var3 >> 16);
        super.field2912[super.field2903++] = (byte) (var3 >> 8);
        super.field2912[super.field2903++] = (byte) var3;
    }

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "(II)V", line = 51)
    public static final void method3879(int arg0, int arg1) {
        class469.field6702 = -1;
        int var2 = 73 / ((24 - arg0) / 59);
        ++field9679;
        class116.field1211 = arg1;
        class469.field6702 = -1;
        class674.method3838(-1);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(FI)V", line = 72)
    public final void method3880(float arg0, int arg1) {
        ++field9676;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field2912[super.field2903++] = (byte) var3;
        super.field2912[super.field2903++] = (byte) (var3 >> 8);
        int var4 = 84 / ((arg1 - -43) / 63);
        super.field2912[super.field2903++] = (byte) (var3 >> 16);
        super.field2912[super.field2903++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "(I)V", line = 97)
    public static final void method3881(int arg0) {
        ++field9681;
        class231.method1339((byte) -64, false);
        class412.field5621 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class602.field8566.length; ++var2) {
            if (~class331.field4299[var2] != 0 && class602.field8566[var2] == null) {
                class602.field8566[var2] = class154.field1692.method2481(class331.field4299[var2], 0, (byte) 105);
                if (class602.field8566[var2] == null) {
                    var1 = false;
                    ++class412.field5621;
                }
            }
            if (~class322.field4113[var2] != 0 && class630.field9059[var2] == null) {
                class630.field9059[var2] = class154.field1692.method2490(-23746, 0, class322.field4113[var2], class64.field655[var2]);
                if (class630.field9059[var2] == null) {
                    ++class412.field5621;
                    var1 = false;
                }
            }
            if (~class323.field4123[var2] != 0 && class232.field2708[var2] == null) {
                class232.field2708[var2] = class154.field1692.method2481(class323.field4123[var2], 0, (byte) 106);
                if (class232.field2708[var2] == null) {
                    var1 = false;
                    ++class412.field5621;
                }
            }
            if (~class111.field1173[var2] != 0 && class676.field9572[var2] == null) {
                class676.field9572[var2] = class154.field1692.method2481(class111.field1173[var2], 0, (byte) 103);
                if (class676.field9572[var2] == null) {
                    var1 = false;
                    ++class412.field5621;
                }
            }
            if (class553.field7925 != null && class24.field232[var2] == null && class553.field7925[var2] != -1) {
                class24.field232[var2] = class154.field1692.method2490(-23746, 0, class553.field7925[var2], class64.field655[var2]);
                if (class24.field232[var2] == null) {
                    var1 = false;
                    ++class412.field5621;
                }
            }
        }
        if (class230.field2685 == null) {
            if (class228.field2654 != null && class385.field5354.method2469(-26492, class228.field2654.field962 + "_staticelements")) {
                if (!class385.field5354.method2466(class228.field2654.field962 + "_staticelements", arg0 + -120)) {
                    ++class412.field5621;
                    var1 = false;
                } else {
                    class230.field2685 = class215.method1261(class385.field5354, false, class228.field2654.field962 + "_staticelements", class511.field7290);
                }
            } else {
                class230.field2685 = new class664(0);
            }
        }
        if (!var1) {
            class689.field9719 = 1;
        } else {
            class491.field6992 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class602.field8566.length; ++var4) {
                byte[] var21 = class630.field9059[var4];
                if (var21 != null) {
                    int var22 = (class74.field773[var4] >> 8) * 64 - class464.field6624;
                    int var23 = (255 & class74.field773[var4]) * 64 - class181.field2144;
                    if (~class614.field8787 != -1) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class175.method1082(class489.field6976, var22, 63, var23, class153.field1677, var21);
                }
                byte[] var24 = class676.field9572[var4];
                if (var24 != null) {
                    int var25 = (class74.field773[var4] >> 8) * 64 + -class464.field6624;
                    int var26 = (class74.field773[var4] & 255) * 64 + -class181.field2144;
                    if (~class614.field8787 != -1) {
                        var25 = 10;
                        var26 = 10;
                    }
                    var3 &= class175.method1082(class489.field6976, var25, arg0 ^ 62, var26, class153.field1677, var24);
                }
            }
            if (!var3) {
                class689.field9719 = 2;
            } else {
                if (~class689.field9719 != -1) {
                    class192.method1170(class720.field10104, true, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, arg0 ^ -115) + "<br>(100%)", class740.field10344);
                }
                class381.method2343(false);
                class38.method185(true);
                class326.method1943((byte) 108);
                boolean var5 = false;
                if (class275.field3370.method394() && ~class654.field9334.field9837.method1829(arg0 ^ 117) == -3) {
                    for (int var6 = 0; ~var6 > ~class602.field8566.length; ++var6) {
                        if (class676.field9572[var6] != null || class232.field2708[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class654.field9334.field9848.method3892(58) != 1) {
                    var7 = class162.field1804[class428.field6217];
                } else {
                    var7 = class238.field2832[class428.field6217];
                }
                if (class275.field3370.method421()) {
                    ++var7;
                }
                class582.method3349(class275.field3370, class74.field779, 9, 4, class489.field6976, class153.field1677, var7, var5, class275.field3370.method350() > 0);
                class646.method3679(class581.field8217);
                if (~class581.field8217 == -1) {
                    class385.method2388((class59) null);
                } else {
                    class385.method2388(class322.field4116);
                }
                for (int var8 = 0; var8 < 4; ++var8) {
                    class205.field2430[var8].method1809(false);
                }
                class233.method1381((byte) -87);
                class591.method3384((byte) -114, false);
                class279.method1679(110);
                class12.field103 = null;
                class471.field6744 = false;
                class381.method2343(false);
                System.gc();
                class231.method1339((byte) -123, true);
                class510.method3016(arg0 + -112);
                class288.field3543 = class654.field9334.field9856.method2185(arg0 + 16);
                class633.field9107 = class649.field9279 >= 96;
                class220.field2542 = class654.field9334.field9837.method1829(-124) == 2;
                class452.field6507 = class654.field9334.field9844.method900(67) == 1;
                class526.field7498 = class654.field9334.field9858.method2982(83) == arg0 ? -1 : class316.field4035;
                class326.field4232 = class654.field9334.field9845.method3265(6) == 1;
                class668.field9503 = class654.field9334.field9836.method466(59) == 1;
                class659.field9413 = new class84(4, class489.field6976, class153.field1677, false);
                if (class614.field8787 != 0) {
                    class407.method2508((byte) 115, class602.field8566, class659.field9413);
                } else {
                    class183.method1139(false, class602.field8566, class659.field9413);
                }
                class653.method3705((byte) 13, class153.field1677 >> 4, class489.field6976 >> 4);
                class135.method868(-21176);
                if (var5) {
                    class78.method552(true);
                    class708.field9980 = new class84(1, class489.field6976, class153.field1677, true);
                    if (~class614.field8787 != -1) {
                        class407.method2508((byte) 115, class232.field2708, class708.field9980);
                        class231.method1339((byte) -57, true);
                    } else {
                        class183.method1139(false, class232.field2708, class708.field9980);
                        class231.method1339((byte) -70, true);
                    }
                    class708.field9980.method3619(1, 0, class659.field9413.field9038[0]);
                    class708.field9980.method3616((byte) -84, (class302[]) null, class275.field3370, (int[][][]) null);
                    class78.method552(false);
                }
                class659.field9413.method3616((byte) -84, class205.field2430, class275.field3370, !var5 ? null : class708.field9980.field9038);
                if (class614.field8787 != 0) {
                    class231.method1339((byte) -31, true);
                    class464.method2823((byte) 127, class630.field9059, class659.field9413);
                } else {
                    class231.method1339((byte) -31, true);
                    class701.method3939(class630.field9059, (byte) -25, class659.field9413);
                    if (class24.field232 != null) {
                        class41.method246(-53);
                    }
                }
                class38.method185(true);
                if (~class649.field9279 > -97) {
                    class720.method4021(false);
                }
                class231.method1339((byte) -49, true);
                class659.field9413.method3614(!var5 ? null : class159.field1758[0], class275.field3370, (class278) null, false);
                class659.field9413.method592(false, class275.field3370, (byte) -38);
                class231.method1339((byte) -69, true);
                if (var5) {
                    class78.method552(true);
                    class231.method1339((byte) -102, true);
                    if (~class614.field8787 != -1) {
                        class464.method2823((byte) 126, class676.field9572, class708.field9980);
                    } else {
                        class701.method3939(class676.field9572, (byte) -103, class708.field9980);
                    }
                    class38.method185(true);
                    class231.method1339((byte) -53, true);
                    class708.field9980.method3614((class278) null, class275.field3370, class11.field88[0], false);
                    class708.field9980.method592(true, class275.field3370, (byte) 122);
                    class231.method1339((byte) -107, true);
                    class78.method552(false);
                }
                class366.method2137(3);
                int var9 = class659.field9413.field875;
                if (class122.field1278 < var9) {
                    var9 = class122.field1278;
                }
                if (~var9 > ~(class122.field1278 + -1)) {
                    var9 = class122.field1278 + -1;
                }
                if (~class654.field9334.field9858.method2982(-124) == -1) {
                    class323.method1926(var9);
                } else {
                    class323.method1926(0);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var19 = 0; ~class489.field6976 < ~var19; ++var19) {
                        for (int var20 = 0; ~class153.field1677 < ~var20; ++var20) {
                            class256.method1525((byte) 104, var20, var10, var19);
                        }
                    }
                }
                class154.method944(true);
                class381.method2343(false);
                class56.method308(0);
                class38.method185(true);
                class514.method3037(-22201);
                if (class537.field7761 != null && class751.field10504 != null && class392.field5397 == 11) {
                    ++class486.field6905;
                    class249 var11 = class289.method1715(class702.field9895, 119, class41.field470);
                    var11.field3016.method1421(1057001181, -20798);
                    class510.method3017(var11, 118);
                }
                if (~class614.field8787 == -1) {
                    int var12 = (class443.field6427 - (class489.field6976 >> 4)) / 8;
                    int var13 = ((class489.field6976 >> 4) + class443.field6427) / 8;
                    int var14 = (-(class153.field1677 >> 4) + class630.field9065) / 8;
                    int var15 = (class630.field9065 - -(class153.field1677 >> 4)) / 8;
                    for (int var16 = var12 + -1; var16 <= var13 + 1; ++var16) {
                        for (int var17 = var14 - 1; ~var17 >= ~(var15 + 1); ++var17) {
                            if (~var16 > ~var12 || ~var13 > ~var16 || ~var14 < ~var17 || var17 > var15) {
                                class154.field1692.method2464((byte) -47, "m" + var16 + "_" + var17);
                                class154.field1692.method2464((byte) -122, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (~class392.field5397 == -5) {
                    class313.method1860(true, 3);
                } else if (class392.field5397 != 8) {
                    class313.method1860(true, 10);
                    if (class751.field10504 != null) {
                        class249 var18 = class289.method1715(class485.field6893, 97, class41.field470);
                        class510.method3017(var18, arg0 ^ 69);
                    }
                } else {
                    class313.method1860(true, 7);
                }
                class477.method2869(0);
                class381.method2343(false);
                class310.method1847(0);
                class568.field8076 = true;
                if (class471.field6740) {
                    class599.method3408("Took: " + (-class36.field394 + class652.method3700(-1)) + "ms", (byte) -36);
                    class471.field6740 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V", line = 573)
    public class685(int arg0) {
        super(arg0);
    }
}

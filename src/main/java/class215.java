import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class215 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field3703 = -1;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lmb;")
    private static class96 field3693 = class243.method1708("Loaded world list data", (byte) 96);

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public static int[] field3696 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3697 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lmb;")
    public static class96 field3690 = field3693;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3695 = -2;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lmb;")
    public static class96 field3694 = class243.method1708("::breakcon", (byte) 95);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Llj;")
    public class226 field3701;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lff;")
    public static class3 field3702;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
    public int[] field3698;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[Lmb;")
    public class96[] field3700;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
    public static final boolean method1489(int arg0, int arg1) {
        if (arg1 != -1) {
            field3694 = null;
        }
        field3699++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILwk;)V")
    public static final void method1490(int arg0, int arg1, int arg2, class47 arg3) {
        field3692++;
        if (arg0 != -3) {
            field3697 = -71;
        }
        if (arg3.field4526 == arg2 && arg2 != -1) {
            class67 var4 = class189.method1332(arg2, ~arg0);
            int var5 = var4.field1162;
            if (var5 == 1) {
                arg3.field4529 = arg1;
                arg3.field4514 = 0;
                arg3.field4580 = 0;
                arg3.field4576 = 0;
                class71.method481(arg3.field4533, true, var4, arg3.field4511, arg3.field4576, class236.field4047 == arg3);
            }
            if (var5 == 2) {
                arg3.field4580 = 0;
                return;
            }
        } else if (arg2 == -1 || arg3.field4526 == -1 || class189.method1332(arg2, ~arg0).field1138 >= class189.method1332(arg3.field4526, 2).field1138) {
            arg3.field4580 = 0;
            arg3.field4558 = arg3.field4563;
            arg3.field4526 = arg2;
            arg3.field4514 = 0;
            arg3.field4576 = 0;
            arg3.field4529 = arg1;
            if (arg3.field4526 == -1) {
                return;
            }
            class71.method481(arg3.field4533, true, class189.method1332(arg3.field4526, arg0 + 5), arg3.field4511, arg3.field4576, class236.field4047 == arg3);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIILwk;I)V")
    public static final void method1491(byte arg0, int arg1, int arg2, class47 arg3, int arg4) {
        field3689++;
        if (class236.field4047 == arg3 || class73.field1254 >= 400) {
            return;
        }
        class96 var10;
        if (arg3.field806 == 0) {
            boolean var5 = true;
            if (class236.field4047.field811 != -1 && arg3.field811 != -1) {
                int var6 = arg3.field801 >= class236.field4047.field801 ? arg3.field801 : class236.field4047.field801;
                int var7 = class236.field4047.field801 - arg3.field801;
                if (var7 < 0) {
                    var7 = -var7;
                }
                int var8 = class236.field4047.field811 < arg3.field811 ? class236.field4047.field811 : arg3.field811;
                int var9 = var6 * 10 / 100 + (var8 + 5);
                if (var7 > var9) {
                    var5 = false;
                }
            }
            if (arg3.field808 > arg3.field801) {
                var10 = class36.method289(-5615, new class96[] { arg3.method365(arg0 + 222), var5 ? class87.method626(class236.field4047.field801, (byte) -44, arg3.field801) : class211.field3628, class235.field4030, class53.field933, class31.method205(arg3.field801, (byte) -78), class46.field796, class31.method205(arg3.field808 - arg3.field801, (byte) -78), class243.field4211 });
            } else {
                var10 = class36.method289(-5615, new class96[] { arg3.method365(64), var5 ? class87.method626(class236.field4047.field801, (byte) -44, arg3.field801) : class211.field3628, class235.field4030, class53.field933, class31.method205(arg3.field801, (byte) -78), class243.field4211 });
            }
        } else {
            var10 = class36.method289(-5615, new class96[] { arg3.method365(arg0 ^ -54), class235.field4030, class202.field3501, class31.method205(arg3.field806, (byte) -78), class243.field4211 });
        }
        if (class148.field2616 == 1) {
            class165.field2919++;
            class220.method1513(-89, (short) 42, class219.field3754, arg4, class36.method289(-5615, new class96[] { class178.field3075, class221.field3784, var10 }), (long) arg1, arg2);
        } else if (!class124.field2301) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class107.field1912[var11] != null) {
                    short var12 = 0;
                    if (class239.field4097 == 0 && class107.field1912[var11].method679(class49.field864, arg0 + 18569)) {
                        if (class236.field4047.field801 < arg3.field801) {
                            var12 = 2000;
                        }
                        if (class236.field4047.field824 != 0 && arg3.field824 != 0) {
                            if (class236.field4047.field824 == arg3.field824) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class122.field2264[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    class208.field3581++;
                    short var14 = class224.field3806[var11];
                    short var15 = (short) (var12 + var14);
                    class220.method1513(-79, var15, class107.field1912[var11], arg4, class36.method289(arg0 - 5498, new class96[] { class211.field3628, var10 }), (long) arg1, arg2);
                }
            }
        } else if ((class251.field4343 & 0x8) == 8) {
            class220.method1513(arg0 + 43, (short) 41, class75.field1302, arg4, class36.method289(-5615, new class96[] { class138.field2478, class221.field3784, var10 }), (long) arg1, arg2);
            class241.field4181++;
        }
        int var16 = 0;
        if (arg0 != -117) {
            method1491((byte) 48, 44, -61, (class47) null, 119);
        }
        while (class73.field1254 > var16) {
            if (class79.field1346[var16] == 5) {
                class192.field3316[var16] = class36.method289(-5615, new class96[] { class211.field3628, var10 });
                return;
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILff;)V")
    public static final void method1492(int arg0, class3 arg1) {
        if (arg0 == 42) {
            class119.field2215 = arg1;
            field3691++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1493(int arg0) {
        int var1 = 37 % ((arg0 + 42) / 53);
        field3690 = null;
        field3693 = null;
        field3696 = null;
        field3702 = null;
        field3694 = null;
    }
}

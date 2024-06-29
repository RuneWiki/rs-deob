import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class235 {

    @OriginalMember(owner = "client!se", name = "p", descriptor = "S")
    public static short field3742 = 32767;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lor;")
    public static class594 field3738 = new class594();

    @OriginalMember(owner = "client!se", name = "s", descriptor = "F")
    public static float field3745;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lqk;")
    public static class16 field3741;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[B")
    public byte[] field3739;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[B")
    public byte[] field3740;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[Ltb;")
    public static class367[] field3744;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILkt;Lps;IILr;Lvca;)V", line = 5)
    public static final void method1698(int arg0, int arg1, class143 arg2, class82 arg3, int arg4, int arg5, class167 arg6, class257 arg7) {
        field3730++;
        int var8 = arg2.field2401 - (arg4 / 2) - 5;
        int var9 = arg1 + 2;
        if (arg7.field4075 != 0) {
            arg6.method1355(var9, var8, arg1 + (arg0 * arg3.method774()) - (var9 - 1), arg4 + 10, arg7.field4075, 1);
        }
        if (arg7.field4078 != 0) {
            arg6.method1353(arg7.field4078, arg3.method774() * arg0 + (arg1 - var9) + 1, arg4 - -10, var8, true, var9);
        }
        int var10 = arg7.field4097;
        if (arg5 < 0) {
            field3741 = null;
        }
        if (arg2.field2410 && arg7.field4082 != -1) {
            var10 = arg7.field4082;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class366.field5745[var11];
            if (var11 < (arg0 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method778(arg6, var12, arg2.field2401, arg1, var10, true);
            arg1 += arg3.method774();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)V", line = 56)
    public static final void method1699(int arg0, byte arg1, int arg2) {
        int var3 = 35 % ((arg1 - 56) / 37);
        field3743++;
        int var4 = class35.field508.method3672(class122.field1996.method1091(class135.field2206, 1), false);
        for (class295 var5 = (class295) class307.field4831.method3465((byte) -47); var5 != null; var5 = (class295) class307.field4831.method3469(0)) {
            int var9 = class393.method2546(var5, 4);
            if (var4 < var9) {
                var4 = var9;
            }
        }
        var4 += 8;
        int var6 = class52.field693 * 16 + 21;
        int var7 = arg2 - (var4 / 2);
        if ((var4 + var7) > class56.field732) {
            var7 = class56.field732 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg0;
        if (var6 + arg0 > class259.field4147) {
            var8 = class259.field4147 - var6;
        }
        class492.field7207 = var7;
        if (var8 < 0) {
            var8 = 0;
        }
        class453.field6808 = true;
        class579.field8257 = var8;
        class508.field7436 = (class374.field5844 ? 26 : 22) + class52.field693 * 16;
        class254.field4051 = var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZBLpba;)V", line = 108)
    public static final void method1700(boolean arg0, byte arg1, class304 arg2) {
        field3731++;
        if (class52.field693 >= 400) {
            return;
        }
        if (class567.field8141 != arg2) {
            int var3 = 25 % ((-arg1 - 19) / 37);
            String var4;
            if (arg2.field4775 == 0) {
                boolean var5 = true;
                if (class567.field8141.field4774 != -1 && arg2.field4774 != -1) {
                    int var6 = arg2.field4777 >= class567.field8141.field4777 ? arg2.field4777 : class567.field8141.field4777;
                    int var7 = arg2.field4774 <= class567.field8141.field4774 ? arg2.field4774 : class567.field8141.field4774;
                    int var8 = var6 * 10 / 100 + var7 + 5;
                    int var9 = class567.field8141.field4777 - arg2.field4777;
                    if (var9 < 0) {
                        var9 = -var9;
                    }
                    if (var9 > var8) {
                        var5 = false;
                    }
                }
                String var10 = class99.field1647 == class34.field500 ? class122.field2002.method1091(class135.field2206, 1) : class122.field2000.method1091(class135.field2206, 1);
                if (arg2.field4785 > arg2.field4777) {
                    var4 = arg2.method2111(true, 0) + (var5 ? class502.method3055(class567.field8141.field4777, arg2.field4777, 0) : "<col=ffffff>") + " (" + var10 + arg2.field4777 + "+" + (arg2.field4785 - arg2.field4777) + ")";
                } else {
                    var4 = arg2.method2111(true, 0) + (var5 ? class502.method3055(class567.field8141.field4777, arg2.field4777, 0) : "<col=ffffff>") + " (" + var10 + arg2.field4777 + ")";
                }
            } else if (arg2.field4775 == -1) {
                var4 = arg2.method2111(true, 0);
            } else {
                var4 = arg2.method2111(true, 0) + " (" + class122.field2001.method1091(class135.field2206, 1) + arg2.field4775 + ")";
            }
            if (class145.field2450 && !arg0 && (class73.field918 & 0x8) != 0) {
                class652.method3758(0, -1, class523.field7609, class289.field4586 + " -> <col=ffffff>" + var4, true, 51, false, false, (long) arg2.field4197, 0, class558.field8067);
                class335.field5481++;
            }
            if (arg0) {
                class652.method3758(0, 0, "<col=cccccc>" + var4, "", false, -1, false, true, 0L, 0, -1);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (class34.field501[var11] != null) {
                        short var12 = 0;
                        if (client.field4436 == class99.field1647 && class34.field501[var11].equalsIgnoreCase(class122.field1995.method1091(class135.field2206, 1))) {
                            if (arg2.field4777 > class567.field8141.field4777) {
                                var12 = 2000;
                            }
                            if (class567.field8141.field4744 != 0 && arg2.field4744 != 0) {
                                if (class567.field8141.field4744 == arg2.field4744) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class101.field1652[var11]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class633.field8899[var11] + var12);
                        int var14 = class220.field3581[var11] == -1 ? class95.field1486 : class220.field3581[var11];
                        class240.field3800++;
                        class652.method3758(0, -1, class34.field501[var11], "<col=ffffff>" + var4, true, var13, false, false, (long) arg2.field4197, 0, var14);
                    }
                }
            }
            if (!arg0) {
                for (class295 var15 = (class295) class307.field4831.method3465((byte) -97); var15 != null; var15 = (class295) class307.field4831.method3469(0)) {
                    if (var15.field4631 == 6) {
                        var15.field4626 = "<col=ffffff>" + var4;
                        return;
                    }
                }
            }
        } else if (class145.field2450 && (class73.field918 & 0x10) != 0) {
            class652.method3758(0, -1, class523.field7609, class289.field4586 + " -> <col=ffffff>" + class122.field2009.method1091(class135.field2206, 1), true, 49, false, false, 0L, 0, class558.field8067);
            class80.field1001++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 263)
    public static void method1701(boolean arg0) {
        field3744 = null;
        if (!arg0) {
            method1701(true);
        }
        field3738 = null;
        field3741 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V", line = 278)
    public static final void method1702(int arg0, byte arg1) {
        if (arg1 != 112) {
            return;
        }
        field3728++;
        if (class665.field9421 == 1) {
            class629.field8869 = arg0;
        } else if (class665.field9421 == 2 || class665.field9421 == 3) {
            class538.field7862 = arg0;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class463 extends class499 {

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Z")
    private boolean field6017 = false;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lvha;")
    public static class71 field6015 = new class71("WIP", 2);

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lgd;)V")
    public class463(class696 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([[[Lmf;ZIIII)Z")
    public static final boolean method2601(class766[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6013;
        int var6 = -15 / ((-68 - arg5) / 42);
        byte var7 = !arg1 ? (byte) (class495.field6333 & 255) : 1;
        if (class561.field7133[class309.field3877][arg3][arg2] == var7) {
            return false;
        } else if (~(4 & class410.field5439[class309.field3877][arg3][arg2]) == -1) {
            return false;
        } else {
            byte var8 = 0;
            int var9 = 0;
            class130.field1731[var8] = arg3;
            int var36 = var8 + 1;
            class609.field7705[var8] = arg2;
            class561.field7133[class309.field3877][arg3][arg2] = var7;
            while (var36 != var9) {
                int var10 = 65535 & class130.field1731[var9];
                int var11 = class130.field1731[var9] >> 16 & 255;
                int var12 = class130.field1731[var9] >> 24 & 255;
                int var13 = 65535 & class609.field7705[var9];
                int var14 = (class609.field7705[var9] & 16729579) >> 16;
                var9 = var9 - -1 & 4095;
                boolean var15 = false;
                if (~(4 & class410.field5439[class309.field3877][var10][var13]) == -1) {
                    var15 = true;
                }
                boolean var16 = false;
                if (arg0 != null) {
                    label240: for (int var17 = class309.field3877 + 1; var17 <= 3; ++var17) {
                        if (arg0[var17] != null && (class410.field5439[var17][var10][var13] & 8) == 0) {
                            if (var15 && arg0[var17][var10][var13] != null) {
                                if (arg0[var17][var10][var13].field10433 != null) {
                                    int var18 = class70.method416(var11, 18);
                                    if (~arg0[var17][var10][var13].field10433.field9466 == ~var18 || arg0[var17][var10][var13].field10423 != null && arg0[var17][var10][var13].field10423.field9466 == var18) {
                                        continue;
                                    }
                                    if (~var12 != -1) {
                                        int var19 = class70.method416(var12, 18);
                                        if (arg0[var17][var10][var13].field10433.field9466 == var19 || arg0[var17][var10][var13].field10423 != null && ~arg0[var17][var10][var13].field10423.field9466 == ~var19) {
                                            continue;
                                        }
                                    }
                                    if (~var14 != -1) {
                                        int var20 = class70.method416(var14, 18);
                                        if (~arg0[var17][var10][var13].field10433.field9466 == ~var20 || arg0[var17][var10][var13].field10423 != null && arg0[var17][var10][var13].field10423.field9466 == var20) {
                                            continue;
                                        }
                                    }
                                }
                                class766 var21 = arg0[var17][var10][var13];
                                if (var21.field10431 != null) {
                                    for (class569 var22 = var21.field10431; var22 != null; var22 = var22.field7189) {
                                        class620 var23 = var22.field7193;
                                        if (var23 instanceof class274) {
                                            class274 var24 = (class274) var23;
                                            int var25 = var24.method1007(true);
                                            int var26 = var24.method1013((byte) -122);
                                            if (~var25 == -22) {
                                                var25 = 19;
                                            }
                                            int var27 = var26 << 6 | var25;
                                            if (~var11 == ~var27 || var12 != 0 && ~var12 == ~var27 || var14 != 0 && ~var14 == ~var27) {
                                                continue label240;
                                            }
                                        }
                                    }
                                }
                            }
                            class766 var28 = arg0[var17][var10][var13];
                            if (var28 != null && var28.field10431 != null) {
                                for (class569 var29 = var28.field10431; var29 != null; var29 = var29.field7189) {
                                    class620 var30 = var29.field7193;
                                    if (~var30.field7852 != ~var30.field7849 || ~var30.field7850 != ~var30.field7844) {
                                        for (int var31 = var30.field7852; ~var30.field7849 <= ~var31; ++var31) {
                                            for (int var32 = var30.field7844; var30.field7850 >= var32; ++var32) {
                                                class561.field7133[var17][var31][var32] = var7;
                                            }
                                        }
                                    }
                                }
                            }
                            var16 = true;
                            class561.field7133[var17][var10][var13] = var7;
                        }
                    }
                }
                if (var16) {
                    int var33 = class116.field1542[class309.field3877 + 1].method2060(var13, -123, var10);
                    if (~var33 < ~class568.field7181[arg4]) {
                        class568.field7181[arg4] = var33;
                    }
                    int var34 = var10 << 9;
                    int var35 = var13 << 9;
                    if (~class765.field10411[arg4] >= ~var34) {
                        if (~var34 < ~class246.field3369[arg4]) {
                            class246.field3369[arg4] = var34;
                        }
                    } else {
                        class765.field10411[arg4] = var34;
                    }
                    if (var35 < class416.field5489[arg4]) {
                        class416.field5489[arg4] = var35;
                    } else if (~class380.field4654[arg4] > ~var35) {
                        class380.field4654[arg4] = var35;
                    }
                }
                if (!var15) {
                    if (~var10 <= -2 && class561.field7133[class309.field3877][var10 + -1][var13] != var7) {
                        class130.field1731[var36] = class77.method473(class77.method473(var10 + -1, 1179648), -754974720);
                        class609.field7705[var36] = class77.method473(var13, 1245184);
                        class561.field7133[class309.field3877][var10 + -1][var13] = var7;
                        var36 = 4095 & var36 - -1;
                    }
                    ++var13;
                    if (~var13 > ~class276.field3602) {
                        if (var10 + -1 >= 0 && ~class561.field7133[class309.field3877][var10 + -1][var13] != ~var7 && ~(class410.field5439[class309.field3877][var10][var13] & 4) == -1 && ~(class410.field5439[class309.field3877][var10 + -1][var13 + -1] & 4) == -1) {
                            class130.field1731[var36] = class77.method473(1375731712, class77.method473(1179648, var10 + -1));
                            class609.field7705[var36] = class77.method473(1245184, var13);
                            var36 = 4095 & var36 - -1;
                            class561.field7133[class309.field3877][var10 + -1][var13] = var7;
                        }
                        if (class561.field7133[class309.field3877][var10][var13] != var7) {
                            class130.field1731[var36] = class77.method473(class77.method473(var10, 5373952), 318767104);
                            class609.field7705[var36] = class77.method473(5439488, var13);
                            class561.field7133[class309.field3877][var10][var13] = var7;
                            var36 = var36 + 1 & 4095;
                        }
                        if (~class240.field3280 < ~(var10 + 1) && class561.field7133[class309.field3877][var10 + 1][var13] != var7 && (class410.field5439[class309.field3877][var10][var13] & 4) == 0 && (class410.field5439[class309.field3877][var10 - -1][var13 + -1] & 4) == 0) {
                            class130.field1731[var36] = class77.method473(class77.method473(var10 + 1, 5373952), -1845493760);
                            class609.field7705[var36] = class77.method473(var13, 5439488);
                            var36 = 4095 & var36 + 1;
                            class561.field7133[class309.field3877][var10 + 1][var13] = var7;
                        }
                    }
                    --var13;
                    if (~class240.field3280 < ~(var10 + 1) && class561.field7133[class309.field3877][var10 + 1][var13] != var7) {
                        class130.field1731[var36] = class77.method473(1392508928, class77.method473(9568256, var10 - -1));
                        class609.field7705[var36] = class77.method473(9633792, var13);
                        var36 = var36 + 1 & 4095;
                        class561.field7133[class309.field3877][var10 + 1][var13] = var7;
                    }
                    --var13;
                    if (var13 >= 0) {
                        if (var10 + -1 >= 0 && ~class561.field7133[class309.field3877][var10 + -1][var13] != ~var7 && ~(class410.field5439[class309.field3877][var10][var13] & 4) == -1 && ~(class410.field5439[class309.field3877][var10 + -1][var13 + 1] & 4) == -1) {
                            class130.field1731[var36] = class77.method473(301989888, class77.method473(13762560, var10 + -1));
                            class609.field7705[var36] = class77.method473(var13, 13828096);
                            var36 = 4095 & var36 + 1;
                            class561.field7133[class309.field3877][var10 + -1][var13] = var7;
                        }
                        if (class561.field7133[class309.field3877][var10][var13] != var7) {
                            class130.field1731[var36] = class77.method473(-1828716544, class77.method473(var10, 13762560));
                            class609.field7705[var36] = class77.method473(13828096, var13);
                            var36 = 4095 & var36 + 1;
                            class561.field7133[class309.field3877][var10][var13] = var7;
                        }
                        if (class240.field3280 > var10 + 1 && ~class561.field7133[class309.field3877][var10 - -1][var13] != ~var7 && ~(4 & class410.field5439[class309.field3877][var10][var13]) == -1 && ~(4 & class410.field5439[class309.field3877][var10 + 1][var13 + 1]) == -1) {
                            class130.field1731[var36] = class77.method473(class77.method473(var10 - -1, 9568256), -771751936);
                            class609.field7705[var36] = class77.method473(var13, 9633792);
                            var36 = var36 + 1 & 4095;
                            class561.field7133[class309.field3877][var10 + 1][var13] = var7;
                        }
                    }
                }
            }
            if (~class568.field7181[arg4] != 999999) {
                class568.field7181[arg4] += 40;
                class765.field10411[arg4] -= 512;
                class246.field3369[arg4] += 512;
                class380.field4654[arg4] += 512;
                class416.field5489[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            method2601((class766[][][]) null, false, -66, -72, -104, 126);
        }
        ++field6011;
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        ++field6016;
        if (arg0 == 0) {
            if (!this.field6017) {
                super.field6405.method3718(0, class171.field2262, 1);
            } else {
                super.field6405.method3712(-14720, 1);
                super.field6405.method1158(class148.field1894, 94);
                super.field6405.method3759(false, class137.field1820, class137.field1820);
                super.field6405.method3736(class324.field4001, 2, (byte) -88);
                super.field6405.method3718(0, class171.field2262, 1);
                super.field6405.method3754(false);
                super.field6405.method3756(10, (class132) null);
                super.field6405.method3712(-14720, 0);
                this.field6017 = false;
            }
            super.field6405.method3759(false, class137.field1820, class137.field1820);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILsfa;I)V")
    public final void method206(int arg0, class132 arg1, int arg2) {
        ++field6019;
        if (arg2 == 26917) {
            super.field6405.method3756(10, arg1);
            super.field6405.method3740(arg0, 86);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
    public final void method201(int arg0, boolean arg1) {
        ++field6023;
        class445 var3 = super.field6405.method3728(false);
        if (arg0 == 91) {
            if (var3 != null && arg1) {
                super.field6405.method3712(-14720, 1);
                super.field6405.method3756(10, var3);
                super.field6405.method1158(class438.field5747, 80);
                super.field6405.method3712(-14720, 1);
                super.field6405.method3759(false, class361.field4395, class174.field2285);
                super.field6405.method1205(2, 75, class13.field134, true, false);
                super.field6405.method3718(0, class436.field5734, 1);
                class588 var4 = super.field6405.method3763(1);
                var4.method3153(-110, super.field6405.method3784(-15173));
                super.field6405.method3744(74, class514.field6557);
                super.field6405.method3712(-14720, 0);
                this.field6017 = true;
            } else {
                super.field6405.method3718(0, class436.field5734, 1);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
    public static final void method2602(int arg0) {
        class273.field3580 = null;
        class594.field7548 = null;
        ++field6014;
        if (arg0 != 1) {
            method2604((String) null, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        if (arg0 <= 11) {
            this.method201(117, false);
        }
        ++field6012;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZ)V")
    public final void method202(boolean arg0, boolean arg1) {
        super.field6405.method3759(arg1, class137.field1820, class174.field2285);
        ++field6018;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
    public static void method2603(byte arg0) {
        if (arg0 != 113) {
            field6020 = 120;
        }
        field6015 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2604(String arg0, byte arg1) {
        ++field6010;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (var2 < var3 && class465.method2608(-106, arg0.charAt(var2))) {
                ++var2;
            }
            while (~var2 > ~var3 && class465.method2608(-10, arg0.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (~var4 <= -2 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var3 > var6; ++var6) {
                    char var8 = arg0.charAt(var6);
                    if (class519.method2863(var8, (byte) 69)) {
                        char var9 = class407.method2367(false, var8);
                        if (~var9 != -1) {
                            var5.append(var9);
                        }
                    }
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    int var7 = -68 / ((arg1 - -91) / 32);
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }
}

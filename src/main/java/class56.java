import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class56 extends class119 {

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field849 = "glow1:";

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Ljava/lang/String;")
    public static String field857 = "purple:";

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Z")
    public static boolean field854 = false;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Z")
    public static boolean field862 = false;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Lil;")
    public static class48 field859;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lij;")
    public static class69 field863;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILve;)V")
    public static final void method375(int arg0, class233 arg1) {
        class100.field1496 = arg1;
        if (arg0 != -1) {
            field854 = false;
        }
        ++field858;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V")
    public final void method311(int arg0, byte arg1, int arg2) {
        if (arg1 != 122) {
            method377((byte) -12, 34, (class267) null, -22, false);
        }
        int var4 = this.field860 * arg0 >> 12;
        ++field861;
        int var5 = this.field866 * arg0 >> 12;
        int var6 = this.field852 * arg2 >> 12;
        int var7 = this.field850 * arg2 >> 12;
        class22.method161(super.field1747, var4, var5, var6, var7, arg1 + -97, super.field1749);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        int var4 = this.field866 * arg1 >> 12;
        int var5 = this.field860 * arg1 >> 12;
        ++field856;
        if (arg2 != -11777) {
            this.method310(25, 66, -29);
        }
        int var6 = this.field850 * arg0 >> 12;
        int var7 = this.field852 * arg0 >> 12;
        class19.method152(super.field1745, -192, var4, super.field1749, var6, var7, super.field1747, var5);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method376(byte arg0) {
        if (arg0 <= -19) {
            field863 = null;
            field859 = null;
            field849 = null;
            field857 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIII)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field866 = arg2;
        this.field850 = arg1;
        this.field860 = arg0;
        this.field852 = arg3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BILha;IZ)V")
    public static final void method377(byte arg0, int arg1, class267 arg2, int arg3, boolean arg4) {
        int var5 = arg2.field4177;
        int var6 = arg2.field4051;
        if (arg2.field4144 != 0) {
            if (~arg2.field4144 == -2) {
                arg2.field4177 = -arg2.field4187 + arg1;
            } else if (~arg2.field4144 != -3) {
                if (arg2.field4144 == 3) {
                    if (~arg2.field4149 == -3) {
                        arg2.field4177 = arg2.field4187 * 32 - -((arg2.field4187 - 1) * arg2.field4026);
                    } else if (~arg2.field4149 == -8) {
                        arg2.field4177 = arg2.field4187 * 115 - -((arg2.field4187 + -1) * arg2.field4026);
                    }
                }
            } else {
                arg2.field4177 = arg2.field4187 * arg1 >> 14;
            }
        } else {
            arg2.field4177 = arg2.field4187;
        }
        ++field851;
        if (arg2.field4032 != 0) {
            if (~arg2.field4032 != -2) {
                if (arg2.field4032 == 2) {
                    arg2.field4051 = arg2.field4105 * arg3 >> 14;
                } else if (~arg2.field4032 == -4) {
                    if (~arg2.field4149 != -3) {
                        if (arg2.field4149 == 7) {
                            arg2.field4051 = (arg2.field4105 + -1) * arg2.field4106 + arg2.field4105 * 12;
                        }
                    } else {
                        arg2.field4051 = (arg2.field4105 + -1) * arg2.field4106 + arg2.field4105 * 32;
                    }
                }
            } else {
                arg2.field4051 = -arg2.field4105 + arg3;
            }
        } else {
            arg2.field4051 = arg2.field4105;
        }
        if (~arg2.field4144 == -5) {
            arg2.field4177 = arg2.field4077 * arg2.field4051 / arg2.field4119;
        }
        if (arg2.field4032 == 4) {
            arg2.field4051 = arg2.field4177 * arg2.field4119 / arg2.field4077;
        }
        if (class268.field4194 && (client.method1439(arg2).field1395 != 0 || ~arg2.field4149 == -1)) {
            if (arg2.field4051 < 5 && arg2.field4177 < 5) {
                arg2.field4177 = 5;
                arg2.field4051 = 5;
            } else {
                if (~arg2.field4051 >= -1) {
                    arg2.field4051 = 5;
                }
                if (arg2.field4177 <= 0) {
                    arg2.field4177 = 5;
                }
            }
        }
        if (arg2.field4104 == 1337) {
            class21.field280 = arg2;
        }
        int var7 = 30 / ((11 - arg0) / 37);
        if (arg4 && arg2.field4079 != null) {
            if (~arg2.field4177 != ~var5 || ~arg2.field4051 != ~var6) {
                class234 var8 = new class234();
                var8.field3530 = arg2.field4079;
                var8.field3531 = arg2;
                class255.field3873.method652(94, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method376((byte) 122);
        }
        int var4 = this.field860 * arg1 >> 12;
        int var5 = this.field866 * arg1 >> 12;
        ++field853;
        int var6 = this.field850 * arg2 >> 12;
        int var7 = this.field852 * arg2 >> 12;
        class81.method543(var5, 284879873, super.field1745, var4, var7, var6);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg2 & 3;
        if ((1 & arg3) == 1) {
            int var8 = arg1;
            arg1 = arg5;
            arg5 = var8;
        }
        ++field848;
        if (var7 == 0) {
            return arg0;
        } else if (~var7 == -2) {
            return 7 - arg4 - -1 - arg1;
        } else if (var7 == 2) {
            return -arg0 + 7 + -arg5 + 1;
        } else {
            if (arg6 > -63) {
                method375(74, (class233) null);
            }
            return arg4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
    public static final int method379(boolean arg0) {
        if (!arg0) {
            method380(122, -18, -55, false, (class131[][][]) null, -108);
        }
        ++field867;
        return 2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIZ[[[Lok;I)Z")
    public static final boolean method380(int arg0, int arg1, int arg2, boolean arg3, class131[][][] arg4, int arg5) {
        ++field864;
        byte var6 = !arg3 ? (byte) (class166.field2422 & 255) : 1;
        if (class10.field175[class163.field2364][arg2][arg1] == var6) {
            return false;
        } else if (~(class189.field2684[class163.field2364][arg2][arg1] & 4) == arg0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class51.field755[var8] = arg2;
            int var31 = var8 + 1;
            class1.field19[var8] = arg1;
            class10.field175[class163.field2364][arg2][arg1] = var6;
            while (~var7 != ~var31) {
                int var9 = 255 & class51.field755[var7] >> 16;
                int var10 = class51.field755[var7] & 65535;
                int var11 = 255 & class51.field755[var7] >> 24;
                int var12 = 65535 & class1.field19[var7];
                boolean var13 = false;
                int var14 = (16721117 & class1.field19[var7]) >> 16;
                if (~(class189.field2684[class163.field2364][var10][var12] & 4) == -1) {
                    var13 = true;
                }
                var7 = var7 + 1 & 4095;
                boolean var15 = false;
                label225: for (int var16 = class163.field2364 + 1; ~var16 >= -4; ++var16) {
                    if ((8 & class189.field2684[var16][var10][var12]) == 0) {
                        if (var13 && arg4[var16][var10][var12] != null) {
                            if (arg4[var16][var10][var12].field1923 != null) {
                                int var19 = class240.method1567((byte) -44, var9);
                                if (~arg4[var16][var10][var12].field1923.field4562 == ~var19 || arg4[var16][var10][var12].field1923.field4561 == var19) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var20 = class240.method1567((byte) -70, var11);
                                    if (~arg4[var16][var10][var12].field1923.field4562 == ~var20 || ~arg4[var16][var10][var12].field1923.field4561 == ~var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class240.method1567((byte) -94, var14);
                                    if (arg4[var16][var10][var12].field1923.field4562 == var21 || arg4[var16][var10][var12].field1923.field4561 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var12].field1908 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var10][var12].field1926; ++var22) {
                                    int var23 = (int) (63L & arg4[var16][var10][var12].field1908[var22].field2350 >> 14);
                                    if (~var23 == -22) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg4[var16][var10][var12].field1908[var22].field2350 >> 20 & 3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var9 == var25 || ~var11 != -1 && var11 == var25 || ~var14 != -1 && var14 == var25) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        class131 var26 = arg4[var16][var10][var12];
                        var15 = true;
                        if (var26 != null && ~var26.field1926 < -1) {
                            for (int var27 = 0; var26.field1926 > var27; ++var27) {
                                class162 var28 = var26.field1908[var27];
                                if (~var28.field2362 != ~var28.field2353 || ~var28.field2357 != ~var28.field2340) {
                                    for (int var29 = var28.field2353; ~var29 >= ~var28.field2362; ++var29) {
                                        for (int var30 = var28.field2357; var30 <= var28.field2340; ++var30) {
                                            class10.field175[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class10.field175[var16][var10][var12] = var6;
                    }
                }
                if (var15) {
                    if (class251.field3829[arg5] < class107.field1556[class163.field2364 - -1][var10][var12]) {
                        class251.field3829[arg5] = class107.field1556[class163.field2364 + 1][var10][var12];
                    }
                    int var17 = var10 << 7;
                    int var18 = var12 << 7;
                    if (var17 < class97.field1465[arg5]) {
                        class97.field1465[arg5] = var17;
                    } else if (~class67.field1045[arg5] > ~var17) {
                        class67.field1045[arg5] = var17;
                    }
                    if (var18 < class128.field1882[arg5]) {
                        class128.field1882[arg5] = var18;
                    } else if (class193.field2773[arg5] < var18) {
                        class193.field2773[arg5] = var18;
                    }
                }
                if (!var13) {
                    if (~var10 <= -2 && class10.field175[class163.field2364][var10 + -1][var12] != var6) {
                        class51.field755[var31] = class163.method1093(class163.method1093(1179648, var10 + -1), -754974720);
                        class1.field19[var31] = class163.method1093(1245184, var12);
                        var31 = var31 + 1 & 4095;
                        class10.field175[class163.field2364][var10 - 1][var12] = var6;
                    }
                    ++var12;
                    if (~var12 > -105) {
                        if (~(var10 + -1) <= -1 && ~class10.field175[class163.field2364][var10 - 1][var12] != ~var6 && (class189.field2684[class163.field2364][var10][var12] & 4) == 0 && ~(class189.field2684[class163.field2364][var10 + -1][var12 + -1] & 4) == -1) {
                            class51.field755[var31] = class163.method1093(1375731712, class163.method1093(1179648, var10 - 1));
                            class1.field19[var31] = class163.method1093(1245184, var12);
                            var31 = var31 + 1 & 4095;
                            class10.field175[class163.field2364][var10 - 1][var12] = var6;
                        }
                        if (~class10.field175[class163.field2364][var10][var12] != ~var6) {
                            class51.field755[var31] = class163.method1093(class163.method1093(5373952, var10), 318767104);
                            class1.field19[var31] = class163.method1093(var12, 5439488);
                            var31 = 4095 & var31 + 1;
                            class10.field175[class163.field2364][var10][var12] = var6;
                        }
                        if (~(var10 - -1) > -105 && ~class10.field175[class163.field2364][var10 - -1][var12] != ~var6 && ~(class189.field2684[class163.field2364][var10][var12] & 4) == -1 && ~(4 & class189.field2684[class163.field2364][var10 + 1][var12 + -1]) == -1) {
                            class51.field755[var31] = class163.method1093(-1845493760, class163.method1093(5373952, var10 + 1));
                            class1.field19[var31] = class163.method1093(5439488, var12);
                            var31 = var31 - -1 & 4095;
                            class10.field175[class163.field2364][var10 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~(var10 + 1) > -105 && class10.field175[class163.field2364][var10 + 1][var12] != var6) {
                        class51.field755[var31] = class163.method1093(1392508928, class163.method1093(var10 + 1, 9568256));
                        class1.field19[var31] = class163.method1093(9633792, var12);
                        var31 = var31 + 1 & 4095;
                        class10.field175[class163.field2364][var10 + 1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class10.field175[class163.field2364][var10 + -1][var12] != var6 && ~(4 & class189.field2684[class163.field2364][var10][var12]) == -1 && ~(class189.field2684[class163.field2364][var10 + -1][var12 + 1] & 4) == -1) {
                            class51.field755[var31] = class163.method1093(301989888, class163.method1093(var10 + -1, 13762560));
                            class1.field19[var31] = class163.method1093(var12, 13828096);
                            var31 = 4095 & var31 + 1;
                            class10.field175[class163.field2364][var10 - 1][var12] = var6;
                        }
                        if (class10.field175[class163.field2364][var10][var12] != var6) {
                            class51.field755[var31] = class163.method1093(-1828716544, class163.method1093(var10, 13762560));
                            class1.field19[var31] = class163.method1093(13828096, var12);
                            var31 = 4095 & var31 - -1;
                            class10.field175[class163.field2364][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && ~class10.field175[class163.field2364][var10 - -1][var12] != ~var6 && ~(4 & class189.field2684[class163.field2364][var10][var12]) == -1 && ~(class189.field2684[class163.field2364][var10 + 1][var12 - -1] & 4) == -1) {
                            class51.field755[var31] = class163.method1093(class163.method1093(var10 + 1, 9568256), -771751936);
                            class1.field19[var31] = class163.method1093(9633792, var12);
                            class10.field175[class163.field2364][var10 + 1][var12] = var6;
                            var31 = 4095 & var31 + 1;
                        }
                    }
                }
            }
            if (class251.field3829[arg5] != -1000000) {
                class251.field3829[arg5] += 10;
                class97.field1465[arg5] -= 50;
                class67.field1045[arg5] += 50;
                class193.field2773[arg5] += 50;
                class128.field1882[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
    public static final void method381(byte arg0) {
        if (arg0 == 20) {
            ++field865;
            for (class272 var1 = (class272) class91.field1382.method656(96); var1 != null; var1 = (class272) class91.field1382.method650(arg0 ^ 105)) {
                if (var1.field4308 > 0) {
                    --var1.field4308;
                }
                if (var1.field4308 == 0) {
                    if (var1.field4305 < 0 || class185.method1201((byte) 57, var1.field4307, var1.field4305)) {
                        class257.method1724(-81, var1.field4313, var1.field4309, var1.field4315, var1.field4307, var1.field4311, var1.field4305, var1.field4310);
                        var1.method1706(-113);
                    }
                } else {
                    if (~var1.field4302 < -1) {
                        --var1.field4302;
                    }
                    if (~var1.field4302 == -1 && var1.field4310 >= 1 && ~var1.field4311 <= -2 && var1.field4310 <= 102 && var1.field4311 <= 102 && (var1.field4317 < 0 || class185.method1201((byte) 57, var1.field4320, var1.field4317))) {
                        class257.method1724(-115, var1.field4313, var1.field4304, var1.field4315, var1.field4320, var1.field4311, var1.field4317, var1.field4310);
                        var1.field4302 = -1;
                        if (~var1.field4317 == ~var1.field4305 && var1.field4305 == -1) {
                            var1.method1706(-82);
                        } else if (var1.field4317 == var1.field4305 && var1.field4309 == var1.field4304 && ~var1.field4320 == ~var1.field4307) {
                            var1.method1706(arg0 ^ -83);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IC)C")
    public static final char method382(int arg0, char arg1) {
        ++field855;
        if (arg0 > -87) {
            field862 = false;
        }
        if (arg1 == 198) {
            return 'E';
        } else if (~arg1 == -231) {
            return 'e';
        } else if (arg1 == 223) {
            return 's';
        } else if (arg1 == 338) {
            return 'E';
        } else {
            return (char) (~arg1 == -340 ? 'e' : '\u0000');
        }
    }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class95 extends class521 {

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "Z")
    public boolean field1316 = false;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "Z")
    public boolean field1322 = false;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "Lwe;")
    public static class141 field1325;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLhs;)V", line = 6)
    public final void method643(boolean arg0, class441 arg1) {
        ++field1327;
        class38 var3 = null;
        try {
            class277 var4 = arg1.method2629("", !arg0);
            while (var4.field3542 == 0) {
                class463.method2773(1L, 2);
            }
            if (~var4.field3542 == -2) {
                var3 = (class38) var4.field3541;
                class88 var5 = this.method650(true);
                var3.method246(var5.field1176, 0, 1, var5.field1223);
            }
        } catch (Exception var7) {
        }
        try {
            if (!arg0) {
                field1325 = null;
            }
            if (var3 != null) {
                var3.method243(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V", line = 47)
    public static final void method644(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field1325 = null;
        }
        ++field1323;
        class436 var4 = class459.method2712(9, arg3, -1759243680);
        var4.method2574((byte) 127);
        var4.field5980 = arg0;
        var4.field5977 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V", line = 63)
    public final void method645(boolean arg0, int arg1) {
        super.field7713 = arg0;
        ++field1315;
        if (arg1 != -3) {
            this.field1316 = true;
        }
        if (class52.field715 != null) {
            class52.field715.method1168(!this.method648(-59, class520.field7690), arg1 + -107);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI[[[Ltg;IZI)Z", line = 78)
    public static final boolean method646(boolean arg0, int arg1, class510[][][] arg2, int arg3, boolean arg4, int arg5) {
        if (arg0) {
            return true;
        } else {
            ++field1320;
            byte var6 = arg4 ? 1 : (byte) (class398.field5291 & 255);
            if (~class478.field6978[class366.field4715][arg1][arg3] == ~var6) {
                return false;
            } else if (~(class8.field76[class366.field4715][arg1][arg3] & 4) == -1) {
                return false;
            } else {
                byte var7 = 0;
                int var8 = 0;
                class111.field1536[var7] = arg1;
                int var35 = var7 + 1;
                class297.field3853[var7] = arg3;
                class478.field6978[class366.field4715][arg1][arg3] = var6;
                while (var35 != var8) {
                    int var9 = 65535 & class111.field1536[var8];
                    int var10 = (16712860 & class111.field1536[var8]) >> 16;
                    int var11 = 255 & class111.field1536[var8] >> 24;
                    int var12 = 65535 & class297.field3853[var8];
                    int var13 = (class297.field3853[var8] & 16716014) >> 16;
                    var8 = 4095 & var8 - -1;
                    boolean var14 = false;
                    if (~(class8.field76[class366.field4715][var9][var12] & 4) == -1) {
                        var14 = true;
                    }
                    boolean var15 = false;
                    label237: for (int var16 = class366.field4715 + 1; var16 <= 3; ++var16) {
                        if (~(8 & class8.field76[var16][var9][var12]) == -1) {
                            if (var14 && arg2[var16][var9][var12] != null) {
                                if (arg2[var16][var9][var12].field7499 != null) {
                                    int var20 = class352.method2069(var10, -8045);
                                    if (~arg2[var16][var9][var12].field7499.field3424 == ~var20 || arg2[var16][var9][var12].field7502 != null && arg2[var16][var9][var12].field7502.field3424 == var20) {
                                        continue;
                                    }
                                    if (~var11 != -1) {
                                        int var21 = class352.method2069(var11, -8045);
                                        if (~arg2[var16][var9][var12].field7499.field3424 == ~var21 || arg2[var16][var9][var12].field7502 != null && arg2[var16][var9][var12].field7502.field3424 == var21) {
                                            continue;
                                        }
                                    }
                                    if (~var13 != -1) {
                                        int var22 = class352.method2069(var13, -8045);
                                        if (arg2[var16][var9][var12].field7499.field3424 == var22 || arg2[var16][var9][var12].field7502 != null && ~arg2[var16][var9][var12].field7502.field3424 == ~var22) {
                                            continue;
                                        }
                                    }
                                }
                                class510 var23 = arg2[var16][var9][var12];
                                if (var23.field7494 != null) {
                                    for (class319 var24 = var23.field7494; var24 != null; var24 = var24.field4102) {
                                        class448 var25 = var24.field4107;
                                        if (var25 instanceof class323) {
                                            class323 var26 = (class323) var25;
                                            int var27 = var26.method414(17350);
                                            int var28 = var26.method415(-15317);
                                            if (var27 == 21) {
                                                var27 = 19;
                                            }
                                            int var29 = var27 | var28 << 6;
                                            if (~var10 == ~var29 || ~var11 != -1 && var11 == var29 || var13 != 0 && ~var13 == ~var29) {
                                                continue label237;
                                            }
                                        }
                                    }
                                }
                            }
                            class510 var30 = arg2[var16][var9][var12];
                            if (var30 != null && var30.field7494 != null) {
                                for (class319 var31 = var30.field7494; var31 != null; var31 = var31.field4102) {
                                    class448 var32 = var31.field4107;
                                    if (var32.field6238 != var32.field6229 || var32.field6228 != var32.field6221) {
                                        for (int var33 = var32.field6238; ~var33 >= ~var32.field6229; ++var33) {
                                            for (int var34 = var32.field6228; var34 <= var32.field6221; ++var34) {
                                                class478.field6978[var16][var33][var34] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class478.field6978[var16][var9][var12] = var6;
                        }
                    }
                    if (var15) {
                        int var17 = class92.field1285[class366.field4715 - -1].method1187(var9, var12);
                        if (class138.field1840[arg5] < var17) {
                            class138.field1840[arg5] = var17;
                        }
                        int var18 = var9 << 7;
                        if (~var18 > ~class63.field808[arg5]) {
                            class63.field808[arg5] = var18;
                        } else if (class78.field998[arg5] < var18) {
                            class78.field998[arg5] = var18;
                        }
                        int var19 = var12 << 7;
                        if (~var19 > ~class438.field6106[arg5]) {
                            class438.field6106[arg5] = var19;
                        } else if (class261.field3306[arg5] < var19) {
                            class261.field3306[arg5] = var19;
                        }
                    }
                    if (!var14) {
                        if (var9 >= 1 && ~class478.field6978[class366.field4715][var9 - 1][var12] != ~var6) {
                            class111.field1536[var35] = class31.method213(class31.method213(var9 + -1, 1179648), -754974720);
                            class297.field3853[var35] = class31.method213(1245184, var12);
                            class478.field6978[class366.field4715][var9 + -1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        int var10000 = ~class118.field1647;
                        ++var12;
                        if (var10000 < ~var12) {
                            if (~(var9 + -1) <= -1 && ~class478.field6978[class366.field4715][var9 + -1][var12] != ~var6 && (class8.field76[class366.field4715][var9][var12] & 4) == 0 && (class8.field76[class366.field4715][var9 + -1][var12 + -1] & 4) == 0) {
                                class111.field1536[var35] = class31.method213(class31.method213(var9 + -1, 1179648), 1375731712);
                                class297.field3853[var35] = class31.method213(var12, 1245184);
                                class478.field6978[class366.field4715][var9 + -1][var12] = var6;
                                var35 = var35 + 1 & 4095;
                            }
                            if (class478.field6978[class366.field4715][var9][var12] != var6) {
                                class111.field1536[var35] = class31.method213(318767104, class31.method213(5373952, var9));
                                class297.field3853[var35] = class31.method213(var12, 5439488);
                                var35 = var35 - -1 & 4095;
                                class478.field6978[class366.field4715][var9][var12] = var6;
                            }
                            if (~class200.field2594 < ~(var9 + 1) && class478.field6978[class366.field4715][var9 + 1][var12] != var6 && (class8.field76[class366.field4715][var9][var12] & 4) == 0 && (class8.field76[class366.field4715][var9 - -1][var12 + -1] & 4) == 0) {
                                class111.field1536[var35] = class31.method213(class31.method213(5373952, var9 - -1), -1845493760);
                                class297.field3853[var35] = class31.method213(var12, 5439488);
                                class478.field6978[class366.field4715][var9 + 1][var12] = var6;
                                var35 = 4095 & var35 + 1;
                            }
                        }
                        --var12;
                        if (~(var9 - -1) > ~class200.field2594 && class478.field6978[class366.field4715][var9 + 1][var12] != var6) {
                            class111.field1536[var35] = class31.method213(1392508928, class31.method213(9568256, var9 - -1));
                            class297.field3853[var35] = class31.method213(var12, 9633792);
                            var35 = 4095 & var35 + 1;
                            class478.field6978[class366.field4715][var9 - -1][var12] = var6;
                        }
                        --var12;
                        if (var12 >= 0) {
                            if (var9 + -1 >= 0 && class478.field6978[class366.field4715][var9 - 1][var12] != var6 && ~(4 & class8.field76[class366.field4715][var9][var12]) == -1 && (4 & class8.field76[class366.field4715][var9 + -1][var12 + 1]) == 0) {
                                class111.field1536[var35] = class31.method213(class31.method213(13762560, var9 + -1), 301989888);
                                class297.field3853[var35] = class31.method213(13828096, var12);
                                var35 = 4095 & var35 + 1;
                                class478.field6978[class366.field4715][var9 - 1][var12] = var6;
                            }
                            if (class478.field6978[class366.field4715][var9][var12] != var6) {
                                class111.field1536[var35] = class31.method213(-1828716544, class31.method213(13762560, var9));
                                class297.field3853[var35] = class31.method213(var12, 13828096);
                                class478.field6978[class366.field4715][var9][var12] = var6;
                                var35 = var35 + 1 & 4095;
                            }
                            if (~(var9 + 1) > ~class200.field2594 && class478.field6978[class366.field4715][var9 + 1][var12] != var6 && ~(4 & class8.field76[class366.field4715][var9][var12]) == -1 && (class8.field76[class366.field4715][var9 + 1][var12 + 1] & 4) == 0) {
                                class111.field1536[var35] = class31.method213(class31.method213(9568256, var9 + 1), -771751936);
                                class297.field3853[var35] = class31.method213(9633792, var12);
                                class478.field6978[class366.field4715][var9 - -1][var12] = var6;
                                var35 = 4095 & var35 + 1;
                            }
                        }
                    }
                }
                if (class138.field1840[arg5] != -1000000) {
                    class138.field1840[arg5] += 10;
                    class63.field808[arg5] -= 50;
                    class78.field998[arg5] += 50;
                    class261.field3306[arg5] += 50;
                    class438.field6106[arg5] -= 50;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 399)
    public static final void method647(String arg0, byte arg1) {
        int var2 = -70 % ((57 - arg1) / 41);
        ++field1328;
        System.out.println("Error: " + class522.method3106("\n", 1856881676, arg0, "%0a"));
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lhs;)V", line = 788)
    public class95(class441 arg0) {
        super.field7698 = 3;
        this.method645(true, -3);
        super.field7699 = true;
        super.field7705 = true;
        super.field7725 = 1;
        super.field7704 = 127;
        super.field7695 = 127;
        super.field7712 = 255;
        super.field7718 = 0;
        super.field7728 = 0;
        super.field7708 = true;
        super.field7709 = 0;
        super.field7719 = true;
        super.field7720 = true;
        super.field7711 = 0;
        super.field7696 = true;
        super.field7723 = true;
        super.field7710 = true;
        super.field7714 = true;
        super.field7694 = true;
        super.field7731 = 0;
        super.field7706 = false;
        super.field7716 = 2;
        if (~class472.field6899 <= -97) {
            class148.method1022(-15306, 2);
        } else {
            class148.method1022(-15306, 0);
        }
        super.field7707 = false;
        super.field7693 = 0;
        super.field7715 = true;
        super.field7722 = true;
        super.field7702 = 2;
        super.field7727 = 2;
        super.field7726 = false;
        super.field7701 = 0;
        super.field7730 = class78.field1003 == 1 ? 2 : 4;
        super.field7703 = false;
        class38 var2 = null;
        try {
            class277 var3 = arg0.method2629("", false);
            while (var3.field3542 == 0) {
                class463.method2773(1L, -11);
            }
            if (var3.field3542 == 1) {
                var2 = (class38) var3.field3541;
                byte[] var4 = new byte[(int) var2.method241(-127)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method244(var5, var4.length + -var5, var4, -77);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method653(4, new class88(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method243(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z", line = 413)
    public final boolean method648(int arg0, int arg1) {
        ++field1318;
        if (arg0 > -39) {
            return true;
        } else {
            return ~arg1 == -1 && !this.field1316 ? super.field7713 : true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 428)
    public static void method649(int arg0) {
        if (arg0 == 1) {
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lbt;", line = 442)
    public final class88 method650(boolean arg0) {
        ++field1317;
        class88 var2 = new class88(41);
        var2.method565(-82, 17);
        var2.method565(89, super.field7698);
        var2.method565(-85, super.field7713 ? 1 : 0);
        var2.method565(-75, !super.field7699 ? 0 : 1);
        var2.method565(-100, super.field7694 ? 1 : 0);
        var2.method565(-74, !super.field7705 ? 0 : 1);
        var2.method565(78, 0);
        var2.method565(-96, !super.field7720 ? 0 : 1);
        var2.method565(117, super.field7696 ? 1 : 0);
        var2.method565(-98, !super.field7719 ? 0 : 1);
        var2.method565(120, super.field7716);
        var2.method565(-101, super.field7711);
        var2.method565(-65, super.field7710 ? 1 : 0);
        var2.method565(117, !super.field7706 ? 0 : 1);
        var2.method565(124, super.field7708 ? 1 : 0);
        var2.method565(-103, super.field7714 ? 1 : 0);
        var2.method565(122, super.field7709);
        var2.method565(-121, !super.field7723 ? 0 : 1);
        var2.method565(-75, super.field7704);
        var2.method565(117, super.field7712);
        var2.method565(-102, super.field7695);
        var2.method609(super.field7718, -55);
        var2.method609(super.field7731, -111);
        var2.method565(-85, class258.method1615(10));
        var2.method572(-110, super.field7693);
        if (!arg0) {
            field1325 = null;
        }
        var2.method565(-119, super.field7727);
        var2.method565(82, !super.field7703 ? 0 : 1);
        var2.method565(63, super.field7707 ? 1 : 0);
        var2.method565(100, super.field7701);
        var2.method565(-96, super.field7726 ? 1 : 0);
        var2.method565(34, super.field7715 ? 1 : 0);
        var2.method565(-112, super.field7725);
        var2.method565(-61, super.field7722 ? 1 : 0);
        var2.method565(-114, super.field7702);
        var2.method565(85, super.field7730);
        var2.method565(-124, !super.field7697 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(ZI)I", line = 491)
    public final int method651(boolean arg0, int arg1) {
        ++field1324;
        if (!arg0) {
            return -121;
        } else if (this.field1322) {
            return 0;
        } else if (!this.method648(-104, arg1)) {
            return 1;
        } else {
            return !super.field7699 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)Z", line = 509)
    public final boolean method652(int arg0, int arg1) {
        ++field1319;
        if (arg0 != 4) {
            method646(true, 46, (class510[][][]) null, 72, false, 33);
        }
        return arg1 == 0 ? super.field7713 : true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILbt;)V", line = 526)
    private final void method653(int arg0, class88 arg1) {
        ++field1321;
        if (~(arg1.field1223.length + -arg1.field1176) <= -2) {
            int var3 = arg1.method617(2);
            if (~var3 <= -1 && ~var3 >= -18) {
                if (arg0 == 4) {
                    byte var4;
                    if (~var3 != -18) {
                        if (~var3 != -17) {
                            if (~var3 == -16) {
                                var4 = 37;
                            } else if (~var3 != -15) {
                                if (var3 == 13) {
                                    var4 = 35;
                                } else if (var3 == 12) {
                                    var4 = 34;
                                } else if (var3 == 11) {
                                    var4 = 33;
                                } else if (var3 == 10) {
                                    var4 = 32;
                                } else if (var3 != 9) {
                                    if (var3 == 8) {
                                        var4 = 30;
                                    } else if (var3 == 7) {
                                        var4 = 29;
                                    } else if (~var3 != -7) {
                                        if (var3 == 5) {
                                            var4 = 28;
                                        } else if (~var3 != -5) {
                                            if (var3 == 3) {
                                                var4 = 23;
                                            } else if (var3 != 2) {
                                                if (var3 != 1) {
                                                    var4 = 19;
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 22;
                                            }
                                        } else {
                                            var4 = 24;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 36;
                            }
                        } else {
                            var4 = 38;
                        }
                    } else {
                        var4 = 40;
                    }
                    if (~(arg1.field1223.length + -arg1.field1176) <= ~var4) {
                        super.field7698 = arg1.method617(2);
                        if (~super.field7698 > -2) {
                            super.field7698 = 1;
                        } else if (~super.field7698 < -5) {
                            super.field7698 = 4;
                        }
                        this.method645(arg1.method617(2) == 1, -3);
                        super.field7699 = ~arg1.method617(2) == -2;
                        super.field7694 = arg1.method617(arg0 ^ 6) == 1;
                        super.field7705 = ~arg1.method617(2) == -2;
                        super.field7725 = ~arg1.method617(2) == -2 ? 1 : 0;
                        super.field7720 = arg1.method617(2) == 1;
                        super.field7696 = arg1.method617(2) == 1;
                        super.field7719 = arg1.method617(2) == 1;
                        super.field7716 = arg1.method617(2);
                        if (~super.field7716 < -3) {
                            super.field7716 = 2;
                        }
                        if (~var3 <= -18) {
                            super.field7711 = arg1.method617(2);
                        }
                        if (var3 >= 2) {
                            super.field7710 = arg1.method617(2) == 1;
                            if (~var3 <= -18) {
                                super.field7706 = ~arg1.method617(2) == -2;
                            }
                        } else {
                            super.field7710 = ~arg1.method617(2) == -2;
                            arg1.method617(2);
                        }
                        super.field7708 = ~arg1.method617(2) == -2;
                        super.field7714 = arg1.method617(arg0 + -2) == 1;
                        super.field7709 = arg1.method617(2);
                        if (super.field7709 > 2) {
                            super.field7709 = 2;
                        }
                        super.field7728 = super.field7709;
                        super.field7723 = arg1.method617(2) == 1;
                        super.field7704 = arg1.method617(2);
                        if (~super.field7704 < -128) {
                            super.field7704 = 127;
                        }
                        super.field7712 = arg1.method617(2);
                        super.field7695 = arg1.method617(arg0 + -2);
                        if (super.field7695 > 127) {
                            super.field7695 = 127;
                        }
                        if (~var3 <= -2) {
                            super.field7718 = arg1.method568((byte) 110);
                            super.field7731 = arg1.method568((byte) 110);
                        }
                        if (var3 >= 3 && ~var3 > -7) {
                            arg1.method617(arg0 ^ 6);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg1.method617(2);
                            if (var5 < 0 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (class472.field6899 < 96) {
                                var5 = 0;
                            }
                            class148.method1022(-15306, var5);
                        }
                        if (var3 >= 5) {
                            super.field7693 = arg1.method578(91);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field7727 = var6 = arg1.method617(2);
                        }
                        if (super.field7727 != 1 && ~super.field7727 != -3) {
                            super.field7727 = 2;
                        }
                        if (var3 >= 7) {
                            super.field7703 = arg1.method617(2) == 1;
                        }
                        if (var3 >= 8) {
                            super.field7707 = arg1.method617(2) == 1;
                        }
                        if (var3 >= 9) {
                            super.field7701 = arg1.method617(2);
                        }
                        if (~super.field7701 > -1 || ~super.field7701 < ~class240.method1516(class472.field6899, -127)) {
                            super.field7701 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field7726 = ~arg1.method617(2) != -1;
                        }
                        if (var3 >= 11) {
                            super.field7715 = arg1.method617(2) != 0;
                        }
                        if (var3 >= 12) {
                            super.field7725 = arg1.method617(2);
                        }
                        if (~super.field7725 > -1 || super.field7725 > 2) {
                            super.field7725 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field7722 = arg1.method617(arg0 ^ 6) == 1;
                        }
                        if (~var3 > -15) {
                            if (~var6 == -1) {
                                super.field7702 = 2;
                            } else {
                                super.field7702 = 1;
                            }
                        } else {
                            super.field7702 = arg1.method617(arg0 ^ 6);
                        }
                        if (~super.field7702 > -1 || super.field7702 > 3) {
                            super.field7702 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field7730 = arg1.method617(arg0 + -2);
                            if (super.field7730 < 0 || super.field7730 > 4) {
                                super.field7730 = ~class78.field1003 != -2 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field7697 = ~arg1.method617(2) == -2;
                        }
                        if (var3 < 17 && super.field7702 == 0) {
                            super.field7702 = 2;
                        }
                    }
                }
            }
        }
    }
}

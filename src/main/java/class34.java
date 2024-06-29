import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class34 extends class112 {

    @OriginalMember(owner = "client!dd", name = "kc", descriptor = "I")
    public int field533 = 0;

    @OriginalMember(owner = "client!dd", name = "lc", descriptor = "I")
    public int field534 = -1;

    @OriginalMember(owner = "client!dd", name = "oc", descriptor = "I")
    public int field537 = 0;

    @OriginalMember(owner = "client!dd", name = "Fc", descriptor = "I")
    public int field554 = -1;

    @OriginalMember(owner = "client!dd", name = "pc", descriptor = "S")
    private short field538 = 0;

    @OriginalMember(owner = "client!dd", name = "Gc", descriptor = "I")
    public int field555 = 0;

    @OriginalMember(owner = "client!dd", name = "Nc", descriptor = "Z")
    public boolean field562 = false;

    @OriginalMember(owner = "client!dd", name = "wc", descriptor = "S")
    private short field545 = 0;

    @OriginalMember(owner = "client!dd", name = "Hc", descriptor = "I")
    public int field556 = 0;

    @OriginalMember(owner = "client!dd", name = "Pc", descriptor = "I")
    public int field564 = 0;

    @OriginalMember(owner = "client!dd", name = "nc", descriptor = "Lkb;")
    private static class93 field536 = class76.method390("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!dd", name = "Jc", descriptor = "Lkb;")
    public static class93 field558 = class76.method390("Null", 0);

    @OriginalMember(owner = "client!dd", name = "Cc", descriptor = "Lkb;")
    public static class93 field551 = class76.method390("(U4", 0);

    @OriginalMember(owner = "client!dd", name = "Mc", descriptor = "[Lkb;")
    public static class93[] field561 = new class93[100];

    @OriginalMember(owner = "client!dd", name = "tc", descriptor = "Lkb;")
    public static class93 field542 = field536;

    @OriginalMember(owner = "client!dd", name = "Oc", descriptor = "[I")
    public static int[] field563 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dd", name = "mc", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!dd", name = "qc", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dd", name = "sc", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!dd", name = "uc", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!dd", name = "xc", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!dd", name = "yc", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!dd", name = "zc", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!dd", name = "Ac", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!dd", name = "Dc", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!dd", name = "Ec", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!dd", name = "Ic", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!dd", name = "Kc", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!dd", name = "Qc", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dd", name = "Lc", descriptor = "Lpe;")
    public class141 field560;

    @OriginalMember(owner = "client!dd", name = "rc", descriptor = "Lfd;")
    public class52 field540;

    @OriginalMember(owner = "client!dd", name = "Bc", descriptor = "Lkb;")
    public class93 field550;

    @OriginalMember(owner = "client!dd", name = "vc", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIILqf;Log;IIII)V")
    public static final void method188(int arg0, int arg1, int arg2, class151 arg3, class134 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field541;
        if (arg5 <= 60) {
            field561 = null;
        }
        if (class82.field1515 && (class136.field2637[0][arg6][arg1] & 2) == 0) {
            if ((class136.field2637[arg8][arg6][arg1] & 16) != 0) {
                return;
            }
            if (class27.method155(arg6, arg1, arg8, 126) != class29.field474) {
                return;
            }
        }
        if (class169.field3368 > arg8) {
            class169.field3368 = arg8;
        }
        class81 var9 = class154.method990(arg2, true);
        int[][] var10 = class151.field2935[arg8];
        int var11;
        int var12;
        if (arg0 != 1 && ~arg0 != -4) {
            var11 = var9.field1487;
            var12 = var9.field1439;
        } else {
            var12 = var9.field1487;
            var11 = var9.field1439;
        }
        int var13;
        int var14;
        if (arg6 + var12 <= 104) {
            var13 = arg6 - -(var12 + 1 >> 1);
            var14 = (var12 >> 1) + arg6;
        } else {
            var14 = arg6;
            var13 = arg6 - -1;
        }
        int var15;
        int var16;
        if (arg1 + var11 <= 104) {
            var15 = (var11 + 1 >> 1) + arg1;
            var16 = (var11 >> 1) + arg1;
        } else {
            var15 = arg1 + 1;
            var16 = arg1;
        }
        int var17 = var10[var13][var15] + var10[var14][var15] + var10[var13][var16] + var10[var14][var16] >> 2;
        int var18 = (arg6 << 7) + (var12 << 6);
        int var19 = (arg1 << 7) + (var11 << 6);
        int var20 = (arg0 << 6) + arg7;
        if (~var9.field1452 == -2) {
            var20 += 256;
        }
        int var21 = (arg2 << 14) - -1073741824 + (arg6 - -(arg1 << 7));
        if (var9.field1478 == 0) {
            var21 += Integer.MIN_VALUE;
        }
        if (var9.method414((byte) -90)) {
            class193.method1241(arg0, var9, arg6, (byte) -99, arg8, arg1);
        }
        if (arg7 == 22) {
            if (!class82.field1515 || ~var9.field1478 != -1 || var9.field1480 == 1 || var9.field1489) {
                class4 var22;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var22 = var9.method404(22, var18, var10, var17, (byte) -126, var19, arg0);
                } else {
                    var22 = new class131(arg2, 22, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method806(arg8, arg6, arg1, var17, var22, var21, var20);
                if (~var9.field1480 == -2 && arg3 != null) {
                    arg3.method939(arg6, 11243, arg1);
                }
            }
        } else if (arg7 != 10 && ~arg7 != -12) {
            if (~arg7 <= -13) {
                class4 var23;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var23 = var9.method404(arg7, var18, var10, var17, (byte) -113, var19, arg0);
                } else {
                    var23 = new class131(arg2, arg7, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method850(arg8, arg6, arg1, var17, 1, 1, var23, 0, var21, var20);
                if (~arg7 <= -13 && ~arg7 >= -18 && ~arg7 != -14 && arg8 > 0) {
                    class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 2340);
                }
                if (~var9.field1480 != -1 && arg3 != null) {
                    arg3.method945(arg6, var12, arg1, var9.field1441, var11, 3);
                }
            } else if (~arg7 == -1) {
                class4 var24;
                if (var9.field1494 == -1 && var9.field1482 == null) {
                    var24 = var9.method404(0, var18, var10, var17, (byte) -128, var19, arg0);
                } else {
                    var24 = new class131(arg2, 0, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method846(arg8, arg6, arg1, var17, var24, (class4) null, class26.field396[arg0], 0, var21, var20);
                if (arg0 == 0) {
                    if (var9.field1464) {
                        class197.field3841[arg8][arg6][arg1] = 50;
                        class197.field3841[arg8][arg6][arg1 - -1] = 50;
                    }
                    if (var9.field1461) {
                        class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 585);
                    }
                } else if (~arg0 == -2) {
                    if (var9.field1464) {
                        class197.field3841[arg8][arg6][arg1 - -1] = 50;
                        class197.field3841[arg8][arg6 - -1][arg1 + 1] = 50;
                    }
                    if (var9.field1461) {
                        class95.field1768[arg8][arg6][arg1 + 1] = class112.method607(class95.field1768[arg8][arg6][arg1 + 1], 1170);
                    }
                } else if (arg0 != 2) {
                    if (~arg0 == -4) {
                        if (var9.field1464) {
                            class197.field3841[arg8][arg6][arg1] = 50;
                            class197.field3841[arg8][arg6 + 1][arg1] = 50;
                        }
                        if (var9.field1461) {
                            class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 1170);
                        }
                    }
                } else {
                    if (var9.field1464) {
                        class197.field3841[arg8][arg6 + 1][arg1] = 50;
                        class197.field3841[arg8][arg6 + 1][arg1 + 1] = 50;
                    }
                    if (var9.field1461) {
                        class95.field1768[arg8][arg6 + 1][arg1] = class112.method607(class95.field1768[arg8][arg6 + 1][arg1], 585);
                    }
                }
                if (~var9.field1480 != -1 && arg3 != null) {
                    arg3.method941(arg7, (byte) 5, arg1, arg6, arg0, var9.field1441);
                }
                if (var9.field1484 != 16) {
                    arg4.method817(arg8, arg6, arg1, var9.field1484);
                }
            } else if (~arg7 == -2) {
                class4 var25;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var25 = var9.method404(1, var18, var10, var17, (byte) -126, var19, arg0);
                } else {
                    var25 = new class131(arg2, 1, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method846(arg8, arg6, arg1, var17, var25, (class4) null, class40.field673[arg0], 0, var21, var20);
                if (var9.field1464) {
                    if (~arg0 == -1) {
                        class197.field3841[arg8][arg6][arg1 + 1] = 50;
                    } else if (arg0 != 1) {
                        if (arg0 != 2) {
                            if (arg0 == 3) {
                                class197.field3841[arg8][arg6][arg1] = 50;
                            }
                        } else {
                            class197.field3841[arg8][arg6 + 1][arg1] = 50;
                        }
                    } else {
                        class197.field3841[arg8][arg6 + 1][arg1 - -1] = 50;
                    }
                }
                if (var9.field1480 != 0 && arg3 != null) {
                    arg3.method941(arg7, (byte) 5, arg1, arg6, arg0, var9.field1441);
                }
            } else if (arg7 == 2) {
                int var26 = arg0 - -1 & 3;
                class4 var27;
                class4 var28;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var27 = var9.method404(2, var18, var10, var17, (byte) -125, var19, arg0 + 4);
                    var28 = var9.method404(2, var18, var10, var17, (byte) -120, var19, var26);
                } else {
                    var27 = new class131(arg2, 2, arg0 + 4, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                    var28 = new class131(arg2, 2, var26, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method846(arg8, arg6, arg1, var17, var27, var28, class26.field396[arg0], class26.field396[var26], var21, var20);
                if (var9.field1461) {
                    if (arg0 == 0) {
                        class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 585);
                        class95.field1768[arg8][arg6][arg1 + 1] = class112.method607(class95.field1768[arg8][arg6][arg1 + 1], 1170);
                    } else if (~arg0 != -2) {
                        if (~arg0 != -3) {
                            if (arg0 == 3) {
                                class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 1170);
                                class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 585);
                            }
                        } else {
                            class95.field1768[arg8][arg6 + 1][arg1] = class112.method607(class95.field1768[arg8][arg6 + 1][arg1], 585);
                            class95.field1768[arg8][arg6][arg1] = class112.method607(class95.field1768[arg8][arg6][arg1], 1170);
                        }
                    } else {
                        class95.field1768[arg8][arg6][arg1 + 1] = class112.method607(class95.field1768[arg8][arg6][arg1 + 1], 1170);
                        class95.field1768[arg8][arg6 - -1][arg1] = class112.method607(class95.field1768[arg8][arg6 - -1][arg1], 585);
                    }
                }
                if (~var9.field1480 != -1 && arg3 != null) {
                    arg3.method941(arg7, (byte) 5, arg1, arg6, arg0, var9.field1441);
                }
                if (var9.field1484 != 16) {
                    arg4.method817(arg8, arg6, arg1, var9.field1484);
                }
            } else if (arg7 == 3) {
                class4 var29;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var29 = var9.method404(3, var18, var10, var17, (byte) -114, var19, arg0);
                } else {
                    var29 = new class131(arg2, 3, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method846(arg8, arg6, arg1, var17, var29, (class4) null, class40.field673[arg0], 0, var21, var20);
                if (var9.field1464) {
                    if (~arg0 == -1) {
                        class197.field3841[arg8][arg6][arg1 + 1] = 50;
                    } else if (~arg0 != -2) {
                        if (~arg0 == -3) {
                            class197.field3841[arg8][arg6 + 1][arg1] = 50;
                        } else if (~arg0 == -4) {
                            class197.field3841[arg8][arg6][arg1] = 50;
                        }
                    } else {
                        class197.field3841[arg8][arg6 - -1][arg1 - -1] = 50;
                    }
                }
                if (var9.field1480 != 0 && arg3 != null) {
                    arg3.method941(arg7, (byte) 5, arg1, arg6, arg0, var9.field1441);
                }
            } else if (~arg7 == -10) {
                class4 var30;
                if (var9.field1494 == -1 && var9.field1482 == null) {
                    var30 = var9.method404(arg7, var18, var10, var17, (byte) -122, var19, arg0);
                } else {
                    var30 = new class131(arg2, arg7, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method850(arg8, arg6, arg1, var17, 1, 1, var30, 0, var21, var20);
                if (~var9.field1480 != -1 && arg3 != null) {
                    arg3.method945(arg6, var12, arg1, var9.field1441, var11, 3);
                }
                if (~var9.field1484 != -17) {
                    arg4.method817(arg8, arg6, arg1, var9.field1484);
                }
            } else if (arg7 == 4) {
                class4 var31;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var31 = var9.method404(4, var18, var10, var17, (byte) -127, var19, arg0);
                } else {
                    var31 = new class131(arg2, 4, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method801(arg8, arg6, arg1, var17, var31, (class4) null, class26.field396[arg0], 0, 0, 0, var21, var20);
            } else if (~arg7 == -6) {
                int var32 = arg4.method844(arg8, arg6, arg1);
                int var33 = 16;
                if (var32 != 0) {
                    var33 = class154.method990(var32 >> 14 & 32767, true).field1484;
                }
                class4 var34;
                if (var9.field1494 == -1 && var9.field1482 == null) {
                    var34 = var9.method404(4, var18, var10, var17, (byte) -113, var19, arg0);
                } else {
                    var34 = new class131(arg2, 4, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method801(arg8, arg6, arg1, var17, var34, (class4) null, class26.field396[arg0], 0, class69.field1281[arg0] * var33, class46.field730[arg0] * var33, var21, var20);
            } else if (arg7 == 6) {
                int var35 = arg4.method844(arg8, arg6, arg1);
                int var36 = 8;
                if (~var35 != -1) {
                    var36 = class154.method990((536862536 & var35) >> 14, true).field1484 / 2;
                }
                class4 var37;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var37 = var9.method404(4, var18, var10, var17, (byte) -117, var19, arg0 - -4);
                } else {
                    var37 = new class131(arg2, 4, arg0 - -4, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method801(arg8, arg6, arg1, var17, var37, (class4) null, 256, arg0, class207.field4042[arg0] * var36, class171.field3394[arg0] * var36, var21, var20);
            } else if (arg7 == 7) {
                int var38 = 3 & arg0 + 2;
                class4 var39;
                if (~var9.field1494 == 0 && var9.field1482 == null) {
                    var39 = var9.method404(4, var18, var10, var17, (byte) -118, var19, var38 + 4);
                } else {
                    var39 = new class131(arg2, 4, var38 + 4, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method801(arg8, arg6, arg1, var17, var39, (class4) null, 256, var38, 0, 0, var21, var20);
            } else if (arg7 == 8) {
                int var40 = 8;
                int var41 = arg4.method844(arg8, arg6, arg1);
                if (var41 != 0) {
                    var40 = class154.method990((536870182 & var41) >> 14, true).field1484 / 2;
                }
                int var42 = arg0 + 2 & 3;
                class4 var43;
                class4 var44;
                if (var9.field1494 == -1 && var9.field1482 == null) {
                    var43 = var9.method404(4, var18, var10, var17, (byte) -112, var19, arg0 + 4);
                    var44 = var9.method404(4, var18, var10, var17, (byte) -120, var19, var42 + 4);
                } else {
                    var43 = new class131(arg2, 4, arg0 + 4, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                    var44 = new class131(arg2, 4, var42 - -4, arg8, arg6, arg1, var9.field1494, true, (class4) null);
                }
                arg4.method801(arg8, arg6, arg1, var17, var43, var44, 256, arg0, class207.field4042[arg0] * var40, class171.field3394[arg0] * var40, var21, var20);
            }
        } else {
            class4 var45;
            if (var9.field1494 == -1 && var9.field1482 == null) {
                var45 = var9.method404(10, var18, var10, var17, (byte) -115, var19, arg0);
            } else {
                var45 = new class131(arg2, 10, arg0, arg8, arg6, arg1, var9.field1494, true, (class4) null);
            }
            if (var45 != null && arg4.method850(arg8, arg6, arg1, var17, var12, var11, var45, arg7 == 11 ? 256 : 0, var21, var20) && var9.field1464) {
                int var46 = 15;
                if (var45 instanceof class52) {
                    var46 = ((class52) var45).method275() / 4;
                    if (~var46 < -31) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; ~var12 <= ~var47; ++var47) {
                    for (int var48 = 0; var48 <= var11; ++var48) {
                        if (class197.field3841[arg8][arg6 - -var47][arg1 + var48] < var46) {
                            class197.field3841[arg8][arg6 + var47][arg1 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field1480 != 0 && arg3 != null) {
                arg3.method945(arg6, var12, arg1, var9.field1441, var11, 3);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLrd;)V")
    public final void method189(byte arg0, class158 arg1) {
        arg1.field3153 = 0;
        if (arg0 != -123) {
            this.method189((byte) -119, (class158) null);
        }
        int var3 = arg1.method1054(128);
        ++field553;
        if (~(var3 & 2) == -3) {
            this.field538 = (short) (arg1.method1054(arg0 + 251) << 2);
            this.field545 = (short) (arg1.method1054(128) << 2);
        } else {
            this.field545 = 0;
            this.field538 = 0;
        }
        int var4 = -1;
        int var5 = 1 & var3;
        super.field2046 = (var3 >> 3) + 1;
        boolean var6 = ~(4 & var3) != -1;
        int[] var7 = new int[12];
        this.field534 = arg1.method1066(true);
        this.field554 = arg1.method1066(true);
        this.field537 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg1.method1054(128);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg1.method1054(128);
                var7[var8] = (var9 << 8) - -var10;
                if (var8 == 0 && var7[0] == 65535) {
                    var4 = arg1.method1071(28101);
                    break;
                }
                if (~var7[var8] <= -513) {
                    int var14 = class166.method1126(95, var7[var8] + -512).field3296;
                    if (~var14 != -1) {
                        this.field537 = var14;
                    }
                }
            }
        }
        int[] var11 = new int[5];
        for (int var12 = 0; ~var12 > -6; ++var12) {
            int var13 = arg1.method1054(128);
            if (~var13 > -1 || ~class24.field367[var12].length >= ~var13) {
                var13 = 0;
            }
            var11[var12] = var13;
        }
        super.field2015 = arg1.method1071(28101);
        if (~super.field2015 == -65536) {
            super.field2015 = -1;
        }
        super.field2031 = arg1.method1071(28101);
        if (super.field2031 == 65535) {
            super.field2031 = -1;
        }
        super.field2048 = super.field2031;
        super.field2047 = arg1.method1071(arg0 + 28224);
        if (~super.field2047 == -65536) {
            super.field2047 = -1;
        }
        super.field2076 = arg1.method1071(28101);
        if (super.field2076 == 65535) {
            super.field2076 = -1;
        }
        super.field2029 = arg1.method1071(arg0 ^ -28096);
        if (super.field2029 == 65535) {
            super.field2029 = -1;
        }
        super.field2044 = arg1.method1071(arg0 ^ -28096);
        if (~super.field2044 == -65536) {
            super.field2044 = -1;
        }
        super.field2020 = arg1.method1071(28101);
        if (~super.field2020 == -65536) {
            super.field2020 = -1;
        }
        this.field550 = class133.method797(37, arg1.method1048(true)).method505((byte) -128);
        this.field533 = arg1.method1054(arg0 + 251);
        if (var6) {
            this.field564 = arg1.method1071(28101);
        }
        if (this.field560 == null) {
            this.field560 = new class141();
        }
        this.field560.method886(var11, var4, true, var7, ~var5 == -2);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)Z")
    public final boolean method190(byte arg0) {
        ++field557;
        if (arg0 > -64) {
            this.field548 = 28;
        }
        return this.field560 != null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field539;
        if (this.field560 != null) {
            class37 var10 = super.field2077 != -1 && super.field2062 == 0 ? class39.method213(-10639, super.field2077) : null;
            class37 var11 = ~super.field2054 == 0 || this.field562 || super.field2054 == super.field2015 && var10 != null ? null : class39.method213(-10639, super.field2054);
            class52 var12 = this.field560.method881(super.field2012, -257, super.field2018, var11, var10);
            if (var12 != null) {
                var12.method269();
                super.field73 = var12.field73;
                if (~this.field538 != -1 && ~this.field545 != -1) {
                    int var13 = class150.field2888[arg0];
                    int var14 = class150.field2896[arg0];
                    short var15 = this.field545;
                    int var16 = -var15 / 2;
                    short var17 = this.field538;
                    int var18 = -var17 / 2;
                    int var19 = var13 * var18 + var14 * var16 >> 16;
                    int var20 = var13 * var16 - var14 * var18 >> 16;
                    int var21 = class189.method1226(super.field2045 + var20, -1, super.field2032 + var19, class114.field2145);
                    int var22 = var17 / 2;
                    int var23 = -var15 / 2;
                    int var24 = -var17 / 2;
                    int var25 = var15 / 2;
                    int var26 = var13 * var24 + var14 * var25 >> 16;
                    int var27 = var13 * var23 + -(var14 * var22) >> 16;
                    int var28 = var13 * var22 + var14 * var23 >> 16;
                    int var29 = class189.method1226(super.field2045 + var27, -1, super.field2032 - -var28, class114.field2145);
                    int var30 = var13 * var25 + -(var14 * var24) >> 16;
                    int var31 = class189.method1226(super.field2045 + var30, -1, super.field2032 + var26, class114.field2145);
                    int var32 = var17 / 2;
                    int var33 = var15 / 2;
                    int var34 = ~var21 <= ~var29 ? var29 : var21;
                    int var35 = var13 * var32 + var14 * var33 >> 16;
                    int var36 = var13 * var33 + -(var14 * var32) >> 16;
                    int var37 = class189.method1226(super.field2045 - -var36, -1, super.field2032 - -var35, class114.field2145);
                    int var38 = ~var37 < ~var29 ? var29 : var37;
                    int var39 = var31 < var37 ? var31 : var37;
                    int var40 = var31 > var21 ? var21 : var31;
                    int var41 = (int) (320.0D * Math.atan2((double) (var34 - var39), (double) var15)) & 2047;
                    var12.method276(var41);
                    int var42 = (int) (320.0D * Math.atan2((double) (var40 - var38), (double) var17)) & 2047;
                    var12.method284(var42);
                    int var43 = (var34 + var38 + var39 + var40) / 4;
                    var12.method285(0, -super.field2028 + var43, 0);
                }
                class52 var44 = null;
                if (!this.field562 && super.field2040 != -1 && ~super.field2019 != 0) {
                    var44 = class176.method1163(super.field2040, -123).method298(false, super.field2019);
                    if (var44 != null) {
                        var44.method285(0, -super.field2052, 0);
                    }
                }
                class52 var45 = null;
                if (!this.field562 && this.field540 != null) {
                    if (~class21.field338 <= ~this.field556) {
                        this.field540 = null;
                    }
                    if (class21.field338 >= this.field555 && ~class21.field338 > ~this.field556) {
                        var45 = this.field540;
                        var45.method285(-super.field2032 + this.field546, this.field543 - super.field2028, -super.field2045 + this.field535);
                        if (super.field2071 != 512) {
                            if (~super.field2071 == -1025) {
                                var45.method270();
                                var45.method270();
                            } else if (super.field2071 == 1536) {
                                var45.method270();
                            }
                        } else {
                            var45.method270();
                            var45.method270();
                            var45.method270();
                        }
                    }
                }
                if (var44 != null) {
                    var12 = ((class125) var12).method712(var44);
                }
                if (var45 != null) {
                    var12 = ((class125) var12).method712(var45);
                }
                var12.field867 = true;
                var12.method23(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var45 != null) {
                    if (~super.field2071 != -513) {
                        if (super.field2071 != 1024) {
                            if (~super.field2071 == -1537) {
                                var45.method270();
                                var45.method270();
                                var45.method270();
                            }
                        } else {
                            var45.method270();
                            var45.method270();
                        }
                    } else {
                        var45.method270();
                    }
                    var45.method285(-this.field546 + super.field2032, super.field2028 - this.field543, -this.field535 + super.field2045);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Loh;")
    public static final class135 method191(int arg0, int arg1) {
        class135 var2 = (class135) class28.field461.method680((long) arg0, (byte) 105);
        int var3 = 93 % ((arg1 - -58) / 35);
        ++field559;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class197.field3842.method461(14, (byte) 81, arg0);
            class135 var5 = new class135();
            if (var4 != null) {
                var5.method856(-1, new class158(var4));
            }
            class28.field461.method678(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static void method192(int arg0) {
        field536 = null;
        field542 = null;
        if (arg0 != 256) {
            method191(-38, -23);
        }
        field558 = null;
        field561 = null;
        field551 = null;
        field544 = null;
        field563 = null;
    }
}

import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class268 extends class58 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Z")
    public static boolean field4631 = true;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lha;")
    public static class46 field4632 = class271.method1828("welle2:", -46);

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lha;")
    public static class46 field4638 = class271.method1828("::tele ", -46);

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lha;")
    public static class46 field4634;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lve;")
    public static class96 field4633;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Object;BLrc;)V")
    public static final void method1792(Object arg0, byte arg1, class9 arg2) {
        field4641++;
        if (arg2.field146 == null) {
            return;
        }
        if (arg1 >= -23) {
            field4638 = null;
        }
        for (int var3 = 0; var3 < 50 && arg2.field146.peekEvent() != null; var3++) {
            class187.method1360((byte) 53, 1L);
        }
        if (arg0 != null) {
            arg2.field146.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)[Lhh;")
    public static final class263[] method1793(int arg0) {
        field4637++;
        class263[] var1 = new class263[class246.field4365];
        if (arg0 <= 74) {
            method1796(87, 68);
        }
        for (int var2 = 0; var2 < class246.field4365; var2++) {
            int var3 = class219.field3858[var2] * class118.field2209[var2];
            byte[] var4 = class273.field4765[var2];
            if (class238.field4231[var2]) {
                byte[] var7 = class87.field1650[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class235.method1595(class107.field1980[class50.method369(255, var4[var9])], class50.method369(-16777216, var7[var9] << 24));
                }
                var1[var2] = new class72(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class107.field1980[class50.method369(var4[var6], 255)];
                }
                var1[var2] = new class21(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], var5);
            }
        }
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhi;IBI)V")
    public static final void method1794(class24 arg0, int arg1, byte arg2, int arg3) {
        int var4 = -3 % ((arg2 + 54) / 37);
        if (arg0.field492 == 0) {
            arg0.field421 = arg0.field430;
        } else if (arg0.field492 == 1) {
            arg0.field421 = (arg3 - arg0.field468) / 2 + arg0.field430;
        } else if (arg0.field492 == 2) {
            arg0.field421 = arg3 - arg0.field468 - arg0.field430;
        } else if (arg0.field492 == 3) {
            arg0.field421 = arg0.field430 * arg3 >> 14;
        } else if (arg0.field492 == 4) {
            arg0.field421 = (arg0.field430 * arg3 >> 14) + (arg3 - arg0.field468) / 2;
        } else {
            arg0.field421 = arg3 - (arg0.field430 * arg3 >> 14) - arg0.field468;
        }
        if (arg0.field391 == 0) {
            arg0.field501 = arg0.field502;
        } else if (arg0.field391 == 1) {
            arg0.field501 = (arg1 - arg0.field341) / 2 + arg0.field502;
        } else if (arg0.field391 == 2) {
            arg0.field501 = arg1 - arg0.field502 - arg0.field341;
        } else if (arg0.field391 == 3) {
            arg0.field501 = arg0.field502 * arg1 >> 14;
        } else if (arg0.field391 == 4) {
            arg0.field501 = (arg0.field502 * arg1 >> 14) + (arg1 - arg0.field341) / 2;
        } else {
            arg0.field501 = arg1 - (arg0.field502 * arg1 >> 14) - arg0.field341;
        }
        if (class40.field701 && (client.method1811(arg0) != 0 || arg0.field485 == 0)) {
            if (arg0.field501 < 0) {
                arg0.field501 = 0;
            } else if (arg0.field501 + arg0.field341 > arg1) {
                arg0.field501 = arg1 - arg0.field341;
            }
            if (arg0.field421 < 0) {
                arg0.field421 = 0;
            } else if (arg3 < (arg0.field468 + arg0.field421)) {
                arg0.field421 = arg3 - arg0.field468;
            }
        }
        field4636++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method1795(int arg0) {
        field4633 = null;
        field4634 = null;
        field4632 = null;
        field4638 = null;
        if (arg0 != 5544) {
            method1794((class24) null, -128, (byte) -46, 87);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method1796(int arg0, int arg1) {
        field4639++;
        class146 var2 = class6.method22((byte) 16, arg0, arg1);
        var2.method1082((byte) -97);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4630++;
        class161.field2848 = 0;
        for (int var7 = -1; var7 < (class156.field2783 + class51.field888); var7++) {
            class141 var24;
            if (var7 == -1) {
                var24 = class277.field4824;
            } else if (var7 >= class156.field2783) {
                var24 = class2.field29[class33.field612[var7 - class156.field2783]];
            } else {
                var24 = class1.field6[class129.field2373[var7]];
            }
            if (var24 != null && var24.method190(0)) {
                if (var24 instanceof class26) {
                    class78 var25 = ((class26) var24).field511;
                    if (var25.field1448 != null) {
                        var25 = var25.method620(-17713);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (var7 >= class156.field2783) {
                    class78 var31 = ((class26) var24).field511;
                    if (var31.field1448 != null) {
                        var31 = var31.method620(-17713);
                    }
                    if (var31.field1446 >= 0 && var31.field1446 < class218.field3848.length) {
                        int var32;
                        if (var31.field1496 == -1) {
                            var32 = var24.method1064((byte) -65) + 15;
                        } else {
                            var32 = var31.field1496 + 15;
                        }
                        class238.method1637(var32, arg1 >> 1, arg6, arg2 >> 1, 73, var24, arg5);
                        if (class259.field4520 > -1) {
                            class218.field3848[var31.field1446].method119(class259.field4520 + arg4 - 12, arg0 + -30 + class271.field4728);
                        }
                    }
                    class222[] var33 = class84.field1611;
                    for (int var34 = 0; var34 < var33.length; var34++) {
                        class222 var49 = var33[var34];
                        if (var49 != null && var49.field3899 == 1 && class33.field612[var7 - class156.field2783] == var49.field3904 && class157.field2803 % 20 < 10) {
                            int var50;
                            if (var31.field1496 == -1) {
                                var50 = var24.method1064((byte) -127) + 15;
                            } else {
                                var50 = var31.field1496 + 15;
                            }
                            class238.method1637(var50, arg1 >> 1, arg6, arg2 >> 1, 84, var24, arg5);
                            if (class259.field4520 > -1) {
                                class168.field2956[var49.field3897].method119(class259.field4520 + arg4 - 12, arg0 - -class271.field4728 + -28);
                            }
                        }
                    }
                } else {
                    int var26 = 30;
                    class81 var27 = (class81) var24;
                    if (var27.field1531 != -1 || var27.field1556 != -1) {
                        class238.method1637(var24.method1064((byte) -128) + 15, arg1 >> 1, arg6, arg2 >> 1, 118, var24, arg5);
                        if (class259.field4520 > -1) {
                            if (var27.field1531 != -1) {
                                class6.field91[var27.field1531].method119(arg4 + class259.field4520 - 12, -var26 + arg0 + class271.field4728);
                                var26 += 25;
                            }
                            if (var27.field1556 != -1) {
                                class218.field3848[var27.field1556].method119(arg4 + class259.field4520 - 12, -var26 + arg0 - -class271.field4728);
                                var26 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class222[] var28 = class84.field1611;
                        for (int var29 = 0; var29 < var28.length; var29++) {
                            class222 var30 = var28[var29];
                            if (var30 != null && var30.field3899 == 10 && class129.field2373[var7] == var30.field3904) {
                                class238.method1637(var24.method1064((byte) -113) + 15, arg1 >> 1, arg6, arg2 >> 1, 28, var24, arg5);
                                if (class259.field4520 > -1) {
                                    class168.field2956[var30.field3897].method119(class259.field4520 + arg4 - 12, arg0 - var26 + class271.field4728);
                                }
                            }
                        }
                    }
                }
                if (var24.field2567 != null && (class156.field2783 <= var7 || class168.field2953 == 0 || class168.field2953 == 3 || class168.field2953 == 1 && class158.method1162(((class81) var24).field1528, 1))) {
                    class238.method1637(var24.method1064((byte) -97), arg1 >> 1, arg6, arg2 >> 1, 87, var24, arg5);
                    if (class259.field4520 > -1 && class161.field2848 < class1.field8) {
                        class1.field5[class161.field2848] = class190.field3384.method153(var24.field2567) / 2;
                        class1.field15[class161.field2848] = class190.field3384.field280;
                        class1.field2[class161.field2848] = class259.field4520;
                        class1.field10[class161.field2848] = class271.field4728;
                        class1.field3[class161.field2848] = var24.field2566;
                        class1.field7[class161.field2848] = var24.field2573;
                        class1.field9[class161.field2848] = var24.field2564;
                        class1.field4[class161.field2848] = var24.field2567;
                        class161.field2848++;
                    }
                }
                if (var24.field2515 > class157.field2803) {
                    class263 var35 = class152.field2700[0];
                    class263 var36 = class152.field2700[1];
                    int var40;
                    if (var24 instanceof class26) {
                        class26 var37 = (class26) var24;
                        class263[] var38 = (class263[]) class220.field3871.method86(7961, (long) var37.field511.field1451);
                        if (var38 == null) {
                            var38 = class103.method780(var37.field511.field1451, true, class261.field4549, 0);
                            if (var38 != null) {
                                class220.field3871.method80(var38, (long) var37.field511.field1451, (byte) 67);
                            }
                        }
                        class78 var39 = var37.field511;
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[0];
                            var36 = var38[1];
                        }
                        if (var39.field1496 == -1) {
                            var40 = var24.method1064((byte) -46);
                        } else {
                            var40 = var39.field1496;
                        }
                    } else {
                        var40 = var24.method1064((byte) -100);
                    }
                    class238.method1637(var40 + var35.field4581 + 10, arg1 >> 1, arg6, arg2 >> 1, 82, var24, arg5);
                    if (class259.field4520 > -1) {
                        int var41 = class259.field4520 + arg4 - (var35.field4578 >> 1);
                        int var42 = class271.field4728 + arg0 - 3;
                        var35.method119(var41, var42);
                        int var43 = var35.field4581;
                        int var44 = var24.field2580 * var35.field4578 / 255;
                        class262.method1768(var41, var42, var41 + var44, var42 + var43);
                        var36.method119(var41, var42);
                        class262.method1753(arg4, arg0, arg2 + arg4, arg0 + arg1);
                    }
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    if (class157.field2803 < var24.field2538[var45]) {
                        int var48;
                        if (var24 instanceof class26) {
                            class26 var46 = (class26) var24;
                            class78 var47 = var46.field511;
                            if (var47.field1496 == -1) {
                                var48 = var24.method1064((byte) -71) / 2;
                            } else {
                                var48 = var47.field1496 / 2;
                            }
                        } else {
                            var48 = var24.method1064((byte) -85) / 2;
                        }
                        class238.method1637(var48, arg1 >> 1, arg6, arg2 >> 1, 48, var24, arg5);
                        if (class259.field4520 > -1) {
                            if (var45 == 1) {
                                class271.field4728 -= 20;
                            }
                            if (var45 == 2) {
                                class259.field4520 -= 15;
                                class271.field4728 -= 10;
                            }
                            if (var45 == 3) {
                                class259.field4520 += 15;
                                class271.field4728 -= 10;
                            }
                            class212.field3786[var24.field2569[var45]].method119(class259.field4520 + arg4 - 12, class271.field4728 - 12 + arg0);
                            class37.field663.method147(class115.method932(false, var24.field2562[var45]), class259.field4520 + arg4 - 1, class271.field4728 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 32 % ((arg3 - 22) / 47);
        for (int var9 = 0; var9 < class161.field2848; var9++) {
            int var10 = class1.field2[var9];
            int var11 = class1.field10[var9];
            int var12 = class1.field5[var9];
            int var13 = class1.field15[var9];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var23 = 0; var23 < var9; var23++) {
                    if ((class1.field10[var23] - class1.field15[var23]) < (var11 + 2) && var11 - var13 < class1.field10[var23] - -2 && (class1.field5[var23] + class1.field2[var23]) > (var10 - var12) && var10 + var12 > class1.field2[var23] + -class1.field5[var23] && (class1.field10[var23] - class1.field15[var23]) < var11) {
                        var11 = class1.field10[var23] - class1.field15[var23];
                        var14 = true;
                    }
                }
            }
            class259.field4520 = class1.field2[var9];
            class271.field4728 = class1.field10[var9] = var11;
            class46 var15 = class1.field4[var9];
            if (class169.field2996 == 0) {
                int var16 = 16776960;
                if (class1.field3[var9] < 6) {
                    var16 = class210.field3762[class1.field3[var9]];
                }
                if (class1.field3[var9] == 6) {
                    var16 = class252.field4443 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class1.field3[var9] == 7) {
                    var16 = class252.field4443 % 20 >= 10 ? 65535 : 255;
                }
                if (class1.field3[var9] == 8) {
                    var16 = class252.field4443 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class1.field3[var9] == 9) {
                    int var17 = 150 - class1.field9[var9];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = var17 * 5 + 64780;
                    }
                }
                if (class1.field3[var9] == 10) {
                    int var18 = 150 - class1.field9[var9];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var16 = ((var18 - 100) * 327680) + 255 - (var18 + -100) * 5;
                    }
                }
                if (class1.field3[var9] == 11) {
                    int var19 = 150 - class1.field9[var9];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (class1.field7[var9] == 0) {
                    class190.field3384.method147(var15, class259.field4520 + arg4, class271.field4728 + arg0, var16, 0);
                }
                if (class1.field7[var9] == 1) {
                    class190.field3384.method151(var15, class259.field4520 + arg4, class271.field4728 + arg0, var16, 0, class252.field4443);
                }
                if (class1.field7[var9] == 2) {
                    class190.field3384.method141(var15, arg4 + class259.field4520, class271.field4728 + arg0, var16, 0, class252.field4443);
                }
                if (class1.field7[var9] == 3) {
                    class190.field3384.method136(var15, class259.field4520 + arg4, class271.field4728 + arg0, var16, 0, class252.field4443, 150 - class1.field9[var9]);
                }
                if (class1.field7[var9] == 4) {
                    int var20 = (150 - class1.field9[var9]) * (class190.field3384.method153(var15) + 100) / 150;
                    class262.method1768(arg4 + class259.field4520 - 50, arg0, class259.field4520 + arg4 + 50, arg0 + arg1);
                    class190.field3384.method148(var15, class259.field4520 + arg4 + 50 - var20, class271.field4728 + arg0, var16, 0);
                    class262.method1753(arg4, arg0, arg2 + arg4, arg0 + arg1);
                }
                if (class1.field7[var9] == 5) {
                    int var21 = 150 - class1.field9[var9];
                    class262.method1768(arg4, arg0 - (1 - class271.field4728) - class190.field3384.field280, arg2 + arg4, class271.field4728 + arg0 + 5);
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class190.field3384.method147(var15, arg4 + class259.field4520, arg0 - -class271.field4728 + var22, var16, 0);
                    class262.method1753(arg4, arg0, arg2 + arg4, arg0 + arg1);
                }
            } else {
                class190.field3384.method147(var15, class259.field4520 + arg4, class271.field4728 + arg0, 16776960, 0);
            }
        }
    }
}

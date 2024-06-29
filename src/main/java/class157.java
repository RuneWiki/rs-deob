import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class157 extends class124 {

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "[I")
    private static int[] field2673 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "Le;")
    public static class191 field2678 = class54.method368("M", 2047);

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
    public static int[] field2674 = new int[2];

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lwe;")
    public static class147 field2679 = new class147(500);

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lnd;Z)V")
    public static final void method1070(class199 arg0, boolean arg1) {
        class239.field4240.method1176(arg0, (byte) 38);
        while (true) {
            class199 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class199[][] var7;
            class199 var66;
            do {
                class199 var65;
                do {
                    class199 var64;
                    do {
                        class199 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class199) class239.field4240.method1171(-256);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3540);
                                            var3 = var2.field3534;
                                            var4 = var2.field3558;
                                            var5 = var2.field3543;
                                            var6 = var2.field3551;
                                            var7 = class201.field3608[var5];
                                            if (!var2.field3547) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class199 var8 = class201.field3608[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3540) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class161.field2720 && var3 > class221.field3910) {
                                                    class199 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3540 && (var9.field3547 || (var2.field3542 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class161.field2720 && var3 < class262.field4641 - 1) {
                                                    class199 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3540 && (var10.field3547 || (var2.field3542 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class31.field440 && var4 > class141.field2346) {
                                                    class199 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3540 && (var11.field3547 || (var2.field3542 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class31.field440 && var4 < class101.field1621 - 1) {
                                                    class199 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3540 && (var12.field3547 || (var2.field3542 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3547 = false;
                                            if (var2.field3565 != null) {
                                                class199 var13 = var2.field3565;
                                                if (var13.field3560 != null) {
                                                    if (!class161.method1092(0, var3, var4)) {
                                                        class261.method1794(var13.field3560, 0, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, false);
                                                    } else {
                                                        class261.method1794(var13.field3560, 0, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, true);
                                                    }
                                                } else if (var13.field3552 != null) {
                                                    if (!class161.method1092(0, var3, var4)) {
                                                        class241.method1688(var13.field3552, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, false);
                                                    } else {
                                                        class241.method1688(var13.field3552, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, true);
                                                    }
                                                }
                                                class254 var14 = var13.field3535;
                                                if (var14 != null) {
                                                    var14.field4499.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var14.field4492 - class267.field4716, var14.field4501 - class22.field319, var14.field4504 - class73.field1268, var14.field4498);
                                                }
                                                for (int var15 = 0; var15 < var13.field3550; ++var15) {
                                                    class12 var16 = var13.field3549[var15];
                                                    if (var16 != null) {
                                                        var16.field155.method127(var16.field153, class45.field803, class62.field1118, class17.field230, class270.field4766, var16.field154 - class267.field4716, var16.field147 - class22.field319, var16.field151 - class73.field1268, var16.field136);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3560 != null) {
                                                if (!class161.method1092(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3560.field3799 != 12345678 || class53.field968 && var5 <= class67.field1171) {
                                                        class261.method1794(var2.field3560, var6, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, false);
                                                    }
                                                } else {
                                                    class261.method1794(var2.field3560, var6, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, true);
                                                }
                                            } else if (var2.field3552 != null) {
                                                if (!class161.method1092(var6, var3, var4)) {
                                                    var17 = true;
                                                    class241.method1688(var2.field3552, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, false);
                                                } else {
                                                    class241.method1688(var2.field3552, class45.field803, class62.field1118, class17.field230, class270.field4766, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class257 var18 = var2.field3556;
                                                if (var18 != null && (var18.field4566 & 2147483648L) != 0L) {
                                                    var18.field4562.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var18.field4560 - class267.field4716, var18.field4567 - class22.field319, var18.field4564 - class73.field1268, var18.field4566);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class254 var21 = var2.field3535;
                                            class9 var22 = var2.field3541;
                                            if (var21 != null || var22 != null) {
                                                if (class161.field2720 == var3) {
                                                    ++var19;
                                                } else if (class161.field2720 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class31.field440 == var4) {
                                                    var19 += 3;
                                                } else if (class31.field440 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class115.field1895[var19];
                                                var2.field3555 = class147.field2479[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4502 & field2673[var19]) != 0) {
                                                    if (var21.field4502 == 16) {
                                                        var2.field3537 = 3;
                                                        var2.field3559 = class230.field4134[var19];
                                                        var2.field3544 = 3 - var2.field3559;
                                                    } else if (var21.field4502 == 32) {
                                                        var2.field3537 = 6;
                                                        var2.field3559 = class50.field906[var19];
                                                        var2.field3544 = 6 - var2.field3559;
                                                    } else if (var21.field4502 == 64) {
                                                        var2.field3537 = 12;
                                                        var2.field3559 = class100.field1594[var19];
                                                        var2.field3544 = 12 - var2.field3559;
                                                    } else {
                                                        var2.field3537 = 9;
                                                        var2.field3559 = class258.field4581[var19];
                                                        var2.field3544 = 9 - var2.field3559;
                                                    }
                                                } else {
                                                    var2.field3537 = 0;
                                                }
                                                if ((var21.field4502 & var20) != 0 && !class223.method1551(var6, var3, var4, var21.field4502)) {
                                                    var21.field4499.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var21.field4492 - class267.field4716, var21.field4501 - class22.field319, var21.field4504 - class73.field1268, var21.field4498);
                                                }
                                                if ((var21.field4495 & var20) != 0 && !class223.method1551(var6, var3, var4, var21.field4495)) {
                                                    var21.field4493.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var21.field4492 - class267.field4716, var21.field4501 - class22.field319, var21.field4504 - class73.field1268, var21.field4498);
                                                }
                                            }
                                            if (var22 != null && !class127.method861(var6, var3, var4, var22.field94.method126())) {
                                                if ((var22.field92 & var20) != 0) {
                                                    var22.field94.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var22.field103 - class267.field4716 + var22.field97, var22.field91 - class22.field319, var22.field100 - class73.field1268 + var22.field104, var22.field86);
                                                } else if (var22.field92 == 256) {
                                                    int var23 = var22.field103 - class267.field4716;
                                                    int var24 = var22.field91 - class22.field319;
                                                    int var25 = var22.field100 - class73.field1268;
                                                    int var26 = var22.field96;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field94.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var22.field97 + var23, var24, var22.field104 + var25, var22.field86);
                                                    } else if (var22.field88 != null) {
                                                        var22.field88.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var23, var24, var25, var22.field86);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class257 var29 = var2.field3556;
                                                if (var29 != null && (var29.field4566 & 2147483648L) == 0L) {
                                                    var29.field4562.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var29.field4560 - class267.field4716, var29.field4567 - class22.field319, var29.field4564 - class73.field1268, var29.field4566);
                                                }
                                                class269 var30 = var2.field3553;
                                                if (var30 != null && var30.field4739 == 0) {
                                                    if (var30.field4738 != null) {
                                                        var30.field4738.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var30.field4740 - class267.field4716, var30.field4744 - class22.field319, var30.field4746 - class73.field1268, var30.field4745);
                                                    }
                                                    if (var30.field4741 != null) {
                                                        var30.field4741.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var30.field4740 - class267.field4716, var30.field4744 - class22.field319, var30.field4746 - class73.field1268, var30.field4745);
                                                    }
                                                    if (var30.field4749 != null) {
                                                        var30.field4749.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var30.field4740 - class267.field4716, var30.field4744 - class22.field319, var30.field4746 - class73.field1268, var30.field4745);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3542;
                                            if (var31 != 0) {
                                                if (var3 < class161.field2720 && (var31 & 4) != 0) {
                                                    class199 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3540) {
                                                        class239.field4240.method1176(var32, (byte) 38);
                                                    }
                                                }
                                                if (var4 < class31.field440 && (var31 & 2) != 0) {
                                                    class199 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3540) {
                                                        class239.field4240.method1176(var33, (byte) 38);
                                                    }
                                                }
                                                if (var3 > class161.field2720 && (var31 & 1) != 0) {
                                                    class199 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3540) {
                                                        class239.field4240.method1176(var34, (byte) 38);
                                                    }
                                                }
                                                if (var4 > class31.field440 && (var31 & 8) != 0) {
                                                    class199 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3540) {
                                                        class239.field4240.method1176(var35, (byte) 38);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3537 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3550; ++var37) {
                                                if (class10.field111 != var2.field3549[var37].field148 && (var2.field3536[var37] & var2.field3537) == var2.field3559) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class254 var38 = var2.field3535;
                                                if (!class223.method1551(var6, var3, var4, var38.field4502)) {
                                                    var38.field4499.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var38.field4492 - class267.field4716, var38.field4501 - class22.field319, var38.field4504 - class73.field1268, var38.field4498);
                                                }
                                                var2.field3537 = 0;
                                            }
                                        }
                                        if (!var2.field3563) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3550;
                                            var2.field3563 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class12 var42 = var2.field3549[var41];
                                                if (class10.field111 != var42.field148) {
                                                    for (int var43 = var42.field152; var43 <= var42.field146; ++var43) {
                                                        for (int var44 = var42.field144; var44 <= var42.field150; ++var44) {
                                                            class199 var45 = var7[var43][var44];
                                                            if (var45.field3547) {
                                                                var2.field3563 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3537 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field152) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field146) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field144) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field150) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3537) == var2.field3544) {
                                                                    var2.field3563 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class232.field4147[var40++] = var42;
                                                    int var47 = class161.field2720 - var42.field152;
                                                    int var48 = var42.field146 - class161.field2720;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class31.field440 - var42.field144;
                                                    int var50 = var42.field150 - class31.field440;
                                                    if (var50 > var49) {
                                                        var42.field138 = var47 + var50;
                                                    } else {
                                                        var42.field138 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class12 var54 = class232.field4147[var53];
                                                    if (class10.field111 != var54.field148) {
                                                        if (var54.field138 > var51) {
                                                            var51 = var54.field138;
                                                            var52 = var53;
                                                        } else if (var54.field138 == var51) {
                                                            int var55 = var54.field154 - class267.field4716;
                                                            int var56 = var54.field151 - class73.field1268;
                                                            int var57 = class232.field4147[var52].field154 - class267.field4716;
                                                            int var58 = class232.field4147[var52].field151 - class73.field1268;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class12 var59 = class232.field4147[var52];
                                                var59.field148 = class10.field111;
                                                if (!class221.method1536(var6, var59.field152, var59.field146, var59.field144, var59.field150, var59.field155.method126())) {
                                                    var59.field155.method127(var59.field153, class45.field803, class62.field1118, class17.field230, class270.field4766, var59.field154 - class267.field4716, var59.field147 - class22.field319, var59.field151 - class73.field1268, var59.field136);
                                                }
                                                for (int var60 = var59.field152; var60 <= var59.field146; ++var60) {
                                                    for (int var61 = var59.field144; var61 <= var59.field150; ++var61) {
                                                        class199 var62 = var7[var60][var61];
                                                        if (var62.field3537 != 0) {
                                                            class239.field4240.method1176(var62, (byte) 38);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3540) {
                                                            class239.field4240.method1176(var62, (byte) 38);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3563) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3563 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3540);
                            } while (var2.field3537 != 0);
                            if (var3 > class161.field2720 || var3 <= class221.field3910) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3540);
                        if (var3 < class161.field2720 || var3 >= class262.field4641 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3540);
                    if (var4 > class31.field440 || var4 <= class141.field2346) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3540);
                if (var4 < class31.field440 || var4 >= class101.field1621 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3540);
            var2.field3540 = false;
            --class21.field288;
            class269 var67 = var2.field3553;
            if (var67 != null && var67.field4739 != 0) {
                if (var67.field4738 != null) {
                    var67.field4738.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var67.field4740 - class267.field4716, var67.field4744 - class22.field319 - var67.field4739, var67.field4746 - class73.field1268, var67.field4745);
                }
                if (var67.field4741 != null) {
                    var67.field4741.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var67.field4740 - class267.field4716, var67.field4744 - class22.field319 - var67.field4739, var67.field4746 - class73.field1268, var67.field4745);
                }
                if (var67.field4749 != null) {
                    var67.field4749.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var67.field4740 - class267.field4716, var67.field4744 - class22.field319 - var67.field4739, var67.field4746 - class73.field1268, var67.field4745);
                }
            }
            if (var2.field3555 != 0) {
                class9 var68 = var2.field3541;
                if (var68 != null && !class127.method861(var6, var3, var4, var68.field94.method126())) {
                    if ((var68.field92 & var2.field3555) != 0) {
                        var68.field94.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var68.field103 - class267.field4716 + var68.field97, var68.field91 - class22.field319, var68.field100 - class73.field1268 + var68.field104, var68.field86);
                    } else if (var68.field92 == 256) {
                        int var69 = var68.field103 - class267.field4716;
                        int var70 = var68.field91 - class22.field319;
                        int var71 = var68.field100 - class73.field1268;
                        int var72 = var68.field96;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field94.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var68.field97 + var69, var70, var68.field104 + var71, var68.field86);
                        } else if (var68.field88 != null) {
                            var68.field88.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var69, var70, var71, var68.field86);
                        }
                    }
                }
                class254 var75 = var2.field3535;
                if (var75 != null) {
                    if ((var75.field4495 & var2.field3555) != 0 && !class223.method1551(var6, var3, var4, var75.field4495)) {
                        var75.field4493.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var75.field4492 - class267.field4716, var75.field4501 - class22.field319, var75.field4504 - class73.field1268, var75.field4498);
                    }
                    if ((var75.field4502 & var2.field3555) != 0 && !class223.method1551(var6, var3, var4, var75.field4502)) {
                        var75.field4499.method127(0, class45.field803, class62.field1118, class17.field230, class270.field4766, var75.field4492 - class267.field4716, var75.field4501 - class22.field319, var75.field4504 - class73.field1268, var75.field4498);
                    }
                }
            }
            if (var5 < class240.field4271 - 1) {
                class199 var76 = class201.field3608[var5 + 1][var3][var4];
                if (var76 != null && var76.field3540) {
                    class239.field4240.method1176(var76, (byte) 38);
                }
            }
            if (var3 < class161.field2720) {
                class199 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3540) {
                    class239.field4240.method1176(var77, (byte) 38);
                }
            }
            if (var4 < class31.field440) {
                class199 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3540) {
                    class239.field4240.method1176(var78, (byte) 38);
                }
            }
            if (var3 > class161.field2720) {
                class199 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3540) {
                    class239.field4240.method1176(var79, (byte) 38);
                }
            }
            if (var4 > class31.field440) {
                class199 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3540) {
                    class239.field4240.method1176(var80, (byte) 38);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2675;
        int var7 = arg0 + arg6;
        int var8 = arg3 + arg6;
        int var9 = -arg6 + arg1;
        for (int var10 = arg0; var10 < var7; ++var10) {
            class242.method1700(7, arg4, arg1, class232.field4151[var10], arg3);
        }
        int var11 = arg5 - arg6;
        for (int var12 = arg5; ~var12 < ~var11; --var12) {
            class242.method1700(7, arg4, arg1, class232.field4151[var12], arg3);
        }
        if (arg2 != 2) {
            method1070((class199) null, false);
        }
        for (int var13 = var7; ~var11 <= ~var13; ++var13) {
            int[] var14 = class232.field4151[var13];
            class242.method1700(7, arg4, var8, var14, arg3);
            class242.method1700(7, arg4, arg1, var14, var9);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lai;IIZ[BIII)V")
    public static final void method1072(class220[] arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        ++field2672;
        byte var8;
        if (!arg3) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        if (!arg3) {
            for (int var9 = 0; ~var9 > -5; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        if (~(arg1 - -var10) < -1 && arg1 - -var10 < 103 && ~(arg2 + var11) < -1 && arg2 + var11 < 103) {
                            arg0[var9].field3873[arg1 + var10][arg2 + var11] = class167.method1128(arg0[var9].field3873[arg1 + var10][arg2 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class225 var12 = new class225(arg4);
        for (int var13 = arg7; ~var8 < ~var13; ++var13) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; ~var15 > -65; ++var15) {
                    class102.method637(var15 - -arg2, arg5, var13, arg3, arg7, arg6, arg1 + var14, var12, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
    public static void method1073(int arg0) {
        field2678 = null;
        if (arg0 != 0) {
            field2674 = null;
        }
        field2674 = null;
        field2673 = null;
        field2679 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            class58.method389(var3, 0, class64.field1132, class236.field4202[arg1]);
        }
        ++field2677;
        if (arg0 < 68) {
            method1071(-1, -54, 88, 121, -110, -64, 24);
        }
        return var3;
    }
}

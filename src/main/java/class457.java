import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class457 extends class175 {

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "Z")
    public static boolean field6855 = false;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "F")
    public static float field6852;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public int field6854;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "Lvc;")
    public class211 field6850;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "[B")
    public byte[] field6853;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "[Lmr;")
    public static class97[] field6857;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I", line = 5)
    public final int method479(int arg0) {
        if (arg0 != 0) {
            this.field6853 = null;
        }
        ++field6856;
        return super.field2342 ? 0 : 100;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)[B", line = 23)
    public final byte[] method480(byte arg0) {
        ++field6848;
        if (arg0 != 118) {
            this.method480((byte) 109);
        }
        if (super.field2342) {
            throw new RuntimeException();
        } else {
            return this.field6853;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIII[Lga;III)V", line = 41)
    public static final void method2773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class282[] arg6, int arg7, int arg8, int arg9) {
        ++field6851;
        class400.field6090.method739(arg1, arg5, arg4, arg0);
        if (arg2 != 1) {
            field6857 = null;
        }
        for (int var10 = 0; ~var10 > ~arg6.length; ++var10) {
            class282 var11 = arg6[var10];
            if (var11 != null && (var11.field4122 == arg9 || arg9 == -1412584499 && class466.field6949 == var11)) {
                int var12;
                if (~arg3 == 0) {
                    class375.field5701[class428.field6506].setBounds(var11.field4032 + arg7, var11.field4010 + arg8, var11.field3991, var11.field4043);
                    var12 = class428.field6506++;
                } else {
                    var12 = arg3;
                }
                var11.field4018 = class393.field6017;
                var11.field4058 = var12;
                if (!client.method1330(var11)) {
                    if (var11.field4014 != 0) {
                        class70.method486(var11, 119);
                    }
                    int var13 = var11.field4032 + arg7;
                    int var14 = var11.field4010 + arg8;
                    int var15 = var11.field4125;
                    if (class215.field3038 && (~client.method1348(var11).field6684 != -1 || ~var11.field4103 == -1) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class466.field6949 == var11) {
                        if (~arg9 != 1412584498 && (class348.field5377 == var11.field3994 || ~class283.field4163 == ~var11.field3994)) {
                            class35.field519 = arg8;
                            class195.field2614 = arg6;
                            class491.field7252 = arg7;
                            continue;
                        }
                        if (class163.field2147 && class291.field4257) {
                            int var16 = class502.field7404.method2323((byte) -110);
                            int var17 = class502.field7404.method2325(36);
                            int var18 = var16 - class290.field4238;
                            int var19 = var17 - class350.field5395;
                            if (var18 < class444.field6674) {
                                var18 = class444.field6674;
                            }
                            if (class444.field6674 + class269.field3744.field3991 < var11.field3991 + var18) {
                                var18 = class444.field6674 + class269.field3744.field3991 + -var11.field3991;
                            }
                            if (var19 < class221.field3078) {
                                var19 = class221.field3078;
                            }
                            if (~(var19 - -var11.field4043) < ~(class221.field3078 + class269.field3744.field4043)) {
                                var19 = -var11.field4043 + class221.field3078 + class269.field3744.field4043;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class283.field4163 == var11.field3994) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4103 == 2) {
                        var20 = arg5;
                        var21 = arg0;
                        var22 = arg4;
                        var23 = arg1;
                    } else {
                        int var24 = var11.field3991 + var13;
                        int var25 = var14 - -var11.field4043;
                        var23 = var13 <= arg1 ? arg1 : var13;
                        if (~var11.field4103 == -10) {
                            ++var24;
                            ++var25;
                        }
                        var20 = ~var14 < ~arg5 ? var14 : arg5;
                        var21 = var25 < arg0 ? var25 : arg0;
                        var22 = ~var24 <= ~arg4 ? arg4 : var24;
                    }
                    if (var22 > var23 && var21 > var20) {
                        if (var11.field4014 != 0) {
                            if (class385.field5850 == var11.field4014 || ~class320.field4639 == ~var11.field4014) {
                                class315.method1979(var11.field4043, var13, var14, (byte) -102, class320.field4639 == var11.field4014, var11.field3991);
                                class430.field6553[var12] = true;
                                class400.field6090.method739(arg1, arg5, arg4, arg0);
                                continue;
                            }
                            if (class385.field5854 == var11.field4014) {
                                if (var11.method1812((byte) 123, class400.field6090) != null) {
                                    class523.method3104((byte) -1);
                                    class400.method2475(0, var11, class400.field6090, var14, var13);
                                    class106.field1497[var12] = true;
                                    class400.field6090.method739(arg1, arg5, arg4, arg0);
                                }
                                continue;
                            }
                            if (class212.field3006 == var11.field4014) {
                                if (var11.method1812((byte) 102, class400.field6090) != null) {
                                    class256.method1649(var14, var11, var13, true);
                                    class106.field1497[var12] = true;
                                    class400.field6090.method739(arg1, arg5, arg4, arg0);
                                }
                                continue;
                            }
                            if (~class226.field3209 == ~var11.field4014) {
                                class229.method1538(class56.field816, var11.field3991, class400.field6090, var14, var11.field4043, var13, arg2 + -97);
                                class430.field6553[var12] = true;
                                class400.field6090.method739(arg1, arg5, arg4, arg0);
                                continue;
                            }
                            if (class480.field7091 == var11.field4014) {
                                class212.method1463((byte) 127, class400.field6090, var13, var14, var11.field4043, var11.field3991);
                                class430.field6553[var12] = true;
                                class400.field6090.method739(arg1, arg5, arg4, arg0);
                                continue;
                            }
                            if (class226.field3220 == var11.field4014) {
                                if (!class32.field469 && !class14.field265) {
                                    continue;
                                }
                                int var26 = var13 - -var11.field3991;
                                int var27 = var14 + 15;
                                if (class32.field469) {
                                    int var28 = -256;
                                    if (class184.field2502 < 20) {
                                        var28 = -65536;
                                    }
                                    class94.field1380.method1713(-1, "Fps:" + class184.field2502, var27, var28, -1, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() + -var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (~var30 < -65537) {
                                        var31 = -65536;
                                    }
                                    class94.field1380.method1713(-1, "Mem:" + var30 + "k", var27, var31, arg2 + -2, var26);
                                    var27 += 15;
                                    class94.field1380.method1713(-1, "In:" + class352.field5445 + "B/s Out:" + class235.field3329 + "B/s", var27, -256, arg2 ^ -2, var26);
                                    var27 += 15;
                                    int var32 = class400.field6090.method837() / 1024;
                                    class94.field1380.method1713(-1, "Offheap:" + var32 + "k", var27, var32 <= 65536 ? -256 : -65536, -1, var26);
                                    var27 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; ~var36 > -31; ++var36) {
                                        var33 += class254.field3525[var36].method3086(-64);
                                        var34 += class254.field3525[var36].method3078(100);
                                        var35 += class254.field3525[var36].method3087(-98);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class116.method717(2, (long) var38, 0, true, -61) + "% (" + var37 + "%)";
                                    class536.field7867.method1713(-1, var39, var27, -256, -1, var26);
                                    var27 += 12;
                                }
                                if (~field6849 < -1) {
                                    class536.field7867.method1713(-1, "Particles: " + class467.field6963 + " / " + field6849, var27, -256, arg2 + -2, var26);
                                }
                                var27 += 12;
                                if (class14.field265) {
                                    class536.field7867.method1713(-1, "Polys: " + class400.field6090.method824() + " Models: " + class400.field6090.method796(), var27, -256, -1, var26);
                                    var27 += 12;
                                    class536.field7867.method1713(-1, "Ls: " + class375.field5700 + " La: " + class163.field2148 + " NPC: " + class485.field7177 + " Pl: " + class526.field7718, var27, -256, -1, var26);
                                    var27 += 12;
                                    class295.method1883(arg2 ^ 1);
                                }
                                class430.field6553[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field4103 == 0) {
                            if (class484.field7136 == var11.field4014 && class400.field6090.method823()) {
                                class400.field6090.method790(var13, var14, var11.field3991, var11.field4043);
                            }
                            method2773(var21, var23, 1, var12, var22, var20, arg6, -var11.field4091 + var13, -var11.field4129 + var14, var11.field4029);
                            if (var11.field4108 != null) {
                                method2773(var21, var23, 1, var12, var22, var20, var11.field4108, -var11.field4091 + var13, -var11.field4129 + var14, var11.field4029);
                            }
                            class436 var40 = (class436) class312.field4570.method1747((long) var11.field4029, false);
                            if (var40 != null) {
                                class521.method3097(var40.field6598, var23, -18540, var13, var12, var22, var14, var20, var21);
                            }
                            if (class484.field7136 == var11.field4014 && class400.field6090.method823()) {
                                class400.field6090.method792();
                                class347.field5367 = true;
                            }
                            class400.field6090.method739(arg1, arg5, arg4, arg0);
                        }
                        if (class447.field6721[var12] || ~class486.field7200 < -2) {
                            if (~var11.field4103 == -4) {
                                if (var15 != 0) {
                                    if (var11.field4035) {
                                        class400.field6090.method747(var13, var14, var11.field3991, var11.field4043, 255 - (var15 & 255) << 24 | 16777215 & var11.field4146, 1);
                                    } else {
                                        class400.field6090.method810(var13, var14, var11.field3991, var11.field4043, -(255 & var15) + 255 << 24 | var11.field4146 & 16777215, 1);
                                    }
                                } else if (!var11.field4035) {
                                    class400.field6090.method810(var13, var14, var11.field3991, var11.field4043, var11.field4146, 0);
                                } else {
                                    class400.field6090.method747(var13, var14, var11.field3991, var11.field4043, var11.field4146, 0);
                                }
                            } else if (var11.field4103 == 4) {
                                class268 var41 = var11.method1813(-1, class400.field6090);
                                if (var41 == null) {
                                    if (class309.field4502) {
                                        class206.method1385(2, var11);
                                    }
                                } else {
                                    int var42 = var11.field4146;
                                    String var43 = var11.field4073;
                                    if (~var11.field4012 != 0) {
                                        class74 var44 = class103.field1489.method1603((byte) -99, var11.field4012);
                                        var43 = var44.field1077;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((~var44.field1032 == -2 || var11.field4042 != 1) && var11.field4042 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class264.method1700(var11.field4042, true);
                                        }
                                    }
                                    if (class201.field2705 == var11) {
                                        var43 = class367.field5613.method2705((byte) 69, class257.field3556);
                                        var42 = var11.field4146;
                                    }
                                    if (class465.field6938) {
                                        class400.field6090.method828(var13, var14, var11.field3991 + var13, var11.field4043 + var14);
                                    }
                                    var41.method1715((int[]) null, var11.field4022 ? -(var15 & 255) + 255 << 24 : -1, 0, var11.field4063, 125, -(255 & var15) + 255 << 24 | var42, var14, var11.field4033, var11.field4040, 0, (class30) null, var11.field4043, class434.field6586, var43, var11.field4134, var13, var11.field3991);
                                    if (class465.field6938) {
                                        class400.field6090.method739(arg1, arg5, arg4, arg0);
                                    }
                                }
                            } else if (~var11.field4103 == -6) {
                                if (~var11.field4117 <= -1) {
                                    var11.method1818(class332.field5172, class182.field2469, -1523973488).method481((byte) 53, class400.field6090, 0, var11.field3991, var11.field4009 << 3, var13, var14, var11.field4081 << 3, 0, var11.field4043);
                                } else {
                                    class341 var45;
                                    if (~var11.field4012 == 0) {
                                        var45 = var11.method1807(class400.field6090, true);
                                    } else {
                                        class405 var46 = var11.field4034 ? class56.field800.field1401 : null;
                                        var45 = class103.field1489.method1598(var11.field4042, 102, var46, var11.field4012, var11.field4021, class400.field6090, var11.field4102, var11.field4060 | -16777216);
                                    }
                                    if (var45 != null) {
                                        int var47 = var45.method302();
                                        int var48 = var45.method306();
                                        int var49 = -(255 & var15) + 255 << 24 | (~var11.field4146 != -1 ? var11.field4146 & 16777215 : 16777215);
                                        if (!var11.field4120) {
                                            if (~var11.field4146 == -1 && var15 == 0) {
                                                if (~var11.field4053 == -1) {
                                                    if (var11.field3991 == var47 && var11.field4043 == var48) {
                                                        var45.method2201(var13, var14);
                                                    } else {
                                                        var45.method2206(var13, var14, var11.field3991, var11.field4043);
                                                    }
                                                } else {
                                                    var45.method2204((float) var11.field3991 / 2.0F + (float) var13, (float) var11.field4043 / 2.0F + (float) var14, var11.field3991 * 4096 / var47, var11.field4053);
                                                }
                                            } else if (var11.field4053 != 0) {
                                                var45.method2205((float) var11.field3991 / 2.0F + (float) var13, (float) var11.field4043 / 2.0F + (float) var14, var11.field3991 * 4096 / var47, var11.field4053, 0, var49, 1);
                                            } else if (~var11.field3991 == ~var47 && var11.field4043 == var48) {
                                                var45.method297(var13, var14, 0, var49, 1);
                                            } else {
                                                var45.method291(var13, var14, var11.field3991, var11.field4043, 0, var49, 1);
                                            }
                                        } else {
                                            class400.field6090.method828(var13, var14, var11.field3991 + var13, var11.field4043 + var14);
                                            if (var11.field4053 != 0) {
                                                int var50 = (var47 - 1 + var11.field3991) / var47;
                                                int var51 = (var11.field4043 - -var48 + -1) / var48;
                                                for (int var52 = 0; ~var52 > ~var50; ++var52) {
                                                    for (int var53 = 0; var53 < var51; ++var53) {
                                                        if (~var11.field4146 != -1) {
                                                            var45.method2205((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field4053, 0, var49, 1);
                                                        } else {
                                                            var45.method2204((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field4053);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field4146 == 0 && var15 == 0) {
                                                var45.method2200(var13, var14, var11.field3991, var11.field4043);
                                            } else {
                                                var45.method298(var13, var14, var11.field3991, var11.field4043, 0, var49, 1);
                                            }
                                            class400.field6090.method739(arg1, arg5, arg4, arg0);
                                        }
                                    } else if (class309.field4502) {
                                        class206.method1385(2, var11);
                                    }
                                }
                            } else if (~var11.field4103 != -7) {
                                if (var11.field4103 == 9) {
                                    int var73;
                                    int var74;
                                    int var75;
                                    int var76;
                                    if (var11.field4005) {
                                        var73 = var14;
                                        var74 = var13;
                                        var75 = var11.field4043 + var14;
                                        var76 = var11.field3991 + var13;
                                    } else {
                                        var74 = var13;
                                        var75 = var14;
                                        var73 = var11.field4043 + var14;
                                        var76 = var11.field3991 + var13;
                                    }
                                    if (~var11.field4141 == -2) {
                                        class400.field6090.method772(var74, var75, var76, var73, var11.field4146, 0);
                                    } else {
                                        class400.field6090.method777(var74, var75, var76, var73, var11.field4146, var11.field4141, 0);
                                    }
                                }
                            } else {
                                class241.method1587((byte) 64);
                                class334 var54 = null;
                                int var55 = 0;
                                if (var11.field4012 != -1) {
                                    class74 var56 = class103.field1489.method1603((byte) -99, var11.field4012);
                                    if (var56 != null) {
                                        class74 var57 = var56.method506(-1, var11.field4042);
                                        class91 var58 = var11.field4061 != -1 ? class201.field2707.method489(54, var11.field4061) : null;
                                        class405 var59 = var11.field4034 ? class56.field800.field1401 : null;
                                        var54 = var57.method521(var11.field4015, var59, 1, var11.field4050, true, var58, 2048, var11.field4135, class400.field6090);
                                        if (var54 == null) {
                                            class206.method1385(arg2 + 1, var11);
                                        } else {
                                            var55 = -var54.method77() >> 1;
                                        }
                                    }
                                } else if (~var11.field4069 == -6) {
                                    int var60 = var11.field4080;
                                    if (var60 >= 0 && ~var60 > -2049) {
                                        class96 var61 = class241.field3398[var60];
                                        class91 var62 = ~var11.field4061 == 0 ? null : class201.field2707.method489(arg2 ^ 124, var11.field4061);
                                        if (var61 != null && (class350.field5400 == var60 || class411.method2534(var61.field1393, 0) == var11.field4140)) {
                                            var54 = var61.field1401.method2500(var11.field4015, (byte) 88, var62, class400.field6090, var11.field4050, class201.field2707, class103.field1489, 0, class509.field7483, 0, true, (class389[]) null, class288.field4208, var11.field4135, -1, class183.field2487, (class91) null, 2048, class137.field1834);
                                        }
                                    }
                                } else if (~var11.field4069 != -9 && var11.field4069 != 9) {
                                    if (var11.field4061 != -1) {
                                        class91 var63 = class201.field2707.method489(98, var11.field4061);
                                        var54 = var11.method1815(2048, class56.field800.field1401, class201.field2707, class509.field7483, (byte) 127, var63, class183.field2487, var11.field4050, var11.field4135, class103.field1489, var11.field4015, class137.field1834, class288.field4208, class400.field6090);
                                        if (var54 == null && class309.field4502) {
                                            class206.method1385(2, var11);
                                        }
                                    } else {
                                        var54 = var11.method1815(2048, class56.field800.field1401, class201.field2707, class509.field7483, (byte) 127, (class91) null, class183.field2487, -1, 0, class103.field1489, -1, class137.field1834, class288.field4208, class400.field6090);
                                        if (var54 == null && class309.field4502) {
                                            class206.method1385(arg2 ^ 3, var11);
                                        }
                                    }
                                } else {
                                    class94 var64 = class402.method2483(false, (byte) -116, var11.field4080);
                                    class91 var65 = ~var11.field4061 != 0 ? class201.field2707.method489(30, var11.field4061) : null;
                                    if (var64 != null) {
                                        class405 var66 = var11.field4034 ? class56.field800.field1401 : null;
                                        var54 = var64.method630(2048, ~var11.field4069 == -10, var66, var11.field4050, class400.field6090, var11.field4135, var11.field4015, 0, var11.field4140, var65);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var11.field4105 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field3991 << 9) / var11.field4105;
                                    }
                                    int var68;
                                    if (~var11.field4154 < -1) {
                                        var68 = (var11.field4043 << 9) / var11.field4154;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var11.field3991 / 2 + (var13 - -(var11.field4092 * var67 >> 9));
                                    int var70 = (var11.field4077 * var68 >> 9) + var14 - -(var11.field4043 / 2);
                                    class24.field346.method148();
                                    class400.field6090.method821(class24.field346);
                                    class400.field6090.method762(var69, var70, var67, var68);
                                    class400.field6090.method748((float) (var11.field4131 << 0), var11.field3995 ? (float) (var11.field4144 << 0) : (float) (var11.field4144 << 0) * 1.5F);
                                    if (arg9 == -1412584499 || class347.field5367) {
                                        class400.field6090.method753();
                                        class400.field6090.method831();
                                        class400.field6090.method739(arg1, arg5, arg4, arg0);
                                        class347.field5367 = false;
                                    }
                                    if (var11.field4041) {
                                        class400.field6090.method814(false);
                                    }
                                    int var71 = (var11.field4090 << 0) * class428.field6502[var11.field4068 << 3] >> 15;
                                    int var72 = (var11.field4090 << 0) * class428.field6501[var11.field4068 << 3] >> 15;
                                    class346.field5342.method154(-var11.field3992 << 3);
                                    class346.field5342.method153(var11.field4003 << 3);
                                    class346.field5342.method146(var11.field4110 << 0, var55 + var71 - -(var11.field4066 << 0), (var11.field4066 << 0) + var72);
                                    class346.field5342.method152(var11.field4068 << 3);
                                    if (class465.field6938) {
                                        class400.field6090.method828(var13, var14, var13 - -var11.field3991, var11.field4043 + var14);
                                    }
                                    if (!var11.field3995) {
                                        var54.method53(class346.field5342, (class302) null, 1);
                                    } else {
                                        var54.method55(class346.field5342, (class302) null, var11.field4090 << 0, 1);
                                    }
                                    if (class465.field6938) {
                                        class400.field6090.method739(arg1, arg5, arg4, arg0);
                                    }
                                    if (var11.field4041) {
                                        class400.field6090.method814(true);
                                    }
                                    class400.field6090.method748(0.0F, 0.0F);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(B)V", line = 700)
    public static void method2774(byte arg0) {
        if (arg0 > -40) {
            field6857 = null;
        }
        field6857 = null;
    }
}

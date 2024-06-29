import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class239 extends class82 {

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "Ldj;")
    private static class44 field4424 = class89.method650(255, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Ldj;")
    public static class44 field4416 = field4424;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "Ldj;")
    public static class44 field4425 = class89.method650(255, "m");

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "[Ldd;")
    private class38[] field4412;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field4418;
        int[] var3 = super.field1595.method603(true, arg1);
        if (arg0 != 25238) {
            return null;
        } else {
            if (super.field1595.field1538) {
                this.method1551(21799, super.field1595.method604(0));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([BIIIB[Lue;I)V")
    public static final void method1547(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, class215[] arg5, int arg6) {
        ++field4413;
        for (int var7 = 0; var7 < 4; ++var7) {
            for (int var12 = 0; var12 < 64; ++var12) {
                for (int var13 = 0; ~var13 > -65; ++var13) {
                    if (~(arg1 + var12) < -1 && arg1 + var12 < 103 && arg3 + var13 > 0 && ~(arg3 + var13) > -104) {
                        arg5[var7].field3908[arg1 + var12][arg3 - -var13] = class29.method202(arg5[var7].field3908[arg1 + var12][arg3 - -var13], -16777217);
                    }
                }
            }
        }
        class66 var8 = new class66(arg0);
        if (arg4 != -58) {
            method1548((byte) -94);
        }
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; ~var10 > -65; ++var10) {
                for (int var11 = 0; ~var11 > -65; ++var11) {
                    class122.method836(arg6, 0, var10 - -arg1, 932731, arg3 + var11, arg2, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field4417;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field1599 = arg0.method506(255) == 1;
            }
        } else {
            this.field4412 = new class38[arg0.method506(255)];
            for (int var4 = 0; this.field4412.length > var4; ++var4) {
                int var5 = arg0.method506(255);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field4412[var4] = class224.method1451((byte) -109, arg0);
                            }
                        } else {
                            this.field4412[var4] = class137.method919(1, arg0);
                        }
                    } else {
                        this.field4412[var4] = class237.method1541(0, arg0);
                    }
                } else {
                    this.field4412[var4] = class140.method939(arg0, class13.method116(arg2, 70));
                }
            }
        }
        if (arg2 != 68) {
            field4422 = -17;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    public static final void method1548(byte arg0) {
        if (class53.field946 > 0) {
            --class53.field946;
        }
        if (~class172.field2995 < -2) {
            --class172.field2995;
        }
        ++field4415;
        if (class82.field1596) {
            class82.field1596 = false;
            class169.method1079(-14186);
        } else {
            for (int var1 = 0; ~var1 > -101 && class198.method1284(true); ++var1) {
            }
            if (class183.field3191 == 30) {
                class72.method567((byte) 82, class200.field3542, 22);
                Object var2 = class169.field2916.field3221;
                synchronized (class169.field2916.field3221) {
                    if (!class130.field2310) {
                        class169.field2916.field3236 = 0;
                    } else if (~class194.field3393 != -1 || class169.field2916.field3236 >= 40) {
                        class200.field3542.method1170(178, (byte) -123);
                        int var3 = 0;
                        ++class38.field673;
                        class200.field3542.method488(126, 0);
                        int var4 = class200.field3542.field1195;
                        for (int var5 = 0; ~class169.field2916.field3236 < ~var5 && ~(-var4 + class200.field3542.field1195) > -241; ++var5) {
                            ++var3;
                            int var6 = class169.field2916.field3235[var5];
                            if (~var6 <= -1) {
                                if (var6 > 502) {
                                    var6 = 502;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class169.field2916.field3234[var5];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (~var7 < -765) {
                                var7 = 764;
                            }
                            int var8 = var6 * 765 - -var7;
                            if (~class169.field2916.field3235[var5] == 0 && class169.field2916.field3234[var5] == -1) {
                                var6 = -1;
                                var7 = -1;
                                var8 = 524287;
                            }
                            if (class216.field3940 == var7 && class32.field562 == var6) {
                                if (~class238.field4406 > -2048) {
                                    ++class238.field4406;
                                }
                            } else {
                                int var9 = -class216.field3940 + var7;
                                class216.field3940 = var7;
                                int var10 = var6 - class32.field562;
                                class32.field562 = var6;
                                if (class238.field4406 < 8 && var9 >= -32 && ~var9 >= -32 && ~var10 <= 31 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class200.field3542.method510((byte) -68, (class238.field4406 << 12) + (var9 << 6) + var10);
                                    class238.field4406 = 0;
                                } else if (~class238.field4406 > -9) {
                                    class200.field3542.method483(2554, var8 + 8388608 - -(class238.field4406 << 19));
                                    class238.field4406 = 0;
                                } else {
                                    class200.field3542.method489(-1073741824 - -(class238.field4406 << 19) + var8, -47);
                                    class238.field4406 = 0;
                                }
                            }
                        }
                        class200.field3542.method508(-1, -var4 + class200.field3542.field1195);
                        if (class169.field2916.field3236 > var3) {
                            class169.field2916.field3236 -= var3;
                            for (int var11 = 0; class169.field2916.field3236 > var11; ++var11) {
                                class169.field2916.field3234[var11] = class169.field2916.field3234[var3 + var11];
                                class169.field2916.field3235[var11] = class169.field2916.field3235[var3 + var11];
                            }
                        } else {
                            class169.field2916.field3236 = 0;
                        }
                    }
                }
                if (class194.field3393 != 0) {
                    ++class42.field783;
                    int var12 = class180.field3108;
                    long var13 = (-class193.field3382 + class2.field37) / 50L;
                    class193.field3382 = class2.field37;
                    if (~var12 > -1) {
                        var12 = 0;
                    } else if (~var12 < -765) {
                        var12 = 764;
                    }
                    if (var13 > 4095L) {
                        var13 = 4095L;
                    }
                    int var15 = class102.field1860;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 502) {
                        var15 = 502;
                    }
                    int var16 = var15 * 765 + var12;
                    int var17 = (int) var13;
                    byte var18 = 0;
                    if (~class194.field3393 == -3) {
                        var18 = 1;
                    }
                    class200.field3542.method1170(204, (byte) -113);
                    class200.field3542.method522((var17 << 20) + (var18 << 19) - -var16, -21576);
                }
                if (~class64.field1188 < -1) {
                    --class64.field1188;
                }
                if (class130.field2324[96] || class130.field2324[97] || class130.field2324[98] || class130.field2324[99]) {
                    class219.field3972 = true;
                }
                if (class219.field3972 && ~class64.field1188 >= -1) {
                    ++class218.field3953;
                    class219.field3972 = false;
                    class64.field1188 = 20;
                    class200.field3542.method1170(177, (byte) -109);
                    class200.field3542.method524(class62.field1168, -94667736);
                    class200.field3542.method493(class73.field1384, 123);
                }
                if (class184.field3199 && !class29.field521) {
                    class29.field521 = true;
                    ++class139.field2484;
                    class200.field3542.method1170(230, (byte) -100);
                    class200.field3542.method488(120, 1);
                }
                if (!class184.field3199 && class29.field521) {
                    ++class139.field2484;
                    class29.field521 = false;
                    class200.field3542.method1170(230, (byte) -119);
                    class200.field3542.method488(123, 0);
                }
                class104.method764(0);
                if (class183.field3191 == 30) {
                    class92.method662(-2);
                    class3.method21((byte) -40);
                    ++class218.field3946;
                    if (class218.field3946 > 750) {
                        class169.method1079(-14186);
                    } else {
                        class74.method573(119);
                        class4.method26((byte) -54);
                        class157.method1030((byte) 102);
                        if (class48.field895 != null) {
                            class154.method998(12715);
                        }
                        ++class102.field1855;
                        if (~class1.field9 != -1) {
                            class202.field3617 += 20;
                            if (~class202.field3617 <= -401) {
                                class1.field9 = 0;
                            }
                        }
                        if (class35.field623 != null) {
                            ++class227.field4257;
                            if (class227.field4257 >= 15) {
                                class225.method1457(-58, class35.field623);
                                class35.field623 = null;
                            }
                        }
                        if (class220.field3989 != null) {
                            class225.method1457(114, class220.field3989);
                            ++class66.field1260;
                            if (class4.field59 - -5 < class27.field486 || ~class27.field486 > ~(class4.field59 + -5) || class7.field151 > class59.field1097 - -5 || class59.field1097 + -5 > class7.field151) {
                                class158.field2758 = true;
                            }
                            if (~class213.field3821 == -1) {
                                if (class158.field2758 && class66.field1260 >= 5) {
                                    if (class38.field674 == class220.field3989 && class80.field1560 != class31.field545) {
                                        ++class97.field1788;
                                        class223 var19 = class220.field3989;
                                        byte var20 = 0;
                                        if (~class165.field2847 == -2 && ~var19.field4033 == -207) {
                                            var20 = 1;
                                        }
                                        if (var19.field4166[class31.field545] <= 0) {
                                            var20 = 0;
                                        }
                                        if (class137.method923(class117.method821(var19, 21064), -2)) {
                                            int var21 = class31.field545;
                                            int var22 = class80.field1560;
                                            var19.field4166[var21] = var19.field4166[var22];
                                            var19.field4060[var21] = var19.field4060[var22];
                                            var19.field4166[var22] = -1;
                                            var19.field4060[var22] = 0;
                                        } else if (~var20 != -2) {
                                            var19.method1434(22371, class80.field1560, class31.field545);
                                        } else {
                                            int var23 = class80.field1560;
                                            int var24 = class31.field545;
                                            while (var23 != var24) {
                                                if (~var24 > ~var23) {
                                                    var19.method1434(22371, var23, var23 + -1);
                                                    --var23;
                                                } else if (var23 < var24) {
                                                    var19.method1434(22371, var23, var23 + 1);
                                                    ++var23;
                                                }
                                            }
                                        }
                                        class200.field3542.method1170(89, (byte) -107);
                                        class200.field3542.method479(var20, -121);
                                        class200.field3542.method524(class80.field1560, -94667736);
                                        class200.field3542.method497((byte) -17, class220.field3989.field4040);
                                        class200.field3542.method510((byte) 104, class31.field545);
                                    }
                                } else if ((~class205.field3668 == -2 || class37.method257((byte) -95, class179.field3071 + -1)) && ~class179.field3071 < -3) {
                                    class13.method113((byte) 113);
                                } else if (~class179.field3071 < -1) {
                                    class70.method553(0, class179.field3071 - 1);
                                }
                                class194.field3393 = 0;
                                class220.field3989 = null;
                                class227.field4257 = 10;
                            }
                        }
                        class203.field3635 = false;
                        class223 var25 = class226.field4253;
                        class184.field3203 = 0;
                        class226.field4253 = null;
                        class205.field3681 = null;
                        class171.field2986 = false;
                        class223 var26 = class48.field903;
                        class48.field903 = null;
                        while (class31.method212(-103) && class184.field3203 < 128) {
                            class179.field3105[class184.field3203] = class136.field2428;
                            class40.field759[class184.field3203] = class66.field1203;
                            ++class184.field3203;
                        }
                        class48.field895 = null;
                        if (class201.field3575 != -1) {
                            class106.method769(0, 0, class201.field3575, class169.field2926, 0, class130.field2313, 0, (byte) 37);
                        }
                        ++class66.field1251;
                        while (true) {
                            class140 var27;
                            class223 var28;
                            class223 var29;
                            do {
                                var27 = (class140) class101.field1847.method1187((byte) 104);
                                if (var27 == null) {
                                    while (true) {
                                        class140 var30;
                                        class223 var31;
                                        class223 var32;
                                        do {
                                            var30 = (class140) class54.field987.method1187((byte) -95);
                                            if (var30 == null) {
                                                while (true) {
                                                    class140 var33;
                                                    class223 var34;
                                                    class223 var35;
                                                    do {
                                                        var33 = (class140) class189.field3259.method1187((byte) 90);
                                                        if (var33 == null) {
                                                            if (class119.field2121 && class48.field895 == null) {
                                                                class119.field2121 = false;
                                                            }
                                                            if (class235.field4364 != null) {
                                                                class137.method921(-1);
                                                            }
                                                            if (class31.field546 != -1) {
                                                                int var36 = class31.field546;
                                                                int var37 = class157.field2725;
                                                                boolean var38 = class129.method884(0, class96.field1774.field2240[0], 0, 0, -129, class96.field1774.field2235[0], true, var37, var36, 0, 0, 0);
                                                                class31.field546 = -1;
                                                                if (var38) {
                                                                    class202.field3617 = 0;
                                                                    class1.field9 = 1;
                                                                    class87.field1661 = class102.field1860;
                                                                    class218.field3951 = class180.field3108;
                                                                }
                                                            }
                                                            class39.method266((byte) 126);
                                                            if (class226.field4253 != var25) {
                                                                if (var25 != null) {
                                                                    class225.method1457(-48, var25);
                                                                }
                                                                if (class226.field4253 != null) {
                                                                    class225.method1457(-127, class226.field4253);
                                                                }
                                                            }
                                                            if (class48.field903 != var26 && class181.field3137 == class163.field2812) {
                                                                if (var26 != null) {
                                                                    class225.method1457(-83, var26);
                                                                }
                                                                if (class48.field903 != null) {
                                                                    class225.method1457(-125, class48.field903);
                                                                }
                                                            }
                                                            if (class48.field903 != null) {
                                                                if (class163.field2812 > class181.field3137) {
                                                                    ++class181.field3137;
                                                                    if (~class181.field3137 == ~class163.field2812) {
                                                                        class225.method1457(-105, class48.field903);
                                                                    }
                                                                }
                                                            } else if (class181.field3137 > 0) {
                                                                --class181.field3137;
                                                            }
                                                            class24.method176(4);
                                                            if (class86.field1658) {
                                                                class114.method799((byte) 103);
                                                            }
                                                            for (int var39 = 0; ~var39 > -6; ++var39) {
                                                                int var10002 = class44.field797[var39]++;
                                                            }
                                                            int var40 = class49.method362((byte) -95);
                                                            int var41 = class189.method1176(0);
                                                            if (~var40 < -4501 && var41 > 4500) {
                                                                class53.field946 = 250;
                                                                ++class180.field3111;
                                                                class154.method994(4000, -1);
                                                                class200.field3542.method1170(157, (byte) -86);
                                                            }
                                                            ++class48.field885;
                                                            ++class224.field4180;
                                                            ++class3.field40;
                                                            if (arg0 <= 17) {
                                                                return;
                                                            }
                                                            if (~class3.field40 < -501) {
                                                                class3.field40 = 0;
                                                                int var42 = (int) (Math.random() * 8.0D);
                                                                if (~(var42 & 4) == -5) {
                                                                    class31.field550 += class109.field2002;
                                                                }
                                                                if ((1 & var42) == 1) {
                                                                    class224.field4178 += class227.field4274;
                                                                }
                                                                if ((2 & var42) == 2) {
                                                                    class32.field553 += class8.field182;
                                                                }
                                                            }
                                                            if (~class32.field553 > 54) {
                                                                class8.field182 = 2;
                                                            }
                                                            if (~class224.field4178 > 49) {
                                                                class227.field4274 = 2;
                                                            }
                                                            if (~class224.field4178 < -51) {
                                                                class227.field4274 = -2;
                                                            }
                                                            if (class31.field550 < -40) {
                                                                class109.field2002 = 1;
                                                            }
                                                            if (~class31.field550 < -41) {
                                                                class109.field2002 = -1;
                                                            }
                                                            if (class32.field553 > 55) {
                                                                class8.field182 = -2;
                                                            }
                                                            if (class224.field4180 > 500) {
                                                                class224.field4180 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if (~(var43 & 1) == -2) {
                                                                    class129.field2303 += class28.field499;
                                                                }
                                                                if (~(2 & var43) == -3) {
                                                                    class218.field3959 += class111.field2009;
                                                                }
                                                            }
                                                            if (~class129.field2303 > 59) {
                                                                class28.field499 = 2;
                                                            }
                                                            if (~class218.field3959 > 19) {
                                                                class111.field2009 = 1;
                                                            }
                                                            if (class129.field2303 > 60) {
                                                                class28.field499 = -2;
                                                            }
                                                            if (class218.field3959 > 10) {
                                                                class111.field2009 = -1;
                                                            }
                                                            if (class48.field885 > 50) {
                                                                ++class63.field1174;
                                                                class200.field3542.method1170(4, (byte) -94);
                                                            }
                                                            try {
                                                                if (class101.field1844 != null && class200.field3542.field1195 > 0) {
                                                                    class101.field1844.method782(59, class200.field3542.field1219, class200.field3542.field1195, 0);
                                                                    class48.field885 = 0;
                                                                    class200.field3542.field1195 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class169.method1079(-14186);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field2507;
                                                        if (var34.field4085 < 0) {
                                                            break;
                                                        }
                                                        var35 = class213.method1379(var34.field4170, -10051);
                                                    } while (var35 == null || var35.field4169 == null || ~var34.field4085 <= ~var35.field4169.length || var35.field4169[var34.field4085] != var34);
                                                    class150.method972(var33, (byte) -127);
                                                }
                                            }
                                            var31 = var30.field2507;
                                            if (~var31.field4085 > -1) {
                                                break;
                                            }
                                            var32 = class213.method1379(var31.field4170, -10051);
                                        } while (var32 == null || var32.field4169 == null || var31.field4085 >= var32.field4169.length || var32.field4169[var31.field4085] != var31);
                                        class150.method972(var30, (byte) -127);
                                    }
                                }
                                var28 = var27.field2507;
                                if (~var28.field4085 > -1) {
                                    break;
                                }
                                var29 = class213.method1379(var28.field4170, -10051);
                            } while (var29 == null || var29.field4169 == null || var28.field4085 >= var29.field4169.length || var29.field4169[var28.field4085] != var28);
                            class150.method972(var27, (byte) -127);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field4421;
        if (arg0 >= -59) {
            field4416 = null;
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int var4 = class129.field2287;
            int var5 = client.field609;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1601.method554(true);
            this.method1551(21799, var6);
            for (int var8 = 0; ~var8 > ~client.field609; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; ~var14 > ~class129.field2287; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class29.method202(255, var15) << 4;
                    var13[var14] = class29.method202(65280, var15) >> 4;
                    var11[var14] = class29.method202(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BZ)V")
    public static final void method1549(byte arg0, boolean arg1) {
        ++field4420;
        if (arg0 != 76) {
            field4423 = 26;
        }
        class147.field2599 = arg1;
        if (class147.field2599) {
            int var2 = class218.field3957.method534(arg0 + -5814);
            int var3 = class218.field3957.method487(-32674);
            int var4 = class218.field3957.method487(-32674);
            int var5 = class218.field3957.method487(-32674);
            int var6 = class218.field3957.method531((byte) -19);
            class218.field3957.method1171(8);
            for (int var7 = 0; ~var7 > -5; ++var7) {
                for (int var22 = 0; var22 < 13; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class218.field3957.method1173(127, 1);
                        if (var24 == 1) {
                            class128.field2279[var7][var22][var23] = class218.field3957.method1173(127, 26);
                        } else {
                            class128.field2279[var7][var22][var23] = -1;
                        }
                    }
                }
            }
            class218.field3957.method1166((byte) 9);
            int var8 = (-class218.field3957.field1195 + class88.field1680) / 16;
            class62.field1161 = new int[var8][4];
            for (int var9 = 0; var9 < var8; ++var9) {
                for (int var21 = 0; var21 < 4; ++var21) {
                    class62.field1161[var9][var21] = class218.field3957.method519((byte) -117);
                }
            }
            class174.field3028 = new int[var8];
            class193.field3377 = new int[var8];
            class130.field2332 = new byte[var8][];
            class37.field665 = new byte[var8][];
            class80.field1554 = new int[var8];
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; var12 < 13; ++var12) {
                    for (int var13 = 0; var13 < 13; ++var13) {
                        int var14 = class128.field2279[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = 1023 & var14 >> 14;
                            int var16 = (16383 & var14) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                if (~class174.field3028[var18] == ~var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (~var17 != 0) {
                                class174.field3028[var10] = var17;
                                int var19 = var17 >> 8 & 255;
                                int var20 = var17 & 255;
                                class193.field3377[var10] = class208.field3736.method1463(class70.method555(new class44[] { field4425, class199.method1287(var19, -1), class79.field1522, class199.method1287(var20, -1) }, -3), -94);
                                class80.field1554[var10] = class208.field3736.method1463(class70.method555(new class44[] { class143.field2540, class199.method1287(var19, -1), class79.field1522, class199.method1287(var20, arg0 + -77) }, -3), arg0 + -154);
                                ++var10;
                            }
                        }
                    }
                }
            }
            class234.method1530(false, var6, var4, var3, var5, var2);
        } else {
            int var25 = class218.field3957.method500(75);
            int var26 = class218.field3957.method500(108);
            int var27 = class218.field3957.method529((byte) 123);
            int var28 = (-class218.field3957.field1195 + class88.field1680) / 16;
            class62.field1161 = new int[var28][4];
            for (int var29 = 0; var28 > var29; ++var29) {
                for (int var37 = 0; ~var37 > -5; ++var37) {
                    class62.field1161[var29][var37] = class218.field3957.method528(true);
                }
            }
            int var30 = class218.field3957.method534(arg0 ^ -5670);
            int var31 = class218.field3957.method500(62);
            boolean var32 = false;
            class130.field2332 = new byte[var28][];
            class174.field3028 = new int[var28];
            if ((~(var31 / 8) == -49 || var31 / 8 == 49) && var27 / 8 == 48) {
                var32 = true;
            }
            class37.field665 = new byte[var28][];
            class193.field3377 = new int[var28];
            class80.field1554 = new int[var28];
            if (var31 / 8 == 48 && ~(var27 / 8) == -149) {
                var32 = true;
            }
            int var33 = 0;
            for (int var34 = (var31 + -6) / 8; ~((var31 - -6) / 8) <= ~var34; ++var34) {
                for (int var35 = (var27 - 6) / 8; ~var35 >= ~((var27 - -6) / 8); ++var35) {
                    int var36 = (var34 << 8) - -var35;
                    if (!var32 || ~var35 != -50 && var35 != 149 && var35 != 147 && ~var34 != -51 && (~var34 != -50 || var35 != 47)) {
                        class174.field3028[var33] = var36;
                        class193.field3377[var33] = class208.field3736.method1463(class70.method555(new class44[] { field4425, class199.method1287(var34, -1), class79.field1522, class199.method1287(var35, -1) }, -3), -68);
                        class80.field1554[var33] = class208.field3736.method1463(class70.method555(new class44[] { class143.field2540, class199.method1287(var34, -1), class79.field1522, class199.method1287(var35, -1) }, -3), arg0 + -190);
                        ++var33;
                    }
                }
            }
            class234.method1530(false, var27, var26, var31, var25, var30);
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static void method1550(byte arg0) {
        field4425 = null;
        field4424 = null;
        if (arg0 > -124) {
            field4423 = -24;
        }
        field4416 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[I)V")
    private final void method1551(int arg0, int[][] arg1) {
        int var3 = client.field609;
        ++field4419;
        int var4 = class129.field2287;
        class48.method352(arg0 ^ -21762, arg1);
        if (arg0 != 21799) {
            this.method6(-56, 95);
        }
        class189.method1175(class53.field943, 50, 0, 0, class101.field1850);
        if (this.field4412 != null) {
            for (int var5 = 0; ~var5 > ~this.field4412.length; ++var5) {
                class38 var6 = this.field4412[var5];
                int var7 = var6.field669;
                int var8 = var6.field671;
                if (~var8 <= -1) {
                    if (~var7 > -1) {
                        var6.method260((byte) -69, var3, var4);
                    } else {
                        var6.method261(var4, var3, false);
                    }
                } else if (var7 >= 0) {
                    var6.method259(-114, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(III)J")
    public static final long method1552(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 != null && var3.field1304 != null ? var3.field1304.field3997 : 0L;
    }
}

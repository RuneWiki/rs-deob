import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class386 extends class19 {

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    private int field5288 = 0;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lup;")
    private class340 field5294 = new class340();

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lap;")
    public static class310 field5300 = new class310(63, -1);

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lap;")
    public static class310 field5302 = new class310(6, -1);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lvk;")
    public static class276 field5289;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lat;")
    public static class96 field5298;

    static {
        new class151("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 5)
    public final void method132(boolean arg0) {
        if (arg0) {
            ++field5291;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwr;B)V", line = 16)
    public final void method131(class52 arg0, byte arg1) {
        super.field205[super.field196] = 20;
        ++field5287;
        super.field204[super.field196] = arg0;
        ++super.field196;
        if (arg1 <= 30) {
            field5298 = null;
        }
        if (~super.field196 <= -5001) {
            super.field196 = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 33)
    private final void method2348(int arg0) {
        ++field5292;
        int var2 = super.field197++;
        if (~super.field197 <= -5001) {
            super.field197 = 0;
        }
        int var3 = 127 / ((-4 - arg0) / 54);
        this.field5288 = super.field205[var2];
        Object var4 = super.field204[var2];
        super.field204[var2] = null;
        if (this.field5288 == 21) {
            class247.method1705(this.field5294, (class52) var4);
        } else if (this.field5288 != 20) {
            if (this.field5288 >= 30 && ~this.field5288 >= -34) {
                class340.field4702.method378(3000.0F, super.field201[var2] * 1.5F);
                ((class241) var4).method587(class409.field5607, class54.field811, class4.field30, class154.field2129, ~(this.field5288 + -30) == -1);
            } else if (~this.field5288 <= -41 && ~this.field5288 >= -44) {
                class340.field4702.method378(3000.0F, super.field201[var2] * 1.5F);
                ((class241) var4).method587(class409.field5607, class54.field811, class4.field30, class399.field5480, ~(this.field5288 + -40) == -1);
            } else if (~this.field5288 != -23) {
                if (~this.field5288 != -24) {
                    if (this.field5288 == 24) {
                        class340.field4702.method439(0, (class104[]) null);
                        return;
                    }
                } else {
                    class340.field4702.method345();
                }
            } else {
                class340.field4702.method309(-1, 1583160, 40, 127);
            }
        } else {
            class52 var5 = (class52) var4;
            if (var5.field772 != null) {
                var5.field772.method86(false, class340.field4702);
            }
            if (var5.field752 != null) {
                var5.field752.method86(false, class340.field4702);
            }
            if (var5.field755 != null) {
                var5.field755.method86(false, class340.field4702);
            }
            if (var5.field756 != null) {
                var5.field756.method86(false, class340.field4702);
            }
            if (var5.field758 != null) {
                var5.field758.method86(false, class340.field4702);
            }
            for (class131 var6 = var5.field763; var6 != null; var6 = var6.field1796) {
                var6.field1803.method86(false, class340.field4702);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwr;I)V", line = 124)
    public final void method139(class52 arg0, int arg1) {
        ++field5295;
        super.field205[super.field196] = 21;
        if (arg1 == 0) {
            super.field204[super.field196] = arg0;
            ++super.field196;
            if (super.field196 >= 5000) {
                super.field196 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIII)V", line = 142)
    public static final void method2349(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5299;
        int var7 = class143.field1996;
        class178.field2690 = 0;
        int[] var8 = class464.field6536;
        byte var9 = class164.method1210(false) != 2 ? 1 : (byte) class392.field5407;
        int var10 = 37 % ((arg1 - -86) / 37);
        label438: for (int var11 = 0; ~var11 > ~(class24.field257 + var7); ++var11) {
            class37 var34 = null;
            class418 var35;
            if (var11 >= var7) {
                var35 = class163.field2377[class193.field2873[-var7 + var11]];
                var34 = ((class361) var35).field4952;
                if (var34.field434 != null) {
                    var34 = var34.method232(class416.field5691, -1);
                    if (var34 == null) {
                        continue;
                    }
                }
            } else {
                var35 = class112.field1570[var8[var11]];
            }
            if (var35.field5784 >= 0) {
                if (class486.field6878 != null && ~class262.field3781.field4531 > ~var35.field4531) {
                    for (int var36 = var35.field4535; ~var36 >= ~var35.field4526; ++var36) {
                        for (int var37 = var35.field4539; ~var35.field4534 <= ~var37; ++var37) {
                            if (class486.field6878[var35.field4531][var36][var37] == var9) {
                                continue label438;
                            }
                        }
                    }
                }
                class307.method1973(arg3, arg5, arg6 >> 1, 32602, var35.method2220(0), arg0 >> 1, var35);
                if (class98.field1383[0] >= 0) {
                    if (var35.field5757 != null && (~var11 <= ~var7 || class411.field5627 == 0 || class411.field5627 == 3 || class411.field5627 == 1 && class99.method818(((class39) var35).field485, 1575)) && ~class449.field6397 < ~class178.field2690) {
                        class449.field6392[class178.field2690] = class402.field5516.method1354((byte) -68, var35.field5757) / 2;
                        class449.field6396[class178.field2690] = class98.field1383[0];
                        class449.field6391[class178.field2690] = class98.field1383[1];
                        class449.field6389[class178.field2690] = var35.field5778;
                        class449.field6393[class178.field2690] = var35.field5727;
                        class449.field6394[class178.field2690] = var35.field5796;
                        class449.field6395[class178.field2690] = var35.field5757;
                        ++class178.field2690;
                    }
                    class417 var38 = class27.field281[0];
                    int var39 = class98.field1383[1] + arg2 + -Math.max(class402.field5516.field2888, var38.method1287());
                    if (!var35.field5760 && class364.field5010 < var35.field5761) {
                        class417 var40 = class27.field281[1];
                        if (var35 instanceof class361) {
                            class361 var41 = (class361) var35;
                            class417[] var42 = (class417[]) class365.field5015.method2113(0, (long) var41.field4952.field437);
                            if (var42 == null) {
                                class355[] var43 = class355.method2189(class454.field6440, var41.field4952.field437, 0);
                                if (var43 != null) {
                                    var42 = new class417[var43.length];
                                    for (int var44 = 0; ~var43.length < ~var44; ++var44) {
                                        var42[var44] = class374.field5152.method302(var43[var44], true);
                                    }
                                    class365.field5015.method2116((long) var41.field4952.field437, (byte) -70, var42);
                                }
                            }
                            if (var42 != null && ~var42.length == -3) {
                                var40 = var42[1];
                                var38 = var42[0];
                            }
                        }
                        int var45 = class98.field1383[0] + arg4 + -(var38.method1293() >> 1);
                        var38.method2493(var45, var39);
                        int var46 = var38.method1293() * var35.field5740 / 255;
                        if (~var35.field5740 < -1 && ~var46 > -3) {
                            var46 = 2;
                        }
                        class374.field5152.method443(var45, var39, var45 + var46, var38.method1287() + var39);
                        var40.method2493(var45, var39);
                        class374.field5152.method453(arg4, arg2, arg4 - -arg0, arg2 - -arg6);
                    }
                    var39 -= 2;
                    if (!var35.field5760) {
                        if (class364.field5010 < var35.field5793) {
                            class417 var47 = class34.field358[!var35.field5732 ? 0 : 2];
                            class417 var48 = class34.field358[!var35.field5732 ? 1 : 3];
                            boolean var49 = true;
                            int var50;
                            if (!(var35 instanceof class361)) {
                                var50 = var35.method2506(-16338).field5353;
                            } else {
                                var50 = var34.field462;
                                if (~var50 == 0) {
                                    var50 = var35.method2506(-16338).field5353;
                                }
                            }
                            if (~var50 != 0) {
                                class417[] var51 = (class417[]) class285.field4079.method2113(0, (long) var50);
                                if (var51 == null) {
                                    class355[] var52 = class355.method2189(class454.field6440, var50, 0);
                                    if (var52 != null) {
                                        var51 = new class417[var52.length];
                                        for (int var53 = 0; ~var52.length < ~var53; ++var53) {
                                            var51[var53] = class374.field5152.method302(var52[var53], true);
                                        }
                                        class285.field4079.method2116((long) var50, (byte) -88, var51);
                                    }
                                }
                                if (var51 != null && ~var51.length == -5) {
                                    var47 = var51[!var35.field5732 ? 0 : 2];
                                    var48 = var51[!var35.field5732 ? 1 : 3];
                                }
                            }
                            int var54 = -class364.field5010 + var35.field5793;
                            int var57;
                            if (~var54 < ~var35.field5792) {
                                int var55 = var54 - var35.field5792;
                                int var56 = ~var35.field5764 != -1 ? (var35.field5738 - var55) / var35.field5764 * var35.field5764 : 0;
                                var57 = var47.method1293() * var56 / var35.field5738;
                            } else {
                                var57 = var47.method1293();
                            }
                            int var58 = var47.method1287();
                            var39 -= var58;
                            int var59 = arg4 - -class98.field1383[0] + -(var47.method1293() >> 1);
                            var47.method2493(var59, var39);
                            class374.field5152.method443(var59, var39, var59 - -var57, var39 + var58);
                            var48.method2493(var59, var39);
                            class374.field5152.method453(arg4, arg2, arg4 - -arg0, arg2 + arg6);
                            var39 -= 2;
                        }
                        if (var11 < var7) {
                            class39 var60 = (class39) var35;
                            if (~var60.field488 != 0) {
                                var39 -= 25;
                                class300.field4244[var60.field488].method2493(class98.field1383[0] + arg4 + -12, var39);
                                var39 -= 2;
                            }
                            if (var60.field484 != -1) {
                                var39 -= 25;
                                class387.field5310[var60.field484].method2493(class98.field1383[0] + arg4 + -12, var39);
                                var39 -= 2;
                            }
                        } else if (var34.field452 >= 0 && var34.field452 < class387.field5310.length) {
                            class417 var61 = class387.field5310[var34.field452];
                            var39 -= 25;
                            var61.method2493(arg4 + class98.field1383[0] + -(var61.method1293() >> 1), var39);
                            var39 -= 2;
                        }
                    }
                    int var10000;
                    if (var35 instanceof class39) {
                        if (~var11 <= -1) {
                            int var62 = 0;
                            class177[] var63 = class143.field1994;
                            for (int var64 = 0; ~var63.length < ~var64; ++var64) {
                                class177 var66 = var63[var64];
                                if (var66 != null && var66.field2678 == 10 && var8[var11] == var66.field2680) {
                                    class417 var67 = class77.field1137[var66.field2672];
                                    if (var62 < var67.method1287()) {
                                        var62 = var67.method1287();
                                    }
                                    var67.method2493(class98.field1383[0] + -12 + arg4, var39 + -var67.method1287());
                                }
                            }
                            if (var62 > 0) {
                                var10000 = var39 - (var62 + 2);
                            }
                        }
                    } else {
                        int var68 = 0;
                        class177[] var69 = class143.field1994;
                        for (int var70 = 0; ~var70 > ~var69.length; ++var70) {
                            class177 var74 = var69[var70];
                            if (var74 != null && ~var74.field2678 == -2 && ~class193.field2873[-var7 + var11] == ~var74.field2680) {
                                class417 var75 = class77.field1137[var74.field2672];
                                if (~var68 > ~var75.method1287()) {
                                    var68 = var75.method1287();
                                }
                                if (class364.field5010 % 20 < 10) {
                                    var75.method2493(class98.field1383[0] + arg4 + -12, var39 - var75.method1287());
                                }
                            }
                        }
                        if (var68 > 0) {
                            var10000 = var39 - (var68 + 2);
                        }
                    }
                    for (int var72 = 0; var72 < 4; ++var72) {
                        if (var35.field5744[var72] > class364.field5010) {
                            int var73 = var35.method2220(0) / 2;
                            class307.method1973(arg3, arg5, arg6 >> 1, 32602, var73, arg0 >> 1, var35);
                            if (~class98.field1383[0] < 0) {
                                if (var72 == 1) {
                                    class98.field1383[1] -= 20;
                                }
                                if (~var72 == -3) {
                                    class98.field1383[0] -= 15;
                                    class98.field1383[1] -= 10;
                                }
                                if (var72 == 3) {
                                    class98.field1383[0] += 15;
                                    class98.field1383[1] -= 10;
                                }
                                class297.field4195[var35.field5799[var72]].method2493(arg4 - 12 + class98.field1383[0], class98.field1383[1] + arg2 - 12);
                                class411.field5629.method1385(Integer.toString(var35.field5766[var72]), -1, 0, class98.field1383[1] + arg2 + 3, class98.field1383[0] + arg4 + -1, 1453761640);
                            }
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < class254.field3647; ++var12) {
            int var30 = class365.field5022[var12];
            class418 var31;
            if (var30 >= 2048) {
                var31 = class163.field2377[var30 - 2048];
            } else {
                var31 = class112.field1570[var30];
            }
            int var32 = class225.field3243[var12];
            class418 var33;
            if (~var32 <= -2049) {
                var33 = class163.field2377[var32 + -2048];
            } else {
                var33 = class112.field1570[var32];
            }
            class266.method1796(arg5, --var31.field5754, arg4, arg3, var33, arg0, arg2, (byte) -124, arg6, var31);
        }
        int var13 = class402.field5516.field2883 + 2 + class402.field5516.field2888;
        for (int var14 = 0; var14 < class178.field2690; ++var14) {
            int var15 = class449.field6396[var14];
            int var16 = class449.field6391[var14];
            int var17 = class449.field6392[var14];
            boolean var18 = true;
            while (var18) {
                var18 = false;
                for (int var29 = 0; ~var14 < ~var29; ++var29) {
                    if (class449.field6391[var29] + -var13 < var16 + 2 && class449.field6391[var29] + 2 > var16 - var13 && ~(class449.field6396[var29] + class449.field6392[var29]) < ~(-var17 + var15) && var15 + var17 > class449.field6396[var29] + -class449.field6392[var29] && class449.field6391[var29] + -var13 < var16) {
                        var18 = true;
                        var16 = class449.field6391[var29] + -var13;
                    }
                }
            }
            class449.field6391[var14] = var16;
            String var19 = class449.field6395[var14];
            if (~class334.field4641 == -1) {
                int var20 = 16776960;
                if (class449.field6389[var14] < 6) {
                    var20 = class352.field4846[class449.field6389[var14]];
                }
                if (~class449.field6389[var14] == -7) {
                    var20 = ~(class392.field5407 % 20) > -11 ? 16711680 : 16776960;
                }
                if (class449.field6389[var14] == 7) {
                    var20 = ~(class392.field5407 % 20) <= -11 ? 65535 : 255;
                }
                if (~class449.field6389[var14] == -9) {
                    var20 = ~(class392.field5407 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class449.field6389[var14] == 9) {
                    int var21 = 150 - class449.field6394[var14];
                    if (var21 >= 50) {
                        if (var21 >= 100) {
                            if (~var21 > -151) {
                                var20 = 65280 - -((var21 + -100) * 5);
                            }
                        } else {
                            var20 = -((var21 + -50) * 327680) + 16776960;
                        }
                    } else {
                        var20 = var21 * 1280 + 16711680;
                    }
                }
                if (~class449.field6389[var14] == -11) {
                    int var22 = 150 - class449.field6394[var14];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 33095935 - var22 * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 + -100) * 327680 + -((var22 + -100) * 5) + 255;
                    }
                }
                if (class449.field6389[var14] == 11) {
                    int var23 = -class449.field6394[var14] + 150;
                    if (~var23 <= -51) {
                        if (~var23 <= -101) {
                            if (var23 < 150) {
                                var20 = 49545215 - var23 * 327680;
                            }
                        } else {
                            var20 = var23 * 327685 + -16384250 + 65280;
                        }
                    } else {
                        var20 = -(var23 * 327685) + 16777215;
                    }
                }
                int var24 = var20 | -16777216;
                if (~class449.field6393[var14] == -1) {
                    class408.field5584.method1385(var19, var24, -16777216, arg2 - -var16, arg4 - -var15, 1453761640);
                }
                if (~class449.field6393[var14] == -2) {
                    class408.field5584.method1387(-16777216, arg4 + var15, true, var19, arg2 - -var16, class392.field5407, var24);
                }
                if (~class449.field6393[var14] == -3) {
                    class408.field5584.method1382(-16777216, (byte) 78, var19, arg2 + var16, var24, class392.field5407, arg4 + var15);
                }
                if (~class449.field6393[var14] == -4) {
                    class408.field5584.method1381(arg4 + var15, true, arg2 + var16, var24, -class449.field6394[var14] + 150, class392.field5407, -16777216, var19);
                }
                if (~class449.field6393[var14] == -5) {
                    int var25 = (-class449.field6394[var14] + 150) * (100 + class402.field5516.method1354((byte) -103, var19)) / 150;
                    class374.field5152.method443(var15 + -50 + arg4, arg2, arg4 + var15 + 50, arg2 + arg6);
                    class408.field5584.method1383(var24, false, arg2 + var16, var19, -16777216, -var25 + 50 + arg4 + var15);
                    class374.field5152.method453(arg4, arg2, arg0 + arg4, arg2 + arg6);
                }
                if (~class449.field6393[var14] == -6) {
                    int var26 = -class449.field6394[var14] + 150;
                    int var27 = 0;
                    if (var26 >= 25) {
                        if (~var26 < -126) {
                            var27 = var26 + -125;
                        }
                    } else {
                        var27 = var26 + -25;
                    }
                    int var28 = class402.field5516.field2888 - -class402.field5516.field2883;
                    class374.field5152.method443(arg4, arg2 - -var16 + -1 + -var28, arg0 + arg4, var16 + 5 + arg2);
                    class408.field5584.method1385(var19, var24, -16777216, arg2 + var16 - -var27, arg4 - -var15, 1453761640);
                    class374.field5152.method453(arg4, arg2, arg0 + arg4, arg2 + arg6);
                }
            } else {
                class408.field5584.method1385(var19, -256, -16777216, arg2 + var16, arg4 + var15, 1453761640);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V", line = 726)
    public final void method138(int arg0, byte arg1) {
        if (arg1 == -63) {
            ++field5301;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 739)
    public final void method136(int arg0) {
        if (arg0 != -23413) {
            field5302 = null;
        }
        ++field5297;
        while (super.field197 != super.field196) {
            this.method2348(arg0 ^ -23349);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 758)
    public static void method2350(boolean arg0) {
        if (!arg0) {
            method2350(true);
        }
        field5300 = null;
        field5298 = null;
        field5289 = null;
        field5302 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILwr;)V", line = 772)
    public final void method137(int arg0, class52 arg1) {
        if (arg0 >= -117) {
            this.field5294 = null;
        }
        --super.field197;
        ++field5296;
        if (~super.field197 > -1) {
            super.field197 = 4999;
        }
        super.field205[super.field197] = 21;
        super.field204[super.field197] = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 802)
    public final void method142(byte arg0, int arg1) {
        ++field5290;
        super.field205[super.field196] = (byte) arg1;
        ++super.field196;
        if (arg0 != -83) {
            this.method2348(-55);
        }
        if (super.field196 >= 5000) {
            super.field196 = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FIZLij;B)V", line = 818)
    public final void method141(float arg0, int arg1, boolean arg2, class241 arg3, byte arg4) {
        super.field205[super.field196] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
        ++field5293;
        super.field204[super.field196] = arg3;
        if (arg4 != 63) {
            this.method138(103, (byte) 10);
        }
        super.field201[super.field196] = arg0;
        ++super.field196;
        if (~super.field196 <= -5001) {
            super.field196 = 0;
        }
    }
}

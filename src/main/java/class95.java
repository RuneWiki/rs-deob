import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class95 extends class243 {

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    private int field1646 = 585;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Lub;")
    public static class227 field1647 = class257.method1749("Okay", 17263);

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Z")
    public static boolean field1645 = true;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Lnh;")
    public static class57 field1648;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIIIIIII[BI[I)V")
    public static final void method584(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int[] arg10) {
        if (!arg0) {
            int var11 = ((arg3 & 65280) * arg6 & 16711680) + (-16711936 & (16711935 & arg3) * arg6) >> 8;
            int var12 = -arg6 + 256;
            for (int var13 = -arg7; var13 < 0; ++var13) {
                for (int var14 = -arg9; var14 < 0; ++var14) {
                    if (~arg8[arg2++] == -1) {
                        ++arg4;
                    } else {
                        int var15 = arg10[arg4];
                        arg10[arg4++] = (class76.method446(-16711936, var12 * class76.method446(var15, 16711935)) + class76.method446(var12 * class76.method446(65280, var15), 16711680) >> 8) + var11;
                    }
                }
                arg2 += arg1;
                arg4 += arg5;
            }
            ++field1644;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
    public static final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1651;
        class195.field3318 = 0;
        for (int var7 = -1; class71.field1254 + class146.field2512 > var7; ++var7) {
            class4 var23;
            if (~var7 == 0) {
                var23 = class216.field3639;
            } else if (~var7 <= ~class146.field2512) {
                var23 = class220.field3715[class146.field2517[-class146.field2512 + var7]];
            } else {
                var23 = class27.field446[class15.field278[var7]];
            }
            if (var23 != null && var23.method14((byte) -35)) {
                if (var23 instanceof class195) {
                    class147 var24 = ((class195) var23).field3315;
                    if (var24.field2563 != null) {
                        var24 = var24.method933(arg3 + 29877);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class146.field2512 <= var7) {
                    class147 var25 = ((class195) var23).field3315;
                    if (var25.field2563 != null) {
                        var25 = var25.method933(29882);
                    }
                    if (var25.field2573 >= 0 && ~var25.field2573 > ~class67.field1214.length) {
                        class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, 15 + var23.method13(arg3 + -6));
                        if (class38.field642 > -1) {
                            class67.field1214[var25.field2573].method787(arg4 - (-class38.field642 + 12), class71.field1249 + arg2 + -30);
                        }
                    }
                    class190[] var26 = class229.field3994;
                    for (int var27 = 0; var26.length > var27; ++var27) {
                        class190 var28 = var26[var27];
                        if (var28 != null && var28.field3226 == 1 && class146.field2517[var7 - class146.field2512] == var28.field3221 && ~(class253.field4393 % 20) > -11) {
                            class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, 15 + var23.method13(-1));
                            if (~class38.field642 < 0) {
                                class228.field3978[var28.field3220].method787(class38.field642 + arg4 + -12, arg2 - (-class71.field1249 - -28));
                            }
                        }
                    }
                } else {
                    int var29 = 30;
                    class225 var30 = (class225) var23;
                    if (~var30.field3796 != 0 || ~var30.field3811 != 0) {
                        class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, var23.method13(-1) - -15);
                        if (class38.field642 > -1) {
                            if (~var30.field3796 != 0) {
                                class168.field2821[var30.field3796].method787(class38.field642 + -12 + arg4, arg2 - -class71.field1249 + -var29);
                                var29 += 25;
                            }
                            if (~var30.field3811 != 0) {
                                class67.field1214[var30.field3811].method787(class38.field642 + -12 + arg4, class71.field1249 + arg2 + -var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        class190[] var31 = class229.field3994;
                        for (int var32 = 0; ~var31.length < ~var32; ++var32) {
                            class190 var33 = var31[var32];
                            if (var33 != null && ~var33.field3226 == -11 && ~class15.field278[var7] == ~var33.field3221) {
                                class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, var23.method13(-1) + 15);
                                if (~class38.field642 < 0) {
                                    class228.field3978[var33.field3220].method787(class38.field642 + arg4 + -12, arg2 - -class71.field1249 + -var29);
                                }
                            }
                        }
                    }
                }
                if (var23.field88 != null && (var7 >= class146.field2512 || ~class76.field1331 == -1 || class76.field1331 == 3 || ~class76.field1331 == -2 && class238.method1586((byte) 118, ((class225) var23).field3819))) {
                    class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, var23.method13(-1));
                    if (~class38.field642 < 0 && ~class195.field3318 > ~class43.field706) {
                        class43.field724[class195.field3318] = class260.field4532.method1246(var23.field88) / 2;
                        class43.field715[class195.field3318] = class260.field4532.field3331;
                        class43.field720[class195.field3318] = class38.field642;
                        class43.field712[class195.field3318] = class71.field1249;
                        class43.field707[class195.field3318] = var23.field40;
                        class43.field708[class195.field3318] = var23.field43;
                        class43.field709[class195.field3318] = var23.field71;
                        class43.field704[class195.field3318] = var23.field88;
                        ++class195.field3318;
                    }
                }
                if (~class253.field4393 > ~var23.field104) {
                    class33.method173(var23, arg5 >> 1, arg6 >> 1, 1, arg0, arg1, var23.method13(-1) + 15);
                    if (class38.field642 > -1) {
                        class111.method694(class38.field642 + arg4 + -15, class71.field1249 + -3 + arg2, var23.field77, 5, 65280);
                        class111.method694(arg4 - -class38.field642 + -15 - -var23.field77, arg2 - 3 + class71.field1249, 30 - var23.field77, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; ++var34) {
                    if (class253.field4393 < var23.field75[var34]) {
                        class33.method173(var23, arg5 >> 1, arg6 >> 1, arg3 + -4, arg0, arg1, var23.method13(-1) / 2);
                        if (~class38.field642 < 0) {
                            if (~var34 == -2) {
                                class71.field1249 -= 20;
                            }
                            if (~var34 == -3) {
                                class71.field1249 -= 10;
                                class38.field642 -= 15;
                            }
                            if (var34 == 3) {
                                class38.field642 += 15;
                                class71.field1249 -= 10;
                            }
                            class10.field204[var23.field79[var34]].method787(arg4 + -12 + class38.field642, arg2 + -12 + class71.field1249);
                            class56.field1024.method1243(class204.method1303(var23.field56[var34], 1), class38.field642 + arg4 + -1, class71.field1249 + 3 + arg2, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 0;
        if (arg3 == 5) {
            while (~class195.field3318 < ~var8) {
                int var9 = class43.field720[var8];
                int var10 = class43.field712[var8];
                int var11 = class43.field724[var8];
                boolean var12 = true;
                int var13 = class43.field715[var8];
                while (var12) {
                    var12 = false;
                    for (int var22 = 0; var22 < var8; ++var22) {
                        if (var10 + 2 > class43.field712[var22] + -class43.field715[var22] && var10 - var13 < class43.field712[var22] + 2 && ~(class43.field724[var22] + class43.field720[var22]) < ~(var9 - var11) && ~(class43.field720[var22] + -class43.field724[var22]) > ~(var9 + var11) && class43.field712[var22] - class43.field715[var22] < var10) {
                            var10 = class43.field712[var22] + -class43.field715[var22];
                            var12 = true;
                        }
                    }
                }
                class38.field642 = class43.field720[var8];
                class71.field1249 = class43.field712[var8] = var10;
                class227 var14 = class43.field704[var8];
                if (~class235.field4067 != -1) {
                    class260.field4532.method1243(var14, class38.field642 + arg4, class71.field1249 + arg2, 16776960, 0);
                } else {
                    int var15 = 16776960;
                    if (class43.field707[var8] < 6) {
                        var15 = class86.field1490[class43.field707[var8]];
                    }
                    if (class43.field707[var8] == 6) {
                        var15 = ~(class87.field1508 % 20) > -11 ? 16711680 : 16776960;
                    }
                    if (~class43.field707[var8] == -8) {
                        var15 = ~(class87.field1508 % 20) > -11 ? 255 : 65535;
                    }
                    if (class43.field707[var8] == 8) {
                        var15 = ~(class87.field1508 % 20) > -11 ? 45056 : 8454016;
                    }
                    if (~class43.field707[var8] == -10) {
                        int var16 = 150 - class43.field709[var8];
                        if (var16 < 50) {
                            var15 = var16 * 1280 + 16711680;
                        } else if (var16 >= 100) {
                            if (~var16 > -151) {
                                var15 = var16 * 5 - -64780;
                            }
                        } else {
                            var15 = -((var16 + -50) * 327680) + 16776960;
                        }
                    }
                    if (class43.field707[var8] == 10) {
                        int var17 = -class43.field709[var8] + 150;
                        if (var17 < 50) {
                            var15 = var17 * 5 + 16711680;
                        } else if (~var17 <= -101) {
                            if (~var17 > -151) {
                                var15 = (var17 - 100) * 327680 + (255 - var17 * 5) + 500;
                            }
                        } else {
                            var15 = -(var17 * 327680) - -33095935;
                        }
                    }
                    if (class43.field707[var8] == 11) {
                        int var18 = -class43.field709[var8] + 150;
                        if (~var18 <= -51) {
                            if (~var18 > -101) {
                                var15 = var18 * 327685 + -16318970;
                            } else if (var18 < 150) {
                                var15 = -(var18 * 327680) + 16777215 + 32768000;
                            }
                        } else {
                            var15 = 16777215 - var18 * 327685;
                        }
                    }
                    if (class43.field708[var8] == 0) {
                        class260.field4532.method1243(var14, arg4 - -class38.field642, class71.field1249 + arg2, var15, 0);
                    }
                    if (class43.field708[var8] == 1) {
                        class260.field4532.method1239(var14, class38.field642 + arg4, arg2 - -class71.field1249, var15, 0, class87.field1508);
                    }
                    if (class43.field708[var8] == 2) {
                        class260.field4532.method1248(var14, class38.field642 + arg4, class71.field1249 + arg2, var15, 0, class87.field1508);
                    }
                    if (~class43.field708[var8] == -4) {
                        class260.field4532.method1251(var14, class38.field642 + arg4, class71.field1249 + arg2, var15, 0, class87.field1508, 150 - class43.field709[var8]);
                    }
                    if (~class43.field708[var8] == -5) {
                        int var19 = (-class43.field709[var8] + 150) * (100 + class260.field4532.method1246(var14)) / 150;
                        class111.method695(class38.field642 + arg4 - 50, arg2, arg4 - (-class38.field642 - 50), arg2 + arg6);
                        class260.field4532.method1262(var14, class38.field642 + 50 + arg4 + -var19, class71.field1249 + arg2, var15, 0);
                        class111.method704(arg4, arg2, arg4 - -arg5, arg2 + arg6);
                    }
                    if (class43.field708[var8] == 5) {
                        int var20 = -class43.field709[var8] + 150;
                        int var21 = 0;
                        class111.method695(arg4, class71.field1249 + arg2 - (class260.field4532.field3331 + 1), arg4 + arg5, class71.field1249 + arg2 - -5);
                        if (~var20 <= -26) {
                            if (var20 > 125) {
                                var21 = var20 + -125;
                            }
                        } else {
                            var21 = var20 + -25;
                        }
                        class260.field4532.method1243(var14, class38.field642 + arg4, class71.field1249 - -var21 + arg2, var15, 0);
                        class111.method704(arg4, arg2, arg4 + arg5, arg2 - -arg6);
                    }
                }
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1645 = true;
        }
        if (arg2 == 0) {
            this.field1646 = arg0.method1447(0);
        }
        ++field1652;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1643;
        int var3 = 117 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = class148.field2582[arg1];
            for (int var6 = 0; var6 < class212.field3586; ++var6) {
                int var7 = class212.field3585[var6];
                if (this.field1646 < var7 && -this.field1646 + 4096 > var7 && ~(-this.field1646 + 2048) > ~var5 && ~(this.field1646 + 2048) < ~var5) {
                    int var8 = -var7 + 2048;
                    int var9 = ~var8 > -1 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field1646 + 2048);
                    var4[var6] = -var11 + 4096;
                } else if (~(2048 - this.field1646) > ~var7 && var7 < this.field1646 + 2048) {
                    int var12 = var5 + -2048;
                    int var13 = ~var12 <= -1 ? var12 : -var12;
                    int var14 = var13 - this.field1646;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field1646 + 2048);
                } else if (~var5 <= ~this.field1646 && var5 <= -this.field1646 + 4096) {
                    if (var7 >= this.field1646 && ~(-this.field1646 + 4096) <= ~var7) {
                        var4[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = ~var16 > -1 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (2048 - this.field1646);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 > -1 ? -var20 : var20;
                    int var22 = var21 - this.field1646;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field1646 + 2048);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1648 = null;
        field1647 = null;
        if (arg0 != 7275) {
            method585(105, -82, -26, -83, -118, -81, 19);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B[Lub;)[Lub;")
    public static final class227[] method587(byte arg0, class227[] arg1) {
        if (arg0 >= -19) {
            return null;
        } else {
            ++field1642;
            class227[] var2 = new class227[5];
            for (int var3 = 0; ~var3 > -6; ++var3) {
                var2[var3] = class76.method445((byte) 98, new class227[] { class204.method1303(var3, 1), class165.field2770 });
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = class76.method445((byte) -117, new class227[] { var2[var3], arg1[var3] });
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, true);
    }
}

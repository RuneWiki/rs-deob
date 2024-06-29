import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class436 extends class563 implements class302 {

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "Z")
    private boolean field6639 = false;

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "Lfb;")
    public class626 field6630;

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "Z")
    private boolean field6637;

    @OriginalMember(owner = "client!maa", name = "U", descriptor = "Los;")
    public static class408 field6648 = new class408(1);

    @OriginalMember(owner = "client!maa", name = "bb", descriptor = "Lrl;")
    public static class672 field6655 = new class672(15, 3);

    @OriginalMember(owner = "client!maa", name = "cb", descriptor = "Z")
    public static boolean field6656 = false;

    @OriginalMember(owner = "client!maa", name = "A", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!maa", name = "K", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!maa", name = "M", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!maa", name = "N", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!maa", name = "O", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!maa", name = "P", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!maa", name = "Q", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!maa", name = "R", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!maa", name = "T", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!maa", name = "V", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!maa", name = "W", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!maa", name = "X", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!maa", name = "Y", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!maa", name = "Z", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!maa", name = "ab", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!maa", name = "S", descriptor = "Lll;")
    private class334 field6646;

    // $FF: synthetic field
    @OriginalMember(owner = "client!maa", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field6657;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field6650;
        class55 var5 = this.field6630.method3647(arg2, false, arg0, -1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return !class534.field7778 ? var5.method648(arg3, arg1, var6, false) : var5.method598(arg3, arg1, var6, false, class609.field8652);
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(ILr;)Lod;")
    public final class468 method403(int arg0, class167 arg1) {
        ++field6644;
        class55 var3 = this.field6630.method3647(arg1, false, true, -1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class393 var4 = arg1.method339();
            var4.method503(super.field9696, super.field9701, super.field9705);
            if (arg0 > -38) {
                return null;
            } else {
                class468 var5 = null;
                if (this.field6637) {
                    var5 = class429.method2720(1, 0);
                }
                int var6 = super.field9696 >> 9;
                int var7 = super.field9705 >> 9;
                this.field6630.method3646(var3, var6, var7, var7, true, arg1, var6, (byte) -115, var4);
                if (class534.field7778) {
                    var3.method613(var4, var5 == null ? null : var5.field6948[0], class609.field8652, 0);
                } else {
                    var3.method606(var4, var5 == null ? null : var5.field6948[0], 0);
                }
                if (this.field6630.field8836 != null) {
                    class79 var8 = this.field6630.field8836.method3250();
                    if (class534.field7778) {
                        arg1.method320(var8, class609.field8652);
                    } else {
                        arg1.method354(var8);
                    }
                }
                this.field6639 = var3.method614() || this.field6630.field8836 != null;
                if (this.field6646 == null) {
                    this.field6646 = class166.method1342(var3, super.field9705, super.field9696, super.field9701, 30640);
                } else {
                    class251.method1789(this.field6646, -127, super.field9701, super.field9696, var3, super.field9705);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "(I)V")
    public static void method2768(int arg0) {
        if (arg0 <= 5) {
            field6656 = false;
        }
        field6655 = null;
        field6648 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lmg;I)I")
    public static final int method2769(class134 arg0, int arg1) {
        int var2 = -42 % ((10 - arg1) / 47);
        ++field6647;
        if (class134.field2188 != arg0) {
            if (class134.field2189 != arg0) {
                if (class134.field2195 != arg0) {
                    if (class134.field2197 == arg0) {
                        return 5121;
                    } else if (class134.field2198 != arg0) {
                        if (class134.field2199 != arg0) {
                            if (class134.field2200 != arg0) {
                                if (class134.field2201 == arg0) {
                                    return 5126;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 5131;
                            }
                        } else {
                            return 5125;
                        }
                    } else {
                        return 5123;
                    }
                } else {
                    return 5124;
                }
            } else {
                return 5122;
            }
        } else {
            return 5120;
        }
    }

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "(I)Z")
    public final boolean method414(int arg0) {
        ++field6641;
        if (arg0 != 0) {
            field6654 = -93;
        }
        return false;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I")
    public final int method394(byte arg0) {
        int var2 = -112 % ((arg0 - -14) / 51);
        ++field6636;
        return this.field6630.field8854;
    }

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "(B)Z")
    public final boolean method398(byte arg0) {
        ++field6642;
        if (arg0 >= -92) {
            field6648 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
    public final void method409(int arg0) {
        ++field6652;
        if (arg0 != -7728) {
            field6648 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "(I)Z")
    public final boolean method402(int arg0) {
        ++field6645;
        return arg0 != 623404585 ? false : this.field6639;
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(B)V")
    public final void method404(byte arg0) {
        if (arg0 >= -40) {
            field6656 = true;
        }
        ++field6649;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "(B)I")
    public final int method406(byte arg0) {
        if (arg0 < 108) {
            return 59;
        } else {
            ++field6640;
            return this.field6630.method3651(30556);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lr;Z)V")
    public final void method412(class167 arg0, boolean arg1) {
        if (!arg1) {
            ++field6653;
            class55 var3 = this.field6630.method3647(arg0, true, true, -1, 262144);
            if (var3 != null) {
                int var4 = super.field9696 >> 9;
                int var5 = super.field9705 >> 9;
                class393 var6 = arg0.method339();
                var6.method503(super.field9696, super.field9701, super.field9705);
                this.field6630.method3646(var3, var4, var5, var5, false, arg0, var4, (byte) -121, var6);
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)I")
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            return -79;
        } else {
            ++field6635;
            return this.field6630.field8846;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIILr;ZILpn;)V")
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        if (arg2 == 1) {
            ++field6632;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILr;)Z")
    public static final boolean method2770(int arg0, int arg1, class167 arg2) {
        ++field6634;
        int var3 = (class275.field4426 + -104) / 2;
        int var4 = (class417.field6374 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var57 = var4; ~(var4 + 104) < ~var57; ++var57) {
                for (int var58 = arg0; var58 <= 3; ++var58) {
                    if (class612.method3563(-123, var57, arg0, var58, var6)) {
                        int var59 = var58;
                        if (class437.method2774(true, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class613.method3568(var57, -101, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class532.field7752 = arg2.method306(var7, 0, 512, 512, 512);
            class294.method2060(112);
            int var9 = -16777216 | (238 - (-((int) (Math.random() * 20.0D)) + 10) << 8) + (238 + (int) (20.0D * Math.random()) - 10 << 16) + arg1 + (int) (Math.random() * 20.0D) + 238;
            int var10 = (1033633536 | 228 + (int) (Math.random() * 20.0D)) << 16;
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class547.field7965 + 2 + 1][class547.field7965 - -3];
            for (int var13 = var3; var3 + 104 > var13; var13 += class547.field7965) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class547.field7965) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (~var13 < -1) {
                        var39 = var13 - 1;
                        var37 += 4;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class547.field7965 + var13;
                    if (~var41 > -105) {
                        ++var41;
                    }
                    int var42 = var36 - -class547.field7965;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg2.method352(0, 0, class547.field7965 * 4 + var37, class547.field7965 * 4 + var38);
                    arg2.method121(-16777216);
                    for (int var43 = arg0; var43 <= 3; ++var43) {
                        for (int var50 = 0; ~var50 >= ~class547.field7965; ++var50) {
                            for (int var56 = 0; var56 <= class547.field7965; ++var56) {
                                var12[var50][var56] = class612.method3563(-128, var40 + var56, arg0, var43, var39 + var50);
                            }
                        }
                        class491.field7187[var43].method486(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class11.field192) {
                            for (int var51 = -4; class547.field7965 > var51; ++var51) {
                                for (int var52 = -4; class547.field7965 > var52; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (var53 >= var3 && ~var54 <= ~var4 && class612.method3563(-124, var54, arg0, var43, var53)) {
                                        int var55 = var43;
                                        if (class437.method2774(true, var53, var54)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class404.method2591(arg1 + -99, var10, var54, var53, var9, arg2, var55, (-var52 + class547.field7965) * 4 + var38 + -4, var51 * 4 + var37);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class11.field192) {
                        class23 var44 = class10.field172[arg0];
                        for (int var45 = 0; ~var45 > ~class547.field7965; ++var45) {
                            for (int var46 = 0; ~var46 > ~class547.field7965; ++var46) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field351[-var44.field361 + var47][-var44.field367 + var48];
                                if ((1076101120 & var49) == 0) {
                                    if ((var49 & 8388608) == 0) {
                                        if (~(33554432 & var49) != -1) {
                                            arg2.method1347(var37 - -(var45 * 4) - -3, (-var46 + class547.field7965) * 4 + (var38 - 4), 4, 121, -1713569622);
                                        } else if ((134217728 & var49) == 0) {
                                            if ((var49 & 536870912) != 0) {
                                                arg2.method1347(var45 * 4 + var37, (-var46 + class547.field7965) * 4 + var38 + -4, 4, 127, -1713569622);
                                            }
                                        } else {
                                            arg2.method1348(-1713569622, 4, var45 * 4 + var37, 3, var38 - -((-var46 + class547.field7965) * 4) + -4 + 3);
                                        }
                                    } else {
                                        arg2.method1348(-1713569622, 4, var45 * 4 + var37, 3, (-var46 + class547.field7965) * 4 + var38 + -4);
                                    }
                                } else {
                                    arg2.method1355((class547.field7965 - var46) * 4 + var38 + -4, var45 * 4 + var37, 4, 4, -1713569622, 1);
                                }
                            }
                        }
                    }
                    arg2.method335(var37, var38, class547.field7965 * 4, class547.field7965 * 4, var11, 2);
                    class532.field7752.method1081((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class547.field7965 * 4), class547.field7965 * 4, class547.field7965 * 4, var37, var38);
                }
            }
            arg2.method281();
            arg2.method121(-16777215);
            class211.method1601(-20030);
            class532.field7744 = 0;
            class527.field7696.method3474(22090);
            if (!class11.field192) {
                for (int var14 = var3; ~var14 > ~(var3 + 104); ++var14) {
                    for (int var20 = var4; ~var20 > ~(var4 + 104); ++var20) {
                        for (int var21 = arg0; var21 <= arg0 + 1 && ~var21 >= -4; ++var21) {
                            if (class612.method3563(-125, var20, arg0, var21, var14)) {
                                class302 var22 = (class302) class643.method3728(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class302) class618.method3589(var21, var14, var20, field6657 != null ? field6657 : (field6657 = method2771("ofa")));
                                }
                                if (var22 == null) {
                                    var22 = (class302) class681.method3880(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class302) class351.method2360(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class698 var23 = class213.field3537.method94(var22.method394((byte) -83), (byte) -42);
                                    if (!var23.field9770 || class609.field8649) {
                                        int var24 = var23.field9848;
                                        if (var23.field9826 != null) {
                                            for (int var25 = 0; ~var23.field9826.length < ~var25; ++var25) {
                                                if (~var23.field9826[var25] != 0) {
                                                    class698 var26 = class213.field3537.method94(var23.field9826[var25], (byte) -42);
                                                    if (~var26.field9848 <= -1) {
                                                        var24 = var26.field9848;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class257 var28 = class498.field7303.method3286(29982, var24);
                                                if (var28 != null && var28.field4111) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class10.field172[var21].field351;
                                                int var32 = class10.field172[var21].field361;
                                                int var33 = class10.field172[var21].field367;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && ~var29 < ~var3 && var14 + -3 < var29 && (2883848 & var31[-var32 + -1 + var29][-var33 + var30]) == 0) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && var3 - 1 + 104 > var29 && var29 < var14 + 3 && ~(2883968 & var31[-var32 + 1 + var29][-var33 + var30]) == -1) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && ~var30 < ~var4 && var30 > var20 + -3 && ~(2883842 & var31[var29 - var32][var30 + -1 + -var33]) == -1) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && var4 + 104 + -1 > var30 && ~var30 > ~(var20 + 3) && (2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class41.field572[class532.field7744] = var23.field9825;
                                            class194.field3218[class532.field7744] = var29;
                                            class518.field7506[class532.field7744] = var30;
                                            ++class532.field7744;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class26.field417 != null) {
                    class456.field6845.field1555 = 1;
                    class498.field7303.method3287(9729, 1024, 64);
                    for (int var15 = 0; ~class26.field417.field8438 < ~var15; ++var15) {
                        int var16 = class26.field417.field8439[var15];
                        if (~(var16 >> 28) == ~class567.field8141.field9695) {
                            int var17 = ((268432183 & var16) >> 14) - class612.field8702;
                            int var18 = (var16 & 16383) + -class626.field8855;
                            if (var17 >= 0 && ~class275.field4426 < ~var17 && ~var18 <= -1 && class417.field6374 > var18) {
                                class527.field7696.method3463((byte) -87, new class160(var15));
                            } else {
                                class257 var19 = class498.field7303.method3286(29982, class26.field417.field8433[var15]);
                                if (var19.field4072 != null && ~(var19.field4108 + var17) <= -1 && class275.field4426 > var17 - -var19.field4107 && var19.field4076 + var18 >= 0 && class417.field6374 > var19.field4091 + var18) {
                                    class527.field7696.method3463((byte) -87, new class160(var15));
                                }
                            }
                        }
                    }
                    class498.field7303.method3287(9729, 128, 64);
                    class456.field6845.field1555 = 2;
                    class456.field6845.method929(arg1 ^ -67);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)I")
    public final int method401(byte arg0) {
        ++field6643;
        if (arg0 < 50) {
            this.field6630 = null;
        }
        return this.field6630.field8837;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILr;)V")
    public final void method396(int arg0, class167 arg1) {
        ++field6631;
        if (arg0 != -32646) {
            this.field6630 = null;
        }
        this.field6630.method3652((byte) 71, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIII)V")
    public class436(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class388.method2523(-114, arg8, arg9));
        this.field6630 = new class626(arg0, arg1, arg8, arg9, super.field9695, arg3, this, arg7, arg10);
        this.field6637 = ~arg1.field9830 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLr;)Lll;")
    public final class334 method408(byte arg0, class167 arg1) {
        if (arg0 != 111) {
            field6654 = -74;
        }
        ++field6638;
        return this.field6646;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Z")
    public final boolean method395(int arg0) {
        ++field6633;
        if (arg0 != -29400) {
            method2770(120, 72, (class167) null);
        }
        return this.field6630.method3657((byte) -117);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lr;I)V")
    public final void method407(class167 arg0, int arg1) {
        ++field6629;
        this.field6630.method3648((byte) -119, arg0);
        int var3 = -67 % ((arg1 - -10) / 40);
    }

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "(I)I")
    public final int method393(int arg0) {
        if (arg0 != 0) {
            return -41;
        } else {
            ++field6651;
            return this.field6630.method3654(-125);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2771(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

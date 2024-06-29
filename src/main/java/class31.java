import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class31 extends class273 {

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    private int field516 = 4;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    private int field522 = 4;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public static final void method265(int arg0, int arg1) {
        if (class4.field57 == null || class4.field57.length < arg0) {
            class4.field57 = new int[arg0];
        }
        if (arg1 != -28516) {
            method272(false, 42, -54, 101, 127, 56, false);
        }
        ++field517;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
    public static final void method266(int arg0, byte arg1) {
        ++field521;
        class23 var2 = class91.method694(arg0, 8, 120);
        var2.method183(-85);
        if (arg1 >= -70) {
            method269((class124) null, 82, -55, 33, -116, true);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZC)Z")
    public static final boolean method267(boolean arg0, char arg1) {
        ++field515;
        if (!arg0) {
            field524 = 55;
        }
        return ~arg1 <= -66 && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field526;
        if (arg0) {
            this.field522 = -18;
        }
        int[] var3 = super.field4359.method387((byte) 118, arg1);
        if (super.field4359.field833) {
            int var4 = class26.field458 / this.field522;
            int var5 = class67.field1129 / this.field516;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1850(class67.field1129 * var6 / var5, 0, (byte) 31);
            } else {
                var7 = this.method1850(0, 0, (byte) -127);
            }
            for (int var8 = 0; ~var8 > ~class26.field458; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class26.field458 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)V")
    public static final void method268(byte arg0, int arg1, int arg2) {
        ++field523;
        if (class131.field2181 > 0) {
            class82.method661(class131.field2181, (byte) 44);
            class131.field2181 = 0;
        }
        if (arg0 != 89) {
            method274(118, 44, 102);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = class63.field1049 * arg1;
        int var6 = 0;
        for (int var7 = 1; ~var7 > ~(var3 + -1); ++var7) {
            int var8 = (-var7 + var3) * class10.field130[var7] / var3;
            if (~var8 > -1) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; ++var9) {
                int var11 = class81.field1351[var4++];
                int var12 = class63.field1048[var5++ + arg2];
                if (~var11 == -1) {
                    class89.field1426.field244[var6++] = var12;
                } else {
                    int var13 = -var11 - -238;
                    int var14 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class42.field775[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class89.field1426.field244[var6++] = class64.method498(16711680, var14 * class64.method498(var15, 65280) + class64.method498(var12, 65280) * var13) + class64.method498(class64.method498(16711935, var15) * var14 + class64.method498(16711935, var12) * var13, -16711936) >> 8;
                }
            }
            for (int var10 = 0; var8 > var10; ++var10) {
                class89.field1426.field244[var6++] = class63.field1048[var5++ + arg2];
            }
            var5 += class63.field1049 - 128;
        }
        class89.field1426.method111(arg2, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lsb;IIIIZ)V")
    public static final void method269(class124 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == 0) {
            class138.field2311 = 1;
            ++field519;
            class167.field2753 = 10000;
            client.field4563 = arg4;
            class293.field4652 = arg5;
            class225.field3579 = arg0;
            class47.field870 = arg3;
            class257.field4086 = arg2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static final void method270(int arg0) {
        if (class23.field360 != null) {
            class23.field360.method294((byte) 116);
            class23.field360 = null;
        }
        ++field512;
        class270.method1840((byte) -115);
        class242.method1604();
        for (int var1 = 0; var1 < 4; ++var1) {
            class141.field2352[var1].method84(arg0 ^ -31465);
        }
        class229.method1525(false, arg0 ^ 31676);
        System.gc();
        class32.method276(12543, 2);
        class178.field2968 = false;
        class235.field3726 = -1;
        class11.method77(true, -114);
        class170.field2787 = 0;
        class33.field551 = 0;
        class256.field4082 = 0;
        class111.field1716 = 0;
        class76.field1239 = false;
        for (int var2 = 0; ~var2 > ~class288.field4608.length; ++var2) {
            class288.field4608[var2] = null;
        }
        class7.field88 = 0;
        class144.field2386 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class191.field3129[var3] = null;
            class128.field2112[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class3.field45[var4] = null;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var6 = 0; ~var6 > -105; ++var6) {
                for (int var7 = 0; var7 < 104; ++var7) {
                    class2.field23[var5][var6][var7] = null;
                }
            }
        }
        if (arg0 != 31377) {
            method270(-127);
        }
        class278.method1872((byte) 36);
        class167.field2757 = 0;
        class174.method1247(false);
        class256.method1710(arg0 + -47831, true);
        try {
            class120.method877(class205.field3294.field1291, 25718, "loggedout");
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lsb;ILsb;Lsb;Lhi;)Z")
    public static final boolean method271(class124 arg0, int arg1, class124 arg2, class124 arg3, class25 arg4) {
        ++field518;
        class225.field3580 = arg2;
        if (arg1 != 21588) {
            method269((class124) null, -17, 47, -33, -80, true);
        }
        class192.field3137 = arg0;
        class180.field2996 = arg4;
        class155.field2532 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 <= 122) {
            method273(67, -54, 14, -103, -54, -84, -54);
        }
        ++field525;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int var4 = class26.field458 / this.field522;
            int var5 = class67.field1129 / this.field516;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1853(0, 0, (byte) 8);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1853(0, class67.field1129 * var7 / var5, (byte) 8);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; ~var14 > ~class26.field458; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class26.field458 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var11[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method272(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field514;
        if (arg4 == 3) {
            method272(true, -1, -1, -53, class179.field2990, arg5, true);
        } else {
            Container var7;
            if (class201.field3273 != null) {
                var7 = class201.field3273;
            } else if (class207.field3327 == null) {
                var7 = class205.field3294.field1291;
            } else {
                var7 = class207.field3327;
            }
            class205.field3297 = var7.getSize().width;
            if (arg3 < -3) {
                class56.field991 = var7.getSize().height;
                if (class207.field3327 == var7) {
                    Insets var8 = class207.field3327.getInsets();
                    class56.field991 -= var8.top + var8.bottom;
                    class205.field3297 -= var8.right + var8.left;
                }
                if (arg4 >= 2) {
                    class287.field4595 = 0;
                    class22.field339 = 0;
                    class33.field557 = class56.field991;
                    class137.field2301 = class205.field3297;
                } else {
                    class287.field4595 = (class205.field3297 - 765) / 2;
                    class137.field2301 = 765;
                    class22.field339 = 0;
                    class33.field557 = 503;
                }
                if (!arg6) {
                    class22.field340.setSize(class137.field2301, class33.field557);
                    if (class207.field3327 != var7) {
                        class22.field340.setLocation(class287.field4595, class22.field339);
                    } else {
                        Insets var9 = class207.field3327.getInsets();
                        class22.field340.setLocation(class287.field4595 + var9.left, class22.field339 + var9.top);
                    }
                } else {
                    class75.method599(-11987, class22.field340);
                    class245.method1625((byte) 41, class22.field340);
                    if (class35.field605 != null) {
                        class35.field605.method959(2, class22.field340);
                    }
                    class208.field3344.method162(3282);
                    class69.method538(-30739, class22.field340);
                    class197.method1345(class22.field340, -26187);
                    if (class35.field605 != null) {
                        class35.field605.method957((byte) -84, class22.field340);
                    }
                }
                if (~arg4 < -1) {
                    method272(true, -1, -1, -21, 0, arg5, true);
                } else {
                    class279.field4434 = !class9.method50(false);
                    if (~class223.field3558 != 0) {
                        class190.method1313(true, 115);
                    }
                    if (class23.field360 != null && (~class146.field2401 == -31 || ~class146.field2401 == -26)) {
                        client.method1921(112);
                    }
                    for (int var10 = 0; ~var10 > -101; ++var10) {
                        class118.field1991[var10] = true;
                    }
                    class285.field4540 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class4.field50 = 0;
        int var7 = 127 / ((arg0 - -71) / 52);
        for (int var8 = -1; var8 < class7.field88 + class144.field2386; ++var8) {
            class171 var24;
            if (~var8 != 0) {
                if (~class144.field2386 >= ~var8) {
                    var24 = class3.field45[class287.field4587[-class144.field2386 + var8]];
                } else {
                    var24 = class191.field3129[class279.field4431[var8]];
                }
            } else {
                var24 = class48.field878;
            }
            if (var24 != null && var24.method1041((byte) 115)) {
                if (var24 instanceof class139) {
                    class165 var25 = ((class139) var24).field2321;
                    if (var25.field2741 != null) {
                        var25 = var25.method1188((byte) -56);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (~var8 <= ~class144.field2386) {
                    class165 var31 = ((class139) var24).field2321;
                    if (var31.field2741 != null) {
                        var31 = var31.method1188((byte) -77);
                    }
                    if (var31.field2696 >= 0 && var31.field2696 < class151.field2467.length) {
                        int var32;
                        if (var31.field2684 == -1) {
                            var32 = var24.method1222(-24147) - -15;
                        } else {
                            var32 = var31.field2684 - -15;
                        }
                        class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, var32);
                        if (class111.field1713 > -1) {
                            class151.field2467[var31.field2696].method124(class111.field1713 + arg4 + -12, class241.field3800 + -30 + arg3);
                        }
                    }
                    class179[] var33 = class288.field4608;
                    for (int var34 = 0; var34 < var33.length; ++var34) {
                        class179 var49 = var33[var34];
                        if (var49 != null && var49.field2981 == 1 && ~class287.field4587[var8 - class144.field2386] == ~var49.field2982 && ~(class207.field3336 % 20) > -11) {
                            int var50;
                            if (var31.field2684 == -1) {
                                var50 = 15 + var24.method1222(-24147);
                            } else {
                                var50 = var31.field2684 + 15;
                            }
                            class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, var50);
                            if (class111.field1713 > -1) {
                                class223.field3555[var49.field2969].method124(arg4 + -12 + class111.field1713, arg3 + -28 + class241.field3800);
                            }
                        }
                    }
                } else {
                    int var26 = 30;
                    class213 var27 = (class213) var24;
                    if (~var27.field3443 != 0 || var27.field3418 != -1) {
                        class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, 15 + var24.method1222(-24147));
                        if (~class111.field1713 < 0) {
                            if (~var27.field3443 != 0) {
                                class250.field3982[var27.field3443].method124(class111.field1713 - 12 + arg4, -var26 + class241.field3800 + arg3);
                                var26 += 25;
                            }
                            if (var27.field3418 != -1) {
                                class151.field2467[var27.field3418].method124(arg4 - 12 + class111.field1713, -var26 + arg3 + class241.field3800);
                                var26 += 25;
                            }
                        }
                    }
                    if (~var8 <= -1) {
                        class179[] var28 = class288.field4608;
                        for (int var29 = 0; ~var29 > ~var28.length; ++var29) {
                            class179 var30 = var28[var29];
                            if (var30 != null && var30.field2981 == 10 && class279.field4431[var8] == var30.field2982) {
                                class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, 15 + var24.method1222(-24147));
                                if (class111.field1713 > -1) {
                                    class223.field3555[var30.field2969].method124(arg4 - (-class111.field1713 - -12), -var26 + arg3 + class241.field3800);
                                }
                            }
                        }
                    }
                }
                if (var24.field2840 != null && (class144.field2386 <= var8 || ~class187.field3072 == -1 || ~class187.field3072 == -4 || ~class187.field3072 == -2 && class290.method1947(((class213) var24).field3445, 0))) {
                    class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, var24.method1222(-24147));
                    if (~class111.field1713 < 0 && ~class213.field3438 < ~class4.field50) {
                        class213.field3411[class4.field50] = class23.field362.method579(var24.field2840) / 2;
                        class213.field3422[class4.field50] = class23.field362.field1220;
                        class213.field3420[class4.field50] = class111.field1713;
                        class213.field3426[class4.field50] = class241.field3800;
                        class213.field3436[class4.field50] = var24.field2898;
                        class213.field3437[class4.field50] = var24.field2867;
                        class213.field3434[class4.field50] = var24.field2864;
                        class213.field3414[class4.field50] = var24.field2840;
                        ++class4.field50;
                    }
                }
                if (~var24.field2842 < ~class207.field3336) {
                    class102 var35 = class277.field4402[1];
                    class102 var36 = class277.field4402[0];
                    int var40;
                    if (var24 instanceof class139) {
                        class139 var37 = (class139) var24;
                        class102[] var38 = (class102[]) class50.field922.method1155((long) var37.field2321.field2727, true);
                        if (var38 == null) {
                            var38 = class199.method1349(0, 0, var37.field2321.field2727, class35.field594);
                            if (var38 != null) {
                                class50.field922.method1161(var38, (byte) -127, (long) var37.field2321.field2727);
                            }
                        }
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[1];
                            var36 = var38[0];
                        }
                        class165 var39 = var37.field2321;
                        if (~var39.field2684 != 0) {
                            var40 = var39.field2684;
                        } else {
                            var40 = var24.method1222(-24147);
                        }
                    } else {
                        var40 = var24.method1222(-24147);
                    }
                    class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, var40 + 10 + var36.field1560);
                    if (~class111.field1713 < 0) {
                        int var41 = class241.field3800 + arg3 + -3;
                        int var42 = -(var36.field1564 >> 1) + arg4 + class111.field1713;
                        var36.method124(var42, var41);
                        int var43 = var24.field2904 * var36.field1564 / 255;
                        int var44 = var36.field1560;
                        class63.method487(var42, var41, var42 + var43, var41 + var44);
                        var35.method124(var42, var41);
                        class63.method477(arg4, arg3, arg4 - -arg5, arg3 + arg6);
                    }
                }
                for (int var45 = 0; ~var45 > -5; ++var45) {
                    if (~var24.field2875[var45] < ~class207.field3336) {
                        int var48;
                        if (var24 instanceof class139) {
                            class139 var46 = (class139) var24;
                            class165 var47 = var46.field2321;
                            if (~var47.field2684 == 0) {
                                var48 = var24.method1222(-24147) / 2;
                            } else {
                                var48 = var47.field2684 / 2;
                            }
                        } else {
                            var48 = var24.method1222(-24147) / 2;
                        }
                        class29.method257(arg5 >> 1, arg1, false, arg6 >> 1, var24, arg2, var48);
                        if (~class111.field1713 < 0) {
                            if (~var45 == -2) {
                                class241.field3800 -= 20;
                            }
                            if (~var45 == -3) {
                                class241.field3800 -= 10;
                                class111.field1713 -= 15;
                            }
                            if (var45 == 3) {
                                class241.field3800 -= 10;
                                class111.field1713 += 15;
                            }
                            class3.field39[var24.field2818[var45]].method124(class111.field1713 + -12 + arg4, class241.field3800 + arg3 + -12);
                            class198.field3231.method568(Integer.toString(var24.field2806[var45]), class111.field1713 + arg4 + -1, class241.field3800 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        ++field520;
        for (int var9 = 0; ~var9 > ~class4.field50; ++var9) {
            int var10 = class213.field3420[var9];
            int var11 = class213.field3411[var9];
            int var12 = class213.field3426[var9];
            boolean var13 = true;
            int var14 = class213.field3422[var9];
            while (var13) {
                var13 = false;
                for (int var23 = 0; var9 > var23; ++var23) {
                    if (class213.field3426[var23] + -class213.field3422[var23] < var12 + 2 && ~(class213.field3426[var23] + 2) < ~(-var14 + var12) && ~(class213.field3420[var23] - -class213.field3411[var23]) < ~(-var11 + var10) && class213.field3420[var23] + -class213.field3411[var23] < var10 - -var11 && class213.field3426[var23] + -class213.field3422[var23] < var12) {
                        var12 = class213.field3426[var23] + -class213.field3422[var23];
                        var13 = true;
                    }
                }
            }
            class111.field1713 = class213.field3420[var9];
            class241.field3800 = class213.field3426[var9] = var12;
            String var15 = class213.field3414[var9];
            if (class297.field4694 != 0) {
                class23.field362.method568(var15, class111.field1713 + arg4, class241.field3800 + arg3, 16776960, 0);
            } else {
                int var16 = 16776960;
                if (~class213.field3436[var9] > -7) {
                    var16 = class79.field1316[class213.field3436[var9]];
                }
                if (~class213.field3436[var9] == -7) {
                    var16 = class265.field4236 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class213.field3436[var9] == -8) {
                    var16 = ~(class265.field4236 % 20) > -11 ? 255 : 65535;
                }
                if (class213.field3436[var9] == 8) {
                    var16 = ~(class265.field4236 % 20) > -11 ? 45056 : 8454016;
                }
                if (~class213.field3436[var9] == -10) {
                    int var17 = 150 - class213.field3434[var9];
                    if (~var17 > -51) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (~var17 > -101) {
                        var16 = 16776960 - (var17 * 327680 - 16384000);
                    } else if (~var17 > -151) {
                        var16 = var17 * 5 - -64780;
                    }
                }
                if (~class213.field3436[var9] == -11) {
                    int var18 = -class213.field3434[var9] + 150;
                    if (var18 < 50) {
                        var16 = 16711680 - -(var18 * 5);
                    } else if (~var18 <= -101) {
                        if (~var18 > -151) {
                            var16 = 500 - var18 * 5 + (var18 * 327680 - 32767745);
                        }
                    } else {
                        var16 = -(var18 * 327680) + 16711935 + 16384000;
                    }
                }
                if (class213.field3436[var9] == 11) {
                    int var19 = 150 - class213.field3434[var9];
                    if (~var19 > -51) {
                        var16 = -(var19 * 327685) + 16777215;
                    } else if (~var19 > -101) {
                        var16 = -16384250 - -(var19 * 327685) + 65280;
                    } else if (~var19 > -151) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (~class213.field3437[var9] == -1) {
                    class23.field362.method568(var15, class111.field1713 + arg4, arg3 - -class241.field3800, var16, 0);
                }
                if (~class213.field3437[var9] == -2) {
                    class23.field362.method584(var15, arg4 - -class111.field1713, class241.field3800 + arg3, var16, 0, class265.field4236);
                }
                if (class213.field3437[var9] == 2) {
                    class23.field362.method580(var15, class111.field1713 + arg4, class241.field3800 + arg3, var16, 0, class265.field4236);
                }
                if (class213.field3437[var9] == 3) {
                    class23.field362.method563(var15, class111.field1713 + arg4, class241.field3800 + arg3, var16, 0, class265.field4236, -class213.field3434[var9] + 150);
                }
                if (~class213.field3437[var9] == -5) {
                    int var20 = (150 - class213.field3434[var9]) * (100 + class23.field362.method579(var15)) / 150;
                    class63.method487(class111.field1713 - 50 + arg4, arg3, class111.field1713 + arg4 - -50, arg3 + arg6);
                    class23.field362.method578(var15, -var20 + 50 + class111.field1713 + arg4, class241.field3800 + arg3, var16, 0);
                    class63.method477(arg4, arg3, arg4 + arg5, arg3 - -arg6);
                }
                if (~class213.field3437[var9] == -6) {
                    int var21 = -class213.field3434[var9] + 150;
                    int var22 = 0;
                    class63.method487(arg4, class241.field3800 + arg3 + -class23.field362.field1220 + -1, arg4 - -arg5, class241.field3800 + arg3 - -5);
                    if (var21 >= 25) {
                        if (~var21 < -126) {
                            var22 = var21 - 125;
                        }
                    } else {
                        var22 = var21 - 25;
                    }
                    class23.field362.method568(var15, class111.field1713 + arg4, class241.field3800 + arg3 - -var22, var16, 0);
                    class63.method477(arg4, arg3, arg4 - -arg5, arg3 + arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field513;
        if (arg2 == 5) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field516 = arg0.method1012(4);
                }
            } else {
                this.field522 = arg0.method1012(4);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)Lrd;")
    public static final class192 method274(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class192 var4 = var3.field2126;
            var3.field2126 = null;
            return var4;
        }
    }
}

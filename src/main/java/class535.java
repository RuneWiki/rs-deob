import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class535 extends class43 {

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "S")
    public short field7557;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "S")
    public short field7560;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field7552 = 0;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[J")
    public static long[] field7551 = new long[10];

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
    public static int[] field7553 = new int[2];

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z", line = 8)
    public final boolean method403(int arg0) {
        ++field7550;
        if (arg0 != -28694) {
            this.method407((class36[]) null, -22);
        }
        return class533.field7539[(super.field644 >> class440.field6142) + -class155.field2331 + class235.field3337][(super.field648 >> class440.field6142) + -class214.field3065 + class235.field3337];
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILrc;Lrc;)V", line = 23)
    public static final void method3137(int arg0, int arg1, int arg2, class535 arg3, class535 arg4) {
        class416 var5 = class442.method2653(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5845 = arg3;
            var5.field5847 = arg4;
            int var6 = class4.field56 == class138.field2153 ? 1 : 0;
            if (arg3.method395((byte) 84)) {
                if (arg3.method399((byte) 38)) {
                    class319.field4524[var6][class444.field6176[var6]++] = arg3;
                } else {
                    class307.field4351[var6][class189.field2729[var6]++] = arg3;
                    class70.field1267 = true;
                }
            } else {
                class598.field8718[var6][class579.field8176[var6]++] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method395((byte) 84)) {
                    if (arg4.method399((byte) 38)) {
                        class319.field4524[var6][class444.field6176[var6]++] = arg4;
                        return;
                    }
                    class307.field4351[var6][class189.field2729[var6]++] = arg4;
                    class70.field1267 = true;
                    return;
                }
                class598.field8718[var6][class579.field8176[var6]++] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BILha;Lgs;ZII)V", line = 73)
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 >= -5) {
            this.method405((byte) 34, -24, (class58) null, (class43) null, true, 16, -118);
        }
        ++field7559;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z", line = 84)
    public final boolean method391(int arg0) {
        if (arg0 != 0) {
            this.field7557 = -124;
        }
        ++field7554;
        return class158.method1197(false, super.field648 >> class440.field6142, this.method404(65535), super.field644 >> class440.field6142, super.field659);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 95)
    public static void method3138(boolean arg0) {
        field7553 = null;
        field7551 = null;
        if (!arg0) {
            method3140((class58) null, -107);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V", line = 107)
    public static final void method3139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7549;
        int var8 = 23 / ((arg2 - -42) / 62);
        if (class156.field2337 <= arg4 && arg6 <= class612.field8854 && ~class558.field7940 >= ~arg5 && arg1 <= class748.field10458) {
            class96.method865(arg6, arg1, arg3, arg4, arg7, arg0, arg5, (byte) 101);
        } else {
            class317.method2040((byte) 127, arg6, arg3, arg0, arg4, arg5, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lha;I)V", line = 123)
    public static final void method3140(class58 arg0, int arg1) {
        if (!class214.field3067) {
            class503.method3022(arg0, -29092);
        } else {
            class578.method3346(arg1 ^ -15239, arg0);
        }
        if (arg1 != -15251) {
            method3141(24, 127, -43, -112, -108, -10, 9);
        }
        ++field7562;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V", line = 140)
    public static final void method3141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class432.method2619(arg0, arg4 + -1698753486);
        ++field7558;
        int var7 = 0;
        int var8 = -arg5 + arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        if (arg4 == 1698753537) {
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            int[] var15 = class329.field4651[arg6];
            int var16 = arg2 - var8;
            int var17 = arg2 + var8;
            class399.method2472(27113, -arg0 + arg2, var16, arg1, var15);
            class399.method2472(27113, var16, var17, arg3, var15);
            class399.method2472(arg4 + -1698726424, var17, arg2 - -arg0, arg1, var15);
            while (~var9 < ~var7) {
                var13 += 2;
                var14 += 2;
                var10 += var13;
                var12 += var14;
                if (var12 >= 0 && ~var11 <= -2) {
                    class332.field4684[var11] = var7;
                    --var11;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    if (var9 < var8) {
                        int[] var18 = class329.field4651[arg6 + var9];
                        int[] var19 = class329.field4651[-var9 + arg6];
                        int var20 = class332.field4684[var9];
                        int var21 = arg2 + var7;
                        int var22 = -var7 + arg2;
                        int var23 = arg2 + var20;
                        int var24 = -var20 + arg2;
                        class399.method2472(arg4 + -1698726424, var22, var24, arg1, var18);
                        class399.method2472(27113, var24, var23, arg3, var18);
                        class399.method2472(27113, var23, var21, arg1, var18);
                        class399.method2472(27113, var22, var24, arg1, var19);
                        class399.method2472(27113, var24, var23, arg3, var19);
                        class399.method2472(27113, var23, var21, arg1, var19);
                    } else {
                        int[] var25 = class329.field4651[arg6 - -var9];
                        int[] var26 = class329.field4651[arg6 - var9];
                        int var27 = arg2 + var7;
                        int var28 = -var7 + arg2;
                        class399.method2472(27113, var28, var27, arg1, var25);
                        class399.method2472(27113, var28, var27, arg1, var26);
                    }
                    var10 -= var9 << 1;
                }
                int[] var29 = class329.field4651[arg6 + var7];
                int[] var30 = class329.field4651[-var7 + arg6];
                int var31 = arg2 - -var9;
                int var32 = -var9 + arg2;
                if (var7 >= var8) {
                    class399.method2472(27113, var32, var31, arg1, var29);
                    class399.method2472(27113, var32, var31, arg1, var30);
                } else {
                    int var33 = ~var11 <= ~var7 ? var11 : class332.field4684[var7];
                    int var34 = arg2 + var33;
                    int var35 = -var33 + arg2;
                    class399.method2472(27113, var32, var35, arg1, var29);
                    class399.method2472(27113, var35, var34, arg3, var29);
                    class399.method2472(27113, var34, var31, arg1, var29);
                    class399.method2472(27113, var32, var35, arg1, var30);
                    class399.method2472(27113, var35, var34, arg3, var30);
                    class399.method2472(27113, var34, var31, arg1, var30);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 270)
    public final void method400(int arg0) {
        ++field7556;
        if (arg0 >= 33) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(B)Z", line = 281)
    public final boolean method402(byte arg0) {
        if (arg0 < 28) {
            method3139(59, -114, -17, 116, 36, -32, -82, -113);
        }
        ++field7564;
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIII)V", line = 291)
    public class535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field648 = arg2;
        this.field7557 = (short) arg6;
        this.field7560 = (short) arg5;
        super.field651 = arg1;
        super.field644 = arg0;
        super.field659 = (byte) arg4;
        super.field649 = (byte) arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lbh;I)I", line = 312)
    public final int method407(class36[] arg0, int arg1) {
        ++field7563;
        int var3 = -24 / ((-32 - arg1) / 53);
        return this.method406(arg0, (byte) -119, super.field644 >> class440.field6142, super.field648 >> class440.field6142);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIIII)V", line = 324)
    public static final void method3142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7561;
        int var7 = class206.field2950;
        int[] var8 = class209.field3013;
        class307.field4340 = 0;
        for (int var9 = 0; class152.field2290 + var7 > var9; ++var9) {
            class488 var37 = null;
            class52 var38;
            if (~var9 <= ~var7) {
                var38 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var9 - var7])).field3885;
                var37 = ((class84) var38).field1523;
                if (var37.field6923 != null) {
                    var37 = var37.method2926(arg3 + 8728, class742.field10408);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class165.field2442[var8[var9]];
            }
            if (var38.field927 >= 0 && (class258.field3741 == var38.field883 || class468.field6748.field649 == var38.field649)) {
                class497.method2988(arg6, var38, arg2, arg1 >> 1, 0, var38.method480(18131), arg0 >> 1);
                if (~class686.field9681[0] <= -1) {
                    if (var38.field928 != null && (~var9 <= ~var7 || ~class261.field3816 == -1 || class261.field3816 == 3 || ~class261.field3816 == -2 && class443.method2658(((class349) var38).field4939, (byte) 121)) && class32.field427 > class307.field4340) {
                        class32.field429[class307.field4340] = class419.field5896.method2075(false, var38.field928) / 2;
                        class32.field421[class307.field4340] = class686.field9681[0];
                        class32.field428[class307.field4340] = class686.field9681[1];
                        class32.field416[class307.field4340] = var38.field965;
                        class32.field431[class307.field4340] = var38.field884;
                        class32.field420[class307.field4340] = var38.field934;
                        class32.field432[class307.field4340] = var38.field928;
                        ++class307.field4340;
                    }
                    int var39 = arg5 - -class686.field9681[1];
                    int var50;
                    if (!var38.field892 && ~class605.field8787 > ~var38.field954) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class349 var42 = class165.field2442[var8[var9]];
                            var43 = var38.method464((byte) 126).field7110;
                            if (var42.field4926) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field6913;
                            if (var43 == -1) {
                                var43 = var38.method464((byte) -96).field7110;
                            }
                        }
                        class743[] var44 = class284.field4038;
                        if (var43 != -1) {
                            class743[] var45 = (class743[]) class735.field10349.method3054((byte) -109, (long) var43);
                            if (var45 == null) {
                                class55[] var46 = class55.method507(class501.field7161, var43, 0);
                                if (var46 != null) {
                                    var45 = new class743[var46.length];
                                    for (int var47 = 0; ~var47 > ~var46.length; ++var47) {
                                        var45[var47] = class359.field5046.method637(var46[var47], true);
                                    }
                                    class735.field10349.method3047(false, var45, (long) var43);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class743 var48 = var44[0];
                        class743 var49 = var44[var41];
                        var50 = var39 - Math.max(class419.field5896.field4594, var48.method95());
                        int var51 = arg4 - -class686.field9681[0] - (var48.method93() >> 1);
                        int var52 = var48.method93() * var38.field947 / 255;
                        int var53 = var48.method95();
                        if (var38.field947 > 0 && ~var52 > -3) {
                            var52 = 2;
                        }
                        var48.method4135(var51, var50);
                        class359.field5046.method583(var51, var50, var51 - -var52, var50 + var53);
                        var49.method4135(var51, var50);
                        class359.field5046.method584(arg4, arg5, arg0 + arg4, arg1 + arg5);
                        class6.method33(true, var50 - -var53, var50, var51, var48.method82() + var51);
                    } else {
                        var50 = var39 - Math.max(class419.field5896.field4594, class284.field4038[0].method95());
                    }
                    var50 -= 2;
                    if (!var38.field892) {
                        if (~var38.field964 < ~class605.field8787) {
                            class743 var54 = class483.field6845[var38.field961 ? 2 : 0];
                            class743 var55 = class483.field6845[!var38.field961 ? 1 : 3];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class84)) {
                                var57 = var38.method464((byte) 127).field7112;
                            } else {
                                var57 = var37.field6973;
                                if (~var57 == 0) {
                                    var57 = var38.method464((byte) 126).field7112;
                                }
                            }
                            if (~var57 != 0) {
                                class743[] var58 = (class743[]) class193.field2760.method3054((byte) -95, (long) var57);
                                if (var58 == null) {
                                    class55[] var59 = class55.method507(class501.field7161, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class743[var59.length];
                                        for (int var60 = 0; var59.length > var60; ++var60) {
                                            var58[var60] = class359.field5046.method637(var59[var60], true);
                                        }
                                        class193.field2760.method3047(false, var58, (long) var57);
                                    }
                                }
                                if (var58 != null && ~var58.length == -5) {
                                    var54 = var58[var38.field961 ? 2 : 0];
                                    var55 = var58[!var38.field961 ? 1 : 3];
                                }
                            }
                            int var61 = -class605.field8787 + var38.field964;
                            int var64;
                            if (~var61 < ~var38.field976) {
                                int var62 = var61 - var38.field976;
                                int var63 = var38.field879 == 0 ? 0 : (var38.field897 - var62) / var38.field879 * var38.field879;
                                var64 = var63 * var54.method93() / var38.field897;
                            } else {
                                var64 = var54.method93();
                            }
                            int var65 = var54.method95();
                            var50 -= var65;
                            int var66 = class686.field9681[0] + arg4 + -(var54.method93() >> 1);
                            var54.method4135(var66, var50);
                            class359.field5046.method583(var66, var50, var64 + var66, var50 + var65);
                            var55.method4135(var66, var50);
                            class359.field5046.method584(arg4, arg5, arg0 + arg4, arg1 + arg5);
                            class6.method33(true, var50 + var65, var50, var66, var66 - -var54.method82());
                            var50 -= 2;
                        }
                        if (var7 <= var9) {
                            if (var37.field6939 >= 0 && class530.field7509.length > var37.field6939) {
                                var50 -= 25;
                                class743 var67 = class530.field7509[var37.field6939];
                                var67.method4135(class686.field9681[0] + arg4 + -(var67.method93() >> 1), var50);
                                class6.method33(true, var50 + var67.method83(), var50, class686.field9681[0] + arg4 + -(var67.method93() >> 1), class686.field9681[0] + arg4 - (var67.method93() >> 1) + var67.method82());
                                var50 -= 2;
                            }
                        } else {
                            class349 var68 = (class349) var38;
                            if (~var68.field4906 != 0) {
                                var50 -= 25;
                                class743 var69 = class351.field4958[var68.field4906];
                                var69.method4135(arg4 + -12 - -class686.field9681[0], var50);
                                class6.method33(true, var50 - -var69.method83(), var50, class686.field9681[0] + arg4 + -12, arg4 + (class686.field9681[0] + -12 - -var69.method82()));
                                var50 -= 2;
                            }
                            if (~var68.field4923 != 0) {
                                var50 -= 25;
                                class743 var70 = class530.field7509[var68.field4923];
                                var70.method4135(class686.field9681[0] + arg4 + -12, var50);
                                class6.method33(true, var50 + var70.method83(), var50, class686.field9681[0] + -12 + arg4, arg4 + -12 - -class686.field9681[0] - -var70.method82());
                                var50 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var38 instanceof class349) {
                        if (var9 >= 0) {
                            int var71 = 0;
                            class340[] var72 = class220.field3146;
                            for (int var73 = 0; ~var73 > ~var72.length; ++var73) {
                                class340 var75 = var72[var73];
                                if (var75 != null && var75.field4782 == 10 && ~var8[var9] == ~var75.field4789) {
                                    class743 var76 = class283.field4028[var75.field4788];
                                    if (var76.method95() > var71) {
                                        var71 = var76.method95();
                                    }
                                    var76.method4135(class686.field9681[0] + arg4 + -12, -var76.method95() + var50);
                                    class6.method33(true, var50 + (-var76.method95() - -var76.method83()), -var76.method95() + var50, class686.field9681[0] + arg4 + -12, class686.field9681[0] + arg4 - 12 + var76.method82());
                                }
                            }
                            if (~var71 < -1) {
                                var10000 = var50 - (var71 - -2);
                            }
                        }
                    } else {
                        int var77 = 0;
                        class340[] var78 = class220.field3146;
                        for (int var79 = 0; ~var79 > ~var78.length; ++var79) {
                            class340 var84 = var78[var79];
                            if (var84 != null && var84.field4782 == 1 && ~class323.field4590[var9 - var7] == ~var84.field4789) {
                                class743 var85 = class283.field4028[var84.field4788];
                                if (var77 < var85.method95()) {
                                    var77 = var85.method95();
                                }
                                if (~(class605.field8787 % 20) > -11) {
                                    var85.method4135(arg4 + -12 + class686.field9681[0], var50 + -var85.method95());
                                    class6.method33(true, var50 + (-var85.method95() - -var85.method83()), -var85.method95() + var50, class686.field9681[0] + arg4 - 12, -12 + class686.field9681[0] + arg4 + var85.method82());
                                }
                            }
                        }
                        if (~var77 < -1) {
                            var10000 = var50 - (var77 - -2);
                        }
                    }
                    for (int var81 = 0; var81 < 4; ++var81) {
                        if (~class605.field8787 > ~var38.field894[var81]) {
                            int var82 = var38.method480(arg3 ^ 18129) / 2;
                            class497.method2988(arg6, var38, arg2, arg1 >> 1, 0, var82, arg0 >> 1);
                            if (~class686.field9681[0] < 0) {
                                int var83 = class47.field699[var38.field916[var81]].method93();
                                if (~var81 == -2) {
                                    class686.field9681[1] -= 20;
                                }
                                if (var81 == 2) {
                                    class686.field9681[0] -= var83 + -9;
                                    class686.field9681[1] -= 10;
                                }
                                if (var81 == 3) {
                                    class686.field9681[0] += var83 + -9;
                                    class686.field9681[1] -= 10;
                                }
                                class47.field699[var38.field916[var81]].method4135(class686.field9681[0] + -(var83 >> 1) + arg4, class686.field9681[1] + arg5 + -12);
                                class242.field3393.method651(class686.field9681[0] + arg4 + -1, class686.field9681[1] + 3 + arg5, Integer.toString(var38.field924[var81]), -1, (byte) 126, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~class494.field7054 < ~var10; ++var10) {
            int var33 = class460.field6631[var10];
            class52 var34;
            if (~var33 <= -2049) {
                var34 = ((class272) class758.field10539.method4203(true, (long) (var33 + -2048))).field3885;
            } else {
                var34 = class165.field2442[var33];
            }
            int var35 = class427.field5964[var10];
            class52 var36;
            if (var35 >= 2048) {
                var36 = ((class272) class758.field10539.method4203(true, (long) (var35 + -2048))).field3885;
            } else {
                var36 = class165.field2442[var35];
            }
            class266.method1788(arg0, arg5, var34, --var34.field952, var36, true, arg2, arg1, arg6, arg4);
        }
        if (arg3 != 2) {
            field7553 = null;
        }
        int var11 = class419.field5896.field4586 - -2 + class419.field5896.field4594;
        for (int var12 = 0; var12 < class307.field4340; ++var12) {
            int var13 = class32.field421[var12];
            int var14 = class32.field428[var12];
            int var15 = class32.field429[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; ++var32) {
                    if (var14 + 2 > class32.field428[var32] + -var11 && var14 - var11 < class32.field428[var32] - -2 && ~(-var15 + var13) > ~(class32.field429[var32] + class32.field421[var32]) && var13 + var15 > class32.field421[var32] + -class32.field429[var32] && var14 > class32.field428[var32] + -var11) {
                        var16 = true;
                        var14 = class32.field428[var32] + -var11;
                    }
                }
            }
            class32.field428[var12] = var14;
            String var17 = class32.field432[var12];
            int var18 = class419.field5896.method2075(false, var17);
            int var19 = arg4 - -var13;
            int var20 = arg5 - -var14 + -class419.field5896.field4594;
            int var21 = var18 + var19;
            int var22 = arg5 + var14 - -class419.field5896.field4586;
            if (~class474.field6798 == -1) {
                int var23 = 16776960;
                if (class32.field416[var12] < 6) {
                    var23 = class169.field2478[class32.field416[var12]];
                }
                if (~class32.field416[var12] == -7) {
                    var23 = ~(class258.field3741 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (~class32.field416[var12] == -8) {
                    var23 = ~(class258.field3741 % 20) <= -11 ? 65535 : 255;
                }
                if (~class32.field416[var12] == -9) {
                    var23 = ~(class258.field3741 % 20) <= -11 ? 8454016 : 45056;
                }
                if (~class32.field416[var12] == -10) {
                    int var24 = 150 - class32.field420[var12];
                    if (~var24 <= -51) {
                        if (~var24 <= -101) {
                            if (~var24 > -151) {
                                var23 = (var24 + -100) * 5 + 65280;
                            }
                        } else {
                            var23 = 16384000 - (var24 * 327680 - 16776960);
                        }
                    } else {
                        var23 = var24 * 1280 + 16711680;
                    }
                }
                if (~class32.field416[var12] == -11) {
                    int var25 = -class32.field420[var12] + 150;
                    if (var25 >= 50) {
                        if (~var25 <= -101) {
                            if (~var25 > -151) {
                                var23 = (var25 + -100) * 327680 + 255 + -(var25 * 5) + 500;
                            }
                        } else {
                            var23 = -(var25 * 327680) + 16384000 + 16711935;
                        }
                    } else {
                        var23 = var25 * 5 + 16711680;
                    }
                }
                if (class32.field416[var12] == 11) {
                    int var26 = -class32.field420[var12] + 150;
                    if (~var26 > -51) {
                        var23 = -(var26 * 327685) + 16777215;
                    } else if (var26 < 100) {
                        var23 = -16384250 - -(var26 * 327685) + 65280;
                    } else if (~var26 > -151) {
                        var23 = -((var26 + -100) * 327680) + 16777215;
                    }
                }
                int var27 = -16777216 | var23;
                if (class32.field431[var12] == 0) {
                    class537.field7568.method651(arg4 - -var13, arg5 + var14, var17, var27, (byte) -100, -16777216);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                }
                if (class32.field431[var12] == 1) {
                    var19 -= var18 >> 1;
                    var20 -= 5;
                    class537.field7568.method652(var27, -16777216, 123, var17, class258.field3741, arg5 + var14, arg4 + var13);
                    var22 += 5;
                    var21 -= var18 >> 1;
                }
                if (class32.field431[var12] == 2) {
                    class537.field7568.method660(var27, class258.field3741, (byte) -5, arg4 + var13, -16777216, var17, arg5 + var14);
                    var22 += 5;
                    var20 -= 5;
                    var19 -= (var18 >> 1) - -5;
                    var21 -= (var18 >> 1) + -5;
                }
                if (class32.field431[var12] == 3) {
                    var22 += 7;
                    class537.field7568.method661(-16777216, arg5 + var14, (byte) 98, var27, arg4 + var13, -class32.field420[var12] + 150, class258.field3741, var17);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var20 -= 7;
                }
                if (~class32.field431[var12] == -5) {
                    int var28 = (-class32.field420[var12] + 150) * (class419.field5896.method2075(false, var17) + 100) / 150;
                    class359.field5046.method583(arg4 + var13 + -50, arg5, arg4 - -50 + var13, arg1 + arg5);
                    class537.field7568.method665(arg5 - -var14, var17, -16777216, arg4 + var13 - (var28 + -50), arg3 ^ -16777214, var27);
                    var21 += 50 - var28;
                    var19 += -var28 + 50;
                    class359.field5046.method584(arg4, arg5, arg4 - -arg0, arg1 + arg5);
                }
                if (class32.field431[var12] == 5) {
                    int var29 = -class32.field420[var12] + 150;
                    int var30 = 0;
                    if (~var29 > -26) {
                        var30 = var29 + -25;
                    } else if (var29 > 125) {
                        var30 = var29 + -125;
                    }
                    int var31 = class419.field5896.field4594 + class419.field5896.field4586;
                    class359.field5046.method583(arg4, arg5 - -var14 + -var31 + -1, arg4 - -arg0, arg5 + 5 + var14);
                    var20 += var30;
                    var21 -= var18 >> 1;
                    class537.field7568.method651(arg4 + var13, arg5 + var14 + var30, var17, var27, (byte) 124, -16777216);
                    var19 -= var18 >> 1;
                    var22 += var30;
                    class359.field5046.method584(arg4, arg5, arg0 + arg4, arg5 - -arg1);
                }
            } else {
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
                class537.field7568.method651(arg4 + var13, arg5 + var14, var17, -256, (byte) -22, -16777216);
            }
            class6.method33(true, var22 + 1, var20, var19, var21 + 1);
        }
    }
}

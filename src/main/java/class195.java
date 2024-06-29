import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class195 extends class12 {

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    private int field3778 = 4;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    private int field3785 = 4;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3779 = 0;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Ltg;")
    public static class184 field3788 = class135.method812("Verbindung mit Update)2Server)3)3)3", 3);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lnd;")
    public static class127 field3783 = new class127(30);

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field3791 = -1;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field3793 = 0;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "Ltg;")
    private static class184 field3794 = class135.method812("Please contact customer support)3", 3);

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Ltg;")
    public static class184 field3790 = field3794;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
    public static int[] field3792;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3781;
        int[][] var3 = super.field232.method673(arg0, -31);
        int var4 = -95 / ((arg1 - -58) / 34);
        if (super.field232.field1962) {
            int var5 = class114.field2074 / this.field3778;
            int var6 = class201.field3889 / this.field3785;
            int[][] var8;
            if (var5 > 0) {
                int var7 = arg0 % var5;
                var8 = this.method76(class114.field2074 * var7 / var5, 6218, 0);
            } else {
                var8 = this.method76(0, 6218, 0);
            }
            int[] var9 = var8[1];
            int[] var10 = var8[0];
            int[] var11 = var8[2];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            int[] var14 = var3[1];
            for (int var15 = 0; class201.field3889 > var15; ++var15) {
                int var16;
                if (~var6 >= -1) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var6;
                    var16 = class201.field3889 * var17 / var6;
                }
                var12[var15] = var10[var16];
                var14[var15] = var9[var16];
                var13[var15] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(III)V")
    public static final void method1236(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1690 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
    public static final void method1237(int arg0, int arg1) {
        if (arg1 != -1075125499) {
            method1236(52, 81, 18);
        }
        ++field3780;
        class131.field2382 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field3782;
        if (arg1 != 17) {
            field3783 = null;
        }
        int[] var3 = super.field224.method7((byte) -74, arg0);
        if (super.field224.field53) {
            int var4 = class201.field3889 / this.field3785;
            int var5 = class114.field2074 / this.field3778;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method77(0, class114.field2074 * var6 / var5, arg1 + -138);
            } else {
                var7 = this.method77(0, 0, -121);
            }
            for (int var8 = 0; ~var8 > ~class201.field3889; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class201.field3889 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIII)V")
    private static final void method1238(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3786;
        class36 var5 = (class36) class179.field3417.method51((long) arg0, -106);
        if (var5 == null) {
            var5 = new class36();
            class179.field3417.method55((byte) -75, var5, (long) arg0);
        }
        if (var5.field681.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; ~var5.field681.length < ~var8; ++var8) {
                var6[var8] = var5.field681[var8];
                var7[var8] = var5.field680[var8];
            }
            for (int var9 = var5.field681.length; ~arg4 < ~var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field681 = var6;
            var5.field680 = var7;
        }
        var5.field681[arg4] = arg3;
        var5.field680[arg4] = arg2;
        if (!arg1) {
            method1241(82);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static void method1239(byte arg0) {
        field3792 = null;
        field3788 = null;
        if (arg0 >= -36) {
            method1241(91);
        }
        field3790 = null;
        field3783 = null;
        field3794 = null;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        int var1 = 0;
        if (arg0 != -719) {
            field3791 = -9;
        }
        while (~var1 > ~class38.field711) {
            int var2 = class97.field1782[var1];
            class158 var3 = class52.field948[var2];
            if (var3 != null) {
                class55.method294(var3.field2832.field784, (byte) -76, var3);
            }
            ++var1;
        }
        ++field3784;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
    public static final boolean method1241(int arg0) {
        ++field3777;
        if (class180.field3435 == null) {
            return false;
        } else {
            try {
                int var1 = class180.field3435.method519((byte) -99);
                if (var1 == 0) {
                    return false;
                }
                if (class105.field1909 == -1) {
                    --var1;
                    class180.field3435.method520(1, 0, arg0 + -65, class21.field394.field1809);
                    class21.field394.field1834 = 0;
                    class105.field1909 = class21.field394.method112(true);
                    class111.field2014 = class197.field3827[class105.field1909];
                }
                if (class111.field2014 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class180.field3435.method520(1, 0, -1, class21.field394.field1809);
                    class111.field2014 = class21.field394.field1809[0] & 255;
                    --var1;
                }
                if (~class111.field2014 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class180.field3435.method520(2, 0, -1, class21.field394.field1809);
                    class21.field394.field1834 = 0;
                    var1 -= 2;
                    class111.field2014 = class21.field394.method611(false);
                }
                if (~class111.field2014 < ~var1) {
                    return false;
                }
                class21.field394.field1834 = 0;
                class180.field3435.method520(class111.field2014, 0, -1, class21.field394.field1809);
                class98.field1838 = field3779;
                class79.field1436 = 0;
                field3779 = class46.field881;
                class46.field881 = class105.field1909;
                if (~class105.field1909 == -107) {
                    int var2 = class21.field394.method611(false);
                    int var3 = class21.field394.method588((byte) -99);
                    if (~var2 == -65536) {
                        var2 = -1;
                    }
                    int var4 = class21.field394.method611(false);
                    class159.method965((byte) 89, var3, var2, var4);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 172) {
                    int var5 = class21.field394.method566(arg0 + -60);
                    int var6 = class21.field394.method564(67);
                    int var7 = var6 >> 10 & 31;
                    int var8 = 31 & var6 >> 5;
                    int var9 = var6 & 31;
                    int var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
                    class167 var11 = class44.method255(var5, arg0 ^ 10519);
                    if (~var11.field3057 != ~var10) {
                        var11.field3057 = var10;
                        class57.method305(-127, var11);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 72) {
                    class69.method409((byte) 101);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -89) {
                    int var12 = class21.field394.method599(arg0 ^ -16067);
                    int var13 = class21.field394.method611(false);
                    if (~var12 > 69999) {
                        var13 += 32768;
                    }
                    class167 var14;
                    if (var12 >= 0) {
                        var14 = class44.method255(var12, 10583);
                    } else {
                        var14 = null;
                    }
                    while (class111.field2014 > class21.field394.field1834) {
                        int var15 = class21.field394.method582(arg0 + -14654);
                        int var16 = class21.field394.method611(false);
                        int var17 = 0;
                        if (var16 != 0) {
                            var17 = class21.field394.method588((byte) -99);
                            if (~var17 == -256) {
                                var17 = class21.field394.method599(arg0 + -16067);
                            }
                        }
                        if (var14 != null && var15 >= 0 && var14.field3130.length > var15) {
                            var14.field3130[var15] = var16;
                            var14.field3056[var15] = var17;
                        }
                        method1238(var13, true, var17, var16 + -1, var15);
                    }
                    if (var14 != null) {
                        class57.method305(-122, var14);
                    }
                    class154.method936(arg0 + 65472);
                    class133.field2407[class10.method61(class209.field4005++, 31)] = class10.method61(32767, var13);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -1) {
                    class209.field4012 = false;
                    for (int var18 = 0; ~var18 > -6; ++var18) {
                        class37.field691[var18] = false;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -228) {
                    class17.method114(0, false);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -136) {
                    long var19 = class21.field394.method615(49);
                    class184 var21 = class211.method1358(class187.method1181(class21.field394, -32769).method1152(-105));
                    class149.method914(6, var21, class119.method719(var19, arg0 ^ 101).method1147(true), -108);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 56) {
                    boolean var22 = class21.field394.method605(112) == 1;
                    int var23 = class21.field394.method610(1163269216);
                    class167 var24 = class44.method255(var23, 10583);
                    if (!var22 == var24.field3042) {
                        var24.field3042 = var22;
                        class57.method305(-117, var24);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 221) {
                    class154.method936(65536);
                    class135.field2455 = class21.field394.method584((byte) -112);
                    class191.field3733 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 224) {
                    class59.field1100 = class21.field394.method578((byte) -124);
                    class26.field469 = class21.field394.method588((byte) -49);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 230) {
                    int var25 = class21.field394.method614(0);
                    int var26 = class21.field394.method605(-128);
                    class184 var27 = class21.field394.method596(arg0 ^ -65);
                    if (~var25 <= -2 && ~var25 >= -9) {
                        if (var27.method1150(class212.field4106, arg0 + -185)) {
                            var27 = null;
                        }
                        class193.field3737[var25 + -1] = var27;
                        class91.field1702[var25 + -1] = ~var26 == -1;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 142) {
                    class209.field4012 = true;
                    class97.field1801 = class21.field394.method588((byte) -84);
                    class116.field2108 = class21.field394.method588((byte) -97);
                    class79.field1435 = class21.field394.method611(false);
                    class44.field847 = class21.field394.method588((byte) -62);
                    class208.field3995 = class21.field394.method588((byte) -105);
                    if (class208.field3995 >= 100) {
                        class78.field1418 = class116.field2108 * 128 + 64;
                        class59.field1096 = class97.field1801 * 128 + 64;
                        class143.field2585 = class115.method706(class59.field1096, class47.field892, 127, class78.field1418) - class79.field1435;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -7) {
                    int var28 = class21.field394.method566(4);
                    class167 var29 = class44.method255(var28, 10583);
                    for (int var30 = 0; ~var29.field3130.length < ~var30; ++var30) {
                        var29.field3130[var30] = -1;
                        var29.field3130[var30] = 0;
                    }
                    class57.method305(-118, var29);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -197) {
                    class40.field751 = 0;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 54) {
                    int var31 = class21.field394.method575(arg0 + 20);
                    class173.field3286 = class98.field1841.method907(var31, arg0 ^ 11);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 4) {
                    long var32 = class21.field394.method615(56);
                    int var34 = class21.field394.method611(false);
                    byte var35 = class21.field394.method591(arg0 ^ 65344);
                    boolean var36 = false;
                    if (~(Long.MIN_VALUE & var32) != -1L) {
                        var36 = true;
                    }
                    if (var36) {
                        if (class107.field1937 == 0) {
                            class105.field1909 = -1;
                            return true;
                        }
                        long var37 = var32 & Long.MAX_VALUE;
                        boolean var39 = false;
                        int var40;
                        for (var40 = 0; ~class107.field1937 < ~var40 && (~class186.field3606[var40].field2393 != ~var37 || class186.field3606[var40].field871 != var34); ++var40) {
                        }
                        if (~var40 > ~class107.field1937) {
                            while (~(class107.field1937 + -1) < ~var40) {
                                class186.field3606[var40] = class186.field3606[var40 + 1];
                                ++var40;
                            }
                            --class107.field1937;
                            class186.field3606[class107.field1937] = null;
                        }
                    } else {
                        class46 var41 = new class46();
                        var41.field2393 = var32;
                        var41.field867 = class119.method719(var41.field2393, 37);
                        var41.field870 = var35;
                        var41.field871 = var34;
                        int var42;
                        for (var42 = class107.field1937 + -1; ~var42 <= -1; --var42) {
                            int var43 = class186.field3606[var42].field867.method1166(-5153, var41.field867);
                            if (var43 == 0) {
                                class186.field3606[var42].field871 = var34;
                                class186.field3606[var42].field870 = var35;
                                class177.field3379 = class136.field2471;
                                class105.field1909 = -1;
                                if (class103.field1893 == var32) {
                                    class145.field2625 = var35;
                                }
                                return true;
                            }
                            if (var43 < 0) {
                                break;
                            }
                        }
                        if (class107.field1937 >= class186.field3606.length) {
                            class105.field1909 = -1;
                            return true;
                        }
                        for (int var44 = class107.field1937 + -1; var44 > var42; --var44) {
                            class186.field3606[var44 - -1] = class186.field3606[var44];
                        }
                        if (class107.field1937 == 0) {
                            class186.field3606 = new class46[100];
                        }
                        class186.field3606[var42 - -1] = var41;
                        ++class107.field1937;
                        if (class103.field1893 == var32) {
                            class145.field2625 = var35;
                        }
                    }
                    class177.field3379 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -49) {
                    class17.method114(0, true);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -198) {
                    for (int var45 = 0; class94.field1710.length > var45; ++var45) {
                        if (class94.field1710[var45] != class36.field671[var45]) {
                            class94.field1710[var45] = class36.field671[var45];
                            class99.method620(arg0 + -62, var45);
                            class129.field2335[class10.method61(class92.field1705++, 31)] = var45;
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -131) {
                    int var46 = class21.field394.method566(arg0 ^ 68);
                    int var47 = class21.field394.method611(false);
                    class167 var48 = class44.method255(var46, arg0 ^ 10519);
                    if (var48 != null && var48.field3061 == 0) {
                        if (-var48.field3089 + var48.field3096 < var47) {
                            var47 = -var48.field3089 + var48.field3096;
                        }
                        if (~var47 > -1) {
                            var47 = 0;
                        }
                        if (var48.field3073 != var47) {
                            var48.field3073 = var47;
                            class57.method305(arg0 ^ -48, var48);
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -17) {
                    int var49 = class21.field394.method575(94);
                    int var50 = class21.field394.method590(true);
                    if (~var50 == -65536) {
                        var50 = -1;
                    }
                    class167 var51 = class44.method255(var49, 10583);
                    if (var51.field2991 != 2 || ~var51.field3054 != ~var50) {
                        var51.field3054 = var50;
                        var51.field2991 = 2;
                        class57.method305(-124, var51);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -9) {
                    class177.field3379 = class136.field2471;
                    long var52 = class21.field394.method615(89);
                    if (~var52 == -1L) {
                        class127.field2292 = null;
                        class12.field231 = null;
                        class107.field1937 = 0;
                        class186.field3606 = null;
                        class105.field1909 = -1;
                        return true;
                    }
                    long var54 = class21.field394.method615(49);
                    class12.field231 = class119.method719(var54, 37);
                    class127.field2292 = class119.method719(var52, 37);
                    class128.field2306 = class21.field394.method591(65280);
                    int var56 = class21.field394.method588((byte) -73);
                    if (var56 == 255) {
                        class105.field1909 = -1;
                        return true;
                    }
                    class46[] var57 = new class46[100];
                    class107.field1937 = var56;
                    for (int var58 = 0; ~class107.field1937 < ~var58; ++var58) {
                        var57[var58] = new class46();
                        var57[var58].field2393 = class21.field394.method615(98);
                        var57[var58].field867 = class119.method719(var57[var58].field2393, 37);
                        var57[var58].field871 = class21.field394.method611(false);
                        var57[var58].field870 = class21.field394.method591(65280);
                        if (class103.field1893 == var57[var58].field2393) {
                            class145.field2625 = var57[var58].field870;
                        }
                    }
                    boolean var59 = false;
                    int var60 = class107.field1937;
                    while (var60 > 0) {
                        boolean var61 = true;
                        --var60;
                        for (int var62 = 0; var60 > var62; ++var62) {
                            if (var57[var62].field867.method1166(-5153, var57[var62 - -1].field867) > 0) {
                                var61 = false;
                                class46 var63 = var57[var62];
                                var57[var62] = var57[var62 + 1];
                                var57[var62 + 1] = var63;
                            }
                        }
                        if (var61) {
                            break;
                        }
                    }
                    class105.field1909 = -1;
                    class186.field3606 = var57;
                    return true;
                }
                if (~class105.field1909 == -47) {
                    int var64 = class21.field394.method611(false);
                    byte var65 = class21.field394.method586(arg0 ^ 19940);
                    class36.field671[var64] = var65;
                    if (class94.field1710[var64] != var65) {
                        class94.field1710[var64] = var65;
                        class99.method620(2, var64);
                    }
                    class129.field2335[class10.method61(31, class92.field1705++)] = var64;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 153) {
                    long var66 = class21.field394.method615(64);
                    int var68 = class21.field394.method611(false);
                    int var69 = class21.field394.method588((byte) -116);
                    class184 var70 = class119.method719(var66, arg0 ^ 101).method1147(true);
                    for (int var71 = 0; var71 < class64.field1212; ++var71) {
                        if (class136.field2481[var71] == var66) {
                            if (class204.field3931[var71] != var68) {
                                class204.field3931[var71] = var68;
                                if (~var68 < -1) {
                                    class149.method914(5, class144.method884(0, new class184[] { var70, class99.field1858 }), class170.field3242, -73);
                                }
                                if (var68 == 0) {
                                    class149.method914(5, class144.method884(0, new class184[] { var70, class110.field1990 }), class170.field3242, arg0 + -191);
                                }
                            }
                            class126.field2271[var71] = var69;
                            var70 = null;
                            break;
                        }
                    }
                    if (var70 != null && ~class64.field1212 > -201) {
                        class136.field2481[class64.field1212] = var66;
                        class202.field3895[class64.field1212] = var70;
                        class204.field3931[class64.field1212] = var68;
                        class126.field2271[class64.field1212] = var69;
                        ++class64.field1212;
                    }
                    int var72 = class64.field1212;
                    class158.field2825 = class136.field2471;
                    boolean var73 = false;
                    while (~var72 < -1) {
                        boolean var74 = true;
                        --var72;
                        for (int var75 = 0; ~var75 > ~var72; ++var75) {
                            if (class204.field3931[var75] != class52.field954 && class204.field3931[var75 + 1] == class52.field954 || class204.field3931[var75] == 0 && class204.field3931[var75 + 1] != 0) {
                                var74 = false;
                                int var76 = class204.field3931[var75];
                                class204.field3931[var75] = class204.field3931[var75 + 1];
                                class204.field3931[var75 + 1] = var76;
                                class184 var77 = class202.field3895[var75];
                                class202.field3895[var75] = class202.field3895[var75 - -1];
                                class202.field3895[var75 + 1] = var77;
                                long var78 = class136.field2481[var75];
                                class136.field2481[var75] = class136.field2481[var75 - -1];
                                class136.field2481[var75 + 1] = var78;
                                int var80 = class126.field2271[var75];
                                class126.field2271[var75] = class126.field2271[var75 + 1];
                                class126.field2271[var75 + 1] = var80;
                            }
                        }
                        if (var74) {
                            break;
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 27 || ~class105.field1909 == -26 || ~class105.field1909 == -201 || ~class105.field1909 == -146 || class105.field1909 == 193 || class105.field1909 == 159 || ~class105.field1909 == -204 || class105.field1909 == 209 || class105.field1909 == 87 || class105.field1909 == 175 || ~class105.field1909 == -213) {
                    class190.method1205(true);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 115) {
                    class184 var81 = class21.field394.method596(-1);
                    int var82 = class21.field394.method610(1163269216);
                    class167 var83 = class44.method255(var82, arg0 ^ 10519);
                    if (!var81.method1139(var83.field3051, (byte) -60)) {
                        var83.field3051 = var81;
                        class57.method305(-116, var83);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 225) {
                    for (int var84 = 0; class150.field2687 > var84; ++var84) {
                        class110 var85 = class58.method313(var84, 119);
                        if (var85 != null && ~var85.field1984 == -1) {
                            class36.field671[var84] = 0;
                            class94.field1710[var84] = 0;
                        }
                    }
                    class154.method936(65536);
                    class92.field1705 += 32;
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -8) {
                    int var86 = class21.field394.method588((byte) -116);
                    if (class21.field394.method588((byte) -96) == 0) {
                        class60.field1117[var86] = new class133();
                    } else {
                        --class21.field394.field1834;
                        class60.field1117[var86] = new class133(class21.field394);
                    }
                    class105.field1909 = -1;
                    class179.field3422 = class136.field2471;
                    return true;
                }
                if (~class105.field1909 == -235) {
                    int var87 = class21.field394.method611(false);
                    if (var87 == 65535) {
                        var87 = -1;
                    }
                    int var88 = class21.field394.method566(4);
                    int var89 = class21.field394.method566(4);
                    class167 var90 = class44.method255(var89, 10583);
                    if (var90.field3106) {
                        var90.field3034 = var87;
                        var90.field3050 = var88;
                        class122 var91 = class60.method336(var87, arg0 ^ 74);
                        var90.field3039 = var91.field2192;
                        var90.field3118 = var91.field2213;
                        if (~var90.field3045 < -1) {
                            var90.field3118 = var90.field3118 * 32 / var90.field3045;
                        }
                        var90.field2996 = var91.field2197;
                        var90.field3052 = var91.field2201;
                        var90.field3033 = var91.field2183;
                        var90.field3123 = var91.field2202;
                        class57.method305(-119, var90);
                    } else {
                        if (var87 == -1) {
                            class105.field1909 = -1;
                            var90.field2991 = 0;
                            return true;
                        }
                        class122 var92 = class60.method336(var87, 10);
                        var90.field3118 = var92.field2213 * 100 / var88;
                        var90.field3039 = var92.field2192;
                        var90.field3033 = var92.field2183;
                        var90.field3054 = var87;
                        var90.field2991 = 4;
                        class57.method305(-113, var90);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 254) {
                    int var93 = class21.field394.method584((byte) -121);
                    int var94 = class21.field394.method561(-32768);
                    int var95 = class21.field394.method575(118);
                    class167 var96 = class44.method255(var95, 10583);
                    int var97 = var96.field3082 + var94;
                    int var98 = var96.field3079 + var93;
                    if (~var96.field3117 != ~var98 || ~var96.field3067 != ~var97) {
                        var96.field3117 = var98;
                        var96.field3067 = var97;
                        class57.method305(-126, var96);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -175) {
                    class119.field2146 = class21.field394.method572(false) * 30;
                    class191.field3733 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -256) {
                    int var99 = class21.field394.method564(arg0 + 28);
                    class111.method687(var99, (byte) -98);
                    class133.field2407[class10.method61(31, class209.field4005++)] = class10.method61(32767, var99);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -193) {
                    int var100 = class21.field394.method599(-16003);
                    class7 var101 = (class7) class134.field2436.method51((long) var100, -104);
                    if (var101 != null) {
                        class157.method950(true, var101, false);
                    }
                    if (class50.field925 != null) {
                        class57.method305(-118, class50.field925);
                        class50.field925 = null;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -100) {
                    class59.field1100 = class21.field394.method614(0);
                    class26.field469 = class21.field394.method614(0);
                    while (~class21.field394.field1834 > ~class111.field2014) {
                        class105.field1909 = class21.field394.method588((byte) -107);
                        class190.method1205(true);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 108) {
                    class184 var102 = class21.field394.method596(-1);
                    if (!var102.method1137(class21.field391, (byte) 45)) {
                        if (var102.method1137(class111.field2020, (byte) 45)) {
                            boolean var103 = false;
                            class184 var104 = var102.method1162(0, -711833726, var102.method1142(class101.field1863, (byte) 110));
                            long var105 = var104.method1160(0);
                            for (int var107 = 0; class9.field170 > var107; ++var107) {
                                if (~class103.field1878[var107] == ~var105) {
                                    var103 = true;
                                    break;
                                }
                            }
                            if (!var103 && ~class63.field1182 == -1) {
                                class184 var108 = var102.method1162(1 + var102.method1142(class101.field1863, (byte) 110), -711833726, var102.method1159(false) - 9);
                                class149.method914(8, var108, var104, 125);
                            }
                        } else if (!var102.method1137(class88.field1662, (byte) 45)) {
                            if (var102.method1137(class62.field1174, (byte) 45)) {
                                class184 var109 = var102.method1162(0, -711833726, var102.method1142(class62.field1174, (byte) 110));
                                class149.method914(11, var109, class170.field3242, 90);
                            } else if (var102.method1137(class196.field3803, (byte) 45)) {
                                class184 var126 = var102.method1162(0, -711833726, var102.method1142(class196.field3803, (byte) 110));
                                if (class63.field1182 == 0) {
                                    class149.method914(12, var126, class170.field3242, arg0 + -123);
                                }
                            } else if (var102.method1137(class202.field3899, (byte) 45)) {
                                class184 var125 = var102.method1162(0, -711833726, var102.method1142(class202.field3899, (byte) 110));
                                if (~class63.field1182 == -1) {
                                    class149.method914(13, var125, class170.field3242, 49);
                                }
                            } else if (!var102.method1137(class177.field3384, (byte) 45)) {
                                if (var102.method1137(class200.field3882, (byte) 45)) {
                                    class184 var110 = var102.method1162(0, -711833726, var102.method1142(class101.field1863, (byte) 110));
                                    long var111 = var110.method1160(0);
                                    boolean var113 = false;
                                    for (int var114 = 0; ~class9.field170 < ~var114; ++var114) {
                                        if (class103.field1878[var114] == var111) {
                                            var113 = true;
                                            break;
                                        }
                                    }
                                    if (!var113 && ~class63.field1182 == -1) {
                                        class149.method914(15, class170.field3242, var110, 43);
                                    }
                                } else if (!var102.method1137(class169.field3187, (byte) 45)) {
                                    class149.method914(0, var102, class170.field3242, -103);
                                } else {
                                    class184 var115 = var102.method1162(0, arg0 ^ -711833662, var102.method1142(class101.field1863, (byte) 110));
                                    long var116 = var115.method1160(0);
                                    boolean var118 = false;
                                    for (int var119 = 0; ~class9.field170 < ~var119; ++var119) {
                                        if (class103.field1878[var119] == var116) {
                                            var118 = true;
                                            break;
                                        }
                                    }
                                    if (!var118 && ~class63.field1182 == -1) {
                                        class149.method914(16, class170.field3242, var115, -45);
                                    }
                                }
                            } else {
                                class184 var120 = var102.method1162(0, -711833726, var102.method1142(class101.field1863, (byte) 110));
                                long var121 = var120.method1160(0);
                                boolean var123 = false;
                                for (int var124 = 0; ~class9.field170 < ~var124; ++var124) {
                                    if (class103.field1878[var124] == var121) {
                                        var123 = true;
                                        break;
                                    }
                                }
                                if (!var123 && ~class63.field1182 == -1) {
                                    class149.method914(14, class170.field3242, var120, -37);
                                }
                            }
                        } else {
                            class184 var127 = var102.method1162(0, arg0 ^ -711833662, var102.method1142(class101.field1863, (byte) 110));
                            long var128 = var127.method1160(0);
                            boolean var130 = false;
                            for (int var131 = 0; class9.field170 > var131; ++var131) {
                                if (class103.field1878[var131] == var128) {
                                    var130 = true;
                                    break;
                                }
                            }
                            if (!var130 && ~class63.field1182 == -1) {
                                class149.method914(10, class170.field3242, var127, 65);
                            }
                        }
                    } else {
                        class184 var132 = var102.method1162(0, arg0 ^ -711833662, var102.method1142(class101.field1863, (byte) 110));
                        long var133 = var132.method1160(0);
                        boolean var135 = false;
                        for (int var136 = 0; ~var136 > ~class9.field170; ++var136) {
                            if (~class103.field1878[var136] == ~var133) {
                                var135 = true;
                                break;
                            }
                        }
                        if (!var135 && class63.field1182 == 0) {
                            class149.method914(4, class210.field4025, var132, -99);
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 177) {
                    for (int var137 = 0; ~var137 > ~class57.field1024.length; ++var137) {
                        if (class57.field1024[var137] != null) {
                            class57.field1024[var137].field612 = -1;
                        }
                    }
                    for (int var138 = 0; ~var138 > ~class52.field948.length; ++var138) {
                        if (class52.field948[var138] != null) {
                            class52.field948[var138].field612 = -1;
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 140) {
                    class184 var139 = class21.field394.method596(-1);
                    Object[] var140 = new Object[1 + var139.method1159(false)];
                    for (int var141 = var139.method1159(false) + -1; var141 >= 0; --var141) {
                        if (~var139.method1165(var141, false) != -116) {
                            var140[var141 - -1] = new Integer(class21.field394.method599(-16003));
                        } else {
                            var140[var141 - -1] = class21.field394.method596(-1);
                        }
                    }
                    var140[0] = new Integer(class21.field394.method599(-16003));
                    class5 var142 = new class5();
                    var142.field96 = var140;
                    class54.method293(var142, -117);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 39) {
                    int var143 = class21.field394.method590(true);
                    if (~var143 == -65536) {
                        var143 = -1;
                    }
                    int var144 = class21.field394.method566(4);
                    int var145 = class21.field394.method564(122);
                    int var146 = class21.field394.method575(88);
                    if (var145 == 65535) {
                        var145 = -1;
                    }
                    for (int var147 = var143; ~var147 >= ~var145; ++var147) {
                        long var148 = ((long) var146 << 32) + (long) var147;
                        class132 var150 = class205.field3948.method51(var148, -110);
                        if (var150 != null) {
                            var150.method797((byte) -116);
                        }
                        class205.field3948.method55((byte) -100, new class20(var144), var148);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -230) {
                    int var151 = class21.field394.method575(arg0 + 20);
                    int var152 = class21.field394.method611(false);
                    class167 var153 = class44.method255(var151, arg0 ^ 10519);
                    if (~var152 == -65536) {
                        var152 = -1;
                    }
                    if (var153.field2991 != 1 || ~var153.field3054 != ~var152) {
                        var153.field3054 = var152;
                        var153.field2991 = 1;
                        class57.method305(-112, var153);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -216) {
                    if (~class110.field1986 != 0) {
                        class185.method1173(0, 3, class110.field1986);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -39) {
                    int var154 = class21.field394.method566(4);
                    int var155 = class21.field394.method564(114);
                    class36.field671[var155] = var154;
                    if (class94.field1710[var155] != var154) {
                        class94.field1710[var155] = var154;
                        class99.method620(arg0 + -62, var155);
                    }
                    class129.field2335[class10.method61(class92.field1705++, 31)] = var155;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 120) {
                    class11.method67(112, class21.field394);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 89) {
                    class58.method319(arg0 + -64);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 32) {
                    int var156 = class21.field394.method614(0);
                    int var157 = class21.field394.method588((byte) -37);
                    int var158 = class21.field394.method605(arg0 ^ 122);
                    class47.field892 = var158 >> 1;
                    class46.field872.method212(arg0 + -9804, var157, var156, ~(1 & var158) == -2);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 65) {
                    long var159 = class21.field394.method615(88);
                    long var161 = (long) class21.field394.method611(false);
                    boolean var163 = false;
                    long var164 = (long) class21.field394.method568((byte) -94);
                    long var166 = (var161 << 32) + var164;
                    int var168 = class21.field394.method588((byte) -102);
                    for (int var169 = 0; var169 < 100; ++var169) {
                        if (~class143.field2579[var169] == ~var166) {
                            var163 = true;
                            break;
                        }
                    }
                    if (var168 <= 1) {
                        for (int var170 = 0; var170 < class9.field170; ++var170) {
                            if (~class103.field1878[var170] == ~var159) {
                                var163 = true;
                                break;
                            }
                        }
                    }
                    if (!var163 && ~class63.field1182 == -1) {
                        class143.field2579[class169.field3196] = var166;
                        class169.field3196 = (class169.field3196 - -1) % 100;
                        class184 var171 = class211.method1358(class187.method1181(class21.field394, arg0 ^ -32833).method1152(98));
                        if (~var168 != -3 && var168 != 3) {
                            if (var168 != 1) {
                                class149.method914(3, var171, class119.method719(var159, 37).method1147(true), 48);
                            } else {
                                class149.method914(7, var171, class144.method884(0, new class184[] { class106.field1925, class119.method719(var159, 37).method1147(true) }), -44);
                            }
                        } else {
                            class149.method914(7, var171, class144.method884(0, new class184[] { class180.field3436, class119.method719(var159, 37).method1147(true) }), arg0 ^ -59);
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 59) {
                    int var172 = class21.field394.method588((byte) -77);
                    int var173 = class21.field394.method588((byte) -107);
                    int var174 = class21.field394.method588((byte) -72);
                    int var175 = class21.field394.method588((byte) -34);
                    int var176 = class21.field394.method611(false);
                    class37.field691[var172] = true;
                    class21.field408[var172] = var173;
                    class82.field1469[var172] = var174;
                    class19.field354[var172] = var175;
                    class108.field1958[var172] = var176;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 188) {
                    int var177 = class21.field394.method561(-32768);
                    int var178 = class21.field394.method599(arg0 ^ -16067);
                    class167 var179 = class44.method255(var178, arg0 ^ 10519);
                    if (var179.field3035 != var177 || var177 == -1) {
                        var179.field3092 = 0;
                        var179.field3043 = 0;
                        var179.field3035 = var177;
                        class57.method305(-122, var179);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 35) {
                    int var180 = class21.field394.method590(true);
                    int var181 = class21.field394.method610(1163269216);
                    int var182 = class21.field394.method605(71);
                    class7 var183 = (class7) class134.field2436.method51((long) var181, -96);
                    if (var183 != null) {
                        class157.method950(~var183.field119 != ~var180, var183, false);
                    }
                    class135.method816(var182, var181, var180, arg0 ^ 66);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -162) {
                    int var184 = class21.field394.method611(false);
                    int var185 = class21.field394.method566(4);
                    int var186 = class21.field394.method611(false);
                    class167 var187 = class44.method255(var185, arg0 + 10519);
                    class105.field1909 = -1;
                    var187.field3016 = (var186 << 16) + var184;
                    return true;
                }
                if (class105.field1909 == 60) {
                    int var188 = class21.field394.method575(82);
                    class167 var189 = class44.method255(var188, 10583);
                    var189.field2991 = 3;
                    var189.field3054 = class46.field872.field1275.method1307((byte) 73);
                    class57.method305(-123, var189);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -167) {
                    long var190 = class21.field394.method615(arg0 + 58);
                    class21.field394.method591(65280);
                    boolean var192 = false;
                    long var193 = class21.field394.method615(126);
                    long var195 = (long) class21.field394.method611(false);
                    long var197 = (long) class21.field394.method568((byte) -121);
                    int var199 = class21.field394.method588((byte) -121);
                    long var200 = (var195 << 32) - -var197;
                    for (int var202 = 0; ~var202 > -101; ++var202) {
                        if (class143.field2579[var202] == var200) {
                            var192 = true;
                            break;
                        }
                    }
                    if (var199 <= 1) {
                        for (int var203 = 0; ~var203 > ~class9.field170; ++var203) {
                            if (~class103.field1878[var203] == ~var190) {
                                var192 = true;
                                break;
                            }
                        }
                    }
                    if (!var192 && ~class63.field1182 == -1) {
                        class143.field2579[class169.field3196] = var200;
                        class169.field3196 = (class169.field3196 - -1) % 100;
                        class184 var204 = class211.method1358(class187.method1181(class21.field394, -32769).method1152(-117));
                        if (var199 != 2 && ~var199 != -4) {
                            if (var199 == 1) {
                                class37.method224(class119.method719(var193, 37).method1147(true), 85, 9, var204, class144.method884(arg0 + -64, new class184[] { class106.field1925, class119.method719(var190, 37).method1147(true) }));
                            } else {
                                class37.method224(class119.method719(var193, 37).method1147(true), 121, 9, var204, class119.method719(var190, 37).method1147(true));
                            }
                        } else {
                            class37.method224(class119.method719(var193, 37).method1147(true), -106, 9, var204, class144.method884(arg0 ^ 64, new class184[] { class180.field3436, class119.method719(var190, 37).method1147(true) }));
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -29) {
                    int var205 = class21.field394.method588((byte) -97);
                    class179 var206 = new class179();
                    int var207 = var205 >> 6;
                    var206.field3413 = 63 & var205;
                    var206.field3411 = class21.field394.method588((byte) -105);
                    if (var206.field3411 >= 0 && ~var206.field3411 > ~class120.field2159.length) {
                        if (~var206.field3413 == -2 || ~var206.field3413 == -11) {
                            var206.field3408 = class21.field394.method611(false);
                        }
                        if (~var206.field3413 <= -3 && var206.field3413 <= 6) {
                            if (~var206.field3413 == -3) {
                                var206.field3412 = 64;
                                var206.field3410 = 64;
                            }
                            if (var206.field3413 == 3) {
                                var206.field3412 = 0;
                                var206.field3410 = 64;
                            }
                            if (~var206.field3413 == -5) {
                                var206.field3410 = 64;
                                var206.field3412 = 128;
                            }
                            if (~var206.field3413 == -6) {
                                var206.field3410 = 0;
                                var206.field3412 = 64;
                            }
                            if (~var206.field3413 == -7) {
                                var206.field3412 = 64;
                                var206.field3410 = 128;
                            }
                            var206.field3413 = 2;
                            var206.field3407 = class21.field394.method611(false);
                            var206.field3405 = class21.field394.method611(false);
                            var206.field3409 = class21.field394.method588((byte) -96);
                        }
                        class2.field57[var207] = var206;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -41) {
                    int var208 = class21.field394.method575(91);
                    int var209 = class21.field394.method564(65);
                    int var210 = class21.field394.method590(true);
                    int var211 = class21.field394.method564(51);
                    class167 var212 = class44.method255(var208, 10583);
                    if (var212.field3039 != var209 || var212.field3033 != var210 || var212.field3118 != var211) {
                        var212.field3033 = var210;
                        var212.field3118 = var211;
                        var212.field3039 = var209;
                        class57.method305(-117, var212);
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 107) {
                    int var213 = class111.field2014 + class21.field394.field1834;
                    int var214 = class21.field394.method611(false);
                    int var215 = class21.field394.method611(false);
                    if (class110.field1986 != var214) {
                        class110.field1986 = var214;
                        class154.method934(-72, class110.field1986);
                        class190.method1216(arg0 + -192, class110.field1986);
                        for (int var216 = 0; ~var216 > -101; ++var216) {
                            class99.field1849[var216] = true;
                        }
                    }
                    while (var215-- > 0) {
                        int var217 = class21.field394.method599(-16003);
                        int var218 = class21.field394.method611(false);
                        int var219 = class21.field394.method588((byte) -78);
                        class7 var220 = (class7) class134.field2436.method51((long) var217, 85);
                        if (var220 != null && ~var220.field119 != ~var218) {
                            class157.method950(true, var220, false);
                            var220 = null;
                        }
                        if (var220 == null) {
                            var220 = class135.method816(var219, var217, var218, 2);
                        }
                        var220.field132 = true;
                    }
                    for (class7 var221 = (class7) class134.field2436.method57(-19654); var221 != null; var221 = (class7) class134.field2436.method49(1)) {
                        if (var221.field132) {
                            var221.field132 = false;
                        } else {
                            class157.method950(true, var221, false);
                        }
                    }
                    class205.field3948 = new class9(512);
                    while (~class21.field394.field1834 > ~var213) {
                        int var222 = class21.field394.method599(-16003);
                        int var223 = class21.field394.method611(false);
                        int var224 = class21.field394.method611(false);
                        int var225 = class21.field394.method599(-16003);
                        for (int var226 = var223; ~var224 <= ~var226; ++var226) {
                            long var227 = ((long) var222 << 32) + (long) var226;
                            class205.field3948.method55((byte) -117, new class20(var225), var227);
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -192) {
                    class209.field4012 = true;
                    class24.field442 = class21.field394.method588((byte) -79);
                    class65.field1240 = class21.field394.method588((byte) -68);
                    class138.field2499 = class21.field394.method611(false);
                    class82.field1471 = class21.field394.method588((byte) -50);
                    class123.field2241 = class21.field394.method588((byte) -105);
                    if (~class123.field2241 <= -101) {
                        int var229 = class24.field442 * 128 + 64;
                        int var230 = class65.field1240 * 128 + 64;
                        int var231 = class115.method706(var229, class47.field892, arg0 ^ 63, var230) + -class138.field2499;
                        int var232 = -class143.field2585 + var231;
                        int var233 = -class59.field1096 + var229;
                        int var234 = -class78.field1418 + var230;
                        int var235 = (int) Math.sqrt((double) (var233 * var233 + var234 * var234));
                        class119.field2147 = 2047 & (int) (325.949D * Math.atan2((double) var232, (double) var235));
                        class34.field590 = (int) (Math.atan2((double) var233, (double) var234) * -325.949D) & 2047;
                        if (class119.field2147 < 128) {
                            class119.field2147 = 128;
                        }
                        if (~class119.field2147 < -384) {
                            class119.field2147 = 383;
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -22) {
                    class54.method290(class111.field2014, class98.field1841, arg0 ^ 4335, class21.field394);
                    class105.field1909 = -1;
                    return true;
                }
                if (arg0 != 64) {
                    field3794 = null;
                }
                if (class105.field1909 == 176) {
                    class135.method811(-8);
                    class105.field1909 = -1;
                    return false;
                }
                if (~class105.field1909 == -219) {
                    class9.field170 = class111.field2014 / 8;
                    for (int var236 = 0; ~var236 > ~class9.field170; ++var236) {
                        class103.field1878[var236] = class21.field394.method615(30);
                        class118.field2129[var236] = class119.method719(class103.field1878[var236], 37);
                    }
                    class158.field2825 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 70) {
                    class59.field1100 = class21.field394.method605(arg0 + 63);
                    class26.field469 = class21.field394.method614(0);
                    for (int var237 = class26.field469; class26.field469 + 8 > var237; ++var237) {
                        for (int var238 = class59.field1100; var238 < class59.field1100 + 8; ++var238) {
                            if (class157.field2813[class47.field892][var237][var238] != null) {
                                class157.field2813[class47.field892][var237][var238] = null;
                                class136.method820(var237, var238, 0);
                            }
                        }
                    }
                    for (class186 var239 = (class186) class79.field1429.method404(false); var239 != null; var239 = (class186) class79.field1429.method414(-120)) {
                        if (~class26.field469 >= ~var239.field3605 && class26.field469 + 8 > var239.field3605 && ~var239.field3600 <= ~class59.field1100 && ~var239.field3600 > ~(class59.field1100 + 8) && ~class47.field892 == ~var239.field3592) {
                            var239.field3595 = 0;
                        }
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 149) {
                    class154.method936(65536);
                    int var240 = class21.field394.method566(4);
                    int var241 = class21.field394.method614(0);
                    int var242 = class21.field394.method605(39);
                    class128.field2312[var241] = var240;
                    class79.field1437[var241] = var242;
                    class16.field304[var241] = 1;
                    for (int var243 = 0; ~var243 > -99; ++var243) {
                        if (~class129.field2336[var243] >= ~var240) {
                            class16.field304[var241] = var243 + 2;
                        }
                    }
                    class15.field286[class10.method61(31, class63.field1199++)] = var241;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 84) {
                    class154.method936(65536);
                    class191.field3723 = class21.field394.method588((byte) -29);
                    class191.field3733 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 220) {
                    int var244 = class21.field394.method599(-16003);
                    int var245 = class21.field394.method611(false);
                    class167 var246;
                    if (~var244 > -1) {
                        var246 = null;
                    } else {
                        var246 = class44.method255(var244, 10583);
                    }
                    if (~var244 > 69999) {
                        var245 += 32768;
                    }
                    if (var246 != null) {
                        for (int var247 = 0; var247 < var246.field3130.length; ++var247) {
                            var246.field3130[var247] = 0;
                            var246.field3056[var247] = 0;
                        }
                    }
                    class127.method763(-54, var245);
                    int var248 = class21.field394.method611(false);
                    for (int var249 = 0; ~var249 > ~var248; ++var249) {
                        int var250 = class21.field394.method611(false);
                        int var251 = class21.field394.method588((byte) -109);
                        if (~var251 == -256) {
                            var251 = class21.field394.method610(1163269216);
                        }
                        if (var246 != null && ~var246.field3130.length < ~var249) {
                            var246.field3130[var249] = var250;
                            var246.field3056[var249] = var251;
                        }
                        method1238(var245, true, var251, var250 + -1, var249);
                    }
                    if (var246 != null) {
                        class57.method305(-126, var246);
                    }
                    class154.method936(65536);
                    class133.field2407[class10.method61(class209.field4005++, 31)] = class10.method61(var245, 32767);
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -115) {
                    class172.field3266 = class21.field394.method588((byte) -72);
                    class158.field2825 = class136.field2471;
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 13) {
                    int var252 = class21.field394.method564(79);
                    class110.field1986 = var252;
                    class154.method934(arg0 + -175, var252);
                    class190.method1216(102, class110.field1986);
                    for (int var253 = 0; ~var253 > -101; ++var253) {
                        class99.field1849[var253] = true;
                    }
                    class105.field1909 = -1;
                    return true;
                }
                if (~class105.field1909 == -180) {
                    class101.field1870 = class21.field394.method588((byte) -122);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 157) {
                    class79.field1431 = class21.field394.method588((byte) -73);
                    class71.field1343 = class21.field394.method588((byte) -36);
                    class47.field891 = class21.field394.method588((byte) -112);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 61) {
                    int var254 = class21.field394.method564(arg0 + 3);
                    if (var254 == 65535) {
                        var254 = -1;
                    }
                    class26.method173(arg0 ^ 67, var254);
                    class105.field1909 = -1;
                    return true;
                }
                if (class105.field1909 == 68) {
                    int var255 = class21.field394.method579(-2100098936);
                    int var256 = class21.field394.method564(52);
                    if (var256 == 65535) {
                        var256 = -1;
                    }
                    class74.method433(var255, 99, var256);
                    class105.field1909 = -1;
                    return true;
                }
                class5.method38((byte) -44, "T1 - " + class105.field1909 + "," + field3779 + "," + class98.field1838 + " - " + class111.field2014, (Throwable) null);
                class135.method811(82);
            } catch (IOException var260) {
                class167.method1042(40);
            } catch (Exception var261) {
                String var258 = "T2 - " + class105.field1909 + "," + field3779 + "," + class98.field1838 + " - " + class111.field2014 + "," + (class46.field872.field644[0] + class57.field1020) + "," + (class46.field872.field615[0] + class129.field2331) + " - ";
                for (int var259 = 0; ~class111.field2014 < ~var259 && var259 < 50; ++var259) {
                    var258 = var258 + class21.field394.field1809[var259] + ",";
                }
                class5.method38((byte) -80, var258, var261);
                class135.method811(116);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3778 = arg0.method588((byte) -47);
            }
        } else {
            this.field3785 = arg0.method588((byte) -46);
        }
        if (arg2) {
            field3789 = -40;
        }
        ++field3787;
    }
}

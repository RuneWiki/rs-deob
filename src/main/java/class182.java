import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class182 extends class272 {

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Z")
    private boolean field3338 = true;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Z")
    private boolean field3352 = true;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lli;")
    public static class185 field3342 = class245.method1649("::clientjs5drop", -13);

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lli;")
    public static class185 field3339 = class245.method1649("rot:", -100);

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lli;")
    public static class185 field3351 = class245.method1649("Objet d(Wabonn-Bs", -93);

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "Lli;")
    public static class185 field3350 = class245.method1649(" )2> <col=ffff00>", -109);

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "Lvj;")
    public static class88 field3349 = new class88(5000);

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "Lli;")
    public static class185 field3356 = class245.method1649("<col=ffffff>", 122);

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "Lli;")
    public static class185 field3357 = class245.method1649("tbrefresh", 123);

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "[Lb;")
    public static class49[] field3345;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3346;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field4832 = arg0.method867(false) == 1;
                }
            } else {
                this.field3338 = ~arg0.method867(false) == -2;
            }
        } else {
            this.field3352 = ~arg0.method867(false) == -2;
        }
        int var5 = -110 % ((-21 - arg1) / 55);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3354;
        if (arg1 != 4421) {
            return null;
        } else {
            int[] var3 = super.field4819.method1632(0, arg0);
            if (super.field4819.field4294) {
                int[] var4 = this.method1866(!this.field3338 ? arg0 : class99.field1826 - arg0, 0, 119);
                if (!this.field3352) {
                    class190.method1369(var4, 0, var3, 0, class246.field4385);
                } else {
                    for (int var5 = 0; ~class246.field4385 < ~var5; ++var5) {
                        var3[var5] = var4[class59.field1037 - var5];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        field3345 = null;
        field3342 = null;
        field3339 = null;
        field3357 = null;
        field3356 = null;
        field3350 = null;
        field3349 = null;
        if (!arg0) {
            field3351 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int[][] var3 = super.field4818.method1514(-2, arg0);
        ++field3353;
        if (super.field4818.field3954) {
            int[][] var4 = this.method1860(this.field3338 ? -arg0 + class99.field1826 : arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            if (this.field3352) {
                for (int var11 = 0; ~class246.field4385 < ~var11; ++var11) {
                    var9[var11] = var5[-var11 + class59.field1037];
                    var10[var11] = var6[-var11 + class59.field1037];
                    var8[var11] = var7[-var11 + class59.field1037];
                }
            } else {
                for (int var12 = 0; class246.field4385 > var12; ++var12) {
                    var9[var12] = var5[var12];
                    var10[var12] = var6[var12];
                    var8[var12] = var7[var12];
                }
            }
        }
        int var13 = 10 % ((arg1 - -60) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static final void method1283(byte arg0) {
        ++field3355;
        if (arg0 < 82) {
            method1287(false);
        }
        class165.field3078.method80(-14113);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public static final void method1284(byte arg0, int arg1) {
        ++field3340;
        int var2 = 93 % ((-65 - arg0) / 36);
        class174 var3 = class249.method1671(10, arg1, (byte) 60);
        var3.method1234((byte) -42);
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        ++field3358;
        if (class33.field547 > arg0) {
            class157.method1113(arg0 + 109);
        } else {
            class238.field4246 = class125.field2252;
            class125.field2252 = null;
            class276.method1892((byte) -113, 40);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3341;
        class237.field4233 = 0;
        if (arg6 == 50) {
            for (int var7 = -1; ~var7 > ~(class17.field281 - -class108.field1943); ++var7) {
                class142 var23;
                if (var7 != -1) {
                    if (~class17.field281 < ~var7) {
                        var23 = class93.field1774[class174.field3187[var7]];
                    } else {
                        var23 = class87.field1712[class97.field1811[-class17.field281 + var7]];
                    }
                } else {
                    var23 = class241.field4310;
                }
                if (var23 != null && var23.method463(true)) {
                    if (var23 instanceof class71) {
                        class81 var24 = ((class71) var23).field1236;
                        if (var24.field1411 != null) {
                            var24 = var24.method525((byte) -88);
                        }
                        if (var24 == null) {
                            continue;
                        }
                    }
                    if (~class17.field281 >= ~var7) {
                        class81 var30 = ((class71) var23).field1236;
                        if (var30.field1411 != null) {
                            var30 = var30.method525((byte) -88);
                        }
                        if (var30.field1477 >= 0 && class154.field2905.length > var30.field1477) {
                            int var31;
                            if (~var30.field1420 == 0) {
                                var31 = 15 + var23.method1024(true);
                            } else {
                                var31 = var30.field1420 + 15;
                            }
                            class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var31);
                            if (~class28.field475 < 0) {
                                class154.field2905[var30.field1477].method707(arg0 - -class28.field475 + -12, class223.field4088 + arg4 + -30);
                            }
                        }
                        class201[] var32 = class10.field204;
                        for (int var33 = 0; ~var32.length < ~var33; ++var33) {
                            class201 var48 = var32[var33];
                            if (var48 != null && var48.field3695 == 1 && ~class97.field1811[-class17.field281 + var7] == ~var48.field3689 && class211.field3851 % 20 < 10) {
                                int var49;
                                if (var30.field1420 != -1) {
                                    var49 = var30.field1420 + 15;
                                } else {
                                    var49 = 15 + var23.method1024(true);
                                }
                                class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var49);
                                if (class28.field475 > -1) {
                                    class262.field4647[var48.field3685].method707(class28.field475 + arg0 - 12, class223.field4088 - 28 + arg4);
                                }
                            }
                        }
                    } else {
                        int var25 = 30;
                        class188 var26 = (class188) var23;
                        if (var26.field3491 != -1 || ~var26.field3501 != 0) {
                            class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var23.method1024(true) - -15);
                            if (class28.field475 > -1) {
                                if (var26.field3491 != -1) {
                                    class31.field519[var26.field3491].method707(class28.field475 + -12 + arg0, -var25 + class223.field4088 + arg4);
                                    var25 += 25;
                                }
                                if (~var26.field3501 != 0) {
                                    class154.field2905[var26.field3501].method707(class28.field475 + arg0 + -12, arg4 - var25 + class223.field4088);
                                    var25 += 25;
                                }
                            }
                        }
                        if (var7 >= 0) {
                            int var27 = 0;
                            class201[] var28 = class10.field204;
                            while (~var27 > ~var28.length) {
                                class201 var29 = var28[var27];
                                if (var29 != null && ~var29.field3695 == -11 && ~class174.field3187[var7] == ~var29.field3689) {
                                    class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var23.method1024(true) - -15);
                                    if (class28.field475 > -1) {
                                        class262.field4647[var29.field3685].method707(class28.field475 - 12 + arg0, -var25 + arg4 - -class223.field4088);
                                    }
                                }
                                ++var27;
                            }
                        }
                    }
                    if (var23.field2713 != null && (~var7 <= ~class17.field281 || ~class146.field2775 == -1 || ~class146.field2775 == -4 || ~class146.field2775 == -2 && class251.method1705(((class188) var23).field3514, false))) {
                        class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var23.method1024(true));
                        if (~class28.field475 < 0 && class44.field690 > class237.field4233) {
                            class44.field686[class237.field4233] = class82.field1608.method1843(var23.field2713) / 2;
                            class44.field685[class237.field4233] = class82.field1608.field4773;
                            class44.field696[class237.field4233] = class28.field475;
                            class44.field692[class237.field4233] = class223.field4088;
                            class44.field694[class237.field4233] = var23.field2650;
                            class44.field687[class237.field4233] = var23.field2727;
                            class44.field683[class237.field4233] = var23.field2657;
                            class44.field697[class237.field4233] = var23.field2713;
                            ++class237.field4233;
                        }
                    }
                    if (class211.field3851 < var23.field2688) {
                        class211 var34 = class130.field2340[1];
                        class211 var35 = class130.field2340[0];
                        int var39;
                        if (var23 instanceof class71) {
                            class71 var36 = (class71) var23;
                            class211[] var37 = (class211[]) class52.field901.method82(3, (long) var36.field1236.field1413);
                            if (var37 == null) {
                                var37 = class199.method1426(var36.field1236.field1413, class21.field365, 0, -1);
                                if (var37 != null) {
                                    class52.field901.method84(126, (long) var36.field1236.field1413, var37);
                                }
                            }
                            class81 var38 = var36.field1236;
                            if (var37 != null && ~var37.length == -3) {
                                var34 = var37[1];
                                var35 = var37[0];
                            }
                            if (var38.field1420 != -1) {
                                var39 = var38.field1420;
                            } else {
                                var39 = var23.method1024(true);
                            }
                        } else {
                            var39 = var23.method1024(true);
                        }
                        class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var35.field3853 + 10 + var39);
                        if (class28.field475 > -1) {
                            int var40 = -(var35.field3854 >> 1) + class28.field475 + arg0;
                            int var41 = arg4 - -class223.field4088 + -3;
                            var35.method707(var40, var41);
                            int var42 = var23.field2675 * var35.field3854 / 255;
                            int var43 = var35.field3853;
                            class159.method1127(var40, var41, var40 + var42, var41 + var43);
                            var34.method707(var40, var41);
                            class159.method1148(arg0, arg4, arg0 + arg5, arg4 - -arg2);
                        }
                    }
                    for (int var44 = 0; var44 < 4; ++var44) {
                        if (~var23.field2680[var44] < ~class211.field3851) {
                            int var47;
                            if (var23 instanceof class71) {
                                class71 var45 = (class71) var23;
                                class81 var46 = var45.field1236;
                                if (~var46.field1420 == 0) {
                                    var47 = var23.method1024(true) / 2;
                                } else {
                                    var47 = var46.field1420 / 2;
                                }
                            } else {
                                var47 = var23.method1024(true) / 2;
                            }
                            class253.method1714((byte) 120, arg5 >> 1, var23, arg3, arg1, arg2 >> 1, var47);
                            if (class28.field475 > -1) {
                                if (~var44 == -2) {
                                    class223.field4088 -= 20;
                                }
                                if (var44 == 2) {
                                    class223.field4088 -= 10;
                                    class28.field475 -= 15;
                                }
                                if (~var44 == -4) {
                                    class223.field4088 -= 10;
                                    class28.field475 += 15;
                                }
                                class73.field1279[var23.field2653[var44]].method707(arg0 - -class28.field475 - 12, class223.field4088 + arg4 + -12);
                                class189.field3523.method1833(class90.method591(var23.field2696[var44], 0), class28.field475 + arg0 + -1, arg4 - -3 + class223.field4088, 16777215, 0);
                            }
                        }
                    }
                }
            }
            for (int var8 = 0; class237.field4233 > var8; ++var8) {
                int var9 = class44.field692[var8];
                int var10 = class44.field696[var8];
                int var11 = class44.field686[var8];
                int var12 = class44.field685[var8];
                boolean var13 = true;
                while (var13) {
                    var13 = false;
                    for (int var22 = 0; ~var8 < ~var22; ++var22) {
                        if (~(class44.field692[var22] - class44.field685[var22]) > ~(var9 + 2) && ~(-var12 + var9) > ~(class44.field692[var22] + 2) && class44.field696[var22] + class44.field686[var22] > -var11 + var10 && ~(class44.field696[var22] + -class44.field686[var22]) > ~(var10 + var11) && var9 > class44.field692[var22] + -class44.field685[var22]) {
                            var9 = class44.field692[var22] + -class44.field685[var22];
                            var13 = true;
                        }
                    }
                }
                class28.field475 = class44.field696[var8];
                class223.field4088 = class44.field692[var8] = var9;
                class185 var14 = class44.field697[var8];
                if (~class151.field2870 != -1) {
                    class82.field1608.method1833(var14, class28.field475 + arg0, class223.field4088 + arg4, 16776960, 0);
                } else {
                    int var15 = 16776960;
                    if (class44.field694[var8] < 6) {
                        var15 = class200.field3666[class44.field694[var8]];
                    }
                    if (class44.field694[var8] == 6) {
                        var15 = ~(class252.field4478 % 20) > -11 ? 16711680 : 16776960;
                    }
                    if (class44.field694[var8] == 7) {
                        var15 = ~(class252.field4478 % 20) <= -11 ? 65535 : 255;
                    }
                    if (class44.field694[var8] == 8) {
                        var15 = class252.field4478 % 20 >= 10 ? 8454016 : 45056;
                    }
                    if (~class44.field694[var8] == -10) {
                        int var16 = -class44.field683[var8] + 150;
                        if (var16 >= 50) {
                            if (var16 >= 100) {
                                if (~var16 > -151) {
                                    var15 = 65280 - -((var16 + -100) * 5);
                                }
                            } else {
                                var15 = -(var16 * 327680) + 16776960 + 16384000;
                            }
                        } else {
                            var15 = 16711680 - -(var16 * 1280);
                        }
                    }
                    if (~class44.field694[var8] == -11) {
                        int var17 = -class44.field683[var8] + 150;
                        if (~var17 > -51) {
                            var15 = var17 * 5 + 16711680;
                        } else if (var17 >= 100) {
                            if (var17 < 150) {
                                var15 = -32768000 - -(var17 * 327680) + 255 - (var17 + -100) * 5;
                            }
                        } else {
                            var15 = -((var17 + -50) * 327680) + 16711935;
                        }
                    }
                    if (~class44.field694[var8] == -12) {
                        int var18 = -class44.field683[var8] + 150;
                        if (~var18 <= -51) {
                            if (var18 < 100) {
                                var15 = (var18 - 50) * 327685 + 65280;
                            } else if (var18 < 150) {
                                var15 = 16777215 - (var18 - 100) * 327680;
                            }
                        } else {
                            var15 = 16777215 - var18 * 327685;
                        }
                    }
                    if (~class44.field687[var8] == -1) {
                        class82.field1608.method1833(var14, class28.field475 + arg0, class223.field4088 + arg4, var15, 0);
                    }
                    if (~class44.field687[var8] == -2) {
                        class82.field1608.method1851(var14, arg0 - -class28.field475, arg4 - -class223.field4088, var15, 0, class252.field4478);
                    }
                    if (class44.field687[var8] == 2) {
                        class82.field1608.method1831(var14, class28.field475 + arg0, arg4 - -class223.field4088, var15, 0, class252.field4478);
                    }
                    if (~class44.field687[var8] == -4) {
                        class82.field1608.method1842(var14, class28.field475 + arg0, class223.field4088 + arg4, var15, 0, class252.field4478, -class44.field683[var8] + 150);
                    }
                    if (~class44.field687[var8] == -5) {
                        int var19 = (-class44.field683[var8] + 150) * (100 + class82.field1608.method1843(var14)) / 150;
                        class159.method1127(arg0 - -class28.field475 - 50, arg4, class28.field475 + arg0 - -50, arg2 + arg4);
                        class82.field1608.method1850(var14, -var19 + class28.field475 + arg0 + 50, class223.field4088 + arg4, var15, 0);
                        class159.method1148(arg0, arg4, arg0 - -arg5, arg2 + arg4);
                    }
                    if (~class44.field687[var8] == -6) {
                        int var20 = -class44.field683[var8] + 150;
                        class159.method1127(arg0, arg4 - class82.field1608.field4773 + -1 + class223.field4088, arg0 + arg5, class223.field4088 + arg4 + 5);
                        int var21 = 0;
                        if (var20 >= 25) {
                            if (var20 > 125) {
                                var21 = var20 + -125;
                            }
                        } else {
                            var21 = var20 + -25;
                        }
                        class82.field1608.method1833(var14, class28.field475 + arg0, arg4 - -class223.field4088 + var21, var15, 0);
                        class159.method1148(arg0, arg4, arg0 - -arg5, arg2 + arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)[Ldd;")
    public static final class211[] method1287(boolean arg0) {
        ++field3343;
        class211[] var1 = new class211[class27.field457];
        if (arg0) {
            method1282(false);
        }
        for (int var2 = 0; class27.field457 > var2; ++var2) {
            int var3 = class55.field940[var2] * class258.field4591[var2];
            byte[] var4 = class174.field3182[var2];
            if (class267.field4734[var2]) {
                byte[] var5 = class71.field1241[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; ~var7 > ~var3; ++var7) {
                    var6[var7] = class21.method150(class220.method1526(255, var5[var7]) << 24, class211.field3842[class220.method1526(var4[var7], 255)]);
                }
                var1[var2] = new class143(class87.field1716, class210.field3839, class145.field2766[var2], class249.field4418[var2], class55.field940[var2], class258.field4591[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var3 > var9; ++var9) {
                    var8[var9] = class211.field3842[class220.method1526(var4[var9], 255)];
                }
                var1[var2] = new class101(class87.field1716, class210.field3839, class145.field2766[var2], class249.field4418[var2], class55.field940[var2], class258.field4591[var2], var8);
            }
        }
        class269.method1827((byte) -121);
        return var1;
    }
}

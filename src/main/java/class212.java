import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class212 extends class38 {

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    private final int field3819;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private final int field3813;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private final int field3811;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private final int field3817;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Ldj;")
    private static class44 field3805 = class89.method650(255, "World");

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Ldj;")
    public static class44 field3807 = field3805;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Ldj;")
    public static class44 field3814 = class89.method650(255, "");

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Ldj;")
    public static class44 field3812 = field3805;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Ldj;")
    public static class44 field3806 = class89.method650(255, "(U5");

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
    public static int[] field3809;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BII)I")
    public static final int method1370(byte arg0, int arg1, int arg2) {
        if (arg0 != -92) {
            field3805 = null;
        }
        int var3 = -128 + class152.method982(arg2 - -45365, 1, arg1 + 91923, 4) - (-(class152.method982(arg2 + 10294, 1, arg1 + 37821, 2) + -128 >> 1) - (-128 + class152.method982(arg2, arg0 ^ -91, arg1, 1) >> 2));
        ++field3801;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        field3805 = null;
        if (arg0 >= 59) {
            field3807 = null;
            field3812 = null;
            field3809 = null;
            field3814 = null;
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)V")
    public final void method261(int arg0, int arg1, boolean arg2) {
        ++field3808;
        int var4 = this.field3813 * arg0 >> 12;
        if (arg2) {
            this.method260((byte) 22, -104, 127);
        }
        int var5 = this.field3811 * arg0 >> 12;
        int var6 = this.field3817 * arg1 >> 12;
        int var7 = this.field3819 * arg1 >> 12;
        class231.method1513(super.field676, var6, var7, super.field671, var4, var5, super.field669, (byte) -77);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lld;I)V")
    public static final void method1372(class124 arg0, int arg1) {
        if (arg1 != -12649) {
            method1373(-103, (byte) -68, 79, -78, -65);
        }
        ++field3816;
        if (arg0.field2201 != 0) {
            if (~arg0.field2259 != 0 && ~arg0.field2259 > -32769) {
                class121 var2 = class170.field2960[arg0.field2259];
                if (var2 != null) {
                    int var3 = -var2.field2260 + arg0.field2260;
                    int var4 = -var2.field2195 + arg0.field2195;
                    if (var3 != 0 || ~var4 != -1) {
                        arg0.field2211 = 2047 & (int) (Math.atan2((double) var3, (double) var4) * 325.949D);
                    }
                }
            }
            if (arg0.field2259 >= 32768) {
                int var5 = arg0.field2259 + -32768;
                if (~class123.field2188 == ~var5) {
                    var5 = 2047;
                }
                class24 var6 = class122.field2168[var5];
                if (var6 != null) {
                    int var7 = arg0.field2260 - var6.field2260;
                    int var8 = -var6.field2195 + arg0.field2195;
                    if (~var7 != -1 || var8 != 0) {
                        arg0.field2211 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 2047;
                    }
                }
            }
            if ((~arg0.field2210 != -1 || arg0.field2246 != 0) && (~arg0.field2194 == -1 || ~arg0.field2261 < -1)) {
                int var9 = arg0.field2195 - -((arg0.field2231 + -1) * 64) - (-class143.field2550 + arg0.field2246 + -class143.field2550) * 64;
                int var10 = arg0.field2231 * 64 + -64 + arg0.field2260 + -((-class222.field4020 - class222.field4020 + arg0.field2210) * 64);
                if (var10 != 0 || var9 != 0) {
                    arg0.field2211 = 2047 & (int) (Math.atan2((double) var10, (double) var9) * 325.949D);
                }
                arg0.field2246 = 0;
                arg0.field2210 = 0;
            }
            int var11 = -arg0.field2224 + arg0.field2211 & 2047;
            if (var11 == 0) {
                arg0.field2200 = 0;
            } else {
                ++arg0.field2200;
                if (var11 > 1024) {
                    arg0.field2224 -= arg0.field2201;
                    boolean var12 = true;
                    if (~arg0.field2201 < ~var11 || -arg0.field2201 + 2048 < var11) {
                        arg0.field2224 = arg0.field2211;
                        var12 = false;
                    }
                    if (~arg0.field2264 == ~arg0.field2196 && (arg0.field2200 > 25 || var12)) {
                        if (~arg0.field2258 != 0) {
                            arg0.field2264 = arg0.field2258;
                        } else {
                            arg0.field2264 = arg0.field2197;
                        }
                    }
                } else {
                    arg0.field2224 += arg0.field2201;
                    boolean var13 = true;
                    if (~var11 > ~arg0.field2201 || var11 > -arg0.field2201 + 2048) {
                        arg0.field2224 = arg0.field2211;
                        var13 = false;
                    }
                    if (~arg0.field2264 == ~arg0.field2196 && (arg0.field2200 > 25 || var13)) {
                        if (~arg0.field2256 == 0) {
                            arg0.field2264 = arg0.field2197;
                        } else {
                            arg0.field2264 = arg0.field2256;
                        }
                    }
                }
                arg0.field2224 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIII)V")
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3819 = arg3;
        this.field3813 = arg0;
        this.field3811 = arg2;
        this.field3817 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIII)V")
    public static final void method1373(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class14.field267 && ~arg2 >= ~class57.field1068) {
            int var5 = class201.method1296(class70.field1337, -126, arg4, class70.field1321);
            int var6 = class201.method1296(class70.field1337, -126, arg3, class70.field1321);
            class122.method839(arg2, -7868, var6, var5, arg0);
        }
        if (arg1 != 116) {
            method1372((class124) null, 30);
        }
        ++field3818;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static final void method1374(byte arg0) {
        ++field3815;
        class27.field490 = 0;
        class183.field3183 = 0;
        int var1 = 75 % ((arg0 - -16) / 59);
        class223.method1435(65535);
        class58.method441(29118);
        class40.method280((byte) 31);
        class133.method898(303);
        for (int var2 = 0; ~class183.field3183 < ~var2; ++var2) {
            int var4 = class62.field1156[var2];
            if (~class46.field868 != ~class122.field2168[var4].field2248) {
                class122.field2168[var4] = null;
            }
        }
        if (~class88.field1680 != ~class218.field3957.field1195) {
            throw new RuntimeException("gpp1 pos:" + class218.field3957.field1195 + " psize:" + class88.field1680);
        } else {
            for (int var3 = 0; ~var3 > ~class90.field1702; ++var3) {
                if (class122.field2168[class45.field858[var3]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class90.field1702);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
    public final void method260(byte arg0, int arg1, int arg2) {
        ++field3803;
        int var4 = this.field3813 * arg2 >> 12;
        int var5 = this.field3811 * arg2 >> 12;
        int var6 = this.field3817 * arg1 >> 12;
        if (arg0 != -69) {
            this.method260((byte) 82, 59, -95);
        }
        int var7 = this.field3819 * arg1 >> 12;
        class193.method1237(var5, var7, super.field671, (byte) 108, var4, var6);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method1375(int arg0) {
        ++field3810;
        if (!class58.field1086) {
            class108.field1990[0] = 1003;
            class179.field3071 = 1;
            class30.field525[0] = class105.field1929;
            class73.field1380[0] = class94.field1752;
        }
        if (~class201.field3575 != 0) {
            class1.method4(arg0 ^ -1955, class201.field3575);
        }
        for (int var1 = 0; var1 < class29.field502; ++var1) {
            if (class68.field1289[var1]) {
                class187.field3219[var1] = true;
            }
            class210.field3749[var1] = class68.field1289[var1];
            class68.field1289[var1] = false;
        }
        class135.field2422 = -1;
        class162.field2795 = class46.field868;
        class120.field2141 = -1;
        if (arg0 == 2047) {
            class38.field674 = null;
            if (class201.field3575 != -1) {
                class29.field502 = 0;
                class31.method215(class169.field2926, class201.field3575, 0, arg0 ^ -1931, class130.field2313, 0, 0, -1, 0);
            }
            class99.method687();
            class35.method242(-1);
            if (!class58.field1086) {
                if (class135.field2422 != -1) {
                    method1376(class120.field2141, (byte) 75, class135.field2422);
                }
            } else {
                class224.method1449(1);
            }
            if (class103.field1888 == 3) {
                for (int var2 = 0; class29.field502 > var2; ++var2) {
                    if (class210.field3749[var2]) {
                        class99.method694(class172.field2999[var2], class166.field2860[var2], class128.field2277[var2], class158.field2749[var2], 16711935, 128);
                    } else if (class187.field3219[var2]) {
                        class99.method694(class172.field2999[var2], class166.field2860[var2], class128.field2277[var2], class158.field2749[var2], 16711680, 128);
                    }
                }
            }
            class228.method1495(class102.field1855, class194.field3403, class96.field1774.field2260, class96.field1774.field2195, 0);
            class102.field1855 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
    private static final void method1376(int arg0, byte arg1, int arg2) {
        ++field3802;
        if (arg1 <= 39) {
            method1371((byte) 118);
        }
        if (class179.field3071 >= 2 || ~class39.field719 != -1 || class202.field3614) {
            class44 var3;
            if (~class39.field719 == -2 && ~class179.field3071 > -3) {
                var3 = class70.method555(new class44[] { class187.field3232, class137.field2449, class146.field2579, class23.field383 }, -3);
            } else if (class202.field3614 && class179.field3071 < 2) {
                var3 = class70.method555(new class44[] { class114.field2028, class137.field2449, class201.field3567, class23.field383 }, -3);
            } else {
                var3 = class137.method924(class179.field3071 + -1, (byte) -21);
            }
            if (~class179.field3071 < -3) {
                var3 = class70.method555(new class44[] { var3, class60.field1118, class199.method1287(class179.field3071 - 2, -1), class20.field352 }, -3);
            }
            int var4 = class150.field2620.method417(var3, arg2 + 4, arg0 + 15, 16777215, 0, class101.field1839, class106.field1935);
            class42.method285(15, arg0, 0, arg2 + 4, class150.field2620.method424(var3) + var4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        ++field3804;
        int var4 = this.field3813 * arg1 >> 12;
        int var5 = this.field3811 * arg1 >> 12;
        int var6 = this.field3817 * arg2 >> 12;
        int var7 = -50 / ((-45 - arg0) / 39);
        int var8 = this.field3819 * arg2 >> 12;
        class225.method1480(var5, super.field676, super.field669, var8, var4, var6, (byte) 120);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class108 extends class272 {

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    private int field1938 = 12288;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    private int field1939 = 4096;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    private int field1954 = 2048;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    private int field1946 = 0;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field1937 = 8192;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field1940 = 0;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    private int field1945 = 2048;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1943 = 0;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lli;")
    public static class185 field1955 = class245.method1649("showVideoAd", 124);

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "Lli;")
    private static class185 field1944 = class245.method1649("Hidden", 122);

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "Lli;")
    public static class185 field1959 = class245.method1649("gr-Un:", -86);

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "Lli;")
    public static class185 field1952 = field1944;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lp;")
    public static class82 field1941;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "[Lcg;")
    public static class34[] field1956;

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(III)Z")
    private final boolean method760(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg2) * this.field1938 >> 12;
        ++field1950;
        int var5 = class96.field1804[(var4 * 255 & 1046215) >> 12];
        int var6 = (var5 << 12) / this.field1938;
        int var7 = (var6 << 12) / this.field1937;
        if (arg1 > -34) {
            method761(false);
        }
        int var8 = this.field1939 * var7 >> 12;
        return ~var8 < ~(-arg2 + arg0) && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V")
    public static final void method761(boolean arg0) {
        class99.field1824.method80(-14113);
        class130.field2338.method80(-14113);
        ++field1951;
        if (!arg0) {
            method764(64);
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(III)Z")
    private final boolean method762(int arg0, int arg1, int arg2) {
        ++field1948;
        int var4 = (arg1 - arg0) * this.field1938 >> 12;
        int var5 = class96.field1804[arg2 * var4 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1938;
        int var7 = (var6 << 12) / this.field1937;
        int var8 = this.field1939 * var7 >> 12;
        return arg0 - -arg1 < var8 && arg0 - -arg1 > -var8;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZ[B[Lwf;IB)V")
    public static final void method763(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, class47[] arg5, int arg6, byte arg7) {
        ++field1953;
        if (!arg3) {
            for (int var8 = 0; ~var8 > -5; ++var8) {
                for (int var9 = 0; var9 < 64; ++var9) {
                    for (int var10 = 0; var10 < 64; ++var10) {
                        if (~(arg1 + var9) < -1 && ~(arg1 + var9) > -104 && arg6 + var10 > 0 && arg6 - -var10 < 103) {
                            arg5[var8].field757[arg1 + var9][arg6 + var10] = class220.method1526(arg5[var8].field757[arg1 + var9][arg6 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class118 var12 = new class118(arg4);
        for (int var13 = 0; ~var13 > ~var11; ++var13) {
            for (int var36 = 0; var36 < 64; ++var36) {
                for (int var37 = 0; var37 < 64; ++var37) {
                    class22.method155(0, (byte) -77, arg2, arg1 + var36, arg0, arg6 + var37, var12, arg3, var13);
                }
            }
        }
        boolean var14 = false;
        while (var12.field2155 < var12.field2115.length) {
            int var15 = var12.method867(false);
            if (~var15 != -130) {
                --var12.field2155;
                break;
            }
            var14 = true;
            for (int var16 = 0; var16 < 4; ++var16) {
                byte var17 = var12.method838(1275919136);
                if (~var17 == -1) {
                    int var18 = arg1 - -64;
                    int var19 = arg6;
                    if (~arg6 <= -1) {
                        if (~arg6 <= -105) {
                            var19 = 104;
                        }
                    } else {
                        var19 = 0;
                    }
                    int var20 = arg1;
                    if (~var18 > -1) {
                        var18 = 0;
                    } else if (var18 >= 104) {
                        var18 = 104;
                    }
                    if (arg1 < 0) {
                        var20 = 0;
                    } else if (arg1 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg6 + 64;
                    if (var21 >= 0) {
                        if (~var21 <= -105) {
                            var21 = 104;
                        }
                    } else {
                        var21 = 0;
                    }
                    while (~var20 > ~var18) {
                        while (var21 > var19) {
                            class150.field2836[var16][var20][var19] = 0;
                            ++var19;
                        }
                        ++var20;
                    }
                } else if (var17 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method838(arg7 ^ 1275919193);
                            for (int var25 = arg1 + var22; ~(arg1 + var22 - -4) < ~var25; ++var25) {
                                for (int var26 = arg6 + var23; var26 < arg6 + 4 + var23; ++var26) {
                                    if (~var25 <= -1 && var25 < 104 && ~var26 <= -1 && var26 < 104) {
                                        class150.field2836[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && ~var16 < -1) {
                    int var27 = arg1 + 64;
                    int var28 = arg1;
                    if (arg1 < 0) {
                        var28 = 0;
                    } else if (~arg1 <= -105) {
                        var28 = 104;
                    }
                    int var29 = arg6 - -64;
                    if (~var27 <= -1) {
                        if (~var27 <= -105) {
                            var27 = 104;
                        }
                    } else {
                        var27 = 0;
                    }
                    int var30 = arg6;
                    if (arg6 >= 0) {
                        if (~arg6 <= -105) {
                            var30 = 104;
                        }
                    } else {
                        var30 = 0;
                    }
                    if (~var29 <= -1) {
                        if (~var29 <= -105) {
                            var29 = 104;
                        }
                    } else {
                        var29 = 0;
                    }
                    while (~var28 > ~var27) {
                        while (var29 > var30) {
                            class150.field2836[var16][var28][var30] = class150.field2836[var16 + -1][var28][var30];
                            ++var30;
                        }
                        ++var28;
                    }
                }
            }
        }
        if (arg7 != 121) {
            field1936 = -83;
        }
        if (!var14) {
            for (int var31 = 0; var31 < 4; ++var31) {
                for (int var32 = 0; var32 < 16; ++var32) {
                    for (int var33 = 0; ~var33 > -17; ++var33) {
                        int var34 = (arg1 >> 2) + var32;
                        int var35 = (arg6 >> 2) + var33;
                        if (var34 >= 0 && ~var34 > -27 && ~var35 <= -1 && ~var35 > -27) {
                            class150.field2836[var31][var34][var35] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field1942;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1937 = arg0.method827(255);
                                }
                            } else {
                                this.field1939 = arg0.method827(255);
                            }
                        } else {
                            this.field1938 = arg0.method827(255);
                        }
                    } else {
                        this.field1945 = arg0.method827(255);
                    }
                } else {
                    this.field1940 = arg0.method827(255);
                }
            } else {
                this.field1946 = arg0.method827(255);
            }
        } else {
            this.field1954 = arg0.method827(255);
        }
        int var5 = -120 / ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        class256.method1732((byte) -119);
        ++field1947;
        if (arg0 != 0) {
            method765(-15, true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public static void method764(int arg0) {
        field1952 = null;
        int var1 = -116 % ((-48 - arg0) / 56);
        field1956 = null;
        field1955 = null;
        field1959 = null;
        field1941 = null;
        field1944 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1957;
        int[] var3 = super.field4819.method1632(arg1 ^ arg1, arg0);
        if (super.field4819.field4294) {
            int var4 = class232.field4177[arg0] + -2048;
            for (int var5 = 0; ~class246.field4385 < ~var5; ++var5) {
                int var6 = class38.field598[var5] + -2048;
                int var7 = this.field1946 + var4;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = this.field1954 + var6;
                int var10 = this.field1945 + var4;
                int var11 = var8 > 2048 ? var8 + -4096 : var8;
                int var12 = this.field1940 + var6;
                int var13 = ~var9 <= 2047 ? var9 : var9 + 4096;
                int var14 = var13 <= 2048 ? var13 : var13 + -4096;
                int var15 = var10 < -2048 ? var10 + 4096 : var10;
                int var16 = ~var12 <= 2047 ? var12 : var12 + 4096;
                int var17 = ~var15 < -2049 ? var15 - 4096 : var15;
                int var18 = var16 <= 2048 ? var16 : var16 + -4096;
                var3[var5] = !this.method762(var14, var11, 255) && !this.method760(var17, -75, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public static final void method765(int arg0, boolean arg1) {
        if (~(class241.field4310.field2694 >> 7) == ~class256.field4551 && ~(class241.field4310.field2687 >> 7) == ~class24.field405) {
            class256.field4551 = 0;
        }
        ++field1960;
        int var2 = class17.field281;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            long var4;
            class188 var6;
            if (!arg1) {
                var4 = (long) class174.field3187[var3] << 32;
                var6 = class93.field1774[class174.field3187[var3]];
            } else {
                var6 = class241.field4310;
                var4 = 8791798054912L;
            }
            if (var6 != null && var6.method463(true)) {
                var6.field3488 = false;
                if ((class1.field30 && ~class17.field281 < -201 || class17.field281 > 50) && !arg1 && ~var6.field2693 == ~var6.field2654) {
                    var6.field3488 = true;
                }
                int var7 = var6.field2694 >> 7;
                int var8 = var6.field2687 >> 7;
                if (~var7 <= -1 && var7 < 104 && ~var8 <= -1 && ~var8 > -105) {
                    if (var6.field3483 != null && ~var6.field3517 >= ~class211.field3851 && ~var6.field3490 < ~class211.field3851) {
                        var6.field3488 = false;
                        var6.field2711 = class236.method1606(63, var6.field2687, var6.field2694, class265.field4703);
                        class138.method989(class265.field4703, var6.field2694, var6.field2687, var6.field2711, var6, var6.field2695, var4, var6.field3493, var6.field3499, var6.field3500, var6.field3485);
                    } else {
                        if (var6.method1014(-1) == 1 && ~(var6.field2694 & 127) == -65 && ~(127 & var6.field2687) == -65) {
                            if (class210.field3830[var7][var8] == class252.field4478) {
                                continue;
                            }
                            class210.field3830[var7][var8] = class252.field4478;
                        }
                        var6.field2711 = class236.method1606(arg0 + 22506, var6.field2687, var6.field2694, class265.field4703);
                        class136.method977(class265.field4703, var6.field2694, var6.field2687, var6.field2711, 60 + (var6.method1014(-1) * 64 - 64), var6, var6.field2695, var4, var6.field2690);
                    }
                }
            }
        }
        if (arg0 != -22390) {
            method763(-49, 63, -95, false, (byte[]) null, (class47[]) null, -42, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
    public static final int method766(int arg0, int arg1) {
        ++field1949;
        if (arg1 != -23098) {
            field1941 = null;
        }
        return arg0 & 1023;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class99 extends class51 {

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    private int field2196 = 0;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "Lea;")
    private static class38 field2193 = class9.method46((byte) 105, "Loaded sprites");

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "Lea;")
    private static class38 field2203 = class9.method46((byte) 121, "Create a free account");

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "Lea;")
    public static class38 field2205 = class9.method46((byte) 118, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "Lea;")
    private static class38 field2200 = class9.method46((byte) 108, "yellow:");

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "Lea;")
    public static class38 field2199 = field2193;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "Lea;")
    public static class38 field2195 = class9.method46((byte) 111, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "[Lhc;")
    public static class66[] field2210 = new class66[2048];

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "Lea;")
    public static class38 field2197 = field2203;

    @OriginalMember(owner = "client!la", name = "ub", descriptor = "Lea;")
    public static class38 field2213 = field2200;

    @OriginalMember(owner = "client!la", name = "xb", descriptor = "Lea;")
    public static class38 field2216 = field2200;

    @OriginalMember(owner = "client!la", name = "yb", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!la", name = "tb", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "Ldd;")
    public static class32 field2194;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "[I")
    private int[] field2207;

    @OriginalMember(owner = "client!la", name = "vb", descriptor = "[I")
    private int[] field2214;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "[[I")
    private int[][] field2192;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        for (class42 var1 = (class42) class177.field3580.method177(-35); var1 != null; var1 = (class42) class177.field3580.method185((byte) 67)) {
            int var2 = var1.field921;
            if (class53.method385(var2, 27323)) {
                boolean var3 = true;
                class43[] var4 = class168.field3461[var2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field985;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2172;
                    class43 var7 = class98.method813(var6, arg0 ^ 4192);
                    if (var7 != null) {
                        class172.method1209(var7, -1);
                    }
                }
            }
        }
        ++field2208;
        if (arg0 != 96) {
            method818(100);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int[] var3 = super.field1312.method827(arg1, true);
        if (arg0 >= -125) {
            this.field2207 = null;
        }
        ++field2215;
        if (super.field1312.field2271) {
            int[] var4 = this.method376(arg1, 0, -81);
            int var5 = this.field2196;
            if (var5 != 2) {
                if (var5 == 1) {
                    for (int var6 = 0; ~class86.field2008 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; ~(this.field2192.length - 1) < ~var8 && this.field2192[var8][0] <= var7; ++var8) {
                        }
                        int[] var9 = this.field2192[var8];
                        int[] var10 = this.field2192[var8 - 1];
                        int var11 = (var7 - var10[0] << 12) / (var9[0] + -var10[0]);
                        int var12 = -class33.field673[255 & var11 >> 5] + 4096 >> 1;
                        int var13 = 4096 - var12;
                        var3[var6] = var10[1] * var13 - -(var9[1] * var12) >> 12;
                    }
                } else {
                    for (int var14 = 0; ~class86.field2008 < ~var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; this.field2192.length - 1 > var16 && ~var15 <= ~this.field2192[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field2192[var16];
                        int[] var18 = this.field2192[var16 + -1];
                        int var19 = (var15 - var18[0] << 12) / (var17[0] + -var18[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var18[1] * var20 - -(var17[1] * var19) >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class86.field2008 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; var23 < this.field2192.length + -1 && ~this.field2192[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field2192[var23 + -1];
                    int[] var25 = this.field2192[var23];
                    int var26 = this.method819(-28401, var23 + -2)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method819(-28401, var23 + 1)[1];
                    int var30 = -var26 + var27 + -var28 + var29;
                    int var31 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                    int var32 = var31 * var31 >> 12;
                    int var33 = var26 - (var27 - -var30);
                    int var34 = -var26 + var28;
                    int var35 = (var30 * var31 >> 12) * var32 >> 12;
                    int var36 = var32 * var33 >> 12;
                    int var38 = var31 * var34 >> 12;
                    var3[var21] = var35 + var38 - -var36 + var27;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Leb;I)V")
    public static final void method816(class39 arg0, int arg1) {
        if (arg1 != 0) {
            method816((class39) null, -20);
        }
        ++field2209;
        if (class143.field2986) {
            class125.method930(arg0, arg1 + 13634);
        } else {
            if (class165.field3424 == 1 && ~class87.field2029 <= -716 && ~class105.field2345 <= -454) {
                class130.field2777 = !class130.field2777;
                if (!class130.field2777) {
                    class101.method832(class2.field88, 255, (byte) 87, false, class133.field2815, class187.field3723);
                } else {
                    class35.method234(false);
                }
            }
            if (class86.field2005 != 5) {
                ++class188.field3757;
                if (~class86.field2005 == -11) {
                    if (~class25.field508 != -3 && class158.field3317 == 0) {
                        if (~class165.field3424 == -2) {
                            byte var2 = 5;
                            byte var3 = 100;
                            short var4 = 463;
                            byte var5 = 35;
                            if (class87.field2029 >= var2 && var2 + var3 >= class87.field2029 && ~var4 >= ~class105.field2345 && var4 - -var5 >= class105.field2345) {
                                class84.method713(4594);
                                return;
                            }
                        }
                        if (class51.field1300 != null) {
                            class84.method713(4594);
                        }
                    }
                    int var6 = class165.field3424;
                    int var7 = class105.field2345;
                    int var8 = class87.field2029;
                    if (~class43.field950 == -1) {
                        boolean var9 = false;
                        short var10 = 291;
                        short var11 = 302;
                        if (var6 == 1 && var8 >= var11 + -75 && ~(var11 + 75) <= ~var8 && ~(var10 - 20) >= ~var7 && ~var7 >= ~(var10 + 20)) {
                            class178.field3611 = 0;
                            class43.field950 = 3;
                        }
                        if (~class109.field2450 != -1) {
                            while (class117.method906(arg1)) {
                                if (~class7.field181 == -85) {
                                    var9 = true;
                                    break;
                                }
                            }
                        }
                        short var12 = 462;
                        if (var9 || ~var6 == -2 && ~var8 <= ~(var12 + -75) && ~(var12 + 75) <= ~var8 && ~(var10 + -20) >= ~var7 && ~(var10 + 20) <= ~var7) {
                            class187.field3720 = class80.field1902;
                            class187.field3727 = class2.field24;
                            class187.field3719 = class2.field2;
                            class43.field950 = 2;
                            class178.field3611 = 0;
                        }
                    } else if (class43.field950 != 2) {
                        if (class43.field950 == 3) {
                            short var19 = 382;
                            short var20 = 321;
                            if (var6 == 1 && ~var8 <= ~(var19 + -75) && var19 + 75 >= var8 && var7 >= var20 + -20 && ~var7 >= ~(var20 + 20)) {
                                class43.field950 = 0;
                                return;
                            }
                        }
                    } else {
                        short var13 = 302;
                        short var14 = 231;
                        int var21 = var14 + 30;
                        short var15 = 321;
                        if (var6 == 1 && ~(var21 + -15) >= ~var7 && ~var7 > ~var21) {
                            class178.field3611 = 0;
                        }
                        var21 += 15;
                        if (var6 == 1 && var21 - 15 <= var7 && var7 < var21) {
                            class178.field3611 = 1;
                        }
                        var21 += 15;
                        if (var6 == 1 && ~(var13 + -75) >= ~var8 && ~(var13 + 75) <= ~var8 && ~(var15 + -20) >= ~var7 && ~var7 >= ~(var15 + 20)) {
                            class187.field3725 = class187.field3725.method271(-1).method268(70);
                            if (~class187.field3725.method276((byte) 38) == -1) {
                                class34.method224((byte) -126, class2.field18, class2.field96, class95.field2141);
                            } else if (~class187.field3724.method276((byte) 38) == -1) {
                                class34.method224((byte) -125, class2.field41, class2.field70, class135.field2836);
                            } else {
                                class34.method224((byte) -126, class2.field30, class2.field68, class177.field3589);
                                class7.method31(20, 27931);
                            }
                        } else {
                            short var16 = 462;
                            if (~var6 == -2 && var16 + -75 <= var8 && ~(var16 + 75) <= ~var8 && ~(var15 + -20) >= ~var7 && ~(var15 + 20) <= ~var7) {
                                class187.field3725 = class187.field3723;
                                class43.field950 = 0;
                                class187.field3724 = class187.field3723;
                            }
                            while (true) {
                                boolean var17;
                                label243: do {
                                    while (class117.method906(arg1)) {
                                        var17 = false;
                                        for (int var18 = 0; ~var18 > ~class116.field2546.method276((byte) 38); ++var18) {
                                            if (~class202.field3986 == ~class116.field2546.method265(var18, 115)) {
                                                var17 = true;
                                                break;
                                            }
                                        }
                                        if (~class178.field3611 != -1) {
                                            continue label243;
                                        }
                                        if (~class7.field181 == -86 && class187.field3725.method276((byte) 38) > 0) {
                                            class187.field3725 = class187.field3725.method273(0, 0, class187.field3725.method276((byte) 38) - 1);
                                        }
                                        if (~class7.field181 == -85 || class7.field181 == 80) {
                                            class178.field3611 = 1;
                                        }
                                        if (var17 && ~class187.field3725.method276((byte) 38) > -13) {
                                            class187.field3725 = class187.field3725.method248(class202.field3986, false);
                                        }
                                    }
                                    return;
                                } while (class178.field3611 != 1);
                                if (~class7.field181 == -86 && ~class187.field3724.method276((byte) 38) < -1) {
                                    class187.field3724 = class187.field3724.method273(0, 0, -1 + class187.field3724.method276((byte) 38));
                                }
                                if (~class7.field181 == -85 || class7.field181 == 80) {
                                    class178.field3611 = 0;
                                }
                                if (~class109.field2450 != -1 && ~class7.field181 == -85) {
                                    class187.field3725 = class187.field3725.method271(~arg1).method268(70);
                                    if (class187.field3725.method276((byte) 38) == 0) {
                                        class34.method224((byte) -125, class2.field18, class2.field96, class95.field2141);
                                        return;
                                    }
                                    if (~class187.field3724.method276((byte) 38) == -1) {
                                        class34.method224((byte) -125, class2.field41, class2.field70, class135.field2836);
                                        return;
                                    }
                                    class34.method224((byte) -128, class2.field30, class2.field68, class177.field3589);
                                    class7.method31(20, 27931);
                                    return;
                                }
                                if (var17 && class187.field3724.method276((byte) 38) < 20) {
                                    class187.field3724 = class187.field3724.method248(class202.field3986, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
    private final void method817(byte arg0) {
        ++field2206;
        int[] var2 = this.field2192[0];
        int[] var3 = this.field2192[this.field2192.length + -2];
        int var4 = -34 % ((arg0 - -32) / 41);
        int[] var5 = this.field2192[1];
        int[] var6 = this.field2192[this.field2192.length - 1];
        this.field2214 = new int[] { var2[0] + -var5[0] + var2[0], var2[1] - -var2[1] + -var5[1] };
        this.field2207 = new int[] { var3[0] - var6[0] + var3[0], var3[1] - (var6[1] - var3[1]) };
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            this.field2196 = arg0.method509(126);
            this.field2192 = new int[arg0.method509(125)][2];
            for (int var4 = 0; this.field2192.length > var4; ++var4) {
                this.field2192[var4][0] = arg0.method511(-125);
                this.field2192[var4][1] = arg0.method511(-119);
            }
        }
        ++field2211;
        if (!arg2) {
            field2217 = -49;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        ++field2201;
        if (this.field2192 == null) {
            this.field2192 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2192.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2196 == -3) {
                this.method817((byte) 42);
            }
            class165.method1177(arg0 ^ 125);
            if (arg0 != -2) {
                field2195 = null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
    public static void method818(int arg0) {
        field2200 = null;
        field2205 = null;
        field2199 = null;
        field2216 = null;
        field2197 = null;
        field2193 = null;
        field2210 = null;
        field2194 = null;
        field2195 = null;
        if (arg0 == 7605) {
            field2213 = null;
            field2203 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
    private final int[] method819(int arg0, int arg1) {
        ++field2198;
        if (arg1 < 0) {
            return this.field2214;
        } else if (~arg1 <= ~this.field2192.length) {
            return this.field2207;
        } else {
            if (arg0 != -28401) {
                field2193 = null;
            }
            return this.field2192[arg1];
        }
    }
}

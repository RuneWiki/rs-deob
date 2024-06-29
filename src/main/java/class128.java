import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class128 extends class228 {

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    private int field2232 = 409;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "[I")
    private int[] field2234 = new int[3];

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    private int field2239 = 4096;

    @OriginalMember(owner = "client!nk", name = "lb", descriptor = "I")
    private int field2243 = 4096;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    private int field2231 = 4096;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "Loa;")
    private static class99 field2225 = class221.method1463(2844, "white:");

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "Loa;")
    public static class99 field2227 = field2225;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "Loa;")
    public static class99 field2238 = field2225;

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "I")
    public static int field2241 = -1;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "J")
    public static long field2240 = 0L;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!nk", name = "kb", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "Lcf;")
    public static class93 field2237;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "[[[Lef;")
    public static class216[][][] field2236;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZIIIII)V")
    public static final void method846(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2242;
        if (~class209.field3628 != ~arg3 || class206.field3565 != arg2 || class12.field112 != arg6 && !class139.method951(436421925)) {
            class209.field3628 = arg3;
            class12.field112 = arg6;
            class206.field3565 = arg2;
            if (class139.method951(436421925)) {
                class12.field112 = 0;
            }
            if (!arg1) {
                class138.method943(0, 25);
            } else {
                class138.method943(0, 28);
            }
            class99.method672(class251.field4324, true, true);
            int var7 = class280.field4910;
            class280.field4910 = arg3 * 8 + -48;
            int var8 = class215.field3731;
            class215.field3731 = arg2 * 8 - 48;
            class99.field1673 = class78.method547(class206.field3565 * 8, class209.field3628 * 8, 99);
            int var9 = -var8 + class215.field3731;
            class31.field566 = null;
            int var10 = class215.field3731;
            int var11 = class280.field4910 - var7;
            int var12 = class280.field4910;
            if (arg1) {
                class102.field1735 = 0;
                for (int var13 = 0; var13 < 32768; ++var13) {
                    class156 var14 = class248.field4287[var13];
                    if (var14 != null) {
                        var14.field1325 -= var11 * 128;
                        var14.field1301 -= var9 * 128;
                        if (~var14.field1325 <= -1 && ~var14.field1325 >= -13185 && ~var14.field1301 <= -1 && var14.field1301 <= 13184) {
                            for (int var15 = 0; ~var15 > -11; ++var15) {
                                var14.field1317[var15] -= var11;
                                var14.field1259[var15] -= var9;
                            }
                            class239.field4120[class102.field1735++] = var13;
                        } else {
                            class248.field4287[var13].field2793 = null;
                            class248.field4287[var13] = null;
                        }
                    }
                }
            } else {
                for (int var16 = 0; var16 < 32768; ++var16) {
                    class156 var32 = class248.field4287[var16];
                    if (var32 != null) {
                        for (int var33 = 0; var33 < 10; ++var33) {
                            var32.field1317[var33] -= var11;
                            var32.field1259[var33] -= var9;
                        }
                        var32.field1301 -= var9 * 128;
                        var32.field1325 -= var11 * 128;
                    }
                }
            }
            for (int var17 = 0; ~var17 > -2049; ++var17) {
                class183 var30 = class259.field4515[var17];
                if (var30 != null) {
                    for (int var31 = 0; var31 < 10; ++var31) {
                        var30.field1317[var31] -= var11;
                        var30.field1259[var31] -= var9;
                    }
                    var30.field1301 -= var9 * 128;
                    var30.field1325 -= var11 * 128;
                }
            }
            class255.field4407 = arg6;
            byte var18 = 0;
            if (arg4 < 79) {
                method847(false, 117, (byte[]) null);
            }
            class168.field3006.method1258(arg5, false, arg0, (byte) 115);
            byte var19 = 1;
            byte var20 = 104;
            if (var11 < 0) {
                var18 = 103;
                var19 = -1;
                var20 = -1;
            }
            byte var21 = 0;
            byte var22 = 104;
            byte var23 = 1;
            if (var9 < 0) {
                var22 = -1;
                var23 = -1;
                var21 = 103;
            }
            for (int var24 = var18; var20 != var24; var24 += var19) {
                for (int var26 = var21; ~var22 != ~var26; var26 += var23) {
                    int var27 = var11 + var24;
                    int var28 = var9 + var26;
                    for (int var29 = 0; var29 < 4; ++var29) {
                        if (var27 >= 0 && var28 >= 0 && var27 < 104 && ~var28 > -105) {
                            class32.field579[var29][var24][var26] = class32.field579[var29][var27][var28];
                        } else {
                            class32.field579[var29][var24][var26] = null;
                        }
                    }
                }
            }
            for (class288 var25 = (class288) class254.field4397.method529(10); var25 != null; var25 = (class288) class254.field4397.method533(-69)) {
                var25.field5030 -= var11;
                var25.field5040 -= var9;
                if (~var25.field5030 > -1 || ~var25.field5040 > -1 || var25.field5030 >= 104 || ~var25.field5040 <= -105) {
                    var25.method828((byte) -90);
                }
            }
            if (!arg1) {
                class141.field2481 = 1;
            } else {
                class34.field610 -= var11;
                class2.field13 -= var11 * 128;
                class244.field4212 -= var9;
                class35.field622 -= var11;
                class3.field20 -= var9;
                class221.field3850 -= var9 * 128;
            }
            class123.field2158 = -1;
            if (~class18.field195 != -1) {
                class18.field195 -= var11;
                class118.field2096 -= var9;
            }
            class179.field3110 = 0;
            class168.field2998.method534(1);
            class121.field2126.method534(1);
            class136.method921();
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field2226;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class234.field4046 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2234[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field2232 < var13) {
                    var7[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var9[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2234[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field2232 < var15) {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var9[var11];
                    } else {
                        int var16 = var9[var11];
                        int var17 = var16 - this.field2234[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2232) {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field2243 * var12 >> 12;
                            var8[var11] = this.field2239 * var14 >> 12;
                            var10[var11] = this.field2231 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != -27) {
            field2227 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method1747(false);
                            this.field2234[0] = class71.method502(var5, 16711680) << 4;
                            this.field2234[2] = class71.method502(var5 >> 12, 0);
                            this.field2234[1] = class71.method502(var5 >> 4, 4080);
                        }
                    } else {
                        this.field2243 = arg1.method1740((byte) 64);
                    }
                } else {
                    this.field2239 = arg1.method1740((byte) 68);
                }
            } else {
                this.field2231 = arg1.method1740((byte) 104);
            }
        } else {
            this.field2232 = arg1.method1740((byte) 103);
        }
        if (arg2 != -7618) {
            field2227 = null;
        }
        ++field2228;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method847(boolean arg0, int arg1, byte[] arg2) {
        ++field2233;
        if (arg2 == null) {
            return null;
        } else {
            if (arg1 > ~arg2.length && !class267.field4710) {
                try {
                    class185 var3 = (class185) Class.forName("rf").newInstance();
                    var3.method1265(arg2, true);
                    return var3;
                } catch (Throwable var4) {
                    class267.field4710 = true;
                }
            }
            return !arg0 ? arg2 : class9.method66(arg2, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBI)I")
    public static final int method848(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 & 3;
        if (arg2 >= -72) {
            method847(true, -76, (byte[]) null);
        }
        ++field2224;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            return ~var4 == -3 ? -arg0 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(B)V")
    public static void method849(byte arg0) {
        int var1 = 5 % ((arg0 - 5) / 47);
        field2237 = null;
        field2236 = null;
        field2238 = null;
        field2225 = null;
        field2227 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[[Lef;IIIZZ)Z")
    public static final boolean method850(class216[][][] arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        byte var6 = !arg4 ? (byte) (class55.field904 & 255) : 1;
        ++field2235;
        if (class228.field3951[class255.field4407][arg2][arg3] == var6) {
            return false;
        } else if (~(class230.field3973[class255.field4407][arg2][arg3] & 4) == -1) {
            return false;
        } else if (!arg5) {
            return false;
        } else {
            byte var7 = 0;
            class222.field3860[var7] = arg2;
            int var31 = var7 + 1;
            class33.field598[var7] = arg3;
            class228.field3951[class255.field4407][arg2][arg3] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = 65535 & class222.field3860[var8];
                int var10 = 255 & class222.field3860[var8] >> 24;
                int var11 = (16741793 & class222.field3860[var8]) >> 16;
                int var12 = 65535 & class33.field598[var8];
                boolean var13 = false;
                if (~(4 & class230.field3973[class255.field4407][var9][var12]) == -1) {
                    var13 = true;
                }
                int var14 = class33.field598[var8] >> 16 & 255;
                var8 = 4095 & var8 + 1;
                boolean var15 = false;
                label229: for (int var16 = class255.field4407 + 1; var16 <= 3; ++var16) {
                    if ((class230.field3973[var16][var9][var12] & 8) == 0) {
                        if (var13 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field3762 != null) {
                                int var19 = class228.method1497(63, var11);
                                if (arg0[var16][var9][var12].field3762.field2994 == var19 || ~arg0[var16][var9][var12].field3762.field2976 == ~var19) {
                                    continue;
                                }
                                if (~var10 != -1) {
                                    int var20 = class228.method1497(63, var10);
                                    if (~arg0[var16][var9][var12].field3762.field2994 == ~var20 || ~arg0[var16][var9][var12].field3762.field2976 == ~var20) {
                                        continue;
                                    }
                                }
                                if (~var14 != -1) {
                                    int var21 = class228.method1497(63, var14);
                                    if (~arg0[var16][var9][var12].field3762.field2994 == ~var21 || ~arg0[var16][var9][var12].field3762.field2976 == ~var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var12].field3743 != null) {
                                for (int var22 = 0; arg0[var16][var9][var12].field3748 > var22; ++var22) {
                                    int var23 = (int) (arg0[var16][var9][var12].field3743[var22].field1372 >> 14 & 63L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (3L & arg0[var16][var9][var12].field3743[var22].field1372 >> 20);
                                    int var25 = var23 | var24 << 6;
                                    if (var11 == var25 || ~var10 != -1 && ~var10 == ~var25 || ~var14 != -1 && ~var14 == ~var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class216 var26 = arg0[var16][var9][var12];
                        if (var26 != null && ~var26.field3748 < -1) {
                            for (int var27 = 0; var26.field3748 > var27; ++var27) {
                                class77 var28 = var26.field3743[var27];
                                if (~var28.field1362 != ~var28.field1361 || var28.field1371 != var28.field1357) {
                                    for (int var29 = var28.field1362; ~var28.field1361 <= ~var29; ++var29) {
                                        for (int var30 = var28.field1357; var28.field1371 >= var30; ++var30) {
                                            class228.field3951[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class228.field3951[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    if (~class189.field3337[class255.field4407 + 1][var9][var12] < ~class55.field898[arg1]) {
                        class55.field898[arg1] = class189.field3337[class255.field4407 + 1][var9][var12];
                    }
                    int var17 = var9 << 7;
                    if (~class151.field2650[arg1] >= ~var17) {
                        if (~var17 < ~class270.field4762[arg1]) {
                            class270.field4762[arg1] = var17;
                        }
                    } else {
                        class151.field2650[arg1] = var17;
                    }
                    int var18 = var12 << 7;
                    if (~var18 <= ~class174.field3071[arg1]) {
                        if (var18 > class223.field3875[arg1]) {
                            class223.field3875[arg1] = var18;
                        }
                    } else {
                        class174.field3071[arg1] = var18;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class228.field3951[class255.field4407][var9 - 1][var12] != var6) {
                        class222.field3860[var31] = class179.method1194(-754974720, class179.method1194(var9 + -1, 1179648));
                        class33.field598[var31] = class179.method1194(var12, 1245184);
                        var31 = var31 + 1 & 4095;
                        class228.field3951[class255.field4407][var9 - 1][var12] = var6;
                    }
                    ++var12;
                    if (var12 < 104) {
                        if (~(var9 + -1) <= -1 && ~class228.field3951[class255.field4407][var9 + -1][var12] != ~var6 && ~(4 & class230.field3973[class255.field4407][var9][var12]) == -1 && (class230.field3973[class255.field4407][var9 + -1][var12 + -1] & 4) == 0) {
                            class222.field3860[var31] = class179.method1194(1375731712, class179.method1194(var9 + -1, 1179648));
                            class33.field598[var31] = class179.method1194(var12, 1245184);
                            class228.field3951[class255.field4407][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                        if (class228.field3951[class255.field4407][var9][var12] != var6) {
                            class222.field3860[var31] = class179.method1194(318767104, class179.method1194(var9, 5373952));
                            class33.field598[var31] = class179.method1194(var12, 5439488);
                            var31 = 4095 & var31 + 1;
                            class228.field3951[class255.field4407][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && ~class228.field3951[class255.field4407][var9 + 1][var12] != ~var6 && (class230.field3973[class255.field4407][var9][var12] & 4) == 0 && (class230.field3973[class255.field4407][var9 - -1][var12 + -1] & 4) == 0) {
                            class222.field3860[var31] = class179.method1194(class179.method1194(var9 + 1, 5373952), -1845493760);
                            class33.field598[var31] = class179.method1194(5439488, var12);
                            class228.field3951[class255.field4407][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                    }
                    --var12;
                    if (var9 + 1 < 104 && class228.field3951[class255.field4407][var9 + 1][var12] != var6) {
                        class222.field3860[var31] = class179.method1194(1392508928, class179.method1194(9568256, var9 + 1));
                        class33.field598[var31] = class179.method1194(9633792, var12);
                        class228.field3951[class255.field4407][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 4095;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (~(var9 + -1) <= -1 && ~class228.field3951[class255.field4407][var9 + -1][var12] != ~var6 && (class230.field3973[class255.field4407][var9][var12] & 4) == 0 && ~(class230.field3973[class255.field4407][var9 + -1][var12 + 1] & 4) == -1) {
                            class222.field3860[var31] = class179.method1194(class179.method1194(var9 + -1, 13762560), 301989888);
                            class33.field598[var31] = class179.method1194(var12, 13828096);
                            var31 = 4095 & var31 + 1;
                            class228.field3951[class255.field4407][var9 + -1][var12] = var6;
                        }
                        if (~class228.field3951[class255.field4407][var9][var12] != ~var6) {
                            class222.field3860[var31] = class179.method1194(-1828716544, class179.method1194(var9, 13762560));
                            class33.field598[var31] = class179.method1194(var12, 13828096);
                            var31 = var31 + 1 & 4095;
                            class228.field3951[class255.field4407][var9][var12] = var6;
                        }
                        if (var9 - -1 < 104 && ~class228.field3951[class255.field4407][var9 - -1][var12] != ~var6 && ~(4 & class230.field3973[class255.field4407][var9][var12]) == -1 && ~(4 & class230.field3973[class255.field4407][var9 + 1][var12 + 1]) == -1) {
                            class222.field3860[var31] = class179.method1194(class179.method1194(9568256, var9 - -1), -771751936);
                            class33.field598[var31] = class179.method1194(var12, 9633792);
                            var31 = 4095 & var31 + 1;
                            class228.field3951[class255.field4407][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class55.field898[arg1] != -1000000) {
                class55.field898[arg1] += 10;
                class151.field2650[arg1] -= 50;
                class270.field4762[arg1] += 50;
                class223.field3875[arg1] += 50;
                class174.field3071[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }
}

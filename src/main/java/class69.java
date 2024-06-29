import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class69 extends class115 {

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    private int field983 = 1024;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    private int field989 = 409;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    private int field986 = 1024;

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
    private int field997 = 8;

    @OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
    private int field1001 = 81;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "I")
    private int field996 = 4;

    @OriginalMember(owner = "client!mi", name = "ob", descriptor = "I")
    private int field1002 = 0;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    private int field988 = 204;

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "Lqe;")
    public static class168 field1000 = class66.method448("www)2wtrc", -117);

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[I")
    public static int[] field978;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "[Z")
    public static boolean[] field981;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "[[I")
    private int[][] field991;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "[[I")
    private int[][] field994;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
    private final void method464(boolean arg0) {
        ++field995;
        Random var2 = new Random((long) this.field997);
        this.field991 = new int[this.field997][this.field996];
        this.field994 = new int[this.field997][this.field996 + 1];
        this.field998 = new int[this.field997 + 1];
        this.field990 = 4096 / this.field997;
        this.field982 = 4096 / this.field996;
        int var3 = this.field990 / 2;
        this.field998[0] = 0;
        int var4 = this.field982 / 2;
        this.field980 = this.field1001 / 2;
        int var5 = 0;
        if (arg0) {
            this.field994 = null;
        }
        while (var5 < this.field997) {
            if (var5 > 0) {
                int var6 = this.field990;
                int var7 = (class163.method1056(var2, 4096, 117) + -2048) * this.field988 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field998[var5] = this.field998[var5 + -1] - -var8;
            }
            this.field994[var5][0] = 0;
            for (int var9 = 0; var9 < this.field996; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field982;
                    int var11 = (class163.method1056(var2, 4096, 95) + -2048) * this.field989 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field994[var5][var9] = this.field994[var5][var9 + -1] + var12;
                }
                this.field991[var5][var9] = ~this.field986 >= -1 ? 4096 : -class163.method1056(var2, this.field986, 107) + 4096;
            }
            this.field994[var5][this.field996] = 4096;
            ++var5;
        }
        this.field998[this.field997] = 4096;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field999;
        if (arg1 < 37) {
            this.field1001 = -86;
        }
        int[] var3 = super.field1872.method182((byte) -87, arg0);
        if (super.field1872.field341) {
            int var4 = 0;
            int var5;
            for (var5 = class170.field2963[arg0] + this.field1002; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field997 && this.field998[var4] <= var5) {
                ++var4;
            }
            boolean var6 = (1 & var4) == 0;
            int var7 = var4 + -1;
            int var8 = this.field998[var4];
            int var9 = this.field998[var4 - 1];
            if (this.field980 + var9 < var5 && ~(-this.field980 + var8) < ~var5) {
                for (int var10 = 0; ~class130.field2297 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field983 : this.field983;
                    int var13;
                    for (var13 = (this.field982 * var12 >> 12) + class193.field3367[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field996 > var11 && ~var13 <= ~this.field994[var7][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field994[var7][var11];
                    int var16 = this.field994[var7][var14];
                    if (var13 > this.field980 + var16 && ~var13 > ~(-this.field980 + var15)) {
                        var3[var10] = this.field991[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class22.method115(var3, 0, class130.field2297, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILqe;)Lqe;")
    public static final class168 method465(int arg0, class168 arg1) {
        ++field985;
        if (arg0 != 0) {
            method465(49, (class168) null);
        }
        class4 var2 = class227.method1470(arg1, true);
        return var2 == null ? class43.field566 : var2.field52;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z[Lmj;IIIIIIII)V")
    public static final void method466(boolean arg0, class129[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class216.method1403(arg9, arg2, arg4, arg6);
        class248.method1634();
        if (arg0) {
            field984 = 63;
        }
        for (int var10 = 0; ~arg1.length < ~var10; ++var10) {
            class129 var11 = arg1[var10];
            if (var11 != null && (~var11.field2276 == ~arg8 || ~arg8 == 1412584498 && class240.field4106 == var11)) {
                int var12;
                if (~arg3 != 0) {
                    var12 = arg3;
                } else {
                    class133.field2335[class149.field2586] = var11.field2139 - -arg5;
                    class157.field2717[class149.field2586] = var11.field2231 - -arg7;
                    class169.field2952[class149.field2586] = var11.field2175;
                    class124.field2049[class149.field2586] = var11.field2210;
                    var12 = class149.field2586++;
                }
                var11.field2219 = class133.field2326;
                var11.field2140 = var12;
                if (!var11.field2258 || !client.method264(var11)) {
                    if (~var11.field2136 < -1) {
                        class91.method603(var11, (byte) -128);
                    }
                    int var13 = var11.field2225;
                    int var14 = var11.field2231 + arg7;
                    int var15 = var11.field2139 + arg5;
                    if (class125.field2051 && (client.method266(var11) != 0 || var11.field2230 == 0) && ~var13 < -128) {
                        var13 = 127;
                    }
                    if (class240.field4106 == var11) {
                        if (arg8 != -1412584499 && !var11.field2144) {
                            class247.field4275 = arg1;
                            class97.field1524 = arg5;
                            class241.field4126 = arg7;
                            continue;
                        }
                        if (class234.field3971 && class254.field4388) {
                            int var16 = class146.field2550;
                            int var17 = var16 - class71.field1075;
                            if (class68.field959 > var17) {
                                var17 = class68.field959;
                            }
                            int var18 = class161.field2765;
                            int var19 = var18 - class46.field599;
                            if (~(class68.field959 + class91.field1430.field2175) > ~(var17 - -var11.field2175)) {
                                var17 = -var11.field2175 + class68.field959 + class91.field1430.field2175;
                            }
                            if (class169.field2949 > var19) {
                                var19 = class169.field2949;
                            }
                            if (~(class169.field2949 - -class91.field1430.field2210) > ~(var11.field2210 + var19)) {
                                var19 = class169.field2949 + class91.field1430.field2210 + -var11.field2210;
                            }
                            var15 = var17;
                            var14 = var19;
                        }
                        if (!var11.field2144) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field2230 != 2) {
                        var20 = ~var14 < ~arg2 ? var14 : arg2;
                        var21 = ~var15 >= ~arg9 ? arg9 : var15;
                        int var22 = var11.field2210 + var14;
                        int var23 = var11.field2175 + var15;
                        if (~var11.field2230 == -10) {
                            ++var22;
                            ++var23;
                        }
                        var24 = ~arg4 < ~var23 ? var23 : arg4;
                        var25 = arg6 <= var22 ? arg6 : var22;
                    } else {
                        var21 = arg9;
                        var20 = arg2;
                        var25 = arg6;
                        var24 = arg4;
                    }
                    if (!var11.field2258 || var21 < var24 && ~var25 < ~var20) {
                        if (var11.field2136 != 0) {
                            if (var11.field2136 == 1337) {
                                class246.field4263 = var15;
                                class192.field3360 = var14;
                                class254.field4385 = var11;
                                class47.method323(var15, ~var11.field2136 == -1404, var11.field2210, 4, var14, var11.field2175);
                                class216.method1403(arg9, arg2, arg4, arg6);
                                continue;
                            }
                            if (~var11.field2136 == -1339) {
                                if (var11.method874((byte) -58)) {
                                    class111.method720(var14, var15, var11, 0, var12);
                                    class216.method1403(arg9, arg2, arg4, arg6);
                                }
                                continue;
                            }
                            if (~var11.field2136 == -1340) {
                                if (var11.method874((byte) -28)) {
                                    class44.method293((byte) -119, var15, var12, var14, var11);
                                    class216.method1403(arg9, arg2, arg4, arg6);
                                }
                                continue;
                            }
                            if (~var11.field2136 == -1401) {
                                class90.method594(var11.field2175, (byte) -80, var14, var15, var11.field2210);
                                class194.field3372[var12] = true;
                                class255.field4409[var12] = true;
                                class216.method1403(arg9, arg2, arg4, arg6);
                                continue;
                            }
                            if (var11.field2136 == 1401) {
                                class63.method421(var11.field2210, var14, var11.field2175, var15, 127);
                                class194.field3372[var12] = true;
                                class255.field4409[var12] = true;
                                class216.method1403(arg9, arg2, arg4, arg6);
                                continue;
                            }
                            if (var11.field2136 == 1402) {
                                class170.method1130(var14, var15, 18);
                                class194.field3372[var12] = true;
                                class255.field4409[var12] = true;
                                continue;
                            }
                            if (~var11.field2136 == -1405) {
                                class132.method894(var11, var14, class166.field2832, var11.field2210, var15, class123.field2028, -1594, var11.field2175);
                                class194.field3372[var12] = true;
                                class255.field4409[var12] = true;
                                continue;
                            }
                            if (~var11.field2136 == -1406) {
                                if (class70.field1028) {
                                    int var26 = var11.field2175 + var15;
                                    int var27 = var14 + 15;
                                    class199.field3434.method916(class50.method347(2, new class168[] { class221.field3797, class128.method867((byte) 100, class132.field2319) }), var26, var27, 16776960, -1);
                                    int var109 = var27 + 15;
                                    int var28 = 16776960;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var28 = 16711680;
                                    }
                                    class199.field3434.method916(class50.method347(2, new class168[] { class46.field596, class128.method867((byte) 117, var30), class107.field1715 }), var26, var109, var28, -1);
                                    var27 = var109 + 15;
                                    class194.field3372[var12] = true;
                                    class255.field4409[var12] = true;
                                }
                                continue;
                            }
                        }
                        int var31 = class161.field2765;
                        if (~var11.field2230 == -1 && var11.field2196 && var21 <= class146.field2550 && ~class161.field2765 <= ~var20 && ~class146.field2550 > ~var24 && ~class161.field2765 > ~var25 && !class169.field2956 && !class125.field2051) {
                            class51.field701[0] = 1006;
                            class151.field2640[0] = class63.field874;
                            class125.field2052[0] = class222.field3816;
                            class109.field1748 = 1;
                        }
                        int var32 = class146.field2550;
                        if (!class169.field2956 && ~var32 <= ~var21 && ~var31 <= ~var20 && ~var24 < ~var32 && ~var31 > ~var25) {
                            class165.method1059(var32 - var15, 2, var11, -var14 + var31);
                        }
                        if (var11.field2230 == 0) {
                            if (!var11.field2258 && client.method264(var11) && class129.field2217 != var11) {
                                continue;
                            }
                            if (!var11.field2258) {
                                if (~var11.field2224 < ~(var11.field2291 - var11.field2210)) {
                                    var11.field2224 = -var11.field2210 + var11.field2291;
                                }
                                if (var11.field2224 < 0) {
                                    var11.field2224 = 0;
                                }
                            }
                            method466(false, arg1, var20, var12, var24, -var11.field2203 + var15, var25, var14 - var11.field2224, var11.field2222, var21);
                            if (var11.field2263 != null) {
                                method466(false, var11.field2263, var20, var12, var24, -var11.field2203 + var15, var25, var14 - var11.field2224, var11.field2222, var21);
                            }
                            class114 var33 = (class114) class176.field3079.method1527((long) var11.field2222, (byte) -123);
                            if (var33 != null) {
                                if (~var33.field1857 == -1 && class146.field2550 >= var21 && class161.field2765 >= var20 && class146.field2550 < var24 && var25 > class161.field2765 && !class169.field2956 && !class125.field2051) {
                                    class51.field701[0] = 1006;
                                    class151.field2640[0] = class63.field874;
                                    class109.field1748 = 1;
                                    class125.field2052[0] = class222.field3816;
                                }
                                class98.method643(var15, var20, false, var24, var33.field1853, var25, var21, var14, var12);
                            }
                            class216.method1403(arg9, arg2, arg4, arg6);
                            class248.method1634();
                        }
                        if (class230.field3910[var12] || class93.field1462 > 1) {
                            if (var11.field2230 == 0 && !var11.field2258 && ~var11.field2210 > ~var11.field2291) {
                                class155.method1022(var14, var11.field2291, 0, var11.field2210, var11.field2224, var11.field2175 + var15);
                            }
                            if (var11.field2230 != 1) {
                                if (var11.field2230 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; ~var35 > ~var11.field2253; ++var35) {
                                        for (int var36 = 0; var11.field2166 > var36; ++var36) {
                                            int var37 = (var11.field2179 + 32) * var36 + var15;
                                            int var38 = (32 - -var11.field2199) * var35 + var14;
                                            if (~var34 > -21) {
                                                var38 += var11.field2245[var34];
                                                var37 += var11.field2275[var34];
                                            }
                                            if (var11.field2156[var34] <= 0) {
                                                if (var11.field2152 != null && ~var34 > -21) {
                                                    class65 var39 = var11.method878(var34, 0);
                                                    if (var39 != null) {
                                                        var39.method73(var37, var38);
                                                    } else if (class209.field3635) {
                                                        class65.method443(var11, 0);
                                                    }
                                                }
                                            } else {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field2156[var34] + -1;
                                                if (arg9 < var37 + 32 && var37 < arg4 && ~(var38 + 32) < ~arg2 && arg6 > var38 || class9.field109 == var11 && ~class111.field1778 == ~var34) {
                                                    class65 var43;
                                                    if (~class190.field3311 == -2 && ~class104.field1676 == ~var34 && ~class222.field3806 == ~var11.field2222) {
                                                        var43 = class166.method1061(var11.field2256, var11.field2221[var34], 2, true, 0, var42);
                                                    } else {
                                                        var43 = class166.method1061(var11.field2256, var11.field2221[var34], 1, !arg0, 3153952, var42);
                                                    }
                                                    if (class248.field4291) {
                                                        class194.field3372[var12] = true;
                                                    }
                                                    if (var43 != null) {
                                                        if (class9.field109 == var11 && class111.field1778 == var34) {
                                                            int var44 = -class185.field3271 + class146.field2550;
                                                            int var45 = -class165.field2817 + class161.field2765;
                                                            if (~var45 > -6 && var45 > -5) {
                                                                var45 = 0;
                                                            }
                                                            if (~var44 > -6 && ~var44 < 4) {
                                                                var44 = 0;
                                                            }
                                                            if (~class108.field1733 > -6) {
                                                                var44 = 0;
                                                                var45 = 0;
                                                            }
                                                            var43.method61(var37 - -var44, var38 + var45, 128);
                                                            if (~arg8 != 0) {
                                                                int var46 = class216.field3727;
                                                                int var47 = class216.field3732;
                                                                class129 var48 = arg1[65535 & arg8];
                                                                if (var38 - -var45 < var47 && var48.field2224 > 0) {
                                                                    int var49 = (-var38 + var47 + -var45) * class146.field2539 / 3;
                                                                    if (class146.field2539 * 10 < var49) {
                                                                        var49 = class146.field2539 * 10;
                                                                    }
                                                                    if (var48.field2224 < var49) {
                                                                        var49 = var48.field2224;
                                                                    }
                                                                    class165.field2817 += var49;
                                                                    var48.field2224 -= var49;
                                                                    class65.method443(var48, 0);
                                                                }
                                                                if (~var46 > ~(var45 + 32 + var38) && var48.field2224 < -var48.field2210 + var48.field2291) {
                                                                    int var50 = (var45 - -32 + -var46 + var38) * class146.field2539 / 3;
                                                                    if (~(class146.field2539 * 10) > ~var50) {
                                                                        var50 = class146.field2539 * 10;
                                                                    }
                                                                    if (var48.field2291 - (var48.field2210 - -var48.field2224) < var50) {
                                                                        var50 = -var48.field2210 + var48.field2291 - var48.field2224;
                                                                    }
                                                                    class165.field2817 -= var50;
                                                                    var48.field2224 += var50;
                                                                    class65.method443(var48, 0);
                                                                }
                                                            }
                                                        } else if (class8.field93 == var11 && class19.field232 == var34) {
                                                            var43.method61(var37, var38, 128);
                                                        } else {
                                                            var43.method73(var37, var38);
                                                        }
                                                    } else {
                                                        class65.method443(var11, 0);
                                                    }
                                                }
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (~var11.field2230 == -4) {
                                    int var51;
                                    if (!class106.method700(var11, (byte) -56)) {
                                        var51 = var11.field2137;
                                        if (class129.field2217 == var11 && ~var11.field2191 != -1) {
                                            var51 = var11.field2191;
                                        }
                                    } else {
                                        var51 = var11.field2282;
                                        if (class129.field2217 == var11 && ~var11.field2208 != -1) {
                                            var51 = var11.field2208;
                                        }
                                    }
                                    if (~var13 == -1) {
                                        if (!var11.field2177) {
                                            class216.method1395(var15, var14, var11.field2175, var11.field2210, var51);
                                        } else {
                                            class216.method1405(var15, var14, var11.field2175, var11.field2210, var51);
                                        }
                                    } else if (!var11.field2177) {
                                        class216.method1412(var15, var14, var11.field2175, var11.field2210, var51, 256 - (var13 & 255));
                                    } else {
                                        class216.method1393(var15, var14, var11.field2175, var11.field2210, var51, -(255 & var13) + 256);
                                    }
                                } else if (~var11.field2230 == -5) {
                                    class136 var52 = var11.method868(-1, class222.field3809);
                                    if (var52 == null) {
                                        if (class209.field3635) {
                                            class65.method443(var11, 0);
                                        }
                                    } else {
                                        class168 var53 = var11.field2164;
                                        int var54;
                                        if (!class106.method700(var11, (byte) -111)) {
                                            var54 = var11.field2137;
                                            if (class129.field2217 == var11 && var11.field2191 != 0) {
                                                var54 = var11.field2191;
                                            }
                                        } else {
                                            var54 = var11.field2282;
                                            if (class129.field2217 == var11 && ~var11.field2208 != -1) {
                                                var54 = var11.field2208;
                                            }
                                            if (~var11.field2141.method1109((byte) 100) < -1) {
                                                var53 = var11.field2141;
                                            }
                                        }
                                        if (var11.field2258 && ~var11.field2187 != 0) {
                                            class242 var55 = class151.method1005(520, var11.field2187);
                                            var53 = var55.field4167;
                                            if (var53 == null) {
                                                var53 = class150.field2617;
                                            }
                                            if ((~var55.field4178 == -2 || ~var11.field2195 != -2) && ~var11.field2195 != 0) {
                                                var53 = class50.method347(2, new class168[] { class85.field1328, var53, class121.field2012, class242.method1579((byte) -71, var11.field2195) });
                                            }
                                        }
                                        if (class211.field3644 == var11) {
                                            var54 = var11.field2137;
                                            var53 = class63.field863;
                                        }
                                        if (!var11.field2258) {
                                            var53 = class107.method705(var53, var11, true);
                                        }
                                        var52.method942(var53, var15, var14, var11.field2175, var11.field2210, var54, !var11.field2288 ? -1 : 0, var11.field2286, var11.field2193, var11.field2132);
                                    }
                                } else if (var11.field2230 == 5) {
                                    if (!var11.field2258) {
                                        class65 var64 = var11.method871(0, class106.method700(var11, (byte) -93));
                                        if (var64 == null) {
                                            if (class209.field3635) {
                                                class65.method443(var11, 0);
                                            }
                                        } else {
                                            var64.method73(var15, var14);
                                        }
                                    } else {
                                        class65 var56;
                                        if (var11.field2187 != -1) {
                                            var56 = class166.method1061(var11.field2256, var11.field2195, var11.field2146, !arg0, var11.field2240, var11.field2187);
                                        } else {
                                            var56 = var11.method871(0, false);
                                        }
                                        if (var56 == null) {
                                            if (class209.field3635) {
                                                class65.method443(var11, 0);
                                            }
                                        } else {
                                            int var57 = var56.field911;
                                            int var58 = var56.field917;
                                            if (!var11.field2283) {
                                                int var63 = var11.field2175 * 4096 / var58;
                                                if (var11.field2188 != 0) {
                                                    var56.method442(var11.field2188, 0, var63, var11.field2210 / 2 + var14, var11.field2175 / 2 + var15);
                                                } else if (~var13 != -1) {
                                                    var56.method80(var15, var14, var11.field2175, var11.field2210, -(255 & var13) + 256);
                                                } else if (var11.field2175 == var58 && ~var11.field2210 == ~var57) {
                                                    var56.method73(var15, var14);
                                                } else {
                                                    var56.method77(var15, var14, var11.field2175, var11.field2210);
                                                }
                                            } else {
                                                int var59 = (var11.field2175 + -1 + var58) / var58;
                                                int var60 = (var57 + -1 + var11.field2210) / var57;
                                                class216.method1408(var15, var14, var15 - -var11.field2175, var11.field2210 + var14);
                                                for (int var61 = 0; var61 < var59; ++var61) {
                                                    for (int var62 = 0; var60 > var62; ++var62) {
                                                        if (var11.field2188 != 0) {
                                                            var56.method442(var11.field2188, 0, 4096, var14 - -(var57 * var62) - -(var57 / 2), var58 * var61 + (var15 - -(var58 / 2)));
                                                        } else if (~var13 == -1) {
                                                            var56.method73(var15 - -(var58 * var61), var14 - -(var57 * var62));
                                                        } else {
                                                            var56.method61(var58 * var61 + var15, var57 * var62 + var14, -(var13 & 255) + 256);
                                                        }
                                                    }
                                                }
                                                class216.method1403(arg9, arg2, arg4, arg6);
                                            }
                                        }
                                    }
                                } else if (~var11.field2230 == -7) {
                                    boolean var65 = class106.method700(var11, (byte) -73);
                                    int var66;
                                    if (!var65) {
                                        var66 = var11.field2239;
                                    } else {
                                        var66 = var11.field2126;
                                    }
                                    int var67 = 0;
                                    class188 var68 = null;
                                    if (~var11.field2187 == 0) {
                                        if (~var11.field2180 != -6) {
                                            if (~var66 != 0) {
                                                class237 var69 = class213.method1370(-1, var66);
                                                var68 = var11.method880(class7.field85.field2001, var11.field2229, var65, var69, (byte) -110);
                                                if (var68 == null && class209.field3635) {
                                                    class65.method443(var11, 0);
                                                }
                                            } else {
                                                var68 = var11.method880(class7.field85.field2001, -1, var65, (class237) null, (byte) -110);
                                                if (var68 == null && class209.field3635) {
                                                    class65.method443(var11, 0);
                                                }
                                            }
                                        } else if (~var11.field2259 == 0) {
                                            var68 = class34.field422.method959(-1, 2168, -1, (class237) null, (class237) null);
                                        } else {
                                            int var70 = 2047 & var11.field2259;
                                            if (~class81.field1233 == ~var70) {
                                                var70 = 2047;
                                            }
                                            class121 var71 = class104.field1677[var70];
                                            class237 var72 = ~var66 != 0 ? class213.method1370(-1, var66) : null;
                                            if (var71 != null && (int) var71.field2000.method1084(32383) << 11 == (var11.field2259 & -2048)) {
                                                var68 = var71.field2001.method959(0, 2168, var11.field2229, var72, (class237) null);
                                            }
                                        }
                                    } else {
                                        class242 var73 = class151.method1005(520, var11.field2187);
                                        if (var73 != null) {
                                            class242 var74 = var73.method1590(!arg0, var11.field2195);
                                            class237 var75 = ~var66 != 0 ? class213.method1370(-1, var66) : null;
                                            var68 = var74.method1591(1, false, var75, var11.field2229);
                                            if (var68 == null) {
                                                class65.method443(var11, 0);
                                            } else {
                                                var67 = -var68.method43() / 2;
                                            }
                                        }
                                    }
                                    if (var68 != null) {
                                        int var76;
                                        if (var11.field2260 > 0) {
                                            var76 = (var11.field2210 << 8) / var11.field2260;
                                        } else {
                                            var76 = 256;
                                        }
                                        int var77;
                                        if (var11.field2157 <= 0) {
                                            var77 = 256;
                                        } else {
                                            var77 = (var11.field2175 << 8) / var11.field2157;
                                        }
                                        int var78 = var11.field2175 / 2 + (var15 - -(var11.field2284 * var77 >> 8));
                                        int var79 = var11.field2210 / 2 + (var11.field2149 * var76 >> 8) + var14;
                                        class248.method1629(var78, var79);
                                        int var80 = class248.field4297[var11.field2124] * var11.field2154 >> 16;
                                        int var81 = class248.field4301[var11.field2124] * var11.field2154 >> 16;
                                        if (!var11.field2258) {
                                            var68.method236(0, var11.field2186, 0, var11.field2124, 0, var80, var81);
                                        } else if (!var11.field2205) {
                                            var68.method236(0, var11.field2186, var11.field2163, var11.field2124, var11.field2246, var11.field2161 + var80 + var67, var11.field2161 + var81);
                                        } else {
                                            ((class37) var68).method226(0, var11.field2186, var11.field2163, var11.field2124, var11.field2246, var80 - -var11.field2161 + var67, var11.field2161 + var81, var11.field2154);
                                        }
                                        class248.method1624();
                                    }
                                } else {
                                    if (var11.field2230 == 7) {
                                        class136 var82 = var11.method868(-1, class222.field3809);
                                        if (var82 == null) {
                                            if (class209.field3635) {
                                                class65.method443(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; ~var84 > ~var11.field2253; ++var84) {
                                            for (int var85 = 0; var85 < var11.field2166; ++var85) {
                                                if (~var11.field2156[var83] < -1) {
                                                    class242 var86 = class151.method1005(520, var11.field2156[var83] - 1);
                                                    class168 var87;
                                                    if (~var86.field4178 != -2 && var11.field2221[var83] == 1) {
                                                        var87 = class50.method347(2, new class168[] { class85.field1328, var86.field4167, class90.field1397 });
                                                    } else {
                                                        var87 = class50.method347(2, new class168[] { class85.field1328, var86.field4167, class121.field2012, class242.method1579((byte) -105, var11.field2221[var83]) });
                                                    }
                                                    int var88 = (12 - -var11.field2199) * var84 + var14;
                                                    int var89 = (115 - -var11.field2179) * var85 + var15;
                                                    if (~var11.field2286 != -1) {
                                                        if (~var11.field2286 != -2) {
                                                            var82.method916(var87, var89 + 114, var88, var11.field2137, !var11.field2288 ? -1 : 0);
                                                        } else {
                                                            var82.method925(var87, var89 - -57, var88, var11.field2137, !var11.field2288 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var82.method941(var87, var89, var88, var11.field2137, !var11.field2288 ? -1 : 0);
                                                    }
                                                }
                                                ++var83;
                                            }
                                        }
                                    }
                                    if (~var11.field2230 == -9 && class98.field1550 == var11 && class84.field1287 == class46.field590) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class136 var92 = class199.field3434;
                                        class168 var93 = var11.field2164;
                                        class168 var94 = class107.method705(var93, var11, true);
                                        while (var94.method1109((byte) 26) > 0) {
                                            int var102 = var94.method1104(class98.field1537, true);
                                            class168 var103;
                                            if (~var102 == 0) {
                                                var103 = var94;
                                                var94 = class222.field3816;
                                            } else {
                                                var103 = var94.method1078(0, (byte) -75, var102);
                                                var94 = var94.method1120(var102 - -4, 92);
                                            }
                                            int var104 = var92.method922(var103);
                                            var91 += var92.field2393 + 1;
                                            if (var104 > var90) {
                                                var90 = var104;
                                            }
                                        }
                                        var91 += 7;
                                        int var95 = var14 + 5 - -var11.field2210;
                                        var90 += 6;
                                        if (~arg6 > ~(var95 - -var91)) {
                                            var95 = -var91 + arg6;
                                        }
                                        int var96 = var15 - (-var11.field2175 + 5) - var90;
                                        if (~var96 > ~(var15 - -5)) {
                                            var96 = var15 + 5;
                                        }
                                        if (var90 + var96 > arg4) {
                                            var96 = arg4 - var90;
                                        }
                                        class216.method1405(var96, var95, var90, var91, 16777120);
                                        class216.method1395(var96, var95, var90, var91, 0);
                                        int var97 = var95 - (-var92.field2393 + -2);
                                        class168 var98 = var11.field2164;
                                        class168 var99 = class107.method705(var98, var11, !arg0);
                                        while (~var99.method1109((byte) 59) < -1) {
                                            int var100 = var99.method1104(class98.field1537, true);
                                            class168 var101;
                                            if (~var100 != 0) {
                                                var101 = var99.method1078(0, (byte) -75, var100);
                                                var99 = var99.method1120(var100 - -4, 91);
                                            } else {
                                                var101 = var99;
                                                var99 = class222.field3816;
                                            }
                                            var92.method941(var101, var96 + 3, var97, 0, -1);
                                            var97 += var92.field2393 + 1;
                                        }
                                    }
                                    if (~var11.field2230 == -10) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (!var11.field2165) {
                                            var105 = var15;
                                            var106 = var14;
                                            var107 = var11.field2175 + var15;
                                            var108 = var11.field2210 + var14;
                                        } else {
                                            var105 = var15;
                                            var106 = var11.field2210 + var14;
                                            var107 = var11.field2175 + var15;
                                            var108 = var14;
                                        }
                                        if (~var11.field2127 != -2) {
                                            class216.method1404(var105, var106, var107, var108, var11.field2137, var11.field2127);
                                        } else {
                                            class216.method1394(var105, var106, var107, var108, var11.field2137);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field979;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 != 395462996) {
            this.method5(-16, (byte) 73);
        }
        this.method464(false);
        ++field987;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static final void method467(byte arg0) {
        ++field993;
        class175.field3062 = null;
        if (arg0 != -74) {
            field984 = 112;
        }
        class100.field1589 = null;
        class204.field3541 = null;
        class92.field1440 = null;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
    public static void method468(int arg0) {
        field981 = null;
        if (arg0 == -5) {
            field978 = null;
            field1000 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field986 = arg1.method731(false);
                                    }
                                } else {
                                    this.field1001 = arg1.method731(false);
                                }
                            } else {
                                this.field1002 = arg1.method731(false);
                            }
                        } else {
                            this.field983 = arg1.method731(false);
                        }
                    } else {
                        this.field988 = arg1.method731(false);
                    }
                } else {
                    this.field989 = arg1.method731(false);
                }
            } else {
                this.field997 = arg1.method758(true);
            }
        } else {
            this.field996 = arg1.method758(true);
        }
        if (arg0 != 107) {
            field981 = null;
        }
        ++field992;
    }
}

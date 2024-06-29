import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class140 extends class30 {

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    private int field2174 = 204;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    private int field2177 = 1;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    private int field2175 = 1;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
    public static int[] field2172 = new int[99];

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "[I")
    public static int[] field2181;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "C")
    public static char field2180;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "[S")
    public static short[] field2179;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2172[var1] = var0 / 4;
        }
        field2181 = new int[14];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method116(int arg0, byte arg1) {
        ++field2169;
        int[] var3 = super.field371.method2367((byte) -99, arg0);
        if (arg1 <= 49) {
            field2179 = null;
        }
        if (super.field371.field5586) {
            for (int var4 = 0; class369.field5610 > var4; ++var4) {
                int var5 = class79.field995[var4];
                int var6 = class132.field2064[arg0];
                int var7 = this.field2177 * var5 >> 12;
                int var8 = this.field2175 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2177) * this.field2177;
                int var10 = var6 % (4096 / this.field2175) * this.field2175;
                if (var10 < this.field2174) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2174 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2174 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[BZI[Lfn;ILe;III)[I", line = 92)
    public static final int[] method1018(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, class72[] arg6, int arg7, class312 arg8, int arg9, int arg10, int arg11) {
        ++field2178;
        int var12 = (arg1 & 7) * 8;
        int var13 = (7 & arg7) * 8;
        if (!arg4) {
            class72 var14 = arg6[arg0];
            for (int var15 = 0; ~var15 > -9; ++var15) {
                for (int var16 = 0; ~var16 > -9; ++var16) {
                    int var17 = arg9 - -class137.method1005(arg10, 7 & var15, 7 & var16, -111);
                    int var18 = arg2 - -class402.method2531((byte) 79, arg10, var16 & 7, var15 & 7);
                    if (var17 > 0 && ~var17 > ~(class80.field1003 - 1) && ~var18 < -1 && ~var18 > ~(class380.field5751 + -1)) {
                        var14.method460(-2097153, var17, var18);
                    }
                }
            }
        }
        byte var19;
        if (!arg4) {
            var19 = 4;
        } else {
            var19 = 1;
        }
        class186 var20 = new class186(arg3);
        int var21 = (arg1 & -8) << 3;
        int var22 = arg7 << 3 & -64;
        byte var23 = 0;
        byte var24 = 0;
        if (~arg10 != -2) {
            if (~arg10 == -3) {
                var24 = 1;
                var23 = 1;
            } else if (~arg10 == -4) {
                var23 = 1;
            }
        } else {
            var24 = 1;
        }
        for (int var25 = 0; var19 > var25; ++var25) {
            for (int var58 = 0; ~var58 > -65; ++var58) {
                for (int var59 = 0; var59 < 64; ++var59) {
                    if (arg11 == var25 && ~var58 <= ~var12 && var58 <= var12 + 8 && ~var59 <= ~var13 && ~(var13 - -8) <= ~var59) {
                        if (var12 + 8 != var58 && var13 - -8 != var59) {
                            int var60 = class137.method1005(arg10, 7 & var58, 7 & var59, -79) + arg9;
                            int var61 = class402.method2531((byte) 79, arg10, 7 & var59, 7 & var58) + arg2;
                            class196.method1378(var61, var60, var22 + var59, arg0, arg10, var21 + var58, false, arg4, var24, var20, 1533773349, var23);
                            if (~var58 == -64 || var59 == 63) {
                                int var62 = var58 == 63 ? 64 : var58;
                                int var63 = var59 == 63 ? 64 : var59;
                                int var64;
                                int var65;
                                if (~arg10 != -1) {
                                    if (~arg10 == -2) {
                                        var64 = var12 - (var62 - (arg2 + 8));
                                        var65 = -var13 + arg9 + var63;
                                    } else if (~arg10 != -3) {
                                        var65 = arg9 + var13 + -var63 + 8;
                                        var64 = -var12 + var62 + arg2;
                                    } else {
                                        var64 = arg2 + 8 - (-var13 + var63);
                                        var65 = -var62 + var12 + arg9 + 8;
                                    }
                                } else {
                                    var64 = arg2 - var13 - -var63;
                                    var65 = -var12 + arg9 + var62;
                                }
                                if (~var65 <= -1 && ~class80.field1003 < ~var65 && ~var64 <= -1 && class380.field5751 > var64) {
                                    class281.field4509[arg0][var65][var64] = class281.field4509[arg0][var60 - -var23][var24 + var61];
                                }
                            }
                        } else {
                            int var66;
                            int var67;
                            if (~arg10 == -1) {
                                var66 = arg2 - -var59 + -var13;
                                var67 = var58 - var12 + arg9;
                            } else if (~arg10 == -2) {
                                var67 = var59 - (var13 - arg9);
                                var66 = var12 - var58 + arg2 - -8;
                            } else if (arg10 == 2) {
                                var66 = -var59 + var13 + arg2 + 8;
                                var67 = arg9 - -8 - (var58 - var12);
                            } else {
                                var66 = -var12 - -var58 + arg2;
                                var67 = var13 - var59 + arg9 + 8;
                            }
                            class196.method1378(var66, var67, var22 + var59, arg0, 0, var21 + var58, true, arg4, 0, var20, 1533773349, 0);
                        }
                    } else {
                        class196.method1378(-1, -1, 0, 0, 0, 0, false, arg4, 0, var20, 1533773349, 0);
                    }
                }
            }
        }
        if (arg5 >= -82) {
            method1018(28, 73, -66, (byte[]) null, false, -117, (class72[]) null, -9, (class312) null, 7, 115, 6);
        }
        boolean var26 = false;
        while (~var20.field3044 > ~var20.field3066.length) {
            int var27 = var20.method1322(false);
            if (var27 == 128) {
                class256.field4147[0] = var20.method1272((byte) -69);
                class256.field4147[1] = var20.method1276((byte) 89);
                class256.field4147[2] = var20.method1276((byte) -111);
                class256.field4147[3] = var20.method1276((byte) -98);
                class256.field4147[4] = var20.method1272((byte) -127);
                var26 = true;
            } else {
                if (var27 != 129) {
                    --var20.field3044;
                    break;
                }
                if (class42.field525 == null) {
                    class42.field525 = new byte[4][][];
                }
                for (int var45 = 0; ~var45 > -5; ++var45) {
                    byte var46 = var20.method1327((byte) -125);
                    if (var46 == 0 && class42.field525[arg0] != null) {
                        if (~arg11 <= ~var45) {
                            int var47 = arg9;
                            int var48 = arg9 + 7;
                            int var49 = arg2;
                            if (~arg9 > -1) {
                                var47 = 0;
                            } else if (~arg9 <= ~class80.field1003) {
                                var47 = class80.field1003;
                            }
                            if (arg2 < 0) {
                                var49 = 0;
                            } else if (arg2 >= class380.field5751) {
                                var49 = class380.field5751;
                            }
                            int var50 = arg2 + 7;
                            if (~var48 <= -1) {
                                if (class80.field1003 <= var48) {
                                    var48 = class80.field1003;
                                }
                            } else {
                                var48 = 0;
                            }
                            if (~var50 <= -1) {
                                if (class380.field5751 <= var50) {
                                    var50 = class380.field5751;
                                }
                            } else {
                                var50 = 0;
                            }
                            while (~var47 > ~var48) {
                                while (~var50 < ~var49) {
                                    class42.field525[arg0][var47][var49] = 0;
                                    ++var49;
                                }
                                ++var47;
                            }
                        }
                    } else if (~var46 == -2) {
                        if (class42.field525[arg0] == null) {
                            class42.field525[arg0] = new byte[class80.field1003 + 1][class380.field5751 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; ~var52 > -65; var52 += 4) {
                                byte var53 = var20.method1327((byte) -105);
                                if (~arg11 <= ~var45) {
                                    for (int var54 = var51; var51 + 4 > var54; ++var54) {
                                        for (int var55 = var52; var52 + 4 > var55; ++var55) {
                                            if (~var12 >= ~var54 && ~(var12 + 8) < ~var54 && ~var55 <= ~var13 && var13 < var13 - -8) {
                                                int var56 = arg9 - -class137.method1005(arg10, var54 & 7, var55 & 7, -32);
                                                int var57 = class402.method2531((byte) 79, arg10, 7 & var55, var54 & 7) + arg2;
                                                if (var56 >= 0 && class80.field1003 > var56 && ~var57 <= -1 && var57 < class380.field5751) {
                                                    class42.field525[arg0][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var28 = false;
        if (!arg4) {
            class375 var29 = null;
            label293: while (true) {
                int var31;
                label286: do {
                    while (true) {
                        while (~var20.field3066.length < ~var20.field3044) {
                            int var30 = var20.method1322(false);
                            if (~var30 != -1) {
                                if (var30 == 1) {
                                    var31 = var20.method1322(false);
                                    continue label286;
                                }
                                if (~var30 != -3) {
                                    throw new IllegalStateException();
                                }
                                if (var29 == null) {
                                    var29 = new class375();
                                }
                                var29.method2397(var20, (byte) -96);
                            } else {
                                var29 = new class375(var20);
                            }
                        }
                        if (var29 != null) {
                            class444.method2752(var29, arg2 >> 3, arg9 >> 3, 19015);
                        }
                        break label293;
                    }
                } while (var31 <= 0);
                for (int var32 = 0; var31 > var32; ++var32) {
                    class369 var33 = new class369(var20);
                    if (~var33.field5593 == -32) {
                        class125 var34 = class296.method1998(-116, var20.method1272((byte) -62));
                        var33.method2370(var34.field1925, (byte) -29, var34.field1928, var34.field1926, var34.field1932);
                    }
                    int var35 = var33.field812 >> 7;
                    int var36 = var33.field809 >> 7;
                    if (var33.field5600 == arg11 && var35 >= var12 && var12 + 8 > var35 && ~var36 <= ~var13 && var36 < var13 + 8) {
                        int var37 = class135.method993(1023 & var33.field812, (byte) 127, arg10, 1023 & var33.field809) + (arg9 << 7);
                        int var38 = (arg2 << 7) + class317.method2109(1023 & var33.field812, 1023, 1023 & var33.field809, arg10);
                        var33.field812 = var37;
                        var33.field809 = var38;
                        int var39 = var33.field812 >> 7;
                        int var40 = var33.field809 >> 7;
                        if (~var39 <= -1 && ~var40 <= -1 && ~var39 > ~class80.field1003 && ~class380.field5751 < ~var40) {
                            var33.field805 = class281.field4509[arg11][var39][var40] + -var33.field805;
                            if (~arg8.method606() < -1) {
                                class112.method828(var33);
                            }
                        }
                    }
                }
            }
        }
        if (!var28 && class42.field525 != null && class42.field525[arg0] != null) {
            int var41 = arg9 + 7;
            int var42 = arg2 + 7;
            for (int var43 = arg9; var41 > var43; ++var43) {
                for (int var44 = arg2; var42 > var44; ++var44) {
                    class42.field525[arg0][var43][var44] = 0;
                }
            }
        }
        if (!var26) {
            return null;
        } else {
            return class256.field4147;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljg;II)V", line = 558)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2174 = arg0.method1272((byte) -82);
                }
            } else {
                this.field2175 = arg0.method1322(false);
            }
        } else {
            this.field2177 = arg0.method1322(false);
        }
        if (arg1 != 6456) {
            this.method116(121, (byte) -108);
        }
        ++field2170;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIII)V", line = 603)
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg1 > ~arg2) {
            for (int var5 = arg1; ~arg2 < ~var5; ++var5) {
                class277.field4414[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; ~var6 > ~arg1; ++var6) {
                class277.field4414[var6][arg4] = arg3;
            }
        }
        ++field2166;
        if (arg0 != 4) {
            method1018(-92, -52, -24, (byte[]) null, true, 115, (class72[]) null, 19, (class312) null, 40, 117, 86);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZZLrb;)V", line = 641)
    public static final void method1020(boolean arg0, boolean arg1, boolean arg2, class196 arg3) {
        ++field2168;
        int var4 = arg3.field3171;
        int var5 = (int) arg3.field2539;
        arg3.method1120(-92);
        if (arg0) {
            class128.method951(var4, (byte) -83);
        }
        class82.method508(var4, (byte) 66);
        class172 var6 = class196.method1375(var5, (byte) -56);
        if (var6 != null) {
            class336.method2219((byte) 6, var6);
        }
        class263.method1803(44);
        if (!arg2 && ~class306.field4847 != 0) {
            class39.method266(1, -4174, class306.field4847);
        }
        class56 var7 = new class56(class392.field5891);
        for (class196 var8 = (class196) var7.method368(arg1); var8 != null; var8 = (class196) var7.method367(!arg1)) {
            if (!var8.method1123((byte) 67)) {
                var8 = (class196) var7.method368(false);
                if (var8 == null) {
                    return;
                }
            }
            if (~var8.field3177 == -4) {
                int var9 = (int) var8.field2539;
                if (var9 >>> 16 == var4) {
                    method1020(true, false, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V", line = 698)
    public static final void method1021(int arg0, boolean arg1) {
        class74 var2 = class433.field6389;
        synchronized (class433.field6389) {
            class358.field5467 = arg0;
        }
        if (!arg1) {
            method1020(true, false, false, (class196) null);
        }
        ++field2167;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 717)
    public static final boolean method1022(int arg0, String arg1) {
        ++field2173;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = -101 / ((arg0 - -35) / 63);
            for (int var3 = 0; ~class262.field4215 < ~var3; ++var3) {
                if (arg1.equalsIgnoreCase(class338.field5248[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class261.field4201.field3588);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 797)
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 751)
    public static void method1023(int arg0) {
        field2172 = null;
        int var1 = -93 % ((-67 - arg0) / 57);
        field2179 = null;
        field2181 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class135 extends class43 {

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Lmb;")
    private static class132 field2541 = class166.method1092("glow1:", 111);

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Lmb;")
    public static class132 field2538 = field2541;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
    public static int[] field2543 = new int[2000];

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lmb;")
    public static class132 field2546 = field2541;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "[[B")
    public static byte[][] field2534;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIB)V")
    public static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < -20) {
            long var6 = class85.method534(arg3, arg4, arg0);
            if (var6 != 0L) {
                int var8 = (517906 & (int) var6) >> 14;
                int var9 = ((int) var6 & 3491154) >> 20;
                int var10 = arg1;
                if (~var6 < -1L) {
                    var10 = arg2;
                }
                int[] var11 = class239.field4308;
                int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
                int var13 = (-arg0 + 103) * 2048 + arg4 * 4 + 24624;
                class84 var14 = class66.method414(0, var12);
                if (var14.field1444 == -1) {
                    if (var8 == 0 || ~var8 == -3) {
                        if (var9 == 0) {
                            var11[var13] = var10;
                            var11[var13 + 512] = var10;
                            var11[var13 + 1024] = var10;
                            var11[var13 + 1536] = var10;
                        } else if (var9 == 1) {
                            var11[var13] = var10;
                            var11[var13 + 1] = var10;
                            var11[var13 + 2] = var10;
                            var11[var13 - -3] = var10;
                        } else if (~var9 == -3) {
                            var11[var13 + 3] = var10;
                            var11[var13 + 3 - -512] = var10;
                            var11[var13 + 1024 + 3] = var10;
                            var11[var13 + 3 + 1536] = var10;
                        } else if (var9 == 3) {
                            var11[var13 + 1536] = var10;
                            var11[var13 + 1 + 1536] = var10;
                            var11[var13 + 2 + 1536] = var10;
                            var11[var13 + 3 + 1536] = var10;
                        }
                    }
                    if (~var8 == -4) {
                        if (~var9 == -1) {
                            var11[var13] = var10;
                        } else if (var9 == 1) {
                            var11[var13 - -3] = var10;
                        } else if (~var9 != -3) {
                            if (var9 == 3) {
                                var11[var13 + 1536] = var10;
                            }
                        } else {
                            var11[var13 + 3 + 1536] = var10;
                        }
                    }
                    if (var8 == 2) {
                        if (var9 != 3) {
                            if (~var9 != -1) {
                                if (~var9 != -2) {
                                    if (var9 == 2) {
                                        var11[var13 + 1536] = var10;
                                        var11[var13 + 1537] = var10;
                                        var11[var13 + 1536 + 2] = var10;
                                        var11[var13 + 3 + 1536] = var10;
                                    }
                                } else {
                                    var11[var13 + 3] = var10;
                                    var11[var13 + 3 + 512] = var10;
                                    var11[var13 + 3 + 1024] = var10;
                                    var11[var13 + 1536 - -3] = var10;
                                }
                            } else {
                                var11[var13] = var10;
                                var11[var13 + 1] = var10;
                                var11[var13 - -2] = var10;
                                var11[var13 - -3] = var10;
                            }
                        } else {
                            var11[var13] = var10;
                            var11[var13 + 512] = var10;
                            var11[var13 + 1024] = var10;
                            var11[var13 + 1536] = var10;
                        }
                    }
                } else {
                    class188 var15 = class19.field267[var14.field1444];
                    if (var15 != null) {
                        int var16 = (var14.field1440 * 4 + -var15.field1480) / 2;
                        int var17 = (var14.field1434 * 4 + -var15.field1484) / 2;
                        var15.method530(arg4 * 4 + 48 + var17, (-var14.field1440 + 104 - arg0) * 4 + var16 + 48);
                    }
                }
            }
            long var18 = class53.method364(arg3, arg4, arg0);
            ++field2547;
            if (var18 != 0L) {
                int var20 = 3 & (int) var18 >> 20;
                int var21 = (513204 & (int) var18) >> 14;
                int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
                class84 var23 = class66.method414(0, var22);
                if (var23.field1444 != -1) {
                    class188 var24 = class19.field267[var23.field1444];
                    if (var24 != null) {
                        int var25 = (var23.field1434 * 4 + -var24.field1484) / 2;
                        int var26 = (var23.field1440 * 4 + -var24.field1480) / 2;
                        var24.method530(var25 + 48 - -(arg4 * 4), (-arg0 + 104 - var23.field1440) * 4 + 48 + var26);
                    }
                } else if (~var21 == -10) {
                    int var27 = 15658734;
                    if (~var18 < -1L) {
                        var27 = 15597568;
                    }
                    int[] var28 = class239.field4308;
                    int var29 = 24624 - -(arg4 * 4) - -((-(arg0 * 512) + 52736) * 4);
                    if (~var20 != -1 && var20 != 2) {
                        var28[var29] = var27;
                        var28[var29 + 512 + 1] = var27;
                        var28[var29 + 1024 + 2] = var27;
                        var28[var29 - -1536 + 3] = var27;
                    } else {
                        var28[var29 - -1536] = var27;
                        var28[var29 + 1024 + 1] = var27;
                        var28[var29 + 514] = var27;
                        var28[var29 + 3] = var27;
                    }
                }
            }
            long var30 = class65.method408(arg3, arg4, arg0);
            if (~var30 != -1L) {
                int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
                class84 var33 = class66.method414(0, var32);
                if (~var33.field1444 != 0) {
                    class188 var34 = class19.field267[var33.field1444];
                    if (var34 != null) {
                        int var35 = (var33.field1440 * 4 + -var34.field1480) / 2;
                        int var36 = (var33.field1434 * 4 - var34.field1484) / 2;
                        var34.method530(arg4 * 4 + 48 + var36, (-arg0 + 104 - var33.field1440) * 4 + 48 + var35);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static final void method919(byte arg0) {
        ++field2535;
        class183.method1174(class15.field217, 16235);
        ++class136.field2560;
        if (class91.field1608 && class99.field1869) {
            int var1 = class181.field3329;
            int var2 = class15.field217.field1783;
            int var3 = var1 - class62.field1041;
            if (class134.field2514 > var3) {
                var3 = class134.field2514;
            }
            if (class15.field217.field1830 + var3 > class134.field2514 - -class39.field638.field1830) {
                var3 = class134.field2514 + class39.field638.field1830 - class15.field217.field1830;
            }
            int var4 = class36.field584;
            int var5 = -class134.field2514 + class39.field638.field1800 + var3;
            int var6 = var4 - class230.field4147;
            int var7 = -class47.field804 + var3;
            if (class27.field446 > var6) {
                var6 = class27.field446;
            }
            if (class15.field217.field1740 + var6 > class27.field446 + class39.field638.field1740) {
                var6 = class27.field446 + class39.field638.field1740 - class15.field217.field1740;
            }
            int var8 = -class151.field2767 + var6;
            if (class136.field2560 > class15.field217.field1761 && (var7 > var2 || ~(-var2) < ~var7 || var2 < var8 || -var2 > var8)) {
                class187.field3471 = true;
            }
            if (arg0 <= 67) {
                field2541 = null;
            }
            int var9 = -class27.field446 + class39.field638.field1695 + var6;
            if (class15.field217.field1704 != null && class187.field3471) {
                class123 var10 = new class123();
                var10.field2305 = var5;
                var10.field2310 = class15.field217.field1704;
                var10.field2299 = class15.field217;
                var10.field2308 = var9;
                class155.method1010(var10, 200000);
            }
            if (~class61.field1030 == -1) {
                if (class187.field3471) {
                    if (class15.field217.field1812 != null) {
                        class123 var11 = new class123();
                        var11.field2305 = var5;
                        var11.field2298 = class74.field1227;
                        var11.field2308 = var9;
                        var11.field2299 = class15.field217;
                        var11.field2310 = class15.field217.field1812;
                        class155.method1010(var11, 200000);
                    }
                    if (class74.field1227 != null && class145.method972(class15.field217, -67) != null) {
                        ++class34.field559;
                        class64.field1054.method660(112, 3);
                        class64.field1054.method715(40, class74.field1227.field1743);
                        class64.field1054.method725(class15.field217.field1794, -24475);
                        class64.field1054.method726((byte) 111, class74.field1227.field1794);
                        class64.field1054.method760(class15.field217.field1743, (byte) -107);
                    }
                } else if ((~class15.field211 == -2 || class101.method624(2000, class57.field974 - 1)) && class57.field974 > 2) {
                    class113.method766(0);
                } else if (~class57.field974 < -1) {
                    class26.method195(95, class57.field974 + -1);
                }
                class15.field217 = null;
            }
        } else {
            if (class136.field2560 > 1) {
                class15.field217 = null;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class135() {
        this(4096);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBIIII)V")
    public static final void method920(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2533;
        if (arg2 == -15) {
            int var7 = 0;
            class59[] var8 = class203.field3742;
            while (~var8.length < ~var7) {
                class59 var9 = var8[var7];
                if (var9 != null && ~var9.field989 == -3) {
                    class47.method314((-class168.field3082 + var9.field988 << 7) + var9.field1002, arg6 >> 1, arg3, -13057, (-class129.field2389 + var9.field986 << 7) + var9.field1009, var9.field1007 * 2, arg0 >> 1, arg5);
                    if (~class169.field3137 < 0 && class30.field460 % 20 < 10) {
                        class17.field261[var9.field1012].method103(class169.field3137 + arg4 + -12, arg1 + -28 - -class26.field425);
                    }
                }
                ++var7;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
    private class135(int arg0) {
        super(0, true);
        this.field2539 = 4096;
        this.field2539 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)I")
    public static final int method921(int arg0, int arg1) {
        ++field2545;
        if (arg1 != 12659) {
            field2542 = -66;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
    public static final int method922(byte arg0, int arg1) {
        int var2 = 0;
        ++field2537;
        if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 4;
            var2 += 4;
        }
        int var3 = 53 / ((arg0 - -26) / 43);
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field2543 = null;
        field2538 = null;
        field2546 = null;
        field2541 = null;
        if (!arg0) {
            method923(false);
        }
        field2534 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            field2541 = null;
        }
        if (arg0 == 0) {
            this.field2539 = (arg2.method716(-1308) << 12) / 255;
        }
        ++field2540;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
    public static final int method924(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 217) {
            return -55;
        } else {
            ++field2544;
            if (arg2 > 243) {
                arg3 >>= 4;
            } else if (arg2 > 217) {
                arg3 >>= 3;
            } else if (arg2 <= 192) {
                if (arg2 > 179) {
                    arg3 >>= 1;
                }
            } else {
                arg3 >>= 2;
            }
            return (arg0 >> 2 << 10) - (-(arg3 >> 5 << 7) + -(arg2 >> 1));
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1 + arg1, arg0);
        ++field2536;
        if (super.field768.field3219) {
            class80.method493(var3, 0, class131.field2427, this.field2539);
        }
        return var3;
    }
}

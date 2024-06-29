import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class153 extends class224 {

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private int field2270 = 1024;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field2274 = 1024;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    private int field2264 = 1024;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    private int field2268 = 1024;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "I")
    private int field2285 = 2048;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    private int field2275 = 409;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
    private int field2288 = 0;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    private int field2267 = 0;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "I")
    private int field2289 = 819;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    public static int[] field2273 = new int[5];

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "[Lbd;")
    public static class186[] field2277 = new class186[2048];

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[[S")
    public static short[][] field2266 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Ldl;")
    public static class123 field2269;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "Ldl;")
    public static class123 field2283;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field2287;
        if (!arg1) {
            this.method1014((int[][]) null, -106, (Random) null, (byte) -126, -47, -18, -8);
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = 0;
            int[][] var5 = super.field3625.method1861((byte) -80);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class78.field1108 * this.field2285 >> 12;
            int var15 = class78.field1108 * this.field2264 >> 12;
            int var16 = class36.field471 * this.field2275 >> 12;
            int var17 = class36.field471 * this.field2289 >> 12;
            if (var17 <= 1) {
                return var5[arg0];
            } else {
                int var18 = class78.field1108 / var15 + 1;
                this.field2286 = class78.field1108 / 8 * this.field2270 >> 12;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2288);
                while (true) {
                    while (true) {
                        int var22 = class80.method557(-var15 + var14, var21, true) + var15;
                        int var23 = var8 + var22;
                        int var24 = var16 + class80.method557(var17 - var16, var21, arg1);
                        if (var23 > class78.field1108) {
                            var22 = -var8 + class78.field1108;
                            var23 = class78.field1108;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var23 - -var4;
                            if (~var29 > -1) {
                                var29 += class78.field1108;
                            }
                            if (~class78.field1108 > ~var29) {
                                var29 -= class78.field1108;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && var30[1] >= var29) {
                                    if (~var9 != ~var26) {
                                        int var31 = var4 + var8;
                                        if (~var31 > -1) {
                                            var31 += class78.field1108;
                                        }
                                        if (~var31 < ~class78.field1108) {
                                            var31 -= class78.field1108;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var11];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (var31 >= var29) {
                                                    if (~var37 == -1) {
                                                        var38 = Math.min(var29, var36);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var37);
                                                        var38 = class78.field1108;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var37);
                                                    var38 = Math.min(var29, var36);
                                                }
                                                this.method1014(var5, var25 - var35, var21, (byte) 102, -var39 + var38, var35, var39 - -var7);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class36.field471 > ~(var24 + var25)) {
                            var24 = -var25 + class36.field471;
                        } else {
                            var12 = false;
                        }
                        if (class78.field1108 != var23) {
                            int[] var41 = var19[var13++];
                            var41[2] = var24 + var25;
                            var41[0] = var8;
                            var41[1] = var23;
                            this.method1014(var5, var24, var21, (byte) 108, var22, var25, var8 - -var6);
                            var8 = var23;
                        } else {
                            this.method1014(var5, var24, var21, (byte) 103, var22, var25, var6 + var8);
                            if (var12) {
                                return var3;
                            }
                            var9 = 0;
                            var7 = var6;
                            var12 = true;
                            int[][] var42 = var20;
                            var10 = false;
                            int[] var43 = var19[var13++];
                            var11 = var13;
                            var20 = var19;
                            var43[1] = var23;
                            var43[2] = var24 + var25;
                            var13 = 0;
                            var43[0] = var8;
                            var19 = var42;
                            var8 = 0;
                            var6 = class80.method557(class78.field1108, var21, true);
                            var4 = -var7 + var6;
                            int var44 = var4;
                            if (~var4 > -1) {
                                var44 = class78.field1108 + var4;
                            }
                            if (var44 > class78.field1108) {
                                var44 -= class78.field1108;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                ++var9;
                                if (var11 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 < -4) {
            ++field2276;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[IILjava/util/Random;BIII)V")
    private final void method1014(int[][] arg0, int arg1, Random arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field2272;
        if (arg3 < 95) {
            method1015(47);
        }
        int var8 = this.field2274 <= 0 ? 4096 : -class80.method557(this.field2274, arg2, true) + 4096;
        int var9 = this.field2286 * this.field2268 >> 12;
        int var10 = this.field2286 + -(var9 > 0 ? class80.method557(var9, arg2, true) : 0);
        if (~class78.field1108 >= ~arg6) {
            arg6 -= class78.field1108;
        }
        if (var10 <= 0) {
            if (class78.field1108 >= arg4 + arg6) {
                for (int var11 = 0; var11 < arg1; ++var11) {
                    class196.method1356(arg0[arg5 - -var11], arg6, arg4, var8);
                }
            } else {
                int var12 = class78.field1108 - arg6;
                for (int var13 = 0; arg1 > var13; ++var13) {
                    int[] var14 = arg0[arg5 - -var13];
                    class196.method1356(var14, arg6, var12, var8);
                    class196.method1356(var14, 0, arg4 - var12, var8);
                }
            }
        } else if (~arg1 < -1 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var16 <= ~var10 ? var10 : var16;
            int var18 = var10 <= var15 ? var10 : var15;
            int var19 = arg6 - -var18;
            int var20 = -(var18 * 2) + arg4;
            for (int var21 = 0; ~arg1 < ~var21; ++var21) {
                int[] var22 = arg0[arg5 + var21];
                if (var21 < var17) {
                    int var23 = var8 * var21 / var17;
                    if (~this.field2267 == -1) {
                        for (int var24 = 0; ~var24 > ~var18; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class224.method1526(class206.field3220, arg6 + var24)] = var22[class224.method1526(class206.field3220, arg6 - -arg4 - var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var18 > var26; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class224.method1526(class206.field3220, arg6 - -var26)] = var22[class224.method1526(-var26 + arg4 + arg6 + -1, class206.field3220)] = var23 <= var28 ? var23 : var28;
                        }
                    }
                    if (var19 + var20 > class78.field1108) {
                        int var27 = class78.field1108 - var19;
                        class196.method1356(var22, var19, var27, var23);
                        class196.method1356(var22, 0, -var27 + var20, var23);
                    } else {
                        class196.method1356(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg1 - 1;
                    if (~var17 < ~var29) {
                        int var30 = var8 * var29 / var17;
                        if (this.field2267 == 0) {
                            for (int var31 = 0; ~var31 > ~var18; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class224.method1526(arg6 + var31, class206.field3220)] = var22[class224.method1526(-var31 + arg4 + arg6 + -1, class206.field3220)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var18; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class224.method1526(arg6 - -var33, class206.field3220)] = var22[class224.method1526(arg4 + arg6 + -var33 + -1, class206.field3220)] = var30 > var35 ? var35 : var30;
                            }
                        }
                        if (~class78.field1108 <= ~(var19 - -var20)) {
                            class196.method1356(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class78.field1108;
                            class196.method1356(var22, var19, var34, var30);
                            class196.method1356(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var18 > var36; ++var36) {
                            var22[class224.method1526(class206.field3220, arg6 + var36)] = var22[class224.method1526(class206.field3220, -var36 + arg6 - (-arg4 - -1))] = var8 * var36 / var18;
                        }
                        if (~class78.field1108 <= ~(var19 + var20)) {
                            class196.method1356(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class78.field1108;
                            class196.method1356(var22, var19, var37, var8);
                            class196.method1356(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)I")
    public static final int method1015(int arg0) {
        ++field2280;
        if (arg0 < 105) {
            field2278 = 10;
        }
        return ((class76.field1074 == 0 ? 0 : 1) << 20) + ((class16.field192 ? 1 : 0) << 19) + ((class123.field1815 ? 1 : 0) << 16) + ((!class182.field2882 ? 0 : 1) << 15) + ((class3.field37 ? 1 : 0) << 13) + ((class50.field693 ? 1 : 0) << 10) + ((class184.field2893 ? 1 : 0) << 9) + ((class195.field3073 ? 1 : 0) << 7) + ((class239.field3814 ? 1 : 0) << 6) + ((class168.field2580 ? 1 : 0) << 3) + (7 & class59.field835) + ((class199.field3114 ? 1 : 0) << 4) + (((!class143.field2098 ? 0 : 1) << 5) + ((class264.field4255 ? 1 : 0) << 8) - -(6144 & class65.field912 << 11) - (-((~class219.field3553 == -1 ? 0 : 1) << 21) - ((class60.field841 != 0 ? 1 : 0) << 22) + -(class217.method1470() << 23)));
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public static void method1016(int arg0) {
        if (arg0 != -1) {
            method1019(32);
        }
        field2266 = null;
        field2269 = null;
        field2283 = null;
        field2277 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1017(int arg0, Component arg1) {
        ++field2271;
        arg1.removeMouseListener(class39.field526);
        arg1.removeMouseMotionListener(class39.field526);
        arg1.removeFocusListener(class39.field526);
        class40.field549 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field2265;
        if (arg2 > -46) {
            this.field2275 = 107;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2274 = arg0.method190(-3);
                                        }
                                    } else {
                                        this.field2268 = arg0.method190(-3);
                                    }
                                } else {
                                    this.field2267 = arg0.method201(255);
                                }
                            } else {
                                this.field2270 = arg0.method190(-3);
                            }
                        } else {
                            this.field2289 = arg0.method190(-3);
                        }
                    } else {
                        this.field2275 = arg0.method190(-3);
                    }
                } else {
                    this.field2285 = arg0.method190(-3);
                }
            } else {
                this.field2264 = arg0.method190(-3);
            }
        } else {
            this.field2288 = arg0.method201(255);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2281;
        if (arg0 <= 42) {
            field2266 = null;
        }
        if (~class51.field710 >= ~arg2 && arg3 <= class96.field1484 && ~class110.field1669 >= ~arg5 && ~arg7 >= ~class189.field2984) {
            class39.method308(arg1, arg2, arg7, arg3, arg4, arg6, 108, arg5);
        } else {
            class181.method1264(arg4, arg1, arg2, arg6, (byte) -94, arg5, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        ++field2279;
        class250 var1 = class39.field526;
        synchronized (class39.field526) {
            ++class87.field1375;
            int var2 = 55 / ((33 - arg0) / 50);
            class106.field1638 = class40.field549;
            class31.field416 = class174.field2730;
            class141.field2074 = class271.field4304;
            class173.field2720 = class120.field1756;
            class59.field836 = class149.field2228;
            class145.field2140 = class216.field3536;
            class136.field2035 = class181.field2830;
            class120.field1756 = 0;
        }
    }
}

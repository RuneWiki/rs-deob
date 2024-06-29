import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 extends class278 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field2372 = 409;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    private int field2374 = 0;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    private int field2378 = 2048;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field2373 = 1024;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field2377 = 1024;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field2382 = 1024;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    private int field2384 = 0;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    private int field2386 = 819;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field2381 = 1024;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "[F")
    public static float[] field2379 = new float[4];

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "F")
    public static float field2380;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2388;

    static {
        new class83("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2387 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method208(int arg0, int arg1) {
        ++field2375;
        if (arg0 != -9) {
            this.method1043(-71, -32, -22, (int[][]) null, 123, -29, (Random) null);
        }
        int[] var3 = super.field3750.method256(arg1, arg0 ^ 30366);
        if (super.field3750.field554) {
            int[][] var4 = super.field3750.method253(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class507.field7456 * this.field2382 >> 12;
            int var15 = class507.field7456 * this.field2378 >> 12;
            int var16 = class307.field4211 * this.field2372 >> 12;
            int var17 = class307.field4211 * this.field2386 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field2376 = class507.field7456 / 8 * this.field2373 >> 12;
                int var18 = class507.field7456 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2374);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class432.method2579((byte) -116, -var14 + var15, var21);
                        int var23 = class432.method2579((byte) 80, -var16 + var17, var21) + var16;
                        int var24 = var8 - -var22;
                        if (~class507.field7456 > ~var24) {
                            var22 = class507.field7456 - var8;
                            var24 = class507.field7456;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class507.field7456;
                            }
                            if (var28 > class507.field7456) {
                                var28 -= class507.field7456;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (var29[0] <= var28 && var29[1] >= var28) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class507.field7456;
                                        }
                                        if (~class507.field7456 > ~var31) {
                                            var31 -= class507.field7456;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var28) {
                                                    if (~var36 == -1) {
                                                        var38 = Math.min(var28, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class507.field7456;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var28, var37);
                                                }
                                                this.method1043(var35, var7 + var39, -var35 + var30, var4, arg0 ^ 8, -var39 + var38, var21);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var30 <= class307.field4211) {
                            var10 = false;
                        } else {
                            var23 = class307.field4211 - var30;
                        }
                        if (class507.field7456 == var24) {
                            this.method1043(var30, var6 + var8, var23, var4, -1, var22, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var30;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class432.method2579((byte) 72, class507.field7456, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class507.field7456 + var5;
                            }
                            if (~class507.field7456 > ~var43) {
                                var43 -= class507.field7456;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[2] = var23 + var30;
                            var45[1] = var24;
                            this.method1043(var30, var8 - -var6, var23, var4, -1, var22, var21);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V", line = 262)
    public static final void method1040(int arg0, byte arg1) {
        int var2 = -117 / ((arg1 - -59) / 38);
        ++field2370;
        class163 var3 = class271.method1546(arg0, 7, true);
        var3.method1010(1504);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V", line = 274)
    public static void method1041(byte arg0) {
        field2379 = null;
        if (arg0 != -39) {
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Z", line = 284)
    public static final boolean method1042(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2380 = 1.1854006F;
        }
        ++field2383;
        return class203.method1240(arg0, arg1, 7041) & class402.method2330(arg0, arg1, 73);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 301)
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llh;II)V", line = 305)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.method210((class365) null, -6, 58);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field2377 = arg0.method2062((byte) 14);
                                        }
                                    } else {
                                        this.field2381 = arg0.method2062((byte) 14);
                                    }
                                } else {
                                    this.field2384 = arg0.method2099(255);
                                }
                            } else {
                                this.field2373 = arg0.method2062((byte) 14);
                            }
                        } else {
                            this.field2386 = arg0.method2062((byte) 14);
                        }
                    } else {
                        this.field2372 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field2378 = arg0.method2062((byte) 14);
                }
            } else {
                this.field2382 = arg0.method2062((byte) 14);
            }
        } else {
            this.field2374 = arg0.method2099(arg1 ^ -30227);
        }
        ++field2385;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[[IIILjava/util/Random;)V", line = 404)
    private final void method1043(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        ++field2388;
        int var8 = this.field2377 > 0 ? -class432.method2579((byte) -120, this.field2377, arg6) + 4096 : 4096;
        int var9 = this.field2381 * this.field2376 >> 12;
        int var10 = this.field2376 + -(var9 > 0 ? class432.method2579((byte) -118, var9, arg6) : 0);
        if (class507.field7456 <= arg1) {
            arg1 -= class507.field7456;
        }
        if (var10 <= 0) {
            if (~class507.field7456 <= ~(arg1 + arg5)) {
                for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                    class416.method2486(arg3[arg0 - -var11], arg1, arg5, var8);
                }
            } else {
                int var12 = -arg1 + class507.field7456;
                for (int var13 = 0; ~arg2 < ~var13; ++var13) {
                    int[] var14 = arg3[arg0 + var13];
                    class416.method2486(var14, arg1, var12, var8);
                    class416.method2486(var14, 0, -var12 + arg5, var8);
                }
            }
        } else {
            if (arg2 <= 0 || ~arg5 >= -1) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = arg2 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg1 - -var17;
            int var20 = arg5 - var17 * 2;
            for (int var21 = 0; arg2 > var21; ++var21) {
                int[] var22 = arg3[var21 - -arg0];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field2384 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class118.method750(class412.field6045, arg1 + var24)] = var22[class118.method750(arg1 + arg5 + -var24 - 1, class412.field6045)] = ~var25 <= ~var23 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class118.method750(arg1 + var26, class412.field6045)] = var22[class118.method750(arg1 + arg5 + -var26 + -1, class412.field6045)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) < ~class507.field7456) {
                        int var27 = -var19 + class507.field7456;
                        class416.method2486(var22, var19, var27, var23);
                        class416.method2486(var22, 0, var20 - var27, var23);
                    } else {
                        class416.method2486(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg2 + -1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field2384 == -1) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class118.method750(arg1 + var31, class412.field6045)] = var22[class118.method750(class412.field6045, -var31 + -1 + arg1 + arg5)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class118.method750(class412.field6045, arg1 + var33)] = var22[class118.method750(-var33 + -1 + arg1 + arg5, class412.field6045)] = var30 <= var35 ? var30 : var35;
                            }
                        }
                        if (~(var19 - -var20) < ~class507.field7456) {
                            int var34 = -var19 + class507.field7456;
                            class416.method2486(var22, var19, var34, var30);
                            class416.method2486(var22, 0, -var34 + var20, var30);
                        } else {
                            class416.method2486(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class118.method750(arg1 + var36, class412.field6045)] = var22[class118.method750(arg1 - var36 + arg5 - 1, class412.field6045)] = var8 * var36 / var17;
                        }
                        if (class507.field7456 >= var19 - -var20) {
                            class416.method2486(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class507.field7456;
                            class416.method2486(var22, var19, var37, var8);
                            class416.method2486(var22, 0, var20 - var37, var8);
                        }
                    }
                }
            }
        }
        if (arg4 != -1) {
            this.field2376 = 75;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 604)
    public final void method207(int arg0) {
        if (arg0 == 2) {
            ++field2371;
        }
    }
}

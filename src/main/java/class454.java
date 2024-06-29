import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class454 extends class585 {

    @OriginalMember(owner = "client!nja", name = "J", descriptor = "I")
    private int field6362 = 0;

    @OriginalMember(owner = "client!nja", name = "O", descriptor = "I")
    private int field6367 = 1024;

    @OriginalMember(owner = "client!nja", name = "F", descriptor = "I")
    private int field6359 = 2048;

    @OriginalMember(owner = "client!nja", name = "E", descriptor = "I")
    private int field6358 = 1024;

    @OriginalMember(owner = "client!nja", name = "S", descriptor = "I")
    private int field6370 = 1024;

    @OriginalMember(owner = "client!nja", name = "T", descriptor = "I")
    private int field6371 = 0;

    @OriginalMember(owner = "client!nja", name = "R", descriptor = "I")
    private int field6369 = 1024;

    @OriginalMember(owner = "client!nja", name = "V", descriptor = "I")
    private int field6373 = 819;

    @OriginalMember(owner = "client!nja", name = "Q", descriptor = "I")
    private int field6368 = 409;

    @OriginalMember(owner = "client!nja", name = "G", descriptor = "[J")
    public static long[] field6360 = new long[32];

    @OriginalMember(owner = "client!nja", name = "M", descriptor = "Loo;")
    public static class652 field6365 = new class652(64);

    @OriginalMember(owner = "client!nja", name = "H", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!nja", name = "K", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!nja", name = "L", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!nja", name = "N", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!nja", name = "W", descriptor = "I")
    private int field6374;

    @OriginalMember(owner = "client!nja", name = "X", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!nja", name = "U", descriptor = "[Ljd;")
    public static class241[] field6372;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B[[ILjava/util/Random;IIII)V", line = 4)
    private final void method2708(byte arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 109) {
            this.field6373 = -16;
        }
        ++field6375;
        int var8 = this.field6369 > 0 ? 4096 + -class7.method51(-75, arg2, this.field6369) : 4096;
        int var9 = this.field6374 * this.field6370 >> 12;
        int var10 = this.field6374 - (~var9 >= -1 ? 0 : class7.method51(106, arg2, var9));
        if (arg5 >= class293.field4278) {
            arg5 -= class293.field4278;
        }
        if (~var10 < -1) {
            if (~arg6 < -1 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg6 / 2;
                int var13 = var11 < var10 ? var11 : var10;
                int var14 = ~var10 < ~var12 ? var12 : var10;
                int var15 = arg5 + var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; var17 < arg6; ++var17) {
                    int[] var18 = arg1[arg4 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field6362 == 0) {
                            for (int var20 = 0; var13 > var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class702.method3977(arg5 + var20, class625.field8759)] = var18[class702.method3977(class625.field8759, arg3 + arg5 + -1 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class702.method3977(arg5 + var22, class625.field8759)] = var18[class702.method3977(-var22 + -1 + arg3 + arg5, class625.field8759)] = ~var24 > ~var19 ? var24 : var19;
                            }
                        }
                        if (var15 + var16 <= class293.field4278) {
                            class595.method3470(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class293.field4278;
                            class595.method3470(var18, var15, var23, var19);
                            class595.method3470(var18, 0, var16 - var23, var19);
                        }
                    } else {
                        int var25 = arg6 + -1 + -var17;
                        if (~var25 > ~var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field6362 == 0) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class702.method3977(arg5 + var27, class625.field8759)] = var18[class702.method3977(-var27 + arg5 + arg3 + -1, class625.field8759)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class702.method3977(arg5 + var29, class625.field8759)] = var18[class702.method3977(-var29 + arg5 + arg3 + -1, class625.field8759)] = ~var31 > ~var26 ? var31 : var26;
                                }
                            }
                            if (var15 + var16 <= class293.field4278) {
                                class595.method3470(var18, var15, var16, var26);
                            } else {
                                int var30 = class293.field4278 - var15;
                                class595.method3470(var18, var15, var30, var26);
                                class595.method3470(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class702.method3977(arg5 + var32, class625.field8759)] = var18[class702.method3977(class625.field8759, -var32 + -1 + arg5 + arg3)] = var8 * var32 / var13;
                            }
                            if (var15 + var16 > class293.field4278) {
                                int var33 = -var15 + class293.field4278;
                                class595.method3470(var18, var15, var33, var8);
                                class595.method3470(var18, 0, -var33 + var16, var8);
                            } else {
                                class595.method3470(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg3 + arg5) >= ~class293.field4278) {
            for (int var34 = 0; ~arg6 < ~var34; ++var34) {
                class595.method3470(arg1[arg4 + var34], arg5, arg3, var8);
            }
        } else {
            int var35 = -arg5 + class293.field4278;
            for (int var36 = 0; ~var36 > ~arg6; ++var36) {
                int[] var37 = arg1[arg4 + var36];
                class595.method3470(var37, arg5, var35, var8);
                class595.method3470(var37, 0, arg3 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V", line = 202)
    public final void method52(int arg0) {
        ++field6366;
        if (arg0 != -4096) {
            method2710((class494) null, true, (class689) null);
        }
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "()V", line = 212)
    public class454() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(II)[I", line = 226)
    public final int[] method55(int arg0, int arg1) {
        ++field6364;
        if (arg1 <= 123) {
            this.field6371 = -76;
        }
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[][] var4 = super.field8255.method1639(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class293.field4278 * this.field6367 >> 12;
            int var15 = class293.field4278 * this.field6359 >> 12;
            int var16 = class270.field3923 * this.field6368 >> 12;
            int var17 = class270.field3923 * this.field6373 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field6374 = class293.field4278 / 8 * this.field6358 >> 12;
                int var18 = class293.field4278 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6371);
                while (true) {
                    while (true) {
                        int var22 = class7.method51(-84, var21, -var14 + var15) + var14;
                        int var23 = var16 - -class7.method51(106, var21, var17 - var16);
                        int var24 = var8 - -var22;
                        if (class293.field4278 < var24) {
                            var24 = class293.field4278;
                            var22 = class293.field4278 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class293.field4278;
                            }
                            if (~class293.field4278 > ~var29) {
                                var29 -= class293.field4278;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && ~var29 >= ~var30[1]) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class293.field4278;
                                        }
                                        if (class293.field4278 < var31) {
                                            var31 -= class293.field4278;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (var36 == 0) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class293.field4278;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method2708((byte) 109, var4, var21, -var39 + var38, var35, var7 + var39, -var35 + var25);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (class270.field3923 >= var23 + var25) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class270.field3923;
                        }
                        if (class293.field4278 == var24) {
                            this.method2708((byte) 109, var4, var21, var22, var25, var6 + var8, var23);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class7.method51(-73, var21, class293.field4278);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class293.field4278 + var5;
                            }
                            var9 = 0;
                            if (~var43 < ~class293.field4278) {
                                var43 -= class293.field4278;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var43 >= var44[0] && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[2] = var25 - -var23;
                            var45[1] = var24;
                            this.method2708((byte) 109, var4, var21, var22, var25, var6 + var8, var23);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!nja", name = "e", descriptor = "(B)V", line = 482)
    public static void method2709(byte arg0) {
        field6365 = null;
        field6360 = null;
        field6372 = null;
        int var1 = 99 / ((-44 - arg0) / 61);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lso;ZLbca;)Lfn;", line = 493)
    public static final class148 method2710(class494 arg0, boolean arg1, class689 arg2) {
        ++field6363;
        class148 var3 = new class148(arg2);
        int var4 = arg0.method2964((byte) 44);
        boolean var5 = (var4 & 1) != 0;
        boolean var6 = (var4 & 2) != 0;
        boolean var7 = ~(4 & var4) != -1;
        if (var5) {
            var3.field2134[0] = arg0.method2998(true);
            var3.field2138[0] = arg0.method2998(true);
            if (~arg2.field9639 != 0 || ~arg2.field9603 != 0) {
                var3.field2134[1] = arg0.method2998(!arg1);
                var3.field2138[1] = arg0.method2998(true);
            }
            if (~arg2.field9646 != 0 || arg2.field9577 != -1) {
                var3.field2134[2] = arg0.method2998(!arg1);
                var3.field2138[2] = arg0.method2998(true);
            }
        }
        boolean var8 = ~(8 & var4) != -1;
        if (var6) {
            var3.field2136[0] = arg0.method2998(true);
            var3.field2141[0] = arg0.method2998(true);
            if (arg2.field9643 != -1 || arg2.field9607 != -1) {
                var3.field2136[1] = arg0.method2998(true);
                var3.field2141[1] = arg0.method2998(true);
            }
        }
        if (var7) {
            int var9 = arg0.method2998(!arg1);
            int[] var10 = new int[] { class702.method3977(var9, 15), class702.method3977(254, var9) >> 4, class702.method3977(15, var9 >> 8), class702.method3977(var9 >> 12, 15) };
            for (int var11 = 0; ~var11 > -5; ++var11) {
                if (var10[var11] != 15) {
                    var3.field2137[var10[var11]] = (short) arg0.method2998(true);
                }
            }
        }
        if (var8) {
            int var12 = arg0.method2964((byte) 102);
            int[] var13 = new int[] { class702.method3977(15, var12), class702.method3977(var12, 246) >> 4 };
            for (int var14 = 0; ~var14 > -3; ++var14) {
                if (var13[var14] != 15) {
                    var3.field2140[var13[var14]] = (short) arg0.method2998(true);
                }
            }
        }
        if (arg1) {
            method2709((byte) 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lso;II)V", line = 594)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field6361;
        if (arg1 == 1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 != 6) {
                                        if (~arg2 != -8) {
                                            if (arg2 == 8) {
                                                this.field6369 = arg0.method2998(true);
                                            }
                                        } else {
                                            this.field6370 = arg0.method2998(true);
                                        }
                                    } else {
                                        this.field6362 = arg0.method2964((byte) 104);
                                    }
                                } else {
                                    this.field6358 = arg0.method2998(true);
                                }
                            } else {
                                this.field6373 = arg0.method2998(true);
                            }
                        } else {
                            this.field6368 = arg0.method2998(true);
                        }
                    } else {
                        this.field6359 = arg0.method2998(true);
                    }
                } else {
                    this.field6367 = arg0.method2998(true);
                }
            } else {
                this.field6371 = arg0.method2964((byte) 99);
            }
        }
    }
}

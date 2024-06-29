import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class109 extends class115 {

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    private int field1260 = 1024;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    private int field1257 = 2048;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    private int field1255 = 819;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    private int field1263 = 1024;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    private int field1267 = 0;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    private int field1258 = 1024;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    private int field1269 = 0;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    private int field1271 = 1024;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    private int field1264 = 409;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "[[I")
    public static int[][] field1259 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static volatile int field1254 = 0;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "[S")
    public static short[] field1273 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    public static int field1272 = 0;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field1253;
        if (arg0 <= 83) {
            method605(61, 96);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field1260 = arg1.method1355(32136);
                                        }
                                    } else {
                                        this.field1263 = arg1.method1355(32136);
                                    }
                                } else {
                                    this.field1267 = arg1.method1342((byte) -127);
                                }
                            } else {
                                this.field1258 = arg1.method1355(32136);
                            }
                        } else {
                            this.field1255 = arg1.method1355(32136);
                        }
                    } else {
                        this.field1264 = arg1.method1355(32136);
                    }
                } else {
                    this.field1257 = arg1.method1355(32136);
                }
            } else {
                this.field1271 = arg1.method1355(32136);
            }
        } else {
            this.field1269 = arg1.method1342((byte) -126);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)I")
    public static final int method605(int arg0, int arg1) {
        return class41.field481 != null ? class41.field481[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field1265;
        if (arg0 != 0) {
            this.field1270 = 52;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class109() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V")
    public static final void method606(int arg0) {
        if (arg0 != 0) {
            method608(35);
        }
        ++field1274;
        if (class434.field6358 != null) {
            if (class434.field6358.field3268 == 1) {
                class434.field6358 = null;
                return;
            }
            if (~class434.field6358.field3268 == -3) {
                class24.method152(class166.field2332, 2, true, class92.field1014);
                class434.field6358 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZB)V")
    public static final void method607(boolean arg0, byte arg1) {
        ++field1266;
        int[] var2 = null;
        byte[][] var3;
        byte var4;
        if (arg0) {
            var3 = class37.field382;
            var4 = 1;
        } else {
            var4 = 4;
            var3 = class349.field5097;
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            class58.method365(-26586);
            for (int var6 = 0; ~(class279.field3935 >> 3) < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~(class164.field2287 >> 3); ++var7) {
                    boolean var8 = false;
                    int var9 = class311.field4449[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = var9 >> 24 & 3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (7 & var9) >> 1;
                            int var12 = (16764371 & var9) >> 14;
                            int var13 = var9 >> 3 & 2047;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; ~class71.field805.length < ~var15; ++var15) {
                                if (~class71.field805[var15] == ~var14 && var3[var15] != null) {
                                    int[] var16 = class42.method259(var13, var3[var15], var12, var10, var7 * 8, class218.field2991, var11, arg0, var6 * 8, var5, false, class54.field613);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class169.method1114(8, var5, var6 * 8, 8, var7 * 8, (byte) -93);
                    }
                }
            }
        }
        if (arg1 <= 83) {
            field1273 = null;
        }
        if (var2 != null) {
            class434.field6366 = class359.method2287(var2[2], 0, var2[1], var2[3], var2[0]);
            class50.field582 = var2[4];
        } else {
            class434.field6366 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
    public static void method608(int arg0) {
        if (arg0 != 22868) {
            field1261 = -46;
        }
        field1273 = null;
        field1259 = null;
    }

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "(I)V")
    public static final void method609(int arg0) {
        ++field1262;
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class266.field3723[var1] = true;
        }
        int var2 = -11 % ((arg0 - -28) / 34);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILjava/util/Random;III[[I)V")
    private final void method610(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        ++field1268;
        int var8 = -8 / ((20 - arg4) / 62);
        int var9 = ~this.field1260 < -1 ? 4096 - class239.method1529(this.field1260, (byte) -96, arg2) : 4096;
        int var10 = this.field1270 * this.field1263 >> 12;
        int var11 = this.field1270 - (~var10 >= -1 ? 0 : class239.method1529(var10, (byte) -96, arg2));
        if (arg3 >= class218.field2979) {
            arg3 -= class218.field2979;
        }
        if (var11 > 0) {
            if (~arg1 < -1 && ~arg5 < -1) {
                int var12 = arg5 / 2;
                int var13 = arg1 / 2;
                int var14 = ~var11 < ~var12 ? var12 : var11;
                int var15 = ~var13 <= ~var11 ? var11 : var13;
                int var16 = arg3 + var14;
                int var17 = arg5 - var14 * 2;
                for (int var18 = 0; ~var18 > ~arg1; ++var18) {
                    int[] var19 = arg6[arg0 + var18];
                    if (~var18 > ~var15) {
                        int var20 = var9 * var18 / var15;
                        if (~this.field1267 == -1) {
                            for (int var21 = 0; var21 < var14; ++var21) {
                                int var22 = var9 * var21 / var14;
                                var19[class40.method253(arg3 - -var21, class92.field1013)] = var19[class40.method253(class92.field1013, -var21 + -1 + arg3 + arg5)] = var20 * var22 >> 12;
                            }
                        } else {
                            for (int var23 = 0; ~var23 > ~var14; ++var23) {
                                int var25 = var9 * var23 / var14;
                                var19[class40.method253(arg3 - -var23, class92.field1013)] = var19[class40.method253(arg3 - -arg5 + -var23 + -1, class92.field1013)] = var20 > var25 ? var25 : var20;
                            }
                        }
                        if (class218.field2979 >= var16 + var17) {
                            class408.method2569(var19, var16, var17, var20);
                        } else {
                            int var24 = -var16 + class218.field2979;
                            class408.method2569(var19, var16, var24, var20);
                            class408.method2569(var19, 0, -var24 + var17, var20);
                        }
                    } else {
                        int var26 = -var18 + -1 + arg1;
                        if (var26 < var15) {
                            int var27 = var9 * var26 / var15;
                            if (~this.field1267 != -1) {
                                for (int var28 = 0; ~var14 < ~var28; ++var28) {
                                    int var29 = var9 * var28 / var14;
                                    var19[class40.method253(class92.field1013, arg3 + var28)] = var19[class40.method253(class92.field1013, arg5 + -1 + arg3 - var28)] = ~var27 >= ~var29 ? var27 : var29;
                                }
                            } else {
                                for (int var30 = 0; ~var14 < ~var30; ++var30) {
                                    int var32 = var9 * var30 / var14;
                                    var19[class40.method253(arg3 + var30, class92.field1013)] = var19[class40.method253(class92.field1013, arg3 - var30 + arg5 + -1)] = var27 * var32 >> 12;
                                }
                            }
                            if (~(var16 + var17) >= ~class218.field2979) {
                                class408.method2569(var19, var16, var17, var27);
                            } else {
                                int var31 = class218.field2979 - var16;
                                class408.method2569(var19, var16, var31, var27);
                                class408.method2569(var19, 0, var17 - var31, var27);
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var14; ++var33) {
                                var19[class40.method253(class92.field1013, arg3 - -var33)] = var19[class40.method253(class92.field1013, -var33 + -1 + arg3 + arg5)] = var9 * var33 / var14;
                            }
                            if (~(var16 + var17) < ~class218.field2979) {
                                int var34 = -var16 + class218.field2979;
                                class408.method2569(var19, var16, var34, var9);
                                class408.method2569(var19, 0, -var34 + var17, var9);
                            } else {
                                class408.method2569(var19, var16, var17, var9);
                            }
                        }
                    }
                }
            }
        } else if (~(arg3 - -arg5) >= ~class218.field2979) {
            for (int var35 = 0; arg1 > var35; ++var35) {
                class408.method2569(arg6[arg0 + var35], arg3, arg5, var9);
            }
        } else {
            int var36 = -arg3 + class218.field2979;
            for (int var37 = 0; var37 < arg1; ++var37) {
                int[] var38 = arg6[arg0 + var37];
                class408.method2569(var38, arg3, var36, var9);
                class408.method2569(var38, 0, -var36 + arg5, var9);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field1256;
        if (arg1 != 0) {
            method608(-48);
        }
        int[] var3 = super.field1340.method14(59, arg0);
        if (super.field1340.field35) {
            int[][] var4 = super.field1340.method15(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class218.field2979 * this.field1271 >> 12;
            int var15 = class218.field2979 * this.field1257 >> 12;
            int var16 = class392.field5738 * this.field1264 >> 12;
            int var17 = class392.field5738 * this.field1255 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field1270 = class218.field2979 / 8 * this.field1258 >> 12;
                int var18 = class218.field2979 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1269);
                while (true) {
                    while (true) {
                        int var22 = class239.method1529(var15 - var14, (byte) -96, var21) + var14;
                        int var23 = class239.method1529(-var16 + var17, (byte) -96, var21) + var16;
                        int var24 = var8 - -var22;
                        if (~class218.field2979 > ~var24) {
                            var22 = -var8 + class218.field2979;
                            var24 = class218.field2979;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class218.field2979;
                            }
                            if (class218.field2979 < var28) {
                                var28 -= class218.field2979;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var28 <= ~var30[0] && var28 <= var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class218.field2979;
                                        }
                                        if (class218.field2979 < var31) {
                                            var31 -= class218.field2979;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var28) {
                                                    if (~var36 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class218.field2979;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method610(var35, -var35 + var29, var21, var7 + var38, 111, -var38 + var39, var4);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                int var10000 = ~var12;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (class392.field5738 < var29 - -var23) {
                            var23 = -var29 + class392.field5738;
                        } else {
                            var10 = false;
                        }
                        if (class218.field2979 == var24) {
                            this.method610(var29, var23, var21, var6 + var8, 114, var22, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var29 - -var23;
                            var41[0] = var8;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class239.method1529(class218.field2979, (byte) -96, var21);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class218.field2979 + var5;
                            }
                            var9 = 0;
                            if (~var43 < ~class218.field2979) {
                                var43 -= class218.field2979;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var44[0] <= var43 && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[2] = var29 - -var23;
                            var45[0] = var8;
                            this.method610(var29, var23, var21, var6 + var8, 117, var22, var4);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}

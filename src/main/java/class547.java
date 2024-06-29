import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class547 extends class615 {

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private int field7290 = 1024;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    private int field7294 = 819;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    private int field7291 = 1024;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field7297 = 1024;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    private int field7295 = 0;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private int field7289 = 1024;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    private int field7288 = 409;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    private int field7300 = 0;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    private int field7301 = 2048;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Ldb;")
    public static class298 field7296 = new class298(95, -2);

    @OriginalMember(owner = "client!id", name = "V", descriptor = "[S")
    public static short[] field7302 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field7298;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "[Lgm;")
    public static class112[] field7303;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BILeh;)V", line = 5)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field7293;
        if (arg0 <= 44) {
            this.field7288 = -89;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field7297 = arg2.method2001((byte) -83);
                                        }
                                    } else {
                                        this.field7289 = arg2.method2001((byte) -83);
                                    }
                                } else {
                                    this.field7300 = arg2.method2034(255);
                                }
                            } else {
                                this.field7290 = arg2.method2001((byte) -83);
                            }
                        } else {
                            this.field7294 = arg2.method2001((byte) -83);
                        }
                    } else {
                        this.field7288 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field7301 = arg2.method2001((byte) -83);
                }
            } else {
                this.field7291 = arg2.method2001((byte) -83);
            }
        } else {
            this.field7295 = arg2.method2034(255);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 103)
    public class547() {
        super(0, true);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 119)
    public final void method10(int arg0) {
        if (arg0 != 12404) {
            field7302 = null;
        }
        ++field7299;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[[IBIIILjava/util/Random;)V", line = 129)
    private final void method3042(int arg0, int[][] arg1, byte arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field7292;
        int var8 = ~this.field7297 >= -1 ? 4096 : 4096 + -class660.method3697(0, this.field7297, arg6);
        int var9 = this.field7298 * this.field7289 >> 12;
        int var10 = this.field7298 - (var9 <= 0 ? 0 : class660.method3697(0, var9, arg6));
        if (class505.field6740 <= arg0) {
            arg0 -= class505.field6740;
        }
        if (~var10 >= -1) {
            if (~(arg0 - -arg5) < ~class505.field6740) {
                int var11 = -arg0 + class505.field6740;
                for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                    int[] var13 = arg1[arg3 - -var12];
                    class83.method684(var13, arg0, var11, var8);
                    class83.method684(var13, 0, arg5 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg4; ++var14) {
                    class83.method684(arg1[arg3 + var14], arg0, arg5, var8);
                }
            }
        } else {
            if (~arg4 >= -1 || arg5 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = arg4 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = -(var17 * 2) + arg5;
            for (int var21 = 0; arg4 > var21; ++var21) {
                int[] var22 = arg1[arg3 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field7300 == -1) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class571.method3139(class313.field4306, arg0 - -var24)] = var22[class571.method3139(class313.field4306, -var24 + arg0 - -arg5 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class571.method3139(arg0 - -var26, class313.field4306)] = var22[class571.method3139(class313.field4306, arg0 + arg5 + -1 + -var26)] = var28 < var23 ? var28 : var23;
                        }
                    }
                    if (var19 - -var20 > class505.field6740) {
                        int var27 = -var19 + class505.field6740;
                        class83.method684(var22, var19, var27, var23);
                        class83.method684(var22, 0, -var27 + var20, var23);
                    } else {
                        class83.method684(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg4 + -1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field7300 != 0) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class571.method3139(class313.field4306, arg0 - -var31)] = var22[class571.method3139(arg5 - 1 + arg0 + -var31, class313.field4306)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class571.method3139(arg0 + var33, class313.field4306)] = var22[class571.method3139(class313.field4306, arg0 + arg5 - 1 + -var33)] = var30 * var35 >> 12;
                            }
                        }
                        if (class505.field6740 >= var19 - -var20) {
                            class83.method684(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class505.field6740;
                            class83.method684(var22, var19, var34, var30);
                            class83.method684(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class571.method3139(class313.field4306, arg0 + var36)] = var22[class571.method3139(class313.field4306, -var36 + -1 + arg0 + arg5)] = var8 * var36 / var17;
                        }
                        if (class505.field6740 < var19 + var20) {
                            int var37 = -var19 + class505.field6740;
                            class83.method684(var22, var19, var37, var8);
                            class83.method684(var22, 0, -var37 + var20, var8);
                        } else {
                            class83.method684(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
        if (arg2 <= 35) {
            method3043(-107);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[I", line = 324)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field7287;
            int[] var3 = super.field8125.method298(arg0, -115);
            if (super.field8125.field579) {
                int[][] var4 = super.field8125.method294((byte) 84);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class505.field6740 * this.field7291 >> 12;
                int var15 = class505.field6740 * this.field7301 >> 12;
                int var16 = class471.field6301 * this.field7288 >> 12;
                int var17 = class471.field6301 * this.field7294 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field7298 = class505.field6740 / 8 * this.field7290 >> 12;
                    int var18 = class505.field6740 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field7295);
                    while (true) {
                        while (true) {
                            int var22 = class660.method3697(0, var15 - var14, var21) + var14;
                            int var23 = var16 + class660.method3697(0, -var16 + var17, var21);
                            int var24 = var8 + var22;
                            if (~var24 < ~class505.field6740) {
                                var24 = class505.field6740;
                                var22 = -var8 + class505.field6740;
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
                                    var29 += class505.field6740;
                                }
                                if (var29 > class505.field6740) {
                                    var29 -= class505.field6740;
                                }
                                var25 = var27[2];
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                        if (var9 != var26) {
                                            int var31 = var8 - -var5;
                                            if (var31 < 0) {
                                                var31 += class505.field6740;
                                            }
                                            if (~var31 < ~class505.field6740) {
                                                var31 -= class505.field6740;
                                            }
                                            for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                                int[] var40 = var20[(var9 + var32) % var12];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; var33 <= var28; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (~var25 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var29 < ~var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var29, var37);
                                                    } else if (~var36 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class505.field6740;
                                                    }
                                                    this.method3042(var7 + var38, var4, (byte) 37, var35, -var35 + var25, var39 - var38, var21);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    ++var28;
                                    ++var26;
                                    if (~var26 <= ~var12) {
                                        var26 = 0;
                                    }
                                }
                            }
                            if (~(var25 - -var23) < ~class471.field6301) {
                                var23 = -var25 + class471.field6301;
                            } else {
                                var10 = false;
                            }
                            if (~class505.field6740 == ~var24) {
                                this.method3042(var6 + var8, var4, (byte) 92, var25, var23, var22, var21);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var41 = var19[var13++];
                                var41[0] = var8;
                                var41[2] = var25 - -var23;
                                var41[1] = var24;
                                int[][] var42 = var20;
                                var20 = var19;
                                var12 = var13;
                                var19 = var42;
                                var7 = var6;
                                var13 = 0;
                                var6 = class660.method3697(0, class505.field6740, var21);
                                var5 = -var7 + var6;
                                var8 = 0;
                                int var43 = var5;
                                if (var5 < 0) {
                                    var43 = class505.field6740 + var5;
                                }
                                if (var43 > class505.field6740) {
                                    var43 -= class505.field6740;
                                }
                                var9 = 0;
                                var11 = false;
                                while (true) {
                                    int[] var44 = var20[var9];
                                    if (var44[0] <= var43 && ~var43 >= ~var44[1]) {
                                        break;
                                    }
                                    ++var9;
                                    if (var12 <= var9) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[1] = var24;
                                var45[2] = var23 + var25;
                                var45[0] = var8;
                                this.method3042(var6 + var8, var4, (byte) 93, var25, var23, var22, var21);
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

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V", line = 591)
    public static void method3043(int arg0) {
        field7296 = null;
        if (arg0 > -29) {
            method3043(62);
        }
        field7303 = null;
        field7302 = null;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class196 {

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    private int field236 = 0;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    private int field235 = 1024;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    private int field243 = 409;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    private int field247 = 1024;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    private int field244 = 1024;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    private int field246 = 2048;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "I")
    private int field248 = 819;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    private int field251 = 1024;

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "I")
    private int field253 = 0;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Ldf;")
    private static class51 field234 = class46.method233(" from your friend list first)3", 100);

    @OriginalMember(owner = "client!n", name = "W", descriptor = "[I")
    public static int[] field238 = new int[1000];

    @OriginalMember(owner = "client!n", name = "db", descriptor = "[I")
    public static int[] field245 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "Ldf;")
    public static class51 field250 = field234;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "[B")
    public static byte[] field239;

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "Ldf;")
    private static class51 field252;

    @OriginalMember(owner = "client!n", name = "nb", descriptor = "Ldf;")
    public static class51 field255;

    @OriginalMember(owner = "client!n", name = "ob", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!n", name = "mb", descriptor = "Ldf;")
    public static class51 field254;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method81(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg7 + arg5;
        if (arg3 != 61) {
            method81(-27, 15, 39, (byte) 47, -37, -49, 71, -61, -60);
        }
        ++field249;
        int var10 = -arg4 + arg0;
        int var11 = (-arg6 + arg8 << 16) / var9;
        int var12 = (-arg1 + arg2 << 16) / var10;
        class116.method850(var12, arg7, arg0, arg6, (byte) -81, arg5, arg1, 0, 0, arg4, var11);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 == 82) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (arg0 == 8) {
                                                this.field247 = arg1.method876(false);
                                            }
                                        } else {
                                            this.field235 = arg1.method876(false);
                                        }
                                    } else {
                                        this.field253 = arg1.method897(-64);
                                    }
                                } else {
                                    this.field244 = arg1.method876(false);
                                }
                            } else {
                                this.field248 = arg1.method876(false);
                            }
                        } else {
                            this.field243 = arg1.method876(false);
                        }
                    } else {
                        this.field246 = arg1.method876(false);
                    }
                } else {
                    this.field251 = arg1.method876(false);
                }
            } else {
                this.field236 = arg1.method897(arg2 ^ -114);
            }
            ++field242;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        super(0, true);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILjava/util/Random;I[[I)V")
    private final void method82(int arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int[][] arg6) {
        ++field240;
        if (arg3 != 1024) {
            method83(93);
        }
        int var8 = ~this.field247 >= -1 ? 4096 : 4096 + -class193.method1373(-1634280864, this.field247, arg4);
        int var9 = this.field235 * this.field233 >> 12;
        int var10 = this.field233 - (~var9 >= -1 ? 0 : class193.method1373(arg3 + -1634281888, var9, arg4));
        if (~arg5 <= ~class49.field767) {
            arg5 -= class49.field767;
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && arg0 > 0) {
                int var11 = arg2 / 2;
                int var12 = arg0 / 2;
                int var13 = var12 >= var10 ? var10 : var12;
                int var14 = ~var11 > ~var10 ? var11 : var10;
                int var15 = -(var13 * 2) + arg0;
                int var16 = arg5 - -var13;
                for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                    int[] var18 = arg6[arg1 + var17];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (this.field253 != 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class191.method1366(arg5 + var20, class135.field2245)] = var18[class191.method1366(-var20 + arg5 + -1 - -arg0, class135.field2245)] = ~var21 <= ~var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class191.method1366(class135.field2245, arg5 + var22)] = var18[class191.method1366(class135.field2245, -var22 + -1 + arg0 + arg5)] = var19 * var24 >> 12;
                            }
                        }
                        if (var16 - -var15 > class49.field767) {
                            int var23 = -var16 + class49.field767;
                            class256.method1743(var18, var16, var23, var19);
                            class256.method1743(var18, 0, -var23 + var15, var19);
                        } else {
                            class256.method1743(var18, var16, var15, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field253 == -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class191.method1366(class135.field2245, arg5 + var27)] = var18[class191.method1366(-var27 + arg5 + -1 + arg0, class135.field2245)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class191.method1366(class135.field2245, arg5 - -var29)] = var18[class191.method1366(class135.field2245, arg0 + arg5 + -1 - var29)] = ~var31 <= ~var26 ? var26 : var31;
                                }
                            }
                            if (class49.field767 >= var16 - -var15) {
                                class256.method1743(var18, var16, var15, var26);
                            } else {
                                int var30 = class49.field767 - var16;
                                class256.method1743(var18, var16, var30, var26);
                                class256.method1743(var18, 0, -var30 + var15, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class191.method1366(arg5 + var32, class135.field2245)] = var18[class191.method1366(class135.field2245, arg5 - var32 + arg0 + -1)] = var8 * var32 / var13;
                            }
                            if (~(var16 - -var15) >= ~class49.field767) {
                                class256.method1743(var18, var16, var15, var8);
                            } else {
                                int var33 = -var16 + class49.field767;
                                class256.method1743(var18, var16, var33, var8);
                                class256.method1743(var18, 0, var15 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class49.field767 <= ~(arg0 + arg5)) {
            for (int var34 = 0; var34 < arg2; ++var34) {
                class256.method1743(arg6[arg1 - -var34], arg5, arg0, var8);
            }
        } else {
            int var35 = -arg5 + class49.field767;
            for (int var36 = 0; arg2 > var36; ++var36) {
                int[] var37 = arg6[arg1 - -var36];
                class256.method1743(var37, arg5, var35, var8);
                class256.method1743(var37, 0, arg0 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method83(int arg0) {
        field252 = null;
        field239 = null;
        field234 = null;
        int var1 = 77 / ((58 - arg0) / 44);
        field255 = null;
        field238 = null;
        field245 = null;
        field250 = null;
        field254 = null;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        int var2 = 44 / ((43 - arg0) / 41);
        ++field237;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field241;
        if (arg1 != 10565) {
            this.method73((byte) 124);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[][] var4 = super.field3274.method1481(false);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class49.field767 * this.field251 >> 12;
            int var15 = class234.field4079 * this.field243 >> 12;
            int var16 = class49.field767 * this.field246 >> 12;
            int var17 = class234.field4079 * this.field248 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field233 = class49.field767 / 8 * this.field244 >> 12;
                int var18 = class49.field767 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field236);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class193.method1373(-1634280864, -var14 + var16, var21);
                        int var23 = class193.method1373(-1634280864, -var15 + var17, var21) + var15;
                        int var24 = var8 + var22;
                        if (class49.field767 < var24) {
                            var24 = class49.field767;
                            var22 = -var8 + class49.field767;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var19[var9];
                            int var28 = var5 + var24;
                            int var29 = 0;
                            if (var28 < 0) {
                                var28 += class49.field767;
                            }
                            var25 = var27[2];
                            if (var28 > class49.field767) {
                                var28 -= class49.field767;
                            }
                            while (true) {
                                int[] var30 = var19[var26];
                                if (var30[0] <= var28 && ~var28 >= ~var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class49.field767;
                                        }
                                        if (var31 > class49.field767) {
                                            var31 -= class49.field767;
                                        }
                                        for (int var32 = 1; var29 >= var32; ++var32) {
                                            int[] var40 = var19[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var29 >= var33; ++var33) {
                                            int[] var34 = var19[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 >= ~var31) {
                                                    if (~var36 == -1) {
                                                        var38 = Math.min(var28, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class49.field767;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var28, var37);
                                                }
                                                this.method82(var38 - var39, var35, -var35 + var25, 1024, var21, var39 - -var7, var4);
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
                                ++var29;
                            }
                        }
                        if (~(var23 + var25) >= ~class234.field4079) {
                            var13 = false;
                        } else {
                            var23 = class234.field4079 - var25;
                        }
                        if (~class49.field767 != ~var24) {
                            int[] var41 = var20[var11++];
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            this.method82(var22, var25, var23, 1024, var21, var8 - -var6, var4);
                            var8 = var24;
                        } else {
                            this.method82(var22, var25, var23, arg1 + -9541, var21, var6 + var8, var4);
                            if (var13) {
                                return var3;
                            }
                            int[] var42 = var20[var11++];
                            var10 = false;
                            var13 = true;
                            var42[2] = var23 + var25;
                            var7 = var6;
                            var42[1] = var24;
                            int[][] var43 = var19;
                            var42[0] = var8;
                            var6 = class193.method1373(-1634280864, class49.field767, var21);
                            var8 = 0;
                            var19 = var20;
                            var9 = 0;
                            var20 = var43;
                            var5 = var6 - var7;
                            var12 = var11;
                            int var44 = var5;
                            var11 = 0;
                            if (~var5 > -1) {
                                var44 = class49.field767 + var5;
                            }
                            if (var44 > class49.field767) {
                                var44 -= class49.field767;
                            }
                            while (true) {
                                int[] var45 = var19[var9];
                                if (var44 >= var45[0] && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
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

    static {
        int var0 = 0;
        field239 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field239[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field252 = class46.method233("flash3:", 100);
        field255 = field252;
        field256 = 0;
        field254 = field252;
    }
}

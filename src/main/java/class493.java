import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class493 extends class466 {

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    private int field6900 = 2048;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    private int field6898 = 1024;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    private int field6899 = 409;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    private int field6901 = 0;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    private int field6907 = 819;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    private int field6897 = 0;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    private int field6911 = 1024;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    private int field6913 = 1024;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
    private int field6914 = 1024;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "Z")
    public static boolean field6904 = false;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    private int field6902;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "Lcca;")
    public static class206 field6910;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "[[B")
    public static byte[][] field6909;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field6914 = arg0.method93((byte) 97);
                                        }
                                    } else {
                                        this.field6911 = arg0.method93((byte) 100);
                                    }
                                } else {
                                    this.field6897 = arg0.method110((byte) 112);
                                }
                            } else {
                                this.field6898 = arg0.method93((byte) 93);
                            }
                        } else {
                            this.field6907 = arg0.method93((byte) 102);
                        }
                    } else {
                        this.field6899 = arg0.method93((byte) 76);
                    }
                } else {
                    this.field6900 = arg0.method93((byte) 73);
                }
            } else {
                this.field6913 = arg0.method93((byte) 117);
            }
        } else {
            this.field6901 = arg0.method110((byte) 96);
        }
        if (arg1 == -5062) {
            ++field6912;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field6903;
        if (arg1 != 0) {
            this.field6899 = -31;
        }
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int[][] var4 = super.field6557.method567(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class312.field4207 * this.field6913 >> 12;
            int var15 = class312.field4207 * this.field6900 >> 12;
            int var16 = class564.field7814 * this.field6899 >> 12;
            int var17 = class564.field7814 * this.field6907 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field6902 = class312.field4207 / 8 * this.field6898 >> 12;
                int var18 = class312.field4207 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6901);
                while (true) {
                    while (true) {
                        int var22 = class303.method1924((byte) -83, var21, var15 - var14) + var14;
                        int var23 = var16 + class303.method1924((byte) -62, var21, -var16 + var17);
                        int var24 = var8 - -var22;
                        if (class312.field4207 < var24) {
                            var22 = -var8 + class312.field4207;
                            var24 = class312.field4207;
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
                                var28 += class312.field4207;
                            }
                            if (~var28 < ~class312.field4207) {
                                var28 -= class312.field4207;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (var29[0] <= var28 && var28 <= var29[1]) {
                                    var30 = var26[2];
                                    if (var9 != var25) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class312.field4207;
                                        }
                                        if (~class312.field4207 > ~var31) {
                                            var31 -= class312.field4207;
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
                                                if (var28 <= var31) {
                                                    if (var36 == 0) {
                                                        var38 = Math.min(var28, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class312.field4207;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var28, var37);
                                                }
                                                this.method2868(-var39 + var38, var21, 16711935, var4, var35, var7 + var39, -var35 + var30);
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
                        if (~(var30 - -var23) < ~class564.field7814) {
                            var23 = -var30 + class564.field7814;
                        } else {
                            var10 = false;
                        }
                        if (~class312.field4207 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var30 - -var23;
                            this.method2868(var22, var21, 16711935, var4, var30, var6 + var8, var23);
                            var8 = var24;
                        } else {
                            this.method2868(var22, var21, 16711935, var4, var30, var6 + var8, var23);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var30;
                            var42[1] = var24;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class303.method1924((byte) -103, var21, class312.field4207);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class312.field4207 + var5;
                            }
                            var9 = 0;
                            if (var44 > class312.field4207) {
                                var44 -= class312.field4207;
                            }
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
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

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            this.method7(110);
        }
        ++field6905;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method2866(byte arg0) {
        field6909 = null;
        field6910 = null;
        if (arg0 > -56) {
            field6910 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
    public static final void method2867(boolean arg0) {
        ++field6906;
        if (~class213.field3022 <= -1) {
            long var1 = class488.method2835(30160);
            class213.field3022 = (int) ((long) class213.field3022 - (-class246.field3440 + var1));
            if (~class213.field3022 >= -1) {
                class392.field5533 = class275.field3809.field7361;
                class213.field3022 = -1;
                class552.field7624 = class275.field3809.field7375;
                class561.field7776 = class275.field3809.field7364;
                class45.field871 = class275.field3809.field7372;
                class571.field7877 = class275.field3809.field7365;
                class173.field2493 = class275.field3809.field7360;
                class215.field3071 = class275.field3809.field7363;
                class597.field8632 = class275.field3809.field7374;
                class118.field1935 = class275.field3809.field7370;
                class151.field2296 = class275.field3809.field7371;
            } else {
                int var3 = (class213.field3022 << 8) / class269.field3755;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = -var5 + 1.0F;
                class45.field871 = ((class551.field7612 & 16711935) * var3 + (class275.field3809.field7372 & 16711935) * var4 & -16711936) - -((65280 & class551.field7612) * var3 - -((class275.field3809.field7372 & 65280) * var4) & 16711680) >>> 8;
                class151.field2296 = (class275.field3809.field7371 - class330.field4406) * var6 + class330.field4406;
                class173.field2493 = (class275.field3809.field7360 - class378.field5073) * var6 + class378.field5073;
                class215.field3071 = class580.field7978 * var3 + class275.field3809.field7363 * var4 >> 8;
                class552.field7624 = (-class613.field8813 + class275.field3809.field7375) * var6 + class613.field8813;
                class571.field7877 = ((class105.field1587 & 16711935) * var3 + (16711935 & class275.field3809.field7365) * var4 & -16711936) - -(16711680 & (65280 & class105.field1587) * var3 + (class275.field3809.field7365 & 65280) * var4) >>> 8;
                class118.field1935 = (-class509.field7109 + class275.field3809.field7370) * var6 + class509.field7109;
                class561.field7776 = (class275.field3809.field7364 - class221.field3165) * var6 + class221.field3165;
                class392.field5533 = (-class400.field5698 + class275.field3809.field7361) * var6 + class400.field5698;
                if (class634.field9271 != class275.field3809.field7374) {
                    class597.field8632 = class494.field6919.method1281(class634.field9271, class275.field3809.field7374, var6, class597.field8632);
                }
            }
            class246.field3440 = var1;
        }
        if (!arg0) {
            method2866((byte) -86);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class493() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/util/Random;I[[IIII)V")
    private final void method2868(int arg0, Random arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 16711935) {
            method2867(true);
        }
        ++field6908;
        int var8 = this.field6914 > 0 ? 4096 + -class303.method1924((byte) -63, arg1, this.field6914) : 4096;
        int var9 = this.field6911 * this.field6902 >> 12;
        int var10 = this.field6902 - (var9 > 0 ? class303.method1924((byte) -107, arg1, var9) : 0);
        if (~arg5 <= ~class312.field4207) {
            arg5 -= class312.field4207;
        }
        if (var10 > 0) {
            if (~arg6 < -1 && ~arg0 < -1) {
                int var11 = arg0 / 2;
                int var12 = arg6 / 2;
                int var13 = ~var11 <= ~var10 ? var10 : var11;
                int var14 = ~var12 > ~var10 ? var12 : var10;
                int var15 = arg5 + var13;
                int var16 = -(var13 * 2) + arg0;
                for (int var17 = 0; arg6 > var17; ++var17) {
                    int[] var18 = arg3[var17 - -arg4];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field6897 != -1) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class589.method3454(arg5 + var20, class340.field4582)] = var18[class589.method3454(-var20 + -1 + arg0 + arg5, class340.field4582)] = var21 >= var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class589.method3454(class340.field4582, arg5 - -var22)] = var18[class589.method3454(class340.field4582, arg5 - (-arg0 + var22) + -1)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class312.field4207 > ~(var15 - -var16)) {
                            int var23 = -var15 + class312.field4207;
                            class416.method2495(var18, var15, var23, var19);
                            class416.method2495(var18, 0, -var23 + var16, var19);
                        } else {
                            class416.method2495(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg6 - 1;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field6897 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class589.method3454(arg5 + var27, class340.field4582)] = var18[class589.method3454(arg5 - var27 + -1 + arg0, class340.field4582)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class589.method3454(arg5 - -var29, class340.field4582)] = var18[class589.method3454(arg5 - -arg0 + -1 + -var29, class340.field4582)] = ~var31 > ~var26 ? var31 : var26;
                                }
                            }
                            if (var15 + var16 > class312.field4207) {
                                int var30 = -var15 + class312.field4207;
                                class416.method2495(var18, var15, var30, var26);
                                class416.method2495(var18, 0, -var30 + var16, var26);
                            } else {
                                class416.method2495(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class589.method3454(class340.field4582, arg5 + var32)] = var18[class589.method3454(arg5 + -1 + arg0 + -var32, class340.field4582)] = var8 * var32 / var13;
                            }
                            if (class312.field4207 < var15 + var16) {
                                int var33 = -var15 + class312.field4207;
                                class416.method2495(var18, var15, var33, var8);
                                class416.method2495(var18, 0, -var33 + var16, var8);
                            } else {
                                class416.method2495(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg0 + arg5 > class312.field4207) {
            int var34 = -arg5 + class312.field4207;
            for (int var35 = 0; arg6 > var35; ++var35) {
                int[] var36 = arg3[arg4 - -var35];
                class416.method2495(var36, arg5, var34, var8);
                class416.method2495(var36, 0, arg0 - var34, var8);
            }
        } else {
            for (int var37 = 0; arg6 > var37; ++var37) {
                class416.method2495(arg3[arg4 + var37], arg5, arg0, var8);
            }
        }
    }
}

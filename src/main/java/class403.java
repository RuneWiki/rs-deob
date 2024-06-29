import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class403 extends class666 {

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    private int field5359 = 409;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    private int field5368 = 0;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    private int field5360 = 1024;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    private int field5370 = 819;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    private int field5371 = 1024;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    private int field5362 = 2048;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "I")
    private int field5377 = 0;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    private int field5367 = 1024;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    private int field5375 = 1024;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "Lgl;")
    public static class547 field5365 = new class547(1, 5);

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    private int field5369;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "Ljo;")
    public static class303 field5364;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (arg0 != -9) {
            this.method118(-51);
        }
        ++field5372;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII[BII[B)V")
    public static final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        ++field5366;
        int var9 = -(arg1 >> 2);
        int var10 = -(3 & arg1);
        for (int var11 = -arg3; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg0++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg2++]);
                int var14 = arg0++;
                arg5[var14] = (byte) (arg5[var14] + -arg8[arg2++]);
                int var15 = arg0++;
                arg5[var15] = (byte) (arg5[var15] + -arg8[arg2++]);
                int var16 = arg0++;
                arg5[var16] = (byte) (arg5[var16] + -arg8[arg2++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg0++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg8[arg2++]);
            }
            arg0 += arg7;
            arg2 += arg4;
        }
        if (arg6 != 0) {
            method2191(61, 94, 101, -7, -27, (byte[]) null, -35, 39, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field5361;
        int[] var3 = super.field9466.method1811(arg1, 20);
        if (super.field9466.field4172) {
            int[][] var4 = super.field9466.method1806(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class501.field7222 * this.field5367 >> 12;
            int var15 = class501.field7222 * this.field5362 >> 12;
            int var16 = class567.field8041 * this.field5359 >> 12;
            int var17 = class567.field8041 * this.field5370 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field5369 = class501.field7222 / 8 * this.field5360 >> 12;
            int var18 = 1 - -(class501.field7222 / var14);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field5377);
            label128: while (true) {
                while (true) {
                    int var22 = class252.method1448(var21, var15 - var14, (byte) 50) + var14;
                    int var23 = var16 - -class252.method1448(var21, -var16 + var17, (byte) 50);
                    int var24 = var8 + var22;
                    if (class501.field7222 < var24) {
                        var22 = -var8 + class501.field7222;
                        var24 = class501.field7222;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (var29 < 0) {
                            var29 += class501.field7222;
                        }
                        if (var29 > class501.field7222) {
                            var29 -= class501.field7222;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                var25 = var27[2];
                                if (~var9 != ~var26) {
                                    int var31 = var8 - -var5;
                                    if (~var31 > -1) {
                                        var31 += class501.field7222;
                                    }
                                    if (class501.field7222 < var31) {
                                        var31 -= class501.field7222;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var28 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 == 0) {
                                                var39 = Math.min(var29, var37);
                                                var38 = 0;
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class501.field7222;
                                            }
                                            this.method2193(-var38 + var39, var7 + var38, var4, 28475, var35, var21, var25 - var35);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var26;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~class567.field8041 <= ~(var23 + var25)) {
                        var10 = false;
                    } else {
                        var23 = class567.field8041 - var25;
                    }
                    if (~class501.field7222 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[1] = var24;
                        var41[2] = var25 - -var23;
                        this.method2193(var22, var6 + var8, var4, 28475, var25, var21, var23);
                        var8 = var24;
                    } else {
                        this.method2193(var22, var8 - -var6, var4, 28475, var25, var21, var23);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[2] = var23 + var25;
                        var42[0] = var8;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var7 = var6;
                        var13 = 0;
                        var6 = class252.method1448(var21, class501.field7222, (byte) 50);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class501.field7222 + var5;
                        }
                        var9 = 0;
                        if (~class501.field7222 > ~var44) {
                            var44 -= class501.field7222;
                        }
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var45[0] <= var44 && var44 <= var45[1]) {
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -21) {
            method2192((byte) -14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public static void method2192(byte arg0) {
        if (arg0 == 98) {
            field5365 = null;
            field5364 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V")
    private final void method2193(int arg0, int arg1, int[][] arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field5374;
        if (arg3 == 28475) {
            int var8 = ~this.field5371 >= -1 ? 4096 : -class252.method1448(arg5, this.field5371, (byte) 50) + 4096;
            int var9 = this.field5375 * this.field5369 >> 12;
            int var10 = this.field5369 + -(~var9 >= -1 ? 0 : class252.method1448(arg5, var9, (byte) 50));
            if (~class501.field7222 >= ~arg1) {
                arg1 -= class501.field7222;
            }
            if (var10 <= 0) {
                if (~class501.field7222 <= ~(arg0 + arg1)) {
                    for (int var11 = 0; arg6 > var11; ++var11) {
                        class652.method3676(arg2[arg4 - -var11], arg1, arg0, var8);
                    }
                } else {
                    int var12 = class501.field7222 - arg1;
                    for (int var13 = 0; ~var13 > ~arg6; ++var13) {
                        int[] var14 = arg2[arg4 - -var13];
                        class652.method3676(var14, arg1, var12, var8);
                        class652.method3676(var14, 0, -var12 + arg0, var8);
                    }
                }
            } else if (arg6 > 0 && ~arg0 < -1) {
                int var15 = arg0 / 2;
                int var16 = arg6 / 2;
                int var17 = var10 <= var15 ? var10 : var15;
                int var18 = ~var16 <= ~var10 ? var10 : var16;
                int var19 = arg1 - -var17;
                int var20 = -(var17 * 2) + arg0;
                for (int var21 = 0; ~arg6 < ~var21; ++var21) {
                    int[] var22 = arg2[arg4 + var21];
                    if (~var21 > ~var18) {
                        int var23 = var8 * var21 / var18;
                        if (this.field5368 != 0) {
                            for (int var24 = 0; var24 < var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class203.method1246(arg1 + var24, class507.field7299)] = var22[class203.method1246(class507.field7299, -var24 + arg1 + -1 + arg0)] = ~var25 <= ~var23 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; var26 < var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class203.method1246(arg1 + var26, class507.field7299)] = var22[class203.method1246(-var26 + -1 + arg1 + arg0, class507.field7299)] = var23 * var28 >> 12;
                            }
                        }
                        if (var19 + var20 > class501.field7222) {
                            int var27 = class501.field7222 - var19;
                            class652.method3676(var22, var19, var27, var23);
                            class652.method3676(var22, 0, -var27 + var20, var23);
                        } else {
                            class652.method3676(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = arg6 + -1 + -var21;
                        if (~var29 > ~var18) {
                            int var30 = var8 * var29 / var18;
                            if (~this.field5368 != -1) {
                                for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class203.method1246(arg1 + var31, class507.field7299)] = var22[class203.method1246(class507.field7299, arg1 - (-arg0 + var31 + 1))] = ~var32 <= ~var30 ? var30 : var32;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class203.method1246(arg1 + var33, class507.field7299)] = var22[class203.method1246(arg1 - 1 + -var33 + arg0, class507.field7299)] = var30 * var35 >> 12;
                                }
                            }
                            if (~(var19 + var20) >= ~class501.field7222) {
                                class652.method3676(var22, var19, var20, var30);
                            } else {
                                int var34 = -var19 + class501.field7222;
                                class652.method3676(var22, var19, var34, var30);
                                class652.method3676(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var36 < var17; ++var36) {
                                var22[class203.method1246(class507.field7299, arg1 + var36)] = var22[class203.method1246(class507.field7299, -var36 + arg0 + arg1 + -1)] = var8 * var36 / var17;
                            }
                            if (class501.field7222 < var19 + var20) {
                                int var37 = class501.field7222 - var19;
                                class652.method3676(var22, var19, var37, var8);
                                class652.method3676(var22, 0, var20 - var37, var8);
                            } else {
                                class652.method3676(var22, var19, var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLiaa;)Llr;")
    public static final class684 method2194(byte arg0, class452 arg1) {
        ++field5363;
        if (arg0 > -94) {
            field5376 = 47;
        }
        int var2 = arg1.method2575((byte) -48);
        return new class684(var2);
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class403() {
        super(0, true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            field5365 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field5371 = arg1.method2574(-1758460248);
                                        }
                                    } else {
                                        this.field5375 = arg1.method2574(-1758460248);
                                    }
                                } else {
                                    this.field5368 = arg1.method2541(121);
                                }
                            } else {
                                this.field5360 = arg1.method2574(-1758460248);
                            }
                        } else {
                            this.field5370 = arg1.method2574(-1758460248);
                        }
                    } else {
                        this.field5359 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field5362 = arg1.method2574(-1758460248);
                }
            } else {
                this.field5367 = arg1.method2574(-1758460248);
            }
        } else {
            this.field5377 = arg1.method2541(85);
        }
        ++field5373;
    }
}

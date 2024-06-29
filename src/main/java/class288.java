import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class288 extends class362 {

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "I")
    private int field3964 = 0;

    @OriginalMember(owner = "client!tja", name = "D", descriptor = "I")
    private int field3968 = 1024;

    @OriginalMember(owner = "client!tja", name = "C", descriptor = "I")
    private int field3967 = 1024;

    @OriginalMember(owner = "client!tja", name = "y", descriptor = "I")
    private int field3963 = 409;

    @OriginalMember(owner = "client!tja", name = "F", descriptor = "I")
    private int field3970 = 2048;

    @OriginalMember(owner = "client!tja", name = "J", descriptor = "I")
    private int field3974 = 1024;

    @OriginalMember(owner = "client!tja", name = "G", descriptor = "I")
    private int field3971 = 819;

    @OriginalMember(owner = "client!tja", name = "E", descriptor = "I")
    private int field3969 = 0;

    @OriginalMember(owner = "client!tja", name = "B", descriptor = "I")
    private int field3966 = 1024;

    @OriginalMember(owner = "client!tja", name = "A", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!tja", name = "H", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!tja", name = "K", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!tja", name = "M", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!tja", name = "N", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!tja", name = "O", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!tja", name = "I", descriptor = "Laf;")
    public static class461 field3973;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field3978;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field3968 = arg0.method763(arg2 ^ -98);
                                        }
                                    } else {
                                        this.field3967 = arg0.method763(9);
                                    }
                                } else {
                                    this.field3969 = arg0.method793((byte) 18);
                                }
                            } else {
                                this.field3966 = arg0.method763(-101);
                            }
                        } else {
                            this.field3971 = arg0.method763(-104);
                        }
                    } else {
                        this.field3963 = arg0.method763(-94);
                    }
                } else {
                    this.field3970 = arg0.method763(arg2 + -27);
                }
            } else {
                this.field3974 = arg0.method763(-86);
            }
        } else {
            this.field3964 = arg0.method793((byte) 45);
        }
        if (arg2 != -1) {
            method1841(-56);
        }
    }

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "(I)V")
    public static void method1841(int arg0) {
        field3973 = null;
        if (arg0 != 4096) {
            field3973 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "()V")
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != -996226836) {
            method1843(-69, (int[][]) null);
        }
        ++field3975;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(BIII[[IILjava/util/Random;)V")
    private final void method1842(byte arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        ++field3965;
        int var8 = this.field3968 > 0 ? 4096 + -class38.method235(this.field3968, 70, arg6) : 4096;
        int var9 = this.field3976 * this.field3967 >> 12;
        int var10 = this.field3976 - (~var9 < -1 ? class38.method235(var9, -116, arg6) : 0);
        if (arg2 >= class769.field10597) {
            arg2 -= class769.field10597;
        }
        if (var10 <= 0) {
            if (class769.field10597 >= arg1 + arg2) {
                for (int var11 = 0; var11 < arg3; ++var11) {
                    class275.method1772(arg4[arg5 + var11], arg2, arg1, var8);
                }
            } else {
                int var12 = -arg2 + class769.field10597;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    int[] var14 = arg4[arg5 + var13];
                    class275.method1772(var14, arg2, var12, var8);
                    class275.method1772(var14, 0, -var12 + arg1, var8);
                }
            }
        } else {
            if (~arg3 >= -1 || ~arg1 >= -1) {
                return;
            }
            int var15 = arg1 / 2;
            int var16 = arg3 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = ~var10 < ~var16 ? var16 : var10;
            int var19 = arg2 - -var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg4[var21 - -arg5];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field3969 != 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class204.method1456(class522.field7083, arg2 + var24)] = var22[class204.method1456(class522.field7083, arg1 + -1 + arg2 + -var24)] = ~var25 > ~var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class204.method1456(class522.field7083, arg2 - -var26)] = var22[class204.method1456(arg2 - -arg1 + -var26 + -1, class522.field7083)] = var23 * var28 >> 12;
                        }
                    }
                    if (class769.field10597 >= var19 + var20) {
                        class275.method1772(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class769.field10597;
                        class275.method1772(var22, var19, var27, var23);
                        class275.method1772(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg3 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field3969 == -1) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class204.method1456(class522.field7083, arg2 + var31)] = var22[class204.method1456(-var31 + arg1 + arg2 + -1, class522.field7083)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class204.method1456(arg2 + var33, class522.field7083)] = var22[class204.method1456(-var33 - 1 + arg1 + arg2, class522.field7083)] = ~var30 >= ~var35 ? var30 : var35;
                            }
                        }
                        if (var19 + var20 > class769.field10597) {
                            int var34 = class769.field10597 - var19;
                            class275.method1772(var22, var19, var34, var30);
                            class275.method1772(var22, 0, var20 - var34, var30);
                        } else {
                            class275.method1772(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class204.method1456(arg2 + var36, class522.field7083)] = var22[class204.method1456(class522.field7083, arg1 + arg2 + -var36 + -1)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) < ~class769.field10597) {
                            int var37 = -var19 + class769.field10597;
                            class275.method1772(var22, var19, var37, var8);
                            class275.method1772(var22, 0, -var37 + var20, var8);
                        } else {
                            class275.method1772(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
        if (arg0 < 94) {
            this.field3968 = -49;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field3977;
        int[] var3 = super.field4927.method808(-127, arg1);
        if (super.field4927.field1471) {
            int[][] var4 = super.field4927.method809(-16352);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class769.field10597 * this.field3974 >> 12;
            int var15 = class769.field10597 * this.field3970 >> 12;
            int var16 = class555.field7845 * this.field3963 >> 12;
            int var17 = class555.field7845 * this.field3971 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field3976 = class769.field10597 / 8 * this.field3966 >> 12;
                int var18 = 1 - -(class769.field10597 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3964);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class38.method235(-var14 + var15, -106, var21);
                        int var23 = var16 + class38.method235(var17 - var16, arg0 + 2026769197, var21);
                        int var24 = var8 - -var22;
                        if (class769.field10597 < var24) {
                            var24 = class769.field10597;
                            var22 = -var8 + class769.field10597;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (~var29 > -1) {
                                var29 += class769.field10597;
                            }
                            if (class769.field10597 < var29) {
                                var29 -= class769.field10597;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && var29 <= var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class769.field10597;
                                        }
                                        if (class769.field10597 < var31) {
                                            var31 -= class769.field10597;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
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
                                                if (var31 >= var29) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class769.field10597;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1842((byte) 95, var39 - var38, var7 + var38, -var35 + var25, var4, var35, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class555.field7845 > ~(var23 + var25)) {
                            var23 = -var25 + class555.field7845;
                        } else {
                            var10 = false;
                        }
                        if (~class769.field10597 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            var41[0] = var8;
                            this.method1842((byte) 106, var22, var6 + var8, var23, var4, var25, var21);
                            var8 = var24;
                        } else {
                            this.method1842((byte) 119, var22, var6 + var8, var23, var4, var25, var21);
                            if (var10) {
                                return arg0 != -2026769311 ? null : var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class38.method235(class769.field10597, -126, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class769.field10597 + var5;
                            }
                            var9 = 0;
                            if (class769.field10597 < var44) {
                                var44 -= class769.field10597;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && ~var44 >= ~var45[1]) {
                                    var11 = false;
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
            return arg0 != -2026769311 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I[[I)V")
    public static final void method1843(int arg0, int[][] arg1) {
        ++field3972;
        class298.field4105 = arg1;
        if (arg0 != 1193931212) {
            method1841(98);
        }
    }
}

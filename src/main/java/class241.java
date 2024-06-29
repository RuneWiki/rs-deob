import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class241 extends class328 {

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    private int field3498 = 409;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    private int field3499 = 0;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    private int field3500 = 1024;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    private int field3501 = 1024;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    private int field3507 = 2048;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    private int field3497 = 0;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
    private int field3505 = 1024;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    private int field3506 = 819;

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
    private int field3504 = 1024;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "Liu;")
    public static class517 field3502 = new class517(61, -1);

    @OriginalMember(owner = "client!daa", name = "R", descriptor = "Lbv;")
    public static class567 field3511 = new class567("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!daa", name = "P", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!daa", name = "S", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field3501 = arg2.method1745(32132);
                                        }
                                    } else {
                                        this.field3504 = arg2.method1745(32132);
                                    }
                                } else {
                                    this.field3497 = arg2.method1738(255);
                                }
                            } else {
                                this.field3500 = arg2.method1745(32132);
                            }
                        } else {
                            this.field3506 = arg2.method1745(32132);
                        }
                    } else {
                        this.field3498 = arg2.method1745(32132);
                    }
                } else {
                    this.field3507 = arg2.method1745(32132);
                }
            } else {
                this.field3505 = arg2.method1745(32132);
            }
        } else {
            this.field3499 = arg2.method1738(255);
        }
        if (arg0 <= 75) {
            this.method1((byte) 91, 27, (class268) null);
        }
        ++field3503;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
    private final void method1542(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        ++field3508;
        int var8 = ~this.field3501 >= -1 ? 4096 : -class407.method2472(110, arg6, this.field3501) + 4096;
        int var9 = this.field3510 * this.field3504 >> 12;
        int var10 = this.field3510 - (~var9 >= -1 ? 0 : class407.method2472(99, arg6, var9));
        if (arg2 >= -53) {
            this.field3500 = 46;
        }
        if (~arg0 <= ~class449.field6539) {
            arg0 -= class449.field6539;
        }
        if (var10 > 0) {
            if (arg4 > 0 && arg5 > 0) {
                int var11 = arg5 / 2;
                int var12 = arg4 / 2;
                int var13 = ~var11 > ~var10 ? var11 : var10;
                int var14 = var12 < var10 ? var12 : var10;
                int var15 = arg0 - -var13;
                int var16 = -(var13 * 2) + arg5;
                for (int var17 = 0; ~arg4 < ~var17; ++var17) {
                    int[] var18 = arg3[var17 - -arg1];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field3497 == -1) {
                            for (int var20 = 0; var13 > var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class424.method2540(class108.field1799, arg0 + var20)] = var18[class424.method2540(class108.field1799, -var20 + arg0 + arg5 - 1)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class424.method2540(class108.field1799, arg0 + var22)] = var18[class424.method2540(class108.field1799, -var22 + arg0 + arg5 + -1)] = ~var19 >= ~var24 ? var19 : var24;
                            }
                        }
                        if (~class449.field6539 <= ~(var15 + var16)) {
                            class164.method1149(var18, var15, var16, var19);
                        } else {
                            int var23 = class449.field6539 - var15;
                            class164.method1149(var18, var15, var23, var19);
                            class164.method1149(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg4 + -1 + -var17;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field3497 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class424.method2540(class108.field1799, arg0 + var27)] = var18[class424.method2540(class108.field1799, -var27 + arg0 - (-arg5 + 1))] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class424.method2540(arg0 + var29, class108.field1799)] = var18[class424.method2540(arg5 - var29 + -1 + arg0, class108.field1799)] = var26 > var31 ? var31 : var26;
                                }
                            }
                            if (~(var15 + var16) >= ~class449.field6539) {
                                class164.method1149(var18, var15, var16, var26);
                            } else {
                                int var30 = class449.field6539 - var15;
                                class164.method1149(var18, var15, var30, var26);
                                class164.method1149(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class424.method2540(class108.field1799, arg0 + var32)] = var18[class424.method2540(arg0 + arg5 + -1 + -var32, class108.field1799)] = var8 * var32 / var13;
                            }
                            if (~(var15 + var16) >= ~class449.field6539) {
                                class164.method1149(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class449.field6539;
                                class164.method1149(var18, var15, var33, var8);
                                class164.method1149(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg0 + arg5) < ~class449.field6539) {
            int var34 = -arg0 + class449.field6539;
            for (int var35 = 0; var35 < arg4; ++var35) {
                int[] var36 = arg3[arg1 + var35];
                class164.method1149(var36, arg0, var34, var8);
                class164.method1149(var36, 0, -var34 + arg5, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg4; ++var37) {
                class164.method1149(arg3[arg1 - -var37], arg0, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 > -97) {
            this.method2(-3);
        }
        ++field3512;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3509;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[][] var4 = super.field4720.method2874(-22531);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class449.field6539 * this.field3505 >> 12;
            int var15 = class449.field6539 * this.field3507 >> 12;
            int var16 = class527.field7334 * this.field3498 >> 12;
            int var17 = class527.field7334 * this.field3506 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field3510 = class449.field6539 / 8 * this.field3500 >> 12;
            int var18 = class449.field6539 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field3499);
            label124: while (true) {
                while (true) {
                    int var22 = var14 - -class407.method2472(64, var21, -var14 + var15);
                    int var23 = class407.method2472(32, var21, var17 - var16) + var16;
                    int var24 = var8 + var22;
                    if (~class449.field6539 > ~var24) {
                        var22 = class449.field6539 - var8;
                        var24 = class449.field6539;
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
                            var29 += class449.field6539;
                        }
                        if (var29 > class449.field6539) {
                            var29 -= class449.field6539;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && var30[1] >= var29) {
                                if (~var9 != ~var26) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class449.field6539;
                                    }
                                    if (~var31 < ~class449.field6539) {
                                        var31 -= class449.field6539;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 >= var29) {
                                                if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class449.field6539;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method1542(var7 + var38, var35, -61, var4, -var35 + var25, var39 - var38, var21);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (~class527.field7334 > ~(var25 - -var23)) {
                        var23 = -var25 + class527.field7334;
                    } else {
                        var10 = false;
                    }
                    if (~class449.field6539 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var25;
                        var41[0] = var8;
                        var41[1] = var24;
                        this.method1542(var6 + var8, var25, -118, var4, var23, var22, var21);
                        var8 = var24;
                    } else {
                        this.method1542(var6 + var8, var25, -108, var4, var23, var22, var21);
                        if (var10) {
                            break label124;
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
                        var13 = 0;
                        var7 = var6;
                        var6 = class407.method2472(35, var21, class449.field6539);
                        var5 = var6 - var7;
                        var8 = 0;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class449.field6539 + var5;
                        }
                        if (var44 > class449.field6539) {
                            var44 -= class449.field6539;
                        }
                        var9 = 0;
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var45[0] <= var44 && ~var45[1] <= ~var44) {
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
        int var46 = -121 % ((arg1 - 48) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V")
    public static void method1543(int arg0) {
        if (arg0 != 23508) {
            method1543(124);
        }
        field3511 = null;
        field3502 = null;
    }
}

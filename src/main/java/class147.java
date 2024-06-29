import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class147 extends class222 {

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field2568 = 1024;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    private int field2571 = 0;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    private int field2579 = 409;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    private int field2577 = 819;

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
    private int field2583 = 1024;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    private int field2574 = 2048;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    private int field2576 = 0;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    private int field2586 = 1024;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "I")
    private int field2582 = 1024;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field2569 = 50;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lsb;")
    public static class98 field2570 = class47.method368("M", 0);

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lsb;")
    public static class98 field2580 = class47.method368("::noclip", 0);

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "S")
    public static short field2585 = 1;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        field2580 = null;
        if (arg0 == 14) {
            field2570 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field3844.method22(0, arg1);
        ++field2587;
        if (super.field3844.field61) {
            int[][] var4 = super.field3844.method17(-12433);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class20.field373 * this.field2577 >> 12;
            int var15 = class13.field253 * this.field2574 >> 12;
            int var16 = class20.field373 * this.field2579 >> 12;
            int var17 = class13.field253 * this.field2568 >> 12;
            if (~var14 >= -2) {
                return var4[arg1];
            } else {
                this.field2567 = class13.field253 / 8 * this.field2586 >> 12;
                int var18 = class13.field253 / var17 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2576);
                while (true) {
                    while (true) {
                        int var22 = class124.method926(78, -var17 + var15, var21) + var17;
                        int var23 = var16 - -class124.method926(113, -var16 + var14, var21);
                        int var24 = var7 - -var22;
                        if (class13.field253 < var24) {
                            var24 = class13.field253;
                            var22 = -var7 + class13.field253;
                        }
                        int var27;
                        if (var10) {
                            var27 = 0;
                        } else {
                            int var25 = var8;
                            int[] var26 = var19[var8];
                            var27 = var26[2];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class13.field253;
                            }
                            if (var29 > class13.field253) {
                                var29 -= class13.field253;
                            }
                            while (true) {
                                int[] var30 = var19[var25];
                                if (var30[0] <= var29 && var30[1] >= var29) {
                                    if (var8 != var25) {
                                        int var31 = var5 + var7;
                                        if (~var31 > -1) {
                                            var31 += class13.field253;
                                        }
                                        if (var31 > class13.field253) {
                                            var31 -= class13.field253;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var19[(var8 + var32) % var11];
                                            var27 = Math.max(var27, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var19[(var8 + var33) % var11];
                                            int var35 = var34[2];
                                            if (~var27 != ~var35) {
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
                                                    var39 = class13.field253;
                                                }
                                                this.method1083(-var35 + var27, var4, 4, var35, var21, var13 + var38, -var38 + var39);
                                            }
                                        }
                                    }
                                    var8 = var25;
                                    break;
                                }
                                ++var28;
                                ++var25;
                                if (~var25 <= ~var11) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (class20.field373 >= var23 + var27) {
                            var9 = false;
                        } else {
                            var23 = class20.field373 - var27;
                        }
                        if (class13.field253 == var24) {
                            this.method1083(var23, var4, 4, var27, var21, var6 + var7, var22);
                            if (var9) {
                                return arg0 < 35 ? null : var3;
                            }
                            var8 = 0;
                            var10 = false;
                            var9 = true;
                            var13 = var6;
                            int[][] var41 = var19;
                            var19 = var20;
                            int[] var42 = var20[var12++];
                            var11 = var12;
                            var42[0] = var7;
                            var7 = 0;
                            var42[1] = var24;
                            var42[2] = var23 + var27;
                            var20 = var41;
                            var12 = 0;
                            var6 = class124.method926(83, class13.field253, var21);
                            var5 = -var13 + var6;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class13.field253 + var5;
                            }
                            if (class13.field253 < var43) {
                                var43 -= class13.field253;
                            }
                            while (true) {
                                int[] var44 = var19[var8];
                                if (var44[0] <= var43 && var44[1] >= var43) {
                                    break;
                                }
                                ++var8;
                                if (var11 <= var8) {
                                    var8 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var20[var12++];
                            var45[2] = var23 + var27;
                            var45[0] = var7;
                            var45[1] = var24;
                            this.method1083(var23, var4, 4, var27, var21, var6 + var7, var22);
                            var7 = var24;
                        }
                    }
                }
            }
        } else {
            return arg0 < 35 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class147() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = -72 % ((57 - arg0) / 51);
        ++field2578;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIII)I")
    public static final int method1082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -class160.field2890[arg1 * 1024 / arg3] + 65536 >> 1;
        ++field2584;
        return arg0 != -1 ? -1 : ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2567 = -123;
        }
        ++field2575;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field2583 = arg0.method1487(77);
                                        }
                                    } else {
                                        this.field2582 = arg0.method1487(83);
                                    }
                                } else {
                                    this.field2571 = arg0.method1446(5350);
                                }
                            } else {
                                this.field2586 = arg0.method1487(27);
                            }
                        } else {
                            this.field2577 = arg0.method1487(14);
                        }
                    } else {
                        this.field2579 = arg0.method1487(106);
                    }
                } else {
                    this.field2574 = arg0.method1487(110);
                }
            } else {
                this.field2568 = arg0.method1487(12);
            }
        } else {
            this.field2576 = arg0.method1446(5350);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[[IIILjava/util/Random;II)V")
    private final void method1083(int arg0, int[][] arg1, int arg2, int arg3, Random arg4, int arg5, int arg6) {
        ++field2581;
        if (arg2 == 4) {
            int var8 = ~this.field2583 >= -1 ? 4096 : 4096 + -class124.method926(95, this.field2583, arg4);
            int var9 = this.field2582 * this.field2567 >> 12;
            int var10 = this.field2567 + -(~var9 >= -1 ? 0 : class124.method926(85, var9, arg4));
            if (~arg5 <= ~class13.field253) {
                arg5 -= class13.field253;
            }
            if (~var10 >= -1) {
                if (~(arg5 - -arg6) < ~class13.field253) {
                    int var11 = -arg5 + class13.field253;
                    for (int var12 = 0; ~var12 > ~arg0; ++var12) {
                        int[] var13 = arg1[arg3 + var12];
                        class66.method465(var13, arg5, var11, var8);
                        class66.method465(var13, 0, -var11 + arg6, var8);
                    }
                } else {
                    for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                        class66.method465(arg1[arg3 + var14], arg5, arg6, var8);
                    }
                }
            } else if (arg0 > 0 && arg6 > 0) {
                int var15 = arg6 / 2;
                int var16 = var15 < var10 ? var15 : var10;
                int var17 = arg5 + var16;
                int var18 = arg0 / 2;
                int var19 = -(var16 * 2) + arg6;
                int var20 = var10 > var18 ? var18 : var10;
                for (int var21 = 0; ~arg0 < ~var21; ++var21) {
                    int[] var22 = arg1[arg3 + var21];
                    if (var21 < var20) {
                        int var23 = var8 * var21 / var20;
                        if (this.field2571 != 0) {
                            for (int var24 = 0; var16 > var24; ++var24) {
                                int var25 = var8 * var24 / var16;
                                var22[class214.method1427(arg5 + var24, class162.field2924)] = var22[class214.method1427(arg5 + arg6 - (var24 + 1), class162.field2924)] = var23 > var25 ? var25 : var23;
                            }
                        } else {
                            for (int var26 = 0; var16 > var26; ++var26) {
                                int var28 = var8 * var26 / var16;
                                var22[class214.method1427(arg5 + var26, class162.field2924)] = var22[class214.method1427(-var26 + arg5 + arg6 + -1, class162.field2924)] = var23 * var28 >> 12;
                            }
                        }
                        if (var17 - -var19 > class13.field253) {
                            int var27 = -var17 + class13.field253;
                            class66.method465(var22, var17, var27, var23);
                            class66.method465(var22, 0, -var27 + var19, var23);
                        } else {
                            class66.method465(var22, var17, var19, var23);
                        }
                    } else {
                        int var29 = arg0 - (var21 + 1);
                        if (var29 < var20) {
                            int var30 = var8 * var29 / var20;
                            if (~this.field2571 == -1) {
                                for (int var31 = 0; ~var16 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var16;
                                    var22[class214.method1427(class162.field2924, arg5 - -var31)] = var22[class214.method1427(-var31 + arg6 + arg5 + -1, class162.field2924)] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; var33 < var16; ++var33) {
                                    int var35 = var8 * var33 / var16;
                                    var22[class214.method1427(class162.field2924, arg5 + var33)] = var22[class214.method1427(-var33 + arg5 + arg6 + -1, class162.field2924)] = var35 >= var30 ? var30 : var35;
                                }
                            }
                            if (var17 + var19 <= class13.field253) {
                                class66.method465(var22, var17, var19, var30);
                            } else {
                                int var34 = -var17 + class13.field253;
                                class66.method465(var22, var17, var34, var30);
                                class66.method465(var22, 0, -var34 + var19, var30);
                            }
                        } else {
                            for (int var36 = 0; var36 < var16; ++var36) {
                                var22[class214.method1427(class162.field2924, arg5 - -var36)] = var22[class214.method1427(arg5 - 1 + arg6 + -var36, class162.field2924)] = var8 * var36 / var16;
                            }
                            if (var17 + var19 <= class13.field253) {
                                class66.method465(var22, var17, var19, var8);
                            } else {
                                int var37 = -var17 + class13.field253;
                                class66.method465(var22, var17, var37, var8);
                                class66.method465(var22, 0, -var37 + var19, var8);
                            }
                        }
                    }
                }
            }
        }
    }
}

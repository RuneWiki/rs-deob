import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class150 extends class115 {

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    private int field2601 = 1024;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    private int field2600 = 1024;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    private int field2610 = 819;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    private int field2607 = 2048;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    private int field2609 = 1024;

    @OriginalMember(owner = "client!jd", name = "rb", descriptor = "I")
    private int field2622 = 0;

    @OriginalMember(owner = "client!jd", name = "ob", descriptor = "I")
    private int field2619 = 0;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    private int field2616 = 1024;

    @OriginalMember(owner = "client!jd", name = "ub", descriptor = "I")
    private int field2625 = 409;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lqe;")
    public static class168 field2604 = class66.method448("(U0a )2 in: ", 108);

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "S")
    public static short field2596 = 256;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "Lqe;")
    private static class168 field2611 = class66.method448("Loading textures )2 ", -113);

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "Lqe;")
    public static class168 field2595 = field2611;

    @OriginalMember(owner = "client!jd", name = "vb", descriptor = "[J")
    public static long[] field2626 = new long[100];

    @OriginalMember(owner = "client!jd", name = "sb", descriptor = "Lqe;")
    public static class168 field2623 = class66.method448("titlebg", -127);

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "Lqe;")
    public static class168 field2617 = class66.method448("null", 33);

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!jd", name = "pb", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!jd", name = "qb", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!jd", name = "tb", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "Loe;")
    public static class256 field2608;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "Loe;")
    public static class256 field2615;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "[[[I")
    public static int[][][] field2603;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static void method999(byte arg0) {
        field2626 = null;
        if (arg0 >= -34) {
            method1001(2, (Component) null);
        }
        field2611 = null;
        field2608 = null;
        field2615 = null;
        field2595 = null;
        field2603 = null;
        field2617 = null;
        field2604 = null;
        field2623 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field2621;
        if (arg0 == 107) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (arg2 != 6) {
                                        if (~arg2 != -8) {
                                            if (~arg2 == -9) {
                                                this.field2609 = arg1.method731(false);
                                            }
                                        } else {
                                            this.field2616 = arg1.method731(false);
                                        }
                                    } else {
                                        this.field2619 = arg1.method758(true);
                                    }
                                } else {
                                    this.field2600 = arg1.method731(false);
                                }
                            } else {
                                this.field2610 = arg1.method731(false);
                            }
                        } else {
                            this.field2625 = arg1.method731(false);
                        }
                    } else {
                        this.field2607 = arg1.method731(false);
                    }
                } else {
                    this.field2601 = arg1.method731(false);
                }
            } else {
                this.field2622 = arg1.method758(true);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIILjava/util/Random;I[[II)V")
    private final void method1000(byte arg0, int arg1, int arg2, Random arg3, int arg4, int[][] arg5, int arg6) {
        ++field2605;
        if (arg0 == 93) {
            int var8 = ~this.field2609 >= -1 ? 4096 : -class163.method1056(arg3, this.field2609, 108) + 4096;
            int var9 = this.field2616 * this.field2602 >> 12;
            int var10 = this.field2602 + -(var9 <= 0 ? 0 : class163.method1056(arg3, var9, 102));
            if (arg2 >= class130.field2297) {
                arg2 -= class130.field2297;
            }
            if (var10 <= 0) {
                if (~(arg1 + arg2) >= ~class130.field2297) {
                    for (int var11 = 0; ~arg6 < ~var11; ++var11) {
                        class22.method115(arg5[arg4 + var11], arg2, arg1, var8);
                    }
                } else {
                    int var12 = -arg2 + class130.field2297;
                    for (int var13 = 0; ~var13 > ~arg6; ++var13) {
                        int[] var14 = arg5[arg4 - -var13];
                        class22.method115(var14, arg2, var12, var8);
                        class22.method115(var14, 0, -var12 + arg1, var8);
                    }
                }
            } else if (~arg6 < -1 && arg1 > 0) {
                int var15 = arg1 / 2;
                int var16 = arg6 / 2;
                int var17 = var10 <= var16 ? var10 : var16;
                int var18 = var15 < var10 ? var15 : var10;
                int var19 = arg2 + var18;
                int var20 = arg1 - var18 * 2;
                for (int var21 = 0; ~var21 > ~arg6; ++var21) {
                    int[] var22 = arg5[arg4 + var21];
                    if (~var21 > ~var17) {
                        int var23 = var8 * var21 / var17;
                        if (~this.field2619 != -1) {
                            for (int var24 = 0; ~var18 < ~var24; ++var24) {
                                int var25 = var8 * var24 / var18;
                                var22[class86.method571(arg2 - -var24, class134.field2350)] = var22[class86.method571(-var24 + arg2 - (-arg1 - -1), class134.field2350)] = ~var25 <= ~var23 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; var18 > var26; ++var26) {
                                int var28 = var8 * var26 / var18;
                                var22[class86.method571(arg2 + var26, class134.field2350)] = var22[class86.method571(arg1 - var26 + arg2 + -1, class134.field2350)] = var23 * var28 >> 12;
                            }
                        }
                        if (var19 + var20 > class130.field2297) {
                            int var27 = class130.field2297 - var19;
                            class22.method115(var22, var19, var27, var23);
                            class22.method115(var22, 0, -var27 + var20, var23);
                        } else {
                            class22.method115(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = -var21 + -1 + arg6;
                        if (~var17 < ~var29) {
                            int var30 = var8 * var29 / var17;
                            if (this.field2619 != 0) {
                                for (int var31 = 0; var31 < var18; ++var31) {
                                    int var32 = var8 * var31 / var18;
                                    var22[class86.method571(class134.field2350, arg2 - -var31)] = var22[class86.method571(class134.field2350, -var31 + arg1 + arg2 + -1)] = var30 <= var32 ? var30 : var32;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var18; ++var33) {
                                    int var35 = var8 * var33 / var18;
                                    var22[class86.method571(class134.field2350, arg2 + var33)] = var22[class86.method571(class134.field2350, -var33 + -1 + arg1 + arg2)] = var30 * var35 >> 12;
                                }
                            }
                            if (~(var19 - -var20) >= ~class130.field2297) {
                                class22.method115(var22, var19, var20, var30);
                            } else {
                                int var34 = -var19 + class130.field2297;
                                class22.method115(var22, var19, var34, var30);
                                class22.method115(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var18 > var36; ++var36) {
                                var22[class86.method571(arg2 + var36, class134.field2350)] = var22[class86.method571(class134.field2350, arg1 + -1 + arg2 + -var36)] = var8 * var36 / var18;
                            }
                            if (var19 + var20 > class130.field2297) {
                                int var37 = -var19 + class130.field2297;
                                class22.method115(var22, var19, var37, var8);
                                class22.method115(var22, 0, -var37 + var20, var8);
                            } else {
                                class22.method115(var22, var19, var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field2613;
        int[] var3 = super.field1872.method182((byte) -124, arg0);
        if (super.field1872.field341) {
            int[][] var4 = super.field1872.method181((byte) 88);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = class130.field2297 * this.field2607 >> 12;
            int var14 = class130.field2297 * this.field2601 >> 12;
            int var15 = 0;
            int var16 = class62.field855 * this.field2625 >> 12;
            int var17 = class62.field855 * this.field2610 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2602 = class130.field2297 / 8 * this.field2600 >> 12;
                int var18 = class130.field2297 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2622);
                while (true) {
                    while (true) {
                        int var22 = class163.method1056(var21, var13 - var14, 96) + var14;
                        int var23 = class163.method1056(var21, -var16 + var17, 116) + var16;
                        int var24 = var8 + var22;
                        if (~class130.field2297 > ~var24) {
                            var24 = class130.field2297;
                            var22 = class130.field2297 - var8;
                        }
                        int var28;
                        if (var12) {
                            var28 = 0;
                        } else {
                            int var25 = var9;
                            int var26 = 0;
                            int[] var27 = var20[var9];
                            var28 = var27[2];
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class130.field2297;
                            }
                            if (class130.field2297 < var29) {
                                var29 -= class130.field2297;
                            }
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var30[0] >= ~var29 && var29 <= var30[1]) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class130.field2297;
                                        }
                                        if (class130.field2297 < var31) {
                                            var31 -= class130.field2297;
                                        }
                                        for (int var32 = 1; ~var26 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var11];
                                            var28 = Math.max(var28, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var26; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var28 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (var29 <= var31) {
                                                    if (~var37 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var36);
                                                    } else {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class130.field2297;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var29, var36);
                                                }
                                                this.method1000((byte) 93, var39 - var38, var38 - -var7, var21, var35, var4, -var35 + var28);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                                ++var26;
                            }
                        }
                        if (class62.field855 < var23 + var28) {
                            var23 = class62.field855 - var28;
                        } else {
                            var10 = false;
                        }
                        if (class130.field2297 != var24) {
                            int[] var41 = var19[var15++];
                            var41[0] = var8;
                            var41[2] = var23 + var28;
                            var41[1] = var24;
                            this.method1000((byte) 93, var22, var6 + var8, var21, var28, var4, var23);
                            var8 = var24;
                        } else {
                            this.method1000((byte) 93, var22, var6 + var8, var21, var28, var4, var23);
                            if (var10) {
                                return arg1 < 37 ? null : var3;
                            }
                            var10 = true;
                            var7 = var6;
                            var9 = 0;
                            var12 = false;
                            int[] var42 = var19[var15++];
                            var42[0] = var8;
                            var42[1] = var24;
                            var8 = 0;
                            var11 = var15;
                            var15 = 0;
                            var42[2] = var28 - -var23;
                            var6 = class163.method1056(var21, class130.field2297, 127);
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class130.field2297 + var5;
                            }
                            if (~var43 < ~class130.field2297) {
                                var43 -= class130.field2297;
                            }
                            int[][] var44 = var20;
                            var20 = var19;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var43 <= ~var45[0] && ~var45[1] <= ~var43) {
                                    var19 = var44;
                                    break;
                                }
                                ++var9;
                                if (var9 >= var11) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg1 < 37 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field2599;
        if (arg0 != 395462996) {
            field2615 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1001(int arg0, Component arg1) {
        ++field2598;
        arg1.removeKeyListener(class165.field2816);
        int var2 = 58 % ((arg0 - 8) / 57);
        arg1.removeFocusListener(class165.field2816);
        class104.field1678 = -1;
    }
}

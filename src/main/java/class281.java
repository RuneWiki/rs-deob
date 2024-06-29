import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class281 extends class82 {

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    private int field3685 = 2048;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    private int field3686 = 1024;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    private int field3684 = 0;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    private int field3695 = 819;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    private int field3693 = 1024;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    private int field3688 = 1024;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    private int field3690 = 1024;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    private int field3701 = 409;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    private int field3699 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3691 = -1;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "[F")
    public static float[] field3682 = new float[16];

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "[I")
    public static int[] field3698 = new int[256];

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lak;")
    public static class292 field3700;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    public static final void method1595(int arg0) {
        ++field3692;
        if (class449.field6225) {
            if (arg0 == 25098) {
                class509 var1 = class369.method2071(class588.field8538, class592.field8606, -20190);
                if (var1 != null && var1.field7134 != null) {
                    class503 var2 = new class503();
                    var2.field6973 = var1;
                    var2.field6975 = var1.field7134;
                    class630.method3608(var2);
                }
                class71.field684 = -1;
                class110.field1361 = -1;
                class449.field6225 = false;
                if (var1 != null) {
                    class87.method508(124, var1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V")
    public static void method1596(int arg0) {
        field3682 = null;
        field3700 = null;
        field3698 = null;
        if (arg0 != -25194) {
            field3691 = -109;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field3687;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field3693 = arg2.method2136(false);
                                        }
                                    } else {
                                        this.field3690 = arg2.method2136(false);
                                    }
                                } else {
                                    this.field3684 = arg2.method2129(-68);
                                }
                            } else {
                                this.field3688 = arg2.method2136(false);
                            }
                        } else {
                            this.field3695 = arg2.method2136(false);
                        }
                    } else {
                        this.field3701 = arg2.method2136(false);
                    }
                } else {
                    this.field3685 = arg2.method2136(false);
                }
            } else {
                this.field3686 = arg2.method2136(false);
            }
        } else {
            this.field3699 = arg2.method2129(-128);
        }
        int var5 = -93 / ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/util/Random;[[IIIII)V")
    private final void method1597(int arg0, Random arg1, int[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3697;
        int var8 = ~this.field3693 >= -1 ? 4096 : -class242.method1375(this.field3693, false, arg1) + 4096;
        int var9 = this.field3694 * this.field3690 >> 12;
        int var10 = this.field3694 + -(var9 <= 0 ? 0 : class242.method1375(var9, false, arg1));
        if (arg4 >= class629.field9033) {
            arg4 -= class629.field9033;
        }
        if (arg5 != 2) {
            this.method198(16, -51, (class374) null);
        }
        if (var10 <= 0) {
            if (arg4 + arg6 <= class629.field9033) {
                for (int var11 = 0; ~arg0 < ~var11; ++var11) {
                    class345.method1928(arg2[arg3 + var11], arg4, arg6, var8);
                }
            } else {
                int var12 = class629.field9033 - arg4;
                for (int var13 = 0; arg0 > var13; ++var13) {
                    int[] var14 = arg2[arg3 + var13];
                    class345.method1928(var14, arg4, var12, var8);
                    class345.method1928(var14, 0, -var12 + arg6, var8);
                }
            }
        } else if (~arg0 < -1 && ~arg6 < -1) {
            int var15 = arg6 / 2;
            int var16 = arg0 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg4 + var17;
            int var20 = -(var17 * 2) + arg6;
            for (int var21 = 0; ~var21 > ~arg0; ++var21) {
                int[] var22 = arg2[var21 - -arg3];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field3684 != -1) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class288.method1624(class129.field1590, arg4 - -var24)] = var22[class288.method1624(class129.field1590, arg4 - -arg6 - var24 - 1)] = var23 > var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class288.method1624(arg4 + var26, class129.field1590)] = var22[class288.method1624(arg6 + -1 + arg4 - var26, class129.field1590)] = var23 * var28 >> 12;
                        }
                    }
                    if (var19 + var20 > class629.field9033) {
                        int var27 = -var19 + class629.field9033;
                        class345.method1928(var22, var19, var27, var23);
                        class345.method1928(var22, 0, -var27 + var20, var23);
                    } else {
                        class345.method1928(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg0 - (var21 - -1);
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field3684 == -1) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class288.method1624(class129.field1590, arg4 + var31)] = var22[class288.method1624(-var31 + arg6 + -1 + arg4, class129.field1590)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class288.method1624(arg4 + var33, class129.field1590)] = var22[class288.method1624(arg4 - -arg6 + -var33 + -1, class129.field1590)] = var30 > var35 ? var35 : var30;
                            }
                        }
                        if (var19 + var20 <= class629.field9033) {
                            class345.method1928(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class629.field9033;
                            class345.method1928(var22, var19, var34, var30);
                            class345.method1928(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class288.method1624(arg4 + var36, class129.field1590)] = var22[class288.method1624(arg6 - 1 + -var36 + arg4, class129.field1590)] = var8 * var36 / var17;
                        }
                        if (~class629.field9033 > ~(var19 + var20)) {
                            int var37 = class629.field9033 - var19;
                            class345.method1928(var22, var19, var37, var8);
                            class345.method1928(var22, 0, var20 - var37, var8);
                        } else {
                            class345.method1928(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        ++field3683;
        if (arg0 != -2) {
            method1595(-58);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field3696;
        if (arg1 != 12218) {
            method1595(-89);
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[][] var4 = super.field990.method1568(false);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class629.field9033 * this.field3686 >> 12;
            int var15 = class629.field9033 * this.field3685 >> 12;
            int var16 = class347.field4469 * this.field3701 >> 12;
            int var17 = class347.field4469 * this.field3695 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field3694 = class629.field9033 / 8 * this.field3688 >> 12;
                int var18 = class629.field9033 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3699);
                while (true) {
                    while (true) {
                        int var22 = class242.method1375(-var14 + var15, false, var21) + var14;
                        int var23 = class242.method1375(-var16 + var17, false, var21) + var16;
                        int var24 = var8 + var22;
                        if (~class629.field9033 > ~var24) {
                            var22 = -var8 + class629.field9033;
                            var24 = class629.field9033;
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
                                var29 += class629.field9033;
                            }
                            if (class629.field9033 < var29) {
                                var29 -= class629.field9033;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && var29 <= var30[1]) {
                                    if (var9 != var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class629.field9033;
                                        }
                                        if (~class629.field9033 > ~var31) {
                                            var31 -= class629.field9033;
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
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class629.field9033;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1597(var25 - var35, var21, var4, var35, var7 + var38, 2, -var38 + var39);
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
                        if (~class347.field4469 > ~(var23 + var25)) {
                            var23 = class347.field4469 - var25;
                        } else {
                            var10 = false;
                        }
                        if (class629.field9033 == var24) {
                            this.method1597(var23, var21, var4, var25, var6 + var8, 2, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class242.method1375(class629.field9033, false, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class629.field9033 + var5;
                            }
                            if (~class629.field9033 > ~var43) {
                                var43 -= class629.field9033;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && ~var44[1] <= ~var43) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var25 - -var23;
                            var45[0] = var8;
                            var45[1] = var24;
                            this.method1597(var23, var21, var4, var25, var6 + var8, 2, var22);
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

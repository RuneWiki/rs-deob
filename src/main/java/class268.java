import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class268 extends class170 {

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    private int field4743 = 0;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
    private int field4746 = 0;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    private int field4738 = 1024;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field4732 = 1024;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    private int field4729 = 1024;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
    private int field4744 = 409;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    private int field4730 = 1024;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    private int field4735 = 2048;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
    private int field4742 = 819;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lbf;")
    public static class199 field4734 = new class199(64);

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lqk;")
    public static class207 field4745 = class24.method212(255, "<col=00ffff>");

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "Lqk;")
    public static class207 field4748 = class24.method212(255, "Prendre");

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "Z")
    public static boolean field4750 = false;

    @OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
    public static int field4751 = 0;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    private int field4741;

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
    public static void method1831(int arg0) {
        field4748 = null;
        field4734 = null;
        field4745 = null;
        if (arg0 != 2) {
            field4734 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[IIIIILjava/util/Random;B)V")
    private final void method1832(int[][] arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, byte arg6) {
        ++field4736;
        int var8 = ~this.field4738 < -1 ? 4096 - class93.method667(this.field4738, 15901, arg5) : 4096;
        int var9 = -22 / ((3 - arg6) / 45);
        int var10 = this.field4741 * this.field4729 >> 12;
        int var11 = this.field4741 + -(var10 <= 0 ? 0 : class93.method667(var10, 15901, arg5));
        if (~class88.field1595 >= ~arg1) {
            arg1 -= class88.field1595;
        }
        if (~var11 < -1) {
            if (~arg2 < -1 && arg3 > 0) {
                int var12 = arg3 / 2;
                int var13 = arg2 / 2;
                int var14 = ~var11 < ~var12 ? var12 : var11;
                int var15 = ~var11 < ~var13 ? var13 : var11;
                int var16 = arg1 + var14;
                int var17 = -(var14 * 2) + arg3;
                for (int var18 = 0; arg2 > var18; ++var18) {
                    int[] var19 = arg0[arg4 + var18];
                    if (~var18 > ~var15) {
                        int var20 = var8 * var18 / var15;
                        if (~this.field4746 != -1) {
                            for (int var21 = 0; ~var21 > ~var14; ++var21) {
                                int var22 = var8 * var21 / var14;
                                var19[class121.method860(arg1 + var21, class94.field1684)] = var19[class121.method860(class94.field1684, arg1 + arg3 - var21 + -1)] = ~var20 >= ~var22 ? var20 : var22;
                            }
                        } else {
                            for (int var23 = 0; ~var23 > ~var14; ++var23) {
                                int var25 = var8 * var23 / var14;
                                var19[class121.method860(arg1 + var23, class94.field1684)] = var19[class121.method860(arg3 + -1 + arg1 + -var23, class94.field1684)] = var20 * var25 >> 12;
                            }
                        }
                        if (class88.field1595 >= var16 - -var17) {
                            class274.method1862(var19, var16, var17, var20);
                        } else {
                            int var24 = -var16 + class88.field1595;
                            class274.method1862(var19, var16, var24, var20);
                            class274.method1862(var19, 0, -var24 + var17, var20);
                        }
                    } else {
                        int var26 = arg2 - var18 - 1;
                        if (var26 < var15) {
                            int var27 = var8 * var26 / var15;
                            if (~this.field4746 != -1) {
                                for (int var28 = 0; var28 < var14; ++var28) {
                                    int var29 = var8 * var28 / var14;
                                    var19[class121.method860(arg1 + var28, class94.field1684)] = var19[class121.method860(class94.field1684, arg1 - (-arg3 + var28) + -1)] = ~var29 <= ~var27 ? var27 : var29;
                                }
                            } else {
                                for (int var30 = 0; var14 > var30; ++var30) {
                                    int var32 = var8 * var30 / var14;
                                    var19[class121.method860(arg1 + var30, class94.field1684)] = var19[class121.method860(-var30 + arg3 + arg1 + -1, class94.field1684)] = var27 * var32 >> 12;
                                }
                            }
                            if (var16 + var17 > class88.field1595) {
                                int var31 = -var16 + class88.field1595;
                                class274.method1862(var19, var16, var31, var27);
                                class274.method1862(var19, 0, -var31 + var17, var27);
                            } else {
                                class274.method1862(var19, var16, var17, var27);
                            }
                        } else {
                            for (int var33 = 0; ~var14 < ~var33; ++var33) {
                                var19[class121.method860(arg1 + var33, class94.field1684)] = var19[class121.method860(-var33 + -1 + arg1 - -arg3, class94.field1684)] = var8 * var33 / var14;
                            }
                            if (~(var16 + var17) >= ~class88.field1595) {
                                class274.method1862(var19, var16, var17, var8);
                            } else {
                                int var34 = -var16 + class88.field1595;
                                class274.method1862(var19, var16, var34, var8);
                                class274.method1862(var19, 0, -var34 + var17, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class88.field1595 <= ~(arg1 + arg3)) {
            for (int var35 = 0; ~arg2 < ~var35; ++var35) {
                class274.method1862(arg0[arg4 + var35], arg1, arg3, var8);
            }
        } else {
            int var36 = -arg1 + class88.field1595;
            for (int var37 = 0; ~arg2 < ~var37; ++var37) {
                int[] var38 = arg0[arg4 + var37];
                class274.method1862(var38, arg1, var36, var8);
                class274.method1862(var38, 0, -var36 + arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 < 14) {
            method1833(-99, 71, 126);
        }
        ++field4731;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class268() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)V")
    public static final void method1833(int arg0, int arg1, int arg2) {
        ++field4733;
        for (int var3 = 0; ~class135.field2333 < ~var3; ++var3) {
            class240 var5 = class26.method216(4, var3);
            if (var5 != null) {
                int var6 = var5.field4387;
                if (var6 >= 0 && !class257.field4602.method346(var6, 0)) {
                    var6 = -1;
                }
                int var10;
                if (~var5.field4388 <= -1) {
                    int var7 = var5.field4388;
                    int var8 = (var7 & 127) + arg0;
                    if (~var8 <= -1) {
                        if (~var8 < -128) {
                            var8 = 127;
                        }
                    } else {
                        var8 = 0;
                    }
                    int var9 = (arg1 + var7 & 64512) + (var7 & 896) + var8;
                    var10 = class257.field4600[class197.method1371(96, var9, (byte) -84)];
                } else if (~var6 <= -1) {
                    var10 = class257.field4600[class197.method1371(96, class257.field4602.method342(var6, 65535), (byte) -53)];
                } else if (var5.field4385 != -1) {
                    int var11 = var5.field4385;
                    int var12 = (127 & var11) + arg0;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (~var12 < -128) {
                        var12 = 127;
                    }
                    int var13 = (var11 - -arg1 & 64512) + ((var11 & 896) - -var12);
                    var10 = class257.field4600[class197.method1371(96, var13, (byte) -91)];
                } else {
                    var10 = -1;
                }
                class281.field4945[var3 + 1] = var10;
            }
        }
        int var4 = -125 / ((arg2 - 14) / 62);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            method1834(115, false);
        }
        ++field4739;
        int[] var3 = super.field3001.method1538(119, arg1);
        if (super.field3001.field3835) {
            int[][] var4 = super.field3001.method1540((byte) 4);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class88.field1595 * this.field4730 >> 12;
            int var15 = class88.field1595 * this.field4735 >> 12;
            int var16 = class30.field620 * this.field4744 >> 12;
            int var17 = class30.field620 * this.field4742 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                int var18 = 1 - -(class88.field1595 / var14);
                this.field4741 = class88.field1595 / 8 * this.field4732 >> 12;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4743);
                while (true) {
                    while (true) {
                        int var22 = class93.method667(-var14 + var15, 15901, var21) + var14;
                        int var23 = var8 - -var22;
                        int var24 = class93.method667(var17 - var16, 15901, var21) + var16;
                        if (class88.field1595 < var23) {
                            var23 = class88.field1595;
                            var22 = class88.field1595 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int[] var26 = var20[var10];
                            var25 = var26[2];
                            int var27 = var10;
                            int var28 = 0;
                            int var29 = var5 + var23;
                            if (var29 < 0) {
                                var29 += class88.field1595;
                            }
                            if (~class88.field1595 > ~var29) {
                                var29 -= class88.field1595;
                            }
                            while (true) {
                                int[] var30 = var20[var27];
                                if (~var30[0] >= ~var29 && ~var30[1] <= ~var29) {
                                    if (var10 != var27) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class88.field1595;
                                        }
                                        if (~var31 < ~class88.field1595) {
                                            var31 -= class88.field1595;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var10 + var32) % var13];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var10 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class88.field1595;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1832(var4, var6 + var38, var25 - var35, var39 - var38, var35, var21, (byte) 92);
                                            }
                                        }
                                    }
                                    var10 = var27;
                                    break;
                                }
                                ++var28;
                                ++var27;
                                if (~var27 <= ~var13) {
                                    var27 = 0;
                                }
                            }
                        }
                        if (var24 + var25 > class30.field620) {
                            var24 = -var25 + class30.field620;
                        } else {
                            var9 = false;
                        }
                        if (class88.field1595 == var23) {
                            this.method1832(var4, var7 + var8, var24, var22, var25, var21, (byte) -107);
                            if (var9) {
                                return var3;
                            }
                            var6 = var7;
                            int[] var41 = var19[var12++];
                            var41[0] = var8;
                            var8 = 0;
                            var9 = true;
                            int[][] var42 = var20;
                            var10 = 0;
                            var41[1] = var23;
                            var20 = var19;
                            var19 = var42;
                            var11 = false;
                            var13 = var12;
                            var41[2] = var24 + var25;
                            var7 = class93.method667(class88.field1595, 15901, var21);
                            var5 = var7 - var6;
                            var12 = 0;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class88.field1595 + var5;
                            }
                            if (~class88.field1595 > ~var43) {
                                var43 -= class88.field1595;
                            }
                            while (true) {
                                int[] var44 = var20[var10];
                                if (~var44[0] >= ~var43 && ~var43 >= ~var44[1]) {
                                    break;
                                }
                                ++var10;
                                if (var10 >= var13) {
                                    var10 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var12++];
                            var45[1] = var23;
                            var45[2] = var24 + var25;
                            var45[0] = var8;
                            this.method1832(var4, var7 + var8, var24, var22, var25, var21, (byte) 97);
                            var8 = var23;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            this.method31((byte) 114, 44);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field4738 = arg0.method1050(1272006568);
                                        }
                                    } else {
                                        this.field4729 = arg0.method1050(1272006568);
                                    }
                                } else {
                                    this.field4746 = arg0.method1045((byte) 85);
                                }
                            } else {
                                this.field4732 = arg0.method1050(1272006568);
                            }
                        } else {
                            this.field4742 = arg0.method1050(1272006568);
                        }
                    } else {
                        this.field4744 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field4735 = arg0.method1050(1272006568);
                }
            } else {
                this.field4730 = arg0.method1050(1272006568);
            }
        } else {
            this.field4743 = arg0.method1045((byte) 99);
        }
        ++field4737;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IZ)V")
    public static final void method1834(int arg0, boolean arg1) {
        ++field4740;
        class189.field3334.method1383(-8052, arg0);
        class133.field2315.method1383(-8052, arg0);
        class165.field2917.method1383(-8052, arg0);
        if (arg1) {
            field4734 = null;
        }
    }
}

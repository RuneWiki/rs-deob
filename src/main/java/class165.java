import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class165 extends class82 {

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field2825 = 1024;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field2824 = 1024;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    private int field2836 = 819;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field2828 = 1024;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    private int field2839 = 409;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    private int field2837 = 2048;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    private int field2831 = 0;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    private int field2843 = 0;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    private int field2846 = 1024;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "Ldj;")
    public static class44 field2829 = class89.method650(255, "::errortest");

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Ldj;")
    private static class44 field2826 = class89.method650(255, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Ldj;")
    public static class44 field2830 = field2826;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Ldj;")
    private static class44 field2834 = class89.method650(255, "Loaded fonts");

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Ldj;")
    public static class44 field2827 = field2834;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Ldj;")
    public static class44 field2840 = class89.method650(255, "Okay");

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    private int field2838;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "[[[B")
    public static byte[][][] field2845;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2832;
        if (arg0 != 25238) {
            method1054(-52);
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int[][] var4 = super.field1595.method604(arg0 ^ 25238);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            boolean var8 = true;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = client.field609 * this.field2839 >> 12;
            int var14 = 0;
            int var15 = class129.field2287 * this.field2825 >> 12;
            int var16 = class129.field2287 * this.field2837 >> 12;
            int var17 = client.field609 * this.field2836 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field2838 = class129.field2287 / 8 * this.field2846 >> 12;
                int var18 = class129.field2287 / var15 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2831);
                while (true) {
                    while (true) {
                        int var22 = var15 - -class151.method979(-1, -var15 + var16, var21);
                        int var23 = class151.method979(-1, var17 - var13, var21) + var13;
                        int var24 = var14 + var22;
                        if (class129.field2287 < var24) {
                            var22 = class129.field2287 - var14;
                            var24 = class129.field2287;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            var25 = var26[2];
                            int var28 = var24 - -var5;
                            int var29 = var9;
                            if (~var28 > -1) {
                                var28 += class129.field2287;
                            }
                            if (~var28 < ~class129.field2287) {
                                var28 -= class129.field2287;
                            }
                            while (true) {
                                int[] var30 = var20[var29];
                                if (~var30[0] >= ~var28 && var28 <= var30[1]) {
                                    if (~var9 != ~var29) {
                                        int var31 = var5 + var14;
                                        if (~var31 > -1) {
                                            var31 += class129.field2287;
                                        }
                                        if (var31 > class129.field2287) {
                                            var31 -= class129.field2287;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var10];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var10];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var28) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class129.field2287;
                                                    } else {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1056(var21, -var35 + var25, var4, var7 + var38, 1, -var38 + var39, var35);
                                            }
                                        }
                                    }
                                    var9 = var29;
                                    break;
                                }
                                ++var29;
                                if (var29 >= var10) {
                                    var29 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var25 <= client.field609) {
                            var8 = false;
                        } else {
                            var23 = client.field609 - var25;
                        }
                        if (~class129.field2287 != ~var24) {
                            int[] var41 = var19[var12++];
                            var41[2] = var25 - -var23;
                            var41[0] = var14;
                            var41[1] = var24;
                            this.method1056(var21, var23, var4, var6 + var14, 1, var22, var25);
                            var14 = var24;
                        } else {
                            this.method1056(var21, var23, var4, var14 - -var6, 1, var22, var25);
                            if (var8) {
                                return var3;
                            }
                            var8 = true;
                            var9 = 0;
                            var11 = false;
                            var7 = var6;
                            int[] var42 = var19[var12++];
                            var42[1] = var24;
                            var42[0] = var14;
                            int[][] var43 = var20;
                            var10 = var12;
                            var20 = var19;
                            var42[2] = var23 + var25;
                            var19 = var43;
                            var12 = 0;
                            var14 = 0;
                            var6 = class151.method979(arg0 + -25239, class129.field2287, var21);
                            var5 = var6 - var7;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class129.field2287 + var5;
                            }
                            if (~var44 < ~class129.field2287) {
                                var44 -= class129.field2287;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                ++var9;
                                if (var10 <= var9) {
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

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field2826 = null;
        field2830 = null;
        field2827 = null;
        if (arg0 == 0) {
            field2829 = null;
            field2845 = null;
            field2834 = null;
            field2840 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 <= 95) {
            method1057(-76, 104);
        }
        ++field2842;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2824 = arg0.method500(61);
                                        }
                                    } else {
                                        this.field2828 = arg0.method500(arg2 + -24);
                                    }
                                } else {
                                    this.field2843 = arg0.method506(255);
                                }
                            } else {
                                this.field2846 = arg0.method500(57);
                            }
                        } else {
                            this.field2836 = arg0.method500(72);
                        }
                    } else {
                        this.field2839 = arg0.method500(51);
                    }
                } else {
                    this.field2837 = arg0.method500(arg2 ^ 39);
                }
            } else {
                this.field2825 = arg0.method500(arg2 + -6);
            }
        } else {
            this.field2831 = arg0.method506(255);
        }
        if (arg2 == 68) {
            ++field2841;
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    public static final void method1055(int arg0) {
        ++field2844;
        class119.field2125.method1229(arg0 ^ 3);
        class134.field2399 = null;
        class101.field1851 = 1;
        if (arg0 != 2) {
            field2830 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/util/Random;I[[IIIII)V")
    private final void method1056(Random arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2833;
        int var8 = ~this.field2824 < -1 ? -class151.method979(-1, this.field2824, arg0) + 4096 : 4096;
        int var9 = this.field2838 * this.field2828 >> 12;
        int var10 = this.field2838 + -(var9 <= 0 ? 0 : class151.method979(-1, var9, arg0));
        if (arg4 != 1) {
            this.method2((class66) null, -30, (byte) -19);
        }
        if (~arg3 <= ~class129.field2287) {
            arg3 -= class129.field2287;
        }
        if (var10 > 0) {
            if (arg1 > 0 && ~arg5 < -1) {
                int var11 = arg1 / 2;
                int var12 = ~var11 > ~var10 ? var11 : var10;
                int var13 = arg5 / 2;
                int var14 = ~var10 < ~var13 ? var13 : var10;
                int var15 = arg3 + var14;
                int var16 = arg5 - var14 * 2;
                for (int var17 = 0; ~arg1 < ~var17; ++var17) {
                    int[] var18 = arg2[var17 - -arg6];
                    if (~var12 < ~var17) {
                        int var19 = var8 * var17 / var12;
                        if (~this.field2843 == -1) {
                            for (int var20 = 0; var14 > var20; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class29.method202(arg3 - -var20, class53.field943)] = var18[class29.method202(class53.field943, arg3 - -arg5 + (-var20 - 1))] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var14; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class29.method202(arg3 + var22, class53.field943)] = var18[class29.method202(class53.field943, arg3 - (-arg5 - -1) + -var22)] = var24 >= var19 ? var19 : var24;
                            }
                        }
                        if (~(var15 + var16) >= ~class129.field2287) {
                            class18.method147(var18, var15, var16, var19);
                        } else {
                            int var23 = class129.field2287 - var15;
                            class18.method147(var18, var15, var23, var19);
                            class18.method147(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg1 - var17 + -1;
                        if (~var25 > ~var12) {
                            int var26 = var8 * var25 / var12;
                            if (this.field2843 != 0) {
                                for (int var27 = 0; ~var27 > ~var14; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class29.method202(arg3 - -var27, class53.field943)] = var18[class29.method202(class53.field943, arg3 - -arg5 + -var27 + -1)] = var26 <= var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var14; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class29.method202(arg3 + var29, class53.field943)] = var18[class29.method202(class53.field943, arg3 - -arg5 + -1 + -var29)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class129.field2287 > ~(var15 - -var16)) {
                                int var30 = -var15 + class129.field2287;
                                class18.method147(var18, var15, var30, var26);
                                class18.method147(var18, 0, var16 - var30, var26);
                            } else {
                                class18.method147(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var14; ++var32) {
                                var18[class29.method202(arg3 - -var32, class53.field943)] = var18[class29.method202(class53.field943, -var32 + arg5 + arg3 + -1)] = var8 * var32 / var14;
                            }
                            if (~(var15 + var16) >= ~class129.field2287) {
                                class18.method147(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class129.field2287;
                                class18.method147(var18, var15, var33, var8);
                                class18.method147(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg3 + arg5 <= class129.field2287) {
            for (int var34 = 0; ~arg1 < ~var34; ++var34) {
                class18.method147(arg2[arg6 - -var34], arg3, arg5, var8);
            }
        } else {
            int var35 = class129.field2287 - arg3;
            for (int var36 = 0; arg1 > var36; ++var36) {
                int[] var37 = arg2[arg6 + var36];
                class18.method147(var37, arg3, var35, var8);
                class18.method147(var37, 0, -var35 + arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
    public static final void method1057(int arg0, int arg1) {
        ++field2835;
        if (~arg0 != 0) {
            if (class122.method835(arg0, 31)) {
                class223[] var2 = class4.field52[arg0];
                if (arg1 != 10225) {
                    field2840 = null;
                }
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    class223 var4 = var2[var3];
                    if (var4.field4064 != null) {
                        class140 var5 = new class140();
                        var5.field2506 = var4.field4064;
                        var5.field2507 = var4;
                        class5.method32(2000000, 16, var5);
                    }
                }
            }
        }
    }
}

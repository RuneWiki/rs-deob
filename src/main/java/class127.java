import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class127 extends class189 {

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    private int field2795 = 2000;

    @OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
    private int field2799 = 0;

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "I")
    private int field2803 = 16;

    @OriginalMember(owner = "client!oa", name = "Db", descriptor = "I")
    private int field2813 = 4096;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "Lgg;")
    public static class63 field2790 = class116.method911(43, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "Z")
    public static volatile boolean field2796 = true;

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "Lgg;")
    public static class63 field2798 = class116.method911(43, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!oa", name = "rb", descriptor = "Lgg;")
    public static class63 field2801 = class116.method911(43, "Weiter");

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "Lgg;")
    public static class63 field2797 = class116.method911(43, "cross");

    @OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lgg;")
    private static class63 field2806 = class116.method911(43, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!oa", name = "vb", descriptor = "Lgg;")
    public static class63 field2805 = class116.method911(43, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!oa", name = "Bb", descriptor = "Lgg;")
    public static class63 field2811 = class116.method911(43, "(Z");

    @OriginalMember(owner = "client!oa", name = "zb", descriptor = "Lgg;")
    public static class63 field2809 = field2806;

    @OriginalMember(owner = "client!oa", name = "Ab", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!oa", name = "qb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!oa", name = "ub", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!oa", name = "Cb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "[I")
    public static int[] field2802;

    @OriginalMember(owner = "client!oa", name = "yb", descriptor = "[[[B")
    public static byte[][][] field2808;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqh;IIIIIII)V")
    public static final void method951(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class138.field2971;
        int var10;
        int var11 = var10 = (arg7 << 7) - class14.field344;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class97.field2310[arg1][arg6][arg7] - class103.field2373;
        int var17 = class97.field2310[arg1][arg6 + 1][arg7] - class103.field2373;
        int var18 = class97.field2310[arg1][arg6 + 1][arg7 + 1] - class103.field2373;
        int var19 = class97.field2310[arg1][arg6][arg7 + 1] - class103.field2373;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 >= 50) {
            int var26 = arg4 * var10 + arg5 * var13 >> 16;
            int var27 = arg5 * var10 - arg4 * var13 >> 16;
            int var29 = arg3 * var17 - arg2 * var27 >> 16;
            int var30 = arg2 * var17 + arg3 * var27 >> 16;
            if (var30 >= 50) {
                int var32 = arg4 * var15 + arg5 * var12 >> 16;
                int var33 = arg5 * var15 - arg4 * var12 >> 16;
                int var35 = arg3 * var18 - arg2 * var33 >> 16;
                int var36 = arg2 * var18 + arg3 * var33 >> 16;
                if (var36 >= 50) {
                    int var38 = arg4 * var14 + arg5 * var8 >> 16;
                    int var39 = arg5 * var14 - arg4 * var8 >> 16;
                    int var41 = arg3 * var19 - arg2 * var39 >> 16;
                    int var42 = arg2 * var19 + arg3 * var39 >> 16;
                    if (var42 >= 50) {
                        int var44 = (var20 << 9) / var24 + class25.field565;
                        int var45 = (var23 << 9) / var24 + class25.field578;
                        int var46 = (var26 << 9) / var30 + class25.field565;
                        int var47 = (var29 << 9) / var30 + class25.field578;
                        int var48 = (var32 << 9) / var36 + class25.field565;
                        int var49 = (var35 << 9) / var36 + class25.field578;
                        int var50 = (var38 << 9) / var42 + class25.field565;
                        int var51 = (var41 << 9) / var42 + class25.field578;
                        class25.field562 = 0;
                        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
                            if (class139.field2984 && class180.method1194(class181.field3673, class30.field772, var49, var51, var47, var48, var50, var46)) {
                                class198.field3960 = arg6;
                                class18.field425 = arg7;
                            }
                            class25.field577 = false;
                            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class25.field581 || var50 > class25.field581 || var46 > class25.field581) {
                                class25.field577 = true;
                            }
                            if (arg0.field3180 == -1) {
                                if (arg0.field3179 != 12345678) {
                                    class25.method246(var49, var51, var47, var48, var50, var46, arg0.field3179, arg0.field3191, arg0.field3186);
                                }
                            } else if (!class18.field430) {
                                if (arg0.field3181) {
                                    class25.method250(var49, var51, var47, var48, var50, var46, arg0.field3179, arg0.field3191, arg0.field3186, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3180);
                                } else {
                                    class25.method250(var49, var51, var47, var48, var50, var46, arg0.field3179, arg0.field3191, arg0.field3186, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field3180);
                                }
                            } else {
                                int var52 = class25.field569.method1254(12411, arg0.field3180);
                                class25.method246(var49, var51, var47, var48, var50, var46, class153.method1067(var52, arg0.field3179), class153.method1067(var52, arg0.field3191), class153.method1067(var52, arg0.field3186));
                            }
                        }
                        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) > 0) {
                            if (class139.field2984 && class180.method1194(class181.field3673, class30.field772, var45, var47, var51, var44, var46, var50)) {
                                class198.field3960 = arg6;
                                class18.field425 = arg7;
                            }
                            class25.field577 = false;
                            if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class25.field581 || var46 > class25.field581 || var50 > class25.field581) {
                                class25.field577 = true;
                            }
                            if (arg0.field3180 == -1) {
                                if (arg0.field3185 != 12345678) {
                                    class25.method246(var45, var47, var51, var44, var46, var50, arg0.field3185, arg0.field3186, arg0.field3191);
                                    return;
                                }
                            } else {
                                if (!class18.field430) {
                                    class25.method250(var45, var47, var51, var44, var46, var50, arg0.field3185, arg0.field3186, arg0.field3191, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field3180);
                                    return;
                                }
                                int var53 = class25.field569.method1254(12411, arg0.field3180);
                                class25.method246(var45, var47, var51, var44, var46, var50, class153.method1067(var53, arg0.field3185), class153.method1067(var53, arg0.field3186), class153.method1067(var53, arg0.field3191));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjc;Ljc;)V")
    public static final void method952(byte arg0, class85 arg1, class85 arg2) {
        ++field2791;
        class52.field1275 = arg2;
        class103.field2383 = arg1;
        class57.field1497 = class52.field1275.method759(3, false);
        int var3 = 24 % ((-43 - arg0) / 32);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
    public static void method953(boolean arg0) {
        field2809 = null;
        field2808 = null;
        if (!arg0) {
            method952((byte) -92, (class85) null, (class85) null);
        }
        field2811 = null;
        field2801 = null;
        field2805 = null;
        field2802 = null;
        field2790 = null;
        field2797 = null;
        field2806 = null;
        field2798 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
    public static final void method954(int arg0, boolean arg1) {
        ++field2812;
        if (arg1) {
            field2805 = null;
        }
        if (arg0 == -1 && !class164.field3377) {
            class50.method483((byte) -90);
        } else if (~arg0 != 0 && (~class6.field158 != ~arg0 || !class79.method720((byte) -94)) && ~class90.field2106 != -1 && !class164.field3377) {
            class104.method862(arg0, -23216, false, 0, class90.field2106, 2, class10.field225);
        }
        class6.field158 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class127() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        if (!arg0) {
            field2808 = null;
        }
        class166.method1123(100);
        ++field2804;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 < 32) {
            field2802 = null;
        }
        ++field2793;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field2813 = arg2.method46((byte) 65);
                        }
                    } else {
                        this.field2799 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field2803 = arg2.method64(31790);
                }
            } else {
                this.field2795 = arg2.method46((byte) 65);
            }
        } else {
            this.field2794 = arg2.method64(31790);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2807;
        if (arg0 != 0) {
            this.field2813 = -30;
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -86);
        if (super.field3825.field1840) {
            int var4 = this.field2813 >> 1;
            int[][] var5 = super.field3825.method678(true);
            Random var6 = new Random((long) this.field2794);
            for (int var7 = 0; this.field2795 > var7; ++var7) {
                int var8 = ~this.field2813 < -1 ? this.field2799 + (class97.method834(0, var6, this.field2813) - var4) : this.field2799;
                int var9 = 255 & var8 >> 4;
                int var10 = class97.method834(0, var6, class54.field1430);
                int var11 = class97.method834(0, var6, class12.field287);
                int var12 = (class30.field773[var9] * this.field2803 >> 12) + var10;
                int var13 = var11 - -(class183.field3716[var9] * this.field2803 >> 12);
                int var14 = -var10 + var12;
                int var15 = -var11 + var13;
                if (var14 != 0 || ~var15 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 > ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var12 - var10;
                    int var22 = var11;
                    int var23 = -var11 + var13;
                    int var24 = 1024 + -(class97.method834(arg0, var6, 4096) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var21;
                    int var26 = -var21 / 2;
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var26 += var23;
                        int var29 = (-var10 + var28) * var25 + var24 + 1024;
                        int var30 = class75.field1867 & var28;
                        int var31 = var22 & class1.field4;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var26 < -1) {
                            var26 += -var21;
                            var22 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)Z")
    public static final boolean method955(byte arg0, int arg1) {
        ++field2792;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class196.field3924[arg1];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            if (~var2 == -1004) {
                return true;
            } else {
                if (arg0 < 95) {
                    method954(-72, false);
                }
                return false;
            }
        }
    }
}

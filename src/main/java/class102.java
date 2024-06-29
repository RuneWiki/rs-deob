import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class102 extends class166 {

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Z")
    private boolean field1907 = true;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    private int field1904 = 4096;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "Lhj;")
    public static class69 field1909 = class181.method1318("headicons_pk", (byte) -128);

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "[I")
    public static int[] field1908 = new int[2048];

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "Lnc;")
    public static class83 field1910;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1910 = null;
        field1908 = null;
        if (arg0 != 0) {
            field1910 = null;
        }
        field1909 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ldf;IIIIIIIZ)V")
    public static final void method754(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class108.field2050;
        int var11;
        int var12 = var11 = (arg7 << 7) - class88.field1673;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class271.field4793[arg1][arg6][arg7] - class79.field1526;
        int var18 = class271.field4793[arg1][arg6 + 1][arg7] - class79.field1526;
        int var19 = class271.field4793[arg1][arg6 + 1][arg7 + 1] - class79.field1526;
        int var20 = class271.field4793[arg1][arg6][arg7 + 1] - class79.field1526;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class178.field3239;
                        int var46 = (var24 << 9) / var25 + class178.field3233;
                        int var47 = (var27 << 9) / var31 + class178.field3239;
                        int var48 = (var30 << 9) / var31 + class178.field3233;
                        int var49 = (var33 << 9) / var37 + class178.field3239;
                        int var50 = (var36 << 9) / var37 + class178.field3233;
                        int var51 = (var39 << 9) / var43 + class178.field3239;
                        int var52 = (var42 << 9) / var43 + class178.field3233;
                        class178.field3237 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class196.field3566 && class268.method1848(class70.field1380 + class178.field3239, class178.field3233 + class170.field3113, var50, var52, var48, var49, var51, var47)) {
                                class26.field367 = arg6;
                                class220.field3959 = arg7;
                            }
                            if (!arg8) {
                                class178.field3242 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class178.field3238 || var51 > class178.field3238 || var47 > class178.field3238) {
                                    class178.field3242 = true;
                                }
                                if (arg0.field938 == -1) {
                                    if (arg0.field947 != 12345678) {
                                        class178.method1291(var50, var52, var48, var49, var51, var47, arg0.field947, arg0.field939, arg0.field949);
                                    }
                                } else if (class9.field63) {
                                    if (arg0.field951) {
                                        class178.method1295(var50, var52, var48, var49, var51, var47, arg0.field947, arg0.field939, arg0.field949, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field938);
                                    } else {
                                        class178.method1295(var50, var52, var48, var49, var51, var47, arg0.field947, arg0.field939, arg0.field949, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field938);
                                    }
                                } else {
                                    int var53 = class178.field3236.method772((byte) 2, arg0.field938);
                                    class178.method1291(var50, var52, var48, var49, var51, var47, class136.method1018(var53, arg0.field947), class136.method1018(var53, arg0.field939), class136.method1018(var53, arg0.field949));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class196.field3566 && class268.method1848(class70.field1380 + class178.field3239, class178.field3233 + class170.field3113, var46, var48, var52, var45, var47, var51)) {
                                class26.field367 = arg6;
                                class220.field3959 = arg7;
                            }
                            if (!arg8) {
                                class178.field3242 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class178.field3238 || var47 > class178.field3238 || var51 > class178.field3238) {
                                    class178.field3242 = true;
                                }
                                if (arg0.field938 == -1) {
                                    if (arg0.field937 != 12345678) {
                                        class178.method1291(var46, var48, var52, var45, var47, var51, arg0.field937, arg0.field949, arg0.field939);
                                        return;
                                    }
                                } else {
                                    if (class9.field63) {
                                        class178.method1295(var46, var48, var52, var45, var47, var51, arg0.field937, arg0.field949, arg0.field939, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field938);
                                        return;
                                    }
                                    int var54 = class178.field3236.method772((byte) 2, arg0.field938);
                                    class178.method1291(var46, var48, var52, var45, var47, var51, class136.method1018(var54, arg0.field937), class136.method1018(var54, arg0.field949), class136.method1018(var54, arg0.field939));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field1906;
        if (arg0 != 0) {
            this.field1907 = true;
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -48);
        if (super.field3064.field979) {
            int[] var4 = this.method1231(-2, arg1 + -1 & class138.field2583, 0);
            int[] var5 = this.method1231(124, arg1, 0);
            int[] var6 = this.method1231(45, arg1 + 1 & class138.field2583, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class253.field4565; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1904;
                int var12 = (var5[class12.field183 & var10 - -1] + -var5[class12.field183 & var10 + -1]) * this.field1904;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field1907) {
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field1907 = ~arg1.method937(false) == -2;
                }
            } else {
                this.field1904 = arg1.method912(arg0 + 22);
            }
            ++field1903;
        }
    }
}

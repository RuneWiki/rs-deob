import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class135 extends class115 {

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    private int field1956 = 4096;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field1963 = 0;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1955 = "Continue";

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field1959 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "Lil;")
    public static class48 field1964;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            method913(-68);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, -76);
            for (int var5 = 0; ~var5 > ~class77.field1178; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1963 <= var6 && ~var6 >= ~this.field1956 ? 4096 : 0;
            }
        }
        ++field1958;
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
    public static void method913(int arg0) {
        if (arg0 != 126) {
            method913(114);
        }
        field1964 = null;
        field1955 = null;
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(II)I")
    public static final int method914(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class135() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)I")
    public static final int method915(int arg0) {
        ++field1961;
        if (class168.field2440 == null) {
            return -1;
        } else {
            if (arg0 != 28654) {
                field1960 = 68;
            }
            while (~class168.field2440.field1204 < ~class51.field747) {
                if (class168.field2440.method517(class51.field747, (byte) -121)) {
                    return class51.field747++;
                }
                ++class51.field747;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V")
    public static final void method916(int arg0) {
        ++field1962;
        if (class158.field2300 != null) {
            class57 var1 = class158.field2300;
            synchronized (class158.field2300) {
                class158.field2300 = null;
            }
        }
        if (arg0 != 16) {
            method916(114);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lme;IIIIIIIZ)V")
    public static final void method917(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class96.field1456;
        int var11;
        int var12 = var11 = (arg7 << 7) - class162.field2363;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class107.field1556[arg1][arg6][arg7] - class224.field3357;
        int var18 = class107.field1556[arg1][arg6 + 1][arg7] - class224.field3357;
        int var19 = class107.field1556[arg1][arg6 + 1][arg7 + 1] - class224.field3357;
        int var20 = class107.field1556[arg1][arg6][arg7 + 1] - class224.field3357;
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
                        int var45 = (var21 << 9) / var25 + class18.field249;
                        int var46 = (var24 << 9) / var25 + class18.field248;
                        int var47 = (var27 << 9) / var31 + class18.field249;
                        int var48 = (var30 << 9) / var31 + class18.field248;
                        int var49 = (var33 << 9) / var37 + class18.field249;
                        int var50 = (var36 << 9) / var37 + class18.field248;
                        int var51 = (var39 << 9) / var43 + class18.field249;
                        int var52 = (var42 << 9) / var43 + class18.field248;
                        class18.field254 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class237.field3573 && class23.method173(class57.field885 + class18.field249, class18.field248 + class124.field1806, var50, var52, var48, var49, var51, var47)) {
                                class17.field245 = arg6;
                                class183.field2618 = arg7;
                            }
                            if (!arg8) {
                                class18.field247 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class18.field258 || var51 > class18.field258 || var47 > class18.field258) {
                                    class18.field247 = true;
                                }
                                if (arg0.field2376 == -1) {
                                    if (arg0.field2365 != 12345678) {
                                        class18.method134(var50, var52, var48, var49, var51, var47, arg0.field2365, arg0.field2369, arg0.field2368);
                                    }
                                } else if (class234.field3516) {
                                    if (arg0.field2374) {
                                        class18.method151(var50, var52, var48, var49, var51, var47, arg0.field2365, arg0.field2369, arg0.field2368, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2376);
                                    } else {
                                        class18.method151(var50, var52, var48, var49, var51, var47, arg0.field2365, arg0.field2369, arg0.field2368, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2376);
                                    }
                                } else {
                                    int var53 = class18.field252.method700(arg0.field2376, (byte) 17);
                                    class18.method134(var50, var52, var48, var49, var51, var47, method914(var53, arg0.field2365), method914(var53, arg0.field2369), method914(var53, arg0.field2368));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class237.field3573 && class23.method173(class57.field885 + class18.field249, class18.field248 + class124.field1806, var46, var48, var52, var45, var47, var51)) {
                                class17.field245 = arg6;
                                class183.field2618 = arg7;
                            }
                            if (!arg8) {
                                class18.field247 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class18.field258 || var47 > class18.field258 || var51 > class18.field258) {
                                    class18.field247 = true;
                                }
                                if (arg0.field2376 == -1) {
                                    if (arg0.field2372 != 12345678) {
                                        class18.method134(var46, var48, var52, var45, var47, var51, arg0.field2372, arg0.field2368, arg0.field2369);
                                        return;
                                    }
                                } else {
                                    if (class234.field3516) {
                                        class18.method151(var46, var48, var52, var45, var47, var51, arg0.field2372, arg0.field2368, arg0.field2369, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2376);
                                        return;
                                    }
                                    int var54 = class18.field252.method700(arg0.field2376, (byte) 51);
                                    class18.method134(var46, var48, var52, var45, var47, var51, method914(var54, arg0.field2372), method914(var54, arg0.field2368), method914(var54, arg0.field2369));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1957;
        if (arg0 == -1) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field1956 = arg1.method756(-29901);
                }
            } else {
                this.field1963 = arg1.method756(arg0 + -29900);
            }
        }
    }
}

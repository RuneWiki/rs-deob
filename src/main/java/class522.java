import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class522 extends class192 {

    @OriginalMember(owner = "client!lv", name = "P", descriptor = "I")
    private int field6815 = 4096;

    @OriginalMember(owner = "client!lv", name = "M", descriptor = "[I")
    public static int[] field6812 = new int[5];

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "Lol;")
    public static class388 field6809 = new class388();

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!lv", name = "N", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!lv", name = "O", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2801(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            if (~arg0 >= ~class99.field1309 && arg2 >= class165.field2061) {
                boolean var6;
                if (~class265.field3552 < ~arg5) {
                    arg5 = class265.field3552;
                    var6 = false;
                } else if (class641.field8924 < arg5) {
                    arg5 = class641.field8924;
                    var6 = false;
                } else {
                    var6 = true;
                }
                boolean var7;
                if (class265.field3552 > arg3) {
                    var7 = false;
                    arg3 = class265.field3552;
                } else if (class641.field8924 >= arg3) {
                    var7 = true;
                } else {
                    arg3 = class641.field8924;
                    var7 = false;
                }
                if (~class165.field2061 < ~arg0) {
                    arg0 = class165.field2061;
                } else {
                    class349.method2008(arg3, (byte) 21, class213.field2746[arg0++], arg5, arg1);
                }
                if (class99.field1309 < arg2) {
                    arg2 = class99.field1309;
                } else {
                    class349.method2008(arg3, (byte) 20, class213.field2746[arg2--], arg5, arg1);
                }
                if (var6 && var7) {
                    for (int var8 = arg0; ~arg2 <= ~var8; ++var8) {
                        int[] var9 = class213.field2746[var8];
                        var9[arg5] = var9[arg3] = arg1;
                    }
                } else if (var6) {
                    for (int var10 = arg0; var10 <= arg2; ++var10) {
                        class213.field2746[var10][arg5] = arg1;
                    }
                } else if (var7) {
                    for (int var11 = arg0; ~arg2 <= ~var11; ++var11) {
                        class213.field2746[var11][arg3] = arg1;
                    }
                }
            }
            ++field6813;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLwk;I)V")
    public static final void method2802(boolean arg0, class227 arg1, int arg2) {
        ++field6808;
        class501 var3 = arg1.method1435((byte) -89);
        if (arg1.field3038 == 0) {
            class468.field6110 = 0;
            arg1.field3036 = 0;
            class230.field3078 = -1;
        } else {
            if (arg1.field3021 != -1 && arg1.field2939 == 0) {
                class348 var4 = class552.field7163.method3031(arg2 ^ -114, arg1.field3021);
                if (~arg1.field3037 < -1 && var4.field4446 == 0) {
                    class230.field3078 = -1;
                    class468.field6110 = 0;
                    ++arg1.field3036;
                    return;
                }
                if (~arg1.field3037 >= -1 && var4.field4465 == 0) {
                    class230.field3078 = -1;
                    class468.field6110 = 0;
                    ++arg1.field3036;
                    return;
                }
            }
            if (arg1.field2984 != -1 && class424.field5503 >= arg1.field2975) {
                class322 var5 = class91.field1202.method986(arg1.field2984, false);
                if (var5.field4166 && var5.field4173 != -1) {
                    class348 var6 = class552.field7163.method3031(110, var5.field4173);
                    if (arg1.field3037 > 0 && var6.field4446 == 0) {
                        class468.field6110 = 0;
                        ++arg1.field3036;
                        class230.field3078 = -1;
                        return;
                    }
                    if (arg1.field3037 <= 0 && var6.field4465 == 0) {
                        ++arg1.field3036;
                        class230.field3078 = -1;
                        class468.field6110 = 0;
                        return;
                    }
                }
            }
            if (arg1.field2984 != -1 && arg1.field2975 <= class424.field5503) {
                class322 var7 = class91.field1202.method986(arg1.field2984, false);
                if (var7.field4166 && ~var7.field4173 != 0) {
                    class348 var8 = class552.field7163.method3031(arg2 + 113, var7.field4173);
                    if (~arg1.field3037 < -1 && ~var8.field4446 == -1) {
                        ++arg1.field3036;
                        class468.field6110 = 0;
                        class230.field3078 = -1;
                        return;
                    }
                    if (arg1.field3037 <= 0 && ~var8.field4465 == -1) {
                        class468.field6110 = 0;
                        ++arg1.field3036;
                        class230.field3078 = -1;
                        return;
                    }
                }
            }
            int var9 = arg1.field506;
            int var10 = arg1.field503;
            int var11 = arg1.field3030[arg1.field3038 - 1] * 512 - -(256 * arg1.method1265(104));
            int var12 = arg1.field3039[arg1.field3038 + -1] * 512 + 256 * arg1.method1265(arg2 ^ 98);
            if (~var11 >= ~var9) {
                if (~var9 < ~var11) {
                    if (var10 < var12) {
                        arg1.method1429(6144, (byte) -84);
                    } else if (~var10 < ~var12) {
                        arg1.method1429(2048, (byte) -84);
                    } else {
                        arg1.method1429(4096, (byte) -84);
                    }
                } else if (~var12 < ~var10) {
                    arg1.method1429(8192, (byte) -84);
                } else if (var12 < var10) {
                    arg1.method1429(0, (byte) -84);
                }
            } else if (~var10 > ~var12) {
                arg1.method1429(10240, (byte) -84);
            } else if (var10 <= var12) {
                arg1.method1429(12288, (byte) -84);
            } else {
                arg1.method1429(14336, (byte) -84);
            }
            byte var13 = arg1.field3032[arg1.field3038 + -1];
            if (arg0 || ~(var11 - var9) >= -1025 && ~(var11 - var9) <= 1023 && ~(-var10 + var12) >= -1025 && -var10 + var12 >= -1024) {
                int var14 = 16;
                boolean var15 = true;
                if (arg1 instanceof class532) {
                    var15 = ((class532) arg1).field6914.field9747;
                }
                if (var15) {
                    int var16 = -arg1.field2988.field5184 + arg1.field2947;
                    if (var16 != 0 && arg1.field3001 == -1 && arg1.field2946 != 0) {
                        var14 = 8;
                    }
                    if (!arg0 && ~arg1.field3038 < -3) {
                        var14 = 24;
                    }
                    if (!arg0 && ~arg1.field3038 < -4) {
                        var14 = 32;
                    }
                } else {
                    if (!arg0 && arg1.field3038 > 1) {
                        var14 = 24;
                    }
                    if (!arg0 && ~arg1.field3038 < -3) {
                        var14 = 32;
                    }
                }
                if (arg1.field3036 > arg2 && ~arg1.field3038 < -2) {
                    var14 = 32;
                    --arg1.field3036;
                }
                if (var13 != 2) {
                    if (~var13 == -1) {
                        var14 >>= 1;
                    }
                } else {
                    var14 <<= 1;
                }
                class468.field6110 = 0;
                if (~var3.field6593 != 0) {
                    int var17 = var14 << 9;
                    if (~arg1.field3038 == -2) {
                        int var18 = arg1.field3031 * arg1.field3031;
                        int var19 = (~var11 > ~arg1.field506 ? -var11 + arg1.field506 : var11 - arg1.field506) << 9;
                        int var20 = (~arg1.field503 >= ~var12 ? -arg1.field503 + var12 : -var12 + arg1.field503) << 9;
                        int var21 = ~var19 >= ~var20 ? var20 : var19;
                        int var22 = var3.field6593 * var21 * 2;
                        if (var22 >= var18) {
                            if (var18 / 2 > var21) {
                                arg1.field3031 -= var3.field6593;
                                if (~arg1.field3031 > -1) {
                                    arg1.field3031 = 0;
                                }
                            } else if (~arg1.field3031 > ~var17) {
                                arg1.field3031 += var3.field6593;
                                if (~var17 > ~arg1.field3031) {
                                    arg1.field3031 = var17;
                                }
                            }
                        } else {
                            arg1.field3031 /= 2;
                        }
                    } else if (~var17 >= ~arg1.field3031) {
                        if (arg1.field3031 > 0) {
                            arg1.field3031 -= var3.field6593;
                            if (arg1.field3031 < 0) {
                                arg1.field3031 = 0;
                            }
                        }
                    } else {
                        arg1.field3031 += var3.field6593;
                        if (arg1.field3031 > var17) {
                            arg1.field3031 = var17;
                        }
                    }
                    var14 = arg1.field3031 >> 9;
                    if (~var14 > -2) {
                        var14 = 1;
                    }
                }
                if (var9 == var11 && var10 == var12) {
                    class230.field3078 = -1;
                } else {
                    if (var9 < var11) {
                        arg1.field506 += var14;
                        class468.field6110 |= 4;
                        if (var11 < arg1.field506) {
                            arg1.field506 = var11;
                        }
                    } else if (var11 < var9) {
                        class468.field6110 |= 8;
                        arg1.field506 -= var14;
                        if (var11 > arg1.field506) {
                            arg1.field506 = var11;
                        }
                    }
                    if (var14 >= 32) {
                        class230.field3078 = 2;
                    } else {
                        class230.field3078 = var13;
                    }
                    if (var10 < var12) {
                        class468.field6110 |= 1;
                        arg1.field503 += var14;
                        if (~arg1.field503 < ~var12) {
                            arg1.field503 = var12;
                        }
                    } else if (~var12 > ~var10) {
                        class468.field6110 |= 2;
                        arg1.field503 -= var14;
                        if (arg1.field503 < var12) {
                            arg1.field503 = var12;
                        }
                    }
                }
                if (~arg1.field506 == ~var11 && ~arg1.field503 == ~var12) {
                    if (~arg1.field3037 < -1) {
                        --arg1.field3037;
                    }
                    --arg1.field3038;
                }
            } else {
                arg1.field503 = var12;
                arg1.field506 = var11;
                arg1.method1422(arg1.field2947, -125, false);
                class230.field3078 = -1;
                --arg1.field3038;
                if (arg1.field3037 > 0) {
                    --arg1.field3037;
                }
                class468.field6110 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z")
    public static final boolean method2803(int arg0, int arg1) {
        if (arg0 >= -49) {
            method2803(17, -125);
        }
        class30.field453 = 65535 & arg1 + 1;
        class358.field4640 = true;
        ++field6811;
        return true;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 != -12160) {
            this.field6815 = 119;
        }
        if (arg0 == 0) {
            this.field6815 = arg1.method2393(-30727);
        }
        ++field6814;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
    public class522() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "(B)V")
    public static void method2804(byte arg0) {
        field6809 = null;
        field6812 = null;
        if (arg0 != -1) {
            field6809 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field6810;
        if (arg1 >= -123) {
            this.method118(-36, (byte) -109);
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, class95.field1247 & arg0 + -1, 0);
            int[] var5 = this.method1253(0, arg0, 0);
            int[] var6 = this.method1253(0, class95.field1247 & arg0 - -1, 0);
            for (int var7 = 0; ~class561.field7319 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field6815;
                int var9 = (var5[class337.field4356 & var7 + 1] + -var5[class337.field4356 & var7 + -1]) * this.field6815;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIII)V")
    public static final void method2805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class176.field2196 != null) {
            class176.field2196[arg0][arg1] = -16777216 | arg2;
        }
        if (class612.field8277 != null) {
            class612.field8277[arg0][arg1] = (short) arg3;
        }
        if (class315.field4084 != null) {
            class315.field4084[arg0][arg1] = (byte) arg4;
        }
    }
}

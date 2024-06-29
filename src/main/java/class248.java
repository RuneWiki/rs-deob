import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class248 extends class362 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    private int field3498 = 4096;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    private int field3501 = 4096;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field3499 = 4096;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lfja;")
    public static class783 field3497 = new class783(70, -1);

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 9)
    public static final void method1644(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class590.field8308 = 0;
        class28.field530 = 0;
        ++class497.field6804;
        if ((arg5 & 2) == 0) {
            for (class543 var8 = class451.field6179[var7]; var8 != null; var8 = var8.field7407) {
                if (!class396.method2395(var8, arg0, arg1, arg2, arg3)) {
                    class542.method3060(var8);
                    if (var8.field7393 != -1) {
                        class222.field3246[class590.field8308++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class543 var9 = class684.field9523[var7]; var9 != null; var9 = var9.field7407) {
                if (!class396.method2395(var9, arg0, arg1, arg2, arg3)) {
                    class542.method3060(var9);
                    if (var9.field7393 != -1) {
                        class666.field9266[class28.field530++] = var9;
                    }
                }
            }
            for (class543 var10 = class265.field3738[var7]; var10 != null; var10 = var10.field7407) {
                if (!class396.method2395(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method910(false)) {
                        class542.method3060(var10);
                        if (var10.field7393 != -1) {
                            class666.field9266[class28.field530++] = var10;
                        }
                    } else {
                        class542.method3060(var10);
                        if (var10.field7393 != -1) {
                            class222.field3246[class590.field8308++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class171.field2726; ++var11) {
                    if (!class396.method2395(class22.field466[var11], arg0, arg1, arg2, arg3)) {
                        class542.method3060(class22.field466[var11]);
                        if (class22.field466[var11].field7393 != -1) {
                            if (class22.field466[var11].method910(false)) {
                                class666.field9266[class28.field530++] = class22.field466[var11];
                            } else {
                                class222.field3246[class590.field8308++] = class22.field466[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class590.field8308 > 0) {
            method1647(class222.field3246, 0, class590.field8308 - 1);
            for (int var12 = 0; var12 < class590.field8308; ++var12) {
                class355.method2181(class222.field3246[var12], true, arg6);
            }
        }
        if (class453.field6186) {
            class112.field2107.method542(0, (class307[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class70.field1028; var13 < class62.field856; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class641.field8883.length;
                    if (class641.field8883.length + class116.field2126 > class441.field5980) {
                        var14 -= class641.field8883.length + class116.field2126 - class441.field5980;
                    }
                    int var15 = class641.field8883[0].length;
                    if (class641.field8883[0].length + class779.field10731 > class375.field5083) {
                        var15 -= class641.field8883[0].length + class779.field10731 - class375.field5083;
                    }
                    boolean[][] var16 = class657.field9097;
                    if (class637.field8792) {
                        if (class120.field2186) {
                            var16 = class580.field8201[var13];
                        }
                        for (int var17 = class43.field688; var17 < var14; ++var17) {
                            int var18 = class116.field2126 + var17 - class43.field688;
                            for (int var19 = class78.field1109; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class641.field8883[var17][var19]) {
                                    int var20 = class779.field10731 + var19 - class78.field1109;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class325.field4448[var21][var18][var20] != null && class325.field4448[var21][var18][var20].field7459 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class757.method4186(var13, (byte) -49, var18, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class120.field2186) {
                        if (arg4 >= 0) {
                            class745.field10286[var13].method1906(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class745.field10286[var13].method1895(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class341.field4602; ++var22) {
                            class102.field1651[var22].method3657(0, new class567(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class745.field10286[var13].method1906(class434.field5912, class111.field1920, class389.field5342, class657.field9097, false, arg4, arg5);
                    } else {
                        class745.field10286[var13].method1895(class434.field5912, class111.field1920, class389.field5342, class657.field9097, false, arg5);
                    }
                } else {
                    int var23 = class641.field8883.length;
                    if (class641.field8883.length + class116.field2126 > class441.field5980) {
                        var23 -= class641.field8883.length + class116.field2126 - class441.field5980;
                    }
                    int var24 = class641.field8883[0].length;
                    if (class641.field8883[0].length + class779.field10731 > class375.field5083) {
                        var24 -= class641.field8883[0].length + class779.field10731 - class375.field5083;
                    }
                    boolean[][] var25 = class657.field9097;
                    if (class637.field8792) {
                        if (class120.field2186) {
                            var25 = class580.field8201[var13];
                        }
                        for (int var26 = class43.field688; var26 < var23; ++var26) {
                            int var27 = class116.field2126 + var26 - class43.field688;
                            for (int var28 = class78.field1109; var28 < var24; ++var28) {
                                if (class641.field8883[var26][var28] && !class757.method4186(var13, (byte) -49, var27, class779.field10731 + var28 - class78.field1109)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class120.field2186) {
                        if (arg4 >= 0) {
                            class745.field10286[var13].method1906(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class745.field10286[var13].method1895(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class341.field4602; ++var29) {
                            class102.field1651[var29].method3657(0, new class567(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class745.field10286[var13].method1906(class434.field5912, class111.field1920, class389.field5342, class657.field9097, true, arg4, arg5);
                    } else {
                        class745.field10286[var13].method1895(class434.field5912, class111.field1920, class389.field5342, class657.field9097, true, arg5);
                    }
                }
            }
        }
        if (class28.field530 > 0) {
            class274.method1767(class666.field9266, 0, class28.field530 - 1);
            for (int var30 = 0; var30 < class28.field530; ++var30) {
                class355.method2181(class666.field9266[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILfca;)Ljava/lang/String;", line = 311)
    public static final String method1645(int arg0, class93 arg1) {
        ++field3502;
        return arg0 != 15882 ? null : class499.method2858((byte) 68, arg1, 32767);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I", line = 326)
    public final int[][] method153(int arg0, byte arg1) {
        ++field3503;
        if (arg1 <= 57) {
            field3504 = 22;
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, arg0, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class769.field10597 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3501 * var12 >> 12;
                    var9[var11] = this.field3498 * var13 >> 12;
                    var10[var11] = this.field3499 * var14 >> 12;
                } else {
                    var8[var11] = this.field3501;
                    var9[var11] = this.field3498;
                    var10[var11] = this.field3499;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 406)
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 395)
    public static void method1646(int arg0) {
        field3497 = null;
        if (arg0 != 0) {
            field3497 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lcn;II)V", line = 413)
    private static final void method1647(class543[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class543 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field7393;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field7393 < (var7 & 1) + var6) {
                    class543 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method1647(arg0, arg1, var4 - 1);
            method1647(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfca;II)V", line = 453)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field3500;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3499 = arg0.method763(92);
                }
            } else {
                this.field3498 = arg0.method763(-17);
            }
        } else {
            this.field3501 = arg0.method763(114);
        }
        if (arg2 != -1) {
            this.field3501 = -42;
        }
    }
}

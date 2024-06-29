import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class24 extends class107 {

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Z")
    private boolean field435 = true;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Z")
    private boolean field438 = true;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Z")
    public static boolean field442 = true;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Ljava/lang/String;")
    public static String field446 = "glow1:";

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field444 = -2;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Z")
    public static boolean field449 = false;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field441;
        int[] var3 = super.field1661.method894(124, arg1);
        int var4 = 63 % ((arg0 - -34) / 49);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, !this.field438 ? arg1 : class107.field1677 - arg1, -29053);
            if (this.field435) {
                for (int var6 = 0; var6 < field443; ++var6) {
                    var3[var6] = var5[-var6 + class128.field2053];
                }
            } else {
                class282.method1923(var5, 0, var3, 0, field443);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field440;
        if (arg1 != -117) {
            field446 = null;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, -128, this.field438 ? -arg0 + class107.field1677 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (!this.field435) {
                for (int var11 = 0; ~var11 > ~field443; ++var11) {
                    var8[var11] = var5[var11];
                    var7[var11] = var6[var11];
                    var10[var11] = var9[var11];
                }
            } else {
                for (int var12 = 0; field443 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class128.field2053];
                    var7[var12] = var6[-var12 + class128.field2053];
                    var10[var12] = var9[-var12 + class128.field2053];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method191(int arg0) {
        field446 = null;
        if (arg0 != 17860) {
            method192(119);
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static final void method192(int arg0) {
        class254.field4198.method1873(-7401);
        if (arg0 != 1) {
            field439 = 63;
        }
        ++field437;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class9 var20 = new class9(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class307.field4991[var21][arg1][arg2] == null) {
                    class307.field4991[var21][arg1][arg2] = new class116(var21, arg1, arg2);
                }
            }
            class307.field4991[arg0][arg1][arg2].field1783 = var20;
        } else if (arg3 != 1) {
            class283 var24 = new class283(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class307.field4991[var25][arg1][arg2] == null) {
                    class307.field4991[var25][arg1][arg2] = new class116(var25, arg1, arg2);
                }
            }
            class307.field4991[arg0][arg1][arg2].field1772 = var24;
        } else {
            class9 var22 = new class9(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class307.field4991[var23][arg1][arg2] == null) {
                    class307.field4991[var23][arg1][arg2] = new class116(var23, arg1, arg2);
                }
            }
            class307.field4991[arg0][arg1][arg2].field1783 = var22;
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)Z")
    public static final boolean method194(int arg0) {
        ++field436;
        if (arg0 != 3595) {
            return false;
        } else {
            if (class203.field3293) {
                try {
                    if ((Boolean) class216.method1481(arg0 + -3688, class44.field659.field1105, "showingVideoAd")) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field1660 = arg1.method1849(255) == 1;
                }
            } else {
                this.field438 = ~arg1.method1849(255) == -2;
            }
        } else {
            this.field435 = arg1.method1849(arg2 + 227) == 1;
        }
        ++field448;
        if (arg2 != 28) {
            this.method189(-121, 28);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)I")
    public static final int method196(boolean arg0, int arg1) {
        ++field447;
        if (!arg0) {
            field443 = -75;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)I")
    public static final int method197(int arg0, int arg1, int arg2) {
        ++field445;
        if (arg0 == -2) {
            return 12345678;
        } else {
            if (arg1 < 42) {
                method197(-106, 22, 99);
            }
            if (arg0 == -1) {
                if (~arg2 <= -3) {
                    if (arg2 > 126) {
                        arg2 = 126;
                    }
                } else {
                    arg2 = 2;
                }
                return arg2;
            } else {
                int var3 = (127 & arg0) * arg2 >> 7;
                if (~var3 <= -3) {
                    if (~var3 < -127) {
                        var3 = 126;
                    }
                } else {
                    var3 = 2;
                }
                return (arg0 & 65408) + var3;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
    public static final void method198(byte arg0) {
        if (arg0 < 39) {
            method191(24);
        }
        ++field450;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class291.field4776 - 1; ++var2) {
                if (class26.field478[var2] < 1000 && class26.field478[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class226.field3550[var2];
                    class226.field3550[var2] = class226.field3550[var2 + 1];
                    class226.field3550[var2 + 1] = var3;
                    String var4 = class188.field3083[var2];
                    class188.field3083[var2] = class188.field3083[var2 + 1];
                    class188.field3083[var2 + 1] = var4;
                    int var5 = class242.field3840[var2];
                    class242.field3840[var2] = class242.field3840[var2 + 1];
                    class242.field3840[var2 + 1] = var5;
                    int var6 = class144.field2320[var2];
                    class144.field2320[var2] = class144.field2320[var2 + 1];
                    class144.field2320[var2 + 1] = var6;
                    int var7 = class275.field4502[var2];
                    class275.field4502[var2] = class275.field4502[var2 + 1];
                    class275.field4502[var2 + 1] = var7;
                    short var8 = class26.field478[var2];
                    class26.field478[var2] = class26.field478[var2 + 1];
                    class26.field478[var2 + 1] = var8;
                    long var9 = class215.field3392[var2];
                    class215.field3392[var2] = class215.field3392[var2 - -1];
                    class215.field3392[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, false);
    }
}

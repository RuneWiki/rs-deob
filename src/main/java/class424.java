import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class424 extends class30 {

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    private int field6254 = 4096;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    private int field6266 = 0;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "F")
    public static float field6260 = 0.0F;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field6263 = new String[100];

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[[I")
    public static int[][] field6265 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 == 6456) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field376 = arg0.method1322(false) == 1;
                    }
                } else {
                    this.field6254 = arg0.method1272((byte) -70);
                }
            } else {
                this.field6266 = arg0.method1272((byte) -121);
            }
            ++field6258;
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V")
    public static void method2630(byte arg0) {
        field6265 = null;
        if (arg0 != -42) {
            field6265 = null;
        }
        field6263 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([J[II)V")
    public static final void method2631(long[] arg0, int[] arg1, int arg2) {
        if (arg2 >= -114) {
            method2633(-98, -101, -71, 38, 16, -98);
        }
        class284.method1932(arg0.length - 1, arg0, 0, arg1, (byte) 107);
        ++field6255;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6267;
        if ((arg4 & 1) == arg0) {
            int var7 = arg6;
            arg6 = arg5;
            arg5 = var7;
        }
        int var8 = arg1 & 3;
        if (var8 == 0) {
            return arg3;
        } else if (~var8 == -2) {
            return arg2;
        } else {
            return ~var8 == -3 ? 7 - arg3 + -arg6 + 1 : -arg5 + 7 + -arg2 - -1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class424() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field6261;
        if (arg1 <= 49) {
            this.field6266 = -39;
        }
        int[] var3 = super.field371.method2367((byte) -99, arg0);
        if (super.field371.field5586) {
            int[] var4 = this.method210((byte) 23, 0, arg0);
            for (int var5 = 0; ~class369.field5610 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field6266 < ~var6) {
                    var3[var5] = this.field6266;
                } else if (var6 > this.field6254) {
                    var3[var5] = this.field6254;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class427.method2649(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class318.method2117(var6 + 1, class275.field4396[arg0].method779(arg1, arg3) + arg5, var7 + 1) && class318.method2117(var6 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg3) + arg5, var7 + 1) && class318.method2117(var6 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class318.method2117(var6 + 1, class275.field4396[arg0].method779(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class79.field989[arg0][var8][var14] == -class381.field5764) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class275.field4396[arg0].method779(arg1, arg3) + arg5;
            if (!class318.method2117(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class318.method2117(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class318.method2117(var9, var11, var13)) {
                        return false;
                    } else if (!class318.method2117(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
    public static final void method2634(int arg0) {
        class196 var1 = (class196) class392.field5891.method1776(true);
        if (arg0 != -1) {
            field6260 = 0.2632565F;
        }
        while (var1 != null) {
            int var2 = var1.field3171;
            if (class178.method1225(35, var2)) {
                boolean var3 = true;
                class172[] var4 = class203.field3266[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2712;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2539;
                    class172 var7 = class196.method1375(var6, (byte) -56);
                    if (var7 != null) {
                        class336.method2219((byte) 6, var7);
                    }
                }
            }
            var1 = (class196) class392.field5891.method1773(-1);
        }
        ++field6257;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)B")
    public static final byte method2635(int arg0, int arg1, int arg2) {
        ++field6259;
        if (arg0 >= -108) {
            method2634(99);
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) (~(arg1 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field6256;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (arg0 != -93) {
            return null;
        } else {
            if (super.field360.field6566) {
                int[][] var4 = this.method206(arg1, arg0 ^ -95, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class369.field5610; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~var12 <= ~this.field6266) {
                        if (~this.field6254 <= ~var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field6254;
                        }
                    } else {
                        var8[var11] = this.field6266;
                    }
                    if (var13 >= this.field6266) {
                        if (this.field6254 < var13) {
                            var9[var11] = this.field6254;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field6266;
                    }
                    if (~var14 <= ~this.field6266) {
                        if (~var14 >= ~this.field6254) {
                            var10[var11] = var14;
                        } else {
                            var10[var11] = this.field6254;
                        }
                    } else {
                        var10[var11] = this.field6266;
                    }
                }
            }
            return var3;
        }
    }
}

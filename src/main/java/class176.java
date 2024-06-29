import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class176 extends class264 {

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    private int field3045 = 0;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    private int field3047 = 0;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    private int field3063 = 0;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "[Z")
    public static boolean[] field3048 = new boolean[112];

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Lcf;")
    public static class93 field3059 = class147.method1066("Verbindung zum Update)2Server hergestellt)3", -48);

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "[I")
    public static int[] field3061 = new int[2500];

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIII)V")
    private final void method1250(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3054;
        int var5 = arg3 >= arg1 ? arg3 : arg1;
        if (!arg0) {
            this.field3047 = -26;
        }
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = arg1 < arg3 ? arg1 : arg3;
        int var8 = ~arg2 > ~var7 ? arg2 : var7;
        int var9 = -var8 + var6;
        if (~var9 >= -1) {
            this.field3052 = 0;
        } else {
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (arg3 != var6) {
                    this.field3052 = arg1 == var8 ? 12288 - -var10 : -var11 + 20480;
                } else {
                    this.field3052 = arg2 == var8 ? var11 + 4096 : 12288 - var12;
                }
            } else {
                this.field3052 = arg3 != var8 ? -var10 + 4096 : var12 + 20480;
            }
            this.field3052 /= 6;
        }
        this.field3051 = (var8 - -var6) / 2;
        if (~this.field3051 < -1 && ~this.field3051 > -4097) {
            this.field3046 = (var9 << 12) / (this.field3051 > 2048 ? -(this.field3051 * 2) + 8192 : this.field3051 * 2);
        } else {
            this.field3046 = 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(IB)I")
    public static final int method1251(int arg0, byte arg1) {
        if (arg1 > -69) {
            field3060 = 55;
        }
        ++field3057;
        int var2 = arg0 * 6 + -61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = 40960 - -(arg0 * var2 >> 12);
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(ZIII)V")
    private final void method1252(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3044;
        if (!arg0) {
            this.field3047 = -128;
        }
        int var5 = ~arg2 >= -2049 ? (arg3 + 4096) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg2 + arg3;
        if (~var5 >= -1) {
            this.field3049 = this.field3055 = this.field3053 = arg2;
        } else {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var10 = var6 >> 12;
            int var11 = -(var10 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (~var10 == -6) {
                                    this.field3053 = var14;
                                    this.field3049 = var5;
                                    this.field3055 = var7;
                                }
                            } else {
                                this.field3055 = var7;
                                this.field3049 = var15;
                                this.field3053 = var5;
                            }
                        } else {
                            this.field3053 = var5;
                            this.field3055 = var14;
                            this.field3049 = var7;
                        }
                    } else {
                        this.field3053 = var15;
                        this.field3055 = var5;
                        this.field3049 = var7;
                    }
                } else {
                    this.field3049 = var14;
                    this.field3053 = var7;
                    this.field3055 = var5;
                }
            } else {
                this.field3049 = var5;
                this.field3053 = var7;
                this.field3055 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
    public static final void method1253(int arg0, int arg1) {
        class41 var2 = class232.field4138[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class41 var4 = class232.field4138[var3][arg0][arg1] = class232.field4138[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field655;
                for (int var5 = 0; var5 < var4.field645; ++var5) {
                    class229 var6 = var4.field637[var5];
                    if ((var6.field4094 >> 29 & 3L) == 2L && var6.field4095 == arg0 && var6.field4099 == arg1) {
                        --var6.field4108;
                    }
                }
            }
        }
        if (class232.field4138[0][arg0][arg1] == null) {
            class232.field4138[0][arg0][arg1] = new class41(0, arg0, arg1);
        }
        class232.field4138[0][arg0][arg1].field640 = var2;
        class232.field4138[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)V")
    public static final void method1254(byte arg0, long arg1) {
        ++field3062;
        if (arg0 == 84) {
            if (~arg1 != -1L) {
                class285.field5105.method1568(125, (byte) 102);
                ++class52.field850;
                class285.field5105.method1882(arg1, (byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public static void method1255(byte arg0) {
        field3059 = null;
        field3048 = null;
        if (arg0 != -109) {
            method1255((byte) 5);
        }
        field3061 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field3056;
        if (arg0 >= 11) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field3045 = (arg2.method1925(true) << 12) / 100;
                    }
                } else {
                    this.field3063 = (arg2.method1925(true) << 12) / 100;
                }
            } else {
                this.field3047 = arg2.method1914((byte) 99);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == ~arg4 && ~arg5 == ~arg9 && ~arg2 == ~arg7 && ~arg0 == ~arg6) {
            class49.method271(arg1, arg6, arg2, -1, arg9, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg9 * 3;
            int var15 = arg5 * 3;
            int var16 = arg7 * 3;
            int var17 = arg0 * 3;
            int var18 = -arg4 + arg2 + -var16 + var13;
            int var19 = arg6 - var17 + var15 + -arg9;
            int var20 = var16 - var13 + var12 + -var13;
            int var21 = -var12 + var13;
            int var22 = -var15 + var14 + -var15 + var17;
            int var23 = -var14 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var20 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var19 * var27;
                int var29 = var22 * var25;
                int var30 = var18 * var27;
                int var31 = var21 * var24;
                int var32 = (var26 + var30 + var31 >> 12) + arg4;
                int var33 = var23 * var24;
                int var34 = (var28 + var29 + var33 >> 12) + arg9;
                class49.method271(arg1, var34, var32, -1, var11, var10);
                var10 = var32;
                var11 = var34;
            }
        }
        ++field3058;
        if (arg8 != -26138) {
            field3048 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)V")
    public static final void method1257(int arg0, int arg1) {
        ++field3043;
        class212 var2 = class123.method905(-1205364448, 6, arg1);
        var2.method1502(255);
        if (arg0 != -824181428) {
            field3061 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.method17(-33, true);
        }
        int[][] var3 = super.field4705.method1089(arg0, 33);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-124, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~field3060 < ~var11; ++var11) {
                this.method1250(true, var5[var11], var7[var11], var9[var11]);
                this.field3046 += this.field3063;
                this.field3052 += this.field3047;
                this.field3051 += this.field3045;
                if (~this.field3051 > -1) {
                    this.field3051 = 0;
                }
                if (this.field3046 < 0) {
                    this.field3046 = 0;
                }
                while (~this.field3052 > -1) {
                    this.field3052 += 4096;
                }
                while (~this.field3052 < -4097) {
                    this.field3052 -= 4096;
                }
                if (~this.field3046 < -4097) {
                    this.field3046 = 4096;
                }
                if (this.field3051 > 4096) {
                    this.field3051 = 4096;
                }
                this.method1252(true, this.field3052, this.field3051, this.field3046);
                var8[var11] = this.field3049;
                var6[var11] = this.field3055;
                var10[var11] = this.field3053;
            }
        }
        ++field3050;
        return var3;
    }
}

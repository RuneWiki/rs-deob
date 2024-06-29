import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class402 extends class5 {

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    private int field5027 = 0;

    @OriginalMember(owner = "client!op", name = "R", descriptor = "I")
    private int field5034 = 0;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    private int field5028 = 0;

    @OriginalMember(owner = "client!op", name = "S", descriptor = "Ljava/lang/String;")
    public static String field5035 = "";

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    private int field5030;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    private int field5032;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    private int field5036;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!op", name = "V", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!op", name = "W", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!op", name = "Y", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!op", name = "Z", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!op", name = "ab", descriptor = "I")
    private int field5043;

    // $FF: synthetic field
    @OriginalMember(owner = "client!op", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field5044;

    // $FF: synthetic field
    @OriginalMember(owner = "client!op", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field5045;

    @OriginalMember(owner = "client!op", name = "X", descriptor = "[I")
    public static int[] field5040;

    // $FF: synthetic method
    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2142(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 6)
    public class402() {
        super(1, false);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)[[I", line = 9)
    public final int[][] method44(int arg0, boolean arg1) {
        if (!arg1) {
            method2136(-17, 60, -61, -65, -64, 66, -33, (class566) null, 58, 36, (byte[][][]) null, 104, 2);
        }
        ++field5033;
        int[][] var3 = super.field135.method2706(arg0, -117);
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class657.field9287 > var11; ++var11) {
                this.method2137(var5[var11], var7[var11], 31189, var6[var11]);
                this.field5036 += this.field5027;
                this.field5038 += this.field5028;
                this.field5043 += this.field5034;
                while (this.field5038 < 0) {
                    this.field5038 += 4096;
                }
                if (~this.field5036 > -1) {
                    this.field5036 = 0;
                }
                while (~this.field5038 < -4097) {
                    this.field5038 -= 4096;
                }
                if (this.field5036 > 4096) {
                    this.field5036 = 4096;
                }
                if (this.field5043 < 0) {
                    this.field5043 = 0;
                }
                if (~this.field5043 < -4097) {
                    this.field5043 = 4096;
                }
                this.method2139(this.field5038, (byte) -124, this.field5036, this.field5043);
                var8[var11] = this.field5030;
                var9[var11] = this.field5025;
                var10[var11] = this.field5032;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIIILr;II[[[BII)V", line = 84)
    public static final void method2136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class566 arg7, int arg8, int arg9, byte[][][] arg10, int arg11, int arg12) {
        ++field5037;
        if (~arg11 != -1 && ~arg9 != -1) {
            if (arg11 == 9) {
                arg3 = 3 & arg3 + 1;
                arg11 = 1;
            }
            if (arg11 == 10) {
                arg11 = 1;
                arg3 = arg3 - -3 & 3;
            }
            if (arg11 == 11) {
                arg3 = arg3 + 3 & 3;
                arg11 = 8;
            }
            if (arg12 > 31) {
                arg7.method1074(arg0, arg1, arg6, arg2, arg8, arg4, arg10[arg11 - 1][arg3], arg9, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIII)V", line = 120)
    private final void method2137(int arg0, int arg1, int arg2, int arg3) {
        ++field5031;
        int var5 = ~arg0 < ~arg3 ? arg0 : arg3;
        int var6 = arg0 >= arg3 ? arg3 : arg0;
        int var7 = arg1 <= var5 ? var5 : arg1;
        int var8 = ~arg1 <= ~var6 ? var6 : arg1;
        this.field5043 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (arg2 == 31189) {
            if (~var9 < -1) {
                int var10 = (-arg0 + var7 << 12) / var9;
                int var11 = (var7 - arg3 << 12) / var9;
                int var12 = (-arg1 + var7 << 12) / var9;
                if (arg0 != var7) {
                    if (arg3 != var7) {
                        this.field5038 = ~arg0 != ~var8 ? 20480 - var10 : var11 + 12288;
                    } else {
                        this.field5038 = arg1 != var8 ? -var12 + 12288 : var10 + 4096;
                    }
                } else {
                    this.field5038 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
                }
                this.field5038 /= 6;
            } else {
                this.field5038 = 0;
            }
            if (this.field5043 > 0 && this.field5043 < 4096) {
                this.field5036 = (var9 << 12) / (this.field5043 <= 2048 ? this.field5043 * 2 : -(this.field5043 * 2) + 8192);
            } else {
                this.field5036 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILes;I)V", line = 176)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field5034 = (arg1.method3480(arg0 + -20934) << 12) / 100;
                }
            } else {
                this.field5027 = (arg1.method3480(-20933) << 12) / 100;
            }
        } else {
            this.field5028 = arg1.method3510(108);
        }
        ++field5042;
        if (arg0 != 1) {
            field5026 = -86;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BIIIIILr;II)V", line = 221)
    public static final void method2138(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class566 arg6, int arg7, int arg8) {
        ++field5039;
        class339 var9 = (class339) class312.method1803(arg1, arg2, arg5);
        if (var9 != null) {
            class441 var10 = class428.field5352.method3138((byte) 126, var9.method65((byte) 127));
            int var11 = var9.method78((byte) -103) & 3;
            int var12 = var9.method74((byte) 42);
            if (~var10.field5519 == 0) {
                int var13 = arg7;
                if (var10.field5560 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (~var11 == -1) {
                        arg6.method3109(arg3, (byte) 4, var13, 4, arg4);
                    } else if (~var11 != -2) {
                        if (var11 == 2) {
                            arg6.method3109(arg3 + 3, (byte) 4, var13, 4, arg4);
                        } else if (var11 == 3) {
                            arg6.method3114(arg4 + 3, (byte) 11, arg3, 4, var13);
                        }
                    } else {
                        arg6.method3114(arg4, (byte) 11, arg3, 4, var13);
                    }
                }
                if (var12 == 3) {
                    if (~var11 != -1) {
                        if (var11 == 1) {
                            arg6.method3118(var13, arg3 - -3, arg4, arg0 ^ -9, 1, 1);
                        } else if (~var11 != -3) {
                            if (~var11 == -4) {
                                arg6.method3118(var13, arg3, arg4 + 3, 1, 1, 1);
                            }
                        } else {
                            arg6.method3118(var13, arg3 - -3, arg4 + 3, 1, 1, 1);
                        }
                    } else {
                        arg6.method3118(var13, arg3, arg4, arg0 ^ -9, 1, 1);
                    }
                }
                if (~var12 == -3) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (var11 == 2) {
                                arg6.method3114(arg4 + 3, (byte) 11, arg3, 4, var13);
                            } else if (~var11 == -4) {
                                arg6.method3109(arg3, (byte) 4, var13, 4, arg4);
                            }
                        } else {
                            arg6.method3109(arg3 + 3, (byte) 4, var13, 4, arg4);
                        }
                    } else {
                        arg6.method3114(arg4, (byte) 11, arg3, 4, var13);
                    }
                }
            } else {
                class98.method562(true, arg3, arg4, arg6, var10, var11);
            }
        }
        class339 var14 = (class339) class700.method3933(arg1, arg2, arg5, field5044 != null ? field5044 : (field5044 = method2142("vda")));
        if (arg0 != -10) {
            method2141(-11);
        }
        if (var14 != null) {
            class441 var15 = class428.field5352.method3138((byte) 52, var14.method65((byte) 127));
            int var16 = 3 & var14.method78((byte) -71);
            int var17 = var14.method74((byte) 42);
            if (var15.field5519 == -1) {
                if (var17 == 9) {
                    int var18 = -1118482;
                    if (~var15.field5560 < -1) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && var16 != 2) {
                        arg6.method3113(1, arg4, var18, arg4 - -3, arg3, arg3 + 3);
                    } else {
                        arg6.method3113(1, arg4 - -3, var18, arg4, arg3, arg3 + 3);
                    }
                }
            } else {
                class98.method562(true, arg3, arg4, arg6, var15, var16);
            }
        }
        class339 var19 = (class339) class279.method1586(arg1, arg2, arg5);
        if (var19 != null) {
            class441 var20 = class428.field5352.method3138((byte) 65, var19.method65((byte) 127));
            int var21 = var19.method78((byte) -37) & 3;
            if (~var20.field5519 != 0) {
                class98.method562(true, arg3, arg4, arg6, var20, var21);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IBII)V", line = 373)
    private final void method2139(int arg0, byte arg1, int arg2, int arg3) {
        ++field5041;
        int var5 = arg3 > 2048 ? -(arg2 * arg3 >> 12) + arg2 + arg3 : (arg2 + 4096) * arg3 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg3 - var5 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field5032 = var15;
                                    this.field5025 = var7;
                                    this.field5030 = var5;
                                }
                            } else {
                                this.field5025 = var7;
                                this.field5032 = var5;
                                this.field5030 = var14;
                            }
                        } else {
                            this.field5030 = var7;
                            this.field5025 = var15;
                            this.field5032 = var5;
                        }
                    } else {
                        this.field5030 = var7;
                        this.field5032 = var14;
                        this.field5025 = var5;
                    }
                } else {
                    this.field5032 = var7;
                    this.field5030 = var15;
                    this.field5025 = var5;
                }
            } else {
                this.field5030 = var5;
                this.field5032 = var7;
                this.field5025 = var14;
            }
        } else {
            this.field5030 = this.field5025 = this.field5032 = arg3;
        }
        int var17 = 73 % ((-30 - arg1) / 40);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 480)
    public static void method2140(boolean arg0) {
        field5035 = null;
        field5040 = null;
        if (!arg0) {
            method2141(96);
        }
    }

    @OriginalMember(owner = "client!op", name = "i", descriptor = "(I)V", line = 492)
    public static final void method2141(int arg0) {
        ++field5029;
        if (class590.field8289.field9138) {
            class380.field4801 = 96;
        } else {
            try {
                Method var1 = (field5045 != null ? field5045 : (field5045 = method2142("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class380.field4801 = (int) (var3 / 1048576L) - -1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != -3) {
            method2136(34, -45, -10, -24, 57, -101, 86, (class566) null, 113, -4, (byte[][][]) null, 8, -34);
        }
    }
}

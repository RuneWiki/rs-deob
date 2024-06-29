import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class113 extends class23 {

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    private int field2046 = 3072;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    private int field2038 = 2048;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    private int field2053 = 1024;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "[Z")
    public static boolean[] field2045 = new boolean[100];

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Li;")
    private static class88 field2040 = class208.method1425(105, "Connection lost)3");

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Li;")
    public static class88 field2048 = class208.method1425(105, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Li;")
    public static class88 field2042 = field2040;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "[I")
    public static int[] field2052 = new int[2000];

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "Lid;")
    public static class92 field2041 = new class92(200);

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "[I")
    public static int[] field2051;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "[Lrc;")
    public static class188[] field2043;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        int[][] var3 = super.field364.method1541(true, arg0);
        ++field2044;
        if (arg1 != 13) {
            method774(34, -80, 13, -58, 70, 59, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 74, (byte) 41, 61, 36);
        }
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) -119, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; class70.field1276 > var11; ++var11) {
                var9[var11] = this.field2053 - -(var7[var11] * this.field2038 >> 12);
                var10[var11] = (var5[var11] * this.field2038 >> 12) + this.field2053;
                var8[var11] = (var6[var11] * this.field2038 >> 12) + this.field2053;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public static void method773(int arg0) {
        field2048 = null;
        if (arg0 >= 82) {
            field2041 = null;
            field2052 = null;
            field2042 = null;
            field2040 = null;
            field2051 = null;
            field2045 = null;
            field2043 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class48.field899 * 128) {
            arg0 = class48.field899 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class66.field1202 * 128) {
            arg2 = class66.field1202 * 128 - 1;
        }
        class99.field1805 = class173.field3361[arg3];
        class201.field3840 = class173.field3356[arg3];
        class168.field3244 = class173.field3361[arg4];
        class159.field3068 = class173.field3356[arg4];
        class74.field1353 = arg0;
        class241.field4463 = arg1;
        class216.field4050 = arg2;
        class79.field1435 = arg0 / 128;
        class88.field1636 = arg2 / 128;
        class155.field2995 = arg5;
        class156.field3009 = class79.field1435 - class150.field2913;
        if (class156.field3009 < 0) {
            class156.field3009 = 0;
        }
        class102.field1851 = class88.field1636 - class150.field2913;
        if (class102.field1851 < 0) {
            class102.field1851 = 0;
        }
        class6.field84 = class79.field1435 + class150.field2913;
        if (class6.field84 > class48.field899) {
            class6.field84 = class48.field899;
        }
        class230.field4316 = class88.field1636 + class150.field2913;
        if (class230.field4316 > class66.field1202) {
            class230.field4316 = class66.field1202;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class150.field2913 + class150.field2913 + 2; ++var17) {
            for (int var20 = 0; var20 < class150.field2913 + class150.field2913 + 2; ++var20) {
                int var21 = (var17 - class150.field2913 << 7) - (class74.field1353 & 127);
                int var22 = (var20 - class150.field2913 << 7) - (class216.field4050 & 127);
                int var23 = class79.field1435 - class150.field2913 + var17;
                int var24 = class88.field1636 - class150.field2913 + var20;
                if (var23 >= 0 && var24 >= 0 && var23 < class48.field899 && var24 < class66.field1202) {
                    int var25;
                    if (class154.field2981 != null) {
                        var25 = class154.field2981[0][var23][var24] - class241.field4463 + 128;
                    } else {
                        var25 = class145.field2723[0][var23][var24] - class241.field4463 + 128;
                    }
                    int var26 = class145.field2723[3][var23][var24] - class241.field4463 - 1000;
                    class48.field893[var17][var20] = class203.method1391(var21, var26, var25, var22, var16);
                } else {
                    class48.field893[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class150.field2913 + class150.field2913 + 1; ++var18) {
            for (int var19 = 0; var19 < class150.field2913 + class150.field2913 + 1; ++var19) {
                class18.field304[var18][var19] = class48.field893[var18][var19] || class48.field893[var18 + 1][var19] || class48.field893[var18][var19 + 1] || class48.field893[var18 + 1][var19 + 1];
            }
        }
        class246.field4512 = arg7;
        class44.field740 = arg8;
        class184.field3607 = arg9;
        class144.field2715 = arg10;
        class204.field3884 = arg11;
        class192.method1333();
        class118.method805(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public static final void method775(int arg0) {
        class159 var1 = (class159) class62.field1140.method1612(false);
        ++field2054;
        if (arg0 == -4197) {
            while (var1 != null) {
                if (var1.field3063 > 0) {
                    --var1.field3063;
                }
                if (var1.field3063 != 0) {
                    if (var1.field3056 > 0) {
                        --var1.field3056;
                    }
                    if (var1.field3056 == 0 && ~var1.field3061 <= -2 && var1.field3054 >= 1 && var1.field3061 <= 102 && var1.field3054 <= 102 && (~var1.field3053 > -1 || class8.method43(var1.field3064, 8, var1.field3053))) {
                        class114.method783(var1.field3057, var1.field3065, var1.field3054, var1.field3064, false, var1.field3053, var1.field3070, var1.field3061);
                        var1.field3056 = -1;
                        if (var1.field3055 == var1.field3053 && ~var1.field3055 == 0) {
                            var1.method460(true);
                        } else if (var1.field3055 == var1.field3053 && ~var1.field3070 == ~var1.field3066 && var1.field3064 == var1.field3062) {
                            var1.method460(true);
                        }
                    }
                } else if (var1.field3055 < 0 || class8.method43(var1.field3062, 8, var1.field3055)) {
                    class114.method783(var1.field3057, var1.field3065, var1.field3054, var1.field3062, false, var1.field3055, var1.field3066, var1.field3061);
                    var1.method460(true);
                }
                var1 = (class159) class62.field1140.method1621(82);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 <= 19) {
            return null;
        } else {
            ++field2039;
            int[] var3 = super.field379.method1080(false, arg0);
            if (super.field379.field3100) {
                int[] var4 = this.method120(arg0, false, 0);
                for (int var5 = 0; class70.field1276 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field2038 >> 12) + this.field2053;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            field2051 = null;
        }
        ++field2055;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field369 = arg0.method347(arg1 + 26122) == 1;
                }
            } else {
                this.field2046 = arg0.method301(25);
            }
        } else {
            this.field2053 = arg0.method301(45);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        ++field2049;
        this.field2038 = -this.field2053 + this.field2046;
        if (arg0 != -69) {
            method774(-67, -56, -56, 87, 35, 111, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 12, (byte) -14, 13, -46);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIIIII)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2050;
        if (arg2 != 12019) {
            method773(58);
        }
        if (arg1 >= 0 && ~arg6 <= -1 && arg1 < 103 && ~arg6 > -104) {
            if (~arg3 == -1) {
                class157 var8 = class192.method1334(arg5, arg1, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3030 >>> 32);
                    if (~arg0 != -3) {
                        var8.field3023 = new class81(var9, arg0, arg4, arg5, arg1, arg6, arg7, false, var8.field3023);
                    } else {
                        var8.field3023 = new class81(var9, 2, arg4 + 4, arg5, arg1, arg6, arg7, false, var8.field3023);
                        var8.field3034 = new class81(var9, 2, arg4 + 1 & 3, arg5, arg1, arg6, arg7, false, var8.field3034);
                    }
                }
            }
            if (arg3 == 1) {
                class64 var10 = class78.method522(arg5, arg1, arg6);
                if (var10 != null) {
                    int var11 = (int) (var10.field1158 >>> 32) & Integer.MAX_VALUE;
                    if (arg0 != 4 && ~arg0 != -6) {
                        if (~arg0 == -7) {
                            var10.field1159 = new class81(var11, 4, arg4 + 4, arg5, arg1, arg6, arg7, false, var10.field1159);
                        } else if (~arg0 != -8) {
                            if (~arg0 == -9) {
                                var10.field1159 = new class81(var11, 4, arg4 - -4, arg5, arg1, arg6, arg7, false, var10.field1159);
                                var10.field1160 = new class81(var11, 4, (3 & arg4 + 2) - -4, arg5, arg1, arg6, arg7, false, var10.field1160);
                            }
                        } else {
                            var10.field1159 = new class81(var11, 4, (3 & arg4 + 2) + 4, arg5, arg1, arg6, arg7, false, var10.field1159);
                        }
                    } else {
                        var10.field1159 = new class81(var11, 4, arg4, arg5, arg1, arg6, arg7, false, var10.field1159);
                    }
                }
            }
            if (~arg3 == -3) {
                if (~arg0 == -12) {
                    arg0 = 10;
                }
                class108 var12 = class204.method1398(arg5, arg1, arg6);
                if (var12 != null) {
                    var12.field1945 = new class81((int) (var12.field1950 >>> 32) & Integer.MAX_VALUE, arg0, arg4, arg5, arg1, arg6, arg7, false, var12.field1945);
                }
            }
            if (arg3 == 3) {
                class166 var13 = class54.method397(arg5, arg1, arg6);
                if (var13 != null) {
                    var13.field3196 = new class81((int) (var13.field3204 >>> 32) & Integer.MAX_VALUE, 22, arg4, arg5, arg1, arg6, arg7, false, var13.field3196);
                    return;
                }
            }
        }
    }
}

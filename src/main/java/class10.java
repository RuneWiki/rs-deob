import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class139 {

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lrf;")
    private static class163 field198 = class53.method392(95, "Invalid username or password)3");

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "Lrf;")
    public static class163 field209 = class53.method392(-42, "huffman");

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "Lrf;")
    public static class163 field208 = class53.method392(-78, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "Lrf;")
    private static class163 field203 = class53.method392(-66, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "Lrf;")
    public static class163 field204 = field203;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "Lrf;")
    private static class163 field211 = class53.method392(70, "The server is being updated)3");

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "Lrf;")
    public static class163 field212 = field198;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Lrf;")
    public static class163 field199 = field211;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Lgg;")
    public static class67 field197;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
    public static boolean field195;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field205;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (arg0 <= 53) {
            return null;
        } else {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            if (super.field2866.field885) {
                for (int var7 = 0; ~class23.field402 < ~var7; ++var7) {
                    this.method80(var7, 0, arg1);
                    int[][] var8 = this.method910((byte) -63, class17.field301, 0);
                    var4[var7] = var8[0][class3.field32];
                    var5[var7] = var8[1][class3.field32];
                    var6[var7] = var8[2][class3.field32];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)I")
    public static final int method78(int arg0, byte arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        ++field206;
        int var4 = 84 / ((arg1 - 13) / 57);
        while (~arg2 != -1) {
            int var5 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)V")
    public static void method79(byte arg0) {
        field208 = null;
        field204 = null;
        field209 = null;
        field212 = null;
        field198 = null;
        field199 = null;
        field203 = null;
        if (arg0 > -74) {
            field209 = null;
        }
        field197 = null;
        field211 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            method79((byte) -63);
        }
        ++field207;
        int[] var3 = super.field2859.method1319(-107, arg0);
        if (super.field2859.field3966) {
            for (int var4 = 0; class23.field402 > var4; ++var4) {
                this.method80(var4, 0, arg0);
                int[] var5 = this.method917(class17.field301, 0, true);
                var3[var4] = var5[class3.field32];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field210;
        if (~arg0 == -1) {
            super.field2872 = arg2.method344(255) == 1;
        }
        if (arg1 != 21) {
            method78(-92, (byte) -4, 70);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    private final void method80(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method82(true, true, -123);
        }
        ++field200;
        int var4 = class189.field3772[arg0];
        int var5 = class180.field3607[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class3.field32 = arg0;
            class17.field301 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class3.field32 = arg2;
            class17.field301 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class3.field32 = -arg2 + class23.field402;
            class17.field301 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class17.field301 = class205.field4008 - arg2;
            class3.field32 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class17.field301 = -arg2 + class205.field4008;
            class3.field32 = class23.field402 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class17.field301 = -arg0 + class205.field4008;
            class3.field32 = -arg2 + class23.field402;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class17.field301 = -arg0 + class205.field4008;
            class3.field32 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class3.field32 = class23.field402 - arg0;
            class17.field301 = arg2;
        }
        class3.field32 &= class29.field542;
        class17.field301 &= class15.field260;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class108 var20 = new class108(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class97.field2054[var21][arg1][arg2] == null) {
                    class97.field2054[var21][arg1][arg2] = new class111(var21, arg1, arg2);
                }
            }
            class97.field2054[arg0][arg1][arg2].field2350 = var20;
        } else if (arg3 != 1) {
            class46 var24 = new class46(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class97.field2054[var25][arg1][arg2] == null) {
                    class97.field2054[var25][arg1][arg2] = new class111(var25, arg1, arg2);
                }
            }
            class97.field2054[arg0][arg1][arg2].field2361 = var24;
        } else {
            class108 var22 = new class108(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class97.field2054[var23][arg1][arg2] == null) {
                    class97.field2054[var23][arg1][arg2] = new class111(var23, arg1, arg2);
                }
            }
            class97.field2054[arg0][arg1][arg2].field2350 = var22;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZI)I")
    public static final int method82(boolean arg0, boolean arg1, int arg2) {
        ++field202;
        int var3 = 0;
        if (arg2 <= 31) {
            field197 = null;
        }
        if (arg0) {
            var3 += class39.field797 + class105.field2198;
        }
        if (arg1) {
            var3 += class162.field3293 - -class89.field1931;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLrf;I)V")
    public static final void method83(boolean arg0, class163 arg1, int arg2) {
        class163 var3 = arg1.method1060(-18265);
        ++field201;
        int var4 = arg2;
        short[] var5 = new short[16];
        for (int var6 = 0; ~var6 > ~class166.field3384; ++var6) {
            class4 var9 = class97.method669(-90, var6);
            if ((!arg0 || var9.field48) && var9.field62.method1060(-18265).method1035(true, var3) != -1) {
                if (~var4 <= -251) {
                    class79.field1603 = -1;
                    class112.field2365 = null;
                    return;
                }
                if (~var4 <= ~var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; ~var4 < ~var11; ++var11) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class112.field2365 = var5;
        class79.field1603 = var4;
        class8.field176 = 0;
        class163[] var7 = new class163[class79.field1603];
        for (int var8 = 0; var8 < class79.field1603; ++var8) {
            var7[var8] = class97.method669(-118, var5[var8]).field62;
        }
        class100.method688(var7, (byte) 61, class112.field2365);
    }
}

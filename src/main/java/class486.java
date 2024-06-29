import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class486 {

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Lqv;")
    public static class316 field7047 = new class316(26, -2);

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "B")
    public byte field7045;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "F")
    public static float field7049;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public int field7038;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Ljava/lang/String;")
    public String field7035;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Ljava/lang/String;")
    public String field7039;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "Ljava/lang/String;")
    public String field7041;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/lang/String;")
    public String field7042;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[S)[S")
    public static final short[] method2861(byte arg0, short[] arg1) {
        field7043++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 > -8) {
            field7048 = -87;
        }
        short[] var2 = new short[arg1.length];
        class282.method1822(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method2862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field7040++;
        if (class146.field2262 == null) {
            return;
        }
        class23 var14 = null;
        if (arg11 <= 51) {
            return;
        }
        if (arg2 >= 0) {
            int var15 = arg2 - 1;
            class193 var16 = (class193) class390.field5539.method2284(true, (long) var15);
            if (var16 != null) {
                var14 = var16.field2805;
            }
        } else {
            int var17 = -arg2 - 1;
            if (class497.field7188 == var17) {
                var14 = class364.field5293;
            } else {
                var14 = class494.field7143[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        class261 var18 = class277.field4139.method569((byte) 122, arg13);
        int var19;
        int var20;
        if (arg1 == 1 || arg1 == 3) {
            var19 = var18.field3864;
            var20 = var18.field3859;
        } else {
            var19 = var18.field3859;
            var20 = var18.field3864;
        }
        int var21 = (var20 >> 1) + arg7;
        int var22 = (var20 + 1 >> 1) + arg7;
        int var23 = (var19 >> 1) + arg6;
        int var24 = (var19 + 1 >> 1) + arg6;
        class24 var25 = class146.field2262[arg8];
        int var26 = var25.method156(var21, var23) + var25.method156(var22, var23) - (-var25.method156(var21, var24) - var25.method156(var22, var24)) >> 2;
        class213 var27 = new class213();
        var27.field3204 = arg7;
        var27.field3223 = arg1;
        var27.field3213 = class24.field349 + arg0;
        var27.field3214 = arg13;
        var27.field3206 = class24.field349 + arg3;
        var27.field3210 = arg6;
        if (arg12 > arg5) {
            int var28 = arg12;
            arg12 = arg5;
            arg5 = var28;
        }
        var27.field3216 = var14.field6956;
        var27.field3203 = arg10;
        if (arg4 < arg9) {
            int var29 = arg9;
            arg9 = arg4;
            arg4 = var29;
        }
        var27.field3220 = arg7 + arg12;
        var27.field3217 = arg5 + arg7;
        var27.field3221 = var26;
        var27.field3211 = arg6 + arg9;
        var27.field3215 = (var27.field3204 << 7) + (var20 << 6);
        var27.field3207 = (var27.field3210 << 7) + (var19 << 6);
        var27.field3218 = arg4 + arg6;
        class317.field4718.method866((byte) 10, var27);
        var14.field341 = var27;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)I")
    public static final int method2863(byte arg0, int arg1, int arg2) {
        field7046++;
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != -91) {
            method2865(33, -79, 59);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static void method2864(byte arg0) {
        int var1 = 127 % ((-arg0 - 81) / 36);
        field7047 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
    public static final void method2865(int arg0, int arg1, int arg2) {
        if (arg1 > -104) {
            method2867(-0.9301971F, 70, -0.052344054F, 124, 1.0703244F, 112, 88, 61, -124, -127, null, -55, -32);
        }
        field7037++;
        class275 var3 = class213.method1433((byte) 98, 5, arg2);
        var3.method1778(0);
        var3.field4113 = arg0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)I")
    public static final int method2866(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 6) {
            field7049 = 1.0419439F;
        }
        field7036++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(FIFIFIIIII[FII)V")
    public static final void method2867(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg1 - arg7;
        if (arg12 >= -57) {
            return;
        }
        int var14 = arg8 - arg5;
        field7044++;
        int var15 = arg11 - arg3;
        float var16 = arg10[2] * (float) var15 + arg10[0] * (float) var13 + arg10[1] * (float) var14;
        float var17 = arg10[5] * (float) var15 + arg10[3] * (float) var13 + arg10[4] * (float) var14;
        float var18 = arg10[8] * (float) var15 + arg10[6] * (float) var13 + arg10[7] * (float) var14;
        float var19;
        float var20;
        if (arg6 == 0) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg2 + 0.5F - var18;
        } else if (arg6 == 1) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg2 + var18 + 0.5F;
        } else if (arg6 == 2) {
            var19 = arg0 + 0.5F - var16;
            var20 = arg4 + 0.5F - var17;
        } else if (arg6 == 3) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg4 + 0.5F - var17;
        } else if (arg6 == 4) {
            var19 = arg2 + var18 + 0.5F;
            var20 = arg4 + 0.5F - var17;
        } else {
            var19 = arg2 + 0.5F - var18;
            var20 = arg4 + 0.5F - var17;
        }
        if (arg9 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg9 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg9 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class250.field3726 = var19;
        class249.field3719 = var20;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class253 extends class425 {

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
    public static int[] field3745 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "Z")
    public static boolean field3751 = false;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3750;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3754;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1759(int arg0) {
        int var1 = -50 % ((arg0 + 87) / 36);
        field3753++;
        if (class449.field6416) {
            return 0;
        } else if (class296.method2000((byte) -97)) {
            return class181.field2561 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)I", line = 26)
    public static final int method1760(int arg0, int arg1, int arg2) {
        if (arg1 != -2) {
            field3745 = null;
        }
        field3752++;
        int var3 = class366.method2363(arg0 + 45365, -122, arg2 + 91923, 4) + (class366.method2363(arg0 + 10294, -77, arg2 + 37821, 2) - 128 >> 1) + (class366.method2363(arg0, -111, arg2, 1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 53)
    public static void method1761(int arg0) {
        field3745 = null;
        field3750 = null;
        int var1 = 22 / ((arg0 + 82) / 32);
        field3754 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILsg;Lvq;IIIIILbr;)V", line = 66)
    public static final void method1762(int arg0, class226 arg1, class269 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8) {
        if (arg3 != -28475) {
            method1759(-43);
        }
        field3747++;
        class297 var9 = class379.method2417(arg3 + 31619, arg6);
        if (var9 == null || !var9.field4291 || !var9.method2008(true)) {
            return;
        }
        if (var9.field4313 != null) {
            int[] var10 = new int[var9.field4313.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class336.field4878 == 4) {
                    var13 = (int) class358.field5176 & 0x3FFF;
                } else {
                    var13 = (int) class358.field5176 + class63.field842 & 0x3FFF;
                }
                int var14 = class447.field6381[var13];
                int var15 = class447.field6390[var13];
                if (class336.field4878 != 4) {
                    var14 = var14 * 256 / (class261.field3863 + 256);
                    var15 = var15 * 256 / (class261.field3863 + 256);
                }
                var10[var11 * 2] = arg8.field3250 / 2 + ((arg4 + (var9.field4313[var11 * 2] * 4)) * var15 + (var9.field4313[var11 * 2 + 1] * 4 + arg7) * var14 >> 15) + arg0;
                var10[var11 * 2 + 1] = arg8.field3282 / 2 + arg5 - ((arg7 - -(var9.field4313[var11 * 2 + 1] * 4)) * var15 + -((var9.field4313[var11 * 2] * 4 + arg4) * var14) >> 15);
            }
            class27.method144(arg2, var10, var9.field4295, arg8.field3256, arg8.field3211);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg2.method933(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field4324, 1, arg1, arg0, arg5);
            }
            arg2.method933(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4324, 1, arg1, arg0, arg5);
        }
        class256 var16 = null;
        if (var9.field4307 != -1) {
            var16 = var9.method2005(arg2, false, arg3 ^ 0x6F00);
            if (var16 != null) {
                class21.method118(arg4, arg5, arg0, arg1, arg8, var16, false, arg7);
            }
        }
        if (var9.field4310 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method80();
        }
        class335 var18 = class32.field409;
        class182 var19 = class423.field6036;
        if (var9.field4298 == 1) {
            var19 = class317.field4651;
            var18 = class402.field5648;
        }
        if (var9.field4298 == 2) {
            var18 = class154.field2285;
            var19 = class70.field934;
        }
        class231.method1601(var9.field4316, arg4, arg7, var19, 4, arg8, arg1, arg0, var9.field4310, var17, arg5, var18);
        return;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIIBI)Z", line = 177)
    public static final boolean method1763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3749++;
        if ((arg2 + arg4) > arg8 && arg2 < arg3 + arg8) {
            int var9 = 54 % ((59 - arg7) / 57);
            return arg6 < arg0 + arg5 && (arg1 + arg6) > arg5;
        } else {
            return false;
        }
    }
}

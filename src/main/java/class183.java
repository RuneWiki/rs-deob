import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class183 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Z")
    public static boolean field3378 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lkg;")
    public static class115 field3376 = new class115();

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
    public static int[] field3390 = new int[32];

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[[[Lsg;")
    public static class203[][][] field3389 = new class203[4][104][104];

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[J")
    public static long[] field3392 = new long[500];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Ldc;")
    public class37 field3385;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Z")
    public boolean field3386;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    public static int[] field3391;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ldc;B)I")
    public static final int method1224(class37 arg0, byte arg1) {
        field3380++;
        return arg1 <= 17 ? 40 : arg0.method334(-61) + 1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -7593) {
            return;
        }
        field3388++;
        class166 var10 = (class166) class20.field337.method1338(-119);
        class166 var11 = null;
        while (var10 != null) {
            if (var10.field3168 == arg3 && var10.field3175 == arg9 && var10.field3178 == arg0 && var10.field3183 == arg4) {
                var11 = var10;
                break;
            }
            var10 = (class166) class20.field337.method1332((byte) -89);
        }
        if (var11 == null) {
            var11 = new class166();
            var11.field3168 = arg3;
            var11.field3178 = arg0;
            var11.field3183 = arg4;
            var11.field3175 = arg9;
            class113.method793(arg6 ^ 0x49DA, var11);
            class20.field337.method1340(arg6 + 7615, var11);
        }
        var11.field3181 = arg7;
        var11.field3173 = arg8;
        var11.field3164 = arg1;
        var11.field3182 = arg5;
        var11.field3174 = arg2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field3390 = null;
        field3389 = null;
        field3391 = null;
        field3376 = null;
        if (arg0 == 32) {
            field3392 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        field3381++;
        class166 var1 = (class166) class20.field337.method1338(93);
        if (arg0 != 30797) {
            method1226(127);
        }
        while (var1 != null) {
            if (var1.field3182 > 0) {
                var1.field3182--;
            }
            if (var1.field3182 != 0) {
                if (var1.field3174 > 0) {
                    var1.field3174--;
                }
                if (var1.field3174 == 0 && var1.field3175 >= 1 && var1.field3178 >= 1 && var1.field3175 <= 102 && var1.field3178 <= 102 && (var1.field3164 < 0 || class128.method901(var1.field3164, var1.field3173, 73))) {
                    class141.method986(var1.field3175, var1.field3164, var1.field3178, var1.field3173, 0, var1.field3183, var1.field3168, var1.field3181);
                    var1.field3174 = -1;
                    if (var1.field3164 == var1.field3163 && var1.field3163 == -1) {
                        var1.method433(arg0 - 30797);
                    } else if (var1.field3164 == var1.field3163 && var1.field3181 == var1.field3176 && var1.field3179 == var1.field3173) {
                        var1.method433(arg0 ^ 0x784D);
                    }
                }
            } else if (var1.field3163 < 0 || class128.method901(var1.field3163, var1.field3179, 101)) {
                class141.method986(var1.field3175, var1.field3163, var1.field3178, var1.field3179, arg0 ^ 0x784D, var1.field3183, var1.field3168, var1.field3176);
                var1.method433(arg0 - 30797);
            }
            var1 = (class166) class20.field337.method1332((byte) -89);
        }
    }
}

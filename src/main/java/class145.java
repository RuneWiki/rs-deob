import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class145 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[I")
    public static int[] field2530 = new int[256];

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static volatile int field2535;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lqe;")
    public static class168 field2537;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Loe;")
    public static class256 field2531;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Loe;")
    public static class256 field2533;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Ljh;")
    public static class2 field2536;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Leg;")
    public static class5 field2534;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class93.field1467[arg0][var8][var14] == -class129.field2266) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class23.field275[arg0][arg1][arg3] + arg5;
            if (!class64.method428(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class64.method428(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class64.method428(var9, var11, var13)) {
                return false;
            } else if (class64.method428(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class158.method1034(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class64.method428(var6 + 1, class23.field275[arg0][arg1][arg3] + arg5, var7 + 1) && class64.method428(var6 + 128 - 1, class23.field275[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class64.method428(var6 + 128 - 1, class23.field275[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class64.method428(var6 + 1, class23.field275[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method980(boolean arg0) {
        field2531 = null;
        field2534 = null;
        field2536 = null;
        if (!arg0) {
            method979(90, 99, 101, -25, 34, -95);
        }
        field2530 = null;
        field2533 = null;
        field2537 = null;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class145() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/awt/Component;Lgj;II)Lgf;")
    public static final class173 method981(byte arg0, Component arg1, class239 arg2, int arg3, int arg4) {
        field2529++;
        if (class87.field1357 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class173 var5 = (class173) Class.forName("ve").getDeclaredConstructor().newInstance();
                var5.field3006 = new int[(class247.field4280 ? 2 : 1) * 256];
                var5.field3039 = arg3;
                var5.method1150(arg1);
                var5.field3043 = (arg3 & 0xFFFFFC00) + 1024;
                int var6 = -113 / ((arg0 + 33) / 61);
                if (var5.field3043 > 16384) {
                    var5.field3043 = 16384;
                }
                var5.method1142(var5.field3043);
                if (class106.field1692 > 0 && class171.field2975 == null) {
                    class171.field2975 = new class175();
                    class171.field2975.field3067 = arg2;
                    arg2.method1553((byte) 83, class106.field1692, class171.field2975);
                }
                if (class171.field2975 != null) {
                    if (class171.field2975.field3065[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class171.field2975.field3065[arg4] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class219 var7 = new class219(arg2, arg4);
                    var7.field3039 = arg3;
                    var7.field3006 = new int[(class247.field4280 ? 2 : 1) * 256];
                    var7.method1150(arg1);
                    var7.field3043 = 16384;
                    var7.method1142(var7.field3043);
                    if (class106.field1692 > 0 && class171.field2975 == null) {
                        class171.field2975 = new class175();
                        class171.field2975.field3067 = arg2;
                        arg2.method1553((byte) 90, class106.field1692, class171.field2975);
                    }
                    if (class171.field2975 != null) {
                        if (class171.field2975.field3065[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class171.field2975.field3065[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class173();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lsd;)V")
    public class145(class145 arg0) {
        this.field2527 = arg0.field2527;
        this.field2528 = arg0.field2528;
        this.field2525 = arg0.field2525;
        this.field2524 = arg0.field2524;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2530[var0] = var1;
        }
        field2532 = 10;
        field2535 = 0;
        field2537 = class66.method448("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -115);
    }
}

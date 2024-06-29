import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class202 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lpg;")
    public static class320 field3028 = new class320(64);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[B")
    public static byte[] field3029 = new byte[32896];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Z")
    public static boolean field3036;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "F")
    public static float field3038;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Ltb;")
    public static class220 field3037;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Z", line = 7)
    public static final boolean method1437(int arg0, int arg1, int arg2, int arg3) {
        if (class338.method2351(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class216.method1528(var4 + 1, class218.field3321[arg0][arg1][arg2] + arg3, var5 + 1) && class216.method1528(var4 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class216.method1528(var4 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class216.method1528(var4 + 1, class218.field3321[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 21)
    public static void method1438(byte arg0) {
        field3037 = null;
        field3029 = null;
        field3028 = null;
        if (arg0 != 90) {
            field3036 = true;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3029[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3031 = 0;
        field3034 = 0;
        field3032 = 0;
        field3033 = -2;
        field3035 = 0;
        field3036 = false;
    }
}

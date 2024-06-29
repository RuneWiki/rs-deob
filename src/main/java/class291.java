import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class291 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[J")
    public static long[] field4254 = new long[256];

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Z")
    public static boolean field4257 = false;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field4259 = -1;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
    public static int[] field4261;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lqc;")
    public static class532 field4260;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 1357) {
            method1863(true);
        }
        field4258++;
        if (class377.field5760 <= arg2 && arg3 <= class49.field701 && class463.field6924 <= arg1 && class369.field5628 >= arg4) {
            class164.method1093(arg1, arg4, arg5, arg2, arg7, arg3, -165, arg0);
        } else {
            class144.method962(arg0, arg7, arg3, (byte) 31, arg4, arg5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIFIZI)[I")
    public static final int[] method1862(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7) {
        field4255++;
        int[] var8 = new int[arg1];
        class64 var9 = new class64();
        var9.field913 = arg2;
        var9.field923 = (int) (arg4 * 4096.0F);
        var9.field921 = arg3;
        var9.field924 = arg6;
        if (arg5 != -2024) {
            field4260 = null;
        }
        var9.field919 = arg7;
        var9.field927 = arg0;
        var9.method357(50);
        class84.method576(arg1, 1, -16531);
        var9.method462(0, false, var8);
        return var8;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
    public static void method1863(boolean arg0) {
        if (!arg0) {
            field4261 = null;
        }
        field4260 = null;
        field4254 = null;
        field4261 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4254[var0] = var1;
        }
        field4261 = new int[1];
    }
}

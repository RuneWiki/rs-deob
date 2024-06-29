import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class32 {

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Lv;")
    private static class146 field292 = class159.method1226((byte) -37, "flash3:");

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lv;")
    public static class146 field291 = field292;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "Lv;")
    private static class146 field297 = class159.method1226((byte) -37, " has logged out)3");

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lv;")
    public static class146 field287 = class159.method1226((byte) -37, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lv;")
    public static class146 field283 = field292;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lv;")
    public static class146 field295 = field297;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lv;")
    private static class146 field299 = class159.method1226((byte) -37, "level)2");

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Lv;")
    public static class146 field290 = class159.method1226((byte) -37, "::errortest");

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lv;")
    public static class146 field294 = field299;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Lqb;")
    public class113 field298;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lta;")
    public static class133 field286;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Ldc;")
    public class25 field284;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[B")
    public byte[] field285;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILla;Lla;I)Lwb;")
    public static final class155 method108(boolean arg0, int arg1, class77 arg2, class77 arg3, int arg4) {
        field288++;
        boolean var5 = true;
        int[] var6 = arg2.method577(arg4, 38);
        for (int var7 = arg1; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method576(-1, arg4, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method576(-1, 0, var9);
                } else {
                    var10 = arg3.method576(arg1 - 1, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class155(arg2, arg3, arg4, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static void method109(int arg0) {
        field287 = null;
        field299 = null;
        field295 = null;
        field294 = null;
        field283 = null;
        field291 = null;
        field286 = null;
        field290 = null;
        int var1 = 120 / ((arg0 + 68) / 42);
        field292 = null;
        field297 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class193 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[Ltg;")
    public static class184[] field3737 = new class184[8];

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[J")
    public static long[] field3744 = new long[256];

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3738 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Ltg;")
    private static class184 field3741 = class135.method812("Login", 3);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ltg;")
    private static class184 field3739 = class135.method812("green:", 3);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Ltg;")
    public static class184 field3740 = field3739;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ltg;")
    public static class184 field3743 = field3741;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Ltg;")
    public static class184 field3746 = class135.method812("mapscene", 3);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Ltg;")
    public static class184 field3745 = field3739;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Ltg;")
    public static class184 field3747;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1227(int arg0) {
        field3745 = null;
        field3746 = null;
        field3747 = null;
        field3737 = null;
        field3740 = null;
        field3744 = null;
        field3743 = null;
        field3741 = null;
        field3739 = null;
        if (arg0 != -968911704) {
            method1229(-102, -127, 98);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILfb;IJ)Z")
    public static final boolean method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class52 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class138.method856(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)J")
    public static final long method1229(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 == null || var3.field1684 == null ? 0L : var3.field1684.field2435;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lvb;IILvb;Z)Lfd;")
    public static final class54 method1230(class197 arg0, int arg1, int arg2, class197 arg3, boolean arg4) {
        field3742++;
        boolean var5 = true;
        int[] var6 = arg3.method1252(arg2, 107);
        for (int var7 = arg1; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1269(arg2, arg1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg0.method1269(0, 0, var9);
                } else {
                    var10 = arg0.method1269(var9, arg1, 0);
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
            return new class54(arg3, arg0, arg2, arg4);
        } catch (Exception var11) {
            return null;
        }
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
            field3744[var0] = var1;
        }
        field3747 = class135.method812("(U0a )2 in: ", 3);
    }
}

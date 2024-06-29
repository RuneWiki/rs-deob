import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class240 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Li;")
    public static class88 field4455 = class208.method1425(105, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
    public static int[] field4456 = new int[256];

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Li;")
    public static class88 field4461 = class208.method1425(105, "mod_icons");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4460 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ldj;")
    public static class44 field4458;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[Lrh;")
    public static class193[] field4462;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public static final int method1587(int arg0, int arg1) {
        int var2 = -13 % ((arg0 - 49) / 33);
        field4457++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIJZ)Li;")
    public static final class88 method1588(boolean arg0, int arg1, long arg2, boolean arg3) {
        field4459++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        for (long var6 = arg2 / (long) arg1; var6 != 0L; var6 /= arg1) {
            var5++;
        }
        if (arg3) {
            field4455 = null;
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg2 % (long) arg1);
            arg2 /= arg1;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class88 var11 = new class88();
        var11.field1643 = var9;
        var11.field1660 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 != 32) {
            method1588(true, 69, 16L, false);
        }
        field4456 = null;
        field4462 = null;
        field4461 = null;
        field4455 = null;
        field4458 = null;
    }
}

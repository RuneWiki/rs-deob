import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class106 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lmb;")
    public static class84 field2563 = class79.method672(true, ":: (X");

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public static boolean field2565 = false;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lmb;")
    public static class84 field2575 = class79.method672(true, "titlebutton");

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lmb;")
    private static class84 field2574 = class79.method672(true, "Public chat");

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lmb;")
    public static class84 field2564 = field2574;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[I")
    public static int[] field2568 = new int[128];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Z")
    public static boolean field2573;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[[[B")
    public static byte[][][] field2569;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method882(int arg0) {
        field2563 = null;
        if (arg0 != 0) {
            return;
        }
        field2569 = null;
        field2568 = null;
        field2575 = null;
        field2564 = null;
        field2574 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static final void method883(int arg0) {
        field2571++;
        class17.field368.method599(arg0 - 153);
        if (arg0 == 48) {
            class37.field823 = class104.method860(class37.field823);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIZI)Lmb;")
    public static final class84 method884(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2562++;
        int var4 = 1;
        int var5 = arg3 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        int var8 = 0;
        if (arg2) {
            return null;
        }
        while (var4 > var8) {
            int var10 = arg3 % arg1;
            arg3 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            var8++;
        }
        class84 var9 = new class84();
        var9.field2062 = var6;
        var9.field2058 = var7;
        return var9;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class217 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[J")
    public static long[] field3741 = new long[500];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Loh;")
    private static class258 field3742 = class153.method1046("Allocating memory", 114);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
    public static boolean field3746 = false;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Loh;")
    public static class258 field3747 = class153.method1046(" ", 90);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Loh;")
    public static class258 field3743 = field3742;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lmi;")
    public static class12 field3744 = new class12();

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Loh;")
    public static class258 field3748 = class153.method1046("leuchten2:", 106);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
    public static int[] field3750 = new int[99];

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[[Z")
    public static boolean[][] field3751 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lgb;")
    public static class213 field3749;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    public static int[] field3740;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lta;", line = 5)
    public static final class263 method1469(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3939;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIIB)V", line = 22)
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field3745++;
        class179 var10 = null;
        if (arg9 != -72) {
            method1469(-107, -71, 74);
        }
        for (class179 var11 = (class179) class169.field2857.method83(-66); var11 != null; var11 = (class179) class169.field2857.method87((byte) -80)) {
            if (var11.field3198 == arg2 && var11.field3208 == arg1 && var11.field3207 == arg0 && var11.field3202 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class179();
            var10.field3208 = arg1;
            var10.field3207 = arg0;
            var10.field3198 = arg2;
            var10.field3202 = arg5;
            class106.method790(var10, -4);
            class169.field2857.method82(var10, (byte) -39);
        }
        var10.field3199 = arg7;
        var10.field3197 = arg6;
        var10.field3205 = arg3;
        var10.field3193 = arg4;
        var10.field3204 = arg8;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3750[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 83)
    public static void method1471(byte arg0) {
        field3748 = null;
        field3750 = null;
        field3742 = null;
        field3740 = null;
        field3741 = null;
        field3743 = null;
        field3749 = null;
        field3751 = (boolean[][]) null;
        field3744 = null;
        if (arg0 != 113) {
            field3751 = (boolean[][]) ((boolean[][]) null);
        }
        field3747 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)I", line = 116)
    public static final int method1472(int arg0, int arg1, int arg2) {
        class238 var3 = (class238) class287.field4943.method986((long) arg2, arg1 ^ arg1);
        field3739++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4160.length; var5++) {
                if (var3.field4153[var5] == arg0) {
                    var4 += var3.field4160[var5];
                }
            }
            return var4;
        }
    }
}

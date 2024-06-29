import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class173 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
    public static boolean field2259 = false;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field2256;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[[[Lvf;")
    public static class75[][][] field2260;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method1094(int arg0) {
        field2260 = null;
        field2256 = null;
        if (arg0 != -24012) {
            field2259 = false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFBF)I")
    public static final int method1095(float arg0, float arg1, byte arg2, float arg3) {
        field2257++;
        if (arg2 != 126) {
            method1094(-78);
        }
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var5 > var4 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLes;)Lmca;")
    public static final class5 method1096(byte arg0, class630 arg1) {
        field2258++;
        arg1.method3501(-9268);
        int var2 = arg1.method3501(arg0 ^ 0xFFFFDBF2);
        if (arg0 != 62) {
            method1094(107);
        }
        class5 var3 = class663.method3737(arg0 - 91, var2);
        var3.field128 = arg1.method3501(-9268);
        int var4 = arg1.method3501(-9268);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3501(arg0 ^ 0xFFFFDBF2);
            var3.method47(1, arg1, var6);
        }
        var3.method46(-8);
        return var3;
    }
}

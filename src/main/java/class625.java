import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class625 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field8713 = 1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lc;")
    public static class200[] field8712 = new class200[14];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
    public static boolean field8714 = true;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field8718 = 13156520;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[[I")
    public static int[][] field8717;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 5)
    public static void method3518(byte arg0) {
        field8712 = null;
        field8717 = null;
        int var1 = 13 / ((arg0 + 50) / 34);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIII)Z", line = 17)
    public static final boolean method3519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8715++;
        if (!class70.method628((byte) -51, arg2, arg5, arg1)) {
            return false;
        }
        int var10 = class508.field6979[1];
        int var11 = class508.field6979[2];
        int var12 = class508.field6979[0];
        if (!class70.method628((byte) -51, arg3, arg6, arg9)) {
            return false;
        }
        int var13 = class508.field6979[2];
        int var14 = class508.field6979[1];
        int var15 = class508.field6979[0];
        int var16 = 34 / ((-arg7 - 23) / 51);
        if (class70.method628((byte) -51, arg0, arg8, arg4)) {
            int var17 = class508.field6979[2];
            int var18 = class508.field6979[0];
            int var19 = class508.field6979[1];
            return class684.method3854(var14, var18, var13, var12, var15, var10, true, var17, var11, var19);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lfe;Z)Ldm;", line = 61)
    public static final class58 method3520(class597 arg0, boolean arg1) {
        field8716++;
        class58 var2;
        if (class27.field512 == null) {
            var2 = new class58();
        } else {
            var2 = class27.field512;
            class27.field512 = class27.field512.field811;
            class130.field2263--;
            var2.field811 = null;
        }
        if (arg1) {
            field8714 = true;
        }
        var2.field815 = arg0;
        return var2;
    }
}

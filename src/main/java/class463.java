import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class463 {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lvn;")
    public static class206 field6903 = null;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Z")
    public static boolean field6905 = false;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ll;")
    public static class16 field6904;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2838(boolean arg0, int arg1) {
        field6900++;
        for (class36 var2 = (class36) class69.field806.method970(12); var2 != null; var2 = (class36) class69.field806.method976((byte) -128)) {
            if (class497.method2990(var2.field361, 82) && (long) arg1 == var2.field367) {
                return true;
            }
        }
        if (!arg0) {
            field6903 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method2839(boolean arg0) {
        if (!arg0) {
            field6902 = 119;
        }
        field6903 = null;
        field6904 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lug;B)Lth;")
    public static final class425 method2840(class396 arg0, byte arg1) {
        int var2 = 99 % ((arg1 + 26) / 38);
        field6901++;
        return new class425(arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2396((byte) 112), arg0.method2388((byte) -120));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6899++;
        int var7 = arg0 + arg4;
        int var8 = arg5 - arg4;
        for (int var9 = arg0; var9 < var7; var9++) {
            class476.method2907(arg1, 35, arg6, class5.field54[var9], arg3);
        }
        int var10 = arg1 - arg4;
        int var11 = -73 % ((44 - arg2) / 49);
        for (int var12 = arg5; var12 > var8; var12--) {
            class476.method2907(arg1, 30, arg6, class5.field54[var12], arg3);
        }
        int var13 = arg3 + arg4;
        for (int var14 = var7; var14 <= var8; var14++) {
            int[] var15 = class5.field54[var14];
            class476.method2907(var13, 68, arg6, var15, arg3);
            class476.method2907(arg1, 79, arg6, var15, var10);
        }
    }
}

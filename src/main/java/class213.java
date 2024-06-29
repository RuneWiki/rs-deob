import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class213 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
    public static int[] field2847 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lls;")
    public static class296 field2850 = new class296();

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
    public static boolean field2853 = true;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lrf;")
    public static class442[] field2855 = new class442[14];

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Llm;")
    public static class347 field2851;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Llm;")
    public static class347 field2854;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[[[Lgk;")
    public static class254[][][] field2852;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 19)
    public static void method1263(byte arg0) {
        field2855 = null;
        field2851 = null;
        if (arg0 < -82) {
            field2852 = null;
            field2854 = null;
            field2850 = null;
            field2847 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZIIIII)V", line = 39)
    public static final void method1264(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2849++;
        class394 var7 = class388.method2492((byte) 109, arg2, arg5);
        if (var7 != null && var7.field5642 != null) {
            class192 var8 = new class192();
            var8.field2566 = var7;
            var8.field2578 = var7.field5642;
            class123.method783(var8);
        }
        class263.field3821 = arg1;
        class442.field6471 = arg5;
        class445.field6532 = arg3;
        class212.field2842 = arg6;
        class189.field2547 = arg0;
        class71.field995 = arg4;
        class306.field4506 = arg2;
        class407.method2621(var7, 15);
    }
}

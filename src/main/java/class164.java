import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class164 {

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[I")
    public static int[] field2277 = new int[1000];

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2276 = "Created gameworld";

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2274 = "Prepared sound engine";

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2280 = "Connected to update server";

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[Lgk;")
    public static class159[] field2278 = new class159[14];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public static void method1086(boolean arg0) {
        field2278 = null;
        field2277 = null;
        field2280 = null;
        if (!arg0) {
            field2276 = null;
        }
        field2274 = null;
        field2276 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIILsa;Lsa;IIJ)V")
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, class268 arg4, class268 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class197 var10 = new class197();
        var10.field2719 = arg8;
        var10.field2729 = arg1 * 128 + 64;
        var10.field2721 = arg2 * 128 + 64;
        var10.field2722 = arg3;
        var10.field2725 = arg4;
        var10.field2727 = arg5;
        var10.field2720 = arg6;
        var10.field2724 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class194.field2682[var11][arg1][arg2] == null) {
                class194.field2682[var11][arg1][arg2] = new class89(var11, arg1, arg2);
            }
        }
        class194.field2682[arg0][arg1][arg2].field1244 = var10;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z")
    public static final boolean method1088(int arg0, int arg1) {
        class215.field3245 = arg0 + 1 & arg1;
        field2279++;
        class94.field1314 = true;
        return true;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class187 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3286 = 0;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3289 = -1;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
    public static boolean field3292 = false;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lqe;")
    private static class168 field3293 = class66.method448("Members object", -112);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lqe;")
    public static class168 field3288 = field3293;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILoe;Loe;)V")
    public static final void method1215(int arg0, class256 arg1, class256 arg2) {
        int var3 = -29 % ((arg0 - 69) / 55);
        field3291++;
        class38.field515 = arg2;
        class111.field1775 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1216(int arg0, int arg1, int arg2, int arg3) {
        if (class158.method1034(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class64.method428(var4 + 1, class23.field275[arg0][arg1][arg2] + arg3, var5 + 1) && class64.method428(var4 + 128 - 1, class23.field275[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class64.method428(var4 + 128 - 1, class23.field275[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class64.method428(var4 + 1, class23.field275[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIIII)V")
    public static final void method1217(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3287++;
        class249.field4314 = arg4;
        class174.field3055 = arg2;
        if (arg0 != 122) {
            method1217((byte) -3, 8, -96, -24, -84);
        }
        class222.field3811 = arg1;
        class196.field3402 = arg3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1218(boolean arg0) {
        if (!arg0) {
            field3293 = null;
        }
        field3288 = null;
        field3293 = null;
    }
}

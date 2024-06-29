import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class155 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lok;")
    private static class146 field2599 = class235.method1724(-12908, "Loaded title screen");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lok;")
    public static class146 field2598 = field2599;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lcl;")
    public static class128 field2600;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1208(int arg0) {
        field2602++;
        class245.field4052.method791(arg0 ^ 0x18);
        if (arg0 == 16) {
            class187.field3108.method791(arg0 - 8);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method1209(int arg0, int arg1, int arg2, int arg3) {
        class11 var4 = class203.field3382[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class19 var5 = var4.field223;
        if (var5 != null) {
            var5.field366 = var5.field366 * arg3 / 16;
            var5.field369 = var5.field369 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 41)
    public static void method1210(boolean arg0) {
        field2600 = null;
        if (!arg0) {
            field2598 = (class146) null;
        }
        field2598 = null;
        field2599 = null;
    }
}

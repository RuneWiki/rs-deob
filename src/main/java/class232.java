import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class232 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Ldh;")
    public static class320 field2709 = new class320(69, 4);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[[B")
    public static byte[][] field2708;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method1344(boolean arg0) {
        field2708 = null;
        field2709 = null;
        if (!arg0) {
            field2709 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)I")
    public static final int method1345(int arg0, boolean arg1) {
        field2711++;
        return arg1 ? 125 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public static final void method1346(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class334.method1997(var3.field9728);
        class334.method1997(var3.field9725);
        if (var3.field9728 != null) {
            var3.field9728 = null;
        }
        if (var3.field9725 != null) {
            var3.field9725 = null;
        }
    }
}

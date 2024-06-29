import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class164 extends class519 {

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "B")
    public byte field2596 = 5;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lec;")
    public static class68 field2598 = null;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Z")
    public static boolean field2597 = false;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Z")
    public boolean field2605;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "[I")
    public static int[] field2603;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V", line = 3)
    public static void method1127(boolean arg0) {
        field2603 = null;
        field2598 = null;
        if (!arg0) {
            method1127(false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I", line = 36)
    public static final int method1128(byte arg0, int arg1) {
        field2604++;
        if (arg0 != -123) {
            field2598 = null;
        }
        return arg1 == 16711935 ? -1 : class125.method981(-218, arg1);
    }
}

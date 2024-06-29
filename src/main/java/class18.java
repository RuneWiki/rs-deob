import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lgd;")
    private static class40 field436 = class14.method90(false, "Unable to find ");

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lgd;")
    public static class40 field445 = class14.method90(false, "::fpson");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    public static int[] field432 = new int[128];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lgd;")
    public static class40 field438 = field436;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field440 = -1;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lgd;")
    public static class40 field447 = class14.method90(false, "(U");

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lba;")
    public static class7 field435 = new class7(20);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Loc;")
    public static class86 field446;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method104(boolean arg0) {
        field437++;
        if (arg0) {
            method104(false);
        }
        class38.field934.method40((byte) -101);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 45)
    public static void method105(boolean arg0) {
        field436 = null;
        field432 = null;
        field447 = null;
        field435 = null;
        field446 = null;
        if (!arg0) {
            method105(true);
        }
        field438 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)I", line = 72)
    public static final int method106(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field444++;
            long var3 = (long) ((arg0 << 16) + arg1);
            return class129.field3080 != null && class129.field3080.field2647 == var3 ? class45.field1138.field2563 * 99 / (class45.field1138.field2554.length - class129.field3080.field1892) + 1 : 0;
        } else {
            return 113;
        }
    }
}

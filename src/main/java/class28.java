import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class137 {

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Z")
    public boolean field732 = false;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Laf;")
    public static class7 field733 = class48.method406(40, "::qa_op_test");

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Laf;")
    private static class7 field735 = class48.method406(40, "You have only just left another world)3");

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Laf;")
    public static class7 field739 = class48.method406(40, "headicons_pk");

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Laf;")
    private static class7 field728 = class48.method406(40, "Examine");

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "[I")
    public static int[] field730 = new int[100];

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Laf;")
    public static class7 field740 = field735;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Laf;")
    public static class7 field736 = field728;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lg;")
    public static class43 field729 = new class43();

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
    public static boolean field727;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I")
    public static final int method251(int arg0, int arg1) {
        field731++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg1 != -19287) {
            return 94;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method252(int arg0) {
        field736 = null;
        field728 = null;
        field733 = null;
        field739 = null;
        field735 = null;
        field740 = null;
        if (arg0 != 31658) {
            field740 = null;
        }
        field730 = null;
        field729 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class153 extends class206 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lwa;")
    public static class75 field2626 = class66.method560(":trade:", false);

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field2635 = 0;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
    public static boolean field2625 = false;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lwa;")
    public static class75 field2636 = class66.method560("p12_full", false);

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
    public static boolean field2633 = true;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[Lwa;")
    public static class75[] field2637 = new class75[100];

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Z")
    public static boolean field2632 = false;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[[[I")
    public static int[][][] field2631;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 11)
    public static void method1168(int arg0) {
        field2626 = null;
        field2631 = (int[][][]) null;
        field2636 = null;
        field2637 = null;
        if (arg0 != 50) {
            field2631 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V", line = 24)
    public static final void method1169(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (arg0 == 37) {
            class7.field102 = 3.0F;
        } else if (arg0 == 50) {
            class7.field102 = 4.0F;
        } else if (arg0 == 75) {
            class7.field102 = 6.0F;
        } else {
            class7.field102 = 8.0F;
        }
        field2639++;
        class167.field2813 = -1;
        class167.field2813 = -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 67)
    public static final void method1170(int arg0, int arg1) {
        class167.field2813 = -1;
        class104.field1774 = -1;
        class76.field1320 = arg1;
        class3.method15(8887);
        int var2 = -106 / ((arg0 + 33) / 58);
        field2630++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)Ldd;", line = 87)
    public static final class235 method1171(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4096;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 107)
    public static final void method1172(int arg0) {
        field2634++;
        if (arg0 != -1) {
            method1170(-57, 12);
        }
        class12.field157.method1201(arg0 ^ 0x4E8E);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V", line = 125)
    public static final void method1173(int arg0, boolean arg1) {
        field2627++;
        if (class51.method375(arg0, -114)) {
            class156.method1186(93, -1, class249.field4198[arg0]);
            if (arg1) {
                method1171(-16, -68, -54);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class107 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Z")
    public static boolean field1625 = true;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Lkr;")
    public static class265 field1626 = new class265();

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
    public static boolean field1628 = false;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
    public static int[] field1629 = new int[2];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[[[B")
    public static byte[][][] field1627;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILfi;)V", line = 4)
    public static final void method846(int arg0, int arg1, int arg2, class38 arg3) {
        field1624++;
        if (class374.field5527 != null || class256.field4112 || arg3 == null || class36.method237(arg2 + 38062, arg3) == null) {
            return;
        }
        class374.field5527 = arg3;
        class530.field7741 = class36.method237(26250, arg3);
        class299.field4606 = arg0;
        if (arg2 == -11812) {
            class499.field7263 = 0;
            class515.field7500 = arg1;
            class155.field2384 = false;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 42)
    public static void method847(int arg0) {
        field1627 = null;
        field1629 = null;
        field1626 = null;
        if (arg0 != 0) {
            method846(-46, 47, -93, null);
        }
    }
}

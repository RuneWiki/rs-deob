import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class184 extends class13 {

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lcga;")
    public static class482 field2779 = new class482();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Z")
    public static boolean field2782 = true;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Z")
    public static boolean field2785 = false;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static volatile int field2784 = -1;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[[I")
    public static int[][] field2786 = new int[128][128];

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lbca;")
    public static class661 field2783;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "[I")
    public static int[] field2787;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[Z")
    public static boolean[] field2781;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZD)V")
    public static final void method1343(boolean arg0, double arg1) {
        class211.field3000.method778(class99.field1740);
        field2780++;
        if (!arg0) {
            method1344(10);
        }
        class211.field3000.method752(0, 0, (int) arg1);
        class569.field7823.method210(class211.field3000);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1344(int arg0) {
        int var1 = -61 % ((arg0 + 73) / 32);
        field2783 = null;
        field2787 = null;
        field2781 = null;
        field2779 = null;
        field2786 = null;
    }
}

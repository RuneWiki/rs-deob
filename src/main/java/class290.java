import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class290 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field4621 = 16777215;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field4628 = 8;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    public static int[] field4635 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4622 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    public static boolean field4630 = false;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4637 = "Loaded fonts";

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lsa;")
    public static class244 field4636;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
    public boolean field4627;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[[[I")
    public static int[][][] field4634;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILeh;Z)V")
    public final void method1956(int arg0, class101 arg1, boolean arg2) {
        while (true) {
            int var4 = arg1.method669((byte) 36);
            if (var4 == 0) {
                field4632++;
                if (arg2) {
                    method1957(-79);
                    return;
                }
                return;
            }
            this.method1959(arg1, var4, (byte) 102, arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        if (arg0 < 103) {
            field4622 = 13;
        }
        field4626++;
        class168.field2778.method199(39, -47);
        class154.field2583++;
        class168.field2778.method639(class198.field3199, 15267);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILvh;)Lid;")
    public static final class100 method1958(byte arg0, int arg1, class108 arg2) {
        field4639++;
        if (arg0 != -101) {
            field4622 = -64;
        }
        return class60.method375((byte) -39, arg1, arg2) ? class195.method1281(arg0 ^ 0xFFFFB961) : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Leh;IBI)V")
    private final void method1959(class101 arg0, int arg1, byte arg2, int arg3) {
        if (arg1 == 1) {
            this.field4628 = arg0.method677(false);
        } else if (arg1 == 2) {
            this.field4627 = true;
        } else if (arg1 == 3) {
            this.field4633 = arg0.method686(-3);
            this.field4631 = arg0.method686(-3);
            this.field4638 = arg0.method686(-3);
        } else if (arg1 == 4) {
            this.field4623 = arg0.method669((byte) 36);
        } else if (arg1 == 5) {
            this.field4624 = arg0.method677(false);
        } else if (arg1 == 6) {
            this.field4621 = arg0.method658(22292);
        }
        if (arg2 < 75) {
            this.field4633 = -13;
        }
        field4625++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method1960(int arg0) {
        if (arg0 >= -59) {
            method1960(-5);
        }
        field4635 = null;
        field4637 = null;
        field4636 = null;
        field4634 = null;
    }
}

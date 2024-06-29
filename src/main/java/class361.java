import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class361 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private int field4670;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lra;")
    public static class361 field4667 = new class361(21, 4);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[[I")
    public static int[][] field4672 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lufa;")
    public static class140 field4671;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lqe;")
    public static class80 field4669;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method2069(int arg0) {
        field4673++;
        if (class566.field7391 == 9) {
            class442.method2508(5, 1);
        } else if (class566.field7391 == 5 || class566.field7391 == 6) {
            class442.method2508(3, 1);
        } else if (class566.field7391 == 12) {
            class442.method2508(3, 1);
        }
        int var1 = -6 / ((-arg0 - 56) / 33);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z")
    public static final boolean method2070(int arg0, int arg1) {
        field4668++;
        if (arg1 > -88) {
            field4672 = null;
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
    public final int method2071(int arg0) {
        field4674++;
        if (arg0 >= -19) {
            field4666 = 71;
        }
        return this.field4670;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V")
    public class361(int arg0, int arg1) {
        this.field4670 = arg0;
        this.field4665 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4675++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method2072(boolean arg0) {
        field4672 = null;
        field4667 = null;
        field4671 = null;
        if (!arg0) {
            method2070(81, 10);
        }
        field4669 = null;
    }
}

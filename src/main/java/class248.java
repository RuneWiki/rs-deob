import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class248 extends class171 {

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "J")
    public long field3801;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
    public static int[] field3802 = new int[14];

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Lse;")
    public static class211 field3798 = null;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "[Lql;")
    public static class224[] field3803 = new class224[2048];

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[Lke;")
    public static class110[] field3799;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[[S")
    public static short[][] field3795;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public static final void method1664(int arg0, int arg1) {
        if (arg1 >= -97) {
            field3799 = null;
        }
        class208.field2953.method536(-74, arg0);
        field3800++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    public static final void method1665(int arg0, int arg1) {
        field3796++;
        class68.field925--;
        if (class68.field925 == arg0) {
            return;
        }
        class115.method773(class285.field4468, arg0 + 1, class285.field4468, arg0, class68.field925 - arg0);
        if (arg1 != -10872) {
            return;
        }
        class115.method773(class41.field612, arg0 + 1, class41.field612, arg0, class68.field925 - arg0);
        class115.method780(class227.field3444, arg0 + 1, class227.field3444, arg0, class68.field925 - arg0);
        class115.method778(class221.field3306, arg0 + 1, class221.field3306, arg0, class68.field925 - arg0);
        class115.method774(class278.field4316, arg0 + 1, class278.field4316, arg0, class68.field925 - arg0);
        class115.method780(class219.field3299, arg0 + 1, class219.field3299, arg0, class68.field925 - arg0);
        class115.method780(class144.field2001, arg0 + 1, class144.field2001, arg0, class68.field925 - arg0);
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field3803 = null;
        if (arg0 >= -110) {
            method1664(102, 125);
        }
        field3798 = null;
        field3799 = null;
        field3802 = null;
        field3795 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class248() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(J)V")
    public class248(long arg0) {
        this.field3801 = arg0;
    }
}

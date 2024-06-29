import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class134 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lqk;")
    public static class1 field1715 = new class1(66, -1);

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[I")
    public static int[] field1719 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljn;")
    public static class134 field1717 = new class134(46, 7);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field1711++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I", line = 12)
    public final int method902(int arg0) {
        field1714++;
        if (arg0 != 66) {
            this.toString();
        }
        return this.field1712;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 37)
    public static void method903(boolean arg0) {
        if (!arg0) {
            field1717 = null;
        }
        field1715 = null;
        field1717 = null;
        field1719 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V", line = 48)
    public class134(int arg0, int arg1) {
        this.field1712 = arg0;
        this.field1718 = arg1;
    }
}

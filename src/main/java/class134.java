import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class134 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[Lai;")
    public static class217[] field1778 = new class217[16];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public static int[] field1773 = new int[1000];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lgh;")
    public static class54 field1776 = new class54(9, 0, 4, 1);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!f", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field1775++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V", line = 24)
    public class134(int arg0, int arg1) {
        this.field1774 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 35)
    public static void method780(byte arg0) {
        field1776 = null;
        if (arg0 < 113) {
            method780((byte) 18);
        }
        field1778 = null;
        field1773 = null;
    }
}

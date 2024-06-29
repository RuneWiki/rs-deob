import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class515 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
    public static int[] field7612 = new int[13];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    public static int[] field7615 = new int[1000];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field7614;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lni;")
    public class361 field7616;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Ldr;")
    public static class504 field7618;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[I")
    public int[] field7613;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method3073(int arg0) {
        if (arg0 != 500) {
            return;
        }
        field7617++;
        class216.field3010 = class407.field5952.field7155 + class407.field5952.field7165 + 2;
        class171.field2544 = class278.field3809.field7155 + class278.field3809.field7165 + 2;
        class63.field790 = new String[500];
        for (int var1 = 0; var1 < class63.field790.length; var1++) {
            class63.field790[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method3074(byte arg0) {
        field7612 = null;
        if (arg0 < -42) {
            field7615 = null;
            field7618 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class381 extends class48 {

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "B")
    public byte field5916;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public int field5920;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "Lie;")
    public class6 field5915;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "Lie;")
    public static class6 field5919;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)V", line = 7)
    public static void method2499(int arg0) {
        field5919 = null;
        if (arg0 != 0) {
            field5919 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I", line = 17)
    public final int method553(int arg0) {
        ++field5917;
        if (arg0 != 100) {
            this.method552(true);
        }
        return this.field5915 == null ? 0 : this.field5915.field57 * 100 / (this.field5915.field96.length + -this.field5916);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)[B", line = 34)
    public final byte[] method552(boolean arg0) {
        if (arg0) {
            field5919 = null;
        }
        ++field5918;
        if (!super.field644 && ~this.field5915.field57 <= ~(this.field5915.field96.length + -this.field5916)) {
            return this.field5915.field96;
        } else {
            throw new RuntimeException();
        }
    }
}

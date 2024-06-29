import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class100 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    public int[] field1646;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    public int[] field1647;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 7)
    public class100() {
        class33.method229(16);
        this.field1649 = class33.method232() == 0 ? 1 : class33.method229(4) + 1;
        if (class33.method232() != 0) {
            class33.method229(8);
        }
        class33.method229(2);
        if (this.field1649 > 1) {
            this.field1648 = class33.method229(4);
        }
        this.field1646 = new int[this.field1649];
        this.field1647 = new int[this.field1649];
        for (int var1 = 0; var1 < this.field1649; var1++) {
            class33.method229(8);
            this.field1646[var1] = class33.method229(8);
            this.field1647[var1] = class33.method229(8);
        }
    }
}

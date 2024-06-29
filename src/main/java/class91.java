import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class91 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[I")
    public int[] field1673;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 7)
    public class91() {
        class57.method441(16);
        this.field1670 = class57.method443() == 0 ? 1 : class57.method441(4) + 1;
        if (class57.method443() != 0) {
            class57.method441(8);
        }
        class57.method441(2);
        if (this.field1670 > 1) {
            this.field1671 = class57.method441(4);
        }
        this.field1672 = new int[this.field1670];
        this.field1673 = new int[this.field1670];
        for (int var1 = 0; var1 < this.field1670; var1++) {
            class57.method441(8);
            this.field1672[var1] = class57.method441(8);
            this.field1673[var1] = class57.method441(8);
        }
    }
}

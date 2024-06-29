import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class93 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public int[] field1529;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    public int[] field1530;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 7)
    public class93() {
        class296.method2087(16);
        this.field1531 = class296.method2083() == 0 ? 1 : class296.method2087(4) + 1;
        if (class296.method2083() != 0) {
            class296.method2087(8);
        }
        class296.method2087(2);
        if (this.field1531 > 1) {
            this.field1528 = class296.method2087(4);
        }
        this.field1529 = new int[this.field1531];
        this.field1530 = new int[this.field1531];
        for (int var1 = 0; var1 < this.field1531; var1++) {
            class296.method2087(8);
            this.field1529[var1] = class296.method2087(8);
            this.field1530[var1] = class296.method2087(8);
        }
    }
}

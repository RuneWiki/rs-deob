import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
    public int[] field1439;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public int[] field1436;

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class69() {
        class95.method761(16);
        this.field1437 = class95.method758() == 0 ? 1 : class95.method761(4) + 1;
        if (class95.method758() != 0) {
            class95.method761(8);
        }
        class95.method761(2);
        if (this.field1437 > 1) {
            this.field1438 = class95.method761(4);
        }
        this.field1439 = new int[this.field1437];
        this.field1436 = new int[this.field1437];
        for (int var1 = 0; var1 < this.field1437; var1++) {
            class95.method761(8);
            this.field1439[var1] = class95.method761(8);
            this.field1436[var1] = class95.method761(8);
        }
    }
}

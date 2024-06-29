import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class83 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public int[] field1526;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public int[] field1527;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class83() {
        class195.method1355(16);
        this.field1525 = class195.method1350() == 0 ? 1 : class195.method1355(4) + 1;
        if (class195.method1350() != 0) {
            class195.method1355(8);
        }
        class195.method1355(2);
        if (this.field1525 > 1) {
            this.field1524 = class195.method1355(4);
        }
        this.field1526 = new int[this.field1525];
        this.field1527 = new int[this.field1525];
        for (int var1 = 0; var1 < this.field1525; var1++) {
            class195.method1355(8);
            this.field1526[var1] = class195.method1355(8);
            this.field1527[var1] = class195.method1355(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class121 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public int[] field2604;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public int[] field2602;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class121() {
        class201.method1325(16);
        this.field2603 = class201.method1323() == 0 ? 1 : class201.method1325(4) + 1;
        if (class201.method1323() != 0) {
            class201.method1325(8);
        }
        class201.method1325(2);
        if (this.field2603 > 1) {
            this.field2601 = class201.method1325(4);
        }
        this.field2604 = new int[this.field2603];
        this.field2602 = new int[this.field2603];
        for (int var1 = 0; var1 < this.field2603; var1++) {
            class201.method1325(8);
            this.field2604[var1] = class201.method1325(8);
            this.field2602[var1] = class201.method1325(8);
        }
    }
}

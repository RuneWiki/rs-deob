import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class101 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
    public int[] field1281;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class101() {
        class299.method1850(16);
        this.field1280 = class299.method1844() == 0 ? 1 : class299.method1850(4) + 1;
        if (class299.method1844() != 0) {
            class299.method1850(8);
        }
        class299.method1850(2);
        if (this.field1280 > 1) {
            this.field1279 = class299.method1850(4);
        }
        this.field1281 = new int[this.field1280];
        this.field1282 = new int[this.field1280];
        for (int var1 = 0; var1 < this.field1280; var1++) {
            class299.method1850(8);
            this.field1281[var1] = class299.method1850(8);
            this.field1282[var1] = class299.method1850(8);
        }
    }
}

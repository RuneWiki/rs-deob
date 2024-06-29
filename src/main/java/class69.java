import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class69 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public int[] field1196;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public int[] field1193;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class69() {
        class184.method1295(16);
        this.field1194 = class184.method1297() == 0 ? 1 : class184.method1295(4) + 1;
        if (class184.method1297() != 0) {
            class184.method1295(8);
        }
        class184.method1295(2);
        if (this.field1194 > 1) {
            this.field1195 = class184.method1295(4);
        }
        this.field1196 = new int[this.field1194];
        this.field1193 = new int[this.field1194];
        for (int var1 = 0; var1 < this.field1194; var1++) {
            class184.method1295(8);
            this.field1196[var1] = class184.method1295(8);
            this.field1193[var1] = class184.method1295(8);
        }
    }
}

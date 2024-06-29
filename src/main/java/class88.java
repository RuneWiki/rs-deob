import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class88 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public int[] field1431;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public int[] field1434;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 7)
    public class88() {
        class135.method983(16);
        this.field1432 = class135.method986() == 0 ? 1 : class135.method983(4) + 1;
        if (class135.method986() != 0) {
            class135.method983(8);
        }
        class135.method983(2);
        if (this.field1432 > 1) {
            this.field1433 = class135.method983(4);
        }
        this.field1431 = new int[this.field1432];
        this.field1434 = new int[this.field1432];
        for (int var1 = 0; var1 < this.field1432; var1++) {
            class135.method983(8);
            this.field1431[var1] = class135.method983(8);
            this.field1434[var1] = class135.method983(8);
        }
    }
}

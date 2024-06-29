import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class150 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    public int[] field1903;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public int[] field1904;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class150() {
        class102.method550(16);
        this.field1905 = class102.method551() == 0 ? 1 : class102.method550(4) + 1;
        if (class102.method551() != 0) {
            class102.method550(8);
        }
        class102.method550(2);
        if (this.field1905 > 1) {
            this.field1906 = class102.method550(4);
        }
        this.field1903 = new int[this.field1905];
        this.field1904 = new int[this.field1905];
        for (int var1 = 0; var1 < this.field1905; var1++) {
            class102.method550(8);
            this.field1903[var1] = class102.method550(8);
            this.field1904[var1] = class102.method550(8);
        }
    }
}

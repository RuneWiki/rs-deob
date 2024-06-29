import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class98 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
    public int[] field1580;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
    public int[] field1577;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class98() {
        class108.method690(16);
        this.field1579 = class108.method696() == 0 ? 1 : class108.method690(4) + 1;
        if (class108.method696() != 0) {
            class108.method690(8);
        }
        class108.method690(2);
        if (this.field1579 > 1) {
            this.field1578 = class108.method690(4);
        }
        this.field1580 = new int[this.field1579];
        this.field1577 = new int[this.field1579];
        for (int var1 = 0; var1 < this.field1579; var1++) {
            class108.method690(8);
            this.field1580[var1] = class108.method690(8);
            this.field1577[var1] = class108.method690(8);
        }
    }
}

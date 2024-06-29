import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class107 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public int[] field1580;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
    public int[] field1581;

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 7)
    public class107() {
        class3.method20(16);
        this.field1583 = class3.method22() == 0 ? 1 : class3.method20(4) + 1;
        if (class3.method22() != 0) {
            class3.method20(8);
        }
        class3.method20(2);
        if (this.field1583 > 1) {
            this.field1582 = class3.method20(4);
        }
        this.field1580 = new int[this.field1583];
        this.field1581 = new int[this.field1583];
        for (int var1 = 0; var1 < this.field1583; var1++) {
            class3.method20(8);
            this.field1580[var1] = class3.method20(8);
            this.field1581[var1] = class3.method20(8);
        }
    }
}

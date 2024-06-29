import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class557 {

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public int field7505;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public int field7504;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
    public int[] field7506;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
    public int[] field7507;

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 7)
    public class557() {
        class61.method430(16);
        this.field7505 = class61.method422() == 0 ? 1 : class61.method430(4) + 1;
        if (class61.method422() != 0) {
            class61.method430(8);
        }
        class61.method430(2);
        if (this.field7505 > 1) {
            this.field7504 = class61.method430(4);
        }
        this.field7506 = new int[this.field7505];
        this.field7507 = new int[this.field7505];
        for (int var1 = 0; var1 < this.field7505; var1++) {
            class61.method430(8);
            this.field7506[var1] = class61.method430(8);
            this.field7507[var1] = class61.method430(8);
        }
    }
}

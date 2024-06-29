import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class311 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[I")
    public int[] field3852;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
    public int[] field3853;

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
    public class311() {
        class527.method3153(16);
        this.field3854 = class527.method3150() == 0 ? 1 : class527.method3153(4) + 1;
        if (class527.method3150() != 0) {
            class527.method3153(8);
        }
        class527.method3153(2);
        if (this.field3854 > 1) {
            this.field3855 = class527.method3153(4);
        }
        this.field3852 = new int[this.field3854];
        this.field3853 = new int[this.field3854];
        for (int var1 = 0; var1 < this.field3854; var1++) {
            class527.method3153(8);
            this.field3852[var1] = class527.method3153(8);
            this.field3853[var1] = class527.method3153(8);
        }
    }
}

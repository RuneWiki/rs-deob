import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    public int[] field144;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public int[] field145;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class20() {
        class568.method3318(16);
        this.field142 = class568.method3309() == 0 ? 1 : class568.method3318(4) + 1;
        if (class568.method3309() != 0) {
            class568.method3318(8);
        }
        class568.method3318(2);
        if (this.field142 > 1) {
            this.field143 = class568.method3318(4);
        }
        this.field144 = new int[this.field142];
        this.field145 = new int[this.field142];
        for (int var1 = 0; var1 < this.field142; var1++) {
            class568.method3318(8);
            this.field144[var1] = class568.method3318(8);
            this.field145[var1] = class568.method3318(8);
        }
    }
}

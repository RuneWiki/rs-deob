import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class202 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    public int[] field3182;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    public int[] field3180;

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class202() {
        class269.method1869(16);
        this.field3179 = class269.method1874() == 0 ? 1 : class269.method1869(4) + 1;
        if (class269.method1874() != 0) {
            class269.method1869(8);
        }
        class269.method1869(2);
        if (this.field3179 > 1) {
            this.field3181 = class269.method1869(4);
        }
        this.field3182 = new int[this.field3179];
        this.field3180 = new int[this.field3179];
        for (int var1 = 0; var1 < this.field3179; var1++) {
            class269.method1869(8);
            this.field3182[var1] = class269.method1869(8);
            this.field3180[var1] = class269.method1869(8);
        }
    }
}

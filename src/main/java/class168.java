import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class168 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[I")
    public int[] field2429;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public int[] field2431;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 7)
    public class168() {
        class198.method1434(16);
        this.field2430 = class198.method1430() == 0 ? 1 : class198.method1434(4) + 1;
        if (class198.method1430() != 0) {
            class198.method1434(8);
        }
        class198.method1434(2);
        if (this.field2430 > 1) {
            this.field2432 = class198.method1434(4);
        }
        this.field2429 = new int[this.field2430];
        this.field2431 = new int[this.field2430];
        for (int var1 = 0; var1 < this.field2430; var1++) {
            class198.method1434(8);
            this.field2429[var1] = class198.method1434(8);
            this.field2431[var1] = class198.method1434(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class148 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    public int[] field2372;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    public int[] field2371;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 7)
    public class148() {
        class188.method1185(16);
        this.field2374 = class188.method1188() == 0 ? 1 : class188.method1185(4) + 1;
        if (class188.method1188() != 0) {
            class188.method1185(8);
        }
        class188.method1185(2);
        if (this.field2374 > 1) {
            this.field2373 = class188.method1185(4);
        }
        this.field2372 = new int[this.field2374];
        this.field2371 = new int[this.field2374];
        for (int var1 = 0; var1 < this.field2374; var1++) {
            class188.method1185(8);
            this.field2372[var1] = class188.method1185(8);
            this.field2371[var1] = class188.method1185(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class158 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field2689;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public int[] field2688;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    public int[] field2690;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class158() {
        class244.method1629(16);
        this.field2687 = class244.method1632() == 0 ? 1 : class244.method1629(4) + 1;
        if (class244.method1632() != 0) {
            class244.method1629(8);
        }
        class244.method1629(2);
        if (this.field2687 > 1) {
            this.field2689 = class244.method1629(4);
        }
        this.field2688 = new int[this.field2687];
        this.field2690 = new int[this.field2687];
        for (int var1 = 0; var1 < this.field2687; var1++) {
            class244.method1629(8);
            this.field2688[var1] = class244.method1629(8);
            this.field2690[var1] = class244.method1629(8);
        }
    }
}

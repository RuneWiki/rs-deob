import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class214 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
    public int[] field3394;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public int[] field3393;

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 7)
    public class214() {
        class280.method1972(16);
        this.field3392 = class280.method1967() == 0 ? 1 : class280.method1972(4) + 1;
        if (class280.method1967() != 0) {
            class280.method1972(8);
        }
        class280.method1972(2);
        if (this.field3392 > 1) {
            this.field3395 = class280.method1972(4);
        }
        this.field3394 = new int[this.field3392];
        this.field3393 = new int[this.field3392];
        for (int var1 = 0; var1 < this.field3392; var1++) {
            class280.method1972(8);
            this.field3394[var1] = class280.method1972(8);
            this.field3393[var1] = class280.method1972(8);
        }
    }
}

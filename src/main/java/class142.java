import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class142 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    public int[] field2672;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[I")
    public int[] field2671;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class142() {
        class197.method1247(16);
        this.field2670 = class197.method1256() == 0 ? 1 : class197.method1247(4) + 1;
        if (class197.method1256() != 0) {
            class197.method1247(8);
        }
        class197.method1247(2);
        if (this.field2670 > 1) {
            this.field2673 = class197.method1247(4);
        }
        this.field2672 = new int[this.field2670];
        this.field2671 = new int[this.field2670];
        for (int var1 = 0; var1 < this.field2670; var1++) {
            class197.method1247(8);
            this.field2672[var1] = class197.method1247(8);
            this.field2671[var1] = class197.method1247(8);
        }
    }
}

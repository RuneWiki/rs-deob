import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class188 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    public int[] field3406;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public int[] field3408;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 7)
    public class188() {
        class258.method1853(16);
        this.field3409 = class258.method1846() == 0 ? 1 : class258.method1853(4) + 1;
        if (class258.method1846() != 0) {
            class258.method1853(8);
        }
        class258.method1853(2);
        if (this.field3409 > 1) {
            this.field3407 = class258.method1853(4);
        }
        this.field3406 = new int[this.field3409];
        this.field3408 = new int[this.field3409];
        for (int var1 = 0; var1 < this.field3409; var1++) {
            class258.method1853(8);
            this.field3406[var1] = class258.method1853(8);
            this.field3408[var1] = class258.method1853(8);
        }
    }
}

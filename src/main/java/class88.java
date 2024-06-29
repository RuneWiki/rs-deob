import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    public int[] field2284;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    public int[] field2283;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class88() {
        class146.method1178(16);
        this.field2282 = class146.method1179() == 0 ? 1 : class146.method1178(4) + 1;
        if (class146.method1179() != 0) {
            class146.method1178(8);
        }
        class146.method1178(2);
        if (this.field2282 > 1) {
            this.field2281 = class146.method1178(4);
        }
        this.field2284 = new int[this.field2282];
        this.field2283 = new int[this.field2282];
        for (int var1 = 0; var1 < this.field2282; var1++) {
            class146.method1178(8);
            this.field2284[var1] = class146.method1178(8);
            this.field2283[var1] = class146.method1178(8);
        }
    }
}

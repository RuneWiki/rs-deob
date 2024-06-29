import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class181 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
    public int[] field2559;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "[I")
    public int[] field2556;

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 7)
    public class181() {
        class194.method1349(16);
        this.field2557 = class194.method1342() == 0 ? 1 : class194.method1349(4) + 1;
        if (class194.method1342() != 0) {
            class194.method1349(8);
        }
        class194.method1349(2);
        if (this.field2557 > 1) {
            this.field2558 = class194.method1349(4);
        }
        this.field2559 = new int[this.field2557];
        this.field2556 = new int[this.field2557];
        for (int var1 = 0; var1 < this.field2557; var1++) {
            class194.method1349(8);
            this.field2559[var1] = class194.method1349(8);
            this.field2556[var1] = class194.method1349(8);
        }
    }
}

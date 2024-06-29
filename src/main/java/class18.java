import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    public int[] field237;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public int[] field238;

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class18() {
        class154.method1169(16);
        this.field240 = class154.method1168() == 0 ? 1 : class154.method1169(4) + 1;
        if (class154.method1168() != 0) {
            class154.method1169(8);
        }
        class154.method1169(2);
        if (this.field240 > 1) {
            this.field239 = class154.method1169(4);
        }
        this.field237 = new int[this.field240];
        this.field238 = new int[this.field240];
        for (int var1 = 0; var1 < this.field240; var1++) {
            class154.method1169(8);
            this.field237[var1] = class154.method1169(8);
            this.field238[var1] = class154.method1169(8);
        }
    }
}

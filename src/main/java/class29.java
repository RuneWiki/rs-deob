import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class29 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[I")
    public int[] field427;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
    public int[] field428;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 7)
    public class29() {
        class267.method1889(16);
        this.field426 = class267.method1898() == 0 ? 1 : class267.method1889(4) + 1;
        if (class267.method1898() != 0) {
            class267.method1889(8);
        }
        class267.method1889(2);
        if (this.field426 > 1) {
            this.field425 = class267.method1889(4);
        }
        this.field427 = new int[this.field426];
        this.field428 = new int[this.field426];
        for (int var1 = 0; var1 < this.field426; var1++) {
            class267.method1889(8);
            this.field427[var1] = class267.method1889(8);
            this.field428[var1] = class267.method1889(8);
        }
    }
}

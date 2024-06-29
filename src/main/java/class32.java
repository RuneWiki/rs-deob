import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class32 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    public int[] field715;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
    public int[] field714;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class32() {
        class128.method819(16);
        this.field713 = class128.method818() == 0 ? 1 : class128.method819(4) + 1;
        if (class128.method818() != 0) {
            class128.method819(8);
        }
        class128.method819(2);
        if (this.field713 > 1) {
            this.field716 = class128.method819(4);
        }
        this.field715 = new int[this.field713];
        this.field714 = new int[this.field713];
        for (int var1 = 0; var1 < this.field713; var1++) {
            class128.method819(8);
            this.field715[var1] = class128.method819(8);
            this.field714[var1] = class128.method819(8);
        }
    }
}

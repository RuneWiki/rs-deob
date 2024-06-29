import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class6 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    public int[] field57;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    public int[] field56;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class6() {
        class74.method524(16);
        this.field55 = class74.method530() == 0 ? 1 : class74.method524(4) + 1;
        if (class74.method530() != 0) {
            class74.method524(8);
        }
        class74.method524(2);
        if (this.field55 > 1) {
            this.field54 = class74.method524(4);
        }
        this.field57 = new int[this.field55];
        this.field56 = new int[this.field55];
        for (int var1 = 0; var1 < this.field55; var1++) {
            class74.method524(8);
            this.field57[var1] = class74.method524(8);
            this.field56[var1] = class74.method524(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class220 {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public int[] field2797;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    public int[] field2796;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class220() {
        class396.method2363(16);
        this.field2799 = class396.method2359() == 0 ? 1 : class396.method2363(4) + 1;
        if (class396.method2359() != 0) {
            class396.method2363(8);
        }
        class396.method2363(2);
        if (this.field2799 > 1) {
            this.field2798 = class396.method2363(4);
        }
        this.field2797 = new int[this.field2799];
        this.field2796 = new int[this.field2799];
        for (int var1 = 0; var1 < this.field2799; var1++) {
            class396.method2363(8);
            this.field2797[var1] = class396.method2363(8);
            this.field2796[var1] = class396.method2363(8);
        }
    }
}

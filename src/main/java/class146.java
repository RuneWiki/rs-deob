import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class146 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public int[] field3095;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
    public int[] field3093;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class146() {
        class2.method12(16);
        this.field3096 = class2.method9() == 0 ? 1 : class2.method12(4) + 1;
        if (class2.method9() != 0) {
            class2.method12(8);
        }
        class2.method12(2);
        if (this.field3096 > 1) {
            this.field3094 = class2.method12(4);
        }
        this.field3095 = new int[this.field3096];
        this.field3093 = new int[this.field3096];
        for (int var1 = 0; var1 < this.field3096; var1++) {
            class2.method12(8);
            this.field3095[var1] = class2.method12(8);
            this.field3093[var1] = class2.method12(8);
        }
    }
}

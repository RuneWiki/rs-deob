import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class199 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public int[] field3868;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
    public int[] field3869;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class199() {
        class61.method337(16);
        this.field3871 = class61.method347() == 0 ? 1 : class61.method337(4) + 1;
        if (class61.method347() != 0) {
            class61.method337(8);
        }
        class61.method337(2);
        if (this.field3871 > 1) {
            this.field3870 = class61.method337(4);
        }
        this.field3868 = new int[this.field3871];
        this.field3869 = new int[this.field3871];
        for (int var1 = 0; var1 < this.field3871; var1++) {
            class61.method337(8);
            this.field3868[var1] = class61.method337(8);
            this.field3869[var1] = class61.method337(8);
        }
    }
}

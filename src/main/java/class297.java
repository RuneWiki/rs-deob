import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class297 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public int[] field3795;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public int[] field3798;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class297() {
        class494.method2679(16);
        this.field3796 = class494.method2680() == 0 ? 1 : class494.method2679(4) + 1;
        if (class494.method2680() != 0) {
            class494.method2679(8);
        }
        class494.method2679(2);
        if (this.field3796 > 1) {
            this.field3797 = class494.method2679(4);
        }
        this.field3795 = new int[this.field3796];
        this.field3798 = new int[this.field3796];
        for (int var1 = 0; var1 < this.field3796; var1++) {
            class494.method2679(8);
            this.field3795[var1] = class494.method2679(8);
            this.field3798[var1] = class494.method2679(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class248 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    public int[] field3688;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
    public int[] field3687;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 7)
    public class248() {
        class341.method2366(16);
        this.field3685 = class341.method2363() == 0 ? 1 : class341.method2366(4) + 1;
        if (class341.method2363() != 0) {
            class341.method2366(8);
        }
        class341.method2366(2);
        if (this.field3685 > 1) {
            this.field3686 = class341.method2366(4);
        }
        this.field3688 = new int[this.field3685];
        this.field3687 = new int[this.field3685];
        for (int var1 = 0; var1 < this.field3685; var1++) {
            class341.method2366(8);
            this.field3688[var1] = class341.method2366(8);
            this.field3687[var1] = class341.method2366(8);
        }
    }
}

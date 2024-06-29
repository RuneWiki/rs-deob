import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class610 {

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public int field8763;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public int field8764;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "[I")
    public int[] field8761;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "[I")
    public int[] field8762;

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V")
    public class610() {
        class459.method2662(16);
        this.field8763 = class459.method2672() == 0 ? 1 : class459.method2662(4) + 1;
        if (class459.method2672() != 0) {
            class459.method2662(8);
        }
        class459.method2662(2);
        if (this.field8763 > 1) {
            this.field8764 = class459.method2662(4);
        }
        this.field8761 = new int[this.field8763];
        this.field8762 = new int[this.field8763];
        for (int var1 = 0; var1 < this.field8763; var1++) {
            class459.method2662(8);
            this.field8761[var1] = class459.method2662(8);
            this.field8762[var1] = class459.method2662(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class44 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    public int[] field630;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public int[] field629;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class44() {
        class49.method330(16);
        this.field628 = class49.method338() == 0 ? 1 : class49.method330(4) + 1;
        if (class49.method338() != 0) {
            class49.method330(8);
        }
        class49.method330(2);
        if (this.field628 > 1) {
            this.field631 = class49.method330(4);
        }
        this.field630 = new int[this.field628];
        this.field629 = new int[this.field628];
        for (int var1 = 0; var1 < this.field628; var1++) {
            class49.method330(8);
            this.field630[var1] = class49.method330(8);
            this.field629[var1] = class49.method330(8);
        }
    }
}

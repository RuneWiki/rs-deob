import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public int[] field628;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public int[] field629;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class44() {
        class214.method1429(16);
        this.field627 = class214.method1434() == 0 ? 1 : class214.method1429(4) + 1;
        if (class214.method1434() != 0) {
            class214.method1429(8);
        }
        class214.method1429(2);
        if (this.field627 > 1) {
            this.field630 = class214.method1429(4);
        }
        this.field628 = new int[this.field627];
        this.field629 = new int[this.field627];
        for (int var1 = 0; var1 < this.field627; var1++) {
            class214.method1429(8);
            this.field628[var1] = class214.method1429(8);
            this.field629[var1] = class214.method1429(8);
        }
    }
}

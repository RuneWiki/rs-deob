import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class42 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
    public int[] field937;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public int[] field936;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class42() {
        class267.method1780(16);
        this.field939 = class267.method1775() == 0 ? 1 : class267.method1780(4) + 1;
        if (class267.method1775() != 0) {
            class267.method1780(8);
        }
        class267.method1780(2);
        if (this.field939 > 1) {
            this.field938 = class267.method1780(4);
        }
        this.field937 = new int[this.field939];
        this.field936 = new int[this.field939];
        for (int var1 = 0; var1 < this.field939; var1++) {
            class267.method1780(8);
            this.field937[var1] = class267.method1780(8);
            this.field936[var1] = class267.method1780(8);
        }
    }
}

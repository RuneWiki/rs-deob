import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class335 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public int[] field5052;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    public int[] field5054;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 7)
    public class335() {
        class244.method1679(16);
        this.field5053 = class244.method1677() == 0 ? 1 : class244.method1679(4) + 1;
        if (class244.method1677() != 0) {
            class244.method1679(8);
        }
        class244.method1679(2);
        if (this.field5053 > 1) {
            this.field5055 = class244.method1679(4);
        }
        this.field5052 = new int[this.field5053];
        this.field5054 = new int[this.field5053];
        for (int var1 = 0; var1 < this.field5053; var1++) {
            class244.method1679(8);
            this.field5052[var1] = class244.method1679(8);
            this.field5054[var1] = class244.method1679(8);
        }
    }
}

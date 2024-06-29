import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class182 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public int[] field2595;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
    public int[] field2596;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class182() {
        class401.method2399(16);
        this.field2597 = class401.method2396() == 0 ? 1 : class401.method2399(4) + 1;
        if (class401.method2396() != 0) {
            class401.method2399(8);
        }
        class401.method2399(2);
        if (this.field2597 > 1) {
            this.field2598 = class401.method2399(4);
        }
        this.field2595 = new int[this.field2597];
        this.field2596 = new int[this.field2597];
        for (int var1 = 0; var1 < this.field2597; var1++) {
            class401.method2399(8);
            this.field2595[var1] = class401.method2399(8);
            this.field2596[var1] = class401.method2399(8);
        }
    }
}

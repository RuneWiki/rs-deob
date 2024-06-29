import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class143 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public int[] field2596;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public int[] field2597;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class143() {
        class127.method768(16);
        this.field2595 = class127.method770() == 0 ? 1 : class127.method768(4) + 1;
        if (class127.method770() != 0) {
            class127.method768(8);
        }
        class127.method768(2);
        if (this.field2595 > 1) {
            this.field2594 = class127.method768(4);
        }
        this.field2596 = new int[this.field2595];
        this.field2597 = new int[this.field2595];
        for (int var1 = 0; var1 < this.field2595; var1++) {
            class127.method768(8);
            this.field2596[var1] = class127.method768(8);
            this.field2597[var1] = class127.method768(8);
        }
    }
}

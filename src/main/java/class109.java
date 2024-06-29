import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class109 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    public int[] field2236;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
    public int[] field2238;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class109() {
        class24.method150(16);
        this.field2237 = class24.method152() == 0 ? 1 : class24.method150(4) + 1;
        if (class24.method152() != 0) {
            class24.method150(8);
        }
        class24.method150(2);
        if (this.field2237 > 1) {
            this.field2239 = class24.method150(4);
        }
        this.field2236 = new int[this.field2237];
        this.field2238 = new int[this.field2237];
        for (int var1 = 0; var1 < this.field2237; var1++) {
            class24.method150(8);
            this.field2236[var1] = class24.method150(8);
            this.field2238[var1] = class24.method150(8);
        }
    }
}

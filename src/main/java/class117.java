import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
    public int[] field2775;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public int[] field2777;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class117() {
        class36.method323(16);
        this.field2776 = class36.method316() == 0 ? 1 : class36.method323(4) + 1;
        if (class36.method316() != 0) {
            class36.method323(8);
        }
        class36.method323(2);
        if (this.field2776 > 1) {
            this.field2774 = class36.method323(4);
        }
        this.field2775 = new int[this.field2776];
        this.field2777 = new int[this.field2776];
        for (int var1 = 0; var1 < this.field2776; var1++) {
            class36.method323(8);
            this.field2775[var1] = class36.method323(8);
            this.field2777[var1] = class36.method323(8);
        }
    }
}

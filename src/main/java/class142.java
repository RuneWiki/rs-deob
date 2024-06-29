import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class142 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    public int[] field2529;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    public int[] field2527;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class142() {
        class25.method182(16);
        this.field2530 = class25.method179() == 0 ? 1 : class25.method182(4) + 1;
        if (class25.method179() != 0) {
            class25.method182(8);
        }
        class25.method182(2);
        if (this.field2530 > 1) {
            this.field2528 = class25.method182(4);
        }
        this.field2529 = new int[this.field2530];
        this.field2527 = new int[this.field2530];
        for (int var1 = 0; var1 < this.field2530; var1++) {
            class25.method182(8);
            this.field2529[var1] = class25.method182(8);
            this.field2527[var1] = class25.method182(8);
        }
    }
}

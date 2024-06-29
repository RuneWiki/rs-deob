import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class180 {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "[I")
    public int[] field2461;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "[I")
    public int[] field2460;

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
    public class180() {
        class74.method438(16);
        this.field2462 = class74.method437() == 0 ? 1 : class74.method438(4) + 1;
        if (class74.method437() != 0) {
            class74.method438(8);
        }
        class74.method438(2);
        if (this.field2462 > 1) {
            this.field2459 = class74.method438(4);
        }
        this.field2461 = new int[this.field2462];
        this.field2460 = new int[this.field2462];
        for (int var1 = 0; var1 < this.field2462; var1++) {
            class74.method438(8);
            this.field2461[var1] = class74.method438(8);
            this.field2460[var1] = class74.method438(8);
        }
    }
}

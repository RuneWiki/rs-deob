import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class258 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    public int[] field4238;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    public int[] field4235;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class258() {
        class20.method156(16);
        this.field4236 = class20.method160() == 0 ? 1 : class20.method156(4) + 1;
        if (class20.method160() != 0) {
            class20.method156(8);
        }
        class20.method156(2);
        if (this.field4236 > 1) {
            this.field4237 = class20.method156(4);
        }
        this.field4238 = new int[this.field4236];
        this.field4235 = new int[this.field4236];
        for (int var1 = 0; var1 < this.field4236; var1++) {
            class20.method156(8);
            this.field4238[var1] = class20.method156(8);
            this.field4235[var1] = class20.method156(8);
        }
    }
}

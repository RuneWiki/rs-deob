import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class301 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
    public int[] field4135;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
    public int[] field4136;

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 7)
    public class301() {
        class363.method2193(16);
        this.field4134 = class363.method2185() == 0 ? 1 : class363.method2193(4) + 1;
        if (class363.method2185() != 0) {
            class363.method2193(8);
        }
        class363.method2193(2);
        if (this.field4134 > 1) {
            this.field4137 = class363.method2193(4);
        }
        this.field4135 = new int[this.field4134];
        this.field4136 = new int[this.field4134];
        for (int var1 = 0; var1 < this.field4134; var1++) {
            class363.method2193(8);
            this.field4135[var1] = class363.method2193(8);
            this.field4136[var1] = class363.method2193(8);
        }
    }
}

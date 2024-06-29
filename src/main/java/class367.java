import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class367 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public int[] field5245;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    public int[] field5242;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 7)
    public class367() {
        class11.method64(16);
        this.field5244 = class11.method58() == 0 ? 1 : class11.method64(4) + 1;
        if (class11.method58() != 0) {
            class11.method64(8);
        }
        class11.method64(2);
        if (this.field5244 > 1) {
            this.field5243 = class11.method64(4);
        }
        this.field5245 = new int[this.field5244];
        this.field5242 = new int[this.field5244];
        for (int var1 = 0; var1 < this.field5244; var1++) {
            class11.method64(8);
            this.field5245[var1] = class11.method64(8);
            this.field5242[var1] = class11.method64(8);
        }
    }
}

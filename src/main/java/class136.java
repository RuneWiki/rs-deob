import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class136 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public int[] field2329;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    public int[] field2331;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 7)
    public class136() {
        class288.method2025(16);
        this.field2328 = class288.method2033() == 0 ? 1 : class288.method2025(4) + 1;
        if (class288.method2033() != 0) {
            class288.method2025(8);
        }
        class288.method2025(2);
        if (this.field2328 > 1) {
            this.field2330 = class288.method2025(4);
        }
        this.field2329 = new int[this.field2328];
        this.field2331 = new int[this.field2328];
        for (int var1 = 0; var1 < this.field2328; var1++) {
            class288.method2025(8);
            this.field2329[var1] = class288.method2025(8);
            this.field2331[var1] = class288.method2025(8);
        }
    }
}

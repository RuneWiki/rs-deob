import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class196 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public int[] field2280;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[I")
    public int[] field2279;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class196() {
        class571.method3319(16);
        this.field2282 = class571.method3318() == 0 ? 1 : class571.method3319(4) + 1;
        if (class571.method3318() != 0) {
            class571.method3319(8);
        }
        class571.method3319(2);
        if (this.field2282 > 1) {
            this.field2281 = class571.method3319(4);
        }
        this.field2280 = new int[this.field2282];
        this.field2279 = new int[this.field2282];
        for (int var1 = 0; var1 < this.field2282; var1++) {
            class571.method3319(8);
            this.field2280[var1] = class571.method3319(8);
            this.field2279[var1] = class571.method3319(8);
        }
    }
}

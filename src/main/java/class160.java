import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class160 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
    public int[] field3247;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class160() {
        class24.method141(16);
        this.field3249 = class24.method149() == 0 ? 1 : class24.method141(4) + 1;
        if (class24.method149() != 0) {
            class24.method141(8);
        }
        class24.method141(2);
        if (this.field3249 > 1) {
            this.field3248 = class24.method141(4);
        }
        this.field3247 = new int[this.field3249];
        this.field3246 = new int[this.field3249];
        for (int var1 = 0; var1 < this.field3249; var1++) {
            class24.method141(8);
            this.field3247[var1] = class24.method141(8);
            this.field3246[var1] = class24.method141(8);
        }
    }
}

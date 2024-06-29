import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public int[] field358;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[I")
    public int[] field355;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class23() {
        class138.method944(16);
        this.field356 = class138.method938() == 0 ? 1 : class138.method944(4) + 1;
        if (class138.method938() != 0) {
            class138.method944(8);
        }
        class138.method944(2);
        if (this.field356 > 1) {
            this.field357 = class138.method944(4);
        }
        this.field358 = new int[this.field356];
        this.field355 = new int[this.field356];
        for (int var1 = 0; var1 < this.field356; var1++) {
            class138.method944(8);
            this.field358[var1] = class138.method944(8);
            this.field355[var1] = class138.method944(8);
        }
    }
}

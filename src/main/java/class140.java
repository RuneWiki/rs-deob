import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class140 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[I")
    public int[] field2473;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    public int[] field2474;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class140() {
        class213.method1424(16);
        this.field2476 = class213.method1431() == 0 ? 1 : class213.method1424(4) + 1;
        if (class213.method1431() != 0) {
            class213.method1424(8);
        }
        class213.method1424(2);
        if (this.field2476 > 1) {
            this.field2475 = class213.method1424(4);
        }
        this.field2473 = new int[this.field2476];
        this.field2474 = new int[this.field2476];
        for (int var1 = 0; var1 < this.field2476; var1++) {
            class213.method1424(8);
            this.field2473[var1] = class213.method1424(8);
            this.field2474[var1] = class213.method1424(8);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class125 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    public int[] field2556;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public int[] field2553;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class125() {
        class126.method776(16);
        this.field2555 = class126.method767() == 0 ? 1 : class126.method776(4) + 1;
        if (class126.method767() != 0) {
            class126.method776(8);
        }
        class126.method776(2);
        if (this.field2555 > 1) {
            this.field2554 = class126.method776(4);
        }
        this.field2556 = new int[this.field2555];
        this.field2553 = new int[this.field2555];
        for (int var1 = 0; var1 < this.field2555; var1++) {
            class126.method776(8);
            this.field2556[var1] = class126.method776(8);
            this.field2553[var1] = class126.method776(8);
        }
    }
}

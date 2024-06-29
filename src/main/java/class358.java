import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class358 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "[I")
    public int[] field5498;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
    public int[] field5497;

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
    public class358() {
        class383.method2344(16);
        this.field5495 = class383.method2343() == 0 ? 1 : class383.method2344(4) + 1;
        if (class383.method2343() != 0) {
            class383.method2344(8);
        }
        class383.method2344(2);
        if (this.field5495 > 1) {
            this.field5496 = class383.method2344(4);
        }
        this.field5498 = new int[this.field5495];
        this.field5497 = new int[this.field5495];
        for (int var1 = 0; var1 < this.field5495; var1++) {
            class383.method2344(8);
            this.field5498[var1] = class383.method2344(8);
            this.field5497[var1] = class383.method2344(8);
        }
    }
}

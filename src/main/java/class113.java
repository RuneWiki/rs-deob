import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class113 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
    public int[] field2053;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public int[] field2054;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 7)
    public class113() {
        class307.method2242(16);
        this.field2051 = class307.method2238() == 0 ? 1 : class307.method2242(4) + 1;
        if (class307.method2238() != 0) {
            class307.method2242(8);
        }
        class307.method2242(2);
        if (this.field2051 > 1) {
            this.field2052 = class307.method2242(4);
        }
        this.field2053 = new int[this.field2051];
        this.field2054 = new int[this.field2051];
        for (int var1 = 0; var1 < this.field2051; var1++) {
            class307.method2242(8);
            this.field2053[var1] = class307.method2242(8);
            this.field2054[var1] = class307.method2242(8);
        }
    }
}

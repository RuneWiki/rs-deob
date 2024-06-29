import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class126 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
    public int[] field2079;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public int[] field2078;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 7)
    public class126() {
        class181.method1349(16);
        this.field2077 = class181.method1340() == 0 ? 1 : class181.method1349(4) + 1;
        if (class181.method1340() != 0) {
            class181.method1349(8);
        }
        class181.method1349(2);
        if (this.field2077 > 1) {
            this.field2080 = class181.method1349(4);
        }
        this.field2079 = new int[this.field2077];
        this.field2078 = new int[this.field2077];
        for (int var1 = 0; var1 < this.field2077; var1++) {
            class181.method1349(8);
            this.field2079[var1] = class181.method1349(8);
            this.field2078[var1] = class181.method1349(8);
        }
    }
}

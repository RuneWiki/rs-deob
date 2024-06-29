import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class156 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    public int[] field2416;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
    public int[] field2418;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class156() {
        class172.method1169(16);
        this.field2415 = class172.method1164() == 0 ? 1 : class172.method1169(4) + 1;
        if (class172.method1164() != 0) {
            class172.method1169(8);
        }
        class172.method1169(2);
        if (this.field2415 > 1) {
            this.field2417 = class172.method1169(4);
        }
        this.field2416 = new int[this.field2415];
        this.field2418 = new int[this.field2415];
        for (int var1 = 0; var1 < this.field2415; var1++) {
            class172.method1169(8);
            this.field2416[var1] = class172.method1169(8);
            this.field2418[var1] = class172.method1169(8);
        }
    }
}

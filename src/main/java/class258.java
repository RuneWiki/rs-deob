import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class258 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[I")
    public int[] field4581;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[I")
    public int[] field4579;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class258() {
        class53.method349(16);
        this.field4580 = class53.method354() == 0 ? 1 : class53.method349(4) + 1;
        if (class53.method354() != 0) {
            class53.method349(8);
        }
        class53.method349(2);
        if (this.field4580 > 1) {
            this.field4582 = class53.method349(4);
        }
        this.field4581 = new int[this.field4580];
        this.field4579 = new int[this.field4580];
        for (int var1 = 0; var1 < this.field4580; var1++) {
            class53.method349(8);
            this.field4581[var1] = class53.method349(8);
            this.field4579[var1] = class53.method349(8);
        }
    }
}

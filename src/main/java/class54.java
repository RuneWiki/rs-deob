import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    public int[] field958;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    public int[] field961;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 7)
    public class54() {
        class53.method424(16);
        this.field960 = class53.method421() == 0 ? 1 : class53.method424(4) + 1;
        if (class53.method421() != 0) {
            class53.method424(8);
        }
        class53.method424(2);
        if (this.field960 > 1) {
            this.field959 = class53.method424(4);
        }
        this.field958 = new int[this.field960];
        this.field961 = new int[this.field960];
        for (int var1 = 0; var1 < this.field960; var1++) {
            class53.method424(8);
            this.field958[var1] = class53.method424(8);
            this.field961[var1] = class53.method424(8);
        }
    }
}
